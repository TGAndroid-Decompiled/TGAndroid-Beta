package lh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import mh.ja;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.e51;
import org.telegram.ui.Components.g51;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.h61;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.sz0;
import org.telegram.ui.Components.w51;
public final class b extends g51 {
    public static final int f12601a = 0;

    static {
        g51.setup(new g51());
    }

    @Override
    public final void bindView(View view, h51 h51Var, boolean z4, w51 w51Var, h61 h61Var) {
        c cVar = (c) view;
        GiftAuctionController.Auction auction = (GiftAuctionController.Auction) h51Var.H;
        TL_stars.TL_StarGiftAuctionAcquiredGift tL_StarGiftAuctionAcquiredGift = (TL_stars.TL_StarGiftAuctionAcquiredGift) h51Var.G;
        View.OnClickListener onClickListener = h51Var.D;
        int i10 = c.f12641c;
        cVar.removeAllViews();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*");
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.u5(auction.giftDocumentId, k6.f21927s2.getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append(' ');
        spannableStringBuilder.append((CharSequence) LocaleController.formatString(R.string.Gift2AuctionsAcquiredRound2, auction.gift.title, Integer.valueOf(tL_StarGiftAuctionAcquiredGift.gift_num), Integer.valueOf(tL_StarGiftAuctionAcquiredGift.round)));
        spannableStringBuilder.setSpan(new e51(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        spannableStringBuilder2.append((CharSequence) ja.X0(false, l.d.l(tL_StarGiftAuctionAcquiredGift.bid_amount, ',', new StringBuilder("⭐️")), 0.75f, null));
        String formatString = LocaleController.formatString(R.string.Gift2AuctionsAcquiredTop, Integer.valueOf(tL_StarGiftAuctionAcquiredGift.pos));
        sz0 sz0Var = new sz0(cVar.getContext(), cVar.f12642a);
        sz0Var.a(spannableStringBuilder).setFilled(true);
        sz0Var.k(LocaleController.getString(R.string.Gift2AuctionsAcquiredRecipient), cVar.f12643b, DialogObject.getPeerDialogId(tL_StarGiftAuctionAcquiredGift.peer), new gf.c(22, cVar, onClickListener));
        sz0Var.f(tL_StarGiftAuctionAcquiredGift.date, LocaleController.getString(R.string.Gift2AuctionsAcquiredDate));
        sz0Var.e(LocaleController.getString(R.string.Gift2AuctionsAcquiredAcceptedBid), spannableStringBuilder2, formatString, null, null);
        cVar.addView(sz0Var, k7.c6.c(-2.0f, -1));
    }

    @Override
    public final View createView(Context context, sl0 sl0Var, int i10, int i11, g6 g6Var) {
        c cVar = new c(context, i10, g6Var);
        cVar.setLayoutParams(k7.c6.c(-2.0f, -1));
        return cVar;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
