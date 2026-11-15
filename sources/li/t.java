package li;

import a8.p0;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import java.io.Serializable;
import org.telegram.messenger.hd;
import org.telegram.messenger.k5;
import org.telegram.messenger.np;
import org.telegram.messenger.q10;
import org.telegram.messenger.t3;
import org.telegram.messenger.ur;
import org.telegram.messenger.x10;
import org.telegram.messenger.y10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e2;
import org.telegram.ui.Cells.p8;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.e70;
import org.telegram.ui.Components.m60;
import org.telegram.ui.an;
import org.telegram.ui.u91;
import r0.h1;
import r0.k1;
public final class t implements x10, r0.m, y10 {
    public final int f19636a;
    public final d0 f19637b;

    public t(d0 d0Var, int i7) {
        this.f19636a = i7;
        this.f19637b = d0Var;
    }

    @Override
    public k1 M0(View view, k1 k1Var) {
        h1 h1Var = k1Var.f55682a;
        i0.c f10 = h1Var.f(527);
        d0 d0Var = this.f19637b;
        d0Var.O1 = f10;
        d0Var.P1 = h1Var.f(519);
        d0Var.A1.j(org.telegram.messenger.g0.L(56.0f) + d0Var.O1.f15575b, d0Var.O1.d, false);
        d0Var.C1.invalidate();
        return k1.f55681b;
    }

    @Override
    public Boolean a(b41 b41Var, View view, Integer num, Float f10, Float f11) {
        boolean z10;
        long j3;
        boolean z11;
        boolean z12;
        int i7 = d0.Q1;
        Object obj = b41Var.G;
        boolean z13 = obj instanceof TLRPC.Chat;
        d0 d0Var = this.f19637b;
        boolean z14 = true;
        if (z13) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            long j10 = -chat.f28051id;
            boolean V = t3.V(chat);
            TLRPC.Chat chat2 = d0Var.f19543q1;
            if (chat2 != null && (chat.creator || t3.y(27, chat2))) {
                z10 = true;
            } else {
                z10 = false;
            }
            j3 = j10;
            z12 = V;
            z11 = false;
        } else {
            if (obj instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) obj;
                long j11 = user.f28200id;
                boolean t6 = q10.t(user);
                TLRPC.Chat chat3 = d0Var.f19543q1;
                if (chat3 != null && ((user.bot && user.bot_can_edit) || t3.y(27, chat3))) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                j3 = j11;
                z11 = t6;
                z12 = false;
            }
            z14 = false;
            return Boolean.valueOf(z14);
        }
        if (z10) {
            m60 F = m60.F(d0Var.f29685c, null, view);
            F.c(2131232088, hd.M0(2131751915, null), new k(d0Var, z11, z12, j3, 1), true);
            F.W(d0Var.f19548v1.d.U0(view, true));
            F.Z();
            return Boolean.valueOf(z14);
        }
        z14 = false;
        return Boolean.valueOf(z14);
    }

    @Override
    public void m(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        long j3;
        TLRPC.Chat chat;
        int i7;
        int i10 = this.f19636a;
        d0 d0Var = this.f19637b;
        switch (i10) {
            case 0:
                View view = (View) obj2;
                Integer num = (Integer) number;
                Float f10 = (Float) serializable;
                Float f11 = (Float) serializable2;
                d0Var.L0((b41) obj);
                return;
            case 1:
            default:
                View view2 = (View) obj2;
                Integer num2 = (Integer) number;
                Float f12 = (Float) serializable;
                Float f13 = (Float) serializable2;
                int i11 = d0.Q1;
                d0Var.I0((b41) obj);
                return;
            case 2:
                View view3 = (View) obj2;
                Integer num3 = (Integer) number;
                Float f14 = (Float) serializable;
                Float f15 = (Float) serializable2;
                int i12 = d0.Q1;
                d0Var.L0((b41) obj);
                return;
            case 3:
                b41 b41Var = (b41) obj;
                View view4 = (View) obj2;
                Integer num4 = (Integer) number;
                Float f16 = (Float) serializable;
                Float f17 = (Float) serializable2;
                e2 e2Var = d0Var.f19547u1;
                if (!d0Var.I0(b41Var)) {
                    int i13 = b41Var.d;
                    boolean z10 = false;
                    if (i13 == 101) {
                        d0Var.f19544r1 = !d0Var.f19544r1;
                        np.s1(d0Var.f29679a).f5(d0Var.f19542p1, d0Var.f19544r1);
                        if (view4 instanceof p8) {
                            ((p8) view4).getCheckBox().c(d0Var.f19544r1, true);
                            return;
                        } else {
                            d0Var.f19548v1.d.f39895g3.O(false);
                            return;
                        }
                    } else if (i13 == 100) {
                        d0Var.f19541o1.C(1);
                        d0Var.H1.e();
                        return;
                    } else {
                        Object obj3 = b41Var.G;
                        if (obj3 instanceof TLRPC.Chat) {
                            TLRPC.Chat chat2 = (TLRPC.Chat) obj3;
                            z10 = t3.V(chat2);
                            j3 = -chat2.f28051id;
                            chat = chat2;
                        } else if (obj3 instanceof TLRPC.User) {
                            j3 = ((TLRPC.User) obj3).f28200id;
                            chat = null;
                        } else {
                            return;
                        }
                        int b10 = l0.b(d0Var.f29679a, j3);
                        if (b10 != 1 && b10 != 2) {
                            if (b10 == 3) {
                                e70 e70Var = new e70(d0Var.getContext(), chat, null, d0Var.f19547u1, d0Var.J0);
                                e70Var.f34248t1 = new cc((FrameLayout) d0Var.f29682b, d0Var.J0);
                                e70Var.show();
                                return;
                            } else if (b10 == 4) {
                                cc ccVar = new cc((FrameLayout) d0Var.f29682b, d0Var.J0);
                                if (z10) {
                                    i7 = 2131751930;
                                } else {
                                    i7 = 2131751927;
                                }
                                k5.n(null, i7, ccVar, 2131624007, 36);
                                return;
                            } else {
                                return;
                            }
                        }
                        if (e2Var instanceof an) {
                            an anVar = (an) e2Var;
                            TLRPC.Chat chat3 = anVar.f45173e;
                            TLRPC.User j10 = anVar.j();
                            if ((chat3 != null && chat3.f28051id == (-j3)) || (j10 != null && j10.f28200id == j3)) {
                                d0Var.dismiss();
                                return;
                            }
                        }
                        Bundle bundle = new Bundle();
                        if (j3 > 0) {
                            bundle.putLong("user_id", j3);
                        } else {
                            bundle.putLong("chat_id", -j3);
                        }
                        if (t3.c0(chat)) {
                            if (t3.a(chat)) {
                                an anVar2 = new an(bundle);
                                qg.c.a(anVar2, ur.a(j3, np.s1(d0Var.f29679a).f25280f7.getLong(p0.o(chat.f28051id, "forumlasttopic"), 1L)));
                                e2Var.presentFragment(anVar2);
                            } else {
                                e2Var.presentFragment(new u91(bundle));
                            }
                        } else {
                            e2Var.presentFragment(new an(bundle));
                        }
                        d0Var.dismiss();
                        return;
                    }
                }
                return;
        }
    }
}
