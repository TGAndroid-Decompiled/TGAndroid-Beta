package ai;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.DialogInterface;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
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
import org.telegram.messenger.wh;
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
import org.telegram.ui.Components.ca0;
import org.telegram.ui.Components.g01;
import org.telegram.ui.Components.h01;
import org.telegram.ui.Components.hm0;
import org.telegram.ui.Components.i01;
import org.telegram.ui.Components.im0;
import org.telegram.ui.Components.j01;
import org.telegram.ui.Components.qy;
import org.telegram.ui.Components.x90;
import org.telegram.ui.Components.xp;
import org.telegram.ui.Components.yq;
import org.telegram.ui.Components.z00;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ey;
import org.telegram.ui.m71;
import org.telegram.ui.r91;
import org.telegram.ui.sn;
public class k7 extends org.telegram.ui.Components.bb implements NotificationCenter.NotificationCenterDelegate {
    public static final int A1 = 0;
    public boolean A0;
    public final j5 B0;
    public final TextView C0;
    public final j5 D0;
    public boolean E0;
    public TL_stars.SavedStarGift F0;
    public y9 G0;
    public MessageObject H0;
    public String I0;
    public TL_stars.TL_starGiftUnique J0;
    public boolean K0;
    public boolean L0;
    public boolean M0;
    public boolean N0;
    public boolean O0;
    public s6 P0;
    public boolean Q0;
    public m5 R0;
    public final int[] S0;
    public l5 T0;
    public int U0;
    public String V0;
    public yh.f4 W0;
    public final long X;
    public yq X0;
    public final n5 Y;
    public boolean Y0;
    public final h5 Z;
    public a5 Z0;
    public final z00 f1665a0;
    public Float f1666a1;
    public final View f1667b0;
    public g6 f1668b1;
    public yh.l2 f1669c0;
    public ValueAnimator f1670c1;
    public yh.l2 f1671d0;
    public yq f1672d1;
    public final k5 f1673e0;
    public boolean f1674e1;
    public final e7 f1675f0;
    public TL_wallet.nftItem f1676f1;
    public final j5 f1677g0;
    public org.telegram.ui.Wallet.s4 f1678g1;
    public final x90 f1679h0;
    public org.telegram.ui.Wallet.t4 f1680h1;
    public final j01 f1681i0;
    public TL_wallet.walletTransaction f1682i1;
    public final x90 f1683j0;
    public View f1684j1;
    public final ei.d f1685k0;
    public yh.b2 f1686k1;
    public final FrameLayout f1687l0;
    public boolean l1;
    public final x90 m0;
    public Boolean f1688m1;
    public final FrameLayout f1689n0;
    public boolean f1690n1;
    public final View f1691o0;
    public ArrayList f1692o1;
    public final FrameLayout f1693p0;
    public ArrayList f1694p1;
    public g7 f1695q0;
    public ArrayList f1696q1;
    public boolean f1697r0;
    public boolean f1698r1;
    public final j5 f1699s0;
    public TLRPC.PaymentForm f1700s1;
    public final gi.k[] f1701t0;
    public final yq[] f1702t1;
    public final View f1703u0;
    public final b2 f1704u1;
    public final LinearLayout f1705v0;
    public int f1706v1;
    public final xp f1707w0;
    public Boolean f1708w1;
    public final TextView f1709x0;
    public boolean f1710x1;
    public final LinearLayout f1711y0;
    public ei.x3 f1712y1;
    public final xp f1713z0;
    public View f1714z1;

