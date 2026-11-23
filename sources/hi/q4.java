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
import org.telegram.ui.eh;
public final class q4 implements z10 {
    public final int f15303a;
    public final Object f15304b;
    public final Object f15305c;
    public final Object d;

    public q4(Object obj, Object obj2, Object obj3, int i7) {
        this.f15303a = i7;
        this.f15304b = obj;
        this.f15305c = obj2;
        this.d = obj3;
    }

    @Override
    public final Object a(Object obj) {
        int i7 = this.f15303a;
        Object obj2 = this.d;
        Object obj3 = this.f15305c;
        Object obj4 = this.f15304b;
        switch (i7) {
            case 0:
                k5 k5Var = (k5) obj4;
                boolean[] zArr = (boolean[]) obj3;
                y4 y4Var = (y4) obj2;
                org.telegram.ui.ActionBar.m2 m2Var = y4Var.f30179c;
                Integer num = (Integer) obj;
                f5 f5Var = k5Var.B0;
                c5 c5Var = k5Var.f14899q1;
                if (num.intValue() == 0) {
                    zArr[0] = false;
                    k5Var.I0(null, new bi.b(k5Var, 28));
                    return Boolean.TRUE;
                } else if (num.intValue() == 5) {
                    zArr[0] = false;
                    c8.na.c(2131624120, 2131747108, new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new String[]{"android.permission.ACCESS_COARSE_LOCATION"}, new ai.x2(4, new ai.x2(3, new ai.y1(17, k5Var, y4Var), true), true));
                    return Boolean.FALSE;
                } else if (num.intValue() == 2) {
                    y4Var.dismiss();
                    sa saVar = ((u9) k5Var).f15584k2;
                    saVar.f15397d1.M.b(true);
                    saVar.v();
                    saVar.s(true);
                    saVar.e(true);
                    return Boolean.TRUE;
                } else if (num.intValue() == 1) {
                    zArr[0] = false;
                    u6 u6Var = new u6(k5Var.getContext(), false, null, new ai.h0(k5Var, 28), new fi.b());
                    u6Var.n(new h4(k5Var, 2));
                    u6Var.show();
                    return Boolean.TRUE;
                } else if (num.intValue() == 3) {
                    k5Var.V1 = true;
                    k5Var.b0(k5Var.i0(true));
                    return Boolean.TRUE;
                } else if (num.intValue() == 4) {
                    if (!k10.i(k5Var.f14897p1).q()) {
                        try {
                            m2Var.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                        new lc(m2Var, c5Var).Q(2131624217, 36, org.telegram.messenger.g0.x2(hd.N0(2131744392, null), new h4(k5Var, 1))).k(true);
                        return Boolean.FALSE;
                    }
                    int i10 = 0;
                    for (int i11 = 0; i11 < f5Var.getChildCount(); i11++) {
                        if (f5Var.getChildAt(i11) instanceof tg.l0) {
                            i10++;
                        }
                    }
                    if (i10 >= 3) {
                        new lc(m2Var, c5Var).I(2131624080, hd.N0(2131744395, null), hd.G(3, "StoryLinkLimitMessage", new Object[0])).k(true);
                        return Boolean.FALSE;
                    }
                    zArr[0] = false;
                    k5Var.H0(null);
                    y4Var.dismiss();
                    return Boolean.TRUE;
                } else {
                    return Boolean.FALSE;
                }
            case 1:
                final org.telegram.ui.Components.n0 n0Var = (org.telegram.ui.Components.n0) obj4;
                final org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) obj3;
                Context context = (Context) obj2;
                org.telegram.ui.Components.l0 l0Var = (org.telegram.ui.Components.l0) obj;
                TL_aicompose.AiComposeTone aiComposeTone = l0Var.f37050e;
                if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
                    final TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) aiComposeTone;
                    a70 G = a70.G(n0Var.f30179c, h6Var, l0Var);
                    G.X(org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(12.0f), org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f29381d6, h6Var)));
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
                                    i0Var.f36061f2 = tL_aiComposeTone2;
                                    i0Var.d2 = Long.valueOf(tL_aiComposeTone2.emoji_id);
                                    i0Var.g1();
                                    i0Var.W1.setText(i0Var.f36061f2.title);
                                    i0Var.X1.setText(i0Var.f36061f2.prompt);
                                    if (i0Var.f36061f2.author_id != 0) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    i0Var.Z1.a(z10, false);
                                    i0Var.f39532p1.setTitle(org.telegram.messenger.hd.N0(2131754996, null));
                                    i0Var.f36059c2.setText(org.telegram.messenger.hd.N0(2131754979, null));
                                    i0Var.f1();
                                    i0Var.f36065j2.O(false);
                                    i0Var.f36063h2 = new f(n0Var2, 2);
                                    i0Var.show();
                                    return;
                                default:
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, n0Var2.getContext(), h6Var2);
                                    String N0 = org.telegram.messenger.hd.N0(2131754998, null);
                                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28777a;
                                    t1Var.S = N0;
                                    t1Var.U = org.telegram.messenger.hd.N0(2131754997, null);
                                    alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                                    alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131751586, null), new oi.f0(24, n0Var2, tL_aiComposeTone2));
                                    alertDialog$Builder.d(-1);
                                    alertDialog$Builder.p();
                                    return;
                            }
                        }
                    }, tL_aiComposeTone.creator);
                    G.c(2131232365, hd.N0(2131754983, null), new org.telegram.messenger.camera.i(n0Var, tL_aiComposeTone, context, h6Var, 19), false);
                    G.m(2131232110, new eh(17, n0Var, tL_aiComposeTone), hd.N0(2131754985, null), !tL_aiComposeTone.creator, true);
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
                                    i0Var.f36061f2 = tL_aiComposeTone2;
                                    i0Var.d2 = Long.valueOf(tL_aiComposeTone2.emoji_id);
                                    i0Var.g1();
                                    i0Var.W1.setText(i0Var.f36061f2.title);
                                    i0Var.X1.setText(i0Var.f36061f2.prompt);
                                    if (i0Var.f36061f2.author_id != 0) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    i0Var.Z1.a(z10, false);
                                    i0Var.f39532p1.setTitle(org.telegram.messenger.hd.N0(2131754996, null));
                                    i0Var.f36059c2.setText(org.telegram.messenger.hd.N0(2131754979, null));
                                    i0Var.f1();
                                    i0Var.f36065j2.O(false);
                                    i0Var.f36063h2 = new f(n0Var2, 2);
                                    i0Var.show();
                                    return;
                                default:
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, n0Var2.getContext(), h6Var2);
                                    String N0 = org.telegram.messenger.hd.N0(2131754998, null);
                                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28777a;
                                    t1Var.S = N0;
                                    t1Var.U = org.telegram.messenger.hd.N0(2131754997, null);
                                    alertDialog$Builder.h(org.telegram.messenger.hd.N0(2131752577, null), null);
                                    alertDialog$Builder.k(org.telegram.messenger.hd.N0(2131751586, null), new oi.f0(24, n0Var2, tL_aiComposeTone2));
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
                gj gjVar = ((th.g) obj2).f58270b;
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
                    v4.f1 T = ek0Var.T(view2);
                    if (T != null) {
                        sparseIntArray.put(T.f59169f, booleanValue ? 1 : 0);
                    }
                    return bool;
                } catch (Exception unused2) {
                    return Boolean.FALSE;
                }
        }
    }
}
