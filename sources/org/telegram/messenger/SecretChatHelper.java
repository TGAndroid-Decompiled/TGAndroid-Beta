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
import java.math.BigInteger;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.InputSerializedData;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.OutputSerializedData;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLClassStore;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.AccountFrozenAlert;
import org.telegram.ui.ActionBar.AlertDialog;

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
        public void readParams(InputSerializedData inputSerializedData, boolean z) {
            inputSerializedData.readInt64(z);
            this.date = inputSerializedData.readInt32(z);
            this.layer = TLRPC.TL_decryptedMessageLayer.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            if (inputSerializedData.readBool(z)) {
                this.file = TLRPC.EncryptedFile.TLdeserialize(inputSerializedData, inputSerializedData.readInt32(z), z);
            }
            this.new_key_used = inputSerializedData.readBool(z);
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

    public static SecretChatHelper getInstance(int i) {
        SecretChatHelper secretChatHelper;
        SecretChatHelper secretChatHelper2 = Instance[i];
        if (secretChatHelper2 != null) {
            return secretChatHelper2;
        }
        synchronized (SecretChatHelper.class) {
            try {
                secretChatHelper = Instance[i];
                if (secretChatHelper == null) {
                    SecretChatHelper[] secretChatHelperArr = Instance;
                    SecretChatHelper secretChatHelper3 = new SecretChatHelper(i);
                    secretChatHelperArr[i] = secretChatHelper3;
                    secretChatHelper = secretChatHelper3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return secretChatHelper;
    }

    public SecretChatHelper(int i) {
        super(i);
        this.sendingNotifyLayer = new ArrayList<>();
        this.secretHolesQueue = new SparseArray<>();
        this.pendingSecretMessages = new SparseArray<>();
        this.requestedHoles = new SparseArray<>();
        this.acceptingChats = new SparseArray<>();
        this.delayedEncryptedChatUpdates = new ArrayList<>();
        this.pendingEncMessagesToDelete = new ArrayList<>();
        this.startingSecretChat = false;
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

    protected void processPendingEncMessages() {
        if (this.pendingEncMessagesToDelete.isEmpty()) {
            return;
        }
        final ArrayList arrayList = new ArrayList(this.pendingEncMessagesToDelete);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                SecretChatHelper.$r8$lambda$f8PAGDyMik82SKz8pP_F10MPJSA(this.f$0, arrayList);
            }
        });
        getMessagesStorage().markMessagesAsDeletedByRandoms(new ArrayList<>(this.pendingEncMessagesToDelete));
        this.pendingEncMessagesToDelete.clear();
    }

    public static void $r8$lambda$f8PAGDyMik82SKz8pP_F10MPJSA(SecretChatHelper secretChatHelper, ArrayList arrayList) {
        secretChatHelper.getClass();
        for (int i = 0; i < arrayList.size(); i++) {
            MessageObject messageObject = (MessageObject) secretChatHelper.getMessagesController().dialogMessagesByRandomIds.get(((Long) arrayList.get(i)).longValue());
            if (messageObject != null) {
                messageObject.deleted = true;
            }
        }
    }

    private TLRPC.TL_messageService createServiceSecretMessage(TLRPC.EncryptedChat encryptedChat, TLRPC.DecryptedMessageAction decryptedMessageAction) {
        TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
        TLRPC.TL_messageEncryptedAction tL_messageEncryptedAction = new TLRPC.TL_messageEncryptedAction();
        tL_messageService.action = tL_messageEncryptedAction;
        tL_messageEncryptedAction.encryptedAction = decryptedMessageAction;
        int newMessageId = getUserConfig().getNewMessageId();
        tL_messageService.id = newMessageId;
        tL_messageService.local_id = newMessageId;
        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
        tL_messageService.from_id = tL_peerUser;
        tL_peerUser.user_id = getUserConfig().getClientUserId();
        tL_messageService.unread = true;
        tL_messageService.out = true;
        tL_messageService.flags = 256;
        tL_messageService.dialog_id = DialogObject.makeEncryptedDialogId(encryptedChat.id);
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

    protected void processUpdateEncryption(TL_update.TL_updateEncryption tL_updateEncryption, ConcurrentHashMap<Long, TLRPC.User> concurrentHashMap) {
        byte[] bArr;
        final TLRPC.EncryptedChat encryptedChat = tL_updateEncryption.chat;
        final long jMakeEncryptedDialogId = DialogObject.makeEncryptedDialogId(encryptedChat.id);
        final TLRPC.EncryptedChat encryptedChatDB = getMessagesController().getEncryptedChatDB(encryptedChat.id, false);
        if ((encryptedChat instanceof TLRPC.TL_encryptedChatRequested) && encryptedChatDB == null) {
            long j = encryptedChat.participant_id;
            if (j == getUserConfig().getClientUserId()) {
                j = encryptedChat.admin_id;
            }
            TLRPC.User user = getMessagesController().getUser(Long.valueOf(j));
            if (user == null) {
                user = concurrentHashMap.get(Long.valueOf(j));
            }
            encryptedChat.user_id = j;
            final TLRPC.TL_dialog tL_dialog = new TLRPC.TL_dialog();
            tL_dialog.id = jMakeEncryptedDialogId;
            tL_dialog.folder_id = encryptedChat.folder_id;
            tL_dialog.unread_count = 0;
            tL_dialog.top_message = 0;
            tL_dialog.last_message_date = tL_updateEncryption.date;
            getMessagesController().putEncryptedChat(encryptedChat, false);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    SecretChatHelper.$r8$lambda$9QTrvQrILXwJMAqflRKkUkWLo3Q(this.f$0, tL_dialog, jMakeEncryptedDialogId);
                }
            });
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
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    SecretChatHelper.m989$r8$lambda$UUrkgN957ZKhCstsmZmtaXf5AI(this.f$0, encryptedChatDB, encryptedChat);
                }
            });
        }
        if ((encryptedChat instanceof TLRPC.TL_encryptedChatDiscarded) && encryptedChat.history_deleted) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.getMessagesController().deleteDialog(jMakeEncryptedDialogId, 0);
                }
            });
        }
    }

    public static void $r8$lambda$9QTrvQrILXwJMAqflRKkUkWLo3Q(SecretChatHelper secretChatHelper, TLRPC.Dialog dialog, long j) {
        secretChatHelper.getClass();
        if (dialog.folder_id == 1) {
            SharedPreferences.Editor editorEdit = MessagesController.getNotificationsSettings(secretChatHelper.currentAccount).edit();
            editorEdit.putBoolean("dialog_bar_archived" + j, true);
            editorEdit.commit();
        }
        secretChatHelper.getMessagesController().dialogs_dict.put(dialog.id, dialog);
        secretChatHelper.getMessagesController().allDialogs.add(dialog);
        secretChatHelper.getMessagesController().sortDialogs(null);
        secretChatHelper.getNotificationCenter().postNotificationName(NotificationCenter.dialogsNeedReload, new Object[0]);
    }

    public static void m989$r8$lambda$UUrkgN957ZKhCstsmZmtaXf5AI(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, TLRPC.EncryptedChat encryptedChat2) {
        if (encryptedChat != null) {
            secretChatHelper.getMessagesController().putEncryptedChat(encryptedChat2, false);
        }
        secretChatHelper.getMessagesStorage().updateEncryptedChat(encryptedChat2);
        secretChatHelper.getNotificationCenter().postNotificationName(NotificationCenter.encryptedChatUpdated, encryptedChat2);
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

    public void sendNotifyLayerMessage(TLRPC.EncryptedChat encryptedChat, TLRPC.Message message) {
        if ((encryptedChat instanceof TLRPC.TL_encryptedChat) && !this.sendingNotifyLayer.contains(Integer.valueOf(encryptedChat.id))) {
            this.sendingNotifyLayer.add(Integer.valueOf(encryptedChat.id));
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

    public void sendAbortKeyMessage(TLRPC.EncryptedChat encryptedChat, TLRPC.Message message, long j) {
        if (encryptedChat instanceof TLRPC.TL_encryptedChat) {
            TLRPC.TL_decryptedMessageService tL_decryptedMessageService = new TLRPC.TL_decryptedMessageService();
            if (message != null) {
                tL_decryptedMessageService.action = message.action.encryptedAction;
            } else {
                TLRPC.TL_decryptedMessageActionAbortKey tL_decryptedMessageActionAbortKey = new TLRPC.TL_decryptedMessageActionAbortKey();
                tL_decryptedMessageService.action = tL_decryptedMessageActionAbortKey;
                tL_decryptedMessageActionAbortKey.exchange_id = j;
                message = createServiceSecretMessage(encryptedChat, tL_decryptedMessageActionAbortKey);
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

    public void sendResendMessage(TLRPC.EncryptedChat encryptedChat, int i, int i2, TLRPC.Message message) {
        if (encryptedChat instanceof TLRPC.TL_encryptedChat) {
            SparseIntArray sparseIntArray = this.requestedHoles.get(encryptedChat.id);
            if (sparseIntArray == null || sparseIntArray.indexOfKey(i) < 0) {
                if (sparseIntArray == null) {
                    sparseIntArray = new SparseIntArray();
                    this.requestedHoles.put(encryptedChat.id, sparseIntArray);
                }
                sparseIntArray.put(i, i2);
                TLRPC.TL_decryptedMessageService tL_decryptedMessageService = new TLRPC.TL_decryptedMessageService();
                if (message != null) {
                    tL_decryptedMessageService.action = message.action.encryptedAction;
                } else {
                    TLRPC.TL_decryptedMessageActionResend tL_decryptedMessageActionResend = new TLRPC.TL_decryptedMessageActionResend();
                    tL_decryptedMessageService.action = tL_decryptedMessageActionResend;
                    tL_decryptedMessageActionResend.start_seq_no = i;
                    tL_decryptedMessageActionResend.end_seq_no = i2;
                    message = createServiceSecretMessage(encryptedChat, tL_decryptedMessageActionResend);
                }
                TLRPC.Message message2 = message;
                tL_decryptedMessageService.random_id = message2.random_id;
                performSendEncryptedRequest(tL_decryptedMessageService, message2, encryptedChat, null, null, null);
            }
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
                ArrayList<MessageObject> arrayList = new ArrayList<>();
                arrayList.add(messageObject);
                getMessagesController().updateInterfaceWithMessages(message.dialog_id, arrayList, 0);
                getNotificationCenter().postNotificationName(NotificationCenter.dialogsNeedReload, new Object[0]);
            }
            TLRPC.Message message2 = message;
            tL_decryptedMessageService.random_id = message2.random_id;
            performSendEncryptedRequest(tL_decryptedMessageService, message2, encryptedChat, null, null, null);
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
                ArrayList<MessageObject> arrayList2 = new ArrayList<>();
                arrayList2.add(messageObject);
                getMessagesController().updateInterfaceWithMessages(message.dialog_id, arrayList2, 0);
                getNotificationCenter().postNotificationName(NotificationCenter.dialogsNeedReload, new Object[0]);
            }
            TLRPC.Message message2 = message;
            tL_decryptedMessageService.random_id = message2.random_id;
            performSendEncryptedRequest(tL_decryptedMessageService, message2, encryptedChat, null, null, null);
        }
    }

    private void updateMediaPaths(MessageObject messageObject, TLRPC.EncryptedFile encryptedFile, TLRPC.DecryptedMessage decryptedMessage, String str) {
        TLRPC.Document document;
        TLRPC.Photo photo;
        TLRPC.Message message = messageObject.messageOwner;
        if (encryptedFile != null) {
            TLRPC.MessageMedia messageMedia = message.media;
            if ((messageMedia instanceof TLRPC.TL_messageMediaPhoto) && (photo = messageMedia.photo) != null) {
                ArrayList<TLRPC.PhotoSize> arrayList = photo.sizes;
                TLRPC.PhotoSize photoSize = arrayList.get(arrayList.size() - 1);
                String str2 = photoSize.location.volume_id + "_" + photoSize.location.local_id;
                TLRPC.TL_fileEncryptedLocation tL_fileEncryptedLocation = new TLRPC.TL_fileEncryptedLocation();
                photoSize.location = tL_fileEncryptedLocation;
                TLRPC.DecryptedMessageMedia decryptedMessageMedia = decryptedMessage.media;
                tL_fileEncryptedLocation.key = decryptedMessageMedia.key;
                tL_fileEncryptedLocation.iv = decryptedMessageMedia.iv;
                tL_fileEncryptedLocation.dc_id = encryptedFile.dc_id;
                tL_fileEncryptedLocation.volume_id = encryptedFile.id;
                tL_fileEncryptedLocation.secret = encryptedFile.access_hash;
                tL_fileEncryptedLocation.local_id = encryptedFile.key_fingerprint;
                String str3 = photoSize.location.volume_id + "_" + photoSize.location.local_id;
                new File(FileLoader.getDirectory(4), str2 + ".jpg").renameTo(getFileLoader().getPathToAttach(photoSize));
                ImageLoader.getInstance().replaceImageInCache(str2, str3, ImageLocation.getForPhoto(photoSize, message.media.photo), true);
                ArrayList<TLRPC.Message> arrayList2 = new ArrayList<>();
                arrayList2.add(message);
                getMessagesStorage().putMessages(arrayList2, false, true, false, 0, false, 0, 0L);
                return;
            }
            if (!(messageMedia instanceof TLRPC.TL_messageMediaDocument) || (document = messageMedia.document) == null) {
                return;
            }
            messageMedia.document = new TLRPC.TL_documentEncrypted();
            TLRPC.Document document2 = message.media.document;
            document2.id = encryptedFile.id;
            document2.access_hash = encryptedFile.access_hash;
            document2.date = document.date;
            document2.attributes = document.attributes;
            document2.mime_type = document.mime_type;
            document2.size = encryptedFile.size;
            TLRPC.DecryptedMessageMedia decryptedMessageMedia2 = decryptedMessage.media;
            document2.key = decryptedMessageMedia2.key;
            document2.iv = decryptedMessageMedia2.iv;
            ArrayList<TLRPC.PhotoSize> arrayList3 = document.thumbs;
            document2.thumbs = arrayList3;
            document2.dc_id = encryptedFile.dc_id;
            if (arrayList3.isEmpty()) {
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
            ArrayList<TLRPC.Message> arrayList4 = new ArrayList<>();
            arrayList4.add(message);
            getMessagesStorage().putMessages(arrayList4, false, true, false, 0, 0, 0L);
        }
    }

    public static boolean isSecretVisibleMessage(TLRPC.Message message) {
        TLRPC.MessageAction messageAction = message.action;
        if (!(messageAction instanceof TLRPC.TL_messageEncryptedAction)) {
            return false;
        }
        TLRPC.DecryptedMessageAction decryptedMessageAction = messageAction.encryptedAction;
        return (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionScreenshotMessages) || (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionSetMessageTTL);
    }

    public static boolean isSecretInvisibleMessage(TLRPC.Message message) {
        TLRPC.MessageAction messageAction = message.action;
        if (!(messageAction instanceof TLRPC.TL_messageEncryptedAction)) {
            return false;
        }
        TLRPC.DecryptedMessageAction decryptedMessageAction = messageAction.encryptedAction;
        return ((decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionScreenshotMessages) || (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionSetMessageTTL)) ? false : true;
    }

    protected void performSendEncryptedRequest(TLRPC.TL_messages_sendEncryptedMultiMedia tL_messages_sendEncryptedMultiMedia, SendMessagesHelper.DelayedMessage delayedMessage) {
        for (int i = 0; i < tL_messages_sendEncryptedMultiMedia.files.size(); i++) {
            performSendEncryptedRequest(tL_messages_sendEncryptedMultiMedia.messages.get(i), delayedMessage.messages.get(i), delayedMessage.encryptedChat, tL_messages_sendEncryptedMultiMedia.files.get(i), delayedMessage.originalPaths.get(i), delayedMessage.messageObjects.get(i));
        }
    }

    protected void performSendEncryptedRequest(final TLRPC.DecryptedMessage decryptedMessage, final TLRPC.Message message, final TLRPC.EncryptedChat encryptedChat, final TLRPC.InputEncryptedFile inputEncryptedFile, final String str, final MessageObject messageObject) {
        if (decryptedMessage == null || encryptedChat.auth_key == null || (encryptedChat instanceof TLRPC.TL_encryptedChatRequested) || (encryptedChat instanceof TLRPC.TL_encryptedChatWaiting)) {
            return;
        }
        getSendMessagesHelper().putToSendingMessages(message, false);
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                SecretChatHelper.m999$r8$lambda$xzI2pYgaGGaRYGh292JRdTMwkU(this.f$0, encryptedChat, decryptedMessage, message, inputEncryptedFile, messageObject, str);
            }
        });
    }

    public static void m999$r8$lambda$xzI2pYgaGGaRYGh292JRdTMwkU(final SecretChatHelper secretChatHelper, final TLRPC.EncryptedChat encryptedChat, final TLRPC.DecryptedMessage decryptedMessage, final TLRPC.Message message, TLRPC.InputEncryptedFile inputEncryptedFile, final MessageObject messageObject, final String str) {
        TLObject tLObject;
        TLObject tLObject2;
        secretChatHelper.getClass();
        try {
            TLRPC.TL_decryptedMessageLayer tL_decryptedMessageLayer = new TLRPC.TL_decryptedMessageLayer();
            tL_decryptedMessageLayer.layer = Math.min(Math.max(46, AndroidUtilities.getMyLayerVersion(encryptedChat.layer)), Math.max(46, AndroidUtilities.getPeerLayerVersion(encryptedChat.layer)));
            tL_decryptedMessageLayer.message = decryptedMessage;
            byte[] bArr = new byte[15];
            tL_decryptedMessageLayer.random_bytes = bArr;
            Utilities.random.nextBytes(bArr);
            boolean z = true;
            if (encryptedChat.seq_in == 0 && encryptedChat.seq_out == 0) {
                if (encryptedChat.admin_id == secretChatHelper.getUserConfig().getClientUserId()) {
                    encryptedChat.seq_out = 1;
                    encryptedChat.seq_in = -2;
                } else {
                    encryptedChat.seq_in = -1;
                }
            }
            int i = message.seq_in;
            if (i == 0 && message.seq_out == 0) {
                int i2 = encryptedChat.seq_in;
                if (i2 <= 0) {
                    i2 += 2;
                }
                tL_decryptedMessageLayer.in_seq_no = i2;
                int i3 = encryptedChat.seq_out;
                tL_decryptedMessageLayer.out_seq_no = i3;
                encryptedChat.seq_out = i3 + 2;
                if (encryptedChat.key_create_date == 0) {
                    encryptedChat.key_create_date = secretChatHelper.getConnectionsManager().getCurrentTime();
                }
                short s = (short) (encryptedChat.key_use_count_out + 1);
                encryptedChat.key_use_count_out = s;
                if ((s >= 100 || encryptedChat.key_create_date < secretChatHelper.getConnectionsManager().getCurrentTime() - 604800) && encryptedChat.exchange_id == 0 && encryptedChat.future_key_fingerprint == 0) {
                    secretChatHelper.requestNewSecretChatKey(encryptedChat);
                }
                secretChatHelper.getMessagesStorage().updateEncryptedChatSeq(encryptedChat, false);
                message.seq_in = tL_decryptedMessageLayer.in_seq_no;
                message.seq_out = tL_decryptedMessageLayer.out_seq_no;
                secretChatHelper.getMessagesStorage().setMessageSeq(message.id, message.seq_in, message.seq_out);
            } else {
                tL_decryptedMessageLayer.in_seq_no = i;
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
            int iNextInt = (length % 16 != 0 ? 16 - (length % 16) : 0) + ((Utilities.random.nextInt(3) + 2) * 16);
            NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(length + iNextInt);
            nativeByteBuffer.position(0);
            nativeByteBuffer2.writeBytes(nativeByteBuffer);
            if (iNextInt != 0) {
                byte[] bArr2 = new byte[iNextInt];
                Utilities.random.nextBytes(bArr2);
                nativeByteBuffer2.writeBytes(bArr2);
            }
            byte[] bArr3 = new byte[16];
            if (encryptedChat.admin_id == secretChatHelper.getUserConfig().getClientUserId()) {
                z = false;
            }
            byte[] bArr4 = encryptedChat.auth_key;
            int i4 = z ? 8 : 0;
            ByteBuffer byteBuffer = nativeByteBuffer2.buffer;
            System.arraycopy(Utilities.computeSHA256(bArr4, i4 + 88, 32, byteBuffer, 0, byteBuffer.limit()), 8, bArr3, 0, 16);
            nativeByteBuffer.reuse();
            MessageKeyData messageKeyDataGenerateMessageKeyData = MessageKeyData.generateMessageKeyData(encryptedChat.auth_key, bArr3, z, 2);
            Utilities.aesIgeEncryption(nativeByteBuffer2.buffer, messageKeyDataGenerateMessageKeyData.aesKey, messageKeyDataGenerateMessageKeyData.aesIv, true, false, 0, nativeByteBuffer2.limit());
            NativeByteBuffer nativeByteBuffer3 = new NativeByteBuffer(nativeByteBuffer2.length() + 24);
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
                    tL_inputEncryptedChat.chat_id = encryptedChat.id;
                    tL_inputEncryptedChat.access_hash = encryptedChat.access_hash;
                    tLObject2 = tL_messages_sendEncryptedService;
                } else {
                    TLRPC.TL_messages_sendEncrypted tL_messages_sendEncrypted = new TLRPC.TL_messages_sendEncrypted();
                    tL_messages_sendEncrypted.silent = message.silent;
                    tL_messages_sendEncrypted.data = nativeByteBuffer3;
                    tL_messages_sendEncrypted.random_id = decryptedMessage.random_id;
                    TLRPC.TL_inputEncryptedChat tL_inputEncryptedChat2 = new TLRPC.TL_inputEncryptedChat();
                    tL_messages_sendEncrypted.peer = tL_inputEncryptedChat2;
                    tL_inputEncryptedChat2.chat_id = encryptedChat.id;
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
                tL_inputEncryptedChat3.chat_id = encryptedChat.id;
                tL_inputEncryptedChat3.access_hash = encryptedChat.access_hash;
                tL_messages_sendEncryptedFile.file = inputEncryptedFile;
                tLObject = tL_messages_sendEncryptedFile;
            }
            secretChatHelper.getConnectionsManager().sendRequest(tLObject, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject3, TLRPC.TL_error tL_error) {
                    SecretChatHelper.$r8$lambda$awNguNUnHpewKP22FKVyziRV1mk(this.f$0, decryptedMessage, encryptedChat, message, messageObject, str, tLObject3, tL_error);
                }
            }, 64);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static void $r8$lambda$awNguNUnHpewKP22FKVyziRV1mk(final SecretChatHelper secretChatHelper, TLRPC.DecryptedMessage decryptedMessage, TLRPC.EncryptedChat encryptedChat, final TLRPC.Message message, MessageObject messageObject, String str, TLObject tLObject, TLRPC.TL_error tL_error) {
        secretChatHelper.getClass();
        final int mediaExistanceFlags = 0;
        if (tL_error == null && (decryptedMessage.action instanceof TLRPC.TL_decryptedMessageActionNotifyLayer)) {
            TLRPC.EncryptedChat encryptedChat2 = secretChatHelper.getMessagesController().getEncryptedChat(Integer.valueOf(encryptedChat.id));
            if (encryptedChat2 == null) {
                encryptedChat2 = encryptedChat;
            }
            if (encryptedChat2.key_hash == null) {
                encryptedChat2.key_hash = AndroidUtilities.calcAuthKeyHash(encryptedChat2.auth_key);
            }
            if (encryptedChat2.key_hash.length == 16) {
                try {
                    byte[] bArr = encryptedChat.auth_key;
                    byte[] bArrComputeSHA256 = Utilities.computeSHA256(bArr, 0, bArr.length);
                    byte[] bArr2 = new byte[36];
                    System.arraycopy(encryptedChat.key_hash, 0, bArr2, 0, 16);
                    System.arraycopy(bArrComputeSHA256, 0, bArr2, 16, 20);
                    encryptedChat2.key_hash = bArr2;
                    secretChatHelper.getMessagesStorage().updateEncryptedChat(encryptedChat2);
                } catch (Throwable th) {
                    FileLog.e(th);
                }
            }
            secretChatHelper.sendingNotifyLayer.remove(Integer.valueOf(encryptedChat2.id));
            encryptedChat2.layer = AndroidUtilities.setMyLayerVersion(encryptedChat2.layer, CURRENT_SECRET_CHAT_LAYER);
            secretChatHelper.getMessagesStorage().updateEncryptedChatLayer(encryptedChat2);
        }
        if (tL_error == null) {
            String str2 = message.attachPath;
            final TLRPC.messages_SentEncryptedMessage messages_sentencryptedmessage = (TLRPC.messages_SentEncryptedMessage) tLObject;
            if (isSecretVisibleMessage(message)) {
                message.date = messages_sentencryptedmessage.date;
            }
            if (messageObject != null) {
                TLRPC.EncryptedFile encryptedFile = messages_sentencryptedmessage.file;
                if (encryptedFile instanceof TLRPC.TL_encryptedFile) {
                    secretChatHelper.updateMediaPaths(messageObject, encryptedFile, decryptedMessage, str);
                    mediaExistanceFlags = messageObject.getMediaExistanceFlags();
                }
            }
            secretChatHelper.getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
                @Override
                public final void run() {
                    SecretChatHelper.$r8$lambda$8yQropBgvnvZ2JTN0r70n0JxPc8(this.f$0, message, messages_sentencryptedmessage, mediaExistanceFlags);
                }
            });
            return;
        }
        secretChatHelper.getMessagesStorage().markMessageAsSendError(message, 0);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                SecretChatHelper.$r8$lambda$lvMbHtekfrUMl6zf3r2Ct2AuZqE(this.f$0, message);
            }
        });
    }

    public static void $r8$lambda$8yQropBgvnvZ2JTN0r70n0JxPc8(final SecretChatHelper secretChatHelper, final TLRPC.Message message, TLRPC.messages_SentEncryptedMessage messages_sentencryptedmessage, final int i) {
        secretChatHelper.getClass();
        if (isSecretInvisibleMessage(message)) {
            messages_sentencryptedmessage.date = 0;
        }
        secretChatHelper.getMessagesStorage().updateMessageStateAndId(message.random_id, 0L, Integer.valueOf(message.id), message.id, messages_sentencryptedmessage.date, false, 0, 0);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                SecretChatHelper.$r8$lambda$xrKXTvgXsq45RfJhl95DJ_3i68U(this.f$0, message, i);
            }
        });
    }

    public static void $r8$lambda$xrKXTvgXsq45RfJhl95DJ_3i68U(SecretChatHelper secretChatHelper, TLRPC.Message message, int i) {
        secretChatHelper.getClass();
        message.send_state = 0;
        NotificationCenter notificationCenter = secretChatHelper.getNotificationCenter();
        int i2 = NotificationCenter.messageReceivedByServer;
        Integer numValueOf = Integer.valueOf(message.id);
        Integer numValueOf2 = Integer.valueOf(message.id);
        Long lValueOf = Long.valueOf(message.dialog_id);
        Integer numValueOf3 = Integer.valueOf(i);
        Boolean bool = Boolean.FALSE;
        notificationCenter.postNotificationName(i2, numValueOf, numValueOf2, message, lValueOf, 0L, numValueOf3, bool);
        secretChatHelper.getNotificationCenter().postNotificationName(NotificationCenter.messageReceivedByServer2, Integer.valueOf(message.id), Integer.valueOf(message.id), message, Long.valueOf(message.dialog_id), 0L, Integer.valueOf(i), bool);
        secretChatHelper.getSendMessagesHelper().processSentMessage(message.id);
        secretChatHelper.getSendMessagesHelper().removeFromSendingMessages(message.id, false);
    }

    public static void $r8$lambda$lvMbHtekfrUMl6zf3r2Ct2AuZqE(SecretChatHelper secretChatHelper, TLRPC.Message message) {
        secretChatHelper.getClass();
        message.send_state = 2;
        secretChatHelper.getNotificationCenter().postNotificationName(NotificationCenter.messageSendError, Integer.valueOf(message.id));
        secretChatHelper.getSendMessagesHelper().processSentMessage(message.id);
        secretChatHelper.getSendMessagesHelper().removeFromSendingMessages(message.id, false);
    }

    private void applyPeerLayer(final TLRPC.EncryptedChat encryptedChat, int i) {
        int peerLayerVersion = AndroidUtilities.getPeerLayerVersion(encryptedChat.layer);
        if (i <= peerLayerVersion) {
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
        encryptedChat.layer = AndroidUtilities.setPeerLayerVersion(encryptedChat.layer, i);
        getMessagesStorage().updateEncryptedChatLayer(encryptedChat);
        if (peerLayerVersion < CURRENT_SECRET_CHAT_LAYER) {
            sendNotifyLayerMessage(encryptedChat, null);
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.getNotificationCenter().postNotificationName(NotificationCenter.encryptedChatUpdated, encryptedChat);
            }
        });
    }

    public TLRPC.Message processDecryptedObject(TLRPC.EncryptedChat encryptedChat, TLRPC.EncryptedFile encryptedFile, int i, TLObject tLObject, boolean z) {
        int i2;
        int i3;
        int i4;
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
            long j = encryptedChat.admin_id;
            if (j == getUserConfig().getClientUserId()) {
                j = encryptedChat.participant_id;
            }
            if (encryptedChat.exchange_id == 0 && encryptedChat.future_key_fingerprint == 0 && encryptedChat.key_use_count_in >= 120) {
                requestNewSecretChatKey(encryptedChat);
            }
            long j2 = encryptedChat.exchange_id;
            if (j2 == 0 && encryptedChat.future_key_fingerprint != 0 && !z) {
                encryptedChat.future_auth_key = new byte[256];
                encryptedChat.future_key_fingerprint = 0L;
                getMessagesStorage().updateEncryptedChat(encryptedChat);
            } else if (j2 != 0 && z) {
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
                tL_message_secret.date = i;
                int newMessageId = getUserConfig().getNewMessageId();
                tL_message_secret.id = newMessageId;
                tL_message_secret.local_id = newMessageId;
                tL_message_secret.silent = tL_decryptedMessage.silent;
                getUserConfig().saveConfig(false);
                TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
                tL_message_secret.from_id = tL_peerUser;
                tL_peerUser.user_id = j;
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
                long j3 = tL_decryptedMessage.grouped_id;
                if (j3 != 0) {
                    tL_message_secret.grouped_id = j3;
                    tL_message_secret.flags |= 131072;
                }
                tL_message_secret.dialog_id = DialogObject.makeEncryptedDialogId(encryptedChat.id);
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
                    if (bArr7 == null || bArr7.length != 32 || (bArr6 = decryptedMessageMedia.iv) == null || bArr6.length != 32) {
                        return null;
                    }
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
                        tL_photoCachedSize.w = decryptedMessageMedia5.thumb_w;
                        tL_photoCachedSize.h = decryptedMessageMedia5.thumb_h;
                        tL_photoCachedSize.bytes = bArr8;
                        tL_photoCachedSize.type = "s";
                        tL_photoCachedSize.location = new TLRPC.TL_fileLocationUnavailable();
                        tL_message_secret.media.photo.sizes.add(tL_photoCachedSize);
                    }
                    int i5 = tL_message_secret.ttl;
                    if (i5 != 0) {
                        TLRPC.MessageMedia messageMedia = tL_message_secret.media;
                        messageMedia.ttl_seconds = i5;
                        messageMedia.flags |= 4;
                    }
                    TLRPC.TL_photoSize_layer127 tL_photoSize_layer127 = new TLRPC.TL_photoSize_layer127();
                    TLRPC.DecryptedMessageMedia decryptedMessageMedia6 = tL_decryptedMessage.media;
                    tL_photoSize_layer127.w = decryptedMessageMedia6.w;
                    tL_photoSize_layer127.h = decryptedMessageMedia6.h;
                    tL_photoSize_layer127.type = "x";
                    tL_photoSize_layer127.size = (int) encryptedFile.size;
                    TLRPC.TL_fileEncryptedLocation tL_fileEncryptedLocation = new TLRPC.TL_fileEncryptedLocation();
                    tL_photoSize_layer127.location = tL_fileEncryptedLocation;
                    TLRPC.DecryptedMessageMedia decryptedMessageMedia7 = tL_decryptedMessage.media;
                    tL_fileEncryptedLocation.key = decryptedMessageMedia7.key;
                    tL_fileEncryptedLocation.iv = decryptedMessageMedia7.iv;
                    tL_fileEncryptedLocation.dc_id = encryptedFile.dc_id;
                    tL_fileEncryptedLocation.volume_id = encryptedFile.id;
                    tL_fileEncryptedLocation.secret = encryptedFile.access_hash;
                    tL_fileEncryptedLocation.local_id = encryptedFile.key_fingerprint;
                    tL_message_secret.media.photo.sizes.add(tL_photoSize_layer127);
                } else if (decryptedMessageMedia instanceof TLRPC.TL_decryptedMessageMediaVideo) {
                    byte[] bArr9 = decryptedMessageMedia.key;
                    if (bArr9 == null || bArr9.length != 32 || (bArr5 = decryptedMessageMedia.iv) == null || bArr5.length != 32) {
                        return null;
                    }
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
                    document2.date = i;
                    document2.size = encryptedFile.size;
                    document2.id = encryptedFile.id;
                    document2.access_hash = encryptedFile.access_hash;
                    TLRPC.DecryptedMessageMedia decryptedMessageMedia9 = tL_decryptedMessage.media;
                    String str4 = decryptedMessageMedia9.mime_type;
                    document2.mime_type = str4;
                    if (str4 == null) {
                        document2.mime_type = "video/mp4";
                    }
                    byte[] bArr10 = ((TLRPC.TL_decryptedMessageMediaVideo) decryptedMessageMedia9).thumb;
                    if (bArr10 != null && bArr10.length != 0 && bArr10.length <= 6000 && decryptedMessageMedia9.thumb_w <= 100 && decryptedMessageMedia9.thumb_h <= 100) {
                        tL_photoSizeEmpty2 = new TLRPC.TL_photoCachedSize();
                        tL_photoSizeEmpty2.bytes = bArr10;
                        TLRPC.DecryptedMessageMedia decryptedMessageMedia10 = tL_decryptedMessage.media;
                        tL_photoSizeEmpty2.w = decryptedMessageMedia10.thumb_w;
                        tL_photoSizeEmpty2.h = decryptedMessageMedia10.thumb_h;
                        tL_photoSizeEmpty2.type = "s";
                        tL_photoSizeEmpty2.location = new TLRPC.TL_fileLocationUnavailable();
                    } else {
                        tL_photoSizeEmpty2 = new TLRPC.TL_photoSizeEmpty();
                        tL_photoSizeEmpty2.type = "s";
                    }
                    tL_message_secret.media.document.thumbs.add(tL_photoSizeEmpty2);
                    tL_message_secret.media.document.flags |= 1;
                    TLRPC.TL_documentAttributeVideo_layer159 tL_documentAttributeVideo_layer159 = new TLRPC.TL_documentAttributeVideo_layer159();
                    TLRPC.DecryptedMessageMedia decryptedMessageMedia11 = tL_decryptedMessage.media;
                    tL_documentAttributeVideo_layer159.w = decryptedMessageMedia11.w;
                    tL_documentAttributeVideo_layer159.h = decryptedMessageMedia11.h;
                    tL_documentAttributeVideo_layer159.duration = decryptedMessageMedia11.duration;
                    tL_documentAttributeVideo_layer159.supports_streaming = false;
                    tL_message_secret.media.document.attributes.add(tL_documentAttributeVideo_layer159);
                    int i6 = tL_message_secret.ttl;
                    if (i6 != 0) {
                        TLRPC.MessageMedia messageMedia2 = tL_message_secret.media;
                        messageMedia2.ttl_seconds = i6;
                        messageMedia2.flags |= 4;
                    }
                    if (i6 != 0) {
                        tL_message_secret.ttl = Math.max(tL_decryptedMessage.media.duration + 1, i6);
                    }
                } else if (decryptedMessageMedia instanceof TLRPC.TL_decryptedMessageMediaDocument) {
                    byte[] bArr11 = decryptedMessageMedia.key;
                    if (bArr11 == null || bArr11.length != 32 || (bArr4 = decryptedMessageMedia.iv) == null || bArr4.length != 32) {
                        return null;
                    }
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
                    document3.id = encryptedFile.id;
                    document3.access_hash = encryptedFile.access_hash;
                    document3.date = i;
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
                        for (int i7 = 0; i7 < size; i7++) {
                            TLRPC.DocumentAttribute documentAttribute = tL_message_secret.media.document.attributes.get(i7);
                            if ((documentAttribute instanceof TLRPC.TL_documentAttributeAudio) || (documentAttribute instanceof TLRPC.TL_documentAttributeVideo)) {
                                tL_message_secret.ttl = (int) Math.max(documentAttribute.duration + 1.0d, tL_message_secret.ttl);
                                break;
                            }
                        }
                        tL_message_secret.ttl = Math.max(tL_decryptedMessage.media.duration + 1, tL_message_secret.ttl);
                    }
                    TLRPC.Document document4 = tL_message_secret.media.document;
                    long j4 = tL_decryptedMessage.media.size;
                    document4.size = j4 != 0 ? Math.min(j4, encryptedFile.size) : encryptedFile.size;
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
                    if (bArr12 != null && bArr12.length != 0 && bArr12.length <= 20000) {
                        tL_photoSizeEmpty = new TLRPC.TL_photoCachedSize();
                        tL_photoSizeEmpty.bytes = bArr12;
                        TLRPC.DecryptedMessageMedia decryptedMessageMedia14 = tL_decryptedMessage.media;
                        tL_photoSizeEmpty.w = decryptedMessageMedia14.thumb_w;
                        tL_photoSizeEmpty.h = decryptedMessageMedia14.thumb_h;
                        tL_photoSizeEmpty.type = "s";
                        tL_photoSizeEmpty.location = new TLRPC.TL_fileLocationUnavailable();
                    } else {
                        tL_photoSizeEmpty = new TLRPC.TL_photoSizeEmpty();
                        tL_photoSizeEmpty.type = "s";
                    }
                    tL_message_secret.media.document.thumbs.add(tL_photoSizeEmpty);
                    TLRPC.Document document6 = tL_message_secret.media.document;
                    document6.flags |= 1;
                    document6.dc_id = encryptedFile.dc_id;
                    if (MessageObject.isVoiceMessage(tL_message_secret) || MessageObject.isRoundVideoMessage(tL_message_secret)) {
                        tL_message_secret.media_unread = true;
                    }
                } else if (decryptedMessageMedia instanceof TLRPC.TL_decryptedMessageMediaExternalDocument) {
                    TLRPC.TL_messageMediaDocument tL_messageMediaDocument3 = new TLRPC.TL_messageMediaDocument();
                    tL_message_secret.media = tL_messageMediaDocument3;
                    tL_messageMediaDocument3.flags |= 3;
                    tL_message_secret.message = "";
                    tL_messageMediaDocument3.document = new TLRPC.TL_document();
                    TLRPC.Document document7 = tL_message_secret.media.document;
                    TLRPC.DecryptedMessageMedia decryptedMessageMedia15 = tL_decryptedMessage.media;
                    document7.id = decryptedMessageMedia15.id;
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
                    if (bArr13 == null || bArr13.length != 32 || (bArr3 = decryptedMessageMedia.iv) == null || bArr3.length != 32) {
                        return null;
                    }
                    TLRPC.TL_messageMediaDocument tL_messageMediaDocument4 = new TLRPC.TL_messageMediaDocument();
                    tL_message_secret.media = tL_messageMediaDocument4;
                    tL_messageMediaDocument4.flags |= 3;
                    tL_messageMediaDocument4.document = new TLRPC.TL_documentEncrypted();
                    TLRPC.Document document9 = tL_message_secret.media.document;
                    TLRPC.DecryptedMessageMedia decryptedMessageMedia16 = tL_decryptedMessage.media;
                    document9.key = decryptedMessageMedia16.key;
                    document9.iv = decryptedMessageMedia16.iv;
                    document9.id = encryptedFile.id;
                    document9.access_hash = encryptedFile.access_hash;
                    document9.date = i;
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
                    int i8 = tL_message_secret.ttl;
                    if (i8 != 0) {
                        tL_message_secret.ttl = Math.max(tL_decryptedMessage.media.duration + 1, i8);
                    }
                    if (tL_message_secret.media.document.thumbs.isEmpty()) {
                        TLRPC.TL_photoSizeEmpty tL_photoSizeEmpty3 = new TLRPC.TL_photoSizeEmpty();
                        tL_photoSizeEmpty3.type = "s";
                        tL_message_secret.media.document.thumbs.add(tL_photoSizeEmpty3);
                    }
                } else {
                    if (!(decryptedMessageMedia instanceof TLRPC.TL_decryptedMessageMediaVenue)) {
                        return null;
                    }
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
                int i9 = tL_message_secret.ttl;
                if (i9 != 0) {
                    TLRPC.MessageMedia messageMedia4 = tL_message_secret.media;
                    if (messageMedia4.ttl_seconds == 0) {
                        messageMedia4.ttl_seconds = i9;
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
                        int i10 = decryptedMessageAction2.ttl_seconds;
                        if (i10 < 0 || i10 > 31536000) {
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
                    tL_messageService.id = newMessageId2;
                    tL_messageService.local_id = newMessageId2;
                    getUserConfig().saveConfig(false);
                    tL_messageService.unread = true;
                    tL_messageService.flags = 256;
                    tL_messageService.date = i;
                    TLRPC.TL_peerUser tL_peerUser3 = new TLRPC.TL_peerUser();
                    tL_messageService.from_id = tL_peerUser3;
                    tL_peerUser3.user_id = j;
                    TLRPC.TL_peerUser tL_peerUser4 = new TLRPC.TL_peerUser();
                    tL_messageService.peer_id = tL_peerUser4;
                    tL_peerUser4.user_id = getUserConfig().getClientUserId();
                    tL_messageService.dialog_id = DialogObject.makeEncryptedDialogId(encryptedChat.id);
                    return tL_messageService;
                }
                if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionFlushHistory) {
                    final long jMakeEncryptedDialogId = DialogObject.makeEncryptedDialogId(encryptedChat.id);
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            SecretChatHelper.$r8$lambda$gI5t9jLTGuUjiijCNDLQ7yz74s8(this.f$0, jMakeEncryptedDialogId);
                        }
                    });
                    return null;
                }
                if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionDeleteMessages) {
                    if (!decryptedMessageAction.random_ids.isEmpty()) {
                        this.pendingEncMessagesToDelete.addAll(tL_decryptedMessageService.action.random_ids);
                    }
                    return null;
                }
                if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionReadMessages) {
                    if (!decryptedMessageAction.random_ids.isEmpty()) {
                        int currentTime = getConnectionsManager().getCurrentTime();
                        getMessagesStorage().createTaskForSecretChat(encryptedChat.id, currentTime, currentTime, 1, tL_decryptedMessageService.action.random_ids);
                    }
                } else if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionNotifyLayer) {
                    applyPeerLayer(encryptedChat, decryptedMessageAction.layer);
                } else if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionRequestKey) {
                    long j5 = encryptedChat.exchange_id;
                    if (j5 != 0) {
                        if (j5 > decryptedMessageAction.exchange_id) {
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.d("we already have request key with higher exchange_id");
                            }
                            return null;
                        }
                        sendAbortKeyMessage(encryptedChat, null, j5);
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
                    if (byteArray2.length > 256) {
                        bArr2 = new byte[256];
                        System.arraycopy(byteArray2, byteArray2.length - 256, bArr2, 0, 256);
                    } else {
                        if (byteArray2.length < 256) {
                            bArr2 = new byte[256];
                            System.arraycopy(byteArray2, 0, bArr2, 256 - byteArray2.length, byteArray2.length);
                            for (int i11 = 0; i11 < 256 - byteArray2.length; i11++) {
                                bArr2[i11] = 0;
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
                    }
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
                } else if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionAcceptKey) {
                    if (encryptedChat.exchange_id == decryptedMessageAction.exchange_id) {
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
                        if (byteArray3.length > 256) {
                            bArr = new byte[256];
                            System.arraycopy(byteArray3, byteArray3.length - 256, bArr, 0, 256);
                        } else if (byteArray3.length < 256) {
                            bArr = new byte[256];
                            System.arraycopy(byteArray3, 0, bArr, 256 - byteArray3.length, byteArray3.length);
                            for (int i12 = 0; i12 < 256 - byteArray3.length; i12++) {
                                bArr[i12] = 0;
                            }
                        } else {
                            byte[] bArrComputeSHA3 = Utilities.computeSHA1(byteArray3);
                            byte[] bArr18 = new byte[8];
                            System.arraycopy(bArrComputeSHA3, bArrComputeSHA3.length - 8, bArr18, 0, 8);
                            jBytesToLong = Utilities.bytesToLong(bArr18);
                            if (tL_decryptedMessageService.action.key_fingerprint == jBytesToLong) {
                                encryptedChat.future_auth_key = byteArray3;
                                encryptedChat.future_key_fingerprint = jBytesToLong;
                                getMessagesStorage().updateEncryptedChat(encryptedChat);
                                sendCommitKeyMessage(encryptedChat, null);
                            } else {
                                encryptedChat.future_auth_key = new byte[256];
                                encryptedChat.future_key_fingerprint = 0L;
                                encryptedChat.exchange_id = 0L;
                                getMessagesStorage().updateEncryptedChat(encryptedChat);
                                sendAbortKeyMessage(encryptedChat, null, tL_decryptedMessageService.action.exchange_id);
                            }
                        }
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
                        } else {
                            encryptedChat.future_auth_key = new byte[256];
                            encryptedChat.future_key_fingerprint = 0L;
                            encryptedChat.exchange_id = 0L;
                            getMessagesStorage().updateEncryptedChat(encryptedChat);
                            sendAbortKeyMessage(encryptedChat, null, tL_decryptedMessageService.action.exchange_id);
                        }
                    } else {
                        encryptedChat.future_auth_key = new byte[256];
                        encryptedChat.future_key_fingerprint = 0L;
                        encryptedChat.exchange_id = 0L;
                        getMessagesStorage().updateEncryptedChat(encryptedChat);
                        sendAbortKeyMessage(encryptedChat, null, tL_decryptedMessageService.action.exchange_id);
                    }
                } else if (decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionCommitKey) {
                    if (encryptedChat.exchange_id == decryptedMessageAction.exchange_id) {
                        long j6 = encryptedChat.future_key_fingerprint;
                        if (j6 == decryptedMessageAction.key_fingerprint) {
                            long j7 = encryptedChat.key_fingerprint;
                            byte[] bArr20 = encryptedChat.auth_key;
                            encryptedChat.key_fingerprint = j6;
                            encryptedChat.auth_key = encryptedChat.future_auth_key;
                            encryptedChat.key_create_date = getConnectionsManager().getCurrentTime();
                            encryptedChat.future_auth_key = bArr20;
                            encryptedChat.future_key_fingerprint = j7;
                            encryptedChat.key_use_count_in = (short) 0;
                            encryptedChat.key_use_count_out = (short) 0;
                            encryptedChat.exchange_id = 0L;
                            getMessagesStorage().updateEncryptedChat(encryptedChat);
                            sendNoopMessage(encryptedChat, null);
                        } else {
                            encryptedChat.future_auth_key = new byte[256];
                            encryptedChat.future_key_fingerprint = 0L;
                            encryptedChat.exchange_id = 0L;
                            getMessagesStorage().updateEncryptedChat(encryptedChat);
                            sendAbortKeyMessage(encryptedChat, null, tL_decryptedMessageService.action.exchange_id);
                        }
                    } else {
                        encryptedChat.future_auth_key = new byte[256];
                        encryptedChat.future_key_fingerprint = 0L;
                        encryptedChat.exchange_id = 0L;
                        getMessagesStorage().updateEncryptedChat(encryptedChat);
                        sendAbortKeyMessage(encryptedChat, null, tL_decryptedMessageService.action.exchange_id);
                    }
                } else if (!(decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionAbortKey)) {
                    if ((decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionNoop) || !(decryptedMessageAction instanceof TLRPC.TL_decryptedMessageActionResend) || (i2 = decryptedMessageAction.end_seq_no) < (i3 = encryptedChat.in_seq_no) || i2 < (i4 = decryptedMessageAction.start_seq_no)) {
                        return null;
                    }
                    if (i4 < i3) {
                        decryptedMessageAction.start_seq_no = i3;
                    }
                    resendMessages(decryptedMessageAction.start_seq_no, i2, encryptedChat);
                } else if (encryptedChat.exchange_id == decryptedMessageAction.exchange_id) {
                    encryptedChat.future_auth_key = new byte[256];
                    encryptedChat.future_key_fingerprint = 0L;
                    encryptedChat.exchange_id = 0L;
                    getMessagesStorage().updateEncryptedChat(encryptedChat);
                }
            } else if (BuildVars.LOGS_ENABLED) {
                FileLog.e("unknown message " + tLObject);
            }
        } else if (BuildVars.LOGS_ENABLED) {
            FileLog.e("unknown TLObject");
        }
        return null;
    }

    public static void $r8$lambda$gI5t9jLTGuUjiijCNDLQ7yz74s8(final SecretChatHelper secretChatHelper, final long j) {
        TLRPC.Dialog dialog = (TLRPC.Dialog) secretChatHelper.getMessagesController().dialogs_dict.get(j);
        if (dialog != null) {
            dialog.unread_count = 0;
            secretChatHelper.getMessagesController().dialogMessage.remove(dialog.id);
        }
        secretChatHelper.getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                SecretChatHelper.m987$r8$lambda$NXrCZintHKRCG9BWtq4g5pSFM(this.f$0, j);
            }
        });
        secretChatHelper.getMessagesStorage().deleteDialog(j, 1);
        secretChatHelper.getNotificationCenter().postNotificationName(NotificationCenter.dialogsNeedReload, new Object[0]);
        secretChatHelper.getNotificationCenter().postNotificationName(NotificationCenter.removeAllMessagesFromDialog, Long.valueOf(j), Boolean.FALSE, null);
    }

    public static void m987$r8$lambda$NXrCZintHKRCG9BWtq4g5pSFM(final SecretChatHelper secretChatHelper, final long j) {
        secretChatHelper.getClass();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                SecretChatHelper.m993$r8$lambda$be7auxADMyqxuZrFeqMwUI_tvg(this.f$0, j);
            }
        });
    }

    public static void m993$r8$lambda$be7auxADMyqxuZrFeqMwUI_tvg(SecretChatHelper secretChatHelper, long j) {
        secretChatHelper.getNotificationsController().processReadMessages(null, j, 0, Integer.MAX_VALUE, false);
        LongSparseIntArray longSparseIntArray = new LongSparseIntArray(1);
        longSparseIntArray.put(j, 0);
        secretChatHelper.getNotificationsController().processDialogsUpdateRead(longSparseIntArray);
    }

    private TLRPC.Message createDeleteMessage(int i, int i2, int i3, long j, TLRPC.EncryptedChat encryptedChat) {
        TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
        TLRPC.TL_messageEncryptedAction tL_messageEncryptedAction = new TLRPC.TL_messageEncryptedAction();
        tL_messageService.action = tL_messageEncryptedAction;
        tL_messageEncryptedAction.encryptedAction = new TLRPC.TL_decryptedMessageActionDeleteMessages();
        tL_messageService.action.encryptedAction.random_ids.add(Long.valueOf(j));
        tL_messageService.id = i;
        tL_messageService.local_id = i;
        TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
        tL_messageService.from_id = tL_peerUser;
        tL_peerUser.user_id = getUserConfig().getClientUserId();
        tL_messageService.unread = true;
        tL_messageService.out = true;
        tL_messageService.flags = 256;
        tL_messageService.dialog_id = DialogObject.makeEncryptedDialogId(encryptedChat.id);
        tL_messageService.send_state = 1;
        tL_messageService.seq_in = i3;
        tL_messageService.seq_out = i2;
        tL_messageService.peer_id = new TLRPC.TL_peerUser();
        if (encryptedChat.participant_id == getUserConfig().getClientUserId()) {
            tL_messageService.peer_id.user_id = encryptedChat.admin_id;
        } else {
            tL_messageService.peer_id.user_id = encryptedChat.participant_id;
        }
        tL_messageService.date = 0;
        tL_messageService.random_id = j;
        return tL_messageService;
    }

    private void resendMessages(final int i, final int i2, final TLRPC.EncryptedChat encryptedChat) {
        int i3;
        if (encryptedChat == null || (i3 = i2 - i) < 0 || i3 > 10000) {
            return;
        }
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                SecretChatHelper.$r8$lambda$hAvGcEfoiKV92u3auwfarJjL2p0(this.f$0, i, encryptedChat, i2);
            }
        });
    }

    public static void $r8$lambda$hAvGcEfoiKV92u3auwfarJjL2p0(final SecretChatHelper secretChatHelper, int i, TLRPC.EncryptedChat encryptedChat, int i2) {
        TLRPC.Message messageCreateDeleteMessage;
        TLRPC.EncryptedChat encryptedChat2 = encryptedChat;
        int i3 = 3;
        ?? r10 = 0;
        int i4 = 2;
        int i5 = 1;
        secretChatHelper.getClass();
        try {
            int i6 = (encryptedChat2.admin_id == secretChatHelper.getUserConfig().getClientUserId() && i % 2 == 0) ? i + 1 : i;
            SQLiteCursor sQLiteCursorQueryFinalized = secretChatHelper.getMessagesStorage().getDatabase().queryFinalized(String.format(Locale.US, "SELECT uid FROM requested_holes WHERE uid = %d AND ((seq_out_start >= %d AND %d <= seq_out_end) OR (seq_out_start >= %d AND %d <= seq_out_end))", Integer.valueOf(encryptedChat2.id), Integer.valueOf(i6), Integer.valueOf(i6), Integer.valueOf(i2), Integer.valueOf(i2)), new Object[0]);
            boolean next = sQLiteCursorQueryFinalized.next();
            sQLiteCursorQueryFinalized.dispose();
            if (next) {
                return;
            }
            long jMakeEncryptedDialogId = DialogObject.makeEncryptedDialogId(encryptedChat2.id);
            SparseArray sparseArray = new SparseArray();
            ArrayList<TLRPC.Message> arrayList = new ArrayList<>();
            for (int i7 = i6; i7 <= i2; i7 += 2) {
                sparseArray.put(i7, null);
            }
            SQLiteCursor sQLiteCursorQueryFinalized2 = secretChatHelper.getMessagesStorage().getDatabase().queryFinalized(String.format(Locale.US, "SELECT m.data, r.random_id, s.seq_in, s.seq_out, m.ttl, s.mid FROM messages_seq as s LEFT JOIN randoms_v2 as r ON r.mid = s.mid LEFT JOIN messages_v2 as m ON m.mid = s.mid WHERE m.uid = %d AND m.out = 1 AND s.seq_out >= %d AND s.seq_out <= %d ORDER BY seq_out ASC", Long.valueOf(jMakeEncryptedDialogId), Integer.valueOf(i6), Integer.valueOf(i2)), new Object[0]);
            while (sQLiteCursorQueryFinalized2.next()) {
                long jLongValue = sQLiteCursorQueryFinalized2.longValue(i5);
                if (jLongValue == 0) {
                    jLongValue = Utilities.random.nextLong();
                }
                long j = jLongValue;
                int iIntValue = sQLiteCursorQueryFinalized2.intValue(i4);
                int iIntValue2 = sQLiteCursorQueryFinalized2.intValue(i3);
                ArrayList<TLRPC.Message> arrayList2 = arrayList;
                int iIntValue3 = sQLiteCursorQueryFinalized2.intValue(5);
                NativeByteBuffer nativeByteBufferByteBufferValue = sQLiteCursorQueryFinalized2.byteBufferValue(r10);
                if (nativeByteBufferByteBufferValue != 0) {
                    messageCreateDeleteMessage = TLRPC.Message.TLdeserialize(nativeByteBufferByteBufferValue, nativeByteBufferByteBufferValue.readInt32(r10), r10);
                    messageCreateDeleteMessage.readAttachPath(nativeByteBufferByteBufferValue, secretChatHelper.getUserConfig().clientUserId);
                    nativeByteBufferByteBufferValue.reuse();
                    messageCreateDeleteMessage.random_id = j;
                    messageCreateDeleteMessage.dialog_id = jMakeEncryptedDialogId;
                    messageCreateDeleteMessage.seq_in = iIntValue;
                    messageCreateDeleteMessage.seq_out = iIntValue2;
                    messageCreateDeleteMessage.ttl = sQLiteCursorQueryFinalized2.intValue(4);
                } else {
                    messageCreateDeleteMessage = secretChatHelper.createDeleteMessage(iIntValue3, iIntValue2, iIntValue, j, encryptedChat2);
                }
                arrayList2.add(messageCreateDeleteMessage);
                sparseArray.remove(iIntValue2);
                encryptedChat2 = encryptedChat;
                arrayList = arrayList2;
                i3 = 3;
                r10 = 0;
                i4 = 2;
                i5 = 1;
            }
            final ArrayList<TLRPC.Message> arrayList3 = arrayList;
            sQLiteCursorQueryFinalized2.dispose();
            if (sparseArray.size() != 0) {
                for (int i8 = 0; i8 < sparseArray.size(); i8++) {
                    int iKeyAt = sparseArray.keyAt(i8);
                    arrayList3.add(secretChatHelper.createDeleteMessage(secretChatHelper.getUserConfig().getNewMessageId(), iKeyAt, iKeyAt + 1, Utilities.random.nextLong(), encryptedChat));
                }
                secretChatHelper.getUserConfig().saveConfig(false);
            }
            Collections.sort(arrayList3, new Comparator() {
                @Override
                public final int compare(Object obj, Object obj2) {
                    return AndroidUtilities.compare(((TLRPC.Message) obj).seq_out, ((TLRPC.Message) obj2).seq_out);
                }
            });
            ArrayList<TLRPC.EncryptedChat> arrayList4 = new ArrayList<>();
            arrayList4.add(encryptedChat);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    SecretChatHelper.m995$r8$lambda$hivG1uv381SKgjPAtpvA_H9nOk(this.f$0, arrayList3);
                }
            });
            secretChatHelper.getSendMessagesHelper().processUnsentMessages(arrayList3, null, new ArrayList<>(), new ArrayList<>(), arrayList4);
            secretChatHelper.getMessagesStorage().getDatabase().executeFast(String.format(Locale.US, "REPLACE INTO requested_holes VALUES(%d, %d, %d)", Integer.valueOf(encryptedChat.id), Integer.valueOf(i6), Integer.valueOf(i2))).stepThis().dispose();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static void m995$r8$lambda$hivG1uv381SKgjPAtpvA_H9nOk(SecretChatHelper secretChatHelper, ArrayList arrayList) {
        secretChatHelper.getClass();
        for (int i = 0; i < arrayList.size(); i++) {
            MessageObject messageObject = new MessageObject(secretChatHelper.currentAccount, (TLRPC.Message) arrayList.get(i), false, true);
            messageObject.resendAsIs = true;
            secretChatHelper.getSendMessagesHelper().retrySendMessage(messageObject, true, 0L);
        }
    }

    public void checkSecretHoles(TLRPC.EncryptedChat encryptedChat, ArrayList<TLRPC.Message> arrayList) {
        TL_decryptedMessageHolder tL_decryptedMessageHolder;
        TLRPC.TL_decryptedMessageLayer tL_decryptedMessageLayer;
        int i;
        int i2;
        ArrayList<TL_decryptedMessageHolder> arrayList2 = this.secretHolesQueue.get(encryptedChat.id);
        if (arrayList2 == null) {
            return;
        }
        Collections.sort(arrayList2, new Comparator() {
            @Override
            public final int compare(Object obj, Object obj2) {
                return SecretChatHelper.$r8$lambda$9HPyq4DJV3h2LEHyGPsVqWe9r2g((SecretChatHelper.TL_decryptedMessageHolder) obj, (SecretChatHelper.TL_decryptedMessageHolder) obj2);
            }
        });
        boolean z = false;
        while (arrayList2.size() > 0 && ((i = (tL_decryptedMessageLayer = (tL_decryptedMessageHolder = arrayList2.get(0)).layer).out_seq_no) == (i2 = encryptedChat.seq_in) || i2 == i - 2)) {
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
            z = true;
        }
        TLRPC.EncryptedChat encryptedChat3 = encryptedChat;
        if (arrayList2.isEmpty()) {
            this.secretHolesQueue.remove(encryptedChat3.id);
        }
        if (z) {
            getMessagesStorage().updateEncryptedChatSeq(encryptedChat3, true);
        }
    }

    public static int $r8$lambda$9HPyq4DJV3h2LEHyGPsVqWe9r2g(TL_decryptedMessageHolder tL_decryptedMessageHolder, TL_decryptedMessageHolder tL_decryptedMessageHolder2) {
        int i = tL_decryptedMessageHolder.layer.out_seq_no;
        int i2 = tL_decryptedMessageHolder2.layer.out_seq_no;
        if (i > i2) {
            return 1;
        }
        return i < i2 ? -1 : 0;
    }

    private boolean decryptWithMtProtoVersion(NativeByteBuffer nativeByteBuffer, byte[] bArr, byte[] bArr2, int i, boolean z, boolean z2) {
        boolean z3 = false;
        boolean z4 = i == 1 ? false : z;
        MessageKeyData messageKeyDataGenerateMessageKeyData = MessageKeyData.generateMessageKeyData(bArr, bArr2, z4, i);
        Utilities.aesIgeEncryption(nativeByteBuffer.buffer, messageKeyDataGenerateMessageKeyData.aesKey, messageKeyDataGenerateMessageKeyData.aesIv, false, false, 24, nativeByteBuffer.limit() - 24);
        int int32 = nativeByteBuffer.readInt32(false);
        if (i == 2) {
            int i2 = z4 ? 8 : 0;
            ByteBuffer byteBuffer = nativeByteBuffer.buffer;
            if (!Utilities.arraysEquals(bArr2, 0, Utilities.computeSHA256(bArr, i2 + 88, 32, byteBuffer, 24, byteBuffer.limit()), 8)) {
                if (z2) {
                    Utilities.aesIgeEncryption(nativeByteBuffer.buffer, messageKeyDataGenerateMessageKeyData.aesKey, messageKeyDataGenerateMessageKeyData.aesIv, true, false, 24, nativeByteBuffer.limit() - 24);
                    nativeByteBuffer.position(24);
                }
                z3 = true;
            }
        } else {
            int iLimit = int32 + 28;
            if (iLimit < nativeByteBuffer.buffer.limit() - 15 || iLimit > nativeByteBuffer.buffer.limit()) {
                iLimit = nativeByteBuffer.buffer.limit();
            }
            byte[] bArrComputeSHA1 = Utilities.computeSHA1(nativeByteBuffer.buffer, 24, iLimit);
            if (!Utilities.arraysEquals(bArr2, 0, bArrComputeSHA1, bArrComputeSHA1.length - 16)) {
                if (z2) {
                    Utilities.aesIgeEncryption(nativeByteBuffer.buffer, messageKeyDataGenerateMessageKeyData.aesKey, messageKeyDataGenerateMessageKeyData.aesIv, true, false, 24, nativeByteBuffer.limit() - 24);
                    nativeByteBuffer.position(24);
                }
                z3 = true;
            }
        }
        if (int32 <= 0) {
            z3 = true;
        }
        if (int32 > nativeByteBuffer.limit() - 28) {
            z3 = true;
        }
        int iLimit2 = (nativeByteBuffer.limit() - 28) - int32;
        if (i == 2) {
            if (iLimit2 < 12) {
                z3 = true;
            }
            if (iLimit2 > 1024) {
                z3 = true;
            }
        } else if (iLimit2 > 15) {
            z3 = true;
        }
        return !z3;
    }

    protected ArrayList<TLRPC.Message> decryptMessage(TLRPC.EncryptedMessage encryptedMessage) {
        byte[] bArr;
        boolean z;
        byte[] data;
        boolean z2;
        boolean z3;
        byte[] bArr2;
        final SecretChatHelper secretChatHelper;
        int i;
        TLObject tLObjectTLdeserialize;
        ArrayList<TLRPC.Message> arrayList;
        TLRPC.Message messageProcessDecryptedObject;
        TLRPC.TL_decryptedMessageLayer tL_decryptedMessageLayer;
        int i2;
        int i3;
        ArrayList<TL_decryptedMessageHolder> arrayList2;
        int i4;
        TLRPC.EncryptedChat encryptedChatDB = getMessagesController().getEncryptedChatDB(encryptedMessage.chat_id, true);
        if (encryptedChatDB != null && !(encryptedChatDB instanceof TLRPC.TL_encryptedChatDiscarded)) {
            try {
                if (encryptedChatDB instanceof TLRPC.TL_encryptedChatWaiting) {
                    ArrayList<TLRPC.Update> arrayList3 = this.pendingSecretMessages.get(encryptedChatDB.id);
                    if (arrayList3 == null) {
                        arrayList3 = new ArrayList<>();
                        this.pendingSecretMessages.put(encryptedChatDB.id, arrayList3);
                    }
                    TL_update.TL_updateNewEncryptedMessage tL_updateNewEncryptedMessage = new TL_update.TL_updateNewEncryptedMessage();
                    tL_updateNewEncryptedMessage.message = encryptedMessage;
                    arrayList3.add(tL_updateNewEncryptedMessage);
                    return null;
                }
                NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(encryptedMessage.bytes.length);
                nativeByteBuffer.writeBytes(encryptedMessage.bytes);
                nativeByteBuffer.position(0);
                long int64 = nativeByteBuffer.readInt64(false);
                if (encryptedChatDB.key_fingerprint == int64) {
                    bArr = encryptedChatDB.auth_key;
                } else {
                    long j = encryptedChatDB.future_key_fingerprint;
                    if (j == 0 || j != int64) {
                        bArr = null;
                    } else {
                        bArr = encryptedChatDB.future_auth_key;
                        z = true;
                    }
                    if (bArr != null) {
                        data = nativeByteBuffer.readData(16, false);
                        if (encryptedChatDB.admin_id == getUserConfig().getClientUserId()) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (encryptedChatDB.mtproto_seq != 0) {
                            z3 = false;
                        } else {
                            z3 = true;
                        }
                        bArr2 = bArr;
                        if (!decryptWithMtProtoVersion(nativeByteBuffer, bArr2, data, 2, z2, z3)) {
                            if (z3) {
                                secretChatHelper = this;
                                if (!secretChatHelper.decryptWithMtProtoVersion(nativeByteBuffer, bArr2, data, 1, z2, false)) {
                                    i = 1;
                                }
                            }
                            return null;
                        }
                        secretChatHelper = this;
                        i = 2;
                        tLObjectTLdeserialize = TLClassStore.Instance().TLdeserialize(nativeByteBuffer, nativeByteBuffer.readInt32(false), false);
                        nativeByteBuffer.reuse();
                        if (!z) {
                            encryptedChatDB.key_use_count_in = (short) (encryptedChatDB.key_use_count_in + 1);
                        }
                        if (tLObjectTLdeserialize instanceof TLRPC.TL_decryptedMessageLayer) {
                            tL_decryptedMessageLayer = (TLRPC.TL_decryptedMessageLayer) tLObjectTLdeserialize;
                            if (encryptedChatDB.seq_in == 0 && encryptedChatDB.seq_out == 0) {
                                if (encryptedChatDB.admin_id == secretChatHelper.getUserConfig().getClientUserId()) {
                                    encryptedChatDB.seq_out = 1;
                                    encryptedChatDB.seq_in = -2;
                                } else {
                                    encryptedChatDB.seq_in = -1;
                                }
                            }
                            if (tL_decryptedMessageLayer.random_bytes.length < 15) {
                                if (BuildVars.LOGS_ENABLED) {
                                    FileLog.e("got random bytes less than needed");
                                }
                                return null;
                            }
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.d("current chat in_seq = " + encryptedChatDB.seq_in + " out_seq = " + encryptedChatDB.seq_out);
                                FileLog.d("got message with in_seq = " + tL_decryptedMessageLayer.in_seq_no + " out_seq = " + tL_decryptedMessageLayer.out_seq_no);
                            }
                            i2 = tL_decryptedMessageLayer.out_seq_no;
                            i3 = encryptedChatDB.seq_in;
                            if (i2 <= i3) {
                                return null;
                            }
                            if (i != 1 && (i4 = encryptedChatDB.mtproto_seq) != 0 && i2 >= i4) {
                                return null;
                            }
                            if (i3 != i2 - 2) {
                                if (BuildVars.LOGS_ENABLED) {
                                    FileLog.e("got hole");
                                }
                                secretChatHelper.sendResendMessage(encryptedChatDB, encryptedChatDB.seq_in + 2, tL_decryptedMessageLayer.out_seq_no - 2, null);
                                arrayList2 = secretChatHelper.secretHolesQueue.get(encryptedChatDB.id);
                                if (arrayList2 == null) {
                                    arrayList2 = new ArrayList<>();
                                    secretChatHelper.secretHolesQueue.put(encryptedChatDB.id, arrayList2);
                                }
                                if (arrayList2.size() >= 4) {
                                    secretChatHelper.secretHolesQueue.remove(encryptedChatDB.id);
                                    final TLRPC.TL_encryptedChatDiscarded tL_encryptedChatDiscarded = new TLRPC.TL_encryptedChatDiscarded();
                                    tL_encryptedChatDiscarded.id = encryptedChatDB.id;
                                    tL_encryptedChatDiscarded.user_id = encryptedChatDB.user_id;
                                    tL_encryptedChatDiscarded.auth_key = encryptedChatDB.auth_key;
                                    tL_encryptedChatDiscarded.key_create_date = encryptedChatDB.key_create_date;
                                    tL_encryptedChatDiscarded.key_use_count_in = encryptedChatDB.key_use_count_in;
                                    tL_encryptedChatDiscarded.key_use_count_out = encryptedChatDB.key_use_count_out;
                                    tL_encryptedChatDiscarded.seq_in = encryptedChatDB.seq_in;
                                    tL_encryptedChatDiscarded.seq_out = encryptedChatDB.seq_out;
                                    AndroidUtilities.runOnUIThread(new Runnable() {
                                        @Override
                                        public final void run() {
                                            SecretChatHelper.m988$r8$lambda$PwZxHG9KXSQk_UcjnOCdGjr9o(this.f$0, tL_encryptedChatDiscarded);
                                        }
                                    });
                                    secretChatHelper.declineSecretChat(encryptedChatDB.id, false);
                                    return null;
                                }
                                TL_decryptedMessageHolder tL_decryptedMessageHolder = new TL_decryptedMessageHolder();
                                tL_decryptedMessageHolder.layer = tL_decryptedMessageLayer;
                                tL_decryptedMessageHolder.file = encryptedMessage.file;
                                tL_decryptedMessageHolder.date = encryptedMessage.date;
                                tL_decryptedMessageHolder.new_key_used = z;
                                tL_decryptedMessageHolder.decryptedWithVersion = i;
                                arrayList2.add(tL_decryptedMessageHolder);
                                return null;
                            }
                            if (i == 2) {
                                encryptedChatDB.mtproto_seq = Math.min(encryptedChatDB.mtproto_seq, i3);
                            }
                            secretChatHelper.applyPeerLayer(encryptedChatDB, tL_decryptedMessageLayer.layer);
                            encryptedChatDB.seq_in = tL_decryptedMessageLayer.out_seq_no;
                            encryptedChatDB.in_seq_no = tL_decryptedMessageLayer.in_seq_no;
                            secretChatHelper.getMessagesStorage().updateEncryptedChatSeq(encryptedChatDB, true);
                            tLObjectTLdeserialize = tL_decryptedMessageLayer.message;
                        } else {
                            if (tLObjectTLdeserialize instanceof TLRPC.TL_decryptedMessageService) {
                                if (!(((TLRPC.TL_decryptedMessageService) tLObjectTLdeserialize).action instanceof TLRPC.TL_decryptedMessageActionNotifyLayer)) {
                                }
                            }
                            return null;
                        }
                        TLObject tLObject = tLObjectTLdeserialize;
                        arrayList = new ArrayList<>();
                        messageProcessDecryptedObject = secretChatHelper.processDecryptedObject(encryptedChatDB, encryptedMessage.file, encryptedMessage.date, tLObject, z);
                        if (messageProcessDecryptedObject != null) {
                            arrayList.add(messageProcessDecryptedObject);
                        }
                        secretChatHelper.checkSecretHoles(encryptedChatDB, arrayList);
                        return arrayList;
                    }
                    nativeByteBuffer.reuse();
                    if (BuildVars.LOGS_ENABLED) {
                        FileLog.e(String.format("fingerprint mismatch %x", Long.valueOf(int64)));
                    }
                }
                z = false;
                if (bArr != null) {
                    data = nativeByteBuffer.readData(16, false);
                    if (encryptedChatDB.admin_id == getUserConfig().getClientUserId()) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (encryptedChatDB.mtproto_seq != 0) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    bArr2 = bArr;
                    if (!decryptWithMtProtoVersion(nativeByteBuffer, bArr2, data, 2, z2, z3)) {
                        if (z3) {
                            secretChatHelper = this;
                            if (!secretChatHelper.decryptWithMtProtoVersion(nativeByteBuffer, bArr2, data, 1, z2, false)) {
                                i = 1;
                            }
                        }
                        return null;
                    }
                    secretChatHelper = this;
                    i = 2;
                    tLObjectTLdeserialize = TLClassStore.Instance().TLdeserialize(nativeByteBuffer, nativeByteBuffer.readInt32(false), false);
                    nativeByteBuffer.reuse();
                    if (!z) {
                        encryptedChatDB.key_use_count_in = (short) (encryptedChatDB.key_use_count_in + 1);
                    }
                    if (tLObjectTLdeserialize instanceof TLRPC.TL_decryptedMessageLayer) {
                        tL_decryptedMessageLayer = (TLRPC.TL_decryptedMessageLayer) tLObjectTLdeserialize;
                        if (encryptedChatDB.seq_in == 0) {
                            if (encryptedChatDB.admin_id == secretChatHelper.getUserConfig().getClientUserId()) {
                                encryptedChatDB.seq_out = 1;
                                encryptedChatDB.seq_in = -2;
                            } else {
                                encryptedChatDB.seq_in = -1;
                            }
                        }
                        if (tL_decryptedMessageLayer.random_bytes.length < 15) {
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.e("got random bytes less than needed");
                            }
                            return null;
                        }
                        if (BuildVars.LOGS_ENABLED) {
                            FileLog.d("current chat in_seq = " + encryptedChatDB.seq_in + " out_seq = " + encryptedChatDB.seq_out);
                            FileLog.d("got message with in_seq = " + tL_decryptedMessageLayer.in_seq_no + " out_seq = " + tL_decryptedMessageLayer.out_seq_no);
                        }
                        i2 = tL_decryptedMessageLayer.out_seq_no;
                        i3 = encryptedChatDB.seq_in;
                        if (i2 <= i3) {
                            return null;
                        }
                        if (i != 1) {
                        }
                        if (i3 != i2 - 2) {
                            if (BuildVars.LOGS_ENABLED) {
                                FileLog.e("got hole");
                            }
                            secretChatHelper.sendResendMessage(encryptedChatDB, encryptedChatDB.seq_in + 2, tL_decryptedMessageLayer.out_seq_no - 2, null);
                            arrayList2 = secretChatHelper.secretHolesQueue.get(encryptedChatDB.id);
                            if (arrayList2 == null) {
                                arrayList2 = new ArrayList<>();
                                secretChatHelper.secretHolesQueue.put(encryptedChatDB.id, arrayList2);
                            }
                            if (arrayList2.size() >= 4) {
                                secretChatHelper.secretHolesQueue.remove(encryptedChatDB.id);
                                final TLRPC.TL_encryptedChatDiscarded tL_encryptedChatDiscarded2 = new TLRPC.TL_encryptedChatDiscarded();
                                tL_encryptedChatDiscarded2.id = encryptedChatDB.id;
                                tL_encryptedChatDiscarded2.user_id = encryptedChatDB.user_id;
                                tL_encryptedChatDiscarded2.auth_key = encryptedChatDB.auth_key;
                                tL_encryptedChatDiscarded2.key_create_date = encryptedChatDB.key_create_date;
                                tL_encryptedChatDiscarded2.key_use_count_in = encryptedChatDB.key_use_count_in;
                                tL_encryptedChatDiscarded2.key_use_count_out = encryptedChatDB.key_use_count_out;
                                tL_encryptedChatDiscarded2.seq_in = encryptedChatDB.seq_in;
                                tL_encryptedChatDiscarded2.seq_out = encryptedChatDB.seq_out;
                                AndroidUtilities.runOnUIThread(new Runnable() {
                                    @Override
                                    public final void run() {
                                        SecretChatHelper.m988$r8$lambda$PwZxHG9KXSQk_UcjnOCdGjr9o(this.f$0, tL_encryptedChatDiscarded2);
                                    }
                                });
                                secretChatHelper.declineSecretChat(encryptedChatDB.id, false);
                                return null;
                            }
                            TL_decryptedMessageHolder tL_decryptedMessageHolder2 = new TL_decryptedMessageHolder();
                            tL_decryptedMessageHolder2.layer = tL_decryptedMessageLayer;
                            tL_decryptedMessageHolder2.file = encryptedMessage.file;
                            tL_decryptedMessageHolder2.date = encryptedMessage.date;
                            tL_decryptedMessageHolder2.new_key_used = z;
                            tL_decryptedMessageHolder2.decryptedWithVersion = i;
                            arrayList2.add(tL_decryptedMessageHolder2);
                            return null;
                        }
                        if (i == 2) {
                            encryptedChatDB.mtproto_seq = Math.min(encryptedChatDB.mtproto_seq, i3);
                        }
                        secretChatHelper.applyPeerLayer(encryptedChatDB, tL_decryptedMessageLayer.layer);
                        encryptedChatDB.seq_in = tL_decryptedMessageLayer.out_seq_no;
                        encryptedChatDB.in_seq_no = tL_decryptedMessageLayer.in_seq_no;
                        secretChatHelper.getMessagesStorage().updateEncryptedChatSeq(encryptedChatDB, true);
                        tLObjectTLdeserialize = tL_decryptedMessageLayer.message;
                    } else {
                        if (tLObjectTLdeserialize instanceof TLRPC.TL_decryptedMessageService) {
                            if (!(((TLRPC.TL_decryptedMessageService) tLObjectTLdeserialize).action instanceof TLRPC.TL_decryptedMessageActionNotifyLayer)) {
                            }
                        }
                        return null;
                    }
                    TLObject tLObject2 = tLObjectTLdeserialize;
                    arrayList = new ArrayList<>();
                    messageProcessDecryptedObject = secretChatHelper.processDecryptedObject(encryptedChatDB, encryptedMessage.file, encryptedMessage.date, tLObject2, z);
                    if (messageProcessDecryptedObject != null) {
                        arrayList.add(messageProcessDecryptedObject);
                    }
                    secretChatHelper.checkSecretHoles(encryptedChatDB, arrayList);
                    return arrayList;
                }
                nativeByteBuffer.reuse();
                if (BuildVars.LOGS_ENABLED) {
                    FileLog.e(String.format("fingerprint mismatch %x", Long.valueOf(int64)));
                }
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        return null;
    }

    public static void m988$r8$lambda$PwZxHG9KXSQk_UcjnOCdGjr9o(SecretChatHelper secretChatHelper, TLRPC.TL_encryptedChatDiscarded tL_encryptedChatDiscarded) {
        secretChatHelper.getMessagesController().putEncryptedChat(tL_encryptedChatDiscarded, false);
        secretChatHelper.getMessagesStorage().updateEncryptedChat(tL_encryptedChatDiscarded);
        secretChatHelper.getNotificationCenter().postNotificationName(NotificationCenter.encryptedChatUpdated, tL_encryptedChatDiscarded);
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

    public void processAcceptedSecretChat(final TLRPC.EncryptedChat encryptedChat) throws InterruptedException {
        byte[] bArr;
        byte[] bArr2;
        ArrayList<TLRPC.Update> arrayList;
        BigInteger bigInteger = new BigInteger(1, getMessagesStorage().getSecretPBytes());
        BigInteger bigInteger2 = new BigInteger(1, encryptedChat.g_a_or_b);
        if (!Utilities.isGoodGaAndGb(bigInteger2, bigInteger)) {
            declineSecretChat(encryptedChat.id, false);
            return;
        }
        byte[] byteArray = bigInteger2.modPow(new BigInteger(1, encryptedChat.a_or_b), bigInteger).toByteArray();
        if (byteArray.length > 256) {
            bArr = new byte[256];
            System.arraycopy(byteArray, byteArray.length - 256, bArr, 0, 256);
        } else {
            if (byteArray.length < 256) {
                bArr = new byte[256];
                System.arraycopy(byteArray, 0, bArr, 256 - byteArray.length, byteArray.length);
                for (int i = 0; i < 256 - byteArray.length; i++) {
                    bArr[i] = 0;
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
                arrayList = this.pendingSecretMessages.get(encryptedChat.id);
                if (arrayList != null) {
                    getMessagesController().processUpdateArray(arrayList, null, null, false, 0);
                    this.pendingSecretMessages.remove(encryptedChat.id);
                }
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        SecretChatHelper.$r8$lambda$5ROAVE0QaMK9ZWf3TRbGNIrFsGI(this.f$0, encryptedChat);
                    }
                });
                return;
            }
            final TLRPC.TL_encryptedChatDiscarded tL_encryptedChatDiscarded = new TLRPC.TL_encryptedChatDiscarded();
            tL_encryptedChatDiscarded.id = encryptedChat.id;
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
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    SecretChatHelper.m997$r8$lambda$q57nA3dkkO7ohYp8tSaBKTjA(this.f$0, tL_encryptedChatDiscarded);
                }
            });
            declineSecretChat(encryptedChat.id, false);
        }
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
            arrayList = this.pendingSecretMessages.get(encryptedChat.id);
            if (arrayList != null) {
                getMessagesController().processUpdateArray(arrayList, null, null, false, 0);
                this.pendingSecretMessages.remove(encryptedChat.id);
            }
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    SecretChatHelper.$r8$lambda$5ROAVE0QaMK9ZWf3TRbGNIrFsGI(this.f$0, encryptedChat);
                }
            });
            return;
        }
        final TLRPC.TL_encryptedChatDiscarded tL_encryptedChatDiscarded2 = new TLRPC.TL_encryptedChatDiscarded();
        tL_encryptedChatDiscarded2.id = encryptedChat.id;
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
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                SecretChatHelper.m997$r8$lambda$q57nA3dkkO7ohYp8tSaBKTjA(this.f$0, tL_encryptedChatDiscarded2);
            }
        });
        declineSecretChat(encryptedChat.id, false);
    }

    public static void $r8$lambda$5ROAVE0QaMK9ZWf3TRbGNIrFsGI(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat) {
        secretChatHelper.getNotificationCenter().postNotificationName(NotificationCenter.encryptedChatUpdated, encryptedChat);
        secretChatHelper.sendNotifyLayerMessage(encryptedChat, null);
    }

    public static void m997$r8$lambda$q57nA3dkkO7ohYp8tSaBKTjA(SecretChatHelper secretChatHelper, TLRPC.TL_encryptedChatDiscarded tL_encryptedChatDiscarded) {
        secretChatHelper.getMessagesController().putEncryptedChat(tL_encryptedChatDiscarded, false);
        secretChatHelper.getNotificationCenter().postNotificationName(NotificationCenter.encryptedChatUpdated, tL_encryptedChatDiscarded);
    }

    public void declineSecretChat(int i, boolean z) {
        declineSecretChat(i, z, 0L);
    }

    public void declineSecretChat(int i, boolean z, final long j) {
        Exception e;
        NativeByteBuffer nativeByteBuffer;
        if (j == 0) {
            try {
                nativeByteBuffer = new NativeByteBuffer(12);
                try {
                    nativeByteBuffer.writeInt32(100);
                    nativeByteBuffer.writeInt32(i);
                    nativeByteBuffer.writeBool(z);
                } catch (Exception e2) {
                    e = e2;
                    FileLog.e(e);
                }
            } catch (Exception e3) {
                e = e3;
                nativeByteBuffer = null;
            }
            j = getMessagesStorage().createPendingTask(nativeByteBuffer);
        }
        TLRPC.TL_messages_discardEncryption tL_messages_discardEncryption = new TLRPC.TL_messages_discardEncryption();
        tL_messages_discardEncryption.chat_id = i;
        tL_messages_discardEncryption.delete_history = z;
        getConnectionsManager().sendRequest(tL_messages_discardEncryption, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                SecretChatHelper.$r8$lambda$M5y14MmjVHMut8xvpsJEzZBupnU(this.f$0, j, tLObject, tL_error);
            }
        });
    }

    public static void $r8$lambda$M5y14MmjVHMut8xvpsJEzZBupnU(SecretChatHelper secretChatHelper, long j, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (j != 0) {
            secretChatHelper.getMessagesStorage().removePendingTask(j);
        } else {
            secretChatHelper.getClass();
        }
    }

    public void acceptSecretChat(final TLRPC.EncryptedChat encryptedChat) {
        if (this.acceptingChats.get(encryptedChat.id) != null) {
            return;
        }
        this.acceptingChats.put(encryptedChat.id, encryptedChat);
        TLRPC.TL_messages_getDhConfig tL_messages_getDhConfig = new TLRPC.TL_messages_getDhConfig();
        tL_messages_getDhConfig.random_length = 256;
        tL_messages_getDhConfig.version = getMessagesStorage().getLastSecretVersion();
        getConnectionsManager().sendRequest(tL_messages_getDhConfig, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                SecretChatHelper.m990$r8$lambda$Ww7ZXoP_XhyslLTxbTR8lWqyfA(this.f$0, encryptedChat, tLObject, tL_error);
            }
        });
    }

    public static void m990$r8$lambda$Ww7ZXoP_XhyslLTxbTR8lWqyfA(final SecretChatHelper secretChatHelper, final TLRPC.EncryptedChat encryptedChat, TLObject tLObject, TLRPC.TL_error tL_error) {
        byte[] bArr;
        if (tL_error == null) {
            secretChatHelper.getClass();
            TLRPC.messages_DhConfig messages_dhconfig = (TLRPC.messages_DhConfig) tLObject;
            if (tLObject instanceof TLRPC.TL_messages_dhConfig) {
                if (!Utilities.isGoodPrime(messages_dhconfig.p, messages_dhconfig.g)) {
                    secretChatHelper.acceptingChats.remove(encryptedChat.id);
                    secretChatHelper.declineSecretChat(encryptedChat.id, false);
                    return;
                } else {
                    secretChatHelper.getMessagesStorage().setSecretPBytes(messages_dhconfig.p);
                    secretChatHelper.getMessagesStorage().setSecretG(messages_dhconfig.g);
                    secretChatHelper.getMessagesStorage().setLastSecretVersion(messages_dhconfig.version);
                    secretChatHelper.getMessagesStorage().saveSecretParams(secretChatHelper.getMessagesStorage().getLastSecretVersion(), secretChatHelper.getMessagesStorage().getSecretG(), secretChatHelper.getMessagesStorage().getSecretPBytes());
                }
            }
            byte[] bArr2 = new byte[256];
            for (int i = 0; i < 256; i++) {
                bArr2[i] = (byte) (((byte) (Utilities.random.nextDouble() * 256.0d)) ^ messages_dhconfig.random[i]);
            }
            encryptedChat.a_or_b = bArr2;
            encryptedChat.seq_in = -1;
            encryptedChat.seq_out = 0;
            BigInteger bigInteger = new BigInteger(1, secretChatHelper.getMessagesStorage().getSecretPBytes());
            BigInteger bigIntegerModPow = BigInteger.valueOf(secretChatHelper.getMessagesStorage().getSecretG()).modPow(new BigInteger(1, bArr2), bigInteger);
            BigInteger bigInteger2 = new BigInteger(1, encryptedChat.g_a);
            if (!Utilities.isGoodGaAndGb(bigInteger2, bigInteger)) {
                secretChatHelper.acceptingChats.remove(encryptedChat.id);
                secretChatHelper.declineSecretChat(encryptedChat.id, false);
                return;
            }
            byte[] byteArray = bigIntegerModPow.toByteArray();
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
                    for (int i2 = 0; i2 < 256 - byteArray2.length; i2++) {
                        bArr[i2] = 0;
                    }
                }
                byte[] bArrComputeSHA1 = Utilities.computeSHA1(byteArray2);
                byte[] bArr4 = new byte[8];
                System.arraycopy(bArrComputeSHA1, bArrComputeSHA1.length - 8, bArr4, 0, 8);
                encryptedChat.auth_key = byteArray2;
                encryptedChat.key_create_date = secretChatHelper.getConnectionsManager().getCurrentTime();
                TLRPC.TL_messages_acceptEncryption tL_messages_acceptEncryption = new TLRPC.TL_messages_acceptEncryption();
                tL_messages_acceptEncryption.g_b = byteArray;
                TLRPC.TL_inputEncryptedChat tL_inputEncryptedChat = new TLRPC.TL_inputEncryptedChat();
                tL_messages_acceptEncryption.peer = tL_inputEncryptedChat;
                tL_inputEncryptedChat.chat_id = encryptedChat.id;
                tL_inputEncryptedChat.access_hash = encryptedChat.access_hash;
                tL_messages_acceptEncryption.key_fingerprint = Utilities.bytesToLong(bArr4);
                secretChatHelper.getConnectionsManager().sendRequest(tL_messages_acceptEncryption, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject2, TLRPC.TL_error tL_error2) {
                        SecretChatHelper.$r8$lambda$aOv0DHKTCkrZqnY3w5_OeVX44B0(this.f$0, encryptedChat, tLObject2, tL_error2);
                    }
                }, 64);
                return;
            }
            byteArray2 = bArr;
            byte[] bArrComputeSHA2 = Utilities.computeSHA1(byteArray2);
            byte[] bArr5 = new byte[8];
            System.arraycopy(bArrComputeSHA2, bArrComputeSHA2.length - 8, bArr5, 0, 8);
            encryptedChat.auth_key = byteArray2;
            encryptedChat.key_create_date = secretChatHelper.getConnectionsManager().getCurrentTime();
            TLRPC.TL_messages_acceptEncryption tL_messages_acceptEncryption2 = new TLRPC.TL_messages_acceptEncryption();
            tL_messages_acceptEncryption2.g_b = byteArray;
            TLRPC.TL_inputEncryptedChat tL_inputEncryptedChat2 = new TLRPC.TL_inputEncryptedChat();
            tL_messages_acceptEncryption2.peer = tL_inputEncryptedChat2;
            tL_inputEncryptedChat2.chat_id = encryptedChat.id;
            tL_inputEncryptedChat2.access_hash = encryptedChat.access_hash;
            tL_messages_acceptEncryption2.key_fingerprint = Utilities.bytesToLong(bArr5);
            secretChatHelper.getConnectionsManager().sendRequest(tL_messages_acceptEncryption2, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject2, TLRPC.TL_error tL_error2) {
                    SecretChatHelper.$r8$lambda$aOv0DHKTCkrZqnY3w5_OeVX44B0(this.f$0, encryptedChat, tLObject2, tL_error2);
                }
            }, 64);
            return;
        }
        secretChatHelper.acceptingChats.remove(encryptedChat.id);
    }

    public static void $r8$lambda$aOv0DHKTCkrZqnY3w5_OeVX44B0(final SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat, TLObject tLObject, TLRPC.TL_error tL_error) {
        secretChatHelper.acceptingChats.remove(encryptedChat.id);
        if (tL_error == null) {
            final TLRPC.EncryptedChat encryptedChat2 = (TLRPC.EncryptedChat) tLObject;
            encryptedChat2.auth_key = encryptedChat.auth_key;
            encryptedChat2.user_id = encryptedChat.user_id;
            encryptedChat2.seq_in = encryptedChat.seq_in;
            encryptedChat2.seq_out = encryptedChat.seq_out;
            encryptedChat2.key_create_date = encryptedChat.key_create_date;
            encryptedChat2.key_use_count_in = encryptedChat.key_use_count_in;
            encryptedChat2.key_use_count_out = encryptedChat.key_use_count_out;
            secretChatHelper.getMessagesStorage().updateEncryptedChat(encryptedChat2);
            secretChatHelper.getMessagesController().putEncryptedChat(encryptedChat2, false);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    SecretChatHelper.$r8$lambda$ahZEJyghUMkGZho191oqAqCAyIk(this.f$0, encryptedChat2);
                }
            });
        }
    }

    public static void $r8$lambda$ahZEJyghUMkGZho191oqAqCAyIk(SecretChatHelper secretChatHelper, TLRPC.EncryptedChat encryptedChat) {
        secretChatHelper.getNotificationCenter().postNotificationName(NotificationCenter.encryptedChatUpdated, encryptedChat);
        secretChatHelper.sendNotifyLayerMessage(encryptedChat, null);
    }

    public void startSecretChat(final Context context, final TLRPC.User user) {
        if (user == null || context == null) {
            return;
        }
        if (getMessagesController().isFrozen()) {
            AccountFrozenAlert.show(this.currentAccount);
            return;
        }
        this.startingSecretChat = true;
        final AlertDialog alertDialog = new AlertDialog(context, 3);
        TLRPC.TL_messages_getDhConfig tL_messages_getDhConfig = new TLRPC.TL_messages_getDhConfig();
        tL_messages_getDhConfig.random_length = 256;
        tL_messages_getDhConfig.version = getMessagesStorage().getLastSecretVersion();
        final int iSendRequest = getConnectionsManager().sendRequest(tL_messages_getDhConfig, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                SecretChatHelper.m992$r8$lambda$ZWxofWHvxWzT2BitTcL0tkFSE(this.f$0, context, alertDialog, user, tLObject, tL_error);
            }
        }, 2);
        alertDialog.setOnCancelListener(new DialogInterface.OnCancelListener() {
            @Override
            public final void onCancel(DialogInterface dialogInterface) {
                this.f$0.getConnectionsManager().cancelRequest(iSendRequest, true);
            }
        });
        try {
            alertDialog.show();
        } catch (Exception unused) {
        }
    }

    public static void m992$r8$lambda$ZWxofWHvxWzT2BitTcL0tkFSE(final SecretChatHelper secretChatHelper, final Context context, final AlertDialog alertDialog, final TLRPC.User user, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            secretChatHelper.getClass();
            TLRPC.messages_DhConfig messages_dhconfig = (TLRPC.messages_DhConfig) tLObject;
            if (tLObject instanceof TLRPC.TL_messages_dhConfig) {
                if (!Utilities.isGoodPrime(messages_dhconfig.p, messages_dhconfig.g)) {
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            SecretChatHelper.m991$r8$lambda$YqWuikQ_EiNlArvmwjHadrTP0(context, alertDialog);
                        }
                    });
                    return;
                }
                secretChatHelper.getMessagesStorage().setSecretPBytes(messages_dhconfig.p);
                secretChatHelper.getMessagesStorage().setSecretG(messages_dhconfig.g);
                secretChatHelper.getMessagesStorage().setLastSecretVersion(messages_dhconfig.version);
                secretChatHelper.getMessagesStorage().saveSecretParams(secretChatHelper.getMessagesStorage().getLastSecretVersion(), secretChatHelper.getMessagesStorage().getSecretG(), secretChatHelper.getMessagesStorage().getSecretPBytes());
            }
            final byte[] bArr = new byte[256];
            for (int i = 0; i < 256; i++) {
                bArr[i] = (byte) (((byte) (Utilities.random.nextDouble() * 256.0d)) ^ messages_dhconfig.random[i]);
            }
            byte[] byteArray = BigInteger.valueOf(secretChatHelper.getMessagesStorage().getSecretG()).modPow(new BigInteger(1, bArr), new BigInteger(1, secretChatHelper.getMessagesStorage().getSecretPBytes())).toByteArray();
            if (byteArray.length > 256) {
                byte[] bArr2 = new byte[256];
                System.arraycopy(byteArray, 1, bArr2, 0, 256);
                byteArray = bArr2;
            }
            TLRPC.TL_messages_requestEncryption tL_messages_requestEncryption = new TLRPC.TL_messages_requestEncryption();
            tL_messages_requestEncryption.g_a = byteArray;
            tL_messages_requestEncryption.user_id = secretChatHelper.getMessagesController().getInputUser(user);
            tL_messages_requestEncryption.random_id = Utilities.random.nextInt();
            secretChatHelper.getConnectionsManager().sendRequest(tL_messages_requestEncryption, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject2, TLRPC.TL_error tL_error2) {
                    SecretChatHelper.$r8$lambda$EIQ5731mCaYePXfNctwmygFaRus(this.f$0, context, alertDialog, bArr, user, tLObject2, tL_error2);
                }
            }, 2);
            return;
        }
        secretChatHelper.delayedEncryptedChatUpdates.clear();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                SecretChatHelper.$r8$lambda$KcuKuytzGiwIUDTSH9rxXbsoi4g(this.f$0, context, alertDialog);
            }
        });
    }

    public static void m991$r8$lambda$YqWuikQ_EiNlArvmwjHadrTP0(Context context, AlertDialog alertDialog) {
        try {
            if (((Activity) context).isFinishing()) {
                return;
            }
            alertDialog.dismiss();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public static void $r8$lambda$EIQ5731mCaYePXfNctwmygFaRus(final SecretChatHelper secretChatHelper, final Context context, final AlertDialog alertDialog, final byte[] bArr, final TLRPC.User user, final TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            secretChatHelper.getClass();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    SecretChatHelper.$r8$lambda$QG_M9zKuZgTqJrU6Jwjzvogb06s(this.f$0, context, alertDialog, tLObject, bArr, user);
                }
            });
        } else {
            secretChatHelper.delayedEncryptedChatUpdates.clear();
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    SecretChatHelper.m998$r8$lambda$rIG46ga8d7JXGQrccavketIhS8(this.f$0, context, alertDialog);
                }
            });
        }
    }

    public static void $r8$lambda$QG_M9zKuZgTqJrU6Jwjzvogb06s(final SecretChatHelper secretChatHelper, Context context, AlertDialog alertDialog, TLObject tLObject, byte[] bArr, TLRPC.User user) {
        secretChatHelper.startingSecretChat = false;
        if (!((Activity) context).isFinishing()) {
            try {
                alertDialog.dismiss();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        TLRPC.EncryptedChat encryptedChat = (TLRPC.EncryptedChat) tLObject;
        encryptedChat.user_id = encryptedChat.participant_id;
        encryptedChat.seq_in = -2;
        encryptedChat.seq_out = 1;
        encryptedChat.a_or_b = bArr;
        secretChatHelper.getMessagesController().putEncryptedChat(encryptedChat, false);
        TLRPC.TL_dialog tL_dialog = new TLRPC.TL_dialog();
        tL_dialog.id = DialogObject.makeEncryptedDialogId(encryptedChat.id);
        tL_dialog.unread_count = 0;
        tL_dialog.top_message = 0;
        tL_dialog.last_message_date = secretChatHelper.getConnectionsManager().getCurrentTime();
        secretChatHelper.getMessagesController().dialogs_dict.put(tL_dialog.id, tL_dialog);
        secretChatHelper.getMessagesController().allDialogs.add(tL_dialog);
        secretChatHelper.getMessagesController().sortDialogs(null);
        secretChatHelper.getMessagesStorage().putEncryptedChat(encryptedChat, user, tL_dialog);
        secretChatHelper.getNotificationCenter().postNotificationName(NotificationCenter.dialogsNeedReload, new Object[0]);
        secretChatHelper.getNotificationCenter().postNotificationName(NotificationCenter.encryptedChatCreated, encryptedChat);
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() throws InterruptedException {
                SecretChatHelper.m986$r8$lambda$HCizDH_TaDqYc_MCnFFPyCrfe4(this.f$0);
            }
        });
    }

    public static void m986$r8$lambda$HCizDH_TaDqYc_MCnFFPyCrfe4(SecretChatHelper secretChatHelper) throws InterruptedException {
        if (secretChatHelper.delayedEncryptedChatUpdates.isEmpty()) {
            return;
        }
        secretChatHelper.getMessagesController().processUpdateArray(secretChatHelper.delayedEncryptedChatUpdates, null, null, false, 0);
        secretChatHelper.delayedEncryptedChatUpdates.clear();
    }

    public static void m998$r8$lambda$rIG46ga8d7JXGQrccavketIhS8(SecretChatHelper secretChatHelper, Context context, AlertDialog alertDialog) {
        secretChatHelper.getClass();
        if (((Activity) context).isFinishing()) {
            return;
        }
        secretChatHelper.startingSecretChat = false;
        try {
            alertDialog.dismiss();
        } catch (Exception e) {
            FileLog.e(e);
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(LocaleController.getString(R.string.AppName));
        builder.setMessage(LocaleController.getString(R.string.CreateEncryptedChatError));
        builder.setPositiveButton(LocaleController.getString(R.string.OK), null);
        builder.show().setCanceledOnTouchOutside(true);
    }

    public static void $r8$lambda$KcuKuytzGiwIUDTSH9rxXbsoi4g(SecretChatHelper secretChatHelper, Context context, AlertDialog alertDialog) {
        secretChatHelper.startingSecretChat = false;
        if (((Activity) context).isFinishing()) {
            return;
        }
        try {
            alertDialog.dismiss();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }
}
