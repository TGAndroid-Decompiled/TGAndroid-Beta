package mh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Bundle;
import android.text.Layout;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TableRow;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.ApplicationLoader;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.ChannelBoostsController;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.ChatThemeController;
import org.telegram.messenger.DialogObject;
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
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.g90;
import org.telegram.ui.Components.ic;
import org.telegram.ui.Components.np;
import org.telegram.ui.Components.oq;
import org.telegram.ui.Components.pz0;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.qz0;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.rz0;
import org.telegram.ui.Components.s00;
import org.telegram.ui.Components.sc;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.sz0;
import org.telegram.ui.Components.tc;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.na1;
import org.telegram.ui.py;
import org.telegram.ui.xn;
import org.telegram.ui.yh;
public class g5 extends org.telegram.ui.Components.sa implements NotificationCenter.NotificationCenterDelegate {
    public static final int f14084n1 = 0;
    public m7 A0;
    public MessageObject B0;
    public String C0;
    public TL_stars.TL_starGiftUnique D0;
    public boolean E0;
    public boolean F0;
    public boolean G0;
    public boolean H0;
    public boolean I0;
    public r4 J0;
    public boolean K0;
    public r3 L0;
    public final int[] M0;
    public fg.g N0;
    public int O0;
    public String P0;
    public lh.p5 Q0;
    public oq R0;
    public boolean S0;
    public j3 T0;
    public final long U;
    public Float U0;
    public final eg.q1 V;
    public c5.d V0;
    public final o3 W;
    public ValueAnimator W0;
    public final s00 X;
    public oq X0;
    public lh.m3 Y;
    public boolean Y0;
    public lh.m3 Z;
    public View Z0;
    public final q3 f14085a0;
    public lh.z2 f14086a1;
    public final c5 f14087b0;
    public boolean f14088b1;
    public final p3 f14089c0;
    public Boolean f14090c1;
    public final g90 f14091d0;
    public boolean f14092d1;
    public final sz0 f14093e0;
    public ArrayList f14094e1;
    public final g90 f14095f0;
    public ArrayList f14096f1;
    public final qh.d f14097g0;
    public ArrayList f14098g1;
    public final FrameLayout f14099h0;
    public boolean f14100h1;
    public final g90 f14101i0;
    public TLRPC.PaymentForm f14102i1;
    public final FrameLayout f14103j0;
    public final oq[] f14104j1;
    public final View f14105k0;
    public final s1 f14106k1;
    public final FrameLayout f14107l0;
    public qh.e3 l1;
    public e5 m0;
    public View f14108m1;
    public boolean f14109n0;
    public final p3 f14110o0;
    public final sh.i[] f14111p0;
    public final View f14112q0;
    public final LinearLayout f14113r0;
    public final np f14114s0;
    public final TextView f14115t0;
    public boolean f14116u0;
    public final p3 f14117v0;
    public final TextView f14118w0;
    public final p3 f14119x0;
    public boolean f14120y0;
    public TL_stars.SavedStarGift f14121z0;

