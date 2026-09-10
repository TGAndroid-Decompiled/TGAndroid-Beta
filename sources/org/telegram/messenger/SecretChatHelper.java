package org.telegram.messenger;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.util.SparseArray;
import android.util.SparseIntArray;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
public class SecretChatHelper extends BaseController {
    public static int CURRENT_SECRET_CHAT_LAYER = 151;
    private static volatile SecretChatHelper[] Instance = new SecretChatHelper[4];
    private SparseArray<TLRPC.EncryptedChat> acceptingChats;
    public ArrayList<TLRPC.Update> delayedEncryptedChatUpdates;
    private ArrayList<Long> pendingEncMessagesToDelete;
    private SparseArray<ArrayList<TLRPC.Update>> pendingSecretMessages;
    private SparseArray<SparseIntArray> requestedHoles;
    private SparseArray<ArrayList<TL_decryptedMessageHolder>> secretHolesQueue;
    private ArrayList<Integer> sendingNotifyLayer;
    private boolean startingSecretChat;

    public static class TL_decryptedMessageHolder extends TLObject {
        public static int constructor = 1431655929;
        public int date;
        public int decryptedWithVersion;
        public TLRPC.EncryptedFile file;
        public TLRPC.TL_decryptedMessageLayer layer;
        public boolean new_key_used;

