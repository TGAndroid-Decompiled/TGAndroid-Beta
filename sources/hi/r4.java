package hi;

import android.content.Context;
import android.util.SparseIntArray;
import android.view.View;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.k10;
import org.telegram.messenger.z10;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.a70;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.lc;
import org.telegram.ui.ci;
public final class r4 implements z10 {
    public final int f15300a;
    public final Object f15301b;
    public final Object f15302c;
    public final Object d;

    public r4(Object obj, Object obj2, Object obj3, int i7) {
        this.f15300a = i7;
        this.f15301b = obj;
        this.f15302c = obj2;
        this.d = obj3;
    }

    @Override
    public final Object a(Object obj) {
        int i7 = this.f15300a;
        Object obj2 = this.d;
        Object obj3 = this.f15302c;
        Object obj4 = this.f15301b;
        switch (i7) {
            case 0:
                l5 l5Var = (l5) obj4;
                boolean[] zArr = (boolean[]) obj3;
                z4 z4Var = (z4) obj2;
                org.telegram.ui.ActionBar.m2 m2Var = z4Var.f30145c;
                Integer num = (Integer) obj;
                g5 g5Var = l5Var.B0;
                d5 d5Var = l5Var.f14911q1;
                if (num.intValue() == 0) {
                    zArr[0] = false;
                    l5Var.I0(null, new bi.b(l5Var, 28));
                    return Boolean.TRUE;
                } else if (num.intValue() == 5) {
                    zArr[0] = false;
                    c8.oa.c(2131624120, 2131747108, new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new String[]{"android.permission.ACCESS_COARSE_LOCATION"}, new ai.n2(4, new ai.n2(3, new ai.r1(17, l5Var, z4Var), true), true));
                    return Boolean.FALSE;
                } else if (num.intValue() == 2) {
                    z4Var.dismiss();
                    ta taVar = ((v9) l5Var).f15569k2;
                    taVar.f15400d1.M.b(true);
                    taVar.v();
                    taVar.s(true);
                    taVar.e(true);
                    return Boolean.TRUE;
                } else if (num.intValue() == 1) {
                    zArr[0] = false;
                    v6 v6Var = new v6(l5Var.getContext(), false, null, new ai.c0(l5Var, 28), new fi.b());
                    v6Var.n(new i4(l5Var, 2));
                    v6Var.show();
                    return Boolean.TRUE;
                } else if (num.intValue() == 3) {
                    l5Var.V1 = true;
                    l5Var.b0(l5Var.i0(true));
                    return Boolean.TRUE;
                } else if (num.intValue() == 4) {
                    if (!k10.i(l5Var.f14909p1).q()) {
                        try {
                            m2Var.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                        new lc(m2Var, d5Var).Q(2131624217, 36, org.telegram.messenger.g0.x2(hd.N0(2131744394, null), new i4(l5Var, 1))).k(true);
                        return Boolean.FALSE;
                    }
                    int i10 = 0;
                    for (int i11 = 0; i11 < g5Var.getChildCount(); i11++) {
                        if (g5Var.getChildAt(i11) instanceof tg.l0) {
                            i10++;
                        }
                    }
                    if (i10 >= 3) {
                        new lc(m2Var, d5Var).I(2131624080, hd.N0(2131744397, null), hd.G(3, "StoryLinkLimitMessage", new Object[0])).k(true);
                        return Boolean.FALSE;
                    }
                    zArr[0] = false;
                    l5Var.H0(null);
                    z4Var.dismiss();
                    return Boolean.TRUE;
                } else {
                    return Boolean.FALSE;
                }
            case 1:
                final org.telegram.ui.Components.n0 n0Var = (org.telegram.ui.Components.n0) obj4;
                final org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) obj3;
                Context context = (Context) obj2;
                org.telegram.ui.Components.l0 l0Var = (org.telegram.ui.Components.l0) obj;
                TL_aicompose.AiComposeTone aiComposeTone = l0Var.f37007e;
                if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
                    final TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) aiComposeTone;
                    a70 G = a70.G(n0Var.f30145c, h6Var, l0Var);
                    G.X(org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(12.0f), org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29347d6, h6Var)));
                    G.l(2131232118, hd.N0(2131754996, null), new Runnable() {
                        @Override
                        public final void run() {
                            boolean z10;
                            int i12 = r4;
                            TL_aicompose.TL_aiComposeTone tL_aiComposeTone2 = tL_aiComposeTone;
                            org.telegram.ui.ActionBar.h6 h6Var2 = h6Var;
                            n0 n0Var2 = n0Var;
                            switch (i12) {
                                case 0:
                                    i0 i0Var = new i0(n0Var2.getContext(), h6Var2);
                                    i0Var.f36016f2 = tL_aiComposeTone2;
                                    i0Var.d2 = Long.valueOf(tL_aiComposeTone2.emoji_id);
                                    i0Var.g1();
                                    i0Var.W1.setText(i0Var.f36016f2.title);
                                    i0Var.X1.setText(i0Var.f36016f2.prompt);
                                    if (i0Var.f36016f2.author_id != 0) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    i0Var.Z1.a(z10, false);
                                    i0Var.f39488p1.setTitle(org.telegram.messenger.hd.N0(2131754996, null));
                                    i0Var.f36014c2.setText(org.telegram.messenger.hd.N0(2131754979, null));
                                    i0Var.f1();
                                    i0Var.f36020j2.O(false);
                                    i0Var.f36018h2 = new f(n0Var2, 2);
                                    i0Var.show();
                                    return;
                                default:
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, n0Var2.getContext(), h6Var2);
                                    String N0 = org.telegram.messenger.hd.N0(2131754998, null);
                                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28743a;
                                    t1Var.S = N0;
                                    t1Var.U = org.telegram.messenger.hd.N0(2131754997, null);
                                    alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                                    alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131751586, null), new oi.e0(24, n0Var2, tL_aiComposeTone2));
                                    alertDialog$Builder.d(-1);
                                    alertDialog$Builder.p();
                                    return;
                            }
                        }
                    }, tL_aiComposeTone.creator);
                    G.c(2131232365, hd.N0(2131754983, null), new org.telegram.messenger.camera.i(n0Var, tL_aiComposeTone, context, h6Var, 19), false);
                    G.m(2131232110, new ci(15, n0Var, tL_aiComposeTone), hd.N0(2131754985, null), !tL_aiComposeTone.creator, true);
                    G.m(2131232110, new Runnable() {
                        @Override
                        public final void run() {
                            boolean z10;
                            int i12 = r4;
                            TL_aicompose.TL_aiComposeTone tL_aiComposeTone2 = tL_aiComposeTone;
                            org.telegram.ui.ActionBar.h6 h6Var2 = h6Var;
                            n0 n0Var2 = n0Var;
                            switch (i12) {
                                case 0:
                                    i0 i0Var = new i0(n0Var2.getContext(), h6Var2);
                                    i0Var.f36016f2 = tL_aiComposeTone2;
                                    i0Var.d2 = Long.valueOf(tL_aiComposeTone2.emoji_id);
                                    i0Var.g1();
                                    i0Var.W1.setText(i0Var.f36016f2.title);
                                    i0Var.X1.setText(i0Var.f36016f2.prompt);
                                    if (i0Var.f36016f2.author_id != 0) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    i0Var.Z1.a(z10, false);
                                    i0Var.f39488p1.setTitle(org.telegram.messenger.hd.N0(2131754996, null));
                                    i0Var.f36014c2.setText(org.telegram.messenger.hd.N0(2131754979, null));
                                    i0Var.f1();
                                    i0Var.f36020j2.O(false);
                                    i0Var.f36018h2 = new f(n0Var2, 2);
                                    i0Var.show();
                                    return;
                                default:
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, n0Var2.getContext(), h6Var2);
                                    String N0 = org.telegram.messenger.hd.N0(2131754998, null);
                                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28743a;
                                    t1Var.S = N0;
                                    t1Var.U = org.telegram.messenger.hd.N0(2131754997, null);
                                    alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                                    alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131751586, null), new oi.e0(24, n0Var2, tL_aiComposeTone2));
                                    alertDialog$Builder.d(-1);
                                    alertDialog$Builder.p();
                                    return;
                            }
                        }
                    }, hd.N0(2131754998, null), tL_aiComposeTone.creator, true);
                    G.a0();
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
            case 2:
                View view = (View) obj;
                gj gjVar = ((th.g) obj2).f58235b;
                return th.c.d(view, (String) obj4, (String) obj3, gjVar.F0(), gjVar);
            default:
                ek0 ek0Var = (ek0) obj4;
                z10 z10Var = (z10) obj3;
                SparseIntArray sparseIntArray = (SparseIntArray) obj2;
                View view2 = (View) obj;
                try {
                    if (view2.getParent() != ek0Var) {
                        return Boolean.FALSE;
                    }
                    Boolean bool = (Boolean) z10Var.a(view2);
                    boolean booleanValue = bool.booleanValue();
                    v4.e1 T = ek0Var.T(view2);
                    if (T != null) {
                        sparseIntArray.put(T.f59115f, booleanValue ? 1 : 0);
                    }
                    return bool;
                } catch (Exception unused2) {
                    return Boolean.FALSE;
                }
        }
    }
}
