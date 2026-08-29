package ih;

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
import i7.h6;
import java.util.ArrayList;
import jh.ia;
import jh.s7;
import jh.y9;
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
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.iq;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.o6;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.w41;
import org.telegram.ui.Components.xa;
import org.telegram.ui.Components.y80;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.th;
import org.telegram.ui.tn;
public final class t extends xa implements GiftAuctionController.OnAuctionUpdateListener {
    public static final int f9377w0 = 0;
    public final long T;
    public final w41 U;
    public final jh.b V;
    public final p W;
    public final jf.p X;
    public final o Y;
    public final bg.d1 Z;
    public final bg.d1 f9378a0;
    public final bg.d1 f9379b0;
    public final org.telegram.ui.Cells.k4 f9380c0;
    public final o6 f9381d0;
    public final r f9382e0;
    public final r[] f9383f0;
    public final FrameLayout f9384g0;
    public GiftAuctionController.Auction f9385h0;
    public final s f9386i0;
    public Runnable f9387j0;
    public long f9388k0;
    public long f9389l0;
    public boolean m0;
    public final iq[] f9390n0;
    public org.telegram.ui.Components.y5 f9391o0;
    public final vd.a f9392p0;
    public final vd.a f9393q0;
    public final iq[] f9394r0;
    public boolean f9395s0;
    public k51 f9396t0;
    public boolean f9397u0;
    public boolean f9398v0;

