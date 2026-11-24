package defpackage;

import android.text.SpannableStringBuilder;
import android.view.View;
import org.telegram.tgnet.tl.TL_stars;
public final class m5 extends b4c {
    public static final int b = 0;

    static {
        b4c.h(new b4c());
    }

    @Override
    public final void b(View view, c4c c4cVar, boolean z, l5c l5cVar, q5c q5cVar) {
        n5 n5Var = (n5) view;
        gt4 gt4Var = (gt4) c4cVar.I;
        TL_stars.TL_StarGiftAuctionAcquiredGift tL_StarGiftAuctionAcquiredGift = (TL_stars.TL_StarGiftAuctionAcquiredGift) c4cVar.H;
        View.OnClickListener onClickListener = c4cVar.E;
        int i = n5.c;
        n5Var.removeAllViews();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*");
        spannableStringBuilder.setSpan(new gm(gt4Var.c, bkb.r2.getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append(' ');
        spannableStringBuilder.append((CharSequence) k96.a0(null, null, 2131750293, gt4Var.d.title, Integer.valueOf(tL_StarGiftAuctionAcquiredGift.gift_num), Integer.valueOf(tL_StarGiftAuctionAcquiredGift.round)));
        spannableStringBuilder.setSpan(new z3c(gl.o()), 0, spannableStringBuilder.length(), 33);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        spannableStringBuilder2.append((CharSequence) jva.a1(false, "⭐️".concat(k96.E(tL_StarGiftAuctionAcquiredGift.bid_amount, ',')), 0.75f, null));
        String a0 = k96.a0(null, null, 2131750292, Integer.valueOf(tL_StarGiftAuctionAcquiredGift.pos));
        mfb mfbVar = new mfb(n5Var.getContext(), n5Var.a);
        mfbVar.a(spannableStringBuilder).setFilled(true);
        mfbVar.n(k96.M0(2131750295, null), n5Var.b, cf3.n(tL_StarGiftAuctionAcquiredGift.peer), new ee2(n5Var, onClickListener, (byte) 17));
        mfbVar.g(tL_StarGiftAuctionAcquiredGift.date, k96.M0(2131750299, null));
        mfbVar.e(k96.M0(2131750300, null), spannableStringBuilder2, a0, null, null);
        n5Var.addView(mfbVar, nme.c(-2.0f, -1));
    }

    @Override
    public final boolean f() {
        return false;
    }
}
