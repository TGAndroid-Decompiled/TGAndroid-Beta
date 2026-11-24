package defpackage;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import java.io.Serializable;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
public final class ep2 implements oac, qq7, pac {
    public final byte a;
    public final pp2 b;

    public ep2(pp2 pp2Var, byte b) {
        this.a = b;
        this.b = pp2Var;
    }

    @Override
    public final wzc C0(View view, wzc wzcVar) {
        tzc tzcVar = wzcVar.a;
        iq5 f = tzcVar.f(527);
        pp2 pp2Var = this.b;
        pp2Var.N1 = f;
        pp2Var.O1 = tzcVar.f(519);
        pp2Var.z1.j(gm.L(56.0f) + pp2Var.N1.b, pp2Var.N1.d, false);
        pp2Var.B1.invalidate();
        return wzc.b;
    }

    @Override
    public final Object b(c6c c6cVar, View view, Integer num, Float f, Float f2) {
        boolean z;
        long j;
        boolean z2;
        boolean z3;
        int i = pp2.P1;
        Object obj = c6cVar.H;
        boolean z4 = obj instanceof TLRPC.Chat;
        pp2 pp2Var = this.b;
        boolean z5 = true;
        if (z4) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            long j2 = -chat.id;
            boolean V = sd2.V(chat);
            TLRPC.Chat chat2 = pp2Var.p1;
            if (chat2 != null && (chat.creator || sd2.y(27, chat2))) {
                z = true;
            } else {
                z = false;
            }
            j = j2;
            z3 = V;
            z2 = false;
        } else {
            if (obj instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) obj;
                long j3 = user.id;
                boolean v = m9c.v(user);
                TLRPC.Chat chat3 = pp2Var.p1;
                if (chat3 != null && ((user.bot && user.bot_can_edit) || sd2.y(27, chat3))) {
                    z = true;
                } else {
                    z = false;
                }
                j = j3;
                z2 = v;
                z3 = false;
            }
            z5 = false;
            return Boolean.valueOf(z5);
        }
        if (z) {
            bu5 G = bu5.G(pp2Var.c, null, view);
            G.b(2131232093, jb6.M0(2131751852, null), new yp1(pp2Var, z2, z3, j, (byte) 2), true);
            G.X(pp2Var.u1.d.V0(view, true));
            G.a0();
            return Boolean.valueOf(z5);
        }
        z5 = false;
        return Boolean.valueOf(z5);
    }

    @Override
    public final void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        long j;
        TLRPC.Chat chat;
        int i;
        byte b = this.a;
        pp2 pp2Var = this.b;
        c6c c6cVar = (c6c) obj;
        View view = (View) obj2;
        Integer num = (Integer) number;
        Float f = (Float) serializable;
        Float f2 = (Float) serializable2;
        switch (b) {
            case 0:
                pp2Var.G0(c6cVar);
                return;
            case 1:
            default:
                int i2 = pp2.P1;
                pp2Var.D0(c6cVar);
                return;
            case 2:
                int i3 = pp2.P1;
                pp2Var.G0(c6cVar);
                return;
            case 3:
                int i4 = pp2.P1;
                d dVar = pp2Var.t1;
                if (!pp2Var.D0(c6cVar)) {
                    int i5 = c6cVar.d;
                    boolean z = false;
                    if (i5 == 101) {
                        pp2Var.q1 = !pp2Var.q1;
                        oc7.r1(pp2Var.a).m5(pp2Var.o1, pp2Var.q1);
                        if (view instanceof ajb) {
                            ((ajb) view).getCheckBox().c(pp2Var.q1, true);
                            return;
                        } else {
                            pp2Var.u1.d.g3.O(false);
                            return;
                        }
                    } else if (i5 == 100) {
                        pp2Var.n1.E(1);
                        pp2Var.G1.e();
                        return;
                    } else {
                        Object obj3 = c6cVar.H;
                        if (obj3 instanceof TLRPC.Chat) {
                            TLRPC.Chat chat2 = (TLRPC.Chat) obj3;
                            z = sd2.V(chat2);
                            j = -chat2.id;
                            chat = chat2;
                        } else if (obj3 instanceof TLRPC.User) {
                            j = ((TLRPC.User) obj3).id;
                            chat = null;
                        } else {
                            return;
                        }
                        int b2 = yp2.b(pp2Var.a, j);
                        if (b2 != 1 && b2 != 2) {
                            if (b2 == 3) {
                                ew5 ew5Var = new ew5(pp2Var.getContext(), chat, null, pp2Var.t1, pp2Var.J0);
                                ew5Var.s1 = new c41((FrameLayout) pp2Var.b, pp2Var.J0);
                                ew5Var.show();
                                return;
                            } else if (b2 == 4) {
                                c41 c41Var = new c41((FrameLayout) pp2Var.b, pp2Var.J0);
                                if (z) {
                                    i = 2131751867;
                                } else {
                                    i = 2131751864;
                                }
                                ts2.u(null, i, c41Var, 2131624007, 36);
                                return;
                            } else {
                                return;
                            }
                        }
                        if (dVar instanceof yv1) {
                            yv1 yv1Var = (yv1) dVar;
                            TLRPC.Chat chat3 = yv1Var.e;
                            TLRPC.User h = yv1Var.h();
                            if ((chat3 != null && chat3.id == (-j)) || (h != null && h.id == j)) {
                                pp2Var.dismiss();
                                return;
                            }
                        }
                        Bundle bundle = new Bundle();
                        if (j > 0) {
                            bundle.putLong("user_id", j);
                        } else {
                            bundle.putLong("chat_id", -j);
                        }
                        if (sd2.c0(chat)) {
                            if (sd2.a(chat)) {
                                yv1 yv1Var2 = new yv1(bundle);
                                no4.a(yv1Var2, bf7.a(j, oc7.r1(pp2Var.a).X3.getLong(kt6.n(chat.id, "forumlasttopic"), 1L)));
                                dVar.presentFragment(yv1Var2);
                            } else {
                                dVar.presentFragment(new sxb(bundle));
                            }
                        } else {
                            dVar.presentFragment(new yv1(bundle));
                        }
                        pp2Var.dismiss();
                        return;
                    }
                }
                return;
        }
    }
}
