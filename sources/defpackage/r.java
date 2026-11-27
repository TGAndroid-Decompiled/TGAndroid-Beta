package defpackage;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.util.SparseIntArray;
import android.view.View;
import android.widget.TextView;
import org.telegram.tgnet.tl.TL_aicompose;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.EditTextBoldCursor;
public final class r implements qcc {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;

    public r(Context context, vnb vnbVar, EditTextBoldCursor editTextBoldCursor) {
        this.a = (byte) 4;
        this.d = context;
        this.c = vnbVar;
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
                final b1 b1Var = (b1) obj2;
                final vnb vnbVar = (vnb) obj3;
                Context context = (Context) obj4;
                z0 z0Var = (z0) obj;
                TL_aicompose.AiComposeTone aiComposeTone = z0Var.e;
                if (aiComposeTone instanceof TL_aicompose.TL_aiComposeTone) {
                    final TL_aicompose.TL_aiComposeTone tL_aiComposeTone = (TL_aicompose.TL_aiComposeTone) aiComposeTone;
                    fu5 G = fu5.G(b1Var.c, vnbVar, z0Var);
                    G.X(aob.b0(hl.L(12.0f), aob.v0(aob.d6, vnbVar)));
                    G.k(2131232121, ob6.M0(2131754993, null), new Runnable() {
                        @Override
                        public final void run() {
                            boolean z;
                            byte b2 = r4;
                            TL_aicompose.TL_aiComposeTone tL_aiComposeTone2 = tL_aiComposeTone;
                            vnb vnbVar2 = vnbVar;
                            b1 b1Var2 = b1Var;
                            switch (b2) {
                                case 0:
                                    s0 s0Var = new s0(b1Var2.getContext(), vnbVar2);
                                    s0Var.e2 = tL_aiComposeTone2;
                                    s0Var.c2 = Long.valueOf(tL_aiComposeTone2.emoji_id);
                                    s0Var.b1();
                                    s0Var.V1.setText(s0Var.e2.title);
                                    s0Var.W1.setText(s0Var.e2.prompt);
                                    if (s0Var.e2.author_id != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    s0Var.Y1.a(z, false);
                                    s0Var.o1.setTitle(ob6.M0(2131754993, null));
                                    s0Var.b2.setText(ob6.M0(2131754976, null));
                                    s0Var.a1();
                                    s0Var.i2.O(false);
                                    s0Var.g2 = new h(b1Var2, (byte) 2);
                                    s0Var.show();
                                    return;
                                default:
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vnbVar2, b1Var2.getContext());
                                    String M0 = ob6.M0(2131754995, null);
                                    id idVar = alertDialog$Builder.a;
                                    idVar.S = M0;
                                    idVar.U = ob6.M0(2131754994, null);
                                    alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                                    alertDialog$Builder.j(ob6.M0(2131751563, null), new o(b1Var2, tL_aiComposeTone2, (byte) 0));
                                    alertDialog$Builder.c(-1);
                                    alertDialog$Builder.o();
                                    return;
                            }
                        }
                    }, tL_aiComposeTone.creator);
                    G.b(2131232368, ob6.M0(2131754980, null), new o97(b1Var, tL_aiComposeTone, context, vnbVar, (byte) 5), false);
                    G.l(2131232113, new ve2(b1Var, tL_aiComposeTone, (byte) 15), ob6.M0(2131754982, null), !tL_aiComposeTone.creator, true);
                    G.l(2131232113, new Runnable() {
                        @Override
                        public final void run() {
                            boolean z;
                            byte b2 = r4;
                            TL_aicompose.TL_aiComposeTone tL_aiComposeTone2 = tL_aiComposeTone;
                            vnb vnbVar2 = vnbVar;
                            b1 b1Var2 = b1Var;
                            switch (b2) {
                                case 0:
                                    s0 s0Var = new s0(b1Var2.getContext(), vnbVar2);
                                    s0Var.e2 = tL_aiComposeTone2;
                                    s0Var.c2 = Long.valueOf(tL_aiComposeTone2.emoji_id);
                                    s0Var.b1();
                                    s0Var.V1.setText(s0Var.e2.title);
                                    s0Var.W1.setText(s0Var.e2.prompt);
                                    if (s0Var.e2.author_id != 0) {
                                        z = true;
                                    } else {
                                        z = false;
                                    }
                                    s0Var.Y1.a(z, false);
                                    s0Var.o1.setTitle(ob6.M0(2131754993, null));
                                    s0Var.b2.setText(ob6.M0(2131754976, null));
                                    s0Var.a1();
                                    s0Var.i2.O(false);
                                    s0Var.g2 = new h(b1Var2, (byte) 2);
                                    s0Var.show();
                                    return;
                                default:
                                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, vnbVar2, b1Var2.getContext());
                                    String M0 = ob6.M0(2131754995, null);
                                    id idVar = alertDialog$Builder.a;
                                    idVar.S = M0;
                                    idVar.U = ob6.M0(2131754994, null);
                                    alertDialog$Builder.g(ob6.M0(2131752570, null), null);
                                    alertDialog$Builder.j(ob6.M0(2131751563, null), new o(b1Var2, tL_aiComposeTone2, (byte) 0));
                                    alertDialog$Builder.c(-1);
                                    alertDialog$Builder.o();
                                    return;
                            }
                        }
                    }, ob6.M0(2131754995, null), tL_aiComposeTone.creator, true);
                    G.a0();
                    return Boolean.TRUE;
                }
                return Boolean.FALSE;
            case 1:
                View view = (View) obj;
                r47 r47Var = ((hh8) obj4).b;
                return ch8.d(view, (String) obj2, (String) obj3, r47Var.F0(), r47Var);
            case 2:
                dx7 dx7Var = (dx7) obj2;
                boolean[] zArr = (boolean[]) obj3;
                tw7 tw7Var = (tw7) obj4;
                ex0 ex0Var = tw7Var.c;
                Integer num = (Integer) obj;
                zw7 zw7Var = dx7Var.B0;
                uk5 uk5Var = dx7Var.q1;
                if (num.intValue() == 0) {
                    zArr[0] = false;
                    dx7Var.K0(null, new yt4(dx7Var, (byte) 25));
                    return Boolean.TRUE;
                } else if (num.intValue() == 5) {
                    zArr[0] = false;
                    jve.c(2131624120, 2131747029, new String[]{"android.permission.ACCESS_COARSE_LOCATION", "android.permission.ACCESS_FINE_LOCATION"}, new String[]{"android.permission.ACCESS_COARSE_LOCATION"}, new sa((byte) 10, new sa((byte) 9, new v35(dx7Var, tw7Var, (byte) 16), true), true));
                    return Boolean.FALSE;
                } else if (num.intValue() == 6) {
                    gc1 gc1Var = dx7Var.U1;
                    if (gc1Var != null) {
                        gc1Var.a();
                    }
                    return Boolean.TRUE;
                } else if (num.intValue() == 2) {
                    tw7Var.dismiss();
                    sbb sbbVar = ((wab) dx7Var).o2;
                    sbbVar.d1.M.b(true);
                    sbbVar.u();
                    sbbVar.r(true);
                    sbbVar.c(true);
                    return Boolean.TRUE;
                } else if (num.intValue() == 1) {
                    zArr[0] = false;
                    r1a r1aVar = new r1a(dx7Var.getContext(), false, null, new ji7(dx7Var, (byte) 8), new x53());
                    r1aVar.n(new iw7(dx7Var, (byte) 3));
                    r1aVar.show();
                    return Boolean.TRUE;
                } else if (num.intValue() == 3) {
                    dx7Var.Z1 = true;
                    dx7Var.a0(dx7Var.i0(true));
                    return Boolean.TRUE;
                } else if (num.intValue() == 4) {
                    if (!yac.h(dx7Var.p1).p()) {
                        try {
                            ex0Var.performHapticFeedback(3);
                        } catch (Exception unused) {
                        }
                        new d31(ex0Var, uk5Var).Q(2131624211, 36, hl.N2(ob6.M0(2131744289, null), -1, 2, new iw7(dx7Var, (byte) 1), null)).k(true);
                        return Boolean.FALSE;
                    }
                    int i = 0;
                    for (int i2 = 0; i2 < zw7Var.getChildCount(); i2++) {
                        if (zw7Var.getChildAt(i2) instanceof s66) {
                            i++;
                        }
                    }
                    if (i >= 3) {
                        new d31(ex0Var, uk5Var).I(2131624080, ob6.M0(2131744292, null), ob6.G(3, "StoryLinkLimitMessage", new Object[0])).k(true);
                        return Boolean.FALSE;
                    }
                    zArr[0] = false;
                    dx7Var.J0(null);
                    tw7Var.dismiss();
                    return Boolean.TRUE;
                } else {
                    return Boolean.FALSE;
                }
            case 3:
                d79 d79Var = (d79) obj2;
                qcc qccVar = (qcc) obj3;
                SparseIntArray sparseIntArray = (SparseIntArray) obj4;
                View view2 = (View) obj;
                try {
                    if (view2.getParent() != d79Var) {
                        return Boolean.FALSE;
                    }
                    Boolean bool = (Boolean) qccVar.a(view2);
                    boolean booleanValue = bool.booleanValue();
                    f89 U = d79Var.U(view2);
                    if (U != null) {
                        sparseIntArray.put(U.f, booleanValue ? 1 : 0);
                    }
                    return bool;
                } catch (Exception unused2) {
                    return Boolean.FALSE;
                }
            default:
                vnb vnbVar2 = (vnb) obj3;
                TextView textView = new TextView((Context) obj4);
                textView.setGravity(17);
                textView.setTextSize(1, 13.0f);
                textView.setTypeface(hl.o());
                int i3 = aob.Fi;
                yob.X(textView, i3, vnbVar2);
                ShapeDrawable b0 = aob.b0(hl.L(13.0f), aob.p1(0.15f, aob.v0(i3, vnbVar2)));
                uob K = yob.K(0.15f, i3);
                textView.setBackground(b0);
                yob.j(textView, b0, K, null, vnbVar2);
                textView.setText(nza.R0(nza.K0(l.longValue()) + " 💎", 0.75f));
                iye.a(textView);
                textView.setOnClickListener(new jy8((EditTextBoldCursor) obj2, (Long) obj, (byte) 13));
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
