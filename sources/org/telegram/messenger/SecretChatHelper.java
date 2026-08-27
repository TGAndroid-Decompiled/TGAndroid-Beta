package org.telegram.messenger;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseIntArray;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.File;
import java.io.FileNotFoundException;
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.SQLite.SQLiteDatabase;
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
            outputSerializedData.writeInt32(constructor);
            outputSerializedData.writeInt64(0L);
            outputSerializedData.writeInt32(this.date);
            this.layer.serializeToStream(outputSerializedData);
            outputSerializedData.writeBool(this.file != null);
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
                byte[] bArrComputeSHA256 = Utilities.computeSHA256(bArr, 0, bArr.length);
                byte[] bArr2 = new byte[36];
                System.arraycopy(encryptedChat.key_hash, 0, bArr2, 0, 16);
                System.arraycopy(bArrComputeSHA256, 0, bArr2, 16, 20);
                encryptedChat.key_hash = bArr2;
                getMessagesStorage().updateEncryptedChat(encryptedChat);
            } catch (Throwable th) {
                FileLog.e(th);
            }
        }
        encryptedChat.layer = AndroidUtilities.setPeerLayerVersion(encryptedChat.layer, i10);
        getMessagesStorage().updateEncryptedChatLayer(encryptedChat);
        if (peerLayerVersion < CURRENT_SECRET_CHAT_LAYER) {
            sendNotifyLayerMessage(encryptedChat, null);
        }
        AndroidUtilities.runOnUIThread(new ai(this, encryptedChat, 2));
    }

    private TLRPC.Message createDeleteMessage(int i10, int i11, int i12, long j10, TLRPC.EncryptedChat encryptedChat) {
        TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
        TLRPC.TL_messageEncryptedAction tL_messageEncryptedAction = new TLRPC.TL_messageEncryptedAction();
        tL_messageService.action = tL_messageEncryptedAction;
        tL_messageEncryptedAction.encryptedAction = new TLRPC.TL_decryptedMessageActionDeleteMessages();
        tL_messageService.action.encryptedAction.random_ids.add(Long.valueOf(j10));
        tL_messageService.f22401id = i10;
        tL_messageService.local_id = i10;
        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
        tL_messageService.from_id = tL_peerUser;
        tL_peerUser.user_id = getUserConfig().getClientUserId();
        tL_messageService.unread = true;
        tL_messageService.out = true;
        tL_messageService.flags = 256;
        tL_messageService.dialog_id = DialogObject.makeEncryptedDialogId(encryptedChat.f22388id);
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
        tL_messageService.random_id = j10;
        return tL_messageService;
    }

    private TLRPC.TL_messageService createServiceSecretMessage(TLRPC.EncryptedChat encryptedChat, TLRPC.DecryptedMessageAction decryptedMessageAction) {
        TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
        TLRPC.TL_messageEncryptedAction tL_messageEncryptedAction = new TLRPC.TL_messageEncryptedAction();
        tL_messageService.action = tL_messageEncryptedAction;
        tL_messageEncryptedAction.encryptedAction = decryptedMessageAction;
        int newMessageId = getUserConfig().getNewMessageId();
        tL_messageService.f22401id = newMessageId;
        tL_messageService.local_id = newMessageId;
        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
        tL_messageService.from_id = tL_peerUser;
        tL_peerUser.user_id = getUserConfig().getClientUserId();
        tL_messageService.unread = true;
        tL_messageService.out = true;
        tL_messageService.flags = 256;
        tL_messageService.dialog_id = DialogObject.makeEncryptedDialogId(encryptedChat.f22388id);
        tL_messageService.peer_id = new TLRPC.TL_peerUser();
        tL_messageService.send_state = 1;
        if (encryptedChat.participant_id == getUserConfig().getClientUserId()) {
            tL_messageService.peer_id.user_id = encryptedChat.admin_id;
        } else {
            tL_messageService.peer_id.user_id = encryptedChat.participant_id;
        }
        if ((decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionScreenshotMessages) || (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionSetMessageTTL)) {
            tL_messageService.date = getConnectionsManager().getCurrentTime();
        } else {
            tL_messageService.date = 0;
        }
        tL_messageService.random_id = getSendMessagesHelper().getNextRandomId();
        getUserConfig().saveConfig(false);
        ArrayList<TLRPC.Message> arrayList = new ArrayList<>();
        arrayList.add(tL_messageService);
        getMessagesStorage().putMessages(arrayList, false, true, true, 0, false, 0, 0L);
        return tL_messageService;
    }

    private boolean decryptWithMtProtoVersion(NativeByteBuffer nativeByteBuffer, byte[] bArr, byte[] bArr2, int i10, boolean z10, boolean z11) {
        boolean z12 = false;
        boolean z13 = i10 == 1 ? false : z10;
        MessageKeyData messageKeyDataGenerateMessageKeyData = MessageKeyData.generateMessageKeyData(bArr, bArr2, z13, i10);
        Utilities.aesIgeEncryption(nativeByteBuffer.buffer, messageKeyDataGenerateMessageKeyData.aesKey, messageKeyDataGenerateMessageKeyData.aesIv, false, false, 24, nativeByteBuffer.limit() - 24);
        int int32 = nativeByteBuffer.readInt32(false);
        if (i10 == 2) {
            int i11 = z13 ? 8 : 0;
            ByteBuffer byteBuffer = nativeByteBuffer.buffer;
            if (!Utilities.arraysEquals(bArr2, 0, Utilities.computeSHA256(bArr, i11 + 88, 32, byteBuffer, 24, byteBuffer.limit()), 8)) {
                if (z11) {
                    Utilities.aesIgeEncryption(nativeByteBuffer.buffer, messageKeyDataGenerateMessageKeyData.aesKey, messageKeyDataGenerateMessageKeyData.aesIv, true, false, 24, nativeByteBuffer.limit() - 24);
                    nativeByteBuffer.position(24);
                }
                z12 = true;
            }
        } else {
            int iLimit = int32 + 28;
            if (iLimit < nativeByteBuffer.buffer.limit() - 15 || iLimit > nativeByteBuffer.buffer.limit()) {
                iLimit = nativeByteBuffer.buffer.limit();
            }
            byte[] bArrComputeSHA1 = Utilities.computeSHA1(nativeByteBuffer.buffer, 24, iLimit);
            if (!Utilities.arraysEquals(bArr2, 0, bArrComputeSHA1, bArrComputeSHA1.length - 16)) {
                if (z11) {
                    Utilities.aesIgeEncryption(nativeByteBuffer.buffer, messageKeyDataGenerateMessageKeyData.aesKey, messageKeyDataGenerateMessageKeyData.aesIv, true, false, 24, nativeByteBuffer.limit() - 24);
                    nativeByteBuffer.position(24);
                }
                z12 = true;
            }
        }
        if (int32 <= 0) {
            z12 = true;
        }
        if (int32 > nativeByteBuffer.limit() - 28) {
            z12 = true;
        }
        int iLimit2 = (nativeByteBuffer.limit() - 28) - int32;
        if (i10 == 2) {
            if (iLimit2 < 12) {
                z12 = true;
            }
            if (iLimit2 > 1024) {
                z12 = true;
            }
        } else if (iLimit2 > 15) {
            z12 = true;
        }
        return !z12;
    }

    public static SecretChatHelper getInstance(int i10) {
        SecretChatHelper secretChatHelper;
        SecretChatHelper secretChatHelper2 = Instance[i10];
        if (secretChatHelper2 != null) {
            return secretChatHelper2;
        }
        synchronized (SecretChatHelper.class) {
            try {
                secretChatHelper = Instance[i10];
                if (secretChatHelper == null) {
                    SecretChatHelper[] secretChatHelperArr = Instance;
                    SecretChatHelper secretChatHelper3 = new SecretChatHelper(i10);
                    secretChatHelperArr[i10] = secretChatHelper3;
                    secretChatHelper = secretChatHelper3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return secretChatHelper;
    }

    public static boolean isSecretInvisibleMessage(TLRPC.Message message) {
        TLRPC.MessageAction messageAction = message.action;
        if (!(messageAction instanceof TLRPC.TL_messageEncryptedAction)) {
            return false;
        }
        TLRPC.DecryptedMessageAction decryptedMessageAction = messageAction.encryptedAction;
        return ((decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionScreenshotMessages) || (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionSetMessageTTL)) ? false : true;
    }

    public static boolean isSecretVisibleMessage(TLRPC.Message message) {
        TLRPC.MessageAction messageAction = message.action;
        if (!(messageAction instanceof TLRPC.TL_messageEncryptedAction)) {
            return false;
        }
        TLRPC.DecryptedMessageAction decryptedMessageAction = messageAction.encryptedAction;
        return (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionScreenshotMessages) || (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionSetMessageTTL);
    }

    public void lambda$acceptSecretChat$21(TLRPC.EncryptedChat encryptedChat) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.encryptedChatUpdated, encryptedChat);
        sendNotifyLayerMessage(encryptedChat, null);
    }

    public void lambda$acceptSecretChat$22(TLRPC.EncryptedChat encryptedChat, TLObject tLObject, TLRPC.TL_error tL_error) {
        this.acceptingChats.remove(encryptedChat.f22388id);
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
            AndroidUtilities.runOnUIThread(new ai(this, encryptedChat2, 1));
        }
    }

    public void lambda$acceptSecretChat$23(TLRPC.EncryptedChat encryptedChat, TLObject tLObject, TLRPC.TL_error tL_error) {
        byte[] bArr;
        if (tL_error != null) {
            this.acceptingChats.remove(encryptedChat.f22388id);
            return;
        }
        TLRPC.messages_DhConfig messages_dhconfig = (TLRPC.messages_DhConfig) tLObject;
        if (tLObject instanceof TLRPC.TL_messages_dhConfig) {
            if (!Utilities.isGoodPrime(messages_dhconfig.f22535p, messages_dhconfig.f22534g)) {
                this.acceptingChats.remove(encryptedChat.f22388id);
                declineSecretChat(encryptedChat.f22388id, false);
                return;
            } else {
                getMessagesStorage().setSecretPBytes(messages_dhconfig.f22535p);
                getMessagesStorage().setSecretG(messages_dhconfig.f22534g);
                getMessagesStorage().setLastSecretVersion(messages_dhconfig.version);
                getMessagesStorage().saveSecretParams(getMessagesStorage().getLastSecretVersion(), getMessagesStorage().getSecretG(), getMessagesStorage().getSecretPBytes());
            }
        }
        byte[] bArr2 = new byte[256];
        for (int i10 = 0; i10 < 256; i10++) {
            bArr2[i10] = (byte) (((byte) (Utilities.random.nextDouble() * 256.0d)) ^ messages_dhconfig.random[i10]);
        }
        encryptedChat.a_or_b = bArr2;
        encryptedChat.seq_in = -1;
        encryptedChat.seq_out = 0;
        BigInteger bigInteger = new BigInteger(1, getMessagesStorage().getSecretPBytes());
        BigInteger bigIntegerModPow = BigInteger.valueOf(getMessagesStorage().getSecretG()).modPow(new BigInteger(1, bArr2), bigInteger);
        BigInteger bigInteger2 = new BigInteger(1, encryptedChat.g_a);
        if (!Utilities.isGoodGaAndGb(bigInteger2, bigInteger)) {
            this.acceptingChats.remove(encryptedChat.f22388id);
            declineSecretChat(encryptedChat.f22388id, false);
            return;
        }
        byte[] byteArray = bigIntegerModPow.toByteArray();
        if (byteArray.length > 256) {
            byte[] bArr3 = new byte[256];
            System.arraycopy(byteArray, 1, bArr3, 0, 256);
            byteArray = bArr3;
        }
        byte[] byteArray2 = bigInteger2.modPow(new BigInteger(1, bArr2), bigInteger).toByteArray();
        if (byteArray2.length <= 256) {
            if (byteArray2.length < 256) {
                bArr = new byte[256];
                System.arraycopy(byteArray2, 0, bArr, 256 - byteArray2.length, byteArray2.length);
                for (int i11 = 0; i11 < 256 - byteArray2.length; i11++) {
                    bArr[i11] = 0;
                }
            }
            byte[] bArrComputeSHA1 = Utilities.computeSHA1(byteArray2);
            byte[] bArr4 = new byte[8];
            System.arraycopy(bArrComputeSHA1, bArrComputeSHA1.length - 8, bArr4, 0, 8);
            encryptedChat.auth_key = byteArray2;
            encryptedChat.key_create_date = getConnectionsManager().getCurrentTime();
            TLRPC.TL_messages_acceptEncryption tL_messages_acceptEncryption = new TLRPC.TL_messages_acceptEncryption();
            tL_messages_acceptEncryption.g_b = byteArray;
            TLRPC.TL_inputEncryptedChat tL_inputEncryptedChat = new TLRPC.TL_inputEncryptedChat();
            tL_messages_acceptEncryption.peer = tL_inputEncryptedChat;
            tL_inputEncryptedChat.chat_id = encryptedChat.f22388id;
            tL_inputEncryptedChat.access_hash = encryptedChat.access_hash;
            tL_messages_acceptEncryption.key_fingerprint = Utilities.bytesToLong(bArr4);
            getConnectionsManager().sendRequest(tL_messages_acceptEncryption, new xh(this, encryptedChat, 0), 64);
        }
        bArr = new byte[256];
        System.arraycopy(byteArray2, byteArray2.length - 256, bArr, 0, 256);
        byteArray2 = bArr;
        byte[] bArrComputeSHA2 = Utilities.computeSHA1(byteArray2);
        byte[] bArr5 = new byte[8];
        System.arraycopy(bArrComputeSHA2, bArrComputeSHA2.length - 8, bArr5, 0, 8);
        encryptedChat.auth_key = byteArray2;
        encryptedChat.key_create_date = getConnectionsManager().getCurrentTime();
        TLRPC.TL_messages_acceptEncryption tL_messages_acceptEncryption2 = new TLRPC.TL_messages_acceptEncryption();
        tL_messages_acceptEncryption2.g_b = byteArray;
        TLRPC.TL_inputEncryptedChat tL_inputEncryptedChat2 = new TLRPC.TL_inputEncryptedChat();
        tL_messages_acceptEncryption2.peer = tL_inputEncryptedChat2;
        tL_inputEncryptedChat2.chat_id = encryptedChat.f22388id;
        tL_inputEncryptedChat2.access_hash = encryptedChat.access_hash;
        tL_messages_acceptEncryption2.key_fingerprint = Utilities.bytesToLong(bArr5);
        getConnectionsManager().sendRequest(tL_messages_acceptEncryption2, new xh(this, encryptedChat, 0), 64);
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
        return i10 < i11 ? -1 : 0;
    }

    public void lambda$declineSecretChat$20(long j10, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (j10 != 0) {
            getMessagesStorage().removePendingTask(j10);
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
        Integer numValueOf = Integer.valueOf(message.f22401id);
        Integer numValueOf2 = Integer.valueOf(message.f22401id);
        Long lValueOf = Long.valueOf(message.dialog_id);
        Integer numValueOf3 = Integer.valueOf(i10);
        Boolean bool = Boolean.FALSE;
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i11, numValueOf, numValueOf2, message, lValueOf, 0L, numValueOf3, bool);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.messageReceivedByServer2, Integer.valueOf(message.f22401id), Integer.valueOf(message.f22401id), message, Long.valueOf(message.dialog_id), 0L, Integer.valueOf(i10), bool);
        getSendMessagesHelper().processSentMessage(message.f22401id);
        getSendMessagesHelper().removeFromSendingMessages(message.f22401id, false);
    }

    public void lambda$performSendEncryptedRequest$5(TLRPC.Message message, TLRPC.messages_SentEncryptedMessage messages_sentencryptedmessage, int i10) {
        if (isSecretInvisibleMessage(message)) {
            messages_sentencryptedmessage.date = 0;
        }
        getMessagesStorage().updateMessageStateAndId(message.random_id, 0L, Integer.valueOf(message.f22401id), message.f22401id, messages_sentencryptedmessage.date, false, 0, 0);
        AndroidUtilities.runOnUIThread(new r4(this, message, i10, 21));
    }

    public void lambda$performSendEncryptedRequest$6(TLRPC.Message message) {
        message.send_state = 2;
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.messageSendError, Integer.valueOf(message.f22401id));
        getSendMessagesHelper().processSentMessage(message.f22401id);
        getSendMessagesHelper().removeFromSendingMessages(message.f22401id, false);
    }

    public void lambda$performSendEncryptedRequest$7(TLRPC.DecryptedMessage decryptedMessage, TLRPC.EncryptedChat encryptedChat, TLRPC.Message message, MessageObject messageObject, String str, TLObject tLObject, TLRPC.TL_error tL_error) {
        int mediaExistanceFlags;
        if (tL_error == null && (decryptedMessage.action instanceof TLRPC.TL_decryptedMessageActionNotifyLayer)) {
            TLRPC.EncryptedChat encryptedChat2 = getMessagesController().getEncryptedChat(Integer.valueOf(encryptedChat.f22388id));
            TLRPC.EncryptedChat encryptedChat3 = encryptedChat2 == null ? encryptedChat : encryptedChat2;
            if (encryptedChat3.key_hash == null) {
                encryptedChat3.key_hash = AndroidUtilities.calcAuthKeyHash(encryptedChat3.auth_key);
            }
            if (encryptedChat3.key_hash.length == 16) {
                try {
                    byte[] bArr = encryptedChat.auth_key;
                    byte[] bArrComputeSHA256 = Utilities.computeSHA256(bArr, 0, bArr.length);
                    byte[] bArr2 = new byte[36];
                    System.arraycopy(encryptedChat.key_hash, 0, bArr2, 0, 16);
                    System.arraycopy(bArrComputeSHA256, 0, bArr2, 16, 20);
                    encryptedChat3.key_hash = bArr2;
                    getMessagesStorage().updateEncryptedChat(encryptedChat3);
                } catch (Throwable th) {
                    FileLog.e(th);
                }
            }
            this.sendingNotifyLayer.remove(Integer.valueOf(encryptedChat3.f22388id));
            encryptedChat3.layer = AndroidUtilities.setMyLayerVersion(encryptedChat3.layer, CURRENT_SECRET_CHAT_LAYER);
            getMessagesStorage().updateEncryptedChatLayer(encryptedChat3);
        }
        if (tL_error != null) {
            getMessagesStorage().markMessageAsSendError(message, 0);
            AndroidUtilities.runOnUIThread(new sg(7, this, message));
            return;
        }
        String str2 = message.attachPath;
        TLRPC.messages_SentEncryptedMessage messages_sentencryptedmessage = (TLRPC.messages_SentEncryptedMessage) tLObject;
        if (isSecretVisibleMessage(message)) {
            message.date = messages_sentencryptedmessage.date;
        }
        if (messageObject != null) {
            TLRPC.EncryptedFile encryptedFile = messages_sentencryptedmessage.file;
            if (encryptedFile instanceof TLRPC.TL_encryptedFile) {
                updateMediaPaths(messageObject, encryptedFile, decryptedMessage, str);
                mediaExistanceFlags = messageObject.getMediaExistanceFlags();
            } else {
                mediaExistanceFlags = 0;
            }
        } else {
            mediaExistanceFlags = 0;
        }
        getMessagesStorage().getStorageQueue().postRunnable(new h0(this, message, messages_sentencryptedmessage, mediaExistanceFlags, 18));
    }

    public void lambda$performSendEncryptedRequest$8(TLRPC.EncryptedChat encryptedChat, TLRPC.DecryptedMessage decryptedMessage, TLRPC.Message message, TLRPC.InputEncryptedFile inputEncryptedFile, MessageObject messageObject, String str) {
        TLObject tLObject;
        TLObject tLObject2;
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
            int i10 = message.seq_in;
            if (i10 == 0 && message.seq_out == 0) {
                int i11 = encryptedChat.seq_in;
                if (i11 <= 0) {
                    i11 += 2;
                }
                tL_decryptedMessageLayer.in_seq_no = i11;
                int i12 = encryptedChat.seq_out;
                tL_decryptedMessageLayer.out_seq_no = i12;
                encryptedChat.seq_out = i12 + 2;
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
                getMessagesStorage().setMessageSeq(message.f22401id, message.seq_in, message.seq_out);
            } else {
                tL_decryptedMessageLayer.in_seq_no = i10;
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
            int iNextInt = ((Utilities.random.nextInt(3) + 2) * 16) + (length % 16 != 0 ? 16 - (length % 16) : 0);
            NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(length + iNextInt);
            nativeByteBuffer.position(0);
            nativeByteBuffer2.writeBytes(nativeByteBuffer);
            if (iNextInt != 0) {
                byte[] bArr2 = new byte[iNextInt];
                Utilities.random.nextBytes(bArr2);
                nativeByteBuffer2.writeBytes(bArr2);
            }
            byte[] bArr3 = new byte[16];
            if (encryptedChat.admin_id == getUserConfig().getClientUserId()) {
                z10 = false;
            }
            byte[] bArr4 = encryptedChat.auth_key;
            int i13 = z10 ? 8 : 0;
            ByteBuffer byteBuffer = nativeByteBuffer2.buffer;
            System.arraycopy(Utilities.computeSHA256(bArr4, 88 + i13, 32, byteBuffer, 0, byteBuffer.limit()), 8, bArr3, 0, 16);
            nativeByteBuffer.reuse();
            MessageKeyData messageKeyDataGenerateMessageKeyData = MessageKeyData.generateMessageKeyData(encryptedChat.auth_key, bArr3, z10, 2);
            Utilities.aesIgeEncryption(nativeByteBuffer2.buffer, messageKeyDataGenerateMessageKeyData.aesKey, messageKeyDataGenerateMessageKeyData.aesIv, true, false, 0, nativeByteBuffer2.limit());
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
                    tL_inputEncryptedChat.chat_id = encryptedChat.f22388id;
                    tL_inputEncryptedChat.access_hash = encryptedChat.access_hash;
                    tLObject2 = tL_messages_sendEncryptedService;
                } else {
                    TLRPC.TL_messages_sendEncrypted tL_messages_sendEncrypted = new TLRPC.TL_messages_sendEncrypted();
                    tL_messages_sendEncrypted.silent = message.silent;
                    tL_messages_sendEncrypted.data = nativeByteBuffer3;
                    tL_messages_sendEncrypted.random_id = decryptedMessage.random_id;
                    TLRPC.TL_inputEncryptedChat tL_inputEncryptedChat2 = new TLRPC.TL_inputEncryptedChat();
                    tL_messages_sendEncrypted.peer = tL_inputEncryptedChat2;
                    tL_inputEncryptedChat2.chat_id = encryptedChat.f22388id;
                    tL_inputEncryptedChat2.access_hash = encryptedChat.access_hash;
                    tLObject2 = tL_messages_sendEncrypted;
                }
                tLObject = tLObject2;
            } else {
                TLRPC.TL_messages_sendEncryptedFile tL_messages_sendEncryptedFile = new TLRPC.TL_messages_sendEncryptedFile();
                tL_messages_sendEncryptedFile.silent = message.silent;
                tL_messages_sendEncryptedFile.data = nativeByteBuffer3;
                tL_messages_sendEncryptedFile.random_id = decryptedMessage.random_id;
                TLRPC.TL_inputEncryptedChat tL_inputEncryptedChat3 = new TLRPC.TL_inputEncryptedChat();
                tL_messages_sendEncryptedFile.peer = tL_inputEncryptedChat3;
                tL_inputEncryptedChat3.chat_id = encryptedChat.f22388id;
                tL_inputEncryptedChat3.access_hash = encryptedChat.access_hash;
                tL_messages_sendEncryptedFile.file = inputEncryptedFile;
                tLObject = tL_messages_sendEncryptedFile;
            }
            getConnectionsManager().sendRequest(tLObject, new hl(this, decryptedMessage, encryptedChat, message, messageObject, str), 64);
        } catch (Exception e9) {
            FileLog.e(e9);
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

    public void lambda$processDecryptedObject$10(long j10) {
        getNotificationsController().processReadMessages(null, j10, 0, Integer.MAX_VALUE, false);
        LongSparseIntArray longSparseIntArray = new LongSparseIntArray(1);
        longSparseIntArray.put(j10, 0);
        getNotificationsController().processDialogsUpdateRead(longSparseIntArray);
    }

    public void lambda$processDecryptedObject$11(long j10) {
        AndroidUtilities.runOnUIThread(new yh(this, j10, 1));
    }

    public void lambda$processDecryptedObject$12(long j10) {
        TLRPC.Dialog dialog = (TLRPC.Dialog) getMessagesController().dialogs_dict.f(j10);
        if (dialog != null) {
            dialog.unread_count = 0;
            getMessagesController().dialogMessage.l(dialog.f22384id);
        }
        getMessagesStorage().getStorageQueue().postRunnable(new yh(this, j10, 2));
        getMessagesStorage().deleteDialog(j10, 1);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.removeAllMessagesFromDialog, Long.valueOf(j10), Boolean.FALSE, null);
    }

    public void lambda$processPendingEncMessages$0(ArrayList arrayList) {
        for (int i10 = 0; i10 < arrayList.size(); i10++) {
            MessageObject messageObject = (MessageObject) getMessagesController().dialogMessagesByRandomIds.f(((Long) arrayList.get(i10)).longValue());
            if (messageObject != null) {
                messageObject.deleted = true;
            }
        }
    }

    public void lambda$processUpdateEncryption$1(TLRPC.Dialog dialog, long j10) {
        if (dialog.folder_id == 1) {
            SharedPreferences.Editor editorEdit = MessagesController.getNotificationsSettings(this.currentAccount).edit();
            editorEdit.putBoolean("dialog_bar_archived" + j10, true);
            editorEdit.commit();
        }
        getMessagesController().dialogs_dict.k(dialog, dialog.f22384id);
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

    public void lambda$processUpdateEncryption$3(long j10) {
        getMessagesController().deleteDialog(j10, 0);
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
        ?? CreateDeleteMessage;
        TLRPC.EncryptedChat encryptedChat2 = encryptedChat;
        try {
            int i12 = (encryptedChat2.admin_id == getUserConfig().getClientUserId() && i10 % 2 == 0) ? i10 + 1 : i10;
            SQLiteDatabase database = getMessagesStorage().getDatabase();
            Locale locale = Locale.US;
            ?? r10 = 0;
            SQLiteCursor sQLiteCursorQueryFinalized = database.queryFinalized("SELECT uid FROM requested_holes WHERE uid = " + encryptedChat2.f22388id + " AND ((seq_out_start >= " + i12 + " AND " + i12 + " <= seq_out_end) OR (seq_out_start >= " + i11 + " AND " + i11 + " <= seq_out_end))", new Object[0]);
            boolean next = sQLiteCursorQueryFinalized.next();
            sQLiteCursorQueryFinalized.dispose();
            if (next) {
                return;
            }
            long jMakeEncryptedDialogId = DialogObject.makeEncryptedDialogId(encryptedChat2.f22388id);
            SparseArray sparseArray = new SparseArray();
            ArrayList arrayList = new ArrayList();
            for (int i13 = i12; i13 <= i11; i13 += 2) {
                sparseArray.put(i13, null);
            }
            SQLiteDatabase database2 = getMessagesStorage().getDatabase();
            Locale locale2 = Locale.US;
            ?? QueryFinalized = database2.queryFinalized("SELECT m.data, r.random_id, s.seq_in, s.seq_out, m.ttl, s.mid FROM messages_seq as s LEFT JOIN randoms_v2 as r ON r.mid = s.mid LEFT JOIN messages_v2 as m ON m.mid = s.mid WHERE m.uid = " + jMakeEncryptedDialogId + " AND m.out = 1 AND s.seq_out >= " + i12 + " AND s.seq_out <= " + i11 + " ORDER BY seq_out ASC", new Object[0]);
            while (QueryFinalized.next()) {
                long jLongValue = QueryFinalized.longValue(1);
                if (jLongValue == 0) {
                    jLongValue = Utilities.random.nextLong();
                }
                long j10 = jLongValue;
                int iIntValue = QueryFinalized.intValue(2);
                int iIntValue2 = QueryFinalized.intValue(3);
                int iIntValue3 = QueryFinalized.intValue(5);
                ?? ByteBufferValue = QueryFinalized.byteBufferValue(r10);
                if (ByteBufferValue != 0) {
                    CreateDeleteMessage = TLRPC.Message.TLdeserialize(ByteBufferValue, ByteBufferValue.readInt32(r10), r10);
                    CreateDeleteMessage.readAttachPath(ByteBufferValue, getUserConfig().clientUserId);
                    ByteBufferValue.reuse();
                    CreateDeleteMessage.random_id = j10;
                    CreateDeleteMessage.dialog_id = jMakeEncryptedDialogId;
                    CreateDeleteMessage.seq_in = iIntValue;
                    CreateDeleteMessage.seq_out = iIntValue2;
                    CreateDeleteMessage.ttl = QueryFinalized.intValue(4);
                } else {
                    CreateDeleteMessage = createDeleteMessage(iIntValue3, iIntValue2, iIntValue, j10, encryptedChat2);
                }
                arrayList.add(CreateDeleteMessage);
                sparseArray.remove(iIntValue2);
                encryptedChat2 = encryptedChat;
                i12 = i12;
                r10 = 0;
            }
            int i14 = i12;
            QueryFinalized.dispose();
            if (sparseArray.size() != 0) {
                for (int i15 = 0; i15 < sparseArray.size(); i15++) {
                    int iKeyAt = sparseArray.keyAt(i15);
                    arrayList.add(createDeleteMessage(getUserConfig().getNewMessageId(), iKeyAt, iKeyAt + 1, Utilities.random.nextLong(), encryptedChat));
                }
                getUserConfig().saveConfig(false);
            }
            Collections.sort(arrayList, new wh(1));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(encryptedChat);
            try {
                AndroidUtilities.runOnUIThread(new ci(this, arrayList, 0));
                getSendMessagesHelper().processUnsentMessages(arrayList, null, new ArrayList(), new ArrayList(), arrayList2);
                SQLiteDatabase database3 = getMessagesStorage().getDatabase();
                Locale locale3 = Locale.US;
                database3.executeFast("REPLACE INTO requested_holes VALUES(" + encryptedChat.f22388id + ", " + i14 + ", " + i11 + ")").stepThis().dispose();
                return;
            } catch (Exception e9) {
                e = e9;
            }
        } catch (Exception e10) {
            e = e10;
        }
        FileLog.e(e);
    }

    public static void lambda$startSecretChat$24(Context context, org.telegram.ui.ActionBar.b2 b2Var) {
        try {
            if (((Activity) context).isFinishing()) {
                return;
            }
            b2Var.dismiss();
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    public void lambda$startSecretChat$25() throws FileNotFoundException {
        if (this.delayedEncryptedChatUpdates.isEmpty()) {
            return;
        }
        getMessagesController().processUpdateArray(this.delayedEncryptedChatUpdates, null, null, false, 0);
        this.delayedEncryptedChatUpdates.clear();
    }

    public void lambda$startSecretChat$26(Context context, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, byte[] bArr, TLRPC.User user) {
        this.startingSecretChat = false;
        if (!((Activity) context).isFinishing()) {
            try {
                b2Var.dismiss();
            } catch (Exception e9) {
                FileLog.e(e9);
            }
        }
        TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) tLObject;
        encryptedChat.user_id = encryptedChat.participant_id;
        encryptedChat.seq_in = -2;
        encryptedChat.seq_out = 1;
        encryptedChat.a_or_b = bArr;
        getMessagesController().putEncryptedChat(encryptedChat, false);
        TLRPC.TL_dialog tL_dialog = new TLRPC.TL_dialog();
        tL_dialog.f22384id = DialogObject.makeEncryptedDialogId(encryptedChat.f22388id);
        tL_dialog.unread_count = 0;
        tL_dialog.top_message = 0;
        tL_dialog.last_message_date = getConnectionsManager().getCurrentTime();
        getMessagesController().dialogs_dict.k(tL_dialog, tL_dialog.f22384id);
        getMessagesController().allDialogs.add(tL_dialog);
        getMessagesController().sortDialogs(null);
        getMessagesStorage().putEncryptedChat(encryptedChat, user, tL_dialog);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.encryptedChatCreated, encryptedChat);
        Utilities.stageQueue.postRunnable(new rg(this, 11));
    }

    public void lambda$startSecretChat$27(Context context, org.telegram.ui.ActionBar.b2 b2Var) {
        if (((Activity) context).isFinishing()) {
            return;
        }
        this.startingSecretChat = false;
        try {
            b2Var.dismiss();
        } catch (Exception e9) {
            FileLog.e(e9);
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context);
        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.AppName);
        alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.CreateEncryptedChatError);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        alertDialog$Builder.o().setCanceledOnTouchOutside(true);
    }

    public void lambda$startSecretChat$28(Context context, org.telegram.ui.ActionBar.b2 b2Var, byte[] bArr, TLRPC.User user, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            AndroidUtilities.runOnUIThread(new b0(this, context, b2Var, tLObject, bArr, user, 7));
        } else {
            this.delayedEncryptedChatUpdates.clear();
            AndroidUtilities.runOnUIThread(new zh(this, context, b2Var, 0));
        }
    }

    public void lambda$startSecretChat$29(Context context, org.telegram.ui.ActionBar.b2 b2Var) {
        this.startingSecretChat = false;
        if (((Activity) context).isFinishing()) {
            return;
        }
        try {
            b2Var.dismiss();
        } catch (Exception e9) {
            FileLog.e(e9);
        }
    }

    public void lambda$startSecretChat$30(Context context, org.telegram.ui.ActionBar.b2 b2Var, TLRPC.User user, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error != null) {
            this.delayedEncryptedChatUpdates.clear();
            AndroidUtilities.runOnUIThread(new zh(this, context, b2Var, 1));
            return;
        }
        TLRPC.messages_DhConfig messages_dhconfig = (TLRPC.messages_DhConfig) tLObject;
        if (tLObject instanceof TLRPC.TL_messages_dhConfig) {
            if (!Utilities.isGoodPrime(messages_dhconfig.f22535p, messages_dhconfig.f22534g)) {
                AndroidUtilities.runOnUIThread(new ca(2, context, b2Var));
                return;
            }
            getMessagesStorage().setSecretPBytes(messages_dhconfig.f22535p);
            getMessagesStorage().setSecretG(messages_dhconfig.f22534g);
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
        getConnectionsManager().sendRequest(tL_messages_requestEncryption, new v9(this, context, b2Var, bArr, user), 2);
    }

    public void lambda$startSecretChat$31(int i10, DialogInterface dialogInterface) {
        getConnectionsManager().cancelRequest(i10, true);
    }

    private void resendMessages(int i10, int i11, TLRPC.EncryptedChat encryptedChat) {
        int i12;
        if (encryptedChat == null || (i12 = i11 - i10) < 0 || i12 > 10000) {
            return;
        }
        getMessagesStorage().getStorageQueue().postRunnable(new y4(this, i10, encryptedChat, i11, 9));
    }

    private void updateMediaPaths(MessageObject messageObject, TLRPC.EncryptedFile encryptedFile, TLRPC.DecryptedMessage decryptedMessage, String str) {
        TLRPC.Document document;
        TLRPC.Photo photo;
        TLRPC.Message message = messageObject.messageOwner;
        if (encryptedFile != null) {
            TLRPC.MessageMedia messageMedia = message.media;
            if ((messageMedia instanceof TLRPC.TL_messageMediaPhoto) && (photo = messageMedia.photo) != null) {
                TLRPC.PhotoSize photoSize = (TLRPC.PhotoSize) i0.a.i(1, photo.sizes);
                String str2 = photoSize.location.volume_id + "_" + photoSize.location.local_id;
                TLRPC.TL_fileEncryptedLocation tL_fileEncryptedLocation = new TLRPC.TL_fileEncryptedLocation();
                photoSize.location = tL_fileEncryptedLocation;
                TLRPC.DecryptedMessageMedia decryptedMessageMedia = decryptedMessage.media;
                tL_fileEncryptedLocation.key = decryptedMessageMedia.key;
                tL_fileEncryptedLocation.iv = decryptedMessageMedia.iv;
                tL_fileEncryptedLocation.dc_id = encryptedFile.dc_id;
                tL_fileEncryptedLocation.volume_id = encryptedFile.f22389id;
                tL_fileEncryptedLocation.secret = encryptedFile.access_hash;
                tL_fileEncryptedLocation.local_id = encryptedFile.key_fingerprint;
                String str3 = photoSize.location.volume_id + "_" + photoSize.location.local_id;
                new File(FileLoader.getDirectory(4), s3.c.l(str2, ".jpg")).renameTo(getFileLoader().getPathToAttach(photoSize));
                ImageLoader.getInstance().replaceImageInCache(str2, str3, ImageLocation.getForPhoto(photoSize, message.media.photo), true);
                ArrayList<TLRPC.Message> arrayList = new ArrayList<>();
                arrayList.add(message);
                getMessagesStorage().putMessages(arrayList, false, true, false, 0, false, 0, 0L);
                return;
            }
            if (!(messageMedia instanceof TLRPC.TL_messageMediaDocument) || (document = messageMedia.document) == null) {
                return;
            }
            messageMedia.document = new TLRPC.TL_documentEncrypted();
            TLRPC.Document document2 = message.media.document;
            document2.f22386id = encryptedFile.f22389id;
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
            String str4 = message.attachPath;
            if (str4 != null && str4.startsWith(FileLoader.getDirectory(4).getAbsolutePath()) && new File(message.attachPath).renameTo(getFileLoader().getPathToAttach(message.media.document))) {
                messageObject.mediaExists = messageObject.attachPathExists;
                messageObject.attachPathExists = false;
                message.attachPath = "";
            }
            ArrayList<TLRPC.Message> arrayList3 = new ArrayList<>();
            arrayList3.add(message);
            getMessagesStorage().putMessages(arrayList3, false, true, false, 0, 0, 0L);
        }
    }

    public void acceptSecretChat(TLRPC.EncryptedChat encryptedChat) {
        if (this.acceptingChats.get(encryptedChat.f22388id) != null) {
            return;
        }
        this.acceptingChats.put(encryptedChat.f22388id, encryptedChat);
        TLRPC.TL_messages_getDhConfig tL_messages_getDhConfig = new TLRPC.TL_messages_getDhConfig();
        tL_messages_getDhConfig.random_length = 256;
        tL_messages_getDhConfig.version = getMessagesStorage().getLastSecretVersion();
        getConnectionsManager().sendRequest(tL_messages_getDhConfig, new xh(this, encryptedChat, 1));
    }

    public void checkSecretHoles(TLRPC.EncryptedChat encryptedChat, ArrayList<TLRPC.Message> arrayList) {
        TL_decryptedMessageHolder tL_decryptedMessageHolder;
        TLRPC.TL_decryptedMessageLayer tL_decryptedMessageLayer;
        int i10;
        int i11;
        ArrayList<TL_decryptedMessageHolder> arrayList2 = this.secretHolesQueue.get(encryptedChat.f22388id);
        if (arrayList2 == null) {
            return;
        }
        Collections.sort(arrayList2, new wh(2));
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
            TLRPC.Message messageProcessDecryptedObject = processDecryptedObject(encryptedChat2, tL_decryptedMessageHolder.file, tL_decryptedMessageHolder.date, tL_decryptedMessageHolder.layer.message, tL_decryptedMessageHolder.new_key_used);
            if (messageProcessDecryptedObject != null) {
                arrayList.add(messageProcessDecryptedObject);
            }
            encryptedChat = encryptedChat2;
            z10 = true;
        }
        TLRPC.EncryptedChat encryptedChat3 = encryptedChat;
        if (arrayList2.isEmpty()) {
            this.secretHolesQueue.remove(encryptedChat3.f22388id);
        }
        if (z10) {
            getMessagesStorage().updateEncryptedChatSeq(encryptedChat3, true);
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

    public void processAcceptedSecretChat(TLRPC.EncryptedChat encryptedChat) {
        byte[] bArr;
        byte[] bArr2;
        ArrayList<TLRPC.Update> arrayList;
        BigInteger bigInteger = new BigInteger(1, getMessagesStorage().getSecretPBytes());
        BigInteger bigInteger2 = new BigInteger(1, encryptedChat.g_a_or_b);
        if (!Utilities.isGoodGaAndGb(bigInteger2, bigInteger)) {
            declineSecretChat(encryptedChat.f22388id, false);
            return;
        }
        byte[] byteArray = bigInteger2.modPow(new BigInteger(1, encryptedChat.a_or_b), bigInteger).toByteArray();
        if (byteArray.length <= 256) {
            if (byteArray.length < 256) {
                bArr = new byte[256];
                System.arraycopy(byteArray, 0, bArr, 256 - byteArray.length, byteArray.length);
                for (int i10 = 0; i10 < 256 - byteArray.length; i10++) {
                    bArr[i10] = 0;
                }
            }
            byte[] bArrComputeSHA1 = Utilities.computeSHA1(byteArray);
            bArr2 = new byte[8];
            System.arraycopy(bArrComputeSHA1, bArrComputeSHA1.length - 8, bArr2, 0, 8);
            if (encryptedChat.key_fingerprint == Utilities.bytesToLong(bArr2)) {
                encryptedChat.auth_key = byteArray;
                encryptedChat.key_create_date = getConnectionsManager().getCurrentTime();
                encryptedChat.seq_in = -2;
                encryptedChat.seq_out = 1;
                getMessagesStorage().updateEncryptedChat(encryptedChat);
                getMessagesController().putEncryptedChat(encryptedChat, false);
                arrayList = this.pendingSecretMessages.get(encryptedChat.f22388id);
                if (arrayList != null) {
                    getMessagesController().processUpdateArray(arrayList, null, null, false, 0);
                    this.pendingSecretMessages.remove(encryptedChat.f22388id);
                }
                AndroidUtilities.runOnUIThread(new ai(this, encryptedChat, 0));
                return;
            }
            TLRPC.TL_encryptedChatDiscarded tL_encryptedChatDiscarded = new TLRPC.TL_encryptedChatDiscarded();
            tL_encryptedChatDiscarded.f22388id = encryptedChat.f22388id;
            tL_encryptedChatDiscarded.user_id = encryptedChat.user_id;
            tL_encryptedChatDiscarded.auth_key = encryptedChat.auth_key;
            tL_encryptedChatDiscarded.key_create_date = encryptedChat.key_create_date;
            tL_encryptedChatDiscarded.key_use_count_in = encryptedChat.key_use_count_in;
            tL_encryptedChatDiscarded.key_use_count_out = encryptedChat.key_use_count_out;
            tL_encryptedChatDiscarded.seq_in = encryptedChat.seq_in;
            tL_encryptedChatDiscarded.seq_out = encryptedChat.seq_out;
            tL_encryptedChatDiscarded.admin_id = encryptedChat.admin_id;
            tL_encryptedChatDiscarded.mtproto_seq = encryptedChat.mtproto_seq;
            getMessagesStorage().updateEncryptedChat(tL_encryptedChatDiscarded);
            AndroidUtilities.runOnUIThread(new bi(this, tL_encryptedChatDiscarded, 0));
            declineSecretChat(encryptedChat.f22388id, false);
        }
        bArr = new byte[256];
        System.arraycopy(byteArray, byteArray.length - 256, bArr, 0, 256);
        byteArray = bArr;
        byte[] bArrComputeSHA2 = Utilities.computeSHA1(byteArray);
        bArr2 = new byte[8];
        System.arraycopy(bArrComputeSHA2, bArrComputeSHA2.length - 8, bArr2, 0, 8);
        if (encryptedChat.key_fingerprint == Utilities.bytesToLong(bArr2)) {
            encryptedChat.auth_key = byteArray;
            encryptedChat.key_create_date = getConnectionsManager().getCurrentTime();
            encryptedChat.seq_in = -2;
            encryptedChat.seq_out = 1;
            getMessagesStorage().updateEncryptedChat(encryptedChat);
            getMessagesController().putEncryptedChat(encryptedChat, false);
            arrayList = this.pendingSecretMessages.get(encryptedChat.f22388id);
            if (arrayList != null) {
                getMessagesController().processUpdateArray(arrayList, null, null, false, 0);
                this.pendingSecretMessages.remove(encryptedChat.f22388id);
            }
            AndroidUtilities.runOnUIThread(new ai(this, encryptedChat, 0));
            return;
        }
        TLRPC.TL_encryptedChatDiscarded tL_encryptedChatDiscarded2 = new TLRPC.TL_encryptedChatDiscarded();
        tL_encryptedChatDiscarded2.f22388id = encryptedChat.f22388id;
        tL_encryptedChatDiscarded2.user_id = encryptedChat.user_id;
        tL_encryptedChatDiscarded2.auth_key = encryptedChat.auth_key;
        tL_encryptedChatDiscarded2.key_create_date = encryptedChat.key_create_date;
        tL_encryptedChatDiscarded2.key_use_count_in = encryptedChat.key_use_count_in;
        tL_encryptedChatDiscarded2.key_use_count_out = encryptedChat.key_use_count_out;
        tL_encryptedChatDiscarded2.seq_in = encryptedChat.seq_in;
        tL_encryptedChatDiscarded2.seq_out = encryptedChat.seq_out;
        tL_encryptedChatDiscarded2.admin_id = encryptedChat.admin_id;
        tL_encryptedChatDiscarded2.mtproto_seq = encryptedChat.mtproto_seq;
        getMessagesStorage().updateEncryptedChat(tL_encryptedChatDiscarded2);
        AndroidUtilities.runOnUIThread(new bi(this, tL_encryptedChatDiscarded2, 0));
        declineSecretChat(encryptedChat.f22388id, false);
    }

    public TLRPC.Message processDecryptedObject(TLRPC.EncryptedChat encryptedChat, TLRPC.EncryptedFile encryptedFile, int i10, TLObject tLObject, boolean z10) {
        int i11;
        int i12;
        int i13;
        byte[] bArr;
        long jBytesToLong;
        byte[] bArr2;
        byte[] bArr3;
        byte[] bArr4;
        TLRPC.PhotoSize tL_photoSizeEmpty;
        byte[] bArr5;
        TLRPC.PhotoSize tL_photoSizeEmpty2;
        byte[] bArr6;
        if (tLObject != null) {
            long j10 = encryptedChat.admin_id;
            if (j10 == getUserConfig().getClientUserId()) {
                j10 = encryptedChat.participant_id;
            }
            if (encryptedChat.exchange_id == 0 && encryptedChat.future_key_fingerprint == 0 && encryptedChat.key_use_count_in >= 120) {
                requestNewSecretChatKey(encryptedChat);
            }
            long j11 = encryptedChat.exchange_id;
            if (j11 == 0 && encryptedChat.future_key_fingerprint != 0 && !z10) {
                encryptedChat.future_auth_key = new byte[256];
                encryptedChat.future_key_fingerprint = 0L;
                getMessagesStorage().updateEncryptedChat(encryptedChat);
            } else if (j11 != 0 && z10) {
                encryptedChat.key_fingerprint = encryptedChat.future_key_fingerprint;
                encryptedChat.auth_key = encryptedChat.future_auth_key;
                encryptedChat.key_create_date = getConnectionsManager().getCurrentTime();
                encryptedChat.future_auth_key = new byte[256];
                encryptedChat.future_key_fingerprint = 0L;
                encryptedChat.key_use_count_in = (short) 0;
                encryptedChat.key_use_count_out = (short) 0;
                encryptedChat.exchange_id = 0L;
                getMessagesStorage().updateEncryptedChat(encryptedChat);
            }
            if (tLObject instanceof TLRPC.TL_decryptedMessage) {
                TLRPC.TL_decryptedMessage tL_decryptedMessage = (TLRPC.TL_decryptedMessage) tLObject;
                TLRPC.TL_message_secret tL_message_secret = new TLRPC.TL_message_secret();
                tL_message_secret.ttl = tL_decryptedMessage.ttl;
                tL_message_secret.entities = tL_decryptedMessage.entities;
                tL_message_secret.message = tL_decryptedMessage.message;
                tL_message_secret.date = i10;
                int newMessageId = getUserConfig().getNewMessageId();
                tL_message_secret.f22401id = newMessageId;
                tL_message_secret.local_id = newMessageId;
                tL_message_secret.silent = tL_decryptedMessage.silent;
                getUserConfig().saveConfig(false);
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_message_secret.from_id = tL_peerUser;
                tL_peerUser.user_id = j10;
                TLRPC.TL_peerUser tL_peerUser2 = new TLRPC.TL_peerUser();
                tL_message_secret.peer_id = tL_peerUser2;
                tL_peerUser2.user_id = getUserConfig().getClientUserId();
                tL_message_secret.random_id = tL_decryptedMessage.random_id;
                tL_message_secret.unread = true;
                tL_message_secret.flags = 768;
                String str = tL_decryptedMessage.via_bot_name;
                if (str != null && str.length() > 0) {
                    tL_message_secret.via_bot_name = tL_decryptedMessage.via_bot_name;
                    tL_message_secret.flags |= 2048;
                }
                long j12 = tL_decryptedMessage.grouped_id;
                if (j12 != 0) {
                    tL_message_secret.grouped_id = j12;
                    tL_message_secret.flags |= 131072;
                }
                tL_message_secret.dialog_id = DialogObject.makeEncryptedDialogId(encryptedChat.f22388id);
                if (tL_decryptedMessage.reply_to_random_id != 0) {
                    TLRPC.TL_messageReplyHeader tL_messageReplyHeader = new TLRPC.TL_messageReplyHeader();
                    tL_message_secret.reply_to = tL_messageReplyHeader;
                    tL_messageReplyHeader.reply_to_random_id = tL_decryptedMessage.reply_to_random_id;
                    tL_message_secret.flags |= 8;
                }
                TLRPC.DecryptedMessageMedia decryptedMessageMedia = tL_decryptedMessage.media;
                if (decryptedMessageMedia == null || (decryptedMessageMedia instanceof TLRPC.TL_decryptedMessageMediaEmpty)) {
                    tL_message_secret.media = new TLRPC.TL_messageMediaEmpty();
                } else if (decryptedMessageMedia instanceof TLRPC.TL_decryptedMessageMediaWebPage) {
                    TLRPC.TL_messageMediaWebPage tL_messageMediaWebPage = new TLRPC.TL_messageMediaWebPage();
                    tL_message_secret.media = tL_messageMediaWebPage;
                    tL_messageMediaWebPage.webpage = new TLRPC.TL_webPageUrlPending();
                    tL_message_secret.media.webpage.url = tL_decryptedMessage.media.url;
                } else if (decryptedMessageMedia instanceof TLRPC.TL_decryptedMessageMediaContact) {
                    TLRPC.TL_messageMediaContact tL_messageMediaContact = new TLRPC.TL_messageMediaContact();
                    tL_message_secret.media = tL_messageMediaContact;
                    TLRPC.DecryptedMessageMedia decryptedMessageMedia2 = tL_decryptedMessage.media;
                    tL_messageMediaContact.last_name = decryptedMessageMedia2.last_name;
                    tL_messageMediaContact.first_name = decryptedMessageMedia2.first_name;
                    tL_messageMediaContact.phone_number = decryptedMessageMedia2.phone_number;
                    tL_messageMediaContact.user_id = decryptedMessageMedia2.user_id;
                    tL_messageMediaContact.vcard = "";
                } else if (decryptedMessageMedia instanceof TLRPC.TL_decryptedMessageMediaGeoPoint) {
                    TLRPC.TL_messageMediaGeo tL_messageMediaGeo = new TLRPC.TL_messageMediaGeo();
                    tL_message_secret.media = tL_messageMediaGeo;
                    tL_messageMediaGeo.geo = new TLRPC.TL_geoPoint();
                    TLRPC.GeoPoint geoPoint = tL_message_secret.media.geo;
                    TLRPC.DecryptedMessageMedia decryptedMessageMedia3 = tL_decryptedMessage.media;
                    geoPoint.lat = decryptedMessageMedia3.lat;
                    geoPoint._long = decryptedMessageMedia3._long;
                } else if (decryptedMessageMedia instanceof TLRPC.TL_decryptedMessageMediaPhoto) {
                    byte[] bArr7 = decryptedMessageMedia.key;
                    if (bArr7 != null && bArr7.length == 32 && (bArr6 = decryptedMessageMedia.iv) != null && bArr6.length == 32) {
                        TLRPC.TL_messageMediaPhoto tL_messageMediaPhoto = new TLRPC.TL_messageMediaPhoto();
                        tL_message_secret.media = tL_messageMediaPhoto;
                        tL_messageMediaPhoto.flags |= 3;
                        if (TextUtils.isEmpty(tL_message_secret.message)) {
                            String str2 = tL_decryptedMessage.media.caption;
                            tL_message_secret.message = str2 != null ? str2 : "";
                        }
                        tL_message_secret.media.photo = new TLRPC.TL_photo();
                        TLRPC.Photo photo = tL_message_secret.media.photo;
                        photo.file_reference = new byte[0];
                        photo.date = tL_message_secret.date;
                        TLRPC.DecryptedMessageMedia decryptedMessageMedia4 = tL_decryptedMessage.media;
                        byte[] bArr8 = ((TLRPC.TL_decryptedMessageMediaPhoto) decryptedMessageMedia4).thumb;
                        if (bArr8 != null && bArr8.length != 0 && bArr8.length <= 6000 && decryptedMessageMedia4.thumb_w <= 100 && decryptedMessageMedia4.thumb_h <= 100) {
                            TLRPC.TL_photoCachedSize tL_photoCachedSize = new TLRPC.TL_photoCachedSize();
                            TLRPC.DecryptedMessageMedia decryptedMessageMedia5 = tL_decryptedMessage.media;
                            tL_photoCachedSize.f22405w = decryptedMessageMedia5.thumb_w;
                            tL_photoCachedSize.h = decryptedMessageMedia5.thumb_h;
                            tL_photoCachedSize.bytes = bArr8;
                            tL_photoCachedSize.type = "s";
                            tL_photoCachedSize.location = new TLRPC.TL_fileLocationUnavailable();
                            tL_message_secret.media.photo.sizes.add(tL_photoCachedSize);
                        }
                        int i14 = tL_message_secret.ttl;
                        if (i14 != 0) {
                            TLRPC.MessageMedia messageMedia = tL_message_secret.media;
                            messageMedia.ttl_seconds = i14;
                            messageMedia.flags |= 4;
                        }
                        TLRPC.TL_photoSize_layer127 tL_photoSize_layer127 = new TLRPC.TL_photoSize_layer127();
                        TLRPC.DecryptedMessageMedia decryptedMessageMedia6 = tL_decryptedMessage.media;
                        tL_photoSize_layer127.f22405w = decryptedMessageMedia6.f22383w;
                        tL_photoSize_layer127.h = decryptedMessageMedia6.h;
                        tL_photoSize_layer127.type = "x";
                        tL_photoSize_layer127.size = (int) encryptedFile.size;
                        TLRPC.TL_fileEncryptedLocation tL_fileEncryptedLocation = new TLRPC.TL_fileEncryptedLocation();
                        tL_photoSize_layer127.location = tL_fileEncryptedLocation;
                        TLRPC.DecryptedMessageMedia decryptedMessageMedia7 = tL_decryptedMessage.media;
                        tL_fileEncryptedLocation.key = decryptedMessageMedia7.key;
                        tL_fileEncryptedLocation.iv = decryptedMessageMedia7.iv;
                        tL_fileEncryptedLocation.dc_id = encryptedFile.dc_id;
                        tL_fileEncryptedLocation.volume_id = encryptedFile.f22389id;
                        tL_fileEncryptedLocation.secret = encryptedFile.access_hash;
                        tL_fileEncryptedLocation.local_id = encryptedFile.key_fingerprint;
                        tL_message_secret.media.photo.sizes.add(tL_photoSize_layer127);
                    }
                } else if (decryptedMessageMedia instanceof TLRPC.TL_decryptedMessageMediaVideo) {
                    byte[] bArr9 = decryptedMessageMedia.key;
                    if (bArr9 != null && bArr9.length == 32 && (bArr5 = decryptedMessageMedia.iv) != null && bArr5.length == 32) {
                        TLRPC.TL_messageMediaDocument tL_messageMediaDocument = new TLRPC.TL_messageMediaDocument();
                        tL_message_secret.media = tL_messageMediaDocument;
                        tL_messageMediaDocument.flags |= 3;
                        tL_messageMediaDocument.document = new TLRPC.TL_documentEncrypted();
                        TLRPC.Document document = tL_message_secret.media.document;
                        TLRPC.DecryptedMessageMedia decryptedMessageMedia8 = tL_decryptedMessage.media;
                        document.key = decryptedMessageMedia8.key;
                        document.iv = decryptedMessageMedia8.iv;
                        document.dc_id = encryptedFile.dc_id;
                        if (TextUtils.isEmpty(tL_message_secret.message)) {
                            String str3 = tL_decryptedMessage.media.caption;
                            tL_message_secret.message = str3 != null ? str3 : "";
                        }
                        TLRPC.Document document2 = tL_message_secret.media.document;
                        document2.date = i10;
                        document2.size = encryptedFile.size;
                        document2.f22386id = encryptedFile.f22389id;
                        document2.access_hash = encryptedFile.access_hash;
                        TLRPC.DecryptedMessageMedia decryptedMessageMedia9 = tL_decryptedMessage.media;
                        String str4 = decryptedMessageMedia9.mime_type;
                        document2.mime_type = str4;
                        if (str4 == null) {
                            document2.mime_type = "video/mp4";
                        }
                        byte[] bArr10 = ((TLRPC.TL_decryptedMessageMediaVideo) decryptedMessageMedia9).thumb;
                        if (bArr10 == null || bArr10.length == 0 || bArr10.length > 6000 || decryptedMessageMedia9.thumb_w > 100 || decryptedMessageMedia9.thumb_h > 100) {
                            tL_photoSizeEmpty2 = new TLRPC.TL_photoSizeEmpty();
                            tL_photoSizeEmpty2.type = "s";
                        } else {
                            tL_photoSizeEmpty2 = new TLRPC.TL_photoCachedSize();
                            tL_photoSizeEmpty2.bytes = bArr10;
                            TLRPC.DecryptedMessageMedia decryptedMessageMedia10 = tL_decryptedMessage.media;
                            tL_photoSizeEmpty2.f22405w = decryptedMessageMedia10.thumb_w;
                            tL_photoSizeEmpty2.h = decryptedMessageMedia10.thumb_h;
                            tL_photoSizeEmpty2.type = "s";
                            tL_photoSizeEmpty2.location = new TLRPC.TL_fileLocationUnavailable();
                        }
                        tL_message_secret.media.document.thumbs.add(tL_photoSizeEmpty2);
                        tL_message_secret.media.document.flags |= 1;
                        TLRPC.TL_documentAttributeVideo_layer159 tL_documentAttributeVideo_layer159 = new TLRPC.TL_documentAttributeVideo_layer159();
                        TLRPC.DecryptedMessageMedia decryptedMessageMedia11 = tL_decryptedMessage.media;
                        tL_documentAttributeVideo_layer159.f22387w = decryptedMessageMedia11.f22383w;
                        tL_documentAttributeVideo_layer159.h = decryptedMessageMedia11.h;
                        tL_documentAttributeVideo_layer159.duration = decryptedMessageMedia11.duration;
                        tL_documentAttributeVideo_layer159.supports_streaming = false;
                        tL_message_secret.media.document.attributes.add(tL_documentAttributeVideo_layer159);
                        int i15 = tL_message_secret.ttl;
                        if (i15 != 0) {
                            TLRPC.MessageMedia messageMedia2 = tL_message_secret.media;
                            messageMedia2.ttl_seconds = i15;
                            messageMedia2.flags |= 4;
                        }
                        if (i15 != 0) {
                            tL_message_secret.ttl = Math.max(tL_decryptedMessage.media.duration + 1, i15);
                        }
                    }
                } else if (decryptedMessageMedia instanceof TLRPC.TL_decryptedMessageMediaDocument) {
                    byte[] bArr11 = decryptedMessageMedia.key;
                    if (bArr11 != null && bArr11.length == 32 && (bArr4 = decryptedMessageMedia.iv) != null && bArr4.length == 32) {
                        TLRPC.TL_messageMediaDocument tL_messageMediaDocument2 = new TLRPC.TL_messageMediaDocument();
                        tL_message_secret.media = tL_messageMediaDocument2;
                        tL_messageMediaDocument2.flags |= 3;
                        if (TextUtils.isEmpty(tL_message_secret.message)) {
                            String str5 = tL_decryptedMessage.media.caption;
                            if (str5 == null) {
                                str5 = "";
                            }
                            tL_message_secret.message = str5;
                        }
                        tL_message_secret.media.document = new TLRPC.TL_documentEncrypted();
                        TLRPC.Document document3 = tL_message_secret.media.document;
                        document3.f22386id = encryptedFile.f22389id;
                        document3.access_hash = encryptedFile.access_hash;
                        document3.date = i10;
                        TLRPC.DecryptedMessageMedia decryptedMessageMedia12 = tL_decryptedMessage.media;
                        document3.mime_type = decryptedMessageMedia12.mime_type;
                        if (decryptedMessageMedia12 instanceof TLRPC.TL_decryptedMessageMediaDocument_layer8) {
                            TLRPC.TL_documentAttributeFilename tL_documentAttributeFilename = new TLRPC.TL_documentAttributeFilename();
                            tL_documentAttributeFilename.file_name = tL_decryptedMessage.media.file_name;
                            tL_message_secret.media.document.attributes.add(tL_documentAttributeFilename);
                        } else {
                            document3.attributes = decryptedMessageMedia12.attributes;
                        }
                        if (tL_message_secret.ttl > 0) {
                            int size = tL_message_secret.media.document.attributes.size();
                            for (int i16 = 0; i16 < size; i16++) {
                                TLRPC.DocumentAttribute documentAttribute = tL_message_secret.media.document.attributes.get(i16);
                                if ((documentAttribute instanceof TLRPC.TL_documentAttributeAudio) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                                    tL_message_secret.ttl = (int) Math.max(documentAttribute.duration + 1.0d, tL_message_secret.ttl);
                                    break;
                                }
                            }
                            tL_message_secret.ttl = Math.max(tL_decryptedMessage.media.duration + 1, tL_message_secret.ttl);
                        }
                        TLRPC.Document document4 = tL_message_secret.media.document;
                        long j13 = tL_decryptedMessage.media.size;
                        document4.size = j13 != 0 ? Math.min(j13, encryptedFile.size) : encryptedFile.size;
                        TLRPC.Document document5 = tL_message_secret.media.document;
                        TLRPC.DecryptedMessageMedia decryptedMessageMedia13 = tL_decryptedMessage.media;
                        document5.key = decryptedMessageMedia13.key;
                        document5.iv = decryptedMessageMedia13.iv;
                        String str6 = document5.mime_type;
                        if (str6 == null) {
                            document5.mime_type = "";
                        } else if ("application/x-tgsticker".equals(str6) || "application/x-tgsdice".equals(tL_message_secret.media.document.mime_type)) {
                            tL_message_secret.media.document.mime_type = "application/x-bad_tgsticker";
                        }
                        byte[] bArr12 = ((TLRPC.TL_decryptedMessageMediaDocument) tL_decryptedMessage.media).thumb;
                        if (bArr12 == null || bArr12.length == 0 || bArr12.length > 20000) {
                            tL_photoSizeEmpty = new TLRPC.TL_photoSizeEmpty();
                            tL_photoSizeEmpty.type = "s";
                        } else {
                            tL_photoSizeEmpty = new TLRPC.TL_photoCachedSize();
                            tL_photoSizeEmpty.bytes = bArr12;
                            TLRPC.DecryptedMessageMedia decryptedMessageMedia14 = tL_decryptedMessage.media;
                            tL_photoSizeEmpty.f22405w = decryptedMessageMedia14.thumb_w;
                            tL_photoSizeEmpty.h = decryptedMessageMedia14.thumb_h;
                            tL_photoSizeEmpty.type = "s";
                            tL_photoSizeEmpty.location = new TLRPC.TL_fileLocationUnavailable();
                        }
                        tL_message_secret.media.document.thumbs.add(tL_photoSizeEmpty);
                        TLRPC.Document document6 = tL_message_secret.media.document;
                        document6.flags |= 1;
                        document6.dc_id = encryptedFile.dc_id;
                        if (MessageObject.isVoiceMessage(tL_message_secret) || MessageObject.isRoundVideoMessage(tL_message_secret)) {
                            tL_message_secret.media_unread = true;
                        }
                    }
                } else if (decryptedMessageMedia instanceof TLRPC.TL_decryptedMessageMediaExternalDocument) {
                    TLRPC.TL_messageMediaDocument tL_messageMediaDocument3 = new TLRPC.TL_messageMediaDocument();
                    tL_message_secret.media = tL_messageMediaDocument3;
                    tL_messageMediaDocument3.flags |= 3;
                    tL_message_secret.message = "";
                    tL_messageMediaDocument3.document = new TLRPC.TL_document();
                    TLRPC.Document document7 = tL_message_secret.media.document;
                    TLRPC.DecryptedMessageMedia decryptedMessageMedia15 = tL_decryptedMessage.media;
                    document7.f22386id = decryptedMessageMedia15.f22382id;
                    document7.access_hash = decryptedMessageMedia15.access_hash;
                    document7.file_reference = new byte[0];
                    document7.date = decryptedMessageMedia15.date;
                    document7.attributes = decryptedMessageMedia15.attributes;
                    document7.mime_type = decryptedMessageMedia15.mime_type;
                    document7.dc_id = decryptedMessageMedia15.dc_id;
                    document7.size = decryptedMessageMedia15.size;
                    document7.thumbs.add(((TLRPC.TL_decryptedMessageMediaExternalDocument) decryptedMessageMedia15).thumb);
                    TLRPC.Document document8 = tL_message_secret.media.document;
                    document8.flags |= 1;
                    if (document8.mime_type == null) {
                        document8.mime_type = "";
                    }
                    if (MessageObject.isAnimatedStickerMessage(tL_message_secret)) {
                        tL_message_secret.stickerVerified = 0;
                        getMediaDataController().verifyAnimatedStickerMessage(tL_message_secret, true);
                    }
                } else if (decryptedMessageMedia instanceof TLRPC.TL_decryptedMessageMediaAudio) {
                    byte[] bArr13 = decryptedMessageMedia.key;
                    if (bArr13 != null && bArr13.length == 32 && (bArr3 = decryptedMessageMedia.iv) != null && bArr3.length == 32) {
                        TLRPC.TL_messageMediaDocument tL_messageMediaDocument4 = new TLRPC.TL_messageMediaDocument();
                        tL_message_secret.media = tL_messageMediaDocument4;
                        tL_messageMediaDocument4.flags |= 3;
                        tL_messageMediaDocument4.document = new TLRPC.TL_documentEncrypted();
                        TLRPC.Document document9 = tL_message_secret.media.document;
                        TLRPC.DecryptedMessageMedia decryptedMessageMedia16 = tL_decryptedMessage.media;
                        document9.key = decryptedMessageMedia16.key;
                        document9.iv = decryptedMessageMedia16.iv;
                        document9.f22386id = encryptedFile.f22389id;
                        document9.access_hash = encryptedFile.access_hash;
                        document9.date = i10;
                        document9.size = encryptedFile.size;
                        document9.dc_id = encryptedFile.dc_id;
                        document9.mime_type = decryptedMessageMedia16.mime_type;
                        if (TextUtils.isEmpty(tL_message_secret.message)) {
                            String str7 = tL_decryptedMessage.media.caption;
                            tL_message_secret.message = str7 != null ? str7 : "";
                        }
                        TLRPC.Document document10 = tL_message_secret.media.document;
                        if (document10.mime_type == null) {
                            document10.mime_type = "audio/ogg";
                        }
                        TLRPC.TL_documentAttributeAudio tL_documentAttributeAudio = new TLRPC.TL_documentAttributeAudio();
                        tL_documentAttributeAudio.duration = tL_decryptedMessage.media.duration;
                        tL_documentAttributeAudio.voice = true;
                        tL_message_secret.media.document.attributes.add(tL_documentAttributeAudio);
                        int i17 = tL_message_secret.ttl;
                        if (i17 != 0) {
                            tL_message_secret.ttl = Math.max(tL_decryptedMessage.media.duration + 1, i17);
                        }
                        if (tL_message_secret.media.document.thumbs.isEmpty()) {
                            TLRPC.TL_photoSizeEmpty tL_photoSizeEmpty3 = new TLRPC.TL_photoSizeEmpty();
                            tL_photoSizeEmpty3.type = "s";
                            tL_message_secret.media.document.thumbs.add(tL_photoSizeEmpty3);
                        }
                    }
                } else if (decryptedMessageMedia instanceof TLRPC.TL_decryptedMessageMediaVenue) {
                    TLRPC.TL_messageMediaVenue tL_messageMediaVenue = new TLRPC.TL_messageMediaVenue();
                    tL_message_secret.media = tL_messageMediaVenue;
                    tL_messageMediaVenue.geo = new TLRPC.TL_geoPoint();
                    TLRPC.MessageMedia messageMedia3 = tL_message_secret.media;
                    TLRPC.GeoPoint geoPoint2 = messageMedia3.geo;
                    TLRPC.DecryptedMessageMedia decryptedMessageMedia17 = tL_decryptedMessage.media;
                    geoPoint2.lat = decryptedMessageMedia17.lat;
                    geoPoint2._long = decryptedMessageMedia17._long;
                    messageMedia3.title = decryptedMessageMedia17.title;
                    messageMedia3.address = decryptedMessageMedia17.address;
                    messageMedia3.provider = decryptedMessageMedia17.provider;
                    messageMedia3.venue_id = decryptedMessageMedia17.venue_id;
                    messageMedia3.venue_type = "";
                }
                int i18 = tL_message_secret.ttl;
                if (i18 != 0) {
                    TLRPC.MessageMedia messageMedia4 = tL_message_secret.media;
                    if (messageMedia4.ttl_seconds == 0) {
                        messageMedia4.ttl_seconds = i18;
                        messageMedia4.flags |= 4;
                    }
                }
                String str8 = tL_message_secret.message;
                if (str8 != null) {
                    tL_message_secret.message = str8.replace((char) 8238, ' ');
                }
                return tL_message_secret;
            }
            if (tLObject instanceof TLRPC.TL_decryptedMessageService) {
                TLRPC.TL_decryptedMessageService tL_decryptedMessageService = (TLRPC.TL_decryptedMessageService) tLObject;
                TLRPC.DecryptedMessageAction decryptedMessageAction = tL_decryptedMessageService.action;
                if ((decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionSetMessageTTL) || (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionScreenshotMessages)) {
                    TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                    if (tL_decryptedMessageService.action instanceof TLRPC.TL_decryptedMessageActionSetMessageTTL) {
                        TLRPC.TL_messageEncryptedAction tL_messageEncryptedAction = new TLRPC.TL_messageEncryptedAction();
                        tL_messageService.action = tL_messageEncryptedAction;
                        TLRPC.DecryptedMessageAction decryptedMessageAction2 = tL_decryptedMessageService.action;
                        int i19 = decryptedMessageAction2.ttl_seconds;
                        if (i19 < 0 || i19 > 31536000) {
                            decryptedMessageAction2.ttl_seconds = 31536000;
                        }
                        encryptedChat.ttl = decryptedMessageAction2.ttl_seconds;
                        tL_messageEncryptedAction.encryptedAction = decryptedMessageAction2;
                        getMessagesStorage().updateEncryptedChatTTL(encryptedChat);
                    } else {
                        TLRPC.TL_messageEncryptedAction tL_messageEncryptedAction2 = new TLRPC.TL_messageEncryptedAction();
                        tL_messageService.action = tL_messageEncryptedAction2;
                        tL_messageEncryptedAction2.encryptedAction = tL_decryptedMessageService.action;
                    }
                    int newMessageId2 = getUserConfig().getNewMessageId();
                    tL_messageService.f22401id = newMessageId2;
                    tL_messageService.local_id = newMessageId2;
                    getUserConfig().saveConfig(false);
                    tL_messageService.unread = true;
                    tL_messageService.flags = 256;
                    tL_messageService.date = i10;
                    TLRPC.TL_peerUser tL_peerUser3 = new TLRPC.TL_peerUser();
                    tL_messageService.from_id = tL_peerUser3;
                    tL_peerUser3.user_id = j10;
                    TLRPC.TL_peerUser tL_peerUser4 = new TLRPC.TL_peerUser();
                    tL_messageService.peer_id = tL_peerUser4;
                    tL_peerUser4.user_id = getUserConfig().getClientUserId();
                    tL_messageService.dialog_id = DialogObject.makeEncryptedDialogId(encryptedChat.f22388id);
                    return tL_messageService;
                }
                if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionFlushHistory) {
                    AndroidUtilities.runOnUIThread(new yh(this, DialogObject.makeEncryptedDialogId(encryptedChat.f22388id), 0));
                    return null;
                }
                if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionDeleteMessages) {
                    if (!decryptedMessageAction.random_ids.isEmpty()) {
                        this.pendingEncMessagesToDelete.addAll(tL_decryptedMessageService.action.random_ids);
                        return null;
                    }
                } else if (!(decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionReadMessages)) {
                    if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionNotifyLayer) {
                        applyPeerLayer(encryptedChat, decryptedMessageAction.layer);
                        return null;
                    }
                    if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionRequestKey) {
                        long j14 = encryptedChat.exchange_id;
                        if (j14 != 0) {
                            if (j14 <= decryptedMessageAction.exchange_id) {
                                sendAbortKeyMessage(encryptedChat, null, j14);
                            } else if (BuildVars.LOGS_ENABLED) {
                                FileLog.d("we already have request key with higher exchange_id");
                                return null;
                            }
                        }
                        byte[] bArr14 = new byte[256];
                        Utilities.random.nextBytes(bArr14);
                        BigInteger bigInteger = new BigInteger(1, getMessagesStorage().getSecretPBytes());
                        BigInteger bigIntegerModPow = BigInteger.valueOf(getMessagesStorage().getSecretG()).modPow(new BigInteger(1, bArr14), bigInteger);
                        BigInteger bigInteger2 = new BigInteger(1, tL_decryptedMessageService.action.g_a);
                        if (!Utilities.isGoodGaAndGb(bigInteger2, bigInteger)) {
                            sendAbortKeyMessage(encryptedChat, null, tL_decryptedMessageService.action.exchange_id);
                            return null;
                        }
                        byte[] byteArray = bigIntegerModPow.toByteArray();
                        if (byteArray.length > 256) {
                            byte[] bArr15 = new byte[256];
                            System.arraycopy(byteArray, 1, bArr15, 0, 256);
                            byteArray = bArr15;
                        }
                        byte[] byteArray2 = bigInteger2.modPow(new BigInteger(1, bArr14), bigInteger).toByteArray();
                        if (byteArray2.length <= 256) {
                            if (byteArray2.length < 256) {
                                bArr2 = new byte[256];
                                System.arraycopy(byteArray2, 0, bArr2, 256 - byteArray2.length, byteArray2.length);
                                for (int i20 = 0; i20 < 256 - byteArray2.length; i20++) {
                                    bArr2[i20] = 0;
                                }
                            }
                            byte[] bArrComputeSHA1 = Utilities.computeSHA1(byteArray2);
                            byte[] bArr16 = new byte[8];
                            System.arraycopy(bArrComputeSHA1, bArrComputeSHA1.length - 8, bArr16, 0, 8);
                            encryptedChat.exchange_id = tL_decryptedMessageService.action.exchange_id;
                            encryptedChat.future_auth_key = byteArray2;
                            encryptedChat.future_key_fingerprint = Utilities.bytesToLong(bArr16);
                            encryptedChat.g_a_or_b = byteArray;
                            getMessagesStorage().updateEncryptedChat(encryptedChat);
                            sendAcceptKeyMessage(encryptedChat, null);
                            return null;
                        }
                        bArr2 = new byte[256];
                        System.arraycopy(byteArray2, byteArray2.length - 256, bArr2, 0, 256);
                        byteArray2 = bArr2;
                        byte[] bArrComputeSHA2 = Utilities.computeSHA1(byteArray2);
                        byte[] bArr17 = new byte[8];
                        System.arraycopy(bArrComputeSHA2, bArrComputeSHA2.length - 8, bArr17, 0, 8);
                        encryptedChat.exchange_id = tL_decryptedMessageService.action.exchange_id;
                        encryptedChat.future_auth_key = byteArray2;
                        encryptedChat.future_key_fingerprint = Utilities.bytesToLong(bArr17);
                        encryptedChat.g_a_or_b = byteArray;
                        getMessagesStorage().updateEncryptedChat(encryptedChat);
                        sendAcceptKeyMessage(encryptedChat, null);
                        return null;
                    }
                    if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionAcceptKey) {
                        if (encryptedChat.exchange_id != decryptedMessageAction.exchange_id) {
                            encryptedChat.future_auth_key = new byte[256];
                            encryptedChat.future_key_fingerprint = 0L;
                            encryptedChat.exchange_id = 0L;
                            getMessagesStorage().updateEncryptedChat(encryptedChat);
                            sendAbortKeyMessage(encryptedChat, null, tL_decryptedMessageService.action.exchange_id);
                            return null;
                        }
                        BigInteger bigInteger3 = new BigInteger(1, getMessagesStorage().getSecretPBytes());
                        BigInteger bigInteger4 = new BigInteger(1, tL_decryptedMessageService.action.g_b);
                        if (!Utilities.isGoodGaAndGb(bigInteger4, bigInteger3)) {
                            encryptedChat.future_auth_key = new byte[256];
                            encryptedChat.future_key_fingerprint = 0L;
                            encryptedChat.exchange_id = 0L;
                            getMessagesStorage().updateEncryptedChat(encryptedChat);
                            sendAbortKeyMessage(encryptedChat, null, tL_decryptedMessageService.action.exchange_id);
                            return null;
                        }
                        byte[] byteArray3 = bigInteger4.modPow(new BigInteger(1, encryptedChat.a_or_b), bigInteger3).toByteArray();
                        if (byteArray3.length <= 256) {
                            if (byteArray3.length < 256) {
                                bArr = new byte[256];
                                System.arraycopy(byteArray3, 0, bArr, 256 - byteArray3.length, byteArray3.length);
                                for (int i21 = 0; i21 < 256 - byteArray3.length; i21++) {
                                    bArr[i21] = 0;
                                }
                            }
                            byte[] bArrComputeSHA3 = Utilities.computeSHA1(byteArray3);
                            byte[] bArr18 = new byte[8];
                            System.arraycopy(bArrComputeSHA3, bArrComputeSHA3.length - 8, bArr18, 0, 8);
                            jBytesToLong = Utilities.bytesToLong(bArr18);
                            if (tL_decryptedMessageService.action.key_fingerprint == jBytesToLong) {
                                encryptedChat.future_auth_key = byteArray3;
                                encryptedChat.future_key_fingerprint = jBytesToLong;
                                getMessagesStorage().updateEncryptedChat(encryptedChat);
                                sendCommitKeyMessage(encryptedChat, null);
                                return null;
                            }
                            encryptedChat.future_auth_key = new byte[256];
                            encryptedChat.future_key_fingerprint = 0L;
                            encryptedChat.exchange_id = 0L;
                            getMessagesStorage().updateEncryptedChat(encryptedChat);
                            sendAbortKeyMessage(encryptedChat, null, tL_decryptedMessageService.action.exchange_id);
                            return null;
                        }
                        bArr = new byte[256];
                        System.arraycopy(byteArray3, byteArray3.length - 256, bArr, 0, 256);
                        byteArray3 = bArr;
                        byte[] bArrComputeSHA4 = Utilities.computeSHA1(byteArray3);
                        byte[] bArr19 = new byte[8];
                        System.arraycopy(bArrComputeSHA4, bArrComputeSHA4.length - 8, bArr19, 0, 8);
                        jBytesToLong = Utilities.bytesToLong(bArr19);
                        if (tL_decryptedMessageService.action.key_fingerprint == jBytesToLong) {
                            encryptedChat.future_auth_key = byteArray3;
                            encryptedChat.future_key_fingerprint = jBytesToLong;
                            getMessagesStorage().updateEncryptedChat(encryptedChat);
                            sendCommitKeyMessage(encryptedChat, null);
                            return null;
                        }
                        encryptedChat.future_auth_key = new byte[256];
                        encryptedChat.future_key_fingerprint = 0L;
                        encryptedChat.exchange_id = 0L;
                        getMessagesStorage().updateEncryptedChat(encryptedChat);
                        sendAbortKeyMessage(encryptedChat, null, tL_decryptedMessageService.action.exchange_id);
                        return null;
                    }
                    if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionCommitKey) {
                        if (encryptedChat.exchange_id == decryptedMessageAction.exchange_id) {
                            long j15 = encryptedChat.future_key_fingerprint;
                            if (j15 == decryptedMessageAction.key_fingerprint) {
                                long j16 = encryptedChat.key_fingerprint;
                                byte[] bArr20 = encryptedChat.auth_key;
                                encryptedChat.key_fingerprint = j15;
                                encryptedChat.auth_key = encryptedChat.future_auth_key;
                                encryptedChat.key_create_date = getConnectionsManager().getCurrentTime();
                                encryptedChat.future_auth_key = bArr20;
                                encryptedChat.future_key_fingerprint = j16;
                                encryptedChat.key_use_count_in = (short) 0;
                                encryptedChat.key_use_count_out = (short) 0;
                                encryptedChat.exchange_id = 0L;
                                getMessagesStorage().updateEncryptedChat(encryptedChat);
                                sendNoopMessage(encryptedChat, null);
                                return null;
                            }
                        }
                        encryptedChat.future_auth_key = new byte[256];
                        encryptedChat.future_key_fingerprint = 0L;
                        encryptedChat.exchange_id = 0L;
                        getMessagesStorage().updateEncryptedChat(encryptedChat);
                        sendAbortKeyMessage(encryptedChat, null, tL_decryptedMessageService.action.exchange_id);
                        return null;
                    }
                    if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionAbortKey) {
                        if (encryptedChat.exchange_id == decryptedMessageAction.exchange_id) {
                            encryptedChat.future_auth_key = new byte[256];
                            encryptedChat.future_key_fingerprint = 0L;
                            encryptedChat.exchange_id = 0L;
                            getMessagesStorage().updateEncryptedChat(encryptedChat);
                            return null;
                        }
                    } else if (!(decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionNoop) && (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionResend) && (i11 = decryptedMessageAction.end_seq_no) >= (i12 = encryptedChat.in_seq_no) && i11 >= (i13 = decryptedMessageAction.start_seq_no)) {
                        if (i13 < i12) {
                            decryptedMessageAction.start_seq_no = i12;
                        }
                        resendMessages(decryptedMessageAction.start_seq_no, i11, encryptedChat);
                        return null;
                    }
                } else if (!decryptedMessageAction.random_ids.isEmpty()) {
                    int currentTime = getConnectionsManager().getCurrentTime();
                    getMessagesStorage().createTaskForSecretChat(encryptedChat.f22388id, currentTime, currentTime, 1, tL_decryptedMessageService.action.random_ids);
                    return null;
                }
            } else if (BuildVars.LOGS_ENABLED) {
                FileLog.e("unknown message " + tLObject);
                return null;
            }
        } else if (BuildVars.LOGS_ENABLED) {
            FileLog.e("unknown TLObject");
        }
        return null;
    }

    public void processPendingEncMessages() {
        if (this.pendingEncMessagesToDelete.isEmpty()) {
            return;
        }
        AndroidUtilities.runOnUIThread(new ci(this, new ArrayList(this.pendingEncMessagesToDelete), 1));
        getMessagesStorage().markMessagesAsDeletedByRandoms(new ArrayList<>(this.pendingEncMessagesToDelete));
        this.pendingEncMessagesToDelete.clear();
    }

    public void processUpdateEncryption(TL_update.TL_updateEncryption tL_updateEncryption, ConcurrentHashMap<Long, TLRPC.User> concurrentHashMap) {
        byte[] bArr;
        TLRPC.EncryptedChat encryptedChat = tL_updateEncryption.chat;
        long jMakeEncryptedDialogId = DialogObject.makeEncryptedDialogId(encryptedChat.f22388id);
        TLRPC.EncryptedChat encryptedChatDB = getMessagesController().getEncryptedChatDB(encryptedChat.f22388id, false);
        if ((encryptedChat instanceof TLRPC.TL_encryptedChatRequested) && encryptedChatDB == null) {
            long j10 = encryptedChat.participant_id;
            if (j10 == getUserConfig().getClientUserId()) {
                j10 = encryptedChat.admin_id;
            }
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(j10));
            if (user == null) {
                user = concurrentHashMap.get(Long.valueOf(j10));
            }
            encryptedChat.user_id = j10;
            TLRPC.TL_dialog tL_dialog = new TLRPC.TL_dialog();
            tL_dialog.f22384id = jMakeEncryptedDialogId;
            tL_dialog.folder_id = encryptedChat.folder_id;
            tL_dialog.unread_count = 0;
            tL_dialog.top_message = 0;
            tL_dialog.last_message_date = tL_updateEncryption.date;
            getMessagesController().putEncryptedChat(encryptedChat, false);
            AndroidUtilities.runOnUIThread(new c4(this, tL_dialog, jMakeEncryptedDialogId, 26));
            getMessagesStorage().putEncryptedChat(encryptedChat, user, tL_dialog);
            acceptSecretChat(encryptedChat);
        } else if (!(encryptedChat instanceof TLRPC.TL_encryptedChat)) {
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
            AndroidUtilities.runOnUIThread(new a9(this, encryptedChatDB, encryptedChat, 21));
        } else if ((encryptedChatDB instanceof TLRPC.TL_encryptedChatWaiting) && ((bArr = encryptedChatDB.auth_key) == null || bArr.length == 1)) {
            encryptedChat.a_or_b = encryptedChatDB.a_or_b;
            encryptedChat.user_id = encryptedChatDB.user_id;
            processAcceptedSecretChat(encryptedChat);
        } else if (encryptedChatDB == null && this.startingSecretChat) {
            this.delayedEncryptedChatUpdates.add(tL_updateEncryption);
        }
        if ((encryptedChat instanceof TLRPC.TL_encryptedChatDiscarded) && encryptedChat.history_deleted) {
            AndroidUtilities.runOnUIThread(new yh(this, jMakeEncryptedDialogId, 3));
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

    public void sendAbortKeyMessage(TLRPC.EncryptedChat encryptedChat, TLRPC.Message message, long j10) {
        if (encryptedChat instanceof TLRPC.TL_encryptedChat) {
            TLRPC.TL_decryptedMessageService tL_decryptedMessageService = new TLRPC.TL_decryptedMessageService();
            if (message != null) {
                tL_decryptedMessageService.action = message.action.encryptedAction;
            } else {
                TLRPC.TL_decryptedMessageActionAbortKey tL_decryptedMessageActionAbortKey = new TLRPC.TL_decryptedMessageActionAbortKey();
                tL_decryptedMessageService.action = tL_decryptedMessageActionAbortKey;
                tL_decryptedMessageActionAbortKey.exchange_id = j10;
                message = createServiceSecretMessage(encryptedChat, tL_decryptedMessageActionAbortKey);
            }
            TLRPC.Message message2 = message;
            tL_decryptedMessageService.random_id = message2.random_id;
            performSendEncryptedRequest(tL_decryptedMessageService, message2, encryptedChat, null, null, null);
        }
    }

    public void sendAcceptKeyMessage(TLRPC.EncryptedChat encryptedChat, TLRPC.Message message) {
        if (encryptedChat instanceof TLRPC.TL_encryptedChat) {
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
    }

    public void sendClearHistoryMessage(TLRPC.EncryptedChat encryptedChat, TLRPC.Message message) {
        if (encryptedChat instanceof TLRPC.TL_encryptedChat) {
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
    }

    public void sendCommitKeyMessage(TLRPC.EncryptedChat encryptedChat, TLRPC.Message message) {
        if (encryptedChat instanceof TLRPC.TL_encryptedChat) {
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
    }

    public void sendMessagesDeleteMessage(TLRPC.EncryptedChat encryptedChat, ArrayList<Long> arrayList, TLRPC.Message message) {
        if (encryptedChat instanceof TLRPC.TL_encryptedChat) {
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
    }

    public void sendMessagesReadMessage(TLRPC.EncryptedChat encryptedChat, ArrayList<Long> arrayList, TLRPC.Message message) {
        if (encryptedChat instanceof TLRPC.TL_encryptedChat) {
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
    }

    public void sendNoopMessage(TLRPC.EncryptedChat encryptedChat, TLRPC.Message message) {
        if (encryptedChat instanceof TLRPC.TL_encryptedChat) {
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
    }

    public void sendNotifyLayerMessage(TLRPC.EncryptedChat encryptedChat, TLRPC.Message message) {
        if ((encryptedChat instanceof TLRPC.TL_encryptedChat) && !this.sendingNotifyLayer.contains(Integer.valueOf(encryptedChat.f22388id))) {
            this.sendingNotifyLayer.add(Integer.valueOf(encryptedChat.f22388id));
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
    }

    public void sendRequestKeyMessage(TLRPC.EncryptedChat encryptedChat, TLRPC.Message message) {
        if (encryptedChat instanceof TLRPC.TL_encryptedChat) {
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
    }

    public void sendResendMessage(TLRPC.EncryptedChat encryptedChat, int i10, int i11, TLRPC.Message message) {
        if (encryptedChat instanceof TLRPC.TL_encryptedChat) {
            SparseIntArray sparseIntArray = this.requestedHoles.get(encryptedChat.f22388id);
            if (sparseIntArray == null || sparseIntArray.indexOfKey(i10) < 0) {
                if (sparseIntArray == null) {
                    sparseIntArray = new SparseIntArray();
                    this.requestedHoles.put(encryptedChat.f22388id, sparseIntArray);
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
    }

    public void sendScreenshotMessage(TLRPC.EncryptedChat encryptedChat, ArrayList<Long> arrayList, TLRPC.Message message) {
        if (encryptedChat instanceof TLRPC.TL_encryptedChat) {
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
                getMessagesController().updateInterfaceWithMessages(message.dialog_id, y1.m(messageObject), 0);
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
            }
            TLRPC.Message message2 = message;
            tL_decryptedMessageService.random_id = message2.random_id;
            performSendEncryptedRequest(tL_decryptedMessageService, message2, encryptedChat, null, null, null);
        }
    }

    public void sendTTLMessage(TLRPC.EncryptedChat encryptedChat, TLRPC.Message message) {
        if (encryptedChat instanceof TLRPC.TL_encryptedChat) {
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
                getMessagesController().updateInterfaceWithMessages(message.dialog_id, y1.m(messageObject), 0);
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
            }
            TLRPC.Message message2 = message;
            tL_decryptedMessageService.random_id = message2.random_id;
            performSendEncryptedRequest(tL_decryptedMessageService, message2, encryptedChat, null, null, null);
        }
    }

    public void startSecretChat(Context context, TLRPC.User user) {
        if (user == null || context == null) {
            return;
        }
        if (getMessagesController().isFrozen()) {
            org.telegram.ui.b.b(this.currentAccount);
            return;
        }
        this.startingSecretChat = true;
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(context, 3, null);
        TLRPC.TL_messages_getDhConfig tL_messages_getDhConfig = new TLRPC.TL_messages_getDhConfig();
        tL_messages_getDhConfig.random_length = 256;
        tL_messages_getDhConfig.version = getMessagesStorage().getLastSecretVersion();
        b2Var.setOnCancelListener(new va(this, getConnectionsManager().sendRequest(tL_messages_getDhConfig, new i2(this, context, b2Var, user, 4), 2), 2));
        try {
            b2Var.show();
        } catch (Exception unused) {
        }
    }

    public void declineSecretChat(int i10, boolean z10, long j10) {
        NativeByteBuffer nativeByteBuffer;
        Exception e9;
        if (j10 == 0) {
            try {
                nativeByteBuffer = new NativeByteBuffer(12);
                try {
                    nativeByteBuffer.writeInt32(100);
                    nativeByteBuffer.writeInt32(i10);
                    nativeByteBuffer.writeBool(z10);
                } catch (Exception e10) {
                    e9 = e10;
                    FileLog.e(e9);
                }
            } catch (Exception e11) {
                nativeByteBuffer = null;
                e9 = e11;
            }
            j10 = getMessagesStorage().createPendingTask(nativeByteBuffer);
        }
        TLRPC.TL_messages_discardEncryption tL_messages_discardEncryption = new TLRPC.TL_messages_discardEncryption();
        tL_messages_discardEncryption.chat_id = i10;
        tL_messages_discardEncryption.delete_history = z10;
        getConnectionsManager().sendRequest(tL_messages_discardEncryption, new jh.r5(this, j10, 4));
    }

    public void performSendEncryptedRequest(TLRPC.DecryptedMessage decryptedMessage, TLRPC.Message message, TLRPC.EncryptedChat encryptedChat, TLRPC.InputEncryptedFile inputEncryptedFile, String str, MessageObject messageObject) {
        if (decryptedMessage == null || encryptedChat.auth_key == null || (encryptedChat instanceof TLRPC.TL_encryptedChatRequested) || (encryptedChat instanceof TLRPC.TL_encryptedChatWaiting)) {
            return;
        }
        getSendMessagesHelper().putToSendingMessages(message, false);
        Utilities.stageQueue.postRunnable(new il(this, encryptedChat, decryptedMessage, message, inputEncryptedFile, messageObject, str));
    }
}
