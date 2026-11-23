package hi;

import android.content.Context;
import android.util.SparseIntArray;
import android.view.View;
import org.telegram.messenger.fj;
import org.telegram.messenger.gd;
import org.telegram.messenger.i10;
import org.telegram.messenger.x10;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.x60;
import org.telegram.ui.ah;
public final class b5 implements x10 {
    public final int f14226a;
    public final Object f14227b;
    public final Object f14228c;
    public final Object d;

    public b5(Object obj, Object obj2, Object obj3, int i7) {
        this.f14226a = i7;
        this.f14227b = obj;
        this.f14228c = obj2;
        this.d = obj3;
    }

    @Override
    public final Object a(Object obj) {
        int i7 = this.f14226a;
        Object obj2 = this.d;
        Object obj3 = this.f14228c;
        Object obj4 = this.f14227b;
        switch (i7) {
            case 0:
                v5 v5Var = (v5) obj4;
                boolean[] zArr = (boolean[]) obj3;
                j5 j5Var = (j5) obj2;
                org.telegram.ui.ActionBar.m2 m2Var = j5Var.f30229c;
                Integer num = (Integer) obj;
                q5 q5Var = v5Var.B0;
                n5 n5Var = v5Var.f15585q1;
                if (num.intValue() == 0) {
                    zArr[0] = false;
                    v5Var.L0(null, new bi.b(v5Var, 28));
                    return Boolean.TRUE;
                } else if (num.intValue() == 5) {
                    zArr[0] = false;
                    c8.oa.c(2131624120, 2131747108, new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new String[]{"android.permission.ACCESS_COARSE_LOCATION"}, new ai.o2(4, new ai.o2(3, new ai.s1(18, v5Var, j5Var), true), true));
                    return Boolean.FALSE;
                } else if (num.intValue() == 6) {
                    a0 a0Var = v5Var.U1;
                    if (a0Var != null) {
                        a0Var.a();
                    }
                    return Boolean.TRUE;
                } else if (num.intValue() == 2) {
                    j5Var.dismiss();
                    nb nbVar = ((pa) v5Var).f15198o2;
                    nbVar.f15067d1.M.b(true);
                    nbVar.v();
                    nbVar.s(true);
                    nbVar.e(true);
                    return Boolean.TRUE;
                } else if (num.intValue() == 1) {
                    zArr[0] = false;
                    e7 e7Var = new e7(v5Var.getContext(), false, null, new ai.d0(v5Var, 28), new fi.b());
                    e7Var.n(new s4(v5Var, 3));
                    e7Var.show();
                    return Boolean.TRUE;
                } else if (num.intValue() == 3) {
                    v5Var.Z1 = true;
                    v5Var.c0(v5Var.k0(true));
                    return Boolean.TRUE;
                } else if (num.intValue() == 4) {
                    if (!i10.i(v5Var.f15583p1).q()) {
                        try {
                            m2Var.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                        new org.telegram.ui.Components.kc(m2Var, n5Var).Q(2131624217, 36, org.telegram.messenger.g0.x2(gd.N0(2131744391, null), new s4(v5Var, 1))).k(true);
                        return Boolean.FALSE;
                    }
                    int i10 = 0;
                    for (int i11 = 0; i11 < q5Var.getChildCount(); i11++) {
                        if (q5Var.getChildAt(i11) instanceof tg.p0) {
                            i10++;
                        }
                    }
                    if (i10 >= 3) {
                        new org.telegram.ui.Components.kc(m2Var, n5Var).I(2131624080, gd.N0(2131744394, null), gd.G(3, "StoryLinkLimitMessage", new Object[0])).k(true);
                        return Boolean.FALSE;
                    }
                    zArr[0] = false;
                    v5Var.K0(null);
                    j5Var.dismiss();
                    return Boolean.TRUE;
                } else {
                    return Boolean.FALSE;
                }
            case 1:
                final org.telegram.ui.Components.m0 m0Var = (org.telegram.ui.Components.m0) obj4;
                final org.telegram.ui.ActionBar.i6 i6Var = (org.telegram.ui.ActionBar.i6) obj3;
                Context context = (Context) obj2;
                org.telegram.ui.Components.k0 k0Var = (org.telegram.ui.Components.k0) obj;
                TL_aicompose.AiComposeTone aiComposeTone = k0Var.f36577e;
                if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
                    final TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) aiComposeTone;
                    x60 G = x60.G(m0Var.f30229c, i6Var, k0Var);
                    G.X(org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(12.0f), org.telegram.ui.ActionBar.n6.w0(org.telegram.ui.ActionBar.n6.f29451d6, i6Var)));
                    G.l(2131232121, gd.N0(2131754996, null), new Runnable() {
                        @Override
                        public final void run() {
                            boolean z10;
                            int i12 = r4;
                            TL_aicompose.TL_aiComposeTone tL_aiComposeTone2 = tL_aiComposeTone;
                            org.telegram.ui.ActionBar.i6 i6Var2 = i6Var;
                            m0 m0Var2 = m0Var;
                            switch (i12) {
                                case 0:
                                    h0 h0Var = new h0(m0Var2.getContext(), i6Var2);
                                    h0Var.f35586f2 = tL_aiComposeTone2;
                                    h0Var.d2 = Long.valueOf(tL_aiComposeTone2.emoji_id);
                                    h0Var.g1();
                                    h0Var.W1.setText(h0Var.f35586f2.title);
                                    h0Var.X1.setText(h0Var.f35586f2.prompt);
                                    if (h0Var.f35586f2.author_id != 0) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    h0Var.Z1.a(z10, false);
                                    h0Var.f39247p1.setTitle(org.telegram.messenger.gd.N0(2131754996, null));
                                    h0Var.f35584c2.setText(org.telegram.messenger.gd.N0(2131754979, null));
                                    h0Var.f1();
                                    h0Var.f35590j2.O(false);
                                    h0Var.f35588h2 = new f(m0Var2, 2);
                                    h0Var.show();
                                    return;
                                default:
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, m0Var2.getContext(), i6Var2);
                                    String N0 = org.telegram.messenger.gd.N0(2131754998, null);
                                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
                                    t1Var.S = N0;
                                    t1Var.U = org.telegram.messenger.gd.N0(2131754997, null);
                                    alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
                                    alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131751586, null), new oi.f0(24, m0Var2, tL_aiComposeTone2));
                                    alertDialog$Builder.d(-1);
                                    alertDialog$Builder.p();
                                    return;
                            }
                        }
                    }, tL_aiComposeTone.creator);
                    G.c(2131232368, gd.N0(2131754983, null), new oi.h(m0Var, tL_aiComposeTone, context, i6Var, 20), false);
                    G.m(2131232113, new ah(19, m0Var, tL_aiComposeTone), gd.N0(2131754985, null), !tL_aiComposeTone.creator, true);
                    G.m(2131232113, new Runnable() {
                        @Override
                        public final void run() {
                            boolean z10;
                            int i12 = r4;
                            TL_aicompose.TL_aiComposeTone tL_aiComposeTone2 = tL_aiComposeTone;
                            org.telegram.ui.ActionBar.i6 i6Var2 = i6Var;
                            m0 m0Var2 = m0Var;
                            switch (i12) {
                                case 0:
                                    h0 h0Var = new h0(m0Var2.getContext(), i6Var2);
                                    h0Var.f35586f2 = tL_aiComposeTone2;
                                    h0Var.d2 = Long.valueOf(tL_aiComposeTone2.emoji_id);
                                    h0Var.g1();
                                    h0Var.W1.setText(h0Var.f35586f2.title);
                                    h0Var.X1.setText(h0Var.f35586f2.prompt);
                                    if (h0Var.f35586f2.author_id != 0) {
                                        z10 = true;
                                    } else {
                                        z10 = false;
                                    }
                                    h0Var.Z1.a(z10, false);
                                    h0Var.f39247p1.setTitle(org.telegram.messenger.gd.N0(2131754996, null));
                                    h0Var.f35584c2.setText(org.telegram.messenger.gd.N0(2131754979, null));
                                    h0Var.f1();
                                    h0Var.f35590j2.O(false);
                                    h0Var.f35588h2 = new f(m0Var2, 2);
                                    h0Var.show();
                                    return;
                                default:
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, m0Var2.getContext(), i6Var2);
                                    String N0 = org.telegram.messenger.gd.N0(2131754998, null);
                                    org.telegram.ui.ActionBar.t1 t1Var = alertDialog$Builder.f28835a;
                                    t1Var.S = N0;
                                    t1Var.U = org.telegram.messenger.gd.N0(2131754997, null);
                                    alertDialog$Builder.h(org.telegram.messenger.gd.N0(2131752577, null), null);
                                    alertDialog$Builder.k(org.telegram.messenger.gd.N0(2131751586, null), new oi.f0(24, m0Var2, tL_aiComposeTone2));
                                    alertDialog$Builder.d(-1);
                                    alertDialog$Builder.p();
                                    return;
                            }
                        }
                    }, gd.N0(2131754998, null), tL_aiComposeTone.creator, true);
                    G.a0();
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
            case 2:
                View view = (View) obj;
                fj fjVar = ((th.g) obj2).f58350b;
                return th.c.d(view, (String) obj4, (String) obj3, fjVar.F0(), fjVar);
            default:
                ek0 ek0Var = (ek0) obj4;
                x10 x10Var = (x10) obj3;
                SparseIntArray sparseIntArray = (SparseIntArray) obj2;
                View view2 = (View) obj;
                try {
                    if (view2.getParent() != ek0Var) {
                        return Boolean.FALSE;
                    }
                    Boolean bool = (Boolean) x10Var.a(view2);
                    boolean booleanValue = bool.booleanValue();
                    v4.f1 T = ek0Var.T(view2);
                    if (T != null) {
                        sparseIntArray.put(T.f59249f, booleanValue ? 1 : 0);
                    }
                    return bool;
                } catch (Exception unused2) {
                    return Boolean.FALSE;
                }
        }
    }
}
