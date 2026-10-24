package ai;

import android.animation.ValueAnimator;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.os.Bundle;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TableRow;
import android.widget.TextView;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BirthdayController;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.FileLog;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.MessagesStorage;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.messenger.tl;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.tgnet.tl.TL_wallet;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.b41;
import org.telegram.ui.Components.ba0;
import org.telegram.ui.Components.k01;
import org.telegram.ui.Components.km0;
import org.telegram.ui.Components.l01;
import org.telegram.ui.Components.lm0;
import org.telegram.ui.Components.m01;
import org.telegram.ui.Components.n01;
import org.telegram.ui.Components.oy;
import org.telegram.ui.Components.vp;
import org.telegram.ui.Components.vq;
import org.telegram.ui.Components.w90;
import org.telegram.ui.Components.x00;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ey;
import org.telegram.ui.n71;
import org.telegram.ui.sn;
import org.telegram.ui.t91;
public class l7 extends org.telegram.ui.Components.za implements NotificationCenter.NotificationCenterDelegate {
    public static final int A1 = 0;
    public boolean A0;
    public final k5 B0;
    public final TextView C0;
    public final k5 D0;
    public boolean E0;
    public TL_stars.SavedStarGift F0;
    public z9 G0;
    public MessageObject H0;
    public String I0;
    public TL_stars.TL_starGiftUnique J0;
    public boolean K0;
    public boolean L0;
    public boolean M0;
    public boolean N0;
    public boolean O0;
    public t6 P0;
    public boolean Q0;
    public n5 R0;
    public final int[] S0;
    public m5 T0;
    public int U0;
    public String V0;
    public yh.e4 W0;
    public final long X;
    public vq X0;
    public final o5 Y;
    public boolean Y0;
    public final i5 Z;
    public b5 Z0;
    public final x00 f1710a0;
    public Float f1711a1;
    public final View f1712b0;
    public h6 f1713b1;
    public yh.k2 f1714c0;
    public ValueAnimator f1715c1;
    public yh.k2 f1716d0;
    public vq f1717d1;
    public final l5 f1718e0;
    public boolean f1719e1;
    public final f7 f1720f0;
    public TL_wallet.nftItem f1721f1;
    public final k5 f1722g0;
    public org.telegram.ui.Wallet.u4 f1723g1;
    public final w90 f1724h0;
    public org.telegram.ui.Wallet.v4 f1725h1;
    public final n01 f1726i0;
    public TL_wallet.walletTransaction f1727i1;
    public final w90 f1728j0;
    public View f1729j1;
    public final ei.d f1730k0;
    public yh.a2 f1731k1;
    public final FrameLayout f1732l0;
    public boolean l1;
    public final w90 m0;
    public Boolean f1733m1;
    public final FrameLayout f1734n0;
    public boolean f1735n1;
    public final View f1736o0;
    public ArrayList f1737o1;
    public final FrameLayout f1738p0;
    public ArrayList f1739p1;
    public h7 f1740q0;
    public ArrayList f1741q1;
    public boolean f1742r0;
    public boolean f1743r1;
    public final k5 f1744s0;
    public TLRPC.PaymentForm f1745s1;
    public final gi.k[] f1746t0;
    public final vq[] f1747t1;
    public final View f1748u0;
    public final d2 f1749u1;
    public final LinearLayout f1750v0;
    public int f1751v1;
    public final vp f1752w0;
    public Boolean f1753w1;
    public final TextView f1754x0;
    public boolean f1755x1;
    public final LinearLayout f1756y0;
    public ei.x3 f1757y1;
    public final vp f1758z0;
    public View f1759z1;

    public l7(Context context, int i10, long j10, org.telegram.ui.ActionBar.g6 g6Var, View view) {
        super(context, null, false, false, g6Var);
        this.f1742r0 = false;
        this.S0 = new int[2];
        this.U0 = -1;
        this.V0 = "";
        this.f1713b1 = new h6(0, 0);
        this.f1719e1 = true;
        this.f1747t1 = new vq[1];
        this.f1749u1 = new d2(this, 11);
        this.f1755x1 = true;
        this.currentAccount = i10;
        this.X = j10;
        this.v = Math.max(0.05f, AndroidUtilities.dp(82.0f) / (AndroidUtilities.displaySize.y + AndroidUtilities.statusBarHeight));
        this.occupyNavigationBar = true;
        this.containerView = new ah.x(this, context, 1);
        o5 o5Var = new o5(this, context);
        this.Y = o5Var;
        i5 i5Var = new i5(this, context);
        this.Z = i5Var;
        i5Var.setAdapter(new j5(this, context, 0));
        X2();
        View view2 = new View(context);
        this.f1712b0 = view2;
        int i11 = org.telegram.ui.ActionBar.k6.f21255h5;
        org.telegram.ui.ActionBar.r6.i(i11, view2, g6Var);
        FrameLayout.LayoutParams e = w7.z5.e(-1, 50, 80);
        int i12 = this.backgroundPaddingLeft;
        e.rightMargin = i12;
        e.leftMargin = i12;
        this.containerView.addView(view2, e);
        this.containerView.addView(i5Var, w7.z5.e(-1, -1, 119));
        fixNavigationBarKey(i11);
        AndroidUtilities.removeFromParent(this.d);
        o5Var.addView(this.d, w7.z5.e(-1, -1, 119));
        k5 k5Var = new k5(this, context, 0);
        this.f1722g0 = k5Var;
        k5Var.setOrientation(1);
        k5Var.setPadding(AndroidUtilities.dp(14.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(14.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(68.0f));
        o5Var.addView(k5Var, w7.z5.e(-1, -1, 55));
        w90 w90Var = new w90(context, g6Var);
        this.f1724h0 = w90Var;
        int i13 = org.telegram.ui.ActionBar.k6.f21421q5;
        org.telegram.ui.ActionBar.r6.W(w90Var, i13, g6Var);
        w90Var.setTextSize(1, 12.0f);
        w90Var.setGravity(17);
        w90Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        org.telegram.ui.ActionBar.r6.I(w90Var, org.telegram.ui.ActionBar.k6.f21243gc, g6Var);
        w90Var.setDisablePaddingsOffsetY(true);
        k5Var.addView(w90Var, w7.z5.t(-2, -2, 1, 4, -2, 4, 16));
        w90Var.setVisibility(8);
        n01 n01Var = new n01(context, g6Var);
        this.f1726i0 = n01Var;
        k5Var.addView(n01Var, w7.z5.k(0.0f, 0.0f, 0.0f, 12.0f, -1, -2));
        w90 w90Var2 = new w90(context, g6Var);
        this.f1728j0 = w90Var2;
        org.telegram.ui.ActionBar.r6.W(w90Var2, i13, g6Var);
        w90Var2.setTextSize(1, 12.0f);
        w90Var2.setGravity(17);
        w90Var2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        int i14 = org.telegram.ui.ActionBar.k6.Oh;
        org.telegram.ui.ActionBar.r6.I(w90Var2, i14, g6Var);
        w90Var2.setDisablePaddingsOffsetY(true);
        w90Var2.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), 0);
        k5Var.addView(w90Var2, w7.z5.t(-2, -2, 1, 4, 2, 4, 8));
        w90Var2.setVisibility(8);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f1756y0 = linearLayout;
        linearLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        linearLayout.setOrientation(0);
        int i15 = org.telegram.ui.ActionBar.k6.f21273i6;
        org.telegram.ui.Cells.y Z = org.telegram.ui.ActionBar.k6.Z(org.telegram.ui.ActionBar.k6.w0(i15, g6Var), 21, 21);
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i15);
        linearLayout.setBackground(Z);
        org.telegram.ui.ActionBar.r6.k(linearLayout, Z, null, O, g6Var);
        vp vpVar = new vp(context, 24, g6Var);
        this.f1758z0 = vpVar;
        int i16 = org.telegram.ui.ActionBar.k6.f21257h7;
        int i17 = org.telegram.ui.ActionBar.k6.f21292j7;
        int i18 = org.telegram.ui.ActionBar.k6.f21312k7;
        vpVar.b(i16, i17, i18);
        vpVar.setDrawUnchecked(true);
        vpVar.a(false, false);
        vpVar.setDrawBackgroundAsArc(10);
        linearLayout.addView(vpVar, w7.z5.t(26, 26, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        int i19 = org.telegram.ui.ActionBar.k6.f21290j5;
        org.telegram.ui.ActionBar.r6.W(textView, i19, g6Var);
        textView.setTextSize(1, 14.0f);
        textView.setText(LocaleController.getString(R.string.Gift2AlsoShowInMyGifts));
        linearLayout.addView(textView, w7.z5.t(-2, -2, 16, 9, 0, 0, 0));
        k5Var.addView(linearLayout, w7.z5.t(-2, -2, 1, 0, -4, 0, 4));
        w7.b6.b(linearLayout, 0.025f, 1.5f);
        linearLayout.setOnClickListener(new c2(this, 19));
        linearLayout.setVisibility(8);
        k5 k5Var2 = new k5(this, context, 1);
        this.f1744s0 = k5Var2;
        k5Var2.setOrientation(1);
        k5Var2.setPadding(AndroidUtilities.dp(4.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(4.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(66.0f));
        o5Var.addView(k5Var2, w7.z5.e(-1, -1, 55));
        this.f1746t0 = r8;
        gi.k kVar = new gi.k(context, g6Var, false);
        kVar.a(LocaleController.getString(R.string.Gift2UpgradeFeature1Title), LocaleController.getString(R.string.GiftsFeature1Text), R.drawable.menu_feature_unique);
        k5Var2.addView(r8[0], w7.z5.n(-1, -2));
        gi.k kVar2 = new gi.k(context, g6Var, false);
        kVar2.a(LocaleController.getString(R.string.Gift2UpgradeFeature3Title), LocaleController.getString(R.string.GiftsFeature2Text), R.drawable.menu_feature_tradable);
        k5Var2.addView(r8[1], w7.z5.n(-1, -2));
        gi.k kVar3 = new gi.k(context, g6Var, false);
        gi.k[] kVarArr = {kVar, kVar2, kVar3};
        kVar3.a(LocaleController.getString(R.string.GiftsFeature3Title), LocaleController.getString(R.string.GiftsFeature3Text), R.drawable.menu_wear);
        k5Var2.addView(kVarArr[2], w7.z5.n(-1, -2));
        View view3 = new View(context);
        this.f1748u0 = view3;
        int i20 = org.telegram.ui.ActionBar.k6.f21185d7;
        org.telegram.ui.ActionBar.r6.i(i20, view3, g6Var);
        k5Var2.addView(view3, w7.z5.s(-2, 7, 17, -4, 17, 1.0f / AndroidUtilities.density, 6));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f1750v0 = linearLayout2;
        linearLayout2.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        linearLayout2.setOrientation(0);
        org.telegram.ui.Cells.y Z2 = org.telegram.ui.ActionBar.k6.Z(org.telegram.ui.ActionBar.k6.w0(i15, g6Var), 6, 6);
        org.telegram.ui.ActionBar.n6 O2 = org.telegram.ui.ActionBar.r6.O(i15);
        linearLayout2.setBackground(Z2);
        org.telegram.ui.ActionBar.r6.k(linearLayout2, Z2, null, O2, g6Var);
        vp vpVar2 = new vp(context, 24, g6Var);
        this.f1752w0 = vpVar2;
        vpVar2.b(i16, i17, i18);
        vpVar2.setDrawUnchecked(true);
        vpVar2.a(false, false);
        vpVar2.setDrawBackgroundAsArc(10);
        linearLayout2.addView(vpVar2, w7.z5.t(26, 26, 16, 0, 0, 0, 0));
        TextView textView2 = new TextView(context);
        this.f1754x0 = textView2;
        org.telegram.ui.ActionBar.r6.W(textView2, i19, g6Var);
        textView2.setTextSize(1, 14.0f);
        textView2.setText(LocaleController.getString(R.string.Gift2AddSenderName));
        linearLayout2.addView(textView2, w7.z5.t(-2, -2, 16, 9, 0, 0, 0));
        k5Var2.addView(linearLayout2, w7.z5.t(-2, -2, 1, 0, 0, 0, 4));
        w7.b6.b(linearLayout2, 0.025f, 1.5f);
        k5 k5Var3 = new k5(this, context, 2);
        this.B0 = k5Var3;
        k5Var3.setOrientation(1);
        k5Var3.setPadding(AndroidUtilities.dp(4.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(4.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(66.0f));
        o5Var.addView(k5Var3, w7.z5.e(-1, -1, 55));
        TextView textView3 = new TextView(context);
        this.C0 = textView3;
        org.telegram.ui.ActionBar.r6.W(textView3, i19, g6Var);
        textView3.setTextSize(1, 20.0f);
        textView3.setGravity(17);
        textView3.setTypeface(AndroidUtilities.bold());
        k5Var3.addView(textView3, w7.z5.t(-1, -2, 7, 20, 0, 20, 0));
        TextView textView4 = new TextView(context);
        org.telegram.ui.ActionBar.r6.W(textView4, i19, g6Var);
        textView4.setTextSize(1, 14.0f);
        textView4.setGravity(17);
        textView4.setText(LocaleController.getString(R.string.Gift2WearSubtitle));
        k5Var3.addView(textView4, w7.z5.t(-1, -2, 7, 20, 6, 20, 24));
        gi.k kVar4 = new gi.k(context, g6Var, false);
        kVar4.a(LocaleController.getString(R.string.Gift2WearFeature1Title), LocaleController.getString(R.string.Gift2WearFeature1Text), R.drawable.menu_feature_unique);
        k5Var3.addView(r11[0], w7.z5.n(-1, -2));
        gi.k kVar5 = new gi.k(context, g6Var, false);
        kVar5.a(LocaleController.getString(R.string.Gift2WearFeature2Title), LocaleController.getString(R.string.Gift2WearFeature2Text), R.drawable.menu_feature_cover);
        k5Var3.addView(r11[1], w7.z5.n(-1, -2));
        gi.k kVar6 = new gi.k(context, g6Var, false);
        gi.k[] kVarArr2 = {kVar4, kVar5, kVar6};
        kVar6.a(LocaleController.getString(R.string.Gift2WearFeature3Title), LocaleController.getString(R.string.Gift2WearFeature3Text), R.drawable.menu_verification);
        k5Var3.addView(kVarArr2[2], w7.z5.n(-1, -2));
        k5 k5Var4 = new k5(this, context, 3);
        this.D0 = k5Var4;
        k5Var4.setOrientation(1);
        k5Var4.setPadding(AndroidUtilities.dp(4.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(92.0f));
        o5Var.addView(k5Var4, w7.z5.e(-1, -1, 55));
        gi.k kVar7 = new gi.k(context, g6Var, false);
        kVar7.a(LocaleController.getString(R.string.GiftCraftInfoFeature1Title), LocaleController.getString(R.string.GiftCraftInfoFeature1Text), R.drawable.menu_feature_unique);
        k5Var4.addView(r8[0], w7.z5.n(-1, -2));
        gi.k kVar8 = new gi.k(context, g6Var, false);
        kVar8.a(LocaleController.getString(R.string.GiftCraftInfoFeature2Title), LocaleController.getString(R.string.GiftCraftInfoFeature2Text), R.drawable.menu_random);
        k5Var4.addView(r8[1], w7.z5.n(-1, -2));
        gi.k kVar9 = new gi.k(context, g6Var, false);
        gi.k[] kVarArr3 = {kVar7, kVar8, kVar9};
        kVar9.a(LocaleController.getString(R.string.GiftCraftInfoFeature3Title), LocaleController.getString(R.string.GiftCraftInfoFeature3Text), R.drawable.menu_feature_affect);
        k5Var4.addView(kVarArr3[2], w7.z5.n(-1, -2));
        k5Var.setAlpha(1.0f);
        k5Var2.setAlpha(0.0f);
        k5Var3.setAlpha(0.0f);
        k5Var4.setAlpha(0.0f);
        f7 f7Var = new f7(context, g6Var, new d2(this, 12), new c2(this, 20), new c2(this, 21), new c2(this, 22), new c2(this, 23), new c2(this, 24), new c2(this, 25), new c2(this, 26));
        this.f1720f0 = f7Var;
        f7Var.M.f1199c.setOnClickListener(new c2(this, 17));
        int i21 = this.backgroundPaddingLeft;
        f7Var.setPadding(i21, 0, i21, 0);
        o5Var.addView(f7Var, w7.z5.e(-1, -2, 55));
        hg.a0 a0Var = this.f33210c;
        this.P = true;
        a0Var.k1(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f1732l0 = frameLayout;
        org.telegram.ui.ActionBar.r6.i(i11, frameLayout, g6Var);
        View view4 = new View(context);
        this.f1736o0 = view4;
        org.telegram.ui.ActionBar.r6.i(i20, view4, g6Var);
        view4.setAlpha(0.0f);
        frameLayout.addView(view4, w7.z5.a(-1.0f, 1.0f / AndroidUtilities.density, 55));
        ei.d g10 = tl.g(24, context, g6Var, true);
        this.f1730k0 = g10;
        g10.i(LocaleController.getString(R.string.OK), false, true);
        g10.g(null, false);
        FrameLayout.LayoutParams d = w7.z5.d(-1, 48.0f, 119, 0.0f, 12.0f, 0.0f, 12.0f);
        d.leftMargin = AndroidUtilities.dp(14.0f) + this.backgroundPaddingLeft;
        d.rightMargin = AndroidUtilities.dp(14.0f) + this.backgroundPaddingLeft;
        frameLayout.addView(g10, d);
        o5Var.addView(frameLayout, w7.z5.e(-1, 72, 87));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f1734n0 = frameLayout2;
        org.telegram.ui.ActionBar.r6.i(i11, frameLayout2, g6Var);
        w90 w90Var3 = new w90(context, null);
        this.m0 = w90Var3;
        w90Var3.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.r6.W(w90Var3, i14, g6Var);
        org.telegram.ui.ActionBar.r6.I(w90Var3, i14, g6Var);
        w90Var3.setGravity(17);
        frameLayout2.addView(w90Var3, w7.z5.d(-1, -2.0f, 17, 16.0f, 8.0f, 16.0f, 14.0f));
        o5Var.addView(frameLayout2, w7.z5.e(-1, -2, 87));
        frameLayout2.setVisibility(8);
        this.d.setOnScrollListener(new ah.d0(this, 3));
        linearLayout2.setOnClickListener(new c2(this, 18));
        x00 x00Var = new x00(context);
        this.f1710a0 = x00Var;
        o5Var.addView(x00Var, w7.z5.c(-1.0f, -1));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f1738p0 = frameLayout3;
        frameLayout3.setPadding(AndroidUtilities.dp(6.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(6.0f) + this.backgroundPaddingLeft, 0);
        o5Var.addView(frameLayout3, w7.z5.d(-1, 200.0f, 87, 0.0f, 0.0f, 0.0f, 60.0f));
        AndroidUtilities.removeFromParent(this.e);
        o5Var.addView(this.e, w7.z5.d(-1, -2.0f, 0, 6.0f, 0.0f, 6.0f, 0.0f));
        l5 l5Var = new l5(context);
        this.f1718e0 = l5Var;
        o5Var.addView(l5Var, w7.z5.e(-1, -2, 55));
        ArrayList arrayList = new ArrayList();
        if (view != null) {
            arrayList.add(view);
        }
        AndroidUtilities.makeGlobalBlurBitmap(new r0(l5Var, 2), 12.0f, 12, null, arrayList);
    }

    public static void A0(l7 l7Var, org.telegram.ui.ActionBar.c2 c2Var, TL_stars.SavedStarGift savedStarGift) {
        if (savedStarGift != null) {
            c2Var.dismiss();
            l7Var.O0 = true;
            l7Var.L2(savedStarGift, null);
            super.show();
            return;
        }
        c2Var.dismiss();
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        if (U != null) {
            org.telegram.ui.Components.oc Q = org.telegram.ui.Components.vc.a0(U).Q(R.raw.error, 36, LocaleController.getString(R.string.MessageNotFound));
            Q.f29213t = true;
            Q.j();
        }
    }

    public static void B0(ai.l7 r17) {
        throw new UnsupportedOperationException("Method not decompiled: ai.l7.B0(ai.l7):void");
    }

    public static void C0(l7 l7Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        l7Var.f1743r1 = false;
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            MessagesController.getInstance(l7Var.currentAccount).putUsers(paymentForm.users, false);
            l7Var.f1745s1 = paymentForm;
            l7Var.A2();
            return;
        }
        org.telegram.ui.Components.oc Y = l7Var.getBulletinFactory().Y(tL_error);
        Y.f29213t = true;
        Y.j();
    }

    public static void D0(l7 l7Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, ag.a aVar, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(l7Var.currentAccount).lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
            AndroidUtilities.runOnUIThread(new j3(l7Var, tL_starGiftUnique, aVar, runnable, 1));
            return;
        }
        l7Var.getClass();
        if (tL_error != null && tL_error.text.startsWith("STARGIFT_RESELL_TOO_EARLY_")) {
            AndroidUtilities.runOnUIThread(new a3.i0(l7Var, Long.parseLong(tL_error.text.substring(26)), runnable, 2));
        } else if (tL_error != null) {
            AndroidUtilities.runOnUIThread(new k3(l7Var, tL_error, runnable, 1));
        }
    }

    public static void D2(org.telegram.ui.ActionBar.o2 o2Var) {
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        if (U == 0) {
            return;
        }
        ?? obj = new Object();
        obj.f21637a = true;
        U.showAsSheet(o2Var, obj);
    }

    public static void E0(l7 l7Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z10, yh.i0 i0Var, i6 i6Var, pf.c cVar) {
        cVar.d();
        ha.x(l7Var.currentAccount, i6Var.f1477a).h(i6Var.f1478b, tL_starGiftUnique, j10, tL_textWithEntities, z10, new b4(l7Var, cVar, tL_starGiftUnique, j10, i0Var, 0));
    }

    public static void F0(long j10, long j11, l7 l7Var, Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(l7Var.currentAccount).lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
        }
        AndroidUtilities.runOnUIThread(new n3(j10, j11, l7Var, callback, tLObject, tL_error));
    }

    public static void G0(l7 l7Var, final yh.i0 i0Var, ag.b bVar, final TL_stars.TL_starGiftUnique tL_starGiftUnique, final long j10, final TLRPC.TL_textWithEntities tL_textWithEntities, final boolean z10, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        l7Var.f1730k0.setLoading(false);
        if (i0Var != null && i0Var.L) {
            i0Var.L = false;
            i0Var.H.h(false);
        }
        if (tL_payments_paymentFormStarGift == null) {
            return;
        }
        new l6(l7Var.getContext(), l7Var.resourcesProvider, tL_starGiftUnique, new i6(bVar, tL_payments_paymentFormStarGift), l7Var.currentAccount, j10, l7Var.W1(), false, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                l7.E0(l7.this, tL_starGiftUnique, j10, tL_textWithEntities, z10, i0Var, (i6) obj, (pf.c) obj2);
            }
        }).b();
    }

    public static SpannableStringBuilder G2(String str) {
        int i10;
        int i11;
        int indexOf = str.indexOf("**");
        int indexOf2 = str.indexOf("**", indexOf + 1);
        String replace = str.replace("**", "");
        if (indexOf >= 0 && indexOf2 >= 0 && (i11 = indexOf2 - indexOf) > 2) {
            i10 = i11 - 2;
        } else {
            indexOf = -1;
            i10 = 0;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(replace);
        if (indexOf >= 0) {
            spannableStringBuilder.setSpan(new f5(0), indexOf, i10 + indexOf, 0);
        }
        return spannableStringBuilder;
    }

    public static void H0(l7 l7Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, ag.a aVar, Runnable runnable) {
        l7Var.getClass();
        TL_stars.StarsAmount o10 = aVar.o();
        TL_stars.updateStarGiftPrice updatestargiftprice = new TL_stars.updateStarGiftPrice();
        updatestargiftprice.stargift = l7Var.Y1();
        updatestargiftprice.resell_amount = o10;
        ConnectionsManager.getInstance(l7Var.currentAccount).sendRequest(updatestargiftprice, new t2(l7Var, tL_starGiftUnique, aVar, runnable, 0));
    }

    public static void H1(n01 n01Var, TL_stars.StarGiftAttribute starGiftAttribute) {
        String string;
        if (starGiftAttribute instanceof TL_stars.starGiftAttributeModel) {
            string = LocaleController.getString(R.string.Gift2AttributeModel);
        } else if (starGiftAttribute instanceof TL_stars.starGiftAttributePattern) {
            string = LocaleController.getString(R.string.Gift2AttributeSymbol);
        } else if (starGiftAttribute instanceof TL_stars.starGiftAttributeBackdrop) {
            string = LocaleController.getString(R.string.Gift2AttributeBackdrop);
        } else {
            return;
        }
        String str = string;
        Integer[] numArr = new Integer[1];
        n01Var.e(str, starGiftAttribute.name, d2(starGiftAttribute.rarity, numArr), null, numArr[0]);
    }

    public static SpannableStringBuilder H2(String str) {
        if (str == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        SpannableString spannableString = new SpannableString("👌");
        spannableString.setSpan(new vq(R.drawable.filled_understood, 0), 0, spannableString.length(), 33);
        SpannableString spannableString2 = new SpannableString("👍");
        spannableString2.setSpan(new vq(R.drawable.filled_reactions, 0), 0, spannableString2.length(), 33);
        AndroidUtilities.replaceMultipleCharSequence("👌", spannableStringBuilder, spannableString);
        AndroidUtilities.replaceMultipleCharSequence("👍", spannableStringBuilder, spannableString2);
        return spannableStringBuilder;
    }

    public static void I0(l7 l7Var, long j10) {
        new yh.o1(l7Var.getContext(), l7Var.currentAccount, j10, null, new d4(l7Var, 1)).show();
    }

    public static void J0(l7 l7Var, ug.l1 l1Var, org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        pf.c h = c2Var.h(i10, true, true);
        h.d();
        int i11 = l7Var.currentAccount;
        j4 j4Var = new j4(l7Var, h, l1Var, 1);
        org.telegram.ui.Wallet.l0 w9 = org.telegram.ui.Wallet.l0.w(i11);
        w9.j0(new b41(i11, j4Var, w9));
    }

    public static void K0(l7 l7Var, TLObject tLObject, MessageObject messageObject) {
        TLRPC.Message message;
        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
        MessagesController.getInstance(l7Var.currentAccount).putUsers(messages_messages.users, false);
        MessagesController.getInstance(l7Var.currentAccount).putChats(messages_messages.chats, false);
        l7Var.M0 = true;
        l7Var.L0 = false;
        Boolean bool = l7Var.f1733m1;
        if (bool != null && (message = messageObject.messageOwner) != null) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                ((TLRPC.TL_messageActionStarGift) messageAction).saved = true ^ bool.booleanValue();
            } else if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                ((TLRPC.TL_messageActionStarGiftUnique) messageAction).saved = true ^ bool.booleanValue();
            }
        }
        l7Var.K2(messageObject, null);
    }

    public static void L0(l7 l7Var, pf.c cVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(l7Var.currentAccount).lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
            AndroidUtilities.runOnUIThread(new a3.l0(l7Var, cVar, tL_starGiftUnique, 4));
            return;
        }
        l7Var.getClass();
        if (tL_error != null && tL_error.text.startsWith("STARGIFT_RESELL_TOO_EARLY_")) {
            AndroidUtilities.runOnUIThread(new a3.i0(l7Var, cVar, Long.parseLong(tL_error.text.substring(26)), 1));
        } else if (tL_error != null) {
            AndroidUtilities.runOnUIThread(new a3.l0(l7Var, cVar, tL_error, 5));
        }
    }

    public static void M0(l7 l7Var, String str) {
        Context context = l7Var.getContext();
        pf.d.t(context, MessagesController.getInstance(l7Var.currentAccount).tonBlockchainExplorerUrl + str);
    }

    public static void N0(l7 l7Var, TLObject tLObject, String str, TL_stars.InputSavedStarGift inputSavedStarGift, TLRPC.TL_error tL_error, long j10) {
        TL_stars.SavedStarGift savedStarGift;
        if (tLObject instanceof TLRPC.TL_payments_paymentResult) {
            TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) tLObject;
            MessagesController.getInstance(l7Var.currentAccount).putUsers(tL_payments_paymentResult.updates.users, false);
            MessagesController.getInstance(l7Var.currentAccount).putChats(tL_payments_paymentResult.updates.chats, false);
            ha.y(l7Var.currentAccount, false).T(false);
            ha.y(l7Var.currentAccount, false).P();
            if (!TextUtils.isEmpty(str) && (savedStarGift = l7Var.F0) != null) {
                savedStarGift.flags &= -65537;
                savedStarGift.prepaid_upgrade_hash = null;
            }
            l7Var.f1742r0 = true;
            l7Var.f1745s1 = null;
            l7Var.J1(inputSavedStarGift, tL_payments_paymentResult.updates, new g4(l7Var, str, 0));
            Utilities.stageQueue.postRunnable(new h4(l7Var, tL_payments_paymentResult, 0));
        } else if (tL_error != null && "BALANCE_TOO_LOW".equals(tL_error.text)) {
            if (!MessagesController.getInstance(l7Var.currentAccount).starsPurchaseAvailable()) {
                l7Var.f1730k0.setLoading(false);
                ha.e0(l7Var.getContext(), l7Var.resourcesProvider);
                return;
            }
            ha y3 = ha.y(l7Var.currentAccount, false);
            e2 e2Var = new e2(l7Var, j10, 6);
            y3.e = false;
            y3.q(false, true, e2Var);
            y3.e = true;
        } else {
            l7Var.getBulletinFactory().f0(tL_error, false);
        }
    }

