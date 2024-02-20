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
import java.util.Comparator;
import java.util.Locale;
import org.telegram.SQLite.SQLiteCursor;
import org.telegram.messenger.SecretChatHelper;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.support.LongSparseIntArray;
import org.telegram.tgnet.AbstractSerializedData;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.NativeByteBuffer;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC$DecryptedMessage;
import org.telegram.tgnet.TLRPC$DecryptedMessageAction;
import org.telegram.tgnet.TLRPC$DecryptedMessageMedia;
import org.telegram.tgnet.TLRPC$Dialog;
import org.telegram.tgnet.TLRPC$Document;
import org.telegram.tgnet.TLRPC$EncryptedChat;
import org.telegram.tgnet.TLRPC$EncryptedFile;
import org.telegram.tgnet.TLRPC$InputEncryptedFile;
import org.telegram.tgnet.TLRPC$Message;
import org.telegram.tgnet.TLRPC$MessageAction;
import org.telegram.tgnet.TLRPC$MessageMedia;
import org.telegram.tgnet.TLRPC$Photo;
import org.telegram.tgnet.TLRPC$PhotoSize;
import org.telegram.tgnet.TLRPC$TL_decryptedMessageActionAbortKey;
import org.telegram.tgnet.TLRPC$TL_decryptedMessageActionAcceptKey;
import org.telegram.tgnet.TLRPC$TL_decryptedMessageActionCommitKey;
import org.telegram.tgnet.TLRPC$TL_decryptedMessageActionDeleteMessages;
import org.telegram.tgnet.TLRPC$TL_decryptedMessageActionFlushHistory;
import org.telegram.tgnet.TLRPC$TL_decryptedMessageActionNoop;
import org.telegram.tgnet.TLRPC$TL_decryptedMessageActionNotifyLayer;
import org.telegram.tgnet.TLRPC$TL_decryptedMessageActionReadMessages;
import org.telegram.tgnet.TLRPC$TL_decryptedMessageActionRequestKey;
import org.telegram.tgnet.TLRPC$TL_decryptedMessageActionResend;
import org.telegram.tgnet.TLRPC$TL_decryptedMessageActionScreenshotMessages;
import org.telegram.tgnet.TLRPC$TL_decryptedMessageActionSetMessageTTL;
import org.telegram.tgnet.TLRPC$TL_decryptedMessageLayer;
import org.telegram.tgnet.TLRPC$TL_decryptedMessageService;
import org.telegram.tgnet.TLRPC$TL_dialog;
import org.telegram.tgnet.TLRPC$TL_documentEncrypted;
import org.telegram.tgnet.TLRPC$TL_encryptedChat;
import org.telegram.tgnet.TLRPC$TL_encryptedChatDiscarded;
import org.telegram.tgnet.TLRPC$TL_encryptedChatRequested;
import org.telegram.tgnet.TLRPC$TL_encryptedChatWaiting;
import org.telegram.tgnet.TLRPC$TL_encryptedFile;
import org.telegram.tgnet.TLRPC$TL_error;
import org.telegram.tgnet.TLRPC$TL_fileEncryptedLocation;
import org.telegram.tgnet.TLRPC$TL_inputEncryptedChat;
import org.telegram.tgnet.TLRPC$TL_messageEncryptedAction;
import org.telegram.tgnet.TLRPC$TL_messageMediaDocument;
import org.telegram.tgnet.TLRPC$TL_messageMediaPhoto;
import org.telegram.tgnet.TLRPC$TL_messageService;
import org.telegram.tgnet.TLRPC$TL_messages_acceptEncryption;
import org.telegram.tgnet.TLRPC$TL_messages_dhConfig;
import org.telegram.tgnet.TLRPC$TL_messages_discardEncryption;
import org.telegram.tgnet.TLRPC$TL_messages_getDhConfig;
import org.telegram.tgnet.TLRPC$TL_messages_requestEncryption;
import org.telegram.tgnet.TLRPC$TL_messages_sendEncrypted;
import org.telegram.tgnet.TLRPC$TL_messages_sendEncryptedFile;
import org.telegram.tgnet.TLRPC$TL_messages_sendEncryptedMultiMedia;
import org.telegram.tgnet.TLRPC$TL_messages_sendEncryptedService;
import org.telegram.tgnet.TLRPC$TL_peerUser;
import org.telegram.tgnet.TLRPC$TL_photoSizeEmpty;
import org.telegram.tgnet.TLRPC$TL_updateEncryption;
import org.telegram.tgnet.TLRPC$Update;
import org.telegram.tgnet.TLRPC$User;
import org.telegram.tgnet.TLRPC$messages_DhConfig;
import org.telegram.tgnet.TLRPC$messages_SentEncryptedMessage;
import org.telegram.ui.ActionBar.AlertDialog;
public class SecretChatHelper extends BaseController {
    public static int CURRENT_SECRET_CHAT_LAYER = 151;
    private static volatile SecretChatHelper[] Instance = new SecretChatHelper[4];
    private SparseArray<TLRPC$EncryptedChat> acceptingChats;
    public ArrayList<TLRPC$Update> delayedEncryptedChatUpdates;
    private ArrayList<Long> pendingEncMessagesToDelete;
    private SparseArray<ArrayList<TLRPC$Update>> pendingSecretMessages;
    private SparseArray<SparseIntArray> requestedHoles;
    private SparseArray<ArrayList<TL_decryptedMessageHolder>> secretHolesQueue;
    private ArrayList<Integer> sendingNotifyLayer;
    private boolean startingSecretChat;

    public static class TL_decryptedMessageHolder extends TLObject {
        public static int constructor = 1431655929;
        public int date;
        public int decryptedWithVersion;
        public TLRPC$EncryptedFile file;
        public TLRPC$TL_decryptedMessageLayer layer;
        public boolean new_key_used;

        @Override
        public void readParams(AbstractSerializedData abstractSerializedData, boolean z) {
            abstractSerializedData.readInt64(z);
            this.date = abstractSerializedData.readInt32(z);
            this.layer = TLRPC$TL_decryptedMessageLayer.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
            if (abstractSerializedData.readBool(z)) {
                this.file = TLRPC$EncryptedFile.TLdeserialize(abstractSerializedData, abstractSerializedData.readInt32(z), z);
            }
            this.new_key_used = abstractSerializedData.readBool(z);
        }

        @Override
        public void serializeToStream(AbstractSerializedData abstractSerializedData) {
            abstractSerializedData.writeInt32(constructor);
            abstractSerializedData.writeInt64(0L);
            abstractSerializedData.writeInt32(this.date);
            this.layer.serializeToStream(abstractSerializedData);
            abstractSerializedData.writeBool(this.file != null);
            TLRPC$EncryptedFile tLRPC$EncryptedFile = this.file;
            if (tLRPC$EncryptedFile != null) {
                tLRPC$EncryptedFile.serializeToStream(abstractSerializedData);
            }
            abstractSerializedData.writeBool(this.new_key_used);
        }
    }

    public static SecretChatHelper getInstance(int i) {
        SecretChatHelper secretChatHelper = Instance[i];
        if (secretChatHelper == null) {
            synchronized (SecretChatHelper.class) {
                secretChatHelper = Instance[i];
                if (secretChatHelper == null) {
                    SecretChatHelper[] secretChatHelperArr = Instance;
                    SecretChatHelper secretChatHelper2 = new SecretChatHelper(i);
                    secretChatHelperArr[i] = secretChatHelper2;
                    secretChatHelper = secretChatHelper2;
                }
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

    public void processPendingEncMessages() {
        if (this.pendingEncMessagesToDelete.isEmpty()) {
            return;
        }
        final ArrayList arrayList = new ArrayList(this.pendingEncMessagesToDelete);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                SecretChatHelper.this.lambda$processPendingEncMessages$0(arrayList);
            }
        });
        getMessagesStorage().markMessagesAsDeletedByRandoms(new ArrayList<>(this.pendingEncMessagesToDelete));
        this.pendingEncMessagesToDelete.clear();
    }