        @Override
        public void readParams(InputSerializedData inputSerializedData, boolean z10) {
            inputSerializedData.readInt64(z10);
            this.date = inputSerializedData.readInt32(z10);
            this.layer = TLRPC.TL_decryptedMessageLayer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            if (inputSerializedData.readBool(z10)) {
                this.file = TLRPC.EncryptedFile.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z10), z10);
            }
            this.new_key_used = inputSerializedData.readBool(z10);
        }

        @Override
        public void serializeToStream(OutputSerializedData outputSerializedData) {
            boolean z10;
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeInt64(0L);
            outputSerializedData.writeInt32(this.date);
            this.layer.serializeToStream(outputSerializedData);
            if (this.file != null) {
                z10 = true;
            } else {
                z10 = false;
            }
            outputSerializedData.writeBool(z10);
            TLRPC.EncryptedFile encryptedFile = this.file;
            if (encryptedFile != null) {
                encryptedFile.serializeToStream(outputSerializedData);
            }
            outputSerializedData.writeBool(this.new_key_used);
        }
    }

    public SecretChatHelper(int i10) {
        super(i10);
        this.sendingNotifyLayer = new ArrayList<>();
        this.secretHolesQueue = new SparseArray<>();
        this.pendingSecretMessages = new SparseArray<>();
        this.requestedHoles = new SparseArray<>();
        this.acceptingChats = new SparseArray<>();
        this.delayedEncryptedChatUpdates = new ArrayList<>();
        this.pendingEncMessagesToDelete = new ArrayList<>();
        this.startingSecretChat = false;
    }

    private void applyPeerLayer(TLRPC.EncryptedChat encryptedChat, int i10) {
        int peerLayerVersion = AndroidUtilities.getPeerLayerVersion(encryptedChat.layer);
        if (i10 <= peerLayerVersion) {
            return;
        }
        if (encryptedChat.key_hash.length == 16) {
            try {
                byte[] bArr = encryptedChat.auth_key;
                byte[] computeSHA256 = Utilities.computeSHA256(bArr, 0, bArr.length);
                byte[] bArr2 = new byte[36];
                System.arraycopy(encryptedChat.key_hash, 0, bArr2, 0, 16);
                System.arraycopy(computeSHA256, 0, bArr2, 16, 20);
                encryptedChat.key_hash = bArr2;
                getMessagesStorage().updateEncryptedChat(encryptedChat);
            } catch (Throwable th2) {
                FileLog.e(th2);
            }
        }
        encryptedChat.layer = AndroidUtilities.setPeerLayerVersion(encryptedChat.layer, i10);
        getMessagesStorage().updateEncryptedChatLayer(encryptedChat);
        if (peerLayerVersion < CURRENT_SECRET_CHAT_LAYER) {
            sendNotifyLayerMessage(encryptedChat, null);
        }
        AndroidUtilities.runOnUIThread(new ni(this, encryptedChat, 2));
    }

    private TLRPC.Message createDeleteMessage(int i10, int i11, int i12, long j3, TLRPC.EncryptedChat encryptedChat) {
        TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
        TLRPC.TL_messageEncryptedAction tL_messageEncryptedAction = new TLRPC.TL_messageEncryptedAction();
        tL_messageService.action = tL_messageEncryptedAction;
        tL_messageEncryptedAction.encryptedAction = new TLRPC.TL_decryptedMessageActionDeleteMessages();
        tL_messageService.action.encryptedAction.random_ids.add(Long.valueOf(j3));
        tL_messageService.f17216id = i10;
        tL_messageService.local_id = i10;
        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
        tL_messageService.from_id = tL_peerUser;
        tL_peerUser.user_id = getUserConfig().getClientUserId();
        tL_messageService.unread = true;
        tL_messageService.out = true;
        tL_messageService.flags = 256;
        tL_messageService.dialog_id = DialogObject.makeEncryptedDialogId(encryptedChat.f17203id);
        tL_messageService.send_state = 1;
        tL_messageService.seq_in = i12;
        tL_messageService.seq_out = i11;
        tL_messageService.peer_id = new TLRPC.TL_peerUser();
        if (encryptedChat.participant_id == getUserConfig().getClientUserId()) {
            tL_messageService.peer_id.user_id = encryptedChat.admin_id;
        } else {
            tL_messageService.peer_id.user_id = encryptedChat.participant_id;
        }
        tL_messageService.date = 0;
        tL_messageService.random_id = j3;
        return tL_messageService;
    }

    private TLRPC.TL_messageService createServiceSecretMessage(TLRPC.EncryptedChat encryptedChat, TLRPC.DecryptedMessageAction decryptedMessageAction) {
        TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
        TLRPC.TL_messageEncryptedAction tL_messageEncryptedAction = new TLRPC.TL_messageEncryptedAction();
        tL_messageService.action = tL_messageEncryptedAction;
        tL_messageEncryptedAction.encryptedAction = decryptedMessageAction;
        int newMessageId = getUserConfig().getNewMessageId();
        tL_messageService.f17216id = newMessageId;
        tL_messageService.local_id = newMessageId;
        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
        tL_messageService.from_id = tL_peerUser;
        tL_peerUser.user_id = getUserConfig().getClientUserId();
        tL_messageService.unread = true;
        tL_messageService.out = true;
        tL_messageService.flags = 256;
        tL_messageService.dialog_id = DialogObject.makeEncryptedDialogId(encryptedChat.f17203id);
        tL_messageService.peer_id = new TLRPC.TL_peerUser();
        tL_messageService.send_state = 1;
        if (encryptedChat.participant_id == getUserConfig().getClientUserId()) {
            tL_messageService.peer_id.user_id = encryptedChat.admin_id;
        } else {
            tL_messageService.peer_id.user_id = encryptedChat.participant_id;
        }
        if (!(decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionScreenshotMessages) && !(decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionSetMessageTTL)) {
            tL_messageService.date = 0;
        } else {
            tL_messageService.date = getConnectionsManager().getCurrentTime();
        }
        tL_messageService.random_id = getSendMessagesHelper().getNextRandomId();
        getUserConfig().saveConfig(false);
        ArrayList<TLRPC.Message> arrayList = new ArrayList<>();
        arrayList.add(tL_messageService);
        getMessagesStorage().putMessages(arrayList, false, true, true, 0, false, 0, 0L);
        return tL_messageService;
    }

    private boolean decryptWithMtProtoVersion(org.telegram.tgnet.NativeByteBuffer r21, byte[] r22, byte[] r23, int r24, boolean r25, boolean r26) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.SecretChatHelper.decryptWithMtProtoVersion(org.telegram.tgnet.NativeByteBuffer, byte[], byte[], int, boolean, boolean):boolean");
    }

    public static SecretChatHelper getInstance(int i10) {
        SecretChatHelper secretChatHelper;
        SecretChatHelper secretChatHelper2 = Instance[i10];
        if (secretChatHelper2 == null) {
            synchronized (SecretChatHelper.class) {
                try {
                    secretChatHelper = Instance[i10];
                    if (secretChatHelper == null) {
                        SecretChatHelper[] secretChatHelperArr = Instance;
                        SecretChatHelper secretChatHelper3 = new SecretChatHelper(i10);
                        secretChatHelperArr[i10] = secretChatHelper3;
                        secretChatHelper = secretChatHelper3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return secretChatHelper;
        }
        return secretChatHelper2;
    }

    public static boolean isSecretInvisibleMessage(TLRPC.Message message) {
        TLRPC.MessageAction messageAction = message.action;
        if (messageAction instanceof TLRPC.TL_messageEncryptedAction) {
            TLRPC.DecryptedMessageAction decryptedMessageAction = messageAction.encryptedAction;
            if (!(decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionScreenshotMessages) && !(decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionSetMessageTTL)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public static boolean isSecretVisibleMessage(TLRPC.Message message) {
        TLRPC.MessageAction messageAction = message.action;
        if (messageAction instanceof TLRPC.TL_messageEncryptedAction) {
            TLRPC.DecryptedMessageAction decryptedMessageAction = messageAction.encryptedAction;
            if ((decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionScreenshotMessages) || (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionSetMessageTTL)) {
                return true;
            }
            return false;
        }
        return false;
    }

    public void lambda$acceptSecretChat$21(TLRPC.EncryptedChat encryptedChat) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.encryptedChatUpdated, encryptedChat);
        sendNotifyLayerMessage(encryptedChat, null);
    }

    public void lambda$acceptSecretChat$22(TLRPC.EncryptedChat encryptedChat, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.acceptingChats.remove(encryptedChat.f17203id);
        if (tL_error == null) {
            TLRPC.EncryptedChat encryptedChat2 = (TLRPC.EncryptedChat) tLObject;
            encryptedChat2.auth_key = encryptedChat.auth_key;
            encryptedChat2.user_id = encryptedChat.user_id;
            encryptedChat2.seq_in = encryptedChat.seq_in;
            encryptedChat2.seq_out = encryptedChat.seq_out;
            encryptedChat2.key_create_date = encryptedChat.key_create_date;
            encryptedChat2.key_use_count_in = encryptedChat.key_use_count_in;
            encryptedChat2.key_use_count_out = encryptedChat.key_use_count_out;
            getMessagesStorage().updateEncryptedChat(encryptedChat2);
            getMessagesController().putEncryptedChat(encryptedChat2, false);
            AndroidUtilities.runOnUIThread(new ni(this, encryptedChat2, 1));
        }
    }

    public void lambda$acceptSecretChat$23(TLRPC.EncryptedChat encryptedChat, TLObject tLObject, TLRPC.TL_error tL_error) {
        byte[] bArr;
        if (tL_error == null) {
            TLRPC.messages_DhConfig messages_dhconfig = (TLRPC.messages_DhConfig) tLObject;
            if (tLObject instanceof TLRPC.TL_messages_dhConfig) {
                if (!Utilities.isGoodPrime(messages_dhconfig.f17350p, messages_dhconfig.f17349g)) {
                    this.acceptingChats.remove(encryptedChat.f17203id);
                    declineSecretChat(encryptedChat.f17203id, false);
                    return;
                }
                getMessagesStorage().setSecretPBytes(messages_dhconfig.f17350p);
                getMessagesStorage().setSecretG(messages_dhconfig.f17349g);
                getMessagesStorage().setLastSecretVersion(messages_dhconfig.version);
                getMessagesStorage().saveSecretParams(getMessagesStorage().getLastSecretVersion(), getMessagesStorage().getSecretG(), getMessagesStorage().getSecretPBytes());
            }
            byte[] bArr2 = new byte[256];
            for (int i10 = 0; i10 < 256; i10++) {
                bArr2[i10] = (byte) (((byte) (Utilities.random.nextDouble() * 256.0d)) ^ messages_dhconfig.random[i10]);
            }
            encryptedChat.a_or_b = bArr2;
            encryptedChat.seq_in = -1;
            encryptedChat.seq_out = 0;
            BigInteger bigInteger = new BigInteger(1, getMessagesStorage().getSecretPBytes());
            BigInteger modPow = BigInteger.valueOf(getMessagesStorage().getSecretG()).modPow(new BigInteger(1, bArr2), bigInteger);
            BigInteger bigInteger2 = new BigInteger(1, encryptedChat.g_a);
            if (!Utilities.isGoodGaAndGb(bigInteger2, bigInteger)) {
                this.acceptingChats.remove(encryptedChat.f17203id);
                declineSecretChat(encryptedChat.f17203id, false);
                return;
            }
            byte[] byteArray = modPow.toByteArray();
            if (byteArray.length > 256) {
                byte[] bArr3 = new byte[256];
                System.arraycopy(byteArray, 1, bArr3, 0, 256);
                byteArray = bArr3;
            }
            byte[] byteArray2 = bigInteger2.modPow(new BigInteger(1, bArr2), bigInteger).toByteArray();
            if (byteArray2.length > 256) {
                bArr = new byte[256];
                System.arraycopy(byteArray2, byteArray2.length - 256, bArr, 0, 256);
            } else {
                if (byteArray2.length < 256) {
                    bArr = new byte[256];
                    System.arraycopy(byteArray2, 0, bArr, 256 - byteArray2.length, byteArray2.length);
                    for (int i11 = 0; i11 < 256 - byteArray2.length; i11++) {
                        bArr[i11] = 0;
                    }
                }
                byte[] computeSHA1 = Utilities.computeSHA1(byteArray2);
                byte[] bArr4 = new byte[8];
                System.arraycopy(computeSHA1, computeSHA1.length - 8, bArr4, 0, 8);
                encryptedChat.auth_key = byteArray2;
                encryptedChat.key_create_date = getConnectionsManager().getCurrentTime();
                TLRPC.TL_messages_acceptEncryption tL_messages_acceptEncryption = new TLRPC.TL_messages_acceptEncryption();
                tL_messages_acceptEncryption.g_b = byteArray;
                TLRPC.TL_inputEncryptedChat tL_inputEncryptedChat = new TLRPC.TL_inputEncryptedChat();
                tL_messages_acceptEncryption.peer = tL_inputEncryptedChat;
                tL_inputEncryptedChat.chat_id = encryptedChat.f17203id;
                tL_inputEncryptedChat.access_hash = encryptedChat.access_hash;
                tL_messages_acceptEncryption.key_fingerprint = Utilities.bytesToLong(bArr4);
                getConnectionsManager().sendRequest(tL_messages_acceptEncryption, new ki(this, encryptedChat, 0), 64);
                return;
            }
            byteArray2 = bArr;
            byte[] computeSHA12 = Utilities.computeSHA1(byteArray2);
            byte[] bArr42 = new byte[8];
            System.arraycopy(computeSHA12, computeSHA12.length - 8, bArr42, 0, 8);
            encryptedChat.auth_key = byteArray2;
            encryptedChat.key_create_date = getConnectionsManager().getCurrentTime();
            TLRPC.TL_messages_acceptEncryption tL_messages_acceptEncryption2 = new TLRPC.TL_messages_acceptEncryption();
            tL_messages_acceptEncryption2.g_b = byteArray;
            TLRPC.TL_inputEncryptedChat tL_inputEncryptedChat2 = new TLRPC.TL_inputEncryptedChat();
            tL_messages_acceptEncryption2.peer = tL_inputEncryptedChat2;
            tL_inputEncryptedChat2.chat_id = encryptedChat.f17203id;
            tL_inputEncryptedChat2.access_hash = encryptedChat.access_hash;
            tL_messages_acceptEncryption2.key_fingerprint = Utilities.bytesToLong(bArr42);
            getConnectionsManager().sendRequest(tL_messages_acceptEncryption2, new ki(this, encryptedChat, 0), 64);
            return;
        }
        this.acceptingChats.remove(encryptedChat.f17203id);
    }

    public void lambda$applyPeerLayer$9(TLRPC.EncryptedChat encryptedChat) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.encryptedChatUpdated, encryptedChat);
    }

    public static int lambda$checkSecretHoles$16(TL_decryptedMessageHolder tL_decryptedMessageHolder, TL_decryptedMessageHolder tL_decryptedMessageHolder2) {
        int i10 = tL_decryptedMessageHolder.layer.out_seq_no;
        int i11 = tL_decryptedMessageHolder2.layer.out_seq_no;
        if (i10 > i11) {
            return 1;
        }
        if (i10 < i11) {
            return -1;
        }
        return 0;
    }

    public void lambda$declineSecretChat$20(long j3, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (j3 != 0) {
            getMessagesStorage().removePendingTask(j3);
        }
    }

    public void lambda$decryptMessage$17(TLRPC.TL_encryptedChatDiscarded tL_encryptedChatDiscarded) {
        getMessagesController().putEncryptedChat(tL_encryptedChatDiscarded, false);
        getMessagesStorage().updateEncryptedChat(tL_encryptedChatDiscarded);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.encryptedChatUpdated, tL_encryptedChatDiscarded);
    }

    public void lambda$performSendEncryptedRequest$4(TLRPC.Message message, int i10) {
        message.send_state = 0;
        NotificationCenter notificationCenter = getNotificationCenter();
        int i11 = NotificationCenter.messageReceivedByServer;
        Integer valueOf = Integer.valueOf(message.f17216id);
        Integer valueOf2 = Integer.valueOf(message.f17216id);
        Long valueOf3 = Long.valueOf(message.dialog_id);
        Integer valueOf4 = Integer.valueOf(i10);
        Boolean bool = Boolean.FALSE;
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i11, valueOf, valueOf2, message, valueOf3, 0L, valueOf4, bool);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.messageReceivedByServer2, Integer.valueOf(message.f17216id), Integer.valueOf(message.f17216id), message, Long.valueOf(message.dialog_id), 0L, Integer.valueOf(i10), bool);
        getSendMessagesHelper().processSentMessage(message.f17216id);
        getSendMessagesHelper().removeFromSendingMessages(message.f17216id, false);
    }

    public void lambda$performSendEncryptedRequest$5(TLRPC.Message message, TLRPC.messages_SentEncryptedMessage messages_sentencryptedmessage, int i10) {
        if (isSecretInvisibleMessage(message)) {
            messages_sentencryptedmessage.date = 0;
        }
        getMessagesStorage().updateMessageStateAndId(message.random_id, 0L, Integer.valueOf(message.f17216id), message.f17216id, messages_sentencryptedmessage.date, false, 0, 0);
        AndroidUtilities.runOnUIThread(new v4(this, message, i10, 21));
    }

    public void lambda$performSendEncryptedRequest$6(TLRPC.Message message) {
        message.send_state = 2;
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.messageSendError, Integer.valueOf(message.f17216id));
        getSendMessagesHelper().processSentMessage(message.f17216id);
        getSendMessagesHelper().removeFromSendingMessages(message.f17216id, false);
    }

    public void lambda$performSendEncryptedRequest$7(TLRPC.DecryptedMessage decryptedMessage, TLRPC.EncryptedChat encryptedChat, TLRPC.Message message, MessageObject messageObject, String str, TLObject tLObject, TLRPC.TL_error tL_error) {
        int i10;
        TLRPC.EncryptedChat encryptedChat2;
        if (tL_error == null && (decryptedMessage.action instanceof TLRPC.TL_decryptedMessageActionNotifyLayer)) {
            TLRPC.EncryptedChat encryptedChat3 = getMessagesController().getEncryptedChat(Integer.valueOf(encryptedChat.f17203id));
            if (encryptedChat3 == null) {
                encryptedChat2 = encryptedChat;
            } else {
                encryptedChat2 = encryptedChat3;
            }
            if (encryptedChat2.key_hash == null) {
                encryptedChat2.key_hash = AndroidUtilities.calcAuthKeyHash(encryptedChat2.auth_key);
            }
            if (encryptedChat2.key_hash.length == 16) {
                try {
                    byte[] bArr = encryptedChat.auth_key;
                    byte[] computeSHA256 = Utilities.computeSHA256(bArr, 0, bArr.length);
                    byte[] bArr2 = new byte[36];
                    System.arraycopy(encryptedChat.key_hash, 0, bArr2, 0, 16);
                    System.arraycopy(computeSHA256, 0, bArr2, 16, 20);
                    encryptedChat2.key_hash = bArr2;
                    getMessagesStorage().updateEncryptedChat(encryptedChat2);
                } catch (Throwable th2) {
                    FileLog.e(th2);
                }
            }
            this.sendingNotifyLayer.remove(Integer.valueOf(encryptedChat2.f17203id));
            encryptedChat2.layer = AndroidUtilities.setMyLayerVersion(encryptedChat2.layer, CURRENT_SECRET_CHAT_LAYER);
            getMessagesStorage().updateEncryptedChatLayer(encryptedChat2);
        }
        if (tL_error == null) {
            String str2 = message.attachPath;
            TLRPC.messages_SentEncryptedMessage messages_sentencryptedmessage = (TLRPC.messages_SentEncryptedMessage) tLObject;
            if (isSecretVisibleMessage(message)) {
                message.date = messages_sentencryptedmessage.date;
            }
            if (messageObject != null) {
                TLRPC.EncryptedFile encryptedFile = messages_sentencryptedmessage.file;
                if (encryptedFile instanceof TLRPC.TL_encryptedFile) {
                    updateMediaPaths(messageObject, encryptedFile, decryptedMessage, str);
                    i10 = messageObject.getMediaExistanceFlags();
                    getMessagesStorage().getStorageQueue().postRunnable(new h0(this, message, messages_sentencryptedmessage, i10, 18));
                    return;
                }
            }
            i10 = 0;
            getMessagesStorage().getStorageQueue().postRunnable(new h0(this, message, messages_sentencryptedmessage, i10, 18));
            return;
        }
        getMessagesStorage().markMessageAsSendError(message, 0);
        AndroidUtilities.runOnUIThread(new eh(7, this, message));
    }

    public void lambda$performSendEncryptedRequest$8(TLRPC.EncryptedChat encryptedChat, TLRPC.DecryptedMessage decryptedMessage, TLRPC.Message message, TLRPC.InputEncryptedFile inputEncryptedFile, MessageObject messageObject, String str) {
        int i10;
        int i11;
        TLRPC.TL_messages_sendEncryptedFile tL_messages_sendEncryptedFile;
        TLRPC.TL_messages_sendEncryptedFile tL_messages_sendEncryptedFile2;
        try {
            TLRPC.TL_decryptedMessageLayer tL_decryptedMessageLayer = new TLRPC.TL_decryptedMessageLayer();
            tL_decryptedMessageLayer.layer = Math.min(Math.max(46, AndroidUtilities.getMyLayerVersion(encryptedChat.layer)), Math.max(46, AndroidUtilities.getPeerLayerVersion(encryptedChat.layer)));
            tL_decryptedMessageLayer.message = decryptedMessage;
            byte[] bArr = new byte[15];
            tL_decryptedMessageLayer.random_bytes = bArr;
            Utilities.random.nextBytes(bArr);
            boolean z10 = true;
            if (encryptedChat.seq_in == 0 && encryptedChat.seq_out == 0) {
                if (encryptedChat.admin_id == getUserConfig().getClientUserId()) {
                    encryptedChat.seq_out = 1;
                    encryptedChat.seq_in = -2;
                } else {
                    encryptedChat.seq_in = -1;
                }
            }
            int i12 = message.seq_in;
            if (i12 == 0 && message.seq_out == 0) {
                int i13 = encryptedChat.seq_in;
                if (i13 <= 0) {
                    i13 += 2;
                }
                tL_decryptedMessageLayer.in_seq_no = i13;
                int i14 = encryptedChat.seq_out;
                tL_decryptedMessageLayer.out_seq_no = i14;
                encryptedChat.seq_out = i14 + 2;
                if (encryptedChat.key_create_date == 0) {
                    encryptedChat.key_create_date = getConnectionsManager().getCurrentTime();
                }
                short s10 = (short) (encryptedChat.key_use_count_out + 1);
                encryptedChat.key_use_count_out = s10;
                if ((s10 >= 100 || encryptedChat.key_create_date < getConnectionsManager().getCurrentTime() - 604800) && encryptedChat.exchange_id == 0 && encryptedChat.future_key_fingerprint == 0) {
                    requestNewSecretChatKey(encryptedChat);
                }
                getMessagesStorage().updateEncryptedChatSeq(encryptedChat, false);
                message.seq_in = tL_decryptedMessageLayer.in_seq_no;
                message.seq_out = tL_decryptedMessageLayer.out_seq_no;
                getMessagesStorage().setMessageSeq(message.f17216id, message.seq_in, message.seq_out);
            } else {
                tL_decryptedMessageLayer.in_seq_no = i12;
                tL_decryptedMessageLayer.out_seq_no = message.seq_out;
            }
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d(decryptedMessage + " send message with in_seq = " + tL_decryptedMessageLayer.in_seq_no + " out_seq = " + tL_decryptedMessageLayer.out_seq_no);
            }
            int objectSize = tL_decryptedMessageLayer.getObjectSize();
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(objectSize + 4);
            nativeByteBuffer.writeInt32(objectSize);
            tL_decryptedMessageLayer.serializeToStream(nativeByteBuffer);
            int length = nativeByteBuffer.length();
            if (length % 16 != 0) {
                i10 = 16 - (length % 16);
            } else {
                i10 = 0;
            }
            int nextInt = ((Utilities.random.nextInt(3) + 2) * 16) + i10;
            NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(length + nextInt);
            nativeByteBuffer.position(0);
            nativeByteBuffer2.writeBytes(nativeByteBuffer);
            if (nextInt != 0) {
                byte[] bArr2 = new byte[nextInt];
                Utilities.random.nextBytes(bArr2);
                nativeByteBuffer2.writeBytes(bArr2);
            }
            byte[] bArr3 = new byte[16];
            if (encryptedChat.admin_id == getUserConfig().getClientUserId()) {
                z10 = false;
            }
            byte[] bArr4 = encryptedChat.auth_key;
            if (z10) {
                i11 = 8;
            } else {
                i11 = 0;
            }
            ByteBuffer byteBuffer = nativeByteBuffer2.buffer;
            System.arraycopy(Utilities.computeSHA256(bArr4, 88 + i11, 32, byteBuffer, 0, byteBuffer.limit()), 8, bArr3, 0, 16);
            nativeByteBuffer.reuse();
            MessageKeyData generateMessageKeyData = MessageKeyData.generateMessageKeyData(encryptedChat.auth_key, bArr3, z10, 2);
            Utilities.aesIgeEncryption(nativeByteBuffer2.buffer, generateMessageKeyData.aesKey, generateMessageKeyData.aesIv, true, false, 0, nativeByteBuffer2.limit());
            NativeByteBuffer nativeByteBuffer3 = new NativeByteBuffer(24 + nativeByteBuffer2.length());
            nativeByteBuffer2.position(0);
            nativeByteBuffer3.writeInt64(encryptedChat.key_fingerprint);
            nativeByteBuffer3.writeBytes(bArr3);
            nativeByteBuffer3.writeBytes(nativeByteBuffer2);
            nativeByteBuffer2.reuse();
            nativeByteBuffer3.position(0);
            if (inputEncryptedFile == null) {
                if (decryptedMessage instanceof TLRPC.TL_decryptedMessageService) {
                    TLRPC.TL_messages_sendEncryptedService tL_messages_sendEncryptedService = new TLRPC.TL_messages_sendEncryptedService();
                    tL_messages_sendEncryptedService.data = nativeByteBuffer3;
                    tL_messages_sendEncryptedService.random_id = decryptedMessage.random_id;
                    TLRPC.TL_inputEncryptedChat tL_inputEncryptedChat = new TLRPC.TL_inputEncryptedChat();
                    tL_messages_sendEncryptedService.peer = tL_inputEncryptedChat;
                    tL_inputEncryptedChat.chat_id = encryptedChat.f17203id;
                    tL_inputEncryptedChat.access_hash = encryptedChat.access_hash;
                    tL_messages_sendEncryptedFile2 = tL_messages_sendEncryptedService;
                } else {
                    TLRPC.TL_messages_sendEncrypted tL_messages_sendEncrypted = new TLRPC.TL_messages_sendEncrypted();
                    tL_messages_sendEncrypted.silent = message.silent;
                    tL_messages_sendEncrypted.data = nativeByteBuffer3;
                    tL_messages_sendEncrypted.random_id = decryptedMessage.random_id;
                    TLRPC.TL_inputEncryptedChat tL_inputEncryptedChat2 = new TLRPC.TL_inputEncryptedChat();
                    tL_messages_sendEncrypted.peer = tL_inputEncryptedChat2;
                    tL_inputEncryptedChat2.chat_id = encryptedChat.f17203id;
                    tL_inputEncryptedChat2.access_hash = encryptedChat.access_hash;
                    tL_messages_sendEncryptedFile2 = tL_messages_sendEncrypted;
                }
                tL_messages_sendEncryptedFile = tL_messages_sendEncryptedFile2;
            } else {
                TLRPC.TL_messages_sendEncryptedFile tL_messages_sendEncryptedFile3 = new TLRPC.TL_messages_sendEncryptedFile();
                tL_messages_sendEncryptedFile3.silent = message.silent;
                tL_messages_sendEncryptedFile3.data = nativeByteBuffer3;
                tL_messages_sendEncryptedFile3.random_id = decryptedMessage.random_id;
                TLRPC.TL_inputEncryptedChat tL_inputEncryptedChat3 = new TLRPC.TL_inputEncryptedChat();
                tL_messages_sendEncryptedFile3.peer = tL_inputEncryptedChat3;
                tL_inputEncryptedChat3.chat_id = encryptedChat.f17203id;
                tL_inputEncryptedChat3.access_hash = encryptedChat.access_hash;
                tL_messages_sendEncryptedFile3.file = inputEncryptedFile;
                tL_messages_sendEncryptedFile = tL_messages_sendEncryptedFile3;
            }
            getConnectionsManager().sendRequest(tL_messages_sendEncryptedFile, new ul(this, decryptedMessage, encryptedChat, message, messageObject, str), 64);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$processAcceptedSecretChat$18(TLRPC.EncryptedChat encryptedChat) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.encryptedChatUpdated, encryptedChat);
        sendNotifyLayerMessage(encryptedChat, null);
    }

    public void lambda$processAcceptedSecretChat$19(TLRPC.TL_encryptedChatDiscarded tL_encryptedChatDiscarded) {
        getMessagesController().putEncryptedChat(tL_encryptedChatDiscarded, false);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.encryptedChatUpdated, tL_encryptedChatDiscarded);
    }

    public void lambda$processDecryptedObject$10(long j3) {
        getNotificationsController().processReadMessages(null, j3, 0, Integer.MAX_VALUE, false);
        LongSparseIntArray longSparseIntArray = new LongSparseIntArray(1);
        longSparseIntArray.put(j3, 0);
        getNotificationsController().processDialogsUpdateRead(longSparseIntArray);
    }

    public void lambda$processDecryptedObject$11(long j3) {
        AndroidUtilities.runOnUIThread(new li(this, j3, 1));
    }

    public void lambda$processDecryptedObject$12(long j3) {
        TLRPC.Dialog dialog = (TLRPC.Dialog) getMessagesController().dialogs_dict.f(j3);
        if (dialog != null) {
            dialog.unread_count = 0;
            getMessagesController().dialogMessage.l(dialog.f17199id);
        }
        getMessagesStorage().getStorageQueue().postRunnable(new li(this, j3, 2));
        getMessagesStorage().deleteDialog(j3, 1);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.removeAllMessagesFromDialog, Long.valueOf(j3), Boolean.FALSE, null);
    }

    public void lambda$processPendingEncMessages$0(ArrayList arrayList) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            MessageObject messageObject = (MessageObject) getMessagesController().dialogMessagesByRandomIds.f(((Long) arrayList.get(i10)).longValue());
            if (messageObject != null) {
                messageObject.deleted = true;
            }
        }
    }

    public void lambda$processUpdateEncryption$1(TLRPC.Dialog dialog, long j3) {
        if (dialog.folder_id == 1) {
            SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(this.currentAccount).edit();
            edit.putBoolean("dialog_bar_archived" + j3, true);
            edit.commit();
        }
        getMessagesController().dialogs_dict.k(dialog, dialog.f17199id);
        getMessagesController().allDialogs.add(dialog);
        getMessagesController().sortDialogs(null);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
    }

    public void lambda$processUpdateEncryption$2(TLRPC.EncryptedChat encryptedChat, TLRPC.EncryptedChat encryptedChat2) {
        if (encryptedChat != null) {
            getMessagesController().putEncryptedChat(encryptedChat2, false);
        }
        getMessagesStorage().updateEncryptedChat(encryptedChat2);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.encryptedChatUpdated, encryptedChat2);
    }

    public void lambda$processUpdateEncryption$3(long j3) {
        getMessagesController().deleteDialog(j3, 0);
    }

    public static int lambda$resendMessages$13(TLRPC.Message message, TLRPC.Message message2) {
        return AndroidUtilities.compare(message.seq_out, message2.seq_out);
    }

    public void lambda$resendMessages$14(ArrayList arrayList) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            MessageObject messageObject = new MessageObject(this.currentAccount, (TLRPC.Message) arrayList.get(i10), false, true);
            messageObject.resendAsIs = true;
            getSendMessagesHelper().retrySendMessage(messageObject, true, 0L);
        }
    }

    public void lambda$resendMessages$15(int i10, TLRPC.EncryptedChat encryptedChat, int i11) {
        int i12;
        TLRPC.EncryptedChat encryptedChat2;
        int i13;
        TLRPC.Message createDeleteMessage;
        TLRPC.EncryptedChat encryptedChat3 = encryptedChat;
        try {
            if (encryptedChat3.admin_id == getUserConfig().getClientUserId() && i10 % 2 == 0) {
                i12 = i10 + 1;
            } else {
                i12 = i10;
            }
            SQLiteDatabase database = getMessagesStorage().getDatabase();
            Locale locale = Locale.US;
            int i14 = encryptedChat3.f17203id;
            ?? r10 = 0;
            SQLiteCursor queryFinalized = database.queryFinalized("SELECT uid FROM requested_holes WHERE uid = " + i14 + " AND ((seq_out_start >= " + i12 + " AND " + i12 + " <= seq_out_end) OR (seq_out_start >= " + i11 + " AND " + i11 + " <= seq_out_end))", new Object[0]);
            boolean next = queryFinalized.next();
            queryFinalized.dispose();
            if (next) {
                return;
            }
            long makeEncryptedDialogId = DialogObject.makeEncryptedDialogId(encryptedChat3.f17203id);
            SparseArray sparseArray = new SparseArray();
            ArrayList<TLRPC.Message> arrayList = new ArrayList<>();
            for (int i15 = i12; i15 <= i11; i15 += 2) {
                sparseArray.put(i15, null);
            }
            SQLiteDatabase database2 = getMessagesStorage().getDatabase();
            Locale locale2 = Locale.US;
            SQLiteCursor queryFinalized2 = database2.queryFinalized("SELECT m.data, r.random_id, s.seq_in, s.seq_out, m.ttl, s.mid FROM messages_seq as s LEFT JOIN randoms_v2 as r ON r.mid = s.mid LEFT JOIN messages_v2 as m ON m.mid = s.mid WHERE m.uid = " + makeEncryptedDialogId + " AND m.out = 1 AND s.seq_out >= " + i12 + " AND s.seq_out <= " + i11 + " ORDER BY seq_out ASC", new Object[0]);
            while (queryFinalized2.next()) {
                long longValue = queryFinalized2.longValue(1);
                if (longValue == 0) {
                    longValue = Utilities.random.nextLong();
                }
                long j3 = longValue;
                int intValue = queryFinalized2.intValue(2);
                int intValue2 = queryFinalized2.intValue(3);
                int intValue3 = queryFinalized2.intValue(5);
                NativeByteBuffer byteBufferValue = queryFinalized2.byteBufferValue(r10);
                if (byteBufferValue != null) {
                    createDeleteMessage = TLRPC.Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(r10), r10);
                    i13 = i12;
                    createDeleteMessage.readAttachPath(byteBufferValue, getUserConfig().clientUserId);
                    byteBufferValue.reuse();
                    createDeleteMessage.random_id = j3;
                    createDeleteMessage.dialog_id = makeEncryptedDialogId;
                    createDeleteMessage.seq_in = intValue;
                    createDeleteMessage.seq_out = intValue2;
                    createDeleteMessage.ttl = queryFinalized2.intValue(4);
                } else {
                    i13 = i12;
                    createDeleteMessage = createDeleteMessage(intValue3, intValue2, intValue, j3, encryptedChat3);
                }
                arrayList.add(createDeleteMessage);
                sparseArray.remove(intValue2);
                encryptedChat3 = encryptedChat;
                i12 = i13;
                r10 = 0;
            }
            int i16 = i12;
            queryFinalized2.dispose();
            if (sparseArray.size() != 0) {
                for (int i17 = 0; i17 < sparseArray.size(); i17++) {
                    int keyAt = sparseArray.keyAt(i17);
                    arrayList.add(createDeleteMessage(getUserConfig().getNewMessageId(), keyAt, keyAt + 1, Utilities.random.nextLong(), encryptedChat));
                }
                encryptedChat2 = encryptedChat;
                getUserConfig().saveConfig(false);
            } else {
                encryptedChat2 = encryptedChat;
            }
            Collections.sort(arrayList, new ji(1));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(encryptedChat2);
            try {
                AndroidUtilities.runOnUIThread(new pi(this, arrayList, 0));
                getSendMessagesHelper().processUnsentMessages(arrayList, null, new ArrayList(), new ArrayList(), arrayList2);
                SQLiteDatabase database3 = getMessagesStorage().getDatabase();
                Locale locale3 = Locale.US;
                int i18 = encryptedChat2.f17203id;
                database3.executeFast("REPLACE INTO requested_holes VALUES(" + i18 + ", " + i16 + ", " + i11 + ")").stepThis().dispose();
            } catch (Exception e) {
                e = e;
                FileLog.e(e);
            }
        } catch (Exception e7) {
            e = e7;
        }
    }

    public static void lambda$startSecretChat$24(Context context, org.telegram.ui.ActionBar.d2 d2Var) {
        try {
            if (!((Activity) context).isFinishing()) {
                d2Var.dismiss();
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$startSecretChat$25() {
        if (!this.delayedEncryptedChatUpdates.isEmpty()) {
            getMessagesController().processUpdateArray(this.delayedEncryptedChatUpdates, null, null, false, 0);
            this.delayedEncryptedChatUpdates.clear();
        }
    }

    public void lambda$startSecretChat$26(Context context, org.telegram.ui.ActionBar.d2 d2Var, TLObject tLObject, byte[] bArr, TLRPC.User user) {
        this.startingSecretChat = false;
        if (!((Activity) context).isFinishing()) {
            try {
                d2Var.dismiss();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) tLObject;
        encryptedChat.user_id = encryptedChat.participant_id;
        encryptedChat.seq_in = -2;
        encryptedChat.seq_out = 1;
        encryptedChat.a_or_b = bArr;
        getMessagesController().putEncryptedChat(encryptedChat, false);
        TLRPC.TL_dialog tL_dialog = new TLRPC.TL_dialog();
        tL_dialog.f17199id = DialogObject.makeEncryptedDialogId(encryptedChat.f17203id);
        tL_dialog.unread_count = 0;
        tL_dialog.top_message = 0;
        tL_dialog.last_message_date = getConnectionsManager().getCurrentTime();
        getMessagesController().dialogs_dict.k(tL_dialog, tL_dialog.f17199id);
        getMessagesController().allDialogs.add(tL_dialog);
        getMessagesController().sortDialogs(null);
        getMessagesStorage().putEncryptedChat(encryptedChat, user, tL_dialog);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.encryptedChatCreated, encryptedChat);
        Utilities.stageQueue.postRunnable(new dh(this, 11));
    }

    public void lambda$startSecretChat$27(Context context, org.telegram.ui.ActionBar.d2 d2Var) {
        if (!((Activity) context).isFinishing()) {
            this.startingSecretChat = false;
            try {
                d2Var.dismiss();
            } catch (Exception e) {
                FileLog.e(e);
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
            alertDialog$Builder.f17528a.R = LocaleController.getString(R.string.AppName);
            alertDialog$Builder.f17528a.T = LocaleController.getString(R.string.CreateEncryptedChatError);
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            alertDialog$Builder.o().setCanceledOnTouchOutside(true);
        }
    }

    public void lambda$startSecretChat$28(Context context, org.telegram.ui.ActionBar.d2 d2Var, byte[] bArr, TLRPC.User user, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            AndroidUtilities.runOnUIThread(new a0(this, context, d2Var, tLObject, bArr, user, 7));
            return;
        }
        this.delayedEncryptedChatUpdates.clear();
        AndroidUtilities.runOnUIThread(new mi(this, context, d2Var, 0));
    }

    public void lambda$startSecretChat$29(Context context, org.telegram.ui.ActionBar.d2 d2Var) {
        this.startingSecretChat = false;
        if (!((Activity) context).isFinishing()) {
            try {
                d2Var.dismiss();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
    }

    public void lambda$startSecretChat$30(Context context, org.telegram.ui.ActionBar.d2 d2Var, TLRPC.User user, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            TLRPC.messages_DhConfig messages_dhconfig = (TLRPC.messages_DhConfig) tLObject;
            if (tLObject instanceof TLRPC.TL_messages_dhConfig) {
                if (!Utilities.isGoodPrime(messages_dhconfig.f17350p, messages_dhconfig.f17349g)) {
                    AndroidUtilities.runOnUIThread(new ia(2, context, d2Var));
                    return;
                }
                getMessagesStorage().setSecretPBytes(messages_dhconfig.f17350p);
                getMessagesStorage().setSecretG(messages_dhconfig.f17349g);
                getMessagesStorage().setLastSecretVersion(messages_dhconfig.version);
                getMessagesStorage().saveSecretParams(getMessagesStorage().getLastSecretVersion(), getMessagesStorage().getSecretG(), getMessagesStorage().getSecretPBytes());
            }
            byte[] bArr = new byte[256];
            for (int i10 = 0; i10 < 256; i10++) {
                bArr[i10] = (byte) (((byte) (Utilities.random.nextDouble() * 256.0d)) ^ messages_dhconfig.random[i10]);
            }
            byte[] byteArray = BigInteger.valueOf(getMessagesStorage().getSecretG()).modPow(new BigInteger(1, bArr), new BigInteger(1, getMessagesStorage().getSecretPBytes())).toByteArray();
            if (byteArray.length > 256) {
                byte[] bArr2 = new byte[256];
                System.arraycopy(byteArray, 1, bArr2, 0, 256);
                byteArray = bArr2;
            }
            TLRPC.TL_messages_requestEncryption tL_messages_requestEncryption = new TLRPC.TL_messages_requestEncryption();
            tL_messages_requestEncryption.g_a = byteArray;
            tL_messages_requestEncryption.user_id = getMessagesController().getInputUser(user);
            tL_messages_requestEncryption.random_id = Utilities.random.nextInt();
            getConnectionsManager().sendRequest(tL_messages_requestEncryption, new aa(this, context, d2Var, bArr, user), 2);
            return;
        }
        this.delayedEncryptedChatUpdates.clear();
        AndroidUtilities.runOnUIThread(new mi(this, context, d2Var, 1));
    }

    public void lambda$startSecretChat$31(int i10, DialogInterface dialogInterface) {
        getConnectionsManager().cancelRequest(i10, true);
    }

    private void resendMessages(int i10, int i11, TLRPC.EncryptedChat encryptedChat) {
        int i12;
        if (encryptedChat != null && (i12 = i11 - i10) >= 0 && i12 <= 10000) {
            getMessagesStorage().getStorageQueue().postRunnable(new c5(this, i10, encryptedChat, i11, 9));
        }
    }

    private void updateMediaPaths(MessageObject messageObject, TLRPC.EncryptedFile encryptedFile, TLRPC.DecryptedMessage decryptedMessage, String str) {
        TLRPC.Document document;
        TLRPC.Photo photo;
        TLRPC.Message message = messageObject.messageOwner;
        if (encryptedFile != null) {
            TLRPC.MessageMedia messageMedia = message.media;
            if ((messageMedia instanceof TLRPC.TL_messageMediaPhoto) && (photo = messageMedia.photo) != null) {
                TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) hc.b.i(1, photo.sizes);
                String str2 = photoSize.location.volume_id + "_" + photoSize.location.local_id;
                TLRPC.TL_fileEncryptedLocation tL_fileEncryptedLocation = new TLRPC.TL_fileEncryptedLocation();
                photoSize.location = tL_fileEncryptedLocation;
                TLRPC.DecryptedMessageMedia decryptedMessageMedia = decryptedMessage.media;
                tL_fileEncryptedLocation.key = decryptedMessageMedia.key;
                tL_fileEncryptedLocation.iv = decryptedMessageMedia.iv;
                tL_fileEncryptedLocation.dc_id = encryptedFile.dc_id;
                tL_fileEncryptedLocation.volume_id = encryptedFile.f17204id;
                tL_fileEncryptedLocation.secret = encryptedFile.access_hash;
                tL_fileEncryptedLocation.local_id = encryptedFile.key_fingerprint;
                new File(FileLoader.getDirectory(4), org.telegram.ui.Cells.r6.t(str2, ".jpg")).renameTo(getFileLoader().getPathToAttach(photoSize));
                ImageLoader.getInstance().replaceImageInCache(str2, photoSize.location.volume_id + "_" + photoSize.location.local_id, ImageLocation.getForPhoto(photoSize, message.media.photo), true);
                ArrayList<TLRPC.Message> arrayList = new ArrayList<>();
                arrayList.add(message);
                getMessagesStorage().putMessages(arrayList, false, true, false, 0, false, 0, 0L);
            } else if ((messageMedia instanceof TLRPC.TL_messageMediaDocument) && (document = messageMedia.document) != null) {
                messageMedia.document = new TLRPC.TL_documentEncrypted();
                TLRPC.Document document2 = message.media.document;
                document2.f17201id = encryptedFile.f17204id;
                document2.access_hash = encryptedFile.access_hash;
                document2.date = document.date;
                document2.attributes = document.attributes;
                document2.mime_type = document.mime_type;
                document2.size = encryptedFile.size;
                TLRPC.DecryptedMessageMedia decryptedMessageMedia2 = decryptedMessage.media;
                document2.key = decryptedMessageMedia2.key;
                document2.iv = decryptedMessageMedia2.iv;
                ArrayList<TLRPC.PhotoSize> arrayList2 = document.thumbs;
                document2.thumbs = arrayList2;
                document2.dc_id = encryptedFile.dc_id;
                if (arrayList2.isEmpty()) {
                    TLRPC.TL_photoSizeEmpty tL_photoSizeEmpty = new TLRPC.TL_photoSizeEmpty();
                    tL_photoSizeEmpty.type = "s";
                    message.media.document.thumbs.add(tL_photoSizeEmpty);
                }
                String str3 = message.attachPath;
                if (str3 != null && str3.startsWith(FileLoader.getDirectory(4).getAbsolutePath()) && new File(message.attachPath).renameTo(getFileLoader().getPathToAttach(message.media.document))) {
                    messageObject.mediaExists = messageObject.attachPathExists;
                    messageObject.attachPathExists = false;
                    message.attachPath = "";
                }
                ArrayList<TLRPC.Message> arrayList3 = new ArrayList<>();
                arrayList3.add(message);
                getMessagesStorage().putMessages(arrayList3, false, true, false, 0, 0, 0L);
            }
        }
    }

    public void acceptSecretChat(TLRPC.EncryptedChat encryptedChat) {
        if (this.acceptingChats.get(encryptedChat.f17203id) != null) {
            return;
        }
        this.acceptingChats.put(encryptedChat.f17203id, encryptedChat);
        TLRPC.TL_messages_getDhConfig tL_messages_getDhConfig = new TLRPC.TL_messages_getDhConfig();
        tL_messages_getDhConfig.random_length = 256;
        tL_messages_getDhConfig.version = getMessagesStorage().getLastSecretVersion();
        getConnectionsManager().sendRequest(tL_messages_getDhConfig, new ki(this, encryptedChat, 1));
    }

    public void checkSecretHoles(TLRPC.EncryptedChat encryptedChat, ArrayList<TLRPC.Message> arrayList) {
        TL_decryptedMessageHolder tL_decryptedMessageHolder;
        TLRPC.TL_decryptedMessageLayer tL_decryptedMessageLayer;
        int i10;
        int i11;
        ArrayList<TL_decryptedMessageHolder> arrayList2 = this.secretHolesQueue.get(encryptedChat.f17203id);
        if (arrayList2 != null) {
            Collections.sort(arrayList2, new ji(2));
            boolean z10 = false;
            while (arrayList2.size() > 0 && ((i10 = (tL_decryptedMessageLayer = (tL_decryptedMessageHolder = arrayList2.get(0)).layer).out_seq_no) == (i11 = encryptedChat.seq_in) || i11 == i10 - 2)) {
                applyPeerLayer(encryptedChat, tL_decryptedMessageLayer.layer);
                TLRPC.TL_decryptedMessageLayer tL_decryptedMessageLayer2 = tL_decryptedMessageHolder.layer;
                encryptedChat.seq_in = tL_decryptedMessageLayer2.out_seq_no;
                encryptedChat.in_seq_no = tL_decryptedMessageLayer2.in_seq_no;
                arrayList2.remove(0);
                if (tL_decryptedMessageHolder.decryptedWithVersion == 2) {
                    encryptedChat.mtproto_seq = Math.min(encryptedChat.mtproto_seq, encryptedChat.seq_in);
                }
                TLRPC.EncryptedChat encryptedChat2 = encryptedChat;
                TLRPC.Message processDecryptedObject = processDecryptedObject(encryptedChat2, tL_decryptedMessageHolder.file, tL_decryptedMessageHolder.date, tL_decryptedMessageHolder.layer.message, tL_decryptedMessageHolder.new_key_used);
                if (processDecryptedObject != null) {
                    arrayList.add(processDecryptedObject);
                }
                encryptedChat = encryptedChat2;
                z10 = true;
            }
            TLRPC.EncryptedChat encryptedChat3 = encryptedChat;
            if (arrayList2.isEmpty()) {
                this.secretHolesQueue.remove(encryptedChat3.f17203id);
            }
            if (z10) {
                getMessagesStorage().updateEncryptedChatSeq(encryptedChat3, true);
            }
        }
    }

    public void cleanup() {
        this.sendingNotifyLayer.clear();
        this.acceptingChats.clear();
        this.secretHolesQueue.clear();
        this.pendingSecretMessages.clear();
        this.requestedHoles.clear();
        this.delayedEncryptedChatUpdates.clear();
        this.pendingEncMessagesToDelete.clear();
        this.startingSecretChat = false;
    }

    public void declineSecretChat(int i10, boolean z10) {
        declineSecretChat(i10, z10, 0L);
    }

    public java.util.ArrayList<org.telegram.tgnet.TLRPC.Message> decryptMessage(org.telegram.tgnet.TLRPC.EncryptedMessage r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.SecretChatHelper.decryptMessage(org.telegram.tgnet.TLRPC$EncryptedMessage):java.util.ArrayList");
    }

    public void performSendEncryptedRequest(TLRPC.TL_messages_sendEncryptedMultiMedia tL_messages_sendEncryptedMultiMedia, SendMessagesHelper.DelayedMessage delayedMessage) {
        for (int i10 = 0; i10 < tL_messages_sendEncryptedMultiMedia.files.size(); i10++) {
            performSendEncryptedRequest(tL_messages_sendEncryptedMultiMedia.messages.get(i10), delayedMessage.messages.get(i10), delayedMessage.encryptedChat, tL_messages_sendEncryptedMultiMedia.files.get(i10), delayedMessage.originalPaths.get(i10), delayedMessage.messageObjects.get(i10));
        }
    }

    public void processAcceptedSecretChat(org.telegram.tgnet.TLRPC.EncryptedChat r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.SecretChatHelper.processAcceptedSecretChat(org.telegram.tgnet.TLRPC$EncryptedChat):void");
    }

    public org.telegram.tgnet.TLRPC.Message processDecryptedObject(org.telegram.tgnet.TLRPC.EncryptedChat r20, org.telegram.tgnet.TLRPC.EncryptedFile r21, int r22, org.telegram.tgnet.TLObject r23, boolean r24) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.SecretChatHelper.processDecryptedObject(org.telegram.tgnet.TLRPC$EncryptedChat, org.telegram.tgnet.TLRPC$EncryptedFile, int, org.telegram.tgnet.TLObject, boolean):org.telegram.tgnet.TLRPC$Message");
    }

    public void processPendingEncMessages() {
        if (!this.pendingEncMessagesToDelete.isEmpty()) {
            AndroidUtilities.runOnUIThread(new pi(this, new ArrayList(this.pendingEncMessagesToDelete), 1));
            getMessagesStorage().markMessagesAsDeletedByRandoms(new ArrayList<>(this.pendingEncMessagesToDelete));
            this.pendingEncMessagesToDelete.clear();
        }
    }

    public void processUpdateEncryption(TL_update.TL_updateEncryption tL_updateEncryption, ConcurrentHashMap<Long, TLRPC.User> concurrentHashMap) {
        byte[] bArr;
        TLRPC.EncryptedChat encryptedChat = tL_updateEncryption.chat;
        long makeEncryptedDialogId = DialogObject.makeEncryptedDialogId(encryptedChat.f17203id);
        TLRPC.EncryptedChat encryptedChatDB = getMessagesController().getEncryptedChatDB(encryptedChat.f17203id, false);
        if ((encryptedChat instanceof TLRPC.TL_encryptedChatRequested) && encryptedChatDB == null) {
            long j3 = encryptedChat.participant_id;
            if (j3 == getUserConfig().getClientUserId()) {
                j3 = encryptedChat.admin_id;
            }
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(j3));
            if (user == null) {
                user = concurrentHashMap.get(Long.valueOf(j3));
            }
            encryptedChat.user_id = j3;
            TLRPC.TL_dialog tL_dialog = new TLRPC.TL_dialog();
            tL_dialog.f17199id = makeEncryptedDialogId;
            tL_dialog.folder_id = encryptedChat.folder_id;
            tL_dialog.unread_count = 0;
            tL_dialog.top_message = 0;
            tL_dialog.last_message_date = tL_updateEncryption.date;
            getMessagesController().putEncryptedChat(encryptedChat, false);
            AndroidUtilities.runOnUIThread(new g4(this, tL_dialog, makeEncryptedDialogId, 27));
            getMessagesStorage().putEncryptedChat(encryptedChat, user, tL_dialog);
            acceptSecretChat(encryptedChat);
        } else if (encryptedChat instanceof TLRPC.TL_encryptedChat) {
            if ((encryptedChatDB instanceof TLRPC.TL_encryptedChatWaiting) && ((bArr = encryptedChatDB.auth_key) == null || bArr.length == 1)) {
                encryptedChat.a_or_b = encryptedChatDB.a_or_b;
                encryptedChat.user_id = encryptedChatDB.user_id;
                processAcceptedSecretChat(encryptedChat);
            } else if (encryptedChatDB == null && this.startingSecretChat) {
                this.delayedEncryptedChatUpdates.add(tL_updateEncryption);
            }
        } else {
            if (encryptedChatDB != null) {
                encryptedChat.user_id = encryptedChatDB.user_id;
                encryptedChat.auth_key = encryptedChatDB.auth_key;
                encryptedChat.key_create_date = encryptedChatDB.key_create_date;
                encryptedChat.key_use_count_in = encryptedChatDB.key_use_count_in;
                encryptedChat.key_use_count_out = encryptedChatDB.key_use_count_out;
                encryptedChat.ttl = encryptedChatDB.ttl;
                encryptedChat.seq_in = encryptedChatDB.seq_in;
                encryptedChat.seq_out = encryptedChatDB.seq_out;
                encryptedChat.admin_id = encryptedChatDB.admin_id;
                encryptedChat.mtproto_seq = encryptedChatDB.mtproto_seq;
            }
            AndroidUtilities.runOnUIThread(new g9(this, encryptedChatDB, encryptedChat, 22));
        }
        if ((encryptedChat instanceof TLRPC.TL_encryptedChatDiscarded) && encryptedChat.history_deleted) {
            AndroidUtilities.runOnUIThread(new li(this, makeEncryptedDialogId, 3));
        }
    }

    public void requestNewSecretChatKey(TLRPC.EncryptedChat encryptedChat) {
        byte[] bArr = new byte[256];
        Utilities.random.nextBytes(bArr);
        byte[] byteArray = BigInteger.valueOf(getMessagesStorage().getSecretG()).modPow(new BigInteger(1, bArr), new BigInteger(1, getMessagesStorage().getSecretPBytes())).toByteArray();
        if (byteArray.length > 256) {
            byte[] bArr2 = new byte[256];
            System.arraycopy(byteArray, 1, bArr2, 0, 256);
            byteArray = bArr2;
        }
        encryptedChat.exchange_id = getSendMessagesHelper().getNextRandomId();
        encryptedChat.a_or_b = bArr;
        encryptedChat.g_a = byteArray;
        getMessagesStorage().updateEncryptedChat(encryptedChat);
        sendRequestKeyMessage(encryptedChat, null);
    }

    public void sendAbortKeyMessage(TLRPC.EncryptedChat encryptedChat, TLRPC.Message message, long j3) {
        if (!(encryptedChat instanceof TLRPC.TL_encryptedChat)) {
            return;
        }
        TLRPC.TL_decryptedMessageService tL_decryptedMessageService = new TLRPC.TL_decryptedMessageService();
        if (message != null) {
            tL_decryptedMessageService.action = message.action.encryptedAction;
        } else {
            TLRPC.TL_decryptedMessageActionAbortKey tL_decryptedMessageActionAbortKey = new TLRPC.TL_decryptedMessageActionAbortKey();
            tL_decryptedMessageService.action = tL_decryptedMessageActionAbortKey;
            tL_decryptedMessageActionAbortKey.exchange_id = j3;
            message = createServiceSecretMessage(encryptedChat, tL_decryptedMessageActionAbortKey);
        }
        TLRPC.Message message2 = message;
        tL_decryptedMessageService.random_id = message2.random_id;
        performSendEncryptedRequest(tL_decryptedMessageService, message2, encryptedChat, null, null, null);
    }

    public void sendAcceptKeyMessage(TLRPC.EncryptedChat encryptedChat, TLRPC.Message message) {
        if (!(encryptedChat instanceof TLRPC.TL_encryptedChat)) {
            return;
        }
        TLRPC.TL_decryptedMessageService tL_decryptedMessageService = new TLRPC.TL_decryptedMessageService();
        if (message != null) {
            tL_decryptedMessageService.action = message.action.encryptedAction;
        } else {
            TLRPC.TL_decryptedMessageActionAcceptKey tL_decryptedMessageActionAcceptKey = new TLRPC.TL_decryptedMessageActionAcceptKey();
            tL_decryptedMessageService.action = tL_decryptedMessageActionAcceptKey;
            tL_decryptedMessageActionAcceptKey.exchange_id = encryptedChat.exchange_id;
            tL_decryptedMessageActionAcceptKey.key_fingerprint = encryptedChat.future_key_fingerprint;
            tL_decryptedMessageActionAcceptKey.g_b = encryptedChat.g_a_or_b;
            message = createServiceSecretMessage(encryptedChat, tL_decryptedMessageActionAcceptKey);
        }
        TLRPC.Message message2 = message;
        tL_decryptedMessageService.random_id = message2.random_id;
        performSendEncryptedRequest(tL_decryptedMessageService, message2, encryptedChat, null, null, null);
    }

    public void sendClearHistoryMessage(TLRPC.EncryptedChat encryptedChat, TLRPC.Message message) {
        if (!(encryptedChat instanceof TLRPC.TL_encryptedChat)) {
            return;
        }
        TLRPC.TL_decryptedMessageService tL_decryptedMessageService = new TLRPC.TL_decryptedMessageService();
        if (message != null) {
            tL_decryptedMessageService.action = message.action.encryptedAction;
        } else {
            TLRPC.TL_decryptedMessageActionFlushHistory tL_decryptedMessageActionFlushHistory = new TLRPC.TL_decryptedMessageActionFlushHistory();
            tL_decryptedMessageService.action = tL_decryptedMessageActionFlushHistory;
            message = createServiceSecretMessage(encryptedChat, tL_decryptedMessageActionFlushHistory);
        }
        TLRPC.Message message2 = message;
        tL_decryptedMessageService.random_id = message2.random_id;
        performSendEncryptedRequest(tL_decryptedMessageService, message2, encryptedChat, null, null, null);
    }

    public void sendCommitKeyMessage(TLRPC.EncryptedChat encryptedChat, TLRPC.Message message) {
        if (!(encryptedChat instanceof TLRPC.TL_encryptedChat)) {
            return;
        }
        TLRPC.TL_decryptedMessageService tL_decryptedMessageService = new TLRPC.TL_decryptedMessageService();
        if (message != null) {
            tL_decryptedMessageService.action = message.action.encryptedAction;
        } else {
            TLRPC.TL_decryptedMessageActionCommitKey tL_decryptedMessageActionCommitKey = new TLRPC.TL_decryptedMessageActionCommitKey();
            tL_decryptedMessageService.action = tL_decryptedMessageActionCommitKey;
            tL_decryptedMessageActionCommitKey.exchange_id = encryptedChat.exchange_id;
            tL_decryptedMessageActionCommitKey.key_fingerprint = encryptedChat.future_key_fingerprint;
            message = createServiceSecretMessage(encryptedChat, tL_decryptedMessageActionCommitKey);
        }
        TLRPC.Message message2 = message;
        tL_decryptedMessageService.random_id = message2.random_id;
        performSendEncryptedRequest(tL_decryptedMessageService, message2, encryptedChat, null, null, null);
    }

    public void sendMessagesDeleteMessage(TLRPC.EncryptedChat encryptedChat, ArrayList<Long> arrayList, TLRPC.Message message) {
        if (!(encryptedChat instanceof TLRPC.TL_encryptedChat)) {
            return;
        }
        TLRPC.TL_decryptedMessageService tL_decryptedMessageService = new TLRPC.TL_decryptedMessageService();
        if (message != null) {
            tL_decryptedMessageService.action = message.action.encryptedAction;
        } else {
            TLRPC.TL_decryptedMessageActionDeleteMessages tL_decryptedMessageActionDeleteMessages = new TLRPC.TL_decryptedMessageActionDeleteMessages();
            tL_decryptedMessageService.action = tL_decryptedMessageActionDeleteMessages;
            tL_decryptedMessageActionDeleteMessages.random_ids = arrayList;
            message = createServiceSecretMessage(encryptedChat, tL_decryptedMessageActionDeleteMessages);
        }
        TLRPC.Message message2 = message;
        tL_decryptedMessageService.random_id = message2.random_id;
        performSendEncryptedRequest(tL_decryptedMessageService, message2, encryptedChat, null, null, null);
    }

    public void sendMessagesReadMessage(TLRPC.EncryptedChat encryptedChat, ArrayList<Long> arrayList, TLRPC.Message message) {
        if (!(encryptedChat instanceof TLRPC.TL_encryptedChat)) {
            return;
        }
        TLRPC.TL_decryptedMessageService tL_decryptedMessageService = new TLRPC.TL_decryptedMessageService();
        if (message != null) {
            tL_decryptedMessageService.action = message.action.encryptedAction;
        } else {
            TLRPC.TL_decryptedMessageActionReadMessages tL_decryptedMessageActionReadMessages = new TLRPC.TL_decryptedMessageActionReadMessages();
            tL_decryptedMessageService.action = tL_decryptedMessageActionReadMessages;
            tL_decryptedMessageActionReadMessages.random_ids = arrayList;
            message = createServiceSecretMessage(encryptedChat, tL_decryptedMessageActionReadMessages);
        }
        TLRPC.Message message2 = message;
        tL_decryptedMessageService.random_id = message2.random_id;
        performSendEncryptedRequest(tL_decryptedMessageService, message2, encryptedChat, null, null, null);
    }

    public void sendNoopMessage(TLRPC.EncryptedChat encryptedChat, TLRPC.Message message) {
        if (!(encryptedChat instanceof TLRPC.TL_encryptedChat)) {
            return;
        }
        TLRPC.TL_decryptedMessageService tL_decryptedMessageService = new TLRPC.TL_decryptedMessageService();
        if (message != null) {
            tL_decryptedMessageService.action = message.action.encryptedAction;
        } else {
            TLRPC.TL_decryptedMessageActionNoop tL_decryptedMessageActionNoop = new TLRPC.TL_decryptedMessageActionNoop();
            tL_decryptedMessageService.action = tL_decryptedMessageActionNoop;
            message = createServiceSecretMessage(encryptedChat, tL_decryptedMessageActionNoop);
        }
        TLRPC.Message message2 = message;
        tL_decryptedMessageService.random_id = message2.random_id;
        performSendEncryptedRequest(tL_decryptedMessageService, message2, encryptedChat, null, null, null);
    }

    public void sendNotifyLayerMessage(TLRPC.EncryptedChat encryptedChat, TLRPC.Message message) {
        if (!(encryptedChat instanceof TLRPC.TL_encryptedChat) || this.sendingNotifyLayer.contains(Integer.valueOf(encryptedChat.f17203id))) {
            return;
        }
        this.sendingNotifyLayer.add(Integer.valueOf(encryptedChat.f17203id));
        TLRPC.TL_decryptedMessageService tL_decryptedMessageService = new TLRPC.TL_decryptedMessageService();
        if (message != null) {
            tL_decryptedMessageService.action = message.action.encryptedAction;
        } else {
            TLRPC.TL_decryptedMessageActionNotifyLayer tL_decryptedMessageActionNotifyLayer = new TLRPC.TL_decryptedMessageActionNotifyLayer();
            tL_decryptedMessageService.action = tL_decryptedMessageActionNotifyLayer;
            tL_decryptedMessageActionNotifyLayer.layer = CURRENT_SECRET_CHAT_LAYER;
            message = createServiceSecretMessage(encryptedChat, tL_decryptedMessageActionNotifyLayer);
        }
        TLRPC.Message message2 = message;
        tL_decryptedMessageService.random_id = message2.random_id;
        performSendEncryptedRequest(tL_decryptedMessageService, message2, encryptedChat, null, null, null);
    }

    public void sendRequestKeyMessage(TLRPC.EncryptedChat encryptedChat, TLRPC.Message message) {
        if (!(encryptedChat instanceof TLRPC.TL_encryptedChat)) {
            return;
        }
        TLRPC.TL_decryptedMessageService tL_decryptedMessageService = new TLRPC.TL_decryptedMessageService();
        if (message != null) {
            tL_decryptedMessageService.action = message.action.encryptedAction;
        } else {
            TLRPC.TL_decryptedMessageActionRequestKey tL_decryptedMessageActionRequestKey = new TLRPC.TL_decryptedMessageActionRequestKey();
            tL_decryptedMessageService.action = tL_decryptedMessageActionRequestKey;
            tL_decryptedMessageActionRequestKey.exchange_id = encryptedChat.exchange_id;
            tL_decryptedMessageActionRequestKey.g_a = encryptedChat.g_a;
            message = createServiceSecretMessage(encryptedChat, tL_decryptedMessageActionRequestKey);
        }
        TLRPC.Message message2 = message;
        tL_decryptedMessageService.random_id = message2.random_id;
        performSendEncryptedRequest(tL_decryptedMessageService, message2, encryptedChat, null, null, null);
    }

    public void sendResendMessage(TLRPC.EncryptedChat encryptedChat, int i10, int i11, TLRPC.Message message) {
        if (encryptedChat instanceof TLRPC.TL_encryptedChat) {
            SparseIntArray sparseIntArray = this.requestedHoles.get(encryptedChat.f17203id);
            if (sparseIntArray != null && sparseIntArray.indexOfKey(i10) >= 0) {
                return;
            }
            if (sparseIntArray == null) {
                sparseIntArray = new SparseIntArray();
                this.requestedHoles.put(encryptedChat.f17203id, sparseIntArray);
            }
            sparseIntArray.put(i10, i11);
            TLRPC.TL_decryptedMessageService tL_decryptedMessageService = new TLRPC.TL_decryptedMessageService();
            if (message != null) {
                tL_decryptedMessageService.action = message.action.encryptedAction;
            } else {
                TLRPC.TL_decryptedMessageActionResend tL_decryptedMessageActionResend = new TLRPC.TL_decryptedMessageActionResend();
                tL_decryptedMessageService.action = tL_decryptedMessageActionResend;
                tL_decryptedMessageActionResend.start_seq_no = i10;
                tL_decryptedMessageActionResend.end_seq_no = i11;
                message = createServiceSecretMessage(encryptedChat, tL_decryptedMessageActionResend);
            }
            TLRPC.Message message2 = message;
            tL_decryptedMessageService.random_id = message2.random_id;
            performSendEncryptedRequest(tL_decryptedMessageService, message2, encryptedChat, null, null, null);
        }
    }

    public void sendScreenshotMessage(TLRPC.EncryptedChat encryptedChat, ArrayList<Long> arrayList, TLRPC.Message message) {
        if (!(encryptedChat instanceof TLRPC.TL_encryptedChat)) {
            return;
        }
        TLRPC.TL_decryptedMessageService tL_decryptedMessageService = new TLRPC.TL_decryptedMessageService();
        if (message != null) {
            tL_decryptedMessageService.action = message.action.encryptedAction;
        } else {
            TLRPC.TL_decryptedMessageActionScreenshotMessages tL_decryptedMessageActionScreenshotMessages = new TLRPC.TL_decryptedMessageActionScreenshotMessages();
            tL_decryptedMessageService.action = tL_decryptedMessageActionScreenshotMessages;
            tL_decryptedMessageActionScreenshotMessages.random_ids = arrayList;
            message = createServiceSecretMessage(encryptedChat, tL_decryptedMessageActionScreenshotMessages);
            MessageObject messageObject = new MessageObject(this.currentAccount, message, false, false);
            messageObject.messageOwner.send_state = 1;
            messageObject.wasJustSent = true;
            getMessagesController().updateInterfaceWithMessages(message.dialog_id, a2.l(messageObject), 0);
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
        }
        TLRPC.Message message2 = message;
        tL_decryptedMessageService.random_id = message2.random_id;
        performSendEncryptedRequest(tL_decryptedMessageService, message2, encryptedChat, null, null, null);
    }

    public void sendTTLMessage(TLRPC.EncryptedChat encryptedChat, TLRPC.Message message) {
        if (!(encryptedChat instanceof TLRPC.TL_encryptedChat)) {
            return;
        }
        TLRPC.TL_decryptedMessageService tL_decryptedMessageService = new TLRPC.TL_decryptedMessageService();
        if (message != null) {
            tL_decryptedMessageService.action = message.action.encryptedAction;
        } else {
            TLRPC.TL_decryptedMessageActionSetMessageTTL tL_decryptedMessageActionSetMessageTTL = new TLRPC.TL_decryptedMessageActionSetMessageTTL();
            tL_decryptedMessageService.action = tL_decryptedMessageActionSetMessageTTL;
            tL_decryptedMessageActionSetMessageTTL.ttl_seconds = encryptedChat.ttl;
            message = createServiceSecretMessage(encryptedChat, tL_decryptedMessageActionSetMessageTTL);
            MessageObject messageObject = new MessageObject(this.currentAccount, message, false, false);
            messageObject.messageOwner.send_state = 1;
            messageObject.wasJustSent = true;
            getMessagesController().updateInterfaceWithMessages(message.dialog_id, a2.l(messageObject), 0);
            getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
        }
        TLRPC.Message message2 = message;
        tL_decryptedMessageService.random_id = message2.random_id;
        performSendEncryptedRequest(tL_decryptedMessageService, message2, encryptedChat, null, null, null);
    }

    public void startSecretChat(Context context, TLRPC.User user) {
        if (user != null && context != null) {
            if (getMessagesController().isFrozen()) {
                org.telegram.ui.b.b(this.currentAccount);
                return;
            }
            this.startingSecretChat = true;
            org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(context, 3, null);
            TLRPC.TL_messages_getDhConfig tL_messages_getDhConfig = new TLRPC.TL_messages_getDhConfig();
            tL_messages_getDhConfig.random_length = 256;
            tL_messages_getDhConfig.version = getMessagesStorage().getLastSecretVersion();
            d2Var.setOnCancelListener(new cb(this, getConnectionsManager().sendRequest(tL_messages_getDhConfig, new l2(this, context, d2Var, user, 4), 2), 2));
            try {
                d2Var.show();
            } catch (Exception unused) {
            }
        }
    }

    public void declineSecretChat(int i10, boolean z10, long j3) {
        NativeByteBuffer nativeByteBuffer;
        Exception e;
        if (j3 == 0) {
            try {
                nativeByteBuffer = new NativeByteBuffer(12);
            } catch (Exception e7) {
                nativeByteBuffer = null;
                e = e7;
            }
            try {
                nativeByteBuffer.writeInt32(100);
                nativeByteBuffer.writeInt32(i10);
                nativeByteBuffer.writeBool(z10);
            } catch (Exception e10) {
                e = e10;
                FileLog.e(e);
                j3 = getMessagesStorage().createPendingTask(nativeByteBuffer);
                TLRPC.TL_messages_discardEncryption tL_messages_discardEncryption = new TLRPC.TL_messages_discardEncryption();
                tL_messages_discardEncryption.chat_id = i10;
                tL_messages_discardEncryption.delete_history = z10;
                getConnectionsManager().sendRequest(tL_messages_discardEncryption, new p1(this, j3, 3));
            }
            j3 = getMessagesStorage().createPendingTask(nativeByteBuffer);
        }
        TLRPC.TL_messages_discardEncryption tL_messages_discardEncryption2 = new TLRPC.TL_messages_discardEncryption();
        tL_messages_discardEncryption2.chat_id = i10;
        tL_messages_discardEncryption2.delete_history = z10;
        getConnectionsManager().sendRequest(tL_messages_discardEncryption2, new p1(this, j3, 3));
    }

    public void performSendEncryptedRequest(TLRPC.DecryptedMessage decryptedMessage, TLRPC.Message message, TLRPC.EncryptedChat encryptedChat, TLRPC.InputEncryptedFile inputEncryptedFile, String str, MessageObject messageObject) {
        if (decryptedMessage == null || encryptedChat.auth_key == null || (encryptedChat instanceof TLRPC.TL_encryptedChatRequested) || (encryptedChat instanceof TLRPC.TL_encryptedChatWaiting)) {
            return;
        }
        getSendMessagesHelper().putToSendingMessages(message, false);
        Utilities.stageQueue.postRunnable(new vl(this, encryptedChat, decryptedMessage, message, inputEncryptedFile, messageObject, str));
    }
}
