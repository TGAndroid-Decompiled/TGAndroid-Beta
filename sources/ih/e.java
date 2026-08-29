package ih;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.text.SpannableStringBuilder;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import jh.ia;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.iq;
import org.telegram.ui.Components.o6;
public final class e extends FrameLayout {
    public final nh.d f9107a;
    public final o6 f9108b;
    public final o6 f9109c;
    public final GiftAuctionController.Auction d;
    public final Paint f9110e;
    public final jf.p f9111f;
    public final iq h;
    public final iq[] f9112n;

    public e(Context context, GiftAuctionController.Auction auction) {
        super(context);
        Paint paint = new Paint(1);
        this.f9110e = paint;
        this.f9111f = new jf.p(new eg.n(this, 6));
        this.h = new iq(R.drawable.filled_gift_sell_24, 0);
        this.f9112n = new iq[1];
        this.d = auction;
        setPadding(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(9.0f), AndroidUtilities.dp(14.0f), AndroidUtilities.dp(9.0f));
        paint.setShadowLayer(AndroidUtilities.dp(1.0f), 0.0f, 0.0f, 536870912);
        paint.setColor(g6.w0(null, g6.f23062d6, false));
        nh.d dVar = new nh.d(context, null, true);
        this.f9107a = dVar;
        dVar.d.o(false, true, true);
        ?? imageView = new ImageView(context);
        o6 o6Var = new o6(context, false, false, false);
        this.f9108b = o6Var;
        o6Var.setTextSize(AndroidUtilities.dp(14.0f));
        o6Var.setTypeface(AndroidUtilities.bold());
        o6Var.setTextColor(g6.w0(null, g6.G6, false));
        o6 o6Var2 = new o6(context, false, false, false);
        this.f9109c = o6Var2;
        o6Var2.setTextSize(AndroidUtilities.dp(12.0f));
        TLRPC.Document document = auction.gift.sticker;
        if (document != null) {
            imageView.g(44, 44, document);
        }
        addView(o6Var, i7.f6.d(-1, 18.0f, 51, 64.0f, 15.0f, 15.0f, 0.0f));
        addView(o6Var2, i7.f6.d(-1, 17.0f, 51, 64.0f, 34.0f, 15.0f, 0.0f));
        addView((View) imageView, i7.f6.d(44, 44.0f, 51, 14.0f, 11.0f, 0.0f, 0.0f));
        addView(dVar, i7.f6.d(-1, 44.0f, 80, 15.0f, 0.0f, 15.0f, 15.0f));
        b(false);
    }

    public final void a(long j10, boolean z10) {
        String formatDurationNoHours = AndroidUtilities.formatDurationNoHours((int) j10, false);
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*");
        spannableStringBuilder.setSpan(this.h, 0, spannableStringBuilder.length(), 33);
        spannableStringBuilder.append((CharSequence) "  ");
        spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.Gift2ActiveAuctionsActiveRaiseBid));
        spannableStringBuilder.append((CharSequence) "  ");
        spannableStringBuilder.append((CharSequence) formatDurationNoHours);
        this.f9107a.g(spannableStringBuilder, z10, true);
    }

    public final void b(boolean z10) {
        GiftAuctionController.Auction auction = this.d;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = auction.auctionStateActive;
        if (tL_starGiftAuctionState != null) {
            this.f9108b.c(LocaleController.formatString(R.string.Gift2ActiveAuctionsActiveRound, LocaleController.formatNumber(tL_starGiftAuctionState.current_round, ','), LocaleController.formatNumber(auction.auctionStateActive.total_rounds, ',')), z10, true);
        }
        String m10 = j7.l1.m(auction.auctionUserState.bid_amount, ',', new StringBuilder("⭐️"));
        boolean isOutbid = auction.getBidStatus().isOutbid();
        iq[] iqVarArr = this.f9112n;
        o6 o6Var = this.f9109c;
        if (isOutbid) {
            o6Var.c(ia.X0(false, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActiveAuctionsActiveBidOutbid, m10)), 0.66f, iqVarArr), z10, true);
            o6Var.setTextColor(g6.w0(null, g6.f23295q7, false));
            return;
        }
        o6Var.c(ia.X0(false, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2ActiveAuctionsActiveBidActive, m10, Integer.valueOf(auction.getApproximatedMyPlace()))), 0.66f, iqVarArr), z10, true);
        o6Var.setTextColor(g6.w0(null, g6.G6, false));
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        canvas.drawRoundRect(AndroidUtilities.dp(14.0f), AndroidUtilities.dp(9.0f), getMeasuredWidth() - AndroidUtilities.dp(14.0f), getMeasuredHeight() - AndroidUtilities.dp(9.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), this.f9110e);
        super.dispatchDraw(canvas);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f9111f.b();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        super.onMeasure(i10, View.MeasureSpec.makeMeasureSpec(AndroidUtilities.dp(146), 1073741824));
    }
}
