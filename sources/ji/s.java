package ji;

import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import java.io.Serializable;
import org.telegram.messenger.bd;
import org.telegram.messenger.hp;
import org.telegram.messenger.k5;
import org.telegram.messenger.l10;
import org.telegram.messenger.pr;
import org.telegram.messenger.s10;
import org.telegram.messenger.t10;
import org.telegram.messenger.t3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d2;
import org.telegram.ui.Cells.p8;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.x60;
import org.telegram.ui.m91;
import org.telegram.ui.wm;
import r0.h1;
import r0.k1;
public final class s implements s10, r0.m, t10 {
    public final int f16368a;
    public final b0 f16369b;

    public s(b0 b0Var, int i3) {
        this.f16368a = i3;
        this.f16369b = b0Var;
    }

    @Override
    public k1 R0(View view, k1 k1Var) {
        h1 h1Var = k1Var.f54026a;
        i0.b f10 = h1Var.f(527);
        b0 b0Var = this.f16369b;
        b0Var.L1 = f10;
        b0Var.M1 = h1Var.f(519);
        b0Var.f16276x1.j(org.telegram.messenger.g0.L(56.0f) + b0Var.L1.f14496b, b0Var.L1.d, false);
        b0Var.f16278z1.invalidate();
        return k1.f54025b;
    }

    @Override
    public Boolean a(r31 r31Var, View view, Integer num, Float f10, Float f11) {
        boolean z10;
        long j10;
        boolean z11;
        boolean z12;
        int i3 = b0.N1;
        Object obj = r31Var.G;
        boolean z13 = obj instanceof TLRPC.Chat;
        b0 b0Var = this.f16369b;
        boolean z14 = true;
        if (z13) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            long j11 = -chat.f27001id;
            boolean V = t3.V(chat);
            TLRPC.Chat chat2 = b0Var.f16266n1;
            if (chat2 != null && (chat.creator || t3.y(27, chat2))) {
                z10 = true;
            } else {
                z10 = false;
            }
            j10 = j11;
            z12 = V;
            z11 = false;
        } else {
            if (obj instanceof TLRPC.User) {
                TLRPC.User user = (TLRPC.User) obj;
                long j12 = user.f27150id;
                boolean t10 = l10.t(user);
                TLRPC.Chat chat3 = b0Var.f16266n1;
                if (chat3 != null && ((user.bot && user.bot_can_edit) || t3.y(27, chat3))) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                j10 = j12;
                z11 = t10;
                z12 = false;
            }
            z14 = false;
            return Boolean.valueOf(z14);
        }
        if (z10) {
            f60 F = f60.F(b0Var.f28589c, null, view);
            F.c(2131232087, bd.M0(2131751915, null), new k(b0Var, z11, z12, j10, 1), true);
            F.W(b0Var.f16271s1.d.U0(view, true));
            F.Z();
            return Boolean.valueOf(z14);
        }
        z14 = false;
        return Boolean.valueOf(z14);
    }

    @Override
    public void j(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        long j10;
        TLRPC.Chat chat;
        int i3;
        int i10 = this.f16368a;
        b0 b0Var = this.f16369b;
        switch (i10) {
            case 0:
                View view = (View) obj2;
                Integer num = (Integer) number;
                Float f10 = (Float) serializable;
                Float f11 = (Float) serializable2;
                b0Var.L0((r31) obj);
                return;
            case 1:
            default:
                View view2 = (View) obj2;
                Integer num2 = (Integer) number;
                Float f12 = (Float) serializable;
                Float f13 = (Float) serializable2;
                int i11 = b0.N1;
                b0Var.I0((r31) obj);
                return;
            case 2:
                View view3 = (View) obj2;
                Integer num3 = (Integer) number;
                Float f14 = (Float) serializable;
                Float f15 = (Float) serializable2;
                int i12 = b0.N1;
                b0Var.L0((r31) obj);
                return;
            case 3:
                r31 r31Var = (r31) obj;
                View view4 = (View) obj2;
                Integer num4 = (Integer) number;
                Float f16 = (Float) serializable;
                Float f17 = (Float) serializable2;
                d2 d2Var = b0Var.f16270r1;
                if (!b0Var.I0(r31Var)) {
                    int i13 = r31Var.d;
                    boolean z10 = false;
                    if (i13 == 101) {
                        b0Var.f16267o1 = !b0Var.f16267o1;
                        hp.s1(b0Var.f28583a).e5(b0Var.m1, b0Var.f16267o1);
                        if (view4 instanceof p8) {
                            ((p8) view4).getCheckBox().c(b0Var.f16267o1, true);
                            return;
                        } else {
                            b0Var.f16271s1.d.f35594g3.O(false);
                            return;
                        }
                    } else if (i13 == 100) {
                        b0Var.f16265l1.D(1);
                        b0Var.E1.e();
                        return;
                    } else {
                        Object obj3 = r31Var.G;
                        if (obj3 instanceof TLRPC.Chat) {
                            TLRPC.Chat chat2 = (TLRPC.Chat) obj3;
                            z10 = t3.V(chat2);
                            j10 = -chat2.f27001id;
                            chat = chat2;
                        } else if (obj3 instanceof TLRPC.User) {
                            j10 = ((TLRPC.User) obj3).f27150id;
                            chat = null;
                        } else {
                            return;
                        }
                        int b10 = j0.b(b0Var.f28583a, j10);
                        if (b10 != 1 && b10 != 2) {
                            if (b10 == 3) {
                                x60 x60Var = new x60(b0Var.getContext(), chat, null, b0Var.f16270r1, b0Var.J0);
                                x60Var.f40252q1 = new fc((FrameLayout) b0Var.f28586b, b0Var.J0);
                                x60Var.show();
                                return;
                            } else if (b10 == 4) {
                                fc fcVar = new fc((FrameLayout) b0Var.f28586b, b0Var.J0);
                                if (z10) {
                                    i3 = 2131751930;
                                } else {
                                    i3 = 2131751927;
                                }
                                k5.o(null, i3, fcVar, 2131624006, 36);
                                return;
                            } else {
                                return;
                            }
                        }
                        if (d2Var instanceof wm) {
                            wm wmVar = (wm) d2Var;
                            TLRPC.Chat chat3 = wmVar.f51292e;
                            TLRPC.User j11 = wmVar.j();
                            if ((chat3 != null && chat3.f27001id == (-j10)) || (j11 != null && j11.f27150id == j10)) {
                                b0Var.dismiss();
                                return;
                            }
                        }
                        Bundle bundle = new Bundle();
                        if (j10 > 0) {
                            bundle.putLong("user_id", j10);
                        } else {
                            bundle.putLong("chat_id", -j10);
                        }
                        if (t3.c0(chat)) {
                            if (t3.a(chat)) {
                                wm wmVar2 = new wm(bundle);
                                rg.c.a(wmVar2, pr.a(j10, hp.s1(b0Var.f28583a).f22999e7.getLong(a1.g.p(chat.f27001id, "forumlasttopic"), 1L)));
                                d2Var.presentFragment(wmVar2);
                            } else {
                                d2Var.presentFragment(new m91(bundle));
                            }
                        } else {
                            d2Var.presentFragment(new wm(bundle));
                        }
                        b0Var.dismiss();
                        return;
                    }
                }
                return;
        }
    }
}
