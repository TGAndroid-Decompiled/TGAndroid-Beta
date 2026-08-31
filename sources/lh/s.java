package lh;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.text.InputFilter;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import mh.ja;
import mh.t7;
import mh.z9;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.g90;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.j51;
import org.telegram.ui.Components.k6;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.tl0;
import org.telegram.ui.Components.x51;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.xn;
import org.telegram.ui.yh;
public final class s extends sa implements GiftAuctionController.OnAuctionUpdateListener {
    public static final int f12936x0 = 0;
    public final long U;
    public final j51 V;
    public final mh.b W;
    public final o X;
    public final lf.p Y;
    public final n Z;
    public final ag.l f12937a0;
    public final ag.l f12938b0;
    public final ag.l f12939c0;
    public final org.telegram.ui.Cells.m4 f12940d0;
    public final k6 f12941e0;
    public final q f12942f0;
    public final q[] f12943g0;
    public final FrameLayout f12944h0;
    public GiftAuctionController.Auction f12945i0;
    public final r f12946j0;
    public Runnable f12947k0;
    public long f12948l0;
    public long m0;
    public boolean f12949n0;
    public final oq[] f12950o0;
    public org.telegram.ui.Components.u5 f12951p0;
    public final xd.a f12952q0;
    public final xd.a f12953r0;
    public final oq[] f12954s0;
    public boolean f12955t0;
    public x51 f12956u0;
    public boolean f12957v0;
    public boolean f12958w0;

