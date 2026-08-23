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
import org.telegram.tgnet.RequestDelegate;
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
        void onNewGroupCallMessage(long j, GroupCallMessage groupCallMessage);

        void onPopGroupCallMessage();
    }

    private static native byte[] groupCallMessageDecryptImpl(long j, long j2, byte[] bArr);

    private static native byte[] groupCallMessageEncryptImpl(long j, byte[] bArr);

    public void processUpdate(TL_update.TL_updateGroupCallMessage tL_updateGroupCallMessage) {
        final long j = tL_updateGroupCallMessage.call.id;
        long peerDialogId = DialogObject.getPeerDialogId(tL_updateGroupCallMessage.message.from_id);
        long j2 = tL_updateGroupCallMessage.message.id;
        if (getUserConfig().clientUserId == peerDialogId) {
            return;
        }
        final GroupCallMessage groupCallMessage = new GroupCallMessage(this.currentAccount, peerDialogId, j2, tL_updateGroupCallMessage.message.message);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.pushMessageToList(j, groupCallMessage);
            }
        });
    }

    public void processUpdate(TL_update.TL_updateGroupCallEncryptedMessage tL_updateGroupCallEncryptedMessage) {
        final long j = tL_updateGroupCallEncryptedMessage.call.id;
        final long peerDialogId = DialogObject.getPeerDialogId(tL_updateGroupCallEncryptedMessage.from_id);
        final byte[] bArr = tL_updateGroupCallEncryptedMessage.encrypted_message;
        if (getUserConfig().clientUserId == peerDialogId) {
            return;
        }
        Utilities.globalQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                GroupCallMessagesController.$r8$lambda$Q4vnQYOfFG5iwiYH_2sYduKwWtY(this.f$0, j, peerDialogId, bArr);
            }
        });
    }

    public static void $r8$lambda$Q4vnQYOfFG5iwiYH_2sYduKwWtY(final GroupCallMessagesController groupCallMessagesController, final long j, long j2, byte[] bArr) {
        long j3;
        TLRPC.TL_groupCallMessage tL_groupCallMessageTLJsonDeserialize;
        groupCallMessagesController.getClass();
        try {
            byte[] bArrGroupCallMessageDecrypt = groupCallMessagesController.groupCallMessageDecrypt(j, j2, bArr);
            j3 = j2;
            if (bArrGroupCallMessageDecrypt != null) {
                try {
                    tL_groupCallMessageTLJsonDeserialize = TLRPC.TL_groupCallMessage.TLJsonDeserialize(new TLJsonParser(new JSONObject(new String(bArrGroupCallMessageDecrypt))));
                } catch (Exception e) {
                    e = e;
                    FileLog.e(e);
                    tL_groupCallMessageTLJsonDeserialize = null;
                }
            } else {
                tL_groupCallMessageTLJsonDeserialize = null;
            }
        } catch (Exception e2) {
            e = e2;
            j3 = j2;
        }
        if (tL_groupCallMessageTLJsonDeserialize != null) {
            final GroupCallMessage groupCallMessage = new GroupCallMessage(groupCallMessagesController.currentAccount, j3, tL_groupCallMessageTLJsonDeserialize.random_id, tL_groupCallMessageTLJsonDeserialize.message);
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.pushMessageToList(j, groupCallMessage);
                }
            });
            return;
        }
        TLRPC.TL_groupCallMessage tL_groupCallMessage = new TLRPC.TL_groupCallMessage();
        TLRPC.TL_textWithEntities tL_textWithEntities = new TLRPC.TL_textWithEntities();
        tL_groupCallMessage.message = tL_textWithEntities;
        tL_textWithEntities.text = LocaleController.getString(R.string.GroupCalMessageDecryptionError);
        final GroupCallMessage groupCallMessage2 = new GroupCallMessage(groupCallMessagesController.currentAccount, j3, 0L, tL_groupCallMessage.message);
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.pushMessageToList(j, groupCallMessage2);
            }
        });
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
        TLObject tLObject2 = tLObject;
        final GroupCallMessage groupCallMessage = new GroupCallMessage(this.currentAccount, j, nextRandomId, tL_textWithEntities);
        groupCallMessage.setIsOut(true);
        pushMessageToList(j2, groupCallMessage);
        final Runnable runnable = new Runnable() {
            @Override
            public final void run() {
                GroupCallMessagesController.m1164$r8$lambda$BoiMzYkL9iUych8eS3PH9Yfbqk(groupCallMessage);
            }
        };
        AndroidUtilities.runOnUIThread(runnable, 1000L);
        getConnectionsManager().sendRequest(tLObject2, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject3, TLRPC.TL_error tL_error) throws InterruptedException {
                GroupCallMessagesController.$r8$lambda$VzzBboZA8u_uNA8V1CQXkhktdSw(this.f$0, runnable, groupCallMessage, tLObject3, tL_error);
            }
        });
        return true;
    }

    public static void m1164$r8$lambda$BoiMzYkL9iUych8eS3PH9Yfbqk(GroupCallMessage groupCallMessage) {
        groupCallMessage.setIsSendDelayed(true);
        groupCallMessage.notifyStateUpdate();
    }

    public static void $r8$lambda$VzzBboZA8u_uNA8V1CQXkhktdSw(GroupCallMessagesController groupCallMessagesController, Runnable runnable, final GroupCallMessage groupCallMessage, TLObject tLObject, TLRPC.TL_error tL_error) throws InterruptedException {
        groupCallMessagesController.getClass();
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
            groupCallMessagesController.getMessagesController().processUpdates((TLRPC.Updates) tLObject, false);
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                groupCallMessage.notifyStateUpdate();
            }
        });
    }

    public List<GroupCallMessage> getCallMessages(long j) {
        MessagesList messagesList = this.callMessagesList.get(j);
        return messagesList != null ? new ArrayList(messagesList.messages) : new ArrayList();
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

    public void pushMessageToList(final long j, GroupCallMessage groupCallMessage) {
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
            AndroidUtilities.runOnUIThread(new Runnable() {
                @Override
                public final void run() {
                    this.f$0.popMessageFromList(j);
                }
            }, getAppGlobalConfig().groupCallMessageTtl.get(TimeUnit.MILLISECONDS));
        }
    }

    public void popMessageFromList(long j) {
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

    private static class MessagesList {
        private final List<GroupCallMessage> messages;
        private final Set<Long> randomIds;

        private MessagesList() {
            this.messages = new ArrayList();
            this.randomIds = new HashSet();
        }

        boolean push(GroupCallMessage groupCallMessage) {
            long j = groupCallMessage.randomId;
            if (j != 0 && !this.randomIds.add(Long.valueOf(j))) {
                return false;
            }
            this.messages.add(0, groupCallMessage);
            return true;
        }

        void pop() {
            if (this.messages.isEmpty()) {
                return;
            }
            List<GroupCallMessage> list = this.messages;
            long j = list.remove(list.size() - 1).randomId;
            if (j != 0) {
                this.randomIds.remove(Long.valueOf(j));
            }
        }

        boolean isEmpty() {
            return this.messages.isEmpty();
        }
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

    private GroupCallMessagesController(int i) {
        super(i);
        this.callMessagesListeners = new LongSparseArray<>();
        this.callMessagesList = new LongSparseArray<>();
    }
}
