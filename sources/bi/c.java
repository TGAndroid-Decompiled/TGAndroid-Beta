package bi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import c8.ja;
import di.lb;
import org.telegram.messenger.hd;
import org.telegram.messenger.r9;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.a41;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.p41;
import org.telegram.ui.Components.u41;
import org.telegram.ui.Components.uj0;
import org.telegram.ui.Components.vx0;
import org.telegram.ui.Components.y31;
public final class c extends a41 {
    public static final int f3404b = 0;

    static {
        a41.h(new a41());
    }

    @Override
    public final void b(View view, b41 b41Var, boolean z10, p41 p41Var, u41 u41Var) {
        d dVar = (d) view;
        r9 r9Var = (r9) b41Var.H;
        TL_stars.TL_StarGiftAuctionAcquiredGift tL_StarGiftAuctionAcquiredGift = (TL_stars.TL_StarGiftAuctionAcquiredGift) b41Var.G;
        View.OnClickListener onClickListener = b41Var.D;
        int i7 = d.f3437c;
        dVar.removeAllViews();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*");
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.p5(r9Var.f26268c, org.telegram.ui.ActionBar.j6.f29124s2.getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append(' ');
        spannableStringBuilder.append((CharSequence) hd.a0(null, null, 2131750309, r9Var.d.title, Integer.valueOf(tL_StarGiftAuctionAcquiredGift.gift_num), Integer.valueOf(tL_StarGiftAuctionAcquiredGift.round)));
        spannableStringBuilder.setSpan(new y31(org.telegram.messenger.g0.o()), 0, spannableStringBuilder.length(), 33);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        spannableStringBuilder2.append((CharSequence) lb.a1(false, i5.c.l(tL_StarGiftAuctionAcquiredGift.bid_amount, ',', new StringBuilder("⭐️")), 0.75f, null));
        String a02 = hd.a0(null, null, 2131750308, Integer.valueOf(tL_StarGiftAuctionAcquiredGift.pos));
        vx0 vx0Var = new vx0(dVar.getContext(), dVar.f3438a);
        vx0Var.a(spannableStringBuilder).setFilled(true);
        vx0Var.n(hd.M0(2131750311, null), dVar.f3439b, org.telegram.messenger.m5.o(tL_StarGiftAuctionAcquiredGift.peer), new a1.e(24, dVar, onClickListener));
        vx0Var.g(tL_StarGiftAuctionAcquiredGift.date, hd.M0(2131750315, null));
        vx0Var.e(hd.M0(2131750316, null), spannableStringBuilder2, a02, null, null);
        dVar.addView(vx0Var, ja.c(-2.0f, -1));
    }

    @Override
    public final View d(Context context, uj0 uj0Var, int i7, org.telegram.ui.ActionBar.e6 e6Var) {
        d dVar = new d(i7, context, e6Var);
        dVar.setLayoutParams(ja.c(-2.0f, -1));
        return dVar;
    }

    @Override
    public final boolean f() {
        return false;
    }
}
