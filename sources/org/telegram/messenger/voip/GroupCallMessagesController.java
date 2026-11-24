package org.telegram.messenger.voip;

import android.util.LongSparseArray;
import j$.util.concurrent.ConcurrentHashMap;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import org.json.JSONObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.json.TLJsonBuilder;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_update;
public class GroupCallMessagesController extends pf0 {
    private static volatile GroupCallMessagesController[] Instance = new GroupCallMessagesController[4];
    private final LongSparseArray<MessagesList> callMessagesList;
    private final LongSparseArray<List<CallMessageListener>> callMessagesListeners;
    private final Set<String> sentMessageIds;

    public interface CallMessageListener {
        void onNewGroupCallMessage(long j, GroupCallMessage groupCallMessage);

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
                long j = list.remove(list.size() - 1).randomId;
                if (j != 0) {
                    this.randomIds.remove(Long.valueOf(j));
                }
            }
        }

        public boolean push(GroupCallMessage groupCallMessage) {
            long j = groupCallMessage.randomId;
            if (j != 0 && !this.randomIds.add(Long.valueOf(j))) {
                return false;
            }
            this.messages.add(0, groupCallMessage);
            return true;
        }
    }

    private GroupCallMessagesController(int i) {
        super(i);
        this.callMessagesListeners = new LongSparseArray<>();
        this.callMessagesList = new LongSparseArray<>();
        this.sentMessageIds = ConcurrentHashMap.newKeySet();
    }

    public static GroupCallMessagesController getInstance(int i) {
        GroupCallMessagesController groupCallMessagesController;
        GroupCallMessagesController groupCallMessagesController2 = Instance[i];
        if (groupCallMessagesController2 == null) {
            synchronized (GroupCallMessagesController.class) {
                groupCallMessagesController = Instance[i];
                if (groupCallMessagesController == null) {
                    GroupCallMessagesController[] groupCallMessagesControllerArr = Instance;
                    GroupCallMessagesController groupCallMessagesController3 = new GroupCallMessagesController(i);
                    groupCallMessagesControllerArr[i] = groupCallMessagesController3;
                    groupCallMessagesController = groupCallMessagesController3;
                }
            }
            return groupCallMessagesController;
        }
        return groupCallMessagesController2;
    }

    private byte[] groupCallMessageDecrypt(long j, long j2, byte[] bArr) {
        ConferenceCall conferenceCall;
        TLRPC.GroupCall groupCall;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null || sharedInstance.getAccount() != this.currentAccount || (conferenceCall = sharedInstance.conference) == null || (groupCall = conferenceCall.groupCall) == null || groupCall.id != j) {
            return null;
        }
        long callId = conferenceCall.getCallId();
        if (callId == -1) {
            return null;
        }
        return groupCallMessageDecryptImpl(callId, j2, bArr);
    }

    private static native byte[] groupCallMessageDecryptImpl(long j, long j2, byte[] bArr);

    private static native byte[] groupCallMessageEncryptImpl(long j, byte[] bArr);

    public void lambda$processUpdate$3(long r10, long r12, byte[] r14) {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.voip.GroupCallMessagesController.lambda$processUpdate$3(long, long, byte[]):void");
    }

    public static void lambda$sendCallMessage$4(GroupCallMessage groupCallMessage) {
        groupCallMessage.setIsSendDelayed(true);
        groupCallMessage.notifyStateUpdate();
    }

    public void lambda$sendCallMessage$5(String str) {
        this.sentMessageIds.remove(str);
    }

    public void lambda$sendCallMessage$6(Runnable runnable, GroupCallMessage groupCallMessage, long j, long j2, TLObject tLObject, TLRPC.TL_error tL_error) {
        TL_update.TL_updateGroupCallMessage tL_updateGroupCallMessage;
        TLRPC.InputGroupCall inputGroupCall;
        TLRPC.GroupCallMessage groupCallMessage2;
        gl.r(runnable);
        groupCallMessage.setIsSendDelayed(false);
        if (tLObject instanceof TLRPC.Bool) {
            if (tLObject instanceof TLRPC.TL_boolTrue) {
                groupCallMessage.setIsSendConfirmed(true);
            } else {
                groupCallMessage.setIsSendError(true);
            }
        } else if (tLObject instanceof TLRPC.Updates) {
            groupCallMessage.setIsSendConfirmed(true);
            TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            ArrayList arrayList = new ArrayList(updates.updates);
            TLRPC.Update update = updates.update;
            if (update != null) {
                arrayList.add(update);
            }
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                TLRPC.Update update2 = (TLRPC.Update) obj;
                if ((update2 instanceof TL_update.TL_updateGroupCallMessage) && (inputGroupCall = (tL_updateGroupCallMessage = (TL_update.TL_updateGroupCallMessage) update2).call) != null && inputGroupCall.id == j && (groupCallMessage2 = tL_updateGroupCallMessage.message) != null && cf3.n(groupCallMessage2.from_id) == j2) {
                    String str = j + "_" + tL_updateGroupCallMessage.message.id;
                    if (this.sentMessageIds.add(str)) {
                        gl.e3(new vc4(this, str, (byte) 25), 60000L);
                    }
                }
            }
            getMessagesController().Q3(updates, false);
        }
        gl.d3(new w75(groupCallMessage, (byte) 0));
    }

    public void lambda$pushMessageToList$7(long j) {
        MessagesList messagesList = this.callMessagesList.get(j);
        if (messagesList != null) {
            messagesList.pop();
            if (messagesList.isEmpty()) {
                this.callMessagesList.remove(j);
            }
            List<CallMessageListener> list = this.callMessagesListeners.get(j);
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

    public void lambda$processUpdate$2(long j, GroupCallMessage groupCallMessage) {
        MessagesList messagesList = this.callMessagesList.get(j);
        if (messagesList == null) {
            messagesList = new MessagesList();
            this.callMessagesList.put(j, messagesList);
        }
        if (!messagesList.push(groupCallMessage)) {
            return;
        }
        List<CallMessageListener> list = this.callMessagesListeners.get(j);
        if (list != null) {
            for (CallMessageListener callMessageListener : list) {
                callMessageListener.onNewGroupCallMessage(j, groupCallMessage);
            }
        }
        List<CallMessageListener> list2 = this.callMessagesListeners.get(0L);
        if (list2 != null) {
            for (CallMessageListener callMessageListener2 : list2) {
                callMessageListener2.onNewGroupCallMessage(j, groupCallMessage);
            }
        }
        gl.e3(new et(this, j, (byte) 17), getAppGlobalConfig().A.g(TimeUnit.MILLISECONDS));
    }

    public List<GroupCallMessage> getCallMessages(long j) {
        MessagesList messagesList = this.callMessagesList.get(j);
        if (messagesList != null) {
            return new ArrayList(messagesList.messages);
        }
        return new ArrayList();
    }

    public void processUpdate(TL_update.TL_updateGroupCallMessage tL_updateGroupCallMessage) {
        long j = tL_updateGroupCallMessage.call.id;
        long n = cf3.n(tL_updateGroupCallMessage.message.from_id);
        long j2 = tL_updateGroupCallMessage.message.id;
        if (getUserConfig().n != n) {
            if (this.sentMessageIds.contains(j + "_" + j2)) {
                return;
            }
            gl.d3(new v75(this, j, new GroupCallMessage(this.currentAccount, n, j2, tL_updateGroupCallMessage.message.message), (byte) 0));
        }
    }

    public boolean sendCallMessage(long j, TLRPC.TL_textWithEntities tL_textWithEntities, long j2, TLRPC.InputGroupCall inputGroupCall) {
        TL_phone.sendGroupCallMessage sendgroupcallmessage;
        TLRPC.GroupCall groupCall;
        byte[] groupCallMessageEncryptImpl;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance != null && sharedInstance.getAccount() == this.currentAccount) {
            getSendMessagesHelper().getClass();
            long D = z3a.D();
            if (sharedInstance.isConference()) {
                ConferenceCall conferenceCall = sharedInstance.conference;
                if (conferenceCall != null && (groupCall = conferenceCall.groupCall) != null && groupCall.id == j2) {
                    long callId = conferenceCall.getCallId();
                    if (callId != -1) {
                        TLRPC.TL_groupCallMessage tL_groupCallMessage = new TLRPC.TL_groupCallMessage();
                        tL_groupCallMessage.message = tL_textWithEntities;
                        tL_groupCallMessage.random_id = D;
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
                sendgroupcallmessage2.random_id = D;
                sendgroupcallmessage = sendgroupcallmessage2;
            }
            TL_phone.sendGroupCallMessage sendgroupcallmessage3 = sendgroupcallmessage;
            GroupCallMessage groupCallMessage = new GroupCallMessage(this.currentAccount, j, D, tL_textWithEntities);
            groupCallMessage.setIsOut(true);
            lambda$processUpdate$2(j2, groupCallMessage);
            w75 w75Var = new w75(groupCallMessage, (byte) 1);
            gl.e3(w75Var, 1000L);
            getConnectionsManager().sendRequest(sendgroupcallmessage3, new x75(this, w75Var, groupCallMessage, j2, j));
            return true;
        }
        return false;
    }

    public void subscribeToCallMessages(long j, CallMessageListener callMessageListener) {
        List<CallMessageListener> list = this.callMessagesListeners.get(j);
        if (list == null) {
            list = new ArrayList<>();
            this.callMessagesListeners.put(j, list);
        }
        list.add(callMessageListener);
    }

    public void unsubscribeFromCallMessages(long j, CallMessageListener callMessageListener) {
        List<CallMessageListener> list = this.callMessagesListeners.get(j);
        if (list != null) {
            list.remove(callMessageListener);
            if (list.isEmpty()) {
                this.callMessagesListeners.remove(j);
            }
        }
    }

    public void processUpdate(TL_update.TL_updateGroupCallEncryptedMessage tL_updateGroupCallEncryptedMessage) {
        long j = tL_updateGroupCallEncryptedMessage.call.id;
        long n = cf3.n(tL_updateGroupCallEncryptedMessage.from_id);
        byte[] bArr = tL_updateGroupCallEncryptedMessage.encrypted_message;
        if (getUserConfig().n == n) {
            return;
        }
        Utilities.e.c(new n30(this, j, n, bArr, (byte) 4));
    }
}
