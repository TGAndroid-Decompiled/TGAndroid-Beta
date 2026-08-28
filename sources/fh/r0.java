package fh;

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
import org.telegram.messenger.ll;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.o9;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.z41;
import org.telegram.ui.Components.z8;
import org.telegram.ui.qv0;
public final class r0 extends sa implements GiftAuctionController.OnAuctionUpdateListener {
    public static final int f6732b0 = 0;
    public final long T;
    public final l0 U;
    public final LinearLayout V;
    public final m0 W;
    public final TextView X;
    public final o0 Y;
    public GiftAuctionController.Auction Z;
    public z41 f6733a0;

    public r0(Context context, org.telegram.ui.ActionBar.b6 b6Var, long j10, TL_stars.StarGift starGift, ArrayList arrayList, Runnable runnable, boolean z10) {
        super(context, null, false, false, false, false, false, 1, b6Var);
        z8 z8Var;
        TLRPC.User user;
        Context context2;
        org.telegram.ui.ActionBar.b6 b6Var2;
        View view;
        long j11 = starGift.f22607id;
        this.T = j11;
        this.G = AndroidUtilities.dp(6.0f);
        this.v = 0.2f;
        setBackgroundColor(i0.a.d(0.1f, getThemedColor(org.telegram.ui.ActionBar.f6.f23091i5), getThemedColor(org.telegram.ui.ActionBar.f6.f23072h5)));
        fixNavigationBar();
        LinearLayout linearLayout = new LinearLayout(context);
        this.V = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setClickable(true);
        l0 l0Var = new l0(this, context);
        this.U = l0Var;
        linearLayout.addView(l0Var);
        kh.d dVar = new kh.d(context, b6Var, true);
        dVar.e();
        FrameLayout.LayoutParams d = g7.e6.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i9 = d.leftMargin;
        int i10 = this.backgroundPaddingLeft;
        d.leftMargin = i9 + i10;
        d.rightMargin += i10;
        this.containerView.addView(dVar, d);
        wk0 wk0Var = this.d;
        int i11 = this.backgroundPaddingLeft;
        wk0Var.setPadding(i11, 0, i11, AndroidUtilities.dp(64.0f));
        this.f6733a0.N(false);
        int i12 = z10 ? 220 : 208;
        this.Z = GiftAuctionController.getInstance(this.currentAccount).subscribeToGiftAuction(j11, this);
        m0 m0Var = new m0(this, context, b6Var, new af.e(this, 29), new n(2), new n(2), new n(2), new n(2), new n(2), new n(2), i12);
        this.W = m0Var;
        m0Var.d(new gh.l4(1, 1));
        m0Var.setPreviewingAttributes(arrayList);
        m0Var.removeView(m0Var.K);
        l0Var.addView(m0Var, 0, g7.e6.e(-1, i12, 48));
        o9 o9Var = new o9(context);
        o9Var.setRoundRadius(AndroidUtilities.dp(45.0f));
        l0Var.addView(o9Var, g7.e6.d(90, 90.0f, 49, 0.0f, 42.0f, 0.0f, 0.0f));
        int i13 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i13 == 0) {
            TLRPC.User user2 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(this.currentAccount).getClientUserId()));
            z8Var = new z8(0, user2);
            user = user2;
        } else if (i13 > 0) {
            TLRPC.User user3 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j10));
            z8Var = new z8(0, user3);
            user = user3;
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j10));
            z8Var = new z8(chat);
            user = chat;
        }
        o9Var.e(user, z8Var);
        TextView textView = new TextView(context);
        this.X = textView;
        ll.k(21.0f, 1, textView);
        textView.setText(DialogObject.getShortName(i13 != 0 ? j10 : UserConfig.getInstance(this.currentAccount).getClientUserId()));
        textView.setGravity(17);
        textView.setTextColor(-1);
        textView.setPadding(0, 0, AndroidUtilities.dp(36.0f), 0);
        textView.setSingleLine();
        textView.setEllipsize(TextUtils.TruncateAt.END);
        textView.setMaxLines(1);
        l0Var.addView(textView, g7.e6.d(-2, -2.0f, 81, 16.0f, 0.0f, 16.0f, 40.0f));
        TextView textView2 = new TextView(context);
        textView2.setTextSize(1, 13.0f);
        textView2.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
        textView2.setGravity(17);
        textView2.setTextColor(-1342177281);
        if (z10) {
            textView2.setText(LocaleController.getString(R.string.GiftAuctionWearInfoOnline));
            context2 = context;
            b6Var2 = b6Var;
        } else {
            textView2.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.Gift2AuctionLearnMore3), false, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
            context2 = context;
            b6Var2 = b6Var;
            textView2.setOnClickListener(new z(context, b6Var, j10, starGift, arrayList));
            g7.g6.b(textView2, 0.02f, 1.5f);
        }
        l0Var.addView(textView2, g7.e6.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 12.0f));
        LinearLayout linearLayout2 = new LinearLayout(context2);
        linearLayout2.setOrientation(0);
        linearLayout2.setGravity(17);
        linearLayout2.setClickable(true);
        f2 f2Var = new f2(context2, this.currentAccount, b6Var2);
        f2Var.T = true;
        org.telegram.ui.ActionBar.b6 b6Var3 = b6Var2;
        f2Var.g(starGift, true, false, false, false, false);
        f2Var.setImageSize(AndroidUtilities.dp(84.0f));
        f2Var.setImageLayer(7);
        f2Var.F.setVisibility(8);
        f2Var.f6446e.g(null);
        f2Var.setRibbonTextOneOf(this.Z.gift.availability_total);
        linearLayout2.addView(f2Var, g7.e6.l(0.0f, 116, 116));
        ImageView imageView = new ImageView(context);
        imageView.setImageResource(R.drawable.ic_ab_back);
        imageView.setScaleX(-1.0f);
        imageView.setColorFilter(new PorterDuffColorFilter(getThemedColor(org.telegram.ui.ActionBar.f6.f23162m6), PorterDuff.Mode.SRC_IN));
        linearLayout2.addView(imageView, g7.e6.p(24, 24, 0.0f, 16, 12, 0, 12, 0));
        o0 o0Var = new o0(this, context, this.currentAccount, b6Var3);
        this.Y = o0Var;
        o0Var.d.removeView(o0Var.f6456y);
        o0Var.T = true;
        o0Var.g(starGift, true, false, false, false, false);
        o0Var.setImageSize(AndroidUtilities.dp(100.0f));
        o0Var.setImageLayer(7);
        o0Var.F.setVisibility(8);
        o0Var.f6446e.g(null);
        o0Var.setRibbonTextOneOf(this.Z.gift.availability_total);
        o0Var.setRibbonText(LocaleController.getString(R.string.Gift2AuctionUpgradedShort));
        linearLayout2.addView(o0Var, g7.e6.l(0.0f, 116, 116));
        TextView textView3 = new TextView(context);
        textView3.setTextSize(1, 13.0f);
        textView3.setGravity(17);
        textView3.setText(LocaleController.getString(R.string.Gift2WearingHint));
        int i14 = org.telegram.ui.ActionBar.f6.f23369y6;
        textView3.setTextColor(getThemedColor(i14));
        float clamp = Utilities.clamp(starGift.availability_remains / starGift.availability_total, 1.0f, 0.0f);
        FrameLayout frameLayout = new FrameLayout(context);
        int dp = AndroidUtilities.dp(14.0f);
        int v02 = org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23001d6, b6Var3);
        int i15 = org.telegram.ui.ActionBar.f6.G6;
        frameLayout.setBackground(org.telegram.ui.ActionBar.f6.b0(dp, i0.a.d(0.2f, v02, org.telegram.ui.ActionBar.f6.v0(i15, b6Var3))));
        TextView textView4 = new TextView(context);
        textView4.setTextSize(1, 13.0f);
        textView4.setGravity(19);
        textView4.setTypeface(AndroidUtilities.bold());
        textView4.setTextColor(org.telegram.ui.ActionBar.f6.v0(i15, b6Var3));
        textView4.setText(LocaleController.formatPluralStringComma("Gift2AvailabilityLeft", starGift.availability_remains));
        TextView g10 = org.telegram.ui.Cells.j2.g(frameLayout, textView4, g7.e6.d(-1, -1.0f, 3, 11.0f, 0.0f, 11.0f, 0.0f), context);
        g10.setTextSize(1, 13.0f);
        g10.setGravity(21);
        g10.setTypeface(AndroidUtilities.bold());
        g10.setTextColor(org.telegram.ui.ActionBar.f6.v0(i15, b6Var3));
        g10.setText(LocaleController.formatPluralStringComma("Gift2AvailabilitySold", starGift.availability_total - starGift.availability_remains));
        frameLayout.addView(g10, g7.e6.d(-1, -1.0f, 5, 11.0f, 0.0f, 11.0f, 0.0f));
        View p0Var = new p0(context, clamp);
        p0Var.setBackground(org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp(14.0f), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Oh, b6Var3)));
        frameLayout.addView(p0Var, g7.e6.e(-1, -1, 119));
        q0 q0Var = new q0(context, clamp);
        q0Var.setWillNotDraw(false);
        frameLayout.addView(q0Var, g7.e6.e(-1, -1, 119));
        TextView textView5 = new TextView(context);
        textView5.setTextSize(1, 13.0f);
        textView5.setGravity(19);
        textView5.setTypeface(AndroidUtilities.bold());
        textView5.setTextColor(-1);
        textView5.setText(LocaleController.formatPluralStringComma("Gift2AvailabilityLeft", starGift.availability_remains));
        q0Var.addView(textView5, g7.e6.d(-1, -1.0f, 3, 11.0f, 0.0f, 11.0f, 0.0f));
        TextView textView6 = new TextView(context);
        textView6.setTextSize(1, 13.0f);
        textView6.setGravity(21);
        textView6.setTypeface(AndroidUtilities.bold());
        textView6.setTextColor(-1);
        textView6.setText(LocaleController.formatPluralStringComma("Gift2AvailabilitySold", starGift.availability_total - starGift.availability_remains));
        q0Var.addView(textView6, g7.e6.d(-1, -1.0f, 5, 11.0f, 0.0f, 11.0f, 0.0f));
        GiftAuctionController.Auction auction = this.Z;
        if (auction == null || auction.auctionStateActive == null) {
            view = null;
        } else {
            l80 l80Var = new l80(context, null);
            l80Var.setTextSize(1, 13.0f);
            l80Var.setGravity(17);
            l80Var.setTextColor(getThemedColor(i14));
            l80Var.setText(AndroidUtilities.replaceTags(LocaleController.formatSpannable(R.string.Gift2AuctionInfo3, LocaleController.formatNumber(starGift.availability_total, ','), Integer.valueOf(this.Z.auctionStateActive.total_rounds), Integer.valueOf(starGift.gifts_per_round), AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2AuctionInfoLearnMore), new d0(context, b6Var3, starGift, 1)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)))));
            l80Var.setLinkTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.J6, b6Var3));
            view = l80Var;
        }
        if (z10) {
            TextView textView7 = new TextView(context);
            textView7.setTypeface(AndroidUtilities.bold());
            textView7.setGravity(17);
            textView7.setText(LocaleController.formatString(R.string.GiftAuctionWearInfoHeader, starGift.title));
            textView7.setTextSize(1, 20.0f);
            textView7.setTextColor(org.telegram.ui.ActionBar.f6.v0(i15, b6Var3));
            linearLayout.addView(textView7, g7.e6.t(-1, -2, 17, 20, 14, 20, 6));
            TextView textView8 = new TextView(context);
            textView8.setGravity(17);
            textView8.setText(LocaleController.getString(R.string.GiftAuctionWearInfoText));
            textView8.setTextSize(1, 14.0f);
            textView8.setTextColor(org.telegram.ui.ActionBar.f6.v0(i15, b6Var3));
            linearLayout.addView(textView8, g7.e6.t(-1, -2, 17, 20, 0, 20, 16));
            qv0 qv0Var = new qv0(context, b6Var3);
            qv0Var.f42205a.l(LocaleController.getString(R.string.GiftAuctionWearInfo1Header), false);
            qv0Var.f42206b.setText(LocaleController.getString(R.string.GiftAuctionWearInfo1Text));
            qv0Var.d.setVisibility(8);
            int i16 = R.drawable.msg_emoji_gem;
            ImageView imageView2 = qv0Var.f42207c;
            imageView2.setImageResource(i16);
            imageView2.setColorFilter(org.telegram.ui.ActionBar.f6.v0(i15, b6Var3));
            linearLayout.addView(qv0Var, g7.e6.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
            qv0 qv0Var2 = new qv0(context, b6Var3);
            qv0Var2.f42205a.l(LocaleController.getString(R.string.GiftAuctionWearInfo2Header), false);
            qv0Var2.f42206b.setText(LocaleController.getString(R.string.GiftAuctionWearInfo2Text));
            qv0Var2.d.setVisibility(8);
            int i17 = R.drawable.menu_feature_cover_24;
            ImageView imageView3 = qv0Var2.f42207c;
            imageView3.setImageResource(i17);
            imageView3.setColorFilter(org.telegram.ui.ActionBar.f6.v0(i15, b6Var3));
            linearLayout.addView(qv0Var2, g7.e6.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
            qv0 qv0Var3 = new qv0(context, b6Var3);
            qv0Var3.f42205a.l(LocaleController.getString(R.string.GiftAuctionWearInfo3Header), false);
            qv0Var3.f42206b.setText(LocaleController.getString(R.string.GiftAuctionWearInfo3Text));
            qv0Var3.d.setVisibility(8);
            int i18 = R.drawable.menu_verification;
            ImageView imageView4 = qv0Var3.f42207c;
            imageView4.setImageResource(i18);
            imageView4.setColorFilter(org.telegram.ui.ActionBar.f6.v0(i15, b6Var3));
            linearLayout.addView(qv0Var3, g7.e6.k(6.0f, 0.0f, 6.0f, 14.0f, -1, -2));
            dVar.g(gh.k5.g2(LocaleController.getString(R.string.Understood)), false, true);
            dVar.setOnClickListener(new androidx.mediarouter.app.c(this, 6));
            return;
        }
        linearLayout.addView(linearLayout2, g7.e6.k(0.0f, 20.0f, 0.0f, 10.0f, -1, -2));
        linearLayout.addView(textView3, g7.e6.k(40.0f, 0.0f, 40.0f, 15.0f, -1, -2));
        linearLayout.addView(frameLayout, g7.e6.k(14.0f, 18.0f, 14.0f, 10.0f, -1, 28));
        if (view != null) {
            linearLayout.addView(view, g7.e6.k(40.0f, 0.0f, 40.0f, 32.0f, -1, -2));
        }
        int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
        GiftAuctionController.Auction auction2 = this.Z;
        if (auction2 != null && auction2.isUpcoming(currentTime)) {
            dVar.g(LocaleController.getString(R.string.Gift2AuctionPlaceAEarlyBid), false, true);
        } else {
            dVar.g(LocaleController.getString(R.string.Gift2AuctionPlaceABid), false, true);
        }
        GiftAuctionController.Auction auction3 = this.Z;
        if (auction3 != null && auction3.auctionStateActive != null) {
            if (auction3.isUpcoming(currentTime)) {
                dVar.f(LocaleController.formatString(R.string.Gift2AuctionStartsIn, LocaleController.formatTTLString(this.Z.auctionStateActive.start_date - currentTime)), false);
            } else {
                dVar.f(LocaleController.formatString(R.string.Gift2AuctionTimeLeft, LocaleController.formatTTLString(this.Z.auctionStateActive.end_date - currentTime)), false);
            }
        }
        dVar.setOnClickListener(new z(this, j10, context, b6Var3, runnable, 1));
    }

    @Override
    public final void dismiss() {
        GiftAuctionController.getInstance(this.currentAccount).unsubscribeFromGiftAuction(this.T, this);
        super.dismiss();
    }

    @Override
    public final void onUpdate(GiftAuctionController.Auction auction) {
        this.Z = auction;
    }

    @Override
    public final vk0 v(wk0 wk0Var) {
        z41 z41Var = new z41(this.d, getContext(), this.currentAccount, 0, true, new bh.c(this, 7), this.resourcesProvider);
        this.f6733a0 = z41Var;
        z41Var.f35188r = false;
        return z41Var;
    }

    @Override
    public final CharSequence y() {
        return "";
    }
}
