package fi;

import j$.util.Objects;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.np;
import org.telegram.messenger.ns;
import org.telegram.messenger.voip.NativeInstance;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.Vector;
import org.telegram.tgnet.tl.TL_phone;
public final class y0 implements RequestDelegate {
    public final int f12518a;
    public final e1 f12519b;

    public y0(e1 e1Var, int i7) {
        this.f12518a = i7;
        this.f12519b = e1Var;
    }

    @Override
    public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
        TLRPC.TL_groupCallParticipantVideo tL_groupCallParticipantVideo;
        switch (this.f12518a) {
            case 0:
                final e1 e1Var = this.f12519b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        int i7;
                        switch (r4) {
                            case 0:
                                e1 e1Var2 = e1Var;
                                TLObject tLObject2 = tLObject;
                                TLRPC.TL_error tL_error2 = tL_error;
                                int i10 = e1Var2.f11656e;
                                if (!e1Var2.f11662x) {
                                    if (tLObject2 instanceof TL_phone.groupCall) {
                                        TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject2;
                                        np.s1(i10).Y3(groupcall.users, false);
                                        np.s1(i10).S3(groupcall.chats, false);
                                        e1Var2.f11661w = groupcall.call;
                                        ns.f(i10).k(176, Long.valueOf(e1Var2.f11661w.f28061id));
                                    } else if (tL_error2 != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error2.text)) {
                                        org.telegram.messenger.g0.h3(new x0(e1Var2, 4));
                                    }
                                    if (e1Var2.Q) {
                                        Runnable runnable = e1Var2.S;
                                        if (runnable != null) {
                                            org.telegram.messenger.g0.r(runnable);
                                        }
                                        x0 x0Var = new x0(e1Var2, 11);
                                        e1Var2.S = x0Var;
                                        if (e1Var2.l()) {
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
                                e1 e1Var3 = e1Var;
                                TLObject tLObject3 = tLObject;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (!e1Var3.f11662x) {
                                    if (tLObject3 instanceof Vector) {
                                        if (!((Vector) tLObject3).toIntArray().contains(Integer.valueOf(e1Var3.L))) {
                                            if (e1Var3.F != null) {
                                                org.telegram.messenger.p5 p5Var = Utilities.f22416e;
                                                NativeInstance nativeInstance = e1Var3.F;
                                                Objects.requireNonNull(nativeInstance);
                                                p5Var.c(new org.telegram.messenger.voip.q0(nativeInstance, 3));
                                                e1Var3.N.clear();
                                                e1Var3.F = null;
                                            }
                                            e1Var3.k();
                                        }
                                    } else if (tLObject3 instanceof TL_phone.groupCall) {
                                        TL_phone.groupCall groupcall2 = (TL_phone.groupCall) tLObject3;
                                        np.s1(e1Var3.f11656e).Y3(groupcall2.users, false);
                                        np.s1(e1Var3.f11656e).S3(groupcall2.chats, false);
                                        e1Var3.f11661w = groupcall2.call;
                                        ns.f(e1Var3.f11656e).k(176, Long.valueOf(e1Var3.f11661w.f28061id));
                                    } else if (tL_error3 != null) {
                                        if ("GROUPCALL_JOIN_MISSING".equals(tL_error3.text)) {
                                            org.telegram.messenger.a8.b("[LivePlayer] received GROUPCALL_JOIN_MISSING on checkGroupCall => rejoining");
                                            org.telegram.messenger.g0.h3(new x0(e1Var3, 9));
                                        } else if ("GROUPCALL_INVALID".equalsIgnoreCase(tL_error3.text)) {
                                            org.telegram.messenger.g0.h3(new x0(e1Var3, 4));
                                        }
                                    }
                                    if (e1Var3.Q) {
                                        Runnable runnable2 = e1Var3.R;
                                        if (runnable2 != null) {
                                            org.telegram.messenger.g0.r(runnable2);
                                        }
                                        x0 x0Var2 = new x0(e1Var3, 10);
                                        e1Var3.R = x0Var2;
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
                boolean z10 = tLObject instanceof TLRPC.Updates;
                e1 e1Var2 = this.f12519b;
                if (z10) {
                    np.s1(e1Var2.f11656e).O3((TLRPC.Updates) tLObject, false);
                    return;
                } else {
                    e1Var2.getClass();
                    return;
                }
            case 2:
                e1 e1Var3 = this.f12519b;
                int i7 = e1Var3.f11656e;
                if (tLObject instanceof TL_phone.groupCall) {
                    TL_phone.groupCall groupcall = (TL_phone.groupCall) tLObject;
                    int i10 = 0;
                    np.s1(i7).Y3(groupcall.users, false);
                    np.s1(i7).S3(groupcall.chats, false);
                    if (e1Var3.F != null && !e1Var3.f11662x) {
                        while (true) {
                            if (i10 < groupcall.participants.size()) {
                                if (org.telegram.messenger.m5.o(groupcall.participants.get(i10).peer) == e1Var3.f11654b) {
                                    e1Var3.H = groupcall.participants.get(i10);
                                } else {
                                    i10++;
                                }
                            }
                        }
                        TLRPC.GroupCallParticipant groupCallParticipant = e1Var3.H;
                        if (groupCallParticipant != null && (tL_groupCallParticipantVideo = groupCallParticipant.video) != null) {
                            NativeInstance nativeInstance = e1Var3.F;
                            String str = tL_groupCallParticipantVideo.endpoint;
                            NativeInstance.SsrcGroup[] d = e1.d(tL_groupCallParticipantVideo);
                            e1Var3.r(d);
                            nativeInstance.addIncomingVideoOutput(2, str, d, e1Var3.I, org.telegram.messenger.m5.o(e1Var3.H.peer));
                            return;
                        }
                        org.telegram.messenger.g0.h3(new x0(e1Var3, 7));
                        return;
                    }
                    return;
                }
                return;
            case 3:
                final e1 e1Var4 = this.f12519b;
                org.telegram.messenger.g0.h3(new Runnable() {
                    @Override
                    public final void run() {
                        int i72;
                        switch (r4) {
                            case 0:
                                e1 e1Var22 = e1Var4;
                                TLObject tLObject2 = tLObject;
                                TLRPC.TL_error tL_error2 = tL_error;
                                int i102 = e1Var22.f11656e;
                                if (!e1Var22.f11662x) {
                                    if (tLObject2 instanceof TL_phone.groupCall) {
                                        TL_phone.groupCall groupcall2 = (TL_phone.groupCall) tLObject2;
                                        np.s1(i102).Y3(groupcall2.users, false);
                                        np.s1(i102).S3(groupcall2.chats, false);
                                        e1Var22.f11661w = groupcall2.call;
                                        ns.f(i102).k(176, Long.valueOf(e1Var22.f11661w.f28061id));
                                    } else if (tL_error2 != null && "GROUPCALL_INVALID".equalsIgnoreCase(tL_error2.text)) {
                                        org.telegram.messenger.g0.h3(new x0(e1Var22, 4));
                                    }
                                    if (e1Var22.Q) {
                                        Runnable runnable = e1Var22.S;
                                        if (runnable != null) {
                                            org.telegram.messenger.g0.r(runnable);
                                        }
                                        x0 x0Var = new x0(e1Var22, 11);
                                        e1Var22.S = x0Var;
                                        if (e1Var22.l()) {
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
                                e1 e1Var32 = e1Var4;
                                TLObject tLObject3 = tLObject;
                                TLRPC.TL_error tL_error3 = tL_error;
                                if (!e1Var32.f11662x) {
                                    if (tLObject3 instanceof Vector) {
                                        if (!((Vector) tLObject3).toIntArray().contains(Integer.valueOf(e1Var32.L))) {
                                            if (e1Var32.F != null) {
                                                org.telegram.messenger.p5 p5Var = Utilities.f22416e;
                                                NativeInstance nativeInstance2 = e1Var32.F;
                                                Objects.requireNonNull(nativeInstance2);
                                                p5Var.c(new org.telegram.messenger.voip.q0(nativeInstance2, 3));
                                                e1Var32.N.clear();
                                                e1Var32.F = null;
                                            }
                                            e1Var32.k();
                                        }
                                    } else if (tLObject3 instanceof TL_phone.groupCall) {
                                        TL_phone.groupCall groupcall22 = (TL_phone.groupCall) tLObject3;
                                        np.s1(e1Var32.f11656e).Y3(groupcall22.users, false);
                                        np.s1(e1Var32.f11656e).S3(groupcall22.chats, false);
                                        e1Var32.f11661w = groupcall22.call;
                                        ns.f(e1Var32.f11656e).k(176, Long.valueOf(e1Var32.f11661w.f28061id));
                                    } else if (tL_error3 != null) {
                                        if ("GROUPCALL_JOIN_MISSING".equals(tL_error3.text)) {
                                            org.telegram.messenger.a8.b("[LivePlayer] received GROUPCALL_JOIN_MISSING on checkGroupCall => rejoining");
                                            org.telegram.messenger.g0.h3(new x0(e1Var32, 9));
                                        } else if ("GROUPCALL_INVALID".equalsIgnoreCase(tL_error3.text)) {
                                            org.telegram.messenger.g0.h3(new x0(e1Var32, 4));
                                        }
                                    }
                                    if (e1Var32.Q) {
                                        Runnable runnable2 = e1Var32.R;
                                        if (runnable2 != null) {
                                            org.telegram.messenger.g0.r(runnable2);
                                        }
                                        x0 x0Var2 = new x0(e1Var32, 10);
                                        e1Var32.R = x0Var2;
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
                e1 e1Var5 = this.f12519b;
                int i11 = e1Var5.f11656e;
                if (tLObject instanceof TLRPC.Updates) {
                    TLRPC.Updates updates = (TLRPC.Updates) tLObject;
                    np.s1(i11).Y3(updates.users, false);
                    np.s1(i11).S3(updates.chats, false);
                    np.s1(i11).O3(updates, false);
                    return;
                } else if (tL_error != null && "GROUPCALL_ALREADY_DISCARDED".equalsIgnoreCase(tL_error.text)) {
                    org.telegram.messenger.g0.h3(new x0(e1Var5, 4));
                    return;
                } else {
                    return;
                }
            default:
                boolean z11 = tLObject instanceof TLRPC.Updates;
                e1 e1Var6 = this.f12519b;
                if (z11) {
                    np.s1(e1Var6.f11656e).O3((TLRPC.Updates) tLObject, false);
                    return;
                } else {
                    e1Var6.getClass();
                    return;
                }
        }
    }
}