    public t(Context context, org.telegram.ui.ActionBar.c6 c6Var, s sVar, GiftAuctionController.Auction auction) {
        super(context, null, false, false, false, false, false, 2, c6Var);
        int i10;
        boolean z10;
        this.f9383f0 = new r[3];
        this.m0 = true;
        this.f9390n0 = new iq[1];
        g gVar = new g(this);
        jr jrVar = jr.h;
        this.f9392p0 = new vd.a(0, gVar, jrVar, 380L, false);
        this.f9393q0 = new vd.a(0, new g(this), jrVar, 380L, false);
        this.f9394r0 = new iq[1];
        this.f9385h0 = auction;
        this.f9386i0 = sVar;
        long j10 = auction.giftId;
        this.T = j10;
        this.N = true;
        this.v = 0.2f;
        GiftAuctionController.Auction subscribeToGiftAuction = GiftAuctionController.getInstance(this.currentAccount).subscribeToGiftAuction(j10, this);
        this.X = new jf.p(new g(this));
        this.H = false;
        this.G = AndroidUtilities.dp(12.0f);
        fixNavigationBar();
        g0.S(this.f34660e, context, c6Var, subscribeToGiftAuction.gift);
        TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(UserConfig.getInstance(this.currentAccount).getClientUserId()));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        linearLayout.setClickable(true);
        this.U = w41.j(-1, linearLayout);
        o oVar = new o(this, context, c6Var);
        this.Y = oVar;
        oVar.K = true;
        this.f9385h0.getMinimumBid();
        this.f9385h0.getCurrentMyBid();
        long currentTopBid = this.f9385h0.getCurrentTopBid();
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
        boolean z11 = false;
        while (true) {
            if (i12 >= i11) {
                break;
            }
            int i13 = iArr[i12];
            if (i13 < 50) {
                z11 = true;
            } else {
                z11 = i13 == 50 ? false : z11;
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
        if (z11) {
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
        o oVar2 = this.Y;
        oVar2.f11749a0 = iArr2;
        linearLayout.addView(oVar2, i7.f6.t(-1, -2, 0, 0, -40, 0, -48));
        LinearLayout linearLayout2 = new LinearLayout(context);
        linearLayout2.setOrientation(0);
        bg.d1 d1Var = new bg.d1(context, 2, c6Var);
        this.Z = d1Var;
        int dp = AndroidUtilities.dp(12.0f);
        int i15 = g6.f23009a7;
        int themedColor = getThemedColor(i15);
        int h = i0.a.h(getThemedColor(g6.f23152i6), getThemedColor(i15));
        d1Var.setBackground(g6.i0(dp, dp, dp, dp, themedColor, h, h));
        d1Var.setOnClickListener(new l(this, 2));
        ((TextView) d1Var.f2147c).setText(LocaleController.getString(R.string.Gift2AuctionBidInfoMinimumBid));
        bg.d1 d1Var2 = new bg.d1(context, 2, c6Var);
        this.f9378a0 = d1Var2;
        d1Var2.setBackground(g6.b0(AndroidUtilities.dp(12.0f), getThemedColor(i15)));
        ((TextView) d1Var2.f2147c).setText(LocaleController.getString(R.string.Gift2AuctionBidInfoUntilNextRound));
        bg.d1 d1Var3 = new bg.d1(context, 2, c6Var);
        this.f9379b0 = d1Var3;
        d1Var3.setBackground(g6.b0(AndroidUtilities.dp(12.0f), getThemedColor(i15)));
        ((TextView) d1Var3.f2147c).setText(LocaleController.getString(R.string.Gift2AuctionBidInfoLeft));
        linearLayout2.addView(d1Var, i7.f6.l(1.0f, 0, -1));
        linearLayout2.addView(new View(context), i7.f6.l(0.0f, 10, -1));
        linearLayout2.addView(d1Var2, i7.f6.l(1.0f, 0, -1));
        linearLayout2.addView(new View(context), i7.f6.l(0.0f, 10, -1));
        linearLayout2.addView(d1Var3, i7.f6.l(1.0f, 0, -1));
        linearLayout.addView(linearLayout2, i7.f6.k(16.0f, 0.0f, 16.0f, 15.0f, -1, 56));
        if (subscribeToGiftAuction.auctionUserState.acquired_count > 0) {
            y80 y80Var = new y80(context, c6Var);
            y80Var.setGravity(17);
            y80Var.setTextSize(1, 16.0f);
            int i16 = g6.J6;
            y80Var.setTextColor(g6.v0(i16, c6Var));
            y80Var.setLinkTextColor(g6.v0(i16, c6Var));
            y80Var.setOnClickListener(new bg.q(this, new boolean[1], c6Var, 3));
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("*");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.y5(subscribeToGiftAuction.giftDocumentId, y80Var.getPaint().getFontMetricsInt()), 0, spannableStringBuilder.length(), 33);
            y80Var.setText(TextUtils.concat(AndroidUtilities.replaceArrows(LocaleController.formatPluralSpannable("Gift2AuctionsItemsBought2", subscribeToGiftAuction.auctionUserState.acquired_count, spannableStringBuilder), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(1.0f))));
            h6.b(y80Var, 0.02f, 1.5f);
            linearLayout.addView(y80Var, i7.f6.k(16.0f, 4.0f, 16.0f, 4.0f, -1, -2));
        }
        int i17 = g6.L6;
        org.telegram.ui.Cells.k4 k4Var = new org.telegram.ui.Cells.k4(context, i17, 21, 0, 0, false, true, c6Var);
        this.f9380c0 = k4Var;
        linearLayout.addView(k4Var, i7.f6.k(0.0f, 5.0f, 0.0f, 0.0f, -1, -2));
        o6 o6Var = new o6(context, false, false, false);
        this.f9381d0 = o6Var;
        o6Var.setTextSize(AndroidUtilities.dp(12.5f));
        o6Var.setPadding(AndroidUtilities.dp(8.0f), 0, AndroidUtilities.dp(8.0f), 0);
        o6Var.setSizeableBackground(g6.Z(0, 0, 9, 9));
        o6Var.setHideBackgroundIfEmpty(true);
        k4Var.setOnWidthUpdateListener(new cg.m2(this, 18));
        k4Var.addView(o6Var, i7.f6.d(-1, 17.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        r rVar = new r(context, c6Var);
        this.f9382e0 = rVar;
        rVar.f9346b.setTextColor(getThemedColor(i17));
        rVar.c(user);
        linearLayout.addView(rVar, i7.f6.k(0.0f, 0.0f, 0.0f, -7.0f, -1, -2));
        org.telegram.ui.Cells.k4 k4Var2 = new org.telegram.ui.Cells.k4(context, i17, 21, 15, 0, false, false, c6Var);
        k4Var2.setText(LocaleController.getString(R.string.Gift2AuctionTop3Winners));
        linearLayout.addView(k4Var2, i7.f6.n(-1, -2));
        int i18 = 0;
        while (true) {
            r[] rVarArr = this.f9383f0;
            if (i18 >= rVarArr.length) {
                break;
            }
            rVarArr[i18] = new r(context, c6Var);
            int i19 = i18 + 1;
            this.f9383f0[i18].b(i19, true, false);
            this.f9383f0[i18].setBackground(g6.K0(false));
            r rVar2 = this.f9383f0[i18];
            if (i18 < 2) {
                z10 = true;
            } else {
                z10 = false;
            }
            rVar2.f9349f = z10;
            rVar2.setOnClickListener(new bg.n(2));
            linearLayout.addView(this.f9383f0[i18], i7.f6.n(-1, -2));
            i18 = i19;
        }
        ?? dVar = new nh.d(context, c6Var, true);
        this.W = dVar;
        dVar.e();
        FrameLayout.LayoutParams d = i7.f6.d(-1, 48.0f, 80, 16.0f, 16.0f, 16.0f, 16.0f);
        int i20 = d.leftMargin;
        int i21 = this.backgroundPaddingLeft;
        d.leftMargin = i20 + i21;
        d.rightMargin += i21;
        this.containerView.addView((View) dVar, d);
        jl0 jl0Var = this.d;
        int i22 = this.backgroundPaddingLeft;
        jl0Var.setPadding(i22, 0, i22, AndroidUtilities.dp(64.0f));
        this.d.setOnItemClickListener(new a(1));
        long j11 = subscribeToGiftAuction.auctionUserState.bid_amount;
        if (j11 > 0) {
            this.Y.setValue((int) j11);
        } else {
            this.Y.setValue((int) subscribeToGiftAuction.getMinimumBid());
        }
        e0(false);
        this.d.setOverScrollMode(2);
        jh.b bVar = new jh.b(context, this.currentAccount, c6Var);
        this.V = bVar;
        bVar.setScaleX(0.6f);
        bVar.setScaleY(0.6f);
        bVar.setAlpha(0.0f);
        bVar.setEnabled(false);
        bVar.setClickable(false);
        this.container.addView(bVar, i7.f6.d(-2, -2.0f, 49, 0.0f, 48.0f, 0.0f, 0.0f));
        h6.a(bVar);
        bVar.setOnClickListener(new n(context, 0, c6Var));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f9384g0 = frameLayout;
        this.container.addView(frameLayout, i7.f6.e(-1, 100, 48));
        a0();
        this.f9396t0.N(false);
    }

    public static void P(t tVar, long j10) {
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        if (U != null) {
            if (UserObject.isService(j10)) {
                return;
            }
            Bundle bundle = new Bundle();
            if (j10 > 0) {
                bundle.putLong("user_id", j10);
                if (j10 == UserConfig.getInstance(tVar.currentAccount).getClientUserId()) {
                    bundle.putBoolean("my_profile", true);
                }
            } else {
                bundle.putLong("chat_id", -j10);
            }
            bundle.putBoolean("open_gifts", true);
            U.presentFragment(new ProfileActivity(bundle, null));
        }
        Runnable runnable = tVar.f9387j0;
        if (runnable != null) {
            runnable.run();
        }
        tVar.dismiss();
    }

    public static void Q(t tVar) {
        int value = tVar.Y.getValue();
        int minimumBid = (int) tVar.f9385h0.getMinimumBid();
        if (value < minimumBid) {
            AndroidUtilities.shakeView(tVar.W);
            new tc(tVar.container, tVar.resourcesProvider).Q(R.raw.info, 36, AndroidUtilities.replaceTags(LocaleController.formatPluralString("Gift2AuctionMinimumBidIncreased", minimumBid, new Object[0]))).j();
            return;
        }
        tVar.X(value);
    }

    public static void R(t tVar, boolean[] zArr, org.telegram.ui.ActionBar.c6 c6Var) {
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        GiftAuctionController.getInstance(tVar.currentAccount).getOrRequestAcquiredGifts(tVar.T, new i(tVar, zArr, c6Var, 0));
    }

    public static void S(t tVar, long j10, Boolean bool, String str) {
        boolean z10;
        int i10;
        FrameLayout frameLayout = tVar.f9384g0;
        tVar.W.setLoading(false);
        tVar.f9398v0 = false;
        if (bool != null) {
            if (j10 > 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            ic icVar = new ic(tVar.getContext(), tVar.resourcesProvider);
            icVar.f29363a.setImageResource(R.drawable.filled_gift_sell_24);
            if (z10) {
                i10 = R.string.Gift2AuctionsBidHasBeenIncreased;
            } else {
                i10 = R.string.Gift2AuctionsBidHasBeenPlaced;
            }
            String string = LocaleController.getString(i10);
            TextView textView = icVar.f29364b;
            textView.setText(string);
            textView.setSingleLine(true);
            textView.setTextSize(1, 15.0f);
            textView.setMaxLines(1);
            textView.setTypeface(AndroidUtilities.bold());
            String formatString = LocaleController.formatString(R.string.Gift2AuctionPlaceACustomBidHint, Integer.valueOf(tVar.f9385h0.gift.gifts_per_round));
            TextView textView2 = icVar.f29365c;
            textView2.setText(formatString);
            textView2.setSingleLine(false);
            textView2.setMaxLines(5);
            tVar.Y();
            mc.f(frameLayout, icVar, 2750).j();
            s7.y(tVar.currentAccount, false).q(false, true, null);
        }
        if (str != null) {
            tVar.Y();
            th.r(R.string.UnknownErrorCode, new Object[]{str}, new tc(frameLayout, tVar.resourcesProvider), R.raw.error, 36);
        }
    }

    public static void T(t tVar, int i10) {
        tVar.Y.f(lh.s.b(tVar.currentAccount, i10, 3), lh.s.b(tVar.currentAccount, i10, 4), true);
        tVar.c0(tVar.f9395s0);
        tVar.d0(tVar.f9395s0);
        tVar.Z(tVar.f9395s0);
        tVar.W();
    }

    public static void U(t tVar) {
        Context context = tVar.getContext();
        Activity findActivity = AndroidUtilities.findActivity(context);
        org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
        if (findActivity != null) {
            findActivity.getCurrentFocus();
        }
        View[] viewArr = new View[1];
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, tVar.resourcesProvider);
        String string = LocaleController.getString(R.string.Gift2AuctionPlaceACustomBid);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
        c2Var.N = string;
        c2Var.P = LocaleController.formatString(R.string.Gift2AuctionPlaceACustomBidHint, Integer.valueOf(tVar.f9385h0.gift.gifts_per_round));
        bh.b bVar = new bh.b(context, tVar.resourcesProvider, context.getResources().getDrawable(R.drawable.star_small_inner).mutate());
        bVar.setTextSize(1, 18.0f);
        bVar.setTextColor(g6.v0(g6.f23169j5, tVar.resourcesProvider));
        bVar.setHintColor(g6.v0(g6.Xh, tVar.resourcesProvider));
        bVar.setHintText(LocaleController.getString(R.string.Gift2AuctionPlaceACustomBidHint2));
        bVar.setFocusable(true);
        bVar.setInputType(2);
        bVar.setFilters(new InputFilter[]{new InputFilter.LengthFilter(9)});
        bVar.setLineColors(g6.v0(g6.f23189k6, tVar.resourcesProvider), g6.v0(g6.f23206l6, tVar.resourcesProvider), g6.v0(g6.f23279p7, tVar.resourcesProvider));
        bVar.setImeOptions(268435462);
        bVar.setBackgroundDrawable(null);
        bVar.hintLayoutOffset = AndroidUtilities.dp(24.0f);
        bVar.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(6.0f), 0, AndroidUtilities.dp(6.0f));
        bVar.addTextChangedListener(new q(tVar, viewArr));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        linearLayout.addView(bVar, i7.f6.k(24.0f, 0.0f, 24.0f, 10.0f, -1, -2));
        alertDialog$Builder.c();
        alertDialog$Builder.n(linearLayout);
        c2Var.f22778a = AndroidUtilities.dp(300.0f);
        alertDialog$Builder.k(LocaleController.getString(R.string.Gift2AuctionPlaceABid), new a9.s(19, tVar, bVar));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new eg.c(22));
        org.telegram.ui.ActionBar.c2[] c2VarArr = {c2Var};
        if (R != null) {
            AndroidUtilities.requestAdjustNothing(findActivity, R.getClassGuid());
        }
        c2VarArr[0].setOnDismissListener(new j(bVar, R, findActivity, 0));
        c2VarArr[0].setOnShowListener(new k(0, bVar));
        c2VarArr[0].show();
        View d = c2VarArr[0].d(-1);
        viewArr[0] = d;
        d.setAlpha(0.6f);
        c2VarArr[0].f22784d0 = false;
        bVar.setSelection(bVar.getText().length());
    }

    public final void V() {
        boolean z10;
        float f9;
        if (this.f9395s0 && !isDismissed()) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (this.f9397u0 != z10) {
            this.f9397u0 = z10;
            jh.b bVar = this.V;
            if (bVar != null) {
                bVar.setEnabled(z10);
                bVar.setClickable(z10);
                ViewPropertyAnimator animate = bVar.animate();
                float f10 = 0.6f;
                float f11 = 1.0f;
                if (z10) {
                    f9 = 1.0f;
                } else {
                    f9 = 0.6f;
                }
                ViewPropertyAnimator scaleX = animate.scaleX(f9);
                if (z10) {
                    f10 = 1.0f;
                }
                ViewPropertyAnimator scaleY = scaleX.scaleY(f10);
                if (!z10) {
                    f11 = 0.0f;
                }
                scaleY.alpha(f11).setDuration(180L).start();
            }
        }
    }

    public final void W() {
        long j10;
        o oVar = this.Y;
        int value = oVar.getValue();
        if (oVar.getProgress() > 0.99f) {
            oVar.g(LocaleController.getString(R.string.Gift2AuctionTapToBidMore));
            return;
        }
        long j11 = value;
        TL_stars.TL_StarGiftAuctionUserState tL_StarGiftAuctionUserState = this.f9385h0.auctionUserState;
        long j12 = tL_StarGiftAuctionUserState.bid_amount;
        if (j11 == j12) {
            oVar.g(LocaleController.getString(R.string.Gift2AuctionYourBid));
        } else if (j12 > 0 && !tL_StarGiftAuctionUserState.returned) {
            if (j11 - j12 > 0) {
                oVar.g("+" + LocaleController.formatNumber(j10, ','));
                return;
            }
            oVar.g(null);
        } else {
            oVar.g(null);
        }
    }

    public final void X(int i10) {
        if (this.f9398v0) {
            return;
        }
        long j10 = this.f9385h0.auctionUserState.bid_amount;
        long j11 = i10;
        if (j10 > 0) {
            j11 -= j10;
        }
        long j12 = j11;
        if (s7.y(this.currentAccount, false).f12790e && s7.y(this.currentAccount, false).q(false, false, null).amount < j12) {
            new y9(getContext(), this.resourcesProvider, j12, 14, null, null, 0L).show();
            return;
        }
        this.f9398v0 = true;
        this.W.setLoading(true);
        GiftAuctionController.getInstance(this.currentAccount).sendBid(this.T, this.f9386i0, i10, new m(this, j10, 0));
    }

    public final void Y() {
        FrameLayout frameLayout;
        Drawable drawable = this.shadowDrawable;
        if (drawable != null && this.containerView != null && (frameLayout = this.f9384g0) != null) {
            frameLayout.setTranslationY(Math.max(0.0f, ((this.containerView.getY() + drawable.getBounds().top) - frameLayout.getMeasuredHeight()) + AndroidUtilities.dp(10.0f)));
        }
    }

    public final void Z(boolean z10) {
        long value = this.Y.getValue();
        long currentMyBid = this.f9385h0.getCurrentMyBid();
        p pVar = this.W;
        if (value == currentMyBid) {
            pVar.g(LocaleController.getString(R.string.OK), z10, true);
            pVar.setOnClickListener(new l(this, 0));
            return;
        }
        TL_stars.TL_StarGiftAuctionUserState tL_StarGiftAuctionUserState = this.f9385h0.auctionUserState;
        long j10 = tL_StarGiftAuctionUserState.bid_amount;
        iq[] iqVarArr = this.f9394r0;
        if (j10 < value && !tL_StarGiftAuctionUserState.returned) {
            pVar.g(ia.V0(false, LocaleController.formatString(R.string.Gift2AuctionPlaceBidAdd, LocaleController.formatNumber(value - j10, ',')), iqVarArr), z10, true);
        } else {
            pVar.g(ia.V0(false, LocaleController.formatString(R.string.Gift2AuctionPlaceBid, LocaleController.formatNumber(value, ',')), iqVarArr), z10, true);
        }
        pVar.setOnClickListener(new l(this, 1));
    }

    public final void a0() {
        int d = i0.a.d(this.f9392p0.f49505e, i0.a.d(this.f9393q0.f49505e, getThemedColor(g6.L6), getThemedColor(g6.f23295q7)), getThemedColor(g6.uj));
        this.f9380c0.setTextColor(d);
        o6 o6Var = this.f9381d0;
        o6Var.setTextColor(d);
        this.f9382e0.f9346b.setTextColor(d);
        if (g6.B1(o6Var.getSizeableBackground(), g6.l1(0.15f, d), false)) {
            o6Var.invalidate();
        }
    }

    public final void b0(long j10, boolean z10) {
        String formatDurationNoHours;
        o6 o6Var = (o6) this.f9378a0.f2146b;
        if (j10 >= 3600) {
            formatDurationNoHours = AndroidUtilities.formatFullDuration((int) j10);
        } else {
            formatDurationNoHours = AndroidUtilities.formatDurationNoHours((int) j10, true);
        }
        o6Var.c(formatDurationNoHours, z10, true);
    }

    public final void c0(boolean z10) {
        int i10;
        long value = this.Y.getValue();
        int approximatedMyPlace = this.f9385h0.getApproximatedMyPlace();
        int approximatePlaceFromStars = this.f9385h0.approximatePlaceFromStars(value);
        long max = Math.max(value, this.f9385h0.getCurrentMyBid());
        r rVar = this.f9382e0;
        rVar.a(max, false);
        if (approximatedMyPlace > 0) {
            approximatePlaceFromStars = Math.min(approximatedMyPlace, approximatePlaceFromStars);
        }
        rVar.b(approximatePlaceFromStars, false, z10);
        GiftAuctionController.Auction auction = this.f9385h0;
        TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = auction.auctionStateActive;
        o6 o6Var = this.f9381d0;
        if (tL_starGiftAuctionState != null && approximatePlaceFromStars > 0 && auction.gift.title != null && auction.getBidStatus() == GiftAuctionController.Auction.BidStatus.WINNING && !this.f9385h0.isUpcoming()) {
            GiftAuctionController.Auction auction2 = this.f9385h0;
            if (auction2.auctionStateActive.last_gift_num + approximatePlaceFromStars <= auction2.gift.availability_total) {
                o6Var.setText(this.f9385h0.gift.title + " #" + LocaleController.formatNumber(i10, ','));
                return;
            }
        }
        o6Var.setText(null);
    }

    public final void d0(boolean z10) {
        boolean z11;
        GiftAuctionController.Auction.BidStatus bidStatus = this.f9385h0.getBidStatus();
        long j10 = this.f9385h0.auctionUserState.bid_amount;
        org.telegram.ui.Cells.k4 k4Var = this.f9380c0;
        boolean z12 = false;
        if (this.Y.getValue() > j10) {
            k4Var.c(LocaleController.getString(R.string.Gift2AuctionBidStatusFuture), z10);
        } else {
            z11 = true;
            if (bidStatus == GiftAuctionController.Auction.BidStatus.OUTBID) {
                k4Var.c(LocaleController.getString(R.string.Gift2AuctionBidStatusOutbid), z10);
            } else if (bidStatus == GiftAuctionController.Auction.BidStatus.RETURNED) {
                k4Var.c(LocaleController.getString(R.string.Gift2AuctionBidStatusOutbid), z10);
            } else if (bidStatus == GiftAuctionController.Auction.BidStatus.WINNING) {
                k4Var.c(LocaleController.getString(R.string.Gift2AuctionBidStatusWinning), z10);
                z11 = false;
                z12 = true;
            } else {
                k4Var.c(LocaleController.getString(R.string.Gift2AuctionBidStatusFuture), z10);
            }
            this.f9392p0.a(z12, z10);
            this.f9393q0.a(z11, z10);
        }
        z11 = false;
        this.f9392p0.a(z12, z10);
        this.f9393q0.a(z11, z10);
    }

    @Override
    public final void dismiss() {
        GiftAuctionController.getInstance(this.currentAccount).unsubscribeFromGiftAuction(this.T, this);
        this.X.b();
        super.dismiss();
    }

    public final void e0(boolean z10) {
        org.telegram.ui.ActionBar.o2 R;
        int i10;
        ((o6) this.Z.f2146b).c(ia.X0(false, "⭐️" + LocaleController.formatNumberWithMillion((int) this.f9385h0.getMinimumBid(), ','), 0.78f, this.f9390n0), z10, true);
        if (this.f9385h0.auctionStateActive != null) {
            int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
            boolean isUpcoming = this.f9385h0.isUpcoming(currentTime);
            jf.p pVar = this.X;
            if (isUpcoming) {
                long max = Math.max(0, this.f9385h0.auctionStateActive.start_date - currentTime);
                pVar.a(max);
                b0(max, z10);
            } else {
                long max2 = Math.max(0, this.f9385h0.auctionStateActive.next_round_at - currentTime);
                pVar.a(max2);
                b0(max2, z10);
            }
            org.telegram.ui.Components.y5 y5Var = this.f9391o0;
            bg.d1 d1Var = this.f9379b0;
            if (y5Var == null && this.f9385h0.gift.sticker != null) {
                this.f9391o0 = new org.telegram.ui.Components.y5(this.f9385h0.gift.sticker.f22398id, ((o6) d1Var.f2146b).getPaint().getFontMetricsInt());
            }
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            if (this.f9391o0 != null) {
                spannableStringBuilder.append((CharSequence) "* ");
                spannableStringBuilder.setSpan(this.f9391o0, 0, 1, 33);
            }
            spannableStringBuilder.append((CharSequence) LocaleController.formatNumber(this.f9385h0.auctionStateActive.gifts_left, ','));
            ((o6) d1Var.f2146b).c(spannableStringBuilder, z10, true);
            TextView textView = (TextView) this.f9378a0.f2147c;
            if (this.f9385h0.isUpcoming()) {
                i10 = R.string.Gift2AuctionBidInfoUntilStart;
            } else {
                TL_stars.TL_starGiftAuctionState tL_starGiftAuctionState = this.f9385h0.auctionStateActive;
                if (tL_starGiftAuctionState.current_round == tL_starGiftAuctionState.total_rounds) {
                    i10 = R.string.Gift2AuctionBidInfoUntilEndRound;
                } else {
                    i10 = R.string.Gift2AuctionBidInfoUntilNextRound;
                }
            }
            textView.setText(LocaleController.getString(i10));
            r[] rVarArr = this.f9383f0;
            int min = Math.min(rVarArr.length, this.f9385h0.auctionStateActive.top_bidders.size());
            if (min > 0) {
                int i11 = 0;
                while (i11 < min) {
                    int i12 = i11 + 1;
                    Long l10 = this.f9385h0.auctionStateActive.top_bidders.get(i11);
                    long longValue = l10.longValue();
                    TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(l10);
                    if (user != null) {
                        rVarArr[i11].c(user);
                    }
                    rVarArr[i11].a(this.f9385h0.approximateBidAmountFromPlace(i12), z10);
                    rVarArr[i11].setOnClickListener(new bh.s(this, longValue, 1));
                    i11 = i12;
                }
            }
        }
        GiftAuctionController.Auction auction = this.f9385h0;
        o oVar = this.Y;
        oVar.setStarsTop(auction.approximateBidAmountFromPlace(auction.gift.gifts_per_round) + 1);
        oVar.setTopText(LocaleController.formatPluralString("StarsReactionTopX", this.f9385h0.gift.gifts_per_round, new Object[0]));
        c0(z10);
        d0(z10);
        Z(z10);
        W();
        long peerDialogId = DialogObject.getPeerDialogId(this.f9385h0.auctionUserState.peer);
        long j10 = this.f9385h0.auctionUserState.acquired_count;
        if (this.f9389l0 < j10 && !this.m0 && (R = LaunchActivity.R()) != null) {
            long j11 = this.f9388k0;
            if (j11 != 0) {
                tn R9 = tn.R9(j11);
                R9.whenFullyVisible(new h(R9, 0));
                R.presentFragment(R9);
                Runnable runnable = this.f9387j0;
                if (runnable != null) {
                    runnable.run();
                }
                dismiss();
            }
        }
        if (peerDialogId != 0) {
            this.f9388k0 = peerDialogId;
        }
        this.f9389l0 = j10;
        this.m0 = false;
    }

    @Override
    public final void onContainerTranslationYChanged(float f9) {
        super.onContainerTranslationYChanged(f9);
        V();
    }

    @Override
    public final void onDismissAnimationStart() {
        super.onDismissAnimationStart();
        this.f9395s0 = false;
        V();
        mc.h(this.container);
    }

    @Override
    public final void onOpenAnimationEnd() {
        super.onOpenAnimationEnd();
        this.f9395s0 = true;
        V();
        mc.a(this.container, new eg.x(3));
    }

    @Override
    public final void onUpdate(GiftAuctionController.Auction auction) {
        this.f9385h0 = auction;
        e0(this.f9395s0);
    }

    @Override
    public final il0 v(jl0 jl0Var) {
        k51 k51Var = new k51(this.d, getContext(), this.currentAccount, 0, true, new bg.t1(this, 6), this.resourcesProvider);
        this.f9396t0 = k51Var;
        k51Var.f29939r = false;
        return k51Var;
    }

    @Override
    public final CharSequence y() {
        return LocaleController.getString(R.string.Gift2AuctionPlaceABidTitle);
    }
}
