package bi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import di.ca;
import di.mb;
import org.telegram.messenger.hd;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.a41;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.i9;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.y31;
public final class h2 extends a41 {
    public static final int f3561b = 0;

    static {
        a41.h(new a41());
    }

    public static b41 i(int i7, TL_stars.StarGift starGift, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        b41 K = b41.K(h2.class);
        K.f33190u = 1;
        K.f33194z = i7;
        K.G = starGift;
        K.f33175e = z10;
        K.H = Boolean.valueOf(z11);
        K.f33187r = z13;
        K.f33186q = z12;
        K.f33189t = z14;
        return K;
    }

    @Override
    public final void a(uj0 uj0Var, View view, b41 b41Var) {
        ((i2) view).e(b41Var.h, false);
    }

    @Override
    public final void b(View view, b41 b41Var, boolean z10, p41 p41Var, u41 u41Var) {
        boolean z11;
        float f10;
        int i7;
        i2 i2Var = (i2) view;
        Object obj = b41Var.G;
        boolean z12 = false;
        if (obj instanceof ug.j) {
            ug.j jVar = (ug.j) obj;
            g2 g2Var = i2Var.K;
            TextView textView = i2Var.J;
            TextView textView2 = i2Var.I;
            e2 e2Var = i2Var.f3582e;
            i9 i9Var = i2Var.E;
            TextView textView3 = i2Var.M;
            TextView textView4 = i2Var.N;
            int d = jVar.d();
            if (i2Var.f3590k0 != jVar) {
                ca f12 = mb.f1(i9Var, i9Var.getImageReceiver(), d);
                i2Var.O = f12;
                f12.run();
                i2Var.O = null;
            }
            e2Var.d(null);
            e2Var.e(null);
            e2Var.g(null);
            textView2.setText(hd.G(d, "Gift2Months", new Object[0]));
            textView.setText(hd.M0(2131744230, null));
            textView2.setVisibility(0);
            textView.setVisibility(0);
            i9Var.setTranslationY(-org.telegram.messenger.g0.L(8.0f));
            i2Var.f3592n.setVisibility(8);
            i2Var.G.setVisibility(8);
            if (jVar.f58126c == null && jVar.d == null) {
                textView4.setVisibility(8);
            } else {
                if (org.telegram.ui.ActionBar.j6.I.q()) {
                    i7 = -1333971;
                } else {
                    i7 = -2722014;
                }
                textView4.setTextColor(i7);
                textView4.setVisibility(0);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("" + hd.E(jVar.g(), ','));
                spannableStringBuilder.setSpan(new y31(org.telegram.messenger.g0.o()), 0, spannableStringBuilder.length(), 33);
                eq[] eqVarArr = new eq[1];
                textView4.setText(mb.a1(false, hd.V(null, null, 2131747028, spannableStringBuilder), 0.48f, eqVarArr));
                eqVarArr[0].H = 0.8f;
            }
            FrameLayout.LayoutParams layoutParams = i2Var.F;
            layoutParams.gravity = 49;
            i9Var.setLayoutParams(layoutParams);
            textView3.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
            textView3.setTextSize(1, 12.0f);
            textView3.setText(jVar.c());
            i2Var.f3601t0 = 0;
            i2Var.L.setBackground(org.telegram.ui.ActionBar.j6.d0(org.telegram.messenger.g0.L(13.0f), 422810068));
            textView3.setTextColor(-13397548);
            ((ViewGroup.MarginLayoutParams) g2Var.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(130.0f);
            ((FrameLayout.LayoutParams) g2Var.getLayoutParams()).gravity = 49;
            i2Var.f3590k0 = jVar;
            i2Var.f3591l0 = null;
            i2Var.f3578b0 = jVar;
            i2Var.f3580c0 = null;
            i2Var.f3583e0 = false;
            i2Var.f3585f0 = null;
            i2Var.f3586g0 = false;
            i2Var.f3587h0 = false;
            i2Var.f3588i0 = false;
            i2Var.R = null;
            i2Var.S = null;
            i2Var.d(false, false);
            i2Var.l();
        } else if (obj instanceof TL_stars.StarGift) {
            TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
            boolean z13 = b41Var.f33175e;
            Object obj2 = b41Var.H;
            if (obj2 instanceof Boolean) {
                z11 = ((Boolean) obj2).booleanValue();
            } else {
                z11 = false;
            }
            i2Var.h(starGift, z13, z11, b41Var.f33186q, b41Var.f33187r, b41Var.f33189t);
        } else if (obj instanceof TL_stars.SavedStarGift) {
            z12 = i2Var.i((TL_stars.SavedStarGift) obj, b41Var.f33186q, b41Var.f33187r);
        }
        if (b41Var.f33176f) {
            i2Var.c(b41Var.f33175e, z12);
        }
        i2Var.e(b41Var.h, z12);
        FrameLayout frameLayout = i2Var.d;
        float f11 = 1.0f;
        if (b41Var.f33177g) {
            f10 = 1.0f;
        } else {
            f10 = 0.65f;
        }
        frameLayout.setAlpha(f10);
        j2 j2Var = i2Var.f3584f;
        if (!b41Var.f33177g) {
            f11 = 0.5f;
        }
        j2Var.setAlpha(f11);
    }

    @Override
    public final View d(Context context, uj0 uj0Var, int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        return new i2(i7, context, e6Var);
    }

    @Override
    public final boolean e(b41 b41Var, b41 b41Var2) {
        if (b41Var.f33186q == b41Var2.f33186q) {
            Object obj = b41Var.G;
            if (obj != null || b41Var2.G != null) {
                if (obj instanceof ug.j) {
                    if (obj == b41Var2.G) {
                        return true;
                    }
                    return false;
                }
                if (obj instanceof TL_stars.StarGift) {
                    Object obj2 = b41Var2.G;
                    if (obj2 instanceof TL_stars.StarGift) {
                        if (((TL_stars.StarGift) obj).f28280id == ((TL_stars.StarGift) obj2).f28280id) {
                            return true;
                        }
                        return false;
                    }
                }
                if (obj instanceof TL_stars.SavedStarGift) {
                    Object obj3 = b41Var2.G;
                    if (obj3 instanceof TL_stars.SavedStarGift) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                        TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj3;
                        if (savedStarGift.gift.f28280id == savedStarGift2.gift.f28280id && savedStarGift.date == savedStarGift2.date && savedStarGift.saved_id == savedStarGift2.saved_id) {
                            return true;
                        }
                        return false;
                    }
                }
            }
            if (b41Var.f33194z == b41Var2.f33194z && b41Var.f33175e == b41Var2.f33175e && b41Var.B == b41Var2.B && TextUtils.equals(b41Var.f33181l, b41Var2.f33181l)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
