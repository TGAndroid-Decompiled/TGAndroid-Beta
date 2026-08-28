package fh;

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
import gh.ea;
import gh.oa;
import gh.v7;
import java.util.ArrayList;
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
import org.telegram.ui.Components.cc;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.l41;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.z41;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.qn;
public final class x extends sa implements GiftAuctionController.OnAuctionUpdateListener {
    public static final int f6839w0 = 0;
    public final long T;
    public final l41 U;
    public final gh.b V;
    public final r W;
    public final ff.q X;
    public final q Y;
    public final v Z;
    public final v f6840a0;
    public final v f6841b0;
    public final org.telegram.ui.Cells.m4 f6842c0;
    public final org.telegram.ui.Components.j6 f6843d0;
    public final u f6844e0;
    public final u[] f6845f0;
    public final FrameLayout f6846g0;
    public GiftAuctionController.Auction f6847h0;
    public final w f6848i0;
    public Runnable f6849j0;
    public long f6850k0;
    public long f6851l0;
    public boolean m0;
    public final eq[] f6852n0;
    public org.telegram.ui.Components.t5 f6853o0;
    public final td.a f6854p0;
    public final td.a f6855q0;
    public final eq[] f6856r0;
    public boolean f6857s0;
    public z41 f6858t0;
    public boolean f6859u0;
    public boolean f6860v0;

