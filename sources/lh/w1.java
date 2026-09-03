package lh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import mh.ja;
import mh.l8;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.w51;
public final class w1 extends g51 {
    public static final int f13059a = 0;

    static {
        g51.setup(new g51());
    }

    public static h51 a(int i10, TL_stars.StarGift starGift, boolean z4, boolean z10, boolean z11, boolean z12, boolean z13) {
        h51 J = h51.J(w1.class);
        J.f27384u = 1;
        J.f27388z = i10;
        J.G = starGift;
        J.f27369e = z4;
        J.H = Boolean.valueOf(z10);
        J.f27381r = z12;
        J.f27380q = z11;
        J.f27383t = z13;
        return J;
    }

    @Override
    public final void attachedView(sl0 sl0Var, View view, h51 h51Var) {
        ((x1) view).d(h51Var.h, false);
    }

    @Override
    public final void bindView(View view, h51 h51Var, boolean z4, w51 w51Var, h61 h61Var) {
        boolean z10;
        float f10;
        int i10;
        x1 x1Var = (x1) view;
        Object obj = h51Var.G;
        boolean z11 = false;
        if (obj instanceof fg.n) {
            fg.n nVar = (fg.n) obj;
            eg.s2 s2Var = x1Var.G;
            TextView textView = x1Var.F;
            TextView textView2 = x1Var.E;
            u1 u1Var = x1Var.f13083e;
            p9 p9Var = x1Var.f13094y;
            TextView textView3 = x1Var.I;
            TextView textView4 = x1Var.J;
            int d = nVar.d();
            if (x1Var.f13084e0 != nVar) {
                l8 c12 = ja.c1(p9Var, p9Var.getImageReceiver(), d);
                x1Var.K = c12;
                c12.run();
                x1Var.K = null;
            }
            u1Var.d(null);
            u1Var.e(null);
            u1Var.g(null);
            textView2.setText(LocaleController.formatPluralString("Gift2Months", d, new Object[0]));
            textView.setText(LocaleController.getString(R.string.TelegramPremiumShort));
            textView2.setVisibility(0);
            textView.setVisibility(0);
            p9Var.setTranslationY(-AndroidUtilities.dp(8.0f));
            x1Var.f13089n.setVisibility(8);
            x1Var.C.setVisibility(8);
            if (nVar.f6406c == null && nVar.d == null) {
                textView4.setVisibility(8);
            } else {
                if (k6.I.q()) {
                    i10 = -1333971;
                } else {
                    i10 = -2722014;
                }
                textView4.setTextColor(i10);
                textView4.setVisibility(0);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("" + LocaleController.formatNumber(nVar.g(), ','));
                spannableStringBuilder.setSpan(new e51(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
                oq[] oqVarArr = new oq[1];
                textView4.setText(ja.X0(false, LocaleController.formatSpannable(R.string.PremiumOrStarsPrice, spannableStringBuilder), 0.48f, oqVarArr));
                oqVarArr[0].spaceScaleX = 0.8f;
            }
            FrameLayout.LayoutParams layoutParams = x1Var.B;
            layoutParams.gravity = 49;
            p9Var.setLayoutParams(layoutParams);
            textView3.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
            textView3.setTextSize(1, 12.0f);
            textView3.setText(nVar.c());
            x1Var.H.setBackground(k6.b0(AndroidUtilities.dp(13.0f), 422810068));
            textView3.setTextColor(-13397548);
            ((ViewGroup.MarginLayoutParams) s2Var.getLayoutParams()).topMargin = AndroidUtilities.dp(130.0f);
            ((FrameLayout.LayoutParams) s2Var.getLayoutParams()).gravity = 49;
            x1Var.f13084e0 = nVar;
            x1Var.f13086f0 = null;
            x1Var.S = nVar;
            x1Var.T = null;
            x1Var.V = false;
            x1Var.W = null;
            x1Var.f13077a0 = false;
            x1Var.f13079b0 = false;
            x1Var.f13081c0 = false;
            x1Var.L = null;
            x1Var.M = null;
            x1Var.c(false, false);
            x1Var.j();
        } else if (obj instanceof TL_stars.StarGift) {
            TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
            boolean z12 = h51Var.f27369e;
            Object obj2 = h51Var.H;
            if (obj2 instanceof Boolean) {
                z10 = ((Boolean) obj2).booleanValue();
            } else {
                z10 = false;
            }
            x1Var.g(starGift, z12, z10, h51Var.f27380q, h51Var.f27381r, h51Var.f27383t);
        } else if (obj instanceof TL_stars.SavedStarGift) {
            z11 = x1Var.h((TL_stars.SavedStarGift) obj, h51Var.f27380q, h51Var.f27381r);
        }
        if (h51Var.f27370f) {
            x1Var.b(h51Var.f27369e, z11);
        }
        x1Var.d(h51Var.h, z11);
        FrameLayout frameLayout = x1Var.d;
        float f11 = 1.0f;
        if (h51Var.f27371g) {
            f10 = 1.0f;
        } else {
            f10 = 0.65f;
        }
        frameLayout.setAlpha(f10);
        y1 y1Var = x1Var.f13085f;
        if (!h51Var.f27371g) {
            f11 = 0.5f;
        }
        y1Var.setAlpha(f11);
    }

    @Override
    public final View createView(Context context, sl0 sl0Var, int i10, int i11, g6 g6Var) {
        return new x1(context, i10, g6Var);
    }

    @Override
    public final boolean equals(h51 h51Var, h51 h51Var2) {
        if (h51Var.f27380q == h51Var2.f27380q) {
            Object obj = h51Var.G;
            if (obj != null || h51Var2.G != null) {
                if (obj instanceof fg.n) {
                    if (obj == h51Var2.G) {
                        return true;
                    }
                    return false;
                }
                if (obj instanceof TL_stars.StarGift) {
                    Object obj2 = h51Var2.G;
                    if (obj2 instanceof TL_stars.StarGift) {
                        if (((TL_stars.StarGift) obj).f21072id == ((TL_stars.StarGift) obj2).f21072id) {
                            return true;
                        }
                        return false;
                    }
                }
                if (obj instanceof TL_stars.SavedStarGift) {
                    Object obj3 = h51Var2.G;
                    if (obj3 instanceof TL_stars.SavedStarGift) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                        TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj3;
                        if (savedStarGift.gift.f21072id == savedStarGift2.gift.f21072id && savedStarGift.date == savedStarGift2.date && savedStarGift.saved_id == savedStarGift2.saved_id) {
                            return true;
                        }
                        return false;
                    }
                }
            }
            if (h51Var.f27388z == h51Var2.f27388z && h51Var.f27369e == h51Var2.f27369e && h51Var.B == h51Var2.B && TextUtils.equals(h51Var.f27375l, h51Var2.f27375l)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
