package fh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import gh.o8;
import gh.oa;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.i41;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.o9;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.z41;
public final class e2 extends k41 {
    public static final int f6424a = 0;

    static {
        k41.setup(new k41());
    }

    public static l41 a(int i9, TL_stars.StarGift starGift, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        l41 J = l41.J(e2.class);
        J.f30348u = 1;
        J.f30352z = i9;
        J.G = starGift;
        J.f30333e = z10;
        J.H = Boolean.valueOf(z11);
        J.f30345r = z13;
        J.f30344q = z12;
        J.f30347t = z14;
        return J;
    }

    @Override
    public final void attachedView(wk0 wk0Var, View view, l41 l41Var) {
        ((f2) view).d(l41Var.h, false);
    }

    @Override
    public final void bindView(View view, l41 l41Var, boolean z10, z41 z41Var, i51 i51Var) {
        boolean z11;
        float f10;
        int i9;
        f2 f2Var = (f2) view;
        Object obj = l41Var.G;
        boolean z12 = false;
        if (obj instanceof zf.k) {
            zf.k kVar = (zf.k) obj;
            d2 d2Var = f2Var.F;
            TextView textView = f2Var.E;
            TextView textView2 = f2Var.D;
            b2 b2Var = f2Var.f6446e;
            o9 o9Var = f2Var.f6456y;
            TextView textView3 = f2Var.H;
            TextView textView4 = f2Var.I;
            int d = kVar.d();
            if (f2Var.f6445d0 != kVar) {
                o8 c12 = oa.c1(o9Var, o9Var.getImageReceiver(), d);
                f2Var.J = c12;
                c12.run();
                f2Var.J = null;
            }
            b2Var.d(null);
            b2Var.e(null);
            b2Var.g(null);
            textView2.setText(LocaleController.formatPluralString("Gift2Months", d, new Object[0]));
            textView.setText(LocaleController.getString(R.string.TelegramPremiumShort));
            textView2.setVisibility(0);
            textView.setVisibility(0);
            o9Var.setTranslationY(-AndroidUtilities.dp(8.0f));
            f2Var.f6451n.setVisibility(8);
            f2Var.B.setVisibility(8);
            if (kVar.f50560c == null && kVar.d == null) {
                textView4.setVisibility(8);
            } else {
                if (org.telegram.ui.ActionBar.f6.I.q()) {
                    i9 = -1333971;
                } else {
                    i9 = -2722014;
                }
                textView4.setTextColor(i9);
                textView4.setVisibility(0);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("" + LocaleController.formatNumber(kVar.g(), ','));
                spannableStringBuilder.setSpan(new i41(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
                eq[] eqVarArr = new eq[1];
                textView4.setText(oa.X0(false, LocaleController.formatSpannable(R.string.PremiumOrStarsPrice, spannableStringBuilder), 0.48f, eqVarArr));
                eqVarArr[0].spaceScaleX = 0.8f;
            }
            FrameLayout.LayoutParams layoutParams = f2Var.A;
            layoutParams.gravity = 49;
            o9Var.setLayoutParams(layoutParams);
            textView3.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
            textView3.setTextSize(1, 12.0f);
            textView3.setText(kVar.c());
            f2Var.G.setBackground(org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp(13.0f), 422810068));
            textView3.setTextColor(-13397548);
            ((ViewGroup.MarginLayoutParams) d2Var.getLayoutParams()).topMargin = AndroidUtilities.dp(130.0f);
            ((FrameLayout.LayoutParams) d2Var.getLayoutParams()).gravity = 49;
            f2Var.f6445d0 = kVar;
            f2Var.f6447e0 = null;
            f2Var.R = kVar;
            f2Var.S = null;
            f2Var.U = false;
            f2Var.V = null;
            f2Var.W = false;
            f2Var.f6440a0 = false;
            f2Var.f6442b0 = false;
            f2Var.K = null;
            f2Var.L = null;
            f2Var.c(false, false);
            f2Var.j();
        } else if (obj instanceof TL_stars.StarGift) {
            TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
            boolean z13 = l41Var.f30333e;
            Object obj2 = l41Var.H;
            if (obj2 instanceof Boolean) {
                z11 = ((Boolean) obj2).booleanValue();
            } else {
                z11 = false;
            }
            f2Var.g(starGift, z13, z11, l41Var.f30344q, l41Var.f30345r, l41Var.f30347t);
        } else if (obj instanceof TL_stars.SavedStarGift) {
            z12 = f2Var.h((TL_stars.SavedStarGift) obj, l41Var.f30344q, l41Var.f30345r);
        }
        if (l41Var.f30334f) {
            f2Var.b(l41Var.f30333e, z12);
        }
        f2Var.d(l41Var.h, z12);
        FrameLayout frameLayout = f2Var.d;
        float f11 = 1.0f;
        if (l41Var.f30335g) {
            f10 = 1.0f;
        } else {
            f10 = 0.65f;
        }
        frameLayout.setAlpha(f10);
        g2 g2Var = f2Var.f6448f;
        if (!l41Var.f30335g) {
            f11 = 0.5f;
        }
        g2Var.setAlpha(f11);
    }

    @Override
    public final View createView(Context context, wk0 wk0Var, int i9, int i10, org.telegram.ui.ActionBar.b6 b6Var) {
        return new f2(context, i9, b6Var);
    }

    @Override
    public final boolean equals(l41 l41Var, l41 l41Var2) {
        if (l41Var.f30344q == l41Var2.f30344q) {
            Object obj = l41Var.G;
            if (obj != null || l41Var2.G != null) {
                if (obj instanceof zf.k) {
                    if (obj == l41Var2.G) {
                        return true;
                    }
                    return false;
                }
                if (obj instanceof TL_stars.StarGift) {
                    Object obj2 = l41Var2.G;
                    if (obj2 instanceof TL_stars.StarGift) {
                        if (((TL_stars.StarGift) obj).f22607id == ((TL_stars.StarGift) obj2).f22607id) {
                            return true;
                        }
                        return false;
                    }
                }
                if (obj instanceof TL_stars.SavedStarGift) {
                    Object obj3 = l41Var2.G;
                    if (obj3 instanceof TL_stars.SavedStarGift) {
                        TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                        TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj3;
                        if (savedStarGift.gift.f22607id == savedStarGift2.gift.f22607id && savedStarGift.date == savedStarGift2.date && savedStarGift.saved_id == savedStarGift2.saved_id) {
                            return true;
                        }
                        return false;
                    }
                }
            }
            if (l41Var.f30352z == l41Var2.f30352z && l41Var.f30333e == l41Var2.f30333e && l41Var.B == l41Var2.B && TextUtils.equals(l41Var.f30339l, l41Var2.f30339l)) {
                return true;
            }
            return false;
        }
        return false;
    }
}
