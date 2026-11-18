package bi;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import c8.ma;
import di.pb;
import org.telegram.messenger.gd;
import org.telegram.messenger.q9;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.ck0;
import org.telegram.ui.Components.cy0;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.i41;
import org.telegram.ui.Components.k41;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.z41;
public final class c extends k41 {
    public static final int f3448b = 0;

    static {
        k41.h(new k41());
    }

    @Override
    public final void b(View view, l41 l41Var, boolean z10, z41 z41Var, e51 e51Var) {
        d dVar = (d) view;
        q9 q9Var = (q9) l41Var.I;
        TL_stars.TL_StarGiftAuctionAcquiredGift tL_StarGiftAuctionAcquiredGift = (TL_stars.TL_StarGiftAuctionAcquiredGift) l41Var.H;
        View.OnClickListener onClickListener = l41Var.E;
        int i7 = d.f3507c;
        dVar.removeAllViews();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*");
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.x5(q9Var.f26370c, org.telegram.ui.ActionBar.n6.f29669s2.getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append(' ');
        spannableStringBuilder.append((CharSequence) gd.a0(null, null, 2131750293, q9Var.d.title, Integer.valueOf(tL_StarGiftAuctionAcquiredGift.gift_num), Integer.valueOf(tL_StarGiftAuctionAcquiredGift.round)));
        spannableStringBuilder.setSpan(new i41(org.telegram.messenger.g0.o()), 0, spannableStringBuilder.length(), 33);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        spannableStringBuilder2.append((CharSequence) pb.b1(false, i5.c.l(tL_StarGiftAuctionAcquiredGift.bid_amount, ',', new StringBuilder("⭐️")), 0.75f, null));
        String a02 = gd.a0(null, null, 2131750292, Integer.valueOf(tL_StarGiftAuctionAcquiredGift.pos));
        cy0 cy0Var = new cy0(dVar.getContext(), dVar.f3508a);
        cy0Var.a(spannableStringBuilder).setFilled(true);
        cy0Var.n(gd.M0(2131750295, null), dVar.f3509b, org.telegram.messenger.n5.o(tL_StarGiftAuctionAcquiredGift.peer), new a1.e(22, dVar, onClickListener));
        cy0Var.g(tL_StarGiftAuctionAcquiredGift.date, gd.M0(2131750299, null));
        cy0Var.d(gd.M0(2131750300, null), spannableStringBuilder2, a02, null, null);
        dVar.addView(cy0Var, ma.c(-2.0f, -1));
    }

    @Override
    public final View d(Context context, ck0 ck0Var, int i7, org.telegram.ui.ActionBar.i6 i6Var) {
        d dVar = new d(i7, context, i6Var);
        dVar.setLayoutParams(ma.c(-2.0f, -1));
        return dVar;
    }

    @Override
    public final boolean f() {
        return false;
    }
}
