package fi;

import android.content.Context;
import android.util.SparseIntArray;
import android.view.View;
import org.telegram.messenger.d20;
import org.telegram.messenger.hd;
import org.telegram.messenger.ij;
import org.telegram.messenger.p10;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.hc;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.pj0;
public final class u4 implements d20 {
    public final int f12887a;
    public final Object f12888b;
    public final Object f12889c;
    public final Object d;

    public u4(Object obj, Object obj2, Object obj3, int i7) {
        this.f12887a = i7;
        this.f12888b = obj;
        this.f12889c = obj2;
        this.d = obj3;
    }

    @Override
    public final Object a(Object obj) {
        int i7 = this.f12887a;
        Object obj2 = this.d;
        Object obj3 = this.f12889c;
        Object obj4 = this.f12888b;
        switch (i7) {
            case 0:
                o5 o5Var = (o5) obj4;
                boolean[] zArr = (boolean[]) obj3;
                c5 c5Var = (c5) obj2;
                org.telegram.ui.ActionBar.l2 l2Var = c5Var.f28619c;
                Integer num = (Integer) obj;
                j5 j5Var = o5Var.A0;
                g5 g5Var = o5Var.f12540p1;
                if (num.intValue() == 0) {
                    zArr[0] = false;
                    o5Var.I0(null, new ai.e(o5Var, 19));
                    return Boolean.TRUE;
                } else if (num.intValue() == 5) {
                    zArr[0] = false;
                    c8.ia.c(2131624119, 2131747301, new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new String[]{"android.permission.ACCESS_COARSE_LOCATION"}, new bi.b9(3, new bi.b9(2, new ai.f1(10, o5Var, c5Var), true), true));
                    return Boolean.FALSE;
                } else if (num.intValue() == 2) {
                    c5Var.dismiss();
                    va vaVar = ((x9) o5Var).f13102j2;
                    vaVar.f12944c1.L.b(true);
                    vaVar.v();
                    vaVar.s(true);
                    vaVar.e(true);
                    return Boolean.TRUE;
                } else if (num.intValue() == 1) {
                    zArr[0] = false;
                    w6 w6Var = new w6(o5Var.getContext(), false, null, new ai.i(o5Var, 23), new di.b());
                    w6Var.n(new m4(o5Var, 2));
                    w6Var.show();
                    return Boolean.TRUE;
                } else if (num.intValue() == 3) {
                    o5Var.U1 = true;
                    o5Var.b0(o5Var.i0(true));
                    return Boolean.TRUE;
                } else if (num.intValue() == 4) {
                    if (!p10.i(o5Var.f12538o1).q()) {
                        try {
                            l2Var.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                        new hc(l2Var, g5Var).Q(2131624216, 36, org.telegram.messenger.g0.x2(hd.M0(2131744636, null), new m4(o5Var, 1))).k(true);
                        return Boolean.FALSE;
                    }
                    int i10 = 0;
                    for (int i11 = 0; i11 < j5Var.getChildCount(); i11++) {
                        if (j5Var.getChildAt(i11) instanceof tg.k0) {
                            i10++;
                        }
                    }
                    if (i10 >= 3) {
                        new hc(l2Var, g5Var).I(2131624079, hd.M0(2131744639, null), hd.G(3, "StoryLinkLimitMessage", new Object[0])).k(true);
                        return Boolean.FALSE;
                    }
                    zArr[0] = false;
                    o5Var.H0(null);
                    c5Var.dismiss();
                    return Boolean.TRUE;
                } else {
                    return Boolean.FALSE;
                }
            case 1:
                final org.telegram.ui.Components.g0 g0Var = (org.telegram.ui.Components.g0) obj4;
                final org.telegram.ui.ActionBar.f6 f6Var = (org.telegram.ui.ActionBar.f6) obj3;
                Context context = (Context) obj2;
                org.telegram.ui.Components.e0 e0Var = (org.telegram.ui.Components.e0) obj;
                TL_aicompose.AiComposeTone aiComposeTone = e0Var.f33108e;
                if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
                    final TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) aiComposeTone;
                    k60 F = k60.F(g0Var.f28619c, f6Var, e0Var);
                    F.W(org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(12.0f), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27849d6, f6Var)));
                    F.l(2131232116, hd.M0(2131754996, null), new Runnable() {
                        @Override
                        public final void run() {
                            boolean z9;
                            int i12 = r4;
                            TL_aicompose.TL_aiComposeTone tL_aiComposeTone2 = tL_aiComposeTone;
                            org.telegram.ui.ActionBar.f6 f6Var2 = f6Var;
                            g0 g0Var2 = g0Var;
                            switch (i12) {
                                case 0:
                                    a0 a0Var = new a0(g0Var2.getContext(), f6Var2);
                                    a0Var.f31616b2 = tL_aiComposeTone2;
                                    a0Var.Z1 = Long.valueOf(tL_aiComposeTone2.emoji_id);
                                    a0Var.f1();
                                    a0Var.S1.setText(a0Var.f31616b2.title);
                                    a0Var.T1.setText(a0Var.f31616b2.prompt);
                                    if (a0Var.f31616b2.author_id != 0) {
                                        z9 = true;
                                    } else {
                                        z9 = false;
                                    }
                                    a0Var.V1.a(z9, false);
                                    a0Var.l1.setTitle(org.telegram.messenger.hd.M0(2131754996, null));
                                    a0Var.Y1.setText(org.telegram.messenger.hd.M0(2131754979, null));
                                    a0Var.e1();
                                    a0Var.f31619f2.O(false);
                                    a0Var.d2 = new g(g0Var2, 2);
                                    a0Var.show();
                                    return;
                                default:
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, g0Var2.getContext(), f6Var2);
                                    String M0 = org.telegram.messenger.hd.M0(2131754998, null);
                                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27293a;
                                    u1Var.R = M0;
                                    u1Var.T = org.telegram.messenger.hd.M0(2131754997, null);
                                    alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751599, null), new ni.c(22, g0Var2, tL_aiComposeTone2));
                                    alertDialog$Builder.d(-1);
                                    alertDialog$Builder.p();
                                    return;
                            }
                        }
                    }, tL_aiComposeTone.creator);
                    F.c(2131232363, hd.M0(2131754983, null), new org.telegram.ui.m6(g0Var, tL_aiComposeTone, context, f6Var, 14), false);
                    F.m(2131232108, new org.telegram.ui.Components.f(0, g0Var, tL_aiComposeTone), hd.M0(2131754985, null), !tL_aiComposeTone.creator, true);
                    F.m(2131232108, new Runnable() {
                        @Override
                        public final void run() {
                            boolean z9;
                            int i12 = r4;
                            TL_aicompose.TL_aiComposeTone tL_aiComposeTone2 = tL_aiComposeTone;
                            org.telegram.ui.ActionBar.f6 f6Var2 = f6Var;
                            g0 g0Var2 = g0Var;
                            switch (i12) {
                                case 0:
                                    a0 a0Var = new a0(g0Var2.getContext(), f6Var2);
                                    a0Var.f31616b2 = tL_aiComposeTone2;
                                    a0Var.Z1 = Long.valueOf(tL_aiComposeTone2.emoji_id);
                                    a0Var.f1();
                                    a0Var.S1.setText(a0Var.f31616b2.title);
                                    a0Var.T1.setText(a0Var.f31616b2.prompt);
                                    if (a0Var.f31616b2.author_id != 0) {
                                        z9 = true;
                                    } else {
                                        z9 = false;
                                    }
                                    a0Var.V1.a(z9, false);
                                    a0Var.l1.setTitle(org.telegram.messenger.hd.M0(2131754996, null));
                                    a0Var.Y1.setText(org.telegram.messenger.hd.M0(2131754979, null));
                                    a0Var.e1();
                                    a0Var.f31619f2.O(false);
                                    a0Var.d2 = new g(g0Var2, 2);
                                    a0Var.show();
                                    return;
                                default:
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, g0Var2.getContext(), f6Var2);
                                    String M0 = org.telegram.messenger.hd.M0(2131754998, null);
                                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27293a;
                                    u1Var.R = M0;
                                    u1Var.T = org.telegram.messenger.hd.M0(2131754997, null);
                                    alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751599, null), new ni.c(22, g0Var2, tL_aiComposeTone2));
                                    alertDialog$Builder.d(-1);
                                    alertDialog$Builder.p();
                                    return;
                            }
                        }
                    }, hd.M0(2131754998, null), tL_aiComposeTone.creator, true);
                    F.Z();
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
            case 2:
                View view = (View) obj;
                ij ijVar = ((th.g) obj2).f55968b;
                return th.c.d(view, (String) obj4, (String) obj3, ijVar.F0(), ijVar);
            default:
                pj0 pj0Var = (pj0) obj4;
                d20 d20Var = (d20) obj3;
                SparseIntArray sparseIntArray = (SparseIntArray) obj2;
                View view2 = (View) obj;
                try {
                    if (view2.getParent() != pj0Var) {
                        return Boolean.FALSE;
                    }
                    Boolean bool = (Boolean) d20Var.a(view2);
                    boolean booleanValue = bool.booleanValue();
                    v4.d1 T = pj0Var.T(view2);
                    if (T != null) {
                        sparseIntArray.put(T.f56955f, booleanValue ? 1 : 0);
                    }
                    return bool;
                } catch (Exception unused2) {
                    return Boolean.FALSE;
                }
        }
    }
}
