package ai;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import b8.mf;
import ci.wb;
import org.telegram.messenger.bd;
import org.telegram.messenger.m9;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.f41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.o31;
import org.telegram.ui.Components.q31;
import org.telegram.ui.Components.r31;
import org.telegram.ui.Components.rx0;
import org.telegram.ui.Components.tj0;
public final class e extends q31 {
    public static final int f594b = 0;

    static {
        q31.h(new q31());
    }

    @Override
    public final void b(View view, r31 r31Var, boolean z10, f41 f41Var, l41 l41Var) {
        f fVar = (f) view;
        m9 m9Var = (m9) r31Var.H;
        TL_stars.TL_StarGiftAuctionAcquiredGift tL_StarGiftAuctionAcquiredGift = (TL_stars.TL_StarGiftAuctionAcquiredGift) r31Var.G;
        View.OnClickListener onClickListener = r31Var.D;
        int i3 = f.f632c;
        fVar.removeAllViews();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*");
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.p5(m9Var.f24178c, org.telegram.ui.ActionBar.k6.f28155s2.getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append(' ');
        spannableStringBuilder.append((CharSequence) bd.a0(null, null, 2131750317, m9Var.d.title, Integer.valueOf(tL_StarGiftAuctionAcquiredGift.gift_num), Integer.valueOf(tL_StarGiftAuctionAcquiredGift.round)));
        spannableStringBuilder.setSpan(new o31(org.telegram.messenger.g0.o()), 0, spannableStringBuilder.length(), 33);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        spannableStringBuilder2.append((CharSequence) wb.a1(false, k2.p1.l(tL_StarGiftAuctionAcquiredGift.bid_amount, ',', new StringBuilder("⭐️")), 0.75f, null));
        String a02 = bd.a0(null, null, 2131750316, Integer.valueOf(tL_StarGiftAuctionAcquiredGift.pos));
        rx0 rx0Var = new rx0(fVar.getContext(), fVar.f633a);
        rx0Var.a(spannableStringBuilder).setFilled(true);
        rx0Var.n(bd.M0(2131750319, null), fVar.f634b, org.telegram.messenger.m5.o(tL_StarGiftAuctionAcquiredGift.peer), new a1.f(2, fVar, onClickListener));
        rx0Var.g(tL_StarGiftAuctionAcquiredGift.date, bd.M0(2131750323, null));
        rx0Var.e(bd.M0(2131750324, null), spannableStringBuilder2, a02, null, null);
        fVar.addView(rx0Var, mf.c(-2.0f, -1));
    }

    @Override
    public final View d(Context context, tj0 tj0Var, int i3, org.telegram.ui.ActionBar.e6 e6Var) {
        f fVar = new f(i3, context, e6Var);
        fVar.setLayoutParams(mf.c(-2.0f, -1));
        return fVar;
    }

    @Override
    public final boolean f() {
        return false;
    }
}
