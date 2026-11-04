package gi;

import android.content.Context;
import android.util.SparseIntArray;
import android.view.View;
import b8.nf;
import org.telegram.messenger.bd;
import org.telegram.messenger.h10;
import org.telegram.messenger.v10;
import org.telegram.messenger.zi;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.f60;
import org.telegram.ui.Components.fc;
import org.telegram.ui.Components.tj0;
import org.telegram.ui.lo;
public final class s4 implements v10 {
    public final int f13557a;
    public final Object f13558b;
    public final Object f13559c;
    public final Object d;

    public s4(Object obj, Object obj2, Object obj3, int i3) {
        this.f13557a = i3;
        this.f13558b = obj;
        this.f13559c = obj2;
        this.d = obj3;
    }

    @Override
    public final Object a(Object obj) {
        int i3 = this.f13557a;
        Object obj2 = this.d;
        Object obj3 = this.f13559c;
        Object obj4 = this.f13558b;
        switch (i3) {
            case 0:
                m5 m5Var = (m5) obj4;
                boolean[] zArr = (boolean[]) obj3;
                a5 a5Var = (a5) obj2;
                org.telegram.ui.ActionBar.j2 j2Var = a5Var.f28589c;
                Integer num = (Integer) obj;
                h5 h5Var = m5Var.B0;
                e5 e5Var = m5Var.f13224q1;
                if (num.intValue() == 0) {
                    zArr[0] = false;
                    m5Var.I0(null, new ai.c(m5Var, 29));
                    return Boolean.TRUE;
                } else if (num.intValue() == 5) {
                    zArr[0] = false;
                    nf.c(2131624119, 2131747310, new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new String[]{"android.permission.ACCESS_COARSE_LOCATION"}, new ci.b8(3, new ci.b8(2, new ai.o1(14, m5Var, a5Var), true), true));
                    return Boolean.FALSE;
                } else if (num.intValue() == 2) {
                    a5Var.dismiss();
                    va vaVar = ((x9) m5Var).f13872k2;
                    vaVar.f13710d1.M.b(true);
                    vaVar.v();
                    vaVar.s(true);
                    vaVar.e(true);
                    return Boolean.TRUE;
                } else if (num.intValue() == 1) {
                    zArr[0] = false;
                    x6 x6Var = new x6(m5Var.getContext(), false, null, new ai.v2(m5Var, 26), new ei.b());
                    x6Var.n(new j4(m5Var, 2));
                    x6Var.show();
                    return Boolean.TRUE;
                } else if (num.intValue() == 3) {
                    m5Var.V1 = true;
                    m5Var.b0(m5Var.i0(true));
                    return Boolean.TRUE;
                } else if (num.intValue() == 4) {
                    if (!h10.i(m5Var.f13222p1).q()) {
                        try {
                            j2Var.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                        new fc(j2Var, e5Var).Q(2131624216, 36, org.telegram.messenger.g0.x2(bd.M0(2131744645, null), new j4(m5Var, 1))).k(true);
                        return Boolean.FALSE;
                    }
                    int i10 = 0;
                    for (int i11 = 0; i11 < h5Var.getChildCount(); i11++) {
                        if (h5Var.getChildAt(i11) instanceof ug.j0) {
                            i10++;
                        }
                    }
                    if (i10 >= 3) {
                        new fc(j2Var, e5Var).I(2131624079, bd.M0(2131744648, null), bd.G(3, "StoryLinkLimitMessage", new Object[0])).k(true);
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
                final org.telegram.ui.Components.e0 e0Var = (org.telegram.ui.Components.e0) obj4;
                final org.telegram.ui.ActionBar.e6 e6Var = (org.telegram.ui.ActionBar.e6) obj3;
                Context context = (Context) obj2;
                org.telegram.ui.Components.c0 c0Var = (org.telegram.ui.Components.c0) obj;
                TL_aicompose.AiComposeTone aiComposeTone = c0Var.f32488e;
                if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
                    final TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) aiComposeTone;
                    f60 F = f60.F(e0Var.f28589c, e6Var, c0Var);
                    F.W(org.telegram.ui.ActionBar.k6.d0(org.telegram.messenger.g0.L(12.0f), org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f27878d6, e6Var)));
                    F.l(2131232116, bd.M0(2131754996, null), new Runnable() {
                        @Override
                        public final void run() {
                            boolean z10;
                            int i12 = r4;
                            TL_aicompose.TL_aiComposeTone tL_aiComposeTone2 = tL_aiComposeTone;
                            org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                            e0 e0Var2 = e0Var;
                            switch (i12) {
                                case 0:
                                    z zVar = new z(e0Var2.getContext(), e6Var2);
                                    zVar.c2 = tL_aiComposeTone2;
                                    zVar.f40876a2 = Long.valueOf(tL_aiComposeTone2.emoji_id);
                                    zVar.f1();
                                    zVar.T1.setText(zVar.c2.title);
                                    zVar.U1.setText(zVar.c2.prompt);
                                    if (zVar.c2.author_id != 0) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    zVar.W1.a(z10, false);
                                    zVar.m1.setTitle(org.telegram.messenger.bd.M0(2131754996, null));
                                    zVar.Z1.setText(org.telegram.messenger.bd.M0(2131754979, null));
                                    zVar.e1();
                                    zVar.f40881g2.O(false);
                                    zVar.f40879e2 = new g(e0Var2, 2);
                                    zVar.show();
                                    return;
                                default:
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, e0Var2.getContext(), e6Var2);
                                    String M0 = org.telegram.messenger.bd.M0(2131754998, null);
                                    org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                                    s1Var.S = M0;
                                    s1Var.U = org.telegram.messenger.bd.M0(2131754997, null);
                                    alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                                    alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751599, null), new org.telegram.ui.jo(2, e0Var2, tL_aiComposeTone2));
                                    alertDialog$Builder.d(-1);
                                    alertDialog$Builder.p();
                                    return;
                            }
                        }
                    }, tL_aiComposeTone.creator);
                    F.c(2131232363, bd.M0(2131754983, null), new o4.b1(e0Var, tL_aiComposeTone, context, e6Var, 20), false);
                    F.m(2131232108, new lo(5, e0Var, tL_aiComposeTone), bd.M0(2131754985, null), !tL_aiComposeTone.creator, true);
                    F.m(2131232108, new Runnable() {
                        @Override
                        public final void run() {
                            boolean z10;
                            int i12 = r4;
                            TL_aicompose.TL_aiComposeTone tL_aiComposeTone2 = tL_aiComposeTone;
                            org.telegram.ui.ActionBar.e6 e6Var2 = e6Var;
                            e0 e0Var2 = e0Var;
                            switch (i12) {
                                case 0:
                                    z zVar = new z(e0Var2.getContext(), e6Var2);
                                    zVar.c2 = tL_aiComposeTone2;
                                    zVar.f40876a2 = Long.valueOf(tL_aiComposeTone2.emoji_id);
                                    zVar.f1();
                                    zVar.T1.setText(zVar.c2.title);
                                    zVar.U1.setText(zVar.c2.prompt);
                                    if (zVar.c2.author_id != 0) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    zVar.W1.a(z10, false);
                                    zVar.m1.setTitle(org.telegram.messenger.bd.M0(2131754996, null));
                                    zVar.Z1.setText(org.telegram.messenger.bd.M0(2131754979, null));
                                    zVar.e1();
                                    zVar.f40881g2.O(false);
                                    zVar.f40879e2 = new g(e0Var2, 2);
                                    zVar.show();
                                    return;
                                default:
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, e0Var2.getContext(), e6Var2);
                                    String M0 = org.telegram.messenger.bd.M0(2131754998, null);
                                    org.telegram.ui.ActionBar.s1 s1Var = alertDialog$Builder.f27343a;
                                    s1Var.S = M0;
                                    s1Var.U = org.telegram.messenger.bd.M0(2131754997, null);
                                    alertDialog$Builder.h(org.telegram.messenger.bd.M0(2131752589, null), null);
                                    alertDialog$Builder.k(org.telegram.messenger.bd.M0(2131751599, null), new org.telegram.ui.jo(2, e0Var2, tL_aiComposeTone2));
                                    alertDialog$Builder.d(-1);
                                    alertDialog$Builder.p();
                                    return;
                            }
                        }
                    }, bd.M0(2131754998, null), tL_aiComposeTone.creator, true);
                    F.Z();
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
            case 2:
                View view = (View) obj;
                zi ziVar = ((uh.g) obj2).f56365b;
                return uh.c.d(view, (String) obj4, (String) obj3, ziVar.F0(), ziVar);
            default:
                tj0 tj0Var = (tj0) obj4;
                v10 v10Var = (v10) obj3;
                SparseIntArray sparseIntArray = (SparseIntArray) obj2;
                View view2 = (View) obj;
                try {
                    if (view2.getParent() != tj0Var) {
                        return Boolean.FALSE;
                    }
                    Boolean bool = (Boolean) v10Var.a(view2);
                    boolean booleanValue = bool.booleanValue();
                    u4.d1 T = tj0Var.T(view2);
                    if (T != null) {
                        sparseIntArray.put(T.f55544f, booleanValue ? 1 : 0);
                    }
                    return bool;
                } catch (Exception unused2) {
                    return Boolean.FALSE;
                }
        }
    }
}
