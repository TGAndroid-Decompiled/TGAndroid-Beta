package org.telegram.messenger.voip;

import android.util.LongSparseArray;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
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
import org.telegram.ui.LaunchActivity$$ExternalSyntheticLambda37;
import org.telegram.ui.LinkManager$3$$ExternalSyntheticLambda0;

public class GroupCallMessagesController extends BaseController {
    private static volatile GroupCallMessagesController[] Instance = new GroupCallMessagesController[4];
    private final LongSparseArray<MessagesList> callMessagesList;
    private final LongSparseArray<List<CallMessageListener>> callMessagesListeners;

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
            if (this.messages.isEmpty()) {
                return;
            }
            List<GroupCallMessage> list = this.messages;
            long j = list.remove(list.size() - 1).randomId;
            if (j != 0) {
                this.randomIds.remove(Long.valueOf(j));
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
    }

    public static GroupCallMessagesController getInstance(int i) {
        GroupCallMessagesController groupCallMessagesController;
        GroupCallMessagesController groupCallMessagesController2 = Instance[i];
        if (groupCallMessagesController2 != null) {
            return groupCallMessagesController2;
        }
        synchronized (GroupCallMessagesController.class) {
            try {
                groupCallMessagesController = Instance[i];
                if (groupCallMessagesController == null) {
                    GroupCallMessagesController[] groupCallMessagesControllerArr = Instance;
                    GroupCallMessagesController groupCallMessagesController3 = new GroupCallMessagesController(i);
                    groupCallMessagesControllerArr[i] = groupCallMessagesController3;
                    groupCallMessagesController = groupCallMessagesController3;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return groupCallMessagesController;
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

    public void lambda$processUpdate$3(long j, long j2, byte[] bArr) {
        TLRPC.TL_groupCallMessage tL_groupCallMessageTLJsonDeserialize;
        try {
            byte[] bArrGroupCallMessageDecrypt = groupCallMessageDecrypt(j, j2, bArr);
            tL_groupCallMessageTLJsonDeserialize = bArrGroupCallMessageDecrypt != null ? TLRPC.TL_groupCallMessage.TLJsonDeserialize(new TLJsonParser(new JSONObject(new String(bArrGroupCallMessageDecrypt)))) : null;
        } catch (Exception e) {
            FileLog.e(e);
        }
        if (tL_groupCallMessageTLJsonDeserialize != null) {
            AndroidUtilities.runOnUIThread(new GroupCallMessagesController$$ExternalSyntheticLambda2(this, j, new GroupCallMessage(this.currentAccount, j2, tL_groupCallMessageTLJsonDeserialize.random_id, tL_groupCallMessageTLJsonDeserialize.message), 1));
            return;
        }
        TLRPC.TL_groupCallMessage tL_groupCallMessage = new TLRPC.TL_groupCallMessage();
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        tL_groupCallMessage.message = tL_textWithEntities;
        tL_textWithEntities.text = LocaleController.getString(R.string.GroupCalMessageDecryptionError);
        AndroidUtilities.runOnUIThread(new GroupCallMessagesController$$ExternalSyntheticLambda2(this, j, new GroupCallMessage(this.currentAccount, j2, 0L, tL_groupCallMessage.message), 2));
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
        AndroidUtilities.runOnUIThread(new GroupCallMessagesController$$ExternalSyntheticLambda0(groupCallMessage, 0));
    }

    public void lambda$pushMessageToList$6(long j) {
        MessagesList messagesList = this.callMessagesList.get(j);
        if (messagesList == null) {
            return;
        }
        messagesList.pop();
        if (messagesList.isEmpty()) {
            this.callMessagesList.remove(j);
        }
        List<CallMessageListener> list = this.callMessagesListeners.get(j);
        if (list != null) {
            Iterator<CallMessageListener> it = list.iterator();
            while (it.hasNext()) {
                it.next().onPopGroupCallMessage();
            }
        }
        List<CallMessageListener> list2 = this.callMessagesListeners.get(0L);
        if (list2 != null) {
            Iterator<CallMessageListener> it2 = list2.iterator();
            while (it2.hasNext()) {
                it2.next().onPopGroupCallMessage();
            }
        }
    }

    public void lambda$processUpdate$2(long j, GroupCallMessage groupCallMessage) {
        MessagesList messagesList = this.callMessagesList.get(j);
        if (messagesList == null) {
            messagesList = new MessagesList();
            this.callMessagesList.put(j, messagesList);
        }
        if (messagesList.push(groupCallMessage)) {
            List<CallMessageListener> list = this.callMessagesListeners.get(j);
            if (list != null) {
                Iterator<CallMessageListener> it = list.iterator();
                while (it.hasNext()) {
                    it.next().onNewGroupCallMessage(j, groupCallMessage);
                }
            }
            List<CallMessageListener> list2 = this.callMessagesListeners.get(0L);
            if (list2 != null) {
                Iterator<CallMessageListener> it2 = list2.iterator();
                while (it2.hasNext()) {
                    it2.next().onNewGroupCallMessage(j, groupCallMessage);
                }
            }
            AndroidUtilities.runOnUIThread(new LinkManager$3$$ExternalSyntheticLambda0(this, j, 4), getAppGlobalConfig().groupCallMessageTtl.get(TimeUnit.MILLISECONDS));
        }
    }

    public List<GroupCallMessage> getCallMessages(long j) {
        MessagesList messagesList = this.callMessagesList.get(j);
        return messagesList != null ? new ArrayList(messagesList.messages) : new ArrayList();
    }

    public void processUpdate(TL_update.TL_updateGroupCallMessage tL_updateGroupCallMessage) {
        long j = tL_updateGroupCallMessage.call.id;
        long peerDialogId = DialogObject.getPeerDialogId(tL_updateGroupCallMessage.message.from_id);
        long j2 = tL_updateGroupCallMessage.message.id;
        if (getUserConfig().clientUserId == peerDialogId) {
            return;
        }
        AndroidUtilities.runOnUIThread(new GroupCallMessagesController$$ExternalSyntheticLambda2(this, j, new GroupCallMessage(this.currentAccount, peerDialogId, j2, tL_updateGroupCallMessage.message.message), 0));
    }

    public boolean sendCallMessage(long j, TLRPC.TL_textWithEntities tL_textWithEntities, long j2, TLRPC.InputGroupCall inputGroupCall) {
        TLObject tLObject;
        TLRPC.GroupCall groupCall;
        byte[] bArrGroupCallMessageEncryptImpl;
        VoIPService sharedInstance = VoIPService.getSharedInstance();
        if (sharedInstance == null || sharedInstance.getAccount() != this.currentAccount) {
            return false;
        }
        long nextRandomId = getSendMessagesHelper().getNextRandomId();
        if (sharedInstance.isConference()) {
            ConferenceCall conferenceCall = sharedInstance.conference;
            if (conferenceCall == null || (groupCall = conferenceCall.groupCall) == null || groupCall.id != j2) {
                return false;
            }
            long callId = conferenceCall.getCallId();
            if (callId == -1) {
                return false;
            }
            TLRPC.TL_groupCallMessage tL_groupCallMessage = new TLRPC.TL_groupCallMessage();
            tL_groupCallMessage.message = tL_textWithEntities;
            tL_groupCallMessage.random_id = nextRandomId;
            JSONObject jSONObjectSerialize = TLJsonBuilder.serialize(tL_groupCallMessage);
            if (jSONObjectSerialize == null || (bArrGroupCallMessageEncryptImpl = groupCallMessageEncryptImpl(callId, jSONObjectSerialize.toString().getBytes(StandardCharsets.UTF_8))) == null) {
                return false;
            }
            TL_phone.sendGroupCallEncryptedMessage sendgroupcallencryptedmessage = new TL_phone.sendGroupCallEncryptedMessage();
            sendgroupcallencryptedmessage.call = inputGroupCall;
            sendgroupcallencryptedmessage.encrypted_message = bArrGroupCallMessageEncryptImpl;
            tLObject = sendgroupcallencryptedmessage;
        } else {
            TL_phone.sendGroupCallMessage sendgroupcallmessage = new TL_phone.sendGroupCallMessage();
            sendgroupcallmessage.call = inputGroupCall;
            sendgroupcallmessage.message = tL_textWithEntities;
            sendgroupcallmessage.random_id = nextRandomId;
            tLObject = sendgroupcallmessage;
        }
        GroupCallMessage groupCallMessage = new GroupCallMessage(this.currentAccount, j, nextRandomId, tL_textWithEntities);
        groupCallMessage.setIsOut(true);
        lambda$processUpdate$2(j2, groupCallMessage);
        GroupCallMessagesController$$ExternalSyntheticLambda0 groupCallMessagesController$$ExternalSyntheticLambda0 = new GroupCallMessagesController$$ExternalSyntheticLambda0(groupCallMessage, 1);
        AndroidUtilities.runOnUIThread(groupCallMessagesController$$ExternalSyntheticLambda0, 1000L);
        getConnectionsManager().sendRequest(tLObject, new VoIPService$$ExternalSyntheticLambda77(this, groupCallMessagesController$$ExternalSyntheticLambda0, groupCallMessage, 2));
        return true;
    }

    public void subscribeToCallMessages(long j, CallMessageListener callMessageListener) {
        List<CallMessageListener> arrayList = this.callMessagesListeners.get(j);
        if (arrayList == null) {
            arrayList = new ArrayList<>();
            this.callMessagesListeners.put(j, arrayList);
        }
        arrayList.add(callMessageListener);
    }

    public void unsubscribeFromCallMessages(long j, CallMessageListener callMessageListener) {
        List<CallMessageListener> list = this.callMessagesListeners.get(j);
        if (list == null) {
            return;
        }
        list.remove(callMessageListener);
        if (list.isEmpty()) {
            this.callMessagesListeners.remove(j);
        }
    }

    public void processUpdate(TL_update.TL_updateGroupCallEncryptedMessage tL_updateGroupCallEncryptedMessage) {
        long j = tL_updateGroupCallEncryptedMessage.call.id;
        long peerDialogId = DialogObject.getPeerDialogId(tL_updateGroupCallEncryptedMessage.from_id);
        byte[] bArr = tL_updateGroupCallEncryptedMessage.encrypted_message;
        if (getUserConfig().clientUserId == peerDialogId) {
            return;
        }
        Utilities.globalQueue.postRunnable(new LaunchActivity$$ExternalSyntheticLambda37(8, j, peerDialogId, this, bArr));
    }
}