    public s(Context context, g6 g6Var, r rVar, GiftAuctionController.Auction auction) {
        super(context, null, false, false, false, false, false, 2, g6Var);
        int i10;
        boolean z4;
        this.f12943g0 = new q[3];
        this.f12949n0 = true;
        this.f12950o0 = new oq[1];
        g gVar = new g(this);
        pr prVar = pr.h;
        this.f12952q0 = new xd.a(0, gVar, prVar, 380L, false);
        this.f12953r0 = new xd.a(0, new g(this), prVar, 380L, false);
        this.f12954s0 = new oq[1];
        this.f12945i0 = auction;
        this.f12946j0 = rVar;
        long j10 = auction.giftId;
        this.U = j10;
        this.O = true;
        this.v = 0.2f;
        GiftAuctionController.Auction subscribeToGiftAuction = GiftAuctionController.getInstance(this.currentAccount).subscribeToGiftAuction(j10, this);
        this.Y = new lf.p(new g(this));
        this.I = false;
        this.H = AndroidUtilities.dp(12.0f);
        fixNavigationBar();
        f0.S(this.f31015e, context, g6Var, subscribeToGiftAuction.gift);
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(this.currentAccount).getClientUserId()));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setClickable(true);
        this.V = j51.j(-1, linearLayout);
        n nVar = new n(this, context, g6Var);
        this.Z = nVar;
        nVar.L = true;
        this.f12945i0.getMinimumBid();
        this.f12945i0.getCurrentMyBid();
        long currentTopBid = this.f12945i0.getCurrentTopBid();
        if (currentTopBid > 100000) {
            i10 = ((((int) currentTopBid) * 3) / 2000) * 1000;
        } else if (currentTopBid > 30000) {
            i10 = 100000;
        } else {
            i10 = 50000;
        }
        int i11 = 15;
        int[] iArr = {50, 100, 500, 1000, 2000, 5000, 7500, 10000, 25000, 50000, 100000, 500000, 1000000, 5000000, 10000000};
        ArrayList arrayList = new ArrayList();
        int i12 = 0;
        boolean z10 = false;
        while (true) {
            if (i12 >= i11) {
                break;
            }
            int i13 = iArr[i12];
            if (i13 < 50) {
                z10 = true;
            } else {
                z10 = i13 == 50 ? false : z10;
                if (i13 > i10) {
                    arrayList.add(Integer.valueOf(i10));
                    break;
                }
                arrayList.add(Integer.valueOf(i13));
                if (iArr[i12] == i10) {
                    break;
                }
            }
            i12++;
            i11 = 15;
        }
        if (z10) {
            arrayList.add(0, 50);
        }
        if (arrayList.size() < 2) {
            arrayList.clear();
            arrayList.add(1);
            arrayList.add(10000);
        }
        int[] iArr2 = new int[arrayList.size()];
        for (int i14 = 0; i14 < arrayList.size(); i14++) {
            iArr2[i14] = ((Integer) arrayList.get(i14)).intValue();
        }
        n nVar2 = this.Z;
        nVar2.f13768b0 = iArr2;
        linearLayout.addView(nVar2, k7.c6.t(-1, -2, 0, 0, -40, 0, -48));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        ag.l lVar = new ag.l(context, 4, g6Var);
        this.f12937a0 = lVar;
        int dp = AndroidUtilities.dp(12.0f);
        int i15 = org.telegram.ui.ActionBar.k6.f21605a7;
        int themedColor = getThemedColor(i15);
        int h = i0.a.h(getThemedColor(org.telegram.ui.ActionBar.k6.f21750i6), getThemedColor(i15));
        lVar.setBackground(org.telegram.ui.ActionBar.k6.i0(dp, dp, dp, dp, themedColor, h, h));
        lVar.setOnClickListener(new k(this, 2));
        ((TextView) lVar.f213c).setText(LocaleController.getString(R.string.Gift2AuctionBidInfoMinimumBid));
        ag.l lVar2 = new ag.l(context, 4, g6Var);
        this.f12938b0 = lVar2;
        lVar2.setBackground(org.telegram.ui.ActionBar.k6.b0(AndroidUtilities.dp(12.0f), getThemedColor(i15)));
        ((TextView) lVar2.f213c).setText(LocaleController.getString(R.string.Gift2AuctionBidInfoUntilNextRound));
        ag.l lVar3 = new ag.l(context, 4, g6Var);
        this.f12939c0 = lVar3;
        lVar3.setBackground(org.telegram.ui.ActionBar.k6.b0(AndroidUtilities.dp(12.0f), getThemedColor(i15)));
        ((TextView) lVar3.f213c).setText(LocaleController.getString(R.string.Gift2AuctionBidInfoLeft));
        linearLayout2.addView(lVar, k7.c6.l(1.0f, 0, -1));
        linearLayout2.addView(new View(context), k7.c6.l(0.0f, 10, -1));
        linearLayout2.addView(lVar2, k7.c6.l(1.0f, 0, -1));
        linearLayout2.addView(new View(context), k7.c6.l(0.0f, 10, -1));
        linearLayout2.addView(lVar3, k7.c6.l(1.0f, 0, -1));
        linearLayout.addView(linearLayout2, k7.c6.k(16.0f, 0.0f, 16.0f, 15.0f, -1, 56));
        if (subscribeToGiftAuction.auctionUserState.acquired_count > 0) {
            g90 g90Var = new g90(context, g6Var);
            g90Var.setGravity(17);
            g90Var.setTextSize(1, 16.0f);
            int i16 = org.telegram.ui.ActionBar.k6.J6;
            g90Var.setTextColor(org.telegram.ui.ActionBar.k6.v0(i16, g6Var));
            g90Var.setLinkTextColor(org.telegram.ui.ActionBar.k6.v0(i16, g6Var));
            g90Var.setOnClickListener(new eg.o(this, new boolean[1], g6Var, 3));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.u5(subscribeToGiftAuction.giftDocumentId, g90Var.getPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
            g90Var.setText(TextUtils.concat(AndroidUtilities.replaceArrows(LocaleController.formatPluralSpannable("Gift2AuctionsItemsBought2", subscribeToGiftAuction.auctionUserState.acquired_count, spannableStringBuilder), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f))));
            k7.e6.b(g90Var, 0.02f, 1.5f);
            linearLayout.addView(g90Var, k7.c6.k(16.0f, 4.0f, 16.0f, 4.0f, -1, -2));
        }
        int i17 = org.telegram.ui.ActionBar.k6.L6;
        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context, i17, 21, 0, 0, false, true, g6Var);
        this.f12940d0 = m4Var;
        linearLayout.addView(m4Var, k7.c6.k(0.0f, 5.0f, 0.0f, 0.0f, -1, -2));
        k6 k6Var = new k6(context, false, false, false);
        this.f12941e0 = k6Var;
        k6Var.setTextSize(AndroidUtilities.dp(12.5f));
        k6Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        k6Var.setSizeableBackground(org.telegram.ui.ActionBar.k6.Z(0, 0, 9, 9));
        k6Var.setHideBackgroundIfEmpty(true);
        m4Var.setOnWidthUpdateListener(new eh.m(this, 25));
        m4Var.addView(k6Var, k7.c6.d(-1, 17.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        q qVar = new q(context, g6Var);
        this.f12942f0 = qVar;
        qVar.f12899b.setTextColor(getThemedColor(i17));
        qVar.c(user);
        linearLayout.addView(qVar, k7.c6.k(0.0f, 0.0f, 0.0f, -7.0f, -1, -2));
        org.telegram.ui.Cells.m4 m4Var2 = new org.telegram.ui.Cells.m4(context, i17, 21, 15, 0, false, false, g6Var);
        m4Var2.setText(LocaleController.getString(R.string.Gift2AuctionTop3Winners));
        linearLayout.addView(m4Var2, k7.c6.n(-1, -2));
        int i18 = 0;
        while (true) {
            q[] qVarArr = this.f12943g0;
            if (i18 >= qVarArr.length) {
                break;
            }
            qVarArr[i18] = new q(context, g6Var);
            int i19 = i18 + 1;
            this.f12943g0[i18].b(i19, true, false);
            this.f12943g0[i18].setBackground(org.telegram.ui.ActionBar.k6.K0(false));
            q qVar2 = this.f12943g0[i18];
            if (i18 < 2) {
                z4 = true;
            } else {
                z4 = false;
            }
            qVar2.f12902f = z4;
            qVar2.setOnClickListener(new eg.m(2));
            linearLayout.addView(this.f12943g0[i18], k7.c6.n(-1, -2));
            i18 = i19;
        }
        ?? dVar = new qh.d(context, g6Var, true);
        this.X = dVar;
        dVar.e();
        FrameLayout.LayoutParams d = k7.c6.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i20 = d.leftMargin;
        int i21 = this.backgroundPaddingLeft;
        d.leftMargin = i20 + i21;
        d.rightMargin += i21;
        this.containerView.addView((View) dVar, d);
        tl0 tl0Var = this.d;
        int i22 = this.backgroundPaddingLeft;
        tl0Var.setPadding(i22, 0, i22, AndroidUtilities.dp(64.0f));
        this.d.setOnItemClickListener(new a(1));
        long j11 = subscribeToGiftAuction.auctionUserState.bid_amount;
        if (j11 > 0) {
            this.Z.setValue((int) j11);
        } else {
            this.Z.setValue((int) subscribeToGiftAuction.getMinimumBid());
        }
        e0(false);
        this.d.setOverScrollMode(2);
        mh.b bVar = new mh.b(context, this.currentAccount, g6Var);
        this.W = bVar;
        bVar.setScaleX(0.6f);
        bVar.setScaleY(0.6f);
        bVar.setAlpha(0.0f);
        bVar.setEnabled(false);
        bVar.setClickable(false);
        this.container.addView(bVar, k7.c6.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
        k7.e6.a(bVar);
        bVar.setOnClickListener(new m(context, 0, g6Var));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f12944h0 = frameLayout;
        this.container.addView(frameLayout, k7.c6.e(-1, 100, 48));
        a0();
        this.f12956u0.N(false);
    }

    public static void P(s sVar, long j10) {
        org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
        if (U != null) {
            if (UserObject.isService(j10)) {
                return;
            }
            Bundle bundle = new Bundle();
            if (j10 > 0) {
                bundle.putLong("user_id", j10);
                if (j10 == UserConfig.getInstance(sVar.currentAccount).getClientUserId()) {
                    bundle.putBoolean("my_profile", true);
                }
            } else {
                bundle.putLong("chat_id", -j10);
            }
            bundle.putBoolean("open_gifts", true);
            U.presentFragment(new ProfileActivity(bundle, null));
        }
        Runnable runnable = sVar.f12947k0;
        if (runnable != null) {
            runnable.run();
        }
        sVar.dismiss();
    }

    public static void Q(s sVar) {
        int value = sVar.Z.getValue();
        int minimumBid = (int) sVar.f12945i0.getMinimumBid();
        if (value < minimumBid) {
            AndroidUtilities.shakeView(sVar.X);
            new qc(sVar.container, sVar.resourcesProvider).Q(R.raw.info, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("Gift2AuctionMinimumBidIncreased", minimumBid, new Object[0]))).j();
            return;
        }
        sVar.X(value);
    }

    public static void R(s sVar, boolean[] zArr, g6 g6Var) {
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        GiftAuctionController.getInstance(sVar.currentAccount).getOrRequestAcquiredGifts(sVar.U, new h(sVar, zArr, g6Var, 0));
    }

    public static void S(s sVar, long j10, Boolean bool, String str) {
        boolean z4;
        int i10;
        FrameLayout frameLayout = sVar.f12944h0;
        sVar.X.setLoading(false);
        sVar.f12958w0 = false;
        if (bool != null) {
            if (j10 > 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            ec ecVar = new ec(sVar.getContext(), sVar.resourcesProvider);
            ecVar.f26500a.setImageResource(R.drawable.filled_gift_sell_24);
            if (z4) {
                i10 = R.string.Gift2AuctionsBidHasBeenIncreased;
            } else {
                i10 = R.string.Gift2AuctionsBidHasBeenPlaced;
            }
            String string = LocaleController.getString(i10);
            TextView textView = ecVar.f26501b;
            textView.setText(string);
            textView.setSingleLine(true);
            textView.setTextSize(1, 15.0f);
            textView.setMaxLines(1);
            textView.setTypeface(AndroidUtilities.bold());
            String formatString = LocaleController.formatString(R.string.Gift2AuctionPlaceACustomBidHint, Integer.valueOf(sVar.f12945i0.gift.gifts_per_round));
            TextView textView2 = ecVar.f26502c;
            textView2.setText(formatString);
            textView2.setSingleLine(false);
            textView2.setMaxLines(5);
            sVar.Y();
            ic.f(frameLayout, ecVar, 2750).j();
            t7.y(sVar.currentAccount, false).q(false, true, null);
        }
        if (str != null) {
            sVar.Y();
            yh.s(R.string.UnknownErrorCode, new Object[]{str}, new qc(frameLayout, sVar.resourcesProvider), R.raw.error, 36);
        }
    }

    public static void T(s sVar, int i10) {
        sVar.Z.f(oh.s.b(sVar.currentAccount, i10, 3), oh.s.b(sVar.currentAccount, i10, 4), true);
        sVar.c0(sVar.f12955t0);
        sVar.d0(sVar.f12955t0);
        sVar.Z(sVar.f12955t0);
        sVar.W();
    }

    public static void U(s sVar) {
        Context context = sVar.getContext();
        Activity findActivity = AndroidUtilities.findActivity(context);
        org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
        if (findActivity != null) {
            findActivity.getCurrentFocus();
        }
        View[] viewArr = new View[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, sVar.resourcesProvider);
        String string = LocaleController.getString(R.string.Gift2AuctionPlaceACustomBid);
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21166a;
        d2Var.O = string;
        d2Var.Q = LocaleController.formatString(R.string.Gift2AuctionPlaceACustomBidHint, Integer.valueOf(sVar.f12945i0.gift.gifts_per_round));
        eh.b bVar = new eh.b(context, sVar.resourcesProvider, context.getResources().getDrawable(R.drawable.star_small_inner).mutate());
        bVar.setTextSize(1, 18.0f);
        bVar.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21766j5, sVar.resourcesProvider));
        bVar.setHintColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Xh, sVar.resourcesProvider));
        bVar.setHintText(LocaleController.getString(R.string.Gift2AuctionPlaceACustomBidHint2));
        bVar.setFocusable(true);
        bVar.setInputType(2);
        bVar.setFilters(new InputFilter[]{new InputFilter.LengthFilter(9)});
        bVar.setLineColors(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21785k6, sVar.resourcesProvider), org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21803l6, sVar.resourcesProvider), org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21876p7, sVar.resourcesProvider));
        bVar.setImeOptions(268435462);
        bVar.setBackgroundDrawable(null);
        bVar.hintLayoutOffset = AndroidUtilities.dp(24.0f);
        bVar.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f));
        bVar.addTextChangedListener(new p(sVar, viewArr));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(bVar, k7.c6.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder.c();
        alertDialog$Builder.n(linearLayout);
        d2Var.f21235a = AndroidUtilities.dp(300.0f);
        alertDialog$Builder.k(LocaleController.getString(R.string.Gift2AuctionPlaceABid), new c1.b(22, sVar, bVar));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new k3.e(24));
        org.telegram.ui.ActionBar.d2[] d2VarArr = {d2Var};
        if (R != null) {
            AndroidUtilities.requestAdjustNothing(findActivity, R.getClassGuid());
        }
        d2VarArr[0].setOnDismissListener(new i(bVar, R, findActivity, 0));
        d2VarArr[0].setOnShowListener(new j(0, bVar));
        d2VarArr[0].show();
        View d = d2VarArr[0].d(-1);
        viewArr[0] = d;
        d.setAlpha(0.6f);
        d2VarArr[0].f21243e0 = false;
        bVar.setSelection(bVar.getText().length());
    }

    public final void V() {
        boolean z4;
        float f10;
        if (this.f12955t0 && !isDismissed()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (this.f12957v0 != z4) {
            this.f12957v0 = z4;
            mh.b bVar = this.W;
            if (bVar != null) {
                bVar.setEnabled(z4);
                bVar.setClickable(z4);
                ViewPropertyAnimator animate = bVar.animate();
                float f11 = 0.6f;
                float f12 = 1.0f;
                if (z4) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.6f;
                }
                ViewPropertyAnimator scaleX = animate.scaleX(f10);
                if (z4) {
                    f11 = 1.0f;
                }
                ViewPropertyAnimator scaleY = scaleX.scaleY(f11);
                if (!z4) {
                    f12 = 0.0f;
                }
                scaleY.alpha(f12).setDuration(180L).start();
            }
        }
    }

    public final void W() {
        long j10;
        n nVar = this.Z;
        int value = nVar.getValue();
        if (nVar.getProgress() > 0.99f) {
            nVar.g(LocaleController.getString(R.string.Gift2AuctionTapToBidMore));
            return;
        }
        long j11 = value;
        TL_stars.TL_StarGiftAuctionUserState tL_StarGiftAuctionUserState = this.f12945i0.auctionUserState;
        long j12 = tL_StarGiftAuctionUserState.bid_amount;
        if (j11 == j12) {
            nVar.g(LocaleController.getString(R.string.Gift2AuctionYourBid));
        } else if (j12 > 0 && !tL_StarGiftAuctionUserState.returned) {
            if (j11 - j12 > 0) {
                nVar.g("+" + LocaleController.formatNumber(j10, ','));
                return;
            }
            nVar.g(null);
        } else {
            nVar.g(null);
        }
    }

    public final void X(int i10) {
        if (this.f12958w0) {
            return;
        }
        long j10 = this.f12945i0.auctionUserState.bid_amount;
        long j11 = i10;
        if (j10 > 0) {
            j11 -= j10;
        }
        long j12 = j11;
        if (t7.y(this.currentAccount, false).f14831e && t7.y(this.currentAccount, false).q(false, false, null).amount < j12) {
            new z9(getContext(), this.resourcesProvider, j12, 14, null, null, 0L).show();
            return;
        }
        this.f12958w0 = true;
        this.X.setLoading(true);
        GiftAuctionController.getInstance(this.currentAccount).sendBid(this.U, this.f12946j0, i10, new l(this, j10, 0));
    }

    public final void Y() {
        FrameLayout frameLayout;
        Drawable drawable = this.shadowDrawable;
        if (drawable != null && this.containerView != null && (frameLayout = this.f12944h0) != null) {
            frameLayout.setTranslationY(Math.max(0.0f, ((this.containerView.getY() + drawable.getBounds().top) - frameLayout.getMeasuredHeight()) + AndroidUtilities.dp(10.0f)));
        }
    }

    public final void Z(boolean z4) {
        long value = this.Z.getValue();
        long currentMyBid = this.f12945i0.getCurrentMyBid();
        o oVar = this.X;
        if (value == currentMyBid) {
            oVar.g(LocaleController.getString(R.string.OK), z4, true);
            oVar.setOnClickListener(new k(this, 0));
            return;
        }
        TL_stars.TL_StarGiftAuctionUserState tL_StarGiftAuctionUserState = this.f12945i0.auctionUserState;
        long j10 = tL_StarGiftAuctionUserState.bid_amount;
        oq[] oqVarArr = this.f12954s0;
        if (j10 < value && !tL_StarGiftAuctionUserState.returned) {
            oVar.g(ja.V0(false, LocaleController.formatString(R.string.Gift2AuctionPlaceBidAdd, LocaleController.formatNumber(value - j10, ',')), oqVarArr), z4, true);
        } else {
            oVar.g(ja.V0(false, LocaleController.formatString(R.string.Gift2AuctionPlaceBid, LocaleController.formatNumber(value, ',')), oqVarArr), z4, true);
        }
        oVar.setOnClickListener(new k(this, 1));
    }

    public final void a0() {
        int d = i0.a.d(this.f12952q0.f50504e, i0.a.d(this.f12953r0.f50504e, getThemedColor(org.telegram.ui.ActionBar.k6.L6), getThemedColor(org.telegram.ui.ActionBar.k6.f21895q7)), getThemedColor(org.telegram.ui.ActionBar.k6.uj));
        this.f12940d0.setTextColor(d);
        k6 k6Var = this.f12941e0;
        k6Var.setTextColor(d);
        this.f12942f0.f12899b.setTextColor(d);
        if (org.telegram.ui.ActionBar.k6.B1(k6Var.getSizeableBackground(), org.telegram.ui.ActionBar.k6.l1(0.15f, d), false)) {
            k6Var.invalidate();
        }
    }

    public final void b0(long j10, boolean z4) {
        String formatDurationNoHours;
        k6 k6Var = (k6) this.f12938b0.f212b;
        if (j10 >= 3600) {
            formatDurationNoHours = AndroidUtilities.formatFullDuration((int) j10);
        } else {
            formatDurationNoHours = AndroidUtilities.formatDurationNoHours((int) j10, true);
        }
        k6Var.c(formatDurationNoHours, z4, true);
    }

    public final void c0(boolean z4) {
        int i10;
        long value = this.Z.getValue();
        int approximatedMyPlace = this.f12945i0.getApproximatedMyPlace();
        int approximatePlaceFromStars = this.f12945i0.approximatePlaceFromStars(value);
        long max = Math.max(value, this.f12945i0.getCurrentMyBid());
        q qVar = this.f12942f0;
        qVar.a(max, false);
        if (approximatedMyPlace > 0) {
            approximatePlaceFromStars = Math.min(approximatedMyPlace, approximatePlaceFromStars);
        }
        qVar.b(approximatePlaceFromStars, false, z4);
        GiftAuctionController.Auction auction = this.f12945i0;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = auction.auctionStateActive;
        k6 k6Var = this.f12941e0;
        if (tL_starGiftAuctionState != null && approximatePlaceFromStars > 0 && auction.gift.title != null && auction.getBidStatus() == GiftAuctionController.Auction.BidStatus.WINNING && !this.f12945i0.isUpcoming()) {
            GiftAuctionController.Auction auction2 = this.f12945i0;
            if (auction2.auctionStateActive.last_gift_num + approximatePlaceFromStars <= auction2.gift.availability_total) {
                k6Var.setText(this.f12945i0.gift.title + " #" + LocaleController.formatNumber(i10, ','));
                return;
            }
        }
        k6Var.setText(null);
    }

    public final void d0(boolean z4) {
        boolean z10;
        GiftAuctionController.Auction.BidStatus bidStatus = this.f12945i0.getBidStatus();
        long j10 = this.f12945i0.auctionUserState.bid_amount;
        org.telegram.ui.Cells.m4 m4Var = this.f12940d0;
        boolean z11 = false;
        if (this.Z.getValue() > j10) {
            m4Var.c(LocaleController.getString(R.string.Gift2AuctionBidStatusFuture), z4);
        } else {
            z10 = true;
            if (bidStatus == GiftAuctionController.Auction.BidStatus.OUTBID) {
                m4Var.c(LocaleController.getString(R.string.Gift2AuctionBidStatusOutbid), z4);
            } else if (bidStatus == GiftAuctionController.Auction.BidStatus.RETURNED) {
                m4Var.c(LocaleController.getString(R.string.Gift2AuctionBidStatusOutbid), z4);
            } else if (bidStatus == GiftAuctionController.Auction.BidStatus.WINNING) {
                m4Var.c(LocaleController.getString(R.string.Gift2AuctionBidStatusWinning), z4);
                z10 = false;
                z11 = true;
            } else {
                m4Var.c(LocaleController.getString(R.string.Gift2AuctionBidStatusFuture), z4);
            }
            this.f12952q0.a(z11, z4);
            this.f12953r0.a(z10, z4);
        }
        z10 = false;
        this.f12952q0.a(z11, z4);
        this.f12953r0.a(z10, z4);
    }

    @Override
    public final void dismiss() {
        GiftAuctionController.getInstance(this.currentAccount).unsubscribeFromGiftAuction(this.U, this);
        this.Y.b();
        super.dismiss();
    }

    public final void e0(boolean z4) {
        org.telegram.ui.ActionBar.p2 R;
        int i10;
        ((k6) this.f12937a0.f212b).c(ja.X0(false, "⭐️" + LocaleController.formatNumberWithMillion((int) this.f12945i0.getMinimumBid(), ','), 0.78f, this.f12950o0), z4, true);
        if (this.f12945i0.auctionStateActive != null) {
            int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
            boolean isUpcoming = this.f12945i0.isUpcoming(currentTime);
            lf.p pVar = this.Y;
            if (isUpcoming) {
                long max = Math.max(0, this.f12945i0.auctionStateActive.start_date - currentTime);
                pVar.a(max);
                b0(max, z4);
            } else {
                long max2 = Math.max(0, this.f12945i0.auctionStateActive.next_round_at - currentTime);
                pVar.a(max2);
                b0(max2, z4);
            }
            org.telegram.ui.Components.u5 u5Var = this.f12951p0;
            ag.l lVar = this.f12939c0;
            if (u5Var == null && this.f12945i0.gift.sticker != null) {
                this.f12951p0 = new org.telegram.ui.Components.u5(this.f12945i0.gift.sticker.f20849id, ((k6) lVar.f212b).getPaint().getFontMetricsInt());
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (this.f12951p0 != null) {
                spannableStringBuilder.append((CharSequence) "* ");
                spannableStringBuilder.setSpan(this.f12951p0, 0, 1, 33);
            }
            spannableStringBuilder.append((CharSequence) LocaleController.formatNumber(this.f12945i0.auctionStateActive.gifts_left, ','));
            ((k6) lVar.f212b).c(spannableStringBuilder, z4, true);
            TextView textView = (TextView) this.f12938b0.f213c;
            if (this.f12945i0.isUpcoming()) {
                i10 = R.string.Gift2AuctionBidInfoUntilStart;
            } else {
                TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = this.f12945i0.auctionStateActive;
                if (tL_starGiftAuctionState.current_round == tL_starGiftAuctionState.total_rounds) {
                    i10 = R.string.Gift2AuctionBidInfoUntilEndRound;
                } else {
                    i10 = R.string.Gift2AuctionBidInfoUntilNextRound;
                }
            }
            textView.setText(LocaleController.getString(i10));
            q[] qVarArr = this.f12943g0;
            int min = Math.min(qVarArr.length, this.f12945i0.auctionStateActive.top_bidders.size());
            if (min > 0) {
                int i11 = 0;
                while (i11 < min) {
                    int i12 = i11 + 1;
                    Long l10 = this.f12945i0.auctionStateActive.top_bidders.get(i11);
                    long longValue = l10.longValue();
                    TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(l10);
                    if (user != null) {
                        qVarArr[i11].c(user);
                    }
                    qVarArr[i11].a(this.f12945i0.approximateBidAmountFromPlace(i12), z4);
                    qVarArr[i11].setOnClickListener(new eh.t(this, longValue, 1));
                    i11 = i12;
                }
            }
        }
        GiftAuctionController.Auction auction = this.f12945i0;
        n nVar = this.Z;
        nVar.setStarsTop(auction.approximateBidAmountFromPlace(auction.gift.gifts_per_round) + 1);
        nVar.setTopText(LocaleController.formatPluralString("StarsReactionTopX", this.f12945i0.gift.gifts_per_round, new Object[0]));
        c0(z4);
        d0(z4);
        Z(z4);
        W();
        long peerDialogId = DialogObject.getPeerDialogId(this.f12945i0.auctionUserState.peer);
        long j10 = this.f12945i0.auctionUserState.acquired_count;
        if (this.m0 < j10 && !this.f12949n0 && (R = LaunchActivity.R()) != null) {
            long j11 = this.f12948l0;
            if (j11 != 0) {
                xn R9 = xn.R9(j11);
                R9.whenFullyVisible(new bg.c(R9, 1));
                R.presentFragment(R9);
                Runnable runnable = this.f12947k0;
                if (runnable != null) {
                    runnable.run();
                }
                dismiss();
            }
        }
        if (peerDialogId != 0) {
            this.f12948l0 = peerDialogId;
        }
        this.m0 = j10;
        this.f12949n0 = false;
    }

    @Override
    public final void onContainerTranslationYChanged(float f10) {
        super.onContainerTranslationYChanged(f10);
        V();
    }

    @Override
    public final void onDismissAnimationStart() {
        super.onDismissAnimationStart();
        this.f12955t0 = false;
        V();
        ic.h(this.container);
    }

    @Override
    public final void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        this.f12955t0 = true;
        V();
        ic.a(this.container, new hg.w(3));
    }

    @Override
    public final void onUpdate(GiftAuctionController.Auction auction) {
        this.f12945i0 = auction;
        e0(this.f12955t0);
    }

    @Override
    public final sl0 v(tl0 tl0Var) {
        x51 x51Var = new x51(this.d, getContext(), this.currentAccount, 0, true, new eg.p1(this, 6), this.resourcesProvider);
        this.f12956u0 = x51Var;
        x51Var.f32957r = false;
        return x51Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.Gift2AuctionPlaceABidTitle);
    }
}
