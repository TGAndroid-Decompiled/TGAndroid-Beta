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
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.kq;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.p9;
public final class h3 extends m41 {
    public static final int f3636b = 0;

    static {
        m41.h(new m41());
    }

    public static n41 i(int i7, TL_stars.StarGift starGift, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        n41 K = n41.K(h3.class);
        K.v = 1;
        K.A = i7;
        K.H = starGift;
        K.f37648e = z10;
        K.I = Boolean.valueOf(z11);
        K.f37661s = z13;
        K.f37660r = z12;
        K.f37663u = z14;
        return K;
    }

    @Override
    public final void a(ek0 ek0Var, View view, n41 n41Var) {
        ((i3) view).e(n41Var.h, false);
    }

    @Override
    public final void b(View view, n41 n41Var, boolean z10, b51 b51Var, g51 g51Var) {
        boolean z11;
        float f10;
        int i7;
        i3 i3Var = (i3) view;
        Object obj = n41Var.H;
        boolean z12 = false;
        if (obj instanceof ug.j) {
            ug.j jVar = (ug.j) obj;
            g3 g3Var = i3Var.K;
            TextView textView = i3Var.J;
            TextView textView2 = i3Var.I;
            e3 e3Var = i3Var.f3666e;
            p9 p9Var = i3Var.E;
            TextView textView3 = i3Var.M;
            TextView textView4 = i3Var.N;
            int d = jVar.d();
            if (i3Var.f3674k0 != jVar) {
                fa g12 = pb.g1(p9Var, p9Var.getImageReceiver(), d);
                i3Var.O = g12;
                g12.run();
                i3Var.O = null;
            }
            e3Var.d(null);
            e3Var.e(null);
            e3Var.g(null);
            textView2.setText(gd.G(d, "Gift2Months", new Object[0]));
            textView.setText(gd.N0(2131743985, null));
            textView2.setVisibility(0);
            textView.setVisibility(0);
            p9Var.setTranslationY(-org.telegram.messenger.g0.L(8.0f));
            i3Var.f3676n.setVisibility(8);
            i3Var.G.setVisibility(8);
            if (jVar.f58828c == null && jVar.d == null) {
                textView4.setVisibility(8);
            } else {
                if (org.telegram.ui.ActionBar.n6.I.q()) {
                    i7 = -1333971;
                } else {
                    i7 = -2722014;
                }
                textView4.setTextColor(i7);
                textView4.setVisibility(0);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("" + gd.E(jVar.g(), ','));
                spannableStringBuilder.setSpan(new k41(org.telegram.messenger.g0.o()), 0, spannableStringBuilder.length(), 33);
                kq[] kqVarArr = new kq[1];
                textView4.setText(pb.b1(false, gd.V(null, null, 2131746834, spannableStringBuilder), 0.48f, kqVarArr));
                kqVarArr[0].H = 0.8f;
            }
            FrameLayout.LayoutParams layoutParams = i3Var.F;
            layoutParams.gravity = 49;
            p9Var.setLayoutParams(layoutParams);
            textView3.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
            textView3.setTextSize(1, 12.0f);
            textView3.setText(jVar.c());
            i3Var.f3685t0 = 0;
            i3Var.L.setBackground(org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(13.0f), 422810068));
            textView3.setTextColor(-13397548);
            ((ViewGroup.MarginLayoutParams) g3Var.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(130.0f);
            ((FrameLayout.LayoutParams) g3Var.getLayoutParams()).gravity = 49;
            i3Var.f3674k0 = jVar;
            i3Var.f3675l0 = null;
            i3Var.f3662b0 = jVar;
            i3Var.f3664c0 = null;
            i3Var.f3667e0 = false;
            i3Var.f3669f0 = null;
            i3Var.f3670g0 = false;
            i3Var.f3671h0 = false;
            i3Var.f3672i0 = false;
            i3Var.R = null;
            i3Var.S = null;
            i3Var.d(false, false);
            i3Var.l();
        } else if (obj instanceof TL_stars.StarGift) {
            TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
            boolean z13 = n41Var.f37648e;
            Object obj2 = n41Var.I;
            if (obj2 instanceof Boolean) {
                z11 = ((Boolean) obj2).booleanValue();
            } else {
                z11 = false;
            }
            i3Var.h(starGift, z13, z11, n41Var.f37660r, n41Var.f37661s, n41Var.f37663u);
        } else if (obj instanceof TL_stars.SavedStarGift) {
            z12 = i3Var.i((TL_stars.SavedStarGift) obj, n41Var.f37660r, n41Var.f37661s);
        }
        if (n41Var.f37649f) {
            i3Var.c(n41Var.f37648e, z12);
        }
        i3Var.e(n41Var.h, z12);
        FrameLayout frameLayout = i3Var.d;
        float f11 = 1.0f;
        if (n41Var.f37650g) {
            f10 = 1.0f;
        } else {
            f10 = 0.65f;
        }
        frameLayout.setAlpha(f10);
        j3 j3Var = i3Var.f3668f;
        if (!n41Var.f37650g) {
            f11 = 0.5f;
        }
        j3Var.setAlpha(f11);
    }

    @Override
    public final View d(Context context, ek0 ek0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        return new i3(i7, context, i6Var);
    }

    @Override
    public final boolean e(n41 n41Var, n41 n41Var2) {
        if (n41Var.f37660r == n41Var2.f37660r) {
            Object obj = n41Var.H;
            if (obj != null || n41Var2.H != null) {
                if (obj instanceof ug.j) {
                    if (obj == n41Var2.H) {
                        return true;
                    }
                    return false;
                }
                if (obj instanceof TL_stars.StarGift) {
                    Object obj2 = n41Var2.H;
                    if (obj2 instanceof TL_stars.StarGift) {
                        if (((TL_stars.StarGift) obj).f28721id == ((TL_stars.StarGift) obj2).f28721id) {
                            return true;
                        }
                        return false;
                    }
                }
                if (obj instanceof TL_stars.SavedStarGift) {
                    Object obj3 = n41Var2.H;
                    if (obj3 instanceof TL_stars.SavedStarGift) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                        TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj3;
                        if (savedStarGift.gift.f28721id == savedStarGift2.gift.f28721id && savedStarGift.date == savedStarGift2.date && savedStarGift.saved_id == savedStarGift2.saved_id) {
                            return true;
                        }
                        return false;
                    }
                }
            }
            if (n41Var.A == n41Var2.A && n41Var.f37648e == n41Var2.f37648e && n41Var.C == n41Var2.C && TextUtils.equals(n41Var.f37655m, n41Var2.f37655m)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
