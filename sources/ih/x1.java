package ih;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import jh.ia;
import jh.k8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.iq;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.t41;
import org.telegram.ui.Components.t9;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v41;
import org.telegram.ui.Components.w41;
public final class x1 extends v41 {
    public static final int f9498a = 0;

    static {
        v41.setup(new v41());
    }

    public static w41 a(int i10, TL_stars.StarGift starGift, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        w41 J = w41.J(x1.class);
        J.f34309u = 1;
        J.f34313z = i10;
        J.G = starGift;
        J.f34294e = z10;
        J.H = Boolean.valueOf(z11);
        J.f34306r = z13;
        J.f34305q = z12;
        J.f34308t = z14;
        return J;
    }

    @Override
    public final void attachedView(jl0 jl0Var, View view, w41 w41Var) {
        ((y1) view).d(w41Var.h, false);
    }

    @Override
    public final void bindView(View view, w41 w41Var, boolean z10, k51 k51Var, u51 u51Var) {
        boolean z11;
        float f9;
        int i10;
        y1 y1Var = (y1) view;
        Object obj = w41Var.G;
        boolean z12 = false;
        if (obj instanceof cg.n) {
            cg.n nVar = (cg.n) obj;
            bg.x2 x2Var = y1Var.F;
            TextView textView = y1Var.E;
            TextView textView2 = y1Var.D;
            v1 v1Var = y1Var.f9528e;
            t9 t9Var = y1Var.f9538y;
            TextView textView3 = y1Var.H;
            TextView textView4 = y1Var.I;
            int d = nVar.d();
            if (y1Var.f9527d0 != nVar) {
                k8 c12 = ia.c1(t9Var, t9Var.getImageReceiver(), d);
                y1Var.J = c12;
                c12.run();
                y1Var.J = null;
            }
            v1Var.d(null);
            v1Var.e(null);
            v1Var.g(null);
            textView2.setText(LocaleController.formatPluralString("Gift2Months", d, new Object[0]));
            textView.setText(LocaleController.getString(R.string.TelegramPremiumShort));
            textView2.setVisibility(0);
            textView.setVisibility(0);
            t9Var.setTranslationY(-AndroidUtilities.dp(8.0f));
            y1Var.f9533n.setVisibility(8);
            y1Var.B.setVisibility(8);
            if (nVar.f3220c == null && nVar.d == null) {
                textView4.setVisibility(8);
            } else {
                if (g6.I.q()) {
                    i10 = -1333971;
                } else {
                    i10 = -2722014;
                }
                textView4.setTextColor(i10);
                textView4.setVisibility(0);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("" + LocaleController.formatNumber(nVar.g(), ','));
                spannableStringBuilder.setSpan(new t41(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
                iq[] iqVarArr = new iq[1];
                textView4.setText(ia.X0(false, LocaleController.formatSpannable(R.string.PremiumOrStarsPrice, spannableStringBuilder), 0.48f, iqVarArr));
                iqVarArr[0].spaceScaleX = 0.8f;
            }
            FrameLayout.LayoutParams layoutParams = y1Var.A;
            layoutParams.gravity = 49;
            t9Var.setLayoutParams(layoutParams);
            textView3.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
            textView3.setTextSize(1, 12.0f);
            textView3.setText(nVar.c());
            y1Var.G.setBackground(g6.b0(AndroidUtilities.dp(13.0f), 422810068));
            textView3.setTextColor(-13397548);
            ((ViewGroup.MarginLayoutParams) x2Var.getLayoutParams()).topMargin = AndroidUtilities.dp(130.0f);
            ((FrameLayout.LayoutParams) x2Var.getLayoutParams()).gravity = 49;
            y1Var.f9527d0 = nVar;
            y1Var.f9529e0 = null;
            y1Var.R = nVar;
            y1Var.S = null;
            y1Var.U = false;
            y1Var.V = null;
            y1Var.W = false;
            y1Var.f9522a0 = false;
            y1Var.f9524b0 = false;
            y1Var.K = null;
            y1Var.L = null;
            y1Var.c(false, false);
            y1Var.j();
        } else if (obj instanceof TL_stars.StarGift) {
            TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
            boolean z13 = w41Var.f34294e;
            Object obj2 = w41Var.H;
            if (obj2 instanceof Boolean) {
                z11 = ((Boolean) obj2).booleanValue();
            } else {
                z11 = false;
            }
            y1Var.g(starGift, z13, z11, w41Var.f34305q, w41Var.f34306r, w41Var.f34308t);
        } else if (obj instanceof TL_stars.SavedStarGift) {
            z12 = y1Var.h((TL_stars.SavedStarGift) obj, w41Var.f34305q, w41Var.f34306r);
        }
        if (w41Var.f34295f) {
            y1Var.b(w41Var.f34294e, z12);
        }
        y1Var.d(w41Var.h, z12);
        FrameLayout frameLayout = y1Var.d;
        float f10 = 1.0f;
        if (w41Var.f34296g) {
            f9 = 1.0f;
        } else {
            f9 = 0.65f;
        }
        frameLayout.setAlpha(f9);
        z1 z1Var = y1Var.f9530f;
        if (!w41Var.f34296g) {
            f10 = 0.5f;
        }
        z1Var.setAlpha(f10);
    }

    @Override
    public final View createView(Context context, jl0 jl0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new y1(context, i10, c6Var);
    }

    @Override
    public final boolean equals(w41 w41Var, w41 w41Var2) {
        if (w41Var.f34305q == w41Var2.f34305q) {
            Object obj = w41Var.G;
            if (obj != null || w41Var2.G != null) {
                if (obj instanceof cg.n) {
                    if (obj == w41Var2.G) {
                        return true;
                    }
                    return false;
                }
                if (obj instanceof TL_stars.StarGift) {
                    Object obj2 = w41Var2.G;
                    if (obj2 instanceof TL_stars.StarGift) {
                        if (((TL_stars.StarGift) obj).f22619id == ((TL_stars.StarGift) obj2).f22619id) {
                            return true;
                        }
                        return false;
                    }
                }
                if (obj instanceof TL_stars.SavedStarGift) {
                    Object obj3 = w41Var2.G;
                    if (obj3 instanceof TL_stars.SavedStarGift) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                        TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj3;
                        if (savedStarGift.gift.f22619id == savedStarGift2.gift.f22619id && savedStarGift.date == savedStarGift2.date && savedStarGift.saved_id == savedStarGift2.saved_id) {
                            return true;
                        }
                        return false;
                    }
                }
            }
            if (w41Var.f34313z == w41Var2.f34313z && w41Var.f34294e == w41Var2.f34294e && w41Var.B == w41Var2.B && TextUtils.equals(w41Var.f34300l, w41Var2.f34300l)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
