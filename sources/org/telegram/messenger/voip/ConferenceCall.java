package org.telegram.messenger.voip;

import android.text.TextUtils;
import android.util.LongSparseArray;
import j$.util.DesugarArrays;
import j$.util.function.Function$CC;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_phone;
import org.telegram.tgnet.tl.TL_update;

public class ConferenceCall {
    public static final int PERMISSION_ADD = 1;
    public static final int PERMISSION_REMOVE = 2;
    private int currentAccount;
    public boolean destroyed;
    public TLRPC.GroupCall groupCall;
    public TLRPC.InputGroupCall inputGroupCall;
    public boolean joined;
    private String[] lastVerificationEmojis;
    private byte[] last_block;
    private long my_private_key_id;
    private byte[] my_public_key;
    private long my_public_key_id;
    private long my_user_id;
    private boolean polling;
    private CallState state;
    private byte[] zero_block;
    private long call_id = -1;
    public final HashSet<Long> joiningBlockchainParticipants = new HashSet<>();
    private HashSet<Long> lastParticipants = null;
    private final int[] last_offset = {-1, -1};
    private final LongSparseArray<byte[]>[] blocksQueue = {new LongSparseArray<>(), new LongSparseArray<>()};
    private final Runnable pollRunnable = new Runnable() {
        @Override
        public final void run() {
            this.f$0.poll();
        }
    };
    private final int[] pollRequestId = new int[2];

    public static native CallState call_apply_block(long j, byte[] bArr);

    public static native long call_create(long j, long j2, byte[] bArr);

    public static native byte[] call_create_change_state_block(long j, CallState callState);

    public static native byte[] call_create_self_add_block(long j, byte[] bArr, CallParticipant callParticipant);

    public static native byte[] call_create_zero_block(long j, CallState callState);

    public static native String call_describe(long j);

    public static native String call_describe_block(byte[] bArr);

    public static native String call_describe_message(byte[] bArr);

    public static native void call_destroy(long j);

    public static native void call_destroy_all();

    public static native int call_get_height(long j);

    public static native CallState call_get_state(long j);

    public static native CallVerificationState call_get_verification_state(long j);

    public static native CallVerificationWords call_get_verification_words(long j);

    public static native byte[][] call_pull_outbound_messages(long j);

    public static native CallVerificationState call_receive_inbound_message(long j, byte[] bArr);

    public static native long key_from_public_key(byte[] bArr);

    public static native long key_generate_temporary_private_key();

    public static native byte[] key_to_public_key(long j);

    protected void gotCallId(long j) {
    }

    public static final class CallParticipant {
        int permissions;
        long public_key_id;
        long user_id;

        public String toString() {
            return "CallParticipant{user_id=" + this.user_id + ", public_key_id=" + this.public_key_id + "}";
        }
    }

    public static final class CallState {
        int height;
        CallParticipant[] participants;

        public CallParticipant find(long j) {
            int i = 0;
            while (true) {
                CallParticipant[] callParticipantArr = this.participants;
                if (i >= callParticipantArr.length) {
                    return null;
                }
                CallParticipant callParticipant = callParticipantArr[i];
                if (callParticipant.user_id == j) {
                    return callParticipant;
                }
                i++;
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder("CallState{height=" + this.height + ", participants=[");
            for (int i = 0; i < this.participants.length; i++) {
                if (i > 0) {
                    sb.append(", ");
                }
                CallParticipant callParticipant = this.participants[i];
                if (callParticipant == null) {
                    sb.append("null");
                } else {
                    sb.append(callParticipant.toString());
                }
            }
            sb.append("]}");
            return sb.toString();
        }
    }

    private static String blockStr(byte[] bArr) {
        return "Block{" + Utilities.bytesToHex(bArr) + "}";
    }

    public static final class CallVerificationState {
        byte[] emoji_hash;
        int height;

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder();
            sb.append("CallVerificationState{height=");
            sb.append(this.height);
            sb.append(", emoji_hash=");
            if (this.emoji_hash == null) {
                str = null;
            } else {
                str = "{" + Utilities.bytesToHex(this.emoji_hash) + "}";
            }
            sb.append(str);
            sb.append("}");
            return sb.toString();
        }
    }

    public static final class CallVerificationWords {
        int height;
        String[] words;

        public String toString() {
            StringBuilder sb = new StringBuilder("CallVerificationWords{height=" + this.height + ", words=[");
            for (int i = 0; i < this.words.length; i++) {
                if (i > 0) {
                    sb.append(", ");
                }
                sb.append(this.words[i]);
            }
            sb.append("]}");
            return sb.toString();
        }
    }

