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
import org.telegram.messenger.d20;
import org.telegram.messenger.f8;
import org.telegram.messenger.o5;
import org.telegram.messenger.u3;
import org.telegram.messenger.vp;
import org.telegram.messenger.zs;
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
    private final Runnable pollRunnable = new b(this, 2);
    private final int[] pollRequestId = new int[2];

    public static final class CallParticipant {
        int permissions;
        long public_key_id;
        long user_id;

        public String toString() {
            StringBuilder sb2 = new StringBuilder("CallParticipant{user_id=");
            sb2.append(this.user_id);
            sb2.append(", public_key_id=");
            return a1.g.q(sb2, this.public_key_id, "}");
        }
    }

    public static final class CallState {
        int height;
        CallParticipant[] participants;

        public CallParticipant find(long j10) {
            int i10 = 0;
            while (true) {
                CallParticipant[] callParticipantArr = this.participants;
                if (i10 < callParticipantArr.length) {
                    CallParticipant callParticipant = callParticipantArr[i10];
                    if (callParticipant.user_id == j10) {
                        return callParticipant;
                    }
                    i10++;
                } else {
                    return null;
                }
            }
        }

        public String toString() {
            StringBuilder sb2 = new StringBuilder(a1.g.p(new StringBuilder("CallState{height="), this.height, ", participants=["));
            for (int i10 = 0; i10 < this.participants.length; i10++) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                CallParticipant callParticipant = this.participants[i10];
                if (callParticipant == null) {
                    sb2.append("null");
                } else {
                    sb2.append(callParticipant.toString());
                }
            }
            sb2.append("]}");
            return sb2.toString();
        }
    }

    public static final class CallVerificationState {
        byte[] emoji_hash;
        int height;

        public String toString() {
            String str;
            StringBuilder sb2 = new StringBuilder("CallVerificationState{height=");
            sb2.append(this.height);
            sb2.append(", emoji_hash=");
            if (this.emoji_hash == null) {
                str = null;
            } else {
                str = "{" + Utilities.f(this.emoji_hash) + "}";
            }
            return a1.g.r(sb2, str, "}");
        }
    }

    public static final class CallVerificationWords {
        int height;
        String[] words;

        public String toString() {
            StringBuilder sb2 = new StringBuilder(a1.g.p(new StringBuilder("CallVerificationWords{height="), this.height, ", words=["));
            for (int i10 = 0; i10 < this.words.length; i10++) {
                if (i10 > 0) {
                    sb2.append(", ");
                }
                sb2.append(this.words[i10]);
            }
            sb2.append("]}");
            return sb2.toString();
        }
    }

    public ConferenceCall(int i10, long j10) {
        this.currentAccount = i10;
        this.my_user_id = j10;
        init();
    }

    private static String blockStr(byte[] bArr) {
        return "Block{" + Utilities.f(bArr) + "}";
    }

    public static native CallState call_apply_block(long j10, byte[] bArr);

    public static native long call_create(long j10, long j11, byte[] bArr);

    public static native byte[] call_create_change_state_block(long j10, CallState callState);

    public static native byte[] call_create_self_add_block(long j10, byte[] bArr, CallParticipant callParticipant);

    public static native byte[] call_create_zero_block(long j10, CallState callState);

    public static native String call_describe(long j10);

    public static native String call_describe_block(byte[] bArr);

    public static native String call_describe_message(byte[] bArr);

    public static native void call_destroy(long j10);

    public static native void call_destroy_all();

    public static native int call_get_height(long j10);

    public static native CallState call_get_state(long j10);

    public static native CallVerificationState call_get_verification_state(long j10);

    public static native CallVerificationWords call_get_verification_words(long j10);

    public static native byte[][] call_pull_outbound_messages(long j10);

    public static native CallVerificationState call_receive_inbound_message(long j10, byte[] bArr);

    private void checkEmojiHash() {
        String[] verificationEmojis = getVerificationEmojis();
        if (!eq(verificationEmojis, this.lastVerificationEmojis)) {
            this.lastVerificationEmojis = verificationEmojis;
            org.telegram.messenger.i0.g3(new b(this, 1));
        }
    }

    private void checkParticipants() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.voip.ConferenceCall.checkParticipants():void");
    }

    public static native byte[] decrypt_message_for_one(long j10, byte[] bArr);

    public static native byte[] encrypt_message_for_one(long j10, byte[] bArr);

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
        for (int i10 = 0; i10 < strArr.length; i10++) {
            if (!TextUtils.equals(strArr[i10], strArr2[i10])) {
                return false;
            }
        }
        return true;
    }

    private long getPollTimeout() {
        if (getVerificationEmojis() == null) {
            return 1000L;
        }
        return 5000L;
    }

    private String[] getVerificationEmojis() {
        byte[] bArr;
        long j10 = this.call_id;
        if (j10 >= 0) {
            try {
                bArr = call_get_verification_state(j10).emoji_hash;
            } catch (Exception e) {
                f8.g(e, true);
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

    public static native void key_destroy(long j10);

    public static native long key_from_ecdh(long j10, long j11);

    public static native long key_from_public_key(byte[] bArr);

    public static native long key_generate_temporary_private_key();

    public static native byte[] key_to_public_key(long j10);

    public void lambda$checkEmojiHash$0() {
        zs.f(this.currentAccount).k(zs.R3, new Object[0]);
    }

    public void lambda$checkParticipants$1() {
        VoIPService sharedInstance;
        u3 u3Var;
        TLRPC.GroupCall groupCall;
        if (this.groupCall != null && (sharedInstance = VoIPService.getSharedInstance()) != null && (u3Var = sharedInstance.groupCall) != null && (groupCall = u3Var.f18228b) != null && groupCall.f19803id == this.groupCall.f19803id) {
            updateParticipants(u3Var.e, false);
            sharedInstance.groupCall.f18235l.clear();
            u3 u3Var2 = sharedInstance.groupCall;
            u3Var2.f18235l.addAll(sharedInstance.conference.getShadyLeftParticipants(u3Var2.e));
            sharedInstance.groupCall.f18236m.clear();
            u3 u3Var3 = sharedInstance.groupCall;
            u3Var3.f18236m.addAll(sharedInstance.conference.getShadyJoiningParticipants(u3Var3.e));
            zs.f(this.currentAccount).k(zs.f19713w2, 0L, Long.valueOf(this.groupCall.f19803id), Boolean.FALSE);
        }
    }

    public void lambda$kick$12(long j10, TLObject tLObject, TLRPC.TL_error tL_error) {
        processUpdates(null, Long.valueOf(j10), tLObject, tL_error);
    }

    public void lambda$kick$13(long j10, TLObject tLObject, TLRPC.TL_error tL_error) {
        org.telegram.messenger.i0.g3(new a(this, j10, tLObject, tL_error, 1));
    }

    public void lambda$poll$7(TL_phone.getGroupCallChainBlocks getgroupcallchainblocks, long j10, TLObject tLObject, TLRPC.TL_error tL_error, AtomicBoolean atomicBoolean, AtomicInteger atomicInteger) {
        if (processUpdates(Integer.valueOf(getgroupcallchainblocks.offset), Long.valueOf(j10), tLObject, tL_error)) {
            atomicBoolean.set(true);
        }
        if (atomicInteger.incrementAndGet() == 2) {
            this.polling = false;
            if (atomicBoolean.get()) {
                forcePoll();
                return;
            }
            org.telegram.messenger.i0.r(this.pollRunnable);
            org.telegram.messenger.i0.h3(this.pollRunnable, getPollTimeout());
        }
    }

    public void lambda$poll$8(TL_phone.getGroupCallChainBlocks getgroupcallchainblocks, long j10, AtomicBoolean atomicBoolean, AtomicInteger atomicInteger, TLObject tLObject, TLRPC.TL_error tL_error) {
        org.telegram.messenger.i0.g3(new f(j10, atomicBoolean, atomicInteger, this, tLObject, tL_error, getgroupcallchainblocks));
    }

    public static String lambda$poll$9(CallParticipant callParticipant) {
        return "[" + callParticipant.user_id + "]: " + o5.l(d20.f15147s0, callParticipant.user_id);
    }

    public void lambda$processUpdates$4(TLObject tLObject) {
        vp.r1(this.currentAccount).L3((TLRPC.Updates) tLObject, false);
    }

    public void lambda$pull_outbound$5(long j10, TLObject tLObject, TLRPC.TL_error tL_error) {
        processUpdates(null, Long.valueOf(j10), tLObject, tL_error);
    }

    public void lambda$pull_outbound$6(long j10, TLObject tLObject, TLRPC.TL_error tL_error) {
        org.telegram.messenger.i0.g3(new a(this, j10, tLObject, tL_error, 0));
    }

    public void lambda$requestLastBlock$2(long j10, TLObject tLObject, TLRPC.TL_error tL_error, Runnable runnable) {
        processUpdates(-1, Long.valueOf(j10), tLObject, tL_error);
        if (runnable != null) {
            runnable.run();
        }
    }

    public void lambda$requestLastBlock$3(long j10, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        org.telegram.messenger.i0.g3(new g(this, j10, tLObject, tL_error, runnable, 0));
    }

    public void lambda$updateParticipants$10(long j10, TLObject tLObject, TLRPC.TL_error tL_error) {
        processUpdates(null, Long.valueOf(j10), tLObject, tL_error);
    }

    public void lambda$updateParticipants$11(long j10, TLObject tLObject, TLRPC.TL_error tL_error) {
        org.telegram.messenger.i0.g3(new a(this, j10, tLObject, tL_error, 2));
    }

    public void poll() {
        if (this.destroyed) {
            f8.b("[tde2e] conference.poll but destroyed!");
        } else if (!this.joined) {
            f8.b("[tde2e] conference.poll but not joined!");
        } else {
            this.polling = true;
            AtomicInteger atomicInteger = new AtomicInteger(0);
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            for (int i10 = 0; i10 < 2; i10++) {
                TL_phone.getGroupCallChainBlocks getgroupcallchainblocks = new TL_phone.getGroupCallChainBlocks();
                getgroupcallchainblocks.call = this.inputGroupCall;
                getgroupcallchainblocks.sub_chain_id = i10;
                getgroupcallchainblocks.offset = Math.max(0, this.last_offset[i10]);
                getgroupcallchainblocks.limit = 10;
                f8.b("[tde2e] requesting getGroupCallChainBlocks sub_chain_id=" + getgroupcallchainblocks.sub_chain_id + " offset=" + getgroupcallchainblocks.offset + " limit=10");
                this.pollRequestId[i10] = ConnectionsManager.getInstance(this.currentAccount).sendRequest(getgroupcallchainblocks, new c(this, getgroupcallchainblocks, System.currentTimeMillis(), atomicBoolean, atomicInteger));
            }
            if (this.call_id >= 0) {
                try {
                    f8.b("[tde2e] state = " + call_get_verification_state(this.call_id));
                } catch (Exception e) {
                    f8.g(e, true);
                }
                try {
                    f8.b("[tde2e] call_describe(" + this.call_id + "): " + call_describe(this.call_id));
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append("[tde2e] call users:\n ");
                    sb2.append(TextUtils.join("\n ", (Iterable) DesugarArrays.stream(call_get_state(this.call_id).participants).map(new Object()).collect(Collectors.toSet())));
                    f8.b(sb2.toString());
                } catch (Exception e7) {
                    f8.g(e7, true);
                }
            }
            checkEmojiHash();
            checkParticipants();
        }
    }

    private boolean processUpdates(Integer num, Long l4, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (!(tLObject instanceof TLRPC.Updates)) {
            return false;
        }
        TLRPC.Updates updates = (TLRPC.Updates) tLObject;
        ArrayList z02 = vp.z0(updates, TL_update.TL_updateGroupCallChainBlocks.class);
        int size = z02.size();
        boolean z10 = false;
        int i10 = 0;
        while (i10 < size) {
            Object obj = z02.get(i10);
            i10++;
            if (applyUpdate(num, (TL_update.TL_updateGroupCallChainBlocks) obj, false, l4)) {
                z10 = true;
            }
        }
        Utilities.d.c(new mh.k(13, this, updates));
        return z10;
    }

    private void pull_outbound() {
        throw new UnsupportedOperationException("Method not decompiled: org.telegram.messenger.voip.ConferenceCall.pull_outbound():void");
    }

    private void readQueue(int i10) {
        if (this.destroyed) {
            f8.b("[tde2e] conference.readQueue(" + i10 + ") but destroyed!");
        } else if (i10 != 0 && this.call_id < 0) {
            f8.b("[tde2e] conference.readQueue(" + i10 + ") but there is no call yet!");
        } else {
            int i11 = this.last_offset[i10];
            if (i11 == -1) {
                f8.b("[tde2e] conference.readQueue(" + i10 + ") but last_offset == -1!");
                return;
            }
            int max = Math.max(0, i11);
            f8.b("[tde2e] {subchain: " + i10 + "} processing blocks queue from " + max);
            while (true) {
                long j10 = max;
                byte[] bArr = this.blocksQueue[i10].get(j10);
                if (bArr == null) {
                    StringBuilder m10 = i0.a.m("[tde2e] {subchain: ", i10, "} got into hole (might be the end) in ", i10, " subchain at #");
                    i0.a.t(m10, max, ", when our last_offset[", i10, "] = ");
                    i0.a.p(this.last_offset[i10], m10);
                    this.last_offset[i10] = max;
                    return;
                }
                try {
                    f8.b("[tde2e] {subchain: " + i10 + "} processing #" + max + " block from queue");
                    this.blocksQueue[i10].remove(j10);
                    long j11 = this.call_id;
                    if (j11 < 0) {
                        f8.b("[tde2e] #" + max + " call_create block=" + call_describe_block(bArr));
                        long j12 = this.my_user_id;
                        long j13 = this.my_private_key_id;
                        this.last_block = bArr;
                        long call_create = call_create(j12, j13, bArr);
                        this.call_id = call_create;
                        gotCallId(call_create);
                    } else if (i10 == 0) {
                        if (max > call_get_height(j11)) {
                            f8.b("[tde2e] #" + max + " call_apply_block block=" + call_describe_block(bArr));
                            f8.b("[tde2e] #" + max + " call_apply_block(" + this.call_id + ", " + blockStr(bArr) + ") = " + call_apply_block(this.call_id, bArr));
                        } else {
                            f8.b("[tde2e] #" + max + " block from queue is under call's height!");
                        }
                    } else if (i10 == 1) {
                        f8.b("[tde2e] #" + max + " call_receive_inbound_message message=" + call_describe_message(bArr));
                        f8.b("[tde2e] #" + max + " call_receive_inbound_message(" + this.call_id + ", " + blockStr(bArr) + ") = " + call_receive_inbound_message(this.call_id, bArr));
                    }
                    max++;
                    this.last_offset[i10] = max;
                } catch (Exception e) {
                    f8.e("[tde2e] {subchain: " + i10 + "} #" + max + " block got into error: ", e);
                    return;
                }
            }
        }
    }

    public boolean applyUpdate(Integer num, TL_update.TL_updateGroupCallChainBlocks tL_updateGroupCallChainBlocks, boolean z10, Long l4) {
        String str;
        boolean z11;
        boolean z12;
        if (this.destroyed) {
            f8.b("[tde2e] conference.applyUpdate but destroyed!");
            return false;
        }
        if (tL_updateGroupCallChainBlocks != null) {
            TLRPC.GroupCall groupCall = this.groupCall;
            if (groupCall == null) {
                f8.b("[tde2e] received updateGroupCallChainBlocks but we dont have groupcall yet!");
                return false;
            } else if (tL_updateGroupCallChainBlocks.call.f19810id != groupCall.f19803id) {
                StringBuilder sb2 = new StringBuilder("[tde2e] received updateGroupCallChainBlocks for ");
                sb2.append(tL_updateGroupCallChainBlocks.call.f19810id);
                sb2.append(" but we have ");
                i0.a.q(this.groupCall.f19803id, sb2);
                return false;
            } else {
                StringBuilder sb3 = new StringBuilder("[tde2e] received update with ");
                sb3.append(tL_updateGroupCallChainBlocks.blocks.size());
                sb3.append(" blocks for ");
                sb3.append(tL_updateGroupCallChainBlocks.sub_chain_id);
                sb3.append(" subchain, next_offset=");
                sb3.append(tL_updateGroupCallChainBlocks.next_offset);
                sb3.append(" requested_offset=");
                sb3.append(num);
                if (l4 != null) {
                    str = " in " + (System.currentTimeMillis() - l4.longValue()) + "ms";
                } else {
                    str = "";
                }
                a1.g.z(str, sb3);
                int i10 = tL_updateGroupCallChainBlocks.sub_chain_id;
                int i11 = tL_updateGroupCallChainBlocks.next_offset;
                if (i10 == 0 || i10 == 1) {
                    for (int i12 = 0; i12 < tL_updateGroupCallChainBlocks.blocks.size(); i12++) {
                        byte[] bArr = tL_updateGroupCallChainBlocks.blocks.get(i12);
                        int size = (i11 - tL_updateGroupCallChainBlocks.blocks.size()) + i12;
                        if (num != null && num.intValue() == -1) {
                            if (i10 == 0) {
                                this.last_block = bArr;
                            }
                        } else if (size >= this.last_offset[i10]) {
                            f8.b("[tde2e] {subchain: " + i10 + "} put #" + size + " into queue");
                            this.blocksQueue[i10].put((long) size, bArr);
                        } else {
                            f8.b("[tde2e] {subchain: " + i10 + "} received #" + size + " that was already processed from queue");
                        }
                    }
                    if (this.last_offset[i10] == -1) {
                        if (num != null && num.intValue() == 0) {
                            this.last_offset[i10] = i11 - tL_updateGroupCallChainBlocks.blocks.size();
                        } else if (num != null && num.intValue() == -1) {
                            f8.b("[tde2e] no offset, but we were asking for last block anyway");
                        } else {
                            f8.d("[tde2e] received update where we can't know what the start offset is of " + i10 + " sub chain (we requested " + num + ")");
                        }
                    }
                    if (this.last_offset[i10] != -1) {
                        if (this.call_id >= 0) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        readQueue(i10);
                        if (this.call_id >= 0) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (i10 == 0 && !z11 && z12) {
                            readQueue(1);
                        }
                    }
                }
                if (i10 == 1) {
                    pull_outbound();
                }
                checkEmojiHash();
                checkParticipants();
                if (z10 && tL_updateGroupCallChainBlocks.blocks.size() > 0) {
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
            f8.b("[tde2e] conference.forcePoll but destroyed!");
        } else if (!this.joined) {
            f8.b("[tde2e] conference.forcePoll but not joined!");
        } else if (this.polling) {
        } else {
            org.telegram.messenger.i0.r(this.pollRunnable);
            org.telegram.messenger.i0.g3(this.pollRunnable);
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
            f8.b("[tde2e] call_create_zero_block(" + this.my_private_key_id + ", " + this.state + ")");
        } else {
            try {
                byte[] call_create_self_add_block = call_create_self_add_block(this.my_private_key_id, bArr, callParticipant);
                f8.b("[tde2e] call_create_self_add_block(" + this.my_private_key_id + ", " + blockStr(this.last_block) + ", " + this.state + ") = " + blockStr(call_create_self_add_block));
                StringBuilder sb2 = new StringBuilder("[tde2e] call_create_self_add_block last_block=");
                sb2.append(call_describe_block(this.last_block));
                sb2.append(" new_block=");
                sb2.append(call_describe_block(call_create_self_add_block));
                f8.b(sb2.toString());
                this.last_block = call_create_self_add_block;
            } catch (Exception e) {
                f8.g(e, true);
            }
        }
        return this.last_block;
    }

    public HashSet<Long> getBlockchainParticipants() {
        CallState callState;
        HashSet<Long> hashSet = new HashSet<>();
        if (this.destroyed) {
            f8.b("[tde2e] conference.getBlockchainParticipants but destroyed!");
            return hashSet;
        }
        long j10 = this.call_id;
        if (j10 >= 0) {
            try {
                callState = call_get_state(j10);
            } catch (Exception e) {
                f8.g(e, true);
                callState = null;
            }
            if (callState != null) {
                int i10 = 0;
                while (true) {
                    CallParticipant[] callParticipantArr = callState.participants;
                    if (i10 >= callParticipantArr.length) {
                        break;
                    }
                    hashSet.add(Long.valueOf(callParticipantArr[i10].user_id));
                    i10++;
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
            f8.b("[tde2e] conference.getShadyJoiningParticipants but destroyed!");
            return hashSet;
        }
        long j10 = this.call_id;
        if (j10 >= 0) {
            try {
                callState = call_get_state(j10);
            } catch (Exception e) {
                f8.g(e, true);
                callState = null;
            }
            if (callState != null) {
                int i10 = 0;
                while (true) {
                    CallParticipant[] callParticipantArr = callState.participants;
                    if (i10 >= callParticipantArr.length) {
                        break;
                    }
                    long j11 = callParticipantArr[i10].user_id;
                    int i11 = 0;
                    while (true) {
                        if (arrayList == null) {
                            size = 0;
                        } else {
                            size = arrayList.size();
                        }
                        if (i11 < size) {
                            if (j11 == o5.o(arrayList.get(i11).peer)) {
                                groupCallParticipant = arrayList.get(i11);
                                break;
                            }
                            i11++;
                        } else {
                            groupCallParticipant = null;
                            break;
                        }
                    }
                    if (groupCallParticipant == null && j11 != this.my_user_id && this.joiningBlockchainParticipants.contains(Long.valueOf(j11))) {
                        hashSet.add(Long.valueOf(j11));
                    }
                    i10++;
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
            f8.b("[tde2e] conference.getShadyLeftParticipants but destroyed!");
            return hashSet;
        }
        long j10 = this.call_id;
        if (j10 >= 0) {
            try {
                callState = call_get_state(j10);
            } catch (Exception e) {
                f8.g(e, true);
                callState = null;
            }
            if (callState != null) {
                int i10 = 0;
                while (true) {
                    CallParticipant[] callParticipantArr = callState.participants;
                    if (i10 >= callParticipantArr.length) {
                        break;
                    }
                    long j11 = callParticipantArr[i10].user_id;
                    int i11 = 0;
                    while (true) {
                        if (arrayList == null) {
                            size = 0;
                        } else {
                            size = arrayList.size();
                        }
                        if (i11 < size) {
                            if (j11 == o5.o(arrayList.get(i11).peer)) {
                                groupCallParticipant = arrayList.get(i11);
                                break;
                            }
                            i11++;
                        } else {
                            groupCallParticipant = null;
                            break;
                        }
                    }
                    if (groupCallParticipant == null && j11 != this.my_user_id && !this.joiningBlockchainParticipants.contains(Long.valueOf(j11))) {
                        hashSet.add(Long.valueOf(j11));
                    }
                    i10++;
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

    public void kick(long j10) {
        if (this.destroyed) {
            f8.b("[tde2e] conference.kick but destroyed!");
        } else if (this.call_id < 0 || !getBlockchainParticipants().contains(Long.valueOf(j10))) {
        } else {
            CallState call_get_state = call_get_state(this.call_id);
            CallState callState = new CallState();
            callState.height = call_get_state.height + 1;
            ArrayList arrayList = new ArrayList();
            int i10 = 0;
            while (true) {
                CallParticipant[] callParticipantArr = call_get_state.participants;
                if (i10 < callParticipantArr.length) {
                    if (j10 != callParticipantArr[i10].user_id) {
                        CallParticipant callParticipant = new CallParticipant();
                        CallParticipant callParticipant2 = call_get_state.participants[i10];
                        callParticipant.user_id = callParticipant2.user_id;
                        callParticipant.public_key_id = callParticipant2.public_key_id;
                        callParticipant.permissions = callParticipant2.permissions;
                        arrayList.add(callParticipant);
                    }
                    i10++;
                } else {
                    callState.participants = (CallParticipant[]) arrayList.toArray(new CallParticipant[0]);
                    f8.b("[tde2e] kick: call_create_change_state_block from " + this.state + " to " + callState);
                    byte[] call_create_change_state_block = call_create_change_state_block(this.call_id, callState);
                    StringBuilder sb2 = new StringBuilder("[tde2e] kick: call_create_change_state_block returns ");
                    sb2.append(call_describe_block(call_create_change_state_block));
                    f8.b(sb2.toString());
                    this.state = callState;
                    TL_phone.deleteConferenceCallParticipants deleteconferencecallparticipants = new TL_phone.deleteConferenceCallParticipants();
                    deleteconferencecallparticipants.kick = true;
                    deleteconferencecallparticipants.call = this.inputGroupCall;
                    deleteconferencecallparticipants.block = call_create_change_state_block;
                    deleteconferencecallparticipants.ids.add(Long.valueOf(j10));
                    ConnectionsManager.getInstance(this.currentAccount).sendRequest(deleteconferencecallparticipants, new e(this, System.currentTimeMillis(), 2));
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
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(getgroupcallchainblocks, new mg.x(this, currentTimeMillis, runnable, 1));
    }

    public void reset() {
        org.telegram.messenger.i0.r(this.pollRunnable);
        if (this.call_id != -1) {
            for (int i10 = 0; i10 < 2; i10++) {
                if (this.pollRequestId[i10] != 0) {
                    ConnectionsManager.getInstance(this.currentAccount).cancelRequest(this.pollRequestId[i10], true);
                    this.pollRequestId[i10] = 0;
                }
            }
            call_destroy(this.call_id);
            f8.b("[tde2e] call_destroy(" + this.call_id + ")");
            this.call_id = -1L;
        }
        int[] iArr = this.last_offset;
        iArr[0] = -1;
        iArr[1] = -1;
        this.blocksQueue[0].clear();
        this.blocksQueue[1].clear();
        init();
    }

    public void updateParticipants(ArrayList<TLRPC.GroupCallParticipant> arrayList, boolean z10) {
        if (this.destroyed) {
            f8.b("[tde2e] conference.updateParticipants but destroyed!");
            return;
        }
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            TLRPC.GroupCallParticipant groupCallParticipant = arrayList.get(i10);
            i10++;
            this.joiningBlockchainParticipants.remove(Long.valueOf(o5.o(groupCallParticipant.peer)));
        }
        HashSet<Long> shadyLeftParticipants = getShadyLeftParticipants(arrayList);
        if (!shadyLeftParticipants.isEmpty()) {
            try {
                CallState call_get_state = call_get_state(this.call_id);
                CallState callState = new CallState();
                callState.height = call_get_state.height + 1;
                ArrayList arrayList2 = new ArrayList();
                int i11 = 0;
                while (true) {
                    CallParticipant[] callParticipantArr = call_get_state.participants;
                    if (i11 >= callParticipantArr.length) {
                        break;
                    }
                    if (!shadyLeftParticipants.contains(Long.valueOf(callParticipantArr[i11].user_id))) {
                        CallParticipant callParticipant = new CallParticipant();
                        CallParticipant callParticipant2 = call_get_state.participants[i11];
                        callParticipant.user_id = callParticipant2.user_id;
                        callParticipant.public_key_id = callParticipant2.public_key_id;
                        callParticipant.permissions = callParticipant2.permissions;
                        arrayList2.add(callParticipant);
                    }
                    i11++;
                }
                callState.participants = (CallParticipant[]) arrayList2.toArray(new CallParticipant[0]);
                f8.b("[tde2e] call_create_change_state_block from " + this.state + " to " + callState);
                byte[] call_create_change_state_block = call_create_change_state_block(this.call_id, callState);
                StringBuilder sb2 = new StringBuilder();
                sb2.append("[tde2e] call_create_change_state_block returns ");
                sb2.append(call_describe_block(call_create_change_state_block));
                f8.b(sb2.toString());
                this.state = callState;
                TL_phone.deleteConferenceCallParticipants deleteconferencecallparticipants = new TL_phone.deleteConferenceCallParticipants();
                deleteconferencecallparticipants.only_left = true;
                deleteconferencecallparticipants.call = this.inputGroupCall;
                deleteconferencecallparticipants.block = call_create_change_state_block;
                deleteconferencecallparticipants.ids.addAll(shadyLeftParticipants);
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(deleteconferencecallparticipants, new e(this, System.currentTimeMillis(), 0));
            } catch (Exception e) {
                f8.g(e, true);
            }
        }
        if (z10) {
            forcePoll();
        }
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

    public void gotCallId(long j10) {
    }
}