    public void lambda$processPendingEncMessages$0(ArrayList arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            MessageObject messageObject = getMessagesController().dialogMessagesByRandomIds.get(((Long) arrayList.get(i)).longValue());
            if (messageObject != null) {
                messageObject.deleted = true;
            }
        }
    }

    private TLRPC$TL_messageService createServiceSecretMessage(TLRPC$EncryptedChat tLRPC$EncryptedChat, TLRPC$DecryptedMessageAction tLRPC$DecryptedMessageAction) {
        TLRPC$TL_messageService tLRPC$TL_messageService = new TLRPC$TL_messageService();
        TLRPC$TL_messageEncryptedAction tLRPC$TL_messageEncryptedAction = new TLRPC$TL_messageEncryptedAction();
        tLRPC$TL_messageService.action = tLRPC$TL_messageEncryptedAction;
        tLRPC$TL_messageEncryptedAction.encryptedAction = tLRPC$DecryptedMessageAction;
        int newMessageId = getUserConfig().getNewMessageId();
        tLRPC$TL_messageService.id = newMessageId;
        tLRPC$TL_messageService.local_id = newMessageId;
        TLRPC$TL_peerUser tLRPC$TL_peerUser = new TLRPC$TL_peerUser();
        tLRPC$TL_messageService.from_id = tLRPC$TL_peerUser;
        tLRPC$TL_peerUser.user_id = getUserConfig().getClientUserId();
        tLRPC$TL_messageService.unread = true;
        tLRPC$TL_messageService.out = true;
        tLRPC$TL_messageService.flags = LiteMode.FLAG_CHAT_BLUR;
        tLRPC$TL_messageService.dialog_id = DialogObject.makeEncryptedDialogId(tLRPC$EncryptedChat.id);
        tLRPC$TL_messageService.peer_id = new TLRPC$TL_peerUser();
        tLRPC$TL_messageService.send_state = 1;
        if (tLRPC$EncryptedChat.participant_id == getUserConfig().getClientUserId()) {
            tLRPC$TL_messageService.peer_id.user_id = tLRPC$EncryptedChat.admin_id;
        } else {
            tLRPC$TL_messageService.peer_id.user_id = tLRPC$EncryptedChat.participant_id;
        }
        if ((tLRPC$DecryptedMessageAction instanceof TLRPC$TL_decryptedMessageActionScreenshotMessages) || (tLRPC$DecryptedMessageAction instanceof TLRPC$TL_decryptedMessageActionSetMessageTTL)) {
            tLRPC$TL_messageService.date = getConnectionsManager().getCurrentTime();
        } else {
            tLRPC$TL_messageService.date = 0;
        }
        tLRPC$TL_messageService.random_id = getSendMessagesHelper().getNextRandomId();
        getUserConfig().saveConfig(false);
        ArrayList<TLRPC$Message> arrayList = new ArrayList<>();
        arrayList.add(tLRPC$TL_messageService);
        getMessagesStorage().putMessages(arrayList, false, true, true, 0, false, 0, 0L);
        return tLRPC$TL_messageService;
    }

    public void sendMessagesReadMessage(TLRPC$EncryptedChat tLRPC$EncryptedChat, ArrayList<Long> arrayList, TLRPC$Message tLRPC$Message) {
        if (tLRPC$EncryptedChat instanceof TLRPC$TL_encryptedChat) {
            TLRPC$TL_decryptedMessageService tLRPC$TL_decryptedMessageService = new TLRPC$TL_decryptedMessageService();
            if (tLRPC$Message != null) {
                tLRPC$TL_decryptedMessageService.action = tLRPC$Message.action.encryptedAction;
            } else {
                TLRPC$TL_decryptedMessageActionReadMessages tLRPC$TL_decryptedMessageActionReadMessages = new TLRPC$TL_decryptedMessageActionReadMessages();
                tLRPC$TL_decryptedMessageService.action = tLRPC$TL_decryptedMessageActionReadMessages;
                tLRPC$TL_decryptedMessageActionReadMessages.random_ids = arrayList;
                tLRPC$Message = createServiceSecretMessage(tLRPC$EncryptedChat, tLRPC$TL_decryptedMessageActionReadMessages);
            }
            TLRPC$Message tLRPC$Message2 = tLRPC$Message;
            tLRPC$TL_decryptedMessageService.random_id = tLRPC$Message2.random_id;
            performSendEncryptedRequest(tLRPC$TL_decryptedMessageService, tLRPC$Message2, tLRPC$EncryptedChat, null, null, null);
        }
    }

    public void processUpdateEncryption(TLRPC$TL_updateEncryption tLRPC$TL_updateEncryption, ConcurrentHashMap<Long, TLRPC$User> concurrentHashMap) {
        byte[] bArr;
        final TLRPC$EncryptedChat tLRPC$EncryptedChat = tLRPC$TL_updateEncryption.chat;
        final long makeEncryptedDialogId = DialogObject.makeEncryptedDialogId(tLRPC$EncryptedChat.id);
        final TLRPC$EncryptedChat encryptedChatDB = getMessagesController().getEncryptedChatDB(tLRPC$EncryptedChat.id, false);
        if ((tLRPC$EncryptedChat instanceof TLRPC$TL_encryptedChatRequested) && encryptedChatDB == null) {
            long j = tLRPC$EncryptedChat.participant_id;
            if (j == getUserConfig().getClientUserId()) {
                j = tLRPC$EncryptedChat.admin_id;
            }
            TLRPC$User user = getMessagesController().getUser(Long.valueOf(j));
            if (user == null) {
                user = concurrentHashMap.get(Long.valueOf(j));
            }
            tLRPC$EncryptedChat.user_id = j;
            final TLRPC$TL_dialog tLRPC$TL_dialog = new TLRPC$TL_dialog();
            tLRPC$TL_dialog.id = makeEncryptedDialogId;
            tLRPC$TL_dialog.folder_id = tLRPC$EncryptedChat.folder_id;
            tLRPC$TL_dialog.unread_count = 0;
            tLRPC$TL_dialog.top_message = 0;
            tLRPC$TL_dialog.last_message_date = tLRPC$TL_updateEncryption.date;
            getMessagesController().putEncryptedChat(tLRPC$EncryptedChat, false);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    SecretChatHelper.this.lambda$processUpdateEncryption$1(tLRPC$TL_dialog, makeEncryptedDialogId);
                }
            });
            getMessagesStorage().putEncryptedChat(tLRPC$EncryptedChat, user, tLRPC$TL_dialog);
            acceptSecretChat(tLRPC$EncryptedChat);
        } else if (tLRPC$EncryptedChat instanceof TLRPC$TL_encryptedChat) {
            if ((encryptedChatDB instanceof TLRPC$TL_encryptedChatWaiting) && ((bArr = encryptedChatDB.auth_key) == null || bArr.length == 1)) {
                tLRPC$EncryptedChat.a_or_b = encryptedChatDB.a_or_b;
                tLRPC$EncryptedChat.user_id = encryptedChatDB.user_id;
                processAcceptedSecretChat(tLRPC$EncryptedChat);
            } else if (encryptedChatDB == null && this.startingSecretChat) {
                this.delayedEncryptedChatUpdates.add(tLRPC$TL_updateEncryption);
            }
        } else {
            if (encryptedChatDB != null) {
                tLRPC$EncryptedChat.user_id = encryptedChatDB.user_id;
                tLRPC$EncryptedChat.auth_key = encryptedChatDB.auth_key;
                tLRPC$EncryptedChat.key_create_date = encryptedChatDB.key_create_date;
                tLRPC$EncryptedChat.key_use_count_in = encryptedChatDB.key_use_count_in;
                tLRPC$EncryptedChat.key_use_count_out = encryptedChatDB.key_use_count_out;
                tLRPC$EncryptedChat.ttl = encryptedChatDB.ttl;
                tLRPC$EncryptedChat.seq_in = encryptedChatDB.seq_in;
                tLRPC$EncryptedChat.seq_out = encryptedChatDB.seq_out;
                tLRPC$EncryptedChat.admin_id = encryptedChatDB.admin_id;
                tLRPC$EncryptedChat.mtproto_seq = encryptedChatDB.mtproto_seq;
            }
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    SecretChatHelper.this.lambda$processUpdateEncryption$2(encryptedChatDB, tLRPC$EncryptedChat);
                }
            });
        }
        if ((tLRPC$EncryptedChat instanceof TLRPC$TL_encryptedChatDiscarded) && tLRPC$EncryptedChat.history_deleted) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    SecretChatHelper.this.lambda$processUpdateEncryption$3(makeEncryptedDialogId);
                }
            });
        }
    }

    public void lambda$processUpdateEncryption$1(TLRPC$Dialog tLRPC$Dialog, long j) {
        if (tLRPC$Dialog.folder_id == 1) {
            SharedPreferences.Editor edit = MessagesController.getNotificationsSettings(this.currentAccount).edit();
            edit.putBoolean("dialog_bar_archived" + j, true);
            edit.commit();
        }
        getMessagesController().dialogs_dict.put(tLRPC$Dialog.id, tLRPC$Dialog);
        getMessagesController().allDialogs.add(tLRPC$Dialog);
        getMessagesController().sortDialogs(null);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
    }

    public void lambda$processUpdateEncryption$2(TLRPC$EncryptedChat tLRPC$EncryptedChat, TLRPC$EncryptedChat tLRPC$EncryptedChat2) {
        if (tLRPC$EncryptedChat != null) {
            getMessagesController().putEncryptedChat(tLRPC$EncryptedChat2, false);
        }
        getMessagesStorage().updateEncryptedChat(tLRPC$EncryptedChat2);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.encryptedChatUpdated, tLRPC$EncryptedChat2);
    }

    public void lambda$processUpdateEncryption$3(long j) {
        getMessagesController().deleteDialog(j, 0);
    }

    public void sendMessagesDeleteMessage(TLRPC$EncryptedChat tLRPC$EncryptedChat, ArrayList<Long> arrayList, TLRPC$Message tLRPC$Message) {
        if (tLRPC$EncryptedChat instanceof TLRPC$TL_encryptedChat) {
            TLRPC$TL_decryptedMessageService tLRPC$TL_decryptedMessageService = new TLRPC$TL_decryptedMessageService();
            if (tLRPC$Message != null) {
                tLRPC$TL_decryptedMessageService.action = tLRPC$Message.action.encryptedAction;
            } else {
                TLRPC$TL_decryptedMessageActionDeleteMessages tLRPC$TL_decryptedMessageActionDeleteMessages = new TLRPC$TL_decryptedMessageActionDeleteMessages();
                tLRPC$TL_decryptedMessageService.action = tLRPC$TL_decryptedMessageActionDeleteMessages;
                tLRPC$TL_decryptedMessageActionDeleteMessages.random_ids = arrayList;
                tLRPC$Message = createServiceSecretMessage(tLRPC$EncryptedChat, tLRPC$TL_decryptedMessageActionDeleteMessages);
            }
            TLRPC$Message tLRPC$Message2 = tLRPC$Message;
            tLRPC$TL_decryptedMessageService.random_id = tLRPC$Message2.random_id;
            performSendEncryptedRequest(tLRPC$TL_decryptedMessageService, tLRPC$Message2, tLRPC$EncryptedChat, null, null, null);
        }
    }

    public void sendClearHistoryMessage(TLRPC$EncryptedChat tLRPC$EncryptedChat, TLRPC$Message tLRPC$Message) {
        if (tLRPC$EncryptedChat instanceof TLRPC$TL_encryptedChat) {
            TLRPC$TL_decryptedMessageService tLRPC$TL_decryptedMessageService = new TLRPC$TL_decryptedMessageService();
            if (tLRPC$Message != null) {
                tLRPC$TL_decryptedMessageService.action = tLRPC$Message.action.encryptedAction;
            } else {
                TLRPC$TL_decryptedMessageActionFlushHistory tLRPC$TL_decryptedMessageActionFlushHistory = new TLRPC$TL_decryptedMessageActionFlushHistory();
                tLRPC$TL_decryptedMessageService.action = tLRPC$TL_decryptedMessageActionFlushHistory;
                tLRPC$Message = createServiceSecretMessage(tLRPC$EncryptedChat, tLRPC$TL_decryptedMessageActionFlushHistory);
            }
            TLRPC$Message tLRPC$Message2 = tLRPC$Message;
            tLRPC$TL_decryptedMessageService.random_id = tLRPC$Message2.random_id;
            performSendEncryptedRequest(tLRPC$TL_decryptedMessageService, tLRPC$Message2, tLRPC$EncryptedChat, null, null, null);
        }
    }

    public void sendNotifyLayerMessage(TLRPC$EncryptedChat tLRPC$EncryptedChat, TLRPC$Message tLRPC$Message) {
        if ((tLRPC$EncryptedChat instanceof TLRPC$TL_encryptedChat) && !this.sendingNotifyLayer.contains(Integer.valueOf(tLRPC$EncryptedChat.id))) {
            this.sendingNotifyLayer.add(Integer.valueOf(tLRPC$EncryptedChat.id));
            TLRPC$TL_decryptedMessageService tLRPC$TL_decryptedMessageService = new TLRPC$TL_decryptedMessageService();
            if (tLRPC$Message != null) {
                tLRPC$TL_decryptedMessageService.action = tLRPC$Message.action.encryptedAction;
            } else {
                TLRPC$TL_decryptedMessageActionNotifyLayer tLRPC$TL_decryptedMessageActionNotifyLayer = new TLRPC$TL_decryptedMessageActionNotifyLayer();
                tLRPC$TL_decryptedMessageService.action = tLRPC$TL_decryptedMessageActionNotifyLayer;
                tLRPC$TL_decryptedMessageActionNotifyLayer.layer = CURRENT_SECRET_CHAT_LAYER;
                tLRPC$Message = createServiceSecretMessage(tLRPC$EncryptedChat, tLRPC$TL_decryptedMessageActionNotifyLayer);
            }
            TLRPC$Message tLRPC$Message2 = tLRPC$Message;
            tLRPC$TL_decryptedMessageService.random_id = tLRPC$Message2.random_id;
            performSendEncryptedRequest(tLRPC$TL_decryptedMessageService, tLRPC$Message2, tLRPC$EncryptedChat, null, null, null);
        }
    }

    public void sendRequestKeyMessage(TLRPC$EncryptedChat tLRPC$EncryptedChat, TLRPC$Message tLRPC$Message) {
        if (tLRPC$EncryptedChat instanceof TLRPC$TL_encryptedChat) {
            TLRPC$TL_decryptedMessageService tLRPC$TL_decryptedMessageService = new TLRPC$TL_decryptedMessageService();
            if (tLRPC$Message != null) {
                tLRPC$TL_decryptedMessageService.action = tLRPC$Message.action.encryptedAction;
            } else {
                TLRPC$TL_decryptedMessageActionRequestKey tLRPC$TL_decryptedMessageActionRequestKey = new TLRPC$TL_decryptedMessageActionRequestKey();
                tLRPC$TL_decryptedMessageService.action = tLRPC$TL_decryptedMessageActionRequestKey;
                tLRPC$TL_decryptedMessageActionRequestKey.exchange_id = tLRPC$EncryptedChat.exchange_id;
                tLRPC$TL_decryptedMessageActionRequestKey.g_a = tLRPC$EncryptedChat.g_a;
                tLRPC$Message = createServiceSecretMessage(tLRPC$EncryptedChat, tLRPC$TL_decryptedMessageActionRequestKey);
            }
            TLRPC$Message tLRPC$Message2 = tLRPC$Message;
            tLRPC$TL_decryptedMessageService.random_id = tLRPC$Message2.random_id;
            performSendEncryptedRequest(tLRPC$TL_decryptedMessageService, tLRPC$Message2, tLRPC$EncryptedChat, null, null, null);
        }
    }

    public void sendAcceptKeyMessage(TLRPC$EncryptedChat tLRPC$EncryptedChat, TLRPC$Message tLRPC$Message) {
        if (tLRPC$EncryptedChat instanceof TLRPC$TL_encryptedChat) {
            TLRPC$TL_decryptedMessageService tLRPC$TL_decryptedMessageService = new TLRPC$TL_decryptedMessageService();
            if (tLRPC$Message != null) {
                tLRPC$TL_decryptedMessageService.action = tLRPC$Message.action.encryptedAction;
            } else {
                TLRPC$TL_decryptedMessageActionAcceptKey tLRPC$TL_decryptedMessageActionAcceptKey = new TLRPC$TL_decryptedMessageActionAcceptKey();
                tLRPC$TL_decryptedMessageService.action = tLRPC$TL_decryptedMessageActionAcceptKey;
                tLRPC$TL_decryptedMessageActionAcceptKey.exchange_id = tLRPC$EncryptedChat.exchange_id;
                tLRPC$TL_decryptedMessageActionAcceptKey.key_fingerprint = tLRPC$EncryptedChat.future_key_fingerprint;
                tLRPC$TL_decryptedMessageActionAcceptKey.g_b = tLRPC$EncryptedChat.g_a_or_b;
                tLRPC$Message = createServiceSecretMessage(tLRPC$EncryptedChat, tLRPC$TL_decryptedMessageActionAcceptKey);
            }
            TLRPC$Message tLRPC$Message2 = tLRPC$Message;
            tLRPC$TL_decryptedMessageService.random_id = tLRPC$Message2.random_id;
            performSendEncryptedRequest(tLRPC$TL_decryptedMessageService, tLRPC$Message2, tLRPC$EncryptedChat, null, null, null);
        }
    }

    public void sendCommitKeyMessage(TLRPC$EncryptedChat tLRPC$EncryptedChat, TLRPC$Message tLRPC$Message) {
        if (tLRPC$EncryptedChat instanceof TLRPC$TL_encryptedChat) {
            TLRPC$TL_decryptedMessageService tLRPC$TL_decryptedMessageService = new TLRPC$TL_decryptedMessageService();
            if (tLRPC$Message != null) {
                tLRPC$TL_decryptedMessageService.action = tLRPC$Message.action.encryptedAction;
            } else {
                TLRPC$TL_decryptedMessageActionCommitKey tLRPC$TL_decryptedMessageActionCommitKey = new TLRPC$TL_decryptedMessageActionCommitKey();
                tLRPC$TL_decryptedMessageService.action = tLRPC$TL_decryptedMessageActionCommitKey;
                tLRPC$TL_decryptedMessageActionCommitKey.exchange_id = tLRPC$EncryptedChat.exchange_id;
                tLRPC$TL_decryptedMessageActionCommitKey.key_fingerprint = tLRPC$EncryptedChat.future_key_fingerprint;
                tLRPC$Message = createServiceSecretMessage(tLRPC$EncryptedChat, tLRPC$TL_decryptedMessageActionCommitKey);
            }
            TLRPC$Message tLRPC$Message2 = tLRPC$Message;
            tLRPC$TL_decryptedMessageService.random_id = tLRPC$Message2.random_id;
            performSendEncryptedRequest(tLRPC$TL_decryptedMessageService, tLRPC$Message2, tLRPC$EncryptedChat, null, null, null);
        }
    }

    public void sendAbortKeyMessage(TLRPC$EncryptedChat tLRPC$EncryptedChat, TLRPC$Message tLRPC$Message, long j) {
        if (tLRPC$EncryptedChat instanceof TLRPC$TL_encryptedChat) {
            TLRPC$TL_decryptedMessageService tLRPC$TL_decryptedMessageService = new TLRPC$TL_decryptedMessageService();
            if (tLRPC$Message != null) {
                tLRPC$TL_decryptedMessageService.action = tLRPC$Message.action.encryptedAction;
            } else {
                TLRPC$TL_decryptedMessageActionAbortKey tLRPC$TL_decryptedMessageActionAbortKey = new TLRPC$TL_decryptedMessageActionAbortKey();
                tLRPC$TL_decryptedMessageService.action = tLRPC$TL_decryptedMessageActionAbortKey;
                tLRPC$TL_decryptedMessageActionAbortKey.exchange_id = j;
                tLRPC$Message = createServiceSecretMessage(tLRPC$EncryptedChat, tLRPC$TL_decryptedMessageActionAbortKey);
            }
            TLRPC$Message tLRPC$Message2 = tLRPC$Message;
            tLRPC$TL_decryptedMessageService.random_id = tLRPC$Message2.random_id;
            performSendEncryptedRequest(tLRPC$TL_decryptedMessageService, tLRPC$Message2, tLRPC$EncryptedChat, null, null, null);
        }
    }

    public void sendNoopMessage(TLRPC$EncryptedChat tLRPC$EncryptedChat, TLRPC$Message tLRPC$Message) {
        if (tLRPC$EncryptedChat instanceof TLRPC$TL_encryptedChat) {
            TLRPC$TL_decryptedMessageService tLRPC$TL_decryptedMessageService = new TLRPC$TL_decryptedMessageService();
            if (tLRPC$Message != null) {
                tLRPC$TL_decryptedMessageService.action = tLRPC$Message.action.encryptedAction;
            } else {
                TLRPC$TL_decryptedMessageActionNoop tLRPC$TL_decryptedMessageActionNoop = new TLRPC$TL_decryptedMessageActionNoop();
                tLRPC$TL_decryptedMessageService.action = tLRPC$TL_decryptedMessageActionNoop;
                tLRPC$Message = createServiceSecretMessage(tLRPC$EncryptedChat, tLRPC$TL_decryptedMessageActionNoop);
            }
            TLRPC$Message tLRPC$Message2 = tLRPC$Message;
            tLRPC$TL_decryptedMessageService.random_id = tLRPC$Message2.random_id;
            performSendEncryptedRequest(tLRPC$TL_decryptedMessageService, tLRPC$Message2, tLRPC$EncryptedChat, null, null, null);
        }
    }

    public void sendResendMessage(TLRPC$EncryptedChat tLRPC$EncryptedChat, int i, int i2, TLRPC$Message tLRPC$Message) {
        if (tLRPC$EncryptedChat instanceof TLRPC$TL_encryptedChat) {
            SparseIntArray sparseIntArray = this.requestedHoles.get(tLRPC$EncryptedChat.id);
            if (sparseIntArray == null || sparseIntArray.indexOfKey(i) < 0) {
                if (sparseIntArray == null) {
                    sparseIntArray = new SparseIntArray();
                    this.requestedHoles.put(tLRPC$EncryptedChat.id, sparseIntArray);
                }
                sparseIntArray.put(i, i2);
                TLRPC$TL_decryptedMessageService tLRPC$TL_decryptedMessageService = new TLRPC$TL_decryptedMessageService();
                if (tLRPC$Message != null) {
                    tLRPC$TL_decryptedMessageService.action = tLRPC$Message.action.encryptedAction;
                } else {
                    TLRPC$TL_decryptedMessageActionResend tLRPC$TL_decryptedMessageActionResend = new TLRPC$TL_decryptedMessageActionResend();
                    tLRPC$TL_decryptedMessageService.action = tLRPC$TL_decryptedMessageActionResend;
                    tLRPC$TL_decryptedMessageActionResend.start_seq_no = i;
                    tLRPC$TL_decryptedMessageActionResend.end_seq_no = i2;
                    tLRPC$Message = createServiceSecretMessage(tLRPC$EncryptedChat, tLRPC$TL_decryptedMessageActionResend);
                }
                TLRPC$Message tLRPC$Message2 = tLRPC$Message;
                tLRPC$TL_decryptedMessageService.random_id = tLRPC$Message2.random_id;
                performSendEncryptedRequest(tLRPC$TL_decryptedMessageService, tLRPC$Message2, tLRPC$EncryptedChat, null, null, null);
            }
        }
    }

    public void sendTTLMessage(TLRPC$EncryptedChat tLRPC$EncryptedChat, TLRPC$Message tLRPC$Message) {
        if (tLRPC$EncryptedChat instanceof TLRPC$TL_encryptedChat) {
            TLRPC$TL_decryptedMessageService tLRPC$TL_decryptedMessageService = new TLRPC$TL_decryptedMessageService();
            if (tLRPC$Message != null) {
                tLRPC$TL_decryptedMessageService.action = tLRPC$Message.action.encryptedAction;
            } else {
                TLRPC$TL_decryptedMessageActionSetMessageTTL tLRPC$TL_decryptedMessageActionSetMessageTTL = new TLRPC$TL_decryptedMessageActionSetMessageTTL();
                tLRPC$TL_decryptedMessageService.action = tLRPC$TL_decryptedMessageActionSetMessageTTL;
                tLRPC$TL_decryptedMessageActionSetMessageTTL.ttl_seconds = tLRPC$EncryptedChat.ttl;
                tLRPC$Message = createServiceSecretMessage(tLRPC$EncryptedChat, tLRPC$TL_decryptedMessageActionSetMessageTTL);
                MessageObject messageObject = new MessageObject(this.currentAccount, tLRPC$Message, false, false);
                messageObject.messageOwner.send_state = 1;
                messageObject.wasJustSent = true;
                ArrayList<MessageObject> arrayList = new ArrayList<>();
                arrayList.add(messageObject);
                getMessagesController().updateInterfaceWithMessages(tLRPC$Message.dialog_id, arrayList, false);
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
            }
            TLRPC$Message tLRPC$Message2 = tLRPC$Message;
            tLRPC$TL_decryptedMessageService.random_id = tLRPC$Message2.random_id;
            performSendEncryptedRequest(tLRPC$TL_decryptedMessageService, tLRPC$Message2, tLRPC$EncryptedChat, null, null, null);
        }
    }

    public void sendScreenshotMessage(TLRPC$EncryptedChat tLRPC$EncryptedChat, ArrayList<Long> arrayList, TLRPC$Message tLRPC$Message) {
        if (tLRPC$EncryptedChat instanceof TLRPC$TL_encryptedChat) {
            TLRPC$TL_decryptedMessageService tLRPC$TL_decryptedMessageService = new TLRPC$TL_decryptedMessageService();
            if (tLRPC$Message != null) {
                tLRPC$TL_decryptedMessageService.action = tLRPC$Message.action.encryptedAction;
            } else {
                TLRPC$TL_decryptedMessageActionScreenshotMessages tLRPC$TL_decryptedMessageActionScreenshotMessages = new TLRPC$TL_decryptedMessageActionScreenshotMessages();
                tLRPC$TL_decryptedMessageService.action = tLRPC$TL_decryptedMessageActionScreenshotMessages;
                tLRPC$TL_decryptedMessageActionScreenshotMessages.random_ids = arrayList;
                tLRPC$Message = createServiceSecretMessage(tLRPC$EncryptedChat, tLRPC$TL_decryptedMessageActionScreenshotMessages);
                MessageObject messageObject = new MessageObject(this.currentAccount, tLRPC$Message, false, false);
                messageObject.messageOwner.send_state = 1;
                messageObject.wasJustSent = true;
                ArrayList<MessageObject> arrayList2 = new ArrayList<>();
                arrayList2.add(messageObject);
                getMessagesController().updateInterfaceWithMessages(tLRPC$Message.dialog_id, arrayList2, false);
                getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
            }
            TLRPC$Message tLRPC$Message2 = tLRPC$Message;
            tLRPC$TL_decryptedMessageService.random_id = tLRPC$Message2.random_id;
            performSendEncryptedRequest(tLRPC$TL_decryptedMessageService, tLRPC$Message2, tLRPC$EncryptedChat, null, null, null);
        }
    }

    private void updateMediaPaths(MessageObject messageObject, TLRPC$EncryptedFile tLRPC$EncryptedFile, TLRPC$DecryptedMessage tLRPC$DecryptedMessage, String str) {
        TLRPC$Document tLRPC$Document;
        TLRPC$Photo tLRPC$Photo;
        TLRPC$Message tLRPC$Message = messageObject.messageOwner;
        if (tLRPC$EncryptedFile != null) {
            TLRPC$MessageMedia tLRPC$MessageMedia = tLRPC$Message.media;
            if ((tLRPC$MessageMedia instanceof TLRPC$TL_messageMediaPhoto) && (tLRPC$Photo = tLRPC$MessageMedia.photo) != null) {
                ArrayList<TLRPC$PhotoSize> arrayList = tLRPC$Photo.sizes;
                TLRPC$PhotoSize tLRPC$PhotoSize = arrayList.get(arrayList.size() - 1);
                String str2 = tLRPC$PhotoSize.location.volume_id + "_" + tLRPC$PhotoSize.location.local_id;
                TLRPC$TL_fileEncryptedLocation tLRPC$TL_fileEncryptedLocation = new TLRPC$TL_fileEncryptedLocation();
                tLRPC$PhotoSize.location = tLRPC$TL_fileEncryptedLocation;
                TLRPC$DecryptedMessageMedia tLRPC$DecryptedMessageMedia = tLRPC$DecryptedMessage.media;
                tLRPC$TL_fileEncryptedLocation.key = tLRPC$DecryptedMessageMedia.key;
                tLRPC$TL_fileEncryptedLocation.iv = tLRPC$DecryptedMessageMedia.iv;
                tLRPC$TL_fileEncryptedLocation.dc_id = tLRPC$EncryptedFile.dc_id;
                tLRPC$TL_fileEncryptedLocation.volume_id = tLRPC$EncryptedFile.id;
                tLRPC$TL_fileEncryptedLocation.secret = tLRPC$EncryptedFile.access_hash;
                tLRPC$TL_fileEncryptedLocation.local_id = tLRPC$EncryptedFile.key_fingerprint;
                new File(FileLoader.getDirectory(4), str2 + ".jpg").renameTo(getFileLoader().getPathToAttach(tLRPC$PhotoSize));
                ImageLoader.getInstance().replaceImageInCache(str2, tLRPC$PhotoSize.location.volume_id + "_" + tLRPC$PhotoSize.location.local_id, ImageLocation.getForPhoto(tLRPC$PhotoSize, tLRPC$Message.media.photo), true);
                ArrayList<TLRPC$Message> arrayList2 = new ArrayList<>();
                arrayList2.add(tLRPC$Message);
                getMessagesStorage().putMessages(arrayList2, false, true, false, 0, false, 0, 0L);
            } else if (!(tLRPC$MessageMedia instanceof TLRPC$TL_messageMediaDocument) || (tLRPC$Document = tLRPC$MessageMedia.document) == null) {
            } else {
                tLRPC$MessageMedia.document = new TLRPC$TL_documentEncrypted();
                TLRPC$Document tLRPC$Document2 = tLRPC$Message.media.document;
                tLRPC$Document2.id = tLRPC$EncryptedFile.id;
                tLRPC$Document2.access_hash = tLRPC$EncryptedFile.access_hash;
                tLRPC$Document2.date = tLRPC$Document.date;
                tLRPC$Document2.attributes = tLRPC$Document.attributes;
                tLRPC$Document2.mime_type = tLRPC$Document.mime_type;
                tLRPC$Document2.size = tLRPC$EncryptedFile.size;
                TLRPC$DecryptedMessageMedia tLRPC$DecryptedMessageMedia2 = tLRPC$DecryptedMessage.media;
                tLRPC$Document2.key = tLRPC$DecryptedMessageMedia2.key;
                tLRPC$Document2.iv = tLRPC$DecryptedMessageMedia2.iv;
                ArrayList<TLRPC$PhotoSize> arrayList3 = tLRPC$Document.thumbs;
                tLRPC$Document2.thumbs = arrayList3;
                tLRPC$Document2.dc_id = tLRPC$EncryptedFile.dc_id;
                if (arrayList3.isEmpty()) {
                    TLRPC$TL_photoSizeEmpty tLRPC$TL_photoSizeEmpty = new TLRPC$TL_photoSizeEmpty();
                    tLRPC$TL_photoSizeEmpty.type = "s";
                    tLRPC$Message.media.document.thumbs.add(tLRPC$TL_photoSizeEmpty);
                }
                String str3 = tLRPC$Message.attachPath;
                if (str3 != null && str3.startsWith(FileLoader.getDirectory(4).getAbsolutePath()) && new File(tLRPC$Message.attachPath).renameTo(getFileLoader().getPathToAttach(tLRPC$Message.media.document))) {
                    messageObject.mediaExists = messageObject.attachPathExists;
                    messageObject.attachPathExists = false;
                    tLRPC$Message.attachPath = BuildConfig.APP_CENTER_HASH;
                }
                ArrayList<TLRPC$Message> arrayList4 = new ArrayList<>();
                arrayList4.add(tLRPC$Message);
                getMessagesStorage().putMessages(arrayList4, false, true, false, 0, 0, 0L);
            }
        }
    }

    public static boolean isSecretVisibleMessage(TLRPC$Message tLRPC$Message) {
        TLRPC$MessageAction tLRPC$MessageAction = tLRPC$Message.action;
        if (tLRPC$MessageAction instanceof TLRPC$TL_messageEncryptedAction) {
            TLRPC$DecryptedMessageAction tLRPC$DecryptedMessageAction = tLRPC$MessageAction.encryptedAction;
            if ((tLRPC$DecryptedMessageAction instanceof TLRPC$TL_decryptedMessageActionScreenshotMessages) || (tLRPC$DecryptedMessageAction instanceof TLRPC$TL_decryptedMessageActionSetMessageTTL)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isSecretInvisibleMessage(TLRPC$Message tLRPC$Message) {
        TLRPC$MessageAction tLRPC$MessageAction = tLRPC$Message.action;
        if (tLRPC$MessageAction instanceof TLRPC$TL_messageEncryptedAction) {
            TLRPC$DecryptedMessageAction tLRPC$DecryptedMessageAction = tLRPC$MessageAction.encryptedAction;
            if (!(tLRPC$DecryptedMessageAction instanceof TLRPC$TL_decryptedMessageActionScreenshotMessages) && !(tLRPC$DecryptedMessageAction instanceof TLRPC$TL_decryptedMessageActionSetMessageTTL)) {
                return true;
            }
        }
        return false;
    }

    public void performSendEncryptedRequest(TLRPC$TL_messages_sendEncryptedMultiMedia tLRPC$TL_messages_sendEncryptedMultiMedia, SendMessagesHelper.DelayedMessage delayedMessage) {
        for (int i = 0; i < tLRPC$TL_messages_sendEncryptedMultiMedia.files.size(); i++) {
            performSendEncryptedRequest(tLRPC$TL_messages_sendEncryptedMultiMedia.messages.get(i), delayedMessage.messages.get(i), delayedMessage.encryptedChat, tLRPC$TL_messages_sendEncryptedMultiMedia.files.get(i), delayedMessage.originalPaths.get(i), delayedMessage.messageObjects.get(i));
        }
    }

    public void performSendEncryptedRequest(final TLRPC$DecryptedMessage tLRPC$DecryptedMessage, final TLRPC$Message tLRPC$Message, final TLRPC$EncryptedChat tLRPC$EncryptedChat, final TLRPC$InputEncryptedFile tLRPC$InputEncryptedFile, final String str, final MessageObject messageObject) {
        if (tLRPC$DecryptedMessage == null || tLRPC$EncryptedChat.auth_key == null || (tLRPC$EncryptedChat instanceof TLRPC$TL_encryptedChatRequested) || (tLRPC$EncryptedChat instanceof TLRPC$TL_encryptedChatWaiting)) {
            return;
        }
        getSendMessagesHelper().putToSendingMessages(tLRPC$Message, false);
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                SecretChatHelper.this.lambda$performSendEncryptedRequest$8(tLRPC$EncryptedChat, tLRPC$DecryptedMessage, tLRPC$Message, tLRPC$InputEncryptedFile, messageObject, str);
            }
        });
    }

    public void lambda$performSendEncryptedRequest$8(final TLRPC$EncryptedChat tLRPC$EncryptedChat, final TLRPC$DecryptedMessage tLRPC$DecryptedMessage, final TLRPC$Message tLRPC$Message, TLRPC$InputEncryptedFile tLRPC$InputEncryptedFile, final MessageObject messageObject, final String str) {
        TLRPC$TL_messages_sendEncryptedFile tLRPC$TL_messages_sendEncryptedFile;
        TLRPC$TL_messages_sendEncryptedFile tLRPC$TL_messages_sendEncryptedFile2;
        try {
            TLRPC$TL_decryptedMessageLayer tLRPC$TL_decryptedMessageLayer = new TLRPC$TL_decryptedMessageLayer();
            tLRPC$TL_decryptedMessageLayer.layer = Math.min(Math.max(46, AndroidUtilities.getMyLayerVersion(tLRPC$EncryptedChat.layer)), Math.max(46, AndroidUtilities.getPeerLayerVersion(tLRPC$EncryptedChat.layer)));
            tLRPC$TL_decryptedMessageLayer.message = tLRPC$DecryptedMessage;
            byte[] bArr = new byte[15];
            tLRPC$TL_decryptedMessageLayer.random_bytes = bArr;
            Utilities.random.nextBytes(bArr);
            boolean z = true;
            if (tLRPC$EncryptedChat.seq_in == 0 && tLRPC$EncryptedChat.seq_out == 0) {
                if (tLRPC$EncryptedChat.admin_id == getUserConfig().getClientUserId()) {
                    tLRPC$EncryptedChat.seq_out = 1;
                    tLRPC$EncryptedChat.seq_in = -2;
                } else {
                    tLRPC$EncryptedChat.seq_in = -1;
                }
            }
            int i = tLRPC$Message.seq_in;
            if (i == 0 && tLRPC$Message.seq_out == 0) {
                int i2 = tLRPC$EncryptedChat.seq_in;
                if (i2 <= 0) {
                    i2 += 2;
                }
                tLRPC$TL_decryptedMessageLayer.in_seq_no = i2;
                int i3 = tLRPC$EncryptedChat.seq_out;
                tLRPC$TL_decryptedMessageLayer.out_seq_no = i3;
                tLRPC$EncryptedChat.seq_out = i3 + 2;
                if (tLRPC$EncryptedChat.key_create_date == 0) {
                    tLRPC$EncryptedChat.key_create_date = getConnectionsManager().getCurrentTime();
                }
                short s = (short) (tLRPC$EncryptedChat.key_use_count_out + 1);
                tLRPC$EncryptedChat.key_use_count_out = s;
                if ((s >= 100 || tLRPC$EncryptedChat.key_create_date < getConnectionsManager().getCurrentTime() - 604800) && tLRPC$EncryptedChat.exchange_id == 0 && tLRPC$EncryptedChat.future_key_fingerprint == 0) {
                    requestNewSecretChatKey(tLRPC$EncryptedChat);
                }
                getMessagesStorage().updateEncryptedChatSeq(tLRPC$EncryptedChat, false);
                tLRPC$Message.seq_in = tLRPC$TL_decryptedMessageLayer.in_seq_no;
                tLRPC$Message.seq_out = tLRPC$TL_decryptedMessageLayer.out_seq_no;
                getMessagesStorage().setMessageSeq(tLRPC$Message.id, tLRPC$Message.seq_in, tLRPC$Message.seq_out);
            } else {
                tLRPC$TL_decryptedMessageLayer.in_seq_no = i;
                tLRPC$TL_decryptedMessageLayer.out_seq_no = tLRPC$Message.seq_out;
            }
            if (BuildVars.LOGS_ENABLED) {
                FileLog.d(tLRPC$DecryptedMessage + " send message with in_seq = " + tLRPC$TL_decryptedMessageLayer.in_seq_no + " out_seq = " + tLRPC$TL_decryptedMessageLayer.out_seq_no);
            }
            int objectSize = tLRPC$TL_decryptedMessageLayer.getObjectSize();
            NativeByteBuffer nativeByteBuffer = new NativeByteBuffer(objectSize + 4);
            nativeByteBuffer.writeInt32(objectSize);
            tLRPC$TL_decryptedMessageLayer.serializeToStream(nativeByteBuffer);
            int length = nativeByteBuffer.length();
            int nextInt = (length % 16 != 0 ? 16 - (length % 16) : 0) + ((Utilities.random.nextInt(3) + 2) * 16);
            NativeByteBuffer nativeByteBuffer2 = new NativeByteBuffer(length + nextInt);
            nativeByteBuffer.position(0);
            nativeByteBuffer2.writeBytes(nativeByteBuffer);
            if (nextInt != 0) {
                byte[] bArr2 = new byte[nextInt];
                Utilities.random.nextBytes(bArr2);
                nativeByteBuffer2.writeBytes(bArr2);
            }
            byte[] bArr3 = new byte[16];
            if (tLRPC$EncryptedChat.admin_id == getUserConfig().getClientUserId()) {
                z = false;
            }
            byte[] bArr4 = tLRPC$EncryptedChat.auth_key;
            int i4 = z ? 8 : 0;
            ByteBuffer byteBuffer = nativeByteBuffer2.buffer;
            System.arraycopy(Utilities.computeSHA256(bArr4, i4 + 88, 32, byteBuffer, 0, byteBuffer.limit()), 8, bArr3, 0, 16);
            nativeByteBuffer.reuse();
            MessageKeyData generateMessageKeyData = MessageKeyData.generateMessageKeyData(tLRPC$EncryptedChat.auth_key, bArr3, z, 2);
            Utilities.aesIgeEncryption(nativeByteBuffer2.buffer, generateMessageKeyData.aesKey, generateMessageKeyData.aesIv, true, false, 0, nativeByteBuffer2.limit());
            NativeByteBuffer nativeByteBuffer3 = new NativeByteBuffer(24 + nativeByteBuffer2.length());
            nativeByteBuffer2.position(0);
            nativeByteBuffer3.writeInt64(tLRPC$EncryptedChat.key_fingerprint);
            nativeByteBuffer3.writeBytes(bArr3);
            nativeByteBuffer3.writeBytes(nativeByteBuffer2);
            nativeByteBuffer2.reuse();
            nativeByteBuffer3.position(0);
            if (tLRPC$InputEncryptedFile == null) {
                if (tLRPC$DecryptedMessage instanceof TLRPC$TL_decryptedMessageService) {
                    TLRPC$TL_messages_sendEncryptedService tLRPC$TL_messages_sendEncryptedService = new TLRPC$TL_messages_sendEncryptedService();
                    tLRPC$TL_messages_sendEncryptedService.data = nativeByteBuffer3;
                    tLRPC$TL_messages_sendEncryptedService.random_id = tLRPC$DecryptedMessage.random_id;
                    TLRPC$TL_inputEncryptedChat tLRPC$TL_inputEncryptedChat = new TLRPC$TL_inputEncryptedChat();
                    tLRPC$TL_messages_sendEncryptedService.peer = tLRPC$TL_inputEncryptedChat;
                    tLRPC$TL_inputEncryptedChat.chat_id = tLRPC$EncryptedChat.id;
                    tLRPC$TL_inputEncryptedChat.access_hash = tLRPC$EncryptedChat.access_hash;
                    tLRPC$TL_messages_sendEncryptedFile2 = tLRPC$TL_messages_sendEncryptedService;
                } else {
                    TLRPC$TL_messages_sendEncrypted tLRPC$TL_messages_sendEncrypted = new TLRPC$TL_messages_sendEncrypted();
                    tLRPC$TL_messages_sendEncrypted.silent = tLRPC$Message.silent;
                    tLRPC$TL_messages_sendEncrypted.data = nativeByteBuffer3;
                    tLRPC$TL_messages_sendEncrypted.random_id = tLRPC$DecryptedMessage.random_id;
                    TLRPC$TL_inputEncryptedChat tLRPC$TL_inputEncryptedChat2 = new TLRPC$TL_inputEncryptedChat();
                    tLRPC$TL_messages_sendEncrypted.peer = tLRPC$TL_inputEncryptedChat2;
                    tLRPC$TL_inputEncryptedChat2.chat_id = tLRPC$EncryptedChat.id;
                    tLRPC$TL_inputEncryptedChat2.access_hash = tLRPC$EncryptedChat.access_hash;
                    tLRPC$TL_messages_sendEncryptedFile2 = tLRPC$TL_messages_sendEncrypted;
                }
                tLRPC$TL_messages_sendEncryptedFile = tLRPC$TL_messages_sendEncryptedFile2;
            } else {
                TLRPC$TL_messages_sendEncryptedFile tLRPC$TL_messages_sendEncryptedFile3 = new TLRPC$TL_messages_sendEncryptedFile();
                tLRPC$TL_messages_sendEncryptedFile3.silent = tLRPC$Message.silent;
                tLRPC$TL_messages_sendEncryptedFile3.data = nativeByteBuffer3;
                tLRPC$TL_messages_sendEncryptedFile3.random_id = tLRPC$DecryptedMessage.random_id;
                TLRPC$TL_inputEncryptedChat tLRPC$TL_inputEncryptedChat3 = new TLRPC$TL_inputEncryptedChat();
                tLRPC$TL_messages_sendEncryptedFile3.peer = tLRPC$TL_inputEncryptedChat3;
                tLRPC$TL_inputEncryptedChat3.chat_id = tLRPC$EncryptedChat.id;
                tLRPC$TL_inputEncryptedChat3.access_hash = tLRPC$EncryptedChat.access_hash;
                tLRPC$TL_messages_sendEncryptedFile3.file = tLRPC$InputEncryptedFile;
                tLRPC$TL_messages_sendEncryptedFile = tLRPC$TL_messages_sendEncryptedFile3;
            }
            getConnectionsManager().sendRequest(tLRPC$TL_messages_sendEncryptedFile, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                    SecretChatHelper.this.lambda$performSendEncryptedRequest$7(tLRPC$DecryptedMessage, tLRPC$EncryptedChat, tLRPC$Message, messageObject, str, tLObject, tLRPC$TL_error);
                }
            }, 64);
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$performSendEncryptedRequest$7(TLRPC$DecryptedMessage tLRPC$DecryptedMessage, TLRPC$EncryptedChat tLRPC$EncryptedChat, final TLRPC$Message tLRPC$Message, MessageObject messageObject, String str, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        final int i = 0;
        if (tLRPC$TL_error == null && (tLRPC$DecryptedMessage.action instanceof TLRPC$TL_decryptedMessageActionNotifyLayer)) {
            TLRPC$EncryptedChat encryptedChat = getMessagesController().getEncryptedChat(Integer.valueOf(tLRPC$EncryptedChat.id));
            if (encryptedChat == null) {
                encryptedChat = tLRPC$EncryptedChat;
            }
            if (encryptedChat.key_hash == null) {
                encryptedChat.key_hash = AndroidUtilities.calcAuthKeyHash(encryptedChat.auth_key);
            }
            if (encryptedChat.key_hash.length == 16) {
                try {
                    byte[] bArr = tLRPC$EncryptedChat.auth_key;
                    byte[] computeSHA256 = Utilities.computeSHA256(bArr, 0, bArr.length);
                    byte[] bArr2 = new byte[36];
                    System.arraycopy(tLRPC$EncryptedChat.key_hash, 0, bArr2, 0, 16);
                    System.arraycopy(computeSHA256, 0, bArr2, 16, 20);
                    encryptedChat.key_hash = bArr2;
                    getMessagesStorage().updateEncryptedChat(encryptedChat);
                } catch (Throwable th) {
                    FileLog.e(th);
                }
            }
            this.sendingNotifyLayer.remove(Integer.valueOf(encryptedChat.id));
            encryptedChat.layer = AndroidUtilities.setMyLayerVersion(encryptedChat.layer, CURRENT_SECRET_CHAT_LAYER);
            getMessagesStorage().updateEncryptedChatLayer(encryptedChat);
        }
        if (tLRPC$TL_error == null) {
            String str2 = tLRPC$Message.attachPath;
            final TLRPC$messages_SentEncryptedMessage tLRPC$messages_SentEncryptedMessage = (TLRPC$messages_SentEncryptedMessage) tLObject;
            if (isSecretVisibleMessage(tLRPC$Message)) {
                tLRPC$Message.date = tLRPC$messages_SentEncryptedMessage.date;
            }
            if (messageObject != null) {
                TLRPC$EncryptedFile tLRPC$EncryptedFile = tLRPC$messages_SentEncryptedMessage.file;
                if (tLRPC$EncryptedFile instanceof TLRPC$TL_encryptedFile) {
                    updateMediaPaths(messageObject, tLRPC$EncryptedFile, tLRPC$DecryptedMessage, str);
                    i = messageObject.getMediaExistanceFlags();
                }
            }
            getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
                @Override
                public final void run() {
                    SecretChatHelper.this.lambda$performSendEncryptedRequest$5(tLRPC$Message, tLRPC$messages_SentEncryptedMessage, i);
                }
            });
            return;
        }
        getMessagesStorage().markMessageAsSendError(tLRPC$Message, false);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                SecretChatHelper.this.lambda$performSendEncryptedRequest$6(tLRPC$Message);
            }
        });
    }

    public void lambda$performSendEncryptedRequest$5(final TLRPC$Message tLRPC$Message, TLRPC$messages_SentEncryptedMessage tLRPC$messages_SentEncryptedMessage, final int i) {
        if (isSecretInvisibleMessage(tLRPC$Message)) {
            tLRPC$messages_SentEncryptedMessage.date = 0;
        }
        getMessagesStorage().updateMessageStateAndId(tLRPC$Message.random_id, 0L, Integer.valueOf(tLRPC$Message.id), tLRPC$Message.id, tLRPC$messages_SentEncryptedMessage.date, false, 0);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                SecretChatHelper.this.lambda$performSendEncryptedRequest$4(tLRPC$Message, i);
            }
        });
    }

    public void lambda$performSendEncryptedRequest$4(TLRPC$Message tLRPC$Message, int i) {
        tLRPC$Message.send_state = 0;
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.messageReceivedByServer, Integer.valueOf(tLRPC$Message.id), Integer.valueOf(tLRPC$Message.id), tLRPC$Message, Long.valueOf(tLRPC$Message.dialog_id), 0L, Integer.valueOf(i), Boolean.FALSE);
        getSendMessagesHelper().processSentMessage(tLRPC$Message.id);
        getSendMessagesHelper().removeFromSendingMessages(tLRPC$Message.id, false);
    }

    public void lambda$performSendEncryptedRequest$6(TLRPC$Message tLRPC$Message) {
        tLRPC$Message.send_state = 2;
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.messageSendError, Integer.valueOf(tLRPC$Message.id));
        getSendMessagesHelper().processSentMessage(tLRPC$Message.id);
        getSendMessagesHelper().removeFromSendingMessages(tLRPC$Message.id, false);
    }

    private void applyPeerLayer(final TLRPC$EncryptedChat tLRPC$EncryptedChat, int i) {
        int peerLayerVersion = AndroidUtilities.getPeerLayerVersion(tLRPC$EncryptedChat.layer);
        if (i <= peerLayerVersion) {
            return;
        }
        if (tLRPC$EncryptedChat.key_hash.length == 16) {
            try {
                byte[] bArr = tLRPC$EncryptedChat.auth_key;
                byte[] computeSHA256 = Utilities.computeSHA256(bArr, 0, bArr.length);
                byte[] bArr2 = new byte[36];
                System.arraycopy(tLRPC$EncryptedChat.key_hash, 0, bArr2, 0, 16);
                System.arraycopy(computeSHA256, 0, bArr2, 16, 20);
                tLRPC$EncryptedChat.key_hash = bArr2;
                getMessagesStorage().updateEncryptedChat(tLRPC$EncryptedChat);
            } catch (Throwable th) {
                FileLog.e(th);
            }
        }
        tLRPC$EncryptedChat.layer = AndroidUtilities.setPeerLayerVersion(tLRPC$EncryptedChat.layer, i);
        getMessagesStorage().updateEncryptedChatLayer(tLRPC$EncryptedChat);
        if (peerLayerVersion < CURRENT_SECRET_CHAT_LAYER) {
            sendNotifyLayerMessage(tLRPC$EncryptedChat, null);
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                SecretChatHelper.this.lambda$applyPeerLayer$9(tLRPC$EncryptedChat);
            }
        });
    }

    public void lambda$applyPeerLayer$9(TLRPC$EncryptedChat tLRPC$EncryptedChat) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.encryptedChatUpdated, tLRPC$EncryptedChat);
    }

    public org.telegram.tgnet.TLRPC$Message processDecryptedObject(org.telegram.tgnet.TLRPC$EncryptedChat r19, org.telegram.tgnet.TLRPC$EncryptedFile r20, int r21, org.telegram.tgnet.TLObject r22, boolean r23) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.SecretChatHelper.processDecryptedObject(org.telegram.tgnet.TLRPC$EncryptedChat, org.telegram.tgnet.TLRPC$EncryptedFile, int, org.telegram.tgnet.TLObject, boolean):org.telegram.tgnet.TLRPC$Message");
    }

    public void lambda$processDecryptedObject$12(final long j) {
        TLRPC$Dialog tLRPC$Dialog = getMessagesController().dialogs_dict.get(j);
        if (tLRPC$Dialog != null) {
            tLRPC$Dialog.unread_count = 0;
            getMessagesController().dialogMessage.remove(tLRPC$Dialog.id);
        }
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                SecretChatHelper.this.lambda$processDecryptedObject$11(j);
            }
        });
        getMessagesStorage().deleteDialog(j, 1);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.removeAllMessagesFromDialog, Long.valueOf(j), Boolean.FALSE, null);
    }

    public void lambda$processDecryptedObject$11(final long j) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                SecretChatHelper.this.lambda$processDecryptedObject$10(j);
            }
        });
    }

    public void lambda$processDecryptedObject$10(long j) {
        getNotificationsController().processReadMessages(null, j, 0, ConnectionsManager.DEFAULT_DATACENTER_ID, false);
        LongSparseIntArray longSparseIntArray = new LongSparseIntArray(1);
        longSparseIntArray.put(j, 0);
        getNotificationsController().processDialogsUpdateRead(longSparseIntArray);
    }

    private TLRPC$Message createDeleteMessage(int i, int i2, int i3, long j, TLRPC$EncryptedChat tLRPC$EncryptedChat) {
        TLRPC$TL_messageService tLRPC$TL_messageService = new TLRPC$TL_messageService();
        TLRPC$TL_messageEncryptedAction tLRPC$TL_messageEncryptedAction = new TLRPC$TL_messageEncryptedAction();
        tLRPC$TL_messageService.action = tLRPC$TL_messageEncryptedAction;
        tLRPC$TL_messageEncryptedAction.encryptedAction = new TLRPC$TL_decryptedMessageActionDeleteMessages();
        tLRPC$TL_messageService.action.encryptedAction.random_ids.add(Long.valueOf(j));
        tLRPC$TL_messageService.id = i;
        tLRPC$TL_messageService.local_id = i;
        TLRPC$TL_peerUser tLRPC$TL_peerUser = new TLRPC$TL_peerUser();
        tLRPC$TL_messageService.from_id = tLRPC$TL_peerUser;
        tLRPC$TL_peerUser.user_id = getUserConfig().getClientUserId();
        tLRPC$TL_messageService.unread = true;
        tLRPC$TL_messageService.out = true;
        tLRPC$TL_messageService.flags = LiteMode.FLAG_CHAT_BLUR;
        tLRPC$TL_messageService.dialog_id = DialogObject.makeEncryptedDialogId(tLRPC$EncryptedChat.id);
        tLRPC$TL_messageService.send_state = 1;
        tLRPC$TL_messageService.seq_in = i3;
        tLRPC$TL_messageService.seq_out = i2;
        tLRPC$TL_messageService.peer_id = new TLRPC$TL_peerUser();
        if (tLRPC$EncryptedChat.participant_id == getUserConfig().getClientUserId()) {
            tLRPC$TL_messageService.peer_id.user_id = tLRPC$EncryptedChat.admin_id;
        } else {
            tLRPC$TL_messageService.peer_id.user_id = tLRPC$EncryptedChat.participant_id;
        }
        tLRPC$TL_messageService.date = 0;
        tLRPC$TL_messageService.random_id = j;
        return tLRPC$TL_messageService;
    }

    private void resendMessages(final int i, final int i2, final TLRPC$EncryptedChat tLRPC$EncryptedChat) {
        if (tLRPC$EncryptedChat == null || i2 - i < 0) {
            return;
        }
        getMessagesStorage().getStorageQueue().postRunnable(new Runnable() {
            @Override
            public final void run() {
                SecretChatHelper.this.lambda$resendMessages$15(i, tLRPC$EncryptedChat, i2);
            }
        });
    }

    public void lambda$resendMessages$15(int i, TLRPC$EncryptedChat tLRPC$EncryptedChat, int i2) {
        int i3;
        long j;
        ArrayList<TLRPC$Message> arrayList;
        TLRPC$Message createDeleteMessage;
        try {
            int i4 = (tLRPC$EncryptedChat.admin_id == getUserConfig().getClientUserId() && i % 2 == 0) ? i + 1 : i;
            int i5 = 5;
            int i6 = 1;
            int i7 = 2;
            int i8 = 3;
            SQLiteCursor queryFinalized = getMessagesStorage().getDatabase().queryFinalized(String.format(Locale.US, "SELECT uid FROM requested_holes WHERE uid = %d AND ((seq_out_start >= %d AND %d <= seq_out_end) OR (seq_out_start >= %d AND %d <= seq_out_end))", Integer.valueOf(tLRPC$EncryptedChat.id), Integer.valueOf(i4), Integer.valueOf(i4), Integer.valueOf(i2), Integer.valueOf(i2)), new Object[0]);
            boolean next = queryFinalized.next();
            queryFinalized.dispose();
            if (next) {
                return;
            }
            long makeEncryptedDialogId = DialogObject.makeEncryptedDialogId(tLRPC$EncryptedChat.id);
            SparseArray sparseArray = new SparseArray();
            ArrayList<TLRPC$Message> arrayList2 = new ArrayList<>();
            for (int i9 = i4; i9 <= i2; i9 += 2) {
                sparseArray.put(i9, null);
            }
            SQLiteCursor queryFinalized2 = getMessagesStorage().getDatabase().queryFinalized(String.format(Locale.US, "SELECT m.data, r.random_id, s.seq_in, s.seq_out, m.ttl, s.mid FROM messages_seq as s LEFT JOIN randoms_v2 as r ON r.mid = s.mid LEFT JOIN messages_v2 as m ON m.mid = s.mid WHERE m.uid = %d AND m.out = 1 AND s.seq_out >= %d AND s.seq_out <= %d ORDER BY seq_out ASC", Long.valueOf(makeEncryptedDialogId), Integer.valueOf(i4), Integer.valueOf(i2)), new Object[0]);
            while (queryFinalized2.next()) {
                long longValue = queryFinalized2.longValue(i6);
                if (longValue == 0) {
                    longValue = Utilities.random.nextLong();
                }
                long j2 = longValue;
                int intValue = queryFinalized2.intValue(i7);
                int intValue2 = queryFinalized2.intValue(i8);
                int intValue3 = queryFinalized2.intValue(i5);
                NativeByteBuffer byteBufferValue = queryFinalized2.byteBufferValue(0);
                if (byteBufferValue != null) {
                    createDeleteMessage = TLRPC$Message.TLdeserialize(byteBufferValue, byteBufferValue.readInt32(false), false);
                    i3 = i4;
                    createDeleteMessage.readAttachPath(byteBufferValue, getUserConfig().clientUserId);
                    byteBufferValue.reuse();
                    createDeleteMessage.random_id = j2;
                    createDeleteMessage.dialog_id = makeEncryptedDialogId;
                    createDeleteMessage.seq_in = intValue;
                    createDeleteMessage.seq_out = intValue2;
                    createDeleteMessage.ttl = queryFinalized2.intValue(4);
                    j = makeEncryptedDialogId;
                    arrayList = arrayList2;
                } else {
                    i3 = i4;
                    j = makeEncryptedDialogId;
                    arrayList = arrayList2;
                    createDeleteMessage = createDeleteMessage(intValue3, intValue2, intValue, j2, tLRPC$EncryptedChat);
                }
                arrayList.add(createDeleteMessage);
                sparseArray.remove(intValue2);
                arrayList2 = arrayList;
                i4 = i3;
                makeEncryptedDialogId = j;
                i5 = 5;
                i6 = 1;
                i7 = 2;
                i8 = 3;
            }
            final ArrayList<TLRPC$Message> arrayList3 = arrayList2;
            int i10 = i4;
            queryFinalized2.dispose();
            if (sparseArray.size() != 0) {
                for (int i11 = 0; i11 < sparseArray.size(); i11++) {
                    int keyAt = sparseArray.keyAt(i11);
                    arrayList3.add(createDeleteMessage(getUserConfig().getNewMessageId(), keyAt, keyAt + 1, Utilities.random.nextLong(), tLRPC$EncryptedChat));
                }
                getUserConfig().saveConfig(false);
            }
            Collections.sort(arrayList3, new Comparator() {
                @Override
                public final int compare(Object obj, Object obj2) {
                    int lambda$resendMessages$13;
                    lambda$resendMessages$13 = SecretChatHelper.lambda$resendMessages$13((TLRPC$Message) obj, (TLRPC$Message) obj2);
                    return lambda$resendMessages$13;
                }
            });
            ArrayList<TLRPC$EncryptedChat> arrayList4 = new ArrayList<>();
            arrayList4.add(tLRPC$EncryptedChat);
            try {
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        SecretChatHelper.this.lambda$resendMessages$14(arrayList3);
                    }
                });
                getSendMessagesHelper().processUnsentMessages(arrayList3, null, new ArrayList<>(), new ArrayList<>(), arrayList4);
                getMessagesStorage().getDatabase().executeFast(String.format(Locale.US, "REPLACE INTO requested_holes VALUES(%d, %d, %d)", Integer.valueOf(tLRPC$EncryptedChat.id), Integer.valueOf(i10), Integer.valueOf(i2))).stepThis().dispose();
            } catch (Exception e) {
                e = e;
                FileLog.e(e);
            }
        } catch (Exception e2) {
            e = e2;
        }
    }

    public static int lambda$resendMessages$13(TLRPC$Message tLRPC$Message, TLRPC$Message tLRPC$Message2) {
        return AndroidUtilities.compare(tLRPC$Message.seq_out, tLRPC$Message2.seq_out);
    }

    public void lambda$resendMessages$14(ArrayList arrayList) {
        for (int i = 0; i < arrayList.size(); i++) {
            MessageObject messageObject = new MessageObject(this.currentAccount, (TLRPC$Message) arrayList.get(i), false, true);
            messageObject.resendAsIs = true;
            getSendMessagesHelper().retrySendMessage(messageObject, true);
        }
    }

    public void checkSecretHoles(TLRPC$EncryptedChat tLRPC$EncryptedChat, ArrayList<TLRPC$Message> arrayList) {
        TL_decryptedMessageHolder tL_decryptedMessageHolder;
        TLRPC$TL_decryptedMessageLayer tLRPC$TL_decryptedMessageLayer;
        int i;
        int i2;
        ArrayList<TL_decryptedMessageHolder> arrayList2 = this.secretHolesQueue.get(tLRPC$EncryptedChat.id);
        if (arrayList2 == null) {
            return;
        }
        Collections.sort(arrayList2, new Comparator() {
            @Override
            public final int compare(Object obj, Object obj2) {
                int lambda$checkSecretHoles$16;
                lambda$checkSecretHoles$16 = SecretChatHelper.lambda$checkSecretHoles$16((SecretChatHelper.TL_decryptedMessageHolder) obj, (SecretChatHelper.TL_decryptedMessageHolder) obj2);
                return lambda$checkSecretHoles$16;
            }
        });
        boolean z = false;
        while (arrayList2.size() > 0 && ((i = (tLRPC$TL_decryptedMessageLayer = (tL_decryptedMessageHolder = arrayList2.get(0)).layer).out_seq_no) == (i2 = tLRPC$EncryptedChat.seq_in) || i2 == i - 2)) {
            applyPeerLayer(tLRPC$EncryptedChat, tLRPC$TL_decryptedMessageLayer.layer);
            TLRPC$TL_decryptedMessageLayer tLRPC$TL_decryptedMessageLayer2 = tL_decryptedMessageHolder.layer;
            tLRPC$EncryptedChat.seq_in = tLRPC$TL_decryptedMessageLayer2.out_seq_no;
            tLRPC$EncryptedChat.in_seq_no = tLRPC$TL_decryptedMessageLayer2.in_seq_no;
            arrayList2.remove(0);
            if (tL_decryptedMessageHolder.decryptedWithVersion == 2) {
                tLRPC$EncryptedChat.mtproto_seq = Math.min(tLRPC$EncryptedChat.mtproto_seq, tLRPC$EncryptedChat.seq_in);
            }
            TLRPC$Message processDecryptedObject = processDecryptedObject(tLRPC$EncryptedChat, tL_decryptedMessageHolder.file, tL_decryptedMessageHolder.date, tL_decryptedMessageHolder.layer.message, tL_decryptedMessageHolder.new_key_used);
            if (processDecryptedObject != null) {
                arrayList.add(processDecryptedObject);
            }
            z = true;
        }
        if (arrayList2.isEmpty()) {
            this.secretHolesQueue.remove(tLRPC$EncryptedChat.id);
        }
        if (z) {
            getMessagesStorage().updateEncryptedChatSeq(tLRPC$EncryptedChat, true);
        }
    }

    public static int lambda$checkSecretHoles$16(TL_decryptedMessageHolder tL_decryptedMessageHolder, TL_decryptedMessageHolder tL_decryptedMessageHolder2) {
        int i = tL_decryptedMessageHolder.layer.out_seq_no;
        int i2 = tL_decryptedMessageHolder2.layer.out_seq_no;
        if (i > i2) {
            return 1;
        }
        return i < i2 ? -1 : 0;
    }

    private boolean decryptWithMtProtoVersion(org.telegram.tgnet.NativeByteBuffer r26, byte[] r27, byte[] r28, int r29, boolean r30, boolean r31) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.SecretChatHelper.decryptWithMtProtoVersion(org.telegram.tgnet.NativeByteBuffer, byte[], byte[], int, boolean, boolean):boolean");
    }

    public java.util.ArrayList<org.telegram.tgnet.TLRPC$Message> decryptMessage(org.telegram.tgnet.TLRPC$EncryptedMessage r20) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.SecretChatHelper.decryptMessage(org.telegram.tgnet.TLRPC$EncryptedMessage):java.util.ArrayList");
    }

    public void lambda$decryptMessage$17(TLRPC$TL_encryptedChatDiscarded tLRPC$TL_encryptedChatDiscarded) {
        getMessagesController().putEncryptedChat(tLRPC$TL_encryptedChatDiscarded, false);
        getMessagesStorage().updateEncryptedChat(tLRPC$TL_encryptedChatDiscarded);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.encryptedChatUpdated, tLRPC$TL_encryptedChatDiscarded);
    }

    public void requestNewSecretChatKey(TLRPC$EncryptedChat tLRPC$EncryptedChat) {
        byte[] bArr = new byte[LiteMode.FLAG_CHAT_BLUR];
        Utilities.random.nextBytes(bArr);
        byte[] byteArray = BigInteger.valueOf(getMessagesStorage().getSecretG()).modPow(new BigInteger(1, bArr), new BigInteger(1, getMessagesStorage().getSecretPBytes())).toByteArray();
        if (byteArray.length > 256) {
            byte[] bArr2 = new byte[LiteMode.FLAG_CHAT_BLUR];
            System.arraycopy(byteArray, 1, bArr2, 0, LiteMode.FLAG_CHAT_BLUR);
            byteArray = bArr2;
        }
        tLRPC$EncryptedChat.exchange_id = getSendMessagesHelper().getNextRandomId();
        tLRPC$EncryptedChat.a_or_b = bArr;
        tLRPC$EncryptedChat.g_a = byteArray;
        getMessagesStorage().updateEncryptedChat(tLRPC$EncryptedChat);
        sendRequestKeyMessage(tLRPC$EncryptedChat, null);
    }

    public void processAcceptedSecretChat(final org.telegram.tgnet.TLRPC$EncryptedChat r10) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.SecretChatHelper.processAcceptedSecretChat(org.telegram.tgnet.TLRPC$EncryptedChat):void");
    }

    public void lambda$processAcceptedSecretChat$18(TLRPC$EncryptedChat tLRPC$EncryptedChat) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.encryptedChatUpdated, tLRPC$EncryptedChat);
        sendNotifyLayerMessage(tLRPC$EncryptedChat, null);
    }

    public void lambda$processAcceptedSecretChat$19(TLRPC$TL_encryptedChatDiscarded tLRPC$TL_encryptedChatDiscarded) {
        getMessagesController().putEncryptedChat(tLRPC$TL_encryptedChatDiscarded, false);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.encryptedChatUpdated, tLRPC$TL_encryptedChatDiscarded);
    }

    public void declineSecretChat(int i, boolean z) {
        declineSecretChat(i, z, 0L);
    }

    public void declineSecretChat(int i, boolean z, final long j) {
        NativeByteBuffer nativeByteBuffer;
        Exception e;
        if (j == 0) {
            try {
                nativeByteBuffer = new NativeByteBuffer(12);
            } catch (Exception e2) {
                nativeByteBuffer = null;
                e = e2;
            }
            try {
                nativeByteBuffer.writeInt32(100);
                nativeByteBuffer.writeInt32(i);
                nativeByteBuffer.writeBool(z);
            } catch (Exception e3) {
                e = e3;
                FileLog.e(e);
                j = getMessagesStorage().createPendingTask(nativeByteBuffer);
                TLRPC$TL_messages_discardEncryption tLRPC$TL_messages_discardEncryption = new TLRPC$TL_messages_discardEncryption();
                tLRPC$TL_messages_discardEncryption.chat_id = i;
                tLRPC$TL_messages_discardEncryption.delete_history = z;
                getConnectionsManager().sendRequest(tLRPC$TL_messages_discardEncryption, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                        SecretChatHelper.this.lambda$declineSecretChat$20(j, tLObject, tLRPC$TL_error);
                    }
                });
            }
            j = getMessagesStorage().createPendingTask(nativeByteBuffer);
        }
        TLRPC$TL_messages_discardEncryption tLRPC$TL_messages_discardEncryption2 = new TLRPC$TL_messages_discardEncryption();
        tLRPC$TL_messages_discardEncryption2.chat_id = i;
        tLRPC$TL_messages_discardEncryption2.delete_history = z;
        getConnectionsManager().sendRequest(tLRPC$TL_messages_discardEncryption2, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                SecretChatHelper.this.lambda$declineSecretChat$20(j, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$declineSecretChat$20(long j, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (j != 0) {
            getMessagesStorage().removePendingTask(j);
        }
    }

    public void acceptSecretChat(final TLRPC$EncryptedChat tLRPC$EncryptedChat) {
        if (this.acceptingChats.get(tLRPC$EncryptedChat.id) != null) {
            return;
        }
        this.acceptingChats.put(tLRPC$EncryptedChat.id, tLRPC$EncryptedChat);
        TLRPC$TL_messages_getDhConfig tLRPC$TL_messages_getDhConfig = new TLRPC$TL_messages_getDhConfig();
        tLRPC$TL_messages_getDhConfig.random_length = LiteMode.FLAG_CHAT_BLUR;
        tLRPC$TL_messages_getDhConfig.version = getMessagesStorage().getLastSecretVersion();
        getConnectionsManager().sendRequest(tLRPC$TL_messages_getDhConfig, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                SecretChatHelper.this.lambda$acceptSecretChat$23(tLRPC$EncryptedChat, tLObject, tLRPC$TL_error);
            }
        });
    }

    public void lambda$acceptSecretChat$23(final TLRPC$EncryptedChat tLRPC$EncryptedChat, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        byte[] bArr;
        if (tLRPC$TL_error == null) {
            TLRPC$messages_DhConfig tLRPC$messages_DhConfig = (TLRPC$messages_DhConfig) tLObject;
            if (tLObject instanceof TLRPC$TL_messages_dhConfig) {
                if (!Utilities.isGoodPrime(tLRPC$messages_DhConfig.p, tLRPC$messages_DhConfig.g)) {
                    this.acceptingChats.remove(tLRPC$EncryptedChat.id);
                    declineSecretChat(tLRPC$EncryptedChat.id, false);
                    return;
                }
                getMessagesStorage().setSecretPBytes(tLRPC$messages_DhConfig.p);
                getMessagesStorage().setSecretG(tLRPC$messages_DhConfig.g);
                getMessagesStorage().setLastSecretVersion(tLRPC$messages_DhConfig.version);
                getMessagesStorage().saveSecretParams(getMessagesStorage().getLastSecretVersion(), getMessagesStorage().getSecretG(), getMessagesStorage().getSecretPBytes());
            }
            byte[] bArr2 = new byte[LiteMode.FLAG_CHAT_BLUR];
            for (int i = 0; i < 256; i++) {
                bArr2[i] = (byte) (((byte) (Utilities.random.nextDouble() * 256.0d)) ^ tLRPC$messages_DhConfig.random[i]);
            }
            tLRPC$EncryptedChat.a_or_b = bArr2;
            tLRPC$EncryptedChat.seq_in = -1;
            tLRPC$EncryptedChat.seq_out = 0;
            BigInteger bigInteger = new BigInteger(1, getMessagesStorage().getSecretPBytes());
            BigInteger modPow = BigInteger.valueOf(getMessagesStorage().getSecretG()).modPow(new BigInteger(1, bArr2), bigInteger);
            BigInteger bigInteger2 = new BigInteger(1, tLRPC$EncryptedChat.g_a);
            if (!Utilities.isGoodGaAndGb(bigInteger2, bigInteger)) {
                this.acceptingChats.remove(tLRPC$EncryptedChat.id);
                declineSecretChat(tLRPC$EncryptedChat.id, false);
                return;
            }
            byte[] byteArray = modPow.toByteArray();
            if (byteArray.length > 256) {
                byte[] bArr3 = new byte[LiteMode.FLAG_CHAT_BLUR];
                System.arraycopy(byteArray, 1, bArr3, 0, LiteMode.FLAG_CHAT_BLUR);
                byteArray = bArr3;
            }
            byte[] byteArray2 = bigInteger2.modPow(new BigInteger(1, bArr2), bigInteger).toByteArray();
            if (byteArray2.length > 256) {
                bArr = new byte[LiteMode.FLAG_CHAT_BLUR];
                System.arraycopy(byteArray2, byteArray2.length - LiteMode.FLAG_CHAT_BLUR, bArr, 0, LiteMode.FLAG_CHAT_BLUR);
            } else {
                if (byteArray2.length < 256) {
                    bArr = new byte[LiteMode.FLAG_CHAT_BLUR];
                    System.arraycopy(byteArray2, 0, bArr, 256 - byteArray2.length, byteArray2.length);
                    for (int i2 = 0; i2 < 256 - byteArray2.length; i2++) {
                        bArr[i2] = 0;
                    }
                }
                byte[] computeSHA1 = Utilities.computeSHA1(byteArray2);
                byte[] bArr4 = new byte[8];
                System.arraycopy(computeSHA1, computeSHA1.length - 8, bArr4, 0, 8);
                tLRPC$EncryptedChat.auth_key = byteArray2;
                tLRPC$EncryptedChat.key_create_date = getConnectionsManager().getCurrentTime();
                TLRPC$TL_messages_acceptEncryption tLRPC$TL_messages_acceptEncryption = new TLRPC$TL_messages_acceptEncryption();
                tLRPC$TL_messages_acceptEncryption.g_b = byteArray;
                TLRPC$TL_inputEncryptedChat tLRPC$TL_inputEncryptedChat = new TLRPC$TL_inputEncryptedChat();
                tLRPC$TL_messages_acceptEncryption.peer = tLRPC$TL_inputEncryptedChat;
                tLRPC$TL_inputEncryptedChat.chat_id = tLRPC$EncryptedChat.id;
                tLRPC$TL_inputEncryptedChat.access_hash = tLRPC$EncryptedChat.access_hash;
                tLRPC$TL_messages_acceptEncryption.key_fingerprint = Utilities.bytesToLong(bArr4);
                getConnectionsManager().sendRequest(tLRPC$TL_messages_acceptEncryption, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject2, TLRPC$TL_error tLRPC$TL_error2) {
                        SecretChatHelper.this.lambda$acceptSecretChat$22(tLRPC$EncryptedChat, tLObject2, tLRPC$TL_error2);
                    }
                }, 64);
                return;
            }
            byteArray2 = bArr;
            byte[] computeSHA12 = Utilities.computeSHA1(byteArray2);
            byte[] bArr42 = new byte[8];
            System.arraycopy(computeSHA12, computeSHA12.length - 8, bArr42, 0, 8);
            tLRPC$EncryptedChat.auth_key = byteArray2;
            tLRPC$EncryptedChat.key_create_date = getConnectionsManager().getCurrentTime();
            TLRPC$TL_messages_acceptEncryption tLRPC$TL_messages_acceptEncryption2 = new TLRPC$TL_messages_acceptEncryption();
            tLRPC$TL_messages_acceptEncryption2.g_b = byteArray;
            TLRPC$TL_inputEncryptedChat tLRPC$TL_inputEncryptedChat2 = new TLRPC$TL_inputEncryptedChat();
            tLRPC$TL_messages_acceptEncryption2.peer = tLRPC$TL_inputEncryptedChat2;
            tLRPC$TL_inputEncryptedChat2.chat_id = tLRPC$EncryptedChat.id;
            tLRPC$TL_inputEncryptedChat2.access_hash = tLRPC$EncryptedChat.access_hash;
            tLRPC$TL_messages_acceptEncryption2.key_fingerprint = Utilities.bytesToLong(bArr42);
            getConnectionsManager().sendRequest(tLRPC$TL_messages_acceptEncryption2, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject2, TLRPC$TL_error tLRPC$TL_error2) {
                    SecretChatHelper.this.lambda$acceptSecretChat$22(tLRPC$EncryptedChat, tLObject2, tLRPC$TL_error2);
                }
            }, 64);
            return;
        }
        this.acceptingChats.remove(tLRPC$EncryptedChat.id);
    }

    public void lambda$acceptSecretChat$22(TLRPC$EncryptedChat tLRPC$EncryptedChat, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        this.acceptingChats.remove(tLRPC$EncryptedChat.id);
        if (tLRPC$TL_error == null) {
            final TLRPC$EncryptedChat tLRPC$EncryptedChat2 = (TLRPC$EncryptedChat) tLObject;
            tLRPC$EncryptedChat2.auth_key = tLRPC$EncryptedChat.auth_key;
            tLRPC$EncryptedChat2.user_id = tLRPC$EncryptedChat.user_id;
            tLRPC$EncryptedChat2.seq_in = tLRPC$EncryptedChat.seq_in;
            tLRPC$EncryptedChat2.seq_out = tLRPC$EncryptedChat.seq_out;
            tLRPC$EncryptedChat2.key_create_date = tLRPC$EncryptedChat.key_create_date;
            tLRPC$EncryptedChat2.key_use_count_in = tLRPC$EncryptedChat.key_use_count_in;
            tLRPC$EncryptedChat2.key_use_count_out = tLRPC$EncryptedChat.key_use_count_out;
            getMessagesStorage().updateEncryptedChat(tLRPC$EncryptedChat2);
            getMessagesController().putEncryptedChat(tLRPC$EncryptedChat2, false);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    SecretChatHelper.this.lambda$acceptSecretChat$21(tLRPC$EncryptedChat2);
                }
            });
        }
    }

    public void lambda$acceptSecretChat$21(TLRPC$EncryptedChat tLRPC$EncryptedChat) {
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.encryptedChatUpdated, tLRPC$EncryptedChat);
        sendNotifyLayerMessage(tLRPC$EncryptedChat, null);
    }

    public void startSecretChat(final Context context, final TLRPC$User tLRPC$User) {
        if (tLRPC$User == null || context == null) {
            return;
        }
        this.startingSecretChat = true;
        final AlertDialog alertDialog = new AlertDialog(context, 3);
        TLRPC$TL_messages_getDhConfig tLRPC$TL_messages_getDhConfig = new TLRPC$TL_messages_getDhConfig();
        tLRPC$TL_messages_getDhConfig.random_length = LiteMode.FLAG_CHAT_BLUR;
        tLRPC$TL_messages_getDhConfig.version = getMessagesStorage().getLastSecretVersion();
        final int sendRequest = getConnectionsManager().sendRequest(tLRPC$TL_messages_getDhConfig, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
                SecretChatHelper.this.lambda$startSecretChat$30(context, alertDialog, tLRPC$User, tLObject, tLRPC$TL_error);
            }
        }, 2);
        alertDialog.setOnCancelListener(new DialogInterface.OnCancelListener() {
            @Override
            public final void onCancel(DialogInterface dialogInterface) {
                SecretChatHelper.this.lambda$startSecretChat$31(sendRequest, dialogInterface);
            }
        });
        try {
            alertDialog.show();
        } catch (Exception unused) {
        }
    }

    public void lambda$startSecretChat$30(final Context context, final AlertDialog alertDialog, final TLRPC$User tLRPC$User, TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null) {
            TLRPC$messages_DhConfig tLRPC$messages_DhConfig = (TLRPC$messages_DhConfig) tLObject;
            if (tLObject instanceof TLRPC$TL_messages_dhConfig) {
                if (!Utilities.isGoodPrime(tLRPC$messages_DhConfig.p, tLRPC$messages_DhConfig.g)) {
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            SecretChatHelper.lambda$startSecretChat$24(context, alertDialog);
                        }
                    });
                    return;
                }
                getMessagesStorage().setSecretPBytes(tLRPC$messages_DhConfig.p);
                getMessagesStorage().setSecretG(tLRPC$messages_DhConfig.g);
                getMessagesStorage().setLastSecretVersion(tLRPC$messages_DhConfig.version);
                getMessagesStorage().saveSecretParams(getMessagesStorage().getLastSecretVersion(), getMessagesStorage().getSecretG(), getMessagesStorage().getSecretPBytes());
            }
            final byte[] bArr = new byte[LiteMode.FLAG_CHAT_BLUR];
            for (int i = 0; i < 256; i++) {
                bArr[i] = (byte) (((byte) (Utilities.random.nextDouble() * 256.0d)) ^ tLRPC$messages_DhConfig.random[i]);
            }
            byte[] byteArray = BigInteger.valueOf(getMessagesStorage().getSecretG()).modPow(new BigInteger(1, bArr), new BigInteger(1, getMessagesStorage().getSecretPBytes())).toByteArray();
            if (byteArray.length > 256) {
                byte[] bArr2 = new byte[LiteMode.FLAG_CHAT_BLUR];
                System.arraycopy(byteArray, 1, bArr2, 0, LiteMode.FLAG_CHAT_BLUR);
                byteArray = bArr2;
            }
            TLRPC$TL_messages_requestEncryption tLRPC$TL_messages_requestEncryption = new TLRPC$TL_messages_requestEncryption();
            tLRPC$TL_messages_requestEncryption.g_a = byteArray;
            tLRPC$TL_messages_requestEncryption.user_id = getMessagesController().getInputUser(tLRPC$User);
            tLRPC$TL_messages_requestEncryption.random_id = Utilities.random.nextInt();
            getConnectionsManager().sendRequest(tLRPC$TL_messages_requestEncryption, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject2, TLRPC$TL_error tLRPC$TL_error2) {
                    SecretChatHelper.this.lambda$startSecretChat$28(context, alertDialog, bArr, tLRPC$User, tLObject2, tLRPC$TL_error2);
                }
            }, 2);
            return;
        }
        this.delayedEncryptedChatUpdates.clear();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                SecretChatHelper.this.lambda$startSecretChat$29(context, alertDialog);
            }
        });
    }

    public static void lambda$startSecretChat$24(Context context, AlertDialog alertDialog) {
        try {
            if (((Activity) context).isFinishing()) {
                return;
            }
            alertDialog.dismiss();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$startSecretChat$28(final Context context, final AlertDialog alertDialog, final byte[] bArr, final TLRPC$User tLRPC$User, final TLObject tLObject, TLRPC$TL_error tLRPC$TL_error) {
        if (tLRPC$TL_error == null) {
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    SecretChatHelper.this.lambda$startSecretChat$26(context, alertDialog, tLObject, bArr, tLRPC$User);
                }
            });
            return;
        }
        this.delayedEncryptedChatUpdates.clear();
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                SecretChatHelper.this.lambda$startSecretChat$27(context, alertDialog);
            }
        });
    }

    public void lambda$startSecretChat$26(Context context, AlertDialog alertDialog, TLObject tLObject, byte[] bArr, TLRPC$User tLRPC$User) {
        this.startingSecretChat = false;
        if (!((Activity) context).isFinishing()) {
            try {
                alertDialog.dismiss();
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        TLRPC$EncryptedChat tLRPC$EncryptedChat = (TLRPC$EncryptedChat) tLObject;
        tLRPC$EncryptedChat.user_id = tLRPC$EncryptedChat.participant_id;
        tLRPC$EncryptedChat.seq_in = -2;
        tLRPC$EncryptedChat.seq_out = 1;
        tLRPC$EncryptedChat.a_or_b = bArr;
        getMessagesController().putEncryptedChat(tLRPC$EncryptedChat, false);
        TLRPC$TL_dialog tLRPC$TL_dialog = new TLRPC$TL_dialog();
        tLRPC$TL_dialog.id = DialogObject.makeEncryptedDialogId(tLRPC$EncryptedChat.id);
        tLRPC$TL_dialog.unread_count = 0;
        tLRPC$TL_dialog.top_message = 0;
        tLRPC$TL_dialog.last_message_date = getConnectionsManager().getCurrentTime();
        getMessagesController().dialogs_dict.put(tLRPC$TL_dialog.id, tLRPC$TL_dialog);
        getMessagesController().allDialogs.add(tLRPC$TL_dialog);
        getMessagesController().sortDialogs(null);
        getMessagesStorage().putEncryptedChat(tLRPC$EncryptedChat, tLRPC$User, tLRPC$TL_dialog);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.dialogsNeedReload, new Object[0]);
        getNotificationCenter().lambda$postNotificationNameOnUIThread$1(NotificationCenter.encryptedChatCreated, tLRPC$EncryptedChat);
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                SecretChatHelper.this.lambda$startSecretChat$25();
            }
        });
    }

    public void lambda$startSecretChat$25() {
        if (this.delayedEncryptedChatUpdates.isEmpty()) {
            return;
        }
        getMessagesController().processUpdateArray(this.delayedEncryptedChatUpdates, null, null, false, 0);
        this.delayedEncryptedChatUpdates.clear();
    }

    public void lambda$startSecretChat$27(Context context, AlertDialog alertDialog) {
        if (((Activity) context).isFinishing()) {
            return;
        }
        this.startingSecretChat = false;
        try {
            alertDialog.dismiss();
        } catch (Exception e) {
            FileLog.e(e);
        }
        AlertDialog.Builder builder = new AlertDialog.Builder(context);
        builder.setTitle(LocaleController.getString("AppName", R.string.AppName));
        builder.setMessage(LocaleController.getString("CreateEncryptedChatError", R.string.CreateEncryptedChatError));
        builder.setPositiveButton(LocaleController.getString("OK", R.string.OK), null);
        builder.show().setCanceledOnTouchOutside(true);
    }

    public void lambda$startSecretChat$29(Context context, AlertDialog alertDialog) {
        this.startingSecretChat = false;
        if (((Activity) context).isFinishing()) {
            return;
        }
        try {
            alertDialog.dismiss();
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public void lambda$startSecretChat$31(int i, DialogInterface dialogInterface) {
        getConnectionsManager().cancelRequest(i, true);
    }
}
