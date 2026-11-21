package bi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import di.fa;
import di.pb;
import org.telegram.messenger.gd;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.nq;
import org.telegram.ui.Components.o41;
import org.telegram.ui.Components.q9;
public final class f3 extends n41 {
    public static final int f3614b = 0;

    static {
        n41.h(new n41());
    }

    public static o41 i(int i7, TL_stars.StarGift starGift, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        o41 K = o41.K(f3.class);
        K.v = 1;
        K.A = i7;
        K.H = starGift;
        K.f38091e = z10;
        K.I = Boolean.valueOf(z11);
        K.f38104s = z13;
        K.f38103r = z12;
        K.f38106u = z14;
        return K;
    }

    @Override
    public final void a(ek0 ek0Var, View view, o41 o41Var) {
        ((g3) view).e(o41Var.h, false);
    }

    @Override
    public final void b(View view, o41 o41Var, boolean z10, c51 c51Var, h51 h51Var) {
        boolean z11;
        float f10;
        int i7;
        g3 g3Var = (g3) view;
        Object obj = o41Var.H;
        boolean z12 = false;
        if (obj instanceof ug.j) {
            ug.j jVar = (ug.j) obj;
            e3 e3Var = g3Var.K;
            TextView textView = g3Var.J;
            TextView textView2 = g3Var.I;
            c3 c3Var = g3Var.f3644e;
            q9 q9Var = g3Var.E;
            TextView textView3 = g3Var.M;
            TextView textView4 = g3Var.N;
            int d = jVar.d();
            if (g3Var.f3652k0 != jVar) {
                fa g12 = pb.g1(q9Var, q9Var.getImageReceiver(), d);
                g3Var.O = g12;
                g12.run();
                g3Var.O = null;
            }
            c3Var.d(null);
            c3Var.e(null);
            c3Var.g(null);
            textView2.setText(gd.G(d, "Gift2Months", new Object[0]));
            textView.setText(gd.N0(2131743989, null));
            textView2.setVisibility(0);
            textView.setVisibility(0);
            q9Var.setTranslationY(-org.telegram.messenger.g0.L(8.0f));
            g3Var.f3654n.setVisibility(8);
            g3Var.G.setVisibility(8);
            if (jVar.f58744c == null && jVar.d == null) {
                textView4.setVisibility(8);
            } else {
                if (org.telegram.ui.ActionBar.m6.I.q()) {
                    i7 = -1333971;
                } else {
                    i7 = -2722014;
                }
                textView4.setTextColor(i7);
                textView4.setVisibility(0);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("" + gd.E(jVar.g(), ','));
                spannableStringBuilder.setSpan(new l41(org.telegram.messenger.g0.o()), 0, spannableStringBuilder.length(), 33);
                nq[] nqVarArr = new nq[1];
                textView4.setText(pb.b1(false, gd.V(null, null, 2131746834, spannableStringBuilder), 0.48f, nqVarArr));
                nqVarArr[0].H = 0.8f;
            }
            FrameLayout.LayoutParams layoutParams = g3Var.F;
            layoutParams.gravity = 49;
            q9Var.setLayoutParams(layoutParams);
            textView3.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
            textView3.setTextSize(1, 12.0f);
            textView3.setText(jVar.c());
            g3Var.f3663t0 = 0;
            g3Var.L.setBackground(org.telegram.ui.ActionBar.m6.d0(org.telegram.messenger.g0.L(13.0f), 422810068));
            textView3.setTextColor(-13397548);
            ((ViewGroup.MarginLayoutParams) e3Var.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(130.0f);
            ((FrameLayout.LayoutParams) e3Var.getLayoutParams()).gravity = 49;
            g3Var.f3652k0 = jVar;
            g3Var.f3653l0 = null;
            g3Var.f3640b0 = jVar;
            g3Var.f3642c0 = null;
            g3Var.f3645e0 = false;
            g3Var.f3647f0 = null;
            g3Var.f3648g0 = false;
            g3Var.f3649h0 = false;
            g3Var.f3650i0 = false;
            g3Var.R = null;
            g3Var.S = null;
            g3Var.d(false, false);
            g3Var.l();
        } else if (obj instanceof TL_stars.StarGift) {
            TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
            boolean z13 = o41Var.f38091e;
            Object obj2 = o41Var.I;
            if (obj2 instanceof Boolean) {
                z11 = ((Boolean) obj2).booleanValue();
            } else {
                z11 = false;
            }
            g3Var.h(starGift, z13, z11, o41Var.f38103r, o41Var.f38104s, o41Var.f38106u);
        } else if (obj instanceof TL_stars.SavedStarGift) {
            z12 = g3Var.i((TL_stars.SavedStarGift) obj, o41Var.f38103r, o41Var.f38104s);
        }
        if (o41Var.f38092f) {
            g3Var.c(o41Var.f38091e, z12);
        }
        g3Var.e(o41Var.h, z12);
        FrameLayout frameLayout = g3Var.d;
        float f11 = 1.0f;
        if (o41Var.f38093g) {
            f10 = 1.0f;
        } else {
            f10 = 0.65f;
        }
        frameLayout.setAlpha(f10);
        h3 h3Var = g3Var.f3646f;
        if (!o41Var.f38093g) {
            f11 = 0.5f;
        }
        h3Var.setAlpha(f11);
    }

    @Override
    public final View d(Context context, ek0 ek0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        return new g3(i7, context, h6Var);
    }

    @Override
    public final boolean e(o41 o41Var, o41 o41Var2) {
        if (o41Var.f38103r == o41Var2.f38103r) {
            Object obj = o41Var.H;
            if (obj != null || o41Var2.H != null) {
                if (obj instanceof ug.j) {
                    if (obj == o41Var2.H) {
                        return true;
                    }
                    return false;
                }
                if (obj instanceof TL_stars.StarGift) {
                    Object obj2 = o41Var2.H;
                    if (obj2 instanceof TL_stars.StarGift) {
                        if (((TL_stars.StarGift) obj).f28660id == ((TL_stars.StarGift) obj2).f28660id) {
                            return true;
                        }
                        return false;
                    }
                }
                if (obj instanceof TL_stars.SavedStarGift) {
                    Object obj3 = o41Var2.H;
                    if (obj3 instanceof TL_stars.SavedStarGift) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                        TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj3;
                        if (savedStarGift.gift.f28660id == savedStarGift2.gift.f28660id && savedStarGift.date == savedStarGift2.date && savedStarGift.saved_id == savedStarGift2.saved_id) {
                            return true;
                        }
                        return false;
                    }
                }
            }
            if (o41Var.A == o41Var2.A && o41Var.f38091e == o41Var2.f38091e && o41Var.C == o41Var2.C && TextUtils.equals(o41Var.f38098m, o41Var2.f38098m)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
