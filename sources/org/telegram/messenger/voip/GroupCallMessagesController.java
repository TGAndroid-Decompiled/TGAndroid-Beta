package org.telegram.messenger.voip;

import android.util.LongSparseArray;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BaseController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.json.TLJsonBuilder;
import org.telegram.tgnet.json.TLJsonParser;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_update;
public class GroupCallMessagesController extends BaseController {
    private static volatile GroupCallMessagesController[] Instance = new GroupCallMessagesController[4];
    private final LongSparseArray<MessagesList> callMessagesList;
    private final LongSparseArray<List<CallMessageListener>> callMessagesListeners;

    public interface CallMessageListener {
        void onNewGroupCallMessage(long j3, GroupCallMessage groupCallMessage);

        void onPopGroupCallMessage();
    }

    public static class MessagesList {
        private final List<GroupCallMessage> messages;
        private final Set<Long> randomIds;

        private MessagesList() {
            this.messages = new ArrayList();
            this.randomIds = new HashSet();
        }

        public boolean isEmpty() {
            return this.messages.isEmpty();
        }

        public void pop() {
            if (!this.messages.isEmpty()) {
                List<GroupCallMessage> list = this.messages;
                long j3 = list.remove(list.size() - 1).randomId;
                if (j3 != 0) {
                    this.randomIds.remove(Long.valueOf(j3));
                }
            }
        }

        public boolean push(GroupCallMessage groupCallMessage) {
            long j3 = groupCallMessage.randomId;
            if (j3 != 0 && !this.randomIds.add(Long.valueOf(j3))) {
                return false;
            }
            this.messages.add(0, groupCallMessage);
            return true;
        }
    }

    private GroupCallMessagesController(int i10) {
        super(i10);
        this.callMessagesListeners = new LongSparseArray<>();
        this.callMessagesList = new LongSparseArray<>();
    }

