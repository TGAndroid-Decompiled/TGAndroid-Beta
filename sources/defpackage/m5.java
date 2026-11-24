package defpackage;

import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
public final class m5 extends b6c {
    public static final int b = 0;

    static {
        b6c.h(new b6c());
    }

    @Override
    public final void b(View view, c6c c6cVar, boolean z, l7c l7cVar, q7c q7cVar) {
        n5 n5Var = (n5) view;
        hv4 hv4Var = (hv4) c6cVar.I;
        TL_stars.TL_StarGiftAuctionAcquiredGift tL_StarGiftAuctionAcquiredGift = (TL_stars.TL_StarGiftAuctionAcquiredGift) c6cVar.H;
        View.OnClickListener onClickListener = c6cVar.E;
        int i = n5.c;
        n5Var.removeAllViews();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*");
        spannableStringBuilder.setSpan(new gn(hv4Var.c, cmb.r2.getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append(' ');
        spannableStringBuilder.append((CharSequence) jb6.a0(null, null, 2131750242, hv4Var.d.title, Integer.valueOf(tL_StarGiftAuctionAcquiredGift.gift_num), Integer.valueOf(tL_StarGiftAuctionAcquiredGift.round)));
        spannableStringBuilder.setSpan(new z5c(gm.o()), 0, spannableStringBuilder.length(), 33);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        spannableStringBuilder2.append((CharSequence) nxa.b1(false, "⭐️".concat(jb6.E(tL_StarGiftAuctionAcquiredGift.bid_amount, ',')), 0.75f, null));
        String a0 = jb6.a0(null, null, 2131750241, Integer.valueOf(tL_StarGiftAuctionAcquiredGift.pos));
        mhb mhbVar = new mhb(n5Var.getContext(), n5Var.a);
        mhbVar.a(spannableStringBuilder).setFilled(true);
        mhbVar.n(jb6.M0(2131750244, null), n5Var.b, pg3.n(tL_StarGiftAuctionAcquiredGift.peer), new pf2(n5Var, onClickListener, (byte) 17));
        mhbVar.g(tL_StarGiftAuctionAcquiredGift.date, jb6.M0(2131750248, null));
        mhbVar.e(jb6.M0(2131750249, null), spannableStringBuilder2, a0, null, null);
        n5Var.addView(mhbVar, qoe.c(-2.0f, -1));
    }

    @Override
    public final boolean f() {
        return false;
    }
}