    private void checkEmojiHash() {
        String[] verificationEmojis = getVerificationEmojis();
        if (eq(verificationEmojis, this.lastVerificationEmojis)) {
            return;
        }
        this.lastVerificationEmojis = verificationEmojis;
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$checkEmojiHash$0();
            }
        });
    }

    public void lambda$checkEmojiHash$0() {
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.conferenceEmojiUpdated, new Object[0]);
    }

    private void checkParticipants() {
        long j = this.call_id;
        HashSet<Long> hashSet = null;
        if (j >= 0) {
            try {
                CallState callStateCall_get_state = call_get_state(j);
                if (callStateCall_get_state != null && callStateCall_get_state.participants.length > 0) {
                    HashSet<Long> hashSet2 = new HashSet<>();
                    int i = 0;
                    while (true) {
                        try {
                            CallParticipant[] callParticipantArr = callStateCall_get_state.participants;
                            if (i >= callParticipantArr.length) {
                                break;
                            }
                            hashSet2.add(Long.valueOf(callParticipantArr[i].user_id));
                            i++;
                        } catch (Exception e) {
                            e = e;
                            hashSet = hashSet2;
                            FileLog.e(e);
                        }
                    }
                    hashSet = hashSet2;
                }
            } catch (Exception e2) {
                e = e2;
            }
        }
        if (eq(hashSet, this.lastParticipants)) {
            return;
        }
        if (this.lastParticipants != null && hashSet != null) {
            for (Long l : hashSet) {
                l.longValue();
                if (!this.lastParticipants.contains(l)) {
                    this.joiningBlockchainParticipants.add(l);
                }
            }
            Iterator<Long> it = this.joiningBlockchainParticipants.iterator();
            while (it.hasNext()) {
                Long next = it.next();
                next.longValue();
                if (this.lastParticipants.contains(next)) {
                    it.remove();
                }
            }
        } else {
            this.joiningBlockchainParticipants.clear();
        }
        this.lastParticipants = hashSet;
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$checkParticipants$1();
            }
        });
    }

    public void lambda$checkParticipants$1() {
        VoIPService sharedInstance;
        ChatObject.Call call;
        TLRPC.GroupCall groupCall;
        if (this.groupCall == null || (sharedInstance = VoIPService.getSharedInstance()) == null || (call = sharedInstance.groupCall) == null || (groupCall = call.call) == null || groupCall.id != this.groupCall.id) {
            return;
        }
        updateParticipants(call.sortedParticipants, false);
        sharedInstance.groupCall.shadyLeftParticipants.clear();
        ChatObject.Call call2 = sharedInstance.groupCall;
        call2.shadyLeftParticipants.addAll(sharedInstance.conference.getShadyLeftParticipants(call2.sortedParticipants));
        sharedInstance.groupCall.shadyJoinParticipants.clear();
        ChatObject.Call call3 = sharedInstance.groupCall;
        call3.shadyJoinParticipants.addAll(sharedInstance.conference.getShadyJoiningParticipants(call3.sortedParticipants));
        NotificationCenter.getInstance(this.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.groupCallUpdated, 0L, Long.valueOf(this.groupCall.id), Boolean.FALSE);
    }

    private boolean eq(String[] strArr, String[] strArr2) {
        if (strArr == strArr2) {
            return true;
        }
        if (strArr == null && strArr2 == null) {
            return true;
        }
        if (strArr == null || strArr2 == null || strArr.length != strArr2.length) {
            return false;
        }
        for (int i = 0; i < strArr.length; i++) {
            if (!TextUtils.equals(strArr[i], strArr2[i])) {
                return false;
            }
        }
        return true;
    }

    private boolean eq(HashSet<Long> hashSet, HashSet<Long> hashSet2) {
        if (hashSet == hashSet2) {
            return true;
        }
        if (hashSet == null && hashSet2 == null) {
            return true;
        }
        if (hashSet == null || hashSet2 == null || hashSet.size() != hashSet2.size()) {
            return false;
        }
        for (Long l : hashSet) {
            l.longValue();
            if (!hashSet2.contains(l)) {
                return false;
            }
        }
        return true;
    }

    private String[] getVerificationEmojis() {
        byte[] bArr;
        long j = this.call_id;
        if (j < 0) {
            return null;
        }
        try {
            bArr = call_get_verification_state(j).emoji_hash;
        } catch (Exception e) {
            FileLog.e(e);
            bArr = null;
        }
        if (bArr == null) {
            return null;
        }
        if (bArr.length > 32) {
            byte[] bArr2 = new byte[32];
            System.arraycopy(bArr, 0, bArr2, 0, 32);
            bArr = bArr2;
        }
        return EncryptionKeyEmojifier.emojifyForCall(bArr);
    }

    public String[] getEmojis() {
        return this.lastVerificationEmojis;
    }

    public ConferenceCall(int i, long j) {
        this.currentAccount = i;
        this.my_user_id = j;
        init();
    }

    private void init() {
        long jKey_generate_temporary_private_key = key_generate_temporary_private_key();
        this.my_private_key_id = jKey_generate_temporary_private_key;
        byte[] bArrKey_to_public_key = key_to_public_key(jKey_generate_temporary_private_key);
        this.my_public_key = bArrKey_to_public_key;
        this.my_public_key_id = key_from_public_key(bArrKey_to_public_key);
        CallState callState = new CallState();
        this.state = callState;
        callState.height = 1;
        callState.participants = new CallParticipant[]{new CallParticipant()};
        CallParticipant callParticipant = this.state.participants[0];
        callParticipant.user_id = this.my_user_id;
        callParticipant.public_key_id = this.my_public_key_id;
        callParticipant.permissions = 3;
    }

    public byte[] getMyPublicKey() {
        return this.my_public_key;
    }

    public void requestLastBlock(final Runnable runnable) {
        final long jCurrentTimeMillis = System.currentTimeMillis();
        TL_phone.getGroupCallChainBlocks getgroupcallchainblocks = new TL_phone.getGroupCallChainBlocks();
        getgroupcallchainblocks.call = this.inputGroupCall;
        getgroupcallchainblocks.sub_chain_id = 0;
        getgroupcallchainblocks.offset = -1;
        getgroupcallchainblocks.limit = 1;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(getgroupcallchainblocks, new RequestDelegate() {
            @Override
            public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                this.f$0.lambda$requestLastBlock$3(jCurrentTimeMillis, runnable, tLObject, tL_error);
            }
        });
    }

    public void lambda$requestLastBlock$3(final long j, final Runnable runnable, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$requestLastBlock$2(j, tLObject, tL_error, runnable);
            }
        });
    }

    public void lambda$requestLastBlock$2(long j, TLObject tLObject, TLRPC.TL_error tL_error, Runnable runnable) {
        processUpdates(-1, Long.valueOf(j), tLObject, tL_error);
        if (runnable != null) {
            runnable.run();
        }
    }

    private boolean processUpdates(Integer num, Long l, final TLObject tLObject, TLRPC.TL_error tL_error) {
        if (!(tLObject instanceof TLRPC.Updates)) {
            return false;
        }
        Iterator it = MessagesController.findUpdatesAndRemove((TLRPC.Updates) tLObject, TL_update.TL_updateGroupCallChainBlocks.class).iterator();
        boolean z = false;
        while (it.hasNext()) {
            if (applyUpdate(num, (TL_update.TL_updateGroupCallChainBlocks) it.next(), false, l)) {
                z = true;
            }
        }
        Utilities.stageQueue.postRunnable(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$processUpdates$4(tLObject);
            }
        });
        return z;
    }

    public void lambda$processUpdates$4(TLObject tLObject) {
        MessagesController.getInstance(this.currentAccount).processUpdates((TLRPC.Updates) tLObject, false);
    }

    public byte[] getLastBlock() {
        return this.last_block;
    }

    public byte[] generateAddSelfBlock() {
        CallParticipant callParticipant = new CallParticipant();
        callParticipant.user_id = this.my_user_id;
        callParticipant.public_key_id = this.my_public_key_id;
        callParticipant.permissions = 3;
        byte[] bArr = this.last_block;
        if (bArr == null) {
            CallState callState = new CallState();
            this.state = callState;
            callState.height = 1;
            callState.participants = new CallParticipant[]{callParticipant};
            byte[] bArrCall_create_zero_block = call_create_zero_block(this.my_private_key_id, callState);
            this.zero_block = bArrCall_create_zero_block;
            this.last_block = bArrCall_create_zero_block;
            FileLog.d("[tde2e] call_create_zero_block(" + this.my_private_key_id + ", " + this.state + ")");
        } else {
            try {
                byte[] bArrCall_create_self_add_block = call_create_self_add_block(this.my_private_key_id, bArr, callParticipant);
                FileLog.d("[tde2e] call_create_self_add_block(" + this.my_private_key_id + ", " + blockStr(this.last_block) + ", " + this.state + ") = " + blockStr(bArrCall_create_self_add_block));
                StringBuilder sb = new StringBuilder();
                sb.append("[tde2e] call_create_self_add_block last_block=");
                sb.append(call_describe_block(this.last_block));
                sb.append(" new_block=");
                sb.append(call_describe_block(bArrCall_create_self_add_block));
                FileLog.d(sb.toString());
                this.last_block = bArrCall_create_self_add_block;
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        return this.last_block;
    }

    public CallVerificationWords getVerificationWords() {
        return call_get_verification_words(this.call_id);
    }

    public CallVerificationState getVerificationState() {
        return call_get_verification_state(this.call_id);
    }

    private void readQueue(int i) {
        if (this.destroyed) {
            FileLog.d("[tde2e] conference.readQueue(" + i + ") but destroyed!");
            return;
        }
        if (i != 0 && this.call_id < 0) {
            FileLog.d("[tde2e] conference.readQueue(" + i + ") but there is no call yet!");
            return;
        }
        int i2 = this.last_offset[i];
        if (i2 == -1) {
            FileLog.d("[tde2e] conference.readQueue(" + i + ") but last_offset == -1!");
            return;
        }
        int iMax = Math.max(0, i2);
        FileLog.d("[tde2e] {subchain: " + i + "} processing blocks queue from " + iMax);
        while (true) {
            long j = iMax;
            byte[] bArr = this.blocksQueue[i].get(j);
            if (bArr == null) {
                FileLog.d("[tde2e] {subchain: " + i + "} got into hole (might be the end) in " + i + " subchain at #" + iMax + ", when our last_offset[" + i + "] = " + this.last_offset[i]);
                this.last_offset[i] = iMax;
                return;
            }
            try {
                FileLog.d("[tde2e] {subchain: " + i + "} processing #" + iMax + " block from queue");
                this.blocksQueue[i].remove(j);
                long j2 = this.call_id;
                if (j2 < 0) {
                    FileLog.d("[tde2e] #" + iMax + " call_create block=" + call_describe_block(bArr));
                    long j3 = this.my_user_id;
                    long j4 = this.my_private_key_id;
                    this.last_block = bArr;
                    long jCall_create = call_create(j3, j4, bArr);
                    this.call_id = jCall_create;
                    gotCallId(jCall_create);
                } else if (i == 0) {
                    if (iMax > call_get_height(j2)) {
                        FileLog.d("[tde2e] #" + iMax + " call_apply_block block=" + call_describe_block(bArr));
                        FileLog.d("[tde2e] #" + iMax + " call_apply_block(" + this.call_id + ", " + blockStr(bArr) + ") = " + call_apply_block(this.call_id, bArr));
                    } else {
                        FileLog.d("[tde2e] #" + iMax + " block from queue is under call's height!");
                    }
                } else if (i == 1) {
                    FileLog.d("[tde2e] #" + iMax + " call_receive_inbound_message message=" + call_describe_message(bArr));
                    FileLog.d("[tde2e] #" + iMax + " call_receive_inbound_message(" + this.call_id + ", " + blockStr(bArr) + ") = " + call_receive_inbound_message(this.call_id, bArr));
                }
                iMax++;
                this.last_offset[i] = iMax;
            } catch (Exception e) {
                FileLog.e("[tde2e] {subchain: " + i + "} #" + iMax + " block got into error: ", e);
                return;
            }
        }
    }

    public boolean applyUpdate(Integer num, TL_update.TL_updateGroupCallChainBlocks tL_updateGroupCallChainBlocks, boolean z, Long l) {
        if (this.destroyed) {
            FileLog.d("[tde2e] conference.applyUpdate but destroyed!");
            return false;
        }
        if (tL_updateGroupCallChainBlocks == null) {
            return false;
        }
        TLRPC.GroupCall groupCall = this.groupCall;
        if (groupCall == null) {
            FileLog.d("[tde2e] received updateGroupCallChainBlocks but we dont have groupcall yet!");
            return false;
        }
        if (tL_updateGroupCallChainBlocks.call.id != groupCall.id) {
            FileLog.d("[tde2e] received updateGroupCallChainBlocks for " + tL_updateGroupCallChainBlocks.call.id + " but we have " + this.groupCall.id);
            return false;
        }
        StringBuilder sb = new StringBuilder();
        sb.append("[tde2e] received update with ");
        sb.append(tL_updateGroupCallChainBlocks.blocks.size());
        sb.append(" blocks for ");
        sb.append(tL_updateGroupCallChainBlocks.sub_chain_id);
        sb.append(" subchain, next_offset=");
        sb.append(tL_updateGroupCallChainBlocks.next_offset);
        sb.append(" requested_offset=");
        sb.append(num);
        sb.append(l != null ? " in " + (System.currentTimeMillis() - l.longValue()) + "ms" : "");
        FileLog.d(sb.toString());
        int i = tL_updateGroupCallChainBlocks.sub_chain_id;
        int i2 = tL_updateGroupCallChainBlocks.next_offset;
        if (i == 0 || i == 1) {
            for (int i3 = 0; i3 < tL_updateGroupCallChainBlocks.blocks.size(); i3++) {
                byte[] bArr = tL_updateGroupCallChainBlocks.blocks.get(i3);
                int size = (i2 - tL_updateGroupCallChainBlocks.blocks.size()) + i3;
                if (num == null || num.intValue() != -1) {
                    if (size >= this.last_offset[i]) {
                        FileLog.d("[tde2e] {subchain: " + i + "} put #" + size + " into queue");
                        this.blocksQueue[i].put((long) size, bArr);
                    } else {
                        FileLog.d("[tde2e] {subchain: " + i + "} received #" + size + " that was already processed from queue");
                    }
                } else if (i == 0) {
                    this.last_block = bArr;
                }
            }
            if (this.last_offset[i] == -1) {
                if (num != null && num.intValue() == 0) {
                    this.last_offset[i] = i2 - tL_updateGroupCallChainBlocks.blocks.size();
                } else if (num != null && num.intValue() == -1) {
                    FileLog.d("[tde2e] no offset, but we were asking for last block anyway");
                } else {
                    FileLog.e("[tde2e] received update where we can't know what the start offset is of " + i + " sub chain (we requested " + num + ")");
                }
            }
            if (this.last_offset[i] != -1) {
                boolean z2 = this.call_id >= 0;
                readQueue(i);
                boolean z3 = this.call_id >= 0;
                if (i == 0 && !z2 && z3) {
                    readQueue(1);
                }
            }
        }
        if (i == 1) {
            pull_outbound();
        }
        checkEmojiHash();
        checkParticipants();
        if (z && tL_updateGroupCallChainBlocks.blocks.size() > 0) {
            forcePoll();
        }
        return tL_updateGroupCallChainBlocks.blocks.size() > 0;
    }

    private void pull_outbound() {
        int i;
        if (this.destroyed) {
            FileLog.d("[tde2e] conference.pull_outbound but destroyed!");
            return;
        }
        long j = this.call_id;
        if (j < 0) {
            return;
        }
        int i2 = 0;
        try {
            byte[][] bArrCall_pull_outbound_messages = call_pull_outbound_messages(j);
            FileLog.d("[tde2e] call_pull_outbound_messages(" + this.call_id + ") = " + bArrCall_pull_outbound_messages.length + " blocks");
            i = 0;
            while (i2 < bArrCall_pull_outbound_messages.length) {
                try {
                    TL_phone.sendConferenceCallBroadcast sendconferencecallbroadcast = new TL_phone.sendConferenceCallBroadcast();
                    sendconferencecallbroadcast.call = this.inputGroupCall;
                    sendconferencecallbroadcast.block = bArrCall_pull_outbound_messages[i2];
                    FileLog.d("[tde2e] pull outbound block to server!");
                    FileLog.d("[tde2e] call_pull_outbound_messages(" + this.call_id + ")[" + i2 + "] = " + call_describe_message(bArrCall_pull_outbound_messages[i2]));
                    final long jCurrentTimeMillis = System.currentTimeMillis();
                    ConnectionsManager.getInstance(this.currentAccount).sendRequest(sendconferencecallbroadcast, new RequestDelegate() {
                        @Override
                        public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                            this.f$0.lambda$pull_outbound$6(jCurrentTimeMillis, tLObject, tL_error);
                        }
                    }, 64);
                    i2++;
                    i = 1;
                } catch (Exception e) {
                    e = e;
                    i2 = i;
                    FileLog.e(e);
                    i = i2;
                }
            }
        } catch (Exception e2) {
            e = e2;
        }
        try {
            FileLog.d("[tde2e] state = " + call_get_verification_state(this.call_id));
        } catch (Exception e3) {
            FileLog.e(e3);
        }
        try {
            FileLog.d("[tde2e] call_describe(" + this.call_id + "): " + call_describe(this.call_id));
        } catch (Exception e4) {
            FileLog.e(e4);
        }
        checkEmojiHash();
        checkParticipants();
        if (i != 0) {
            forcePoll();
        }
    }

    public void lambda$pull_outbound$6(final long j, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$pull_outbound$5(j, tLObject, tL_error);
            }
        });
    }

    public void lambda$pull_outbound$5(long j, TLObject tLObject, TLRPC.TL_error tL_error) {
        processUpdates(null, Long.valueOf(j), tLObject, tL_error);
    }

    private long getPollTimeout() {
        return getVerificationEmojis() == null ? 1000L : 5000L;
    }

    public void poll() {
        if (this.destroyed) {
            FileLog.d("[tde2e] conference.poll but destroyed!");
            return;
        }
        if (!this.joined) {
            FileLog.d("[tde2e] conference.poll but not joined!");
            return;
        }
        this.polling = true;
        final AtomicInteger atomicInteger = new AtomicInteger(0);
        final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
        for (int i = 0; i < 2; i++) {
            final TL_phone.getGroupCallChainBlocks getgroupcallchainblocks = new TL_phone.getGroupCallChainBlocks();
            getgroupcallchainblocks.call = this.inputGroupCall;
            getgroupcallchainblocks.sub_chain_id = i;
            getgroupcallchainblocks.offset = Math.max(0, this.last_offset[i]);
            getgroupcallchainblocks.limit = 10;
            FileLog.d("[tde2e] requesting getGroupCallChainBlocks sub_chain_id=" + getgroupcallchainblocks.sub_chain_id + " offset=" + getgroupcallchainblocks.offset + " limit=10");
            final long jCurrentTimeMillis = System.currentTimeMillis();
            this.pollRequestId[i] = ConnectionsManager.getInstance(this.currentAccount).sendRequest(getgroupcallchainblocks, new RequestDelegate() {
                @Override
                public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                    this.f$0.lambda$poll$8(getgroupcallchainblocks, jCurrentTimeMillis, atomicBoolean, atomicInteger, tLObject, tL_error);
                }
            });
        }
        if (this.call_id >= 0) {
            try {
                FileLog.d("[tde2e] state = " + call_get_verification_state(this.call_id));
            } catch (Exception e) {
                FileLog.e(e);
            }
            try {
                FileLog.d("[tde2e] call_describe(" + this.call_id + "): " + call_describe(this.call_id));
                StringBuilder sb = new StringBuilder();
                sb.append("[tde2e] call users:\n ");
                sb.append(TextUtils.join("\n ", (Iterable) DesugarArrays.stream(call_get_state(this.call_id).participants).map(new Function() {
                    public Function andThen(Function function) {
                        return Function$CC.$default$andThen(this, function);
                    }

                    @Override
                    public final Object apply(Object obj) {
                        return ConferenceCall.lambda$poll$9((ConferenceCall.CallParticipant) obj);
                    }

                    public Function compose(Function function) {
                        return Function$CC.$default$compose(this, function);
                    }
                }).collect(Collectors.toSet())));
                FileLog.d(sb.toString());
            } catch (Exception e2) {
                FileLog.e(e2);
            }
        }
        checkEmojiHash();
        checkParticipants();
    }

    public void lambda$poll$8(final TL_phone.getGroupCallChainBlocks getgroupcallchainblocks, final long j, final AtomicBoolean atomicBoolean, final AtomicInteger atomicInteger, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$poll$7(getgroupcallchainblocks, j, tLObject, tL_error, atomicBoolean, atomicInteger);
            }
        });
    }

    public void lambda$poll$7(TL_phone.getGroupCallChainBlocks getgroupcallchainblocks, long j, TLObject tLObject, TLRPC.TL_error tL_error, AtomicBoolean atomicBoolean, AtomicInteger atomicInteger) {
        if (processUpdates(Integer.valueOf(getgroupcallchainblocks.offset), Long.valueOf(j), tLObject, tL_error)) {
            atomicBoolean.set(true);
        }
        if (atomicInteger.incrementAndGet() == 2) {
            this.polling = false;
            if (atomicBoolean.get()) {
                forcePoll();
            } else {
                AndroidUtilities.cancelRunOnUIThread(this.pollRunnable);
                AndroidUtilities.runOnUIThread(this.pollRunnable, getPollTimeout());
            }
        }
    }

    public static String lambda$poll$9(CallParticipant callParticipant) {
        return "[" + callParticipant.user_id + "]: " + DialogObject.getName(callParticipant.user_id);
    }

    public void forcePoll() {
        if (this.destroyed) {
            FileLog.d("[tde2e] conference.forcePoll but destroyed!");
            return;
        }
        if (!this.joined) {
            FileLog.d("[tde2e] conference.forcePoll but not joined!");
        } else {
            if (this.polling) {
                return;
            }
            AndroidUtilities.cancelRunOnUIThread(this.pollRunnable);
            AndroidUtilities.runOnUIThread(this.pollRunnable);
        }
    }

    public void updateParticipants(ArrayList<TLRPC.GroupCallParticipant> arrayList, boolean z) {
        if (this.destroyed) {
            FileLog.d("[tde2e] conference.updateParticipants but destroyed!");
            return;
        }
        Iterator<TLRPC.GroupCallParticipant> it = arrayList.iterator();
        while (it.hasNext()) {
            this.joiningBlockchainParticipants.remove(Long.valueOf(DialogObject.getPeerDialogId(it.next().peer)));
        }
        HashSet<Long> shadyLeftParticipants = getShadyLeftParticipants(arrayList);
        if (!shadyLeftParticipants.isEmpty()) {
            try {
                CallState callStateCall_get_state = call_get_state(this.call_id);
                CallState callState = new CallState();
                callState.height = callStateCall_get_state.height + 1;
                ArrayList arrayList2 = new ArrayList();
                int i = 0;
                while (true) {
                    CallParticipant[] callParticipantArr = callStateCall_get_state.participants;
                    if (i >= callParticipantArr.length) {
                        break;
                    }
                    if (!shadyLeftParticipants.contains(Long.valueOf(callParticipantArr[i].user_id))) {
                        CallParticipant callParticipant = new CallParticipant();
                        CallParticipant callParticipant2 = callStateCall_get_state.participants[i];
                        callParticipant.user_id = callParticipant2.user_id;
                        callParticipant.public_key_id = callParticipant2.public_key_id;
                        callParticipant.permissions = callParticipant2.permissions;
                        arrayList2.add(callParticipant);
                    }
                    i++;
                }
                callState.participants = (CallParticipant[]) arrayList2.toArray(new CallParticipant[0]);
                FileLog.d("[tde2e] call_create_change_state_block from " + this.state + " to " + callState);
                byte[] bArrCall_create_change_state_block = call_create_change_state_block(this.call_id, callState);
                StringBuilder sb = new StringBuilder();
                sb.append("[tde2e] call_create_change_state_block returns ");
                sb.append(call_describe_block(bArrCall_create_change_state_block));
                FileLog.d(sb.toString());
                this.state = callState;
                TL_phone.deleteConferenceCallParticipants deleteconferencecallparticipants = new TL_phone.deleteConferenceCallParticipants();
                deleteconferencecallparticipants.only_left = true;
                deleteconferencecallparticipants.call = this.inputGroupCall;
                deleteconferencecallparticipants.block = bArrCall_create_change_state_block;
                deleteconferencecallparticipants.ids.addAll(shadyLeftParticipants);
                final long jCurrentTimeMillis = System.currentTimeMillis();
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(deleteconferencecallparticipants, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        this.f$0.lambda$updateParticipants$11(jCurrentTimeMillis, tLObject, tL_error);
                    }
                });
            } catch (Exception e) {
                FileLog.e(e);
            }
        }
        if (z) {
            forcePoll();
        }
    }

    public void lambda$updateParticipants$11(final long j, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$updateParticipants$10(j, tLObject, tL_error);
            }
        });
    }

    public void lambda$updateParticipants$10(long j, TLObject tLObject, TLRPC.TL_error tL_error) {
        processUpdates(null, Long.valueOf(j), tLObject, tL_error);
    }

    public void kick(long j) {
        if (this.destroyed) {
            FileLog.d("[tde2e] conference.kick but destroyed!");
            return;
        }
        if (this.call_id < 0 || !getBlockchainParticipants().contains(Long.valueOf(j))) {
            return;
        }
        CallState callStateCall_get_state = call_get_state(this.call_id);
        CallState callState = new CallState();
        callState.height = callStateCall_get_state.height + 1;
        ArrayList arrayList = new ArrayList();
        int i = 0;
        while (true) {
            CallParticipant[] callParticipantArr = callStateCall_get_state.participants;
            if (i >= callParticipantArr.length) {
                callState.participants = (CallParticipant[]) arrayList.toArray(new CallParticipant[0]);
                FileLog.d("[tde2e] kick: call_create_change_state_block from " + this.state + " to " + callState);
                byte[] bArrCall_create_change_state_block = call_create_change_state_block(this.call_id, callState);
                StringBuilder sb = new StringBuilder();
                sb.append("[tde2e] kick: call_create_change_state_block returns ");
                sb.append(call_describe_block(bArrCall_create_change_state_block));
                FileLog.d(sb.toString());
                this.state = callState;
                TL_phone.deleteConferenceCallParticipants deleteconferencecallparticipants = new TL_phone.deleteConferenceCallParticipants();
                deleteconferencecallparticipants.kick = true;
                deleteconferencecallparticipants.call = this.inputGroupCall;
                deleteconferencecallparticipants.block = bArrCall_create_change_state_block;
                deleteconferencecallparticipants.ids.add(Long.valueOf(j));
                final long jCurrentTimeMillis = System.currentTimeMillis();
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(deleteconferencecallparticipants, new RequestDelegate() {
                    @Override
                    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
                        this.f$0.lambda$kick$13(jCurrentTimeMillis, tLObject, tL_error);
                    }
                });
                return;
            }
            if (j != callParticipantArr[i].user_id) {
                CallParticipant callParticipant = new CallParticipant();
                CallParticipant callParticipant2 = callStateCall_get_state.participants[i];
                callParticipant.user_id = callParticipant2.user_id;
                callParticipant.public_key_id = callParticipant2.public_key_id;
                callParticipant.permissions = callParticipant2.permissions;
                arrayList.add(callParticipant);
            }
            i++;
        }
    }

    public void lambda$kick$13(final long j, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                this.f$0.lambda$kick$12(j, tLObject, tL_error);
            }
        });
    }

    public void lambda$kick$12(long j, TLObject tLObject, TLRPC.TL_error tL_error) {
        processUpdates(null, Long.valueOf(j), tLObject, tL_error);
    }

    public HashSet<Long> getBlockchainParticipants() {
        CallState callStateCall_get_state;
        HashSet<Long> hashSet = new HashSet<>();
        if (this.destroyed) {
            FileLog.d("[tde2e] conference.getBlockchainParticipants but destroyed!");
            return hashSet;
        }
        long j = this.call_id;
        if (j < 0) {
            return hashSet;
        }
        try {
            callStateCall_get_state = call_get_state(j);
        } catch (Exception e) {
            FileLog.e(e);
            callStateCall_get_state = null;
        }
        if (callStateCall_get_state != null) {
            int i = 0;
            while (true) {
                CallParticipant[] callParticipantArr = callStateCall_get_state.participants;
                if (i >= callParticipantArr.length) {
                    break;
                }
                hashSet.add(Long.valueOf(callParticipantArr[i].user_id));
                i++;
            }
        }
        return hashSet;
    }

    public HashSet<Long> getShadyJoiningParticipants(ArrayList<TLRPC.GroupCallParticipant> arrayList) {
        CallState callStateCall_get_state;
        TLRPC.GroupCallParticipant groupCallParticipant;
        HashSet<Long> hashSet = new HashSet<>();
        if (this.destroyed) {
            FileLog.d("[tde2e] conference.getShadyJoiningParticipants but destroyed!");
            return hashSet;
        }
        long j = this.call_id;
        if (j < 0) {
            return hashSet;
        }
        try {
            callStateCall_get_state = call_get_state(j);
        } catch (Exception e) {
            FileLog.e(e);
            callStateCall_get_state = null;
        }
        if (callStateCall_get_state != null) {
            int i = 0;
            while (true) {
                CallParticipant[] callParticipantArr = callStateCall_get_state.participants;
                if (i >= callParticipantArr.length) {
                    break;
                }
                long j2 = callParticipantArr[i].user_id;
                int i2 = 0;
                while (true) {
                    if (i2 >= (arrayList == null ? 0 : arrayList.size())) {
                        groupCallParticipant = null;
                        break;
                    }
                    if (j2 == DialogObject.getPeerDialogId(arrayList.get(i2).peer)) {
                        groupCallParticipant = arrayList.get(i2);
                        break;
                    }
                    i2++;
                }
                if (groupCallParticipant == null && j2 != this.my_user_id && this.joiningBlockchainParticipants.contains(Long.valueOf(j2))) {
                    hashSet.add(Long.valueOf(j2));
                }
                i++;
            }
        }
        return hashSet;
    }

    public HashSet<Long> getShadyLeftParticipants(ArrayList<TLRPC.GroupCallParticipant> arrayList) {
        CallState callStateCall_get_state;
        TLRPC.GroupCallParticipant groupCallParticipant;
        HashSet<Long> hashSet = new HashSet<>();
        if (this.destroyed) {
            FileLog.d("[tde2e] conference.getShadyLeftParticipants but destroyed!");
            return hashSet;
        }
        long j = this.call_id;
        if (j < 0) {
            return hashSet;
        }
        try {
            callStateCall_get_state = call_get_state(j);
        } catch (Exception e) {
            FileLog.e(e);
            callStateCall_get_state = null;
        }
        if (callStateCall_get_state != null) {
            int i = 0;
            while (true) {
                CallParticipant[] callParticipantArr = callStateCall_get_state.participants;
                if (i >= callParticipantArr.length) {
                    break;
                }
                long j2 = callParticipantArr[i].user_id;
                int i2 = 0;
                while (true) {
                    if (i2 >= (arrayList == null ? 0 : arrayList.size())) {
                        groupCallParticipant = null;
                        break;
                    }
                    if (j2 == DialogObject.getPeerDialogId(arrayList.get(i2).peer)) {
                        groupCallParticipant = arrayList.get(i2);
                        break;
                    }
                    i2++;
                }
                if (groupCallParticipant == null && j2 != this.my_user_id && !this.joiningBlockchainParticipants.contains(Long.valueOf(j2))) {
                    hashSet.add(Long.valueOf(j2));
                }
                i++;
            }
        }
        return hashSet;
    }

    public void reset() {
        AndroidUtilities.cancelRunOnUIThread(this.pollRunnable);
        if (this.call_id != -1) {
            for (int i = 0; i < 2; i++) {
                if (this.pollRequestId[i] != 0) {
                    ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.pollRequestId[i], true);
                    this.pollRequestId[i] = 0;
                }
            }
            call_destroy(this.call_id);
            FileLog.d("[tde2e] call_destroy(" + this.call_id + ")");
            this.call_id = -1L;
        }
        int[] iArr = this.last_offset;
        iArr[0] = -1;
        iArr[1] = -1;
        this.blocksQueue[0].clear();
        this.blocksQueue[1].clear();
        init();
    }

    public void joined() {
        this.joined = true;
    }

    public void destroy() {
        this.destroyed = true;
        reset();
    }

    public long getCallId() {
        return this.call_id;
    }
}
