package hi;

import android.content.Context;
import android.util.SparseIntArray;
import android.view.View;
import org.telegram.messenger.a20;
import org.telegram.messenger.gj;
import org.telegram.messenger.hd;
import org.telegram.messenger.m10;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.m60;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.zg;
public final class s4 implements a20 {
    public final int f15021a;
    public final Object f15022b;
    public final Object f15023c;
    public final Object d;

    public s4(Object obj, Object obj2, Object obj3, int i7) {
        this.f15021a = i7;
        this.f15022b = obj;
        this.f15023c = obj2;
        this.d = obj3;
    }

    @Override
    public final Object a(Object obj) {
        int i7 = this.f15021a;
        Object obj2 = this.d;
        Object obj3 = this.f15023c;
        Object obj4 = this.f15022b;
        switch (i7) {
            case 0:
                m5 m5Var = (m5) obj4;
                boolean[] zArr = (boolean[]) obj3;
                a5 a5Var = (a5) obj2;
                org.telegram.ui.ActionBar.k2 k2Var = a5Var.f29685c;
                Integer num = (Integer) obj;
                h5 h5Var = m5Var.B0;
                e5 e5Var = m5Var.f14685q1;
                if (num.intValue() == 0) {
                    zArr[0] = false;
                    m5Var.I0(null, new bi.b(m5Var, 29));
                    return Boolean.TRUE;
                } else if (num.intValue() == 5) {
                    zArr[0] = false;
                    c8.ka.c(2131624120, 2131747302, new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new String[]{"android.permission.ACCESS_COARSE_LOCATION"}, new di.t7(3, new di.t7(2, new ai.u1(15, m5Var, a5Var), true), true));
                    return Boolean.FALSE;
                } else if (num.intValue() == 2) {
                    a5Var.dismiss();
                    sa saVar = ((u9) m5Var).f15200k2;
                    saVar.f15048d1.M.b(true);
                    saVar.v();
                    saVar.s(true);
                    saVar.e(true);
                    return Boolean.TRUE;
                } else if (num.intValue() == 1) {
                    zArr[0] = false;
                    v6 v6Var = new v6(m5Var.getContext(), false, null, new ai.f0(m5Var, 27), new fi.b());
                    v6Var.n(new j4(m5Var, 2));
                    v6Var.show();
                    return Boolean.TRUE;
                } else if (num.intValue() == 3) {
                    m5Var.V1 = true;
                    m5Var.b0(m5Var.i0(true));
                    return Boolean.TRUE;
                } else if (num.intValue() == 4) {
                    if (!m10.i(m5Var.f14683p1).q()) {
                        try {
                            k2Var.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                        new cc(k2Var, e5Var).Q(2131624217, 36, org.telegram.messenger.g0.x2(hd.M0(2131744635, null), new j4(m5Var, 1))).k(true);
                        return Boolean.FALSE;
                    }
                    int i10 = 0;
                    for (int i11 = 0; i11 < h5Var.getChildCount(); i11++) {
                        if (h5Var.getChildAt(i11) instanceof tg.k0) {
                            i10++;
                        }
                    }
                    if (i10 >= 3) {
                        new cc(k2Var, e5Var).I(2131624080, hd.M0(2131744638, null), hd.G(3, "StoryLinkLimitMessage", new Object[0])).k(true);
                        return Boolean.FALSE;
                    }
                    zArr[0] = false;
                    m5Var.H0(null);
                    a5Var.dismiss();
                    return Boolean.TRUE;
                } else {
                    return Boolean.FALSE;
                }
            case 1:
                final org.telegram.ui.Components.d0 d0Var = (org.telegram.ui.Components.d0) obj4;
                final org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj3;
                Context context = (Context) obj2;
                org.telegram.ui.Components.b0 b0Var = (org.telegram.ui.Components.b0) obj;
                TL_aicompose.AiComposeTone aiComposeTone = b0Var.f33116e;
                if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
                    final TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) aiComposeTone;
                    m60 F = m60.F(d0Var.f29685c, e6Var, b0Var);
                    F.W(org.telegram.ui.ActionBar.j6.d0(org.telegram.messenger.g0.L(12.0f), org.telegram.ui.ActionBar.j6.w0(org.telegram.ui.ActionBar.j6.f28849d6, e6Var)));
                    F.l(2131232117, hd.M0(2131754996, null), new Runnable() {
                        @Override
                        public final void run() {
                            boolean z10;
                            int i12 = r4;
                            TL_aicompose.TL_aiComposeTone tL_aiComposeTone2 = tL_aiComposeTone;
                            org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                            d0 d0Var2 = d0Var;
                            switch (i12) {
                                case 0:
                                    y yVar = new y(d0Var2.getContext(), e6Var2);
                                    yVar.f41822f2 = tL_aiComposeTone2;
                                    yVar.d2 = Long.valueOf(tL_aiComposeTone2.emoji_id);
                                    yVar.f1();
                                    yVar.W1.setText(yVar.f41822f2.title);
                                    yVar.X1.setText(yVar.f41822f2.prompt);
                                    if (yVar.f41822f2.author_id != 0) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    yVar.Z1.a(z10, false);
                                    yVar.f35937p1.setTitle(org.telegram.messenger.hd.M0(2131754996, null));
                                    yVar.f41820c2.setText(org.telegram.messenger.hd.M0(2131754979, null));
                                    yVar.e1();
                                    yVar.f41826j2.O(false);
                                    yVar.f41824h2 = new f(d0Var2, 2);
                                    yVar.show();
                                    return;
                                default:
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, d0Var2.getContext(), e6Var2);
                                    String M0 = org.telegram.messenger.hd.M0(2131754998, null);
                                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                                    t1Var.S = M0;
                                    t1Var.U = org.telegram.messenger.hd.M0(2131754997, null);
                                    alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751598, null), new m2.d(26, d0Var2, tL_aiComposeTone2));
                                    alertDialog$Builder.d(-1);
                                    alertDialog$Builder.p();
                                    return;
                            }
                        }
                    }, tL_aiComposeTone.creator);
                    F.c(2131232364, hd.M0(2131754983, null), new org.telegram.ui.ActionBar.m5(d0Var, tL_aiComposeTone, context, e6Var, 15), false);
                    F.m(2131232109, new zg(19, d0Var, tL_aiComposeTone), hd.M0(2131754985, null), !tL_aiComposeTone.creator, true);
                    F.m(2131232109, new Runnable() {
                        @Override
                        public final void run() {
                            boolean z10;
                            int i12 = r4;
                            TL_aicompose.TL_aiComposeTone tL_aiComposeTone2 = tL_aiComposeTone;
                            org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                            d0 d0Var2 = d0Var;
                            switch (i12) {
                                case 0:
                                    y yVar = new y(d0Var2.getContext(), e6Var2);
                                    yVar.f41822f2 = tL_aiComposeTone2;
                                    yVar.d2 = Long.valueOf(tL_aiComposeTone2.emoji_id);
                                    yVar.f1();
                                    yVar.W1.setText(yVar.f41822f2.title);
                                    yVar.X1.setText(yVar.f41822f2.prompt);
                                    if (yVar.f41822f2.author_id != 0) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    yVar.Z1.a(z10, false);
                                    yVar.f35937p1.setTitle(org.telegram.messenger.hd.M0(2131754996, null));
                                    yVar.f41820c2.setText(org.telegram.messenger.hd.M0(2131754979, null));
                                    yVar.e1();
                                    yVar.f41826j2.O(false);
                                    yVar.f41824h2 = new f(d0Var2, 2);
                                    yVar.show();
                                    return;
                                default:
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, d0Var2.getContext(), e6Var2);
                                    String M0 = org.telegram.messenger.hd.M0(2131754998, null);
                                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28392a;
                                    t1Var.S = M0;
                                    t1Var.U = org.telegram.messenger.hd.M0(2131754997, null);
                                    alertDialog$Builder.h(org.telegram.messenger.hd.M0(2131752589, null), null);
                                    alertDialog$Builder.k(org.telegram.messenger.hd.M0(2131751598, null), new m2.d(26, d0Var2, tL_aiComposeTone2));
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
                gj gjVar = ((th.g) obj2).f57657b;
                return th.c.d(view, (String) obj4, (String) obj3, gjVar.F0(), gjVar);
            default:
                uj0 uj0Var = (uj0) obj4;
                a20 a20Var = (a20) obj3;
                SparseIntArray sparseIntArray = (SparseIntArray) obj2;
                View view2 = (View) obj;
                try {
                    if (view2.getParent() != uj0Var) {
                        return Boolean.FALSE;
                    }
                    Boolean bool = (Boolean) a20Var.a(view2);
                    boolean booleanValue = bool.booleanValue();
                    v4.e1 T = uj0Var.T(view2);
                    if (T != null) {
                        sparseIntArray.put(T.f58539f, booleanValue ? 1 : 0);
                    }
                    return bool;
                } catch (Exception unused2) {
                    return Boolean.FALSE;
                }
        }
    }
}
