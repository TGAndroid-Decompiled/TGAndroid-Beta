package bi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import c8.na;
import di.pb;
import org.telegram.messenger.gd;
import org.telegram.messenger.q9;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.dy0;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.m41;
import org.telegram.ui.Components.n41;
public final class c extends m41 {
    public static final int f3424b = 0;

    static {
        m41.h(new m41());
    }

    @Override
    public final void b(View view, n41 n41Var, boolean z10, b51 b51Var, g51 g51Var) {
        d dVar = (d) view;
        q9 q9Var = (q9) n41Var.I;
        TL_stars.TL_StarGiftAuctionAcquiredGift tL_StarGiftAuctionAcquiredGift = (TL_stars.TL_StarGiftAuctionAcquiredGift) n41Var.H;
        View.OnClickListener onClickListener = n41Var.E;
        int i7 = d.f3448c;
        dVar.removeAllViews();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*");
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.x5(q9Var.f26482c, org.telegram.ui.ActionBar.n6.f29726s2.getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append(' ');
        spannableStringBuilder.append((CharSequence) gd.a0(null, null, 2131750292, q9Var.d.title, Integer.valueOf(tL_StarGiftAuctionAcquiredGift.gift_num), Integer.valueOf(tL_StarGiftAuctionAcquiredGift.round)));
        spannableStringBuilder.setSpan(new k41(org.telegram.messenger.g0.o()), 0, spannableStringBuilder.length(), 33);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        spannableStringBuilder2.append((CharSequence) pb.b1(false, i5.c.l(tL_StarGiftAuctionAcquiredGift.bid_amount, ',', new StringBuilder("⭐️")), 0.75f, null));
        String a02 = gd.a0(null, null, 2131750291, Integer.valueOf(tL_StarGiftAuctionAcquiredGift.pos));
        dy0 dy0Var = new dy0(dVar.getContext(), dVar.f3449a);
        dy0Var.a(spannableStringBuilder).setFilled(true);
        dy0Var.n(gd.N0(2131750294, null), dVar.f3450b, org.telegram.messenger.n5.o(tL_StarGiftAuctionAcquiredGift.peer), new a1.e(24, dVar, onClickListener));
        dy0Var.g(tL_StarGiftAuctionAcquiredGift.date, gd.N0(2131750298, null));
        dy0Var.d(gd.N0(2131750299, null), spannableStringBuilder2, a02, null, null);
        dVar.addView(dy0Var, na.c(-2.0f, -1));
    }

    @Override
    public final View d(Context context, ek0 ek0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        d dVar = new d(i7, context, i6Var);
        dVar.setLayoutParams(na.c(-2.0f, -1));
        return dVar;
    }

    @Override
    public final boolean f() {
        return false;
    }
}
