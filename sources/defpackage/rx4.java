package defpackage;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import org.telegram.tgnet.tl.TL_stars;
public final class rx4 extends a8c {
    public static final int b = 0;

    static {
        a8c.h(new a8c());
    }

    public static b8c i(int i, TL_stars.StarGift starGift, boolean z, boolean z2, boolean z3, boolean z4, boolean z5) {
        b8c K = b8c.K(rx4.class);
        K.v = 1;
        K.A = i;
        K.H = starGift;
        K.e = z;
        K.I = Boolean.valueOf(z2);
        K.s = z4;
        K.r = z3;
        K.u = z5;
        return K;
    }

    @Override
    public final void a(d79 d79Var, View view, b8c b8cVar) {
        ((sx4) view).e(b8cVar.h, false);
    }

    @Override
    public final void b(View view, b8c b8cVar, boolean z, l9c l9cVar, q9c q9cVar) {
        boolean z2;
        float f;
        int i;
        sx4 sx4Var = (sx4) view;
        Object obj = b8cVar.H;
        boolean z3 = false;
        if (obj instanceof pw4) {
            pw4 pw4Var = (pw4) obj;
            zc zcVar = sx4Var.K;
            TextView textView = sx4Var.J;
            TextView textView2 = sx4Var.I;
            TextView textView3 = sx4Var.N;
            px4 px4Var = sx4Var.e;
            de0 de0Var = sx4Var.E;
            TextView textView4 = sx4Var.M;
            int d = pw4Var.d();
            if (sx4Var.k0 != pw4Var) {
                gya g1 = nza.g1(de0Var, de0Var.getImageReceiver(), d);
                sx4Var.O = g1;
                g1.run();
                sx4Var.O = null;
            }
            px4Var.d(null);
            px4Var.e(null);
            px4Var.g(null);
            textView2.setText(ob6.G(d, "Gift2Months", new Object[0]));
            textView.setText(ob6.M0(2131743883, null));
            textView2.setVisibility(0);
            textView.setVisibility(0);
            de0Var.setTranslationY(-hl.L(8.0f));
            sx4Var.n.setVisibility(8);
            sx4Var.G.setVisibility(8);
            if (pw4Var.c == null && pw4Var.d == null) {
                textView3.setVisibility(8);
            } else {
                if (aob.I.o()) {
                    i = -1333971;
                } else {
                    i = -2722014;
                }
                textView3.setTextColor(i);
                textView3.setVisibility(0);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(ob6.E(pw4Var.g(), ','));
                spannableStringBuilder.setSpan(new y7c(hl.o()), 0, spannableStringBuilder.length(), 33);
                wm2[] wm2VarArr = new wm2[1];
                textView3.setText(nza.b1(false, ob6.V(null, null, 2131746757, spannableStringBuilder), 0.48f, wm2VarArr));
                wm2VarArr[0].H = 0.8f;
            }
            FrameLayout.LayoutParams layoutParams = sx4Var.F;
            layoutParams.gravity = 49;
            de0Var.setLayoutParams(layoutParams);
            textView4.setPadding(hl.L(10.0f), 0, hl.L(10.0f), 0);
            textView4.setTextSize(1, 12.0f);
            textView4.setText(pw4Var.c());
            sx4Var.t0 = (byte) 0;
            sx4Var.L.setBackground(aob.b0(hl.L(13.0f), 422810068));
            textView4.setTextColor(-13397548);
            ((ViewGroup.MarginLayoutParams) zcVar.getLayoutParams()).topMargin = hl.L(130.0f);
            ((FrameLayout.LayoutParams) zcVar.getLayoutParams()).gravity = 49;
            sx4Var.k0 = pw4Var;
            sx4Var.l0 = null;
            sx4Var.b0 = pw4Var;
            sx4Var.c0 = null;
            sx4Var.e0 = false;
            sx4Var.f0 = null;
            sx4Var.g0 = false;
            sx4Var.h0 = false;
            sx4Var.i0 = false;
            sx4Var.R = null;
            sx4Var.S = null;
            sx4Var.d(false, false);
            sx4Var.l();
        } else if (obj instanceof TL_stars.StarGift) {
            TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
            boolean z4 = b8cVar.e;
            Object obj2 = b8cVar.I;
            if (obj2 instanceof Boolean) {
                z2 = ((Boolean) obj2).booleanValue();
            } else {
                z2 = false;
            }
            sx4Var.h(starGift, z4, z2, b8cVar.r, b8cVar.s, b8cVar.u);
        } else if (obj instanceof TL_stars.SavedStarGift) {
            z3 = sx4Var.i((TL_stars.SavedStarGift) obj, b8cVar.r, b8cVar.s);
        }
        if (b8cVar.f) {
            sx4Var.c(b8cVar.e, z3);
        }
        sx4Var.e(b8cVar.h, z3);
        FrameLayout frameLayout = sx4Var.d;
        float f2 = 1.0f;
        if (b8cVar.g) {
            f = 1.0f;
        } else {
            f = 0.65f;
        }
        frameLayout.setAlpha(f);
        tx4 tx4Var = sx4Var.f;
        if (!b8cVar.g) {
            f2 = 0.5f;
        }
        tx4Var.setAlpha(f2);
    }

    @Override
    public final View d(Context context, d79 d79Var, int i, vnb vnbVar) {
        return new sx4(i, vnbVar, context);
    }

    @Override
    public final boolean e(b8c b8cVar, b8c b8cVar2) {
        if (b8cVar.r == b8cVar2.r) {
            Object obj = b8cVar.H;
            if (obj != null || b8cVar2.H != null) {
                if (obj instanceof pw4) {
                    if (obj == b8cVar2.H) {
                        return true;
                    }
                    return false;
                }
                if (obj instanceof TL_stars.StarGift) {
                    Object obj2 = b8cVar2.H;
                    if (obj2 instanceof TL_stars.StarGift) {
                        if (((TL_stars.StarGift) obj).id == ((TL_stars.StarGift) obj2).id) {
                            return true;
                        }
                        return false;
                    }
                }
                if (obj instanceof TL_stars.SavedStarGift) {
                    Object obj3 = b8cVar2.H;
                    if (obj3 instanceof TL_stars.SavedStarGift) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                        TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj3;
                        if (savedStarGift.gift.id == savedStarGift2.gift.id && savedStarGift.date == savedStarGift2.date && savedStarGift.saved_id == savedStarGift2.saved_id) {
                            return true;
                        }
                        return false;
                    }
                }
            }
            if (b8cVar.A == b8cVar2.A && b8cVar.e == b8cVar2.e && b8cVar.C == b8cVar2.C && TextUtils.equals(b8cVar.m, b8cVar2.m)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
