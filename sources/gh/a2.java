package gh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import hh.n8;
import hh.oa;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.n9;
import org.telegram.ui.Components.zk0;

public final class a2 extends m41 {

    public static final int f7134a = 0;

    static {
        m41.setup(new a2());
    }

    public static n41 a(int i10, TL_stars.StarGift starGift, boolean z10, boolean z11, boolean z12, boolean z13, boolean z14) {
        n41 n41VarJ = n41.J(a2.class);
        n41VarJ.f30853u = 1;
        n41VarJ.f30857z = i10;
        n41VarJ.G = starGift;
        n41VarJ.f30838e = z10;
        n41VarJ.H = Boolean.valueOf(z11);
        n41VarJ.f30850r = z13;
        n41VarJ.f30849q = z12;
        n41VarJ.f30852t = z14;
        return n41VarJ;
    }

    @Override
    public final void attachedView(zk0 zk0Var, View view, n41 n41Var) {
        ((b2) view).d(n41Var.h, false);
    }

    @Override
    public final void bindView(View view, n41 n41Var, boolean z10, b51 b51Var, k51 k51Var) {
        b2 b2Var = (b2) view;
        Object obj = n41Var.G;
        boolean zH = false;
        if (obj instanceof ag.p) {
            ag.p pVar = (ag.p) obj;
            ag.p1 p1Var = b2Var.F;
            TextView textView = b2Var.E;
            TextView textView2 = b2Var.D;
            y1 y1Var = b2Var.f7158e;
            n9 n9Var = b2Var.f7168y;
            TextView textView3 = b2Var.H;
            TextView textView4 = b2Var.I;
            int iD = pVar.d();
            if (b2Var.f7157d0 != pVar) {
                n8 n8VarC1 = oa.c1(n9Var, n9Var.getImageReceiver(), iD);
                b2Var.J = n8VarC1;
                n8VarC1.run();
                b2Var.J = null;
            }
            y1Var.d(null);
            y1Var.e(null);
            y1Var.g(null);
            textView2.setText(LocaleController.formatPluralString("Gift2Months", iD, new Object[0]));
            textView.setText(LocaleController.getString(R.string.TelegramPremiumShort));
            textView2.setVisibility(0);
            textView.setVisibility(0);
            n9Var.setTranslationY(-AndroidUtilities.dp(8.0f));
            b2Var.f7163n.setVisibility(8);
            b2Var.B.setVisibility(8);
            if (pVar.f587c == null && pVar.d == null) {
                textView4.setVisibility(8);
            } else {
                textView4.setTextColor(org.telegram.ui.ActionBar.g6.I.q() ? -1333971 : -2722014);
                textView4.setVisibility(0);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("" + LocaleController.formatNumber(pVar.g(), ','));
                spannableStringBuilder.setSpan(new k41(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
                cq[] cqVarArr = new cq[1];
                textView4.setText(oa.X0(false, LocaleController.formatSpannable(R.string.PremiumOrStarsPrice, spannableStringBuilder), 0.48f, cqVarArr));
                cqVarArr[0].spaceScaleX = 0.8f;
            }
            FrameLayout.LayoutParams layoutParams = b2Var.A;
            layoutParams.gravity = 49;
            n9Var.setLayoutParams(layoutParams);
            textView3.setPadding(AndroidUtilities.dp(10.0f), 0, AndroidUtilities.dp(10.0f), 0);
            textView3.setTextSize(1, 12.0f);
            textView3.setText(pVar.c());
            b2Var.G.setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(13.0f), 422810068));
            textView3.setTextColor(-13397548);
            ((ViewGroup.MarginLayoutParams) p1Var.getLayoutParams()).topMargin = AndroidUtilities.dp(130.0f);
            ((FrameLayout.LayoutParams) p1Var.getLayoutParams()).gravity = 49;
            b2Var.f7157d0 = pVar;
            b2Var.f7159e0 = null;
            b2Var.R = pVar;
            b2Var.S = null;
            b2Var.U = false;
            b2Var.V = null;
            b2Var.W = false;
            b2Var.f7152a0 = false;
            b2Var.f7154b0 = false;
            b2Var.K = null;
            b2Var.L = null;
            b2Var.c(false, false);
            b2Var.j();
        } else if (obj instanceof TL_stars.StarGift) {
            TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
            boolean z11 = n41Var.f30838e;
            Object obj2 = n41Var.H;
            b2Var.g(starGift, z11, obj2 instanceof Boolean ? ((Boolean) obj2).booleanValue() : false, n41Var.f30849q, n41Var.f30850r, n41Var.f30852t);
        } else if (obj instanceof TL_stars.SavedStarGift) {
            zH = b2Var.h((TL_stars.SavedStarGift) obj, n41Var.f30849q, n41Var.f30850r);
        }
        if (n41Var.f30839f) {
            b2Var.b(n41Var.f30838e, zH);
        }
        b2Var.d(n41Var.h, zH);
        b2Var.d.setAlpha(n41Var.f30840g ? 1.0f : 0.65f);
        b2Var.f7160f.setAlpha(n41Var.f30840g ? 1.0f : 0.5f);
    }

    @Override
    public final View createView(Context context, zk0 zk0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        return new b2(context, i10, c6Var);
    }

    @Override
    public final boolean equals(n41 n41Var, n41 n41Var2) {
        if (n41Var.f30849q != n41Var2.f30849q) {
            return false;
        }
        Object obj = n41Var.G;
        if (obj != null || n41Var2.G != null) {
            if (obj instanceof ag.p) {
                return obj == n41Var2.G;
            }
            if (obj instanceof TL_stars.StarGift) {
                Object obj2 = n41Var2.G;
                if (obj2 instanceof TL_stars.StarGift) {
                    return ((TL_stars.StarGift) obj).f22607id == ((TL_stars.StarGift) obj2).f22607id;
                }
            }
            if (obj instanceof TL_stars.SavedStarGift) {
                Object obj3 = n41Var2.G;
                if (obj3 instanceof TL_stars.SavedStarGift) {
                    TL_stars.SavedStarGift savedStarGift = (TL_stars.SavedStarGift) obj;
                    TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj3;
                    return savedStarGift.gift.f22607id == savedStarGift2.gift.f22607id && savedStarGift.date == savedStarGift2.date && savedStarGift.saved_id == savedStarGift2.saved_id;
                }
            }
        }
        return n41Var.f30857z == n41Var2.f30857z && n41Var.f30838e == n41Var2.f30838e && n41Var.B == n41Var2.B && TextUtils.equals(n41Var.f30844l, n41Var2.f30844l);
    }
}