    public g5(Context context, int i10, long j10, org.telegram.ui.ActionBar.g6 g6Var, View view) {
        super(context, null, false, false, false, 1, g6Var);
        this.f14109n0 = false;
        this.M0 = new int[2];
        this.O0 = -1;
        this.P0 = "";
        this.V0 = new c5.d(0, 0);
        this.Y0 = true;
        this.f14104j1 = new oq[1];
        this.f14106k1 = new s1(this, 7);
        this.currentAccount = i10;
        this.U = j10;
        this.v = Math.max(0.05f, AndroidUtilities.dp(82.0f) / (AndroidUtilities.displaySize.y + AndroidUtilities.statusBarHeight));
        this.occupyNavigationBar = true;
        this.containerView = new eg.s2(this, context, 7);
        eg.q1 q1Var = new eg.q1(this, context);
        this.V = q1Var;
        o3 o3Var = new o3(this, context);
        this.W = o3Var;
        o3Var.setAdapter(new hg.u(this, context, 1));
        t2();
        View view2 = new View(context);
        int i11 = org.telegram.ui.ActionBar.k6.f21733h5;
        view2.setBackgroundColor(getThemedColor(i11));
        this.containerView.addView(view2, k7.c6.e(-1, 50, 80));
        this.containerView.addView(o3Var, k7.c6.e(-1, -1, 119));
        fixNavigationBar(getThemedColor(i11));
        AndroidUtilities.removeFromParent(this.d);
        q1Var.addView(this.d, k7.c6.e(-1, -1, 119));
        p3 p3Var = new p3(this, context, 0);
        this.f14089c0 = p3Var;
        p3Var.setOrientation(1);
        p3Var.setPadding(AndroidUtilities.dp(14.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(14.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(68.0f));
        q1Var.addView(p3Var, k7.c6.e(-1, -1, 55));
        g90 g90Var = new g90(context, g6Var);
        this.f14091d0 = g90Var;
        int i12 = org.telegram.ui.ActionBar.k6.f21895q5;
        g90Var.setTextColor(org.telegram.ui.ActionBar.k6.v0(i12, g6Var));
        g90Var.setTextSize(1, 12.0f);
        g90Var.setGravity(17);
        g90Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        g90Var.setLinkTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21722gc, g6Var));
        g90Var.setDisablePaddingsOffsetY(true);
        p3Var.addView(g90Var, k7.c6.t(-2, -2, 1, 4, -2, 4, 16));
        g90Var.setVisibility(8);
        sz0 sz0Var = new sz0(context, g6Var);
        this.f14093e0 = sz0Var;
        p3Var.addView(sz0Var, k7.c6.k(0.0f, 0.0f, 0.0f, 12.0f, -1, -2));
        g90 g90Var2 = new g90(context, g6Var);
        this.f14095f0 = g90Var2;
        g90Var2.setTextColor(org.telegram.ui.ActionBar.k6.v0(i12, g6Var));
        g90Var2.setTextSize(1, 12.0f);
        g90Var2.setGravity(17);
        g90Var2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        int i13 = org.telegram.ui.ActionBar.k6.Oh;
        g90Var2.setLinkTextColor(org.telegram.ui.ActionBar.k6.v0(i13, g6Var));
        g90Var2.setDisablePaddingsOffsetY(true);
        g90Var2.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), 0);
        p3Var.addView(g90Var2, k7.c6.t(-2, -2, 1, 4, 2, 4, 8));
        g90Var2.setVisibility(8);
        p3 p3Var2 = new p3(this, context, 1);
        this.f14110o0 = p3Var2;
        p3Var2.setOrientation(1);
        p3Var2.setPadding(AndroidUtilities.dp(4.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(4.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(66.0f));
        q1Var.addView(p3Var2, k7.c6.e(-1, -1, 55));
        this.f14111p0 = r5;
        sh.i iVar = new sh.i(context, g6Var, false);
        iVar.a(LocaleController.getString(R.string.Gift2UpgradeFeature1Title), LocaleController.getString(R.string.GiftsFeature1Text), R.drawable.menu_feature_unique);
        p3Var2.addView(r5[0], k7.c6.n(-1, -2));
        sh.i iVar2 = new sh.i(context, g6Var, false);
        iVar2.a(LocaleController.getString(R.string.Gift2UpgradeFeature3Title), LocaleController.getString(R.string.GiftsFeature2Text), R.drawable.menu_feature_tradable);
        p3Var2.addView(r5[1], k7.c6.n(-1, -2));
        sh.i iVar3 = new sh.i(context, g6Var, false);
        sh.i[] iVarArr = {iVar, iVar2, iVar3};
        iVar3.a(LocaleController.getString(R.string.GiftsFeature3Title), LocaleController.getString(R.string.GiftsFeature3Text), R.drawable.menu_wear);
        p3Var2.addView(iVarArr[2], k7.c6.n(-1, -2));
        View view3 = new View(context);
        this.f14112q0 = view3;
        int i14 = org.telegram.ui.ActionBar.k6.f21662d7;
        view3.setBackgroundColor(org.telegram.ui.ActionBar.k6.v0(i14, g6Var));
        p3Var2.addView(view3, k7.c6.s(-2, 7, 17, -4, 17, 1.0f / AndroidUtilities.density, 6));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f14113r0 = linearLayout;
        linearLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        linearLayout.setOrientation(0);
        linearLayout.setBackground(org.telegram.ui.ActionBar.k6.Y(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21752i6, g6Var), 6, 6));
        np npVar = new np(context, 24, g6Var);
        this.f14114s0 = npVar;
        npVar.b(org.telegram.ui.ActionBar.k6.f21735h7, org.telegram.ui.ActionBar.k6.f21770j7, org.telegram.ui.ActionBar.k6.f21788k7);
        npVar.setDrawUnchecked(true);
        npVar.a(false, false);
        npVar.setDrawBackgroundAsArc(10);
        linearLayout.addView(npVar, k7.c6.t(26, 26, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.f14115t0 = textView;
        int i15 = org.telegram.ui.ActionBar.k6.f21768j5;
        textView.setTextColor(getThemedColor(i15));
        textView.setTextSize(1, 14.0f);
        textView.setText(LocaleController.getString(R.string.Gift2AddSenderName));
        linearLayout.addView(textView, k7.c6.t(-2, -2, 16, 9, 0, 0, 0));
        p3Var2.addView(linearLayout, k7.c6.t(-2, -2, 1, 0, 0, 0, 4));
        k7.e6.b(linearLayout, 0.025f, 1.5f);
        p3 p3Var3 = new p3(this, context, 2);
        this.f14117v0 = p3Var3;
        p3Var3.setOrientation(1);
        p3Var3.setPadding(AndroidUtilities.dp(4.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(4.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(66.0f));
        q1Var.addView(p3Var3, k7.c6.e(-1, -1, 55));
        TextView textView2 = new TextView(context);
        this.f14118w0 = textView2;
        org.telegram.ui.b.l(i15, g6Var, textView2, 1, 20.0f);
        textView2.setGravity(17);
        textView2.setTypeface(AndroidUtilities.bold());
        p3Var3.addView(textView2, k7.c6.t(-1, -2, 7, 20, 0, 20, 0));
        TextView textView3 = new TextView(context);
        org.telegram.ui.b.l(i15, g6Var, textView3, 1, 14.0f);
        textView3.setGravity(17);
        textView3.setText(LocaleController.getString(R.string.Gift2WearSubtitle));
        p3Var3.addView(textView3, k7.c6.t(-1, -2, 7, 20, 6, 20, 24));
        sh.i iVar4 = new sh.i(context, g6Var, false);
        iVar4.a(LocaleController.getString(R.string.Gift2WearFeature1Title), LocaleController.getString(R.string.Gift2WearFeature1Text), R.drawable.menu_feature_unique);
        p3Var3.addView(r7[0], k7.c6.n(-1, -2));
        sh.i iVar5 = new sh.i(context, g6Var, false);
        iVar5.a(LocaleController.getString(R.string.Gift2WearFeature2Title), LocaleController.getString(R.string.Gift2WearFeature2Text), R.drawable.menu_feature_cover);
        p3Var3.addView(r7[1], k7.c6.n(-1, -2));
        sh.i iVar6 = new sh.i(context, g6Var, false);
        sh.i[] iVarArr2 = {iVar4, iVar5, iVar6};
        iVar6.a(LocaleController.getString(R.string.Gift2WearFeature3Title), LocaleController.getString(R.string.Gift2WearFeature3Text), R.drawable.menu_verification);
        p3Var3.addView(iVarArr2[2], k7.c6.n(-1, -2));
        p3 p3Var4 = new p3(this, context, 3);
        this.f14119x0 = p3Var4;
        p3Var4.setOrientation(1);
        p3Var4.setPadding(AndroidUtilities.dp(4.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(92.0f));
        q1Var.addView(p3Var4, k7.c6.e(-1, -1, 55));
        sh.i iVar7 = new sh.i(context, g6Var, false);
        iVar7.a(LocaleController.getString(R.string.GiftCraftInfoFeature1Title), LocaleController.getString(R.string.GiftCraftInfoFeature1Text), R.drawable.menu_feature_unique);
        p3Var4.addView(r9[0], k7.c6.n(-1, -2));
        sh.i iVar8 = new sh.i(context, g6Var, false);
        iVar8.a(LocaleController.getString(R.string.GiftCraftInfoFeature2Title), LocaleController.getString(R.string.GiftCraftInfoFeature2Text), R.drawable.menu_random);
        p3Var4.addView(r9[1], k7.c6.n(-1, -2));
        sh.i iVar9 = new sh.i(context, g6Var, false);
        sh.i[] iVarArr3 = {iVar7, iVar8, iVar9};
        iVar9.a(LocaleController.getString(R.string.GiftCraftInfoFeature3Title), LocaleController.getString(R.string.GiftCraftInfoFeature3Text), R.drawable.menu_feature_affect);
        p3Var4.addView(iVarArr3[2], k7.c6.n(-1, -2));
        p3Var.setAlpha(1.0f);
        p3Var2.setAlpha(0.0f);
        p3Var3.setAlpha(0.0f);
        p3Var4.setAlpha(0.0f);
        c5 c5Var = new c5(context, g6Var, new s1(this, 9), new k1(this, 13), new k1(this, 14), new k1(this, 15), new k1(this, 16), new k1(this, 17), new k1(this, 18), new k1(this, 19));
        this.f14087b0 = c5Var;
        c5Var.I.f14020c.setOnClickListener(new k1(this, 20));
        int i16 = this.backgroundPaddingLeft;
        c5Var.setPadding(i16, 0, i16, 0);
        q1Var.addView(c5Var, k7.c6.e(-1, -2, 55));
        org.telegram.ui.k kVar = this.f31014c;
        this.N = true;
        kVar.k1(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f14099h0 = frameLayout;
        frameLayout.setBackgroundColor(getThemedColor(i11));
        View view4 = new View(context);
        this.f14105k0 = view4;
        view4.setBackgroundColor(getThemedColor(i14));
        view4.setAlpha(0.0f);
        frameLayout.addView(view4, k7.c6.a(-1.0f, 1.0f / AndroidUtilities.density, 55));
        qh.d p10 = org.telegram.messenger.y3.p(24, context, g6Var, true);
        this.f14097g0 = p10;
        p10.g(LocaleController.getString(R.string.OK), false, true);
        p10.f(null, false);
        FrameLayout.LayoutParams d = k7.c6.d(-1, 48.0f, 119, 0.0f, 12.0f, 0.0f, 12.0f);
        d.leftMargin = AndroidUtilities.dp(14.0f) + this.backgroundPaddingLeft;
        d.rightMargin = AndroidUtilities.dp(14.0f) + this.backgroundPaddingLeft;
        frameLayout.addView(p10, d);
        q1Var.addView(frameLayout, k7.c6.e(-1, 72, 87));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f14103j0 = frameLayout2;
        frameLayout2.setBackgroundColor(getThemedColor(i11));
        g90 g90Var3 = new g90(context, null);
        this.f14101i0 = g90Var3;
        g90Var3.setTextSize(1, 12.0f);
        g90Var3.setTextColor(org.telegram.ui.ActionBar.k6.v0(i13, g6Var));
        g90Var3.setLinkTextColor(org.telegram.ui.ActionBar.k6.v0(i13, g6Var));
        g90Var3.setGravity(17);
        frameLayout2.addView(g90Var3, k7.c6.d(-1, -2.0f, 17, 16.0f, 8.0f, 16.0f, 14.0f));
        q1Var.addView(frameLayout2, k7.c6.e(-1, -2, 87));
        frameLayout2.setVisibility(8);
        this.d.setOnScrollListener(new fg.e2(this, 8));
        linearLayout.setOnClickListener(new k1(this, 12));
        s00 s00Var = new s00(context);
        this.X = s00Var;
        q1Var.addView(s00Var, k7.c6.c(-1.0f, -1));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f14107l0 = frameLayout3;
        frameLayout3.setPadding(AndroidUtilities.dp(6.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(6.0f) + this.backgroundPaddingLeft, 0);
        q1Var.addView(frameLayout3, k7.c6.d(-1, 200.0f, 87, 0.0f, 0.0f, 0.0f, 60.0f));
        AndroidUtilities.removeFromParent(this.f31015e);
        q1Var.addView(this.f31015e, k7.c6.d(-1, -2.0f, 0, 6.0f, 0.0f, 6.0f, 0.0f));
        q3 q3Var = new q3(context);
        this.f14085a0 = q3Var;
        q1Var.addView(q3Var, k7.c6.e(-1, -2, 55));
        ArrayList arrayList = new ArrayList();
        if (view != null) {
            arrayList.add(view);
        }
        AndroidUtilities.makeGlobalBlurBitmap(new dg.h0(q3Var, 20), 12.0f, 12, null, arrayList);
    }

    public static void A0(g5 g5Var, long j10) {
        new lh.g2(g5Var.getContext(), g5Var.currentAccount, j10, null, new x2(g5Var, 2)).show();
    }

    public static void B0(g5 g5Var, af.f fVar, org.telegram.ui.ActionBar.d2 d2Var, TLObject tLObject, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.TL_error tL_error, long j10, CharSequence charSequence) {
        boolean z4 = false;
        fVar.c(false);
        d2Var.dismiss();
        if (tLObject instanceof TLRPC.TL_payments_paymentResult) {
            int i10 = 0;
            while (i10 < tL_starGiftUnique.attributes.size()) {
                if (tL_starGiftUnique.attributes.get(i10) instanceof TL_stars.starGiftAttributeOriginalDetails) {
                    tL_starGiftUnique.attributes.remove(i10);
                    i10--;
                }
                i10++;
            }
            TL_stars.SavedStarGift savedStarGift = g5Var.f14121z0;
            if (savedStarGift != null) {
                z4 = savedStarGift.refunded;
            }
            g5Var.k2(tL_starGiftUnique, z4, null, null);
            AndroidUtilities.runOnUIThread(new m2(4, g5Var, tL_starGiftUnique));
        } else if (tL_error != null && "BALANCE_TOO_LOW".equalsIgnoreCase(tL_error.text)) {
            new z9(g5Var.getContext(), g5Var.resourcesProvider, j10, 16, null, new m2(6, g5Var, charSequence), 0L).show();
        } else if (tL_error != null) {
            g5Var.getBulletinFactory().d0(tL_error, false);
        }
    }

    public static void C0(g5 g5Var, String str) {
        Context context = g5Var.getContext();
        af.g.u(context, MessagesController.getInstance(g5Var.currentAccount).tonBlockchainExplorerUrl + str);
    }

    public static void D0(g5 g5Var, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, long j10, MessagesController messagesController, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        g5Var.f14097g0.setLoading(false);
        fg.x1 x1Var = new fg.x1(g5Var, 3);
        fg.v0 v0Var = new fg.v0(26, g5Var.currentAccount, g5Var.getContext(), x1Var, g5Var.resourcesProvider);
        v0Var.G1(canApplyBoost);
        v0Var.F1(tL_premium_boostsStatus, true);
        v0Var.H1(j10);
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(-j10));
        if (chat != null) {
            v0Var.N0 = new hg.i(g5Var, chat);
        }
        v0Var.show();
    }

    public static String D1(TL_stars.StarGift starGift) {
        if (starGift instanceof TL_stars.TL_starGiftUnique) {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
            StringBuilder sb = new StringBuilder();
            sb.append(tL_starGiftUnique.title);
            sb.append(" #");
            return l.d.l(tL_starGiftUnique.num, ',', sb);
        } else if ((starGift instanceof TL_stars.TL_starGift) && !TextUtils.isEmpty(starGift.title)) {
            return starGift.title;
        } else {
            return LocaleController.getString(R.string.Gift2Gift);
        }
    }

    public static void E0(g5 g5Var, int i10, int i11, int i12, TL_stars.TL_starGiftUnique tL_starGiftUnique, hg.v2[] v2VarArr, Long l10) {
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        if (l10.longValue() == -99) {
            if (i10 < i11) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(g5Var.getContext(), 0, g5Var.resourcesProvider);
                String string = LocaleController.getString(R.string.Gift2ExportTONUnlocksAlertTitle);
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21168a;
                d2Var.O = string;
                d2Var.Q = LocaleController.formatPluralString("Gift2ExportTONUnlocksAlertText", Math.max(1, i12), new Object[0]);
                l.d.C(R.string.OK, alertDialog$Builder, null);
                return;
            }
            LinearLayout linearLayout = new LinearLayout(g5Var.getContext());
            linearLayout.setOrientation(1);
            linearLayout.addView(new h4(g5Var.getContext(), tL_starGiftUnique), k7.c6.t(-1, -2, 48, 0, -4, 0, 0));
            TextView textView = new TextView(g5Var.getContext());
            int i13 = org.telegram.ui.ActionBar.k6.f21768j5;
            org.telegram.ui.b.w(i13, g5Var.resourcesProvider, textView, 1, 20.0f);
            textView.setText(LocaleController.getString(R.string.Gift2ExportTONFragmentTitle));
            linearLayout.addView(textView, k7.c6.t(-1, -2, 48, 24, 4, 24, 14));
            TextView textView2 = new TextView(g5Var.getContext());
            org.telegram.ui.b.l(i13, g5Var.resourcesProvider, textView2, 1, 16.0f);
            org.telegram.ui.b.o(R.string.Gift2ExportTONFragmentText, new Object[]{g5Var.C1()}, textView2);
            linearLayout.addView(textView2, k7.c6.t(-1, -2, 48, 24, 0, 24, 4));
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(g5Var.getContext(), 0, g5Var.resourcesProvider);
            alertDialog$Builder2.n(linearLayout);
            alertDialog$Builder2.k(LocaleController.getString(R.string.Gift2ExportTONFragmentOpen), new c1.b(28, g5Var, v2VarArr));
            l.d.u(R.string.Cancel, alertDialog$Builder2, null);
            return;
        }
        androidx.car.app.utils.b bVar = new androidx.car.app.utils.b(g5Var, l10, v2VarArr, 21);
        if (l10.longValue() < 0) {
            TLRPC.ChatFull chatFull = MessagesController.getInstance(g5Var.currentAccount).getChatFull(-l10.longValue());
            if (chatFull == null) {
                TLRPC.TL_channels_getFullChannel tL_channels_getFullChannel = new TLRPC.TL_channels_getFullChannel();
                tL_channels_getFullChannel.channel = MessagesController.getInstance(g5Var.currentAccount).getInputChannel(-l10.longValue());
                ConnectionsManager.getInstance(g5Var.currentAccount).sendRequest(tL_channels_getFullChannel, new eg.b3(6, g5Var, bVar));
                return;
            } else if (!chatFull.stargifts_available) {
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(g5Var.getContext(), 0, g5Var.resourcesProvider);
                String string2 = LocaleController.getString(R.string.Gift2ChannelDoesntSupportGiftsTitle);
                org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder3.f21168a;
                d2Var2.O = string2;
                d2Var2.Q = LocaleController.getString(R.string.Gift2ChannelDoesntSupportGiftsText);
                l.d.C(R.string.OK, alertDialog$Builder3, null);
                return;
            }
        } else if (l10.longValue() >= 0) {
            TLRPC.User user = MessagesController.getInstance(g5Var.currentAccount).getUser(l10);
            TLRPC.UserFull userFull = MessagesController.getInstance(g5Var.currentAccount).getUserFull(l10.longValue());
            if (userFull != null && (disallowedGiftsSettings = userFull.disallowed_stargifts) != null && disallowedGiftsSettings.disallow_unique_stargifts) {
                new qc(v2VarArr[0].container, g5Var.resourcesProvider).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(l10.longValue())))).j();
                return;
            } else if (userFull == null && user != null) {
                TLRPC.TL_users_getFullUser tL_users_getFullUser = new TLRPC.TL_users_getFullUser();
                tL_users_getFullUser.f20985id = MessagesController.getInstance(g5Var.currentAccount).getInputUser(user);
                ConnectionsManager.getInstance(g5Var.currentAccount).sendRequest(tL_users_getFullUser, new lh.b1(g5Var, v2VarArr, l10, bVar, 2));
                return;
            }
        }
        bVar.run();
    }

    public static void G0(g5 g5Var, TLObject tLObject, TLRPC.TL_inputInvoiceStarGiftTransfer tL_inputInvoiceStarGiftTransfer, long j10, long j11, Utilities.Callback callback, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            int i10 = 0;
            MessagesController.getInstance(g5Var.currentAccount).putUsers(paymentForm.users, false);
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
            ConnectionsManager.getInstance(g5Var.currentAccount).sendRequest(tL_payments_sendStarsForm, new x1(g5Var, j10, j11, callback, j12));
            return;
        }
        callback.run(tL_error);
        ic Y = g5Var.getBulletinFactory().Y(tL_error);
        Y.f27788t = true;
        Y.j();
    }

    public static void H0(g5 g5Var, org.telegram.ui.ActionBar.d2 d2Var, TLObject tLObject, long j10, long j11, long j12, TLRPC.TL_error tL_error) {
        d2Var.c(400L);
        org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
        if (U == null) {
            return;
        }
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            g5Var.dismiss();
            t7.y(g5Var.currentAccount, false).Q(j10);
            if (j10 >= 0) {
                TLRPC.UserFull userFull = MessagesController.getInstance(g5Var.currentAccount).getUserFull(j11);
                if (userFull != null) {
                    int max = Math.max(0, userFull.stargifts_count - 1);
                    userFull.stargifts_count = max;
                    if (max <= 0) {
                        userFull.flags2 &= -257;
                    }
                }
                t7.y(g5Var.currentAccount, false).P();
                t7.y(g5Var.currentAccount, false).T(true);
                if (!(U instanceof ja)) {
                    ja jaVar = new ja();
                    jaVar.whenFullyVisible(new hg.y1(jaVar, j12, 2));
                    U.presentFragment(jaVar);
                    return;
                }
                qc.a0(U).M(LocaleController.getString(R.string.Gift2ConvertedTitle), LocaleController.formatPluralStringComma("Gift2Converted", (int) j12), R.raw.stars_topup).k(true);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -j10);
            bundle.putBoolean("start_from_monetization", true);
            na1 na1Var = new na1(bundle);
            a0.g(g5Var.currentAccount).h(j10, true);
            a0.g(g5Var.currentAccount).l(j10);
            na1Var.whenFullyVisible(new hg.y1(na1Var, j12, 3));
            U.presentFragment(na1Var);
        } else if (tL_error != null) {
            g5Var.getBulletinFactory().t(LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text), null).k(false);
        } else {
            g5Var.getBulletinFactory().t(LocaleController.getString(R.string.UnknownError), null).k(false);
        }
    }

    public static void I0(g5 g5Var, TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift) {
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) tL_payments_uniqueStarGift.gift;
        g5Var.D0 = tL_starGiftUnique;
        g5Var.k2(tL_starGiftUnique, false, null, null);
        super.show();
    }

    public static void J0(final long j10, final long j11, final g5 g5Var, final Utilities.Callback callback, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(g5Var.currentAccount).processUpdates((TLRPC.Updates) tLObject, false);
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                g5.S(j10, j11, g5Var, callback, tLObject, tL_error);
            }
        });
    }

    public static String J1(TL_stars.StarGiftAttributeRarity starGiftAttributeRarity, Integer[] numArr) {
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
            return sh.j.G0(i10);
        } else {
            return "";
        }
    }

    public static void L0(g5 g5Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.PaymentForm paymentForm, TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails, long j10, CharSequence charSequence, org.telegram.ui.ActionBar.d2 d2Var) {
        af.f g10 = d2Var.g(-1, true, true);
        g10.d();
        TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
        tL_payments_sendStarsForm.form_id = paymentForm.form_id;
        tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftDropOriginalDetails;
        ConnectionsManager.getInstance(g5Var.currentAccount).sendRequest(tL_payments_sendStarsForm, new w2(g5Var, g10, d2Var, tL_starGiftUnique, j10, charSequence));
    }

    public static void M0(g5 g5Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, mf.a aVar, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(g5Var.currentAccount).processUpdates((TLRPC.Updates) tLObject, false);
            AndroidUtilities.runOnUIThread(new h2(g5Var, tL_starGiftUnique, aVar, runnable, 1));
        } else if (tL_error != null) {
            AndroidUtilities.runOnUIThread(new i2(g5Var, tL_error, runnable, 1));
        }
    }

    public static void N0(g5 g5Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, org.telegram.ui.ActionBar.d2 d2Var) {
        g5Var.getClass();
        af.f g10 = d2Var.g(-1, true, true);
        g10.d();
        TL_stars.updateStarGiftPrice updatestargiftprice = new TL_stars.updateStarGiftPrice();
        updatestargiftprice.stargift = g5Var.E1();
        updatestargiftprice.resell_amount = TL_stars.StarsAmount.ofStars(0L);
        ConnectionsManager.getInstance(g5Var.currentAccount).sendRequest(updatestargiftprice, new hg.y(g5Var, g10, tL_starGiftUnique, 6));
    }

    public static boolean N1(int i10, long j10) {
        if (j10 >= 0) {
            if (UserConfig.getInstance(i10).getClientUserId() == j10) {
                return true;
            }
            return false;
        }
        return ChatObject.canUserDoAction(MessagesController.getInstance(i10).getChat(Long.valueOf(-j10)), 5);
    }

    public static void O0(g5 g5Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, mf.a aVar, Runnable runnable) {
        TL_stars.StarsAmount o10 = aVar.o();
        TL_stars.updateStarGiftPrice updatestargiftprice = new TL_stars.updateStarGiftPrice();
        updatestargiftprice.stargift = g5Var.E1();
        updatestargiftprice.resell_amount = o10;
        ConnectionsManager.getInstance(g5Var.currentAccount).sendRequest(updatestargiftprice, new q1(g5Var, tL_starGiftUnique, aVar, runnable, 0));
    }

    public static boolean O1(int i10, long j10) {
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

    public static void P(g5 g5Var, long j10) {
        new lh.g2(g5Var.getContext(), g5Var.currentAccount, j10, null, new x2(g5Var, 2)).show();
    }

    public static void P0(g5 g5Var, long j10) {
        new lh.g2(g5Var.getContext(), g5Var.currentAccount, j10, null, new x2(g5Var, 2)).show();
    }

    public static boolean P1(int i10, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
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
                if (!(emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) || ((TLRPC.TL_emojiStatusCollectible) emojiStatus).collectible_id != tL_starGiftUnique.f21072id) {
                    return false;
                }
                return true;
            }
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-peerDialogId));
            if (chat != null) {
                TLRPC.EmojiStatus emojiStatus2 = chat.emoji_status;
                if ((emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible) && ((TLRPC.TL_emojiStatusCollectible) emojiStatus2).collectible_id == tL_starGiftUnique.f21072id) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void Q(g5 g5Var, String str) {
        Context context = g5Var.getContext();
        af.g.u(context, MessagesController.getInstance(g5Var.currentAccount).tonBlockchainExplorerUrl + str);
    }

    public static void Q0(g5 g5Var, String str) {
        Context context = g5Var.getContext();
        af.g.u(context, MessagesController.getInstance(g5Var.currentAccount).tonBlockchainExplorerUrl + str);
    }

    public static void R(g5 g5Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z4, lh.u0 u0Var, i4 i4Var, af.f fVar) {
        fVar.d();
        t7.x(g5Var.currentAccount, i4Var.f14233a).h(i4Var.f14234b, tL_starGiftUnique, j10, tL_textWithEntities, z4, new t2(g5Var, fVar, tL_starGiftUnique, j10, u0Var, 0));
    }

    public static void R0(g5 g5Var, TLObject tLObject, androidx.car.app.utils.b bVar, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.TL_messages_chatFull) {
            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject;
            MessagesController.getInstance(g5Var.currentAccount).putUsers(tL_messages_chatFull.users, false);
            MessagesController.getInstance(g5Var.currentAccount).putChats(tL_messages_chatFull.chats, false);
            MessagesController.getInstance(g5Var.currentAccount).putChatFull(tL_messages_chatFull.full_chat);
            if (!tL_messages_chatFull.full_chat.stargifts_available) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(g5Var.getContext(), 0, g5Var.resourcesProvider);
                alertDialog$Builder.f21168a.O = LocaleController.getString(R.string.Gift2ChannelDoesntSupportGiftsTitle);
                alertDialog$Builder.f21168a.Q = LocaleController.getString(R.string.Gift2ChannelDoesntSupportGiftsText);
                l.d.C(R.string.OK, alertDialog$Builder, null);
                return;
            }
            bVar.run();
            return;
        }
        ic Y = g5Var.getBulletinFactory().Y(tL_error);
        Y.f27788t = true;
        Y.j();
    }

    public static void S(long j10, long j11, g5 g5Var, Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error) {
        long j12;
        g5 g5Var2;
        callback.run(tL_error);
        org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
        if (U != null) {
            if (tLObject instanceof TLRPC.Updates) {
                if (j10 >= 0 && j11 >= 0) {
                    xn R9 = xn.R9(j10);
                    j12 = j10;
                    g5Var2 = g5Var;
                    R9.whenFullyVisible(new r2(g5Var2, R9, j12, 0));
                    U.presentFragment(R9);
                } else {
                    j12 = j10;
                    g5Var2 = g5Var;
                    ic M = qc.a0(U).M(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, g5Var2.C1(), DialogObject.getShortName(j12))), R.raw.forward);
                    M.f27788t = true;
                    M.j();
                }
            } else {
                j12 = j10;
                g5Var2 = g5Var;
                qc.a0(U).d0(tL_error, false);
            }
        } else {
            j12 = j10;
            g5Var2 = g5Var;
        }
        t7.y(g5Var2.currentAccount, false).Q(j12);
        t7.y(g5Var2.currentAccount, false).Q(j11);
    }

    public static void S0(g5 g5Var, MessageObject messageObject, ArrayList arrayList, TL_stars.StarGift starGift) {
        g5Var.f14088b1 = true;
        g5Var.i2(messageObject, null);
        g5Var.q2(0, true, null);
        s00 s00Var = g5Var.X;
        if (s00Var != null) {
            s00Var.c(true);
        }
        t7.y(g5Var.currentAccount, false).P();
        l7 G = t7.y(g5Var.currentAccount, false).G(UserConfig.getInstance(g5Var.currentAccount).getClientUserId(), false);
        if (G != null) {
            G.j(arrayList, starGift);
        }
    }

    public static void T(g5 g5Var, org.telegram.ui.ActionBar.d2 d2Var, MessageObject messageObject) {
        d2Var.dismiss();
        g5Var.G0 = true;
        g5Var.i2(messageObject, null);
        super.show();
    }

    public static void T0(mh.g5 r9, android.view.View r10) {
        throw new UnsupportedOperationException("Method not decompiled: mh.g5.T0(mh.g5, android.view.View):void");
    }

    public static void U(g5 g5Var, int i10, TLObject tLObject) {
        MessageObject messageObject;
        if (tLObject instanceof TLRPC.messages_Messages) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            for (int i11 = 0; i11 < messages_messages.messages.size(); i11++) {
                TLRPC.Message message = messages_messages.messages.get(i11);
                if (message != null && message.f20866id == i10) {
                    TLRPC.MessageAction messageAction = message.action;
                    if ((messageAction instanceof TLRPC.TL_messageActionStarGift) || (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                        messageObject = new MessageObject(g5Var.currentAccount, message, false, false);
                        messageObject.setType();
                        break;
                    }
                }
            }
        }
        messageObject = null;
        if (messageObject != null) {
            AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b(g5Var, tLObject, messageObject, 22));
        }
    }

    public static void U0(g5 g5Var, Long l10) {
        String str;
        String formatString;
        TLRPC.Chat chat;
        if (l10.longValue() < 0 && (chat = MessagesController.getInstance(g5Var.currentAccount).getChat(Long.valueOf(-l10.longValue()))) != null) {
            str = chat.title;
        } else {
            str = "";
        }
        qc bulletinFactory = g5Var.getBulletinFactory();
        int i10 = R.raw.contact_check;
        if (TextUtils.isEmpty(str)) {
            formatString = LocaleController.getString(R.string.GiftRepostedToProfile);
        } else {
            formatString = LocaleController.formatString(R.string.GiftRepostedToChannelProfile, str);
        }
        ic Q = bulletinFactory.Q(i10, 36, AndroidUtilities.replaceTags(formatString));
        Q.f27788t = true;
        Q.j();
    }

    public static void V(g5 g5Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, final String str) {
        final long j10 = tL_starGiftUnique.gift_id;
        final String str2 = tL_starGiftUnique.title;
        final String C1 = g5Var.C1();
        final TLRPC.Document document = tL_starGiftUnique.getDocument();
        String str3 = tL_starGiftUnique.slug;
        final org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(ApplicationLoader.applicationContext, 3, null);
        d2Var.q(500L);
        TL_stars.getUniqueStarGiftValueInfo getuniquestargiftvalueinfo = new TL_stars.getUniqueStarGiftValueInfo();
        getuniquestargiftvalueinfo.slug = str3;
        ConnectionsManager.getInstance(g5Var.currentAccount).sendRequest(getuniquestargiftvalueinfo, new RequestDelegate() {
            @Override
            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                final g5 g5Var2 = g5.this;
                final org.telegram.ui.ActionBar.d2 d2Var2 = d2Var;
                final TLRPC.Document document2 = document;
                final String str4 = str;
                final String str5 = str2;
                final String str6 = C1;
                final long j11 = j10;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        g5.Z0(g5.this, d2Var2, tLObject, document2, str4, str5, str6, j11, tL_error);
                    }
                });
            }
        });
    }

    public static void V0(g5 g5Var, org.telegram.ui.ActionBar.d2 d2Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TL_stars.TL_payments_uniqueStarGift) {
            TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift = (TL_stars.TL_payments_uniqueStarGift) tLObject;
            MessagesController.getInstance(g5Var.currentAccount).putUsers(tL_payments_uniqueStarGift.users, false);
            MessagesController.getInstance(g5Var.currentAccount).putChats(tL_payments_uniqueStarGift.chats, false);
            if (tL_payments_uniqueStarGift.gift instanceof TL_stars.TL_starGiftUnique) {
                AndroidUtilities.runOnUIThread(new m2(7, g5Var, tL_payments_uniqueStarGift));
                return;
            }
        }
        AndroidUtilities.runOnUIThread(new m2(8, d2Var, tL_error));
    }

    public static void W(g5 g5Var) {
        boolean z4;
        TLRPC.Document document;
        boolean z10;
        j7 F;
        TLRPC.Message message;
        qh.d dVar = g5Var.f14097g0;
        if (!dVar.K) {
            TL_stars.InputSavedStarGift E1 = g5Var.E1();
            MessageObject messageObject = g5Var.B0;
            if (messageObject != null && (message = messageObject.messageOwner) != null) {
                TLRPC.MessageAction messageAction = message.action;
                if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                    TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                    z4 = tL_messageActionStarGift.saved;
                    document = tL_messageActionStarGift.gift.getDocument();
                } else if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                    TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                    z4 = tL_messageActionStarGiftUnique.saved;
                    document = tL_messageActionStarGiftUnique.gift.getDocument();
                } else {
                    return;
                }
            } else {
                TL_stars.SavedStarGift savedStarGift = g5Var.f14121z0;
                if (savedStarGift != null) {
                    z4 = !savedStarGift.unsaved;
                    document = savedStarGift.gift.getDocument();
                } else {
                    return;
                }
            }
            TLRPC.Document document2 = document;
            boolean z11 = z4;
            dVar.setLoading(true);
            TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
            savestargift.unsave = z11;
            savestargift.stargift = E1;
            if (g5Var.f14121z0 != null && (F = t7.y(g5Var.currentAccount, false).F(g5Var.U, false)) != null) {
                F.m(g5Var.f14121z0, savestargift.unsave);
                z10 = true;
            } else {
                z10 = false;
            }
            ConnectionsManager.getInstance(g5Var.currentAccount).sendRequest(savestargift, new kh.j(g5Var, z10, document2, z11, savestargift));
        }
    }

    public static void W0(g5 g5Var, TLRPC.TL_error tL_error, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity) {
        int i10;
        int i11;
        int dp;
        int i12;
        int i13;
        int dp2;
        int i14;
        int i15;
        if (g5Var.getContext() != null) {
            if (tL_error != null) {
                if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
                    if ("SRP_ID_INVALID".equals(tL_error.text)) {
                        ConnectionsManager.getInstance(g5Var.currentAccount).sendRequest(new TL_account.getPassword(), new s2(g5Var, twoStepVerificationActivity, 1), 8);
                        return;
                    }
                    twoStepVerificationActivity.o0();
                    twoStepVerificationActivity.finishFragment();
                    qc.b0(tL_error);
                    return;
                }
                twoStepVerificationActivity.o0();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(g5Var.getContext());
                alertDialog$Builder.f21168a.O = LocaleController.getString(R.string.Gift2TransferToTONAlertTitle);
                LinearLayout linearLayout = new LinearLayout(g5Var.getContext());
                linearLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(24.0f), 0);
                linearLayout.setOrientation(1);
                alertDialog$Builder.n(linearLayout);
                TextView textView = new TextView(g5Var.getContext());
                int i16 = org.telegram.ui.ActionBar.k6.f21768j5;
                textView.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i16, false));
                textView.setTextSize(1, 16.0f);
                if (LocaleController.isRTL) {
                    i10 = 5;
                } else {
                    i10 = 3;
                }
                textView.setGravity(i10 | 48);
                textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2TransferToTONAlertText)));
                linearLayout.addView(textView, k7.c6.n(-1, -2));
                LinearLayout linearLayout2 = new LinearLayout(g5Var.getContext());
                linearLayout2.setOrientation(0);
                linearLayout.addView(linearLayout2, k7.c6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                ImageView imageView = new ImageView(g5Var.getContext());
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
                int w02 = org.telegram.ui.ActionBar.k6.w0(null, i16, false);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
                TextView textView2 = new TextView(g5Var.getContext());
                textView2.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i16, false));
                textView2.setTextSize(1, 16.0f);
                if (LocaleController.isRTL) {
                    i12 = 5;
                } else {
                    i12 = 3;
                }
                textView2.setGravity(i12 | 48);
                org.telegram.messenger.y3.q(R.string.Gift2TransferToTONAlertText1, textView2);
                if (LocaleController.isRTL) {
                    linearLayout2.addView(textView2, k7.c6.n(-1, -2));
                    linearLayout2.addView(imageView, k7.c6.q(-2, -2, 5));
                } else {
                    linearLayout2.addView(imageView, k7.c6.n(-2, -2));
                    linearLayout2.addView(textView2, k7.c6.n(-1, -2));
                }
                LinearLayout linearLayout3 = new LinearLayout(g5Var.getContext());
                linearLayout3.setOrientation(0);
                linearLayout.addView(linearLayout3, k7.c6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                ImageView imageView2 = new ImageView(g5Var.getContext());
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
                imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.k6.w0(null, i16, false), mode));
                TextView textView3 = new TextView(g5Var.getContext());
                textView3.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i16, false));
                textView3.setTextSize(1, 16.0f);
                if (LocaleController.isRTL) {
                    i14 = 5;
                } else {
                    i14 = 3;
                }
                textView3.setGravity(i14 | 48);
                org.telegram.messenger.y3.q(R.string.Gift2TransferToTONAlertText2, textView3);
                if (LocaleController.isRTL) {
                    linearLayout3.addView(textView3, k7.c6.n(-1, -2));
                    i15 = 5;
                    linearLayout3.addView(imageView2, k7.c6.q(-2, -2, 5));
                } else {
                    i15 = 5;
                    linearLayout3.addView(imageView2, k7.c6.n(-2, -2));
                    linearLayout3.addView(textView3, k7.c6.n(-1, -2));
                }
                if ("PASSWORD_MISSING".equals(tL_error.text)) {
                    alertDialog$Builder.k(LocaleController.getString(R.string.Gift2TransferToTONSetPassword), new k3.e(g5Var, 29));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                } else {
                    TextView textView4 = new TextView(g5Var.getContext());
                    textView4.setTextColor(org.telegram.ui.ActionBar.k6.w0(null, i16, false));
                    textView4.setTextSize(1, 16.0f);
                    if (!LocaleController.isRTL) {
                        i15 = 3;
                    }
                    textView4.setGravity(i15 | 48);
                    textView4.setText(LocaleController.getString(R.string.Gift2TransferToTONAlertText3));
                    linearLayout.addView(textView4, k7.c6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                    alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
                }
                twoStepVerificationActivity.showDialog(alertDialog$Builder.f21168a);
                return;
            }
            twoStepVerificationActivity.o0();
            twoStepVerificationActivity.finishFragment();
            if (tLObject instanceof TL_stars.starGiftWithdrawalUrl) {
                af.g.u(g5Var.getContext(), ((TL_stars.starGiftWithdrawalUrl) tLObject).url);
            }
        }
    }

    public static boolean X(g5 g5Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, py pyVar, ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return false;
        }
        long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        long giftThemeUser = ChatThemeController.getInstance(g5Var.currentAccount).getGiftThemeUser(tL_starGiftUnique.slug);
        if (giftThemeUser != 0 && giftThemeUser != j10) {
            org.telegram.ui.Components.z4.n0(g5Var.getContext(), g5Var.resourcesProvider, g5Var.currentAccount, tL_starGiftUnique, giftThemeUser, new b2(g5Var, j10, tL_starGiftUnique, pyVar, 1));
            return true;
        }
        ChatThemeController.getInstance(g5Var.currentAccount).setDialogTheme(j10, new tf.b(null, tL_starGiftUnique.slug));
        pyVar.presentFragment(xn.R9(j10), true);
        return true;
    }

    public static void Y(g5 g5Var) {
        int i10;
        long j10;
        long j11;
        long j12;
        String string;
        final long clientUserId = UserConfig.getInstance(g5Var.currentAccount).getClientUserId();
        final TL_stars.InputSavedStarGift E1 = g5Var.E1();
        if (E1 != null) {
            MessageObject messageObject = g5Var.B0;
            if (messageObject != null) {
                i10 = messageObject.messageOwner.date;
                boolean isOutOwner = messageObject.isOutOwner();
                MessageObject messageObject2 = g5Var.B0;
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
                            j10 = g5Var.B0.getDialogId();
                        }
                        j11 = tL_messageActionStarGift.convert_stars;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                TL_stars.SavedStarGift savedStarGift = g5Var.f14121z0;
                if (savedStarGift != null) {
                    i10 = savedStarGift.date;
                    if ((savedStarGift.flags & 2) != 0 && !savedStarGift.name_hidden) {
                        j10 = DialogObject.getPeerDialogId(savedStarGift.from_id);
                    } else {
                        j10 = 2666000;
                    }
                    j11 = g5Var.f14121z0.convert_stars;
                    j12 = g5Var.U;
                } else {
                    return;
                }
            }
            int max = Math.max(1, (MessagesController.getInstance(g5Var.currentAccount).stargiftsConvertPeriodMax - (ConnectionsManager.getInstance(g5Var.currentAccount).getCurrentTime() - i10)) / 86400);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(g5Var.getContext(), 0, g5Var.resourcesProvider);
            String string2 = LocaleController.getString(R.string.Gift2ConvertTitle);
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21168a;
            d2Var.O = string2;
            if (!UserObject.isService(j10) && j10 != 2666000) {
                string = DialogObject.getShortName(j10);
            } else {
                string = LocaleController.getString(R.string.StarsTransactionHidden);
            }
            d2Var.Q = AndroidUtilities.replaceTags(LocaleController.formatPluralString("Gift2ConvertText2", max, string, LocaleController.formatPluralStringComma("Gift2ConvertStars", (int) j11)));
            final long j13 = j11;
            final long j14 = j12;
            alertDialog$Builder.k(LocaleController.getString(R.string.Gift2ConvertButton), new org.telegram.ui.ActionBar.c2() {
                @Override
                public final void j(org.telegram.ui.ActionBar.d2 d2Var2, int i11) {
                    g5.k0(g5.this, E1, j14, clientUserId, j13);
                }
            });
            l.d.u(R.string.Cancel, alertDialog$Builder, null);
        }
    }

    public static void Y0(g5 g5Var, String str, long j10) {
        org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
        if (R == 0) {
            return;
        }
        ?? obj = new Object();
        obj.f22158a = true;
        lh.r5 r5Var = new lh.r5(g5Var.U, str, j10, g5Var.resourcesProvider);
        r5Var.f12930e = new x2(g5Var, 0);
        R.showAsSheet(r5Var, obj);
    }

    public static void Z(g5 g5Var, boolean[] zArr, TL_stars.StarGiftAttribute starGiftAttribute, sc[] scVarArr) {
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        TL_stars.StarGift B1 = g5Var.B1();
        GiftAuctionController.getInstance(g5Var.currentAccount).requestAuctionUpgrades(B1.gift_id, new f2(g5Var, B1, starGiftAttribute, scVarArr, zArr, 0));
    }

    public static void Z0(g5 g5Var, org.telegram.ui.ActionBar.d2 d2Var, TLObject tLObject, TLRPC.Document document, String str, String str2, String str3, long j10, TLRPC.TL_error tL_error) {
        sz0 sz0Var;
        sz0 sz0Var2;
        float f10;
        float f11;
        char c3;
        ?? r92;
        int round;
        d2Var.dismiss();
        if (tLObject instanceof TL_stars.UniqueStarGiftValueInfo) {
            TL_stars.UniqueStarGiftValueInfo uniqueStarGiftValueInfo = (TL_stars.UniqueStarGiftValueInfo) tLObject;
            org.telegram.ui.ActionBar.h3 o10 = org.telegram.messenger.y3.o(g5Var.getContext(), g5Var.resourcesProvider, false, false);
            LinearLayout linearLayout = new LinearLayout(g5Var.getContext());
            linearLayout.setOrientation(1);
            linearLayout.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
            linearLayout.setClipChildren(false);
            linearLayout.setClipToPadding(false);
            org.telegram.ui.Components.p9 p9Var = new org.telegram.ui.Components.p9(g5Var.getContext());
            ja.Z0(p9Var.getImageReceiver(), document, 160);
            linearLayout.addView(p9Var, k7.c6.t(160, 160, 1, 0, 0, 0, 0));
            TextView textView = new TextView(g5Var.getContext());
            textView.setTextSize(1, 20.0f);
            textView.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Sh, g5Var.resourcesProvider));
            textView.setTypeface(AndroidUtilities.bold());
            textView.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
            textView.setBackground(org.telegram.ui.ActionBar.k6.b0(AndroidUtilities.dp(21.0f), org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Oh, g5Var.resourcesProvider)));
            textView.setGravity(17);
            linearLayout.addView(textView, k7.c6.t(-2, 42, 1, 0, 12, 0, 15));
            textView.setText(str);
            TextView textView2 = new TextView(g5Var.getContext());
            textView2.setTextSize(1, 14.0f);
            textView2.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21768j5, g5Var.resourcesProvider));
            textView2.setGravity(17);
            linearLayout.addView(textView2, k7.c6.t(-2, -2, 1, 16, 0, 16, 19));
            if (uniqueStarGiftValueInfo.value_is_average) {
                org.telegram.ui.b.o(R.string.GiftValueAverage, new Object[]{str2}, textView2);
            } else if (uniqueStarGiftValueInfo.last_sale_on_fragment) {
                org.telegram.ui.b.o(R.string.GiftValueLastFragment, new Object[]{str3}, textView2);
            } else {
                org.telegram.ui.b.o(R.string.GiftValueLastTelegram, new Object[]{str3}, textView2);
            }
            FrameLayout frameLayout = new FrameLayout(g5Var.getContext());
            frameLayout.setClipChildren(false);
            frameLayout.setClipToPadding(false);
            lh.a0 a0Var = new lh.a0(g5Var, new qh.e3[1], frameLayout, 3);
            sz0 sz0Var3 = new sz0(g5Var.getContext(), g5Var.resourcesProvider);
            frameLayout.addView(sz0Var3, k7.c6.e(-1, -1, 119));
            sz0Var3.c(LocaleController.getString(R.string.GiftValueInitialSale), LocaleController.formatYearMonthDay(uniqueStarGiftValueInfo.initial_sale_date, true), null, null);
            String string = LocaleController.getString(R.string.GiftValueInitialPrice);
            StringBuilder sb = new StringBuilder("⭐️");
            sb.append(uniqueStarGiftValueInfo.initial_sale_stars);
            sb.append(" (~");
            sz0Var3.c(string, ja.X0(false, android.support.v4.media.a.r(sb, BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.initial_sale_price, uniqueStarGiftValueInfo.currency), ")"), 0.8f, null), null, null);
            if (TLObject.hasFlag(uniqueStarGiftValueInfo.flags, 1)) {
                sz0Var3.c(LocaleController.getString(R.string.GiftValueLastSale), LocaleController.formatYearMonthDay(uniqueStarGiftValueInfo.last_sale_date, true), null, null);
                if (((int) (Math.round((uniqueStarGiftValueInfo.last_sale_price / uniqueStarGiftValueInfo.initial_sale_price) * 1000.0d) / 10)) - 100 > 0) {
                    sz0Var3.e(LocaleController.getString(R.string.GiftValueLastPrice), BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.last_sale_price, uniqueStarGiftValueInfo.currency), "+" + LocaleController.formatNumber(round, ' ') + "%", null, null);
                    sz0Var = sz0Var3;
                } else {
                    sz0Var = sz0Var3;
                    sz0Var.c(LocaleController.getString(R.string.GiftValueLastPrice), BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.last_sale_price, uniqueStarGiftValueInfo.currency), null, null);
                }
            } else {
                sz0Var = sz0Var3;
            }
            if (TLObject.hasFlag(uniqueStarGiftValueInfo.flags, 4)) {
                p2 p2Var = new p2(a0Var, r10, uniqueStarGiftValueInfo, str2, 0);
                sz0Var2 = sz0Var;
                TableRow e6 = sz0Var2.e(LocaleController.getString(R.string.GiftValueMinPrice), BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.floor_price, uniqueStarGiftValueInfo.currency), "?", p2Var, null);
                sc[] scVarArr = {(sc) ((pz0) e6.getChildAt(1)).getChildAt(0)};
                e6.setOnClickListener(new androidx.mediarouter.app.c(p2Var, 18));
            } else {
                sz0Var2 = sz0Var;
            }
            if (TLObject.hasFlag(uniqueStarGiftValueInfo.flags, 8)) {
                p2 p2Var2 = new p2(a0Var, r10, uniqueStarGiftValueInfo, str2, 1);
                TableRow e10 = sz0Var2.e(LocaleController.getString(R.string.GiftValueAveragePrice), BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.average_price, uniqueStarGiftValueInfo.currency), "?", p2Var2, null);
                sc[] scVarArr2 = {(sc) ((pz0) e10.getChildAt(1)).getChildAt(0)};
                e10.setOnClickListener(new androidx.mediarouter.app.c(p2Var2, 19));
            }
            linearLayout.addView(frameLayout, k7.c6.t(-1, -2, 7, 0, 0, 0, 12));
            if (uniqueStarGiftValueInfo.listed_count > 0) {
                qh.d dVar = new qh.d(g5Var.getContext(), g5Var.resourcesProvider, false);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) LocaleController.formatNumber(uniqueStarGiftValueInfo.listed_count, ' '));
                spannableStringBuilder.append((CharSequence) " ");
                spannableStringBuilder.append((CharSequence) "e");
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.u5(document, 1.5f, dVar.getTextPaint().getFontMetricsInt()), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                spannableStringBuilder.append((CharSequence) " ");
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.GiftValueOnSaleTelegram));
                dVar.g(AndroidUtilities.replaceArrows(spannableStringBuilder, false, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f)), false, true);
                f10 = 1.0f;
                f11 = 2.0f;
                c3 = ' ';
                r92 = 1;
                dVar.setOnClickListener(new q2(g5Var, str2, j10, 0));
                linearLayout.addView(dVar, k7.c6.t(-1, 42, 7, 0, 0, 0, 2));
            } else {
                f10 = 1.0f;
                f11 = 2.0f;
                c3 = ' ';
                r92 = 1;
            }
            if (uniqueStarGiftValueInfo.fragment_listed_count > 0) {
                qh.d dVar2 = new qh.d(g5Var.getContext(), g5Var.resourcesProvider, false);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                spannableStringBuilder2.append((CharSequence) LocaleController.formatNumber(uniqueStarGiftValueInfo.fragment_listed_count, c3));
                spannableStringBuilder2.append((CharSequence) "e");
                spannableStringBuilder2.setSpan(new org.telegram.ui.Components.u5(document, 1.5f, dVar2.getTextPaint().getFontMetricsInt()), spannableStringBuilder2.length() - r92, spannableStringBuilder2.length(), 33);
                spannableStringBuilder2.append((CharSequence) " ");
                spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.GiftValueOnSaleFragment));
                dVar2.g(AndroidUtilities.replaceArrows(spannableStringBuilder2, false, AndroidUtilities.dp(f11), AndroidUtilities.dp(f10)), false, r92);
                dVar2.setOnClickListener(new dg.n(21, g5Var, uniqueStarGiftValueInfo));
                linearLayout.addView(dVar2, k7.c6.t(-1, 42, 7, 0, 0, 0, 0));
            }
            o10.customView = linearLayout;
            o10.show();
        } else if (tL_error != null) {
            g5Var.getBulletinFactory().d0(tL_error, false);
        }
    }

    public static void a0(g5 g5Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        g5Var.f14100h1 = false;
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            MessagesController.getInstance(g5Var.currentAccount).putUsers(paymentForm.users, false);
            g5Var.f14102i1 = paymentForm;
            g5Var.b2();
            return;
        }
        ic Y = g5Var.getBulletinFactory().Y(tL_error);
        Y.f27788t = true;
        Y.j();
    }

    public static void a1(g5 g5Var, final lh.u0 u0Var, mf.b bVar, final TL_stars.TL_starGiftUnique tL_starGiftUnique, final long j10, final TLRPC.TL_textWithEntities tL_textWithEntities, final boolean z4, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        g5Var.f14097g0.setLoading(false);
        if (u0Var != null && u0Var.I) {
            u0Var.I = false;
            u0Var.E.h(false);
        }
        if (tL_payments_paymentFormStarGift == null) {
            return;
        }
        new k4(g5Var.getContext(), g5Var.resourcesProvider, tL_starGiftUnique, new i4(bVar, tL_payments_paymentFormStarGift), g5Var.currentAccount, j10, g5Var.C1(), false, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                g5.R(g5.this, tL_starGiftUnique, j10, tL_textWithEntities, z4, u0Var, (i4) obj, (af.f) obj2);
            }
        }).b();
    }

    public static void b0(g5 g5Var) {
        Bundle bundle = new Bundle();
        long j10 = g5Var.U;
        if (j10 >= 0) {
            bundle.putLong("user_id", j10);
        } else {
            bundle.putLong("chat_id", -j10);
        }
        if (j10 == UserConfig.getInstance(g5Var.currentAccount).getClientUserId()) {
            bundle.putBoolean("my_profile", true);
        }
        bundle.putBoolean("open_gifts", true);
        bundle.putBoolean("open_gifts_upgradable", true);
        d2(new ProfileActivity(bundle, null));
    }

    public static void b1(g5 g5Var) {
        qh.d dVar = g5Var.f14097g0;
        if (UserConfig.getInstance(g5Var.currentAccount).isPremium() && (P1(g5Var.currentAccount, g5Var.K1()) || g5Var.S0)) {
            g5Var.r2(false);
            return;
        }
        TL_stars.TL_starGiftUnique K1 = g5Var.K1();
        if (K1 == null) {
            return;
        }
        TLRPC.Peer peer = K1.owner_id;
        if (peer == null) {
            peer = K1.host_id;
        }
        long peerDialogId = DialogObject.getPeerDialogId(peer);
        StringBuilder sb = new StringBuilder();
        sb.append(K1.title);
        sb.append(" #");
        g5Var.f14118w0.setText(LocaleController.formatString(R.string.Gift2WearTitle, l.d.l(K1.num, ',', sb)));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.Gift2WearStart));
        if (!UserConfig.getInstance(g5Var.currentAccount).isPremium()) {
            spannableStringBuilder.append((CharSequence) " l");
            if (g5Var.R0 == null) {
                g5Var.R0 = new oq(R.drawable.msg_mini_lock3, 0);
            }
            spannableStringBuilder.setSpan(g5Var.R0, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        dVar.g(spannableStringBuilder, true, true);
        dVar.f(null, true);
        dVar.setOnClickListener(new k1(g5Var, 26));
        g5Var.f14087b0.setWearPreview(MessagesController.getInstance(g5Var.currentAccount).getUserOrChat(peerDialogId));
        g5Var.q2(2, true, null);
    }

    public static void c0(g5 g5Var, Utilities.Callback2 callback2, ArrayList arrayList, Runnable runnable, TLRPC.Updates updates, TLRPC.TL_error tL_error) {
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
                        messageObject = new MessageObject(g5Var.currentAccount, message, false, false);
                        break;
                    }
                } else {
                    messageObject = null;
                    break;
                }
            }
            MessagesController.getInstance(g5Var.currentAccount).processUpdates(updates, false);
            if (messageObject != null) {
                TL_stars.StarGift starGift = ((TLRPC.TL_messageActionStarGiftUnique) messageObject.messageOwner.action).gift;
                callback2.run(starGift, new androidx.car.app.utils.c(g5Var, messageObject, arrayList, starGift, 9));
                return;
            }
            callback2.run(null, null);
            t7.y(g5Var.currentAccount, false).P();
            l7 G = t7.y(g5Var.currentAccount, false).G(UserConfig.getInstance(g5Var.currentAccount).getClientUserId(), false);
            if (G != null) {
                G.j(arrayList, null);
            }
        } else if (tL_error != null) {
            if ("STARGIFT_CRAFT_UNAVAILABLE".equalsIgnoreCase(tL_error.text)) {
                alertDialog$Builder = new AlertDialog$Builder(g5Var.getContext(), 0, new oh.b());
                String string = LocaleController.getString(R.string.GiftCraftUnavailableTitle);
                org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21168a;
                d2Var.O = string;
                d2Var.Q = AndroidUtilities.replaceTags(LocaleController.getString(R.string.GiftCraftUnavailableText));
                i10 = R.string.OK;
            } else {
                String str = tL_error.text;
                if (str != null && str.startsWith("STARGIFT_CRAFT_TOO_EARLY_")) {
                    long parseLong = Long.parseLong(tL_error.text.substring(25)) + ConnectionsManager.getInstance(g5Var.currentAccount).getCurrentTime();
                    alertDialog$Builder = new AlertDialog$Builder(g5Var.getContext(), 0, new oh.b());
                    String string2 = LocaleController.getString(R.string.GiftCraftUnavailableTitle);
                    org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder.f21168a;
                    d2Var2.O = string2;
                    d2Var2.Q = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCraftUnavailableTextTime, LocaleController.formatDateTime(parseLong, true)));
                    i10 = R.string.OK;
                } else {
                    g5Var.getBulletinFactory().d0(tL_error, false);
                    runnable.run();
                }
            }
            l.d.C(i10, alertDialog$Builder, null);
            runnable.run();
        }
    }

    public static void c1(g5 g5Var, TLObject tLObject, CharSequence charSequence, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails, TLRPC.TL_error tL_error) {
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
            LinearLayout linearLayout = new LinearLayout(g5Var.getContext());
            linearLayout.setOrientation(1);
            linearLayout.setPadding(AndroidUtilities.dp(23.0f), 0, AndroidUtilities.dp(23.0f), 0);
            TextView b10 = k7.g6.b(g5Var.getContext(), 16.0f, org.telegram.ui.ActionBar.k6.f21768j5, false, null);
            b10.setText(LocaleController.getString(R.string.Gift2RemoveDescriptionText));
            linearLayout.addView(b10, k7.c6.k(0.0f, 0.0f, 0.0f, 16.0f, -1, -2));
            sz0 sz0Var = new sz0(g5Var.getContext(), g5Var.resourcesProvider);
            qz0 a2 = sz0Var.a(charSequence);
            a2.setFilled(true);
            jh.s sVar = (jh.s) a2.getChildAt(0);
            sVar.setTextSize(1, 12.0f);
            sVar.setGravity(17);
            linearLayout.addView(sz0Var, k7.c6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(g5Var.getContext(), 0, g5Var.resourcesProvider);
            alertDialog$Builder.f21168a.O = LocaleController.getString(R.string.Gift2RemoveDescriptionTitle);
            alertDialog$Builder.n(linearLayout);
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.k(ja.Q0(LocaleController.formatString(R.string.Gift2RemoveDescriptionButton, Integer.valueOf((int) j10))), new o2(g5Var, tL_starGiftUnique, paymentForm, tL_inputInvoiceStarGiftDropOriginalDetails, j10, charSequence));
            alertDialog$Builder.o();
        } else if (tL_error != null) {
            g5Var.getBulletinFactory().d0(tL_error, false);
        }
    }

    public static void d0(g5 g5Var, long j10, TL_stars.TL_starGiftUnique tL_starGiftUnique, py pyVar) {
        ChatThemeController.getInstance(g5Var.currentAccount).setDialogTheme(j10, new tf.b(null, tL_starGiftUnique.slug));
        pyVar.presentFragment(xn.R9(j10), true);
    }

    public static void d1(g5 g5Var, long j10) {
        z9 z9Var = new z9(g5Var.getContext(), g5Var.resourcesProvider, j10, 10, null, new m2(3, g5Var, new boolean[]{false}), 0L);
        z9Var.setOnDismissListener(new y2(g5Var, 0));
        z9Var.show();
    }

    public static void d2(org.telegram.ui.ActionBar.p2 p2Var) {
        org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
        if (U == 0) {
            return;
        }
        ?? obj = new Object();
        obj.f22158a = true;
        U.showAsSheet(p2Var, obj);
    }

    public static void e0(g5 g5Var, long j10, long j11, Utilities.Callback callback) {
        z9 z9Var = new z9(g5Var.getContext(), g5Var.resourcesProvider, j10, 11, null, new b2(g5Var, new boolean[]{false}, j11, callback, 2), 0L);
        z9Var.setOnDismissListener(new y2(g5Var, 1));
        z9Var.show();
    }

    public static void e1(g5 g5Var, TLRPC.TL_messageActionStarGift tL_messageActionStarGift, org.telegram.ui.ActionBar.d2 d2Var, TLObject tLObject) {
        MessageObject messageObject;
        if (tLObject instanceof TLRPC.messages_Messages) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            MessagesController.getInstance(g5Var.currentAccount).putUsers(messages_messages.users, false);
            MessagesController.getInstance(g5Var.currentAccount).putChats(messages_messages.chats, false);
            for (int i10 = 0; i10 < messages_messages.messages.size(); i10++) {
                TLRPC.Message message = messages_messages.messages.get(i10);
                if (message != null && !(message instanceof TLRPC.TL_messageEmpty) && message.f20866id == tL_messageActionStarGift.upgrade_msg_id) {
                    messageObject = new MessageObject(g5Var.currentAccount, message, false, false);
                    messageObject.setType();
                    break;
                }
            }
        }
        messageObject = null;
        if (messageObject != null) {
            AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b(g5Var, d2Var, messageObject, 26));
        } else {
            AndroidUtilities.runOnUIThread(new g3(d2Var, 0));
        }
    }

    public static void f0(g5 g5Var, TLObject tLObject, long j10, long j11, Utilities.Callback callback, TLRPC.TL_error tL_error, long j12) {
        if (tLObject instanceof TLRPC.TL_payments_paymentResult) {
            TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) tLObject;
            MessagesController.getInstance(g5Var.currentAccount).putUsers(tL_payments_paymentResult.updates.users, false);
            MessagesController.getInstance(g5Var.currentAccount).putChats(tL_payments_paymentResult.updates.chats, false);
            t7.y(g5Var.currentAccount, false).T(false);
            t7.y(g5Var.currentAccount, false).Q(j10);
            t7.y(g5Var.currentAccount, false).Q(j11);
            t7.y(g5Var.currentAccount, false).P();
            callback.run(null);
            org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
            if (U != null) {
                if (j10 >= 0 && j11 >= 0) {
                    xn R9 = xn.R9(j10);
                    R9.whenFullyVisible(new r2(g5Var, R9, j10, 1));
                    U.presentFragment(R9);
                } else {
                    ic M = qc.a0(U).M(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, g5Var.C1(), DialogObject.getShortName(j10))), R.raw.forward);
                    M.f27788t = true;
                    M.j();
                }
            }
            Utilities.stageQueue.postRunnable(new v2(g5Var, tL_payments_paymentResult, 1));
        } else if (tL_error != null && "BALANCE_TOO_LOW".equals(tL_error.text)) {
            if (!MessagesController.getInstance(g5Var.currentAccount).starsPurchaseAvailable()) {
                g5Var.f14097g0.setLoading(false);
                t7.e0(g5Var.getContext(), g5Var.resourcesProvider);
                return;
            }
            t7 y10 = t7.y(g5Var.currentAccount, false);
            i5.x xVar = new i5.x(g5Var, j12, j10, callback, 2);
            y10.f14833e = false;
            y10.q(false, true, xVar);
            y10.f14833e = true;
        } else {
            callback.run(tL_error);
            g5Var.getBulletinFactory().d0(tL_error, false);
        }
    }

    public static void f1(g5 g5Var, TL_stars.InputSavedStarGift inputSavedStarGift, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            MessagesController.getInstance(g5Var.currentAccount).putUsers(updates.users, false);
            MessagesController.getInstance(g5Var.currentAccount).putChats(updates.chats, false);
        }
        AndroidUtilities.runOnUIThread(new androidx.car.app.utils.c(g5Var, tL_error, tLObject, inputSavedStarGift, 10));
    }

    public static void g0(g5 g5Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, Utilities.Callback callback, Boolean bool) {
        TL_stars.StarGift starGift;
        if (g5Var.Q0 == null) {
            lh.p5 p5Var = new lh.p5(g5Var.currentAccount, tL_starGiftUnique.gift_id);
            g5Var.Q0 = p5Var;
            p5Var.a();
        }
        HashSet hashSet = new HashSet();
        int i10 = 0;
        while (true) {
            d4[] d4VarArr = g5Var.f14087b0.I.f14031n;
            if (i10 < d4VarArr.length) {
                TL_stars.StarGift starGift2 = d4VarArr[i10].h;
                if (starGift2 != null) {
                    starGift = starGift2;
                } else {
                    starGift = null;
                }
                if (starGift != null) {
                    if (starGift2 == null) {
                        starGift2 = null;
                    }
                    hashSet.add(Long.valueOf(starGift2.f21072id));
                }
                i10++;
            } else {
                lh.q5 q5Var = new lh.q5(g5Var.getContext(), tL_starGiftUnique.title, g5Var.Q0);
                q5Var.f12912d0.addAll(hashSet);
                q5Var.f12914f0.N(true);
                q5Var.f12913e0 = bool.booleanValue();
                q5Var.f12910b0.set(AndroidUtilities.replaceTags(LocaleController.formatPluralString("GiftCraftSelect", 4 - hashSet.size(), new Object[0])));
                q5Var.f12911c0 = new m1(0, callback);
                q5Var.show();
                return;
            }
        }
    }

    public static void g1(g5 g5Var) {
        TL_stars.SavedStarGift savedStarGift = g5Var.f14121z0;
        if (savedStarGift.unsaved) {
            savedStarGift.unsaved = false;
            j7 F = t7.y(g5Var.currentAccount, false).F(g5Var.U, false);
            if (F != null) {
                TL_stars.SavedStarGift savedStarGift2 = g5Var.f14121z0;
                F.m(savedStarGift2, savedStarGift2.unsaved);
            }
            TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
            savestargift.stargift = g5Var.E1();
            savestargift.unsave = g5Var.f14121z0.unsaved;
            ConnectionsManager.getInstance(g5Var.currentAccount).sendRequest(savestargift, null, 64);
        }
        TL_stars.SavedStarGift savedStarGift3 = g5Var.f14121z0;
        boolean z4 = savedStarGift3.pinned_to_top;
        if (((l7) g5Var.A0).m(savedStarGift3, !z4, false)) {
            new lh.w3(g5Var.getContext(), g5Var.U, g5Var.f14121z0, g5Var.resourcesProvider, new Utilities.Callback0Return() {
                @Override
                public final Object run() {
                    return g5.this.getBulletinFactory();
                }
            }).show();
        } else if (!z4) {
            g5Var.getBulletinFactory().M(LocaleController.getString(R.string.Gift2PinnedTitle), LocaleController.getString(R.string.Gift2PinnedSubtitle), R.raw.ic_pin).j();
        } else {
            l.d.v(R.string.Gift2Unpinned, g5Var.getBulletinFactory(), R.raw.ic_unpin, 36);
        }
    }

    public static SpannableStringBuilder g2(String str) {
        if (str == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        SpannableString spannableString = new SpannableString("👌");
        spannableString.setSpan(new oq(R.drawable.filled_understood, 0), 0, spannableString.length(), 33);
        SpannableString spannableString2 = new SpannableString("👍");
        spannableString2.setSpan(new oq(R.drawable.filled_reactions, 0), 0, spannableString2.length(), 33);
        AndroidUtilities.replaceMultipleCharSequence("👌", spannableStringBuilder, spannableString);
        AndroidUtilities.replaceMultipleCharSequence("👍", spannableStringBuilder, spannableString2);
        return spannableStringBuilder;
    }

    public static void h0(g5 g5Var, TLObject tLObject, String str, TL_stars.InputSavedStarGift inputSavedStarGift, TLRPC.TL_error tL_error, long j10) {
        TL_stars.SavedStarGift savedStarGift;
        if (tLObject instanceof TLRPC.TL_payments_paymentResult) {
            TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) tLObject;
            MessagesController.getInstance(g5Var.currentAccount).putUsers(tL_payments_paymentResult.updates.users, false);
            MessagesController.getInstance(g5Var.currentAccount).putChats(tL_payments_paymentResult.updates.chats, false);
            t7.y(g5Var.currentAccount, false).T(false);
            t7.y(g5Var.currentAccount, false).P();
            if (!TextUtils.isEmpty(str) && (savedStarGift = g5Var.f14121z0) != null) {
                savedStarGift.flags &= -65537;
                savedStarGift.prepaid_upgrade_hash = null;
            }
            g5Var.f14109n0 = true;
            g5Var.f14102i1 = null;
            g5Var.r1(inputSavedStarGift, tL_payments_paymentResult.updates, new u2(g5Var, str, 0));
            Utilities.stageQueue.postRunnable(new v2(g5Var, tL_payments_paymentResult, 0));
        } else if (tL_error != null && "BALANCE_TOO_LOW".equals(tL_error.text)) {
            if (!MessagesController.getInstance(g5Var.currentAccount).starsPurchaseAvailable()) {
                g5Var.f14097g0.setLoading(false);
                t7.e0(g5Var.getContext(), g5Var.resourcesProvider);
                return;
            }
            t7 y10 = t7.y(g5Var.currentAccount, false);
            t1 t1Var = new t1(g5Var, j10, 3);
            y10.f14833e = false;
            y10.q(false, true, t1Var);
            y10.f14833e = true;
        } else {
            g5Var.getBulletinFactory().d0(tL_error, false);
        }
    }

    public static void h1(g5 g5Var, String str) {
        Context context = g5Var.getContext();
        af.g.u(context, MessagesController.getInstance(g5Var.currentAccount).tonBlockchainExplorerUrl + str);
    }

    public static void i0(g5 g5Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, mf.a aVar, Runnable runnable) {
        g5Var.getClass();
        TL_stars.StarsAmount o10 = aVar.o();
        TL_stars.updateStarGiftPrice updatestargiftprice = new TL_stars.updateStarGiftPrice();
        updatestargiftprice.stargift = g5Var.E1();
        updatestargiftprice.resell_amount = o10;
        ConnectionsManager.getInstance(g5Var.currentAccount).sendRequest(updatestargiftprice, new q1(g5Var, tL_starGiftUnique, aVar, runnable, 1));
    }

    public static void i1(g5 g5Var, String str) {
        long j10 = g5Var.U;
        g5Var.f14097g0.setLoading(false);
        if (!TextUtils.isEmpty(str)) {
            g5Var.dismiss();
            org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
            if (R == null) {
                return;
            }
            if (R instanceof xn) {
                xn xnVar = (xn) R;
                if (xnVar.a() == j10) {
                    qc.a0(xnVar).M(LocaleController.getString(R.string.StarsGiftUpgradeCompleted), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StarsGiftUpgradeCompletedText, DialogObject.getShortName(j10))), R.raw.gift).k(true);
                    return;
                }
            }
            NotificationCenter notificationCenter = NotificationCenter.getInstance(g5Var.currentAccount);
            int i10 = NotificationCenter.closeProfileActivity;
            Long valueOf = Long.valueOf(j10);
            Boolean bool = Boolean.FALSE;
            notificationCenter.lambda$postNotificationNameOnUIThread$1(i10, valueOf, bool);
            NotificationCenter.getInstance(g5Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChatActivity, Long.valueOf(j10), bool);
            xn R9 = xn.R9(j10);
            R9.whenFullyVisible(new m2(5, g5Var, R9));
            R.presentFragment(R9);
            return;
        }
        g5Var.q2(0, true, null);
    }

    public static void j0(g5 g5Var, TLObject tLObject, MessageObject messageObject) {
        TLRPC.Message message;
        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
        MessagesController.getInstance(g5Var.currentAccount).putUsers(messages_messages.users, false);
        MessagesController.getInstance(g5Var.currentAccount).putChats(messages_messages.chats, false);
        g5Var.G0 = true;
        g5Var.F0 = false;
        Boolean bool = g5Var.f14090c1;
        if (bool != null && (message = messageObject.messageOwner) != null) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                ((TLRPC.TL_messageActionStarGift) messageAction).saved = true ^ bool.booleanValue();
            } else if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                ((TLRPC.TL_messageActionStarGiftUnique) messageAction).saved = true ^ bool.booleanValue();
            }
        }
        g5Var.i2(messageObject, null);
    }

    public static void j1(g5 g5Var, boolean z4) {
        int i10;
        Object obj;
        lh.m3 m3Var;
        lh.m3 m3Var2;
        lh.m3 m3Var3;
        int G1 = g5Var.G1();
        if (G1 >= 0) {
            if (z4) {
                i10 = 1;
            } else {
                i10 = -1;
            }
            int i11 = i10 + G1;
            int i12 = g5Var.O0;
            if (i12 >= 0 && (!z4 ? i12 < G1 : i12 > G1)) {
                i11 = i12;
            }
            m7 m7Var = g5Var.A0;
            if (m7Var != null && i11 >= 0 && i11 < m7Var.e()) {
                obj = g5Var.A0.get(i11);
            } else {
                obj = null;
            }
            if (obj != null) {
                if (z4) {
                    m3Var = g5Var.Z;
                } else {
                    m3Var = g5Var.Y;
                }
                if (m3Var != null) {
                    if (obj instanceof TL_stars.SavedStarGift) {
                        if (z4) {
                            m3Var3 = g5Var.Z;
                        } else {
                            m3Var3 = g5Var.Y;
                        }
                        if (x1(m3Var3.f14121z0, (TL_stars.SavedStarGift) obj)) {
                            return;
                        }
                    }
                    if (obj instanceof TL_stars.TL_starGiftUnique) {
                        if (z4) {
                            m3Var2 = g5Var.Z;
                        } else {
                            m3Var2 = g5Var.Y;
                        }
                        if (y1(m3Var2.D0, (TL_stars.TL_starGiftUnique) obj)) {
                            return;
                        }
                    }
                }
                lh.m3 m3Var4 = new lh.m3(g5Var, g5Var.getContext(), g5Var.currentAccount, g5Var.U, g5Var.resourcesProvider, g5Var.V.getRootView());
                if (obj instanceof TL_stars.SavedStarGift) {
                    m3Var4.j2((TL_stars.SavedStarGift) obj, g5Var.A0);
                } else if (obj instanceof TL_stars.TL_starGiftUnique) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj;
                    m3Var4.h2(tL_starGiftUnique.slug, tL_starGiftUnique, g5Var.A0);
                }
                AndroidUtilities.removeFromParent(m3Var4.containerView);
                if (z4) {
                    g5Var.Z = m3Var4;
                } else {
                    g5Var.Y = m3Var4;
                }
            }
        }
    }

    public static void k0(g5 g5Var, TL_stars.InputSavedStarGift inputSavedStarGift, long j10, long j11, long j12) {
        org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(ApplicationLoader.applicationContext, 3, null);
        d2Var.q(500L);
        TL_stars.convertStarGift convertstargift = new TL_stars.convertStarGift();
        convertstargift.stargift = inputSavedStarGift;
        ConnectionsManager.getInstance(g5Var.currentAccount).sendRequest(convertstargift, new x1(g5Var, d2Var, j10, j11, j12));
    }

    public static void k1(g5 g5Var, final View view) {
        qh.t9 t9Var;
        LaunchActivity launchActivity = LaunchActivity.D1;
        if (launchActivity != null) {
            if (view instanceof org.telegram.ui.Cells.e7) {
                t9Var = qh.w9.b((org.telegram.ui.Cells.e7) view);
            } else {
                t9Var = null;
            }
            ArrayList arrayList = new ArrayList();
            MessageObject messageObject = g5Var.B0;
            if (messageObject != null) {
                arrayList.add(messageObject);
            } else if (g5Var.B1() instanceof TL_stars.TL_starGiftUnique) {
                long clientUserId = UserConfig.getInstance(g5Var.currentAccount).getClientUserId();
                TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                tL_messageService.peer_id = MessagesController.getInstance(g5Var.currentAccount).getPeer(clientUserId);
                tL_messageService.from_id = MessagesController.getInstance(g5Var.currentAccount).getPeer(clientUserId);
                tL_messageService.date = ConnectionsManager.getInstance(g5Var.currentAccount).getCurrentTime();
                TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = new TLRPC.TL_messageActionStarGiftUnique();
                tL_messageActionStarGiftUnique.gift = (TL_stars.TL_starGiftUnique) g5Var.B1();
                tL_messageActionStarGiftUnique.upgrade = true;
                tL_messageService.action = tL_messageActionStarGiftUnique;
                MessageObject messageObject2 = new MessageObject(g5Var.currentAccount, tL_messageService, false, false);
                messageObject2.setType();
                arrayList.add(messageObject2);
            } else {
                return;
            }
            final qh.ba E = qh.ba.E(launchActivity, g5Var.currentAccount);
            E.O = new Utilities.Callback4() {
                @Override
                public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
                    Long l10 = (Long) obj;
                    Runnable runnable = (Runnable) obj2;
                    Long l11 = (Long) obj4;
                    boolean booleanValue = ((Boolean) obj3).booleanValue();
                    qh.ba baVar = E;
                    qh.t9 t9Var2 = null;
                    if (booleanValue) {
                        g5 g5Var2 = g5.this;
                        AndroidUtilities.runOnUIThread(new gf.c(29, g5Var2, l11));
                        baVar.Y(null);
                        j3 j3Var = g5Var2.T0;
                        if (j3Var != null) {
                            j3Var.dismiss();
                            g5Var2.T0 = null;
                        }
                    } else {
                        View view2 = view;
                        if ((view2 instanceof org.telegram.ui.Cells.e7) && view2.isAttachedToWindow()) {
                            t9Var2 = qh.w9.b((org.telegram.ui.Cells.e7) view2);
                        }
                        baVar.Y(t9Var2);
                    }
                    AndroidUtilities.runOnUIThread(runnable);
                }
            };
            E.U(t9Var, qh.r6.y(arrayList));
        }
    }

    public static void l0(g5 g5Var, long j10) {
        new lh.g2(g5Var.getContext(), g5Var.currentAccount, j10, null, new x2(g5Var, 2)).show();
    }

    public static ViewGroup l1(g5 g5Var) {
        return g5Var.containerView;
    }

    public static void m0(g5 g5Var, org.telegram.ui.ActionBar.d2 d2Var, TL_stars.SavedStarGift savedStarGift) {
        if (savedStarGift != null) {
            d2Var.dismiss();
            g5Var.I0 = true;
            g5Var.j2(savedStarGift, null);
            super.show();
            return;
        }
        d2Var.dismiss();
        org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
        if (U != null) {
            ic Q = qc.a0(U).Q(R.raw.error, 36, LocaleController.getString(R.string.MessageNotFound));
            Q.f27788t = true;
            Q.j();
        }
    }

    public static void n0(g5 g5Var) {
        TL_stars.TL_starGiftUnique K1 = g5Var.K1();
        new m0(g5Var.getContext(), g5Var.currentAccount, DialogObject.getPeerDialogId(K1.owner_id), K1, g5Var.resourcesProvider, new s1(g5Var, 2)).show();
    }

    public static int n1(g5 g5Var) {
        return g5Var.backgroundPaddingLeft;
    }

    public static void o0(g5 g5Var, String str) {
        g5Var.dismiss();
        Context context = g5Var.getContext();
        af.g.s(context, "https://" + MessagesController.getInstance(g5Var.currentAccount).linkPrefix + "/" + str);
    }

    public static int o1(g5 g5Var) {
        return g5Var.backgroundPaddingLeft;
    }

    public static void p0(g5 g5Var) {
        if (g5Var.f14102i1 == null) {
            return;
        }
        long j10 = 0;
        for (int i10 = 0; i10 < g5Var.f14102i1.invoice.prices.size(); i10++) {
            j10 += g5Var.f14102i1.invoice.prices.get(i10).amount;
        }
        e5 e5Var = new e5(g5Var.getContext(), j10, g5Var.f14096f1, g5Var.resourcesProvider);
        g5Var.m0 = e5Var;
        e5Var.show();
    }

    public static void q0(g5 g5Var, af.f fVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(g5Var.currentAccount).processUpdates((TLRPC.Updates) tLObject, false);
            AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b(g5Var, fVar, tL_starGiftUnique, 23));
            return;
        }
        g5Var.getClass();
        if (tL_error != null && tL_error.text.startsWith("STARGIFT_RESELL_TOO_EARLY_")) {
            AndroidUtilities.runOnUIThread(new i5.v(g5Var, fVar, Long.parseLong(tL_error.text.substring(26)), 3));
        } else if (tL_error != null) {
            AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b(g5Var, fVar, tL_error, 24));
        }
    }

    public static void q1(sz0 sz0Var, TL_stars.StarGiftAttribute starGiftAttribute) {
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
        sz0Var.e(str, starGiftAttribute.name, J1(starGiftAttribute.rarity, numArr), null, numArr[0]);
    }

    public static void r0(g5 g5Var, TL_stars.StarGift starGift, TL_stars.StarGiftAttribute starGiftAttribute, sc[] scVarArr, boolean[] zArr, ArrayList arrayList) {
        if (arrayList != null) {
            new i1(g5Var.getContext(), g5Var.resourcesProvider, g5Var.currentAccount, starGift.title, arrayList, false).show();
        } else {
            g5Var.o2(scVarArr[0], LocaleController.formatString(R.string.Gift2RarityHint, sh.j.G0(starGiftAttribute.getRarityPermille())), false);
        }
        zArr[0] = false;
    }

    public static void s0(g5 g5Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, mf.a aVar, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(g5Var.currentAccount).processUpdates((TLRPC.Updates) tLObject, false);
            AndroidUtilities.runOnUIThread(new h2(g5Var, tL_starGiftUnique, aVar, runnable, 0));
            return;
        }
        g5Var.getClass();
        if (tL_error != null && tL_error.text.startsWith("STARGIFT_RESELL_TOO_EARLY_")) {
            AndroidUtilities.runOnUIThread(new i5.v(g5Var, Long.parseLong(tL_error.text.substring(26)), runnable, 2));
        } else if (tL_error != null) {
            AndroidUtilities.runOnUIThread(new i2(g5Var, tL_error, runnable, 0));
        }
    }

    public static void t0(g5 g5Var, String str) {
        Context context = g5Var.getContext();
        af.g.u(context, MessagesController.getInstance(g5Var.currentAccount).tonBlockchainExplorerUrl + str);
    }

    public static void u0(g5 g5Var, ArrayList arrayList, Utilities.Callback2 callback2, Runnable runnable) {
        lh.p5 p5Var = g5Var.Q0;
        if (p5Var != null) {
            p5Var.b();
            g5Var.Q0 = null;
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
        ConnectionsManager.getInstance(g5Var.currentAccount).sendRequestTyped(craftstargift, new Object(), new y1(g5Var, callback2, arrayList, runnable, 0));
    }

    public static void v0(mh.g5 r17) {
        throw new UnsupportedOperationException("Method not decompiled: mh.g5.v0(mh.g5):void");
    }

    public static void w0(g5 g5Var, String str) {
        Context context = g5Var.getContext();
        af.g.u(context, MessagesController.getInstance(g5Var.currentAccount).tonBlockchainExplorerUrl + str);
    }

    public static void x0(g5 g5Var, TLObject tLObject, hg.v2[] v2VarArr, Long l10, androidx.car.app.utils.b bVar, TLRPC.TL_error tL_error) {
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        if (tLObject instanceof TLRPC.TL_users_userFull) {
            TLRPC.TL_users_userFull tL_users_userFull = (TLRPC.TL_users_userFull) tLObject;
            MessagesController.getInstance(g5Var.currentAccount).putUsers(tL_users_userFull.users, false);
            MessagesController.getInstance(g5Var.currentAccount).putChats(tL_users_userFull.chats, false);
            TLRPC.UserFull userFull = tL_users_userFull.full_user;
            if (userFull != null && (disallowedGiftsSettings = userFull.disallowed_stargifts) != null && disallowedGiftsSettings.disallow_unique_stargifts) {
                new qc(v2VarArr[0].container, g5Var.resourcesProvider).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(l10.longValue())))).j();
                return;
            } else {
                bVar.run();
                return;
            }
        }
        ic Y = g5Var.getBulletinFactory().Y(tL_error);
        Y.f27788t = true;
        Y.j();
    }

    public static boolean x1(TL_stars.SavedStarGift savedStarGift, TL_stars.SavedStarGift savedStarGift2) {
        if (savedStarGift != savedStarGift2) {
            if (savedStarGift != null) {
                TL_stars.StarGift starGift = savedStarGift.gift;
                TL_stars.StarGift starGift2 = savedStarGift2.gift;
                if (starGift != starGift2) {
                    if ((starGift instanceof TL_stars.TL_starGiftUnique) && (starGift2 instanceof TL_stars.TL_starGiftUnique)) {
                        if (starGift.f21072id == starGift2.f21072id) {
                            return true;
                        }
                        return false;
                    } else if ((starGift instanceof TL_stars.TL_starGift) && (starGift2 instanceof TL_stars.TL_starGift) && starGift.f21072id == starGift2.f21072id && savedStarGift.date == savedStarGift2.date) {
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

    public static void y0(g5 g5Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        s1 s1Var = g5Var.f14106k1;
        g5Var.f14100h1 = false;
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            MessagesController.getInstance(g5Var.currentAccount).putUsers(paymentForm.users, false);
            g5Var.f14102i1 = paymentForm;
            AndroidUtilities.cancelRunOnUIThread(s1Var);
            AndroidUtilities.runOnUIThread(s1Var);
            return;
        }
        ic Y = g5Var.getBulletinFactory().Y(tL_error);
        Y.f27788t = true;
        Y.j();
    }

    public static boolean y1(TL_stars.TL_starGiftUnique tL_starGiftUnique, TL_stars.TL_starGiftUnique tL_starGiftUnique2) {
        if (tL_starGiftUnique != tL_starGiftUnique2) {
            if (tL_starGiftUnique != null) {
                if (tL_starGiftUnique.f21072id == tL_starGiftUnique2.f21072id || TextUtils.equals(tL_starGiftUnique.slug, tL_starGiftUnique2.slug)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public static void z0(g5 g5Var, TLObject tLObject, boolean z4, TLRPC.Document document, boolean z10, TLRPC.TL_error tL_error, TL_stars.saveStarGift savestargift) {
        j7 F;
        int i10;
        int i11;
        int i12;
        int i13;
        org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
        if (U != null) {
            g2 g2Var = null;
            if (tLObject instanceof TLRPC.TL_boolTrue) {
                g5Var.dismiss();
                long A1 = g5Var.A1();
                if (!z4) {
                    t7.y(g5Var.currentAccount, false).Q(A1);
                }
                if (A1 >= 0) {
                    qc a02 = qc.a0(U);
                    if (z10) {
                        i12 = R.string.Gift2MadePrivateTitle;
                    } else {
                        i12 = R.string.Gift2MadePublicTitle;
                    }
                    String string = LocaleController.getString(i12);
                    if (z10) {
                        i13 = R.string.Gift2MadePrivate;
                    } else {
                        i13 = R.string.Gift2MadePublic;
                    }
                    String string2 = LocaleController.getString(i13);
                    if (!(U instanceof ProfileActivity)) {
                        g2Var = new g2(A1, U);
                    }
                    a02.s(document, string, AndroidUtilities.replaceSingleTag(string2, g2Var)).k(true);
                    return;
                }
                qc a03 = qc.a0(U);
                if (z10) {
                    i10 = R.string.Gift2ChannelMadePrivateTitle;
                } else {
                    i10 = R.string.Gift2ChannelMadePublicTitle;
                }
                String string3 = LocaleController.getString(i10);
                if (z10) {
                    i11 = R.string.Gift2ChannelMadePrivate;
                } else {
                    i11 = R.string.Gift2ChannelMadePublic;
                }
                a03.s(document, string3, LocaleController.getString(i11)).j();
            } else if (tL_error != null) {
                if (z4 && g5Var.f14121z0 != null && (F = t7.y(g5Var.currentAccount, false).F(g5Var.U, false)) != null) {
                    F.m(g5Var.f14121z0, !savestargift.unsave);
                }
                g5Var.getBulletinFactory().t(LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text), null).k(false);
            }
        }
    }

    public final long A1() {
        TLRPC.Peer peer;
        MessageObject messageObject = this.B0;
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
                        return this.B0.getDialogId();
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
        TL_stars.SavedStarGift savedStarGift = this.f14121z0;
        if (savedStarGift != null) {
            TL_stars.StarGift starGift2 = savedStarGift.gift;
            if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                return DialogObject.getPeerDialogId(((TL_stars.TL_starGiftUnique) starGift2).owner_id);
            }
            return this.U;
        }
        TL_stars.TL_starGiftUnique tL_starGiftUnique = this.D0;
        if (tL_starGiftUnique != null) {
            return DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id);
        }
        return 0L;
    }

    public final TL_stars.StarGift B1() {
        MessageObject messageObject = this.B0;
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
            TL_stars.SavedStarGift savedStarGift = this.f14121z0;
            if (savedStarGift != null) {
                return savedStarGift.gift;
            }
            TL_stars.TL_starGiftUnique tL_starGiftUnique = this.D0;
            if (tL_starGiftUnique != null) {
                return tL_starGiftUnique;
            }
        }
        return null;
    }

    public final String C1() {
        TL_stars.StarGift B1 = B1();
        if (B1 instanceof TL_stars.TL_starGiftUnique) {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) B1;
            StringBuilder sb = new StringBuilder();
            sb.append(tL_starGiftUnique.title);
            sb.append(" #");
            return l.d.l(tL_starGiftUnique.num, ',', sb);
        }
        return "";
    }

    public final TL_stars.InputSavedStarGift E1() {
        TLRPC.Message message;
        TLRPC.Message message2;
        TLRPC.Message message3;
        long j10 = this.U;
        if (j10 < 0) {
            TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat = new TL_stars.TL_inputSavedStarGiftChat();
            tL_inputSavedStarGiftChat.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j10);
            MessageObject messageObject = this.B0;
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
            TL_stars.SavedStarGift savedStarGift = this.f14121z0;
            if (savedStarGift != null) {
                if ((savedStarGift.flags & 2048) == 0) {
                    return null;
                }
                tL_inputSavedStarGiftChat.saved_id = savedStarGift.saved_id;
                return tL_inputSavedStarGiftChat;
            } else if (this.D0 != null && !TextUtils.isEmpty(this.C0)) {
                TL_stars.TL_inputSavedStarGiftSlug tL_inputSavedStarGiftSlug = new TL_stars.TL_inputSavedStarGiftSlug();
                tL_inputSavedStarGiftSlug.slug = this.C0;
                return tL_inputSavedStarGiftSlug;
            } else {
                return tL_inputSavedStarGiftChat;
            }
        }
        MessageObject messageObject2 = this.B0;
        if (messageObject2 != null && messageObject2.getDialogId() < 0 && (message2 = this.B0.messageOwner) != null) {
            TLRPC.MessageAction messageAction2 = message2.action;
            if ((messageAction2 instanceof TLRPC.TL_messageActionStarGift) && (messageAction2.flags & 4096) != 0) {
                TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat2 = new TL_stars.TL_inputSavedStarGiftChat();
                tL_inputSavedStarGiftChat2.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.B0.getDialogId());
                tL_inputSavedStarGiftChat2.saved_id = ((TLRPC.TL_messageActionStarGift) messageAction2).saved_id;
                return tL_inputSavedStarGiftChat2;
            }
        }
        MessageObject messageObject3 = this.B0;
        if (messageObject3 != null && messageObject3.getDialogId() < 0 && (message = this.B0.messageOwner) != null) {
            TLRPC.MessageAction messageAction3 = message.action;
            if ((messageAction3 instanceof TLRPC.TL_messageActionStarGiftUnique) && (messageAction3.flags & 128) != 0) {
                TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat3 = new TL_stars.TL_inputSavedStarGiftChat();
                tL_inputSavedStarGiftChat3.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.B0.getDialogId());
                tL_inputSavedStarGiftChat3.saved_id = ((TLRPC.TL_messageActionStarGiftUnique) messageAction3).saved_id;
                return tL_inputSavedStarGiftChat3;
            }
        }
        TL_stars.TL_inputSavedStarGiftUser tL_inputSavedStarGiftUser = new TL_stars.TL_inputSavedStarGiftUser();
        MessageObject messageObject4 = this.B0;
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
        TL_stars.SavedStarGift savedStarGift2 = this.f14121z0;
        if (savedStarGift2 != null) {
            tL_inputSavedStarGiftUser.msg_id = savedStarGift2.msg_id;
            return tL_inputSavedStarGiftUser;
        } else if (this.D0 != null && !TextUtils.isEmpty(this.C0)) {
            TL_stars.TL_inputSavedStarGiftSlug tL_inputSavedStarGiftSlug2 = new TL_stars.TL_inputSavedStarGiftSlug();
            tL_inputSavedStarGiftSlug2.slug = this.C0;
            return tL_inputSavedStarGiftSlug2;
        } else {
            return tL_inputSavedStarGiftUser;
        }
    }

    public final String F1() {
        TL_stars.StarGift B1 = B1();
        if ((B1 instanceof TL_stars.TL_starGiftUnique) && B1.slug != null) {
            return MessagesController.getInstance(this.currentAccount).linkPrefix + "/nft/" + B1.slug;
        }
        return null;
    }

    public final int G1() {
        int indexOf;
        m7 m7Var = this.A0;
        if (m7Var != null) {
            TL_stars.SavedStarGift savedStarGift = this.f14121z0;
            if (savedStarGift != null) {
                indexOf = m7Var.indexOf(savedStarGift);
            } else {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = this.D0;
                if (tL_starGiftUnique != null) {
                    indexOf = m7Var.indexOf(tL_starGiftUnique);
                } else {
                    return -1;
                }
            }
            if (indexOf >= 0) {
                return indexOf;
            }
            TL_stars.StarGift B1 = B1();
            for (int i10 = 0; i10 < this.A0.e(); i10++) {
                Object obj = this.A0.get(i10);
                if (obj instanceof TL_stars.SavedStarGift) {
                    TL_stars.SavedStarGift savedStarGift2 = this.f14121z0;
                    if (savedStarGift2 != null) {
                        if (x1(savedStarGift2, (TL_stars.SavedStarGift) obj)) {
                            return i10;
                        }
                    }
                    if (B1 != null) {
                        TL_stars.StarGift starGift = ((TL_stars.SavedStarGift) obj).gift;
                        if (B1 != starGift) {
                            if ((B1 instanceof TL_stars.TL_starGiftUnique) && (starGift instanceof TL_stars.TL_starGiftUnique) && B1.f21072id == starGift.f21072id) {
                            }
                        }
                        return i10;
                    }
                    continue;
                } else {
                    if ((obj instanceof TL_stars.TL_starGiftUnique) && y1(this.D0, (TL_stars.TL_starGiftUnique) obj)) {
                        return i10;
                    }
                }
            }
            return -1;
        }
        return -1;
    }

    public final TL_stars.SavedStarGift H1(boolean z4) {
        int i10;
        Object obj;
        int G1 = G1();
        if (G1 < 0) {
            return null;
        }
        if (z4) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        int i11 = i10 + G1;
        int i12 = this.O0;
        if (i12 >= 0 && (!z4 ? i12 < G1 : i12 > G1)) {
            i11 = i12;
        }
        m7 m7Var = this.A0;
        if (m7Var != null && i11 >= 0 && i11 < m7Var.e()) {
            obj = this.A0.get(i11);
        } else {
            obj = null;
        }
        if (!(obj instanceof TL_stars.SavedStarGift)) {
            return null;
        }
        return (TL_stars.SavedStarGift) obj;
    }

    public final TL_stars.TL_starGiftUnique I1(boolean z4) {
        int i10;
        Object obj;
        int G1 = G1();
        if (G1 < 0) {
            return null;
        }
        if (z4) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        int i11 = i10 + G1;
        int i12 = this.O0;
        if (i12 >= 0 && (!z4 ? i12 < G1 : i12 > G1)) {
            i11 = i12;
        }
        m7 m7Var = this.A0;
        if (m7Var != null && i11 >= 0 && i11 < m7Var.e()) {
            obj = this.A0.get(i11);
        } else {
            obj = null;
        }
        if (!(obj instanceof TL_stars.TL_starGiftUnique)) {
            return null;
        }
        return (TL_stars.TL_starGiftUnique) obj;
    }

    @Override
    public final boolean K() {
        return false;
    }

    public final TL_stars.TL_starGiftUnique K1() {
        TL_stars.StarGift B1 = B1();
        if (B1 instanceof TL_stars.TL_starGiftUnique) {
            return (TL_stars.TL_starGiftUnique) B1;
        }
        return null;
    }

    public final boolean L1(boolean z4) {
        if (H1(z4) == null && I1(z4) == null) {
            return false;
        }
        return true;
    }

    public final void M1(TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity) {
        TL_stars.getStarGiftWithdrawalUrl getstargiftwithdrawalurl = new TL_stars.getStarGiftWithdrawalUrl();
        TL_stars.InputSavedStarGift E1 = E1();
        getstargiftwithdrawalurl.stargift = E1;
        if (E1 == null) {
            return;
        }
        getstargiftwithdrawalurl.password = inputCheckPasswordSRP;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(getstargiftwithdrawalurl, new s2(this, twoStepVerificationActivity, 0));
    }

    public final void Q1() {
        throw new UnsupportedOperationException("Method not decompiled: mh.g5.Q1():void");
    }

    public final void R1(android.view.View r6) {
        throw new UnsupportedOperationException("Method not decompiled: mh.g5.R1(android.view.View):void");
    }

    public final void S1() {
        j3 j3Var = this.T0;
        if (j3Var != null && j3Var.isShown()) {
            this.T0.dismiss();
        }
        String F1 = F1();
        j3 j3Var2 = new j3(this, getContext(), F1, F1, this.resourcesProvider);
        this.T0 = j3Var2;
        j3Var2.f28844p0 = new o5.i(this, 23);
        j3Var2.show();
    }

    public final void T1() {
        throw new UnsupportedOperationException("Method not decompiled: mh.g5.T1():void");
    }

    public final void U1() {
        TL_stars.TL_starGiftUnique K1 = K1();
        if (K1 == null) {
            return;
        }
        ja.f1(getContext(), this.currentAccount, K1, new d3(this, K1, 2), this.resourcesProvider);
    }

    public final void V1(long j10, String str) {
        this.f14092d1 = true;
        t7.y(this.currentAccount, false).K(j10, new lh.a1(4, this, str));
    }

    public final void W1(boolean z4) {
        int i10;
        MessageObject messageObject = this.B0;
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
            TL_stars.SavedStarGift savedStarGift = this.f14121z0;
            if (savedStarGift != null) {
                i10 = savedStarGift.can_craft_at;
            }
            i10 = 0;
        }
        if (i10 > ConnectionsManager.getInstance(this.currentAccount).getCurrentTime()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
            String string = LocaleController.getString(R.string.GiftCraftLaterTitle);
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21168a;
            d2Var.O = string;
            d2Var.Q = LocaleController.formatString(R.string.GiftCraftLaterText, LocaleController.formatDateTime(i10, true));
            l.d.C(R.string.OK, alertDialog$Builder, null);
            return;
        }
        TL_stars.TL_starGiftUnique K1 = K1();
        if (K1 == null) {
            return;
        }
        if (!TextUtils.isEmpty(K1.gift_address)) {
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
            String string2 = LocaleController.getString(R.string.GiftCraftCantChooseFirstTitle);
            org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder2.f21168a;
            d2Var2.O = string2;
            d2Var2.Q = LocaleController.getString(R.string.GiftCraftCantChooseFirst);
            l.d.C(R.string.OK, alertDialog$Builder2, null);
            return;
        }
        c5 c5Var = this.f14087b0;
        if (z4) {
            c5Var.I.a(this.currentAccount, K1.gift_id, K1.getDocument(), K1.title);
            if (t1()) {
                f4 f4Var = c5Var.I;
                TL_stars.TL_starGiftUnique K12 = K1();
                if (K12 == null) {
                    f4Var.getClass();
                } else {
                    while (true) {
                        d4[] d4VarArr = f4Var.f14031n;
                        if (i11 >= d4VarArr.length) {
                            break;
                        }
                        d4 d4Var = d4VarArr[i11];
                        TL_stars.StarGift starGift = d4Var.h;
                        if (starGift == null) {
                            starGift = null;
                        }
                        if (starGift == null) {
                            d4Var.a(K12, true);
                            break;
                        }
                        i11++;
                    }
                    f4Var.d(true);
                }
            }
        }
        f4 f4Var2 = c5Var.I;
        f4 f4Var3 = c5Var.I;
        f4Var2.setOnCraft(new n1(this, 1));
        if (this.Q0 == null) {
            lh.p5 p5Var = new lh.p5(this.currentAccount, K1.gift_id);
            this.Q0 = p5Var;
            p5Var.a();
        }
        f4Var3.setOnAddGift(new d3(this, K1, 1));
        f4Var3.setOnClose(new s1(this, 18));
        q2(4, true, null);
    }

    public final void X1(long j10) {
        qh.e3 e3Var = this.l1;
        if (e3Var != null) {
            e3Var.e(true);
            this.l1 = null;
        }
        dismiss();
        org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
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

    public final void Y1() {
        throw new UnsupportedOperationException("Method not decompiled: mh.g5.Y1():void");
    }

    public final void Z1(long j10, Utilities.Callback callback) {
        TLRPC.Message message;
        long j11;
        String str;
        TLRPC.User user;
        String formatString;
        CharSequence string;
        TL_stars.SavedStarGift savedStarGift = this.f14121z0;
        if (savedStarGift != null && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
            j11 = savedStarGift.transfer_stars;
        } else {
            MessageObject messageObject = this.B0;
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
        TL_stars.TL_starGiftUnique K1 = K1();
        if (K1 != null) {
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
            linearLayout.addView(new h4(getContext(), K1, user), k7.c6.t(-1, -2, 48, 0, -4, 0, 0));
            TextView textView = new TextView(getContext());
            org.telegram.ui.b.l(org.telegram.ui.ActionBar.k6.f21768j5, this.resourcesProvider, textView, 1, 16.0f);
            int i10 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
            if (i10 > 0) {
                formatString = LocaleController.formatPluralStringComma("Gift2TransferPriceText", (int) j11, C1(), DialogObject.getShortName(j10));
            } else {
                formatString = LocaleController.formatString(R.string.Gift2TransferText, C1(), str);
            }
            textView.setText(AndroidUtilities.replaceTags(formatString));
            linearLayout.addView(textView, k7.c6.t(-1, -2, 48, 24, 4, 24, 4));
            sz0 sz0Var = new sz0(getContext(), this.resourcesProvider);
            q1(sz0Var, t7.l(K1.attributes, TL_stars.starGiftAttributeModel.class));
            q1(sz0Var, t7.l(K1.attributes, TL_stars.starGiftAttributeBackdrop.class));
            q1(sz0Var, t7.l(K1.attributes, TL_stars.starGiftAttributePattern.class));
            if (!TextUtils.isEmpty(K1.slug) && (K1.flags & 256) != 0) {
                sz0Var.c(LocaleController.getString(R.string.GiftValue2), yh.k("~", BillingController.getInstance().formatCurrency(K1.value_amount, K1.value_currency, BillingController.getInstance().getCurrencyExp(K1.value_currency), true)), null, null);
            }
            linearLayout.addView(sz0Var, k7.c6.t(-1, -2, 48, 23, 16, 23, 4));
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
            alertDialog$Builder.n(linearLayout);
            if (i10 > 0) {
                string = ja.Q0(LocaleController.formatString(R.string.Gift2TransferDoPrice, Integer.valueOf((int) j11)));
            } else {
                string = LocaleController.getString(R.string.Gift2TransferDo);
            }
            alertDialog$Builder.k(string, new hg.f(callback, 27));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21168a;
            d2Var.U0 = true;
            d2Var.show();
        }
    }

    public final void a2() {
        TL_stars.InputSavedStarGift E1;
        long j10;
        long j11;
        long j12;
        boolean z4;
        boolean z10;
        boolean z11;
        String str;
        boolean z12;
        boolean z13;
        int i10;
        qh.e3 e3Var = this.l1;
        if (e3Var != null) {
            e3Var.e(true);
            this.l1 = null;
        }
        if (this.W0 == null && (E1 = E1()) != null) {
            MessageObject messageObject = this.B0;
            long j13 = this.U;
            if (messageObject != null) {
                TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
                if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                    TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                    j11 = tL_messageActionStarGift.gift.f21072id;
                    j12 = tL_messageActionStarGift.upgrade_stars;
                    z4 = tL_messageActionStarGift.name_hidden;
                    TLRPC.TL_textWithEntities tL_textWithEntities = tL_messageActionStarGift.message;
                    if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    z11 = tL_messageActionStarGift.peer instanceof TLRPC.TL_peerChannel;
                    j10 = 0;
                    str = tL_messageActionStarGift.prepaid_upgrade_hash;
                    if (tL_messageActionStarGift.prepaid_upgrade) {
                        if (DialogObject.getPeerDialogId(tL_messageActionStarGift.from_id) != this.B0.getFromChatId()) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                    } else {
                        z12 = tL_messageActionStarGift.upgrade_separate;
                    }
                } else {
                    return;
                }
            } else {
                j10 = 0;
                TL_stars.SavedStarGift savedStarGift = this.f14121z0;
                if (savedStarGift != null) {
                    TL_stars.StarGift starGift = savedStarGift.gift;
                    j11 = starGift.f21072id;
                    j12 = savedStarGift.upgrade_stars;
                    if ((starGift instanceof TL_stars.TL_starGift) && savedStarGift.name_hidden) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    TLRPC.TL_textWithEntities tL_textWithEntities2 = savedStarGift.message;
                    if (tL_textWithEntities2 != null && !TextUtils.isEmpty(tL_textWithEntities2.text)) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (j13 < 0) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    TL_stars.SavedStarGift savedStarGift2 = this.f14121z0;
                    str = savedStarGift2.prepaid_upgrade_hash;
                    z12 = savedStarGift2.upgrade_separate;
                } else {
                    return;
                }
            }
            TextView textView = this.f14115t0;
            if (z4) {
                if (z11) {
                    i10 = R.string.Gift2AddMyNameNameChannel;
                } else {
                    i10 = R.string.Gift2AddMyNameName;
                }
                textView.setText(LocaleController.getString(i10));
            } else if (z10) {
                textView.setText(LocaleController.getString(R.string.Gift2AddSenderNameComment));
            } else {
                textView.setText(LocaleController.getString(R.string.Gift2AddSenderName));
            }
            if (!z4 && j12 > j10 && !z12) {
                z13 = true;
            } else {
                z13 = false;
            }
            np npVar = this.f14114s0;
            npVar.a(z13, false);
            ArrayList arrayList = this.f14094e1;
            if (arrayList != null && (j12 > j10 || this.f14102i1 != null)) {
                b2();
                return;
            }
            if (arrayList == null) {
                t7.y(this.currentAccount, false).K(j11, new x2(this, 1));
            }
            if (j12 <= j10 && this.f14102i1 == null) {
                this.f14100h1 = true;
                TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                if (!TextUtils.isEmpty(str)) {
                    TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade tL_inputInvoiceStarGiftPrepaidUpgrade = new TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade();
                    tL_inputInvoiceStarGiftPrepaidUpgrade.hash = str;
                    tL_inputInvoiceStarGiftPrepaidUpgrade.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j13);
                    tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftPrepaidUpgrade;
                } else {
                    TLRPC.TL_inputInvoiceStarGiftUpgrade tL_inputInvoiceStarGiftUpgrade = new TLRPC.TL_inputInvoiceStarGiftUpgrade();
                    tL_inputInvoiceStarGiftUpgrade.keep_original_details = npVar.f29560a.f24811q;
                    tL_inputInvoiceStarGiftUpgrade.stargift = E1;
                    tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftUpgrade;
                }
                JSONObject p10 = sh.p2.p(this.resourcesProvider, false);
                if (p10 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                    tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                    tL_dataJSON.data = p10.toString();
                    tL_payments_getPaymentForm.flags |= 1;
                }
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getPaymentForm, new f3(this, 0));
            }
        }
    }

    public final void b2() {
        throw new UnsupportedOperationException("Method not decompiled: mh.g5.b2():void");
    }

    public final void c2(final TL_stars.TL_starGiftUnique tL_starGiftUnique, final long j10, final mf.b bVar, final TLRPC.TL_textWithEntities tL_textWithEntities, final boolean z4, final lh.u0 u0Var) {
        this.f14097g0.setLoading(true);
        if (u0Var != null && !u0Var.I) {
            u0Var.I = true;
            u0Var.E.h(true);
        }
        t7.x(this.currentAccount, bVar).H(tL_starGiftUnique, j10, tL_textWithEntities, z4, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                g5.a1(g5.this, u0Var, bVar, tL_starGiftUnique, j10, tL_textWithEntities, z4, (TLRPC.TL_payments_paymentFormStarGift) obj);
            }
        });
    }

    @Override
    public final boolean canDismissWithSwipe() {
        if (this.V0.c(4)) {
            boolean z4 = this.f14087b0.I.f14024e0;
        }
        return false;
    }

    @Override
    public final boolean canDismissWithTouchOutside() {
        if (this.V0.c(4) && this.f14087b0.I.f14024e0) {
            return false;
        }
        return super.canDismissWithTouchOutside();
    }

    @Override
    public final boolean canSwipeToBack(MotionEvent motionEvent) {
        if (this.V0.c(4) && this.f14087b0.I.f14024e0) {
            return false;
        }
        return super.canSwipeToBack(motionEvent);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starUserGiftsLoaded) {
            if (this.A0 == ((l7) objArr[1])) {
                f4 f4Var = this.f14087b0.I;
                if (f4Var == null || !f4Var.f14024e0) {
                    t2();
                }
            }
        }
    }

    @Override
    public final void dismiss() {
        if (this.V0.c(4) && this.f14087b0.I.f14024e0) {
            return;
        }
        lh.p5 p5Var = this.Q0;
        if (p5Var != null) {
            p5Var.b();
            this.Q0 = null;
        }
        r4 r4Var = this.J0;
        if (r4Var != null) {
            r4Var.a();
        }
        super.dismiss();
    }

    public final SpannableStringBuilder e2(TLRPC.Peer peer) {
        if (peer != null) {
            String publicUsername = DialogObject.getPublicUsername(MessagesController.getInstance(this.currentAccount).getUserOrChat(DialogObject.getPeerDialogId(peer)));
            if (TextUtils.isEmpty(publicUsername)) {
                return null;
            }
            return AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.Gift2ReleasedBy2, yh.k("@", publicUsername)), new u2(this, publicUsername, 8));
        }
        return null;
    }

    public final SpannableStringBuilder f2(TL_stars.StarGift starGift) {
        if (starGift != null && !(starGift instanceof TL_stars.TL_starGiftUnique)) {
            return e2(starGift.released_by);
        }
        return null;
    }

    @Override
    public qc getBulletinFactory() {
        return new qc(this.f14107l0, this.resourcesProvider);
    }

    public final void h2(String str, TL_stars.TL_starGiftUnique tL_starGiftUnique, m7 m7Var) {
        boolean z4;
        boolean z10;
        r4 r4Var;
        TL_stars.TL_starGiftUnique tL_starGiftUnique2;
        this.C0 = str;
        this.D0 = tL_starGiftUnique;
        this.A0 = m7Var;
        if (tL_starGiftUnique.resell_amount != null && !N1(this.currentAccount, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id))) {
            z4 = true;
        } else {
            z4 = false;
        }
        this.E0 = z4;
        if (!this.K0 && (r4Var = this.J0) != null && r4Var.f14683o && (tL_starGiftUnique2 = r4Var.f14680l) != null && tL_starGiftUnique2.f21072id != tL_starGiftUnique.f21072id) {
            r4Var.a();
            this.J0 = null;
            c5 c5Var = this.f14087b0;
            c5Var.f13799b.setAlpha(1.0f);
            c5Var.f13801c.setAlpha(0.0f);
        }
        this.f14085a0.b(this.currentAccount, this.f14121z0);
        k2(tL_starGiftUnique, false, null, null);
        String str2 = tL_starGiftUnique.owner_address;
        String str3 = tL_starGiftUnique.gift_address;
        if (tL_starGiftUnique.host_id != null) {
            z10 = true;
        } else {
            z10 = false;
        }
        g90 g90Var = this.f14091d0;
        if (z10 && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            g90Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2InBlockchain), new u2(this, str3, 3)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            g90Var.setVisibility(0);
            g90Var.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21895q5, this.resourcesProvider));
        } else {
            g90Var.setVisibility(8);
        }
        g90 g90Var2 = this.f14095f0;
        if (!z10 && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            g90Var2.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2InBlockchain), new u2(this, str3, 4)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            g90Var2.setVisibility(0);
        } else {
            g90Var2.setVisibility(8);
        }
        if (this.E0) {
            l2(tL_starGiftUnique);
            this.f14097g0.setOnClickListener(new k1(this, 7));
        }
        if (this.Y0) {
            q2(0, false, null);
            this.f31014c.n0(1);
            this.Y0 = false;
        }
        t2();
    }

    public final void i2(org.telegram.messenger.MessageObject r56, mh.m7 r57) {
        throw new UnsupportedOperationException("Method not decompiled: mh.g5.i2(org.telegram.messenger.MessageObject, mh.m7):void");
    }

    public final void j2(TL_stars.SavedStarGift savedStarGift, m7 m7Var) {
        boolean z4;
        boolean z10;
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
        boolean z11;
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
        r4 r4Var;
        if (savedStarGift == null) {
            return;
        }
        int i20 = this.currentAccount;
        long j11 = this.U;
        this.f14120y0 = N1(i20, j11);
        this.f14121z0 = savedStarGift;
        this.A0 = m7Var;
        this.B0 = null;
        boolean z12 = this.K0;
        c5 c5Var = this.f14087b0;
        if (!z12 && (r4Var = this.J0) != null && r4Var.f14683o && r4Var.f14680l != null) {
            r4Var.a();
            this.J0 = null;
            c5Var.f13799b.setVisibility(0);
            c5Var.f13801c.setVisibility(4);
        }
        this.f14085a0.b(this.currentAccount, savedStarGift);
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
            z4 = true;
        } else {
            z4 = false;
        }
        TLRPC.TL_textWithEntities tL_textWithEntities = savedStarGift.message;
        boolean z13 = savedStarGift.refunded;
        TL_stars.StarGift starGift4 = savedStarGift.gift;
        if (starGift4 instanceof TL_stars.TL_starGiftUnique) {
            str3 = starGift4.owner_address;
            str4 = starGift4.gift_address;
            if (starGift4.host_id != null) {
                z11 = true;
            } else {
                z11 = false;
            }
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift4;
            if (!savedStarGift.name_hidden) {
                tLObject = MessagesController.getInstance(this.currentAccount).getUserOrChat(DialogObject.getPeerDialogId(savedStarGift.from_id));
            } else {
                tLObject = null;
            }
            k2(tL_starGiftUnique, z13, tLObject, savedStarGift.message);
        } else {
            if (this.f14120y0 && clientUserId == peerDialogId && i21 >= 0) {
                z10 = true;
            } else {
                z10 = false;
            }
            boolean z14 = z10;
            boolean P1 = P1(this.currentAccount, K1());
            F1();
            c5Var.f(starGift4, false, false, P1);
            sz0 sz0Var = this.f14093e0;
            sz0Var.removeAllViews();
            SpannableString spannableString = "";
            if (z14) {
                if (savedStarGift.gift_num != 0 && (starGift3 = savedStarGift.gift) != null && starGift3.title != null) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(savedStarGift.gift.title);
                    sb.append(" #");
                    j10 = clientUserId;
                    string4 = l.d.l(savedStarGift.gift_num, ',', sb);
                } else {
                    j10 = clientUserId;
                    string4 = LocaleController.getString(R.string.Gift2TitleSaved);
                }
                this.P0 = string4;
                if (z13) {
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
                c5Var.i(0, string4, replaceTags, f2(savedStarGift.gift));
            } else {
                j10 = clientUserId;
                if (z4 && !this.f14120y0) {
                    String string5 = LocaleController.getString(R.string.Gift2TitleProfile);
                    this.P0 = string5;
                    c5Var.i(0, string5, null, e2(savedStarGift.gift.released_by));
                } else {
                    boolean z15 = this.f14120y0;
                    if ((!z15 || savedStarGift.can_upgrade) && savedStarGift.upgrade_stars > 0) {
                        if (z15) {
                            i10 = R.string.Gift2TitleReceived;
                        } else {
                            i10 = R.string.Gift2TitleProfile;
                        }
                        String string6 = LocaleController.getString(i10);
                        this.P0 = string6;
                        if (z13 || !this.f14120y0) {
                            string = null;
                        } else {
                            string = LocaleController.getString(R.string.Gift2InfoInFreeUpgrade);
                        }
                        c5Var.i(0, string6, string, f2(savedStarGift.gift));
                    } else {
                        if (savedStarGift.gift_num != 0 && (starGift = savedStarGift.gift) != null && starGift.title != null) {
                            StringBuilder sb2 = new StringBuilder();
                            sb2.append(savedStarGift.gift.title);
                            sb2.append(" #");
                            string2 = l.d.l(savedStarGift.gift_num, ',', sb2);
                        } else {
                            if (z15) {
                                i11 = R.string.Gift2TitleReceived;
                            } else {
                                i11 = R.string.Gift2TitleProfile;
                            }
                            string2 = LocaleController.getString(i11);
                        }
                        this.P0 = string2;
                        if (z13 || !this.f14120y0) {
                            i12 = 0;
                            charSequence = null;
                        } else {
                            if (!isBot && s1()) {
                                if (this.f14120y0) {
                                    if (currentTime <= 0) {
                                        if (z4) {
                                            str = "Gift2Info2ChannelExpired";
                                        } else {
                                            str = "Gift2Info2Expired";
                                        }
                                    } else if (z4) {
                                        str = "Gift2Info3Channel";
                                    } else {
                                        str = "Gift2Info3";
                                    }
                                    formatString = LocaleController.formatPluralStringComma(str, (int) savedStarGift.convert_stars);
                                } else {
                                    formatString = LocaleController.formatPluralStringComma("Gift2Info2Out", (int) savedStarGift.convert_stars, shortName);
                                }
                            } else if (this.f14120y0) {
                                if (savedStarGift.unsaved) {
                                    if (z4) {
                                        i14 = R.string.Gift2Info2ChannelKeep;
                                    } else {
                                        i14 = R.string.Gift2Info2BotKeep;
                                    }
                                } else if (z4) {
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
                            if (!isBot && s1()) {
                                charSequence2 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2More).replace(' ', (char) 160), new s1(this, 1)), true);
                            } else {
                                charSequence2 = spannableString;
                            }
                            i12 = 0;
                            charSequence = TextUtils.concat(replaceTags2, " ", charSequence2);
                        }
                        c5Var.i(i12, string2, charSequence, f2(savedStarGift.gift));
                    }
                }
            }
            if (j10 != peerDialogId || z4) {
                TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerDialogId));
                String string7 = LocaleController.getString(R.string.Gift2From);
                int i22 = this.currentAccount;
                t1 t1Var = new t1(this, peerDialogId, 1);
                if (peerDialogId != j10 && peerDialogId != 2666000 && !isBot && !UserObject.isDeleted(user) && !z4) {
                    str2 = LocaleController.getString(R.string.Gift2ButtonSendGift);
                } else {
                    str2 = null;
                }
                this.f14093e0.j(string7, i22, peerDialogId, t1Var, str2, new t1(this, peerDialogId, 2));
            }
            sz0Var.c(LocaleController.getString(R.string.StarsTransactionDate), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(savedStarGift.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(savedStarGift.date * 1000))), null, null);
            String string8 = LocaleController.getString(R.string.Gift2Value);
            String l10 = l.d.l(savedStarGift.gift.stars + savedStarGift.upgrade_stars, ',', new StringBuilder("⭐️ "));
            if (s1() && !z13) {
                r12 = 0;
                spannableString = tc.b(LocaleController.formatPluralStringComma("Gift2ButtonSell", (int) savedStarGift.convert_stars), new s1(this, 4), this.resourcesProvider, null);
            } else {
                r12 = 0;
            }
            sz0Var.c(string8, ja.X0(false, TextUtils.concat(l10, " ", spannableString), 0.8f, r12), r12, r12);
            TL_stars.StarGift starGift5 = savedStarGift.gift;
            if (starGift5.limited && !z13) {
                ja.F0(sz0Var, this.currentAccount, starGift5, this.resourcesProvider);
            }
            TLRPC.TL_textWithEntities tL_textWithEntities2 = savedStarGift.message;
            if (tL_textWithEntities2 != null && !TextUtils.isEmpty(tL_textWithEntities2.text) && !z13) {
                TLRPC.TL_textWithEntities tL_textWithEntities3 = savedStarGift.message;
                sz0Var.b(tL_textWithEntities3.text, tL_textWithEntities3.entities);
            }
            boolean z16 = this.f14120y0;
            qh.d dVar = this.f14097g0;
            if (z16 && savedStarGift.can_upgrade) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("^  ");
                if (this.X0 == null) {
                    i16 = 0;
                    this.X0 = new oq(0, new d5(dVar, org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Oh, this.resourcesProvider)));
                } else {
                    i16 = 0;
                }
                spannableStringBuilder.setSpan(this.X0, i16, 1, 33);
                if (savedStarGift.upgrade_stars > 0) {
                    string3 = LocaleController.getString(R.string.Gift2UpgradeButtonFree);
                } else {
                    string3 = LocaleController.getString(R.string.Gift2UpgradeButtonGift);
                }
                spannableStringBuilder.append((CharSequence) string3);
                dVar.setFilled(true);
                dVar.g(spannableStringBuilder, !this.Y0, true);
                dVar.f(null, !this.Y0);
                dVar.setOnClickListener(new k1(this, 3));
            } else if (this.f14109n0 && z16 && this.W != null && this.A0 != null && G1() >= 0 && this.A0.b(G1()) >= 0) {
                dVar.setFilled(false);
                int b10 = this.A0.b(G1());
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.Gift2UpgradeNext));
                Object obj = this.A0.get(b10);
                if ((obj instanceof TL_stars.SavedStarGift) && (starGift2 = ((TL_stars.SavedStarGift) obj).gift) != null && (document = starGift2.getDocument()) != null) {
                    spannableStringBuilder2.append((CharSequence) " e");
                    r122 = 1;
                    spannableStringBuilder2.setSpan(new org.telegram.ui.Components.u5(document, dVar.getTextPaint().getFontMetricsInt()), spannableStringBuilder2.length() - 1, spannableStringBuilder2.length(), 33);
                } else {
                    r122 = 1;
                }
                dVar.g(spannableStringBuilder2, (this.Y0 ? 1 : 0) ^ r122, r122);
                dVar.f(null, (this.Y0 ? 1 : 0) ^ r122);
                dVar.setOnClickListener(new w1(this, b10, r122));
            } else if ((savedStarGift.gift instanceof TL_stars.TL_starGift) && !TextUtils.isEmpty(savedStarGift.prepaid_upgrade_hash)) {
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("^  ");
                if (this.X0 == null) {
                    i15 = 0;
                    this.X0 = new oq(0, new d5(dVar, org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Oh, this.resourcesProvider)));
                } else {
                    i15 = 0;
                }
                spannableStringBuilder3.setSpan(this.X0, i15, 1, 33);
                spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2GiftAnUpgrade));
                dVar.setFilled(true);
                dVar.g(spannableStringBuilder3, !this.Y0, true);
                dVar.f(null, !this.Y0);
                dVar.setOnClickListener(new k1(this, 5));
            } else {
                dVar.setFilled(true);
                dVar.g(LocaleController.getString(R.string.OK), !this.Y0, true);
                dVar.f(null, !this.Y0);
                dVar.setOnClickListener(new k1(this, 6));
            }
            str3 = null;
            str4 = null;
            z11 = false;
        }
        boolean z17 = savedStarGift.refunded;
        g90 g90Var = this.f14091d0;
        if (z17) {
            g90Var.setVisibility(0);
            g90Var.setText(LocaleController.getString(R.string.Gift2Refunded));
            g90Var.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21897q7, this.resourcesProvider));
        } else if (z11 && !TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
            g90Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2InBlockchain), new u2(this, str4, 1)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            g90Var.setVisibility(0);
            g90Var.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21895q5, this.resourcesProvider));
        } else if (TextUtils.isEmpty(str3) && TextUtils.isEmpty(str4) && this.f14120y0 && (savedStarGift.gift instanceof TL_stars.TL_starGift) && savedStarGift.name_hidden) {
            g90Var.setVisibility(0);
            if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
                i17 = R.string.Gift2InSenderMessageHidden2;
            } else {
                i17 = R.string.Gift2InSenderHidden2;
            }
            g90Var.setText(LocaleController.getString(i17));
            g90Var.setTextColor(org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.f21895q5, this.resourcesProvider));
        } else {
            g90Var.setVisibility(8);
        }
        g90 g90Var2 = this.f14095f0;
        if (!z11 && !TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
            g90Var2.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2InBlockchain), new u2(this, str4, 2)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            r13 = 0;
            g90Var2.setVisibility(0);
        } else if (this.f14120y0 && N1(this.currentAccount, j11)) {
            if (i21 >= 0) {
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                if (savedStarGift.unsaved) {
                    spannableStringBuilder4.append((CharSequence) ". ");
                    spannableStringBuilder4.setSpan(new oq(R.drawable.mini_gift_hidden, 0), 0, 1, 33);
                }
                if (!savedStarGift.unsaved) {
                    i19 = R.string.Gift2ProfileVisible4;
                } else {
                    i19 = R.string.Gift2ProfileInvisible4;
                }
                spannableStringBuilder4.append((CharSequence) AndroidUtilities.replaceSingleTag(LocaleController.getString(i19), new s1(this, 3)));
                g90Var2.setText(AndroidUtilities.replaceArrows(spannableStringBuilder4, true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            } else {
                if (!savedStarGift.unsaved) {
                    i18 = R.string.Gift2ChannelProfileVisible3;
                } else {
                    i18 = R.string.Gift2ChannelProfileInvisible3;
                }
                g90Var2.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(i18), new s1(this, 3)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            }
            r13 = 0;
            g90Var2.setVisibility(0);
        } else {
            r13 = 0;
            g90Var2.setVisibility(8);
        }
        if (this.Y0) {
            q2(r13, r13, null);
            this.f31014c.n0(1);
            this.Y0 = r13;
        }
        this.f31015e.setTitle(this.P0);
        t2();
    }

    public final void k2(org.telegram.tgnet.tl.TL_stars.TL_starGiftUnique r42, boolean r43, org.telegram.tgnet.TLObject r44, org.telegram.tgnet.TLRPC.TL_textWithEntities r45) {
        throw new UnsupportedOperationException("Method not decompiled: mh.g5.k2(org.telegram.tgnet.tl.TL_stars$TL_starGiftUnique, boolean, org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_textWithEntities):void");
    }

    public final void l2(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        mf.a resellAmount = tL_starGiftUnique.getResellAmount(mf.b.f13653a);
        boolean z4 = tL_starGiftUnique.resale_ton_only;
        qh.d dVar = this.f14097g0;
        if (z4) {
            dVar.g(ja.S0(LocaleController.formatString(R.string.ResellGiftBuyTON, tL_starGiftUnique.getResellAmount(mf.b.f13654b).d()), true), !this.Y0, true);
            dVar.f(ja.Q0(LocaleController.formatPluralStringComma("ResellGiftBuyEq", (int) resellAmount.a())), !this.Y0);
            return;
        }
        dVar.g(ja.Q0(LocaleController.formatPluralStringComma("ResellGiftBuy", (int) resellAmount.a())), !this.Y0, true);
        dVar.f(null, !this.Y0);
    }

    public final void m2() {
        TL_stars.TL_starGiftUnique K1 = K1();
        if (K1 == null) {
            return;
        }
        TLRPC.Peer peer = K1.owner_id;
        if (peer == null) {
            peer = K1.host_id;
        }
        long peerDialogId = DialogObject.getPeerDialogId(peer);
        StringBuilder sb = new StringBuilder();
        sb.append(K1.title);
        sb.append(" #");
        this.f14118w0.setText(LocaleController.formatString(R.string.Gift2WearTitle, l.d.l(K1.num, ',', sb)));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.Gift2WearStart));
        if (peerDialogId == UserConfig.getInstance(this.currentAccount).getClientUserId() && !UserConfig.getInstance(this.currentAccount).isPremium()) {
            spannableStringBuilder.append((CharSequence) " l");
            if (this.R0 == null) {
                this.R0 = new oq(R.drawable.msg_mini_lock3, 0);
            }
            spannableStringBuilder.setSpan(this.R0, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        qh.d dVar = this.f14097g0;
        dVar.g(spannableStringBuilder, true, true);
        dVar.f(null, true);
        dVar.setOnClickListener(new k1(this, 21));
        this.f14087b0.setWearPreview(MessagesController.getInstance(this.currentAccount).getUserOrChat(peerDialogId));
        q2(2, false, null);
        this.f14116u0 = true;
    }

    public final void n2(CharSequence charSequence) {
        TL_stars.TL_starGiftUnique K1 = K1();
        TL_stars.InputSavedStarGift E1 = E1();
        if (E1 != null && K1 != null) {
            TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails = new TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails();
            tL_inputInvoiceStarGiftDropOriginalDetails.stargift = E1;
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftDropOriginalDetails;
            JSONObject p10 = sh.p2.p(this.resourcesProvider, false);
            if (p10 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = p10.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getPaymentForm, new lh.b1(this, charSequence, K1, tL_inputInvoiceStarGiftDropOriginalDetails, 1));
        }
    }

    public final void o2(View view, CharSequence charSequence, boolean z4) {
        Layout layout;
        float primaryHorizontal;
        int i10;
        qh.e3 e3Var = this.l1;
        if ((e3Var == null || !e3Var.S || this.f14108m1 != view) && view != null) {
            if (z4) {
                if (view instanceof org.telegram.ui.ActionBar.l5) {
                    org.telegram.ui.ActionBar.l5 l5Var = (org.telegram.ui.ActionBar.l5) view;
                    primaryHorizontal = (l5Var.getRightDrawableWidth() / 2.0f) + l5Var.getRightDrawableX();
                } else {
                    return;
                }
            } else {
                if (view instanceof TextView) {
                    layout = ((TextView) view).getLayout();
                } else if (view instanceof org.telegram.ui.ActionBar.l5) {
                    layout = ((org.telegram.ui.ActionBar.l5) view).getLayout();
                } else {
                    return;
                }
                if (layout != null) {
                    CharSequence text = layout.getText();
                    if (text instanceof Spanned) {
                        Spanned spanned = (Spanned) text;
                        tc[] tcVarArr = (tc[]) spanned.getSpans(0, spanned.length(), tc.class);
                        if (tcVarArr != null && tcVarArr.length > 0) {
                            tc tcVar = tcVarArr[tcVarArr.length - 1];
                            primaryHorizontal = layout.getPrimaryHorizontal(spanned.getSpanStart(tcVar)) + view.getPaddingLeft() + (tcVar.a() / 2.0f);
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
            eg.q1 q1Var = this.V;
            q1Var.getLocationOnScreen(iArr);
            int[] iArr2 = {iArr2[0] - iArr[0], iArr2[1] - iArr[1]};
            qh.e3 e3Var2 = this.l1;
            if (e3Var2 != null) {
                e3Var2.e(true);
                this.l1 = null;
            }
            qh.e3 e3Var3 = new qh.e3(getContext(), 3);
            e3Var3.p(!z4);
            e3Var3.s(charSequence);
            e3Var3.m(0.0f, (iArr2[0] + primaryHorizontal) - (AndroidUtilities.dp(16.0f) + this.backgroundPaddingLeft));
            float dp = (iArr2[1] - AndroidUtilities.dp(100.0f)) - (view.getHeight() / 2.0f);
            if (z4) {
                i10 = 18;
            } else {
                i10 = 0;
            }
            e3Var3.setTranslationY(dp + AndroidUtilities.dp(i10 + 4.33f));
            e3Var3.d = 3000L;
            e3Var3.setPadding(AndroidUtilities.dp(16.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(16.0f) + this.backgroundPaddingLeft, 0);
            e3Var3.f45272i0 = new lh.w(e3Var3, 1);
            e3Var3.u();
            q1Var.addView(e3Var3, k7.c6.c(100.0f, -1));
            this.l1 = e3Var3;
            this.f14108m1 = view;
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starUserGiftsLoaded);
    }

    @Override
    public final void onBackPressed() {
        c5 c5Var;
        f4 f4Var;
        if (this.V0.c(4) && (c5Var = this.f14087b0) != null && (f4Var = c5Var.I) != null) {
            if (f4Var.f14024e0) {
                return;
            }
            if (f4Var.f14026f0) {
                super.onBackPressed();
                return;
            }
        }
        if (!this.f14116u0 && this.V0.f2266b > 0 && !this.f14097g0.K && !this.f14092d1) {
            MessageObject messageObject = this.B0;
            if (messageObject != null) {
                i2(messageObject, null);
            } else {
                TL_stars.SavedStarGift savedStarGift = this.f14121z0;
                if (savedStarGift != null) {
                    j2(savedStarGift, this.A0);
                } else {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = this.D0;
                    if (tL_starGiftUnique != null) {
                        h2(this.C0, tL_starGiftUnique, this.A0);
                    }
                }
            }
            q2(0, true, null);
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
        qh.e3 e3Var = this.l1;
        if (e3Var != null) {
            e3Var.e(true);
            this.l1 = null;
        }
    }

    public final void p1(TL_stars.StarGiftAttribute starGiftAttribute) {
        String string;
        char c3;
        r4 r4Var;
        TL_stars.StarGiftAttribute starGiftAttribute2;
        g5 g5Var;
        androidx.car.app.utils.c cVar;
        if (starGiftAttribute instanceof TL_stars.starGiftAttributeModel) {
            string = LocaleController.getString(R.string.Gift2AttributeModel);
            c3 = 2;
        } else if (starGiftAttribute instanceof TL_stars.starGiftAttributePattern) {
            string = LocaleController.getString(R.string.Gift2AttributeSymbol);
            c3 = 1;
        } else if (starGiftAttribute instanceof TL_stars.starGiftAttributeBackdrop) {
            string = LocaleController.getString(R.string.Gift2AttributeBackdrop);
            c3 = 0;
        } else {
            return;
        }
        if (!this.K0 && ((r4Var = this.J0) == null || !r4Var.f14683o)) {
            boolean[] zArr = new boolean[1];
            sc[] scVarArr = new sc[1];
            Integer[] numArr = new Integer[1];
            String J1 = J1(starGiftAttribute.rarity, numArr);
            if (starGiftAttribute.rarity instanceof TL_stars.TL_starGiftAttributeRarity) {
                starGiftAttribute2 = starGiftAttribute;
                cVar = new androidx.car.app.utils.c(this, zArr, starGiftAttribute2, scVarArr, 7);
                g5Var = this;
            } else {
                starGiftAttribute2 = starGiftAttribute;
                g5Var = this;
                cVar = null;
            }
            scVarArr[0] = (sc) ((pz0) g5Var.f14093e0.e(string, starGiftAttribute2.name, J1, cVar, numArr[0]).getChildAt(1)).getChildAt(0);
            return;
        }
        w4 w4Var = new w4(getContext(), this.resourcesProvider, new n1(this, 0));
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        sz0 sz0Var = this.f14093e0;
        tableRow.addView(new rz0(sz0Var, string), layoutParams);
        tableRow.addView(new pz0(sz0Var, w4Var, true), new TableRow.LayoutParams(0, -1, 1.0f));
        sz0Var.addView(tableRow);
        r4 r4Var2 = this.J0;
        if (r4Var2 != null) {
            if (c3 == 0) {
                r4Var2.d = w4Var;
            }
            if (c3 == 1) {
                r4Var2.f14673c = w4Var;
            }
            if (c3 == 2) {
                r4Var2.f14672b = w4Var;
            }
        }
    }

    public final void p2(int i10, Context context, boolean z4) {
        int i11;
        int i12;
        LinearLayout f10 = org.telegram.messenger.y3.f(context, 1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackground(org.telegram.ui.ActionBar.k6.K(AndroidUtilities.dp(64.0f), org.telegram.ui.ActionBar.k6.v0(org.telegram.ui.ActionBar.k6.Oh, this.resourcesProvider)));
        f10.addView(frameLayout, k7.c6.t(64, 64, 49, 0, 6, 0, 0));
        ?? imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.f(R.raw.timer_3, 42, 42, null);
        frameLayout.addView((View) imageView, k7.c6.q(64, 64, 17));
        imageView.d();
        TextView b10 = k7.g6.b(context, 20.0f, org.telegram.ui.ActionBar.k6.G6, true, null);
        b10.setGravity(17);
        if (z4) {
            i11 = R.string.Gift2ResellTimeoutTitle;
        } else {
            i11 = R.string.Gift2TransferTimeoutTitle;
        }
        b10.setText(LocaleController.getString(i11));
        f10.addView(b10, k7.c6.t(-1, -2, 48, 24, 14, 24, 0));
        TextView b11 = k7.g6.b(context, 14.0f, org.telegram.ui.ActionBar.k6.F6, false, null);
        b11.setGravity(17);
        if (z4) {
            i12 = R.string.Gift2ResellTimeout;
        } else {
            i12 = R.string.Gift2TransferTimeout;
        }
        b11.setText(LocaleController.formatString(i12, LocaleController.formatTTLString(Math.max(10, i10))));
        f10.addView(b11, k7.c6.t(-1, -2, 48, 24, 6, 24, 6));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, this.resourcesProvider);
        alertDialog$Builder.n(f10);
        l.d.C(R.string.OK, alertDialog$Builder, null);
    }

    public final void q2(int r12, boolean r13, kh.f r14) {
        throw new UnsupportedOperationException("Method not decompiled: mh.g5.q2(int, boolean, kh.f):void");
    }

    public final void r1(TL_stars.InputSavedStarGift inputSavedStarGift, TLRPC.Updates updates, Runnable runnable) {
        TLRPC.Message message;
        TL_stars.StarGift starGift;
        if (updates == null) {
            t7.y(this.currentAccount, false).Q(A1());
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
            TL_stars.SavedStarGift savedStarGift = this.f14121z0;
            if (savedStarGift != null && (!(inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftUser) ? !(!(inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftChat) ? !(inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftSlug) || (starGift = savedStarGift.gift) == null || !TextUtils.equals(starGift.slug, ((TL_stars.TL_inputSavedStarGiftSlug) inputSavedStarGift).slug) : savedStarGift.saved_id != ((TL_stars.TL_inputSavedStarGiftChat) inputSavedStarGift).saved_id) : savedStarGift.msg_id == ((TL_stars.TL_inputSavedStarGiftUser) inputSavedStarGift).msg_id)) {
                TLRPC.MessageAction messageAction = message.action;
                if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                    this.K0 = true;
                    TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                    TL_stars.SavedStarGift savedStarGift2 = this.f14121z0;
                    savedStarGift2.gift = tL_messageActionStarGiftUnique.gift;
                    savedStarGift2.msg_id = message.f20866id;
                    savedStarGift2.flags = (savedStarGift2.flags | 8) & (-2049);
                    savedStarGift2.saved_id = 0L;
                    savedStarGift2.unsaved = !tL_messageActionStarGiftUnique.saved;
                    savedStarGift2.refunded = tL_messageActionStarGiftUnique.refunded;
                    savedStarGift2.can_upgrade = false;
                    savedStarGift2.can_resell_at = tL_messageActionStarGiftUnique.can_resell_at;
                    savedStarGift2.can_transfer_at = tL_messageActionStarGiftUnique.can_transfer_at;
                    savedStarGift2.can_export_at = tL_messageActionStarGiftUnique.can_export_at;
                    j2(savedStarGift2, this.A0);
                    this.f14094e1 = null;
                    this.K0 = false;
                    m7 m7Var = this.A0;
                    if (m7Var != null) {
                        m7Var.d();
                    } else {
                        t7.y(this.currentAccount, false).Q(this.U);
                    }
                    AndroidUtilities.runOnUIThread(runnable);
                    return;
                }
            }
            if (this.A0 == null) {
                t7.y(this.currentAccount, false).Q(A1());
            }
            this.K0 = true;
            this.f14121z0 = null;
            this.f14120y0 = false;
            MessageObject messageObject = new MessageObject(this.currentAccount, message, false, false);
            messageObject.setType();
            i2(messageObject, this.A0);
            this.f14094e1 = null;
            this.K0 = false;
            AndroidUtilities.runOnUIThread(runnable);
            return;
        }
        t7.y(this.currentAccount, false).Q(A1());
        dismiss();
    }

    public final void r2(boolean z4) {
        int i10;
        int i11;
        TL_stars.TL_starGiftUnique K1 = K1();
        if (K1 == null) {
            return;
        }
        MessagesController.getGlobalMainSettings().edit().putInt("statusgiftpage", 3).apply();
        boolean P1 = P1(this.currentAccount, K1());
        boolean z10 = !P1;
        boolean P12 = P1(this.currentAccount, K1());
        qh.d dVar = this.f14097g0;
        if (P12) {
            MessagesController.getInstance(this.currentAccount).updateEmojiStatus(A1(), new TLRPC.TL_emojiStatusEmpty(), null);
        } else {
            final long A1 = A1();
            if (A1 >= 0) {
                if (!UserConfig.getInstance(this.currentAccount).isPremium()) {
                    ic P = getBulletinFactory().P(R.raw.star_premium_2, AndroidUtilities.premiumText(LocaleController.getString(R.string.Gift2ActionWearNeededPremium), new s1(this, 24)));
                    P.f27788t = true;
                    P.j();
                    return;
                }
            } else if (!z4) {
                final MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
                dVar.setLoading(true);
                MessagesController.getInstance(this.currentAccount).getBoostsController().getBoostsStats(A1, new h5.d() {
                    @Override
                    public final void accept(Object obj) {
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                        g5 g5Var = g5.this;
                        if (tL_premium_boostsStatus != null) {
                            int i12 = tL_premium_boostsStatus.level;
                            MessagesController messagesController2 = messagesController;
                            if (i12 < messagesController2.channelEmojiStatusLevelMin) {
                                ChannelBoostsController boostsController = messagesController2.getBoostsController();
                                long j10 = A1;
                                boostsController.userCanBoostChannel(j10, tL_premium_boostsStatus, new v1(g5Var, tL_premium_boostsStatus, j10, messagesController2, 0));
                                return;
                            }
                        }
                        g5Var.f14097g0.setLoading(false);
                        g5Var.r2(true);
                    }
                });
                return;
            }
            TLRPC.TL_inputEmojiStatusCollectible tL_inputEmojiStatusCollectible = new TLRPC.TL_inputEmojiStatusCollectible();
            tL_inputEmojiStatusCollectible.collectible_id = K1.f21072id;
            MessagesController.getInstance(this.currentAccount).updateEmojiStatus(A1(), tL_inputEmojiStatusCollectible, K1);
        }
        ag.l lVar = this.f14087b0.F[1];
        if (!P1) {
            i10 = R.drawable.filled_crown_off;
        } else {
            i10 = R.drawable.filled_crown_on;
        }
        if (!P1) {
            i11 = R.string.Gift2ActionWearOff;
        } else {
            i11 = R.string.Gift2ActionWear;
        }
        lVar.b(i10, LocaleController.getString(i11), true);
        if (this.f14116u0) {
            dismiss();
            return;
        }
        kh.f fVar = new kh.f(3, this, z10);
        if (this.V0.c(0)) {
            fVar.run();
        } else {
            q2(0, true, fVar);
        }
        dVar.g(LocaleController.getString(R.string.OK), !this.Y0, true);
        dVar.f(null, !this.Y0);
        dVar.setOnClickListener(new k1(this, 0));
    }

    public final boolean s1() {
        int i10;
        boolean z4;
        boolean z10;
        TLRPC.Peer peer;
        if (E1() == null) {
            return false;
        }
        MessageObject messageObject = this.B0;
        if (messageObject != null) {
            TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                if (tL_messageActionStarGift.peer != null) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                boolean isOutOwner = messageObject.isOutOwner();
                if (this.B0.getDialogId() == UserConfig.getInstance(this.currentAccount).getClientUserId()) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                int currentTime = MessagesController.getInstance(this.currentAccount).stargiftsConvertPeriodMax - (ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() - this.B0.messageOwner.date);
                if (((z4 || (isOutOwner && !z10)) && ((peer = tL_messageActionStarGift.peer) == null || !O1(this.currentAccount, DialogObject.getPeerDialogId(peer)))) || tL_messageActionStarGift.converted || tL_messageActionStarGift.convert_stars <= 0 || currentTime <= 0) {
                    return false;
                }
                return true;
            }
        } else {
            TL_stars.SavedStarGift savedStarGift = this.f14121z0;
            if (savedStarGift != null) {
                int currentTime2 = MessagesController.getInstance(this.currentAccount).stargiftsConvertPeriodMax - (ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() - savedStarGift.date);
                int i11 = this.currentAccount;
                long j10 = this.U;
                if (O1(i11, j10)) {
                    int i12 = this.f14121z0.flags;
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

    public final void s2() {
        FrameLayout frameLayout = this.f14103j0;
        int visibility = frameLayout.getVisibility();
        FrameLayout frameLayout2 = this.f14107l0;
        FrameLayout frameLayout3 = this.f14099h0;
        if (visibility == 0) {
            frameLayout3.setTranslationY(this.V0.a(1) * (-frameLayout.getMeasuredHeight()));
            frameLayout.setTranslationY((1.0f - this.V0.a(1)) * frameLayout.getMeasuredHeight());
            frameLayout2.setTranslationY(this.V0.a(1) * (-frameLayout.getMeasuredHeight()));
            return;
        }
        frameLayout3.setTranslationY(0.0f);
        frameLayout.setTranslationY(0.0f);
        frameLayout2.setTranslationY(0.0f);
    }

    @Override
    public final void show() {
        MessageObject messageObject;
        TLRPC.Message message;
        if (MessagesController.getInstance(this.currentAccount).isFrozen()) {
            org.telegram.ui.c.b(this.currentAccount);
            return;
        }
        if (this.C0 != null && this.D0 == null) {
            org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(getContext(), 3, null);
            d2Var.q(500L);
            TL_stars.getUniqueStarGift getuniquestargift = new TL_stars.getUniqueStarGift();
            getuniquestargift.slug = this.C0;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(getuniquestargift, new eg.b3(8, this, d2Var));
        } else if (this.f14121z0 == null && (messageObject = this.B0) != null && (message = messageObject.messageOwner) != null) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                if (tL_messageActionStarGift.upgraded) {
                    if (tL_messageActionStarGift.upgrade_msg_id != 0) {
                        org.telegram.ui.ActionBar.d2 d2Var2 = new org.telegram.ui.ActionBar.d2(getContext(), 3, null);
                        d2Var2.q(500L);
                        TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
                        tL_messages_getMessages.f20939id.add(Integer.valueOf(tL_messageActionStarGift.upgrade_msg_id));
                        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getMessages, new hg.y(this, tL_messageActionStarGift, d2Var2, 7));
                        return;
                    } else if (E1() != null) {
                        org.telegram.ui.ActionBar.d2 d2Var3 = new org.telegram.ui.ActionBar.d2(getContext(), 3, null);
                        d2Var3.q(500L);
                        t7.y(this.currentAccount, false).M(E1(), new lh.a1(5, this, d2Var3));
                        return;
                    }
                }
            }
        }
        super.show();
    }

    public final boolean t1() {
        int i10;
        TL_stars.TL_starGiftUnique K1 = K1();
        if (K1 == null || K1.crafted || !O1(this.currentAccount, DialogObject.getPeerDialogId(K1.owner_id))) {
            return false;
        }
        MessageObject messageObject = this.B0;
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
            TL_stars.SavedStarGift savedStarGift = this.f14121z0;
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

    public final void t2() {
        boolean L1 = L1(false);
        o3 o3Var = this.W;
        o3Var.setPosition(L1 ? 1 : 0);
        o3Var.C(false);
        if (this.A0 != null && !L1(true) && this.A0.e() < this.A0.c()) {
            this.A0.a();
        }
    }

    public final void u1() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
        alertDialog$Builder.f21168a.O = LocaleController.getString(R.string.Gift2CantDoTitle);
        alertDialog$Builder.f21168a.Q = LocaleController.getString(R.string.Gift2CantDoText);
        TL_stars.TL_starGiftUnique K1 = K1();
        if (K1 != null && !TextUtils.isEmpty(K1.slug)) {
            alertDialog$Builder.k(LocaleController.getString(R.string.OpenFragment), new b3(this, K1, 1));
        }
        l.d.u(R.string.Cancel, alertDialog$Builder, null);
    }

    @Override
    public final rl0 v(sl0 sl0Var) {
        fg.g gVar = new fg.g(this, 1);
        this.N0 = gVar;
        return gVar;
    }

    public final void v1(final long j10, final Utilities.Callback callback) {
        TLRPC.Message message;
        long peerDialogId;
        long j11;
        TL_stars.InputSavedStarGift E1 = E1();
        if (E1 != null) {
            TL_stars.SavedStarGift savedStarGift = this.f14121z0;
            if (savedStarGift != null && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
                j11 = savedStarGift.transfer_stars;
                peerDialogId = this.U;
            } else {
                MessageObject messageObject = this.B0;
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
                transferstargift.stargift = E1;
                transferstargift.to_id = MessagesController.getInstance(this.currentAccount).getInputPeer(j10);
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(transferstargift, new a2(this, callback, j10, peerDialogId, 0));
                return;
            }
            final long j12 = peerDialogId;
            t7 y10 = t7.y(this.currentAccount, false);
            if (!y10.f14833e) {
                y10.r(new b2(this, y10, j10, callback, 0));
                return;
            }
            final TLRPC.TL_inputInvoiceStarGiftTransfer tL_inputInvoiceStarGiftTransfer = new TLRPC.TL_inputInvoiceStarGiftTransfer();
            tL_inputInvoiceStarGiftTransfer.stargift = E1;
            tL_inputInvoiceStarGiftTransfer.to_id = MessagesController.getInstance(this.currentAccount).getInputPeer(j10);
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftTransfer;
            JSONObject p10 = sh.p2.p(this.resourcesProvider, false);
            if (p10 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = p10.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getPaymentForm, new RequestDelegate() {
                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    final g5 g5Var = g5.this;
                    final TLRPC.TL_inputInvoiceStarGiftTransfer tL_inputInvoiceStarGiftTransfer2 = tL_inputInvoiceStarGiftTransfer;
                    final long j13 = j10;
                    final long j14 = j12;
                    final Utilities.Callback callback2 = callback;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            g5.G0(g5.this, tLObject, tL_inputInvoiceStarGiftTransfer2, j13, j14, callback2, tL_error);
                        }
                    });
                }
            });
        }
    }

    public final void w1() {
        TL_stars.InputSavedStarGift E1;
        long j10;
        qh.d dVar = this.f14097g0;
        if (!dVar.K && (E1 = E1()) != null) {
            MessageObject messageObject = this.B0;
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
                TL_stars.SavedStarGift savedStarGift = this.f14121z0;
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
            if (i10 > 0 || this.f14102i1 != null) {
                dVar.setLoading(true);
                np npVar = this.f14114s0;
                if (i10 > 0) {
                    TL_stars.upgradeStarGift upgradestargift = new TL_stars.upgradeStarGift();
                    upgradestargift.keep_original_details = npVar.f29560a.f24811q;
                    upgradestargift.stargift = E1;
                    ConnectionsManager.getInstance(this.currentAccount).sendRequest(upgradestargift, new eg.b3(7, this, E1));
                    return;
                }
                int i11 = 0;
                t7 y10 = t7.y(this.currentAccount, false);
                if (!y10.f14833e) {
                    y10.r(new m2(0, this, y10));
                    return;
                }
                TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
                tL_payments_sendStarsForm.form_id = this.f14102i1.form_id;
                if (!TextUtils.isEmpty(str)) {
                    TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade tL_inputInvoiceStarGiftPrepaidUpgrade = new TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade();
                    tL_inputInvoiceStarGiftPrepaidUpgrade.hash = str;
                    tL_inputInvoiceStarGiftPrepaidUpgrade.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.U);
                    tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftPrepaidUpgrade;
                } else {
                    TLRPC.TL_inputInvoiceStarGiftUpgrade tL_inputInvoiceStarGiftUpgrade = new TLRPC.TL_inputInvoiceStarGiftUpgrade();
                    tL_inputInvoiceStarGiftUpgrade.keep_original_details = npVar.f29560a.f24811q;
                    tL_inputInvoiceStarGiftUpgrade.stargift = E1;
                    tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftUpgrade;
                }
                ArrayList<TLRPC.TL_labeledPrice> arrayList = this.f14102i1.invoice.prices;
                int size = arrayList.size();
                while (i11 < size) {
                    TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i11);
                    i11++;
                    j11 += tL_labeledPrice.amount;
                }
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_sendStarsForm, new u(this, str, E1, j11, 1));
            }
        }
    }

    @Override
    public final int x() {
        return AndroidUtilities.dp(12.0f);
    }

    @Override
    public final CharSequence y() {
        return this.P0;
    }

    public final int z1() {
        if (this.V0.d(1)) {
            return this.f14110o0.getMeasuredHeight();
        }
        if (this.V0.d(2)) {
            return this.f14117v0.getMeasuredHeight();
        }
        if (this.V0.d(3)) {
            return this.f14119x0.getMeasuredHeight();
        }
        if (this.V0.d(4)) {
            return 0;
        }
        return this.f14089c0.getMeasuredHeight();
    }
}
