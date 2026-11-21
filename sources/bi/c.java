package bi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import c8.ma;
import di.pb;
import org.telegram.messenger.gd;
import org.telegram.messenger.q9;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.c51;
import org.telegram.ui.Components.ek0;
import org.telegram.ui.Components.ey0;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.o41;
public final class c extends n41 {
    public static final int f3446b = 0;

    static {
        n41.h(new n41());
    }

    @Override
    public final void b(View view, o41 o41Var, boolean z10, c51 c51Var, h51 h51Var) {
        d dVar = (d) view;
        q9 q9Var = (q9) o41Var.I;
        TL_stars.TL_StarGiftAuctionAcquiredGift tL_StarGiftAuctionAcquiredGift = (TL_stars.TL_StarGiftAuctionAcquiredGift) o41Var.H;
        View.OnClickListener onClickListener = o41Var.E;
        int i7 = d.f3491c;
        dVar.removeAllViews();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*");
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.y5(q9Var.f26398c, org.telegram.ui.ActionBar.m6.f29653s2.getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append(' ');
        spannableStringBuilder.append((CharSequence) gd.a0(null, null, 2131750292, q9Var.d.title, Integer.valueOf(tL_StarGiftAuctionAcquiredGift.gift_num), Integer.valueOf(tL_StarGiftAuctionAcquiredGift.round)));
        spannableStringBuilder.setSpan(new l41(org.telegram.messenger.g0.o()), 0, spannableStringBuilder.length(), 33);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        spannableStringBuilder2.append((CharSequence) pb.b1(false, i5.c.l(tL_StarGiftAuctionAcquiredGift.bid_amount, ',', new StringBuilder("⭐️")), 0.75f, null));
        String a02 = gd.a0(null, null, 2131750291, Integer.valueOf(tL_StarGiftAuctionAcquiredGift.pos));
        ey0 ey0Var = new ey0(dVar.getContext(), dVar.f3492a);
        ey0Var.a(spannableStringBuilder).setFilled(true);
        ey0Var.n(gd.N0(2131750294, null), dVar.f3493b, org.telegram.messenger.n5.o(tL_StarGiftAuctionAcquiredGift.peer), new a1.e(24, dVar, onClickListener));
        ey0Var.g(tL_StarGiftAuctionAcquiredGift.date, gd.N0(2131750298, null));
        ey0Var.d(gd.N0(2131750299, null), spannableStringBuilder2, a02, null, null);
        dVar.addView(ey0Var, ma.c(-2.0f, -1));
    }

    @Override
    public final View d(Context context, ek0 ek0Var, int i7, org.telegram.ui.ActionBar.h6 h6Var) {
        d dVar = new d(i7, context, h6Var);
        dVar.setLayoutParams(ma.c(-2.0f, -1));
        return dVar;
    }

    @Override
    public final boolean f() {
        return false;
    }
}
