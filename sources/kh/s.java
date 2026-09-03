package kh;

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
import lh.ja;
import lh.t7;
import lh.z9;
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
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.j6;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.f90;
import org.telegram.ui.Components.i51;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.k6;
import org.telegram.ui.Components.lq;
import org.telegram.ui.Components.mr;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.ql0;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.w51;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.ai;
import org.telegram.ui.zn;
public final class s extends sa implements GiftAuctionController.OnAuctionUpdateListener {
    public static final int f10898x0 = 0;
    public final long U;
    public final i51 V;
    public final lh.c W;
    public final o X;
    public final kf.p Y;
    public final n Z;
    public final ah.e f10899a0;
    public final ah.e f10900b0;
    public final ah.e f10901c0;
    public final org.telegram.ui.Cells.l4 f10902d0;
    public final k6 f10903e0;
    public final q f10904f0;
    public final q[] f10905g0;
    public final FrameLayout f10906h0;
    public GiftAuctionController.Auction f10907i0;
    public final r f10908j0;
    public Runnable f10909k0;
    public long f10910l0;
    public long m0;
    public boolean f10911n0;
    public final lq[] f10912o0;
    public org.telegram.ui.Components.u5 f10913p0;
    public final xd.a f10914q0;
    public final xd.a f10915r0;
    public final lq[] f10916s0;
    public boolean f10917t0;
    public w51 f10918u0;
    public boolean f10919v0;
    public boolean f10920w0;

