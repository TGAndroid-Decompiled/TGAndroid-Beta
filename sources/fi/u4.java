package fi;

import android.content.Context;
import android.util.SparseIntArray;
import android.view.View;
import org.telegram.messenger.d20;
import org.telegram.messenger.id;
import org.telegram.messenger.ij;
import org.telegram.messenger.p10;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.k60;
import org.telegram.ui.Components.pj0;
import org.telegram.ui.fq;
public final class u4 implements d20 {
    public final int f12889a;
    public final Object f12890b;
    public final Object f12891c;
    public final Object d;

    public u4(Object obj, Object obj2, Object obj3, int i7) {
        this.f12889a = i7;
        this.f12890b = obj;
        this.f12891c = obj2;
        this.d = obj3;
    }

    @Override
    public final Object a(Object obj) {
        int i7 = this.f12889a;
        Object obj2 = this.d;
        Object obj3 = this.f12891c;
        Object obj4 = this.f12890b;
        switch (i7) {
            case 0:
                o5 o5Var = (o5) obj4;
                boolean[] zArr = (boolean[]) obj3;
                c5 c5Var = (c5) obj2;
                org.telegram.ui.ActionBar.m2 m2Var = c5Var.f28675c;
                Integer num = (Integer) obj;
                j5 j5Var = o5Var.A0;
                g5 g5Var = o5Var.f12542p1;
                if (num.intValue() == 0) {
                    zArr[0] = false;
                    o5Var.I0(null, new ai.e(o5Var, 19));
                    return Boolean.TRUE;
                } else if (num.intValue() == 5) {
                    zArr[0] = false;
                    c8.ia.c(2131624119, 2131747302, new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new String[]{"android.permission.ACCESS_COARSE_LOCATION"}, new bi.b9(3, new bi.b9(2, new ai.f1(10, o5Var, c5Var), true), true));
                    return Boolean.FALSE;
                } else if (num.intValue() == 2) {
                    c5Var.dismiss();
                    va vaVar = ((x9) o5Var).f13104j2;
                    vaVar.f12946c1.L.b(true);
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
                    if (!p10.i(o5Var.f12540o1).q()) {
                        try {
                            m2Var.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                        new gc(m2Var, g5Var).Q(2131624216, 36, org.telegram.messenger.g0.x2(id.M0(2131744635, null), new m4(o5Var, 1))).k(true);
                        return Boolean.FALSE;
                    }
                    int i10 = 0;
                    for (int i11 = 0; i11 < j5Var.getChildCount(); i11++) {
                        if (j5Var.getChildAt(i11) instanceof tg.k0) {
                            i10++;
                        }
                    }
                    if (i10 >= 3) {
                        new gc(m2Var, g5Var).I(2131624079, id.M0(2131744638, null), id.G(3, "StoryLinkLimitMessage", new Object[0])).k(true);
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
                final org.telegram.ui.Components.f0 f0Var = (org.telegram.ui.Components.f0) obj4;
                final org.telegram.ui.ActionBar.h6 h6Var = (org.telegram.ui.ActionBar.h6) obj3;
                Context context = (Context) obj2;
                org.telegram.ui.Components.d0 d0Var = (org.telegram.ui.Components.d0) obj;
                TL_aicompose.AiComposeTone aiComposeTone = d0Var.f32838e;
                if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
                    final TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) aiComposeTone;
                    k60 F = k60.F(f0Var.f28675c, h6Var, d0Var);
                    F.W(org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(12.0f), org.telegram.ui.ActionBar.m6.w0(org.telegram.ui.ActionBar.m6.f27890d6, h6Var)));
                    F.l(2131232116, id.M0(2131754996, null), new Runnable() {
                        @Override
                        public final void run() {
                            boolean z9;
                            int i12 = r4;
                            TL_aicompose.TL_aiComposeTone tL_aiComposeTone2 = tL_aiComposeTone;
                            org.telegram.ui.ActionBar.h6 h6Var2 = h6Var;
                            f0 f0Var2 = f0Var;
                            switch (i12) {
                                case 0:
                                    z zVar = new z(f0Var2.getContext(), h6Var2);
                                    zVar.f40781e2 = tL_aiComposeTone2;
                                    zVar.f40780c2 = Long.valueOf(tL_aiComposeTone2.emoji_id);
                                    zVar.f1();
                                    zVar.V1.setText(zVar.f40781e2.title);
                                    zVar.W1.setText(zVar.f40781e2.prompt);
                                    if (zVar.f40781e2.author_id != 0) {
                                        z9 = true;
                                    } else {
                                        z9 = false;
                                    }
                                    zVar.Y1.a(z9, false);
                                    zVar.f35902o1.setTitle(org.telegram.messenger.id.M0(2131754996, null));
                                    zVar.f40779b2.setText(org.telegram.messenger.id.M0(2131754979, null));
                                    zVar.e1();
                                    zVar.f40785i2.O(false);
                                    zVar.f40783g2 = new f(f0Var2, 2);
                                    zVar.show();
                                    return;
                                default:
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, f0Var2.getContext(), h6Var2);
                                    String M0 = org.telegram.messenger.id.M0(2131754998, null);
                                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
                                    u1Var.R = M0;
                                    u1Var.T = org.telegram.messenger.id.M0(2131754997, null);
                                    alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                                    alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751598, null), new ni.c(22, f0Var2, tL_aiComposeTone2));
                                    alertDialog$Builder.d(-1);
                                    alertDialog$Builder.p();
                                    return;
                            }
                        }
                    }, tL_aiComposeTone.creator);
                    F.c(2131232363, id.M0(2131754983, null), new org.telegram.ui.m6(f0Var, tL_aiComposeTone, context, h6Var, 14), false);
                    F.m(2131232108, new fq(1, f0Var, tL_aiComposeTone), id.M0(2131754985, null), !tL_aiComposeTone.creator, true);
                    F.m(2131232108, new Runnable() {
                        @Override
                        public final void run() {
                            boolean z9;
                            int i12 = r4;
                            TL_aicompose.TL_aiComposeTone tL_aiComposeTone2 = tL_aiComposeTone;
                            org.telegram.ui.ActionBar.h6 h6Var2 = h6Var;
                            f0 f0Var2 = f0Var;
                            switch (i12) {
                                case 0:
                                    z zVar = new z(f0Var2.getContext(), h6Var2);
                                    zVar.f40781e2 = tL_aiComposeTone2;
                                    zVar.f40780c2 = Long.valueOf(tL_aiComposeTone2.emoji_id);
                                    zVar.f1();
                                    zVar.V1.setText(zVar.f40781e2.title);
                                    zVar.W1.setText(zVar.f40781e2.prompt);
                                    if (zVar.f40781e2.author_id != 0) {
                                        z9 = true;
                                    } else {
                                        z9 = false;
                                    }
                                    zVar.Y1.a(z9, false);
                                    zVar.f35902o1.setTitle(org.telegram.messenger.id.M0(2131754996, null));
                                    zVar.f40779b2.setText(org.telegram.messenger.id.M0(2131754979, null));
                                    zVar.e1();
                                    zVar.f40785i2.O(false);
                                    zVar.f40783g2 = new f(f0Var2, 2);
                                    zVar.show();
                                    return;
                                default:
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, f0Var2.getContext(), h6Var2);
                                    String M0 = org.telegram.messenger.id.M0(2131754998, null);
                                    org.telegram.ui.ActionBar.u1 u1Var = alertDialog$Builder.f27300a;
                                    u1Var.R = M0;
                                    u1Var.T = org.telegram.messenger.id.M0(2131754997, null);
                                    alertDialog$Builder.h(org.telegram.messenger.id.M0(2131752589, null), null);
                                    alertDialog$Builder.k(org.telegram.messenger.id.M0(2131751598, null), new ni.c(22, f0Var2, tL_aiComposeTone2));
                                    alertDialog$Builder.d(-1);
                                    alertDialog$Builder.p();
                                    return;
                            }
                        }
                    }, id.M0(2131754998, null), tL_aiComposeTone.creator, true);
                    F.Z();
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
            case 2:
                View view = (View) obj;
                ij ijVar = ((th.g) obj2).f56072b;
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
                        sparseIntArray.put(T.f57056f, booleanValue ? 1 : 0);
                    }
                    return bool;
                } catch (Exception unused2) {
                    return Boolean.FALSE;
                }
        }
    }
}
