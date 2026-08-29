package ih;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import jh.ia;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.hz0;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.t41;
import org.telegram.ui.Components.u51;
import org.telegram.ui.Components.v41;
import org.telegram.ui.Components.w41;
public final class b extends v41 {
    public static final int f9025a = 0;

    static {
        v41.setup(new v41());
    }

    @Override
    public final void bindView(View view, w41 w41Var, boolean z10, k51 k51Var, u51 u51Var) {
        c cVar = (c) view;
        GiftAuctionController.Auction auction = (GiftAuctionController.Auction) w41Var.H;
        TL_stars.TL_StarGiftAuctionAcquiredGift tL_StarGiftAuctionAcquiredGift = (TL_stars.TL_StarGiftAuctionAcquiredGift) w41Var.G;
        View.OnClickListener onClickListener = w41Var.D;
        int i10 = c.f9064c;
        cVar.removeAllViews();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*");
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.y5(auction.giftDocumentId, g6.f23323s2.getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append(' ');
        spannableStringBuilder.append((CharSequence) LocaleController.formatString(R.string.Gift2AuctionsAcquiredRound2, auction.gift.title, Integer.valueOf(tL_StarGiftAuctionAcquiredGift.gift_num), Integer.valueOf(tL_StarGiftAuctionAcquiredGift.round)));
        spannableStringBuilder.setSpan(new t41(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        spannableStringBuilder2.append((CharSequence) ia.X0(false, j7.l1.m(tL_StarGiftAuctionAcquiredGift.bid_amount, ',', new StringBuilder("⭐️")), 0.75f, null));
        String formatString = LocaleController.formatString(R.string.Gift2AuctionsAcquiredTop, Integer.valueOf(tL_StarGiftAuctionAcquiredGift.pos));
        hz0 hz0Var = new hz0(cVar.getContext(), cVar.f9065a);
        hz0Var.a(spannableStringBuilder).setFilled(true);
        hz0Var.k(LocaleController.getString(R.string.Gift2AuctionsAcquiredRecipient), cVar.f9066b, DialogObject.getPeerDialogId(tL_StarGiftAuctionAcquiredGift.peer), new ef.c(18, cVar, onClickListener));
        hz0Var.f(tL_StarGiftAuctionAcquiredGift.date, LocaleController.getString(R.string.Gift2AuctionsAcquiredDate));
        hz0Var.e(LocaleController.getString(R.string.Gift2AuctionsAcquiredAcceptedBid), spannableStringBuilder2, formatString, null, null);
        cVar.addView(hz0Var, i7.f6.c(-2.0f, -1));
    }

    @Override
    public final View createView(Context context, jl0 jl0Var, int i10, int i11, org.telegram.ui.ActionBar.c6 c6Var) {
        c cVar = new c(context, i10, c6Var);
        cVar.setLayoutParams(i7.f6.c(-2.0f, -1));
        return cVar;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