    public x(Context context, org.telegram.ui.ActionBar.b6 b6Var, w wVar, GiftAuctionController.Auction auction) {
        super(context, null, false, false, false, false, false, 2, b6Var);
        int i9;
        boolean z10;
        this.f6845f0 = new u[3];
        this.m0 = true;
        this.f6852n0 = new eq[1];
        g gVar = new g(this);
        gr grVar = gr.h;
        this.f6854p0 = new td.a(0, gVar, grVar, 380L, false);
        this.f6855q0 = new td.a(0, new g(this), grVar, 380L, false);
        this.f6856r0 = new eq[1];
        this.f6847h0 = auction;
        this.f6848i0 = wVar;
        long j10 = auction.giftId;
        this.T = j10;
        this.N = true;
        this.v = 0.2f;
        GiftAuctionController.Auction subscribeToGiftAuction = GiftAuctionController.getInstance(this.currentAccount).subscribeToGiftAuction(j10, this);
        this.X = new ff.q(new g(this));
        this.H = false;
        this.G = AndroidUtilities.dp(12.0f);
        fixNavigationBar();
        k0.R(this.f32408e, context, b6Var, subscribeToGiftAuction.gift);
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(this.currentAccount).getClientUserId()));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setClickable(true);
        this.U = l41.j(-1, linearLayout);
        q qVar = new q(this, context, b6Var);
        this.Y = qVar;
        qVar.K = true;
        this.f6847h0.getMinimumBid();
        this.f6847h0.getCurrentMyBid();
        long currentTopBid = this.f6847h0.getCurrentTopBid();
        if (currentTopBid > 100000) {
            i9 = ((((int) currentTopBid) * 3) / 2000) * 1000;
        } else if (currentTopBid > 30000) {
            i9 = 100000;
        } else {
            i9 = 50000;
        }
        int i10 = 15;
        int[] iArr = {50, 100, 500, 1000, 2000, 5000, 7500, 10000, 25000, 50000, 100000, 500000, 1000000, 5000000, 10000000};
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        boolean z11 = false;
        while (true) {
            if (i11 >= i10) {
                break;
            }
            int i12 = iArr[i11];
            if (i12 < 50) {
                z11 = true;
            } else {
                z11 = i12 == 50 ? false : z11;
                if (i12 > i9) {
                    arrayList.add(Integer.valueOf(i9));
                    break;
                }
                arrayList.add(Integer.valueOf(i12));
                if (iArr[i11] == i9) {
                    break;
                }
            }
            i11++;
            i10 = 15;
        }
        if (z11) {
            arrayList.add(0, 50);
        }
        if (arrayList.size() < 2) {
            arrayList.clear();
            arrayList.add(1);
            arrayList.add(10000);
        }
        int[] iArr2 = new int[arrayList.size()];
        for (int i13 = 0; i13 < arrayList.size(); i13++) {
            iArr2[i13] = ((Integer) arrayList.get(i13)).intValue();
        }
        q qVar2 = this.Y;
        qVar2.f8166a0 = iArr2;
        linearLayout.addView(qVar2, g7.e6.t(-1, -2, 0, 0, -40, 0, -48));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        v vVar = new v(context, 0, b6Var);
        this.Z = vVar;
        int dp = AndroidUtilities.dp(12.0f);
        int i14 = org.telegram.ui.ActionBar.f6.f22947a7;
        int themedColor = getThemedColor(i14);
        int h = i0.a.h(getThemedColor(org.telegram.ui.ActionBar.f6.f23092i6), getThemedColor(i14));
        vVar.setBackground(org.telegram.ui.ActionBar.f6.i0(dp, dp, dp, dp, themedColor, h, h));
        vVar.setOnClickListener(new l(this, 2));
        ((TextView) vVar.f6809b).setText(LocaleController.getString(R.string.Gift2AuctionBidInfoMinimumBid));
        v vVar2 = new v(context, 0, b6Var);
        this.f6840a0 = vVar2;
        vVar2.setBackground(org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp(12.0f), getThemedColor(i14)));
        ((TextView) vVar2.f6809b).setText(LocaleController.getString(R.string.Gift2AuctionBidInfoUntilNextRound));
        v vVar3 = new v(context, 0, b6Var);
        this.f6841b0 = vVar3;
        vVar3.setBackground(org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp(12.0f), getThemedColor(i14)));
        ((TextView) vVar3.f6809b).setText(LocaleController.getString(R.string.Gift2AuctionBidInfoLeft));
        linearLayout2.addView(vVar, g7.e6.l(1.0f, 0, -1));
        linearLayout2.addView(new View(context), g7.e6.l(0.0f, 10, -1));
        linearLayout2.addView(vVar2, g7.e6.l(1.0f, 0, -1));
        linearLayout2.addView(new View(context), g7.e6.l(0.0f, 10, -1));
        linearLayout2.addView(vVar3, g7.e6.l(1.0f, 0, -1));
        linearLayout.addView(linearLayout2, g7.e6.k(16.0f, 0.0f, 16.0f, 15.0f, -1, 56));
        if (subscribeToGiftAuction.auctionUserState.acquired_count > 0) {
            l80 l80Var = new l80(context, b6Var);
            l80Var.setGravity(17);
            l80Var.setTextSize(1, 16.0f);
            int i15 = org.telegram.ui.ActionBar.f6.J6;
            l80Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(i15, b6Var));
            l80Var.setLinkTextColor(org.telegram.ui.ActionBar.f6.v0(i15, b6Var));
            l80Var.setOnClickListener(new fg.f(this, new boolean[1], b6Var, 2));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.t5(subscribeToGiftAuction.giftDocumentId, l80Var.getPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
            l80Var.setText(TextUtils.concat(AndroidUtilities.replaceArrows(LocaleController.formatPluralSpannable("Gift2AuctionsItemsBought2", subscribeToGiftAuction.auctionUserState.acquired_count, spannableStringBuilder), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f))));
            g7.g6.b(l80Var, 0.02f, 1.5f);
            linearLayout.addView(l80Var, g7.e6.k(16.0f, 4.0f, 16.0f, 4.0f, -1, -2));
        }
        int i16 = org.telegram.ui.ActionBar.f6.L6;
        org.telegram.ui.Cells.m4 m4Var = new org.telegram.ui.Cells.m4(context, i16, 21, 0, 0, false, true, b6Var);
        this.f6842c0 = m4Var;
        linearLayout.addView(m4Var, g7.e6.k(0.0f, 5.0f, 0.0f, 0.0f, -1, -2));
        org.telegram.ui.Components.j6 j6Var = new org.telegram.ui.Components.j6(context, false, false, false);
        this.f6843d0 = j6Var;
        j6Var.setTextSize(AndroidUtilities.dp(12.5f));
        j6Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        j6Var.setSizeableBackground(org.telegram.ui.ActionBar.f6.Z(0, 0, 9, 9));
        j6Var.setHideBackgroundIfEmpty(true);
        m4Var.setOnWidthUpdateListener(new af.e(this, 28));
        m4Var.addView(j6Var, g7.e6.d(-1, 17.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        u uVar = new u(context, b6Var);
        this.f6844e0 = uVar;
        uVar.f6772b.setTextColor(getThemedColor(i16));
        uVar.c(user);
        linearLayout.addView(uVar, g7.e6.k(0.0f, 0.0f, 0.0f, -7.0f, -1, -2));
        org.telegram.ui.Cells.m4 m4Var2 = new org.telegram.ui.Cells.m4(context, i16, 21, 15, 0, false, false, b6Var);
        m4Var2.setText(LocaleController.getString(R.string.Gift2AuctionTop3Winners));
        linearLayout.addView(m4Var2, g7.e6.n(-1, -2));
        int i17 = 0;
        while (true) {
            u[] uVarArr = this.f6845f0;
            if (i17 >= uVarArr.length) {
                break;
            }
            uVarArr[i17] = new u(context, b6Var);
            int i18 = i17 + 1;
            this.f6845f0[i17].b(i18, true, false);
            this.f6845f0[i17].setBackground(org.telegram.ui.ActionBar.f6.K0(false));
            u uVar2 = this.f6845f0[i17];
            if (i17 < 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            uVar2.f6775f = z10;
            uVar2.setOnClickListener(new n(0));
            linearLayout.addView(this.f6845f0[i17], g7.e6.n(-1, -2));
            i17 = i18;
        }
        ?? dVar = new kh.d(context, b6Var, true);
        this.W = dVar;
        dVar.e();
        FrameLayout.LayoutParams d = g7.e6.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i19 = d.leftMargin;
        int i20 = this.backgroundPaddingLeft;
        d.leftMargin = i19 + i20;
        d.rightMargin += i20;
        this.containerView.addView((View) dVar, d);
        wk0 wk0Var = this.d;
        int i21 = this.backgroundPaddingLeft;
        wk0Var.setPadding(i21, 0, i21, AndroidUtilities.dp(64.0f));
        this.d.setOnItemClickListener(new a(1));
        long j11 = subscribeToGiftAuction.auctionUserState.bid_amount;
        if (j11 > 0) {
            this.Y.setValue((int) j11);
        } else {
            this.Y.setValue((int) subscribeToGiftAuction.getMinimumBid());
        }
        d0(false);
        this.d.setOverScrollMode(2);
        gh.b bVar = new gh.b(context, this.currentAccount, b6Var);
        this.V = bVar;
        bVar.setScaleX(0.6f);
        bVar.setScaleY(0.6f);
        bVar.setAlpha(0.0f);
        bVar.setEnabled(false);
        bVar.setClickable(false);
        this.container.addView(bVar, g7.e6.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
        g7.g6.a(bVar);
        bVar.setOnClickListener(new o(context, 0, b6Var));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f6846g0 = frameLayout;
        this.container.addView(frameLayout, g7.e6.e(-1, 100, 48));
        Z();
        this.f6858t0.N(false);
    }

    public static void O(x xVar, long j10) {
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        if (U != null) {
            if (UserObject.isService(j10)) {
                return;
            }
            Bundle bundle = new Bundle();
            if (j10 > 0) {
                bundle.putLong("user_id", j10);
                if (j10 == UserConfig.getInstance(xVar.currentAccount).getClientUserId()) {
                    bundle.putBoolean("my_profile", true);
                }
            } else {
                bundle.putLong("chat_id", -j10);
            }
            bundle.putBoolean("open_gifts", true);
            U.presentFragment(new ProfileActivity(bundle, null));
        }
        Runnable runnable = xVar.f6849j0;
        if (runnable != null) {
            runnable.run();
        }
        xVar.dismiss();
    }

    public static void P(x xVar) {
        int value = xVar.Y.getValue();
        int minimumBid = (int) xVar.f6847h0.getMinimumBid();
        if (value < minimumBid) {
            AndroidUtilities.shakeView(xVar.W);
            new oc(xVar.container, xVar.resourcesProvider).Q(R.raw.info, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("Gift2AuctionMinimumBidIncreased", minimumBid, new Object[0]))).j();
            return;
        }
        xVar.W(value);
    }

    public static void Q(x xVar, boolean[] zArr, org.telegram.ui.ActionBar.b6 b6Var) {
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        GiftAuctionController.getInstance(xVar.currentAccount).getOrRequestAcquiredGifts(xVar.T, new i(xVar, zArr, b6Var, 0));
    }

    public static void R(x xVar, long j10, Boolean bool, String str) {
        boolean z10;
        int i9;
        FrameLayout frameLayout = xVar.f6846g0;
        xVar.W.setLoading(false);
        xVar.f6860v0 = false;
        if (bool != null) {
            if (j10 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            cc ccVar = new cc(xVar.getContext(), xVar.resourcesProvider);
            ccVar.f27465a.setImageResource(R.drawable.filled_gift_sell_24);
            if (z10) {
                i9 = R.string.Gift2AuctionsBidHasBeenIncreased;
            } else {
                i9 = R.string.Gift2AuctionsBidHasBeenPlaced;
            }
            String string = LocaleController.getString(i9);
            TextView textView = ccVar.f27466b;
            textView.setText(string);
            textView.setSingleLine(true);
            textView.setTextSize(1, 15.0f);
            textView.setMaxLines(1);
            textView.setTypeface(AndroidUtilities.bold());
            String formatString = LocaleController.formatString(R.string.Gift2AuctionPlaceACustomBidHint, Integer.valueOf(xVar.f6847h0.gift.gifts_per_round));
            TextView textView2 = ccVar.f27467c;
            textView2.setText(formatString);
            textView2.setSingleLine(false);
            textView2.setMaxLines(5);
            xVar.X();
            gc.f(frameLayout, ccVar, 2750).j();
            v7.y(xVar.currentAccount, false).q(false, true, null);
        }
        if (str != null) {
            xVar.X();
            org.telegram.ui.Cells.j2.q(R.string.UnknownErrorCode, new Object[]{str}, new oc(frameLayout, xVar.resourcesProvider), R.raw.error, 36);
        }
    }

    public static void S(x xVar, int i9) {
        xVar.Y.f(ih.u.b(xVar.currentAccount, i9, 3), ih.u.b(xVar.currentAccount, i9, 4), true);
        xVar.b0(xVar.f6857s0);
        xVar.c0(xVar.f6857s0);
        xVar.Y(xVar.f6857s0);
        xVar.V();
    }

    public static void T(x xVar) {
        Context context = xVar.getContext();
        Activity findActivity = AndroidUtilities.findActivity(context);
        org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
        if (findActivity != null) {
            findActivity.getCurrentFocus();
        }
        View[] viewArr = new View[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, xVar.resourcesProvider);
        String string = LocaleController.getString(R.string.Gift2AuctionPlaceACustomBid);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
        c2Var.N = string;
        c2Var.P = LocaleController.formatString(R.string.Gift2AuctionPlaceACustomBidHint, Integer.valueOf(xVar.f6847h0.gift.gifts_per_round));
        s sVar = new s(context, xVar.resourcesProvider, context.getResources().getDrawable(R.drawable.star_small_inner).mutate());
        sVar.setTextSize(1, 18.0f);
        sVar.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23108j5, xVar.resourcesProvider));
        sVar.setHintColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Xh, xVar.resourcesProvider));
        sVar.setHintText(LocaleController.getString(R.string.Gift2AuctionPlaceACustomBidHint2));
        sVar.setFocusable(true);
        sVar.setInputType(2);
        sVar.setFilters(new InputFilter[]{new InputFilter.LengthFilter(9)});
        sVar.setLineColors(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23127k6, xVar.resourcesProvider), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23144l6, xVar.resourcesProvider), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23212p7, xVar.resourcesProvider));
        sVar.setImeOptions(268435462);
        sVar.setBackgroundDrawable(null);
        sVar.hintLayoutOffset = AndroidUtilities.dp(24.0f);
        sVar.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f));
        sVar.addTextChangedListener(new t(xVar, viewArr));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(sVar, g7.e6.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder.c();
        alertDialog$Builder.n(linearLayout);
        c2Var.f22761a = AndroidUtilities.dp(300.0f);
        alertDialog$Builder.k(LocaleController.getString(R.string.Gift2AuctionPlaceABid), new b5.d(16, xVar, sVar));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new a9.b(28));
        org.telegram.ui.ActionBar.c2[] c2VarArr = {c2Var};
        if (R != null) {
            AndroidUtilities.requestAdjustNothing(findActivity, R.getClassGuid());
        }
        c2VarArr[0].setOnDismissListener(new j(sVar, R, findActivity, 0));
        c2VarArr[0].setOnShowListener(new k(0, sVar));
        c2VarArr[0].show();
        View d = c2VarArr[0].d(-1);
        viewArr[0] = d;
        d.setAlpha(0.6f);
        c2VarArr[0].f22767d0 = false;
        sVar.setSelection(sVar.getText().length());
    }

    public final void U() {
        boolean z10;
        float f10;
        if (this.f6857s0 && !isDismissed()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f6859u0 != z10) {
            this.f6859u0 = z10;
            gh.b bVar = this.V;
            if (bVar != null) {
                bVar.setEnabled(z10);
                bVar.setClickable(z10);
                ViewPropertyAnimator animate = bVar.animate();
                float f11 = 0.6f;
                float f12 = 1.0f;
                if (z10) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.6f;
                }
                ViewPropertyAnimator scaleX = animate.scaleX(f10);
                if (z10) {
                    f11 = 1.0f;
                }
                ViewPropertyAnimator scaleY = scaleX.scaleY(f11);
                if (!z10) {
                    f12 = 0.0f;
                }
                scaleY.alpha(f12).setDuration(180L).start();
            }
        }
    }

    public final void V() {
        long j10;
        q qVar = this.Y;
        int value = qVar.getValue();
        if (qVar.getProgress() > 0.99f) {
            qVar.g(LocaleController.getString(R.string.Gift2AuctionTapToBidMore));
            return;
        }
        long j11 = value;
        TL_stars.TL_StarGiftAuctionUserState tL_StarGiftAuctionUserState = this.f6847h0.auctionUserState;
        long j12 = tL_StarGiftAuctionUserState.bid_amount;
        if (j11 == j12) {
            qVar.g(LocaleController.getString(R.string.Gift2AuctionYourBid));
        } else if (j12 > 0 && !tL_StarGiftAuctionUserState.returned) {
            if (j11 - j12 > 0) {
                qVar.g("+" + LocaleController.formatNumber(j10, ','));
                return;
            }
            qVar.g(null);
        } else {
            qVar.g(null);
        }
    }

    public final void W(int i9) {
        if (this.f6860v0) {
            return;
        }
        long j10 = this.f6847h0.auctionUserState.bid_amount;
        long j11 = i9;
        if (j10 > 0) {
            j11 -= j10;
        }
        long j12 = j11;
        if (v7.y(this.currentAccount, false).f9048e && v7.y(this.currentAccount, false).q(false, false, null).amount < j12) {
            new ea(getContext(), this.resourcesProvider, j12, 14, null, null, 0L).show();
            return;
        }
        this.f6860v0 = true;
        this.W.setLoading(true);
        GiftAuctionController.getInstance(this.currentAccount).sendBid(this.T, this.f6848i0, i9, new m(this, j10, 0));
    }

    public final void X() {
        FrameLayout frameLayout;
        Drawable drawable = this.shadowDrawable;
        if (drawable != null && this.containerView != null && (frameLayout = this.f6846g0) != null) {
            frameLayout.setTranslationY(Math.max(0.0f, ((this.containerView.getY() + drawable.getBounds().top) - frameLayout.getMeasuredHeight()) + AndroidUtilities.dp(10.0f)));
        }
    }

    public final void Y(boolean z10) {
        long value = this.Y.getValue();
        long currentMyBid = this.f6847h0.getCurrentMyBid();
        r rVar = this.W;
        if (value == currentMyBid) {
            rVar.g(LocaleController.getString(R.string.OK), z10, true);
            rVar.setOnClickListener(new l(this, 0));
            return;
        }
        TL_stars.TL_StarGiftAuctionUserState tL_StarGiftAuctionUserState = this.f6847h0.auctionUserState;
        long j10 = tL_StarGiftAuctionUserState.bid_amount;
        eq[] eqVarArr = this.f6856r0;
        if (j10 < value && !tL_StarGiftAuctionUserState.returned) {
            rVar.g(oa.V0(false, LocaleController.formatString(R.string.Gift2AuctionPlaceBidAdd, LocaleController.formatNumber(value - j10, ',')), eqVarArr), z10, true);
        } else {
            rVar.g(oa.V0(false, LocaleController.formatString(R.string.Gift2AuctionPlaceBid, LocaleController.formatNumber(value, ',')), eqVarArr), z10, true);
        }
        rVar.setOnClickListener(new l(this, 1));
    }

    public final void Z() {
        int d = i0.a.d(this.f6854p0.f47775e, i0.a.d(this.f6855q0.f47775e, getThemedColor(org.telegram.ui.ActionBar.f6.L6), getThemedColor(org.telegram.ui.ActionBar.f6.f23230q7)), getThemedColor(org.telegram.ui.ActionBar.f6.uj));
        this.f6842c0.setTextColor(d);
        org.telegram.ui.Components.j6 j6Var = this.f6843d0;
        j6Var.setTextColor(d);
        this.f6844e0.f6772b.setTextColor(d);
        if (org.telegram.ui.ActionBar.f6.B1(j6Var.getSizeableBackground(), org.telegram.ui.ActionBar.f6.l1(0.15f, d), false)) {
            j6Var.invalidate();
        }
    }

    public final void a0(long j10, boolean z10) {
        String formatDurationNoHours;
        org.telegram.ui.Components.j6 j6Var = (org.telegram.ui.Components.j6) this.f6840a0.f6810c;
        if (j10 >= 3600) {
            formatDurationNoHours = AndroidUtilities.formatFullDuration((int) j10);
        } else {
            formatDurationNoHours = AndroidUtilities.formatDurationNoHours((int) j10, true);
        }
        j6Var.c(formatDurationNoHours, z10, true);
    }

    public final void b0(boolean z10) {
        int i9;
        long value = this.Y.getValue();
        int approximatedMyPlace = this.f6847h0.getApproximatedMyPlace();
        int approximatePlaceFromStars = this.f6847h0.approximatePlaceFromStars(value);
        long max = Math.max(value, this.f6847h0.getCurrentMyBid());
        u uVar = this.f6844e0;
        uVar.a(max, false);
        if (approximatedMyPlace > 0) {
            approximatePlaceFromStars = Math.min(approximatedMyPlace, approximatePlaceFromStars);
        }
        uVar.b(approximatePlaceFromStars, false, z10);
        GiftAuctionController.Auction auction = this.f6847h0;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = auction.auctionStateActive;
        org.telegram.ui.Components.j6 j6Var = this.f6843d0;
        if (tL_starGiftAuctionState != null && approximatePlaceFromStars > 0 && auction.gift.title != null && auction.getBidStatus() == GiftAuctionController.Auction.BidStatus.WINNING && !this.f6847h0.isUpcoming()) {
            GiftAuctionController.Auction auction2 = this.f6847h0;
            if (auction2.auctionStateActive.last_gift_num + approximatePlaceFromStars <= auction2.gift.availability_total) {
                j6Var.setText(this.f6847h0.gift.title + " #" + LocaleController.formatNumber(i9, ','));
                return;
            }
        }
        j6Var.setText(null);
    }

    public final void c0(boolean z10) {
        boolean z11;
        GiftAuctionController.Auction.BidStatus bidStatus = this.f6847h0.getBidStatus();
        long j10 = this.f6847h0.auctionUserState.bid_amount;
        org.telegram.ui.Cells.m4 m4Var = this.f6842c0;
        boolean z12 = false;
        if (this.Y.getValue() > j10) {
            m4Var.c(LocaleController.getString(R.string.Gift2AuctionBidStatusFuture), z10);
        } else {
            z11 = true;
            if (bidStatus == GiftAuctionController.Auction.BidStatus.OUTBID) {
                m4Var.c(LocaleController.getString(R.string.Gift2AuctionBidStatusOutbid), z10);
            } else if (bidStatus == GiftAuctionController.Auction.BidStatus.RETURNED) {
                m4Var.c(LocaleController.getString(R.string.Gift2AuctionBidStatusOutbid), z10);
            } else if (bidStatus == GiftAuctionController.Auction.BidStatus.WINNING) {
                m4Var.c(LocaleController.getString(R.string.Gift2AuctionBidStatusWinning), z10);
                z11 = false;
                z12 = true;
            } else {
                m4Var.c(LocaleController.getString(R.string.Gift2AuctionBidStatusFuture), z10);
            }
            this.f6854p0.a(z12, z10);
            this.f6855q0.a(z11, z10);
        }
        z11 = false;
        this.f6854p0.a(z12, z10);
        this.f6855q0.a(z11, z10);
    }

    public final void d0(boolean z10) {
        org.telegram.ui.ActionBar.o2 R;
        int i9;
        ((org.telegram.ui.Components.j6) this.Z.f6810c).c(oa.X0(false, "⭐️" + LocaleController.formatNumberWithMillion((int) this.f6847h0.getMinimumBid(), ','), 0.78f, this.f6852n0), z10, true);
        if (this.f6847h0.auctionStateActive != null) {
            int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
            boolean isUpcoming = this.f6847h0.isUpcoming(currentTime);
            ff.q qVar = this.X;
            if (isUpcoming) {
                long max = Math.max(0, this.f6847h0.auctionStateActive.start_date - currentTime);
                qVar.a(max);
                a0(max, z10);
            } else {
                long max2 = Math.max(0, this.f6847h0.auctionStateActive.next_round_at - currentTime);
                qVar.a(max2);
                a0(max2, z10);
            }
            org.telegram.ui.Components.t5 t5Var = this.f6853o0;
            v vVar = this.f6841b0;
            if (t5Var == null && this.f6847h0.gift.sticker != null) {
                this.f6853o0 = new org.telegram.ui.Components.t5(this.f6847h0.gift.sticker.f22386id, ((org.telegram.ui.Components.j6) vVar.f6810c).getPaint().getFontMetricsInt());
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (this.f6853o0 != null) {
                spannableStringBuilder.append((CharSequence) "* ");
                spannableStringBuilder.setSpan(this.f6853o0, 0, 1, 33);
            }
            spannableStringBuilder.append((CharSequence) LocaleController.formatNumber(this.f6847h0.auctionStateActive.gifts_left, ','));
            ((org.telegram.ui.Components.j6) vVar.f6810c).c(spannableStringBuilder, z10, true);
            TextView textView = (TextView) this.f6840a0.f6809b;
            if (this.f6847h0.isUpcoming()) {
                i9 = R.string.Gift2AuctionBidInfoUntilStart;
            } else {
                TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = this.f6847h0.auctionStateActive;
                if (tL_starGiftAuctionState.current_round == tL_starGiftAuctionState.total_rounds) {
                    i9 = R.string.Gift2AuctionBidInfoUntilEndRound;
                } else {
                    i9 = R.string.Gift2AuctionBidInfoUntilNextRound;
                }
            }
            textView.setText(LocaleController.getString(i9));
            u[] uVarArr = this.f6845f0;
            int min = Math.min(uVarArr.length, this.f6847h0.auctionStateActive.top_bidders.size());
            if (min > 0) {
                int i10 = 0;
                while (i10 < min) {
                    int i11 = i10 + 1;
                    Long l10 = this.f6847h0.auctionStateActive.top_bidders.get(i10);
                    long longValue = l10.longValue();
                    TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(l10);
                    if (user != null) {
                        uVarArr[i10].c(user);
                    }
                    uVarArr[i10].a(this.f6847h0.approximateBidAmountFromPlace(i11), z10);
                    uVarArr[i10].setOnClickListener(new p(this, longValue, 0));
                    i10 = i11;
                }
            }
        }
        GiftAuctionController.Auction auction = this.f6847h0;
        q qVar2 = this.Y;
        qVar2.setStarsTop(auction.approximateBidAmountFromPlace(auction.gift.gifts_per_round) + 1);
        qVar2.setTopText(LocaleController.formatPluralString("StarsReactionTopX", this.f6847h0.gift.gifts_per_round, new Object[0]));
        b0(z10);
        c0(z10);
        Y(z10);
        V();
        long peerDialogId = DialogObject.getPeerDialogId(this.f6847h0.auctionUserState.peer);
        long j10 = this.f6847h0.auctionUserState.acquired_count;
        if (this.f6851l0 < j10 && !this.m0 && (R = LaunchActivity.R()) != null) {
            long j11 = this.f6850k0;
            if (j11 != 0) {
                qn R9 = qn.R9(j11);
                R9.whenFullyVisible(new h(R9, 0));
                R.presentFragment(R9);
                Runnable runnable = this.f6849j0;
                if (runnable != null) {
                    runnable.run();
                }
                dismiss();
            }
        }
        if (peerDialogId != 0) {
            this.f6850k0 = peerDialogId;
        }
        this.f6851l0 = j10;
        this.m0 = false;
    }

    @Override
    public final void dismiss() {
        GiftAuctionController.getInstance(this.currentAccount).unsubscribeFromGiftAuction(this.T, this);
        this.X.b();
        super.dismiss();
    }

    @Override
    public final void onContainerTranslationYChanged(float f10) {
        super.onContainerTranslationYChanged(f10);
        U();
    }

    @Override
    public final void onDismissAnimationStart() {
        super.onDismissAnimationStart();
        this.f6857s0 = false;
        U();
        gc.h(this.container);
    }

    @Override
    public final void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        this.f6857s0 = true;
        U();
        gc.a(this.container, new bg.z(3));
    }

    @Override
    public final void onUpdate(GiftAuctionController.Auction auction) {
        this.f6847h0 = auction;
        d0(this.f6857s0);
    }

    @Override
    public final vk0 v(wk0 wk0Var) {
        z41 z41Var = new z41(this.d, getContext(), this.currentAccount, 0, true, new bh.c(this, 5), this.resourcesProvider);
        this.f6858t0 = z41Var;
        z41Var.f35188r = false;
        return z41Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.Gift2AuctionPlaceABidTitle);
    }
}
