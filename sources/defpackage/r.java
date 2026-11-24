package defpackage;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class r implements rac {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;

    public r(Context context, ylb ylbVar, EditTextBoldCursor editTextBoldCursor) {
        this.a = (byte) 4;
        this.d = context;
        this.c = ylbVar;
        this.b = editTextBoldCursor;
    }

    @Override
    public final Object a(Object obj) {
        Long l;
        byte b = this.a;
        Object obj2 = this.b;
        Object obj3 = this.c;
        Object obj4 = this.d;
        switch (b) {
            case 0:
                final a1 a1Var = (a1) obj2;
                final ylb ylbVar = (ylb) obj3;
                Context context = (Context) obj4;
                y0 y0Var = (y0) obj;
                TL_aicompose.AiComposeTone aiComposeTone = y0Var.e;
                if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
                    final TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) aiComposeTone;
                    bu5 G = bu5.G(a1Var.c, ylbVar, y0Var);
                    G.X(cmb.b0(gm.L(12.0f), cmb.v0(cmb.c6, ylbVar)));
                    G.k(2131232122, jb6.M0(2131754996, null), new Runnable() {
                        @Override
                        public final void run() {
                            boolean z;
                            byte b2 = r4;
                            TL_aicompose.TL_aiComposeTone tL_aiComposeTone2 = tL_aiComposeTone;
                            ylb ylbVar2 = ylbVar;
                            a1 a1Var2 = a1Var;
                            switch (b2) {
                                case 0:
                                    r0 r0Var = new r0(a1Var2.getContext(), ylbVar2);
                                    r0Var.e2 = tL_aiComposeTone2;
                                    r0Var.c2 = Long.valueOf(tL_aiComposeTone2.emoji_id);
                                    r0Var.a1();
                                    r0Var.V1.setText(r0Var.e2.title);
                                    r0Var.W1.setText(r0Var.e2.prompt);
                                    if (r0Var.e2.author_id != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    r0Var.Y1.a(z, false);
                                    r0Var.o1.setTitle(jb6.M0(2131754996, null));
                                    r0Var.b2.setText(jb6.M0(2131754979, null));
                                    r0Var.Z0();
                                    r0Var.i2.O(false);
                                    r0Var.g2 = new h(a1Var2, (byte) 2);
                                    r0Var.show();
                                    return;
                                default:
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ylbVar2, a1Var2.getContext());
                                    String M0 = jb6.M0(2131754998, null);
                                    he heVar = alertDialog$Builder.a;
                                    heVar.S = M0;
                                    heVar.U = jb6.M0(2131754997, null);
                                    alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                                    alertDialog$Builder.j(jb6.M0(2131751535, null), new o(a1Var2, tL_aiComposeTone2, (byte) 0));
                                    alertDialog$Builder.c(-1);
                                    alertDialog$Builder.o();
                                    return;
                            }
                        }
                    }, tL_aiComposeTone.creator);
                    G.b(2131232369, jb6.M0(2131754983, null), new l97(a1Var, tL_aiComposeTone, context, ylbVar, (byte) 5), false);
                    G.l(2131232114, new pf2(a1Var, tL_aiComposeTone, (byte) 15), jb6.M0(2131754985, null), !tL_aiComposeTone.creator, true);
                    G.l(2131232114, new Runnable() {
                        @Override
                        public final void run() {
                            boolean z;
                            byte b2 = r4;
                            TL_aicompose.TL_aiComposeTone tL_aiComposeTone2 = tL_aiComposeTone;
                            ylb ylbVar2 = ylbVar;
                            a1 a1Var2 = a1Var;
                            switch (b2) {
                                case 0:
                                    r0 r0Var = new r0(a1Var2.getContext(), ylbVar2);
                                    r0Var.e2 = tL_aiComposeTone2;
                                    r0Var.c2 = Long.valueOf(tL_aiComposeTone2.emoji_id);
                                    r0Var.a1();
                                    r0Var.V1.setText(r0Var.e2.title);
                                    r0Var.W1.setText(r0Var.e2.prompt);
                                    if (r0Var.e2.author_id != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    r0Var.Y1.a(z, false);
                                    r0Var.o1.setTitle(jb6.M0(2131754996, null));
                                    r0Var.b2.setText(jb6.M0(2131754979, null));
                                    r0Var.Z0();
                                    r0Var.i2.O(false);
                                    r0Var.g2 = new h(a1Var2, (byte) 2);
                                    r0Var.show();
                                    return;
                                default:
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, ylbVar2, a1Var2.getContext());
                                    String M0 = jb6.M0(2131754998, null);
                                    he heVar = alertDialog$Builder.a;
                                    heVar.S = M0;
                                    heVar.U = jb6.M0(2131754997, null);
                                    alertDialog$Builder.g(jb6.M0(2131752542, null), null);
                                    alertDialog$Builder.j(jb6.M0(2131751535, null), new o(a1Var2, tL_aiComposeTone2, (byte) 0));
                                    alertDialog$Builder.c(-1);
                                    alertDialog$Builder.o();
                                    return;
                            }
                        }
                    }, jb6.M0(2131754998, null), tL_aiComposeTone.creator, true);
                    G.a0();
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
            case 1:
                View view = (View) obj;
                k47 k47Var = ((vf8) obj4).b;
                return qf8.d(view, (String) obj2, (String) obj3, k47Var.F0(), k47Var);
            case 2:
                xv7 xv7Var = (xv7) obj2;
                boolean[] zArr = (boolean[]) obj3;
                nv7 nv7Var = (nv7) obj4;
                dy0 dy0Var = nv7Var.c;
                Integer num = (Integer) obj;
                tv7 tv7Var = xv7Var.H0;
                rk5 rk5Var = xv7Var.w1;
                if (num.intValue() == 0) {
                    zArr[0] = false;
                    xv7Var.L0(null, new vt4(xv7Var, (byte) 25));
                    return Boolean.TRUE;
                } else if (num.intValue() == 5) {
                    zArr[0] = false;
                    use.c(2131624120, 2131747035, new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new String[]{"android.permission.ACCESS_COARSE_LOCATION"}, new ra((byte) 10, new ra((byte) 9, new u35(xv7Var, nv7Var, (byte) 16), true), true));
                    return Boolean.FALSE;
                } else if (num.intValue() == 6) {
                    gd1 gd1Var = xv7Var.a2;
                    if (gd1Var != null) {
                        gd1Var.a();
                    }
                    return Boolean.TRUE;
                } else if (num.intValue() == 2) {
                    nv7Var.dismiss();
                    v9b v9bVar = ((z8b) xv7Var).u2;
                    v9bVar.d1.M.b(true);
                    v9bVar.u();
                    v9bVar.r(true);
                    v9bVar.c(true);
                    return Boolean.TRUE;
                } else if (num.intValue() == 1) {
                    zArr[0] = false;
                    zz9 zz9Var = new zz9(xv7Var.getContext(), false, null, new ci7(xv7Var, (byte) 7), new r63());
                    zz9Var.n(new dv7(xv7Var, (byte) 3));
                    zz9Var.show();
                    return Boolean.TRUE;
                } else if (num.intValue() == 3) {
                    xv7Var.f2 = true;
                    xv7Var.a0(xv7Var.i0(true));
                    return Boolean.TRUE;
                } else if (num.intValue() == 4) {
                    if (!z8c.h(xv7Var.v1).p()) {
                        try {
                            dy0Var.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                        new c41(dy0Var, rk5Var).Q(2131624211, 36, gm.N2(jb6.M0(2131744321, null), -1, 2, new dv7(xv7Var, (byte) 1), null)).k(true);
                        return Boolean.FALSE;
                    }
                    int i = 0;
                    for (int i2 = 0; i2 < tv7Var.getChildCount(); i2++) {
                        if (tv7Var.getChildAt(i2) instanceof o66) {
                            i++;
                        }
                    }
                    if (i >= 3) {
                        new c41(dy0Var, rk5Var).I(2131624080, jb6.M0(2131744324, null), jb6.G(3, "StoryLinkLimitMessage", new Object[0])).k(true);
                        return Boolean.FALSE;
                    }
                    zArr[0] = false;
                    xv7Var.K0(null);
                    nv7Var.dismiss();
                    return Boolean.TRUE;
                } else {
                    return Boolean.FALSE;
                }
            case 3:
                r59 r59Var = (r59) obj2;
                rac racVar = (rac) obj3;
                SparseIntArray sparseIntArray = (SparseIntArray) obj4;
                View view2 = (View) obj;
                try {
                    if (view2.getParent() != r59Var) {
                        return Boolean.FALSE;
                    }
                    Boolean bool = (Boolean) racVar.a(view2);
                    boolean booleanValue = bool.booleanValue();
                    u69 T = r59Var.T(view2);
                    if (T != null) {
                        sparseIntArray.put(T.f, booleanValue ? 1 : 0);
                    }
                    return bool;
                } catch (Exception unused2) {
                    return Boolean.FALSE;
                }
            default:
                ylb ylbVar2 = (ylb) obj3;
                TextView textView = new TextView((Context) obj4);
                textView.setGravity(17);
                textView.setTextSize(1, 13.0f);
                textView.setTypeface(gm.o());
                int i3 = cmb.Ei;
                anb.X(textView, i3, ylbVar2);
                ShapeDrawable b0 = cmb.b0(gm.L(13.0f), cmb.p1(0.15f, cmb.v0(i3, ylbVar2)));
                wmb K = anb.K(0.15f, i3);
                textView.setBackground(b0);
                anb.j(textView, b0, K, null, ylbVar2);
                textView.setText(nxa.R0(nxa.K0(l.longValue()) + " 💎", 0.75f));
                rve.a(textView);
                textView.setOnClickListener(new r39((EditTextBoldCursor) obj2, (Long) obj, (byte) 11));
                return textView;
        }
    }

    public r(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
    }
}