    public k7(Context context, int i10, long j10, org.telegram.ui.ActionBar.d6 d6Var, View view) {
        super(context, null, false, false, d6Var);
        this.f1697r0 = false;
        this.S0 = new int[2];
        this.U0 = -1;
        this.V0 = "";
        this.f1668b1 = new g6(0, 0);
        this.f1674e1 = true;
        this.f1702t1 = new yq[1];
        this.f1704u1 = new b2(this, 11);
        this.f1710x1 = true;
        this.currentAccount = i10;
        this.X = j10;
        this.v = Math.max(0.05f, AndroidUtilities.dp(82.0f) / (AndroidUtilities.displaySize.y + AndroidUtilities.statusBarHeight));
        this.occupyNavigationBar = true;
        this.containerView = new ah.x(this, context, 1);
        n5 n5Var = new n5(this, context);
        this.Y = n5Var;
        h5 h5Var = new h5(this, context);
        this.Z = h5Var;
        h5Var.setAdapter(new i5(this, context, 0));
        P2();
        View view2 = new View(context);
        this.f1667b0 = view2;
        int i11 = org.telegram.ui.ActionBar.h6.f21057h5;
        view2.setBackgroundColor(getThemedColor(i11));
        this.containerView.addView(view2, w7.z5.e(-1, 50, 80));
        this.containerView.addView(h5Var, w7.z5.e(-1, -1, 119));
        fixNavigationBar(getThemedColor(i11));
        AndroidUtilities.removeFromParent(this.d);
        n5Var.addView(this.d, w7.z5.e(-1, -1, 119));
        j5 j5Var = new j5(this, context, 0);
        this.f1677g0 = j5Var;
        j5Var.setOrientation(1);
        j5Var.setPadding(AndroidUtilities.dp(14.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(14.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(68.0f));
        n5Var.addView(j5Var, w7.z5.e(-1, -1, 55));
        x90 x90Var = new x90(context, d6Var);
        this.f1679h0 = x90Var;
        int i12 = org.telegram.ui.ActionBar.h6.f21223q5;
        x90Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(i12, d6Var));
        x90Var.setTextSize(1, 12.0f);
        x90Var.setGravity(17);
        x90Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        x90Var.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21045gc, d6Var));
        x90Var.setDisablePaddingsOffsetY(true);
        j5Var.addView(x90Var, w7.z5.t(-2, -2, 1, 4, -2, 4, 16));
        x90Var.setVisibility(8);
        j01 j01Var = new j01(context, d6Var);
        this.f1681i0 = j01Var;
        j5Var.addView(j01Var, w7.z5.k(0.0f, 0.0f, 0.0f, 12.0f, -1, -2));
        x90 x90Var2 = new x90(context, d6Var);
        this.f1683j0 = x90Var2;
        x90Var2.setTextColor(org.telegram.ui.ActionBar.h6.w0(i12, d6Var));
        x90Var2.setTextSize(1, 12.0f);
        x90Var2.setGravity(17);
        x90Var2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        int i13 = org.telegram.ui.ActionBar.h6.Oh;
        x90Var2.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(i13, d6Var));
        x90Var2.setDisablePaddingsOffsetY(true);
        x90Var2.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), 0);
        j5Var.addView(x90Var2, w7.z5.t(-2, -2, 1, 4, 2, 4, 8));
        x90Var2.setVisibility(8);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f1711y0 = linearLayout;
        linearLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        linearLayout.setOrientation(0);
        int i14 = org.telegram.ui.ActionBar.h6.f21075i6;
        linearLayout.setBackground(org.telegram.ui.ActionBar.h6.Z(org.telegram.ui.ActionBar.h6.w0(i14, d6Var), 21, 21));
        xp xpVar = new xp(context, 24, d6Var);
        this.f1713z0 = xpVar;
        int i15 = org.telegram.ui.ActionBar.h6.f21059h7;
        int i16 = org.telegram.ui.ActionBar.h6.f21094j7;
        int i17 = org.telegram.ui.ActionBar.h6.f21114k7;
        xpVar.b(i15, i16, i17);
        xpVar.setDrawUnchecked(true);
        xpVar.a(false, false);
        xpVar.setDrawBackgroundAsArc(10);
        linearLayout.addView(xpVar, w7.z5.t(26, 26, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        int i18 = org.telegram.ui.ActionBar.h6.f21092j5;
        textView.setTextColor(getThemedColor(i18));
        textView.setTextSize(1, 14.0f);
        textView.setText(LocaleController.getString(R.string.Gift2AlsoShowInMyGifts));
        linearLayout.addView(textView, w7.z5.t(-2, -2, 16, 9, 0, 0, 0));
        j5Var.addView(linearLayout, w7.z5.t(-2, -2, 1, 0, -4, 0, 4));
        w7.b6.b(linearLayout, 0.025f, 1.5f);
        linearLayout.setOnClickListener(new c2(this, 19));
        linearLayout.setVisibility(8);
        j5 j5Var2 = new j5(this, context, 1);
        this.f1699s0 = j5Var2;
        j5Var2.setOrientation(1);
        j5Var2.setPadding(AndroidUtilities.dp(4.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(4.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(66.0f));
        n5Var.addView(j5Var2, w7.z5.e(-1, -1, 55));
        this.f1701t0 = r8;
        gi.k kVar = new gi.k(context, d6Var, false);
        kVar.a(LocaleController.getString(R.string.Gift2UpgradeFeature1Title), LocaleController.getString(R.string.GiftsFeature1Text), R.drawable.menu_feature_unique);
        j5Var2.addView(r8[0], w7.z5.n(-1, -2));
        gi.k kVar2 = new gi.k(context, d6Var, false);
        kVar2.a(LocaleController.getString(R.string.Gift2UpgradeFeature3Title), LocaleController.getString(R.string.GiftsFeature2Text), R.drawable.menu_feature_tradable);
        j5Var2.addView(r8[1], w7.z5.n(-1, -2));
        gi.k kVar3 = new gi.k(context, d6Var, false);
        gi.k[] kVarArr = {kVar, kVar2, kVar3};
        kVar3.a(LocaleController.getString(R.string.GiftsFeature3Title), LocaleController.getString(R.string.GiftsFeature3Text), R.drawable.menu_wear);
        j5Var2.addView(kVarArr[2], w7.z5.n(-1, -2));
        View view3 = new View(context);
        this.f1703u0 = view3;
        int i19 = org.telegram.ui.ActionBar.h6.f20987d7;
        view3.setBackgroundColor(org.telegram.ui.ActionBar.h6.w0(i19, d6Var));
        j5Var2.addView(view3, w7.z5.s(-2, 7, 17, -4, 17, 1.0f / AndroidUtilities.density, 6));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f1705v0 = linearLayout2;
        linearLayout2.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        linearLayout2.setOrientation(0);
        linearLayout2.setBackground(org.telegram.ui.ActionBar.h6.Z(org.telegram.ui.ActionBar.h6.w0(i14, d6Var), 6, 6));
        xp xpVar2 = new xp(context, 24, d6Var);
        this.f1707w0 = xpVar2;
        xpVar2.b(i15, i16, i17);
        xpVar2.setDrawUnchecked(true);
        xpVar2.a(false, false);
        xpVar2.setDrawBackgroundAsArc(10);
        linearLayout2.addView(xpVar2, w7.z5.t(26, 26, 16, 0, 0, 0, 0));
        TextView textView2 = new TextView(context);
        this.f1709x0 = textView2;
        textView2.setTextColor(getThemedColor(i18));
        textView2.setTextSize(1, 14.0f);
        textView2.setText(LocaleController.getString(R.string.Gift2AddSenderName));
        linearLayout2.addView(textView2, w7.z5.t(-2, -2, 16, 9, 0, 0, 0));
        j5Var2.addView(linearLayout2, w7.z5.t(-2, -2, 1, 0, 0, 0, 4));
        w7.b6.b(linearLayout2, 0.025f, 1.5f);
        j5 j5Var3 = new j5(this, context, 2);
        this.B0 = j5Var3;
        j5Var3.setOrientation(1);
        j5Var3.setPadding(AndroidUtilities.dp(4.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(4.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(66.0f));
        n5Var.addView(j5Var3, w7.z5.e(-1, -1, 55));
        TextView textView3 = new TextView(context);
        this.C0 = textView3;
        wh.o(i18, d6Var, textView3, 1, 20.0f);
        textView3.setGravity(17);
        textView3.setTypeface(AndroidUtilities.bold());
        j5Var3.addView(textView3, w7.z5.t(-1, -2, 7, 20, 0, 20, 0));
        TextView textView4 = new TextView(context);
        wh.o(i18, d6Var, textView4, 1, 14.0f);
        textView4.setGravity(17);
        textView4.setText(LocaleController.getString(R.string.Gift2WearSubtitle));
        j5Var3.addView(textView4, w7.z5.t(-1, -2, 7, 20, 6, 20, 24));
        gi.k kVar4 = new gi.k(context, d6Var, false);
        kVar4.a(LocaleController.getString(R.string.Gift2WearFeature1Title), LocaleController.getString(R.string.Gift2WearFeature1Text), R.drawable.menu_feature_unique);
        j5Var3.addView(r10[0], w7.z5.n(-1, -2));
        gi.k kVar5 = new gi.k(context, d6Var, false);
        kVar5.a(LocaleController.getString(R.string.Gift2WearFeature2Title), LocaleController.getString(R.string.Gift2WearFeature2Text), R.drawable.menu_feature_cover);
        j5Var3.addView(r10[1], w7.z5.n(-1, -2));
        gi.k kVar6 = new gi.k(context, d6Var, false);
        gi.k[] kVarArr2 = {kVar4, kVar5, kVar6};
        kVar6.a(LocaleController.getString(R.string.Gift2WearFeature3Title), LocaleController.getString(R.string.Gift2WearFeature3Text), R.drawable.menu_verification);
        j5Var3.addView(kVarArr2[2], w7.z5.n(-1, -2));
        j5 j5Var4 = new j5(this, context, 3);
        this.D0 = j5Var4;
        j5Var4.setOrientation(1);
        j5Var4.setPadding(AndroidUtilities.dp(4.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(92.0f));
        n5Var.addView(j5Var4, w7.z5.e(-1, -1, 55));
        gi.k kVar7 = new gi.k(context, d6Var, false);
        kVar7.a(LocaleController.getString(R.string.GiftCraftInfoFeature1Title), LocaleController.getString(R.string.GiftCraftInfoFeature1Text), R.drawable.menu_feature_unique);
        j5Var4.addView(r11[0], w7.z5.n(-1, -2));
        gi.k kVar8 = new gi.k(context, d6Var, false);
        kVar8.a(LocaleController.getString(R.string.GiftCraftInfoFeature2Title), LocaleController.getString(R.string.GiftCraftInfoFeature2Text), R.drawable.menu_random);
        j5Var4.addView(r11[1], w7.z5.n(-1, -2));
        gi.k kVar9 = new gi.k(context, d6Var, false);
        gi.k[] kVarArr3 = {kVar7, kVar8, kVar9};
        kVar9.a(LocaleController.getString(R.string.GiftCraftInfoFeature3Title), LocaleController.getString(R.string.GiftCraftInfoFeature3Text), R.drawable.menu_feature_affect);
        j5Var4.addView(kVarArr3[2], w7.z5.n(-1, -2));
        j5Var.setAlpha(1.0f);
        j5Var2.setAlpha(0.0f);
        j5Var3.setAlpha(0.0f);
        j5Var4.setAlpha(0.0f);
        e7 e7Var = new e7(context, d6Var, new b2(this, 12), new c2(this, 20), new c2(this, 21), new c2(this, 22), new c2(this, 23), new c2(this, 24), new c2(this, 25), new c2(this, 26));
        this.f1675f0 = e7Var;
        e7Var.M.f1149c.setOnClickListener(new c2(this, 17));
        int i20 = this.backgroundPaddingLeft;
        e7Var.setPadding(i20, 0, i20, 0);
        n5Var.addView(e7Var, w7.z5.e(-1, -2, 55));
        hg.a0 a0Var = this.f24913c;
        this.P = true;
        a0Var.k1(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f1687l0 = frameLayout;
        frameLayout.setBackgroundColor(getThemedColor(i11));
        View view4 = new View(context);
        this.f1691o0 = view4;
        view4.setBackgroundColor(getThemedColor(i19));
        view4.setAlpha(0.0f);
        frameLayout.addView(view4, w7.z5.b(-1.0f, 1.0f / AndroidUtilities.density, 55));
        ei.d f7 = wh.f(24, context, d6Var, true);
        this.f1685k0 = f7;
        f7.g(LocaleController.getString(R.string.OK), false, true);
        f7.f(null, false);
        FrameLayout.LayoutParams a2 = w7.z5.a(48.0f, 0.0f, 12.0f, 0.0f, 12.0f, -1, 119);
        a2.leftMargin = AndroidUtilities.dp(14.0f) + this.backgroundPaddingLeft;
        a2.rightMargin = AndroidUtilities.dp(14.0f) + this.backgroundPaddingLeft;
        frameLayout.addView(f7, a2);
        n5Var.addView(frameLayout, w7.z5.e(-1, 72, 87));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f1689n0 = frameLayout2;
        frameLayout2.setBackgroundColor(getThemedColor(i11));
        x90 x90Var3 = new x90(context, null);
        this.m0 = x90Var3;
        x90Var3.setTextSize(1, 12.0f);
        x90Var3.setTextColor(org.telegram.ui.ActionBar.h6.w0(i13, d6Var));
        x90Var3.setLinkTextColor(org.telegram.ui.ActionBar.h6.w0(i13, d6Var));
        x90Var3.setGravity(17);
        frameLayout2.addView(x90Var3, w7.z5.a(-2.0f, 16.0f, 8.0f, 16.0f, 14.0f, -1, 17));
        n5Var.addView(frameLayout2, w7.z5.e(-1, -2, 87));
        frameLayout2.setVisibility(8);
        this.d.setOnScrollListener(new ah.d0(this, 3));
        linearLayout2.setOnClickListener(new c2(this, 18));
        z00 z00Var = new z00(context);
        this.f1665a0 = z00Var;
        n5Var.addView(z00Var, w7.z5.d(-1.0f, -1));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f1693p0 = frameLayout3;
        frameLayout3.setPadding(AndroidUtilities.dp(6.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(6.0f) + this.backgroundPaddingLeft, 0);
        n5Var.addView(frameLayout3, w7.z5.a(200.0f, 0.0f, 0.0f, 0.0f, 60.0f, -1, 87));
        AndroidUtilities.removeFromParent(this.e);
        n5Var.addView(this.e, w7.z5.a(-2.0f, 6.0f, 0.0f, 6.0f, 0.0f, -1, 0));
        k5 k5Var = new k5(context);
        this.f1673e0 = k5Var;
        n5Var.addView(k5Var, w7.z5.e(-1, -2, 55));
        ArrayList arrayList = new ArrayList();
        if (view != null) {
            arrayList.add(view);
        }
        AndroidUtilities.makeGlobalBlurBitmap(new r0(k5Var, 2), 12.0f, 12, null, arrayList);
    }

    public static void A0(k7 k7Var, String str) {
        Context context = k7Var.getContext();
        pf.d.t(context, MessagesController.getInstance(k7Var.currentAccount).tonBlockchainExplorerUrl + str);
    }

    public static void B0(k7 k7Var, TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift) {
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) tL_payments_uniqueStarGift.gift;
        k7Var.J0 = tL_starGiftUnique;
        k7Var.D2(tL_starGiftUnique, false, null, null);
        super.show();
    }

    public static void B1(j01 j01Var, TL_stars.StarGiftAttribute starGiftAttribute) {
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
        j01Var.e(str, starGiftAttribute.name, W1(starGiftAttribute.rarity, numArr), null, numArr[0]);
    }

    public static void C0(ai.k7 r17) {
        throw new UnsupportedOperationException("Method not decompiled: ai.k7.C0(ai.k7):void");
    }

    public static void D0(k7 k7Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, ag.a aVar, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(k7Var.currentAccount).lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
            AndroidUtilities.runOnUIThread(new i3(k7Var, tL_starGiftUnique, aVar, runnable, 1));
            return;
        }
        k7Var.getClass();
        if (tL_error != null && tL_error.text.startsWith("STARGIFT_RESELL_TOO_EARLY_")) {
            AndroidUtilities.runOnUIThread(new a3.i0(k7Var, Long.parseLong(tL_error.text.substring(26)), runnable, 2));
        } else if (tL_error != null) {
            AndroidUtilities.runOnUIThread(new j3(k7Var, tL_error, runnable, 1));
        }
    }

    public static void E0(long j10, long j11, k7 k7Var, Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(k7Var.currentAccount).lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
        }
        AndroidUtilities.runOnUIThread(new o3(j10, j11, k7Var, callback, tLObject, tL_error));
    }

    public static void F0(k7 k7Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, ag.a aVar, Runnable runnable) {
        k7Var.getClass();
        TL_stars.StarsAmount o10 = aVar.o();
        TL_stars.updateStarGiftPrice updatestargiftprice = new TL_stars.updateStarGiftPrice();
        updatestargiftprice.stargift = k7Var.R1();
        updatestargiftprice.resell_amount = o10;
        ConnectionsManager.getInstance(k7Var.currentAccount).sendRequest(updatestargiftprice, new r2(k7Var, tL_starGiftUnique, aVar, runnable, 0));
    }

    public static void G0(k7 k7Var, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, TLRPC.Document document, String str, String str2, String str3, long j10, TLRPC.TL_error tL_error) {
        j01 j01Var;
        LinearLayout linearLayout;
        CharSequence charSequence;
        float f7;
        float f10;
        int round;
        b2Var.dismiss();
        if (tLObject instanceof TL_stars.UniqueStarGiftValueInfo) {
            TL_stars.UniqueStarGiftValueInfo uniqueStarGiftValueInfo = (TL_stars.UniqueStarGiftValueInfo) tLObject;
            org.telegram.ui.ActionBar.f3 i10 = wh.i(1, k7Var.getContext(), k7Var.resourcesProvider, false);
            LinearLayout linearLayout2 = new LinearLayout(k7Var.getContext());
            linearLayout2.setOrientation(1);
            linearLayout2.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
            linearLayout2.setClipChildren(false);
            linearLayout2.setClipToPadding(false);
            org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(k7Var.getContext());
            ld.a1(w9Var.getImageReceiver(), document, 160);
            linearLayout2.addView(w9Var, w7.z5.t(160, 160, 1, 0, 0, 0, 0));
            TextView textView = new TextView(k7Var.getContext());
            textView.setTextSize(1, 20.0f);
            textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Sh, k7Var.resourcesProvider));
            textView.setTypeface(AndroidUtilities.bold());
            textView.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
            textView.setBackground(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(21.0f), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Oh, k7Var.resourcesProvider)));
            textView.setGravity(17);
            linearLayout2.addView(textView, w7.z5.t(-2, 42, 1, 0, 12, 0, 15));
            textView.setText(str);
            TextView textView2 = new TextView(k7Var.getContext());
            textView2.setTextSize(1, 14.0f);
            org.telegram.ui.Cells.t0.q(org.telegram.ui.ActionBar.h6.f21092j5, k7Var.resourcesProvider, textView2, 17);
            linearLayout2.addView(textView2, w7.z5.t(-2, -2, 1, 16, 0, 16, 19));
            if (uniqueStarGiftValueInfo.value_is_average) {
                wh.r(R.string.GiftValueAverage, new Object[]{str2}, textView2);
            } else if (uniqueStarGiftValueInfo.last_sale_on_fragment) {
                wh.r(R.string.GiftValueLastFragment, new Object[]{str3}, textView2);
            } else {
                wh.r(R.string.GiftValueLastTelegram, new Object[]{str3}, textView2);
            }
            FrameLayout frameLayout = new FrameLayout(k7Var.getContext());
            frameLayout.setClipChildren(false);
            frameLayout.setClipToPadding(false);
            s0 s0Var = new s0(k7Var, new ei.x3[1], frameLayout, 1);
            j01 j01Var2 = new j01(k7Var.getContext(), k7Var.resourcesProvider);
            frameLayout.addView(j01Var2, w7.z5.e(-1, -1, 119));
            j01Var2.c(LocaleController.getString(R.string.GiftValueInitialSale), LocaleController.formatYearMonthDay(uniqueStarGiftValueInfo.initial_sale_date, true), null, null);
            String string = LocaleController.getString(R.string.GiftValueInitialPrice);
            StringBuilder sb2 = new StringBuilder("⭐️");
            sb2.append(uniqueStarGiftValueInfo.initial_sale_stars);
            sb2.append(" (~");
            j01Var2.c(string, ld.Y0(false, a1.g.s(sb2, BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.initial_sale_price, uniqueStarGiftValueInfo.currency), ")"), 0.8f, null), null, null);
            if (TLObject.hasFlag(uniqueStarGiftValueInfo.flags, 1)) {
                j01Var2.c(LocaleController.getString(R.string.GiftValueLastSale), LocaleController.formatYearMonthDay(uniqueStarGiftValueInfo.last_sale_date, true), null, null);
                if (((int) (Math.round((uniqueStarGiftValueInfo.last_sale_price / uniqueStarGiftValueInfo.initial_sale_price) * 1000.0d) / 10)) - 100 > 0) {
                    j01Var2.e(LocaleController.getString(R.string.GiftValueLastPrice), BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.last_sale_price, uniqueStarGiftValueInfo.currency), "+" + LocaleController.formatNumber(round, ' ') + "%", null, null);
                } else {
                    j01Var2.c(LocaleController.getString(R.string.GiftValueLastPrice), BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.last_sale_price, uniqueStarGiftValueInfo.currency), null, null);
                }
            }
            if (TLObject.hasFlag(uniqueStarGiftValueInfo.flags, 4)) {
                x3 x3Var = new x3(s0Var, r10, uniqueStarGiftValueInfo, str2, 0);
                j01Var = j01Var2;
                TableRow e = j01Var.e(LocaleController.getString(R.string.GiftValueMinPrice), BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.floor_price, uniqueStarGiftValueInfo.currency), "?", x3Var, null);
                org.telegram.ui.Components.zc[] zcVarArr = {(org.telegram.ui.Components.zc) ((g01) e.getChildAt(1)).getChildAt(0)};
                e.setOnClickListener(new ah.g0(x3Var, 5));
            } else {
                j01Var = j01Var2;
            }
            if (TLObject.hasFlag(uniqueStarGiftValueInfo.flags, 8)) {
                x3 x3Var2 = new x3(s0Var, r10, uniqueStarGiftValueInfo, str2, 1);
                TableRow e7 = j01Var.e(LocaleController.getString(R.string.GiftValueAveragePrice), BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.average_price, uniqueStarGiftValueInfo.currency), "?", x3Var2, null);
                org.telegram.ui.Components.zc[] zcVarArr2 = {(org.telegram.ui.Components.zc) ((g01) e7.getChildAt(1)).getChildAt(0)};
                e7.setOnClickListener(new ah.g0(x3Var2, 6));
            }
            linearLayout2.addView(frameLayout, w7.z5.t(-1, -2, 7, 0, 0, 0, 12));
            if (uniqueStarGiftValueInfo.listed_count > 0) {
                ei.d dVar = new ei.d(k7Var.getContext(), k7Var.resourcesProvider, false);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                f7 = 1.0f;
                f10 = 2.0f;
                spannableStringBuilder.append((CharSequence) LocaleController.formatNumber(uniqueStarGiftValueInfo.listed_count, ' '));
                spannableStringBuilder.append((CharSequence) " ");
                spannableStringBuilder.append((CharSequence) "e");
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.a6(document, 1.5f, dVar.getTextPaint().getFontMetricsInt()), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                spannableStringBuilder.append((CharSequence) " ");
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.GiftValueOnSaleTelegram));
                dVar.g(AndroidUtilities.replaceArrows(spannableStringBuilder, false, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f)), false, true);
                charSequence = " ";
                linearLayout = linearLayout2;
                dVar.setOnClickListener(new z3(k7Var, str2, j10, 0));
                linearLayout.addView(dVar, w7.z5.t(-1, 42, 7, 0, 0, 0, 2));
            } else {
                linearLayout = linearLayout2;
                charSequence = " ";
                f7 = 1.0f;
                f10 = 2.0f;
            }
            if (uniqueStarGiftValueInfo.fragment_listed_count > 0) {
                ei.d dVar2 = new ei.d(k7Var.getContext(), k7Var.resourcesProvider, false);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                spannableStringBuilder2.append((CharSequence) LocaleController.formatNumber(uniqueStarGiftValueInfo.fragment_listed_count, ' '));
                spannableStringBuilder2.append((CharSequence) "e");
                spannableStringBuilder2.setSpan(new org.telegram.ui.Components.a6(document, 1.5f, dVar2.getTextPaint().getFontMetricsInt()), spannableStringBuilder2.length() - 1, spannableStringBuilder2.length(), 33);
                spannableStringBuilder2.append(charSequence);
                spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.GiftValueOnSaleFragment));
                dVar2.g(AndroidUtilities.replaceArrows(spannableStringBuilder2, false, AndroidUtilities.dp(f10), AndroidUtilities.dp(f7)), false, true);
                dVar2.setOnClickListener(new p(6, k7Var, uniqueStarGiftValueInfo));
                linearLayout.addView(dVar2, w7.z5.t(-1, 42, 7, 0, 0, 0, 0));
            }
            i10.customView = linearLayout;
            i10.show();
        } else if (tL_error != null) {
            k7Var.getBulletinFactory().f0(tL_error, false);
        }
    }

    public static void H0(k7 k7Var, long j10) {
        new yh.p1(k7Var.getContext(), k7Var.currentAccount, j10, null, new i4(k7Var, 1)).show();
    }

    public static void I0(k7 k7Var) {
        Bundle bundle = new Bundle();
        long j10 = k7Var.X;
        if (j10 >= 0) {
            bundle.putLong("user_id", j10);
        } else {
            bundle.putLong("chat_id", -j10);
        }
        if (j10 == UserConfig.getInstance(k7Var.currentAccount).getClientUserId()) {
            bundle.putBoolean("my_profile", true);
        }
        bundle.putBoolean("open_gifts", true);
        bundle.putBoolean("open_gifts_upgradable", true);
        v2(new ProfileActivity(bundle, null));
    }

    public static void J0(k7 k7Var, TLObject tLObject, MessageObject messageObject) {
        TLRPC.Message message;
        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
        MessagesController.getInstance(k7Var.currentAccount).putUsers(messages_messages.users, false);
        MessagesController.getInstance(k7Var.currentAccount).putChats(messages_messages.chats, false);
        k7Var.M0 = true;
        k7Var.L0 = false;
        Boolean bool = k7Var.f1688m1;
        if (bool != null && (message = messageObject.messageOwner) != null) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                ((TLRPC.TL_messageActionStarGift) messageAction).saved = true ^ bool.booleanValue();
            } else if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                ((TLRPC.TL_messageActionStarGiftUnique) messageAction).saved = true ^ bool.booleanValue();
            }
        }
        k7Var.B2(messageObject, null);
    }

    public static void K0(k7 k7Var, pf.c cVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(k7Var.currentAccount).lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
            AndroidUtilities.runOnUIThread(new a3.l0(k7Var, cVar, tL_starGiftUnique, 4));
            return;
        }
        k7Var.getClass();
        if (tL_error != null && tL_error.text.startsWith("STARGIFT_RESELL_TOO_EARLY_")) {
            AndroidUtilities.runOnUIThread(new a3.i0(k7Var, cVar, Long.parseLong(tL_error.text.substring(26)), 1));
        } else if (tL_error != null) {
            AndroidUtilities.runOnUIThread(new a3.l0(k7Var, cVar, tL_error, 5));
        }
    }

    public static boolean K1(TL_stars.SavedStarGift savedStarGift, TL_stars.SavedStarGift savedStarGift2) {
        if (savedStarGift != savedStarGift2) {
            if (savedStarGift != null) {
                TL_stars.StarGift starGift = savedStarGift.gift;
                TL_stars.StarGift starGift2 = savedStarGift2.gift;
                if (starGift != starGift2) {
                    if ((starGift instanceof TL_stars.TL_starGiftUnique) && (starGift2 instanceof TL_stars.TL_starGiftUnique)) {
                        if (starGift.f20496id == starGift2.f20496id) {
                            return true;
                        }
                        return false;
                    } else if ((starGift instanceof TL_stars.TL_starGift) && (starGift2 instanceof TL_stars.TL_starGift) && starGift.f20496id == starGift2.f20496id && savedStarGift.date == savedStarGift2.date) {
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

    public static void K2(android.content.Context r19, int r20, org.telegram.ui.Components.xc r21, org.telegram.ui.ActionBar.d6 r22, org.telegram.tgnet.tl.TL_stars.TL_starGiftUnique r23) {
        throw new UnsupportedOperationException("Method not decompiled: ai.k7.K2(android.content.Context, int, org.telegram.ui.Components.xc, org.telegram.ui.ActionBar.d6, org.telegram.tgnet.tl.TL_stars$TL_starGiftUnique):void");
    }

    public static void L0(k7 k7Var, String str) {
        Context context = k7Var.getContext();
        pf.d.t(context, MessagesController.getInstance(k7Var.currentAccount).tonBlockchainExplorerUrl + str);
    }

    public static boolean L1(TL_stars.TL_starGiftUnique tL_starGiftUnique, TL_stars.TL_starGiftUnique tL_starGiftUnique2) {
        if (tL_starGiftUnique != tL_starGiftUnique2) {
            if (tL_starGiftUnique != null) {
                if (tL_starGiftUnique.f20496id == tL_starGiftUnique2.f20496id || TextUtils.equals(tL_starGiftUnique.slug, tL_starGiftUnique2.slug)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public static void M0(k7 k7Var, String str) {
        Context context = k7Var.getContext();
        pf.d.t(context, MessagesController.getInstance(k7Var.currentAccount).tonBlockchainExplorerUrl + str);
    }

    public static void N0(k7 k7Var, pf.c cVar, ug.l1 l1Var, r3 r3Var, TL_stars.starGiftDepositPayload stargiftdepositpayload, TLRPC.TL_error tL_error) {
        org.telegram.ui.Components.xc bulletinFactory;
        if (stargiftdepositpayload == null) {
            cVar.b();
            if (l1Var != null) {
                bulletinFactory = new org.telegram.ui.Components.xc(l1Var.container, k7Var.resourcesProvider);
            } else {
                bulletinFactory = k7Var.getBulletinFactory();
            }
            bulletinFactory.f0(tL_error, false);
            return;
        }
        r3Var.run(stargiftdepositpayload);
    }

    public static void O0(k7 k7Var, Long l4) {
        String str;
        String formatString;
        TLRPC.Chat chat;
        if (l4.longValue() < 0 && (chat = MessagesController.getInstance(k7Var.currentAccount).getChat(Long.valueOf(-l4.longValue()))) != null) {
            str = chat.title;
        } else {
            str = "";
        }
        org.telegram.ui.Components.xc bulletinFactory = k7Var.getBulletinFactory();
        int i10 = R.raw.contact_check;
        if (TextUtils.isEmpty(str)) {
            formatString = LocaleController.getString(R.string.GiftRepostedToProfile);
        } else {
            formatString = LocaleController.formatString(R.string.GiftRepostedToChannelProfile, str);
        }
        org.telegram.ui.Components.qc Q = bulletinFactory.Q(i10, 36, AndroidUtilities.replaceTags(formatString));
        Q.f29649t = true;
        Q.j();
    }

    public static boolean P0(k7 k7Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, ey eyVar, ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return false;
        }
        long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        long giftThemeUser = ChatThemeController.getInstance(k7Var.currentAccount).getGiftThemeUser(tL_starGiftUnique.slug);
        if (giftThemeUser != 0 && giftThemeUser != j10) {
            org.telegram.ui.Components.f5.m0(k7Var.getContext(), k7Var.resourcesProvider, k7Var.currentAccount, tL_starGiftUnique, giftThemeUser, new c3(k7Var, j10, tL_starGiftUnique, eyVar, 1));
            return true;
        }
        ChatThemeController.getInstance(k7Var.currentAccount).setDialogTheme(j10, new gg.b(null, tL_starGiftUnique.slug));
        eyVar.presentFragment(sn.W9(j10), true);
        return true;
    }

    public static void Q(k7 k7Var, String str) {
        Context context = k7Var.getContext();
        pf.d.t(context, MessagesController.getInstance(k7Var.currentAccount).tonBlockchainExplorerUrl + str);
    }

    public static void Q0(k7 k7Var, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TL_stars.TL_payments_uniqueStarGift) {
            TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift = (TL_stars.TL_payments_uniqueStarGift) tLObject;
            MessagesController.getInstance(k7Var.currentAccount).putUsers(tL_payments_uniqueStarGift.users, false);
            MessagesController.getInstance(k7Var.currentAccount).putChats(tL_payments_uniqueStarGift.chats, false);
            if (tL_payments_uniqueStarGift.gift instanceof TL_stars.TL_starGiftUnique) {
                AndroidUtilities.runOnUIThread(new a1.f(15, k7Var, tL_payments_uniqueStarGift));
                return;
            }
        }
        AndroidUtilities.runOnUIThread(new a1.f(16, b2Var, tL_error));
    }

    public static String Q1(TL_stars.StarGift starGift) {
        if (starGift instanceof TL_stars.TL_starGiftUnique) {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(tL_starGiftUnique.title);
            sb2.append(" #");
            return org.telegram.messenger.q.h(tL_starGiftUnique.num, ',', sb2);
        } else if ((starGift instanceof TL_stars.TL_starGift) && !TextUtils.isEmpty(starGift.title)) {
            return starGift.title;
        } else {
            return LocaleController.getString(R.string.Gift2Gift);
        }
    }

    public static void R(k7 k7Var, TLObject tLObject, long j10, long j11, Utilities.Callback callback, TLRPC.TL_error tL_error, long j12) {
        if (tLObject instanceof TLRPC.TL_payments_paymentResult) {
            TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) tLObject;
            MessagesController.getInstance(k7Var.currentAccount).putUsers(tL_payments_paymentResult.updates.users, false);
            MessagesController.getInstance(k7Var.currentAccount).putChats(tL_payments_paymentResult.updates.chats, false);
            fa.y(k7Var.currentAccount, false).T(false);
            fa.y(k7Var.currentAccount, false).Q(j10);
            fa.y(k7Var.currentAccount, false).Q(j11);
            fa.y(k7Var.currentAccount, false).P();
            callback.run(null);
            org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
            if (U != null) {
                if (j10 >= 0 && j11 >= 0) {
                    sn W9 = sn.W9(j10);
                    W9.whenFullyVisible(new p3(k7Var, W9, j10, 1));
                    U.presentFragment(W9);
                } else {
                    org.telegram.ui.Components.qc M = org.telegram.ui.Components.xc.a0(U).M(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, k7Var.P1(), DialogObject.getShortName(j10))), R.raw.forward);
                    M.f29649t = true;
                    M.j();
                }
            }
            Utilities.stageQueue.postRunnable(new h4(k7Var, tL_payments_paymentResult, 1));
        } else if (tL_error != null && "BALANCE_TOO_LOW".equals(tL_error.text)) {
            if (!MessagesController.getInstance(k7Var.currentAccount).starsPurchaseAvailable()) {
                k7Var.f1685k0.setLoading(false);
                fa.e0(k7Var.getContext(), k7Var.resourcesProvider);
                return;
            }
            fa y3 = fa.y(k7Var.currentAccount, false);
            a3.h0 h0Var = new a3.h0(k7Var, j12, j10, callback, 1);
            y3.e = false;
            y3.q(false, true, h0Var);
            y3.e = true;
        } else {
            callback.run(tL_error);
            k7Var.getBulletinFactory().f0(tL_error, false);
        }
    }

    public static void R0(k7 k7Var, MessageObject messageObject, ArrayList arrayList, TL_stars.StarGift starGift) {
        k7Var.l1 = true;
        k7Var.B2(messageObject, null);
        k7Var.M2(0, true, null);
        z00 z00Var = k7Var.f1665a0;
        if (z00Var != null) {
            z00Var.c(true);
        }
        fa.y(k7Var.currentAccount, false).P();
        x9 G = fa.y(k7Var.currentAccount, false).G(UserConfig.getInstance(k7Var.currentAccount).getClientUserId(), false);
        if (G != null) {
            G.k(arrayList, starGift);
        }
    }

    public static void S(k7 k7Var, TLObject tLObject, String str, TL_stars.InputSavedStarGift inputSavedStarGift, TLRPC.TL_error tL_error, long j10) {
        TL_stars.SavedStarGift savedStarGift;
        if (tLObject instanceof TLRPC.TL_payments_paymentResult) {
            TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) tLObject;
            MessagesController.getInstance(k7Var.currentAccount).putUsers(tL_payments_paymentResult.updates.users, false);
            MessagesController.getInstance(k7Var.currentAccount).putChats(tL_payments_paymentResult.updates.chats, false);
            fa.y(k7Var.currentAccount, false).T(false);
            fa.y(k7Var.currentAccount, false).P();
            if (!TextUtils.isEmpty(str) && (savedStarGift = k7Var.F0) != null) {
                savedStarGift.flags &= -65537;
                savedStarGift.prepaid_upgrade_hash = null;
            }
            k7Var.f1697r0 = true;
            k7Var.f1700s1 = null;
            k7Var.D1(inputSavedStarGift, tL_payments_paymentResult.updates, new g4(k7Var, str, 0));
            Utilities.stageQueue.postRunnable(new h4(k7Var, tL_payments_paymentResult, 0));
        } else if (tL_error != null && "BALANCE_TOO_LOW".equals(tL_error.text)) {
            if (!MessagesController.getInstance(k7Var.currentAccount).starsPurchaseAvailable()) {
                k7Var.f1685k0.setLoading(false);
                fa.e0(k7Var.getContext(), k7Var.resourcesProvider);
                return;
            }
            fa y3 = fa.y(k7Var.currentAccount, false);
            d2 d2Var = new d2(k7Var, j10, 6);
            y3.e = false;
            y3.q(false, true, d2Var);
            y3.e = true;
        } else {
            k7Var.getBulletinFactory().f0(tL_error, false);
        }
    }

    public static void S0(k7 k7Var, boolean[] zArr, TextView textView, TL_stars.starGiftDepositPayload[] stargiftdepositpayloadArr, Runnable[] runnableArr, TL_stars.starGiftDepositPayload stargiftdepositpayload) {
        Runnable jVar;
        if (zArr[0]) {
            return;
        }
        if (stargiftdepositpayload == null) {
            textView.setVisibility(8);
            return;
        }
        stargiftdepositpayloadArr[0] = stargiftdepositpayload;
        if (org.telegram.ui.Wallet.m0.w(k7Var.currentAccount).u() < stargiftdepositpayload.amount) {
            textView.setVisibility(8);
            return;
        }
        org.telegram.ui.Wallet.m0 w9 = org.telegram.ui.Wallet.m0.w(k7Var.currentAccount);
        q qVar = new q(textView, 4);
        try {
            boolean[] zArr2 = new boolean[1];
            w9.j0(new org.telegram.ui.Wallet.z6(w9, zArr2, qVar, org.telegram.ui.Wallet.m0.g(stargiftdepositpayload), 4));
            jVar = new org.telegram.ui.Wallet.n(zArr2, 3);
        } catch (Exception e) {
            org.telegram.ui.Wallet.m0.j("emulateDepositNFT: invalid payload", e);
            AndroidUtilities.runOnUIThread(new m71(27, qVar, e));
            jVar = new ah.j(23);
        }
        runnableArr[0] = jVar;
    }

    public static void T(k7 k7Var, int i10, int i11, int i12, ug.l1[] l1VarArr, TL_stars.TL_starGiftUnique tL_starGiftUnique, Long l4) {
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
                a3.l0 l0Var = new a3.l0(k7Var, l4, l1VarArr, 3);
                if (l4.longValue() < 0) {
                    TLRPC.ChatFull chatFull = MessagesController.getInstance(k7Var.currentAccount).getChatFull(-l4.longValue());
                    if (chatFull == null) {
                        TLRPC.TL_channels_getFullChannel tL_channels_getFullChannel = new TLRPC.TL_channels_getFullChannel();
                        tL_channels_getFullChannel.channel = MessagesController.getInstance(k7Var.currentAccount).getInputChannel(-l4.longValue());
                        ConnectionsManager.getInstance(k7Var.currentAccount).sendRequest(tL_channels_getFullChannel, new g(2, k7Var, l0Var));
                        return;
                    } else if (!chatFull.stargifts_available) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(k7Var.getContext(), 0, k7Var.resourcesProvider);
                        String string = LocaleController.getString(R.string.Gift2ChannelDoesntSupportGiftsTitle);
                        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20601a;
                        b2Var.R = string;
                        b2Var.T = LocaleController.getString(R.string.Gift2ChannelDoesntSupportGiftsText);
                        org.telegram.messenger.q.p(R.string.OK, alertDialog$Builder, null);
                        return;
                    }
                } else if (l4.longValue() >= 0) {
                    TLRPC.User user = MessagesController.getInstance(k7Var.currentAccount).getUser(l4);
                    TLRPC.UserFull userFull = MessagesController.getInstance(k7Var.currentAccount).getUserFull(l4.longValue());
                    if (userFull != null && (disallowedGiftsSettings = userFull.disallowed_stargifts) != null && disallowedGiftsSettings.disallow_unique_stargifts) {
                        new org.telegram.ui.Components.xc(l1VarArr[0].container, k7Var.resourcesProvider).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(l4.longValue())))).j();
                        return;
                    } else if (userFull == null && user != null) {
                        TLRPC.TL_users_getFullUser tL_users_getFullUser = new TLRPC.TL_users_getFullUser();
                        tL_users_getFullUser.f20412id = MessagesController.getInstance(k7Var.currentAccount).getInputUser(user);
                        ConnectionsManager.getInstance(k7Var.currentAccount).sendRequest(tL_users_getFullUser, new x2(k7Var, l1VarArr, l4, l0Var, 1));
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
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(k7Var.getContext(), 0, k7Var.resourcesProvider);
            String string2 = LocaleController.getString(R.string.Gift2ExportTONUnlocksAlertTitle);
            org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.f20601a;
            b2Var2.R = string2;
            b2Var2.T = LocaleController.formatPluralString("Gift2ExportTONUnlocksAlertText", Math.max(1, i12), new Object[0]);
            org.telegram.messenger.q.p(R.string.OK, alertDialog$Builder2, null);
        } else if (l4.longValue() == -98) {
            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(k7Var.getContext(), 0, k7Var.resourcesProvider);
            String string3 = LocaleController.getString(R.string.Gift2MoveToMyWallet);
            org.telegram.ui.ActionBar.b2 b2Var3 = alertDialog$Builder3.f20601a;
            b2Var3.R = string3;
            b2Var3.T = LocaleController.getString(R.string.Gift2MoveToMyWalletText);
            String s10 = org.telegram.ui.Wallet.m0.w(k7Var.currentAccount).s();
            LinearLayout linearLayout = new LinearLayout(k7Var.getContext());
            linearLayout.setOrientation(1);
            if (!TextUtils.isEmpty(s10)) {
                TextView textView = new TextView(k7Var.getContext());
                textView.setTypeface(AndroidUtilities.getTypeface("fonts/rmono.ttf"));
                textView.setTextSize(1, 16.5f);
                textView.setLetterSpacing(0.01818182f);
                textView.setLineSpacing(AndroidUtilities.dp(23.0f) - textView.getPaint().getFontMetricsInt(null), 1.0f);
                textView.setIncludeFontPadding(false);
                textView.setGravity(17);
                textView.setPadding(0, AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f));
                int w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21092j5, k7Var.resourcesProvider);
                textView.setBackground(org.telegram.ui.ActionBar.h6.c0(AndroidUtilities.dp(20.0f), org.telegram.ui.ActionBar.h6.m1(0.045f, w02)));
                int w03 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21242r5, k7Var.resourcesProvider);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                int length = (s10.length() + 3) / 4;
                for (int i17 = 0; i17 < length; i17++) {
                    if (i17 > 0) {
                        if (i17 % 4 == 0) {
                            str = "\n";
                        } else {
                            str = " ";
                        }
                        spannableStringBuilder.append((CharSequence) str);
                    }
                    int length2 = spannableStringBuilder.length();
                    int i18 = i17 * 4;
                    spannableStringBuilder.append((CharSequence) s10, i18, Math.min(s10.length(), i18 + 4));
                    if (((i17 / 4) + (i17 % 4)) % 2 == 0) {
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
            }
            TextView textView2 = new TextView(k7Var.getContext());
            textView2.setTextSize(1, 15.0f);
            org.telegram.ui.Cells.t0.q(org.telegram.ui.ActionBar.h6.f21092j5, k7Var.resourcesProvider, textView2, 17);
            textView2.setText(LocaleController.getString(R.string.Gift2MoveAppearIn));
            linearLayout.addView(textView2, w7.z5.k(24.0f, 0.0f, 24.0f, 0.0f, -1, -2));
            LinearLayout linearLayout2 = new LinearLayout(k7Var.getContext());
            linearLayout2.setOrientation(0);
            linearLayout2.setGravity(16);
            int w04 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21242r5, k7Var.resourcesProvider);
            k7Var.C1(linearLayout2, R.drawable.msg_settings, 14, w04, LocaleController.getString(R.string.Settings), true);
            k7Var.C1(linearLayout2, R.drawable.mini_gram_14, 15, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Oh, k7Var.resourcesProvider), LocaleController.getString(R.string.WalletAttachMoney), true);
            k7Var.C1(linearLayout2, R.drawable.menu_gift, 14, w04, LocaleController.getString(R.string.WalletCollectibles), false);
            linearLayout.addView(linearLayout2, w7.z5.t(-2, -2, 1, 0, 7, 0, 3));
            k7Var.f1710x1 = true;
            org.telegram.ui.Cells.a2 a2Var = new org.telegram.ui.Cells.a2(k7Var.getContext(), 1, k7Var.resourcesProvider);
            a2Var.setBackground(org.telegram.ui.ActionBar.h6.g0(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21075i6, k7Var.resourcesProvider), 7, AndroidUtilities.dp(12.0f)));
            a2Var.setMultiline(true);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) a2Var.getCheckBoxView().getLayoutParams();
            layoutParams.topMargin = 0;
            if (LocaleController.isRTL) {
                i14 = 5;
            } else {
                i14 = 3;
            }
            layoutParams.gravity = i14 | 16;
            a2Var.getCheckBoxView().setLayoutParams(layoutParams);
            a2Var.e(LocaleController.getString(R.string.Gift2KeepOnProfile), "", true, false, false);
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
            a2Var.setPadding(i15, dp2, dp, AndroidUtilities.dp(12.0f));
            a2Var.setOnClickListener(new p(5, k7Var, a2Var));
            linearLayout.addView(a2Var, w7.z5.k(8.0f, 4.0f, 8.0f, 0.0f, -1, -2));
            alertDialog$Builder3.n(linearLayout);
            b2Var3.G = 20;
            alertDialog$Builder3.k(LocaleController.getString(R.string.Gift2Move), new org.telegram.ui.ActionBar.a2(k7Var) {
                public final k7 f2516b;

                {
                    this.f2516b = k7Var;
                }

                @Override
                public final void g(org.telegram.ui.ActionBar.b2 b2Var4, int i19) {
                    switch (r3) {
                        case 0:
                            pf.c g10 = b2Var4.g(i19, true, true);
                            ug.l1 l1Var = l1VarArr2[0];
                            Objects.requireNonNull(l1Var);
                            this.f2516b.L2(true, b2Var4, g10, new ug.y0(l1Var, 11));
                            return;
                        default:
                            pf.c g11 = b2Var4.g(i19, true, true);
                            ug.l1 l1Var2 = l1VarArr2[0];
                            Objects.requireNonNull(l1Var2);
                            this.f2516b.L2(false, b2Var4, g11, new ug.y0(l1Var2, 11));
                            return;
                    }
                }
            });
            i0.a.r(R.string.Cancel, alertDialog$Builder3, null);
        } else {
            LinearLayout linearLayout3 = new LinearLayout(k7Var.getContext());
            linearLayout3.setOrientation(1);
            linearLayout3.addView(new f6(k7Var.getContext(), tL_starGiftUnique), w7.z5.t(-1, -2, 48, 0, -4, 0, 0));
            TextView textView3 = new TextView(k7Var.getContext());
            int i19 = org.telegram.ui.ActionBar.h6.f21092j5;
            org.telegram.ui.Cells.t0.r(i19, k7Var.resourcesProvider, textView3, 1, 20.0f);
            textView3.setText(LocaleController.getString(R.string.Gift2ExportTONFragmentTitle));
            linearLayout3.addView(textView3, w7.z5.t(-1, -2, 48, 24, 4, 24, 14));
            TextView textView4 = new TextView(k7Var.getContext());
            wh.o(i19, k7Var.resourcesProvider, textView4, 1, 16.0f);
            wh.r(R.string.Gift2ExportTONFragmentText, new Object[]{k7Var.P1()}, textView4);
            linearLayout3.addView(textView4, w7.z5.t(-1, -2, 48, 24, 0, 24, 4));
            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(k7Var.getContext(), 0, k7Var.resourcesProvider);
            alertDialog$Builder4.n(linearLayout3);
            alertDialog$Builder4.k(LocaleController.getString(R.string.Gift2ExportTONFragmentOpen), new org.telegram.ui.ActionBar.a2(k7Var) {
                public final k7 f2516b;

                {
                    this.f2516b = k7Var;
                }

                @Override
                public final void g(org.telegram.ui.ActionBar.b2 b2Var4, int i192) {
                    switch (r3) {
                        case 0:
                            pf.c g10 = b2Var4.g(i192, true, true);
                            ug.l1 l1Var = l1VarArr2[0];
                            Objects.requireNonNull(l1Var);
                            this.f2516b.L2(true, b2Var4, g10, new ug.y0(l1Var, 11));
                            return;
                        default:
                            pf.c g11 = b2Var4.g(i192, true, true);
                            ug.l1 l1Var2 = l1VarArr2[0];
                            Objects.requireNonNull(l1Var2);
                            this.f2516b.L2(false, b2Var4, g11, new ug.y0(l1Var2, 11));
                            return;
                    }
                }
            });
            i0.a.r(R.string.Cancel, alertDialog$Builder4, null);
        }
    }

    public static void T0(k7 k7Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, ag.a aVar, Runnable runnable) {
        TL_stars.StarsAmount o10 = aVar.o();
        TL_stars.updateStarGiftPrice updatestargiftprice = new TL_stars.updateStarGiftPrice();
        updatestargiftprice.stargift = k7Var.R1();
        updatestargiftprice.resell_amount = o10;
        ConnectionsManager.getInstance(k7Var.currentAccount).sendRequest(updatestargiftprice, new r2(k7Var, tL_starGiftUnique, aVar, runnable, 1));
    }

    public static void U(k7 k7Var, org.telegram.ui.ActionBar.b2 b2Var, MessageObject messageObject) {
        b2Var.dismiss();
        k7Var.M0 = true;
        k7Var.B2(messageObject, null);
        super.show();
    }

    public static void U0(k7 k7Var, TLObject tLObject, ug.l1[] l1VarArr, Long l4, a3.l0 l0Var, TLRPC.TL_error tL_error) {
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        if (tLObject instanceof TLRPC.TL_users_userFull) {
            TLRPC.TL_users_userFull tL_users_userFull = (TLRPC.TL_users_userFull) tLObject;
            MessagesController.getInstance(k7Var.currentAccount).putUsers(tL_users_userFull.users, false);
            MessagesController.getInstance(k7Var.currentAccount).putChats(tL_users_userFull.chats, false);
            TLRPC.UserFull userFull = tL_users_userFull.full_user;
            if (userFull != null && (disallowedGiftsSettings = userFull.disallowed_stargifts) != null && disallowedGiftsSettings.disallow_unique_stargifts) {
                new org.telegram.ui.Components.xc(l1VarArr[0].container, k7Var.resourcesProvider).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(l4.longValue())))).j();
                return;
            } else {
                l0Var.run();
                return;
            }
        }
        org.telegram.ui.Components.qc Y = k7Var.getBulletinFactory().Y(tL_error);
        Y.f29649t = true;
        Y.j();
    }

    public static void V(k7 k7Var, long j10) {
        new yh.p1(k7Var.getContext(), k7Var.currentAccount, j10, null, new i4(k7Var, 1)).show();
    }

    public static void W(k7 k7Var) {
        TL_stars.SavedStarGift savedStarGift = k7Var.F0;
        if (savedStarGift.unsaved) {
            savedStarGift.unsaved = false;
            v9 F = fa.y(k7Var.currentAccount, false).F(k7Var.X, false);
            if (F != null) {
                TL_stars.SavedStarGift savedStarGift2 = k7Var.F0;
                F.m(savedStarGift2, savedStarGift2.unsaved);
            }
            TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
            savestargift.stargift = k7Var.R1();
            savestargift.unsave = k7Var.F0.unsaved;
            ConnectionsManager.getInstance(k7Var.currentAccount).sendRequest(savestargift, null, 64);
        }
        TL_stars.SavedStarGift savedStarGift3 = k7Var.F0;
        boolean z10 = savedStarGift3.pinned_to_top;
        if (((x9) k7Var.G0).n(savedStarGift3, !z10, false)) {
            new yh.p2(k7Var.getContext(), k7Var.X, k7Var.F0, k7Var.resourcesProvider, new Utilities.Callback0Return() {
                @Override
                public final Object run() {
                    return k7.this.getBulletinFactory();
                }
            }).show();
        } else if (!z10) {
            k7Var.getBulletinFactory().M(LocaleController.getString(R.string.Gift2PinnedTitle), LocaleController.getString(R.string.Gift2PinnedSubtitle), R.raw.ic_pin).j();
        } else {
            org.telegram.messenger.q.q(R.string.Gift2Unpinned, k7Var.getBulletinFactory(), R.raw.ic_unpin, 36);
        }
    }

    public static void W0(ai.k7 r9, android.view.View r10) {
        throw new UnsupportedOperationException("Method not decompiled: ai.k7.W0(ai.k7, android.view.View):void");
    }

    public static String W1(TL_stars.StarGiftAttributeRarity starGiftAttributeRarity, Integer[] numArr) {
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

    public static void X(k7 k7Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, org.telegram.ui.ActionBar.b2 b2Var) {
        k7Var.getClass();
        pf.c g10 = b2Var.g(-1, true, true);
        g10.d();
        TL_stars.updateStarGiftPrice updatestargiftprice = new TL_stars.updateStarGiftPrice();
        updatestargiftprice.stargift = k7Var.R1();
        updatestargiftprice.resell_amount = TL_stars.StarsAmount.ofStars(0L);
        ConnectionsManager.getInstance(k7Var.currentAccount).sendRequest(updatestargiftprice, new p2(k7Var, g10, tL_starGiftUnique, 1));
    }

    public static void X0(k7 k7Var, TL_stars.StarGift starGift, TL_stars.StarGiftAttribute starGiftAttribute, org.telegram.ui.Components.zc[] zcVarArr, boolean[] zArr, ArrayList arrayList) {
        if (arrayList != null) {
            new a2(k7Var.getContext(), k7Var.resourcesProvider, k7Var.currentAccount, starGift.title, arrayList, false).show();
        } else {
            k7Var.I2(zcVarArr[0], LocaleController.formatString(R.string.Gift2RarityHint, gi.l.H0(starGiftAttribute.getRarityPermille())), false);
        }
        zArr[0] = false;
    }

    public static void Y(k7 k7Var, long j10, TL_stars.TL_starGiftUnique tL_starGiftUnique, ey eyVar) {
        ChatThemeController.getInstance(k7Var.currentAccount).setDialogTheme(j10, new gg.b(null, tL_starGiftUnique.slug));
        eyVar.presentFragment(sn.W9(j10), true);
    }

    public static void Y0(k7 k7Var, TLRPC.TL_messageActionStarGift tL_messageActionStarGift, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject) {
        MessageObject messageObject;
        if (tLObject instanceof TLRPC.messages_Messages) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            MessagesController.getInstance(k7Var.currentAccount).putUsers(messages_messages.users, false);
            MessagesController.getInstance(k7Var.currentAccount).putChats(messages_messages.chats, false);
            for (int i10 = 0; i10 < messages_messages.messages.size(); i10++) {
                TLRPC.Message message = messages_messages.messages.get(i10);
                if (message != null && !(message instanceof TLRPC.TL_messageEmpty) && message.f20293id == tL_messageActionStarGift.upgrade_msg_id) {
                    messageObject = new MessageObject(k7Var.currentAccount, message, false, false);
                    messageObject.setType();
                    break;
                }
            }
        }
        messageObject = null;
        if (messageObject != null) {
            AndroidUtilities.runOnUIThread(new a3.l0(k7Var, b2Var, messageObject, 9));
        } else {
            AndroidUtilities.runOnUIThread(new u4(b2Var, 0));
        }
    }

    public static void Z(k7 k7Var, pf.c cVar, ug.l1 l1Var, String str) {
        org.telegram.ui.Components.xc bulletinFactory;
        cVar.b();
        if (str != null) {
            if (l1Var != null) {
                bulletinFactory = new org.telegram.ui.Components.xc(l1Var.container, k7Var.resourcesProvider);
            } else {
                bulletinFactory = k7Var.getBulletinFactory();
            }
            bulletinFactory.e0(str, false);
            return;
        }
        if (l1Var != null) {
            l1Var.dismiss();
        }
        k7Var.dismiss();
        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
        if (U instanceof org.telegram.ui.Wallet.l5) {
            ((org.telegram.ui.Wallet.l5) U).I0();
        }
    }

    public static void Z0(k7 k7Var, TLObject tLObject, boolean z10, TLRPC.Document document, boolean z11, TLRPC.TL_error tL_error, TL_stars.saveStarGift savestargift) {
        v9 F;
        int i10;
        int i11;
        int i12;
        int i13;
        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
        if (U != null) {
            ah.k1 k1Var = null;
            if (tLObject instanceof TLRPC.TL_boolTrue) {
                k7Var.dismiss();
                long N1 = k7Var.N1();
                if (!z10) {
                    fa.y(k7Var.currentAccount, false).Q(N1);
                }
                if (N1 >= 0) {
                    org.telegram.ui.Components.xc a02 = org.telegram.ui.Components.xc.a0(U);
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
                        k1Var = new ah.k1(N1, U);
                    }
                    a02.s(document, string, AndroidUtilities.replaceSingleTag(string2, k1Var)).k(true);
                    return;
                }
                org.telegram.ui.Components.xc a03 = org.telegram.ui.Components.xc.a0(U);
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
                if (z10 && k7Var.F0 != null && (F = fa.y(k7Var.currentAccount, false).F(k7Var.X, false)) != null) {
                    F.m(k7Var.F0, !savestargift.unsave);
                }
                k7Var.getBulletinFactory().t(LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text), null).k(false);
            }
        }
    }

    public static void a0(k7 k7Var) {
        boolean z10;
        TLRPC.Document document;
        boolean z11;
        v9 F;
        TLRPC.Message message;
        ei.d dVar = k7Var.f1685k0;
        if (!dVar.N) {
            TL_stars.InputSavedStarGift R1 = k7Var.R1();
            MessageObject messageObject = k7Var.H0;
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
                TL_stars.SavedStarGift savedStarGift = k7Var.F0;
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
            savestargift.stargift = R1;
            if (k7Var.F0 != null && (F = fa.y(k7Var.currentAccount, false).F(k7Var.X, false)) != null) {
                F.m(k7Var.F0, savestargift.unsave);
                z11 = true;
            } else {
                z11 = false;
            }
            ConnectionsManager.getInstance(k7Var.currentAccount).sendRequest(savestargift, new w4(k7Var, z11, document2, z12, savestargift));
        }
    }

    public static void a1(k7 k7Var, TL_stars.InputSavedStarGift inputSavedStarGift, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            MessagesController.getInstance(k7Var.currentAccount).putUsers(updates.users, false);
            MessagesController.getInstance(k7Var.currentAccount).putChats(updates.chats, false);
        }
        AndroidUtilities.runOnUIThread(new y0(k7Var, tL_error, tLObject, inputSavedStarGift, 4));
    }

    public static boolean a2(int i10, long j10) {
        if (j10 >= 0) {
            if (UserConfig.getInstance(i10).getClientUserId() == j10) {
                return true;
            }
            return false;
        }
        return ChatObject.canUserDoAction(MessagesController.getInstance(i10).getChat(Long.valueOf(-j10)), 5);
    }

    public static void b0(k7 k7Var) {
        int i10;
        long j10;
        long j11;
        long j12;
        String string;
        final long clientUserId = UserConfig.getInstance(k7Var.currentAccount).getClientUserId();
        final TL_stars.InputSavedStarGift R1 = k7Var.R1();
        if (R1 != null) {
            MessageObject messageObject = k7Var.H0;
            if (messageObject != null) {
                i10 = messageObject.messageOwner.date;
                boolean isOutOwner = messageObject.isOutOwner();
                MessageObject messageObject2 = k7Var.H0;
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
                            j10 = k7Var.H0.getDialogId();
                        }
                        j11 = tL_messageActionStarGift.convert_stars;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                TL_stars.SavedStarGift savedStarGift = k7Var.F0;
                if (savedStarGift != null) {
                    i10 = savedStarGift.date;
                    if ((savedStarGift.flags & 2) != 0 && !savedStarGift.name_hidden) {
                        j10 = DialogObject.getPeerDialogId(savedStarGift.from_id);
                    } else {
                        j10 = 2666000;
                    }
                    j11 = k7Var.F0.convert_stars;
                    j12 = k7Var.X;
                } else {
                    return;
                }
            }
            int max = Math.max(1, (MessagesController.getInstance(k7Var.currentAccount).stargiftsConvertPeriodMax - (ConnectionsManager.getInstance(k7Var.currentAccount).getCurrentTime() - i10)) / 86400);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(k7Var.getContext(), 0, k7Var.resourcesProvider);
            String string2 = LocaleController.getString(R.string.Gift2ConvertTitle);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20601a;
            b2Var.R = string2;
            if (!UserObject.isService(j10) && j10 != 2666000) {
                string = DialogObject.getShortName(j10);
            } else {
                string = LocaleController.getString(R.string.StarsTransactionHidden);
            }
            b2Var.T = AndroidUtilities.replaceTags(LocaleController.formatPluralString("Gift2ConvertText2", max, string, LocaleController.formatPluralStringComma("Gift2ConvertStars", (int) j11)));
            final long j13 = j11;
            final long j14 = j12;
            alertDialog$Builder.k(LocaleController.getString(R.string.Gift2ConvertButton), new org.telegram.ui.ActionBar.a2() {
                @Override
                public final void g(org.telegram.ui.ActionBar.b2 b2Var2, int i11) {
                    k7.v0(k7.this, R1, j14, clientUserId, j13);
                }
            });
            i0.a.r(R.string.Cancel, alertDialog$Builder, null);
        }
    }

    public static void b1(k7 k7Var, long j10, long j11, Utilities.Callback callback) {
        bd bdVar = new bd(k7Var.getContext(), k7Var.resourcesProvider, j10, 11, null, new c3(k7Var, new boolean[]{false}, j11, callback, 2), 0L);
        bdVar.setOnDismissListener(new n4(k7Var, 1));
        bdVar.show();
    }

    public static boolean b2(int i10, long j10) {
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

    public static void c0(k7 k7Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.PaymentForm paymentForm, TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails, long j10, CharSequence charSequence, org.telegram.ui.ActionBar.b2 b2Var) {
        pf.c g10 = b2Var.g(-1, true, true);
        g10.d();
        TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
        tL_payments_sendStarsForm.form_id = paymentForm.form_id;
        tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftDropOriginalDetails;
        ConnectionsManager.getInstance(k7Var.currentAccount).sendRequest(tL_payments_sendStarsForm, new k4(k7Var, g10, b2Var, tL_starGiftUnique, j10, charSequence));
    }

    public static void c1(k7 k7Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        b2 b2Var = k7Var.f1704u1;
        k7Var.f1698r1 = false;
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            MessagesController.getInstance(k7Var.currentAccount).putUsers(paymentForm.users, false);
            k7Var.f1700s1 = paymentForm;
            AndroidUtilities.cancelRunOnUIThread(b2Var);
            AndroidUtilities.runOnUIThread(b2Var);
            return;
        }
        org.telegram.ui.Components.qc Y = k7Var.getBulletinFactory().Y(tL_error);
        Y.f29649t = true;
        Y.j();
    }

    public static boolean c2(int i10, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
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
                if (!(emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) || ((TLRPC.TL_emojiStatusCollectible) emojiStatus).collectible_id != tL_starGiftUnique.f20496id) {
                    return false;
                }
                return true;
            }
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-peerDialogId));
            if (chat != null) {
                TLRPC.EmojiStatus emojiStatus2 = chat.emoji_status;
                if ((emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible) && ((TLRPC.TL_emojiStatusCollectible) emojiStatus2).collectible_id == tL_starGiftUnique.f20496id) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void d0(k7 k7Var, ug.l1[] l1VarArr, Long l4) {
        if (l4.longValue() == -97) {
            ug.l1 l1Var = l1VarArr[0];
            TL_stars.TL_starGiftUnique X1 = k7Var.X1();
            if (k7Var.f1676f1 != null && X1 != null && !TextUtils.isEmpty(X1.slug)) {
                long clientUserId = UserConfig.getInstance(k7Var.currentAccount).getClientUserId();
                TextView textView = new TextView(k7Var.getContext());
                textView.setTextSize(1, 13.0f);
                int i10 = org.telegram.ui.ActionBar.h6.f21242r5;
                textView.setTextColor(org.telegram.ui.ActionBar.h6.w0(i10, k7Var.resourcesProvider));
                textView.setGravity(17);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" ");
                spannableStringBuilder.setSpan(new ca0(AndroidUtilities.dp(160.0f), textView), 0, spannableStringBuilder.length(), 33);
                textView.setText(spannableStringBuilder);
                TL_stars.starGiftDepositPayload[] stargiftdepositpayloadArr = new TL_stars.starGiftDepositPayload[1];
                Runnable[] runnableArr = new Runnable[1];
                boolean[] zArr = new boolean[1];
                TL_stars.depositStarGift depositstargift = new TL_stars.depositStarGift();
                depositstargift.peer = MessagesController.getInstance(k7Var.currentAccount).getInputPeer(clientUserId);
                depositstargift.slug = X1.slug;
                ConnectionsManager.getInstance(k7Var.currentAccount).sendRequestTyped(depositstargift, new Object(), new t3(k7Var, zArr, textView, stargiftdepositpayloadArr, runnableArr, 0));
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(k7Var.getContext(), 0, k7Var.resourcesProvider);
                alertDialog$Builder.f20601a.R = LocaleController.getString(R.string.Gift2MoveToMyGifts);
                alertDialog$Builder.f20601a.T = LocaleController.getString(R.string.Gift2MoveToMyGiftsText);
                TLRPC.User currentUser = UserConfig.getInstance(k7Var.currentAccount).getCurrentUser();
                LinearLayout linearLayout = new LinearLayout(k7Var.getContext());
                linearLayout.setOrientation(1);
                FrameLayout frameLayout = new FrameLayout(k7Var.getContext());
                int dp = AndroidUtilities.dp(20.0f);
                int i11 = org.telegram.ui.ActionBar.h6.f21092j5;
                frameLayout.setBackground(org.telegram.ui.ActionBar.h6.c0(dp, org.telegram.ui.ActionBar.h6.m1(0.045f, org.telegram.ui.ActionBar.h6.w0(i11, k7Var.resourcesProvider))));
                org.telegram.ui.Components.w9 w9Var = new org.telegram.ui.Components.w9(k7Var.getContext());
                w9Var.setRoundRadius(AndroidUtilities.dp(21.0f));
                org.telegram.ui.Components.h9 h9Var = new org.telegram.ui.Components.h9((org.telegram.ui.ActionBar.d6) null);
                h9Var.r(currentUser);
                w9Var.e(currentUser, h9Var);
                frameLayout.addView(w9Var, w7.z5.a(42.0f, 12.0f, 0.0f, 0.0f, 0.0f, 42, 19));
                TextView textView2 = new TextView(k7Var.getContext());
                com.google.android.gms.internal.cast.a6.m(16.0f, 1, textView2);
                textView2.setTextColor(org.telegram.ui.ActionBar.h6.w0(i11, k7Var.resourcesProvider));
                textView2.setSingleLine();
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                textView2.setEllipsize(truncateAt);
                textView2.setText(Emoji.replaceEmoji(UserObject.getUserName(currentUser), textView2.getPaint().getFontMetricsInt(), false));
                frameLayout.addView(textView2, w7.z5.a(-2.0f, 66.0f, 11.0f, 12.0f, 0.0f, -1, 51));
                TextView textView3 = new TextView(k7Var.getContext());
                textView3.setTextSize(1, 14.0f);
                textView3.setTextColor(org.telegram.ui.ActionBar.h6.w0(i10, k7Var.resourcesProvider));
                textView3.setSingleLine();
                textView3.setEllipsize(truncateAt);
                if (currentUser != null && !TextUtils.isEmpty(currentUser.phone)) {
                    jf.b c10 = jf.b.c();
                    textView3.setText(c10.b("+" + currentUser.phone));
                } else if (currentUser != null && UserObject.getPublicUsername(currentUser) != null) {
                    textView3.setText("@" + UserObject.getPublicUsername(currentUser));
                }
                frameLayout.addView(textView3, w7.z5.a(-2.0f, 66.0f, 33.0f, 12.0f, 0.0f, -1, 51));
                linearLayout.addView(frameLayout, w7.z5.k(20.0f, 0.0f, 20.0f, 16.0f, -1, 62));
                TextView textView4 = new TextView(k7Var.getContext());
                textView4.setTextSize(1, 15.0f);
                org.telegram.ui.Cells.t0.q(i11, k7Var.resourcesProvider, textView4, 17);
                textView4.setText(LocaleController.getString(R.string.Gift2MoveAppearIn));
                linearLayout.addView(textView4, w7.z5.k(24.0f, 0.0f, 24.0f, 0.0f, -1, -2));
                LinearLayout linearLayout2 = new LinearLayout(k7Var.getContext());
                linearLayout2.setOrientation(0);
                linearLayout2.setGravity(16);
                int w02 = org.telegram.ui.ActionBar.h6.w0(i10, k7Var.resourcesProvider);
                k7Var.C1(linearLayout2, R.drawable.msg_openprofile, 14, w02, LocaleController.getString(R.string.MyProfile), true);
                k7Var.C1(linearLayout2, R.drawable.menu_gift, 14, w02, LocaleController.getString(R.string.ProfileGifts), false);
                linearLayout.addView(linearLayout2, w7.z5.t(-2, -2, 1, 0, 7, 0, 3));
                linearLayout.addView(textView, w7.z5.k(24.0f, 4.0f, 24.0f, 4.0f, -1, -2));
                alertDialog$Builder.n(linearLayout);
                alertDialog$Builder.f20601a.G = 20;
                alertDialog$Builder.k(LocaleController.getString(R.string.Gift2Move), new u3(k7Var, clientUserId, stargiftdepositpayloadArr, l1Var, 0));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                v3 v3Var = new v3(0, zArr, runnableArr);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20601a;
                b2Var.setOnDismissListener(v3Var);
                b2Var.show();
            }
        } else if (l4.longValue() != -99 && l4.longValue() != -98) {
            k7Var.p2(l4.longValue(), 0L, false, new m3(k7Var, l4, l1VarArr, 1));
        }
    }

    public static void d1(k7 k7Var, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP) {
        TL_account.getTmpPassword gettmppassword = new TL_account.getTmpPassword();
        gettmppassword.password = inputCheckPasswordSRP;
        gettmppassword.period = 600;
        ConnectionsManager.getInstance(k7Var.currentAccount).sendRequest(gettmppassword, new l4(k7Var, twoStepVerificationActivity, z10, 0));
    }

    public static void e0(k7 k7Var, final yh.j0 j0Var, ag.c cVar, final TL_stars.TL_starGiftUnique tL_starGiftUnique, final long j10, final TLRPC.TL_textWithEntities tL_textWithEntities, final boolean z10, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        k7Var.f1685k0.setLoading(false);
        if (j0Var != null && j0Var.L) {
            j0Var.L = false;
            j0Var.H.h(false);
        }
        if (tL_payments_paymentFormStarGift == null) {
            return;
        }
        new k6(k7Var.getContext(), k7Var.resourcesProvider, tL_starGiftUnique, new h6(cVar, tL_payments_paymentFormStarGift), k7Var.currentAccount, j10, k7Var.P1(), false, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                k7.o1(k7.this, tL_starGiftUnique, j10, tL_textWithEntities, z10, j0Var, (h6) obj, (pf.c) obj2);
            }
        }).b();
    }

    public static void e1(long j10, long j11, k7 k7Var, Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error) {
        long j12;
        k7 k7Var2;
        callback.run(tL_error);
        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
        if (U != null) {
            if (tLObject instanceof TLRPC.Updates) {
                if (j10 >= 0 && j11 >= 0) {
                    sn W9 = sn.W9(j10);
                    j12 = j10;
                    k7Var2 = k7Var;
                    W9.whenFullyVisible(new p3(k7Var2, W9, j12, 0));
                    U.presentFragment(W9);
                } else {
                    j12 = j10;
                    k7Var2 = k7Var;
                    org.telegram.ui.Components.qc M = org.telegram.ui.Components.xc.a0(U).M(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, k7Var2.P1(), DialogObject.getShortName(j12))), R.raw.forward);
                    M.f29649t = true;
                    M.j();
                }
            } else {
                j12 = j10;
                k7Var2 = k7Var;
                org.telegram.ui.Components.xc.a0(U).f0(tL_error, false);
            }
        } else {
            j12 = j10;
            k7Var2 = k7Var;
        }
        fa.y(k7Var2.currentAccount, false).Q(j12);
        fa.y(k7Var2.currentAccount, false).Q(j11);
    }

    public static void f0(k7 k7Var, TLRPC.TL_error tL_error, byte[] bArr, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, Utilities.Callback callback, TLObject tLObject) {
        int i10;
        int i11;
        int dp;
        int i12;
        int i13;
        int dp2;
        int i14;
        int i15;
        if (k7Var.getContext() != null) {
            if (tL_error != null && bArr != null && (tL_error.text.startsWith("TMP_PASSWORD") || "PASSWORD_HASH_INVALID".equals(tL_error.text) || "SRP_ID_INVALID".equals(tL_error.text))) {
                if (twoStepVerificationActivity != null) {
                    k7Var.Z1(twoStepVerificationActivity.l0(), null, twoStepVerificationActivity, z10, null);
                    return;
                } else if (callback != null) {
                    callback.run(Boolean.TRUE);
                    return;
                } else {
                    return;
                }
            }
            if (callback != null) {
                callback.run(Boolean.FALSE);
            }
            String str = null;
            if (tL_error != null) {
                if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
                    if ("SRP_ID_INVALID".equals(tL_error.text)) {
                        ConnectionsManager.getInstance(k7Var.currentAccount).sendRequest(new TL_account.getPassword(), new l4(k7Var, twoStepVerificationActivity, z10, 1), 8);
                        return;
                    }
                    if (twoStepVerificationActivity != null) {
                        twoStepVerificationActivity.o0();
                        twoStepVerificationActivity.finishFragment();
                    }
                    org.telegram.ui.Components.xc.d0(tL_error);
                    return;
                }
                if (twoStepVerificationActivity != null) {
                    twoStepVerificationActivity.o0();
                }
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(k7Var.getContext());
                alertDialog$Builder.f20601a.R = LocaleController.getString(R.string.Gift2TransferToTONAlertTitle);
                LinearLayout linearLayout = new LinearLayout(k7Var.getContext());
                linearLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(24.0f), 0);
                linearLayout.setOrientation(1);
                alertDialog$Builder.n(linearLayout);
                TextView textView = new TextView(k7Var.getContext());
                int i16 = org.telegram.ui.ActionBar.h6.f21092j5;
                textView.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i16, false));
                textView.setTextSize(1, 16.0f);
                if (LocaleController.isRTL) {
                    i10 = 5;
                } else {
                    i10 = 3;
                }
                textView.setGravity(i10 | 48);
                textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2TransferToTONAlertText)));
                linearLayout.addView(textView, w7.z5.n(-1, -2));
                LinearLayout linearLayout2 = new LinearLayout(k7Var.getContext());
                linearLayout2.setOrientation(0);
                linearLayout.addView(linearLayout2, w7.z5.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                ImageView imageView = new ImageView(k7Var.getContext());
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
                int x02 = org.telegram.ui.ActionBar.h6.x0(null, i16, false);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                imageView.setColorFilter(new PorterDuffColorFilter(x02, mode));
                TextView textView2 = new TextView(k7Var.getContext());
                textView2.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i16, false));
                textView2.setTextSize(1, 16.0f);
                if (LocaleController.isRTL) {
                    i12 = 5;
                } else {
                    i12 = 3;
                }
                textView2.setGravity(i12 | 48);
                org.telegram.messenger.q.n(R.string.Gift2TransferToTONAlertText1, textView2);
                if (LocaleController.isRTL) {
                    linearLayout2.addView(textView2, w7.z5.n(-1, -2));
                    linearLayout2.addView(imageView, w7.z5.q(-2, -2, 5));
                } else {
                    linearLayout2.addView(imageView, w7.z5.n(-2, -2));
                    linearLayout2.addView(textView2, w7.z5.n(-1, -2));
                }
                LinearLayout linearLayout3 = new LinearLayout(k7Var.getContext());
                linearLayout3.setOrientation(0);
                linearLayout.addView(linearLayout3, w7.z5.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                ImageView imageView2 = new ImageView(k7Var.getContext());
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
                imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.h6.x0(null, i16, false), mode));
                TextView textView3 = new TextView(k7Var.getContext());
                textView3.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i16, false));
                textView3.setTextSize(1, 16.0f);
                if (LocaleController.isRTL) {
                    i14 = 5;
                } else {
                    i14 = 3;
                }
                textView3.setGravity(i14 | 48);
                org.telegram.messenger.q.n(R.string.Gift2TransferToTONAlertText2, textView3);
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
                    alertDialog$Builder.k(LocaleController.getString(R.string.Gift2TransferToTONSetPassword), new aa.a(k7Var));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                } else {
                    TextView textView4 = new TextView(k7Var.getContext());
                    textView4.setTextColor(org.telegram.ui.ActionBar.h6.x0(null, i16, false));
                    textView4.setTextSize(1, 16.0f);
                    if (!LocaleController.isRTL) {
                        i15 = 3;
                    }
                    textView4.setGravity(i15 | 48);
                    textView4.setText(LocaleController.getString(R.string.Gift2TransferToTONAlertText3));
                    linearLayout.addView(textView4, w7.z5.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                    alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
                }
                if (twoStepVerificationActivity != null) {
                    twoStepVerificationActivity.showDialog(alertDialog$Builder.f20601a);
                    return;
                } else {
                    alertDialog$Builder.o();
                    return;
                }
            }
            if (twoStepVerificationActivity != null) {
                twoStepVerificationActivity.o0();
                twoStepVerificationActivity.finishFragment();
            }
            if (tLObject instanceof TL_stars.starGiftWithdrawalUrl) {
                pf.d.t(k7Var.getContext(), ((TL_stars.starGiftWithdrawalUrl) tLObject).url);
            } else if (tLObject instanceof TLRPC.TL_boolTrue) {
                TL_stars.TL_starGiftUnique X1 = k7Var.X1();
                org.telegram.ui.Wallet.m0 w9 = org.telegram.ui.Wallet.m0.w(k7Var.currentAccount);
                org.telegram.ui.Wallet.g gVar = w9.f34572z;
                if (X1 != null) {
                    str = X1.gift_address;
                }
                AndroidUtilities.cancelRunOnUIThread(gVar);
                w9.f34570x = str;
                w9.f34571y = 0;
                if (w9.f34562o == null) {
                    w9.f34562o = new org.telegram.ui.Wallet.e0(w9);
                }
                org.telegram.ui.Wallet.e0 e0Var = w9.f34562o;
                if (!e0Var.f34152j) {
                    e0Var.b();
                    e0Var.f(true);
                }
                w9.A().f();
                w9.C();
                int i17 = w9.f34571y;
                if (i17 < 7) {
                    w9.f34571y = i17 + 1;
                    AndroidUtilities.runOnUIThread(gVar, org.telegram.ui.Wallet.m0.P[i17]);
                }
                if (X1 != null && !TextUtils.isEmpty(X1.slug)) {
                    AndroidUtilities.runOnUIThread(new a3.l0(X1.getDocument(), LocaleController.getString(R.string.Gift2MovedToWallet), new ah.j(1), 8));
                }
                k7Var.dismiss();
            } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                org.telegram.ui.Components.xc.b0("NULL_ERROR");
            }
        }
    }

    public static void f1(k7 k7Var, String str) {
        Context context = k7Var.getContext();
        pf.d.t(context, MessagesController.getInstance(k7Var.currentAccount).tonBlockchainExplorerUrl + str);
    }

    public static void g0(k7 k7Var, int i10, TLObject tLObject) {
        MessageObject messageObject;
        if (tLObject instanceof TLRPC.messages_Messages) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            for (int i11 = 0; i11 < messages_messages.messages.size(); i11++) {
                TLRPC.Message message = messages_messages.messages.get(i11);
                if (message != null && message.f20293id == i10) {
                    TLRPC.MessageAction messageAction = message.action;
                    if ((messageAction instanceof TLRPC.TL_messageActionStarGift) || (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                        messageObject = new MessageObject(k7Var.currentAccount, message, false, false);
                        messageObject.setType();
                        break;
                    }
                }
            }
        }
        messageObject = null;
        if (messageObject != null) {
            AndroidUtilities.runOnUIThread(new a3.l0(k7Var, tLObject, messageObject, 6));
        }
    }

    public static void g1(k7 k7Var, boolean[] zArr, TL_stars.StarGiftAttribute starGiftAttribute, org.telegram.ui.Components.zc[] zcVarArr) {
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        TL_stars.StarGift O1 = k7Var.O1();
        GiftAuctionController.getInstance(k7Var.currentAccount).requestAuctionUpgrades(O1.gift_id, new g3(k7Var, O1, starGiftAttribute, zcVarArr, zArr, 0));
    }

    public static void h0(k7 k7Var, Utilities.Callback2 callback2, ArrayList arrayList, Runnable runnable, TLRPC.Updates updates, TLRPC.TL_error tL_error) {
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
                        messageObject = new MessageObject(k7Var.currentAccount, message, false, false);
                        break;
                    }
                } else {
                    messageObject = null;
                    break;
                }
            }
            MessagesController.getInstance(k7Var.currentAccount).lambda$processUpdates$377(updates, false);
            if (messageObject != null) {
                TL_stars.StarGift starGift = ((TLRPC.TL_messageActionStarGiftUnique) messageObject.messageOwner.action).gift;
                callback2.run(starGift, new y0(k7Var, messageObject, arrayList, starGift, 3));
                return;
            }
            callback2.run(null, null);
            fa.y(k7Var.currentAccount, false).P();
            x9 G = fa.y(k7Var.currentAccount, false).G(UserConfig.getInstance(k7Var.currentAccount).getClientUserId(), false);
            if (G != null) {
                G.k(arrayList, null);
            }
        } else if (tL_error != null) {
            if ("STARGIFT_CRAFT_UNAVAILABLE".equalsIgnoreCase(tL_error.text)) {
                alertDialog$Builder = new AlertDialog$Builder(k7Var.getContext(), 0, new ci.b());
                String string = LocaleController.getString(R.string.GiftCraftUnavailableTitle);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20601a;
                b2Var.R = string;
                b2Var.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.GiftCraftUnavailableText));
                i10 = R.string.OK;
            } else {
                String str = tL_error.text;
                if (str != null && str.startsWith("STARGIFT_CRAFT_TOO_EARLY_")) {
                    long parseLong = Long.parseLong(tL_error.text.substring(25)) + ConnectionsManager.getInstance(k7Var.currentAccount).getCurrentTime();
                    alertDialog$Builder = new AlertDialog$Builder(k7Var.getContext(), 0, new ci.b());
                    String string2 = LocaleController.getString(R.string.GiftCraftUnavailableTitle);
                    org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder.f20601a;
                    b2Var2.R = string2;
                    b2Var2.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCraftUnavailableTextTime, LocaleController.formatDateTime(parseLong, true)));
                    i10 = R.string.OK;
                } else {
                    k7Var.getBulletinFactory().f0(tL_error, false);
                    runnable.run();
                }
            }
            org.telegram.messenger.q.p(i10, alertDialog$Builder, null);
            runnable.run();
        }
    }

    public static void h1(k7 k7Var) {
        final boolean z10;
        TLRPC.InputPeer inputPeer;
        final TL_stars.TL_starGiftUnique X1 = k7Var.X1();
        if (X1 != null && !TextUtils.isEmpty(X1.slug)) {
            if (X1.host_id == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (k7Var.f1708w1 == null) {
                k7Var.f1708w1 = Boolean.valueOf(!z10);
            }
            k7Var.F2(X1, z10);
            final int i10 = k7Var.f1706v1 + 1;
            k7Var.f1706v1 = i10;
            TL_stars.displayStarGift displaystargift = new TL_stars.displayStarGift();
            if (z10) {
                inputPeer = MessagesController.getInstance(k7Var.currentAccount).getInputPeer(UserConfig.getInstance(k7Var.currentAccount).getClientUserId());
            } else {
                inputPeer = null;
            }
            displaystargift.peer = inputPeer;
            displaystargift.slug = X1.slug;
            ConnectionsManager.getInstance(k7Var.currentAccount).sendRequestTyped(displaystargift, new Object(), new Utilities.Callback2() {
                @Override
                public final void run(Object obj, Object obj2) {
                    String str;
                    TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                    boolean z11 = ((TLRPC.Bool) obj) instanceof TLRPC.TL_boolTrue;
                    k7 k7Var2 = k7.this;
                    if (z11) {
                        k7Var2.f1708w1 = Boolean.valueOf(z10);
                        return;
                    }
                    if (i10 != k7Var2.f1706v1) {
                        return;
                    }
                    k7Var2.F2(X1, k7Var2.f1708w1.booleanValue());
                    org.telegram.ui.Components.xc bulletinFactory = k7Var2.getBulletinFactory();
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

    public static void i0(k7 k7Var, ArrayList arrayList, Utilities.Callback2 callback2, Runnable runnable) {
        yh.f4 f4Var = k7Var.W0;
        if (f4Var != null) {
            f4Var.b();
            k7Var.W0 = null;
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
        ConnectionsManager.getInstance(k7Var.currentAccount).sendRequestTyped(craftstargift, new Object(), new u2(k7Var, callback2, arrayList, runnable, 0));
    }

    public static void i1(k7 k7Var, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, long j10, long j11, long j12, TLRPC.TL_error tL_error) {
        b2Var.c(400L);
        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
        if (U == null) {
            return;
        }
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            k7Var.dismiss();
            fa.y(k7Var.currentAccount, false).Q(j10);
            if (j10 >= 0) {
                TLRPC.UserFull userFull = MessagesController.getInstance(k7Var.currentAccount).getUserFull(j11);
                if (userFull != null) {
                    int max = Math.max(0, userFull.stargifts_count - 1);
                    userFull.stargifts_count = max;
                    if (max <= 0) {
                        userFull.flags2 &= -257;
                    }
                }
                fa.y(k7Var.currentAccount, false).P();
                fa.y(k7Var.currentAccount, false).T(true);
                if (!(U instanceof ld)) {
                    ld ldVar = new ld();
                    ldVar.whenFullyVisible(new s3(ldVar, j12, 0));
                    U.presentFragment(ldVar);
                    return;
                }
                org.telegram.ui.Components.xc.a0(U).M(LocaleController.getString(R.string.Gift2ConvertedTitle), LocaleController.formatPluralStringComma("Gift2Converted", (int) j12), R.raw.stars_topup).k(true);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -j10);
            bundle.putBoolean("start_from_monetization", true);
            r91 r91Var = new r91(bundle);
            k0.g(k7Var.currentAccount).h(j10, true);
            k0.g(k7Var.currentAccount).l(j10);
            r91Var.whenFullyVisible(new s3(r91Var, j12, 1));
            U.presentFragment(r91Var);
        } else if (tL_error != null) {
            k7Var.getBulletinFactory().t(LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text), null).k(false);
        } else {
            k7Var.getBulletinFactory().t(LocaleController.getString(R.string.UnknownError), null).k(false);
        }
    }

    public static void j1(k7 k7Var, pf.c cVar, long j10, TL_stars.TL_starGiftUnique tL_starGiftUnique, TL_wallet.nftItem nftitem, ug.l1 l1Var, TL_stars.starGiftDepositPayload stargiftdepositpayload) {
        TLRPC.User user;
        e4 e4Var;
        String message;
        String str;
        qy qyVar = null;
        if (org.telegram.ui.Wallet.m0.w(k7Var.currentAccount).u() < stargiftdepositpayload.amount) {
            cVar.b();
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(k7Var.getContext(), 0, k7Var.resourcesProvider);
            String string = LocaleController.getString(R.string.WalletNotEnoughGram);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20601a;
            b2Var.R = string;
            b2Var.T = LocaleController.formatSpannable(R.string.WalletNotEnoughGramToTransferGift, org.telegram.ui.Wallet.m0.m(stargiftdepositpayload.amount, false));
            org.telegram.messenger.q.p(R.string.OK, alertDialog$Builder, null);
            return;
        }
        if (j10 > 0) {
            user = MessagesController.getInstance(k7Var.currentAccount).getUser(Long.valueOf(j10));
        } else {
            user = null;
        }
        long clientUserId = UserConfig.getInstance(k7Var.currentAccount).getClientUserId();
        TLRPC.Document document = tL_starGiftUnique.getDocument();
        int i10 = k7Var.currentAccount;
        org.telegram.ui.Wallet.m0 w9 = org.telegram.ui.Wallet.m0.w(i10);
        w3 w3Var = new w3(k7Var, cVar, l1Var, 1);
        if (j10 != clientUserId) {
            e4Var = null;
        } else {
            e4Var = new e4(i10, clientUserId, document);
        }
        try {
            if (stargiftdepositpayload.nft_address.indexOf(58) >= 0) {
                str = org.telegram.ui.Wallet.m0.T(stargiftdepositpayload.nft_address, true);
            } else {
                str = stargiftdepositpayload.nft_address;
            }
            String str2 = str;
            org.telegram.ui.Wallet.e2 g10 = org.telegram.ui.Wallet.m0.g(stargiftdepositpayload);
            if (e4Var != null) {
                qyVar = new qy(29, w9, e4Var);
            }
            w9.b0(user, str2, 0L, null, null, nftitem, null, w3Var, qyVar, g10);
        } catch (Exception e) {
            org.telegram.ui.Wallet.m0.j("depositNFT: invalid payload", e);
            if (e.getMessage() == null) {
                message = "NULL_ERROR";
            } else {
                message = e.getMessage();
            }
            w3Var.run(message);
        }
    }

    public static void k0(k7 k7Var, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10) {
        if (tLObject instanceof TL_account.tmpPassword) {
            TL_account.tmpPassword tmppassword = (TL_account.tmpPassword) tLObject;
            UserConfig.getInstance(k7Var.currentAccount).tmpPassword = tmppassword;
            UserConfig.getInstance(k7Var.currentAccount).saveConfig(false);
            k7Var.Z1(new TLRPC.TL_inputCheckPasswordEmpty(), tmppassword.tmp_password, twoStepVerificationActivity, z10, null);
            return;
        }
        k7Var.Z1(twoStepVerificationActivity.l0(), null, twoStepVerificationActivity, z10, null);
    }

    public static void k1(k7 k7Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, final String str) {
        final long j10 = tL_starGiftUnique.gift_id;
        final String str2 = tL_starGiftUnique.title;
        final String P1 = k7Var.P1();
        final TLRPC.Document document = tL_starGiftUnique.getDocument();
        String str3 = tL_starGiftUnique.slug;
        final org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(ApplicationLoader.applicationContext, 3, null);
        b2Var.q(500L);
        TL_stars.getUniqueStarGiftValueInfo getuniquestargiftvalueinfo = new TL_stars.getUniqueStarGiftValueInfo();
        getuniquestargiftvalueinfo.slug = str3;
        ConnectionsManager.getInstance(k7Var.currentAccount).sendRequest(getuniquestargiftvalueinfo, new RequestDelegate() {
            @Override
            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                final k7 k7Var2 = k7.this;
                final org.telegram.ui.ActionBar.b2 b2Var2 = b2Var;
                final TLRPC.Document document2 = document;
                final String str4 = str;
                final String str5 = str2;
                final String str6 = P1;
                final long j11 = j10;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        k7.G0(k7.this, b2Var2, tLObject, document2, str4, str5, str6, j11, tL_error);
                    }
                });
            }
        });
    }

    public static void l0(k7 k7Var, String str) {
        k7Var.dismiss();
        Context context = k7Var.getContext();
        pf.d.r(context, "https://" + MessagesController.getInstance(k7Var.currentAccount).linkPrefix + "/" + str);
    }

    public static void l1(k7 k7Var, org.telegram.ui.ActionBar.b2 b2Var, TL_stars.SavedStarGift savedStarGift) {
        if (savedStarGift != null) {
            b2Var.dismiss();
            k7Var.O0 = true;
            k7Var.C2(savedStarGift, null);
            super.show();
            return;
        }
        b2Var.dismiss();
        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
        if (U != null) {
            org.telegram.ui.Components.qc Q = org.telegram.ui.Components.xc.a0(U).Q(R.raw.error, 36, LocaleController.getString(R.string.MessageNotFound));
            Q.f29649t = true;
            Q.j();
        }
    }

    public static void m0(k7 k7Var, String str) {
        long j10 = k7Var.X;
        k7Var.f1685k0.setLoading(false);
        if (!TextUtils.isEmpty(str)) {
            k7Var.dismiss();
            org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
            if (R == null) {
                return;
            }
            if (R instanceof sn) {
                sn snVar = (sn) R;
                if (snVar.a() == j10) {
                    org.telegram.ui.Components.xc.a0(snVar).M(LocaleController.getString(R.string.StarsGiftUpgradeCompleted), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StarsGiftUpgradeCompletedText, DialogObject.getShortName(j10))), R.raw.gift).k(true);
                    return;
                }
            }
            NotificationCenter notificationCenter = NotificationCenter.getInstance(k7Var.currentAccount);
            int i10 = NotificationCenter.closeProfileActivity;
            Long valueOf = Long.valueOf(j10);
            Boolean bool = Boolean.FALSE;
            notificationCenter.lambda$postNotificationNameOnUIThread$1(i10, valueOf, bool);
            NotificationCenter.getInstance(k7Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChatActivity, Long.valueOf(j10), bool);
            sn W9 = sn.W9(j10);
            W9.whenFullyVisible(new a1.f(21, k7Var, W9));
            R.presentFragment(W9);
            return;
        }
        k7Var.M2(0, true, null);
    }

    public static void n0(k7 k7Var, String str) {
        Context context = k7Var.getContext();
        pf.d.t(context, MessagesController.getInstance(k7Var.currentAccount).tonBlockchainExplorerUrl + str);
    }

    public static void n1(k7 k7Var, long j10) {
        new yh.p1(k7Var.getContext(), k7Var.currentAccount, j10, null, new i4(k7Var, 1)).show();
    }

    public static void o0(k7 k7Var, TLObject tLObject, TLRPC.TL_inputInvoiceStarGiftTransfer tL_inputInvoiceStarGiftTransfer, long j10, long j11, Utilities.Callback callback, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            int i10 = 0;
            MessagesController.getInstance(k7Var.currentAccount).putUsers(paymentForm.users, false);
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
            ConnectionsManager.getInstance(k7Var.currentAccount).sendRequest(tL_payments_sendStarsForm, new y2(k7Var, j10, j11, callback, j12));
            return;
        }
        callback.run(tL_error);
        org.telegram.ui.Components.qc Y = k7Var.getBulletinFactory().Y(tL_error);
        Y.f29649t = true;
        Y.j();
    }

    public static void o1(k7 k7Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z10, yh.j0 j0Var, h6 h6Var, pf.c cVar) {
        cVar.d();
        fa.x(k7Var.currentAccount, h6Var.f1425a).h(h6Var.f1426b, tL_starGiftUnique, j10, tL_textWithEntities, z10, new c4(k7Var, cVar, tL_starGiftUnique, j10, j0Var, 0));
    }

    public static void p0(k7 k7Var, long j10) {
        bd bdVar = new bd(k7Var.getContext(), k7Var.resourcesProvider, j10, 10, null, new a1.f(22, k7Var, new boolean[]{false}), 0L);
        bdVar.setOnDismissListener(new n4(k7Var, 0));
        bdVar.show();
    }

    public static void p1(k7 k7Var, TLObject tLObject, CharSequence charSequence, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails, TLRPC.TL_error tL_error) {
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
            LinearLayout linearLayout = new LinearLayout(k7Var.getContext());
            linearLayout.setOrientation(1);
            linearLayout.setPadding(AndroidUtilities.dp(23.0f), 0, AndroidUtilities.dp(23.0f), 0);
            TextView b10 = w7.d6.b(k7Var.getContext(), 16.0f, org.telegram.ui.ActionBar.h6.f21092j5, false, null);
            b10.setText(LocaleController.getString(R.string.Gift2RemoveDescriptionText));
            linearLayout.addView(b10, w7.z5.k(0.0f, 0.0f, 0.0f, 16.0f, -1, -2));
            j01 j01Var = new j01(k7Var.getContext(), k7Var.resourcesProvider);
            h01 a2 = j01Var.a(charSequence);
            a2.setFilled(true);
            wh.n nVar = (wh.n) a2.getChildAt(0);
            nVar.setTextSize(1, 12.0f);
            nVar.setGravity(17);
            linearLayout.addView(j01Var, w7.z5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(k7Var.getContext(), 0, k7Var.resourcesProvider);
            alertDialog$Builder.f20601a.R = LocaleController.getString(R.string.Gift2RemoveDescriptionTitle);
            alertDialog$Builder.n(linearLayout);
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.k(ld.R0(LocaleController.formatString(R.string.Gift2RemoveDescriptionButton, Integer.valueOf((int) j10))), new a4(k7Var, tL_starGiftUnique, paymentForm, tL_inputInvoiceStarGiftDropOriginalDetails, j10, charSequence));
            alertDialog$Builder.o();
        } else if (tL_error != null) {
            k7Var.getBulletinFactory().f0(tL_error, false);
        }
    }

    public static void q0(k7 k7Var, boolean z10, pf.c cVar, Runnable runnable, DialogInterface dialogInterface, Boolean bool) {
        if (bool.booleanValue()) {
            UserConfig userConfig = UserConfig.getInstance(k7Var.currentAccount);
            userConfig.tmpPassword = null;
            userConfig.saveConfig(false);
            k7Var.n2(z10, cVar, runnable);
            return;
        }
        cVar.c(false);
        dialogInterface.dismiss();
        runnable.run();
    }

    public static void q1(k7 k7Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, Utilities.Callback callback, Boolean bool) {
        TL_stars.StarGift starGift;
        if (k7Var.W0 == null) {
            yh.f4 f4Var = new yh.f4(k7Var.currentAccount, tL_starGiftUnique.gift_id);
            k7Var.W0 = f4Var;
            f4Var.a();
        }
        HashSet hashSet = new HashSet();
        int i10 = 0;
        while (true) {
            b6[] b6VarArr = k7Var.f1675f0.M.f1161n;
            if (i10 < b6VarArr.length) {
                TL_stars.StarGift starGift2 = b6VarArr[i10].h;
                if (starGift2 != null) {
                    starGift = starGift2;
                } else {
                    starGift = null;
                }
                if (starGift != null) {
                    if (starGift2 == null) {
                        starGift2 = null;
                    }
                    hashSet.add(Long.valueOf(starGift2.f20496id));
                }
                i10++;
            } else {
                yh.g4 g4Var = new yh.g4(k7Var.getContext(), tL_starGiftUnique.title, k7Var.W0);
                g4Var.f50275g0.addAll(hashSet);
                g4Var.f50277i0.N(true);
                g4Var.f50276h0 = bool.booleanValue();
                g4Var.f50273e0.set(AndroidUtilities.replaceTags(LocaleController.formatPluralString("GiftCraftSelect", 4 - hashSet.size(), new Object[0])));
                g4Var.f50274f0 = new q2(0, callback);
                g4Var.show();
                return;
            }
        }
    }

    public static void r0(k7 k7Var, TLObject tLObject, a3.l0 l0Var, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.TL_messages_chatFull) {
            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject;
            MessagesController.getInstance(k7Var.currentAccount).putUsers(tL_messages_chatFull.users, false);
            MessagesController.getInstance(k7Var.currentAccount).putChats(tL_messages_chatFull.chats, false);
            MessagesController.getInstance(k7Var.currentAccount).putChatFull(tL_messages_chatFull.full_chat);
            if (!tL_messages_chatFull.full_chat.stargifts_available) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(k7Var.getContext(), 0, k7Var.resourcesProvider);
                alertDialog$Builder.f20601a.R = LocaleController.getString(R.string.Gift2ChannelDoesntSupportGiftsTitle);
                alertDialog$Builder.f20601a.T = LocaleController.getString(R.string.Gift2ChannelDoesntSupportGiftsText);
                org.telegram.messenger.q.p(R.string.OK, alertDialog$Builder, null);
                return;
            }
            l0Var.run();
            return;
        }
        org.telegram.ui.Components.qc Y = k7Var.getBulletinFactory().Y(tL_error);
        Y.f29649t = true;
        Y.j();
    }

    public static void r1(k7 k7Var, pf.c cVar, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.TL_error tL_error, long j10, CharSequence charSequence) {
        boolean z10 = false;
        cVar.c(false);
        b2Var.dismiss();
        if (tLObject instanceof TLRPC.TL_payments_paymentResult) {
            int i10 = 0;
            while (i10 < tL_starGiftUnique.attributes.size()) {
                if (tL_starGiftUnique.attributes.get(i10) instanceof TL_stars.starGiftAttributeOriginalDetails) {
                    tL_starGiftUnique.attributes.remove(i10);
                    i10--;
                }
                i10++;
            }
            TL_stars.SavedStarGift savedStarGift = k7Var.F0;
            if (savedStarGift != null) {
                z10 = savedStarGift.refunded;
            }
            k7Var.D2(tL_starGiftUnique, z10, null, null);
            AndroidUtilities.runOnUIThread(new a1.f(23, k7Var, tL_starGiftUnique));
        } else if (tL_error != null && "BALANCE_TOO_LOW".equalsIgnoreCase(tL_error.text)) {
            new bd(k7Var.getContext(), k7Var.resourcesProvider, j10, 16, null, new a1.f(24, k7Var, charSequence), 0L).show();
        } else if (tL_error != null) {
            k7Var.getBulletinFactory().f0(tL_error, false);
        }
    }

    public static void s0(k7 k7Var, String str, long j10) {
        org.telegram.ui.ActionBar.n2 R = LaunchActivity.R();
        if (R == 0) {
            return;
        }
        ?? obj = new Object();
        obj.f21552a = true;
        yh.h4 h4Var = new yh.h4(k7Var.X, str, j10, k7Var.resourcesProvider);
        h4Var.e = new i4(k7Var, 0);
        R.showAsSheet(h4Var, obj);
    }

    public static void s1(k7 k7Var, boolean z10) {
        int i10;
        Object obj;
        yh.l2 l2Var;
        yh.l2 l2Var2;
        yh.l2 l2Var3;
        int T1 = k7Var.T1();
        if (T1 >= 0) {
            if (z10) {
                i10 = 1;
            } else {
                i10 = -1;
            }
            int i11 = i10 + T1;
            int i12 = k7Var.U0;
            if (i12 >= 0 && (!z10 ? i12 < T1 : i12 > T1)) {
                i11 = i12;
            }
            y9 y9Var = k7Var.G0;
            if (y9Var != null && i11 >= 0 && i11 < y9Var.e()) {
                obj = k7Var.G0.get(i11);
            } else {
                obj = null;
            }
            if (obj != null) {
                if (z10) {
                    l2Var = k7Var.f1671d0;
                } else {
                    l2Var = k7Var.f1669c0;
                }
                if (l2Var != null) {
                    if (obj instanceof TL_stars.SavedStarGift) {
                        if (z10) {
                            l2Var3 = k7Var.f1671d0;
                        } else {
                            l2Var3 = k7Var.f1669c0;
                        }
                        if (K1(l2Var3.F0, (TL_stars.SavedStarGift) obj)) {
                            return;
                        }
                    }
                    if (obj instanceof TL_stars.TL_starGiftUnique) {
                        if (z10) {
                            l2Var2 = k7Var.f1671d0;
                        } else {
                            l2Var2 = k7Var.f1669c0;
                        }
                        if (L1(l2Var2.J0, (TL_stars.TL_starGiftUnique) obj)) {
                            return;
                        }
                    }
                }
                yh.l2 l2Var4 = new yh.l2(k7Var, k7Var.getContext(), k7Var.currentAccount, k7Var.X, k7Var.resourcesProvider, k7Var.Y.getRootView());
                if (obj instanceof TL_stars.SavedStarGift) {
                    l2Var4.C2((TL_stars.SavedStarGift) obj, k7Var.G0);
                } else if (obj instanceof TL_stars.TL_starGiftUnique) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj;
                    l2Var4.A2(tL_starGiftUnique.slug, tL_starGiftUnique, k7Var.G0);
                }
                AndroidUtilities.removeFromParent(l2Var4.containerView);
                if (z10) {
                    k7Var.f1671d0 = l2Var4;
                } else {
                    k7Var.f1669c0 = l2Var4;
                }
            }
        }
    }

    public static void t0(k7 k7Var, long j10) {
        new yh.p1(k7Var.getContext(), k7Var.currentAccount, j10, null, new i4(k7Var, 1)).show();
    }

    public static void t1(k7 k7Var, final View view) {
        ei.ob obVar;
        LaunchActivity launchActivity = LaunchActivity.H1;
        if (launchActivity != null) {
            if (view instanceof org.telegram.ui.Cells.e7) {
                obVar = ei.qb.b((org.telegram.ui.Cells.e7) view);
            } else {
                obVar = null;
            }
            ArrayList arrayList = new ArrayList();
            MessageObject messageObject = k7Var.H0;
            if (messageObject != null) {
                arrayList.add(messageObject);
            } else if (k7Var.O1() instanceof TL_stars.TL_starGiftUnique) {
                long clientUserId = UserConfig.getInstance(k7Var.currentAccount).getClientUserId();
                TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                tL_messageService.peer_id = MessagesController.getInstance(k7Var.currentAccount).getPeer(clientUserId);
                tL_messageService.from_id = MessagesController.getInstance(k7Var.currentAccount).getPeer(clientUserId);
                tL_messageService.date = ConnectionsManager.getInstance(k7Var.currentAccount).getCurrentTime();
                TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = new TLRPC.TL_messageActionStarGiftUnique();
                tL_messageActionStarGiftUnique.gift = (TL_stars.TL_starGiftUnique) k7Var.O1();
                tL_messageActionStarGiftUnique.upgrade = true;
                tL_messageService.action = tL_messageActionStarGiftUnique;
                MessageObject messageObject2 = new MessageObject(k7Var.currentAccount, tL_messageService, false, false);
                messageObject2.setType();
                arrayList.add(messageObject2);
            } else {
                return;
            }
            final ei.vb D = ei.vb.D(launchActivity, k7Var.currentAccount);
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
                        k7 k7Var2 = k7.this;
                        AndroidUtilities.runOnUIThread(new a1.f(17, k7Var2, l10));
                        vbVar.X(null);
                        a5 a5Var = k7Var2.Z0;
                        if (a5Var != null) {
                            a5Var.dismiss();
                            k7Var2.Z0 = null;
                        }
                    } else {
                        View view2 = view;
                        if ((view2 instanceof org.telegram.ui.Cells.e7) && view2.isAttachedToWindow()) {
                            obVar2 = ei.qb.b((org.telegram.ui.Cells.e7) view2);
                        }
                        vbVar.X(obVar2);
                    }
                    AndroidUtilities.runOnUIThread(runnable);
                }
            };
            D.T(obVar, ei.a8.y(arrayList));
        }
    }

    public static void u0(k7 k7Var) {
        TL_stars.TL_starGiftUnique X1 = k7Var.X1();
        new b1(k7Var.getContext(), k7Var.currentAccount, DialogObject.getPeerDialogId(X1.owner_id), X1, k7Var.resourcesProvider, new b2(k7Var, 5)).show();
    }

    public static void v0(k7 k7Var, TL_stars.InputSavedStarGift inputSavedStarGift, long j10, long j11, long j12) {
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(ApplicationLoader.applicationContext, 3, null);
        b2Var.q(500L);
        TL_stars.convertStarGift convertstargift = new TL_stars.convertStarGift();
        convertstargift.stargift = inputSavedStarGift;
        ConnectionsManager.getInstance(k7Var.currentAccount).sendRequest(convertstargift, new y2(k7Var, b2Var, j10, j11, j12));
    }

    public static void v2(org.telegram.ui.ActionBar.n2 n2Var) {
        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
        if (U == 0) {
            return;
        }
        ?? obj = new Object();
        obj.f21552a = true;
        U.showAsSheet(n2Var, obj);
    }

    public static void w0(k7 k7Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, ag.a aVar, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(k7Var.currentAccount).lambda$processUpdates$377((TLRPC.Updates) tLObject, false);
            AndroidUtilities.runOnUIThread(new i3(k7Var, tL_starGiftUnique, aVar, runnable, 0));
        } else if (tL_error != null) {
            AndroidUtilities.runOnUIThread(new j3(k7Var, tL_error, runnable, 0));
        }
    }

    public static void x0(k7 k7Var) {
        if (k7Var.f1700s1 == null) {
            return;
        }
        long j10 = 0;
        for (int i10 = 0; i10 < k7Var.f1700s1.invoice.prices.size(); i10++) {
            j10 += k7Var.f1700s1.invoice.prices.get(i10).amount;
        }
        g7 g7Var = new g7(k7Var.getContext(), j10, k7Var.f1694p1, k7Var.resourcesProvider);
        k7Var.f1695q0 = g7Var;
        g7Var.show();
    }

    public static void y0(k7 k7Var, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, long j10, MessagesController messagesController, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        k7Var.f1685k0.setLoading(false);
        z4 z4Var = new z4(k7Var, 0);
        sg.j0 j0Var = new sg.j0(26, k7Var.currentAccount, k7Var.getContext(), z4Var, k7Var.resourcesProvider);
        j0Var.H1(canApplyBoost);
        j0Var.G1(tL_premium_boostsStatus, true);
        j0Var.I1(j10);
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(-j10));
        if (chat != null) {
            j0Var.Q0 = new n3(k7Var, chat);
        }
        j0Var.show();
    }

    public static SpannableStringBuilder y2(String str) {
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
            spannableStringBuilder.setSpan(new e5(0), indexOf, i10 + indexOf, 0);
        }
        return spannableStringBuilder;
    }

    public static void z0(k7 k7Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        k7Var.f1698r1 = false;
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            MessagesController.getInstance(k7Var.currentAccount).putUsers(paymentForm.users, false);
            k7Var.f1700s1 = paymentForm;
            k7Var.s2();
            return;
        }
        org.telegram.ui.Components.qc Y = k7Var.getBulletinFactory().Y(tL_error);
        Y.f29649t = true;
        Y.j();
    }

    public static SpannableStringBuilder z2(String str) {
        if (str == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        SpannableString spannableString = new SpannableString("👌");
        spannableString.setSpan(new yq(R.drawable.filled_understood, 0), 0, spannableString.length(), 33);
        SpannableString spannableString2 = new SpannableString("👍");
        spannableString2.setSpan(new yq(R.drawable.filled_reactions, 0), 0, spannableString2.length(), 33);
        AndroidUtilities.replaceMultipleCharSequence("👌", spannableStringBuilder, spannableString);
        AndroidUtilities.replaceMultipleCharSequence("👍", spannableStringBuilder, spannableString2);
        return spannableStringBuilder;
    }

    @Override
    public final CharSequence A() {
        return this.V0;
    }

    public final void A1(TL_stars.StarGiftAttribute starGiftAttribute) {
        String string;
        boolean z10;
        s6 s6Var;
        TL_stars.StarGiftAttribute starGiftAttribute2;
        k7 k7Var;
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
        if (!this.Q0 && ((s6Var = this.P0) == null || !s6Var.f2158o)) {
            boolean[] zArr = new boolean[1];
            org.telegram.ui.Components.zc[] zcVarArr = new org.telegram.ui.Components.zc[1];
            Integer[] numArr = new Integer[1];
            String W1 = W1(starGiftAttribute.rarity, numArr);
            if (starGiftAttribute.rarity instanceof TL_stars.TL_starGiftAttributeRarity) {
                starGiftAttribute2 = starGiftAttribute;
                y0Var = new y0(this, zArr, starGiftAttribute2, zcVarArr, 1);
                k7Var = this;
            } else {
                starGiftAttribute2 = starGiftAttribute;
                k7Var = this;
                y0Var = null;
            }
            zcVarArr[0] = (org.telegram.ui.Components.zc) ((g01) k7Var.f1681i0.e(string, starGiftAttribute2.name, W1, y0Var, numArr[0]).getChildAt(1)).getChildAt(0);
            return;
        }
        x6 x6Var = new x6(getContext(), this.resourcesProvider, new i2(this, 0));
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        j01 j01Var = this.f1681i0;
        tableRow.addView(new i01(j01Var, string), layoutParams);
        tableRow.addView(new g01(j01Var, x6Var, true), new TableRow.LayoutParams(0, -1, 1.0f));
        j01Var.addView(tableRow);
        s6 s6Var2 = this.P0;
        if (s6Var2 != null) {
            if (!z10) {
                s6Var2.d = x6Var;
            }
            if (z10) {
                s6Var2.f2149c = x6Var;
            }
            if (z10) {
                s6Var2.f2148b = x6Var;
            }
        }
    }

    public final void A2(String str, TL_stars.TL_starGiftUnique tL_starGiftUnique, y9 y9Var) {
        boolean z10;
        boolean z11;
        s6 s6Var;
        TL_stars.TL_starGiftUnique tL_starGiftUnique2;
        this.I0 = str;
        this.J0 = tL_starGiftUnique;
        this.G0 = y9Var;
        if (tL_starGiftUnique.resell_amount != null && !a2(this.currentAccount, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id))) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.K0 = z10;
        if (!this.Q0 && (s6Var = this.P0) != null && s6Var.f2158o && (tL_starGiftUnique2 = s6Var.f2155l) != null && tL_starGiftUnique2.f20496id != tL_starGiftUnique.f20496id) {
            s6Var.a();
            this.P0 = null;
            e7 e7Var = this.f1675f0;
            e7Var.f1212b.setAlpha(1.0f);
            e7Var.f1214c.setAlpha(0.0f);
        }
        this.f1673e0.b(this.currentAccount, this.F0);
        D2(tL_starGiftUnique, false, null, null);
        String str2 = tL_starGiftUnique.owner_address;
        String str3 = tL_starGiftUnique.gift_address;
        if (tL_starGiftUnique.host_id != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        TL_wallet.walletTransaction wallettransaction = this.f1682i1;
        x90 x90Var = this.f1679h0;
        if (wallettransaction == null && z11 && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            x90Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2InBlockchain), new g4(this, str3, 3)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            x90Var.setVisibility(0);
            x90Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21223q5, this.resourcesProvider));
        } else {
            x90Var.setVisibility(8);
        }
        TL_wallet.walletTransaction wallettransaction2 = this.f1682i1;
        x90 x90Var2 = this.f1683j0;
        if (wallettransaction2 == null && !z11 && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            x90Var2.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2InBlockchain), new g4(this, str3, 4)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            x90Var2.setVisibility(0);
        } else {
            x90Var2.setVisibility(8);
        }
        Q2();
        if (this.K0) {
            E2(tL_starGiftUnique);
            this.f1685k0.setOnClickListener(new c2(this, 12));
        }
        if (this.f1674e1) {
            M2(0, false, null);
            this.f24913c.n0(1);
            this.f1674e1 = false;
        }
        P2();
    }

    public final void B2(org.telegram.messenger.MessageObject r56, ai.y9 r57) {
        throw new UnsupportedOperationException("Method not decompiled: ai.k7.B2(org.telegram.messenger.MessageObject, ai.y9):void");
    }

    public final void C1(LinearLayout linearLayout, int i10, int i11, int i12, String str, boolean z10) {
        int i13;
        int i14;
        int w02 = org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21242r5, this.resourcesProvider);
        ImageView imageView = new ImageView(getContext());
        ImageView.ScaleType scaleType = ImageView.ScaleType.FIT_CENTER;
        imageView.setScaleType(scaleType);
        imageView.setImageResource(i10);
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        imageView.setColorFilter(new PorterDuffColorFilter(i12, mode));
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
        textView.setTextColor(w02);
        textView.setText(str);
        linearLayout.addView(textView, w7.z5.t(-2, -2, 16, 4, 0, 0, 0));
        if (z10) {
            ImageView imageView2 = new ImageView(getContext());
            imageView2.setScaleType(scaleType);
            imageView2.setImageResource(R.drawable.msg_mini_topicarrow);
            imageView2.setColorFilter(new PorterDuffColorFilter(w02, mode));
            linearLayout.addView(imageView2, w7.z5.t(11, 11, 16, 5, 0, 2, 0));
        }
    }

    public final void C2(TL_stars.SavedStarGift savedStarGift, y9 y9Var) {
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
        SpannableString spannableString;
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
        s6 s6Var;
        if (savedStarGift == null) {
            return;
        }
        int i20 = this.currentAccount;
        long j11 = this.X;
        this.E0 = a2(i20, j11);
        this.F0 = savedStarGift;
        this.G0 = y9Var;
        this.H0 = null;
        boolean z13 = this.Q0;
        e7 e7Var = this.f1675f0;
        if (!z13 && (s6Var = this.P0) != null && s6Var.f2158o && s6Var.f2155l != null) {
            s6Var.a();
            this.P0 = null;
            e7Var.f1212b.setVisibility(0);
            e7Var.f1214c.setVisibility(4);
        }
        this.f1673e0.b(this.currentAccount, savedStarGift);
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
            D2(tL_starGiftUnique, z14, tLObject, savedStarGift.message);
        } else {
            if (this.E0 && clientUserId == peerDialogId && i21 >= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z15 = z11;
            boolean c22 = c2(this.currentAccount, X1());
            S1();
            e7Var.f(starGift4, false, false, c22);
            j01 j01Var = this.f1681i0;
            j01Var.removeAllViews();
            if (z15) {
                if (savedStarGift.gift_num != 0 && (starGift3 = savedStarGift.gift) != null && starGift3.title != null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(savedStarGift.gift.title);
                    sb2.append(" #");
                    j10 = clientUserId;
                    string4 = org.telegram.messenger.q.h(savedStarGift.gift_num, ',', sb2);
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
                e7Var.i(0, string4, replaceTags, x2(savedStarGift.gift));
            } else {
                j10 = clientUserId;
                if (z10 && !this.E0) {
                    String string5 = LocaleController.getString(R.string.Gift2TitleProfile);
                    this.V0 = string5;
                    e7Var.i(0, string5, null, w2(savedStarGift.gift.released_by));
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
                        e7Var.i(0, string6, string, x2(savedStarGift.gift));
                    } else {
                        if (savedStarGift.gift_num != 0 && (starGift = savedStarGift.gift) != null && starGift.title != null) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(savedStarGift.gift.title);
                            sb3.append(" #");
                            string2 = org.telegram.messenger.q.h(savedStarGift.gift_num, ',', sb3);
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
                            if (!isBot && E1()) {
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
                            if (isBot || !E1()) {
                                c10 = 1;
                                charSequence2 = "";
                            } else {
                                c10 = 1;
                                charSequence2 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2More).replace(' ', (char) 160), new b2(this, 6)), true);
                            }
                            char c11 = c10;
                            CharSequence[] charSequenceArr = new CharSequence[3];
                            i12 = 0;
                            charSequenceArr[0] = replaceTags2;
                            charSequenceArr[c11] = " ";
                            charSequenceArr[2] = charSequence2;
                            charSequence = TextUtils.concat(charSequenceArr);
                        }
                        e7Var.i(i12, string2, charSequence, x2(savedStarGift.gift));
                    }
                }
            }
            if (j10 != peerDialogId || z10) {
                TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerDialogId));
                String string7 = LocaleController.getString(R.string.Gift2From);
                int i22 = this.currentAccount;
                d2 d2Var = new d2(this, peerDialogId, 4);
                if (peerDialogId != j10 && peerDialogId != 2666000 && !isBot && !UserObject.isDeleted(user) && !z10) {
                    str2 = LocaleController.getString(R.string.Gift2ButtonSendGift);
                } else {
                    str2 = null;
                }
                this.f1681i0.m(string7, i22, peerDialogId, d2Var, str2, new d2(this, peerDialogId, 5));
            }
            j01Var.c(LocaleController.getString(R.string.StarsTransactionDate), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(savedStarGift.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(savedStarGift.date * 1000))), null, null);
            String string8 = LocaleController.getString(R.string.Gift2Value);
            String h = org.telegram.messenger.q.h(savedStarGift.gift.stars + savedStarGift.upgrade_stars, ',', new StringBuilder("⭐️ "));
            if (E1() && !z14) {
                r12 = 0;
                spannableString = org.telegram.ui.Components.ad.b(LocaleController.formatPluralStringComma("Gift2ButtonSell", (int) savedStarGift.convert_stars), new b2(this, 8), this.resourcesProvider, null);
            } else {
                r12 = 0;
                spannableString = "";
            }
            j01Var.c(string8, ld.Y0(false, TextUtils.concat(h, " ", spannableString), 0.8f, r12), r12, r12);
            TL_stars.StarGift starGift5 = savedStarGift.gift;
            if (starGift5.limited && !z14) {
                ld.G0(j01Var, this.currentAccount, starGift5, this.resourcesProvider);
            }
            TLRPC.TL_textWithEntities tL_textWithEntities2 = savedStarGift.message;
            if (tL_textWithEntities2 != null && !TextUtils.isEmpty(tL_textWithEntities2.text) && !z14) {
                TLRPC.TL_textWithEntities tL_textWithEntities3 = savedStarGift.message;
                j01Var.b(tL_textWithEntities3.text, tL_textWithEntities3.entities);
            }
            boolean z17 = this.E0;
            ei.d dVar = this.f1685k0;
            if (z17 && savedStarGift.can_upgrade) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("^  ");
                if (this.f1672d1 == null) {
                    i16 = 0;
                    this.f1672d1 = new yq(0, new f7(dVar, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Oh, this.resourcesProvider)));
                } else {
                    i16 = 0;
                }
                spannableStringBuilder.setSpan(this.f1672d1, i16, 1, 33);
                if (savedStarGift.upgrade_stars > 0) {
                    string3 = LocaleController.getString(R.string.Gift2UpgradeButtonFree);
                } else {
                    string3 = LocaleController.getString(R.string.Gift2UpgradeButtonGift);
                }
                spannableStringBuilder.append((CharSequence) string3);
                dVar.setFilled(true);
                dVar.g(spannableStringBuilder, !this.f1674e1, true);
                dVar.f(null, !this.f1674e1);
                dVar.setOnClickListener(new c2(this, 9));
            } else if (this.f1697r0 && z17 && this.Z != null && this.G0 != null && T1() >= 0 && this.G0.b(T1()) >= 0) {
                dVar.setFilled(false);
                int b10 = this.G0.b(T1());
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.Gift2UpgradeNext));
                Object obj = this.G0.get(b10);
                if ((obj instanceof TL_stars.SavedStarGift) && (starGift2 = ((TL_stars.SavedStarGift) obj).gift) != null && (document = starGift2.getDocument()) != null) {
                    spannableStringBuilder2.append((CharSequence) " e");
                    r122 = 1;
                    spannableStringBuilder2.setSpan(new org.telegram.ui.Components.a6(document, dVar.getTextPaint().getFontMetricsInt()), spannableStringBuilder2.length() - 1, spannableStringBuilder2.length(), 33);
                } else {
                    r122 = 1;
                }
                dVar.g(spannableStringBuilder2, (this.f1674e1 ? 1 : 0) ^ r122, r122);
                dVar.f(null, (this.f1674e1 ? 1 : 0) ^ r122);
                dVar.setOnClickListener(new a3(this, b10, r122));
            } else if ((savedStarGift.gift instanceof TL_stars.TL_starGift) && !TextUtils.isEmpty(savedStarGift.prepaid_upgrade_hash)) {
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("^  ");
                if (this.f1672d1 == null) {
                    i15 = 0;
                    this.f1672d1 = new yq(0, new f7(dVar, org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Oh, this.resourcesProvider)));
                } else {
                    i15 = 0;
                }
                spannableStringBuilder3.setSpan(this.f1672d1, i15, 1, 33);
                spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2GiftAnUpgrade));
                dVar.setFilled(true);
                dVar.g(spannableStringBuilder3, !this.f1674e1, true);
                dVar.f(null, !this.f1674e1);
                dVar.setOnClickListener(new c2(this, 10));
            } else {
                dVar.setFilled(true);
                dVar.g(LocaleController.getString(R.string.OK), !this.f1674e1, true);
                dVar.f(null, !this.f1674e1);
                dVar.setOnClickListener(new c2(this, 11));
            }
            str3 = null;
            str4 = null;
            z12 = false;
        }
        boolean z18 = savedStarGift.refunded;
        x90 x90Var = this.f1679h0;
        if (z18) {
            x90Var.setVisibility(0);
            x90Var.setText(LocaleController.getString(R.string.Gift2Refunded));
            x90Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21224q7, this.resourcesProvider));
        } else if (z12 && !TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
            x90Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2InBlockchain), new g4(this, str4, 1)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            x90Var.setVisibility(0);
            x90Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21223q5, this.resourcesProvider));
        } else if (TextUtils.isEmpty(str3) && TextUtils.isEmpty(str4) && this.E0 && (savedStarGift.gift instanceof TL_stars.TL_starGift) && savedStarGift.name_hidden) {
            x90Var.setVisibility(0);
            if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
                i17 = R.string.Gift2InSenderMessageHidden2;
            } else {
                i17 = R.string.Gift2InSenderHidden2;
            }
            x90Var.setText(LocaleController.getString(i17));
            x90Var.setTextColor(org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.f21223q5, this.resourcesProvider));
        } else {
            x90Var.setVisibility(8);
        }
        x90 x90Var2 = this.f1683j0;
        if (!z12 && !TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
            x90Var2.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2InBlockchain), new g4(this, str4, 2)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            r13 = 0;
            x90Var2.setVisibility(0);
        } else if (this.E0 && a2(this.currentAccount, j11)) {
            if (i21 >= 0) {
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                if (savedStarGift.unsaved) {
                    spannableStringBuilder4.append((CharSequence) ". ");
                    spannableStringBuilder4.setSpan(new yq(R.drawable.mini_gift_hidden, 0), 0, 1, 33);
                }
                if (!savedStarGift.unsaved) {
                    i19 = R.string.Gift2ProfileVisible4;
                } else {
                    i19 = R.string.Gift2ProfileInvisible4;
                }
                spannableStringBuilder4.append((CharSequence) AndroidUtilities.replaceSingleTag(LocaleController.getString(i19), new b2(this, 7)));
                x90Var2.setText(AndroidUtilities.replaceArrows(spannableStringBuilder4, true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            } else {
                if (!savedStarGift.unsaved) {
                    i18 = R.string.Gift2ChannelProfileVisible3;
                } else {
                    i18 = R.string.Gift2ChannelProfileInvisible3;
                }
                x90Var2.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(i18), new b2(this, 7)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            }
            r13 = 0;
            x90Var2.setVisibility(0);
        } else {
            r13 = 0;
            x90Var2.setVisibility(8);
        }
        if (this.f1674e1) {
            M2(r13, r13, null);
            this.f24913c.n0(1);
            this.f1674e1 = r13;
        }
        this.e.setTitle(this.V0);
        P2();
    }

    public final void D1(TL_stars.InputSavedStarGift inputSavedStarGift, TLRPC.Updates updates, Runnable runnable) {
        TLRPC.Message message;
        TL_stars.StarGift starGift;
        if (updates == null) {
            fa.y(this.currentAccount, false).Q(N1());
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
                    savedStarGift2.msg_id = message.f20293id;
                    savedStarGift2.flags = (savedStarGift2.flags | 8) & (-2049);
                    savedStarGift2.saved_id = 0L;
                    savedStarGift2.unsaved = !tL_messageActionStarGiftUnique.saved;
                    savedStarGift2.refunded = tL_messageActionStarGiftUnique.refunded;
                    savedStarGift2.can_upgrade = false;
                    savedStarGift2.can_resell_at = tL_messageActionStarGiftUnique.can_resell_at;
                    savedStarGift2.can_transfer_at = tL_messageActionStarGiftUnique.can_transfer_at;
                    savedStarGift2.can_export_at = tL_messageActionStarGiftUnique.can_export_at;
                    C2(savedStarGift2, this.G0);
                    this.f1692o1 = null;
                    this.Q0 = false;
                    y9 y9Var = this.G0;
                    if (y9Var != null) {
                        y9Var.d();
                    } else {
                        fa.y(this.currentAccount, false).Q(this.X);
                    }
                    AndroidUtilities.runOnUIThread(runnable);
                    return;
                }
            }
            if (this.G0 == null) {
                fa.y(this.currentAccount, false).Q(N1());
            }
            this.Q0 = true;
            this.F0 = null;
            this.E0 = false;
            MessageObject messageObject = new MessageObject(this.currentAccount, message, false, false);
            messageObject.setType();
            B2(messageObject, this.G0);
            this.f1692o1 = null;
            this.Q0 = false;
            AndroidUtilities.runOnUIThread(runnable);
            return;
        }
        fa.y(this.currentAccount, false).Q(N1());
        dismiss();
    }

    public final void D2(org.telegram.tgnet.tl.TL_stars.TL_starGiftUnique r39, boolean r40, org.telegram.tgnet.TLObject r41, org.telegram.tgnet.TLRPC.TL_textWithEntities r42) {
        throw new UnsupportedOperationException("Method not decompiled: ai.k7.D2(org.telegram.tgnet.tl.TL_stars$TL_starGiftUnique, boolean, org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_textWithEntities):void");
    }

    public final boolean E1() {
        int i10;
        boolean z10;
        boolean z11;
        TLRPC.Peer peer;
        if (R1() == null) {
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
                if (((z10 || (isOutOwner && !z11)) && ((peer = tL_messageActionStarGift.peer) == null || !b2(this.currentAccount, DialogObject.getPeerDialogId(peer)))) || tL_messageActionStarGift.converted || tL_messageActionStarGift.convert_stars <= 0 || currentTime <= 0) {
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
                if (b2(i11, j10)) {
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

    public final void E2(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        ag.a resellAmount = tL_starGiftUnique.getResellAmount(ag.c.f635a);
        boolean z10 = tL_starGiftUnique.resale_ton_only;
        ei.d dVar = this.f1685k0;
        if (z10) {
            dVar.g(ld.n1(ld.T0(LocaleController.formatString(R.string.ResellGiftBuyTON, tL_starGiftUnique.getResellAmount(ag.c.f636b).d()), true), true), !this.f1674e1, true);
            dVar.f(ld.R0(LocaleController.formatPluralStringComma("ResellGiftBuyEq", (int) resellAmount.a())), !this.f1674e1);
            return;
        }
        dVar.g(ld.R0(LocaleController.formatPluralStringComma("ResellGiftBuy", (int) resellAmount.a())), !this.f1674e1, true);
        dVar.f(null, !this.f1674e1);
    }

    public final boolean F1() {
        int i10;
        TL_stars.TL_starGiftUnique X1 = X1();
        if (X1 == null || X1.crafted || !b2(this.currentAccount, DialogObject.getPeerDialogId(X1.owner_id))) {
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

    public final void F2(TL_stars.TL_starGiftUnique tL_starGiftUnique, boolean z10) {
        if (z10) {
            TLRPC.TL_peerUser tL_peerUser = new TLRPC.TL_peerUser();
            tL_peerUser.user_id = UserConfig.getInstance(this.currentAccount).getClientUserId();
            tL_starGiftUnique.host_id = tL_peerUser;
            tL_starGiftUnique.flags |= 4096;
        } else {
            tL_starGiftUnique.host_id = null;
            tL_starGiftUnique.flags &= -4097;
        }
        this.f1675f0.setWalletDisplayed(z10);
        Q2();
    }

    public final void G1() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
        alertDialog$Builder.f20601a.R = LocaleController.getString(R.string.Gift2CantDoTitle);
        alertDialog$Builder.f20601a.T = LocaleController.getString(R.string.Gift2CantDoText);
        TL_stars.TL_starGiftUnique X1 = X1();
        if (X1 != null && !TextUtils.isEmpty(X1.slug)) {
            alertDialog$Builder.k(LocaleController.getString(R.string.OpenFragment), new r4(this, X1, 1));
        }
        i0.a.r(R.string.Cancel, alertDialog$Builder, null);
    }

    public final void G2() {
        TL_stars.TL_starGiftUnique X1 = X1();
        if (X1 == null) {
            return;
        }
        TLRPC.Peer peer = X1.owner_id;
        if (peer == null) {
            peer = X1.host_id;
        }
        long peerDialogId = DialogObject.getPeerDialogId(peer);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(X1.title);
        sb2.append(" #");
        this.C0.setText(LocaleController.formatString(R.string.Gift2WearTitle, org.telegram.messenger.q.h(X1.num, ',', sb2)));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.Gift2WearStart));
        if (peerDialogId == UserConfig.getInstance(this.currentAccount).getClientUserId() && !UserConfig.getInstance(this.currentAccount).isPremium()) {
            spannableStringBuilder.append((CharSequence) " l");
            if (this.X0 == null) {
                this.X0 = new yq(R.drawable.msg_mini_lock3, 0);
            }
            spannableStringBuilder.setSpan(this.X0, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        ei.d dVar = this.f1685k0;
        dVar.g(spannableStringBuilder, true, true);
        dVar.f(null, true);
        dVar.setOnClickListener(new c2(this, 27));
        this.f1675f0.setWearPreview(MessagesController.getInstance(this.currentAccount).getUserOrChat(peerDialogId));
        M2(2, false, null);
        this.A0 = true;
    }

    public final void H1(long j10, TL_stars.starGiftDepositPayload stargiftdepositpayload, pf.c cVar, ug.l1 l1Var) {
        TL_wallet.nftItem nftitem = this.f1676f1;
        TL_stars.TL_starGiftUnique X1 = X1();
        if (nftitem != null && X1 != null && !TextUtils.isEmpty(X1.slug)) {
            cVar.d();
            r3 r3Var = new r3(this, cVar, j10, X1, nftitem, l1Var);
            if (stargiftdepositpayload != null) {
                r3Var.run(stargiftdepositpayload);
                return;
            }
            TL_stars.depositStarGift depositstargift = new TL_stars.depositStarGift();
            depositstargift.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j10);
            depositstargift.slug = X1.slug;
            ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(depositstargift, new Object(), new u2(this, cVar, l1Var, r3Var, 1));
        }
    }

    public final void H2(CharSequence charSequence) {
        TL_stars.TL_starGiftUnique X1 = X1();
        TL_stars.InputSavedStarGift R1 = R1();
        if (R1 != null && X1 != null) {
            TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails = new TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails();
            tL_inputInvoiceStarGiftDropOriginalDetails.stargift = R1;
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftDropOriginalDetails;
            JSONObject q6 = gi.d3.q(this.resourcesProvider, false);
            if (q6 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = q6.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getPaymentForm, new x2(this, charSequence, X1, tL_inputInvoiceStarGiftDropOriginalDetails, 0));
        }
    }

    public final void I1(final long j10, final Utilities.Callback callback) {
        TLRPC.Message message;
        long peerDialogId;
        long j11;
        TL_stars.InputSavedStarGift R1 = R1();
        if (R1 != null) {
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
                transferstargift.stargift = R1;
                transferstargift.to_id = MessagesController.getInstance(this.currentAccount).getInputPeer(j10);
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(transferstargift, new b3(this, callback, j10, peerDialogId, 0));
                return;
            }
            final long j12 = peerDialogId;
            fa y3 = fa.y(this.currentAccount, false);
            if (!y3.e) {
                y3.r(new c3(this, y3, j10, callback, 0));
                return;
            }
            final TLRPC.TL_inputInvoiceStarGiftTransfer tL_inputInvoiceStarGiftTransfer = new TLRPC.TL_inputInvoiceStarGiftTransfer();
            tL_inputInvoiceStarGiftTransfer.stargift = R1;
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
                    final k7 k7Var = k7.this;
                    final TLRPC.TL_inputInvoiceStarGiftTransfer tL_inputInvoiceStarGiftTransfer2 = tL_inputInvoiceStarGiftTransfer;
                    final long j13 = j10;
                    final long j14 = j12;
                    final Utilities.Callback callback2 = callback;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            k7.o0(k7.this, tLObject, tL_inputInvoiceStarGiftTransfer2, j13, j14, callback2, tL_error);
                        }
                    });
                }
            });
        }
    }

    public final void I2(View view, CharSequence charSequence, boolean z10) {
        Layout layout;
        org.telegram.ui.Components.ad adVar;
        float primaryHorizontal;
        int i10;
        ei.x3 x3Var = this.f1712y1;
        if ((x3Var == null || !x3Var.V || this.f1714z1 != view) && view != null) {
            if (z10) {
                if (view instanceof org.telegram.ui.ActionBar.j5) {
                    org.telegram.ui.ActionBar.j5 j5Var = (org.telegram.ui.ActionBar.j5) view;
                    primaryHorizontal = (j5Var.getRightDrawableWidth() / 2.0f) + j5Var.getRightDrawableX();
                } else {
                    return;
                }
            } else {
                if (view instanceof TextView) {
                    layout = ((TextView) view).getLayout();
                } else if (view instanceof org.telegram.ui.ActionBar.j5) {
                    layout = ((org.telegram.ui.ActionBar.j5) view).getLayout();
                } else {
                    return;
                }
                if (layout != null) {
                    CharSequence text = layout.getText();
                    if (text instanceof Spanned) {
                        Spanned spanned = (Spanned) text;
                        org.telegram.ui.Components.ad[] adVarArr = (org.telegram.ui.Components.ad[]) spanned.getSpans(0, spanned.length(), org.telegram.ui.Components.ad.class);
                        if (adVarArr != null && adVarArr.length > 0) {
                            primaryHorizontal = layout.getPrimaryHorizontal(spanned.getSpanStart(adVarArr[adVarArr.length - 1])) + view.getPaddingLeft() + (adVar.a() / 2.0f);
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
            n5 n5Var = this.Y;
            n5Var.getLocationOnScreen(iArr);
            int[] iArr2 = {iArr2[0] - iArr[0], iArr2[1] - iArr[1]};
            ei.x3 x3Var2 = this.f1712y1;
            if (x3Var2 != null) {
                x3Var2.e(true);
                this.f1712y1 = null;
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
            x3Var3.f10081l0 = new w2(x3Var3, 0);
            x3Var3.u();
            n5Var.addView(x3Var3, w7.z5.d(100.0f, -1));
            this.f1712y1 = x3Var3;
            this.f1714z1 = view;
        }
    }

    public final void J1() {
        TL_stars.InputSavedStarGift R1;
        long j10;
        ei.d dVar = this.f1685k0;
        if (!dVar.N && (R1 = R1()) != null) {
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
            if (i10 > 0 || this.f1700s1 != null) {
                dVar.setLoading(true);
                xp xpVar = this.f1707w0;
                if (i10 > 0) {
                    TL_stars.upgradeStarGift upgradestargift = new TL_stars.upgradeStarGift();
                    upgradestargift.keep_original_details = xpVar.f32428a.f24147q;
                    upgradestargift.stargift = R1;
                    ConnectionsManager.getInstance(this.currentAccount).sendRequest(upgradestargift, new g(3, this, R1));
                    return;
                }
                int i11 = 0;
                fa y3 = fa.y(this.currentAccount, false);
                if (!y3.e) {
                    y3.r(new a1.f(18, this, y3));
                    return;
                }
                TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
                tL_payments_sendStarsForm.form_id = this.f1700s1.form_id;
                if (!TextUtils.isEmpty(str)) {
                    TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade tL_inputInvoiceStarGiftPrepaidUpgrade = new TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade();
                    tL_inputInvoiceStarGiftPrepaidUpgrade.hash = str;
                    tL_inputInvoiceStarGiftPrepaidUpgrade.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.X);
                    tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftPrepaidUpgrade;
                } else {
                    TLRPC.TL_inputInvoiceStarGiftUpgrade tL_inputInvoiceStarGiftUpgrade = new TLRPC.TL_inputInvoiceStarGiftUpgrade();
                    tL_inputInvoiceStarGiftUpgrade.keep_original_details = xpVar.f32428a.f24147q;
                    tL_inputInvoiceStarGiftUpgrade.stargift = R1;
                    tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftUpgrade;
                }
                ArrayList<TLRPC.TL_labeledPrice> arrayList = this.f1700s1.invoice.prices;
                int size = arrayList.size();
                while (i11 < size) {
                    TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i11);
                    i11++;
                    j11 += tL_labeledPrice.amount;
                }
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_sendStarsForm, new d0(this, str, R1, j11, 1));
            }
        }
    }

    public final void J2(int i10, Context context, boolean z10) {
        int i11;
        int i12;
        LinearLayout e = wh.e(context, 1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackground(org.telegram.ui.ActionBar.h6.K(AndroidUtilities.dp(64.0f), org.telegram.ui.ActionBar.h6.w0(org.telegram.ui.ActionBar.h6.Oh, this.resourcesProvider)));
        e.addView(frameLayout, w7.z5.t(64, 64, 49, 0, 6, 0, 0));
        ?? imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.f(R.raw.timer_3, 42, 42, null);
        frameLayout.addView((View) imageView, w7.z5.q(64, 64, 17));
        imageView.d();
        TextView b10 = w7.d6.b(context, 20.0f, org.telegram.ui.ActionBar.h6.G6, true, null);
        b10.setGravity(17);
        if (z10) {
            i11 = R.string.Gift2ResellTimeoutTitle;
        } else {
            i11 = R.string.Gift2TransferTimeoutTitle;
        }
        b10.setText(LocaleController.getString(i11));
        e.addView(b10, w7.z5.t(-1, -2, 48, 24, 14, 24, 0));
        TextView b11 = w7.d6.b(context, 14.0f, org.telegram.ui.ActionBar.h6.F6, false, null);
        b11.setGravity(17);
        if (z10) {
            i12 = R.string.Gift2ResellTimeout;
        } else {
            i12 = R.string.Gift2TransferTimeout;
        }
        b11.setText(LocaleController.formatString(i12, LocaleController.formatTTLString(Math.max(10, i10))));
        e.addView(b11, w7.z5.t(-1, -2, 48, 24, 6, 24, 6));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, this.resourcesProvider);
        alertDialog$Builder.n(e);
        org.telegram.messenger.q.p(R.string.OK, alertDialog$Builder, null);
    }

    public final void L2(boolean z10, org.telegram.ui.ActionBar.b2 b2Var, pf.c cVar, Runnable runnable) {
        cVar.d();
        UserConfig userConfig = UserConfig.getInstance(this.currentAccount);
        TL_account.tmpPassword tmppassword = userConfig.tmpPassword;
        if (tmppassword != null && tmppassword.valid_until < ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() + 60) {
            userConfig.tmpPassword = null;
            userConfig.saveConfig(false);
        }
        TL_account.tmpPassword tmppassword2 = userConfig.tmpPassword;
        if (tmppassword2 == null) {
            n2(z10, cVar, runnable);
        } else {
            Z1(new TLRPC.TL_inputCheckPasswordEmpty(), tmppassword2.tmp_password, null, z10, new q3(this, z10, cVar, runnable, b2Var));
        }
    }

    @Override
    public final boolean M() {
        return false;
    }

    public final int M1() {
        if (this.f1668b1.d(1)) {
            return this.f1699s0.getMeasuredHeight();
        }
        if (this.f1668b1.d(2)) {
            return this.B0.getMeasuredHeight();
        }
        if (this.f1668b1.d(3)) {
            return this.D0.getMeasuredHeight();
        }
        if (this.f1668b1.d(4)) {
            return 0;
        }
        return this.f1677g0.getMeasuredHeight();
    }

    public final void M2(int r12, boolean r13, ah.t r14) {
        throw new UnsupportedOperationException("Method not decompiled: ai.k7.M2(int, boolean, ah.t):void");
    }

    public final long N1() {
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

    public final void N2(boolean z10) {
        boolean z11;
        int i10;
        int i11;
        TL_stars.TL_starGiftUnique X1 = X1();
        if (X1 == null) {
            return;
        }
        MessagesController.getGlobalMainSettings().edit().putInt("statusgiftpage", 3).apply();
        boolean c22 = c2(this.currentAccount, X1());
        boolean z12 = !c22;
        boolean c23 = c2(this.currentAccount, X1());
        ei.d dVar = this.f1685k0;
        if (c23) {
            MessagesController.getInstance(this.currentAccount).updateEmojiStatus(N1(), new TLRPC.TL_emojiStatusEmpty(), null);
            z11 = z12;
        } else {
            z11 = z12;
            long N1 = N1();
            if (N1 >= 0) {
                if (!UserConfig.getInstance(this.currentAccount).isPremium()) {
                    org.telegram.ui.Components.qc P = getBulletinFactory().P(R.raw.star_premium_2, AndroidUtilities.premiumText(LocaleController.getString(R.string.Gift2ActionWearNeededPremium), new b2(this, 3)));
                    P.f29649t = true;
                    P.j();
                    return;
                }
            } else if (!z10) {
                MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
                dVar.setLoading(true);
                MessagesController.getInstance(this.currentAccount).getBoostsController().getBoostsStats(N1, new f2(this, messagesController, N1, 0));
                return;
            }
            TLRPC.TL_inputEmojiStatusCollectible tL_inputEmojiStatusCollectible = new TLRPC.TL_inputEmojiStatusCollectible();
            tL_inputEmojiStatusCollectible.collectible_id = X1.f20496id;
            MessagesController.getInstance(this.currentAccount).updateEmojiStatus(N1(), tL_inputEmojiStatusCollectible, X1);
        }
        ah.v vVar = this.f1675f0.I[1];
        if (!c22) {
            i10 = R.drawable.filled_crown_off;
        } else {
            i10 = R.drawable.filled_crown_on;
        }
        if (!c22) {
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
        if (this.f1668b1.c(0)) {
            tVar.run();
        } else {
            M2(0, true, tVar);
        }
        dVar.g(LocaleController.getString(R.string.OK), !this.f1674e1, true);
        dVar.f(null, !this.f1674e1);
        dVar.setOnClickListener(new c2(this, 5));
    }

    public final TL_stars.StarGift O1() {
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

    public final void O2() {
        FrameLayout frameLayout = this.f1689n0;
        int visibility = frameLayout.getVisibility();
        FrameLayout frameLayout2 = this.f1693p0;
        FrameLayout frameLayout3 = this.f1687l0;
        if (visibility == 0) {
            frameLayout3.setTranslationY(this.f1668b1.a(1) * (-frameLayout.getMeasuredHeight()));
            frameLayout.setTranslationY((1.0f - this.f1668b1.a(1)) * frameLayout.getMeasuredHeight());
            frameLayout2.setTranslationY(this.f1668b1.a(1) * (-frameLayout.getMeasuredHeight()));
            return;
        }
        frameLayout3.setTranslationY(0.0f);
        frameLayout.setTranslationY(0.0f);
        frameLayout2.setTranslationY(0.0f);
    }

    public final String P1() {
        TL_stars.StarGift O1 = O1();
        if (O1 instanceof TL_stars.TL_starGiftUnique) {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) O1;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(tL_starGiftUnique.title);
            sb2.append(" #");
            return org.telegram.messenger.q.h(tL_starGiftUnique.num, ',', sb2);
        }
        return "";
    }

    public final void P2() {
        boolean Y1 = Y1(false);
        h5 h5Var = this.Z;
        h5Var.setPosition(Y1 ? 1 : 0);
        h5Var.C(false);
        if (this.G0 != null && !Y1(true) && this.G0.e() < this.G0.c()) {
            this.G0.a();
        }
    }

    public final void Q2() {
        TL_stars.TL_starGiftUnique X1 = X1();
        TL_wallet.nftItem nftitem = this.f1676f1;
        LinearLayout linearLayout = this.f1711y0;
        if (nftitem != null && X1 != null) {
            this.f1679h0.setVisibility(8);
            this.f1683j0.setVisibility(8);
            boolean z10 = false;
            linearLayout.setVisibility(0);
            if (X1.host_id != null) {
                z10 = true;
            }
            this.f1713z0.a(z10, linearLayout.isAttachedToWindow());
            return;
        }
        linearLayout.setVisibility(8);
    }

    public final TL_stars.InputSavedStarGift R1() {
        TLRPC.Message message;
        TLRPC.Message message2;
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
        if (messageObject2 != null && messageObject2.getDialogId() < 0 && (message2 = this.H0.messageOwner) != null) {
            TLRPC.MessageAction messageAction2 = message2.action;
            if ((messageAction2 instanceof TLRPC.TL_messageActionStarGift) && (messageAction2.flags & 4096) != 0) {
                TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat2 = new TL_stars.TL_inputSavedStarGiftChat();
                tL_inputSavedStarGiftChat2.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.H0.getDialogId());
                tL_inputSavedStarGiftChat2.saved_id = ((TLRPC.TL_messageActionStarGift) messageAction2).saved_id;
                return tL_inputSavedStarGiftChat2;
            }
        }
        MessageObject messageObject3 = this.H0;
        if (messageObject3 != null && messageObject3.getDialogId() < 0 && (message = this.H0.messageOwner) != null) {
            TLRPC.MessageAction messageAction3 = message.action;
            if ((messageAction3 instanceof TLRPC.TL_messageActionStarGiftUnique) && (messageAction3.flags & 128) != 0) {
                TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat3 = new TL_stars.TL_inputSavedStarGiftChat();
                tL_inputSavedStarGiftChat3.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.H0.getDialogId());
                tL_inputSavedStarGiftChat3.saved_id = ((TLRPC.TL_messageActionStarGiftUnique) messageAction3).saved_id;
                return tL_inputSavedStarGiftChat3;
            }
        }
        TL_stars.TL_inputSavedStarGiftUser tL_inputSavedStarGiftUser = new TL_stars.TL_inputSavedStarGiftUser();
        MessageObject messageObject4 = this.H0;
        if (messageObject4 != null) {
            TLRPC.Message message4 = messageObject4.messageOwner;
            if (message4 != null) {
                TLRPC.MessageAction messageAction4 = message4.action;
                if ((messageAction4 instanceof TLRPC.TL_messageActionStarGift) && (messageAction4.flags & 32768) != 0) {
                    tL_inputSavedStarGiftUser.msg_id = ((TLRPC.TL_messageActionStarGift) messageAction4).gift_msg_id;
                    return tL_inputSavedStarGiftUser;
                }
            }
            tL_inputSavedStarGiftUser.msg_id = messageObject4.getId();
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

    public final String S1() {
        TL_stars.StarGift O1 = O1();
        if ((O1 instanceof TL_stars.TL_starGiftUnique) && O1.slug != null) {
            return MessagesController.getInstance(this.currentAccount).linkPrefix + "/nft/" + O1.slug;
        }
        return null;
    }

    public final int T1() {
        int indexOf;
        y9 y9Var = this.G0;
        if (y9Var != null) {
            TL_stars.SavedStarGift savedStarGift = this.F0;
            if (savedStarGift != null) {
                indexOf = y9Var.indexOf(savedStarGift);
            } else {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = this.J0;
                if (tL_starGiftUnique != null) {
                    indexOf = y9Var.indexOf(tL_starGiftUnique);
                } else {
                    return -1;
                }
            }
            if (indexOf >= 0) {
                return indexOf;
            }
            TL_stars.StarGift O1 = O1();
            for (int i10 = 0; i10 < this.G0.e(); i10++) {
                Object obj = this.G0.get(i10);
                if (obj instanceof TL_stars.SavedStarGift) {
                    TL_stars.SavedStarGift savedStarGift2 = this.F0;
                    if (savedStarGift2 != null) {
                        if (K1(savedStarGift2, (TL_stars.SavedStarGift) obj)) {
                            return i10;
                        }
                    }
                    if (O1 != null) {
                        TL_stars.StarGift starGift = ((TL_stars.SavedStarGift) obj).gift;
                        if (O1 != starGift) {
                            if ((O1 instanceof TL_stars.TL_starGiftUnique) && (starGift instanceof TL_stars.TL_starGiftUnique) && O1.f20496id == starGift.f20496id) {
                            }
                        }
                        return i10;
                    }
                    continue;
                } else {
                    if ((obj instanceof TL_stars.TL_starGiftUnique) && L1(this.J0, (TL_stars.TL_starGiftUnique) obj)) {
                        return i10;
                    }
                }
            }
            return -1;
        }
        return -1;
    }

    public final TL_stars.SavedStarGift U1(boolean z10) {
        int i10;
        Object obj;
        int T1 = T1();
        if (T1 < 0) {
            return null;
        }
        if (z10) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        int i11 = i10 + T1;
        int i12 = this.U0;
        if (i12 >= 0 && (!z10 ? i12 < T1 : i12 > T1)) {
            i11 = i12;
        }
        y9 y9Var = this.G0;
        if (y9Var != null && i11 >= 0 && i11 < y9Var.e()) {
            obj = this.G0.get(i11);
        } else {
            obj = null;
        }
        if (!(obj instanceof TL_stars.SavedStarGift)) {
            return null;
        }
        return (TL_stars.SavedStarGift) obj;
    }

    public final TL_stars.TL_starGiftUnique V1(boolean z10) {
        int i10;
        Object obj;
        int T1 = T1();
        if (T1 < 0) {
            return null;
        }
        if (z10) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        int i11 = i10 + T1;
        int i12 = this.U0;
        if (i12 >= 0 && (!z10 ? i12 < T1 : i12 > T1)) {
            i11 = i12;
        }
        y9 y9Var = this.G0;
        if (y9Var != null && i11 >= 0 && i11 < y9Var.e()) {
            obj = this.G0.get(i11);
        } else {
            obj = null;
        }
        if (!(obj instanceof TL_stars.TL_starGiftUnique)) {
            return null;
        }
        return (TL_stars.TL_starGiftUnique) obj;
    }

    public final TL_stars.TL_starGiftUnique X1() {
        TL_stars.StarGift O1 = O1();
        if (O1 instanceof TL_stars.TL_starGiftUnique) {
            return (TL_stars.TL_starGiftUnique) O1;
        }
        return null;
    }

    public final boolean Y1(boolean z10) {
        if (U1(z10) == null && V1(z10) == null) {
            return false;
        }
        return true;
    }

    public final void Z1(TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, byte[] bArr, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, q3 q3Var) {
        TL_stars.getStarGiftWithdrawalUrl getstargiftwithdrawalurl;
        TL_stars.InputSavedStarGift R1 = R1();
        if (R1 == null) {
            if (q3Var != null) {
                q3Var.run(Boolean.FALSE);
                return;
            }
            return;
        }
        if (z10) {
            TL_stars.withdrawStarGift withdrawstargift = new TL_stars.withdrawStarGift();
            withdrawstargift.keep_on_profile = this.f1710x1;
            withdrawstargift.stargift = R1;
            withdrawstargift.password = inputCheckPasswordSRP;
            withdrawstargift.tmp_password = bArr;
            getstargiftwithdrawalurl = withdrawstargift;
        } else {
            TL_stars.getStarGiftWithdrawalUrl getstargiftwithdrawalurl2 = new TL_stars.getStarGiftWithdrawalUrl();
            getstargiftwithdrawalurl2.stargift = R1;
            getstargiftwithdrawalurl2.password = inputCheckPasswordSRP;
            getstargiftwithdrawalurl2.tmp_password = bArr;
            getstargiftwithdrawalurl = getstargiftwithdrawalurl2;
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(getstargiftwithdrawalurl, new j4(this, bArr, twoStepVerificationActivity, z10, q3Var, 0));
    }

    @Override
    public final boolean canDismissWithSwipe() {
        if (this.f1668b1.c(4)) {
            boolean z10 = this.f1675f0.M.f1156h0;
        }
        return false;
    }

    @Override
    public final boolean canDismissWithTouchOutside() {
        if (this.f1668b1.c(4) && this.f1675f0.M.f1156h0) {
            return false;
        }
        return super.canDismissWithTouchOutside();
    }

    @Override
    public final boolean canSwipeToBack(MotionEvent motionEvent) {
        if (this.f1668b1.c(4) && this.f1675f0.M.f1156h0) {
            return false;
        }
        return super.canSwipeToBack(motionEvent);
    }

    public final void d2() {
        throw new UnsupportedOperationException("Method not decompiled: ai.k7.d2():void");
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starUserGiftsLoaded) {
            if (this.G0 == ((x9) objArr[1])) {
                d6 d6Var = this.f1675f0.M;
                if (d6Var == null || !d6Var.f1156h0) {
                    P2();
                }
            }
        }
    }

    @Override
    public final void dismiss() {
        if (this.f1668b1.c(4) && this.f1675f0.M.f1156h0) {
            return;
        }
        yh.f4 f4Var = this.W0;
        if (f4Var != null) {
            f4Var.b();
            this.W0 = null;
        }
        s6 s6Var = this.P0;
        if (s6Var != null) {
            s6Var.a();
        }
        super.dismiss();
    }

    public final void e2(android.view.View r6) {
        throw new UnsupportedOperationException("Method not decompiled: ai.k7.e2(android.view.View):void");
    }

    public final void f2() {
        a5 a5Var = this.Z0;
        if (a5Var != null && a5Var.isShown()) {
            this.Z0.dismiss();
        }
        String S1 = S1();
        a5 a5Var2 = new a5(this, getContext(), S1, S1, this.resourcesProvider);
        this.Z0 = a5Var2;
        a5Var2.f25675s0 = new a6.i(this, 4);
        a5Var2.show();
    }

    public final void g2() {
        throw new UnsupportedOperationException("Method not decompiled: ai.k7.g2():void");
    }

    @Override
    public org.telegram.ui.Components.xc getBulletinFactory() {
        return new org.telegram.ui.Components.xc(this.f1693p0, this.resourcesProvider);
    }

    public final void h2() {
        TL_stars.TL_starGiftUnique X1 = X1();
        if (X1 == null) {
            return;
        }
        ld.g1(getContext(), this.currentAccount, X1, new s4(this, X1, 2), this.resourcesProvider);
    }

    public final void i2() {
        int i10;
        TL_wallet.nftItem nftitem;
        String str;
        org.telegram.ui.Wallet.s4 s4Var = this.f1678g1;
        if (s4Var != null) {
            i10 = ((org.telegram.ui.ActionBar.n2) s4Var.f34866c).currentAccount;
            if (!org.telegram.ui.Wallet.w7.H(i10, s4Var.f34864a.slug)) {
                org.telegram.ui.Wallet.s4 s4Var2 = this.f1678g1;
                org.telegram.ui.Wallet.w7 w7Var = s4Var2.f34866c.f34491k0;
                if (w7Var == null || (nftitem = s4Var2.f34865b) == null || (str = nftitem.address) == null || !str.equals(w7Var.K0)) {
                    K2(getContext(), this.currentAccount, getBulletinFactory(), this.resourcesProvider, X1());
                    return;
                }
            }
            org.telegram.ui.Wallet.s4 s4Var3 = this.f1678g1;
            dismiss();
            Objects.requireNonNull(s4Var3);
            AndroidUtilities.runOnUIThread(new a3.d(s4Var3, 12), 250L);
        }
    }

    public final void j2() {
        if (UserConfig.getInstance(this.currentAccount).isPremium() && (c2(this.currentAccount, X1()) || this.Y0)) {
            N2(false);
            return;
        }
        TL_stars.TL_starGiftUnique X1 = X1();
        if (X1 == null) {
            return;
        }
        TLRPC.Peer peer = X1.owner_id;
        if (peer == null) {
            peer = X1.host_id;
        }
        long peerDialogId = DialogObject.getPeerDialogId(peer);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(X1.title);
        sb2.append(" #");
        this.C0.setText(LocaleController.formatString(R.string.Gift2WearTitle, org.telegram.messenger.q.h(X1.num, ',', sb2)));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.Gift2WearStart));
        if (!UserConfig.getInstance(this.currentAccount).isPremium()) {
            spannableStringBuilder.append((CharSequence) " l");
            if (this.X0 == null) {
                this.X0 = new yq(R.drawable.msg_mini_lock3, 0);
            }
            spannableStringBuilder.setSpan(this.X0, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        ei.d dVar = this.f1685k0;
        dVar.g(spannableStringBuilder, true, true);
        dVar.f(null, true);
        dVar.setOnClickListener(new c2(this, 4));
        this.f1675f0.setWearPreview(MessagesController.getInstance(this.currentAccount).getUserOrChat(peerDialogId));
        M2(2, true, null);
    }

    public final void k2(long j10, String str) {
        this.f1690n1 = true;
        fa.y(this.currentAccount, false).K(j10, new n2(2, this, str));
    }

    public final void l2(boolean z10) {
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
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20601a;
            b2Var.R = string;
            b2Var.T = LocaleController.formatString(R.string.GiftCraftLaterText, LocaleController.formatDateTime(i10, true));
            org.telegram.messenger.q.p(R.string.OK, alertDialog$Builder, null);
            return;
        }
        TL_stars.TL_starGiftUnique X1 = X1();
        if (X1 == null) {
            return;
        }
        if (!TextUtils.isEmpty(X1.gift_address)) {
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
            String string2 = LocaleController.getString(R.string.GiftCraftCantChooseFirstTitle);
            org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.f20601a;
            b2Var2.R = string2;
            b2Var2.T = LocaleController.getString(R.string.GiftCraftCantChooseFirst);
            org.telegram.messenger.q.p(R.string.OK, alertDialog$Builder2, null);
            return;
        }
        e7 e7Var = this.f1675f0;
        if (z10) {
            e7Var.M.a(this.currentAccount, X1.gift_id, X1.getDocument(), X1.title);
            if (F1()) {
                d6 d6Var = e7Var.M;
                TL_stars.TL_starGiftUnique X12 = X1();
                if (X12 == null) {
                    d6Var.getClass();
                } else {
                    while (true) {
                        b6[] b6VarArr = d6Var.f1161n;
                        if (i11 >= b6VarArr.length) {
                            break;
                        }
                        b6 b6Var = b6VarArr[i11];
                        TL_stars.StarGift starGift = b6Var.h;
                        if (starGift == null) {
                            starGift = null;
                        }
                        if (starGift == null) {
                            b6Var.a(X12, true);
                            break;
                        }
                        i11++;
                    }
                    d6Var.d(true);
                }
            }
        }
        d6 d6Var2 = e7Var.M;
        d6 d6Var3 = e7Var.M;
        d6Var2.setOnCraft(new i2(this, 1));
        if (this.W0 == null) {
            yh.f4 f4Var = new yh.f4(this.currentAccount, X1.gift_id);
            this.W0 = f4Var;
            f4Var.a();
        }
        d6Var3.setOnAddGift(new s4(this, X1, 1));
        d6Var3.setOnClose(new b2(this, 22));
        M2(4, true, null);
    }

    public final void m2(long j10) {
        ei.x3 x3Var = this.f1712y1;
        if (x3Var != null) {
            x3Var.e(true);
            this.f1712y1 = null;
        }
        dismiss();
        org.telegram.ui.ActionBar.n2 U = LaunchActivity.U();
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

    public final void n2(boolean z10, pf.c cVar, Runnable runnable) {
        int i10;
        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
        if (z10) {
            i10 = 3;
        } else {
            i10 = 2;
        }
        d4 d4Var = new d4(this, twoStepVerificationActivity, z10, 0);
        twoStepVerificationActivity.Z = i10;
        twoStepVerificationActivity.f33924b0 = d4Var;
        twoStepVerificationActivity.f33922a0 = P1();
        twoStepVerificationActivity.s0(new a3.l0(this, runnable, cVar, twoStepVerificationActivity, 7));
    }

    public final void o2() {
        throw new UnsupportedOperationException("Method not decompiled: ai.k7.o2():void");
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starUserGiftsLoaded);
    }

    @Override
    public final void onBackPressed() {
        e7 e7Var;
        d6 d6Var;
        if (this.f1668b1.c(4) && (e7Var = this.f1675f0) != null && (d6Var = e7Var.M) != null) {
            if (d6Var.f1156h0) {
                return;
            }
            if (d6Var.f1157i0) {
                super.onBackPressed();
                return;
            }
        }
        if (!this.A0 && this.f1668b1.f1365c > 0 && !this.f1685k0.N && !this.f1690n1) {
            MessageObject messageObject = this.H0;
            if (messageObject != null) {
                B2(messageObject, null);
            } else {
                TL_stars.SavedStarGift savedStarGift = this.F0;
                if (savedStarGift != null) {
                    C2(savedStarGift, this.G0);
                } else {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = this.J0;
                    if (tL_starGiftUnique != null) {
                        A2(this.I0, tL_starGiftUnique, this.G0);
                    }
                }
            }
            M2(0, true, null);
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
        ei.x3 x3Var = this.f1712y1;
        if (x3Var != null) {
            x3Var.e(true);
            this.f1712y1 = null;
        }
    }

    public final void p2(long j10, long j11, boolean z10, Utilities.Callback callback) {
        String str;
        TLRPC.User user;
        String formatString;
        CharSequence string;
        TL_stars.TL_starGiftUnique X1 = X1();
        if (X1 == null) {
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
        linearLayout.addView(new f6(getContext(), X1, user), w7.z5.t(-1, -2, 48, 0, -4, 0, 0));
        TextView textView = new TextView(getContext());
        wh.o(org.telegram.ui.ActionBar.h6.f21092j5, this.resourcesProvider, textView, 1, 16.0f);
        if (j11 > 0) {
            formatString = LocaleController.formatPluralStringComma("Gift2TransferPriceText", (int) j11, P1(), DialogObject.getShortName(j10));
        } else {
            formatString = LocaleController.formatString(R.string.Gift2TransferText, P1(), str);
        }
        textView.setText(AndroidUtilities.replaceTags(formatString));
        linearLayout.addView(textView, w7.z5.t(-1, -2, 48, 24, 4, 24, 4));
        j01 j01Var = new j01(getContext(), this.resourcesProvider);
        B1(j01Var, fa.l(X1.attributes, TL_stars.starGiftAttributeModel.class));
        B1(j01Var, fa.l(X1.attributes, TL_stars.starGiftAttributeBackdrop.class));
        B1(j01Var, fa.l(X1.attributes, TL_stars.starGiftAttributePattern.class));
        if (!TextUtils.isEmpty(X1.slug) && (X1.flags & 256) != 0) {
            j01Var.c(LocaleController.getString(R.string.GiftValue2), r.c.g("~", BillingController.getInstance().formatCurrency(X1.value_amount, X1.value_currency, BillingController.getInstance().getCurrencyExp(X1.value_currency), true)), null, null);
        }
        linearLayout.addView(j01Var, w7.z5.t(-1, -2, 48, 23, 16, 23, 4));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
        alertDialog$Builder.n(linearLayout);
        if (j11 > 0) {
            string = ld.R0(LocaleController.formatString(R.string.Gift2TransferDoPrice, Integer.valueOf((int) j11)));
        } else {
            string = LocaleController.getString(R.string.Gift2TransferDo);
        }
        alertDialog$Builder.k(string, new a1.c(callback, 4));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f20601a;
        b2Var.X0 = z10;
        b2Var.show();
    }

    public final void q2(long j10, Utilities.Callback callback) {
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
        p2(j10, j11, true, callback);
    }

    public final void r2() {
        TL_stars.InputSavedStarGift R1;
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
        ei.x3 x3Var = this.f1712y1;
        if (x3Var != null) {
            x3Var.e(true);
            this.f1712y1 = null;
        }
        if (this.f1670c1 == null && (R1 = R1()) != null) {
            MessageObject messageObject = this.H0;
            long j13 = this.X;
            if (messageObject != null) {
                TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
                if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                    TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                    j11 = tL_messageActionStarGift.gift.f20496id;
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
                    j11 = starGift.f20496id;
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
            TextView textView = this.f1709x0;
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
            xp xpVar = this.f1707w0;
            xpVar.a(z14, false);
            ArrayList arrayList = this.f1692o1;
            if (arrayList != null && (j12 > j10 || this.f1700s1 != null)) {
                s2();
                return;
            }
            if (arrayList == null) {
                fa.y(this.currentAccount, false).K(j11, new i4(this, 2));
            }
            if (j12 <= j10 && this.f1700s1 == null) {
                this.f1698r1 = true;
                TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                if (!TextUtils.isEmpty(str)) {
                    TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade tL_inputInvoiceStarGiftPrepaidUpgrade = new TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade();
                    tL_inputInvoiceStarGiftPrepaidUpgrade.hash = str;
                    tL_inputInvoiceStarGiftPrepaidUpgrade.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j13);
                    tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftPrepaidUpgrade;
                } else {
                    TLRPC.TL_inputInvoiceStarGiftUpgrade tL_inputInvoiceStarGiftUpgrade = new TLRPC.TL_inputInvoiceStarGiftUpgrade();
                    tL_inputInvoiceStarGiftUpgrade.keep_original_details = xpVar.f32428a.f24147q;
                    tL_inputInvoiceStarGiftUpgrade.stargift = R1;
                    tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftUpgrade;
                }
                JSONObject q6 = gi.d3.q(this.resourcesProvider, false);
                if (q6 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                    tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                    tL_dataJSON.data = q6.toString();
                    tL_payments_getPaymentForm.flags |= 1;
                }
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getPaymentForm, new v4(this, 0));
            }
        }
    }

    public final void s2() {
        throw new UnsupportedOperationException("Method not decompiled: ai.k7.s2():void");
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
            org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(getContext(), 3, null);
            b2Var.q(500L);
            TL_stars.getUniqueStarGift getuniquestargift = new TL_stars.getUniqueStarGift();
            getuniquestargift.slug = this.I0;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(getuniquestargift, new g(1, this, b2Var));
        } else if (this.F0 == null && (messageObject = this.H0) != null && (message = messageObject.messageOwner) != null) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                if (tL_messageActionStarGift.upgraded) {
                    if (tL_messageActionStarGift.upgrade_msg_id != 0) {
                        org.telegram.ui.ActionBar.b2 b2Var2 = new org.telegram.ui.ActionBar.b2(getContext(), 3, null);
                        b2Var2.q(500L);
                        TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
                        tL_messages_getMessages.f20366id.add(Integer.valueOf(tL_messageActionStarGift.upgrade_msg_id));
                        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getMessages, new p2(this, tL_messageActionStarGift, b2Var2, 0));
                        return;
                    } else if (R1() != null) {
                        org.telegram.ui.ActionBar.b2 b2Var3 = new org.telegram.ui.ActionBar.b2(getContext(), 3, null);
                        b2Var3.q(500L);
                        fa.y(this.currentAccount, false).M(R1(), new n2(1, this, b2Var3));
                        return;
                    }
                }
            }
        }
        super.show();
    }

    public final void t2() {
        TL_stars.TL_starGiftUnique X1 = X1();
        if (this.f1676f1 != null && X1 != null && !TextUtils.isEmpty(X1.slug)) {
            Context context = getContext();
            int i10 = this.currentAccount;
            ug.l1[] l1VarArr = {new ug.l1(context, i10, BirthdayController.getInstance(i10).getState(), 3, this.resourcesProvider)};
            ug.l1 l1Var = l1VarArr[0];
            l1Var.f47746z0 = LocaleController.getString(R.string.Gift2TransferShort);
            org.telegram.ui.Components.xa xaVar = l1Var.e;
            if (xaVar != null) {
                xaVar.setTitle(l1Var.A());
            }
            ug.e1 e1Var = l1Var.f47723b0;
            if (e1Var != null) {
                e1Var.setText(l1Var.A());
            }
            ug.l1 l1Var2 = l1VarArr[0];
            l1Var2.G0 = true;
            l1Var2.i0(false, true);
            ug.l1 l1Var3 = l1VarArr[0];
            l1Var3.B0 = new n2(0, this, l1VarArr);
            l1Var3.show();
        }
    }

    public final void u2(final TL_stars.TL_starGiftUnique tL_starGiftUnique, final long j10, final ag.c cVar, final TLRPC.TL_textWithEntities tL_textWithEntities, final boolean z10, final yh.j0 j0Var) {
        this.f1685k0.setLoading(true);
        if (j0Var != null && !j0Var.L) {
            j0Var.L = true;
            j0Var.H.h(true);
        }
        fa.x(this.currentAccount, cVar).H(tL_starGiftUnique, j10, tL_textWithEntities, z10, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                k7.e0(k7.this, j0Var, cVar, tL_starGiftUnique, j10, tL_textWithEntities, z10, (TLRPC.TL_payments_paymentFormStarGift) obj);
            }
        });
    }

    public final SpannableStringBuilder w2(TLRPC.Peer peer) {
        if (peer != null) {
            String publicUsername = DialogObject.getPublicUsername(MessagesController.getInstance(this.currentAccount).getUserOrChat(DialogObject.getPeerDialogId(peer)));
            if (TextUtils.isEmpty(publicUsername)) {
                return null;
            }
            return AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.Gift2ReleasedBy2, r.c.g("@", publicUsername)), new g4(this, publicUsername, 8));
        }
        return null;
    }

    @Override
    public final hm0 x(im0 im0Var) {
        l5 l5Var = new l5(this, 0);
        this.T0 = l5Var;
        return l5Var;
    }

    public final SpannableStringBuilder x2(TL_stars.StarGift starGift) {
        if (starGift != null && !(starGift instanceof TL_stars.TL_starGiftUnique)) {
            return w2(starGift.released_by);
        }
        return null;
    }

    @Override
    public final int z() {
        return AndroidUtilities.dp(12.0f);
    }
}
