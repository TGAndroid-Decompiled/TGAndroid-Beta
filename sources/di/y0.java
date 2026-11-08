package di;

import j$.util.Objects;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.qp;
import org.telegram.messenger.qs;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_phone;
public final class y0 implements RequestDelegate {
    public final int f9955a;
    public final g1 f9956b;

    public y0(g1 g1Var, int i7) {
        this.f9955a = i7;
        this.f9956b = g1Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo;
        switch (this.f9955a) {
            case 0:
                final g1 g1Var = this.f9956b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        int i7;
                        switch (r4) {
                            case 0:
                                g1 g1Var2 = g1Var;
                                TLObject tLObject2 = tLObject;
                                TLRPC.TL_error tL_error2 = tL_error;
                                int i10 = g1Var2.f9025e;
                                if (!g1Var2.f9031x) {
                                    if (tLObject2 instanceof TL_phone.groupCall) {
                                        TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject2;
                                        qp.s1(i10).Y3(groupcall.users, false);
                                        qp.s1(i10).S3(groupcall.chats, false);
                                        g1Var2.f9030w = groupcall.call;
                                        qs.f(i10).k(176, Long.valueOf(g1Var2.f9030w.f26966id));
                                    } else if (tL_error2 != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error2.text)) {
                                        org.telegram.messenger.g0.h3(new x0(g1Var2, 4));
                                    }
                                    if (g1Var2.P) {
                                        Runnable runnable = g1Var2.R;
                                        if (runnable != null) {
                                            org.telegram.messenger.g0.r(runnable);
                                        }
                                        x0 x0Var = new x0(g1Var2, 11);
                                        g1Var2.R = x0Var;
                                        if (g1Var2.l()) {
                                            i7 = 5000;
                                        } else {
                                            i7 = 20000;
                                        }
                                        org.telegram.messenger.g0.i3(x0Var, i7);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                g1 g1Var3 = g1Var;
                                TLObject tLObject3 = tLObject;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (!g1Var3.f9031x) {
                                    if (tLObject3 instanceof Vector) {
                                        if (!((Vector) tLObject3).toIntArray().contains(Integer.valueOf(g1Var3.K))) {
                                            if (g1Var3.E != null) {
                                                org.telegram.messenger.p5 p5Var = Utilities.f21336e;
                                                NativeInstance nativeInstance = g1Var3.E;
                                                Objects.requireNonNull(nativeInstance);
                                                p5Var.c(new org.telegram.messenger.voip.p0(nativeInstance, 3));
                                                g1Var3.M.clear();
                                                g1Var3.E = null;
                                            }
                                            g1Var3.k();
                                        }
                                    } else if (tLObject3 instanceof TL_phone.groupCall) {
                                        TL_phone.groupCall groupcall2 = (TL_phone.groupCall) tLObject3;
                                        qp.s1(g1Var3.f9025e).Y3(groupcall2.users, false);
                                        qp.s1(g1Var3.f9025e).S3(groupcall2.chats, false);
                                        g1Var3.f9030w = groupcall2.call;
                                        qs.f(g1Var3.f9025e).k(176, Long.valueOf(g1Var3.f9030w.f26966id));
                                    } else if (tL_error3 != null) {
                                        if ("GROUPCALL_JOIN_MISSING".equals(tL_error3.text)) {
                                            org.telegram.messenger.a8.b("[LivePlayer] received GROUPCALL_JOIN_MISSING on checkGroupCall => rejoining");
                                            org.telegram.messenger.g0.h3(new x0(g1Var3, 9));
                                        } else if ("GROUPCALL_INVALID".equalsIgnoreCase(tL_error3.text)) {
                                            org.telegram.messenger.g0.h3(new x0(g1Var3, 4));
                                        }
                                    }
                                    if (g1Var3.P) {
                                        Runnable runnable2 = g1Var3.Q;
                                        if (runnable2 != null) {
                                            org.telegram.messenger.g0.r(runnable2);
                                        }
                                        x0 x0Var2 = new x0(g1Var3, 10);
                                        g1Var3.Q = x0Var2;
                                        org.telegram.messenger.g0.i3(x0Var2, 4000L);
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
                boolean z9 = tLObject instanceof TLRPC.Updates;
                g1 g1Var2 = this.f9956b;
                if (z9) {
                    qp.s1(g1Var2.f9025e).O3((TLRPC.Updates) tLObject, false);
                    return;
                } else {
                    g1Var2.getClass();
                    return;
                }
            case 2:
                g1 g1Var3 = this.f9956b;
                int i7 = g1Var3.f9025e;
                if (tLObject instanceof TL_phone.groupCall) {
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
                    int i10 = 0;
                    qp.s1(i7).Y3(groupcall.users, false);
                    qp.s1(i7).S3(groupcall.chats, false);
                    if (g1Var3.E != null && !g1Var3.f9031x) {
                        while (true) {
                            if (i10 < groupcall.participants.size()) {
                                if (org.telegram.messenger.m5.o(groupcall.participants.get(i10).peer) == g1Var3.f9023b) {
                                    g1Var3.G = groupcall.participants.get(i10);
                                } else {
                                    i10++;
                                }
                            }
                        }
                        TLRPC.GroupCallParticipant groupCallParticipant = g1Var3.G;
                        if (groupCallParticipant != null && (tL_groupCallParticipantVideo = groupCallParticipant.video) != null) {
                            NativeInstance nativeInstance = g1Var3.E;
                            String str = tL_groupCallParticipantVideo.endpoint;
                            NativeInstance.SsrcGroup[] d = g1.d(tL_groupCallParticipantVideo);
                            g1Var3.r(d);
                            nativeInstance.addIncomingVideoOutput(2, str, d, g1Var3.H, org.telegram.messenger.m5.o(g1Var3.G.peer));
                            return;
                        }
                        org.telegram.messenger.g0.h3(new x0(g1Var3, 7));
                        return;
                    }
                    return;
                }
                return;
            case 3:
                final g1 g1Var4 = this.f9956b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        int i72;
                        switch (r4) {
                            case 0:
                                g1 g1Var22 = g1Var4;
                                TLObject tLObject2 = tLObject;
                                TLRPC.TL_error tL_error2 = tL_error;
                                int i102 = g1Var22.f9025e;
                                if (!g1Var22.f9031x) {
                                    if (tLObject2 instanceof TL_phone.groupCall) {
                                        TL_phone.groupCall groupcall2 = (TL_phone.groupCall) tLObject2;
                                        qp.s1(i102).Y3(groupcall2.users, false);
                                        qp.s1(i102).S3(groupcall2.chats, false);
                                        g1Var22.f9030w = groupcall2.call;
                                        qs.f(i102).k(176, Long.valueOf(g1Var22.f9030w.f26966id));
                                    } else if (tL_error2 != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error2.text)) {
                                        org.telegram.messenger.g0.h3(new x0(g1Var22, 4));
                                    }
                                    if (g1Var22.P) {
                                        Runnable runnable = g1Var22.R;
                                        if (runnable != null) {
                                            org.telegram.messenger.g0.r(runnable);
                                        }
                                        x0 x0Var = new x0(g1Var22, 11);
                                        g1Var22.R = x0Var;
                                        if (g1Var22.l()) {
                                            i72 = 5000;
                                        } else {
                                            i72 = 20000;
                                        }
                                        org.telegram.messenger.g0.i3(x0Var, i72);
                                        return;
                                    }
                                    return;
                                }
                                return;
                            default:
                                g1 g1Var32 = g1Var4;
                                TLObject tLObject3 = tLObject;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (!g1Var32.f9031x) {
                                    if (tLObject3 instanceof Vector) {
                                        if (!((Vector) tLObject3).toIntArray().contains(Integer.valueOf(g1Var32.K))) {
                                            if (g1Var32.E != null) {
                                                org.telegram.messenger.p5 p5Var = Utilities.f21336e;
                                                NativeInstance nativeInstance2 = g1Var32.E;
                                                Objects.requireNonNull(nativeInstance2);
                                                p5Var.c(new org.telegram.messenger.voip.p0(nativeInstance2, 3));
                                                g1Var32.M.clear();
                                                g1Var32.E = null;
                                            }
                                            g1Var32.k();
                                        }
                                    } else if (tLObject3 instanceof TL_phone.groupCall) {
                                        TL_phone.groupCall groupcall22 = (TL_phone.groupCall) tLObject3;
                                        qp.s1(g1Var32.f9025e).Y3(groupcall22.users, false);
                                        qp.s1(g1Var32.f9025e).S3(groupcall22.chats, false);
                                        g1Var32.f9030w = groupcall22.call;
                                        qs.f(g1Var32.f9025e).k(176, Long.valueOf(g1Var32.f9030w.f26966id));
                                    } else if (tL_error3 != null) {
                                        if ("GROUPCALL_JOIN_MISSING".equals(tL_error3.text)) {
                                            org.telegram.messenger.a8.b("[LivePlayer] received GROUPCALL_JOIN_MISSING on checkGroupCall => rejoining");
                                            org.telegram.messenger.g0.h3(new x0(g1Var32, 9));
                                        } else if ("GROUPCALL_INVALID".equalsIgnoreCase(tL_error3.text)) {
                                            org.telegram.messenger.g0.h3(new x0(g1Var32, 4));
                                        }
                                    }
                                    if (g1Var32.P) {
                                        Runnable runnable2 = g1Var32.Q;
                                        if (runnable2 != null) {
                                            org.telegram.messenger.g0.r(runnable2);
                                        }
                                        x0 x0Var2 = new x0(g1Var32, 10);
                                        g1Var32.Q = x0Var2;
                                        org.telegram.messenger.g0.i3(x0Var2, 4000L);
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
                g1 g1Var5 = this.f9956b;
                int i11 = g1Var5.f9025e;
                if (tLObject instanceof TLRPC.Updates) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    qp.s1(i11).Y3(updates.users, false);
                    qp.s1(i11).S3(updates.chats, false);
                    qp.s1(i11).O3(updates, false);
                    return;
                } else if (tL_error != null && "GROUPCALL_ALREADY_DISCARDED".equalsIgnoreCase(tL_error.text)) {
                    org.telegram.messenger.g0.h3(new x0(g1Var5, 4));
                    return;
                } else {
                    return;
                }
            default:
                boolean z10 = tLObject instanceof TLRPC.Updates;
                g1 g1Var6 = this.f9956b;
                if (z10) {
                    qp.s1(g1Var6.f9025e).O3((TLRPC.Updates) tLObject, false);
                    return;
                } else {
                    g1Var6.getClass();
                    return;
                }
        }
    }
}
