package org.telegram.messenger.voip;

import android.text.TextUtils;
import android.util.LongSparseArray;
import j$.util.DesugarArrays;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
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
    private final Runnable pollRunnable = new is2(this, (byte) 2);
    private final int[] pollRequestId = new int[2];

    public static final class CallParticipant {
        int permissions;
        long public_key_id;
        long user_id;

        public String toString() {
            StringBuilder sb = new StringBuilder("CallParticipant{user_id=");
            sb.append(this.user_id);
            sb.append(", public_key_id=");
            return kt6.q(sb, this.public_key_id, "}");
        }
    }

    public static final class CallState {
        int height;
        CallParticipant[] participants;

        public CallParticipant find(long j) {
            int i = 0;
            while (true) {
                CallParticipant[] callParticipantArr = this.participants;
                if (i < callParticipantArr.length) {
                    CallParticipant callParticipant = callParticipantArr[i];
                    if (callParticipant.user_id == j) {
                        return callParticipant;
                    }
                    i++;
                } else {
                    return null;
                }
            }
        }

        public String toString() {
            StringBuilder sb = new StringBuilder(hg9.k(new StringBuilder("CallState{height="), this.height, ", participants=["));
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

    public static final class CallVerificationState {
        byte[] emoji_hash;
        int height;

        public String toString() {
            String str;
            StringBuilder sb = new StringBuilder("CallVerificationState{height=");
            sb.append(this.height);
            sb.append(", emoji_hash=");
            if (this.emoji_hash == null) {
                str = null;
            } else {
                str = "{" + Utilities.f(this.emoji_hash) + "}";
            }
            return b10.j(sb, str, "}");
        }
    }

    public static final class CallVerificationWords {
        int height;
        String[] words;

        public String toString() {
            StringBuilder sb = new StringBuilder(hg9.k(new StringBuilder("CallVerificationWords{height="), this.height, ", words=["));
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

    public ConferenceCall(int i, long j) {
        this.currentAccount = i;
        this.my_user_id = j;
        init();
    }

    private static String blockStr(byte[] bArr) {
        return "Block{" + Utilities.f(bArr) + "}";
    }

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

    private void checkEmojiHash() {
        String[] verificationEmojis = getVerificationEmojis();
        if (!eq(verificationEmojis, this.lastVerificationEmojis)) {
            this.lastVerificationEmojis = verificationEmojis;
            gm.c3(new is2(this, (byte) 1));
        }
    }

    private void checkParticipants() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.voip.ConferenceCall.checkParticipants():void");
    }

    public static native byte[] decrypt_message_for_one(long j, byte[] bArr);

    public static native byte[] encrypt_message_for_one(long j, byte[] bArr);

    private boolean eq(HashSet<Long> hashSet, HashSet<Long> hashSet2) {
        if (hashSet == hashSet2) {
            return true;
        }
        if (hashSet == null) {
            if (hashSet2 == null) {
                return true;
            }
        } else if (hashSet2 == null || hashSet.size() != hashSet2.size()) {
            return false;
        } else {
            Iterator<Long> it = hashSet.iterator();
            while (it.hasNext()) {
                Long next = it.next();
                next.longValue();
                if (!hashSet2.contains(next)) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    private long getPollTimeout() {
        if (getVerificationEmojis() == null) {
            return 1000L;
        }
        return 5000L;
    }

    private String[] getVerificationEmojis() {
        byte[] bArr;
        long j = this.call_id;
        if (j >= 0) {
            try {
                bArr = call_get_verification_state(j).emoji_hash;
            } catch (Exception e) {
                fc4.g(e, true);
                bArr = null;
            }
            if (bArr != null) {
                if (bArr.length > 32) {
                    byte[] bArr2 = new byte[32];
                    System.arraycopy(bArr, 0, bArr2, 0, 32);
                    bArr = bArr2;
                }
                return EncryptionKeyEmojifier.emojifyForCall(bArr);
            }
        }
        return null;
    }

    private void init() {
        long key_generate_temporary_private_key = key_generate_temporary_private_key();
        this.my_private_key_id = key_generate_temporary_private_key;
        byte[] key_to_public_key = key_to_public_key(key_generate_temporary_private_key);
        this.my_public_key = key_to_public_key;
        this.my_public_key_id = key_from_public_key(key_to_public_key);
        CallState callState = new CallState();
        this.state = callState;
        callState.height = 1;
        callState.participants = r1;
        CallParticipant[] callParticipantArr = {new CallParticipant()};
        CallParticipant callParticipant = this.state.participants[0];
        callParticipant.user_id = this.my_user_id;
        callParticipant.public_key_id = this.my_public_key_id;
        callParticipant.permissions = 3;
    }

    public static native void key_destroy(long j);

    public static native long key_from_ecdh(long j, long j2);

    public static native long key_from_public_key(byte[] bArr);

    public static native long key_generate_temporary_private_key();

    public static native byte[] key_to_public_key(long j);

    public void lambda$checkEmojiHash$0() {
        nm7.f(this.currentAccount).k(nm7.U3, new Object[0]);
    }

    public void lambda$checkParticipants$1() {
        VoIPService sharedInstance;
        qd2 qd2Var;
        TLRPC.GroupCall groupCall;
        if (this.groupCall != null && (sharedInstance = VoIPService.getSharedInstance()) != null && (qd2Var = sharedInstance.groupCall) != null && (groupCall = qd2Var.b) != null && groupCall.id == this.groupCall.id) {
            updateParticipants(qd2Var.e, false);
            sharedInstance.groupCall.l.clear();
            qd2 qd2Var2 = sharedInstance.groupCall;
            qd2Var2.l.addAll(sharedInstance.conference.getShadyLeftParticipants(qd2Var2.e));
            sharedInstance.groupCall.m.clear();
            qd2 qd2Var3 = sharedInstance.groupCall;
            qd2Var3.m.addAll(sharedInstance.conference.getShadyJoiningParticipants(qd2Var3.e));
            nm7.f(this.currentAccount).k(nm7.w2, 0L, Long.valueOf(this.groupCall.id), Boolean.FALSE);
        }
    }

    public void lambda$kick$12(long j, TLObject tLObject, TLRPC.TL_error tL_error) {
        processUpdates(null, Long.valueOf(j), tLObject, tL_error);
    }

    public void lambda$kick$13(long j, TLObject tLObject, TLRPC.TL_error tL_error) {
        gm.c3(new hs2(this, j, tLObject, tL_error, (byte) 1));
    }

    public void lambda$poll$7(TL_phone.getGroupCallChainBlocks getgroupcallchainblocks, long j, TLObject tLObject, TLRPC.TL_error tL_error, AtomicBoolean atomicBoolean, AtomicInteger atomicInteger) {
        if (processUpdates(Integer.valueOf(getgroupcallchainblocks.offset), Long.valueOf(j), tLObject, tL_error)) {
            atomicBoolean.set(true);
        }
        if (atomicInteger.incrementAndGet() == 2) {
            this.polling = false;
            if (atomicBoolean.get()) {
                forcePoll();
                return;
            }
            gm.r(this.pollRunnable);
            gm.d3(this.pollRunnable, getPollTimeout());
        }
    }

    public void lambda$poll$8(TL_phone.getGroupCallChainBlocks getgroupcallchainblocks, long j, AtomicBoolean atomicBoolean, AtomicInteger atomicInteger, TLObject tLObject, TLRPC.TL_error tL_error) {
        gm.c3(new rr6(j, atomicBoolean, atomicInteger, this, tLObject, tL_error, getgroupcallchainblocks));
    }

    public static String lambda$poll$9(CallParticipant callParticipant) {
        return "[" + callParticipant.user_id + "]: " + pg3.k(z8c.t0, callParticipant.user_id);
    }

    public void lambda$processUpdates$4(TLObject tLObject) {
        oc7.r1(this.currentAccount).T3((TLRPC.Updates) tLObject, false);
    }

    public void lambda$pull_outbound$5(long j, TLObject tLObject, TLRPC.TL_error tL_error) {
        processUpdates(null, Long.valueOf(j), tLObject, tL_error);
    }

    public void lambda$pull_outbound$6(long j, TLObject tLObject, TLRPC.TL_error tL_error) {
        gm.c3(new hs2(this, j, tLObject, tL_error, (byte) 0));
    }

    public void lambda$requestLastBlock$2(long j, TLObject tLObject, TLRPC.TL_error tL_error, Runnable runnable) {
        processUpdates(-1, Long.valueOf(j), tLObject, tL_error);
        if (runnable != null) {
            runnable.run();
        }
    }

    public void lambda$requestLastBlock$3(long j, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        gm.c3(new r97(this, j, tLObject, tL_error, runnable, (byte) 4));
    }

    public void lambda$updateParticipants$10(long j, TLObject tLObject, TLRPC.TL_error tL_error) {
        processUpdates(null, Long.valueOf(j), tLObject, tL_error);
    }

    public void lambda$updateParticipants$11(long j, TLObject tLObject, TLRPC.TL_error tL_error) {
        gm.c3(new hs2(this, j, tLObject, tL_error, (byte) 2));
    }

    public void poll() {
        if (this.destroyed) {
            fc4.b("[tde2e] conference.poll but destroyed!");
        } else if (!this.joined) {
            fc4.b("[tde2e] conference.poll but not joined!");
        } else {
            this.polling = true;
            AtomicInteger atomicInteger = new AtomicInteger(0);
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            int i = 0;
            while (i < 2) {
                TL_phone.getGroupCallChainBlocks getgroupcallchainblocks = new TL_phone.getGroupCallChainBlocks();
                getgroupcallchainblocks.call = this.inputGroupCall;
                getgroupcallchainblocks.sub_chain_id = i;
                getgroupcallchainblocks.offset = Math.max(0, this.last_offset[i]);
                getgroupcallchainblocks.limit = 10;
                fc4.b("[tde2e] requesting getGroupCallChainBlocks sub_chain_id=" + getgroupcallchainblocks.sub_chain_id + " offset=" + getgroupcallchainblocks.offset + " limit=10");
                ConferenceCall conferenceCall = this;
                this.pollRequestId[i] = ConnectionsManager.getInstance(this.currentAccount).sendRequest(getgroupcallchainblocks, new js2(conferenceCall, getgroupcallchainblocks, System.currentTimeMillis(), atomicBoolean, atomicInteger));
                i++;
                this = conferenceCall;
            }
            ConferenceCall conferenceCall2 = this;
            if (conferenceCall2.call_id >= 0) {
                try {
                    fc4.b("[tde2e] state = " + call_get_verification_state(conferenceCall2.call_id));
                } catch (Exception e) {
                    fc4.g(e, true);
                }
                try {
                    fc4.b("[tde2e] call_describe(" + conferenceCall2.call_id + "): " + call_describe(conferenceCall2.call_id));
                    StringBuilder sb = new StringBuilder();
                    sb.append("[tde2e] call users:\n ");
                    sb.append(TextUtils.join("\n ", (Iterable) DesugarArrays.stream(call_get_state(conferenceCall2.call_id).participants).map(new x00((byte) 3)).collect(Collectors.toSet())));
                    fc4.b(sb.toString());
                } catch (Exception e2) {
                    fc4.g(e2, true);
                }
            }
            conferenceCall2.checkEmojiHash();
            conferenceCall2.checkParticipants();
        }
    }

    private boolean processUpdates(Integer num, Long l, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (!(tLObject instanceof TLRPC.Updates)) {
            return false;
        }
        TLRPC.Updates updates = (TLRPC.Updates) tLObject;
        ArrayList x0 = oc7.x0(updates, TL_update.TL_updateGroupCallChainBlocks.class);
        int size = x0.size();
        boolean z = false;
        int i = 0;
        while (i < size) {
            Object obj = x0.get(i);
            i++;
            if (applyUpdate(num, (TL_update.TL_updateGroupCallChainBlocks) obj, false, l)) {
                z = true;
            }
        }
        Utilities.d.c(new ra2(this, updates, (byte) 27));
        return z;
    }

    private void pull_outbound() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.voip.ConferenceCall.pull_outbound():void");
    }

    private void readQueue(int i) {
        if (this.destroyed) {
            fc4.b("[tde2e] conference.readQueue(" + i + ") but destroyed!");
        } else if (i != 0 && this.call_id < 0) {
            fc4.b("[tde2e] conference.readQueue(" + i + ") but there is no call yet!");
        } else {
            int i2 = this.last_offset[i];
            if (i2 == -1) {
                fc4.b("[tde2e] conference.readQueue(" + i + ") but last_offset == -1!");
                return;
            }
            int max = Math.max(0, i2);
            fc4.b("[tde2e] {subchain: " + i + "} processing blocks queue from " + max);
            while (true) {
                long j = max;
                byte[] bArr = this.blocksQueue[i].get(j);
                if (bArr == null) {
                    StringBuilder o = ts2.o("[tde2e] {subchain: ", i, "} got into hole (might be the end) in ", i, " subchain at #");
                    ts2.v(o, max, ", when our last_offset[", i, "] = ");
                    b10.p(this.last_offset[i], o);
                    this.last_offset[i] = max;
                    return;
                }
                try {
                    fc4.b("[tde2e] {subchain: " + i + "} processing #" + max + " block from queue");
                    this.blocksQueue[i].remove(j);
                    long j2 = this.call_id;
                    if (j2 < 0) {
                        fc4.b("[tde2e] #" + max + " call_create block=" + call_describe_block(bArr));
                        long j3 = this.my_user_id;
                        long j4 = this.my_private_key_id;
                        this.last_block = bArr;
                        long call_create = call_create(j3, j4, bArr);
                        this.call_id = call_create;
                        gotCallId(call_create);
                    } else if (i == 0) {
                        if (max > call_get_height(j2)) {
                            fc4.b("[tde2e] #" + max + " call_apply_block block=" + call_describe_block(bArr));
                            fc4.b("[tde2e] #" + max + " call_apply_block(" + this.call_id + ", " + blockStr(bArr) + ") = " + call_apply_block(this.call_id, bArr));
                        } else {
                            fc4.b("[tde2e] #" + max + " block from queue is under call's height!");
                        }
                    } else if (i == 1) {
                        fc4.b("[tde2e] #" + max + " call_receive_inbound_message message=" + call_describe_message(bArr));
                        fc4.b("[tde2e] #" + max + " call_receive_inbound_message(" + this.call_id + ", " + blockStr(bArr) + ") = " + call_receive_inbound_message(this.call_id, bArr));
                    }
                    max++;
                    this.last_offset[i] = max;
                } catch (Exception e) {
                    fc4.e("[tde2e] {subchain: " + i + "} #" + max + " block got into error: ", e);
                    return;
                }
            }
        }
    }

    public boolean applyUpdate(Integer num, TL_update.TL_updateGroupCallChainBlocks tL_updateGroupCallChainBlocks, boolean z, Long l) {
        String str;
        boolean z2;
        boolean z3;
        if (this.destroyed) {
            fc4.b("[tde2e] conference.applyUpdate but destroyed!");
            return false;
        }
        if (tL_updateGroupCallChainBlocks != null) {
            TLRPC.GroupCall groupCall = this.groupCall;
            if (groupCall == null) {
                fc4.b("[tde2e] received updateGroupCallChainBlocks but we dont have groupcall yet!");
                return false;
            } else if (tL_updateGroupCallChainBlocks.call.id != groupCall.id) {
                StringBuilder sb = new StringBuilder("[tde2e] received updateGroupCallChainBlocks for ");
                sb.append(tL_updateGroupCallChainBlocks.call.id);
                sb.append(" but we have ");
                wi8.q(this.groupCall.id, sb);
                return false;
            } else {
                StringBuilder sb2 = new StringBuilder("[tde2e] received update with ");
                sb2.append(tL_updateGroupCallChainBlocks.blocks.size());
                sb2.append(" blocks for ");
                sb2.append(tL_updateGroupCallChainBlocks.sub_chain_id);
                sb2.append(" subchain, next_offset=");
                sb2.append(tL_updateGroupCallChainBlocks.next_offset);
                sb2.append(" requested_offset=");
                sb2.append(num);
                if (l != null) {
                    str = " in " + (System.currentTimeMillis() - l.longValue()) + "ms";
                } else {
                    str = "";
                }
                hg9.r(str, sb2);
                int i = tL_updateGroupCallChainBlocks.sub_chain_id;
                int i2 = tL_updateGroupCallChainBlocks.next_offset;
                if (i == 0 || i == 1) {
                    for (int i3 = 0; i3 < tL_updateGroupCallChainBlocks.blocks.size(); i3++) {
                        byte[] bArr = tL_updateGroupCallChainBlocks.blocks.get(i3);
                        int size = (i2 - tL_updateGroupCallChainBlocks.blocks.size()) + i3;
                        if (num != null && num.intValue() == -1) {
                            if (i == 0) {
                                this.last_block = bArr;
                            }
                        } else if (size >= this.last_offset[i]) {
                            fc4.b("[tde2e] {subchain: " + i + "} put #" + size + " into queue");
                            this.blocksQueue[i].put((long) size, bArr);
                        } else {
                            fc4.b("[tde2e] {subchain: " + i + "} received #" + size + " that was already processed from queue");
                        }
                    }
                    if (this.last_offset[i] == -1) {
                        if (num != null) {
                            if (num.intValue() == 0) {
                                this.last_offset[i] = i2 - tL_updateGroupCallChainBlocks.blocks.size();
                            } else if (num.intValue() == -1) {
                                fc4.b("[tde2e] no offset, but we were asking for last block anyway");
                            }
                        }
                        fc4.d("[tde2e] received update where we can't know what the start offset is of " + i + " sub chain (we requested " + num + ")");
                    }
                    if (this.last_offset[i] != -1) {
                        if (this.call_id >= 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        readQueue(i);
                        if (this.call_id >= 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
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
                if (tL_updateGroupCallChainBlocks.blocks.size() > 0) {
                    return true;
                }
            }
        }
        return false;
    }

    public void destroy() {
        this.destroyed = true;
        reset();
    }

    public void forcePoll() {
        if (this.destroyed) {
            fc4.b("[tde2e] conference.forcePoll but destroyed!");
        } else if (!this.joined) {
            fc4.b("[tde2e] conference.forcePoll but not joined!");
        } else if (this.polling) {
        } else {
            gm.r(this.pollRunnable);
            gm.c3(this.pollRunnable);
        }
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
            callState.participants = r1;
            CallParticipant[] callParticipantArr = {callParticipant};
            byte[] call_create_zero_block = call_create_zero_block(this.my_private_key_id, callState);
            this.zero_block = call_create_zero_block;
            this.last_block = call_create_zero_block;
            fc4.b("[tde2e] call_create_zero_block(" + this.my_private_key_id + ", " + this.state + ")");
        } else {
            try {
                byte[] call_create_self_add_block = call_create_self_add_block(this.my_private_key_id, bArr, callParticipant);
                fc4.b("[tde2e] call_create_self_add_block(" + this.my_private_key_id + ", " + blockStr(this.last_block) + ", " + this.state + ") = " + blockStr(call_create_self_add_block));
                StringBuilder sb = new StringBuilder("[tde2e] call_create_self_add_block last_block=");
                sb.append(call_describe_block(this.last_block));
                sb.append(" new_block=");
                sb.append(call_describe_block(call_create_self_add_block));
                fc4.b(sb.toString());
                this.last_block = call_create_self_add_block;
            } catch (Exception e) {
                fc4.g(e, true);
            }
        }
        return this.last_block;
    }

    public HashSet<Long> getBlockchainParticipants() {
        CallState callState;
        HashSet<Long> hashSet = new HashSet<>();
        if (this.destroyed) {
            fc4.b("[tde2e] conference.getBlockchainParticipants but destroyed!");
            return hashSet;
        }
        long j = this.call_id;
        if (j >= 0) {
            try {
                callState = call_get_state(j);
            } catch (Exception e) {
                fc4.g(e, true);
                callState = null;
            }
            if (callState != null) {
                int i = 0;
                while (true) {
                    CallParticipant[] callParticipantArr = callState.participants;
                    if (i >= callParticipantArr.length) {
                        break;
                    }
                    hashSet.add(Long.valueOf(callParticipantArr[i].user_id));
                    i++;
                }
            }
        }
        return hashSet;
    }

    public long getCallId() {
        return this.call_id;
    }

    public String[] getEmojis() {
        return this.lastVerificationEmojis;
    }

    public byte[] getLastBlock() {
        return this.last_block;
    }

    public byte[] getMyPublicKey() {
        return this.my_public_key;
    }

    public HashSet<Long> getShadyJoiningParticipants(ArrayList<TLRPC.GroupCallParticipant> arrayList) {
        CallState callState;
        int size;
        TLRPC.GroupCallParticipant groupCallParticipant;
        HashSet<Long> hashSet = new HashSet<>();
        if (this.destroyed) {
            fc4.b("[tde2e] conference.getShadyJoiningParticipants but destroyed!");
            return hashSet;
        }
        long j = this.call_id;
        if (j >= 0) {
            try {
                callState = call_get_state(j);
            } catch (Exception e) {
                fc4.g(e, true);
                callState = null;
            }
            if (callState != null) {
                int i = 0;
                while (true) {
                    CallParticipant[] callParticipantArr = callState.participants;
                    if (i >= callParticipantArr.length) {
                        break;
                    }
                    long j2 = callParticipantArr[i].user_id;
                    int i2 = 0;
                    while (true) {
                        if (arrayList == null) {
                            size = 0;
                        } else {
                            size = arrayList.size();
                        }
                        if (i2 < size) {
                            if (j2 == pg3.n(arrayList.get(i2).peer)) {
                                groupCallParticipant = arrayList.get(i2);
                                break;
                            }
                            i2++;
                        } else {
                            groupCallParticipant = null;
                            break;
                        }
                    }
                    if (groupCallParticipant == null && j2 != this.my_user_id && this.joiningBlockchainParticipants.contains(Long.valueOf(j2))) {
                        hashSet.add(Long.valueOf(j2));
                    }
                    i++;
                }
            }
        }
        return hashSet;
    }

    public HashSet<Long> getShadyLeftParticipants(ArrayList<TLRPC.GroupCallParticipant> arrayList) {
        CallState callState;
        int size;
        TLRPC.GroupCallParticipant groupCallParticipant;
        HashSet<Long> hashSet = new HashSet<>();
        if (this.destroyed) {
            fc4.b("[tde2e] conference.getShadyLeftParticipants but destroyed!");
            return hashSet;
        }
        long j = this.call_id;
        if (j >= 0) {
            try {
                callState = call_get_state(j);
            } catch (Exception e) {
                fc4.g(e, true);
                callState = null;
            }
            if (callState != null) {
                int i = 0;
                while (true) {
                    CallParticipant[] callParticipantArr = callState.participants;
                    if (i >= callParticipantArr.length) {
                        break;
                    }
                    long j2 = callParticipantArr[i].user_id;
                    int i2 = 0;
                    while (true) {
                        if (arrayList == null) {
                            size = 0;
                        } else {
                            size = arrayList.size();
                        }
                        if (i2 < size) {
                            if (j2 == pg3.n(arrayList.get(i2).peer)) {
                                groupCallParticipant = arrayList.get(i2);
                                break;
                            }
                            i2++;
                        } else {
                            groupCallParticipant = null;
                            break;
                        }
                    }
                    if (groupCallParticipant == null && j2 != this.my_user_id && !this.joiningBlockchainParticipants.contains(Long.valueOf(j2))) {
                        hashSet.add(Long.valueOf(j2));
                    }
                    i++;
                }
            }
        }
        return hashSet;
    }

    public CallVerificationState getVerificationState() {
        return call_get_verification_state(this.call_id);
    }

    public CallVerificationWords getVerificationWords() {
        return call_get_verification_words(this.call_id);
    }

    public void joined() {
        this.joined = true;
    }

    public void kick(long j) {
        if (this.destroyed) {
            fc4.b("[tde2e] conference.kick but destroyed!");
        } else if (this.call_id < 0 || !getBlockchainParticipants().contains(Long.valueOf(j))) {
        } else {
            CallState call_get_state = call_get_state(this.call_id);
            CallState callState = new CallState();
            callState.height = call_get_state.height + 1;
            ArrayList arrayList = new ArrayList();
            int i = 0;
            while (true) {
                CallParticipant[] callParticipantArr = call_get_state.participants;
                if (i < callParticipantArr.length) {
                    if (j != callParticipantArr[i].user_id) {
                        CallParticipant callParticipant = new CallParticipant();
                        CallParticipant callParticipant2 = call_get_state.participants[i];
                        callParticipant.user_id = callParticipant2.user_id;
                        callParticipant.public_key_id = callParticipant2.public_key_id;
                        callParticipant.permissions = callParticipant2.permissions;
                        arrayList.add(callParticipant);
                    }
                    i++;
                } else {
                    callState.participants = (CallParticipant[]) arrayList.toArray(new CallParticipant[0]);
                    fc4.b("[tde2e] kick: call_create_change_state_block from " + this.state + " to " + callState);
                    byte[] call_create_change_state_block = call_create_change_state_block(this.call_id, callState);
                    StringBuilder sb = new StringBuilder("[tde2e] kick: call_create_change_state_block returns ");
                    sb.append(call_describe_block(call_create_change_state_block));
                    fc4.b(sb.toString());
                    this.state = callState;
                    TL_phone.deleteConferenceCallParticipants deleteconferencecallparticipants = new TL_phone.deleteConferenceCallParticipants();
                    deleteconferencecallparticipants.kick = true;
                    deleteconferencecallparticipants.call = this.inputGroupCall;
                    deleteconferencecallparticipants.block = call_create_change_state_block;
                    deleteconferencecallparticipants.ids.add(Long.valueOf(j));
                    ConnectionsManager.getInstance(this.currentAccount).sendRequest(deleteconferencecallparticipants, new ks2(this, System.currentTimeMillis(), (byte) 2));
                    return;
                }
            }
        }
    }

    public void requestLastBlock(Runnable runnable) {
        long currentTimeMillis = System.currentTimeMillis();
        TL_phone.getGroupCallChainBlocks getgroupcallchainblocks = new TL_phone.getGroupCallChainBlocks();
        getgroupcallchainblocks.call = this.inputGroupCall;
        getgroupcallchainblocks.sub_chain_id = 0;
        getgroupcallchainblocks.offset = -1;
        getgroupcallchainblocks.limit = 1;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(getgroupcallchainblocks, new jb7(this, currentTimeMillis, runnable, (byte) 2));
    }

    public void reset() {
        gm.r(this.pollRunnable);
        if (this.call_id != -1) {
            for (int i = 0; i < 2; i++) {
                if (this.pollRequestId[i] != 0) {
                    ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.pollRequestId[i], true);
                    this.pollRequestId[i] = 0;
                }
            }
            call_destroy(this.call_id);
            fc4.b("[tde2e] call_destroy(" + this.call_id + ")");
            this.call_id = -1L;
        }
        int[] iArr = this.last_offset;
        iArr[0] = -1;
        iArr[1] = -1;
        this.blocksQueue[0].clear();
        this.blocksQueue[1].clear();
        init();
    }

    public void updateParticipants(ArrayList<TLRPC.GroupCallParticipant> arrayList, boolean z) {
        if (this.destroyed) {
            fc4.b("[tde2e] conference.updateParticipants but destroyed!");
            return;
        }
        int size = arrayList.size();
        int i = 0;
        while (i < size) {
            TLRPC.GroupCallParticipant groupCallParticipant = arrayList.get(i);
            i++;
            this.joiningBlockchainParticipants.remove(Long.valueOf(pg3.n(groupCallParticipant.peer)));
        }
        HashSet<Long> shadyLeftParticipants = getShadyLeftParticipants(arrayList);
        if (!shadyLeftParticipants.isEmpty()) {
            try {
                CallState call_get_state = call_get_state(this.call_id);
                CallState callState = new CallState();
                callState.height = call_get_state.height + 1;
                ArrayList arrayList2 = new ArrayList();
                int i2 = 0;
                while (true) {
                    CallParticipant[] callParticipantArr = call_get_state.participants;
                    if (i2 >= callParticipantArr.length) {
                        break;
                    }
                    if (!shadyLeftParticipants.contains(Long.valueOf(callParticipantArr[i2].user_id))) {
                        CallParticipant callParticipant = new CallParticipant();
                        CallParticipant callParticipant2 = call_get_state.participants[i2];
                        callParticipant.user_id = callParticipant2.user_id;
                        callParticipant.public_key_id = callParticipant2.public_key_id;
                        callParticipant.permissions = callParticipant2.permissions;
                        arrayList2.add(callParticipant);
                    }
                    i2++;
                }
                callState.participants = (CallParticipant[]) arrayList2.toArray(new CallParticipant[0]);
                fc4.b("[tde2e] call_create_change_state_block from " + this.state + " to " + callState);
                byte[] call_create_change_state_block = call_create_change_state_block(this.call_id, callState);
                StringBuilder sb = new StringBuilder();
                sb.append("[tde2e] call_create_change_state_block returns ");
                sb.append(call_describe_block(call_create_change_state_block));
                fc4.b(sb.toString());
                this.state = callState;
                TL_phone.deleteConferenceCallParticipants deleteconferencecallparticipants = new TL_phone.deleteConferenceCallParticipants();
                deleteconferencecallparticipants.only_left = true;
                deleteconferencecallparticipants.call = this.inputGroupCall;
                deleteconferencecallparticipants.block = call_create_change_state_block;
                deleteconferencecallparticipants.ids.addAll(shadyLeftParticipants);
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(deleteconferencecallparticipants, new ks2(this, System.currentTimeMillis(), (byte) 0));
            } catch (Exception e) {
                fc4.g(e, true);
            }
        }
        if (z) {
            forcePoll();
        }
    }

    public void gotCallId(long j) {
    }

    private boolean eq(String[] strArr, String[] strArr2) {
        if (strArr == strArr2) {
            return true;
        }
        if (strArr != null) {
            if (strArr2 != null && strArr.length == strArr2.length) {
                for (int i = 0; i < strArr.length; i++) {
                    if (!TextUtils.equals(strArr[i], strArr2[i])) {
                        return false;
                    }
                }
                return true;
            }
            return false;
        } else if (strArr2 == null) {
            return true;
        }
        return false;
    }
}
