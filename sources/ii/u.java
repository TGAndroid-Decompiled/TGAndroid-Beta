package ii;

import a8.p0;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import java.io.Serializable;
import org.telegram.messenger.a20;
import org.telegram.messenger.b20;
import org.telegram.messenger.hd;
import org.telegram.messenger.k5;
import org.telegram.messenger.qp;
import org.telegram.messenger.t10;
import org.telegram.messenger.t3;
import org.telegram.messenger.xr;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f2;
import org.telegram.ui.Cells.q8;
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.r31;
import org.telegram.ui.an;
import org.telegram.ui.v91;
import r0.h1;
import r0.k1;
public final class u implements a20, r0.m, b20 {
    public final int f15606a;
    public final d0 f15607b;

    public u(d0 d0Var, int i7) {
        this.f15606a = i7;
        this.f15607b = d0Var;
    }

    @Override
    public k1 S0(View view, k1 k1Var) {
        h1 h1Var = k1Var.f54084a;
        i0.b f10 = h1Var.f(527);
        d0 d0Var = this.f15607b;
        d0Var.K1 = f10;
        d0Var.L1 = h1Var.f(519);
        d0Var.f15512w1.j(org.telegram.messenger.g0.L(56.0f) + d0Var.K1.f15118b, d0Var.K1.d, false);
        d0Var.f15514y1.invalidate();
        return k1.f54083b;
    }

    @Override
    public Boolean a(r31 r31Var, View view, Integer num, Float f10, Float f11) {
        boolean z9;
        long j3;
        boolean z10;
        boolean z11;
        int i7 = d0.M1;
        Object obj = r31Var.G;
        boolean z12 = obj instanceof TLRPC.Chat;
        d0 d0Var = this.f15607b;
        boolean z13 = true;
        if (z12) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            long j10 = -chat.f26952id;
            boolean V = t3.V(chat);
            TLRPC.Chat chat2 = d0Var.f15503m1;
            if (chat2 != null && (chat.creator || t3.y(27, chat2))) {
                z9 = true;
            } else {
                z9 = false;
            }
            j3 = j10;
            z11 = V;
            z10 = false;
        } else {
            if (obj instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) obj;
                long j11 = user.f27101id;
                boolean t6 = t10.t(user);
                TLRPC.Chat chat3 = d0Var.f15503m1;
                if (chat3 != null && ((user.bot && user.bot_can_edit) || t3.y(27, chat3))) {
                    z9 = true;
                } else {
                    z9 = false;
                }
                j3 = j11;
                z10 = t6;
                z11 = false;
            }
            z13 = false;
            return Boolean.valueOf(z13);
        }
        if (z9) {
            k60 F = k60.F(d0Var.f28618c, null, view);
            F.c(2131232087, hd.M0(2131751915, null), new m(d0Var, z10, z11, j3, 1), true);
            F.W(d0Var.f15507r1.d.U0(view, true));
            F.Z();
            return Boolean.valueOf(z13);
        }
        z13 = false;
        return Boolean.valueOf(z13);
    }

    @Override
    public void i(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        long j3;
        TLRPC.Chat chat;
        int i7;
        int i10 = this.f15606a;
        d0 d0Var = this.f15607b;
        switch (i10) {
            case 0:
                View view = (View) obj2;
                Integer num = (Integer) number;
                Float f10 = (Float) serializable;
                Float f11 = (Float) serializable2;
                d0Var.L0((r31) obj);
                return;
            case 1:
            default:
                View view2 = (View) obj2;
                Integer num2 = (Integer) number;
                Float f12 = (Float) serializable;
                Float f13 = (Float) serializable2;
                int i11 = d0.M1;
                d0Var.I0((r31) obj);
                return;
            case 2:
                View view3 = (View) obj2;
                Integer num3 = (Integer) number;
                Float f14 = (Float) serializable;
                Float f15 = (Float) serializable2;
                int i12 = d0.M1;
                d0Var.L0((r31) obj);
                return;
            case 3:
                r31 r31Var = (r31) obj;
                View view4 = (View) obj2;
                Integer num4 = (Integer) number;
                Float f16 = (Float) serializable;
                Float f17 = (Float) serializable2;
                f2 f2Var = d0Var.f15506q1;
                if (!d0Var.I0(r31Var)) {
                    int i13 = r31Var.d;
                    boolean z9 = false;
                    if (i13 == 101) {
                        d0Var.n1 = !d0Var.n1;
                        qp.s1(d0Var.f28612a).e5(d0Var.l1, d0Var.n1);
                        if (view4 instanceof q8) {
                            ((q8) view4).getCheckBox().c(d0Var.n1, true);
                            return;
                        } else {
                            d0Var.f15507r1.d.f35167f3.O(false);
                            return;
                        }
                    } else if (i13 == 100) {
                        d0Var.f15502k1.E(1);
                        d0Var.D1.e();
                        return;
                    } else {
                        Object obj3 = r31Var.G;
                        if (obj3 instanceof TLRPC.Chat) {
                            TLRPC.Chat chat2 = (TLRPC.Chat) obj3;
                            z9 = t3.V(chat2);
                            j3 = -chat2.f26952id;
                            chat = chat2;
                        } else if (obj3 instanceof TLRPC.User) {
                            j3 = ((TLRPC.User) obj3).f27101id;
                            chat = null;
                        } else {
                            return;
                        }
                        int b10 = m0.b(d0Var.f28612a, j3);
                        if (b10 != 1 && b10 != 2) {
                            if (b10 == 3) {
                                b70 b70Var = new b70(d0Var.getContext(), chat, null, d0Var.f15506q1, d0Var.I0);
                                b70Var.f32022p1 = new hc((FrameLayout) d0Var.f28615b, d0Var.I0);
                                b70Var.show();
                                return;
                            } else if (b10 == 4) {
                                hc hcVar = new hc((FrameLayout) d0Var.f28615b, d0Var.I0);
                                if (z9) {
                                    i7 = 2131751930;
                                } else {
                                    i7 = 2131751927;
                                }
                                k5.o(null, i7, hcVar, 2131624006, 36);
                                return;
                            } else {
                                return;
                            }
                        }
                        if (f2Var instanceof an) {
                            an anVar = (an) f2Var;
                            TLRPC.Chat chat3 = anVar.f43747e;
                            TLRPC.User j10 = anVar.j();
                            if ((chat3 != null && chat3.f26952id == (-j3)) || (j10 != null && j10.f27101id == j3)) {
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
                                qg.d.a(anVar2, xr.a(j3, qp.s1(d0Var.f28612a).f24759e7.getLong(p0.o(chat.f26952id, "forumlasttopic"), 1L)));
                                f2Var.presentFragment(anVar2);
                            } else {
                                f2Var.presentFragment(new v91(bundle));
                            }
                        } else {
                            f2Var.presentFragment(new an(bundle));
                        }
                        d0Var.dismiss();
                        return;
                    }
                }
                return;
        }
    }
}