    public s(Context context, f6 f6Var, r rVar, GiftAuctionController.Auction auction) {
        super(context, null, false, false, false, false, false, 2, f6Var);
        int i10;
        boolean z4;
        this.f10905g0 = new q[3];
        this.f10911n0 = true;
        this.f10912o0 = new lq[1];
        g gVar = new g(this);
        mr mrVar = mr.h;
        this.f10914q0 = new xd.a(0, gVar, mrVar, 380L, false);
        this.f10915r0 = new xd.a(0, new g(this), mrVar, 380L, false);
        this.f10916s0 = new lq[1];
        this.f10907i0 = auction;
        this.f10908j0 = rVar;
        long j10 = auction.giftId;
        this.U = j10;
        this.O = true;
        this.v = 0.2f;
        GiftAuctionController.Auction subscribeToGiftAuction = GiftAuctionController.getInstance(this.currentAccount).subscribeToGiftAuction(j10, this);
        this.Y = new kf.p(new g(this));
        this.I = false;
        this.H = AndroidUtilities.dp(12.0f);
        fixNavigationBar();
        f0.S(this.e, context, f6Var, subscribeToGiftAuction.gift);
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(this.currentAccount).getClientUserId()));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setClickable(true);
        this.V = i51.j(-1, linearLayout);
        n nVar = new n(this, context, f6Var);
        this.Z = nVar;
        nVar.L = true;
        this.f10907i0.getMinimumBid();
        this.f10907i0.getCurrentMyBid();
        long currentTopBid = this.f10907i0.getCurrentTopBid();
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
        nVar2.f12165b0 = iArr2;
        linearLayout.addView(nVar2, k7.b6.t(-1, -2, 0, 0, -40, 0, -48));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        ah.e eVar = new ah.e(context, 3, f6Var);
        this.f10899a0 = eVar;
        int dp = AndroidUtilities.dp(12.0f);
        int i15 = j6.f19827a7;
        int themedColor = getThemedColor(i15);
        int h = i0.a.h(getThemedColor(j6.f19971i6), getThemedColor(i15));
        eVar.setBackground(j6.i0(dp, dp, dp, dp, themedColor, h, h));
        eVar.setOnClickListener(new k(this, 2));
        ((TextView) eVar.f213c).setText(LocaleController.getString(R.string.Gift2AuctionBidInfoMinimumBid));
        ah.e eVar2 = new ah.e(context, 3, f6Var);
        this.f10900b0 = eVar2;
        eVar2.setBackground(j6.b0(AndroidUtilities.dp(12.0f), getThemedColor(i15)));
        ((TextView) eVar2.f213c).setText(LocaleController.getString(R.string.Gift2AuctionBidInfoUntilNextRound));
        ah.e eVar3 = new ah.e(context, 3, f6Var);
        this.f10901c0 = eVar3;
        eVar3.setBackground(j6.b0(AndroidUtilities.dp(12.0f), getThemedColor(i15)));
        ((TextView) eVar3.f213c).setText(LocaleController.getString(R.string.Gift2AuctionBidInfoLeft));
        linearLayout2.addView(eVar, k7.b6.l(1.0f, 0, -1));
        linearLayout2.addView(new View(context), k7.b6.l(0.0f, 10, -1));
        linearLayout2.addView(eVar2, k7.b6.l(1.0f, 0, -1));
        linearLayout2.addView(new View(context), k7.b6.l(0.0f, 10, -1));
        linearLayout2.addView(eVar3, k7.b6.l(1.0f, 0, -1));
        linearLayout.addView(linearLayout2, k7.b6.k(16.0f, 0.0f, 16.0f, 15.0f, -1, 56));
        if (subscribeToGiftAuction.auctionUserState.acquired_count > 0) {
            f90 f90Var = new f90(context, f6Var);
            f90Var.setGravity(17);
            f90Var.setTextSize(1, 16.0f);
            int i16 = j6.J6;
            f90Var.setTextColor(j6.v0(i16, f6Var));
            f90Var.setLinkTextColor(j6.v0(i16, f6Var));
            f90Var.setOnClickListener(new dg.p(this, new boolean[1], f6Var, 3));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.u5(subscribeToGiftAuction.giftDocumentId, f90Var.getPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
            f90Var.setText(TextUtils.concat(AndroidUtilities.replaceArrows(LocaleController.formatPluralSpannable("Gift2AuctionsItemsBought2", subscribeToGiftAuction.auctionUserState.acquired_count, spannableStringBuilder), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f))));
            k7.d6.b(f90Var, 0.02f, 1.5f);
            linearLayout.addView(f90Var, k7.b6.k(16.0f, 4.0f, 16.0f, 4.0f, -1, -2));
        }
        int i17 = j6.L6;
        org.telegram.ui.Cells.l4 l4Var = new org.telegram.ui.Cells.l4(context, i17, 21, 0, 0, false, true, f6Var);
        this.f10902d0 = l4Var;
        linearLayout.addView(l4Var, k7.b6.k(0.0f, 5.0f, 0.0f, 0.0f, -1, -2));
        k6 k6Var = new k6(context, false, false, false);
        this.f10903e0 = k6Var;
        k6Var.setTextSize(AndroidUtilities.dp(12.5f));
        k6Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        k6Var.setSizeableBackground(j6.Z(0, 0, 9, 9));
        k6Var.setHideBackgroundIfEmpty(true);
        l4Var.setOnWidthUpdateListener(new e3.h(this, 24));
        l4Var.addView(k6Var, k7.b6.d(-1, 17.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        q qVar = new q(context, f6Var);
        this.f10904f0 = qVar;
        qVar.f10868b.setTextColor(getThemedColor(i17));
        qVar.c(user);
        linearLayout.addView(qVar, k7.b6.k(0.0f, 0.0f, 0.0f, -7.0f, -1, -2));
        org.telegram.ui.Cells.l4 l4Var2 = new org.telegram.ui.Cells.l4(context, i17, 21, 15, 0, false, false, f6Var);
        l4Var2.setText(LocaleController.getString(R.string.Gift2AuctionTop3Winners));
        linearLayout.addView(l4Var2, k7.b6.n(-1, -2));
        int i18 = 0;
        while (true) {
            q[] qVarArr = this.f10905g0;
            if (i18 >= qVarArr.length) {
                break;
            }
            qVarArr[i18] = new q(context, f6Var);
            int i19 = i18 + 1;
            this.f10905g0[i18].b(i19, true, false);
            this.f10905g0[i18].setBackground(j6.K0(false));
            q qVar2 = this.f10905g0[i18];
            if (i18 < 2) {
                z4 = true;
            } else {
                z4 = false;
            }
            qVar2.f10870f = z4;
            qVar2.setOnClickListener(new dg.m(2));
            linearLayout.addView(this.f10905g0[i18], k7.b6.n(-1, -2));
            i18 = i19;
        }
        ?? dVar = new ph.d(context, f6Var, true);
        this.X = dVar;
        dVar.e();
        FrameLayout.LayoutParams d = k7.b6.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i20 = d.leftMargin;
        int i21 = this.backgroundPaddingLeft;
        d.leftMargin = i20 + i21;
        d.rightMargin += i21;
        this.containerView.addView((View) dVar, d);
        rl0 rl0Var = this.d;
        int i22 = this.backgroundPaddingLeft;
        rl0Var.setPadding(i22, 0, i22, AndroidUtilities.dp(64.0f));
        this.d.setOnItemClickListener(new a(1));
        long j11 = subscribeToGiftAuction.auctionUserState.bid_amount;
        if (j11 > 0) {
            this.Z.setValue((int) j11);
        } else {
            this.Z.setValue((int) subscribeToGiftAuction.getMinimumBid());
        }
        e0(false);
        this.d.setOverScrollMode(2);
        lh.c cVar = new lh.c(context, this.currentAccount, f6Var);
        this.W = cVar;
        cVar.setScaleX(0.6f);
        cVar.setScaleY(0.6f);
        cVar.setAlpha(0.0f);
        cVar.setEnabled(false);
        cVar.setClickable(false);
        this.container.addView(cVar, k7.b6.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
        k7.d6.a(cVar);
        cVar.setOnClickListener(new m(context, 0, f6Var));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f10906h0 = frameLayout;
        this.container.addView(frameLayout, k7.b6.e(-1, 100, 48));
        a0();
        this.f10918u0.N(false);
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
        Runnable runnable = sVar.f10909k0;
        if (runnable != null) {
            runnable.run();
        }
        sVar.dismiss();
    }

    public static void Q(s sVar) {
        int value = sVar.Z.getValue();
        int minimumBid = (int) sVar.f10907i0.getMinimumBid();
        if (value < minimumBid) {
            AndroidUtilities.shakeView(sVar.X);
            new qc(sVar.container, sVar.resourcesProvider).Q(R.raw.info, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("Gift2AuctionMinimumBidIncreased", minimumBid, new Object[0]))).j();
            return;
        }
        sVar.X(value);
    }

    public static void R(s sVar, boolean[] zArr, f6 f6Var) {
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        GiftAuctionController.getInstance(sVar.currentAccount).getOrRequestAcquiredGifts(sVar.U, new h(sVar, zArr, f6Var, 0));
    }

    public static void S(s sVar, long j10, Boolean bool, String str) {
        boolean z4;
        int i10;
        FrameLayout frameLayout = sVar.f10906h0;
        sVar.X.setLoading(false);
        sVar.f10920w0 = false;
        if (bool != null) {
            if (j10 > 0) {
                z4 = true;
            } else {
                z4 = false;
            }
            ec ecVar = new ec(sVar.getContext(), sVar.resourcesProvider);
            ecVar.f24564a.setImageResource(R.drawable.filled_gift_sell_24);
            if (z4) {
                i10 = R.string.Gift2AuctionsBidHasBeenIncreased;
            } else {
                i10 = R.string.Gift2AuctionsBidHasBeenPlaced;
            }
            String string = LocaleController.getString(i10);
            TextView textView = ecVar.f24565b;
            textView.setText(string);
            textView.setSingleLine(true);
            textView.setTextSize(1, 15.0f);
            textView.setMaxLines(1);
            textView.setTypeface(AndroidUtilities.bold());
            String formatString = LocaleController.formatString(R.string.Gift2AuctionPlaceACustomBidHint, Integer.valueOf(sVar.f10907i0.gift.gifts_per_round));
            TextView textView2 = ecVar.f24566c;
            textView2.setText(formatString);
            textView2.setSingleLine(false);
            textView2.setMaxLines(5);
            sVar.Y();
            ic.f(frameLayout, ecVar, 2750).j();
            t7.y(sVar.currentAccount, false).q(false, true, null);
        }
        if (str != null) {
            sVar.Y();
            ai.r(R.string.UnknownErrorCode, new Object[]{str}, new qc(frameLayout, sVar.resourcesProvider), R.raw.error, 36);
        }
    }

    public static void T(s sVar, int i10) {
        sVar.Z.f(nh.t.b(sVar.currentAccount, i10, 3), nh.t.b(sVar.currentAccount, i10, 4), true);
        sVar.c0(sVar.f10917t0);
        sVar.d0(sVar.f10917t0);
        sVar.Z(sVar.f10917t0);
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
        org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f19478a;
        d2Var.O = string;
        d2Var.Q = LocaleController.formatString(R.string.Gift2AuctionPlaceACustomBidHint, Integer.valueOf(sVar.f10907i0.gift.gifts_per_round));
        dh.b bVar = new dh.b(context, sVar.resourcesProvider, context.getResources().getDrawable(R.drawable.star_small_inner).mutate());
        bVar.setTextSize(1, 18.0f);
        bVar.setTextColor(j6.v0(j6.f19987j5, sVar.resourcesProvider));
        bVar.setHintColor(j6.v0(j6.Xh, sVar.resourcesProvider));
        bVar.setHintText(LocaleController.getString(R.string.Gift2AuctionPlaceACustomBidHint2));
        bVar.setFocusable(true);
        bVar.setInputType(2);
        bVar.setFilters(new InputFilter[]{new InputFilter.LengthFilter(9)});
        bVar.setLineColors(j6.v0(j6.f20006k6, sVar.resourcesProvider), j6.v0(j6.f20024l6, sVar.resourcesProvider), j6.v0(j6.f20097p7, sVar.resourcesProvider));
        bVar.setImeOptions(268435462);
        bVar.setBackgroundDrawable(null);
        bVar.hintLayoutOffset = AndroidUtilities.dp(24.0f);
        bVar.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f));
        bVar.addTextChangedListener(new p(sVar, viewArr));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(bVar, k7.b6.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder.c();
        alertDialog$Builder.n(linearLayout);
        d2Var.f19559a = AndroidUtilities.dp(300.0f);
        alertDialog$Builder.k(LocaleController.getString(R.string.Gift2AuctionPlaceABid), new c1.b(22, sVar, bVar));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new k3.e(10));
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
        d2VarArr[0].f19566e0 = false;
        bVar.setSelection(bVar.getText().length());
    }

    public final void V() {
        boolean z4;
        float f10;
        if (this.f10917t0 && !isDismissed()) {
            z4 = true;
        } else {
            z4 = false;
        }
        if (this.f10919v0 != z4) {
            this.f10919v0 = z4;
            lh.c cVar = this.W;
            if (cVar != null) {
                cVar.setEnabled(z4);
                cVar.setClickable(z4);
                ViewPropertyAnimator animate = cVar.animate();
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
        TL_stars.TL_StarGiftAuctionUserState tL_StarGiftAuctionUserState = this.f10907i0.auctionUserState;
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
        if (this.f10920w0) {
            return;
        }
        long j10 = this.f10907i0.auctionUserState.bid_amount;
        long j11 = i10;
        if (j10 > 0) {
            j11 -= j10;
        }
        long j12 = j11;
        if (t7.y(this.currentAccount, false).e && t7.y(this.currentAccount, false).q(false, false, null).amount < j12) {
            new z9(getContext(), this.resourcesProvider, j12, 14, null, null, 0L).show();
            return;
        }
        this.f10920w0 = true;
        this.X.setLoading(true);
        GiftAuctionController.getInstance(this.currentAccount).sendBid(this.U, this.f10908j0, i10, new l(this, j10, 0));
    }

    public final void Y() {
        FrameLayout frameLayout;
        Drawable drawable = this.shadowDrawable;
        if (drawable != null && this.containerView != null && (frameLayout = this.f10906h0) != null) {
            frameLayout.setTranslationY(Math.max(0.0f, ((this.containerView.getY() + drawable.getBounds().top) - frameLayout.getMeasuredHeight()) + AndroidUtilities.dp(10.0f)));
        }
    }

    public final void Z(boolean z4) {
        long value = this.Z.getValue();
        long currentMyBid = this.f10907i0.getCurrentMyBid();
        o oVar = this.X;
        if (value == currentMyBid) {
            oVar.g(LocaleController.getString(R.string.OK), z4, true);
            oVar.setOnClickListener(new k(this, 0));
            return;
        }
        TL_stars.TL_StarGiftAuctionUserState tL_StarGiftAuctionUserState = this.f10907i0.auctionUserState;
        long j10 = tL_StarGiftAuctionUserState.bid_amount;
        lq[] lqVarArr = this.f10916s0;
        if (j10 < value && !tL_StarGiftAuctionUserState.returned) {
            oVar.g(ja.V0(false, LocaleController.formatString(R.string.Gift2AuctionPlaceBidAdd, LocaleController.formatNumber(value - j10, ',')), lqVarArr), z4, true);
        } else {
            oVar.g(ja.V0(false, LocaleController.formatString(R.string.Gift2AuctionPlaceBid, LocaleController.formatNumber(value, ',')), lqVarArr), z4, true);
        }
        oVar.setOnClickListener(new k(this, 1));
    }

    public final void a0() {
        int d = i0.a.d(this.f10914q0.e, i0.a.d(this.f10915r0.e, getThemedColor(j6.L6), getThemedColor(j6.f20116q7)), getThemedColor(j6.uj));
        this.f10902d0.setTextColor(d);
        k6 k6Var = this.f10903e0;
        k6Var.setTextColor(d);
        this.f10904f0.f10868b.setTextColor(d);
        if (j6.B1(k6Var.getSizeableBackground(), j6.l1(0.15f, d), false)) {
            k6Var.invalidate();
        }
    }

    public final void b0(long j10, boolean z4) {
        String formatDurationNoHours;
        k6 k6Var = (k6) this.f10900b0.f212b;
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
        int approximatedMyPlace = this.f10907i0.getApproximatedMyPlace();
        int approximatePlaceFromStars = this.f10907i0.approximatePlaceFromStars(value);
        long max = Math.max(value, this.f10907i0.getCurrentMyBid());
        q qVar = this.f10904f0;
        qVar.a(max, false);
        if (approximatedMyPlace > 0) {
            approximatePlaceFromStars = Math.min(approximatedMyPlace, approximatePlaceFromStars);
        }
        qVar.b(approximatePlaceFromStars, false, z4);
        GiftAuctionController.Auction auction = this.f10907i0;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = auction.auctionStateActive;
        k6 k6Var = this.f10903e0;
        if (tL_starGiftAuctionState != null && approximatePlaceFromStars > 0 && auction.gift.title != null && auction.getBidStatus() == GiftAuctionController.Auction.BidStatus.WINNING && !this.f10907i0.isUpcoming()) {
            GiftAuctionController.Auction auction2 = this.f10907i0;
            if (auction2.auctionStateActive.last_gift_num + approximatePlaceFromStars <= auction2.gift.availability_total) {
                k6Var.setText(this.f10907i0.gift.title + " #" + LocaleController.formatNumber(i10, ','));
                return;
            }
        }
        k6Var.setText(null);
    }

    public final void d0(boolean z4) {
        boolean z10;
        GiftAuctionController.Auction.BidStatus bidStatus = this.f10907i0.getBidStatus();
        long j10 = this.f10907i0.auctionUserState.bid_amount;
        org.telegram.ui.Cells.l4 l4Var = this.f10902d0;
        boolean z11 = false;
        if (this.Z.getValue() > j10) {
            l4Var.c(LocaleController.getString(R.string.Gift2AuctionBidStatusFuture), z4);
        } else {
            z10 = true;
            if (bidStatus == GiftAuctionController.Auction.BidStatus.OUTBID) {
                l4Var.c(LocaleController.getString(R.string.Gift2AuctionBidStatusOutbid), z4);
            } else if (bidStatus == GiftAuctionController.Auction.BidStatus.RETURNED) {
                l4Var.c(LocaleController.getString(R.string.Gift2AuctionBidStatusOutbid), z4);
            } else if (bidStatus == GiftAuctionController.Auction.BidStatus.WINNING) {
                l4Var.c(LocaleController.getString(R.string.Gift2AuctionBidStatusWinning), z4);
                z10 = false;
                z11 = true;
            } else {
                l4Var.c(LocaleController.getString(R.string.Gift2AuctionBidStatusFuture), z4);
            }
            this.f10914q0.a(z11, z4);
            this.f10915r0.a(z10, z4);
        }
        z10 = false;
        this.f10914q0.a(z11, z4);
        this.f10915r0.a(z10, z4);
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
        ((k6) this.f10899a0.f212b).c(ja.X0(false, "⭐️" + LocaleController.formatNumberWithMillion((int) this.f10907i0.getMinimumBid(), ','), 0.78f, this.f10912o0), z4, true);
        if (this.f10907i0.auctionStateActive != null) {
            int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
            boolean isUpcoming = this.f10907i0.isUpcoming(currentTime);
            kf.p pVar = this.Y;
            if (isUpcoming) {
                long max = Math.max(0, this.f10907i0.auctionStateActive.start_date - currentTime);
                pVar.a(max);
                b0(max, z4);
            } else {
                long max2 = Math.max(0, this.f10907i0.auctionStateActive.next_round_at - currentTime);
                pVar.a(max2);
                b0(max2, z4);
            }
            org.telegram.ui.Components.u5 u5Var = this.f10913p0;
            ah.e eVar = this.f10901c0;
            if (u5Var == null && this.f10907i0.gift.sticker != null) {
                this.f10913p0 = new org.telegram.ui.Components.u5(this.f10907i0.gift.sticker.f19165id, ((k6) eVar.f212b).getPaint().getFontMetricsInt());
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (this.f10913p0 != null) {
                spannableStringBuilder.append((CharSequence) "* ");
                spannableStringBuilder.setSpan(this.f10913p0, 0, 1, 33);
            }
            spannableStringBuilder.append((CharSequence) LocaleController.formatNumber(this.f10907i0.auctionStateActive.gifts_left, ','));
            ((k6) eVar.f212b).c(spannableStringBuilder, z4, true);
            TextView textView = (TextView) this.f10900b0.f213c;
            if (this.f10907i0.isUpcoming()) {
                i10 = R.string.Gift2AuctionBidInfoUntilStart;
            } else {
                TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = this.f10907i0.auctionStateActive;
                if (tL_starGiftAuctionState.current_round == tL_starGiftAuctionState.total_rounds) {
                    i10 = R.string.Gift2AuctionBidInfoUntilEndRound;
                } else {
                    i10 = R.string.Gift2AuctionBidInfoUntilNextRound;
                }
            }
            textView.setText(LocaleController.getString(i10));
            q[] qVarArr = this.f10905g0;
            int min = Math.min(qVarArr.length, this.f10907i0.auctionStateActive.top_bidders.size());
            if (min > 0) {
                int i11 = 0;
                while (i11 < min) {
                    int i12 = i11 + 1;
                    Long l10 = this.f10907i0.auctionStateActive.top_bidders.get(i11);
                    long longValue = l10.longValue();
                    TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(l10);
                    if (user != null) {
                        qVarArr[i11].c(user);
                    }
                    qVarArr[i11].a(this.f10907i0.approximateBidAmountFromPlace(i12), z4);
                    qVarArr[i11].setOnClickListener(new dh.s(this, longValue, 1));
                    i11 = i12;
                }
            }
        }
        GiftAuctionController.Auction auction = this.f10907i0;
        n nVar = this.Z;
        nVar.setStarsTop(auction.approximateBidAmountFromPlace(auction.gift.gifts_per_round) + 1);
        nVar.setTopText(LocaleController.formatPluralString("StarsReactionTopX", this.f10907i0.gift.gifts_per_round, new Object[0]));
        c0(z4);
        d0(z4);
        Z(z4);
        W();
        long peerDialogId = DialogObject.getPeerDialogId(this.f10907i0.auctionUserState.peer);
        long j10 = this.f10907i0.auctionUserState.acquired_count;
        if (this.m0 < j10 && !this.f10911n0 && (R = LaunchActivity.R()) != null) {
            long j11 = this.f10910l0;
            if (j11 != 0) {
                zn R9 = zn.R9(j11);
                R9.whenFullyVisible(new ag.c(R9, 1));
                R.presentFragment(R9);
                Runnable runnable = this.f10909k0;
                if (runnable != null) {
                    runnable.run();
                }
                dismiss();
            }
        }
        if (peerDialogId != 0) {
            this.f10910l0 = peerDialogId;
        }
        this.m0 = j10;
        this.f10911n0 = false;
    }

    @Override
    public final void onContainerTranslationYChanged(float f10) {
        super.onContainerTranslationYChanged(f10);
        V();
    }

    @Override
    public final void onDismissAnimationStart() {
        super.onDismissAnimationStart();
        this.f10917t0 = false;
        V();
        ic.h(this.container);
    }

    @Override
    public final void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        this.f10917t0 = true;
        V();
        ic.a(this.container, new gg.w(3));
    }

    @Override
    public final void onUpdate(GiftAuctionController.Auction auction) {
        this.f10907i0 = auction;
        e0(this.f10917t0);
    }

    @Override
    public final ql0 v(rl0 rl0Var) {
        w51 w51Var = new w51(this.d, getContext(), this.currentAccount, 0, true, new dg.r1(this, 6), this.resourcesProvider);
        this.f10918u0 = w51Var;
        w51Var.f30148r = false;
        return w51Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.Gift2AuctionPlaceABidTitle);
    }
}
