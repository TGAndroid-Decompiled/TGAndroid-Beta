package kh;

import android.content.Context;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TableRow;
import android.widget.TextView;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.f90;
import org.telegram.ui.Components.ql0;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.rz0;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.sz0;
import org.telegram.ui.Components.w51;
import org.telegram.ui.ai;
import org.telegram.ui.gw0;
public final class f0 extends sa implements GiftAuctionController.OnAuctionUpdateListener {
    public static final sc[] m0 = new sc[1];
    public static final rz0[] f10695n0 = new rz0[1];
    public final TL_stars.StarGift U;
    public final long V;
    public final LinearLayout W;
    public final FrameLayout X;
    public final TextView Y;
    public final sc Z;
    public final sc f10696a0;
    public final sc f10697b0;
    public final sc f10698c0;
    public final rz0 f10699d0;
    public final a0 f10700e0;
    public final TableRow f10701f0;
    public final ph.d f10702g0;
    public final f90 f10703h0;
    public final f90 f10704i0;
    public GiftAuctionController.Auction f10705j0;
    public final CharSequence f10706k0;
    public w51 f10707l0;

    public f0(Context context, f6 f6Var, long j10, TL_stars.StarGift starGift, Runnable runnable) {
        super(context, null, false, false, false, false, false, 1, f6Var);
        boolean z4;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState;
        ArrayList<TL_stars.StarGiftAuctionRound> arrayList;
        int i10;
        int i11;
        String formatString;
        String formatPluralString;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState2;
        this.U = starGift;
        long j11 = starGift.f19384id;
        this.V = j11;
        this.H = AndroidUtilities.dp(6.0f);
        this.v = 0.2f;
        fixNavigationBar();
        String str = starGift.title;
        String str2 = str == null ? "Gift" : str;
        LinearLayout linearLayout = new LinearLayout(context);
        this.W = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setClickable(true);
        org.telegram.ui.ActionBar.k kVar = new org.telegram.ui.ActionBar.k(context, f6Var);
        kVar.C(-1, false);
        kVar.setOccupyStatusBar(false);
        S(kVar, context, f6Var, starGift);
        FrameLayout frameLayout = new FrameLayout(context);
        this.X = frameLayout;
        frameLayout.addView(kVar, k7.b6.n(-1, -2));
        linearLayout.addView(frameLayout);
        x1 x1Var = new x1(context, this.currentAccount, f6Var);
        x1Var.U = true;
        x1Var.g(starGift, false, false, false, false, false);
        x1Var.setImageSize(AndroidUtilities.dp(100.0f));
        x1Var.setImageLayer(7);
        x1Var.G.setVisibility(8);
        frameLayout.addView(x1Var, k7.b6.d(130, 130.0f, 17, 0.0f, 18.0f, 0.0f, 14.0f));
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setText(str2);
        textView.setTextSize(1, 20.0f);
        int i12 = j6.G6;
        textView.setTextColor(j6.v0(i12, f6Var));
        linearLayout.addView(textView, k7.b6.t(-1, -2, 17, 20, 0, 20, 6));
        f90 f90Var = new f90(context, null);
        this.f10703h0 = f90Var;
        f90Var.setGravity(17);
        f90Var.setText(TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.formatPluralString("Gift2AuctionInfo2", starGift.gifts_per_round, str2)), " ", AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2AuctionInfoLearnMore), new y(context, f6Var, starGift, 0)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f))));
        f90Var.setTextSize(1, 14.0f);
        f90Var.setTextColor(j6.v0(i12, f6Var));
        int i13 = j6.J6;
        f90Var.setLinkTextColor(j6.v0(i13, f6Var));
        linearLayout.addView(f90Var, k7.b6.t(-1, -2, 17, 20, 0, 20, 4));
        sz0 sz0Var = new sz0(context, f6Var);
        String string = LocaleController.getString(R.string.Gift2AuctionTableStarted);
        sc[] scVarArr = m0;
        sz0Var.c(string, "", null, scVarArr);
        this.Z = scVarArr[0];
        sz0Var.c(LocaleController.getString(R.string.Gift2AuctionTableEnded), "", null, scVarArr);
        this.f10696a0 = scVarArr[0];
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.setClipChildren(false);
        frameLayout2.setClipToPadding(false);
        frameLayout2.addView(sz0Var, k7.b6.e(-1, -2, 119));
        this.f10700e0 = new a0(this, new ph.f3[1], frameLayout2, 0);
        TableRow c3 = sz0Var.c(LocaleController.getString(R.string.GiftValueAveragePrice), "", null, scVarArr);
        this.f10701f0 = c3;
        c3.setOnClickListener(new View.OnClickListener(this) {
            public final f0 f11077b;

            {
                this.f11077b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        new eg.o1(this.f11077b.getContext(), 40, (f6) null).show();
                        return;
                    default:
                        this.f11077b.T();
                        return;
                }
            }
        });
        this.f10697b0 = scVarArr[0];
        rz0[] rz0VarArr = f10695n0;
        sz0Var.c("", "", rz0VarArr, scVarArr);
        this.f10698c0 = scVarArr[0];
        this.f10699d0 = rz0VarArr[0];
        linearLayout.addView(frameLayout2, k7.b6.k(16.0f, 16.0f, 14.0f, 18.0f, -1, -2));
        f90 f90Var2 = new f90(context, f6Var);
        this.f10704i0 = f90Var2;
        f90Var2.setGravity(17);
        f90Var2.setTextSize(1, 16.0f);
        f90Var2.setTextColor(j6.v0(i13, f6Var));
        f90Var2.setLinkTextColor(j6.v0(i13, f6Var));
        f90Var2.setOnClickListener(new dg.p(this, new boolean[1], f6Var, 5));
        k7.d6.b(f90Var2, 0.02f, 1.5f);
        if (starGift.sticker != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.u5(starGift.sticker, f90Var2.getPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
            this.f10706k0 = spannableStringBuilder;
        } else {
            this.f10706k0 = "";
        }
        ph.d dVar = new ph.d(context, f6Var, true);
        this.f10702g0 = dVar;
        dVar.e();
        dVar.setOnClickListener(new u(this, j10, context, f6Var, runnable, 0));
        FrameLayout.LayoutParams d = k7.b6.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i14 = d.leftMargin;
        int i15 = this.backgroundPaddingLeft;
        d.leftMargin = i14 + i15;
        d.rightMargin += i15;
        this.containerView.addView(dVar, d);
        rl0 rl0Var = this.d;
        int i16 = this.backgroundPaddingLeft;
        rl0Var.setPadding(i16, 0, i16, AndroidUtilities.dp(64.0f));
        this.f10707l0.N(false);
        GiftAuctionController.Auction subscribeToGiftAuction = GiftAuctionController.getInstance(this.currentAccount).subscribeToGiftAuction(j11, this);
        this.f10705j0 = subscribeToGiftAuction;
        if (subscribeToGiftAuction != null && (tL_starGiftAuctionState2 = subscribeToGiftAuction.auctionStateActive) != null) {
            if (tL_starGiftAuctionState2.start_date > ConnectionsManager.getInstance(this.currentAccount).getCurrentTime()) {
                sz0Var.c(LocaleController.getString(R.string.Gift2AuctionTableCurrentRounds), LocaleController.formatNumber(this.f10705j0.auctionStateActive.total_rounds, ','), null, null);
            } else {
                sz0Var.c(LocaleController.getString(R.string.Gift2AuctionTableCurrentRound), LocaleController.formatString(R.string.OfS, LocaleController.formatNumber(this.f10705j0.auctionStateActive.current_round, ','), LocaleController.formatNumber(this.f10705j0.auctionStateActive.total_rounds, ',')), null, null);
            }
        }
        GiftAuctionController.Auction auction = this.f10705j0;
        if (auction != null && (tL_starGiftAuctionState = auction.auctionStateActive) != null && (arrayList = tL_starGiftAuctionState.rounds) != null) {
            int size = arrayList.size();
            for (int i17 = 0; i17 < size; i17++) {
                TL_stars.StarGiftAuctionRound starGiftAuctionRound = this.f10705j0.auctionStateActive.rounds.get(i17);
                if (i17 < size - 1) {
                    i10 = 1;
                    i11 = this.f10705j0.auctionStateActive.rounds.get(i17 + 1).num - 1;
                } else {
                    i10 = 1;
                    i11 = this.f10705j0.auctionStateActive.total_rounds;
                }
                int i18 = starGiftAuctionRound.num;
                if (i18 == i11) {
                    int i19 = R.string.Gift2AuctionTableCurrentRoundsOne;
                    Object[] objArr = new Object[i10];
                    objArr[0] = Integer.valueOf(i18);
                    formatString = LocaleController.formatString(i19, objArr);
                } else {
                    int i20 = R.string.Gift2AuctionTableCurrentRoundsTwo;
                    Integer valueOf = Integer.valueOf(i18);
                    Integer valueOf2 = Integer.valueOf(i11);
                    Object[] objArr2 = new Object[2];
                    objArr2[0] = valueOf;
                    objArr2[i10] = valueOf2;
                    formatString = LocaleController.formatString(i20, objArr2);
                }
                if (starGiftAuctionRound.num == i11) {
                    formatPluralString = LocaleController.formatString(R.string.Gift2AuctionTableCurrentRoundsOneDuration, LocaleController.formatTTLString(starGiftAuctionRound.duration), LocaleController.formatTTLString(starGiftAuctionRound.current_window), Integer.valueOf(starGiftAuctionRound.extend_top));
                } else {
                    formatPluralString = LocaleController.formatPluralString("Gift2AuctionTableCurrentRoundsTwoDuration", starGiftAuctionRound.duration / 60, new Object[0]);
                }
                sz0Var.c(formatString, formatPluralString, null, null);
            }
        }
        GiftAuctionController.Auction auction2 = this.f10705j0;
        if (auction2 != null && auction2.previewAttributes != null) {
            z4 = false;
            d0 d0Var = new d0(this, context, f6Var, new v(this, 0), new dg.m(3), new dg.m(3), new dg.m(3), new dg.m(3), new dg.m(3), new dg.m(3));
            d0Var.d(new c5.d(1, 1));
            d0Var.setPreviewingAttributes(this.f10705j0.previewAttributes);
            d0Var.removeView(d0Var.L);
            this.X.addView(d0Var, 0, k7.b6.e(-1, 288, 48));
            TextView textView2 = new TextView(context);
            this.Y = textView2;
            textView2.setGravity(17);
            textView2.setTypeface(AndroidUtilities.bold());
            textView2.setTextColor(-1);
            textView2.setTextSize(1, 12.0f);
            GiftAuctionController.Auction auction3 = this.f10705j0;
            if (auction3.auctionStateFinished != null) {
                textView2.setText(LocaleController.getString(R.string.Gift2AuctionEndedNoDot));
            } else if (auction3.isUpcoming()) {
                textView2.setText(LocaleController.getString(R.string.Gift2LinkUpcomingAuction));
            } else {
                textView2.setText(LocaleController.getString(R.string.Gift2LinkGiftAuction));
            }
            textView2.setBackground(j6.Z(0, 285212671, 13, 13));
            textView2.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
            TextView h = ai.h(this.X, textView2, k7.b6.d(-2, 26.0f, 81, 16.0f, 0.0f, 16.0f, 77.0f), context);
            h.setTypeface(AndroidUtilities.bold());
            h.setTextSize(1, 21.0f);
            h.setText(str2);
            h.setGravity(17);
            h.setTextColor(-1);
            TextView h9 = ai.h(this.X, h, k7.b6.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 40.0f), context);
            h9.setTextSize(1, 13.0f);
            h9.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.Gift2AuctionLearnMore2), false, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
            h9.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            h9.setGravity(17);
            h9.setTextColor(-1342177281);
            h9.setOnClickListener(new View.OnClickListener(this) {
                public final f0 f11077b;

                {
                    this.f11077b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            new eg.o1(this.f11077b.getContext(), 40, (f6) null).show();
                            return;
                        default:
                            this.f11077b.T();
                            return;
                    }
                }
            });
            k7.d6.b(h9, 0.02f, 1.5f);
            this.X.addView(h9, k7.b6.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 12.0f));
            x1Var.setVisibility(8);
            textView.setVisibility(8);
            this.f10703h0.setVisibility(8);
            f90 f90Var3 = new f90(context, f6Var);
            f90Var3.setGravity(17);
            f90Var3.setTextSize(1, 16.0f);
            int i21 = j6.J6;
            f90Var3.setTextColor(j6.v0(i21, f6Var));
            f90Var3.setLinkTextColor(j6.v0(i21, f6Var));
            f90Var3.setOnClickListener(new dg.p(this, context, f6Var, 4));
            k7.d6.b(f90Var3, 0.02f, 1.5f);
            this.W.addView(f90Var3, k7.b6.k(16.0f, 0.0f, 14.0f, 18.0f, -1, -2));
            com.google.android.gms.common.api.internal.r rVar = new com.google.android.gms.common.api.internal.r(lf.d.c(this.f10705j0.previewAttributes, TL_stars.starGiftAttributeModel.class));
            long j12 = starGift.upgrade_variants;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            for (int i22 = 0; i22 < 3; i22++) {
                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) rVar.c();
                if (stargiftattributemodel != null) {
                    spannableStringBuilder2.append('*');
                    spannableStringBuilder2.setSpan(new org.telegram.ui.Components.u5(stargiftattributemodel.document, f90Var3.getPaint().getFontMetricsInt()), i22, i22 + 1, 33);
                }
            }
            f90Var3.setText(AndroidUtilities.replaceArrows(LocaleController.formatSpannable(R.string.Gift2AuctionVariants, spannableStringBuilder2, LocaleController.formatNumber(j12, ',')), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
        } else {
            z4 = false;
        }
        this.W.addView(this.f10704i0, k7.b6.k(16.0f, 0.0f, 14.0f, 18.0f, -1, -2));
        V(z4);
    }

    public static void P(f0 f0Var, boolean[] zArr, f6 f6Var) {
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        GiftAuctionController.getInstance(f0Var.currentAccount).getOrRequestAcquiredGifts(f0Var.V, new h(f0Var, zArr, f6Var, 1));
    }

    public static void Q(f0 f0Var, long j10, Context context, f6 f6Var, Runnable runnable) {
        GiftAuctionController.Auction auction;
        ArrayList<TL_stars.StarGiftAttribute> arrayList;
        GiftAuctionController.Auction auction2 = f0Var.f10705j0;
        if (auction2 != null && !auction2.isFinished()) {
            if ((j10 == 0 || j10 == UserConfig.getInstance(f0Var.currentAccount).getClientUserId()) && (arrayList = (auction = f0Var.f10705j0).previewAttributes) != null) {
                new m0(context, f6Var, j10, auction.gift, arrayList, runnable, false).show();
            } else {
                new d6(context, f0Var.currentAccount, f0Var.f10705j0.gift, null, j10, runnable, false, false).show();
            }
        }
        f0Var.dismiss();
    }

    public static void R(f0 f0Var, Context context, f6 f6Var) {
        int i10 = f0Var.currentAccount;
        GiftAuctionController.Auction auction = f0Var.f10705j0;
        new lh.j1(context, f6Var, i10, auction.gift.title, auction.previewAttributes, false).show();
        f0Var.dismiss();
    }

    public static void S(org.telegram.ui.ActionBar.k kVar, Context context, f6 f6Var, TL_stars.StarGift starGift) {
        kVar.setActionBarMenuOnItemClick(new e0(context, starGift, f6Var));
        org.telegram.ui.ActionBar.w0 a2 = kVar.n().a(0, R.drawable.ic_ab_other);
        a2.setContentDescription(LocaleController.getString("AccDescrMoreOptions", R.string.AccDescrMoreOptions));
        a2.e(4, R.drawable.msg_info, LocaleController.getString(R.string.MoreInfo));
        a2.e(3, R.drawable.menu_feature_links, LocaleController.getString(R.string.CopyLink));
        a2.e(2, R.drawable.msg_share, LocaleController.getString(R.string.ShareLink));
    }

    public static void U(Context context, TL_stars.StarGift starGift, f6 f6Var) {
        Runnable runnable;
        if (context != null && starGift != null) {
            org.telegram.ui.ActionBar.g3 o10 = org.telegram.messenger.y3.o(context, null, false, false);
            runnable = o10.dismissRunnable;
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.setClipChildren(false);
            linearLayout.setClipToPadding(false);
            ImageView imageView = new ImageView(context);
            imageView.setPadding(AndroidUtilities.dp(17.0f), AndroidUtilities.dp(17.0f), AndroidUtilities.dp(17.0f), AndroidUtilities.dp(17.0f));
            imageView.setImageResource(R.drawable.filled_gift_sell_24);
            ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
            shapeDrawable.getPaint().setColor(j6.v0(j6.Oh, f6Var));
            imageView.setBackground(shapeDrawable);
            linearLayout.addView(imageView, k7.b6.t(80, 80, 17, 0, 21, 0, 16));
            TextView textView = new TextView(context);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setGravity(17);
            textView.setText(LocaleController.getString(R.string.GiftAuctionInfoHeader));
            textView.setTextSize(1, 20.0f);
            int i10 = j6.G6;
            textView.setTextColor(j6.v0(i10, f6Var));
            linearLayout.addView(textView, k7.b6.t(-1, -2, 17, 20, 0, 20, 6));
            TextView textView2 = new TextView(context);
            textView2.setGravity(17);
            textView2.setText(LocaleController.getString(R.string.GiftAuctionInfoText));
            textView2.setTextSize(1, 14.0f);
            textView2.setTextColor(j6.v0(i10, f6Var));
            linearLayout.addView(textView2, k7.b6.t(-1, -2, 17, 20, 0, 20, 16));
            gw0 gw0Var = new gw0(context, f6Var);
            int i11 = starGift.gifts_per_round;
            gw0Var.f34520a.l(LocaleController.formatPluralString("GiftAuctionInfo1Header", i11, Integer.valueOf(i11)), false);
            int i12 = starGift.gifts_per_round;
            gw0Var.f34521b.setText(LocaleController.formatPluralString("GiftAuctionInfo1Text", i12, Integer.valueOf(i12)));
            gw0Var.d.setVisibility(8);
            int i13 = R.drawable.menu_top_bidders_24;
            ImageView imageView2 = gw0Var.f34522c;
            imageView2.setImageResource(i13);
            imageView2.setColorFilter(j6.v0(i10, f6Var));
            linearLayout.addView(gw0Var, k7.b6.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
            gw0 gw0Var2 = new gw0(context, f6Var);
            gw0Var2.f34520a.l(LocaleController.getString(R.string.GiftAuctionInfo2Header), false);
            gw0Var2.f34521b.setText(LocaleController.formatPluralString("GiftAuctionInfo2Text", starGift.gifts_per_round, new Object[0]));
            gw0Var2.d.setVisibility(8);
            int i14 = R.drawable.menu_carryover_24;
            ImageView imageView3 = gw0Var2.f34522c;
            imageView3.setImageResource(i14);
            imageView3.setColorFilter(j6.v0(i10, f6Var));
            linearLayout.addView(gw0Var2, k7.b6.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
            gw0 gw0Var3 = new gw0(context, f6Var);
            gw0Var3.f34520a.l(LocaleController.getString(R.string.GiftAuctionInfo3Header), false);
            gw0Var3.f34521b.setText(LocaleController.getString(R.string.GiftAuctionInfo3Text));
            gw0Var3.d.setVisibility(8);
            int i15 = R.drawable.menu_bid_refund_24;
            ImageView imageView4 = gw0Var3.f34522c;
            imageView4.setImageResource(i15);
            imageView4.setColorFilter(j6.v0(i10, f6Var));
            linearLayout.addView(gw0Var3, k7.b6.k(6.0f, 0.0f, 6.0f, 8.0f, -1, -2));
            ph.d dVar = new ph.d(context, f6Var, true);
            dVar.setOnClickListener(new ig.u(1, runnable));
            dVar.g(lh.g5.g2(LocaleController.getString(R.string.Understood)), false, true);
            linearLayout.addView(dVar, k7.b6.k(16.0f, 10.0f, 16.0f, 8.0f, -1, 48));
            o10.customView = linearLayout;
            o10.show();
        }
    }

    public final void T() {
        TL_stars.TL_starGiftAuctionStateFinished tL_starGiftAuctionStateFinished;
        GiftAuctionController.Auction auction = this.f10705j0;
        if (auction != null && (tL_starGiftAuctionStateFinished = auction.auctionStateFinished) != null && auction.gift.title != null) {
            this.f10700e0.run(this.f10697b0, LocaleController.formatString(R.string.Gift2AveragePriceHint, Long.valueOf(tL_starGiftAuctionStateFinished.average_price), this.f10705j0.gift.title));
        }
    }

    public final void V(boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: kh.f0.V(boolean):void");
    }

    @Override
    public final void dismiss() {
        GiftAuctionController.getInstance(this.currentAccount).unsubscribeFromGiftAuction(this.V, this);
        super.dismiss();
    }

    @Override
    public final void onUpdate(GiftAuctionController.Auction auction) {
        this.f10705j0 = auction;
        V(true);
    }

    @Override
    public final ql0 v(rl0 rl0Var) {
        w51 w51Var = new w51(this.d, getContext(), this.currentAccount, 0, true, new dg.r1(this, 7), this.resourcesProvider);
        this.f10707l0 = w51Var;
        w51Var.f30148r = false;
        return w51Var;
    }

    @Override
    public final CharSequence y() {
        return "";
    }
}
