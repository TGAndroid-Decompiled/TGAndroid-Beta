package li;

import a8.p0;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import java.io.Serializable;
import org.telegram.messenger.f3;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.n10;
import org.telegram.messenger.sr;
import org.telegram.messenger.u10;
import org.telegram.messenger.v10;
import org.telegram.messenger.v3;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.g2;
import org.telegram.ui.Cells.q8;
import org.telegram.ui.Components.kc;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.o70;
import org.telegram.ui.Components.x60;
import org.telegram.ui.bn;
import org.telegram.ui.w91;
import r0.i1;
import r0.l1;
public final class t implements u10, r0.m, v10 {
    public final int f20097a;
    public final c0 f20098b;

    public t(c0 c0Var, int i7) {
        this.f20097a = i7;
        this.f20098b = c0Var;
    }

    @Override
    public Boolean a(n41 n41Var, View view, Integer num, Float f10, Float f11) {
        boolean z10;
        long j3;
        boolean z11;
        boolean z12;
        int i7 = c0.Q1;
        Object obj = n41Var.H;
        boolean z13 = obj instanceof TLRPC.Chat;
        c0 c0Var = this.f20098b;
        boolean z14 = true;
        if (z13) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            long j10 = -chat.f28492id;
            boolean V = v3.V(chat);
            TLRPC.Chat chat2 = c0Var.f19998q1;
            if (chat2 != null && (chat.creator || v3.y(27, chat2))) {
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
                long j11 = user.f28641id;
                boolean u10 = n10.u(user);
                TLRPC.Chat chat3 = c0Var.f19998q1;
                if (chat3 != null && ((user.bot && user.bot_can_edit) || v3.y(27, chat3))) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                j3 = j11;
                z11 = u10;
                z12 = false;
            }
            z14 = false;
            return Boolean.valueOf(z14);
        }
        if (z10) {
            x60 G = x60.G(c0Var.f30229c, null, view);
            G.c(2131232092, gd.N0(2131751903, null), new l(c0Var, z11, z12, j3, 1), true);
            G.X(c0Var.f20003v1.d.U0(view, true));
            G.a0();
            return Boolean.valueOf(z14);
        }
        z14 = false;
        return Boolean.valueOf(z14);
    }

    @Override
    public void k(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        long j3;
        TLRPC.Chat chat;
        int i7;
        int i10 = this.f20097a;
        c0 c0Var = this.f20098b;
        switch (i10) {
            case 0:
                View view = (View) obj2;
                Integer num = (Integer) number;
                Float f10 = (Float) serializable;
                Float f11 = (Float) serializable2;
                c0Var.M0((n41) obj);
                return;
            case 1:
            default:
                View view2 = (View) obj2;
                Integer num2 = (Integer) number;
                Float f12 = (Float) serializable;
                Float f13 = (Float) serializable2;
                int i11 = c0.Q1;
                c0Var.J0((n41) obj);
                return;
            case 2:
                View view3 = (View) obj2;
                Integer num3 = (Integer) number;
                Float f14 = (Float) serializable;
                Float f15 = (Float) serializable2;
                int i12 = c0.Q1;
                c0Var.M0((n41) obj);
                return;
            case 3:
                n41 n41Var = (n41) obj;
                View view4 = (View) obj2;
                Integer num4 = (Integer) number;
                Float f16 = (Float) serializable;
                Float f17 = (Float) serializable2;
                g2 g2Var = c0Var.f20002u1;
                if (!c0Var.J0(n41Var)) {
                    int i13 = n41Var.d;
                    boolean z10 = false;
                    if (i13 == 101) {
                        c0Var.f19999r1 = !c0Var.f19999r1;
                        mp.u1(c0Var.f30223a).q5(c0Var.f19997p1, c0Var.f19999r1);
                        if (view4 instanceof q8) {
                            ((q8) view4).getCheckBox().c(c0Var.f19999r1, true);
                            return;
                        } else {
                            c0Var.f20003v1.d.f35323g3.O(false);
                            return;
                        }
                    } else if (i13 == 100) {
                        c0Var.f19996o1.C(1);
                        c0Var.H1.e();
                        return;
                    } else {
                        Object obj3 = n41Var.H;
                        if (obj3 instanceof TLRPC.Chat) {
                            TLRPC.Chat chat2 = (TLRPC.Chat) obj3;
                            z10 = v3.V(chat2);
                            j3 = -chat2.f28492id;
                            chat = chat2;
                        } else if (obj3 instanceof TLRPC.User) {
                            j3 = ((TLRPC.User) obj3).f28641id;
                            chat = null;
                        } else {
                            return;
                        }
                        int b10 = k0.b(c0Var.f30223a, j3);
                        if (b10 != 1 && b10 != 2) {
                            if (b10 == 3) {
                                o70 o70Var = new o70(c0Var.getContext(), chat, null, c0Var.f20002u1, c0Var.J0);
                                o70Var.f38058t1 = new kc((FrameLayout) c0Var.f30226b, c0Var.J0);
                                o70Var.show();
                                return;
                            } else if (b10 == 4) {
                                kc kcVar = new kc((FrameLayout) c0Var.f30226b, c0Var.J0);
                                if (z10) {
                                    i7 = 2131751918;
                                } else {
                                    i7 = 2131751915;
                                }
                                f3.n(null, i7, kcVar, 2131624007, 36);
                                return;
                            } else {
                                return;
                            }
                        }
                        if (g2Var instanceof bn) {
                            bn bnVar = (bn) g2Var;
                            TLRPC.Chat chat3 = bnVar.f46173e;
                            TLRPC.User j10 = bnVar.j();
                            if ((chat3 != null && chat3.f28492id == (-j3)) || (j10 != null && j10.f28641id == j3)) {
                                c0Var.dismiss();
                                return;
                            }
                        }
                        Bundle bundle = new Bundle();
                        if (j3 > 0) {
                            bundle.putLong("user_id", j3);
                        } else {
                            bundle.putLong("chat_id", -j3);
                        }
                        if (v3.c0(chat)) {
                            if (v3.a(chat)) {
                                bn bnVar2 = new bn(bundle);
                                qg.c.a(bnVar2, sr.a(j3, mp.u1(c0Var.f30223a).h7.getLong(p0.o(chat.f28492id, "forumlasttopic"), 1L)));
                                g2Var.presentFragment(bnVar2);
                            } else {
                                g2Var.presentFragment(new w91(bundle));
                            }
                        } else {
                            g2Var.presentFragment(new bn(bundle));
                        }
                        c0Var.dismiss();
                        return;
                    }
                }
                return;
        }
    }

    @Override
    public l1 l1(View view, l1 l1Var) {
        i1 i1Var = l1Var.f56381a;
        i0.b f10 = i1Var.f(527);
        c0 c0Var = this.f20098b;
        c0Var.O1 = f10;
        c0Var.P1 = i1Var.f(519);
        c0Var.A1.j(org.telegram.messenger.g0.L(56.0f) + c0Var.O1.f15979b, c0Var.O1.d, false);
        c0Var.C1.invalidate();
        return l1.f56380b;
    }
}