    public static GroupCallMessagesController getInstance(int i10) {
        GroupCallMessagesController groupCallMessagesController;
        GroupCallMessagesController groupCallMessagesController2 = Instance[i10];
        if (groupCallMessagesController2 == null) {
            synchronized (GroupCallMessagesController.class) {
                try {
                    groupCallMessagesController = Instance[i10];
                    if (groupCallMessagesController == null) {
                        GroupCallMessagesController[] groupCallMessagesControllerArr = Instance;
                        GroupCallMessagesController groupCallMessagesController3 = new GroupCallMessagesController(i10);
                        groupCallMessagesControllerArr[i10] = groupCallMessagesController3;
                        groupCallMessagesController = groupCallMessagesController3;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return groupCallMessagesController;
        }
        return groupCallMessagesController2;
    }

    private byte[] groupCallMessageDecrypt(long j3, long j10, byte[] bArr) {
        ConferenceCall conferenceCall;
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null || sharedInstance.getAccount() != this.currentAccount || (conferenceCall = sharedInstance.conference) == null || (groupCall = conferenceCall.groupCall) == null || groupCall.f19906id != j3) {
            return null;
        }
        long callId = conferenceCall.getCallId();
        if (callId == -1) {
            return null;
        }
        return groupCallMessageDecryptImpl(callId, j10, bArr);
    }

    private static native byte[] groupCallMessageDecryptImpl(long j3, long j10, byte[] bArr);

    private static native byte[] groupCallMessageEncryptImpl(long j3, byte[] bArr);

    public void lambda$processUpdate$3(long j3, long j10, byte[] bArr) {
        TLRPC.TL_groupCallMessage tL_groupCallMessage = null;
        try {
            byte[] groupCallMessageDecrypt = groupCallMessageDecrypt(j3, j10, bArr);
            if (groupCallMessageDecrypt != null) {
                tL_groupCallMessage = TLRPC.TL_groupCallMessage.TLJsonDeserialize(new TLJsonParser(new JSONObject(new String(groupCallMessageDecrypt))));
            }
        } catch (Exception e7) {
            FileLog.e(e7);
        }
        if (tL_groupCallMessage != null) {
            AndroidUtilities.runOnUIThread(new h(this, j3, new GroupCallMessage(this.currentAccount, j10, tL_groupCallMessage.random_id, tL_groupCallMessage.message), 1));
            return;
        }
        TLRPC.TL_groupCallMessage tL_groupCallMessage2 = new TLRPC.TL_groupCallMessage();
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        tL_groupCallMessage2.message = tL_textWithEntities;
        tL_textWithEntities.text = LocaleController.getString(R.string.GroupCalMessageDecryptionError);
        AndroidUtilities.runOnUIThread(new h(this, j3, new GroupCallMessage(this.currentAccount, j10, 0L, tL_groupCallMessage2.message), 2));
    }

    public static void lambda$sendCallMessage$4(GroupCallMessage groupCallMessage) {
        groupCallMessage.setIsSendDelayed(true);
        groupCallMessage.notifyStateUpdate();
    }

    public void lambda$sendCallMessage$5(Runnable runnable, GroupCallMessage groupCallMessage, TLObject tLObject, TLRPC.TL_error tL_error) {
        AndroidUtilities.cancelRunOnUIThread(runnable);
        groupCallMessage.setIsSendDelayed(false);
        if (tLObject instanceof TLRPC.Bool) {
            if (tLObject instanceof TLRPC.TL_boolTrue) {
                groupCallMessage.setIsSendConfirmed(true);
            } else {
                groupCallMessage.setIsSendError(true);
            }
        } else if (tLObject instanceof TLRPC.Updates) {
            groupCallMessage.setIsSendConfirmed(true);
            getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
        }
        AndroidUtilities.runOnUIThread(new g(groupCallMessage, 0));
    }

    public void lambda$pushMessageToList$6(long j3) {
        MessagesList messagesList = this.callMessagesList.get(j3);
        if (messagesList != null) {
            messagesList.pop();
            if (messagesList.isEmpty()) {
                this.callMessagesList.remove(j3);
            }
            List<CallMessageListener> list = this.callMessagesListeners.get(j3);
            if (list != null) {
                for (CallMessageListener callMessageListener : list) {
                    callMessageListener.onPopGroupCallMessage();
                }
            }
            List<CallMessageListener> list2 = this.callMessagesListeners.get(0L);
            if (list2 != null) {
                for (CallMessageListener callMessageListener2 : list2) {
                    callMessageListener2.onPopGroupCallMessage();
                }
            }
        }
    }

    public void lambda$processUpdate$2(long j3, GroupCallMessage groupCallMessage) {
        MessagesList messagesList = this.callMessagesList.get(j3);
        if (messagesList == null) {
            messagesList = new MessagesList();
            this.callMessagesList.put(j3, messagesList);
        }
        if (!messagesList.push(groupCallMessage)) {
            return;
        }
        List<CallMessageListener> list = this.callMessagesListeners.get(j3);
        if (list != null) {
            for (CallMessageListener callMessageListener : list) {
                callMessageListener.onNewGroupCallMessage(j3, groupCallMessage);
            }
        }
        List<CallMessageListener> list2 = this.callMessagesListeners.get(0L);
        if (list2 != null) {
            for (CallMessageListener callMessageListener2 : list2) {
                callMessageListener2.onNewGroupCallMessage(j3, groupCallMessage);
            }
        }
        AndroidUtilities.runOnUIThread(new bi.g(this, j3, 15), getAppGlobalConfig().groupCallMessageTtl.get(TimeUnit.MILLISECONDS));
    }

    public List<GroupCallMessage> getCallMessages(long j3) {
        MessagesList messagesList = this.callMessagesList.get(j3);
        if (messagesList != null) {
            return new ArrayList(messagesList.messages);
        }
        return new ArrayList();
    }

    public void processUpdate(TL_update.TL_updateGroupCallMessage tL_updateGroupCallMessage) {
        long j3 = tL_updateGroupCallMessage.call.f19913id;
        long peerDialogId = DialogObject.getPeerDialogId(tL_updateGroupCallMessage.message.from_id);
        long j10 = tL_updateGroupCallMessage.message.f19907id;
        if (getUserConfig().clientUserId == peerDialogId) {
            return;
        }
        AndroidUtilities.runOnUIThread(new h(this, j3, new GroupCallMessage(this.currentAccount, peerDialogId, j10, tL_updateGroupCallMessage.message.message), 0));
    }

    public boolean sendCallMessage(long j3, TLRPC.TL_textWithEntities tL_textWithEntities, long j10, TLRPC.InputGroupCall inputGroupCall) {
        TL_phone.sendGroupCallMessage sendgroupcallmessage;
        TLRPC.GroupCall groupCall;
        byte[] groupCallMessageEncryptImpl;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.getAccount() == this.currentAccount) {
            long nextRandomId = getSendMessagesHelper().getNextRandomId();
            if (sharedInstance.isConference()) {
                ConferenceCall conferenceCall = sharedInstance.conference;
                if (conferenceCall != null && (groupCall = conferenceCall.groupCall) != null && groupCall.f19906id == j10) {
                    long callId = conferenceCall.getCallId();
                    if (callId != -1) {
                        TLRPC.TL_groupCallMessage tL_groupCallMessage = new TLRPC.TL_groupCallMessage();
                        tL_groupCallMessage.message = tL_textWithEntities;
                        tL_groupCallMessage.random_id = nextRandomId;
                        JSONObject serialize = TLJsonBuilder.serialize(tL_groupCallMessage);
                        if (serialize != null && (groupCallMessageEncryptImpl = groupCallMessageEncryptImpl(callId, serialize.toString().getBytes(StandardCharsets.UTF_8))) != null) {
                            TL_phone.sendGroupCallEncryptedMessage sendgroupcallencryptedmessage = new TL_phone.sendGroupCallEncryptedMessage();
                            sendgroupcallencryptedmessage.call = inputGroupCall;
                            sendgroupcallencryptedmessage.encrypted_message = groupCallMessageEncryptImpl;
                            sendgroupcallmessage = sendgroupcallencryptedmessage;
                        } else {
                            return false;
                        }
                    } else {
                        return false;
                    }
                } else {
                    return false;
                }
            } else {
                TL_phone.sendGroupCallMessage sendgroupcallmessage2 = new TL_phone.sendGroupCallMessage();
                sendgroupcallmessage2.call = inputGroupCall;
                sendgroupcallmessage2.message = tL_textWithEntities;
                sendgroupcallmessage2.random_id = nextRandomId;
                sendgroupcallmessage = sendgroupcallmessage2;
            }
            GroupCallMessage groupCallMessage = new GroupCallMessage(this.currentAccount, j3, nextRandomId, tL_textWithEntities);
            groupCallMessage.setIsOut(true);
            lambda$processUpdate$2(j10, groupCallMessage);
            g gVar = new g(groupCallMessage, 1);
            AndroidUtilities.runOnUIThread(gVar, 1000L);
            getConnectionsManager().sendRequest(sendgroupcallmessage, new o(this, gVar, groupCallMessage, 1));
            return true;
        }
        return false;
    }

    public void subscribeToCallMessages(long j3, CallMessageListener callMessageListener) {
        List<CallMessageListener> list = this.callMessagesListeners.get(j3);
        if (list == null) {
            list = new ArrayList<>();
            this.callMessagesListeners.put(j3, list);
        }
        list.add(callMessageListener);
    }

    public void unsubscribeFromCallMessages(long j3, CallMessageListener callMessageListener) {
        List<CallMessageListener> list = this.callMessagesListeners.get(j3);
        if (list != null) {
            list.remove(callMessageListener);
            if (list.isEmpty()) {
                this.callMessagesListeners.remove(j3);
            }
        }
    }

    public void processUpdate(TL_update.TL_updateGroupCallEncryptedMessage tL_updateGroupCallEncryptedMessage) {
        long j3 = tL_updateGroupCallEncryptedMessage.call.f19913id;
        long peerDialogId = DialogObject.getPeerDialogId(tL_updateGroupCallEncryptedMessage.from_id);
        byte[] bArr = tL_updateGroupCallEncryptedMessage.encrypted_message;
        if (getUserConfig().clientUserId == peerDialogId) {
            return;
        }
        Utilities.globalQueue.postRunnable(new a3.g0(this, j3, peerDialogId, bArr, 10));
    }
}