    public static void O0(l7 l7Var, String str) {
        Context context = l7Var.getContext();
        pf.d.t(context, MessagesController.getInstance(l7Var.currentAccount).tonBlockchainExplorerUrl + str);
    }

    public static void P(l7 l7Var, String str) {
        Context context = l7Var.getContext();
        pf.d.t(context, MessagesController.getInstance(l7Var.currentAccount).tonBlockchainExplorerUrl + str);
    }

    public static void P0(l7 l7Var, Long l4) {
        String str;
        String formatString;
        TLRPC.Chat chat;
        if (l4.longValue() < 0 && (chat = MessagesController.getInstance(l7Var.currentAccount).getChat(Long.valueOf(-l4.longValue()))) != null) {
            str = chat.title;
        } else {
            str = "";
        }
        org.telegram.ui.Components.vc bulletinFactory = l7Var.getBulletinFactory();
        int i10 = R.raw.contact_check;
        if (TextUtils.isEmpty(str)) {
            formatString = LocaleController.getString(R.string.GiftRepostedToProfile);
        } else {
            formatString = LocaleController.formatString(R.string.GiftRepostedToChannelProfile, str);
        }
        org.telegram.ui.Components.oc Q = bulletinFactory.Q(i10, 36, AndroidUtilities.replaceTags(formatString));
        Q.f29213t = true;
        Q.j();
    }

