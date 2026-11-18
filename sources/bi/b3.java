package bi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import di.ea;
import di.pb;
import org.telegram.messenger.gd;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.i41;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.q9;
import org.telegram.ui.Components.z41;
public final class b3 extends k41 {
    public static final int f3449b = 0;

    static {
        k41.h(new k41());
    }

    public static l41 i(int i7, TL_stars.StarGift starGift, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        l41 K = l41.K(b3.class);
        K.v = 1;
        K.A = i7;
        K.H = starGift;
        K.f37011e = z10;
        K.I = Boolean.valueOf(z11);
        K.f37024s = z13;
        K.f37023r = z12;
        K.f37026u = z14;
        return K;
    }

    @Override
    public final void a(ck0 ck0Var, View view, l41 l41Var) {
        ((c3) view).e(l41Var.h, false);
    }

    @Override
    public final void b(View view, l41 l41Var, boolean z10, z41 z41Var, e51 e51Var) {
        boolean z11;
        float f10;
        int i7;
        c3 c3Var = (c3) view;
        Object obj = l41Var.H;
        boolean z12 = false;
        if (obj instanceof ug.j) {
            ug.j jVar = (ug.j) obj;
            a3 a3Var = c3Var.K;
            TextView textView = c3Var.J;
            TextView textView2 = c3Var.I;
            y2 y2Var = c3Var.f3494e;
            q9 q9Var = c3Var.E;
            TextView textView3 = c3Var.M;
            TextView textView4 = c3Var.N;
            int d = jVar.d();
            if (c3Var.f3502k0 != jVar) {
                ea g12 = pb.g1(q9Var, q9Var.getImageReceiver(), d);
                c3Var.O = g12;
                g12.run();
                c3Var.O = null;
            }
            y2Var.d(null);
            y2Var.e(null);
            y2Var.g(null);
            textView2.setText(gd.G(d, "Gift2Months", new Object[0]));
            textView.setText(gd.M0(2131743995, null));
            textView2.setVisibility(0);
            textView.setVisibility(0);
            q9Var.setTranslationY(-org.telegram.messenger.g0.L(8.0f));
            c3Var.f3504n.setVisibility(8);
            c3Var.G.setVisibility(8);
            if (jVar.f58704c == null && jVar.d == null) {
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
                spannableStringBuilder.setSpan(new i41(org.telegram.messenger.g0.o()), 0, spannableStringBuilder.length(), 33);
                lq[] lqVarArr = new lq[1];
                textView4.setText(pb.b1(false, gd.V(null, null, 2131746835, spannableStringBuilder), 0.48f, lqVarArr));
                lqVarArr[0].H = 0.8f;
            }
            FrameLayout.LayoutParams layoutParams = c3Var.F;
            layoutParams.gravity = 49;
            q9Var.setLayoutParams(layoutParams);
            textView3.setPadding(org.telegram.messenger.g0.L(10.0f), 0, org.telegram.messenger.g0.L(10.0f), 0);
            textView3.setTextSize(1, 12.0f);
            textView3.setText(jVar.c());
            c3Var.f3513t0 = 0;
            c3Var.L.setBackground(org.telegram.ui.ActionBar.n6.d0(org.telegram.messenger.g0.L(13.0f), 422810068));
            textView3.setTextColor(-13397548);
            ((ViewGroup.MarginLayoutParams) a3Var.getLayoutParams()).topMargin = org.telegram.messenger.g0.L(130.0f);
            ((FrameLayout.LayoutParams) a3Var.getLayoutParams()).gravity = 49;
            c3Var.f3502k0 = jVar;
            c3Var.f3503l0 = null;
            c3Var.f3490b0 = jVar;
            c3Var.f3492c0 = null;
            c3Var.f3495e0 = false;
            c3Var.f3497f0 = null;
            c3Var.f3498g0 = false;
            c3Var.f3499h0 = false;
            c3Var.f3500i0 = false;
            c3Var.R = null;
            c3Var.S = null;
            c3Var.d(false, false);
            c3Var.l();
        } else if (obj instanceof TL_stars.StarGift) {
            TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
            boolean z13 = l41Var.f37011e;
            Object obj2 = l41Var.I;
            if (obj2 instanceof Boolean) {
                z11 = ((Boolean) obj2).booleanValue();
            } else {
                z11 = false;
            }
            c3Var.h(starGift, z13, z11, l41Var.f37023r, l41Var.f37024s, l41Var.f37026u);
        } else if (obj instanceof TL_stars.SavedStarGift) {
            z12 = c3Var.i((TL_stars.SavedStarGift) obj, l41Var.f37023r, l41Var.f37024s);
        }
        if (l41Var.f37012f) {
            c3Var.c(l41Var.f37011e, z12);
        }
        c3Var.e(l41Var.h, z12);
        FrameLayout frameLayout = c3Var.d;
        float f11 = 1.0f;
        if (l41Var.f37013g) {
            f10 = 1.0f;
        } else {
            f10 = 0.65f;
        }
        frameLayout.setAlpha(f10);
        d3 d3Var = c3Var.f3496f;
        if (!l41Var.f37013g) {
            f11 = 0.5f;
        }
        d3Var.setAlpha(f11);
    }

    @Override
    public final View d(Context context, ck0 ck0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        return new c3(i7, context, i6Var);
    }

    @Override
    public final boolean e(l41 l41Var, l41 l41Var2) {
        if (l41Var.f37023r == l41Var2.f37023r) {
            Object obj = l41Var.H;
            if (obj != null || l41Var2.H != null) {
                if (obj instanceof ug.j) {
                    if (obj == l41Var2.H) {
                        return true;
                    }
                    return false;
                }
                if (obj instanceof TL_stars.StarGift) {
                    Object obj2 = l41Var2.H;
                    if (obj2 instanceof TL_stars.StarGift) {
                        if (((TL_stars.StarGift) obj).f28634id == ((TL_stars.StarGift) obj2).f28634id) {
                            return true;
                        }
                        return false;
                    }
                }
                if (obj instanceof TL_stars.SavedStarGift) {
                    Object obj3 = l41Var2.H;
                    if (obj3 instanceof TL_stars.SavedStarGift) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                        TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj3;
                        if (savedStarGift.gift.f28634id == savedStarGift2.gift.f28634id && savedStarGift.date == savedStarGift2.date && savedStarGift.saved_id == savedStarGift2.saved_id) {
                            return true;
                        }
                        return false;
                    }
                }
            }
            if (l41Var.A == l41Var2.A && l41Var.f37011e == l41Var2.f37011e && l41Var.C == l41Var2.C && TextUtils.equals(l41Var.f37018m, l41Var2.f37018m)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
