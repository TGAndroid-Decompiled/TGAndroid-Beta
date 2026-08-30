package kh;

import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.e90;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.z8;
import org.telegram.ui.yh;
import org.telegram.ui.zv0;
public final class m0 extends sa implements GiftAuctionController.OnAuctionUpdateListener {
    public static final int f10702c0 = 0;
    public final long U;
    public final g0 V;
    public final LinearLayout W;
    public final h0 X;
    public final TextView Y;
    public final j0 Z;
    public GiftAuctionController.Auction f10703a0;
    public w51 f10704b0;

    public m0(Context context, org.telegram.ui.ActionBar.f6 f6Var, long j10, TL_stars.StarGift starGift, ArrayList arrayList, Runnable runnable, boolean z4) {
        super(context, null, false, false, false, false, false, 1, f6Var);
        int i10;
        z8 z8Var;
        TLRPC.User user;
        long clientUserId;
        Context context2;
        org.telegram.ui.ActionBar.f6 f6Var2;
        View view;
        long j11 = starGift.f19409id;
        this.U = j11;
        this.H = AndroidUtilities.dp(6.0f);
        this.v = 0.2f;
        setBackgroundColor(i0.a.d(0.1f, getThemedColor(j6.f19995i5), getThemedColor(j6.f19977h5)));
        fixNavigationBar();
        LinearLayout linearLayout = new LinearLayout(context);
        this.W = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setClickable(true);
        g0 g0Var = new g0(this, context);
        this.V = g0Var;
        linearLayout.addView(g0Var);
        ph.d dVar = new ph.d(context, f6Var, true);
        dVar.e();
        FrameLayout.LayoutParams d = k7.b6.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i11 = d.leftMargin;
        int i12 = this.backgroundPaddingLeft;
        d.leftMargin = i11 + i12;
        d.rightMargin += i12;
        this.containerView.addView(dVar, d);
        sl0 sl0Var = this.d;
        int i13 = this.backgroundPaddingLeft;
        sl0Var.setPadding(i13, 0, i13, AndroidUtilities.dp(64.0f));
        this.f10704b0.N(false);
        if (z4) {
            i10 = 220;
        } else {
            i10 = 208;
        }
        this.f10703a0 = GiftAuctionController.getInstance(this.currentAccount).subscribeToGiftAuction(j11, this);
        h0 h0Var = new h0(this, context, f6Var, new ef.e(this, 23), new dg.m(4), new dg.m(4), new dg.m(4), new dg.m(4), new dg.m(4), new dg.m(4), i10);
        this.X = h0Var;
        h0Var.d(new c5.d(1, 1));
        h0Var.setPreviewingAttributes(arrayList);
        h0Var.removeView(h0Var.L);
        g0Var.addView(h0Var, 0, k7.b6.e(-1, i10, 48));
        p9 p9Var = new p9(context);
        p9Var.setRoundRadius(AndroidUtilities.dp(45.0f));
        g0Var.addView(p9Var, k7.b6.d(90, 90.0f, 49, 0.0f, 42.0f, 0.0f, 0.0f));
        int i14 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i14 == 0) {
            TLRPC.User user2 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(this.currentAccount).getClientUserId()));
            z8Var = new z8(0, user2);
            user = user2;
        } else if (i14 > 0) {
            TLRPC.User user3 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j10));
            z8Var = new z8(0, user3);
            user = user3;
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j10));
            z8Var = new z8(chat);
            user = chat;
        }
        p9Var.e(user, z8Var);
        TextView textView = new TextView(context);
        this.Y = textView;
        org.telegram.ui.b.g(21.0f, 1, textView);
        if (i14 != 0) {
            clientUserId = j10;
        } else {
            clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
        }
        textView.setText(DialogObject.getShortName(clientUserId));
        textView.setGravity(17);
        textView.setTextColor(-1);
        textView.setPadding(0, 0, AndroidUtilities.dp(36.0f), 0);
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setMaxLines(1);
        g0Var.addView(textView, k7.b6.d(-2, -2.0f, 81, 16.0f, 0.0f, 16.0f, 40.0f));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 13.0f);
        textView2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        textView2.setGravity(17);
        textView2.setTextColor(-1342177281);
        if (z4) {
            textView2.setText(LocaleController.getString(R.string.GiftAuctionWearInfoOnline));
            context2 = context;
            f6Var2 = f6Var;
        } else {
            textView2.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.Gift2AuctionLearnMore3), false, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
            context2 = context;
            f6Var2 = f6Var;
            textView2.setOnClickListener(new u(context, f6Var, j10, starGift, arrayList));
            k7.d6.b(textView2, 0.02f, 1.5f);
        }
        g0Var.addView(textView2, k7.b6.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 12.0f));
        LinearLayout linearLayout2 = new LinearLayout(context2);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(17);
        linearLayout2.setClickable(true);
        x1 x1Var = new x1(context2, this.currentAccount, f6Var2);
        x1Var.U = true;
        org.telegram.ui.ActionBar.f6 f6Var3 = f6Var2;
        x1Var.g(starGift, true, false, false, false, false);
        x1Var.setImageSize(AndroidUtilities.dp(84.0f));
        x1Var.setImageLayer(7);
        x1Var.G.setVisibility(8);
        x1Var.e.g(null);
        x1Var.setRibbonTextOneOf(this.f10703a0.gift.availability_total);
        linearLayout2.addView(x1Var, k7.b6.l(0.0f, 116, 116));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.ic_ab_back);
        imageView.setScaleX(-1.0f);
        imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(j6.f20067m6), PorterDuff.Mode.SRC_IN));
        linearLayout2.addView(imageView, k7.b6.p(24, 24, 0.0f, 16, 12, 0, 12, 0));
        j0 j0Var = new j0(this, context, this.currentAccount, f6Var3);
        this.Z = j0Var;
        j0Var.d.removeView(j0Var.f10936y);
        j0Var.U = true;
        j0Var.g(starGift, true, false, false, false, false);
        j0Var.setImageSize(AndroidUtilities.dp(100.0f));
        j0Var.setImageLayer(7);
        j0Var.G.setVisibility(8);
        j0Var.e.g(null);
        j0Var.setRibbonTextOneOf(this.f10703a0.gift.availability_total);
        j0Var.setRibbonText(LocaleController.getString(R.string.Gift2AuctionUpgradedShort));
        linearLayout2.addView(j0Var, k7.b6.l(0.0f, 116, 116));
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 13.0f);
        textView3.setGravity(17);
        textView3.setText(LocaleController.getString(R.string.Gift2WearingHint));
        int i15 = j6.f20281y6;
        textView3.setTextColor(getThemedColor(i15));
        float clamp = Utilities.clamp(starGift.availability_remains / starGift.availability_total, 1.0f, 0.0f);
        FrameLayout frameLayout = new FrameLayout(context);
        int dp = AndroidUtilities.dp(14.0f);
        int v02 = j6.v0(j6.f19906d6, f6Var3);
        int i16 = j6.G6;
        frameLayout.setBackground(j6.b0(dp, i0.a.d(0.2f, v02, j6.v0(i16, f6Var3))));
        TextView textView4 = new TextView(context);
        textView4.setTextSize(1, 13.0f);
        textView4.setGravity(19);
        textView4.setTypeface(AndroidUtilities.bold());
        textView4.setTextColor(j6.v0(i16, f6Var3));
        textView4.setText(LocaleController.formatPluralStringComma("Gift2AvailabilityLeft", starGift.availability_remains));
        TextView i17 = yh.i(frameLayout, textView4, k7.b6.d(-1, -1.0f, 3, 11.0f, 0.0f, 11.0f, 0.0f), context);
        i17.setTextSize(1, 13.0f);
        i17.setGravity(21);
        i17.setTypeface(AndroidUtilities.bold());
        i17.setTextColor(j6.v0(i16, f6Var3));
        i17.setText(LocaleController.formatPluralStringComma("Gift2AvailabilitySold", starGift.availability_total - starGift.availability_remains));
        frameLayout.addView(i17, k7.b6.d(-1, -1.0f, 5, 11.0f, 0.0f, 11.0f, 0.0f));
        View k0Var = new k0(context, clamp);
        k0Var.setBackground(j6.b0(AndroidUtilities.dp(14.0f), j6.v0(j6.Oh, f6Var3)));
        frameLayout.addView(k0Var, k7.b6.e(-1, -1, 119));
        l0 l0Var = new l0(context, clamp);
        l0Var.setWillNotDraw(false);
        frameLayout.addView(l0Var, k7.b6.e(-1, -1, 119));
        TextView textView5 = new TextView(context);
        textView5.setTextSize(1, 13.0f);
        textView5.setGravity(19);
        textView5.setTypeface(AndroidUtilities.bold());
        textView5.setTextColor(-1);
        textView5.setText(LocaleController.formatPluralStringComma("Gift2AvailabilityLeft", starGift.availability_remains));
        l0Var.addView(textView5, k7.b6.d(-1, -1.0f, 3, 11.0f, 0.0f, 11.0f, 0.0f));
        TextView textView6 = new TextView(context);
        textView6.setTextSize(1, 13.0f);
        textView6.setGravity(21);
        textView6.setTypeface(AndroidUtilities.bold());
        textView6.setTextColor(-1);
        textView6.setText(LocaleController.formatPluralStringComma("Gift2AvailabilitySold", starGift.availability_total - starGift.availability_remains));
        l0Var.addView(textView6, k7.b6.d(-1, -1.0f, 5, 11.0f, 0.0f, 11.0f, 0.0f));
        GiftAuctionController.Auction auction = this.f10703a0;
        if (auction != null && auction.auctionStateActive != null) {
            e90 e90Var = new e90(context, null);
            e90Var.setTextSize(1, 13.0f);
            e90Var.setGravity(17);
            e90Var.setTextColor(getThemedColor(i15));
            e90Var.setText(AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.Gift2AuctionInfo3, LocaleController.formatNumber(starGift.availability_total, ','), Integer.valueOf(this.f10703a0.auctionStateActive.total_rounds), Integer.valueOf(starGift.gifts_per_round), AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2AuctionInfoLearnMore), new y(context, f6Var3, starGift, 1)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)))));
            e90Var.setLinkTextColor(j6.v0(j6.J6, f6Var3));
            view = e90Var;
        } else {
            view = null;
        }
        if (z4) {
            TextView textView7 = new TextView(context);
            textView7.setTypeface(AndroidUtilities.bold());
            textView7.setGravity(17);
            textView7.setText(LocaleController.formatString(R.string.GiftAuctionWearInfoHeader, starGift.title));
            textView7.setTextSize(1, 20.0f);
            textView7.setTextColor(j6.v0(i16, f6Var3));
            linearLayout.addView(textView7, k7.b6.t(-1, -2, 17, 20, 14, 20, 6));
            TextView textView8 = new TextView(context);
            textView8.setGravity(17);
            textView8.setText(LocaleController.getString(R.string.GiftAuctionWearInfoText));
            textView8.setTextSize(1, 14.0f);
            textView8.setTextColor(j6.v0(i16, f6Var3));
            linearLayout.addView(textView8, k7.b6.t(-1, -2, 17, 20, 0, 20, 16));
            zv0 zv0Var = new zv0(context, f6Var3);
            zv0Var.f40867a.l(LocaleController.getString(R.string.GiftAuctionWearInfo1Header), false);
            zv0Var.f40868b.setText(LocaleController.getString(R.string.GiftAuctionWearInfo1Text));
            zv0Var.d.setVisibility(8);
            int i18 = R.drawable.msg_emoji_gem;
            ImageView imageView2 = zv0Var.f40869c;
            imageView2.setImageResource(i18);
            imageView2.setColorFilter(j6.v0(i16, f6Var3));
            linearLayout.addView(zv0Var, k7.b6.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
            zv0 zv0Var2 = new zv0(context, f6Var3);
            zv0Var2.f40867a.l(LocaleController.getString(R.string.GiftAuctionWearInfo2Header), false);
            zv0Var2.f40868b.setText(LocaleController.getString(R.string.GiftAuctionWearInfo2Text));
            zv0Var2.d.setVisibility(8);
            int i19 = R.drawable.menu_feature_cover_24;
            ImageView imageView3 = zv0Var2.f40869c;
            imageView3.setImageResource(i19);
            imageView3.setColorFilter(j6.v0(i16, f6Var3));
            linearLayout.addView(zv0Var2, k7.b6.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
            zv0 zv0Var3 = new zv0(context, f6Var3);
            zv0Var3.f40867a.l(LocaleController.getString(R.string.GiftAuctionWearInfo3Header), false);
            zv0Var3.f40868b.setText(LocaleController.getString(R.string.GiftAuctionWearInfo3Text));
            zv0Var3.d.setVisibility(8);
            int i20 = R.drawable.menu_verification;
            ImageView imageView4 = zv0Var3.f40869c;
            imageView4.setImageResource(i20);
            imageView4.setColorFilter(j6.v0(i16, f6Var3));
            linearLayout.addView(zv0Var3, k7.b6.k(6.0f, 0.0f, 6.0f, 14.0f, -1, -2));
            dVar.g(lh.g5.g2(LocaleController.getString(R.string.Understood)), false, true);
            dVar.setOnClickListener(new androidx.mediarouter.app.c(this, 12));
            return;
        }
        linearLayout.addView(linearLayout2, k7.b6.k(0.0f, 20.0f, 0.0f, 10.0f, -1, -2));
        linearLayout.addView(textView3, k7.b6.k(40.0f, 0.0f, 40.0f, 15.0f, -1, -2));
        linearLayout.addView(frameLayout, k7.b6.k(14.0f, 18.0f, 14.0f, 10.0f, -1, 28));
        if (view != null) {
            linearLayout.addView(view, k7.b6.k(40.0f, 0.0f, 40.0f, 32.0f, -1, -2));
        }
        int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
        GiftAuctionController.Auction auction2 = this.f10703a0;
        if (auction2 != null && auction2.isUpcoming(currentTime)) {
            dVar.g(LocaleController.getString(R.string.Gift2AuctionPlaceAEarlyBid), false, true);
        } else {
            dVar.g(LocaleController.getString(R.string.Gift2AuctionPlaceABid), false, true);
        }
        GiftAuctionController.Auction auction3 = this.f10703a0;
        if (auction3 != null && auction3.auctionStateActive != null) {
            if (auction3.isUpcoming(currentTime)) {
                dVar.f(LocaleController.formatString(R.string.Gift2AuctionStartsIn, LocaleController.formatTTLString(this.f10703a0.auctionStateActive.start_date - currentTime)), false);
            } else {
                dVar.f(LocaleController.formatString(R.string.Gift2AuctionTimeLeft, LocaleController.formatTTLString(this.f10703a0.auctionStateActive.end_date - currentTime)), false);
            }
        }
        dVar.setOnClickListener(new u(this, j10, context, f6Var3, runnable, 1));
    }

    @Override
    public final void dismiss() {
        GiftAuctionController.getInstance(this.currentAccount).unsubscribeFromGiftAuction(this.U, this);
        super.dismiss();
    }

    @Override
    public final void onUpdate(GiftAuctionController.Auction auction) {
        this.f10703a0 = auction;
    }

    @Override
    public final rl0 v(sl0 sl0Var) {
        w51 w51Var = new w51(this.d, getContext(), this.currentAccount, 0, true, new dg.r1(this, 8), this.resourcesProvider);
        this.f10704b0 = w51Var;
        w51Var.f30240r = false;
        return w51Var;
    }

    @Override
    public final CharSequence y() {
        return "";
    }
}