    public static void Q(l7 l7Var, TLRPC.TL_messageActionStarGift tL_messageActionStarGift, org.telegram.ui.ActionBar.c2 c2Var, TLObject tLObject) {
        MessageObject messageObject;
        if (tLObject instanceof TLRPC.messages_Messages) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            MessagesController.getInstance(l7Var.currentAccount).putUsers(messages_messages.users, false);
            MessagesController.getInstance(l7Var.currentAccount).putChats(messages_messages.chats, false);
            for (int i10 = 0; i10 < messages_messages.messages.size(); i10++) {
                TLRPC.Message message = messages_messages.messages.get(i10);
                if (message != null && !(message instanceof TLRPC.TL_messageEmpty) && message.f20365id == tL_messageActionStarGift.upgrade_msg_id) {
                    messageObject = new MessageObject(l7Var.currentAccount, message, false, false);
                    messageObject.setType();
                    break;
                }
            }
        }
        messageObject = null;
        if (messageObject != null) {
            AndroidUtilities.runOnUIThread(new a3.l0(l7Var, c2Var, messageObject, 9));
        } else {
            AndroidUtilities.runOnUIThread(new v4(c2Var, 0));
        }
    }

    public static void Q0(l7 l7Var, pf.c cVar, ug.l1 l1Var, long j10, TL_stars.TL_starGiftUnique tL_starGiftUnique, TL_wallet.nftItem nftitem, TL_stars.starGiftDepositPayload stargiftdepositpayload) {
        TLRPC.User user;
        k4 k4Var;
        String message;
        String str;
        oy oyVar = null;
        if (org.telegram.ui.Wallet.l0.w(l7Var.currentAccount).u() < stargiftdepositpayload.amount) {
            cVar.b();
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(l7Var.getContext(), 0, l7Var.resourcesProvider);
            String string = LocaleController.getString(R.string.WalletNotEnoughGram);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20679a;
            c2Var.R = string;
            c2Var.T = LocaleController.formatSpannable(R.string.WalletNotEnoughGramToTransferGift, org.telegram.ui.Wallet.l0.m(stargiftdepositpayload.amount, false));
            alertDialog$Builder.h(LocaleController.getString(R.string.WalletNotNow), null);
            alertDialog$Builder.k(LocaleController.getString(R.string.WalletTopUp), new ah.h0(2, l7Var, l1Var));
            alertDialog$Builder.p();
            return;
        }
        if (j10 > 0) {
            user = MessagesController.getInstance(l7Var.currentAccount).getUser(Long.valueOf(j10));
        } else {
            user = null;
        }
        long clientUserId = UserConfig.getInstance(l7Var.currentAccount).getClientUserId();
        TLRPC.Document document = tL_starGiftUnique.getDocument();
        int i10 = l7Var.currentAccount;
        org.telegram.ui.Wallet.l0 w9 = org.telegram.ui.Wallet.l0.w(i10);
        j4 j4Var = new j4(l7Var, cVar, l1Var, 0);
        if (j10 != clientUserId) {
            k4Var = null;
        } else {
            k4Var = new k4(i10, clientUserId, document);
        }
        try {
            if (stargiftdepositpayload.nft_address.indexOf(58) >= 0) {
                str = org.telegram.ui.Wallet.l0.T(stargiftdepositpayload.nft_address, true);
            } else {
                str = stargiftdepositpayload.nft_address;
            }
            String str2 = str;
            org.telegram.ui.Wallet.d2 g10 = org.telegram.ui.Wallet.l0.g(stargiftdepositpayload);
            if (k4Var != null) {
                oyVar = new oy(29, w9, k4Var);
            }
            w9.b0(user, str2, 0L, null, null, nftitem, null, j4Var, oyVar, g10);
        } catch (Exception e) {
            org.telegram.ui.Wallet.l0.j("depositNFT: invalid payload", e);
            if (e.getMessage() == null) {
                message = "NULL_ERROR";
            } else {
                message = e.getMessage();
            }
            j4Var.run(message);
        }
    }

    public static void R(l7 l7Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        d2 d2Var = l7Var.f1749u1;
        l7Var.f1743r1 = false;
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            MessagesController.getInstance(l7Var.currentAccount).putUsers(paymentForm.users, false);
            l7Var.f1745s1 = paymentForm;
            AndroidUtilities.cancelRunOnUIThread(d2Var);
            AndroidUtilities.runOnUIThread(d2Var);
            return;
        }
        org.telegram.ui.Components.oc Y = l7Var.getBulletinFactory().Y(tL_error);
        Y.f29213t = true;
        Y.j();
    }

    public static boolean R0(l7 l7Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, ey eyVar, ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return false;
        }
        long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        long giftThemeUser = ChatThemeController.getInstance(l7Var.currentAccount).getGiftThemeUser(tL_starGiftUnique.slug);
        if (giftThemeUser != 0 && giftThemeUser != j10) {
            org.telegram.ui.Components.d5.m0(l7Var.getContext(), l7Var.resourcesProvider, l7Var.currentAccount, tL_starGiftUnique, giftThemeUser, new c3(l7Var, j10, tL_starGiftUnique, eyVar, 1));
            return true;
        }
        ChatThemeController.getInstance(l7Var.currentAccount).setDialogTheme(j10, new gg.b(null, tL_starGiftUnique.slug));
        eyVar.presentFragment(sn.W9(j10), true);
        return true;
    }

    public static boolean R1(TL_stars.SavedStarGift savedStarGift, TL_stars.SavedStarGift savedStarGift2) {
        if (savedStarGift != savedStarGift2) {
            if (savedStarGift != null) {
                TL_stars.StarGift starGift = savedStarGift.gift;
                TL_stars.StarGift starGift2 = savedStarGift2.gift;
                if (starGift != starGift2) {
                    if ((starGift instanceof TL_stars.TL_starGiftUnique) && (starGift2 instanceof TL_stars.TL_starGiftUnique)) {
                        if (starGift.f20568id == starGift2.f20568id) {
                            return true;
                        }
                        return false;
                    } else if ((starGift instanceof TL_stars.TL_starGift) && (starGift2 instanceof TL_stars.TL_starGift) && starGift.f20568id == starGift2.f20568id && savedStarGift.date == savedStarGift2.date) {
                        return true;
                    } else {
                        return false;
                    }
                }
                return true;
            }
            return false;
        }
        return true;
    }

    public static void S(l7 l7Var, TL_stars.InputSavedStarGift inputSavedStarGift, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            MessagesController.getInstance(l7Var.currentAccount).putUsers(updates.users, false);
            MessagesController.getInstance(l7Var.currentAccount).putChats(updates.chats, false);
        }
        AndroidUtilities.runOnUIThread(new y0(l7Var, tL_error, tLObject, inputSavedStarGift, 4));
    }

    public static void S0(l7 l7Var, MessageObject messageObject, ArrayList arrayList, TL_stars.StarGift starGift) {
        l7Var.l1 = true;
        l7Var.K2(messageObject, null);
        l7Var.U2(0, true, null);
        x00 x00Var = l7Var.f1710a0;
        if (x00Var != null) {
            x00Var.c(true);
        }
        ha.y(l7Var.currentAccount, false).P();
        y9 G = ha.y(l7Var.currentAccount, false).G(UserConfig.getInstance(l7Var.currentAccount).getClientUserId(), false);
        if (G != null) {
            G.k(arrayList, starGift);
        }
    }

    public static boolean S1(TL_stars.TL_starGiftUnique tL_starGiftUnique, TL_stars.TL_starGiftUnique tL_starGiftUnique2) {
        if (tL_starGiftUnique != tL_starGiftUnique2) {
            if (tL_starGiftUnique != null) {
                if (tL_starGiftUnique.f20568id == tL_starGiftUnique2.f20568id || TextUtils.equals(tL_starGiftUnique.slug, tL_starGiftUnique2.slug)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public static void T(l7 l7Var, long j10) {
        new yh.o1(l7Var.getContext(), l7Var.currentAccount, j10, null, new d4(l7Var, 1)).show();
    }

    public static void T0(l7 l7Var, boolean z10, pf.c cVar, Runnable runnable, DialogInterface dialogInterface, Boolean bool) {
        if (bool.booleanValue()) {
            UserConfig userConfig = UserConfig.getInstance(l7Var.currentAccount);
            userConfig.tmpPassword = null;
            userConfig.saveConfig(false);
            l7Var.v2(z10, cVar, runnable);
            return;
        }
        cVar.c(false);
        dialogInterface.dismiss();
        runnable.run();
    }

    public static void U(l7 l7Var) {
        TL_stars.SavedStarGift savedStarGift = l7Var.F0;
        if (savedStarGift.unsaved) {
            savedStarGift.unsaved = false;
            v9 F = ha.y(l7Var.currentAccount, false).F(l7Var.X, false);
            if (F != null) {
                TL_stars.SavedStarGift savedStarGift2 = l7Var.F0;
                F.m(savedStarGift2, savedStarGift2.unsaved);
            }
            TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
            savestargift.stargift = l7Var.Y1();
            savestargift.unsave = l7Var.F0.unsaved;
            ConnectionsManager.getInstance(l7Var.currentAccount).sendRequest(savestargift, null, 64);
        }
        TL_stars.SavedStarGift savedStarGift3 = l7Var.F0;
        boolean z10 = savedStarGift3.pinned_to_top;
        if (((y9) l7Var.G0).o(savedStarGift3, !z10, false)) {
            new yh.o2(l7Var.getContext(), l7Var.X, l7Var.F0, l7Var.resourcesProvider, new Utilities.Callback0Return() {
                @Override
                public final Object run() {
                    return l7.this.getBulletinFactory();
                }
            }).show();
        } else if (!z10) {
            l7Var.getBulletinFactory().M(LocaleController.getString(R.string.Gift2PinnedTitle), LocaleController.getString(R.string.Gift2PinnedSubtitle), R.raw.ic_pin).j();
        } else {
            org.telegram.messenger.v0.p(R.string.Gift2Unpinned, l7Var.getBulletinFactory(), R.raw.ic_unpin, 36);
        }
    }

    public static void U0(l7 l7Var, long j10) {
        dd ddVar = new dd(l7Var.getContext(), l7Var.resourcesProvider, j10, 10, null, new a1.f(22, l7Var, new boolean[]{false}), 0L);
        ddVar.setOnDismissListener(new n4(l7Var, 0));
        ddVar.show();
    }

    public static void V(l7 l7Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, org.telegram.ui.ActionBar.c2 c2Var) {
        l7Var.getClass();
        pf.c h = c2Var.h(-1, true, true);
        h.d();
        TL_stars.updateStarGiftPrice updatestargiftprice = new TL_stars.updateStarGiftPrice();
        updatestargiftprice.stargift = l7Var.Y1();
        updatestargiftprice.resell_amount = TL_stars.StarsAmount.ofStars(0L);
        ConnectionsManager.getInstance(l7Var.currentAccount).sendRequest(updatestargiftprice, new j2(l7Var, h, tL_starGiftUnique, 1));
    }

    public static void V0(l7 l7Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, ag.a aVar, Runnable runnable) {
        TL_stars.StarsAmount o10 = aVar.o();
        TL_stars.updateStarGiftPrice updatestargiftprice = new TL_stars.updateStarGiftPrice();
        updatestargiftprice.stargift = l7Var.Y1();
        updatestargiftprice.resell_amount = o10;
        ConnectionsManager.getInstance(l7Var.currentAccount).sendRequest(updatestargiftprice, new t2(l7Var, tL_starGiftUnique, aVar, runnable, 1));
    }

    public static void W(l7 l7Var, org.telegram.ui.ActionBar.c2 c2Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TL_stars.TL_payments_uniqueStarGift) {
            TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift = (TL_stars.TL_payments_uniqueStarGift) tLObject;
            MessagesController.getInstance(l7Var.currentAccount).putUsers(tL_payments_uniqueStarGift.users, false);
            MessagesController.getInstance(l7Var.currentAccount).putChats(tL_payments_uniqueStarGift.chats, false);
            if (tL_payments_uniqueStarGift.gift instanceof TL_stars.TL_starGiftUnique) {
                AndroidUtilities.runOnUIThread(new a1.f(15, l7Var, tL_payments_uniqueStarGift));
                return;
            }
        }
        AndroidUtilities.runOnUIThread(new a1.f(16, c2Var, tL_error));
    }

    public static void W0(l7 l7Var, int i10, int i11, int i12, ug.l1[] l1VarArr, TL_stars.TL_starGiftUnique tL_starGiftUnique, Long l4) {
        final ug.l1[] l1VarArr2;
        int i13;
        int i14;
        int i15;
        int dp;
        boolean z10;
        int i16;
        String str;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        if (l4.longValue() != -99) {
            if (l4.longValue() == -98) {
                i13 = i10;
                l1VarArr2 = l1VarArr;
            } else {
                a3.l0 l0Var = new a3.l0(l7Var, l4, l1VarArr, 3);
                if (l4.longValue() < 0) {
                    TLRPC.ChatFull chatFull = MessagesController.getInstance(l7Var.currentAccount).getChatFull(-l4.longValue());
                    if (chatFull == null) {
                        TLRPC.TL_channels_getFullChannel tL_channels_getFullChannel = new TLRPC.TL_channels_getFullChannel();
                        tL_channels_getFullChannel.channel = MessagesController.getInstance(l7Var.currentAccount).getInputChannel(-l4.longValue());
                        ConnectionsManager.getInstance(l7Var.currentAccount).sendRequest(tL_channels_getFullChannel, new g(2, l7Var, l0Var));
                        return;
                    } else if (!chatFull.stargifts_available) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(l7Var.getContext(), 0, l7Var.resourcesProvider);
                        String string = LocaleController.getString(R.string.Gift2ChannelDoesntSupportGiftsTitle);
                        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20679a;
                        c2Var.R = string;
                        c2Var.T = LocaleController.getString(R.string.Gift2ChannelDoesntSupportGiftsText);
                        org.telegram.messenger.v0.o(R.string.OK, alertDialog$Builder, null);
                        return;
                    }
                } else if (l4.longValue() >= 0) {
                    TLRPC.User user = MessagesController.getInstance(l7Var.currentAccount).getUser(l4);
                    TLRPC.UserFull userFull = MessagesController.getInstance(l7Var.currentAccount).getUserFull(l4.longValue());
                    if (userFull != null && (disallowedGiftsSettings = userFull.disallowed_stargifts) != null && disallowedGiftsSettings.disallow_unique_stargifts) {
                        new org.telegram.ui.Components.vc(l1VarArr[0].container, l7Var.resourcesProvider).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(l4.longValue())))).j();
                        return;
                    } else if (userFull == null && user != null) {
                        TLRPC.TL_users_getFullUser tL_users_getFullUser = new TLRPC.TL_users_getFullUser();
                        tL_users_getFullUser.f20484id = MessagesController.getInstance(l7Var.currentAccount).getInputUser(user);
                        ConnectionsManager.getInstance(l7Var.currentAccount).sendRequest(tL_users_getFullUser, new k2(l7Var, l1VarArr, l4, l0Var, 0));
                        return;
                    }
                }
                l0Var.run();
                return;
            }
        } else {
            l1VarArr2 = l1VarArr;
            i13 = i10;
        }
        if (i13 < i11) {
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(l7Var.getContext(), 0, l7Var.resourcesProvider);
            String string2 = LocaleController.getString(R.string.Gift2ExportTONUnlocksAlertTitle);
            org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.f20679a;
            c2Var2.R = string2;
            c2Var2.T = LocaleController.formatPluralString("Gift2ExportTONUnlocksAlertText", Math.max(1, i12), new Object[0]);
            org.telegram.messenger.v0.o(R.string.OK, alertDialog$Builder2, null);
        } else if (l4.longValue() == -98) {
            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(l7Var.getContext(), 0, l7Var.resourcesProvider);
            String string3 = LocaleController.getString(R.string.Gift2MoveToMyWallet);
            org.telegram.ui.ActionBar.c2 c2Var3 = alertDialog$Builder3.f20679a;
            c2Var3.R = string3;
            c2Var3.T = LocaleController.getString(R.string.Gift2MoveToMyWalletText);
            String s10 = org.telegram.ui.Wallet.l0.w(l7Var.currentAccount).s();
            LinearLayout linearLayout = new LinearLayout(l7Var.getContext());
            linearLayout.setOrientation(1);
            if (!TextUtils.isEmpty(s10)) {
                TextView textView = new TextView(l7Var.getContext());
                textView.setTypeface(AndroidUtilities.getTypeface("fonts/rmono.ttf"));
                textView.setTextSize(1, 16.5f);
                textView.setLetterSpacing(0.01818182f);
                textView.setLineSpacing(AndroidUtilities.dp(23.0f) - textView.getPaint().getFontMetricsInt(null), 1.0f);
                textView.setIncludeFontPadding(false);
                textView.setGravity(17);
                textView.setPadding(0, AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f));
                int i17 = org.telegram.ui.ActionBar.k6.f21290j5;
                int w02 = org.telegram.ui.ActionBar.k6.w0(i17, l7Var.resourcesProvider);
                i14 = 3;
                ShapeDrawable c02 = org.telegram.ui.ActionBar.k6.c0(AndroidUtilities.dp(20.0f), org.telegram.ui.ActionBar.k6.o1(0.045f, w02));
                org.telegram.ui.ActionBar.n6 M = org.telegram.ui.ActionBar.r6.M(0.045f, i17);
                org.telegram.ui.ActionBar.g6 g6Var = l7Var.resourcesProvider;
                textView.setBackground(c02);
                org.telegram.ui.ActionBar.r6.k(textView, c02, M, null, g6Var);
                int w03 = org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.f21440r5, l7Var.resourcesProvider);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                int length = (s10.length() + 3) / 4;
                for (int i18 = 0; i18 < length; i18++) {
                    if (i18 > 0) {
                        if (i18 % 4 == 0) {
                            str = "\n";
                        } else {
                            str = " ";
                        }
                        spannableStringBuilder.append((CharSequence) str);
                    }
                    int length2 = spannableStringBuilder.length();
                    int i19 = i18 * 4;
                    spannableStringBuilder.append((CharSequence) s10, i19, Math.min(s10.length(), i19 + 4));
                    if (((i18 / 4) + (i18 % 4)) % 2 == 0) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (z10) {
                        i16 = w02;
                    } else {
                        i16 = w03;
                    }
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(i16), length2, spannableStringBuilder.length(), 33);
                }
                textView.setText(spannableStringBuilder);
                linearLayout.addView(textView, w7.z5.k(20.0f, 0.0f, 20.0f, 14.0f, -1, -2));
            } else {
                i14 = 3;
            }
            TextView textView2 = new TextView(l7Var.getContext());
            textView2.setTextSize(1, 15.0f);
            org.telegram.ui.ActionBar.r6.W(textView2, org.telegram.ui.ActionBar.k6.f21290j5, l7Var.resourcesProvider);
            textView2.setGravity(17);
            textView2.setText(LocaleController.getString(R.string.Gift2MoveAppearIn));
            linearLayout.addView(textView2, w7.z5.k(24.0f, 0.0f, 24.0f, 0.0f, -1, -2));
            LinearLayout linearLayout2 = new LinearLayout(l7Var.getContext());
            linearLayout2.setOrientation(0);
            linearLayout2.setGravity(16);
            int i20 = R.drawable.msg_settings;
            int i21 = org.telegram.ui.ActionBar.k6.f21440r5;
            l7Var.I1(linearLayout2, i20, 14, i21, LocaleController.getString(R.string.Settings), true);
            l7Var.I1(linearLayout2, R.drawable.mini_gram_14, 15, org.telegram.ui.ActionBar.k6.Oh, LocaleController.getString(R.string.WalletAttachMoney), true);
            l7Var.I1(linearLayout2, R.drawable.menu_gift, 14, i21, LocaleController.getString(R.string.WalletCollectibles), false);
            linearLayout.addView(linearLayout2, w7.z5.t(-2, -2, 1, 0, 7, 0, 3));
            l7Var.f1755x1 = true;
            org.telegram.ui.Cells.z1 z1Var = new org.telegram.ui.Cells.z1(l7Var.getContext(), 1, l7Var.resourcesProvider);
            int i22 = org.telegram.ui.ActionBar.k6.f21273i6;
            org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.k6.g0(org.telegram.ui.ActionBar.k6.w0(i22, l7Var.resourcesProvider), 7, AndroidUtilities.dp(12.0f));
            org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i22);
            org.telegram.ui.ActionBar.g6 g6Var2 = l7Var.resourcesProvider;
            z1Var.setBackground(g02);
            org.telegram.ui.ActionBar.r6.k(z1Var, g02, null, O, g6Var2);
            z1Var.setMultiline(true);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) z1Var.getCheckBoxView().getLayoutParams();
            layoutParams.topMargin = 0;
            if (LocaleController.isRTL) {
                i14 = 5;
            }
            layoutParams.gravity = i14 | 16;
            z1Var.getCheckBoxView().setLayoutParams(layoutParams);
            z1Var.e(LocaleController.getString(R.string.Gift2KeepOnProfile), "", true, false, false);
            if (LocaleController.isRTL) {
                i15 = AndroidUtilities.dp(4.0f);
            } else {
                i15 = 0;
            }
            int dp2 = AndroidUtilities.dp(12.0f);
            if (LocaleController.isRTL) {
                dp = 0;
            } else {
                dp = AndroidUtilities.dp(4.0f);
            }
            z1Var.setPadding(i15, dp2, dp, AndroidUtilities.dp(12.0f));
            z1Var.setOnClickListener(new p(5, l7Var, z1Var));
            linearLayout.addView(z1Var, w7.z5.k(8.0f, 4.0f, 8.0f, 0.0f, -1, -2));
            alertDialog$Builder3.o(linearLayout);
            c2Var3.G = 20;
            alertDialog$Builder3.k(LocaleController.getString(R.string.Gift2Move), new org.telegram.ui.ActionBar.z1(l7Var) {
                public final l7 f1467b;

                {
                    this.f1467b = l7Var;
                }

                @Override
                public final void g(org.telegram.ui.ActionBar.c2 c2Var4, int i23) {
                    switch (r3) {
                        case 0:
                            pf.c h = c2Var4.h(i23, true, true);
                            ug.l1 l1Var = l1VarArr2[0];
                            Objects.requireNonNull(l1Var);
                            this.f1467b.T2(true, c2Var4, h, new ug.y0(l1Var, 11));
                            return;
                        default:
                            pf.c h10 = c2Var4.h(i23, true, true);
                            ug.l1 l1Var2 = l1VarArr2[0];
                            Objects.requireNonNull(l1Var2);
                            this.f1467b.T2(false, c2Var4, h10, new ug.y0(l1Var2, 11));
                            return;
                    }
                }
            });
            i2.o1.s(R.string.Cancel, alertDialog$Builder3, null);
        } else {
            LinearLayout linearLayout3 = new LinearLayout(l7Var.getContext());
            linearLayout3.setOrientation(1);
            linearLayout3.addView(new g6(l7Var.getContext(), tL_starGiftUnique), w7.z5.t(-1, -2, 48, 0, -4, 0, 0));
            TextView textView3 = new TextView(l7Var.getContext());
            int i23 = org.telegram.ui.ActionBar.k6.f21290j5;
            org.telegram.messenger.v0.q(textView3, i23, l7Var.resourcesProvider, 1, 20.0f);
            textView3.setText(LocaleController.getString(R.string.Gift2ExportTONFragmentTitle));
            linearLayout3.addView(textView3, w7.z5.t(-1, -2, 48, 24, 4, 24, 14));
            TextView textView4 = new TextView(l7Var.getContext());
            org.telegram.ui.ActionBar.r6.W(textView4, i23, l7Var.resourcesProvider);
            textView4.setTextSize(1, 16.0f);
            tl.r(R.string.Gift2ExportTONFragmentText, new Object[]{l7Var.W1()}, textView4);
            linearLayout3.addView(textView4, w7.z5.t(-1, -2, 48, 24, 0, 24, 4));
            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(l7Var.getContext(), 0, l7Var.resourcesProvider);
            alertDialog$Builder4.o(linearLayout3);
            alertDialog$Builder4.k(LocaleController.getString(R.string.Gift2ExportTONFragmentOpen), new org.telegram.ui.ActionBar.z1(l7Var) {
                public final l7 f1467b;

                {
                    this.f1467b = l7Var;
                }

                @Override
                public final void g(org.telegram.ui.ActionBar.c2 c2Var4, int i232) {
                    switch (r3) {
                        case 0:
                            pf.c h = c2Var4.h(i232, true, true);
                            ug.l1 l1Var = l1VarArr2[0];
                            Objects.requireNonNull(l1Var);
                            this.f1467b.T2(true, c2Var4, h, new ug.y0(l1Var, 11));
                            return;
                        default:
                            pf.c h10 = c2Var4.h(i232, true, true);
                            ug.l1 l1Var2 = l1VarArr2[0];
                            Objects.requireNonNull(l1Var2);
                            this.f1467b.T2(false, c2Var4, h10, new ug.y0(l1Var2, 11));
                            return;
                    }
                }
            });
            i2.o1.s(R.string.Cancel, alertDialog$Builder4, null);
        }
    }

    public static void X(l7 l7Var, long j10, TL_stars.TL_starGiftUnique tL_starGiftUnique, ey eyVar) {
        ChatThemeController.getInstance(l7Var.currentAccount).setDialogTheme(j10, new gg.b(null, tL_starGiftUnique.slug));
        eyVar.presentFragment(sn.W9(j10), true);
    }

    public static void X0(l7 l7Var, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TL_account.tmpPassword) {
            TL_account.tmpPassword tmppassword = (TL_account.tmpPassword) tLObject;
            UserConfig.getInstance(l7Var.currentAccount).tmpPassword = tmppassword;
            UserConfig.getInstance(l7Var.currentAccount).saveConfig(false);
            l7Var.g2(tmppassword.tmp_password, twoStepVerificationActivity, z10, null);
            return;
        }
        l7Var.o2(tL_error, twoStepVerificationActivity, z10);
    }

    public static String X1(TL_stars.StarGift starGift) {
        if (starGift instanceof TL_stars.TL_starGiftUnique) {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(tL_starGiftUnique.title);
            sb2.append(" #");
            return i2.o1.m(tL_starGiftUnique.num, ',', sb2);
        } else if ((starGift instanceof TL_stars.TL_starGift) && !TextUtils.isEmpty(starGift.title)) {
            return starGift.title;
        } else {
            return LocaleController.getString(R.string.Gift2Gift);
        }
    }

    public static void Y(l7 l7Var) {
        boolean z10;
        TLRPC.Document document;
        boolean z11;
        v9 F;
        TLRPC.Message message;
        ei.d dVar = l7Var.f1730k0;
        if (!dVar.Q) {
            TL_stars.InputSavedStarGift Y1 = l7Var.Y1();
            MessageObject messageObject = l7Var.H0;
            if (messageObject != null && (message = messageObject.messageOwner) != null) {
                TLRPC.MessageAction messageAction = message.action;
                if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                    TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                    z10 = tL_messageActionStarGift.saved;
                    document = tL_messageActionStarGift.gift.getDocument();
                } else if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                    TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                    z10 = tL_messageActionStarGiftUnique.saved;
                    document = tL_messageActionStarGiftUnique.gift.getDocument();
                } else {
                    return;
                }
            } else {
                TL_stars.SavedStarGift savedStarGift = l7Var.F0;
                if (savedStarGift != null) {
                    z10 = !savedStarGift.unsaved;
                    document = savedStarGift.gift.getDocument();
                } else {
                    return;
                }
            }
            TLRPC.Document document2 = document;
            boolean z12 = z10;
            dVar.setLoading(true);
            TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
            savestargift.unsave = z12;
            savestargift.stargift = Y1;
            if (l7Var.F0 != null && (F = ha.y(l7Var.currentAccount, false).F(l7Var.X, false)) != null) {
                F.m(l7Var.F0, savestargift.unsave);
                z11 = true;
            } else {
                z11 = false;
            }
            ConnectionsManager.getInstance(l7Var.currentAccount).sendRequest(savestargift, new x4(l7Var, z11, document2, z12, savestargift));
        }
    }

    public static void Y0(ai.l7 r11, android.view.View r12) {
        throw new UnsupportedOperationException("Method not decompiled: ai.l7.Y0(ai.l7, android.view.View):void");
    }

    public static void Z(l7 l7Var) {
        int i10;
        long j10;
        long j11;
        long j12;
        String string;
        final long clientUserId = UserConfig.getInstance(l7Var.currentAccount).getClientUserId();
        final TL_stars.InputSavedStarGift Y1 = l7Var.Y1();
        if (Y1 != null) {
            MessageObject messageObject = l7Var.H0;
            if (messageObject != null) {
                i10 = messageObject.messageOwner.date;
                boolean isOutOwner = messageObject.isOutOwner();
                MessageObject messageObject2 = l7Var.H0;
                TLRPC.Message message = messageObject2.messageOwner;
                if (message != null) {
                    TLRPC.MessageAction messageAction = message.action;
                    if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                        TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                        TLRPC.Peer peer = tL_messageActionStarGift.peer;
                        if (peer != null) {
                            j12 = DialogObject.getPeerDialogId(peer);
                        } else if (isOutOwner) {
                            j12 = messageObject2.getDialogId();
                        } else {
                            j12 = clientUserId;
                        }
                        TLRPC.Peer peer2 = tL_messageActionStarGift.from_id;
                        if (peer2 != null) {
                            j10 = DialogObject.getPeerDialogId(peer2);
                        } else if (isOutOwner) {
                            j10 = clientUserId;
                        } else {
                            j10 = l7Var.H0.getDialogId();
                        }
                        j11 = tL_messageActionStarGift.convert_stars;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                TL_stars.SavedStarGift savedStarGift = l7Var.F0;
                if (savedStarGift != null) {
                    i10 = savedStarGift.date;
                    if ((savedStarGift.flags & 2) != 0 && !savedStarGift.name_hidden) {
                        j10 = DialogObject.getPeerDialogId(savedStarGift.from_id);
                    } else {
                        j10 = 2666000;
                    }
                    j11 = l7Var.F0.convert_stars;
                    j12 = l7Var.X;
                } else {
                    return;
                }
            }
            int max = Math.max(1, (MessagesController.getInstance(l7Var.currentAccount).stargiftsConvertPeriodMax - (ConnectionsManager.getInstance(l7Var.currentAccount).getCurrentTime() - i10)) / 86400);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(l7Var.getContext(), 0, l7Var.resourcesProvider);
            String string2 = LocaleController.getString(R.string.Gift2ConvertTitle);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20679a;
            c2Var.R = string2;
            if (!UserObject.isService(j10) && j10 != 2666000) {
                string = DialogObject.getShortName(j10);
            } else {
                string = LocaleController.getString(R.string.StarsTransactionHidden);
            }
            c2Var.T = AndroidUtilities.replaceTags(LocaleController.formatPluralString("Gift2ConvertText2", max, string, LocaleController.formatPluralStringComma("Gift2ConvertStars", (int) j11)));
            final long j13 = j11;
            final long j14 = j12;
            alertDialog$Builder.k(LocaleController.getString(R.string.Gift2ConvertButton), new org.telegram.ui.ActionBar.z1() {
                @Override
                public final void g(org.telegram.ui.ActionBar.c2 c2Var2, int i11) {
                    l7.r0(l7.this, Y1, j14, clientUserId, j13);
                }
            });
            i2.o1.s(R.string.Cancel, alertDialog$Builder, null);
        }
    }

    public static void Z0(l7 l7Var, TL_stars.StarGift starGift, TL_stars.StarGiftAttribute starGiftAttribute, org.telegram.ui.Components.xc[] xcVarArr, boolean[] zArr, ArrayList arrayList) {
        if (arrayList != null) {
            new a2(l7Var.getContext(), l7Var.resourcesProvider, l7Var.currentAccount, starGift.title, arrayList, false).show();
        } else {
            l7Var.R2(xcVarArr[0], LocaleController.formatString(R.string.Gift2RarityHint, gi.l.H0(starGiftAttribute.getRarityPermille())), false);
        }
        zArr[0] = false;
    }

    public static void a0(l7 l7Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.PaymentForm paymentForm, TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails, long j10, CharSequence charSequence, org.telegram.ui.ActionBar.c2 c2Var) {
        pf.c h = c2Var.h(-1, true, true);
        h.d();
        TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
        tL_payments_sendStarsForm.form_id = paymentForm.form_id;
        tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftDropOriginalDetails;
        ConnectionsManager.getInstance(l7Var.currentAccount).sendRequest(tL_payments_sendStarsForm, new l4(l7Var, h, c2Var, tL_starGiftUnique, j10, charSequence));
    }

    public static void a1(l7 l7Var, long j10, long j11, Utilities.Callback callback) {
        dd ddVar = new dd(l7Var.getContext(), l7Var.resourcesProvider, j10, 11, null, new c3(l7Var, new boolean[]{false}, j11, callback, 2), 0L);
        ddVar.setOnDismissListener(new n4(l7Var, 1));
        ddVar.show();
    }

    public static void b0(l7 l7Var, String str) {
        long j10 = l7Var.X;
        l7Var.f1730k0.setLoading(false);
        if (!TextUtils.isEmpty(str)) {
            l7Var.dismiss();
            org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
            if (R == null) {
                return;
            }
            if (R instanceof sn) {
                sn snVar = (sn) R;
                if (snVar.a() == j10) {
                    org.telegram.ui.Components.vc.a0(snVar).M(LocaleController.getString(R.string.StarsGiftUpgradeCompleted), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StarsGiftUpgradeCompletedText, DialogObject.getShortName(j10))), R.raw.gift).k(true);
                    return;
                }
            }
            NotificationCenter notificationCenter = NotificationCenter.getInstance(l7Var.currentAccount);
            int i10 = NotificationCenter.closeProfileActivity;
            Long valueOf = Long.valueOf(j10);
            Boolean bool = Boolean.FALSE;
            notificationCenter.lambda$postNotificationNameOnUIThread$1(i10, valueOf, bool);
            NotificationCenter.getInstance(l7Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChatActivity, Long.valueOf(j10), bool);
            sn W9 = sn.W9(j10);
            W9.whenFullyVisible(new a1.f(21, l7Var, W9));
            R.presentFragment(W9);
            return;
        }
        l7Var.U2(0, true, null);
    }

    public static void b1(l7 l7Var, TLObject tLObject, ug.l1[] l1VarArr, Long l4, a3.l0 l0Var, TLRPC.TL_error tL_error) {
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        if (tLObject instanceof TLRPC.TL_users_userFull) {
            TLRPC.TL_users_userFull tL_users_userFull = (TLRPC.TL_users_userFull) tLObject;
            MessagesController.getInstance(l7Var.currentAccount).putUsers(tL_users_userFull.users, false);
            MessagesController.getInstance(l7Var.currentAccount).putChats(tL_users_userFull.chats, false);
            TLRPC.UserFull userFull = tL_users_userFull.full_user;
            if (userFull != null && (disallowedGiftsSettings = userFull.disallowed_stargifts) != null && disallowedGiftsSettings.disallow_unique_stargifts) {
                new org.telegram.ui.Components.vc(l1VarArr[0].container, l7Var.resourcesProvider).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(l4.longValue())))).j();
                return;
            } else {
                l0Var.run();
                return;
            }
        }
        org.telegram.ui.Components.oc Y = l7Var.getBulletinFactory().Y(tL_error);
        Y.f29213t = true;
        Y.j();
    }

    public static void c0(l7 l7Var) {
        TLRPC.Message message;
        TL_stars.InputSavedStarGift Y1 = l7Var.Y1();
        if (Y1 != null) {
            long clientUserId = UserConfig.getInstance(l7Var.currentAccount).getClientUserId();
            MessageObject messageObject = l7Var.H0;
            if (messageObject != null && (message = messageObject.messageOwner) != null) {
                TLRPC.MessageAction messageAction = message.action;
                if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                    TLRPC.Peer peer = ((TLRPC.TL_messageActionStarGift) messageAction).peer;
                    if (peer != null) {
                        clientUserId = DialogObject.getPeerDialogId(peer);
                    }
                    long j10 = clientUserId;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(l7Var.getContext(), 0, l7Var.resourcesProvider);
                    alertDialog$Builder.f20679a.R = LocaleController.getString(R.string.Gift2DeleteOption);
                    alertDialog$Builder.f20679a.T = LocaleController.getString(R.string.Gift2DeleteText);
                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new f(l7Var, Y1, j10, 1));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    alertDialog$Builder.d(-1);
                    alertDialog$Builder.p();
                }
            }
            if (l7Var.F0 != null) {
                clientUserId = l7Var.X;
                long j102 = clientUserId;
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(l7Var.getContext(), 0, l7Var.resourcesProvider);
                alertDialog$Builder2.f20679a.R = LocaleController.getString(R.string.Gift2DeleteOption);
                alertDialog$Builder2.f20679a.T = LocaleController.getString(R.string.Gift2DeleteText);
                alertDialog$Builder2.k(LocaleController.getString(R.string.Delete), new f(l7Var, Y1, j102, 1));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder2.d(-1);
                alertDialog$Builder2.p();
            }
        }
    }

    public static void c1(l7 l7Var, String str, long j10) {
        org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
        if (R == 0) {
            return;
        }
        ?? obj = new Object();
        obj.f21637a = true;
        yh.g4 g4Var = new yh.g4(l7Var.X, str, j10, l7Var.resourcesProvider);
        g4Var.e = new d4(l7Var, 0);
        R.showAsSheet(g4Var, obj);
    }

    public static void d1(l7 l7Var, ug.l1[] l1VarArr, Long l4) {
        if (l4.longValue() == -97) {
            ug.l1 l1Var = l1VarArr[0];
            TL_stars.TL_starGiftUnique e22 = l7Var.e2();
            if (l7Var.f1721f1 != null && e22 != null && !TextUtils.isEmpty(e22.slug)) {
                long clientUserId = UserConfig.getInstance(l7Var.currentAccount).getClientUserId();
                TextView textView = new TextView(l7Var.getContext());
                textView.setTextSize(1, 13.0f);
                int i10 = org.telegram.ui.ActionBar.k6.f21440r5;
                org.telegram.ui.ActionBar.r6.W(textView, i10, l7Var.resourcesProvider);
                textView.setGravity(17);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" ");
                spannableStringBuilder.setSpan(new ba0(AndroidUtilities.dp(160.0f), textView), 0, spannableStringBuilder.length(), 33);
                textView.setText(spannableStringBuilder);
                TL_stars.starGiftDepositPayload[] stargiftdepositpayloadArr = new TL_stars.starGiftDepositPayload[1];
                Runnable[] runnableArr = new Runnable[1];
                boolean[] zArr = new boolean[1];
                TL_stars.depositStarGift depositstargift = new TL_stars.depositStarGift();
                depositstargift.peer = MessagesController.getInstance(l7Var.currentAccount).getInputPeer(clientUserId);
                depositstargift.slug = e22.slug;
                ConnectionsManager.getInstance(l7Var.currentAccount).sendRequestTyped(depositstargift, new Object(), new x3(l7Var, zArr, textView, stargiftdepositpayloadArr, runnableArr, 0));
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(l7Var.getContext(), 0, l7Var.resourcesProvider);
                alertDialog$Builder.f20679a.R = LocaleController.getString(R.string.Gift2MoveToMyGifts);
                alertDialog$Builder.f20679a.T = LocaleController.getString(R.string.Gift2MoveToMyGiftsText);
                TLRPC.User currentUser = UserConfig.getInstance(l7Var.currentAccount).getCurrentUser();
                LinearLayout linearLayout = new LinearLayout(l7Var.getContext());
                linearLayout.setOrientation(1);
                FrameLayout frameLayout = new FrameLayout(l7Var.getContext());
                int dp = AndroidUtilities.dp(20.0f);
                int i11 = org.telegram.ui.ActionBar.k6.f21290j5;
                ShapeDrawable c02 = org.telegram.ui.ActionBar.k6.c0(dp, org.telegram.ui.ActionBar.k6.o1(0.045f, org.telegram.ui.ActionBar.k6.w0(i11, l7Var.resourcesProvider)));
                org.telegram.ui.ActionBar.n6 M = org.telegram.ui.ActionBar.r6.M(0.045f, i11);
                org.telegram.ui.ActionBar.g6 g6Var = l7Var.resourcesProvider;
                frameLayout.setBackground(c02);
                org.telegram.ui.ActionBar.r6.k(frameLayout, c02, M, null, g6Var);
                org.telegram.ui.Components.u9 u9Var = new org.telegram.ui.Components.u9(l7Var.getContext());
                u9Var.setRoundRadius(AndroidUtilities.dp(21.0f));
                org.telegram.ui.Components.f9 f9Var = new org.telegram.ui.Components.f9((org.telegram.ui.ActionBar.g6) null);
                f9Var.r(currentUser);
                u9Var.e(currentUser, f9Var);
                frameLayout.addView(u9Var, w7.z5.d(42, 42.0f, 19, 12.0f, 0.0f, 0.0f, 0.0f));
                TextView textView2 = new TextView(l7Var.getContext());
                com.google.android.gms.internal.play_billing.k3.m(16.0f, 1, textView2);
                org.telegram.ui.ActionBar.r6.W(textView2, i11, l7Var.resourcesProvider);
                textView2.setSingleLine();
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                textView2.setEllipsize(truncateAt);
                textView2.setText(Emoji.replaceEmoji(UserObject.getUserName(currentUser), textView2.getPaint().getFontMetricsInt(), false));
                frameLayout.addView(textView2, w7.z5.d(-1, -2.0f, 51, 66.0f, 11.0f, 12.0f, 0.0f));
                TextView textView3 = new TextView(l7Var.getContext());
                textView3.setTextSize(1, 14.0f);
                org.telegram.ui.ActionBar.r6.W(textView3, i10, l7Var.resourcesProvider);
                textView3.setSingleLine();
                textView3.setEllipsize(truncateAt);
                if (currentUser != null && !TextUtils.isEmpty(currentUser.phone)) {
                    jf.b c10 = jf.b.c();
                    textView3.setText(c10.b("+" + currentUser.phone));
                } else if (currentUser != null && UserObject.getPublicUsername(currentUser) != null) {
                    textView3.setText("@" + UserObject.getPublicUsername(currentUser));
                }
                frameLayout.addView(textView3, w7.z5.d(-1, -2.0f, 51, 66.0f, 33.0f, 12.0f, 0.0f));
                linearLayout.addView(frameLayout, w7.z5.k(20.0f, 0.0f, 20.0f, 16.0f, -1, 62));
                TextView textView4 = new TextView(l7Var.getContext());
                textView4.setTextSize(1, 15.0f);
                org.telegram.ui.ActionBar.r6.W(textView4, i11, l7Var.resourcesProvider);
                textView4.setGravity(17);
                textView4.setText(LocaleController.getString(R.string.Gift2MoveAppearIn));
                linearLayout.addView(textView4, w7.z5.k(24.0f, 0.0f, 24.0f, 0.0f, -1, -2));
                LinearLayout linearLayout2 = new LinearLayout(l7Var.getContext());
                linearLayout2.setOrientation(0);
                linearLayout2.setGravity(16);
                l7Var.I1(linearLayout2, R.drawable.msg_openprofile, 14, i10, LocaleController.getString(R.string.MyProfile), true);
                l7Var.I1(linearLayout2, R.drawable.menu_gift, 14, i10, LocaleController.getString(R.string.ProfileGifts), false);
                linearLayout.addView(linearLayout2, w7.z5.t(-2, -2, 1, 0, 7, 0, 3));
                linearLayout.addView(textView, w7.z5.k(24.0f, 4.0f, 24.0f, 4.0f, -1, -2));
                alertDialog$Builder.o(linearLayout);
                alertDialog$Builder.f20679a.G = 20;
                alertDialog$Builder.k(LocaleController.getString(R.string.Gift2Move), new y3(l7Var, clientUserId, stargiftdepositpayloadArr, l1Var, 0));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                z3 z3Var = new z3(0, zArr, runnableArr);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20679a;
                c2Var.setOnDismissListener(z3Var);
                c2Var.show();
            }
        } else if (l4.longValue() != -99 && l4.longValue() != -98) {
            l7Var.x2(l4.longValue(), 0L, false, new h3(l7Var, l4, l1VarArr, 1));
        }
    }

    public static String d2(TL_stars.StarGiftAttributeRarity starGiftAttributeRarity, Integer[] numArr) {
        if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityUncommon) {
            numArr[0] = -12539616;
            return LocaleController.getString(R.string.GiftRarityUncommon);
        } else if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityRare) {
            numArr[0] = -15619394;
            return LocaleController.getString(R.string.GiftRarityRare);
        } else if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityEpic) {
            numArr[0] = -6988581;
            return LocaleController.getString(R.string.GiftRarityEpic);
        } else if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityLegendary) {
            numArr[0] = -4229632;
            return LocaleController.getString(R.string.GiftRarityLegendary);
        } else if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarity) {
            int i10 = ((TL_stars.TL_starGiftAttributeRarity) starGiftAttributeRarity).permille;
            if (i10 <= 0) {
                return "<0.1%";
            }
            return gi.l.H0(i10);
        } else {
            return "";
        }
    }

    public static void e0(l7 l7Var, int i10, TLObject tLObject) {
        MessageObject messageObject;
        if (tLObject instanceof TLRPC.messages_Messages) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            for (int i11 = 0; i11 < messages_messages.messages.size(); i11++) {
                TLRPC.Message message = messages_messages.messages.get(i11);
                if (message != null && message.f20365id == i10) {
                    TLRPC.MessageAction messageAction = message.action;
                    if ((messageAction instanceof TLRPC.TL_messageActionStarGift) || (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                        messageObject = new MessageObject(l7Var.currentAccount, message, false, false);
                        messageObject.setType();
                        break;
                    }
                }
            }
        }
        messageObject = null;
        if (messageObject != null) {
            AndroidUtilities.runOnUIThread(new a3.l0(l7Var, tLObject, messageObject, 6));
        }
    }

    public static void e1(l7 l7Var, TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift) {
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) tL_payments_uniqueStarGift.gift;
        l7Var.J0 = tL_starGiftUnique;
        l7Var.M2(tL_starGiftUnique, false, null, null);
        super.show();
    }

    public static void f0(l7 l7Var, pf.c cVar, ug.l1 l1Var, String str) {
        org.telegram.ui.Components.vc bulletinFactory;
        cVar.b();
        if (str != null) {
            if (l1Var != null) {
                bulletinFactory = new org.telegram.ui.Components.vc(l1Var.container, l7Var.resourcesProvider);
            } else {
                bulletinFactory = l7Var.getBulletinFactory();
            }
            bulletinFactory.e0(str, false);
            return;
        }
        if (l1Var != null) {
            l1Var.dismiss();
        }
        l7Var.dismiss();
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        if (U instanceof org.telegram.ui.Wallet.o5) {
            ((org.telegram.ui.Wallet.o5) U).J0();
        }
    }

    public static void f1(l7 l7Var, org.telegram.ui.ActionBar.c2 c2Var, MessageObject messageObject) {
        c2Var.dismiss();
        l7Var.M0 = true;
        l7Var.K2(messageObject, null);
        super.show();
    }

    public static void g0(l7 l7Var, Utilities.Callback2 callback2, ArrayList arrayList, Runnable runnable, TLRPC.Updates updates, TLRPC.TL_error tL_error) {
        AlertDialog$Builder alertDialog$Builder;
        int i10;
        MessageObject messageObject;
        if (updates != null) {
            ArrayList findUpdates = MessagesController.findUpdates(updates, TL_update.TL_updateNewMessage.class);
            int size = findUpdates.size();
            int i11 = 0;
            while (true) {
                if (i11 < size) {
                    Object obj = findUpdates.get(i11);
                    i11++;
                    TLRPC.Message message = ((TL_update.TL_updateNewMessage) obj).message;
                    if (message != null && (message.action instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                        messageObject = new MessageObject(l7Var.currentAccount, message, false, false);
                        break;
                    }
                } else {
                    messageObject = null;
                    break;
                }
            }
            MessagesController.getInstance(l7Var.currentAccount).lambda$processUpdates$377(updates, false);
            if (messageObject != null) {
                TL_stars.StarGift starGift = ((TLRPC.TL_messageActionStarGiftUnique) messageObject.messageOwner.action).gift;
                callback2.run(starGift, new y0(l7Var, messageObject, arrayList, starGift, 2));
                return;
            }
            callback2.run(null, null);
            ha.y(l7Var.currentAccount, false).P();
            y9 G = ha.y(l7Var.currentAccount, false).G(UserConfig.getInstance(l7Var.currentAccount).getClientUserId(), false);
            if (G != null) {
                G.k(arrayList, null);
            }
        } else if (tL_error != null) {
            if ("STARGIFT_CRAFT_UNAVAILABLE".equalsIgnoreCase(tL_error.text)) {
                alertDialog$Builder = new AlertDialog$Builder(l7Var.getContext(), 0, new ci.b());
                String string = LocaleController.getString(R.string.GiftCraftUnavailableTitle);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20679a;
                c2Var.R = string;
                c2Var.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.GiftCraftUnavailableText));
                i10 = R.string.OK;
            } else {
                String str = tL_error.text;
                if (str != null && str.startsWith("STARGIFT_CRAFT_TOO_EARLY_")) {
                    long parseLong = Long.parseLong(tL_error.text.substring(25)) + ConnectionsManager.getInstance(l7Var.currentAccount).getCurrentTime();
                    alertDialog$Builder = new AlertDialog$Builder(l7Var.getContext(), 0, new ci.b());
                    String string2 = LocaleController.getString(R.string.GiftCraftUnavailableTitle);
                    org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder.f20679a;
                    c2Var2.R = string2;
                    c2Var2.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCraftUnavailableTextTime, LocaleController.formatDateTime(parseLong, true)));
                    i10 = R.string.OK;
                } else {
                    l7Var.getBulletinFactory().f0(tL_error, false);
                    runnable.run();
                }
            }
            org.telegram.messenger.v0.o(i10, alertDialog$Builder, null);
            runnable.run();
        }
    }

    public static void g1(l7 l7Var) {
        Bundle bundle = new Bundle();
        long j10 = l7Var.X;
        if (j10 >= 0) {
            bundle.putLong("user_id", j10);
        } else {
            bundle.putLong("chat_id", -j10);
        }
        if (j10 == UserConfig.getInstance(l7Var.currentAccount).getClientUserId()) {
            bundle.putBoolean("my_profile", true);
        }
        bundle.putBoolean("open_gifts", true);
        bundle.putBoolean("open_gifts_upgradable", true);
        D2(new ProfileActivity(bundle, null));
    }

    public static void h0(l7 l7Var, pf.c cVar, ug.l1 l1Var, String str) {
        org.telegram.ui.Components.vc bulletinFactory;
        cVar.c(false);
        if (!TextUtils.isEmpty(str)) {
            if (l1Var != null) {
                bulletinFactory = new org.telegram.ui.Components.vc(l1Var.container, l7Var.resourcesProvider);
            } else {
                bulletinFactory = l7Var.getBulletinFactory();
            }
            bulletinFactory.e0(str, false);
        }
    }

    public static void h1(l7 l7Var, String str) {
        Context context = l7Var.getContext();
        pf.d.t(context, MessagesController.getInstance(l7Var.currentAccount).tonBlockchainExplorerUrl + str);
    }

    public static boolean h2(int i10, long j10) {
        if (j10 >= 0) {
            if (UserConfig.getInstance(i10).getClientUserId() == j10) {
                return true;
            }
            return false;
        }
        return ChatObject.canUserDoAction(MessagesController.getInstance(i10).getChat(Long.valueOf(-j10)), 5);
    }

    public static void i0(l7 l7Var, ArrayList arrayList, Utilities.Callback2 callback2, Runnable runnable) {
        yh.e4 e4Var = l7Var.W0;
        if (e4Var != null) {
            e4Var.b();
            l7Var.W0 = null;
        }
        TL_stars.craftStarGift craftstargift = new TL_stars.craftStarGift();
        int size = arrayList.size();
        int i10 = 0;
        while (i10 < size) {
            Object obj = arrayList.get(i10);
            i10++;
            TL_stars.TL_inputSavedStarGiftSlug tL_inputSavedStarGiftSlug = new TL_stars.TL_inputSavedStarGiftSlug();
            tL_inputSavedStarGiftSlug.slug = ((TL_stars.StarGift) obj).slug;
            craftstargift.stargift.add(tL_inputSavedStarGiftSlug);
        }
        ConnectionsManager.getInstance(l7Var.currentAccount).sendRequestTyped(craftstargift, new Object(), new w2(l7Var, callback2, arrayList, runnable, 0));
    }

    public static void i1(l7 l7Var, boolean[] zArr, TL_stars.StarGiftAttribute starGiftAttribute, org.telegram.ui.Components.xc[] xcVarArr) {
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        TL_stars.StarGift V1 = l7Var.V1();
        GiftAuctionController.getInstance(l7Var.currentAccount).requestAuctionUpgrades(V1.gift_id, new f3(l7Var, V1, starGiftAttribute, xcVarArr, zArr, 0));
    }

    public static boolean i2(int i10, long j10) {
        if (j10 >= 0) {
            if (UserConfig.getInstance(i10).getClientUserId() != j10) {
                return false;
            }
            return true;
        }
        TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
        if (chat == null || !chat.creator) {
            return false;
        }
        return true;
    }

    public static void j0(l7 l7Var, String str) {
        l7Var.dismiss();
        Context context = l7Var.getContext();
        pf.d.r(context, "https://" + MessagesController.getInstance(l7Var.currentAccount).linkPrefix + "/" + str);
    }

    public static void j1(l7 l7Var) {
        final boolean z10;
        TLRPC.InputPeer inputPeer;
        final TL_stars.TL_starGiftUnique e22 = l7Var.e2();
        if (e22 != null && !TextUtils.isEmpty(e22.slug)) {
            if (e22.host_id == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (l7Var.f1753w1 == null) {
                l7Var.f1753w1 = Boolean.valueOf(!z10);
            }
            l7Var.O2(e22, z10);
            final int i10 = l7Var.f1751v1 + 1;
            l7Var.f1751v1 = i10;
            TL_stars.displayStarGift displaystargift = new TL_stars.displayStarGift();
            if (z10) {
                inputPeer = MessagesController.getInstance(l7Var.currentAccount).getInputPeer(UserConfig.getInstance(l7Var.currentAccount).getClientUserId());
            } else {
                inputPeer = null;
            }
            displaystargift.peer = inputPeer;
            displaystargift.slug = e22.slug;
            ConnectionsManager.getInstance(l7Var.currentAccount).sendRequestTyped(displaystargift, new Object(), new Utilities.Callback2() {
                @Override
                public final void run(Object obj, Object obj2) {
                    String str;
                    TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                    boolean z11 = ((TLRPC.Bool) obj) instanceof TLRPC.TL_boolTrue;
                    l7 l7Var2 = l7.this;
                    if (z11) {
                        l7Var2.f1753w1 = Boolean.valueOf(z10);
                        return;
                    }
                    if (i10 != l7Var2.f1751v1) {
                        return;
                    }
                    l7Var2.O2(e22, l7Var2.f1753w1.booleanValue());
                    org.telegram.ui.Components.vc bulletinFactory = l7Var2.getBulletinFactory();
                    if (tL_error != null) {
                        str = tL_error.text;
                    } else {
                        str = "NULL_ERROR";
                    }
                    bulletinFactory.e0(str, false);
                }
            });
        }
    }

    public static boolean j2(int i10, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        if (tL_starGiftUnique == null) {
            return false;
        }
        TLRPC.Peer peer = tL_starGiftUnique.owner_id;
        if (peer == null) {
            peer = tL_starGiftUnique.host_id;
        }
        long peerDialogId = DialogObject.getPeerDialogId(peer);
        int i11 = (peerDialogId > 0L ? 1 : (peerDialogId == 0L ? 0 : -1));
        if (i11 == 0) {
            return false;
        }
        if (i11 > 0) {
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(peerDialogId));
            if (user != null) {
                TLRPC.EmojiStatus emojiStatus = user.emoji_status;
                if (!(emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) || ((TLRPC.TL_emojiStatusCollectible) emojiStatus).collectible_id != tL_starGiftUnique.f20568id) {
                    return false;
                }
                return true;
            }
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-peerDialogId));
            if (chat != null) {
                TLRPC.EmojiStatus emojiStatus2 = chat.emoji_status;
                if ((emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible) && ((TLRPC.TL_emojiStatusCollectible) emojiStatus2).collectible_id == tL_starGiftUnique.f20568id) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void k0(l7 l7Var, TLObject tLObject, long j10, long j11, Utilities.Callback callback, TLRPC.TL_error tL_error, long j12) {
        if (tLObject instanceof TLRPC.TL_payments_paymentResult) {
            TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) tLObject;
            MessagesController.getInstance(l7Var.currentAccount).putUsers(tL_payments_paymentResult.updates.users, false);
            MessagesController.getInstance(l7Var.currentAccount).putChats(tL_payments_paymentResult.updates.chats, false);
            ha.y(l7Var.currentAccount, false).T(false);
            ha.y(l7Var.currentAccount, false).Q(j10);
            ha.y(l7Var.currentAccount, false).Q(j11);
            ha.y(l7Var.currentAccount, false).P();
            callback.run(null);
            org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
            if (U != null) {
                if (j10 >= 0 && j11 >= 0) {
                    sn W9 = sn.W9(j10);
                    W9.whenFullyVisible(new w3(l7Var, W9, j10, 1));
                    U.presentFragment(W9);
                } else {
                    org.telegram.ui.Components.oc M = org.telegram.ui.Components.vc.a0(U).M(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, l7Var.W1(), DialogObject.getShortName(j10))), R.raw.forward);
                    M.f29213t = true;
                    M.j();
                }
            }
            Utilities.stageQueue.postRunnable(new h4(l7Var, tL_payments_paymentResult, 1));
        } else if (tL_error != null && "BALANCE_TOO_LOW".equals(tL_error.text)) {
            if (!MessagesController.getInstance(l7Var.currentAccount).starsPurchaseAvailable()) {
                l7Var.f1730k0.setLoading(false);
                ha.e0(l7Var.getContext(), l7Var.resourcesProvider);
                return;
            }
            ha y3 = ha.y(l7Var.currentAccount, false);
            a3.h0 h0Var = new a3.h0(l7Var, j12, j10, callback, 1);
            y3.e = false;
            y3.q(false, true, h0Var);
            y3.e = true;
        } else {
            callback.run(tL_error);
            l7Var.getBulletinFactory().f0(tL_error, false);
        }
    }

    public static void k1(l7 l7Var, org.telegram.ui.ActionBar.c2 c2Var, TLObject tLObject, long j10, long j11, long j12, TLRPC.TL_error tL_error) {
        c2Var.c(400L);
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        if (U == null) {
            return;
        }
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            l7Var.dismiss();
            ha.y(l7Var.currentAccount, false).Q(j10);
            if (j10 >= 0) {
                TLRPC.UserFull userFull = MessagesController.getInstance(l7Var.currentAccount).getUserFull(j11);
                if (userFull != null) {
                    int max = Math.max(0, userFull.stargifts_count - 1);
                    userFull.stargifts_count = max;
                    if (max <= 0) {
                        userFull.flags2 &= -257;
                    }
                }
                ha.y(l7Var.currentAccount, false).P();
                ha.y(l7Var.currentAccount, false).T(true);
                if (!(U instanceof nd)) {
                    nd ndVar = new nd();
                    ndVar.whenFullyVisible(new v3(ndVar, j12, 0));
                    U.presentFragment(ndVar);
                    return;
                }
                org.telegram.ui.Components.vc.a0(U).M(LocaleController.getString(R.string.Gift2ConvertedTitle), LocaleController.formatPluralStringComma("Gift2Converted", (int) j12), R.raw.stars_topup).k(true);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -j10);
            bundle.putBoolean("start_from_monetization", true);
            t91 t91Var = new t91(bundle);
            k0.g(l7Var.currentAccount).h(j10, true);
            k0.g(l7Var.currentAccount).l(j10);
            t91Var.whenFullyVisible(new v3(t91Var, j12, 1));
            U.presentFragment(t91Var);
        } else if (tL_error != null) {
            l7Var.getBulletinFactory().t(LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text), null).k(false);
        } else {
            l7Var.getBulletinFactory().t(LocaleController.getString(R.string.UnknownError), null).k(false);
        }
    }

    public static void l0(l7 l7Var, String str) {
        Context context = l7Var.getContext();
        pf.d.t(context, MessagesController.getInstance(l7Var.currentAccount).tonBlockchainExplorerUrl + str);
    }

    public static void l1(l7 l7Var, TLObject tLObject, a3.l0 l0Var, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.TL_messages_chatFull) {
            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject;
            MessagesController.getInstance(l7Var.currentAccount).putUsers(tL_messages_chatFull.users, false);
            MessagesController.getInstance(l7Var.currentAccount).putChats(tL_messages_chatFull.chats, false);
            MessagesController.getInstance(l7Var.currentAccount).putChatFull(tL_messages_chatFull.full_chat);
            if (!tL_messages_chatFull.full_chat.stargifts_available) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(l7Var.getContext(), 0, l7Var.resourcesProvider);
                alertDialog$Builder.f20679a.R = LocaleController.getString(R.string.Gift2ChannelDoesntSupportGiftsTitle);
                alertDialog$Builder.f20679a.T = LocaleController.getString(R.string.Gift2ChannelDoesntSupportGiftsText);
                org.telegram.messenger.v0.o(R.string.OK, alertDialog$Builder, null);
                return;
            }
            l0Var.run();
            return;
        }
        org.telegram.ui.Components.oc Y = l7Var.getBulletinFactory().Y(tL_error);
        Y.f29213t = true;
        Y.j();
    }

    public static void m1(l7 l7Var, pf.c cVar, TLObject tLObject, long j10, TLRPC.TL_error tL_error) {
        boolean z10;
        cVar.c(false);
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            if (j10 >= 0) {
                TLRPC.UserFull userFull = MessagesController.getInstance(l7Var.currentAccount).getUserFull(j10);
                if (userFull != null) {
                    int max = Math.max(0, userFull.stargifts_count - 1);
                    userFull.stargifts_count = max;
                    if (max <= 0) {
                        userFull.flags2 &= -257;
                    }
                }
            } else {
                TLRPC.ChatFull chatFull = MessagesController.getInstance(l7Var.currentAccount).getChatFull(-j10);
                if (chatFull != null) {
                    int max2 = Math.max(0, chatFull.stargifts_count - 1);
                    chatFull.stargifts_count = max2;
                    if (max2 <= 0) {
                        chatFull.flags2 &= -262145;
                    }
                }
            }
            if (l7Var.F0 != null) {
                ha y3 = ha.y(l7Var.currentAccount, false);
                TL_stars.SavedStarGift savedStarGift = l7Var.F0;
                if (savedStarGift != null) {
                    y9 G = y3.G(j10, false);
                    if (G != null) {
                        G.l(savedStarGift);
                    }
                    v9 v9Var = (v9) y3.K.get(j10);
                    if (v9Var != null) {
                        ArrayList arrayList = v9Var.e;
                        int size = arrayList.size();
                        boolean z11 = false;
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj = arrayList.get(i10);
                            i10++;
                            TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                            y9 e = v9Var.e(tL_starGiftCollection.collection_id);
                            if (e != null && e.l(savedStarGift)) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            if (z10 || savedStarGift.collection_id.contains(Integer.valueOf(tL_starGiftCollection.collection_id))) {
                                tL_starGiftCollection.gifts_count = Math.max(0, tL_starGiftCollection.gifts_count - 1);
                                z11 = true;
                            }
                            if (z10) {
                                v9Var.n(tL_starGiftCollection.collection_id);
                            }
                        }
                        y9 y9Var = v9Var.f2323g;
                        if (y9Var != null) {
                            y9Var.l(savedStarGift);
                        }
                        if (z11) {
                            v9Var.j();
                            NotificationCenter.getInstance(v9Var.f2319a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(v9Var.f2320b), v9Var);
                        }
                    }
                }
            } else {
                ha.y(l7Var.currentAccount, false).Q(j10);
            }
            l7Var.dismiss();
            AndroidUtilities.runOnUIThread(new ah.j(1));
        } else if (tL_error != null) {
            l7Var.getBulletinFactory().f0(tL_error, false);
        } else {
            l7Var.getBulletinFactory().t(LocaleController.getString(R.string.UnknownError), null).k(false);
        }
    }

    public static void n0(l7 l7Var, pf.c cVar, ug.l1 l1Var, u3 u3Var, TL_stars.starGiftDepositPayload stargiftdepositpayload, TLRPC.TL_error tL_error) {
        org.telegram.ui.Components.vc bulletinFactory;
        if (stargiftdepositpayload == null) {
            cVar.b();
            if (l1Var != null) {
                bulletinFactory = new org.telegram.ui.Components.vc(l1Var.container, l7Var.resourcesProvider);
            } else {
                bulletinFactory = l7Var.getBulletinFactory();
            }
            bulletinFactory.f0(tL_error, false);
            return;
        }
        u3Var.run(stargiftdepositpayload);
    }

    public static void n1(l7 l7Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, final String str) {
        final long j10 = tL_starGiftUnique.gift_id;
        final String str2 = tL_starGiftUnique.title;
        final String W1 = l7Var.W1();
        final TLRPC.Document document = tL_starGiftUnique.getDocument();
        String str3 = tL_starGiftUnique.slug;
        final org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(ApplicationLoader.applicationContext, 3, null);
        c2Var.r(500L);
        TL_stars.getUniqueStarGiftValueInfo getuniquestargiftvalueinfo = new TL_stars.getUniqueStarGiftValueInfo();
        getuniquestargiftvalueinfo.slug = str3;
        ConnectionsManager.getInstance(l7Var.currentAccount).sendRequest(getuniquestargiftvalueinfo, new RequestDelegate() {
            @Override
            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                final l7 l7Var2 = l7.this;
                final org.telegram.ui.ActionBar.c2 c2Var2 = c2Var;
                final TLRPC.Document document2 = document;
                final String str4 = str;
                final String str5 = str2;
                final String str6 = W1;
                final long j11 = j10;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        l7.o0(l7.this, c2Var2, tLObject, document2, str4, str5, str6, j11, tL_error);
                    }
                });
            }
        });
    }

    public static void o0(l7 l7Var, org.telegram.ui.ActionBar.c2 c2Var, TLObject tLObject, TLRPC.Document document, String str, String str2, String str3, long j10, TLRPC.TL_error tL_error) {
        n01 n01Var;
        LinearLayout linearLayout;
        CharSequence charSequence;
        float f7;
        float f10;
        int round;
        c2Var.dismiss();
        if (tLObject instanceof TL_stars.UniqueStarGiftValueInfo) {
            TL_stars.UniqueStarGiftValueInfo uniqueStarGiftValueInfo = (TL_stars.UniqueStarGiftValueInfo) tLObject;
            org.telegram.ui.ActionBar.h3 j11 = tl.j(1, l7Var.getContext(), l7Var.resourcesProvider, false);
            LinearLayout linearLayout2 = new LinearLayout(l7Var.getContext());
            linearLayout2.setOrientation(1);
            linearLayout2.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
            linearLayout2.setClipChildren(false);
            linearLayout2.setClipToPadding(false);
            org.telegram.ui.Components.u9 u9Var = new org.telegram.ui.Components.u9(l7Var.getContext());
            nd.a1(u9Var.getImageReceiver(), document, 160);
            linearLayout2.addView(u9Var, w7.z5.t(160, 160, 1, 0, 0, 0, 0));
            TextView textView = new TextView(l7Var.getContext());
            textView.setTextSize(1, 20.0f);
            org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.Sh, l7Var.resourcesProvider);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
            int dp = AndroidUtilities.dp(21.0f);
            int i10 = org.telegram.ui.ActionBar.k6.Oh;
            ShapeDrawable c02 = org.telegram.ui.ActionBar.k6.c0(dp, org.telegram.ui.ActionBar.k6.w0(i10, l7Var.resourcesProvider));
            org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i10);
            org.telegram.ui.ActionBar.g6 g6Var = l7Var.resourcesProvider;
            textView.setBackground(c02);
            org.telegram.ui.ActionBar.r6.k(textView, c02, O, null, g6Var);
            textView.setGravity(17);
            linearLayout2.addView(textView, w7.z5.t(-2, 42, 1, 0, 12, 0, 15));
            textView.setText(str);
            TextView textView2 = new TextView(l7Var.getContext());
            textView2.setTextSize(1, 14.0f);
            org.telegram.ui.ActionBar.r6.W(textView2, org.telegram.ui.ActionBar.k6.f21290j5, l7Var.resourcesProvider);
            textView2.setGravity(17);
            linearLayout2.addView(textView2, w7.z5.t(-2, -2, 1, 16, 0, 16, 19));
            if (uniqueStarGiftValueInfo.value_is_average) {
                tl.r(R.string.GiftValueAverage, new Object[]{str2}, textView2);
            } else if (uniqueStarGiftValueInfo.last_sale_on_fragment) {
                tl.r(R.string.GiftValueLastFragment, new Object[]{str3}, textView2);
            } else {
                tl.r(R.string.GiftValueLastTelegram, new Object[]{str3}, textView2);
            }
            FrameLayout frameLayout = new FrameLayout(l7Var.getContext());
            frameLayout.setClipChildren(false);
            frameLayout.setClipToPadding(false);
            s0 s0Var = new s0(l7Var, new ei.x3[1], frameLayout, 1);
            n01 n01Var2 = new n01(l7Var.getContext(), l7Var.resourcesProvider);
            frameLayout.addView(n01Var2, w7.z5.e(-1, -1, 119));
            n01Var2.c(LocaleController.getString(R.string.GiftValueInitialSale), LocaleController.formatYearMonthDay(uniqueStarGiftValueInfo.initial_sale_date, true), null, null);
            String string = LocaleController.getString(R.string.GiftValueInitialPrice);
            StringBuilder sb2 = new StringBuilder("⭐️");
            sb2.append(uniqueStarGiftValueInfo.initial_sale_stars);
            sb2.append(" (~");
            n01Var2.c(string, nd.Y0(false, a1.g.s(sb2, BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.initial_sale_price, uniqueStarGiftValueInfo.currency), ")"), 0.8f, null), null, null);
            if (TLObject.hasFlag(uniqueStarGiftValueInfo.flags, 1)) {
                n01Var2.c(LocaleController.getString(R.string.GiftValueLastSale), LocaleController.formatYearMonthDay(uniqueStarGiftValueInfo.last_sale_date, true), null, null);
                if (((int) (Math.round((uniqueStarGiftValueInfo.last_sale_price / uniqueStarGiftValueInfo.initial_sale_price) * 1000.0d) / 10)) - 100 > 0) {
                    n01Var2.e(LocaleController.getString(R.string.GiftValueLastPrice), BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.last_sale_price, uniqueStarGiftValueInfo.currency), "+" + LocaleController.formatNumber(round, ' ') + "%", null, null);
                } else {
                    n01Var2.c(LocaleController.getString(R.string.GiftValueLastPrice), BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.last_sale_price, uniqueStarGiftValueInfo.currency), null, null);
                }
            }
            if (TLObject.hasFlag(uniqueStarGiftValueInfo.flags, 4)) {
                s3 s3Var = new s3(s0Var, r10, uniqueStarGiftValueInfo, str2, 0);
                n01Var = n01Var2;
                TableRow e = n01Var.e(LocaleController.getString(R.string.GiftValueMinPrice), BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.floor_price, uniqueStarGiftValueInfo.currency), "?", s3Var, null);
                org.telegram.ui.Components.xc[] xcVarArr = {(org.telegram.ui.Components.xc) ((k01) e.getChildAt(1)).getChildAt(0)};
                e.setOnClickListener(new ah.g0(s3Var, 5));
            } else {
                n01Var = n01Var2;
            }
            if (TLObject.hasFlag(uniqueStarGiftValueInfo.flags, 8)) {
                s3 s3Var2 = new s3(s0Var, r10, uniqueStarGiftValueInfo, str2, 1);
                TableRow e7 = n01Var.e(LocaleController.getString(R.string.GiftValueAveragePrice), BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.average_price, uniqueStarGiftValueInfo.currency), "?", s3Var2, null);
                org.telegram.ui.Components.xc[] xcVarArr2 = {(org.telegram.ui.Components.xc) ((k01) e7.getChildAt(1)).getChildAt(0)};
                e7.setOnClickListener(new ah.g0(s3Var2, 6));
            }
            linearLayout2.addView(frameLayout, w7.z5.t(-1, -2, 7, 0, 0, 0, 12));
            if (uniqueStarGiftValueInfo.listed_count > 0) {
                ei.d dVar = new ei.d(l7Var.getContext(), l7Var.resourcesProvider, false);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                f7 = 1.0f;
                f10 = 2.0f;
                spannableStringBuilder.append((CharSequence) LocaleController.formatNumber(uniqueStarGiftValueInfo.listed_count, ' '));
                spannableStringBuilder.append((CharSequence) " ");
                spannableStringBuilder.append((CharSequence) "e");
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.y5(document, 1.5f, dVar.getTextPaint().getFontMetricsInt()), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                spannableStringBuilder.append((CharSequence) " ");
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.GiftValueOnSaleTelegram));
                dVar.i(AndroidUtilities.replaceArrows(spannableStringBuilder, false, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f)), false, true);
                charSequence = " ";
                linearLayout = linearLayout2;
                dVar.setOnClickListener(new t3(l7Var, str2, j10, 0));
                linearLayout.addView(dVar, w7.z5.t(-1, 42, 7, 0, 0, 0, 2));
            } else {
                linearLayout = linearLayout2;
                charSequence = " ";
                f7 = 1.0f;
                f10 = 2.0f;
            }
            if (uniqueStarGiftValueInfo.fragment_listed_count > 0) {
                ei.d dVar2 = new ei.d(l7Var.getContext(), l7Var.resourcesProvider, false);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                spannableStringBuilder2.append((CharSequence) LocaleController.formatNumber(uniqueStarGiftValueInfo.fragment_listed_count, ' '));
                spannableStringBuilder2.append((CharSequence) "e");
                spannableStringBuilder2.setSpan(new org.telegram.ui.Components.y5(document, 1.5f, dVar2.getTextPaint().getFontMetricsInt()), spannableStringBuilder2.length() - 1, spannableStringBuilder2.length(), 33);
                spannableStringBuilder2.append(charSequence);
                spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.GiftValueOnSaleFragment));
                dVar2.i(AndroidUtilities.replaceArrows(spannableStringBuilder2, false, AndroidUtilities.dp(f10), AndroidUtilities.dp(f7)), false, true);
                dVar2.setOnClickListener(new p(6, l7Var, uniqueStarGiftValueInfo));
                linearLayout.addView(dVar2, w7.z5.t(-1, 42, 7, 0, 0, 0, 0));
            }
            j11.customView = linearLayout;
            j11.show();
        } else if (tL_error != null) {
            l7Var.getBulletinFactory().f0(tL_error, false);
        }
    }

    public static void o1(l7 l7Var, TLObject tLObject, TLRPC.TL_inputInvoiceStarGiftTransfer tL_inputInvoiceStarGiftTransfer, long j10, long j11, Utilities.Callback callback, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            int i10 = 0;
            MessagesController.getInstance(l7Var.currentAccount).putUsers(paymentForm.users, false);
            TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
            tL_payments_sendStarsForm.form_id = paymentForm.form_id;
            tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftTransfer;
            ArrayList<TLRPC.TL_labeledPrice> arrayList = paymentForm.invoice.prices;
            int size = arrayList.size();
            long j12 = 0;
            while (i10 < size) {
                TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i10);
                i10++;
                j12 += tL_labeledPrice.amount;
            }
            ConnectionsManager.getInstance(l7Var.currentAccount).sendRequest(tL_payments_sendStarsForm, new z2(l7Var, j10, j11, callback, j12));
            return;
        }
        callback.run(tL_error);
        org.telegram.ui.Components.oc Y = l7Var.getBulletinFactory().Y(tL_error);
        Y.f29213t = true;
        Y.j();
    }

    public static void p0(l7 l7Var, long j10) {
        new yh.o1(l7Var.getContext(), l7Var.currentAccount, j10, null, new d4(l7Var, 1)).show();
    }

    public static void p1(l7 l7Var, long j10) {
        new yh.o1(l7Var.getContext(), l7Var.currentAccount, j10, null, new d4(l7Var, 1)).show();
    }

    public static void q0(l7 l7Var) {
        TL_stars.TL_starGiftUnique e22 = l7Var.e2();
        new b1(l7Var.getContext(), l7Var.currentAccount, DialogObject.getPeerDialogId(e22.owner_id), e22, l7Var.resourcesProvider, new d2(l7Var, 4)).show();
    }

    public static void q1(l7 l7Var, TL_stars.InputSavedStarGift inputSavedStarGift, long j10, org.telegram.ui.ActionBar.c2 c2Var) {
        pf.c h = c2Var.h(-1, true, true);
        h.d();
        TL_stars.deleteStarGift deletestargift = new TL_stars.deleteStarGift();
        deletestargift.stargift = inputSavedStarGift;
        ConnectionsManager.getInstance(l7Var.currentAccount).sendRequest(deletestargift, new m3(l7Var, h, j10, 0));
    }

    public static void r0(l7 l7Var, TL_stars.InputSavedStarGift inputSavedStarGift, long j10, long j11, long j12) {
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(ApplicationLoader.applicationContext, 3, null);
        c2Var.r(500L);
        TL_stars.convertStarGift convertstargift = new TL_stars.convertStarGift();
        convertstargift.stargift = inputSavedStarGift;
        ConnectionsManager.getInstance(l7Var.currentAccount).sendRequest(convertstargift, new z2(l7Var, c2Var, j10, j11, j12));
    }

    public static void r1(l7 l7Var, TLObject tLObject, CharSequence charSequence, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            ArrayList<TLRPC.TL_labeledPrice> arrayList = paymentForm.invoice.prices;
            int size = arrayList.size();
            long j10 = 0;
            int i10 = 0;
            while (i10 < size) {
                TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i10);
                i10++;
                j10 += tL_labeledPrice.amount;
            }
            LinearLayout linearLayout = new LinearLayout(l7Var.getContext());
            linearLayout.setOrientation(1);
            linearLayout.setPadding(AndroidUtilities.dp(23.0f), 0, AndroidUtilities.dp(23.0f), 0);
            TextView b10 = w7.d6.b(l7Var.getContext(), 16.0f, org.telegram.ui.ActionBar.k6.f21290j5, false, null);
            b10.setText(LocaleController.getString(R.string.Gift2RemoveDescriptionText));
            linearLayout.addView(b10, w7.z5.k(0.0f, 0.0f, 0.0f, 16.0f, -1, -2));
            n01 n01Var = new n01(l7Var.getContext(), l7Var.resourcesProvider);
            l01 a2 = n01Var.a(charSequence);
            a2.setFilled(true);
            wh.n nVar = (wh.n) a2.getChildAt(0);
            nVar.setTextSize(1, 12.0f);
            nVar.setGravity(17);
            linearLayout.addView(n01Var, w7.z5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(l7Var.getContext(), 0, l7Var.resourcesProvider);
            alertDialog$Builder.f20679a.R = LocaleController.getString(R.string.Gift2RemoveDescriptionTitle);
            alertDialog$Builder.o(linearLayout);
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.k(nd.R0(LocaleController.formatString(R.string.Gift2RemoveDescriptionButton, Integer.valueOf((int) j10))), new c4(l7Var, tL_starGiftUnique, paymentForm, tL_inputInvoiceStarGiftDropOriginalDetails, j10, charSequence));
            alertDialog$Builder.p();
        } else if (tL_error != null) {
            l7Var.getBulletinFactory().f0(tL_error, false);
        }
    }

    public static void s0(l7 l7Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, ag.a aVar, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(l7Var.currentAccount).lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
            AndroidUtilities.runOnUIThread(new j3(l7Var, tL_starGiftUnique, aVar, runnable, 0));
        } else if (tL_error != null) {
            AndroidUtilities.runOnUIThread(new k3(l7Var, tL_error, runnable, 0));
        }
    }

    public static void s1(l7 l7Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, Utilities.Callback callback, Boolean bool) {
        TL_stars.StarGift starGift;
        if (l7Var.W0 == null) {
            yh.e4 e4Var = new yh.e4(l7Var.currentAccount, tL_starGiftUnique.gift_id);
            l7Var.W0 = e4Var;
            e4Var.a();
        }
        HashSet hashSet = new HashSet();
        int i10 = 0;
        while (true) {
            c6[] c6VarArr = l7Var.f1720f0.M.f1211n;
            if (i10 < c6VarArr.length) {
                TL_stars.StarGift starGift2 = c6VarArr[i10].h;
                if (starGift2 != null) {
                    starGift = starGift2;
                } else {
                    starGift = null;
                }
                if (starGift != null) {
                    if (starGift2 == null) {
                        starGift2 = null;
                    }
                    hashSet.add(Long.valueOf(starGift2.f20568id));
                }
                i10++;
            } else {
                yh.f4 f4Var = new yh.f4(l7Var.getContext(), tL_starGiftUnique.title, l7Var.W0);
                f4Var.f50693g0.addAll(hashSet);
                f4Var.f50695i0.N(true);
                f4Var.f50694h0 = bool.booleanValue();
                f4Var.f50691e0.set(AndroidUtilities.replaceTags(LocaleController.formatPluralString("GiftCraftSelect", 4 - hashSet.size(), new Object[0])));
                f4Var.f50692f0 = new s2(0, callback);
                f4Var.show();
                return;
            }
        }
    }

    public static void t0(l7 l7Var) {
        if (l7Var.f1745s1 == null) {
            return;
        }
        long j10 = 0;
        for (int i10 = 0; i10 < l7Var.f1745s1.invoice.prices.size(); i10++) {
            j10 += l7Var.f1745s1.invoice.prices.get(i10).amount;
        }
        h7 h7Var = new h7(l7Var.getContext(), j10, l7Var.f1739p1, l7Var.resourcesProvider);
        l7Var.f1740q0 = h7Var;
        h7Var.show();
    }

    public static void u0(l7 l7Var, TLRPC.TL_error tL_error, Utilities.Callback callback, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, TLObject tLObject) {
        String str;
        if (l7Var.getContext() != null) {
            if (tL_error != null && callback != null && tL_error.text.startsWith("TMP_PASSWORD")) {
                callback.run(Boolean.TRUE);
                return;
            }
            if (callback != null) {
                callback.run(Boolean.FALSE);
            }
            if (tL_error != null) {
                l7Var.o2(tL_error, twoStepVerificationActivity, z10);
                return;
            }
            if (twoStepVerificationActivity != null) {
                twoStepVerificationActivity.o0();
                twoStepVerificationActivity.finishFragment();
            }
            if (tLObject instanceof TL_stars.starGiftWithdrawalUrl) {
                pf.d.t(l7Var.getContext(), ((TL_stars.starGiftWithdrawalUrl) tLObject).url);
            } else if (tLObject instanceof TLRPC.TL_boolTrue) {
                TL_stars.TL_starGiftUnique e22 = l7Var.e2();
                org.telegram.ui.Wallet.l0 w9 = org.telegram.ui.Wallet.l0.w(l7Var.currentAccount);
                org.telegram.ui.Wallet.g gVar = w9.f34764z;
                if (e22 != null) {
                    str = e22.gift_address;
                } else {
                    str = null;
                }
                AndroidUtilities.cancelRunOnUIThread(gVar);
                w9.f34762x = str;
                w9.f34763y = 0;
                if (w9.f34754o == null) {
                    w9.f34754o = new org.telegram.ui.Wallet.d0(w9);
                }
                org.telegram.ui.Wallet.d0 d0Var = w9.f34754o;
                if (!d0Var.f34393j) {
                    d0Var.b();
                    d0Var.f(true);
                }
                w9.A().g();
                w9.C();
                int i10 = w9.f34763y;
                if (i10 < 7) {
                    w9.f34763y = i10 + 1;
                    AndroidUtilities.runOnUIThread(gVar, org.telegram.ui.Wallet.l0.P[i10]);
                }
                if (e22 != null && !TextUtils.isEmpty(e22.slug)) {
                    AndroidUtilities.runOnUIThread(new a3.l0(null, e22.getDocument(), LocaleController.getString(R.string.Gift2MovedToWallet), 8));
                }
                l7Var.dismiss();
            } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                org.telegram.ui.Components.vc.b0("NULL_ERROR");
            }
        }
    }

    public static void u1(l7 l7Var, pf.c cVar, org.telegram.ui.ActionBar.c2 c2Var, TLObject tLObject, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.TL_error tL_error, long j10, CharSequence charSequence) {
        boolean z10 = false;
        cVar.c(false);
        c2Var.dismiss();
        if (tLObject instanceof TLRPC.TL_payments_paymentResult) {
            int i10 = 0;
            while (i10 < tL_starGiftUnique.attributes.size()) {
                if (tL_starGiftUnique.attributes.get(i10) instanceof TL_stars.starGiftAttributeOriginalDetails) {
                    tL_starGiftUnique.attributes.remove(i10);
                    i10--;
                }
                i10++;
            }
            TL_stars.SavedStarGift savedStarGift = l7Var.F0;
            if (savedStarGift != null) {
                z10 = savedStarGift.refunded;
            }
            l7Var.M2(tL_starGiftUnique, z10, null, null);
            AndroidUtilities.runOnUIThread(new a1.f(23, l7Var, tL_starGiftUnique));
        } else if (tL_error != null && "BALANCE_TOO_LOW".equalsIgnoreCase(tL_error.text)) {
            new dd(l7Var.getContext(), l7Var.resourcesProvider, j10, 16, null, new a1.f(24, l7Var, charSequence), 0L).show();
        } else if (tL_error != null) {
            l7Var.getBulletinFactory().f0(tL_error, false);
        }
    }

    public static void v0(l7 l7Var, TLObject tLObject, boolean z10, TLRPC.Document document, boolean z11, TLRPC.TL_error tL_error, TL_stars.saveStarGift savestargift) {
        v9 F;
        int i10;
        int i11;
        int i12;
        int i13;
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        if (U != null) {
            ah.k1 k1Var = null;
            if (tLObject instanceof TLRPC.TL_boolTrue) {
                l7Var.dismiss();
                long U1 = l7Var.U1();
                if (!z10) {
                    ha.y(l7Var.currentAccount, false).Q(U1);
                }
                if (U1 >= 0) {
                    org.telegram.ui.Components.vc a02 = org.telegram.ui.Components.vc.a0(U);
                    if (z11) {
                        i12 = R.string.Gift2MadePrivateTitle;
                    } else {
                        i12 = R.string.Gift2MadePublicTitle;
                    }
                    String string = LocaleController.getString(i12);
                    if (z11) {
                        i13 = R.string.Gift2MadePrivate;
                    } else {
                        i13 = R.string.Gift2MadePublic;
                    }
                    String string2 = LocaleController.getString(i13);
                    if (!(U instanceof ProfileActivity)) {
                        k1Var = new ah.k1(U1, U);
                    }
                    a02.s(document, string, AndroidUtilities.replaceSingleTag(string2, k1Var)).k(true);
                    return;
                }
                org.telegram.ui.Components.vc a03 = org.telegram.ui.Components.vc.a0(U);
                if (z11) {
                    i10 = R.string.Gift2ChannelMadePrivateTitle;
                } else {
                    i10 = R.string.Gift2ChannelMadePublicTitle;
                }
                String string3 = LocaleController.getString(i10);
                if (z11) {
                    i11 = R.string.Gift2ChannelMadePrivate;
                } else {
                    i11 = R.string.Gift2ChannelMadePublic;
                }
                a03.s(document, string3, LocaleController.getString(i11)).j();
            } else if (tL_error != null) {
                if (z10 && l7Var.F0 != null && (F = ha.y(l7Var.currentAccount, false).F(l7Var.X, false)) != null) {
                    F.m(l7Var.F0, !savestargift.unsave);
                }
                l7Var.getBulletinFactory().t(LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text), null).k(false);
            }
        }
    }

    public static void v1(l7 l7Var, boolean z10) {
        int i10;
        Object obj;
        yh.k2 k2Var;
        yh.k2 k2Var2;
        yh.k2 k2Var3;
        int a2 = l7Var.a2();
        if (a2 >= 0) {
            if (z10) {
                i10 = 1;
            } else {
                i10 = -1;
            }
            int i11 = i10 + a2;
            int i12 = l7Var.U0;
            if (i12 >= 0 && (!z10 ? i12 < a2 : i12 > a2)) {
                i11 = i12;
            }
            z9 z9Var = l7Var.G0;
            if (z9Var != null && i11 >= 0 && i11 < z9Var.e()) {
                obj = l7Var.G0.get(i11);
            } else {
                obj = null;
            }
            if (obj != null) {
                if (z10) {
                    k2Var = l7Var.f1716d0;
                } else {
                    k2Var = l7Var.f1714c0;
                }
                if (k2Var != null) {
                    if (obj instanceof TL_stars.SavedStarGift) {
                        if (z10) {
                            k2Var3 = l7Var.f1716d0;
                        } else {
                            k2Var3 = l7Var.f1714c0;
                        }
                        if (R1(k2Var3.F0, (TL_stars.SavedStarGift) obj)) {
                            return;
                        }
                    }
                    if (obj instanceof TL_stars.TL_starGiftUnique) {
                        if (z10) {
                            k2Var2 = l7Var.f1716d0;
                        } else {
                            k2Var2 = l7Var.f1714c0;
                        }
                        if (S1(k2Var2.J0, (TL_stars.TL_starGiftUnique) obj)) {
                            return;
                        }
                    }
                }
                yh.k2 k2Var4 = new yh.k2(l7Var, l7Var.getContext(), l7Var.currentAccount, l7Var.X, l7Var.resourcesProvider, l7Var.Y.getRootView());
                if (obj instanceof TL_stars.SavedStarGift) {
                    k2Var4.L2((TL_stars.SavedStarGift) obj, l7Var.G0);
                } else if (obj instanceof TL_stars.TL_starGiftUnique) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj;
                    k2Var4.J2(tL_starGiftUnique.slug, tL_starGiftUnique, l7Var.G0);
                }
                AndroidUtilities.removeFromParent(k2Var4.containerView);
                if (z10) {
                    l7Var.f1716d0 = k2Var4;
                } else {
                    l7Var.f1714c0 = k2Var4;
                }
            }
        }
    }

    public static void w0(l7 l7Var, boolean[] zArr, TextView textView, TL_stars.starGiftDepositPayload[] stargiftdepositpayloadArr, Runnable[] runnableArr, TL_stars.starGiftDepositPayload stargiftdepositpayload) {
        Runnable jVar;
        if (zArr[0]) {
            return;
        }
        if (stargiftdepositpayload == null) {
            textView.setVisibility(8);
            return;
        }
        stargiftdepositpayloadArr[0] = stargiftdepositpayload;
        if (org.telegram.ui.Wallet.l0.w(l7Var.currentAccount).u() < stargiftdepositpayload.amount) {
            textView.setVisibility(8);
            return;
        }
        org.telegram.ui.Wallet.l0 w9 = org.telegram.ui.Wallet.l0.w(l7Var.currentAccount);
        q qVar = new q(textView, 4);
        try {
            boolean[] zArr2 = new boolean[1];
            w9.j0(new org.telegram.ui.Wallet.w6(w9, zArr2, qVar, org.telegram.ui.Wallet.l0.g(stargiftdepositpayload), 4));
            jVar = new org.telegram.ui.Wallet.m(zArr2, 3);
        } catch (Exception e) {
            org.telegram.ui.Wallet.l0.j("emulateDepositNFT: invalid payload", e);
            AndroidUtilities.runOnUIThread(new n71(27, qVar, e));
            jVar = new ah.j(23);
        }
        runnableArr[0] = jVar;
    }

    public static void x0(l7 l7Var, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, long j10, MessagesController messagesController, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        l7Var.f1730k0.setLoading(false);
        a5 a5Var = new a5(l7Var, 0);
        sg.j0 j0Var = new sg.j0(26, l7Var.currentAccount, l7Var.getContext(), a5Var, l7Var.resourcesProvider);
        j0Var.K1(canApplyBoost);
        j0Var.J1(tL_premium_boostsStatus, true);
        j0Var.L1(j10);
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(-j10));
        if (chat != null) {
            j0Var.Q0 = new o3(l7Var, chat);
        }
        j0Var.show();
    }

    public static void x1(l7 l7Var, final View view) {
        ei.ob obVar;
        LaunchActivity launchActivity = LaunchActivity.I1;
        if (launchActivity != null) {
            if (view instanceof org.telegram.ui.Cells.g7) {
                obVar = ei.qb.b((org.telegram.ui.Cells.g7) view);
            } else {
                obVar = null;
            }
            ArrayList arrayList = new ArrayList();
            MessageObject messageObject = l7Var.H0;
            if (messageObject != null) {
                arrayList.add(messageObject);
            } else if (l7Var.V1() instanceof TL_stars.TL_starGiftUnique) {
                long clientUserId = UserConfig.getInstance(l7Var.currentAccount).getClientUserId();
                TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                tL_messageService.peer_id = MessagesController.getInstance(l7Var.currentAccount).getPeer(clientUserId);
                tL_messageService.from_id = MessagesController.getInstance(l7Var.currentAccount).getPeer(clientUserId);
                tL_messageService.date = ConnectionsManager.getInstance(l7Var.currentAccount).getCurrentTime();
                TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = new TLRPC.TL_messageActionStarGiftUnique();
                tL_messageActionStarGiftUnique.gift = (TL_stars.TL_starGiftUnique) l7Var.V1();
                tL_messageActionStarGiftUnique.upgrade = true;
                tL_messageService.action = tL_messageActionStarGiftUnique;
                MessageObject messageObject2 = new MessageObject(l7Var.currentAccount, tL_messageService, false, false);
                messageObject2.setType();
                arrayList.add(messageObject2);
            } else {
                return;
            }
            final ei.vb D = ei.vb.D(launchActivity, l7Var.currentAccount);
            D.R = new Utilities.Callback4() {
                @Override
                public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
                    Long l4 = (Long) obj;
                    Runnable runnable = (Runnable) obj2;
                    Long l10 = (Long) obj4;
                    boolean booleanValue = ((Boolean) obj3).booleanValue();
                    ei.vb vbVar = D;
                    ei.ob obVar2 = null;
                    if (booleanValue) {
                        l7 l7Var2 = l7.this;
                        AndroidUtilities.runOnUIThread(new a1.f(17, l7Var2, l10));
                        vbVar.X(null);
                        b5 b5Var = l7Var2.Z0;
                        if (b5Var != null) {
                            b5Var.dismiss();
                            l7Var2.Z0 = null;
                        }
                    } else {
                        View view2 = view;
                        if ((view2 instanceof org.telegram.ui.Cells.g7) && view2.isAttachedToWindow()) {
                            obVar2 = ei.qb.b((org.telegram.ui.Cells.g7) view2);
                        }
                        vbVar.X(obVar2);
                    }
                    AndroidUtilities.runOnUIThread(runnable);
                }
            };
            D.T(obVar, ei.a8.y(arrayList));
        }
    }

    public static void y0(long j10, long j11, l7 l7Var, Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error) {
        long j12;
        l7 l7Var2;
        callback.run(tL_error);
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        if (U != null) {
            if (tLObject instanceof TLRPC.Updates) {
                if (j10 >= 0 && j11 >= 0) {
                    sn W9 = sn.W9(j10);
                    j12 = j10;
                    l7Var2 = l7Var;
                    W9.whenFullyVisible(new w3(l7Var2, W9, j12, 0));
                    U.presentFragment(W9);
                } else {
                    j12 = j10;
                    l7Var2 = l7Var;
                    org.telegram.ui.Components.oc M = org.telegram.ui.Components.vc.a0(U).M(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, l7Var2.W1(), DialogObject.getShortName(j12))), R.raw.forward);
                    M.f29213t = true;
                    M.j();
                }
            } else {
                j12 = j10;
                l7Var2 = l7Var;
                org.telegram.ui.Components.vc.a0(U).f0(tL_error, false);
            }
        } else {
            j12 = j10;
            l7Var2 = l7Var;
        }
        ha.y(l7Var2.currentAccount, false).Q(j12);
        ha.y(l7Var2.currentAccount, false).Q(j11);
    }

    public static void z0(l7 l7Var, String str) {
        Context context = l7Var.getContext();
        pf.d.t(context, MessagesController.getInstance(l7Var.currentAccount).tonBlockchainExplorerUrl + str);
    }

    public final void A2() {
        throw new UnsupportedOperationException("Method not decompiled: ai.l7.A2():void");
    }

    public final void B2() {
        TL_stars.TL_starGiftUnique e22 = e2();
        if (this.f1721f1 != null && e22 != null && !TextUtils.isEmpty(e22.slug)) {
            Context context = getContext();
            int i10 = this.currentAccount;
            ug.l1[] l1VarArr = {new ug.l1(context, i10, BirthdayController.getInstance(i10).getState(), 3, this.resourcesProvider)};
            ug.l1 l1Var = l1VarArr[0];
            l1Var.f48170z0 = LocaleController.getString(R.string.Gift2TransferShort);
            org.telegram.ui.Components.va vaVar = l1Var.e;
            if (vaVar != null) {
                vaVar.setTitle(l1Var.z());
            }
            ug.e1 e1Var = l1Var.f48147b0;
            if (e1Var != null) {
                e1Var.setText(l1Var.z());
            }
            ug.l1 l1Var2 = l1VarArr[0];
            l1Var2.G0 = true;
            l1Var2.h0(false, true);
            ug.l1 l1Var3 = l1VarArr[0];
            l1Var3.B0 = new o2(0, this, l1VarArr);
            l1Var3.show();
        }
    }

    public final void C2(final TL_stars.TL_starGiftUnique tL_starGiftUnique, final long j10, final ag.b bVar, final TLRPC.TL_textWithEntities tL_textWithEntities, final boolean z10, final yh.i0 i0Var) {
        this.f1730k0.setLoading(true);
        if (i0Var != null && !i0Var.L) {
            i0Var.L = true;
            i0Var.H.h(true);
        }
        ha.x(this.currentAccount, bVar).H(tL_starGiftUnique, j10, tL_textWithEntities, z10, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                l7.G0(l7.this, i0Var, bVar, tL_starGiftUnique, j10, tL_textWithEntities, z10, (TLRPC.TL_payments_paymentFormStarGift) obj);
            }
        });
    }

    public final SpannableStringBuilder E2(TLRPC.Peer peer) {
        if (peer != null) {
            String publicUsername = DialogObject.getPublicUsername(MessagesController.getInstance(this.currentAccount).getUserOrChat(DialogObject.getPeerDialogId(peer)));
            if (TextUtils.isEmpty(publicUsername)) {
                return null;
            }
            return AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.Gift2ReleasedBy2, si.o0.h("@", publicUsername)), new g4(this, publicUsername, 8));
        }
        return null;
    }

    public final SpannableStringBuilder F2(TL_stars.StarGift starGift) {
        if (starGift != null && !(starGift instanceof TL_stars.TL_starGiftUnique)) {
            return E2(starGift.released_by);
        }
        return null;
    }

    public final void G1(TL_stars.StarGiftAttribute starGiftAttribute) {
        String string;
        boolean z10;
        t6 t6Var;
        TL_stars.StarGiftAttribute starGiftAttribute2;
        l7 l7Var;
        y0 y0Var;
        if (starGiftAttribute instanceof TL_stars.starGiftAttributeModel) {
            string = LocaleController.getString(R.string.Gift2AttributeModel);
            z10 = true;
        } else if (starGiftAttribute instanceof TL_stars.starGiftAttributePattern) {
            string = LocaleController.getString(R.string.Gift2AttributeSymbol);
            z10 = true;
        } else if (starGiftAttribute instanceof TL_stars.starGiftAttributeBackdrop) {
            string = LocaleController.getString(R.string.Gift2AttributeBackdrop);
            z10 = false;
        } else {
            return;
        }
        if (!this.Q0 && ((t6Var = this.P0) == null || !t6Var.f2210o)) {
            boolean[] zArr = new boolean[1];
            org.telegram.ui.Components.xc[] xcVarArr = new org.telegram.ui.Components.xc[1];
            Integer[] numArr = new Integer[1];
            String d22 = d2(starGiftAttribute.rarity, numArr);
            if (starGiftAttribute.rarity instanceof TL_stars.TL_starGiftAttributeRarity) {
                starGiftAttribute2 = starGiftAttribute;
                y0Var = new y0(this, zArr, starGiftAttribute2, xcVarArr, 1);
                l7Var = this;
            } else {
                starGiftAttribute2 = starGiftAttribute;
                l7Var = this;
                y0Var = null;
            }
            xcVarArr[0] = (org.telegram.ui.Components.xc) ((k01) l7Var.f1726i0.e(string, starGiftAttribute2.name, d22, y0Var, numArr[0]).getChildAt(1)).getChildAt(0);
            return;
        }
        y6 y6Var = new y6(getContext(), this.resourcesProvider, new l2(this, 0));
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        n01 n01Var = this.f1726i0;
        tableRow.addView(new m01(n01Var, string), layoutParams);
        tableRow.addView(new k01(n01Var, y6Var, true), new TableRow.LayoutParams(0, -1, 1.0f));
        n01Var.addView(tableRow);
        t6 t6Var2 = this.P0;
        if (t6Var2 != null) {
            if (!z10) {
                t6Var2.d = y6Var;
            }
            if (z10) {
                t6Var2.f2201c = y6Var;
            }
            if (z10) {
                t6Var2.f2200b = y6Var;
            }
        }
    }

    public final void I1(LinearLayout linearLayout, int i10, int i11, int i12, String str, boolean z10) {
        int i13;
        int i14;
        ImageView imageView = new ImageView(getContext());
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(i10);
        org.telegram.ui.ActionBar.g6 g6Var = this.resourcesProvider;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.r6.t(imageView, i12, g6Var, mode);
        if (i11 < 15) {
            i13 = 1;
        } else {
            i13 = 0;
        }
        if (i11 < 15) {
            i14 = 1;
        } else {
            i14 = 0;
        }
        linearLayout.addView(imageView, w7.z5.t(i11, i11, 16, i13, 0, i14, 0));
        TextView textView = new TextView(getContext());
        textView.setTextSize(1, 13.0f);
        int i15 = org.telegram.ui.ActionBar.k6.f21440r5;
        org.telegram.ui.ActionBar.r6.W(textView, i15, this.resourcesProvider);
        textView.setText(str);
        linearLayout.addView(textView, w7.z5.t(-2, -2, 16, 4, 0, 0, 0));
        if (z10) {
            ImageView imageView2 = new ImageView(getContext());
            imageView2.setScaleType(scaleType);
            imageView2.setImageResource(R.drawable.msg_mini_topicarrow);
            org.telegram.ui.ActionBar.r6.t(imageView2, i15, this.resourcesProvider, mode);
            linearLayout.addView(imageView2, w7.z5.t(11, 11, 16, 5, 0, 2, 0));
        }
    }

    public final void I2(TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10) {
        TL_account.getTmpPassword gettmppassword = new TL_account.getTmpPassword();
        gettmppassword.password = inputCheckPasswordSRP;
        gettmppassword.period = 600;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(gettmppassword, new m4(this, twoStepVerificationActivity, z10, 0));
    }

    public final void J1(TL_stars.InputSavedStarGift inputSavedStarGift, TLRPC.Updates updates, Runnable runnable) {
        TLRPC.Message message;
        TL_stars.StarGift starGift;
        if (updates == null) {
            ha.y(this.currentAccount, false).Q(U1());
            dismiss();
            return;
        }
        TLRPC.Update update = updates.update;
        if (update instanceof TL_update.TL_updateNewMessage) {
            message = ((TL_update.TL_updateNewMessage) update).message;
        } else {
            if (updates.updates != null) {
                for (int i10 = 0; i10 < updates.updates.size(); i10++) {
                    TLRPC.Update update2 = updates.updates.get(i10);
                    if (update2 instanceof TL_update.TL_updateNewMessage) {
                        message = ((TL_update.TL_updateNewMessage) update2).message;
                        break;
                    }
                }
            }
            message = null;
        }
        if (message != null) {
            TL_stars.SavedStarGift savedStarGift = this.F0;
            if (savedStarGift != null && (!(inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftUser) ? !(!(inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftChat) ? !(inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftSlug) || (starGift = savedStarGift.gift) == null || !TextUtils.equals(starGift.slug, ((TL_stars.TL_inputSavedStarGiftSlug) inputSavedStarGift).slug) : savedStarGift.saved_id != ((TL_stars.TL_inputSavedStarGiftChat) inputSavedStarGift).saved_id) : savedStarGift.msg_id == ((TL_stars.TL_inputSavedStarGiftUser) inputSavedStarGift).msg_id)) {
                TLRPC.MessageAction messageAction = message.action;
                if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                    this.Q0 = true;
                    TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                    TL_stars.SavedStarGift savedStarGift2 = this.F0;
                    savedStarGift2.gift = tL_messageActionStarGiftUnique.gift;
                    savedStarGift2.msg_id = message.f20365id;
                    savedStarGift2.flags = (savedStarGift2.flags | 8) & (-2049);
                    savedStarGift2.saved_id = 0L;
                    savedStarGift2.unsaved = !tL_messageActionStarGiftUnique.saved;
                    savedStarGift2.refunded = tL_messageActionStarGiftUnique.refunded;
                    savedStarGift2.can_upgrade = false;
                    savedStarGift2.can_resell_at = tL_messageActionStarGiftUnique.can_resell_at;
                    savedStarGift2.can_transfer_at = tL_messageActionStarGiftUnique.can_transfer_at;
                    savedStarGift2.can_export_at = tL_messageActionStarGiftUnique.can_export_at;
                    L2(savedStarGift2, this.G0);
                    this.f1737o1 = null;
                    this.Q0 = false;
                    z9 z9Var = this.G0;
                    if (z9Var != null) {
                        z9Var.d();
                    } else {
                        ha.y(this.currentAccount, false).Q(this.X);
                    }
                    AndroidUtilities.runOnUIThread(runnable);
                    return;
                }
            }
            if (this.G0 == null) {
                ha.y(this.currentAccount, false).Q(U1());
            }
            this.Q0 = true;
            this.F0 = null;
            this.E0 = false;
            MessageObject messageObject = new MessageObject(this.currentAccount, message, false, false);
            messageObject.setType();
            K2(messageObject, this.G0);
            this.f1737o1 = null;
            this.Q0 = false;
            AndroidUtilities.runOnUIThread(runnable);
            return;
        }
        ha.y(this.currentAccount, false).Q(U1());
        dismiss();
    }

    public final void J2(String str, TL_stars.TL_starGiftUnique tL_starGiftUnique, z9 z9Var) {
        boolean z10;
        boolean z11;
        t6 t6Var;
        TL_stars.TL_starGiftUnique tL_starGiftUnique2;
        this.I0 = str;
        this.J0 = tL_starGiftUnique;
        this.G0 = z9Var;
        if (tL_starGiftUnique.resell_amount != null && !h2(this.currentAccount, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id))) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.K0 = z10;
        if (!this.Q0 && (t6Var = this.P0) != null && t6Var.f2210o && (tL_starGiftUnique2 = t6Var.f2207l) != null && tL_starGiftUnique2.f20568id != tL_starGiftUnique.f20568id) {
            t6Var.a();
            this.P0 = null;
            f7 f7Var = this.f1720f0;
            f7Var.f1266b.setAlpha(1.0f);
            f7Var.f1268c.setAlpha(0.0f);
        }
        this.f1718e0.b(this.currentAccount, this.F0);
        M2(tL_starGiftUnique, false, null, null);
        String str2 = tL_starGiftUnique.owner_address;
        String str3 = tL_starGiftUnique.gift_address;
        if (tL_starGiftUnique.host_id != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        TL_wallet.walletTransaction wallettransaction = this.f1727i1;
        w90 w90Var = this.f1724h0;
        if (wallettransaction == null && z11 && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            w90Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2InBlockchain), new g4(this, str3, 3)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            w90Var.setVisibility(0);
            org.telegram.ui.ActionBar.r6.W(w90Var, org.telegram.ui.ActionBar.k6.f21421q5, this.resourcesProvider);
        } else {
            w90Var.setVisibility(8);
        }
        TL_wallet.walletTransaction wallettransaction2 = this.f1727i1;
        w90 w90Var2 = this.f1728j0;
        if (wallettransaction2 == null && !z11 && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            w90Var2.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2InBlockchain), new g4(this, str3, 4)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            w90Var2.setVisibility(0);
        } else {
            w90Var2.setVisibility(8);
        }
        Y2();
        if (this.K0) {
            N2(tL_starGiftUnique);
            this.f1730k0.setOnClickListener(new c2(this, 12));
        }
        if (this.f1719e1) {
            U2(0, false, null);
            this.f33210c.n0(1);
            this.f1719e1 = false;
        }
        X2();
    }

    public final boolean K1() {
        int i10;
        boolean z10;
        boolean z11;
        TLRPC.Peer peer;
        if (Y1() == null) {
            return false;
        }
        MessageObject messageObject = this.H0;
        if (messageObject != null) {
            TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                if (tL_messageActionStarGift.peer != null) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                boolean isOutOwner = messageObject.isOutOwner();
                if (this.H0.getDialogId() == UserConfig.getInstance(this.currentAccount).getClientUserId()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                int currentTime = MessagesController.getInstance(this.currentAccount).stargiftsConvertPeriodMax - (ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() - this.H0.messageOwner.date);
                if (((z10 || (isOutOwner && !z11)) && ((peer = tL_messageActionStarGift.peer) == null || !i2(this.currentAccount, DialogObject.getPeerDialogId(peer)))) || tL_messageActionStarGift.converted || tL_messageActionStarGift.convert_stars <= 0 || currentTime <= 0) {
                    return false;
                }
                return true;
            }
        } else {
            TL_stars.SavedStarGift savedStarGift = this.F0;
            if (savedStarGift != null) {
                int currentTime2 = MessagesController.getInstance(this.currentAccount).stargiftsConvertPeriodMax - (ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() - savedStarGift.date);
                int i11 = this.currentAccount;
                long j10 = this.X;
                if (i2(i11, j10)) {
                    int i12 = this.F0.flags;
                    if (j10 < 0) {
                        i10 = 2048;
                    } else {
                        i10 = 8;
                    }
                    if ((i10 & i12) != 0 && (i12 & 16) != 0 && (i12 & 2) != 0 && currentTime2 > 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void K2(org.telegram.messenger.MessageObject r55, ai.z9 r56) {
        throw new UnsupportedOperationException("Method not decompiled: ai.l7.K2(org.telegram.messenger.MessageObject, ai.z9):void");
    }

    @Override
    public final boolean L() {
        return false;
    }

    public final boolean L1() {
        int i10;
        TL_stars.TL_starGiftUnique e22 = e2();
        if (e22 == null || e22.crafted || !i2(this.currentAccount, DialogObject.getPeerDialogId(e22.owner_id))) {
            return false;
        }
        MessageObject messageObject = this.H0;
        if (messageObject != null) {
            TLRPC.Message message = messageObject.messageOwner;
            if (message == null) {
                return false;
            }
            TLRPC.MessageAction messageAction = message.action;
            if (!(messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                return false;
            }
            i10 = ((TLRPC.TL_messageActionStarGiftUnique) messageAction).can_craft_at;
        } else {
            TL_stars.SavedStarGift savedStarGift = this.F0;
            if (savedStarGift != null && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
                i10 = savedStarGift.can_craft_at;
            }
            return false;
        }
        int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
        if (i10 <= 0 || currentTime < i10) {
            return false;
        }
        return true;
    }

    public final void L2(TL_stars.SavedStarGift savedStarGift, z9 z9Var) {
        boolean z10;
        boolean z11;
        long j10;
        int i10;
        CharSequence string;
        int i11;
        String string2;
        int i12;
        CharSequence charSequence;
        int i13;
        String formatString;
        int i14;
        char c10;
        CharSequence charSequence2;
        String str;
        TL_stars.StarGift starGift;
        String str2;
        ?? r12;
        int i15;
        ?? r122;
        TL_stars.StarGift starGift2;
        TLRPC.Document document;
        String str3;
        String str4;
        boolean z12;
        int i16;
        String string3;
        String string4;
        CharSequence replaceTags;
        TL_stars.StarGift starGift3;
        int i17;
        ?? r13;
        int i18;
        int i19;
        TLObject tLObject;
        t6 t6Var;
        if (savedStarGift == null) {
            return;
        }
        int i20 = this.currentAccount;
        long j11 = this.X;
        this.E0 = h2(i20, j11);
        this.F0 = savedStarGift;
        this.G0 = z9Var;
        this.H0 = null;
        boolean z13 = this.Q0;
        f7 f7Var = this.f1720f0;
        if (!z13 && (t6Var = this.P0) != null && t6Var.f2210o && t6Var.f2207l != null) {
            t6Var.a();
            this.P0 = null;
            f7Var.f1266b.setVisibility(0);
            f7Var.f1268c.setVisibility(4);
        }
        this.f1718e0.b(this.currentAccount, savedStarGift);
        String shortName = DialogObject.getShortName(j11);
        long peerDialogId = DialogObject.getPeerDialogId(savedStarGift.from_id);
        boolean isBot = UserObject.isBot(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerDialogId)));
        int currentTime = MessagesController.getInstance(this.currentAccount).stargiftsConvertPeriodMax - (ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() - savedStarGift.date);
        long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
        if ((savedStarGift.flags & 2) == 0) {
            peerDialogId = 2666000;
        }
        int i21 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
        if (i21 < 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        TLRPC.TL_textWithEntities tL_textWithEntities = savedStarGift.message;
        boolean z14 = savedStarGift.refunded;
        TL_stars.StarGift starGift4 = savedStarGift.gift;
        if (starGift4 instanceof TL_stars.TL_starGiftUnique) {
            str3 = starGift4.owner_address;
            str4 = starGift4.gift_address;
            if (starGift4.host_id != null) {
                z12 = true;
            } else {
                z12 = false;
            }
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift4;
            if (!savedStarGift.name_hidden) {
                tLObject = MessagesController.getInstance(this.currentAccount).getUserOrChat(DialogObject.getPeerDialogId(savedStarGift.from_id));
            } else {
                tLObject = null;
            }
            M2(tL_starGiftUnique, z14, tLObject, savedStarGift.message);
        } else {
            if (this.E0 && clientUserId == peerDialogId && i21 >= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z15 = z11;
            boolean j22 = j2(this.currentAccount, e2());
            Z1();
            f7Var.f(starGift4, false, false, j22);
            f7Var.setShowOptions(M1());
            n01 n01Var = this.f1726i0;
            n01Var.removeAllViews();
            CharSequence charSequence3 = "";
            if (z15) {
                if (savedStarGift.gift_num != 0 && (starGift3 = savedStarGift.gift) != null && starGift3.title != null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(savedStarGift.gift.title);
                    sb2.append(" #");
                    j10 = clientUserId;
                    string4 = i2.o1.m(savedStarGift.gift_num, ',', sb2);
                } else {
                    j10 = clientUserId;
                    string4 = LocaleController.getString(R.string.Gift2TitleSaved);
                }
                this.V0 = string4;
                if (z14) {
                    replaceTags = null;
                } else if (savedStarGift.can_upgrade) {
                    replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2SelfInfoUpgrade));
                } else {
                    long j12 = savedStarGift.convert_stars;
                    if (j12 > 0) {
                        replaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2SelfInfoConvert", (int) j12));
                    } else {
                        replaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2SelfInfo));
                    }
                }
                f7Var.i(0, string4, replaceTags, F2(savedStarGift.gift));
            } else {
                j10 = clientUserId;
                if (z10 && !this.E0) {
                    String string5 = LocaleController.getString(R.string.Gift2TitleProfile);
                    this.V0 = string5;
                    f7Var.i(0, string5, null, E2(savedStarGift.gift.released_by));
                } else {
                    boolean z16 = this.E0;
                    if ((!z16 || savedStarGift.can_upgrade) && savedStarGift.upgrade_stars > 0) {
                        if (z16) {
                            i10 = R.string.Gift2TitleReceived;
                        } else {
                            i10 = R.string.Gift2TitleProfile;
                        }
                        String string6 = LocaleController.getString(i10);
                        this.V0 = string6;
                        if (z14 || !this.E0) {
                            string = null;
                        } else {
                            string = LocaleController.getString(R.string.Gift2InfoInFreeUpgrade);
                        }
                        f7Var.i(0, string6, string, F2(savedStarGift.gift));
                    } else {
                        if (savedStarGift.gift_num != 0 && (starGift = savedStarGift.gift) != null && starGift.title != null) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(savedStarGift.gift.title);
                            sb3.append(" #");
                            string2 = i2.o1.m(savedStarGift.gift_num, ',', sb3);
                        } else {
                            if (z16) {
                                i11 = R.string.Gift2TitleReceived;
                            } else {
                                i11 = R.string.Gift2TitleProfile;
                            }
                            string2 = LocaleController.getString(i11);
                        }
                        this.V0 = string2;
                        if (z14 || !this.E0) {
                            i12 = 0;
                            charSequence = null;
                        } else {
                            if (!isBot && K1()) {
                                if (this.E0) {
                                    if (currentTime <= 0) {
                                        if (z10) {
                                            str = "Gift2Info2ChannelExpired";
                                        } else {
                                            str = "Gift2Info2Expired";
                                        }
                                    } else if (z10) {
                                        str = "Gift2Info3Channel";
                                    } else {
                                        str = "Gift2Info3";
                                    }
                                    formatString = LocaleController.formatPluralStringComma(str, (int) savedStarGift.convert_stars);
                                } else {
                                    formatString = LocaleController.formatPluralStringComma("Gift2Info2Out", (int) savedStarGift.convert_stars, shortName);
                                }
                            } else if (this.E0) {
                                if (savedStarGift.unsaved) {
                                    if (z10) {
                                        i14 = R.string.Gift2Info2ChannelKeep;
                                    } else {
                                        i14 = R.string.Gift2Info2BotKeep;
                                    }
                                } else if (z10) {
                                    i14 = R.string.Gift2Info2ChannelRemove;
                                } else {
                                    i14 = R.string.Gift2Info2BotRemove;
                                }
                                formatString = LocaleController.getString(i14);
                            } else {
                                if (savedStarGift.can_upgrade && savedStarGift.upgrade_stars > 0) {
                                    i13 = R.string.Gift2Info2OutUpgrade;
                                } else {
                                    i13 = R.string.Gift2Info2OutExpired;
                                }
                                formatString = LocaleController.formatString(i13, shortName);
                            }
                            SpannableStringBuilder replaceTags2 = AndroidUtilities.replaceTags(formatString);
                            if (isBot || !K1()) {
                                c10 = 1;
                                charSequence2 = "";
                            } else {
                                c10 = 1;
                                charSequence2 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2More).replace(' ', (char) 160), new d2(this, 5)), true);
                            }
                            char c11 = c10;
                            CharSequence[] charSequenceArr = new CharSequence[3];
                            i12 = 0;
                            charSequenceArr[0] = replaceTags2;
                            charSequenceArr[c11] = " ";
                            charSequenceArr[2] = charSequence2;
                            charSequence = TextUtils.concat(charSequenceArr);
                        }
                        f7Var.i(i12, string2, charSequence, F2(savedStarGift.gift));
                    }
                }
            }
            if (j10 != peerDialogId || z10) {
                TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerDialogId));
                String string7 = LocaleController.getString(R.string.Gift2From);
                int i22 = this.currentAccount;
                e2 e2Var = new e2(this, peerDialogId, 4);
                if (peerDialogId != j10 && peerDialogId != 2666000 && !isBot && !UserObject.isDeleted(user) && !z10) {
                    str2 = LocaleController.getString(R.string.Gift2ButtonSendGift);
                } else {
                    str2 = null;
                }
                this.f1726i0.m(string7, i22, peerDialogId, e2Var, str2, new e2(this, peerDialogId, 5));
            }
            n01Var.c(LocaleController.getString(R.string.StarsTransactionDate), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(savedStarGift.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(savedStarGift.date * 1000))), null, null);
            String string8 = LocaleController.getString(R.string.Gift2Value);
            String m10 = i2.o1.m(savedStarGift.gift.stars + savedStarGift.upgrade_stars, ',', new StringBuilder("⭐️ "));
            if (K1() && !z14) {
                r12 = 0;
                charSequence3 = org.telegram.ui.Components.yc.b(LocaleController.formatPluralStringComma("Gift2ButtonSell", (int) savedStarGift.convert_stars), new d2(this, 7), this.resourcesProvider, null);
            } else {
                r12 = 0;
            }
            n01Var.c(string8, nd.Y0(false, TextUtils.concat(m10, " ", charSequence3), 0.8f, r12), r12, r12);
            TL_stars.StarGift starGift5 = savedStarGift.gift;
            if (starGift5.limited && !z14) {
                nd.G0(n01Var, this.currentAccount, starGift5, this.resourcesProvider);
            }
            TLRPC.TL_textWithEntities tL_textWithEntities2 = savedStarGift.message;
            if (tL_textWithEntities2 != null && !TextUtils.isEmpty(tL_textWithEntities2.text) && !z14) {
                TLRPC.TL_textWithEntities tL_textWithEntities3 = savedStarGift.message;
                n01Var.b(tL_textWithEntities3.text, tL_textWithEntities3.entities);
            }
            boolean z17 = this.E0;
            ei.d dVar = this.f1730k0;
            if (z17 && savedStarGift.can_upgrade) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("^  ");
                if (this.f1717d1 == null) {
                    i16 = 0;
                    this.f1717d1 = new vq(0, new g7(dVar, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Oh, this.resourcesProvider)));
                } else {
                    i16 = 0;
                }
                spannableStringBuilder.setSpan(this.f1717d1, i16, 1, 33);
                if (savedStarGift.upgrade_stars > 0) {
                    string3 = LocaleController.getString(R.string.Gift2UpgradeButtonFree);
                } else {
                    string3 = LocaleController.getString(R.string.Gift2UpgradeButtonGift);
                }
                spannableStringBuilder.append((CharSequence) string3);
                dVar.setFilled(true);
                dVar.i(spannableStringBuilder, !this.f1719e1, true);
                dVar.g(null, !this.f1719e1);
                dVar.setOnClickListener(new c2(this, 8));
            } else if (this.f1742r0 && z17 && this.Z != null && this.G0 != null && a2() >= 0 && this.G0.b(a2()) >= 0) {
                dVar.setFilled(false);
                int b10 = this.G0.b(a2());
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.Gift2UpgradeNext));
                Object obj = this.G0.get(b10);
                if ((obj instanceof TL_stars.SavedStarGift) && (starGift2 = ((TL_stars.SavedStarGift) obj).gift) != null && (document = starGift2.getDocument()) != null) {
                    spannableStringBuilder2.append((CharSequence) " e");
                    r122 = 1;
                    spannableStringBuilder2.setSpan(new org.telegram.ui.Components.y5(document, dVar.getTextPaint().getFontMetricsInt()), spannableStringBuilder2.length() - 1, spannableStringBuilder2.length(), 33);
                } else {
                    r122 = 1;
                }
                dVar.i(spannableStringBuilder2, (this.f1719e1 ? 1 : 0) ^ r122, r122);
                dVar.g(null, (this.f1719e1 ? 1 : 0) ^ r122);
                dVar.setOnClickListener(new a3(this, b10, r122));
            } else if ((savedStarGift.gift instanceof TL_stars.TL_starGift) && !TextUtils.isEmpty(savedStarGift.prepaid_upgrade_hash)) {
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("^  ");
                if (this.f1717d1 == null) {
                    i15 = 0;
                    this.f1717d1 = new vq(0, new g7(dVar, org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Oh, this.resourcesProvider)));
                } else {
                    i15 = 0;
                }
                spannableStringBuilder3.setSpan(this.f1717d1, i15, 1, 33);
                spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2GiftAnUpgrade));
                dVar.setFilled(true);
                dVar.i(spannableStringBuilder3, !this.f1719e1, true);
                dVar.g(null, !this.f1719e1);
                dVar.setOnClickListener(new c2(this, 10));
            } else {
                dVar.setFilled(true);
                dVar.i(LocaleController.getString(R.string.OK), !this.f1719e1, true);
                dVar.g(null, !this.f1719e1);
                dVar.setOnClickListener(new c2(this, 11));
            }
            str3 = null;
            str4 = null;
            z12 = false;
        }
        boolean z18 = savedStarGift.refunded;
        w90 w90Var = this.f1724h0;
        if (z18) {
            w90Var.setVisibility(0);
            w90Var.setText(LocaleController.getString(R.string.Gift2Refunded));
            org.telegram.ui.ActionBar.r6.W(w90Var, org.telegram.ui.ActionBar.k6.f21422q7, this.resourcesProvider);
        } else if (z12 && !TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
            w90Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2InBlockchain), new g4(this, str4, 1)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            w90Var.setVisibility(0);
            org.telegram.ui.ActionBar.r6.W(w90Var, org.telegram.ui.ActionBar.k6.f21421q5, this.resourcesProvider);
        } else if (TextUtils.isEmpty(str3) && TextUtils.isEmpty(str4) && this.E0 && (savedStarGift.gift instanceof TL_stars.TL_starGift) && savedStarGift.name_hidden) {
            w90Var.setVisibility(0);
            if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
                i17 = R.string.Gift2InSenderMessageHidden2;
            } else {
                i17 = R.string.Gift2InSenderHidden2;
            }
            w90Var.setText(LocaleController.getString(i17));
            org.telegram.ui.ActionBar.r6.W(w90Var, org.telegram.ui.ActionBar.k6.f21421q5, this.resourcesProvider);
        } else {
            w90Var.setVisibility(8);
        }
        w90 w90Var2 = this.f1728j0;
        if (!z12 && !TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
            w90Var2.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2InBlockchain), new g4(this, str4, 2)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            r13 = 0;
            w90Var2.setVisibility(0);
        } else if (this.E0 && h2(this.currentAccount, j11)) {
            if (i21 >= 0) {
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                if (savedStarGift.unsaved) {
                    spannableStringBuilder4.append((CharSequence) ". ");
                    spannableStringBuilder4.setSpan(new vq(R.drawable.mini_gift_hidden, 0), 0, 1, 33);
                }
                if (!savedStarGift.unsaved) {
                    i19 = R.string.Gift2ProfileVisible4;
                } else {
                    i19 = R.string.Gift2ProfileInvisible4;
                }
                spannableStringBuilder4.append((CharSequence) AndroidUtilities.replaceSingleTag(LocaleController.getString(i19), new d2(this, 6)));
                w90Var2.setText(AndroidUtilities.replaceArrows(spannableStringBuilder4, true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            } else {
                if (!savedStarGift.unsaved) {
                    i18 = R.string.Gift2ChannelProfileVisible3;
                } else {
                    i18 = R.string.Gift2ChannelProfileInvisible3;
                }
                w90Var2.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(i18), new d2(this, 6)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            }
            r13 = 0;
            w90Var2.setVisibility(0);
        } else {
            r13 = 0;
            w90Var2.setVisibility(8);
        }
        if (this.f1719e1) {
            U2(r13, r13, null);
            this.f33210c.n0(1);
            this.f1719e1 = r13;
        }
        this.e.setTitle(this.V0);
        X2();
    }

    public final boolean M1() {
        throw new UnsupportedOperationException("Method not decompiled: ai.l7.M1():boolean");
    }

    public final void M2(org.telegram.tgnet.tl.TL_stars.TL_starGiftUnique r40, boolean r41, org.telegram.tgnet.TLObject r42, org.telegram.tgnet.TLRPC.TL_textWithEntities r43) {
        throw new UnsupportedOperationException("Method not decompiled: ai.l7.M2(org.telegram.tgnet.tl.TL_stars$TL_starGiftUnique, boolean, org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_textWithEntities):void");
    }

    public final void N1() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
        alertDialog$Builder.f20679a.R = LocaleController.getString(R.string.Gift2CantDoTitle);
        alertDialog$Builder.f20679a.T = LocaleController.getString(R.string.Gift2CantDoText);
        TL_stars.TL_starGiftUnique e22 = e2();
        if (e22 != null && !TextUtils.isEmpty(e22.slug)) {
            alertDialog$Builder.k(LocaleController.getString(R.string.OpenFragment), new s4(this, e22, 1));
        }
        i2.o1.s(R.string.Cancel, alertDialog$Builder, null);
    }

    public final void N2(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        ag.a resellAmount = tL_starGiftUnique.getResellAmount(ag.b.f633a);
        boolean z10 = tL_starGiftUnique.resale_ton_only;
        ei.d dVar = this.f1730k0;
        if (z10) {
            dVar.i(nd.n1(nd.T0(LocaleController.formatString(R.string.ResellGiftBuyTON, tL_starGiftUnique.getResellAmount(ag.b.f634b).d()), true), true), !this.f1719e1, true);
            dVar.g(nd.R0(LocaleController.formatPluralStringComma("ResellGiftBuyEq", (int) resellAmount.a())), !this.f1719e1);
            return;
        }
        dVar.i(nd.R0(LocaleController.formatPluralStringComma("ResellGiftBuy", (int) resellAmount.a())), !this.f1719e1, true);
        dVar.g(null, !this.f1719e1);
    }

    public final void O1(long j10, TL_stars.starGiftDepositPayload stargiftdepositpayload, pf.c cVar, ug.l1 l1Var) {
        TL_wallet.nftItem nftitem = this.f1721f1;
        TL_stars.TL_starGiftUnique e22 = e2();
        if (nftitem != null && e22 != null && !TextUtils.isEmpty(e22.slug)) {
            cVar.d();
            u3 u3Var = new u3(this, cVar, l1Var, j10, e22, nftitem, 0);
            if (stargiftdepositpayload != null) {
                u3Var.run(stargiftdepositpayload);
                return;
            }
            TL_stars.depositStarGift depositstargift = new TL_stars.depositStarGift();
            depositstargift.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j10);
            depositstargift.slug = e22.slug;
            ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(depositstargift, new Object(), new w2(this, cVar, l1Var, u3Var, 1));
        }
    }

    public final void O2(TL_stars.TL_starGiftUnique tL_starGiftUnique, boolean z10) {
        if (z10) {
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_peerUser.user_id = UserConfig.getInstance(this.currentAccount).getClientUserId();
            tL_starGiftUnique.host_id = tL_peerUser;
            tL_starGiftUnique.flags |= 4096;
        } else {
            tL_starGiftUnique.host_id = null;
            tL_starGiftUnique.flags &= -4097;
        }
        this.f1720f0.setWalletDisplayed(z10);
        Y2();
    }

    public final void P1(final long j10, final Utilities.Callback callback) {
        TLRPC.Message message;
        long peerDialogId;
        long j11;
        TL_stars.InputSavedStarGift Y1 = Y1();
        if (Y1 != null) {
            TL_stars.SavedStarGift savedStarGift = this.F0;
            if (savedStarGift != null && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
                j11 = savedStarGift.transfer_stars;
                peerDialogId = this.X;
            } else {
                MessageObject messageObject = this.H0;
                if (messageObject != null && (message = messageObject.messageOwner) != null) {
                    TLRPC.MessageAction messageAction = message.action;
                    if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                        TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                        peerDialogId = DialogObject.getPeerDialogId(tL_messageActionStarGiftUnique.gift.owner_id);
                        j11 = tL_messageActionStarGiftUnique.transfer_stars;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            if (j11 <= 0) {
                TL_stars.transferStarGift transferstargift = new TL_stars.transferStarGift();
                transferstargift.stargift = Y1;
                transferstargift.to_id = MessagesController.getInstance(this.currentAccount).getInputPeer(j10);
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(transferstargift, new b3(this, callback, j10, peerDialogId, 0));
                return;
            }
            final long j12 = peerDialogId;
            ha y3 = ha.y(this.currentAccount, false);
            if (!y3.e) {
                y3.r(new c3(this, y3, j10, callback, 0));
                return;
            }
            final TLRPC.TL_inputInvoiceStarGiftTransfer tL_inputInvoiceStarGiftTransfer = new TLRPC.TL_inputInvoiceStarGiftTransfer();
            tL_inputInvoiceStarGiftTransfer.stargift = Y1;
            tL_inputInvoiceStarGiftTransfer.to_id = MessagesController.getInstance(this.currentAccount).getInputPeer(j10);
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftTransfer;
            JSONObject q6 = gi.d3.q(this.resourcesProvider, false);
            if (q6 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = q6.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getPaymentForm, new RequestDelegate() {
                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    final l7 l7Var = l7.this;
                    final TLRPC.TL_inputInvoiceStarGiftTransfer tL_inputInvoiceStarGiftTransfer2 = tL_inputInvoiceStarGiftTransfer;
                    final long j13 = j10;
                    final long j14 = j12;
                    final Utilities.Callback callback2 = callback;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            l7.o1(l7.this, tLObject, tL_inputInvoiceStarGiftTransfer2, j13, j14, callback2, tL_error);
                        }
                    });
                }
            });
        }
    }

    public final void P2() {
        TL_stars.TL_starGiftUnique e22 = e2();
        if (e22 == null) {
            return;
        }
        TLRPC.Peer peer = e22.owner_id;
        if (peer == null) {
            peer = e22.host_id;
        }
        long peerDialogId = DialogObject.getPeerDialogId(peer);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(e22.title);
        sb2.append(" #");
        this.C0.setText(LocaleController.formatString(R.string.Gift2WearTitle, i2.o1.m(e22.num, ',', sb2)));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.Gift2WearStart));
        if (peerDialogId == UserConfig.getInstance(this.currentAccount).getClientUserId() && !UserConfig.getInstance(this.currentAccount).isPremium()) {
            spannableStringBuilder.append((CharSequence) " l");
            if (this.X0 == null) {
                this.X0 = new vq(R.drawable.msg_mini_lock3, 0);
            }
            spannableStringBuilder.setSpan(this.X0, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        ei.d dVar = this.f1730k0;
        dVar.i(spannableStringBuilder, true, true);
        dVar.g(null, true);
        dVar.setOnClickListener(new c2(this, 27));
        this.f1720f0.setWearPreview(MessagesController.getInstance(this.currentAccount).getUserOrChat(peerDialogId));
        U2(2, false, null);
        this.A0 = true;
    }

    public final void Q1() {
        TL_stars.InputSavedStarGift Y1;
        long j10;
        ei.d dVar = this.f1730k0;
        if (!dVar.Q && (Y1 = Y1()) != null) {
            MessageObject messageObject = this.H0;
            String str = null;
            long j11 = 0;
            if (messageObject != null) {
                TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
                if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                    TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                    j10 = tL_messageActionStarGift.upgrade_stars;
                    if (j10 <= 0) {
                        str = tL_messageActionStarGift.prepaid_upgrade_hash;
                    }
                } else {
                    return;
                }
            } else {
                TL_stars.SavedStarGift savedStarGift = this.F0;
                if (savedStarGift != null) {
                    j10 = savedStarGift.upgrade_stars;
                    if (j10 <= 0) {
                        str = savedStarGift.prepaid_upgrade_hash;
                    }
                } else {
                    return;
                }
            }
            int i10 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
            if (i10 > 0 || this.f1745s1 != null) {
                dVar.setLoading(true);
                vp vpVar = this.f1752w0;
                if (i10 > 0) {
                    TL_stars.upgradeStarGift upgradestargift = new TL_stars.upgradeStarGift();
                    upgradestargift.keep_original_details = vpVar.f32005a.f24297q;
                    upgradestargift.stargift = Y1;
                    ConnectionsManager.getInstance(this.currentAccount).sendRequest(upgradestargift, new g(3, this, Y1));
                    return;
                }
                int i11 = 0;
                ha y3 = ha.y(this.currentAccount, false);
                if (!y3.e) {
                    y3.r(new a1.f(18, this, y3));
                    return;
                }
                TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
                tL_payments_sendStarsForm.form_id = this.f1745s1.form_id;
                if (!TextUtils.isEmpty(str)) {
                    TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade tL_inputInvoiceStarGiftPrepaidUpgrade = new TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade();
                    tL_inputInvoiceStarGiftPrepaidUpgrade.hash = str;
                    tL_inputInvoiceStarGiftPrepaidUpgrade.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.X);
                    tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftPrepaidUpgrade;
                } else {
                    TLRPC.TL_inputInvoiceStarGiftUpgrade tL_inputInvoiceStarGiftUpgrade = new TLRPC.TL_inputInvoiceStarGiftUpgrade();
                    tL_inputInvoiceStarGiftUpgrade.keep_original_details = vpVar.f32005a.f24297q;
                    tL_inputInvoiceStarGiftUpgrade.stargift = Y1;
                    tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftUpgrade;
                }
                ArrayList<TLRPC.TL_labeledPrice> arrayList = this.f1745s1.invoice.prices;
                int size = arrayList.size();
                while (i11 < size) {
                    TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i11);
                    i11++;
                    j11 += tL_labeledPrice.amount;
                }
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_sendStarsForm, new d0(this, str, Y1, j11, 1));
            }
        }
    }

    public final void Q2(CharSequence charSequence) {
        TL_stars.TL_starGiftUnique e22 = e2();
        TL_stars.InputSavedStarGift Y1 = Y1();
        if (Y1 != null && e22 != null) {
            TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails = new TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails();
            tL_inputInvoiceStarGiftDropOriginalDetails.stargift = Y1;
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftDropOriginalDetails;
            JSONObject q6 = gi.d3.q(this.resourcesProvider, false);
            if (q6 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = q6.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getPaymentForm, new k2(this, charSequence, e22, tL_inputInvoiceStarGiftDropOriginalDetails, 1));
        }
    }

    public final void R2(View view, CharSequence charSequence, boolean z10) {
        Layout layout;
        org.telegram.ui.Components.yc ycVar;
        float primaryHorizontal;
        int i10;
        ei.x3 x3Var = this.f1757y1;
        if ((x3Var == null || !x3Var.V || this.f1759z1 != view) && view != null) {
            if (z10) {
                if (view instanceof org.telegram.ui.ActionBar.n5) {
                    org.telegram.ui.ActionBar.n5 n5Var = (org.telegram.ui.ActionBar.n5) view;
                    primaryHorizontal = (n5Var.getRightDrawableWidth() / 2.0f) + n5Var.getRightDrawableX();
                } else {
                    return;
                }
            } else {
                if (view instanceof TextView) {
                    layout = ((TextView) view).getLayout();
                } else if (view instanceof org.telegram.ui.ActionBar.n5) {
                    layout = ((org.telegram.ui.ActionBar.n5) view).getLayout();
                } else {
                    return;
                }
                if (layout != null) {
                    CharSequence text = layout.getText();
                    if (text instanceof Spanned) {
                        Spanned spanned = (Spanned) text;
                        org.telegram.ui.Components.yc[] ycVarArr = (org.telegram.ui.Components.yc[]) spanned.getSpans(0, spanned.length(), org.telegram.ui.Components.yc.class);
                        if (ycVarArr != null && ycVarArr.length > 0) {
                            primaryHorizontal = layout.getPrimaryHorizontal(spanned.getSpanStart(ycVarArr[ycVarArr.length - 1])) + view.getPaddingLeft() + (ycVar.a() / 2.0f);
                        } else {
                            return;
                        }
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            }
            int[] iArr = new int[2];
            view.getLocationOnScreen(r5);
            o5 o5Var = this.Y;
            o5Var.getLocationOnScreen(iArr);
            int[] iArr2 = {iArr2[0] - iArr[0], iArr2[1] - iArr[1]};
            ei.x3 x3Var2 = this.f1757y1;
            if (x3Var2 != null) {
                x3Var2.e(true);
                this.f1757y1 = null;
            }
            ei.x3 x3Var3 = new ei.x3(getContext(), 3);
            x3Var3.p(!z10);
            x3Var3.s(charSequence);
            x3Var3.m(0.0f, (iArr2[0] + primaryHorizontal) - (AndroidUtilities.dp(16.0f) + this.backgroundPaddingLeft));
            float dp = (iArr2[1] - AndroidUtilities.dp(100.0f)) - (view.getHeight() / 2.0f);
            if (z10) {
                i10 = 18;
            } else {
                i10 = 0;
            }
            x3Var3.setTranslationY(dp + AndroidUtilities.dp(i10 + 4.33f));
            x3Var3.d = 3000L;
            x3Var3.setPadding(AndroidUtilities.dp(16.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(16.0f) + this.backgroundPaddingLeft, 0);
            x3Var3.f10097l0 = new y2(x3Var3, 0);
            x3Var3.u();
            o5Var.addView(x3Var3, w7.z5.c(100.0f, -1));
            this.f1757y1 = x3Var3;
            this.f1759z1 = view;
        }
    }

    public final void S2(int i10, Context context, boolean z10) {
        int i11;
        int i12;
        LinearLayout e = tl.e(context, 1);
        FrameLayout frameLayout = new FrameLayout(context);
        int dp = AndroidUtilities.dp(64.0f);
        int i13 = org.telegram.ui.ActionBar.k6.Oh;
        ShapeDrawable K = org.telegram.ui.ActionBar.k6.K(dp, org.telegram.ui.ActionBar.k6.w0(i13, this.resourcesProvider));
        org.telegram.ui.ActionBar.n6 O = org.telegram.ui.ActionBar.r6.O(i13);
        org.telegram.ui.ActionBar.g6 g6Var = this.resourcesProvider;
        frameLayout.setBackground(K);
        org.telegram.ui.ActionBar.r6.k(frameLayout, K, O, null, g6Var);
        e.addView(frameLayout, w7.z5.t(64, 64, 49, 0, 6, 0, 0));
        ?? imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.f(R.raw.timer_3, 42, 42, null);
        frameLayout.addView((View) imageView, w7.z5.q(64, 64, 17));
        imageView.d();
        TextView b10 = w7.d6.b(context, 20.0f, org.telegram.ui.ActionBar.k6.G6, true, null);
        b10.setGravity(17);
        if (z10) {
            i11 = R.string.Gift2ResellTimeoutTitle;
        } else {
            i11 = R.string.Gift2TransferTimeoutTitle;
        }
        b10.setText(LocaleController.getString(i11));
        e.addView(b10, w7.z5.t(-1, -2, 48, 24, 14, 24, 0));
        TextView b11 = w7.d6.b(context, 14.0f, org.telegram.ui.ActionBar.k6.F6, false, null);
        b11.setGravity(17);
        if (z10) {
            i12 = R.string.Gift2ResellTimeout;
        } else {
            i12 = R.string.Gift2TransferTimeout;
        }
        b11.setText(LocaleController.formatString(i12, LocaleController.formatTTLString(Math.max(10, i10))));
        e.addView(b11, w7.z5.t(-1, -2, 48, 24, 6, 24, 6));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, this.resourcesProvider);
        alertDialog$Builder.o(e);
        org.telegram.messenger.v0.o(R.string.OK, alertDialog$Builder, null);
    }

    public final int T1() {
        if (this.f1713b1.d(1)) {
            return this.f1744s0.getMeasuredHeight();
        }
        if (this.f1713b1.d(2)) {
            return this.B0.getMeasuredHeight();
        }
        if (this.f1713b1.d(3)) {
            return this.D0.getMeasuredHeight();
        }
        if (this.f1713b1.d(4)) {
            return 0;
        }
        return this.f1722g0.getMeasuredHeight();
    }

    public final void T2(boolean z10, org.telegram.ui.ActionBar.c2 c2Var, pf.c cVar, Runnable runnable) {
        cVar.d();
        UserConfig userConfig = UserConfig.getInstance(this.currentAccount);
        TL_account.tmpPassword tmppassword = userConfig.tmpPassword;
        if (tmppassword != null && tmppassword.valid_until < ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() + 60) {
            userConfig.tmpPassword = null;
            userConfig.saveConfig(false);
        }
        TL_account.tmpPassword tmppassword2 = userConfig.tmpPassword;
        if (tmppassword2 == null) {
            v2(z10, cVar, runnable);
        } else {
            g2(tmppassword2.tmp_password, null, z10, new r3(this, z10, cVar, runnable, c2Var));
        }
    }

    public final long U1() {
        TLRPC.Peer peer;
        MessageObject messageObject = this.H0;
        if (messageObject != null) {
            TLRPC.Message message = messageObject.messageOwner;
            if (message != null) {
                TLRPC.MessageAction messageAction = message.action;
                if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                    TLRPC.Peer peer2 = ((TLRPC.TL_messageActionStarGift) messageAction).peer;
                    if (peer2 != null) {
                        return DialogObject.getPeerDialogId(peer2);
                    }
                    if (messageObject.isOutOwner()) {
                        return this.H0.getDialogId();
                    }
                    return UserConfig.getInstance(this.currentAccount).getClientUserId();
                } else if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                    TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                    TL_stars.StarGift starGift = tL_messageActionStarGiftUnique.gift;
                    if ((starGift instanceof TL_stars.TL_starGiftUnique) && (peer = starGift.owner_id) != null) {
                        return DialogObject.getPeerDialogId(peer);
                    }
                    TLRPC.Peer peer3 = tL_messageActionStarGiftUnique.peer;
                    if (peer3 != null) {
                        return DialogObject.getPeerDialogId(peer3);
                    }
                    return 0L;
                } else {
                    return 0L;
                }
            }
            return 0L;
        }
        TL_stars.SavedStarGift savedStarGift = this.F0;
        if (savedStarGift != null) {
            TL_stars.StarGift starGift2 = savedStarGift.gift;
            if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                return DialogObject.getPeerDialogId(((TL_stars.TL_starGiftUnique) starGift2).owner_id);
            }
            return this.X;
        }
        TL_stars.TL_starGiftUnique tL_starGiftUnique = this.J0;
        if (tL_starGiftUnique != null) {
            return DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id);
        }
        return 0L;
    }

    public final void U2(int r12, boolean r13, ah.t r14) {
        throw new UnsupportedOperationException("Method not decompiled: ai.l7.U2(int, boolean, ah.t):void");
    }

    public final TL_stars.StarGift V1() {
        MessageObject messageObject = this.H0;
        if (messageObject != null) {
            TLRPC.Message message = messageObject.messageOwner;
            if (message == null) {
                return null;
            }
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                return ((TLRPC.TL_messageActionStarGift) messageAction).gift;
            }
            if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                return ((TLRPC.TL_messageActionStarGiftUnique) messageAction).gift;
            }
        } else {
            TL_stars.SavedStarGift savedStarGift = this.F0;
            if (savedStarGift != null) {
                return savedStarGift.gift;
            }
            TL_stars.TL_starGiftUnique tL_starGiftUnique = this.J0;
            if (tL_starGiftUnique != null) {
                return tL_starGiftUnique;
            }
        }
        return null;
    }

    public final void V2(boolean z10) {
        boolean z11;
        int i10;
        int i11;
        TL_stars.TL_starGiftUnique e22 = e2();
        if (e22 == null) {
            return;
        }
        MessagesController.getGlobalMainSettings().edit().putInt("statusgiftpage", 3).apply();
        boolean j22 = j2(this.currentAccount, e2());
        boolean z12 = !j22;
        boolean j23 = j2(this.currentAccount, e2());
        ei.d dVar = this.f1730k0;
        if (j23) {
            MessagesController.getInstance(this.currentAccount).updateEmojiStatus(U1(), new TLRPC.TL_emojiStatusEmpty(), null);
            z11 = z12;
        } else {
            z11 = z12;
            long U1 = U1();
            if (U1 >= 0) {
                if (!UserConfig.getInstance(this.currentAccount).isPremium()) {
                    org.telegram.ui.Components.oc P = getBulletinFactory().P(R.raw.star_premium_2, AndroidUtilities.premiumText(LocaleController.getString(R.string.Gift2ActionWearNeededPremium), new d2(this, 2)));
                    P.f29213t = true;
                    P.j();
                    return;
                }
            } else if (!z10) {
                MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
                dVar.setLoading(true);
                MessagesController.getInstance(this.currentAccount).getBoostsController().getBoostsStats(U1, new f2(this, messagesController, U1, 0));
                return;
            }
            TLRPC.TL_inputEmojiStatusCollectible tL_inputEmojiStatusCollectible = new TLRPC.TL_inputEmojiStatusCollectible();
            tL_inputEmojiStatusCollectible.collectible_id = e22.f20568id;
            MessagesController.getInstance(this.currentAccount).updateEmojiStatus(U1(), tL_inputEmojiStatusCollectible, e22);
        }
        ah.v vVar = this.f1720f0.I[1];
        if (!j22) {
            i10 = R.drawable.filled_crown_off;
        } else {
            i10 = R.drawable.filled_crown_on;
        }
        if (!j22) {
            i11 = R.string.Gift2ActionWearOff;
        } else {
            i11 = R.string.Gift2ActionWear;
        }
        vVar.c(i10, LocaleController.getString(i11), true);
        if (this.A0) {
            dismiss();
            return;
        }
        ah.t tVar = new ah.t(2, this, z11);
        if (this.f1713b1.c(0)) {
            tVar.run();
        } else {
            U2(0, true, tVar);
        }
        dVar.i(LocaleController.getString(R.string.OK), !this.f1719e1, true);
        dVar.g(null, !this.f1719e1);
        dVar.setOnClickListener(new c2(this, 5));
    }

    public final String W1() {
        TL_stars.StarGift V1 = V1();
        if (V1 instanceof TL_stars.TL_starGiftUnique) {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) V1;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(tL_starGiftUnique.title);
            sb2.append(" #");
            return i2.o1.m(tL_starGiftUnique.num, ',', sb2);
        }
        return "";
    }

    public final void W2() {
        FrameLayout frameLayout = this.f1734n0;
        int visibility = frameLayout.getVisibility();
        FrameLayout frameLayout2 = this.f1738p0;
        FrameLayout frameLayout3 = this.f1732l0;
        if (visibility == 0) {
            frameLayout3.setTranslationY(this.f1713b1.a(1) * (-frameLayout.getMeasuredHeight()));
            frameLayout.setTranslationY((1.0f - this.f1713b1.a(1)) * frameLayout.getMeasuredHeight());
            frameLayout2.setTranslationY(this.f1713b1.a(1) * (-frameLayout.getMeasuredHeight()));
            return;
        }
        frameLayout3.setTranslationY(0.0f);
        frameLayout.setTranslationY(0.0f);
        frameLayout2.setTranslationY(0.0f);
    }

    public final void X2() {
        boolean f22 = f2(false);
        i5 i5Var = this.Z;
        i5Var.setPosition(f22 ? 1 : 0);
        i5Var.C(false);
        if (this.G0 != null && !f2(true) && this.G0.e() < this.G0.c()) {
            this.G0.a();
        }
    }

    public final TL_stars.InputSavedStarGift Y1() {
        TLRPC.Message message;
        long dialogId;
        TLRPC.Message message2;
        long dialogId2;
        TLRPC.Message message3;
        long j10 = this.X;
        if (j10 < 0) {
            TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat = new TL_stars.TL_inputSavedStarGiftChat();
            tL_inputSavedStarGiftChat.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j10);
            MessageObject messageObject = this.H0;
            if (messageObject != null && (message3 = messageObject.messageOwner) != null) {
                TLRPC.MessageAction messageAction = message3.action;
                if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                    TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                    if ((tL_messageActionStarGift.flags & 4096) == 0) {
                        return null;
                    }
                    tL_inputSavedStarGiftChat.saved_id = tL_messageActionStarGift.saved_id;
                    return tL_inputSavedStarGiftChat;
                } else if (!(messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                    return null;
                } else {
                    TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                    if ((tL_messageActionStarGiftUnique.flags & 128) == 0) {
                        return null;
                    }
                    tL_inputSavedStarGiftChat.saved_id = tL_messageActionStarGiftUnique.saved_id;
                    return tL_inputSavedStarGiftChat;
                }
            }
            TL_stars.SavedStarGift savedStarGift = this.F0;
            if (savedStarGift != null) {
                if ((savedStarGift.flags & 2048) == 0) {
                    return null;
                }
                tL_inputSavedStarGiftChat.saved_id = savedStarGift.saved_id;
                return tL_inputSavedStarGiftChat;
            } else if (this.J0 != null && !TextUtils.isEmpty(this.I0)) {
                TL_stars.TL_inputSavedStarGiftSlug tL_inputSavedStarGiftSlug = new TL_stars.TL_inputSavedStarGiftSlug();
                tL_inputSavedStarGiftSlug.slug = this.I0;
                return tL_inputSavedStarGiftSlug;
            } else {
                return tL_inputSavedStarGiftChat;
            }
        }
        MessageObject messageObject2 = this.H0;
        if (messageObject2 != null && (message2 = messageObject2.messageOwner) != null) {
            TLRPC.MessageAction messageAction2 = message2.action;
            if ((messageAction2 instanceof TLRPC.TL_messageActionStarGift) && (messageAction2.flags & 4096) != 0) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift2 = (TLRPC.TL_messageActionStarGift) messageAction2;
                TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat2 = new TL_stars.TL_inputSavedStarGiftChat();
                MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
                TLRPC.Peer peer = tL_messageActionStarGift2.peer;
                if (peer != null) {
                    dialogId2 = DialogObject.getPeerDialogId(peer);
                } else {
                    dialogId2 = this.H0.getDialogId();
                }
                tL_inputSavedStarGiftChat2.peer = messagesController.getInputPeer(dialogId2);
                tL_inputSavedStarGiftChat2.saved_id = tL_messageActionStarGift2.saved_id;
                return tL_inputSavedStarGiftChat2;
            }
        }
        if (messageObject2 != null && (message = messageObject2.messageOwner) != null) {
            TLRPC.MessageAction messageAction3 = message.action;
            if ((messageAction3 instanceof TLRPC.TL_messageActionStarGiftUnique) && (messageAction3.flags & 128) != 0) {
                TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique2 = (TLRPC.TL_messageActionStarGiftUnique) messageAction3;
                TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat3 = new TL_stars.TL_inputSavedStarGiftChat();
                MessagesController messagesController2 = MessagesController.getInstance(this.currentAccount);
                TLRPC.Peer peer2 = tL_messageActionStarGiftUnique2.peer;
                if (peer2 != null) {
                    dialogId = DialogObject.getPeerDialogId(peer2);
                } else {
                    dialogId = this.H0.getDialogId();
                }
                tL_inputSavedStarGiftChat3.peer = messagesController2.getInputPeer(dialogId);
                tL_inputSavedStarGiftChat3.saved_id = tL_messageActionStarGiftUnique2.saved_id;
                return tL_inputSavedStarGiftChat3;
            }
        }
        TL_stars.TL_inputSavedStarGiftUser tL_inputSavedStarGiftUser = new TL_stars.TL_inputSavedStarGiftUser();
        MessageObject messageObject3 = this.H0;
        if (messageObject3 != null) {
            TLRPC.Message message4 = messageObject3.messageOwner;
            if (message4 != null) {
                TLRPC.MessageAction messageAction4 = message4.action;
                if ((messageAction4 instanceof TLRPC.TL_messageActionStarGift) && (messageAction4.flags & 32768) != 0) {
                    tL_inputSavedStarGiftUser.msg_id = ((TLRPC.TL_messageActionStarGift) messageAction4).gift_msg_id;
                    return tL_inputSavedStarGiftUser;
                }
            }
            tL_inputSavedStarGiftUser.msg_id = messageObject3.getId();
            return tL_inputSavedStarGiftUser;
        }
        TL_stars.SavedStarGift savedStarGift2 = this.F0;
        if (savedStarGift2 != null) {
            tL_inputSavedStarGiftUser.msg_id = savedStarGift2.msg_id;
            return tL_inputSavedStarGiftUser;
        } else if (this.J0 != null && !TextUtils.isEmpty(this.I0)) {
            TL_stars.TL_inputSavedStarGiftSlug tL_inputSavedStarGiftSlug2 = new TL_stars.TL_inputSavedStarGiftSlug();
            tL_inputSavedStarGiftSlug2.slug = this.I0;
            return tL_inputSavedStarGiftSlug2;
        } else {
            return tL_inputSavedStarGiftUser;
        }
    }

    public final void Y2() {
        TL_stars.TL_starGiftUnique e22 = e2();
        TL_wallet.nftItem nftitem = this.f1721f1;
        LinearLayout linearLayout = this.f1756y0;
        if (nftitem != null && e22 != null) {
            this.f1724h0.setVisibility(8);
            this.f1728j0.setVisibility(8);
            boolean z10 = false;
            linearLayout.setVisibility(0);
            if (e22.host_id != null) {
                z10 = true;
            }
            this.f1758z0.a(z10, linearLayout.isAttachedToWindow());
            return;
        }
        linearLayout.setVisibility(8);
    }

    public final String Z1() {
        TL_stars.StarGift V1 = V1();
        if ((V1 instanceof TL_stars.TL_starGiftUnique) && V1.slug != null) {
            return MessagesController.getInstance(this.currentAccount).linkPrefix + "/nft/" + V1.slug;
        }
        return null;
    }

    public final int a2() {
        int indexOf;
        z9 z9Var = this.G0;
        if (z9Var != null) {
            TL_stars.SavedStarGift savedStarGift = this.F0;
            if (savedStarGift != null) {
                indexOf = z9Var.indexOf(savedStarGift);
            } else {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = this.J0;
                if (tL_starGiftUnique != null) {
                    indexOf = z9Var.indexOf(tL_starGiftUnique);
                } else {
                    return -1;
                }
            }
            if (indexOf >= 0) {
                return indexOf;
            }
            TL_stars.StarGift V1 = V1();
            for (int i10 = 0; i10 < this.G0.e(); i10++) {
                Object obj = this.G0.get(i10);
                if (obj instanceof TL_stars.SavedStarGift) {
                    TL_stars.SavedStarGift savedStarGift2 = this.F0;
                    if (savedStarGift2 != null) {
                        if (R1(savedStarGift2, (TL_stars.SavedStarGift) obj)) {
                            return i10;
                        }
                    }
                    if (V1 != null) {
                        TL_stars.StarGift starGift = ((TL_stars.SavedStarGift) obj).gift;
                        if (V1 != starGift) {
                            if ((V1 instanceof TL_stars.TL_starGiftUnique) && (starGift instanceof TL_stars.TL_starGiftUnique) && V1.f20568id == starGift.f20568id) {
                            }
                        }
                        return i10;
                    }
                    continue;
                } else {
                    if ((obj instanceof TL_stars.TL_starGiftUnique) && S1(this.J0, (TL_stars.TL_starGiftUnique) obj)) {
                        return i10;
                    }
                }
            }
            return -1;
        }
        return -1;
    }

    public final TL_stars.SavedStarGift b2(boolean z10) {
        int i10;
        Object obj;
        int a2 = a2();
        if (a2 < 0) {
            return null;
        }
        if (z10) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        int i11 = i10 + a2;
        int i12 = this.U0;
        if (i12 >= 0 && (!z10 ? i12 < a2 : i12 > a2)) {
            i11 = i12;
        }
        z9 z9Var = this.G0;
        if (z9Var != null && i11 >= 0 && i11 < z9Var.e()) {
            obj = this.G0.get(i11);
        } else {
            obj = null;
        }
        if (!(obj instanceof TL_stars.SavedStarGift)) {
            return null;
        }
        return (TL_stars.SavedStarGift) obj;
    }

    public final TL_stars.TL_starGiftUnique c2(boolean z10) {
        int i10;
        Object obj;
        int a2 = a2();
        if (a2 < 0) {
            return null;
        }
        if (z10) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        int i11 = i10 + a2;
        int i12 = this.U0;
        if (i12 >= 0 && (!z10 ? i12 < a2 : i12 > a2)) {
            i11 = i12;
        }
        z9 z9Var = this.G0;
        if (z9Var != null && i11 >= 0 && i11 < z9Var.e()) {
            obj = this.G0.get(i11);
        } else {
            obj = null;
        }
        if (!(obj instanceof TL_stars.TL_starGiftUnique)) {
            return null;
        }
        return (TL_stars.TL_starGiftUnique) obj;
    }

    @Override
    public final boolean canDismissWithSwipe() {
        if (this.f1713b1.c(4)) {
            boolean z10 = this.f1720f0.M.f1206h0;
        }
        return false;
    }

    @Override
    public final boolean canDismissWithTouchOutside() {
        if (this.f1713b1.c(4) && this.f1720f0.M.f1206h0) {
            return false;
        }
        return super.canDismissWithTouchOutside();
    }

    @Override
    public final boolean canSwipeToBack(MotionEvent motionEvent) {
        if (this.f1713b1.c(4) && this.f1720f0.M.f1206h0) {
            return false;
        }
        return super.canSwipeToBack(motionEvent);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starUserGiftsLoaded) {
            if (this.G0 == ((y9) objArr[1])) {
                e6 e6Var = this.f1720f0.M;
                if (e6Var == null || !e6Var.f1206h0) {
                    X2();
                }
            }
        }
    }

    @Override
    public final void dismiss() {
        if (this.f1713b1.c(4) && this.f1720f0.M.f1206h0) {
            return;
        }
        yh.e4 e4Var = this.W0;
        if (e4Var != null) {
            e4Var.b();
            this.W0 = null;
        }
        t6 t6Var = this.P0;
        if (t6Var != null) {
            t6Var.a();
        }
        super.dismiss();
    }

    public final TL_stars.TL_starGiftUnique e2() {
        TL_stars.StarGift V1 = V1();
        if (V1 instanceof TL_stars.TL_starGiftUnique) {
            return (TL_stars.TL_starGiftUnique) V1;
        }
        return null;
    }

    public final boolean f2(boolean z10) {
        if (b2(z10) == null && c2(z10) == null) {
            return false;
        }
        return true;
    }

    public final void g2(byte[] bArr, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, r3 r3Var) {
        TL_stars.getStarGiftWithdrawalUrl getstargiftwithdrawalurl;
        TL_stars.InputSavedStarGift Y1 = Y1();
        if (Y1 == null) {
            if (r3Var != null) {
                r3Var.run(Boolean.FALSE);
                return;
            }
            return;
        }
        if (z10) {
            TL_stars.withdrawStarGift withdrawstargift = new TL_stars.withdrawStarGift();
            withdrawstargift.keep_on_profile = this.f1755x1;
            withdrawstargift.stargift = Y1;
            withdrawstargift.tmp_password = bArr;
            getstargiftwithdrawalurl = withdrawstargift;
        } else {
            TL_stars.getStarGiftWithdrawalUrl getstargiftwithdrawalurl2 = new TL_stars.getStarGiftWithdrawalUrl();
            getstargiftwithdrawalurl2.stargift = Y1;
            getstargiftwithdrawalurl2.tmp_password = bArr;
            getstargiftwithdrawalurl = getstargiftwithdrawalurl2;
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(getstargiftwithdrawalurl, new i4(this, r3Var, twoStepVerificationActivity, z10, 0));
    }

    @Override
    public org.telegram.ui.Components.vc getBulletinFactory() {
        return new org.telegram.ui.Components.vc(this.f1738p0, this.resourcesProvider);
    }

    public final void k2() {
        throw new UnsupportedOperationException("Method not decompiled: ai.l7.k2():void");
    }

    public final void l2(android.view.View r6) {
        throw new UnsupportedOperationException("Method not decompiled: ai.l7.l2(android.view.View):void");
    }

    public final void m2() {
        b5 b5Var = this.Z0;
        if (b5Var != null && b5Var.isShown()) {
            this.Z0.dismiss();
        }
        String Z1 = Z1();
        b5 b5Var2 = new b5(this, getContext(), Z1, Z1, this.resourcesProvider);
        this.Z0 = b5Var2;
        b5Var2.f27145t0 = new a6.i(this, 4);
        b5Var2.show();
    }

    public final void n2() {
        throw new UnsupportedOperationException("Method not decompiled: ai.l7.n2():void");
    }

    public final void o2(TLRPC.TL_error tL_error, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10) {
        int i10;
        int i11;
        int dp;
        int i12;
        int i13;
        int dp2;
        int i14;
        int i15;
        int i16;
        if (getContext() == null) {
            return;
        }
        if (tL_error == null) {
            if (twoStepVerificationActivity != null) {
                twoStepVerificationActivity.o0();
            }
            org.telegram.ui.Components.vc.b0("NULL_ERROR");
        } else if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
            if ("SRP_ID_INVALID".equals(tL_error.text)) {
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new m4(this, twoStepVerificationActivity, z10, 1), 8);
                return;
            }
            if (twoStepVerificationActivity != null) {
                twoStepVerificationActivity.o0();
                twoStepVerificationActivity.finishFragment();
            }
            org.telegram.ui.Components.vc.d0(tL_error);
        } else {
            if (twoStepVerificationActivity != null) {
                twoStepVerificationActivity.o0();
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
            alertDialog$Builder.f20679a.R = LocaleController.getString(R.string.Gift2TransferToTONAlertTitle);
            LinearLayout linearLayout = new LinearLayout(getContext());
            linearLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(24.0f), 0);
            linearLayout.setOrientation(1);
            alertDialog$Builder.o(linearLayout);
            TextView textView = new TextView(getContext());
            int i17 = org.telegram.ui.ActionBar.k6.f21290j5;
            org.telegram.ui.ActionBar.r6.W(textView, i17, null);
            textView.setTextSize(1, 16.0f);
            if (LocaleController.isRTL) {
                i10 = 5;
            } else {
                i10 = 3;
            }
            textView.setGravity(i10 | 48);
            textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2TransferToTONAlertText)));
            linearLayout.addView(textView, w7.z5.n(-1, -2));
            LinearLayout linearLayout2 = new LinearLayout(getContext());
            linearLayout2.setOrientation(0);
            linearLayout.addView(linearLayout2, w7.z5.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
            ImageView imageView = new ImageView(getContext());
            imageView.setImageResource(R.drawable.list_circle);
            if (LocaleController.isRTL) {
                i11 = AndroidUtilities.dp(11.0f);
            } else {
                i11 = 0;
            }
            int dp3 = AndroidUtilities.dp(9.0f);
            if (LocaleController.isRTL) {
                dp = 0;
            } else {
                dp = AndroidUtilities.dp(11.0f);
            }
            imageView.setPadding(i11, dp3, dp, 0);
            PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
            org.telegram.ui.ActionBar.r6.t(imageView, i17, null, mode);
            TextView textView2 = new TextView(getContext());
            org.telegram.ui.ActionBar.r6.W(textView2, i17, null);
            textView2.setTextSize(1, 16.0f);
            if (LocaleController.isRTL) {
                i12 = 5;
            } else {
                i12 = 3;
            }
            textView2.setGravity(i12 | 48);
            org.telegram.messenger.v0.m(R.string.Gift2TransferToTONAlertText1, textView2);
            if (LocaleController.isRTL) {
                linearLayout2.addView(textView2, w7.z5.n(-1, -2));
                linearLayout2.addView(imageView, w7.z5.q(-2, -2, 5));
            } else {
                linearLayout2.addView(imageView, w7.z5.n(-2, -2));
                linearLayout2.addView(textView2, w7.z5.n(-1, -2));
            }
            LinearLayout linearLayout3 = new LinearLayout(getContext());
            linearLayout3.setOrientation(0);
            linearLayout.addView(linearLayout3, w7.z5.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
            ImageView imageView2 = new ImageView(getContext());
            imageView2.setImageResource(R.drawable.list_circle);
            if (LocaleController.isRTL) {
                i13 = AndroidUtilities.dp(11.0f);
            } else {
                i13 = 0;
            }
            int dp4 = AndroidUtilities.dp(9.0f);
            if (LocaleController.isRTL) {
                dp2 = 0;
            } else {
                dp2 = AndroidUtilities.dp(11.0f);
            }
            imageView2.setPadding(i13, dp4, dp2, 0);
            org.telegram.ui.ActionBar.r6.t(imageView2, i17, null, mode);
            TextView textView3 = new TextView(getContext());
            org.telegram.ui.ActionBar.r6.W(textView3, i17, null);
            textView3.setTextSize(1, 16.0f);
            if (LocaleController.isRTL) {
                i14 = 5;
            } else {
                i14 = 3;
            }
            textView3.setGravity(i14 | 48);
            org.telegram.messenger.v0.m(R.string.Gift2TransferToTONAlertText2, textView3);
            if (LocaleController.isRTL) {
                linearLayout3.addView(textView3, w7.z5.n(-1, -2));
                i15 = 5;
                linearLayout3.addView(imageView2, w7.z5.q(-2, -2, 5));
            } else {
                i15 = 5;
                linearLayout3.addView(imageView2, w7.z5.n(-2, -2));
                linearLayout3.addView(textView3, w7.z5.n(-1, -2));
            }
            if ("PASSWORD_MISSING".equals(tL_error.text)) {
                alertDialog$Builder.k(LocaleController.getString(R.string.Gift2TransferToTONSetPassword), new aa.a(this));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            } else {
                TextView textView4 = new TextView(getContext());
                org.telegram.ui.ActionBar.r6.W(textView4, i17, null);
                textView4.setTextSize(1, 16.0f);
                if (LocaleController.isRTL) {
                    i16 = i15;
                } else {
                    i16 = 3;
                }
                textView4.setGravity(i16 | 48);
                textView4.setText(LocaleController.getString(R.string.Gift2TransferToTONAlertText3));
                linearLayout.addView(textView4, w7.z5.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
            }
            if (twoStepVerificationActivity != null) {
                twoStepVerificationActivity.showDialog(alertDialog$Builder.f20679a);
            } else {
                alertDialog$Builder.p();
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starUserGiftsLoaded);
    }

    @Override
    public final void onBackPressed() {
        f7 f7Var;
        e6 e6Var;
        if (this.f1713b1.c(4) && (f7Var = this.f1720f0) != null && (e6Var = f7Var.M) != null) {
            if (e6Var.f1206h0) {
                return;
            }
            if (e6Var.f1207i0) {
                super.onBackPressed();
                return;
            }
        }
        if (!this.A0 && this.f1713b1.f1405c > 0 && !this.f1730k0.Q && !this.f1735n1) {
            MessageObject messageObject = this.H0;
            if (messageObject != null) {
                K2(messageObject, null);
            } else {
                TL_stars.SavedStarGift savedStarGift = this.F0;
                if (savedStarGift != null) {
                    L2(savedStarGift, this.G0);
                } else {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = this.J0;
                    if (tL_starGiftUnique != null) {
                        J2(this.I0, tL_starGiftUnique, this.G0);
                    }
                }
            }
            U2(0, true, null);
            return;
        }
        super.onBackPressed();
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
    }

    @Override
    public final void onSwipeStarts() {
        ei.x3 x3Var = this.f1757y1;
        if (x3Var != null) {
            x3Var.e(true);
            this.f1757y1 = null;
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            fixNavigationBarKey(org.telegram.ui.ActionBar.k6.f21255h5);
            f7 f7Var = this.f1720f0;
            if (f7Var != null) {
                f7Var.l();
            }
            vq vqVar = this.f1717d1;
            if (vqVar != null) {
                Drawable drawable = vqVar.drawable;
                if (drawable instanceof g7) {
                    ((g7) drawable).d.setColor(org.telegram.ui.ActionBar.k6.w0(org.telegram.ui.ActionBar.k6.Oh, this.resourcesProvider));
                    ei.d dVar = this.f1730k0;
                    if (dVar != null) {
                        dVar.invalidate();
                    }
                }
            }
        } catch (Exception e) {
            FileLog.e(e);
        }
    }

    public final void p2() {
        TL_stars.TL_starGiftUnique e22 = e2();
        if (e22 == null) {
            return;
        }
        nd.g1(getContext(), this.currentAccount, e22, new t4(this, e22, 2), this.resourcesProvider);
    }

    public final void q2() {
        throw new UnsupportedOperationException("Method not decompiled: ai.l7.q2():void");
    }

    public final void r2() {
        if (UserConfig.getInstance(this.currentAccount).isPremium() && (j2(this.currentAccount, e2()) || this.Y0)) {
            V2(false);
            return;
        }
        TL_stars.TL_starGiftUnique e22 = e2();
        if (e22 == null) {
            return;
        }
        TLRPC.Peer peer = e22.owner_id;
        if (peer == null) {
            peer = e22.host_id;
        }
        long peerDialogId = DialogObject.getPeerDialogId(peer);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(e22.title);
        sb2.append(" #");
        this.C0.setText(LocaleController.formatString(R.string.Gift2WearTitle, i2.o1.m(e22.num, ',', sb2)));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.Gift2WearStart));
        if (!UserConfig.getInstance(this.currentAccount).isPremium()) {
            spannableStringBuilder.append((CharSequence) " l");
            if (this.X0 == null) {
                this.X0 = new vq(R.drawable.msg_mini_lock3, 0);
            }
            spannableStringBuilder.setSpan(this.X0, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        ei.d dVar = this.f1730k0;
        dVar.i(spannableStringBuilder, true, true);
        dVar.g(null, true);
        dVar.setOnClickListener(new c2(this, 4));
        this.f1720f0.setWearPreview(MessagesController.getInstance(this.currentAccount).getUserOrChat(peerDialogId));
        U2(2, true, null);
    }

    public final void s2(long j10, String str) {
        this.f1735n1 = true;
        ha.y(this.currentAccount, false).K(j10, new o2(2, this, str));
    }

    @Override
    public final void setOverlayNavBarColor(int i10) {
        super.setOverlayNavBarColor(i10);
        AndroidUtilities.setNavigationBarColor((Dialog) this, 0, false);
    }

    @Override
    public final void show() {
        MessageObject messageObject;
        TLRPC.Message message;
        if (MessagesController.getInstance(this.currentAccount).isFrozen()) {
            org.telegram.ui.b.b(this.currentAccount);
            return;
        }
        if (this.I0 != null && this.J0 == null) {
            org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(getContext(), 3, null);
            c2Var.r(500L);
            TL_stars.getUniqueStarGift getuniquestargift = new TL_stars.getUniqueStarGift();
            getuniquestargift.slug = this.I0;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(getuniquestargift, new g(1, this, c2Var));
        } else if (this.F0 == null && (messageObject = this.H0) != null && (message = messageObject.messageOwner) != null) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                if (tL_messageActionStarGift.upgraded) {
                    if (tL_messageActionStarGift.upgrade_msg_id != 0) {
                        org.telegram.ui.ActionBar.c2 c2Var2 = new org.telegram.ui.ActionBar.c2(getContext(), 3, null);
                        c2Var2.r(500L);
                        TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
                        tL_messages_getMessages.f20438id.add(Integer.valueOf(tL_messageActionStarGift.upgrade_msg_id));
                        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getMessages, new j2(this, tL_messageActionStarGift, c2Var2, 0));
                        return;
                    } else if (Y1() != null) {
                        org.telegram.ui.ActionBar.c2 c2Var3 = new org.telegram.ui.ActionBar.c2(getContext(), 3, null);
                        c2Var3.r(500L);
                        ha.y(this.currentAccount, false).M(Y1(), new o2(1, this, c2Var3));
                        return;
                    }
                }
            }
        }
        super.show();
    }

    public final void t2(boolean z10) {
        int i10;
        MessageObject messageObject = this.H0;
        int i11 = 0;
        if (messageObject != null) {
            TLRPC.Message message = messageObject.messageOwner;
            if (message != null) {
                TLRPC.MessageAction messageAction = message.action;
                if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                    i10 = ((TLRPC.TL_messageActionStarGiftUnique) messageAction).can_craft_at;
                }
            }
            i10 = 0;
        } else {
            TL_stars.SavedStarGift savedStarGift = this.F0;
            if (savedStarGift != null) {
                i10 = savedStarGift.can_craft_at;
            }
            i10 = 0;
        }
        if (i10 > ConnectionsManager.getInstance(this.currentAccount).getCurrentTime()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
            String string = LocaleController.getString(R.string.GiftCraftLaterTitle);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20679a;
            c2Var.R = string;
            c2Var.T = LocaleController.formatString(R.string.GiftCraftLaterText, LocaleController.formatDateTime(i10, true));
            org.telegram.messenger.v0.o(R.string.OK, alertDialog$Builder, null);
            return;
        }
        TL_stars.TL_starGiftUnique e22 = e2();
        if (e22 == null) {
            return;
        }
        if (!TextUtils.isEmpty(e22.gift_address)) {
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
            String string2 = LocaleController.getString(R.string.GiftCraftCantChooseFirstTitle);
            org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.f20679a;
            c2Var2.R = string2;
            c2Var2.T = LocaleController.getString(R.string.GiftCraftCantChooseFirst);
            org.telegram.messenger.v0.o(R.string.OK, alertDialog$Builder2, null);
            return;
        }
        f7 f7Var = this.f1720f0;
        if (z10) {
            f7Var.M.a(this.currentAccount, e22.gift_id, e22.getDocument(), e22.title);
            if (L1()) {
                e6 e6Var = f7Var.M;
                TL_stars.TL_starGiftUnique e23 = e2();
                if (e23 == null) {
                    e6Var.getClass();
                } else {
                    while (true) {
                        c6[] c6VarArr = e6Var.f1211n;
                        if (i11 >= c6VarArr.length) {
                            break;
                        }
                        c6 c6Var = c6VarArr[i11];
                        TL_stars.StarGift starGift = c6Var.h;
                        if (starGift == null) {
                            starGift = null;
                        }
                        if (starGift == null) {
                            c6Var.a(e23, true);
                            break;
                        }
                        i11++;
                    }
                    e6Var.d(true);
                }
            }
        }
        e6 e6Var2 = f7Var.M;
        e6 e6Var3 = f7Var.M;
        e6Var2.setOnCraft(new l2(this, 1));
        if (this.W0 == null) {
            yh.e4 e4Var = new yh.e4(this.currentAccount, e22.gift_id);
            this.W0 = e4Var;
            e4Var.a();
        }
        e6Var3.setOnAddGift(new t4(this, e22, 1));
        e6Var3.setOnClose(new d2(this, 23));
        U2(4, true, null);
    }

    public final void u2(long j10) {
        ei.x3 x3Var = this.f1757y1;
        if (x3Var != null) {
            x3Var.e(true);
            this.f1757y1 = null;
        }
        dismiss();
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        if (U != null && !UserObject.isService(j10)) {
            Bundle bundle = new Bundle();
            if (j10 > 0) {
                bundle.putLong("user_id", j10);
                if (j10 == UserConfig.getInstance(this.currentAccount).getClientUserId()) {
                    bundle.putBoolean("my_profile", true);
                }
            } else {
                bundle.putLong("chat_id", -j10);
            }
            bundle.putBoolean("open_gifts", true);
            U.presentFragment(new ProfileActivity(bundle, null));
        }
    }

    public final void v2(boolean z10, pf.c cVar, Runnable runnable) {
        int i10;
        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
        if (z10) {
            i10 = 3;
        } else {
            i10 = 2;
        }
        e4 e4Var = new e4(this, twoStepVerificationActivity, z10, 0);
        twoStepVerificationActivity.Z = i10;
        twoStepVerificationActivity.f34242b0 = e4Var;
        twoStepVerificationActivity.f34240a0 = W1();
        twoStepVerificationActivity.s0(new a3.l0(this, runnable, cVar, twoStepVerificationActivity, 7));
    }

    @Override
    public final km0 w(lm0 lm0Var) {
        m5 m5Var = new m5(this, 0);
        this.T0 = m5Var;
        return m5Var;
    }

    public final void w2() {
        throw new UnsupportedOperationException("Method not decompiled: ai.l7.w2():void");
    }

    public final void x2(long j10, long j11, boolean z10, Utilities.Callback callback) {
        String str;
        TLRPC.User user;
        String formatString;
        CharSequence string;
        TL_stars.TL_starGiftUnique e22 = e2();
        if (e22 == null) {
            return;
        }
        if (j10 >= 0) {
            TLRPC.User user2 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j10));
            str = UserObject.getForcedFirstName(user2);
            user = user2;
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j10));
            if (chat == null) {
                str = "";
                user = chat;
            } else {
                str = chat.title;
                user = chat;
            }
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.addView(new g6(getContext(), e22, user), w7.z5.t(-1, -2, 48, 0, -4, 0, 0));
        TextView textView = new TextView(getContext());
        org.telegram.ui.ActionBar.r6.W(textView, org.telegram.ui.ActionBar.k6.f21290j5, this.resourcesProvider);
        textView.setTextSize(1, 16.0f);
        if (j11 > 0) {
            formatString = LocaleController.formatPluralStringComma("Gift2TransferPriceText", (int) j11, W1(), DialogObject.getShortName(j10));
        } else {
            formatString = LocaleController.formatString(R.string.Gift2TransferText, W1(), str);
        }
        textView.setText(AndroidUtilities.replaceTags(formatString));
        linearLayout.addView(textView, w7.z5.t(-1, -2, 48, 24, 4, 24, 4));
        n01 n01Var = new n01(getContext(), this.resourcesProvider);
        H1(n01Var, ha.l(e22.attributes, TL_stars.starGiftAttributeModel.class));
        H1(n01Var, ha.l(e22.attributes, TL_stars.starGiftAttributeBackdrop.class));
        H1(n01Var, ha.l(e22.attributes, TL_stars.starGiftAttributePattern.class));
        if (!TextUtils.isEmpty(e22.slug) && (e22.flags & 256) != 0) {
            n01Var.c(LocaleController.getString(R.string.GiftValue2), si.o0.h("~", BillingController.getInstance().formatCurrency(e22.value_amount, e22.value_currency, BillingController.getInstance().getCurrencyExp(e22.value_currency), true)), null, null);
        }
        linearLayout.addView(n01Var, w7.z5.t(-1, -2, 48, 23, 16, 23, 4));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
        alertDialog$Builder.o(linearLayout);
        if (j11 > 0) {
            string = nd.R0(LocaleController.formatString(R.string.Gift2TransferDoPrice, Integer.valueOf((int) j11)));
        } else {
            string = LocaleController.getString(R.string.Gift2TransferDo);
        }
        alertDialog$Builder.k(string, new a1.c(callback, 4));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f20679a;
        c2Var.Z0 = z10;
        c2Var.show();
    }

    @Override
    public final int y() {
        return AndroidUtilities.dp(12.0f);
    }

    public final void y2(long j10, Utilities.Callback callback) {
        TLRPC.Message message;
        long j11;
        TL_stars.SavedStarGift savedStarGift = this.F0;
        if (savedStarGift != null && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
            j11 = savedStarGift.transfer_stars;
        } else {
            MessageObject messageObject = this.H0;
            if (messageObject != null && (message = messageObject.messageOwner) != null) {
                TLRPC.MessageAction messageAction = message.action;
                if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                    TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                    if (tL_messageActionStarGiftUnique.gift instanceof TL_stars.TL_starGiftUnique) {
                        j11 = tL_messageActionStarGiftUnique.transfer_stars;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        x2(j10, j11, true, callback);
    }

    @Override
    public final CharSequence z() {
        return this.V0;
    }

    public final void z2() {
        TL_stars.InputSavedStarGift Y1;
        long j10;
        long j11;
        long j12;
        boolean z10;
        boolean z11;
        boolean z12;
        String str;
        boolean z13;
        boolean z14;
        int i10;
        ei.x3 x3Var = this.f1757y1;
        if (x3Var != null) {
            x3Var.e(true);
            this.f1757y1 = null;
        }
        if (this.f1715c1 == null && (Y1 = Y1()) != null) {
            MessageObject messageObject = this.H0;
            long j13 = this.X;
            if (messageObject != null) {
                TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
                if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                    TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                    j11 = tL_messageActionStarGift.gift.f20568id;
                    j12 = tL_messageActionStarGift.upgrade_stars;
                    z10 = tL_messageActionStarGift.name_hidden;
                    TLRPC.TL_textWithEntities tL_textWithEntities = tL_messageActionStarGift.message;
                    if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    z12 = tL_messageActionStarGift.peer instanceof TLRPC.TL_peerChannel;
                    j10 = 0;
                    str = tL_messageActionStarGift.prepaid_upgrade_hash;
                    if (tL_messageActionStarGift.prepaid_upgrade) {
                        if (DialogObject.getPeerDialogId(tL_messageActionStarGift.from_id) != this.H0.getFromChatId()) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                    } else {
                        z13 = tL_messageActionStarGift.upgrade_separate;
                    }
                } else {
                    return;
                }
            } else {
                j10 = 0;
                TL_stars.SavedStarGift savedStarGift = this.F0;
                if (savedStarGift != null) {
                    TL_stars.StarGift starGift = savedStarGift.gift;
                    j11 = starGift.f20568id;
                    j12 = savedStarGift.upgrade_stars;
                    if ((starGift instanceof TL_stars.TL_starGift) && savedStarGift.name_hidden) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    TLRPC.TL_textWithEntities tL_textWithEntities2 = savedStarGift.message;
                    if (tL_textWithEntities2 != null && !TextUtils.isEmpty(tL_textWithEntities2.text)) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (j13 < 0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    TL_stars.SavedStarGift savedStarGift2 = this.F0;
                    str = savedStarGift2.prepaid_upgrade_hash;
                    z13 = savedStarGift2.upgrade_separate;
                } else {
                    return;
                }
            }
            TextView textView = this.f1754x0;
            if (z10) {
                if (z12) {
                    i10 = R.string.Gift2AddMyNameNameChannel;
                } else {
                    i10 = R.string.Gift2AddMyNameName;
                }
                textView.setText(LocaleController.getString(i10));
            } else if (z11) {
                textView.setText(LocaleController.getString(R.string.Gift2AddSenderNameComment));
            } else {
                textView.setText(LocaleController.getString(R.string.Gift2AddSenderName));
            }
            if (!z10 && j12 > j10 && !z13) {
                z14 = true;
            } else {
                z14 = false;
            }
            vp vpVar = this.f1752w0;
            vpVar.a(z14, false);
            ArrayList arrayList = this.f1737o1;
            if (arrayList != null && (j12 > j10 || this.f1745s1 != null)) {
                A2();
                return;
            }
            if (arrayList == null) {
                ha.y(this.currentAccount, false).K(j11, new d4(this, 2));
            }
            if (j12 <= j10 && this.f1745s1 == null) {
                this.f1743r1 = true;
                TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                if (!TextUtils.isEmpty(str)) {
                    TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade tL_inputInvoiceStarGiftPrepaidUpgrade = new TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade();
                    tL_inputInvoiceStarGiftPrepaidUpgrade.hash = str;
                    tL_inputInvoiceStarGiftPrepaidUpgrade.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j13);
                    tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftPrepaidUpgrade;
                } else {
                    TLRPC.TL_inputInvoiceStarGiftUpgrade tL_inputInvoiceStarGiftUpgrade = new TLRPC.TL_inputInvoiceStarGiftUpgrade();
                    tL_inputInvoiceStarGiftUpgrade.keep_original_details = vpVar.f32005a.f24297q;
                    tL_inputInvoiceStarGiftUpgrade.stargift = Y1;
                    tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftUpgrade;
                }
                JSONObject q6 = gi.d3.q(this.resourcesProvider, false);
                if (q6 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                    tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                    tL_dataJSON.data = q6.toString();
                    tL_payments_getPaymentForm.flags |= 1;
                }
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getPaymentForm, new w4(this, 0));
            }
        }
    }
}
