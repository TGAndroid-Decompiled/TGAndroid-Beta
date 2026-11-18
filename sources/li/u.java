package li;

import a8.p0;
import android.os.Bundle;
import android.view.View;
import android.widget.FrameLayout;
import java.io.Serializable;
import org.telegram.messenger.f3;
import org.telegram.messenger.gd;
import org.telegram.messenger.mp;
import org.telegram.messenger.o10;
import org.telegram.messenger.sr;
import org.telegram.messenger.v10;
import org.telegram.messenger.v3;
import org.telegram.messenger.w10;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.h2;
import org.telegram.ui.Cells.q8;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.lc;
import org.telegram.ui.Components.p70;
import org.telegram.ui.Components.y60;
import org.telegram.ui.bn;
import org.telegram.ui.y91;
import r0.i1;
import r0.l1;
public final class u implements v10, r0.m, w10 {
    public final int f20006a;
    public final d0 f20007b;

    public u(d0 d0Var, int i7) {
        this.f20006a = i7;
        this.f20007b = d0Var;
    }

    @Override
    public l1 P0(View view, l1 l1Var) {
        i1 i1Var = l1Var.f56258a;
        i0.b f10 = i1Var.f(527);
        d0 d0Var = this.f20007b;
        d0Var.O1 = f10;
        d0Var.P1 = i1Var.f(519);
        d0Var.A1.j(org.telegram.messenger.g0.L(56.0f) + d0Var.O1.f15893b, d0Var.O1.d, false);
        d0Var.C1.invalidate();
        return l1.f56257b;
    }

    @Override
    public Boolean a(l41 l41Var, View view, Integer num, Float f10, Float f11) {
        boolean z10;
        long j3;
        boolean z11;
        boolean z12;
        int i7 = d0.Q1;
        Object obj = l41Var.H;
        boolean z13 = obj instanceof TLRPC.Chat;
        d0 d0Var = this.f20007b;
        boolean z14 = true;
        if (z13) {
            TLRPC.Chat chat = (TLRPC.Chat) obj;
            long j10 = -chat.f28405id;
            boolean V = v3.V(chat);
            TLRPC.Chat chat2 = d0Var.f19907q1;
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
                long j11 = user.f28554id;
                boolean u10 = o10.u(user);
                TLRPC.Chat chat3 = d0Var.f19907q1;
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
            y60 G = y60.G(d0Var.f30195c, null, view);
            G.c(2131232089, gd.M0(2131751904, null), new m(d0Var, z11, z12, j3, 1), true);
            G.X(d0Var.f19912v1.d.U0(view, true));
            G.a0();
            return Boolean.valueOf(z14);
        }
        z14 = false;
        return Boolean.valueOf(z14);
    }

    @Override
    public void l(Object obj, Object obj2, Number number, Serializable serializable, Serializable serializable2) {
        long j3;
        TLRPC.Chat chat;
        int i7;
        int i10 = this.f20006a;
        d0 d0Var = this.f20007b;
        switch (i10) {
            case 0:
                View view = (View) obj2;
                Integer num = (Integer) number;
                Float f10 = (Float) serializable;
                Float f11 = (Float) serializable2;
                d0Var.M0((l41) obj);
                return;
            case 1:
            default:
                View view2 = (View) obj2;
                Integer num2 = (Integer) number;
                Float f12 = (Float) serializable;
                Float f13 = (Float) serializable2;
                int i11 = d0.Q1;
                d0Var.J0((l41) obj);
                return;
            case 2:
                View view3 = (View) obj2;
                Integer num3 = (Integer) number;
                Float f14 = (Float) serializable;
                Float f15 = (Float) serializable2;
                int i12 = d0.Q1;
                d0Var.M0((l41) obj);
                return;
            case 3:
                l41 l41Var = (l41) obj;
                View view4 = (View) obj2;
                Integer num4 = (Integer) number;
                Float f16 = (Float) serializable;
                Float f17 = (Float) serializable2;
                h2 h2Var = d0Var.f19911u1;
                if (!d0Var.J0(l41Var)) {
                    int i13 = l41Var.d;
                    boolean z10 = false;
                    if (i13 == 101) {
                        d0Var.f19908r1 = !d0Var.f19908r1;
                        mp.u1(d0Var.f30189a).q5(d0Var.f19906p1, d0Var.f19908r1);
                        if (view4 instanceof q8) {
                            ((q8) view4).getCheckBox().c(d0Var.f19908r1, true);
                            return;
                        } else {
                            d0Var.f19912v1.d.f34607g3.O(false);
                            return;
                        }
                    } else if (i13 == 100) {
                        d0Var.f19905o1.A(1);
                        d0Var.H1.e();
                        return;
                    } else {
                        Object obj3 = l41Var.H;
                        if (obj3 instanceof TLRPC.Chat) {
                            TLRPC.Chat chat2 = (TLRPC.Chat) obj3;
                            z10 = v3.V(chat2);
                            j3 = -chat2.f28405id;
                            chat = chat2;
                        } else if (obj3 instanceof TLRPC.User) {
                            j3 = ((TLRPC.User) obj3).f28554id;
                            chat = null;
                        } else {
                            return;
                        }
                        int b10 = l0.b(d0Var.f30189a, j3);
                        if (b10 != 1 && b10 != 2) {
                            if (b10 == 3) {
                                p70 p70Var = new p70(d0Var.getContext(), chat, null, d0Var.f19911u1, d0Var.J0);
                                p70Var.f38310t1 = new lc((FrameLayout) d0Var.f30192b, d0Var.J0);
                                p70Var.show();
                                return;
                            } else if (b10 == 4) {
                                lc lcVar = new lc((FrameLayout) d0Var.f30192b, d0Var.J0);
                                if (z10) {
                                    i7 = 2131751919;
                                } else {
                                    i7 = 2131751916;
                                }
                                f3.n(null, i7, lcVar, 2131624007, 36);
                                return;
                            } else {
                                return;
                            }
                        }
                        if (h2Var instanceof bn) {
                            bn bnVar = (bn) h2Var;
                            TLRPC.Chat chat3 = bnVar.f45987e;
                            TLRPC.User j10 = bnVar.j();
                            if ((chat3 != null && chat3.f28405id == (-j3)) || (j10 != null && j10.f28554id == j3)) {
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
                        if (v3.c0(chat)) {
                            if (v3.a(chat)) {
                                bn bnVar2 = new bn(bundle);
                                qg.c.a(bnVar2, sr.a(j3, mp.u1(d0Var.f30189a).h7.getLong(p0.o(chat.f28405id, "forumlasttopic"), 1L)));
                                h2Var.presentFragment(bnVar2);
                            } else {
                                h2Var.presentFragment(new y91(bundle));
                            }
                        } else {
                            h2Var.presentFragment(new bn(bundle));
                        }
                        d0Var.dismiss();
                        return;
                    }
                }
                return;
        }
    }
}
