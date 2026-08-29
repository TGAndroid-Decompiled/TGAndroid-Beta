package ih;

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
import i7.h6;
import java.util.ArrayList;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.gz0;
import org.telegram.ui.Components.hz0;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.vc;
import org.telegram.ui.Components.xa;
import org.telegram.ui.Components.y80;
import org.telegram.ui.qv0;
import org.telegram.ui.th;
public final class g0 extends xa implements GiftAuctionController.OnAuctionUpdateListener {
    public static final vc[] f9164l0 = new vc[1];
    public static final gz0[] m0 = new gz0[1];
    public final TL_stars.StarGift T;
    public final long U;
    public final LinearLayout V;
    public final FrameLayout W;
    public final TextView X;
    public final vc Y;
    public final vc Z;
    public final vc f9165a0;
    public final vc f9166b0;
    public final gz0 f9167c0;
    public final b0 f9168d0;
    public final TableRow f9169e0;
    public final nh.d f9170f0;
    public final y80 f9171g0;
    public final y80 f9172h0;
    public GiftAuctionController.Auction f9173i0;
    public final CharSequence f9174j0;
    public k51 f9175k0;

    public g0(Context context, org.telegram.ui.ActionBar.c6 c6Var, long j10, TL_stars.StarGift starGift, Runnable runnable) {
        super(context, null, false, false, false, false, false, 1, c6Var);
        boolean z10;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState;
        ArrayList<TL_stars.StarGiftAuctionRound> arrayList;
        int i10;
        int i11;
        String formatString;
        String formatPluralString;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState2;
        this.T = starGift;
        long j11 = starGift.f22619id;
        this.U = j11;
        this.G = AndroidUtilities.dp(6.0f);
        this.v = 0.2f;
        fixNavigationBar();
        String str = starGift.title;
        String str2 = str == null ? "Gift" : str;
        LinearLayout linearLayout = new LinearLayout(context);
        this.V = linearLayout;
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setClickable(true);
        org.telegram.ui.ActionBar.l lVar = new org.telegram.ui.ActionBar.l(context, c6Var);
        lVar.C(-1, false);
        lVar.setOccupyStatusBar(false);
        S(lVar, context, c6Var, starGift);
        FrameLayout frameLayout = new FrameLayout(context);
        this.W = frameLayout;
        frameLayout.addView(lVar, i7.f6.n(-1, -2));
        linearLayout.addView(frameLayout);
        y1 y1Var = new y1(context, this.currentAccount, c6Var);
        y1Var.T = true;
        y1Var.g(starGift, false, false, false, false, false);
        y1Var.setImageSize(AndroidUtilities.dp(100.0f));
        y1Var.setImageLayer(7);
        y1Var.F.setVisibility(8);
        frameLayout.addView(y1Var, i7.f6.d(130, 130.0f, 17, 0.0f, 18.0f, 0.0f, 14.0f));
        TextView textView = new TextView(context);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setGravity(17);
        textView.setText(str2);
        textView.setTextSize(1, 20.0f);
        int i12 = g6.G6;
        textView.setTextColor(g6.v0(i12, c6Var));
        linearLayout.addView(textView, i7.f6.t(-1, -2, 17, 20, 0, 20, 6));
        y80 y80Var = new y80(context, null);
        this.f9171g0 = y80Var;
        y80Var.setGravity(17);
        y80Var.setText(TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.formatPluralString("Gift2AuctionInfo2", starGift.gifts_per_round, str2)), " ", AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2AuctionInfoLearnMore), new z(context, c6Var, starGift, 0)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f))));
        y80Var.setTextSize(1, 14.0f);
        y80Var.setTextColor(g6.v0(i12, c6Var));
        int i13 = g6.J6;
        y80Var.setLinkTextColor(g6.v0(i13, c6Var));
        linearLayout.addView(y80Var, i7.f6.t(-1, -2, 17, 20, 0, 20, 4));
        hz0 hz0Var = new hz0(context, c6Var);
        String string = LocaleController.getString(R.string.Gift2AuctionTableStarted);
        vc[] vcVarArr = f9164l0;
        hz0Var.c(string, "", null, vcVarArr);
        this.Y = vcVarArr[0];
        hz0Var.c(LocaleController.getString(R.string.Gift2AuctionTableEnded), "", null, vcVarArr);
        this.Z = vcVarArr[0];
        FrameLayout frameLayout2 = new FrameLayout(getContext());
        frameLayout2.setClipChildren(false);
        frameLayout2.setClipToPadding(false);
        frameLayout2.addView(hz0Var, i7.f6.e(-1, -2, 119));
        this.f9168d0 = new b0(this, new nh.t3[1], frameLayout2, 0);
        TableRow c3 = hz0Var.c(LocaleController.getString(R.string.GiftValueAveragePrice), "", null, vcVarArr);
        this.f9169e0 = c3;
        c3.setOnClickListener(new View.OnClickListener(this) {
            public final g0 f9014b;

            {
                this.f9014b = this;
            }

            @Override
            public final void onClick(View view) {
                switch (r2) {
                    case 0:
                        new cg.p1(this.f9014b.getContext(), 40, (org.telegram.ui.ActionBar.c6) null).show();
                        return;
                    default:
                        this.f9014b.T();
                        return;
                }
            }
        });
        this.f9165a0 = vcVarArr[0];
        gz0[] gz0VarArr = m0;
        hz0Var.c("", "", gz0VarArr, vcVarArr);
        this.f9166b0 = vcVarArr[0];
        this.f9167c0 = gz0VarArr[0];
        linearLayout.addView(frameLayout2, i7.f6.k(16.0f, 16.0f, 14.0f, 18.0f, -1, -2));
        y80 y80Var2 = new y80(context, c6Var);
        this.f9172h0 = y80Var2;
        y80Var2.setGravity(17);
        y80Var2.setTextSize(1, 16.0f);
        y80Var2.setTextColor(g6.v0(i13, c6Var));
        y80Var2.setLinkTextColor(g6.v0(i13, c6Var));
        y80Var2.setOnClickListener(new bg.q(this, new boolean[1], c6Var, 5));
        h6.b(y80Var2, 0.02f, 1.5f);
        if (starGift.sticker != null) {
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.y5(starGift.sticker, y80Var2.getPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
            this.f9174j0 = spannableStringBuilder;
        } else {
            this.f9174j0 = "";
        }
        nh.d dVar = new nh.d(context, c6Var, true);
        this.f9170f0 = dVar;
        dVar.e();
        dVar.setOnClickListener(new v(this, j10, context, c6Var, runnable, 0));
        FrameLayout.LayoutParams d = i7.f6.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i14 = d.leftMargin;
        int i15 = this.backgroundPaddingLeft;
        d.leftMargin = i14 + i15;
        d.rightMargin += i15;
        this.containerView.addView(dVar, d);
        jl0 jl0Var = this.d;
        int i16 = this.backgroundPaddingLeft;
        jl0Var.setPadding(i16, 0, i16, AndroidUtilities.dp(64.0f));
        this.f9175k0.N(false);
        GiftAuctionController.Auction subscribeToGiftAuction = GiftAuctionController.getInstance(this.currentAccount).subscribeToGiftAuction(j11, this);
        this.f9173i0 = subscribeToGiftAuction;
        if (subscribeToGiftAuction != null && (tL_starGiftAuctionState2 = subscribeToGiftAuction.auctionStateActive) != null) {
            if (tL_starGiftAuctionState2.start_date > ConnectionsManager.getInstance(this.currentAccount).getCurrentTime()) {
                hz0Var.c(LocaleController.getString(R.string.Gift2AuctionTableCurrentRounds), LocaleController.formatNumber(this.f9173i0.auctionStateActive.total_rounds, ','), null, null);
            } else {
                hz0Var.c(LocaleController.getString(R.string.Gift2AuctionTableCurrentRound), LocaleController.formatString(R.string.OfS, LocaleController.formatNumber(this.f9173i0.auctionStateActive.current_round, ','), LocaleController.formatNumber(this.f9173i0.auctionStateActive.total_rounds, ',')), null, null);
            }
        }
        GiftAuctionController.Auction auction = this.f9173i0;
        if (auction != null && (tL_starGiftAuctionState = auction.auctionStateActive) != null && (arrayList = tL_starGiftAuctionState.rounds) != null) {
            int size = arrayList.size();
            for (int i17 = 0; i17 < size; i17++) {
                TL_stars.StarGiftAuctionRound starGiftAuctionRound = this.f9173i0.auctionStateActive.rounds.get(i17);
                if (i17 < size - 1) {
                    i10 = 1;
                    i11 = this.f9173i0.auctionStateActive.rounds.get(i17 + 1).num - 1;
                } else {
                    i10 = 1;
                    i11 = this.f9173i0.auctionStateActive.total_rounds;
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
                hz0Var.c(formatString, formatPluralString, null, null);
            }
        }
        GiftAuctionController.Auction auction2 = this.f9173i0;
        if (auction2 != null && auction2.previewAttributes != null) {
            z10 = false;
            e0 e0Var = new e0(this, context, c6Var, new w(this, 0), new bg.n(3), new bg.n(3), new bg.n(3), new bg.n(3), new bg.n(3), new bg.n(3));
            e0Var.d(new a5.d(1, 1));
            e0Var.setPreviewingAttributes(this.f9173i0.previewAttributes);
            e0Var.removeView(e0Var.K);
            this.W.addView(e0Var, 0, i7.f6.e(-1, 288, 48));
            TextView textView2 = new TextView(context);
            this.X = textView2;
            textView2.setGravity(17);
            textView2.setTypeface(AndroidUtilities.bold());
            textView2.setTextColor(-1);
            textView2.setTextSize(1, 12.0f);
            GiftAuctionController.Auction auction3 = this.f9173i0;
            if (auction3.auctionStateFinished != null) {
                textView2.setText(LocaleController.getString(R.string.Gift2AuctionEndedNoDot));
            } else if (auction3.isUpcoming()) {
                textView2.setText(LocaleController.getString(R.string.Gift2LinkUpcomingAuction));
            } else {
                textView2.setText(LocaleController.getString(R.string.Gift2LinkGiftAuction));
            }
            textView2.setBackground(g6.Z(0, 285212671, 13, 13));
            textView2.setPadding(AndroidUtilities.dp(12.0f), 0, AndroidUtilities.dp(12.0f), 0);
            TextView h = th.h(this.W, textView2, i7.f6.d(-2, 26.0f, 81, 16.0f, 0.0f, 16.0f, 77.0f), context);
            h.setTypeface(AndroidUtilities.bold());
            h.setTextSize(1, 21.0f);
            h.setText(str2);
            h.setGravity(17);
            h.setTextColor(-1);
            TextView h10 = th.h(this.W, h, i7.f6.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 40.0f), context);
            h10.setTextSize(1, 13.0f);
            h10.setText(AndroidUtilities.replaceArrows(LocaleController.getString(R.string.Gift2AuctionLearnMore2), false, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
            h10.setPadding(AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(8.0f));
            h10.setGravity(17);
            h10.setTextColor(-1342177281);
            h10.setOnClickListener(new View.OnClickListener(this) {
                public final g0 f9014b;

                {
                    this.f9014b = this;
                }

                @Override
                public final void onClick(View view) {
                    switch (r2) {
                        case 0:
                            new cg.p1(this.f9014b.getContext(), 40, (org.telegram.ui.ActionBar.c6) null).show();
                            return;
                        default:
                            this.f9014b.T();
                            return;
                    }
                }
            });
            h6.b(h10, 0.02f, 1.5f);
            this.W.addView(h10, i7.f6.d(-1, -2.0f, 87, 16.0f, 0.0f, 16.0f, 12.0f));
            y1Var.setVisibility(8);
            textView.setVisibility(8);
            this.f9171g0.setVisibility(8);
            y80 y80Var3 = new y80(context, c6Var);
            y80Var3.setGravity(17);
            y80Var3.setTextSize(1, 16.0f);
            int i21 = g6.J6;
            y80Var3.setTextColor(g6.v0(i21, c6Var));
            y80Var3.setLinkTextColor(g6.v0(i21, c6Var));
            y80Var3.setOnClickListener(new bg.q(this, context, c6Var, 4));
            h6.b(y80Var3, 0.02f, 1.5f);
            this.V.addView(y80Var3, i7.f6.k(16.0f, 0.0f, 14.0f, 18.0f, -1, -2));
            com.google.android.gms.common.api.internal.r rVar = new com.google.android.gms.common.api.internal.r(kf.d.c(this.f9173i0.previewAttributes, TL_stars.starGiftAttributeModel.class));
            long j12 = starGift.upgrade_variants;
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            for (int i22 = 0; i22 < 3; i22++) {
                TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) rVar.c();
                if (stargiftattributemodel != null) {
                    spannableStringBuilder2.append('*');
                    spannableStringBuilder2.setSpan(new org.telegram.ui.Components.y5(stargiftattributemodel.document, y80Var3.getPaint().getFontMetricsInt()), i22, i22 + 1, 33);
                }
            }
            y80Var3.setText(AndroidUtilities.replaceArrows(LocaleController.formatSpannable(R.string.Gift2AuctionVariants, spannableStringBuilder2, LocaleController.formatNumber(j12, ',')), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f)));
        } else {
            z10 = false;
        }
        this.V.addView(this.f9172h0, i7.f6.k(16.0f, 0.0f, 14.0f, 18.0f, -1, -2));
        V(z10);
    }

    public static void P(g0 g0Var, boolean[] zArr, org.telegram.ui.ActionBar.c6 c6Var) {
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        GiftAuctionController.getInstance(g0Var.currentAccount).getOrRequestAcquiredGifts(g0Var.U, new i(g0Var, zArr, c6Var, 1));
    }

    public static void Q(g0 g0Var, long j10, Context context, org.telegram.ui.ActionBar.c6 c6Var, Runnable runnable) {
        GiftAuctionController.Auction auction;
        ArrayList<TL_stars.StarGiftAttribute> arrayList;
        GiftAuctionController.Auction auction2 = g0Var.f9173i0;
        if (auction2 != null && !auction2.isFinished()) {
            if ((j10 == 0 || j10 == UserConfig.getInstance(g0Var.currentAccount).getClientUserId()) && (arrayList = (auction = g0Var.f9173i0).previewAttributes) != null) {
                new n0(context, c6Var, j10, auction.gift, arrayList, runnable, false).show();
            } else {
                new e6(context, g0Var.currentAccount, g0Var.f9173i0.gift, null, j10, runnable, false, false).show();
            }
        }
        g0Var.dismiss();
    }

    public static void R(g0 g0Var, Context context, org.telegram.ui.ActionBar.c6 c6Var) {
        int i10 = g0Var.currentAccount;
        GiftAuctionController.Auction auction = g0Var.f9173i0;
        new jh.j1(context, c6Var, i10, auction.gift.title, auction.previewAttributes, false).show();
        g0Var.dismiss();
    }

    public static void S(org.telegram.ui.ActionBar.l lVar, Context context, org.telegram.ui.ActionBar.c6 c6Var, TL_stars.StarGift starGift) {
        lVar.setActionBarMenuOnItemClick(new f0(context, starGift, c6Var));
        org.telegram.ui.ActionBar.w0 a2 = lVar.n().a(0, R.drawable.ic_ab_other);
        a2.setContentDescription(LocaleController.getString("AccDescrMoreOptions", R.string.AccDescrMoreOptions));
        a2.e(4, R.drawable.msg_info, LocaleController.getString(R.string.MoreInfo));
        a2.e(3, R.drawable.menu_feature_links, LocaleController.getString(R.string.CopyLink));
        a2.e(2, R.drawable.msg_share, LocaleController.getString(R.string.ShareLink));
    }

    public static void U(Context context, TL_stars.StarGift starGift, org.telegram.ui.ActionBar.c6 c6Var) {
        Runnable runnable;
        if (context != null && starGift != null) {
            org.telegram.ui.ActionBar.f3 q6 = org.telegram.messenger.x3.q(context, null, false, false);
            runnable = q6.dismissRunnable;
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(1);
            linearLayout.setClipChildren(false);
            linearLayout.setClipToPadding(false);
            ImageView imageView = new ImageView(context);
            imageView.setPadding(AndroidUtilities.dp(17.0f), AndroidUtilities.dp(17.0f), AndroidUtilities.dp(17.0f), AndroidUtilities.dp(17.0f));
            imageView.setImageResource(R.drawable.filled_gift_sell_24);
            ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
            shapeDrawable.getPaint().setColor(g6.v0(g6.Oh, c6Var));
            imageView.setBackground(shapeDrawable);
            linearLayout.addView(imageView, i7.f6.t(80, 80, 17, 0, 21, 0, 16));
            TextView textView = new TextView(context);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setGravity(17);
            textView.setText(LocaleController.getString(R.string.GiftAuctionInfoHeader));
            textView.setTextSize(1, 20.0f);
            int i10 = g6.G6;
            textView.setTextColor(g6.v0(i10, c6Var));
            linearLayout.addView(textView, i7.f6.t(-1, -2, 17, 20, 0, 20, 6));
            TextView textView2 = new TextView(context);
            textView2.setGravity(17);
            textView2.setText(LocaleController.getString(R.string.GiftAuctionInfoText));
            textView2.setTextSize(1, 14.0f);
            textView2.setTextColor(g6.v0(i10, c6Var));
            linearLayout.addView(textView2, i7.f6.t(-1, -2, 17, 20, 0, 20, 16));
            qv0 qv0Var = new qv0(context, c6Var);
            int i11 = starGift.gifts_per_round;
            qv0Var.f41784a.l(LocaleController.formatPluralString("GiftAuctionInfo1Header", i11, Integer.valueOf(i11)), false);
            int i12 = starGift.gifts_per_round;
            qv0Var.f41785b.setText(LocaleController.formatPluralString("GiftAuctionInfo1Text", i12, Integer.valueOf(i12)));
            qv0Var.d.setVisibility(8);
            int i13 = R.drawable.menu_top_bidders_24;
            ImageView imageView2 = qv0Var.f41786c;
            imageView2.setImageResource(i13);
            imageView2.setColorFilter(g6.v0(i10, c6Var));
            linearLayout.addView(qv0Var, i7.f6.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
            qv0 qv0Var2 = new qv0(context, c6Var);
            qv0Var2.f41784a.l(LocaleController.getString(R.string.GiftAuctionInfo2Header), false);
            qv0Var2.f41785b.setText(LocaleController.formatPluralString("GiftAuctionInfo2Text", starGift.gifts_per_round, new Object[0]));
            qv0Var2.d.setVisibility(8);
            int i14 = R.drawable.menu_carryover_24;
            ImageView imageView3 = qv0Var2.f41786c;
            imageView3.setImageResource(i14);
            imageView3.setColorFilter(g6.v0(i10, c6Var));
            linearLayout.addView(qv0Var2, i7.f6.k(6.0f, 0.0f, 6.0f, -2.0f, -1, -2));
            qv0 qv0Var3 = new qv0(context, c6Var);
            qv0Var3.f41784a.l(LocaleController.getString(R.string.GiftAuctionInfo3Header), false);
            qv0Var3.f41785b.setText(LocaleController.getString(R.string.GiftAuctionInfo3Text));
            qv0Var3.d.setVisibility(8);
            int i15 = R.drawable.menu_bid_refund_24;
            ImageView imageView4 = qv0Var3.f41786c;
            imageView4.setImageResource(i15);
            imageView4.setColorFilter(g6.v0(i10, c6Var));
            linearLayout.addView(qv0Var3, i7.f6.k(6.0f, 0.0f, 6.0f, 8.0f, -1, -2));
            nh.d dVar = new nh.d(context, c6Var, true);
            dVar.setOnClickListener(new gg.u(1, runnable));
            dVar.g(jh.h5.g2(LocaleController.getString(R.string.Understood)), false, true);
            linearLayout.addView(dVar, i7.f6.k(16.0f, 10.0f, 16.0f, 8.0f, -1, 48));
            q6.customView = linearLayout;
            q6.show();
        }
    }

    public final void T() {
        TL_stars.TL_starGiftAuctionStateFinished tL_starGiftAuctionStateFinished;
        GiftAuctionController.Auction auction = this.f9173i0;
        if (auction != null && (tL_starGiftAuctionStateFinished = auction.auctionStateFinished) != null && auction.gift.title != null) {
            this.f9168d0.run(this.f9165a0, LocaleController.formatString(R.string.Gift2AveragePriceHint, Long.valueOf(tL_starGiftAuctionStateFinished.average_price), this.f9173i0.gift.title));
        }
    }

    public final void V(boolean r12) {
        throw new UnsupportedOperationException("Method not decompiled: ih.g0.V(boolean):void");
    }

    @Override
    public final void dismiss() {
        GiftAuctionController.getInstance(this.currentAccount).unsubscribeFromGiftAuction(this.U, this);
        super.dismiss();
    }

    @Override
    public final void onUpdate(GiftAuctionController.Auction auction) {
        this.f9173i0 = auction;
        V(true);
    }

    @Override
    public final il0 v(jl0 jl0Var) {
        k51 k51Var = new k51(this.d, getContext(), this.currentAccount, 0, true, new bg.t1(this, 7), this.resourcesProvider);
        this.f9175k0 = k51Var;
        k51Var.f29939r = false;
        return k51Var;
    }

    @Override
    public final CharSequence y() {
        return "";
    }
}
