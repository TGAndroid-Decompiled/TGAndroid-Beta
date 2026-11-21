package fi;

import j$.util.Objects;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.ks;
import org.telegram.messenger.mp;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_phone;
public final class x0 implements RequestDelegate {
    public final int f12756a;
    public final c1 f12757b;

    public x0(c1 c1Var, int i7) {
        this.f12756a = i7;
        this.f12757b = c1Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo;
        switch (this.f12756a) {
            case 0:
                final c1 c1Var = this.f12757b;
                org.telegram.messenger.g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        int i7;
                        switch (r4) {
                            case 0:
                                c1 c1Var2 = c1Var;
                                TLObject tLObject2 = tLObject;
                                TLRPC.TL_error tL_error2 = tL_error;
                                int i10 = c1Var2.f11836e;
                                if (!c1Var2.f11842x) {
                                    if (tLObject2 instanceof TL_phone.groupCall) {
                                        TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject2;
                                        mp.u1(i10).f4(groupcall.users, false);
                                        mp.u1(i10).Z3(groupcall.chats, false);
                                        c1Var2.f11841w = groupcall.call;
                                        ks.f(i10).k(176, Long.valueOf(c1Var2.f11841w.f28441id));
                                    } else if (tL_error2 != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error2.text)) {
                                        org.telegram.messenger.g0.g3(new w0(c1Var2, 4));
                                    }
                                    if (c1Var2.Q) {
                                        Runnable runnable = c1Var2.S;
                                        if (runnable != null) {
                                            org.telegram.messenger.g0.r(runnable);
                                        }
                                        w0 w0Var = new w0(c1Var2, 11);
                                        c1Var2.S = w0Var;
                                        if (c1Var2.l()) {
                                            i7 = 5000;
                                        } else {
                                            i7 = 20000;
                                        }
                                        org.telegram.messenger.g0.h3(w0Var, i7);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                c1 c1Var3 = c1Var;
                                TLObject tLObject3 = tLObject;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (!c1Var3.f11842x) {
                                    if (tLObject3 instanceof Vector) {
                                        if (!((Vector) tLObject3).toIntArray().contains(Integer.valueOf(c1Var3.L))) {
                                            if (c1Var3.F != null) {
                                                org.telegram.messenger.q5 q5Var = Utilities.f22807e;
                                                NativeInstance nativeInstance = c1Var3.F;
                                                Objects.requireNonNull(nativeInstance);
                                                q5Var.c(new org.telegram.messenger.voip.q0(nativeInstance, 3));
                                                c1Var3.N.clear();
                                                c1Var3.F = null;
                                            }
                                            c1Var3.k();
                                        }
                                    } else if (tLObject3 instanceof TL_phone.groupCall) {
                                        TL_phone.groupCall groupcall2 = (TL_phone.groupCall) tLObject3;
                                        mp.u1(c1Var3.f11836e).f4(groupcall2.users, false);
                                        mp.u1(c1Var3.f11836e).Z3(groupcall2.chats, false);
                                        c1Var3.f11841w = groupcall2.call;
                                        ks.f(c1Var3.f11836e).k(176, Long.valueOf(c1Var3.f11841w.f28441id));
                                    } else if (tL_error3 != null) {
                                        if ("GROUPCALL_JOIN_MISSING".equals(tL_error3.text)) {
                                            org.telegram.messenger.a8.b("[LivePlayer] received GROUPCALL_JOIN_MISSING on checkGroupCall => rejoining");
                                            org.telegram.messenger.g0.g3(new w0(c1Var3, 9));
                                        } else if ("GROUPCALL_INVALID".equalsIgnoreCase(tL_error3.text)) {
                                            org.telegram.messenger.g0.g3(new w0(c1Var3, 4));
                                        }
                                    }
                                    if (c1Var3.Q) {
                                        Runnable runnable2 = c1Var3.R;
                                        if (runnable2 != null) {
                                            org.telegram.messenger.g0.r(runnable2);
                                        }
                                        w0 w0Var2 = new w0(c1Var3, 10);
                                        c1Var3.R = w0Var2;
                                        org.telegram.messenger.g0.h3(w0Var2, 4000L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            case 1:
                boolean z10 = tLObject instanceof TLRPC.Updates;
                c1 c1Var2 = this.f12757b;
                if (z10) {
                    mp.u1(c1Var2.f11836e).V3((TLRPC.Updates) tLObject, false);
                    return;
                } else {
                    c1Var2.getClass();
                    return;
                }
            case 2:
                c1 c1Var3 = this.f12757b;
                int i7 = c1Var3.f11836e;
                if (tLObject instanceof TL_phone.groupCall) {
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
                    int i10 = 0;
                    mp.u1(i7).f4(groupcall.users, false);
                    mp.u1(i7).Z3(groupcall.chats, false);
                    if (c1Var3.F != null && !c1Var3.f11842x) {
                        while (true) {
                            if (i10 < groupcall.participants.size()) {
                                if (org.telegram.messenger.n5.o(groupcall.participants.get(i10).peer) == c1Var3.f11834b) {
                                    c1Var3.H = groupcall.participants.get(i10);
                                } else {
                                    i10++;
                                }
                            }
                        }
                        TLRPC.GroupCallParticipant groupCallParticipant = c1Var3.H;
                        if (groupCallParticipant != null && (tL_groupCallParticipantVideo = groupCallParticipant.video) != null) {
                            NativeInstance nativeInstance = c1Var3.F;
                            String str = tL_groupCallParticipantVideo.endpoint;
                            NativeInstance.SsrcGroup[] d = c1.d(tL_groupCallParticipantVideo);
                            c1Var3.r(d);
                            nativeInstance.addIncomingVideoOutput(2, str, d, c1Var3.I, org.telegram.messenger.n5.o(c1Var3.H.peer));
                            return;
                        }
                        org.telegram.messenger.g0.g3(new w0(c1Var3, 7));
                        return;
                    }
                    return;
                }
                return;
            case 3:
                final c1 c1Var4 = this.f12757b;
                org.telegram.messenger.g0.g3(new Runnable() {
                    @Override
                    public final void run() {
                        int i72;
                        switch (r4) {
                            case 0:
                                c1 c1Var22 = c1Var4;
                                TLObject tLObject2 = tLObject;
                                TLRPC.TL_error tL_error2 = tL_error;
                                int i102 = c1Var22.f11836e;
                                if (!c1Var22.f11842x) {
                                    if (tLObject2 instanceof TL_phone.groupCall) {
                                        TL_phone.groupCall groupcall2 = (TL_phone.groupCall) tLObject2;
                                        mp.u1(i102).f4(groupcall2.users, false);
                                        mp.u1(i102).Z3(groupcall2.chats, false);
                                        c1Var22.f11841w = groupcall2.call;
                                        ks.f(i102).k(176, Long.valueOf(c1Var22.f11841w.f28441id));
                                    } else if (tL_error2 != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error2.text)) {
                                        org.telegram.messenger.g0.g3(new w0(c1Var22, 4));
                                    }
                                    if (c1Var22.Q) {
                                        Runnable runnable = c1Var22.S;
                                        if (runnable != null) {
                                            org.telegram.messenger.g0.r(runnable);
                                        }
                                        w0 w0Var = new w0(c1Var22, 11);
                                        c1Var22.S = w0Var;
                                        if (c1Var22.l()) {
                                            i72 = 5000;
                                        } else {
                                            i72 = 20000;
                                        }
                                        org.telegram.messenger.g0.h3(w0Var, i72);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                c1 c1Var32 = c1Var4;
                                TLObject tLObject3 = tLObject;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (!c1Var32.f11842x) {
                                    if (tLObject3 instanceof Vector) {
                                        if (!((Vector) tLObject3).toIntArray().contains(Integer.valueOf(c1Var32.L))) {
                                            if (c1Var32.F != null) {
                                                org.telegram.messenger.q5 q5Var = Utilities.f22807e;
                                                NativeInstance nativeInstance2 = c1Var32.F;
                                                Objects.requireNonNull(nativeInstance2);
                                                q5Var.c(new org.telegram.messenger.voip.q0(nativeInstance2, 3));
                                                c1Var32.N.clear();
                                                c1Var32.F = null;
                                            }
                                            c1Var32.k();
                                        }
                                    } else if (tLObject3 instanceof TL_phone.groupCall) {
                                        TL_phone.groupCall groupcall22 = (TL_phone.groupCall) tLObject3;
                                        mp.u1(c1Var32.f11836e).f4(groupcall22.users, false);
                                        mp.u1(c1Var32.f11836e).Z3(groupcall22.chats, false);
                                        c1Var32.f11841w = groupcall22.call;
                                        ks.f(c1Var32.f11836e).k(176, Long.valueOf(c1Var32.f11841w.f28441id));
                                    } else if (tL_error3 != null) {
                                        if ("GROUPCALL_JOIN_MISSING".equals(tL_error3.text)) {
                                            org.telegram.messenger.a8.b("[LivePlayer] received GROUPCALL_JOIN_MISSING on checkGroupCall => rejoining");
                                            org.telegram.messenger.g0.g3(new w0(c1Var32, 9));
                                        } else if ("GROUPCALL_INVALID".equalsIgnoreCase(tL_error3.text)) {
                                            org.telegram.messenger.g0.g3(new w0(c1Var32, 4));
                                        }
                                    }
                                    if (c1Var32.Q) {
                                        Runnable runnable2 = c1Var32.R;
                                        if (runnable2 != null) {
                                            org.telegram.messenger.g0.r(runnable2);
                                        }
                                        w0 w0Var2 = new w0(c1Var32, 10);
                                        c1Var32.R = w0Var2;
                                        org.telegram.messenger.g0.h3(w0Var2, 4000L);
                                        return;
                                    }
                                    return;
                                }
                                return;
                        }
                    }
                });
                return;
            case 4:
                c1 c1Var5 = this.f12757b;
                int i11 = c1Var5.f11836e;
                if (tLObject instanceof TLRPC.Updates) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    mp.u1(i11).f4(updates.users, false);
                    mp.u1(i11).Z3(updates.chats, false);
                    mp.u1(i11).V3(updates, false);
                    return;
                } else if (tL_error != null && "GROUPCALL_ALREADY_DISCARDED".equalsIgnoreCase(tL_error.text)) {
                    org.telegram.messenger.g0.g3(new w0(c1Var5, 4));
                    return;
                } else {
                    return;
                }
            default:
                boolean z11 = tLObject instanceof TLRPC.Updates;
                c1 c1Var6 = this.f12757b;
                if (z11) {
                    mp.u1(c1Var6.f11836e).V3((TLRPC.Updates) tLObject, false);
                    return;
                } else {
                    c1Var6.getClass();
                    return;
                }
        }
    }
}
