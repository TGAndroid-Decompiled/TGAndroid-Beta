package kh;

import android.content.Context;
import android.text.SpannableStringBuilder;
import android.view.View;
import lh.ja;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.f51;
import org.telegram.ui.Components.g61;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.sz0;
import org.telegram.ui.Components.w51;
public final class b extends h51 {
    public static final int f10468a = 0;

    static {
        h51.setup(new h51());
    }

    @Override
    public final void bindView(View view, i51 i51Var, boolean z4, w51 w51Var, g61 g61Var) {
        c cVar = (c) view;
        GiftAuctionController.Auction auction = (GiftAuctionController.Auction) i51Var.H;
        TL_stars.TL_StarGiftAuctionAcquiredGift tL_StarGiftAuctionAcquiredGift = (TL_stars.TL_StarGiftAuctionAcquiredGift) i51Var.G;
        View.OnClickListener onClickListener = i51Var.D;
        int i10 = c.f10502c;
        cVar.removeAllViews();
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*");
        spannableStringBuilder.setSpan(new org.telegram.ui.Components.u5(auction.giftDocumentId, j6.f20171s2.getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append(' ');
        spannableStringBuilder.append((CharSequence) LocaleController.formatString(R.string.Gift2AuctionsAcquiredRound2, auction.gift.title, Integer.valueOf(tL_StarGiftAuctionAcquiredGift.gift_num), Integer.valueOf(tL_StarGiftAuctionAcquiredGift.round)));
        spannableStringBuilder.setSpan(new f51(AndroidUtilities.bold()), 0, spannableStringBuilder.length(), 33);
        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
        spannableStringBuilder2.append((CharSequence) ja.X0(false, a2.l(tL_StarGiftAuctionAcquiredGift.bid_amount, ',', new StringBuilder("⭐️")), 0.75f, null));
        String formatString = LocaleController.formatString(R.string.Gift2AuctionsAcquiredTop, Integer.valueOf(tL_StarGiftAuctionAcquiredGift.pos));
        sz0 sz0Var = new sz0(cVar.getContext(), cVar.f10503a);
        sz0Var.a(spannableStringBuilder).setFilled(true);
        sz0Var.k(LocaleController.getString(R.string.Gift2AuctionsAcquiredRecipient), cVar.f10504b, DialogObject.getPeerDialogId(tL_StarGiftAuctionAcquiredGift.peer), new gf.c(20, cVar, onClickListener));
        sz0Var.f(tL_StarGiftAuctionAcquiredGift.date, LocaleController.getString(R.string.Gift2AuctionsAcquiredDate));
        sz0Var.e(LocaleController.getString(R.string.Gift2AuctionsAcquiredAcceptedBid), spannableStringBuilder2, formatString, null, null);
        cVar.addView(sz0Var, k7.b6.c(-2.0f, -1));
    }

    @Override
    public final View createView(Context context, sl0 sl0Var, int i10, int i11, org.telegram.ui.ActionBar.f6 f6Var) {
        c cVar = new c(context, i10, f6Var);
        cVar.setLayoutParams(k7.b6.c(-2.0f, -1));
        return cVar;
    }

    @Override
    public final boolean isClickable() {
        return false;
    }
}
