package jh;

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
import nh.gb;
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
import org.telegram.ui.Components.ez0;
import org.telegram.ui.Components.fz0;
import org.telegram.ui.Components.gz0;
import org.telegram.ui.Components.hp;
import org.telegram.ui.Components.hz0;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.iq;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.n00;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.vc;
import org.telegram.ui.Components.wc;
import org.telegram.ui.Components.y80;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.fy;
import org.telegram.ui.t91;
import org.telegram.ui.tn;
public class h5 extends org.telegram.ui.Components.xa implements NotificationCenter.NotificationCenterDelegate {
    public static final int f12162m1 = 0;
    public MessageObject A0;
    public String B0;
    public TL_stars.TL_starGiftUnique C0;
    public boolean D0;
    public boolean E0;
    public boolean F0;
    public boolean G0;
    public boolean H0;
    public s4 I0;
    public boolean J0;
    public s3 K0;
    public final int[] L0;
    public cg.g M0;
    public int N0;
    public String O0;
    public ih.p5 P0;
    public iq Q0;
    public boolean R0;
    public k3 S0;
    public final long T;
    public Float T0;
    public final bg.u1 U;
    public a5.d U0;
    public final p3 V;
    public ValueAnimator V0;
    public final n00 W;
    public iq W0;
    public ih.m3 X;
    public boolean X0;
    public ih.m3 Y;
    public View Y0;
    public final r3 Z;
    public ih.a3 Z0;
    public final d5 f12163a0;
    public boolean f12164a1;
    public final q3 f12165b0;
    public Boolean f12166b1;
    public final y80 f12167c0;
    public boolean f12168c1;
    public final hz0 f12169d0;
    public ArrayList f12170d1;
    public final y80 f12171e0;
    public ArrayList f12172e1;
    public final nh.d f12173f0;
    public ArrayList f12174f1;
    public final FrameLayout f12175g0;
    public boolean f12176g1;
    public final y80 f12177h0;
    public TLRPC.PaymentForm f12178h1;
    public final FrameLayout f12179i0;
    public final iq[] f12180i1;
    public final View f12181j0;
    public final t1 f12182j1;
    public final FrameLayout f12183k0;
    public nh.t3 f12184k1;
    public f5 f12185l0;
    public View l1;
    public boolean m0;
    public final q3 f12186n0;
    public final ph.i[] f12187o0;
    public final View f12188p0;
    public final LinearLayout f12189q0;
    public final hp f12190r0;
    public final TextView f12191s0;
    public boolean f12192t0;
    public final q3 f12193u0;
    public final TextView f12194v0;
    public final q3 f12195w0;
    public boolean f12196x0;
    public TL_stars.SavedStarGift f12197y0;
    public l7 f12198z0;

    public h5(Context context, int i10, long j10, org.telegram.ui.ActionBar.c6 c6Var, View view) {
        super(context, null, false, false, false, 1, c6Var);
        this.m0 = false;
        this.L0 = new int[2];
        this.N0 = -1;
        this.O0 = "";
        this.U0 = new a5.d(0, 0);
        this.X0 = true;
        this.f12180i1 = new iq[1];
        this.f12182j1 = new t1(this, 7);
        this.currentAccount = i10;
        this.T = j10;
        this.v = Math.max(0.05f, AndroidUtilities.dp(82.0f) / (AndroidUtilities.displaySize.y + AndroidUtilities.statusBarHeight));
        this.occupyNavigationBar = true;
        this.containerView = new bg.x2(this, context, 7);
        bg.u1 u1Var = new bg.u1(this, context);
        this.U = u1Var;
        p3 p3Var = new p3(this, context);
        this.V = p3Var;
        p3Var.setAdapter(new eg.v(this, context, 1));
        t2();
        View view2 = new View(context);
        int i11 = org.telegram.ui.ActionBar.g6.f23133h5;
        view2.setBackgroundColor(getThemedColor(i11));
        this.containerView.addView(view2, i7.f6.e(-1, 50, 80));
        this.containerView.addView(p3Var, i7.f6.e(-1, -1, 119));
        fixNavigationBar(getThemedColor(i11));
        AndroidUtilities.removeFromParent(this.d);
        u1Var.addView(this.d, i7.f6.e(-1, -1, 119));
        q3 q3Var = new q3(this, context, 0);
        this.f12165b0 = q3Var;
        q3Var.setOrientation(1);
        q3Var.setPadding(AndroidUtilities.dp(14.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(14.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(68.0f));
        u1Var.addView(q3Var, i7.f6.e(-1, -1, 55));
        y80 y80Var = new y80(context, c6Var);
        this.f12167c0 = y80Var;
        int i12 = org.telegram.ui.ActionBar.g6.f23294q5;
        y80Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i12, c6Var));
        y80Var.setTextSize(1, 12.0f);
        y80Var.setGravity(17);
        y80Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        y80Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.gc, c6Var));
        y80Var.setDisablePaddingsOffsetY(true);
        q3Var.addView(y80Var, i7.f6.t(-2, -2, 1, 4, -2, 4, 16));
        y80Var.setVisibility(8);
        hz0 hz0Var = new hz0(context, c6Var);
        this.f12169d0 = hz0Var;
        q3Var.addView(hz0Var, i7.f6.k(0.0f, 0.0f, 0.0f, 12.0f, -1, -2));
        y80 y80Var2 = new y80(context, c6Var);
        this.f12171e0 = y80Var2;
        y80Var2.setTextColor(org.telegram.ui.ActionBar.g6.v0(i12, c6Var));
        y80Var2.setTextSize(1, 12.0f);
        y80Var2.setGravity(17);
        y80Var2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        int i13 = org.telegram.ui.ActionBar.g6.Oh;
        y80Var2.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(i13, c6Var));
        y80Var2.setDisablePaddingsOffsetY(true);
        y80Var2.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), 0);
        q3Var.addView(y80Var2, i7.f6.t(-2, -2, 1, 4, 2, 4, 8));
        y80Var2.setVisibility(8);
        q3 q3Var2 = new q3(this, context, 1);
        this.f12186n0 = q3Var2;
        q3Var2.setOrientation(1);
        q3Var2.setPadding(AndroidUtilities.dp(4.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(4.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(66.0f));
        u1Var.addView(q3Var2, i7.f6.e(-1, -1, 55));
        this.f12187o0 = r5;
        ph.i iVar = new ph.i(context, c6Var, false);
        iVar.a(LocaleController.getString(R.string.Gift2UpgradeFeature1Title), LocaleController.getString(R.string.GiftsFeature1Text), R.drawable.menu_feature_unique);
        q3Var2.addView(r5[0], i7.f6.n(-1, -2));
        ph.i iVar2 = new ph.i(context, c6Var, false);
        iVar2.a(LocaleController.getString(R.string.Gift2UpgradeFeature3Title), LocaleController.getString(R.string.GiftsFeature2Text), R.drawable.menu_feature_tradable);
        q3Var2.addView(r5[1], i7.f6.n(-1, -2));
        ph.i iVar3 = new ph.i(context, c6Var, false);
        ph.i[] iVarArr = {iVar, iVar2, iVar3};
        iVar3.a(LocaleController.getString(R.string.GiftsFeature3Title), LocaleController.getString(R.string.GiftsFeature3Text), R.drawable.menu_wear);
        q3Var2.addView(iVarArr[2], i7.f6.n(-1, -2));
        View view3 = new View(context);
        this.f12188p0 = view3;
        int i14 = org.telegram.ui.ActionBar.g6.f23063d7;
        view3.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(i14, c6Var));
        q3Var2.addView(view3, i7.f6.s(-2, 7, 17, -4, 17, 1.0f / AndroidUtilities.density, 6));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f12189q0 = linearLayout;
        linearLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        linearLayout.setOrientation(0);
        linearLayout.setBackground(org.telegram.ui.ActionBar.g6.Y(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23152i6, c6Var), 6, 6));
        hp hpVar = new hp(context, 24, c6Var);
        this.f12190r0 = hpVar;
        hpVar.b(org.telegram.ui.ActionBar.g6.f23135h7, org.telegram.ui.ActionBar.g6.f23171j7, org.telegram.ui.ActionBar.g6.f23190k7);
        hpVar.setDrawUnchecked(true);
        hpVar.a(false, false);
        hpVar.setDrawBackgroundAsArc(10);
        linearLayout.addView(hpVar, i7.f6.t(26, 26, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.f12191s0 = textView;
        int i15 = org.telegram.ui.ActionBar.g6.f23169j5;
        textView.setTextColor(getThemedColor(i15));
        textView.setTextSize(1, 14.0f);
        textView.setText(LocaleController.getString(R.string.Gift2AddSenderName));
        linearLayout.addView(textView, i7.f6.t(-2, -2, 16, 9, 0, 0, 0));
        q3Var2.addView(linearLayout, i7.f6.t(-2, -2, 1, 0, 0, 0, 4));
        i7.h6.b(linearLayout, 0.025f, 1.5f);
        q3 q3Var3 = new q3(this, context, 2);
        this.f12193u0 = q3Var3;
        q3Var3.setOrientation(1);
        q3Var3.setPadding(AndroidUtilities.dp(4.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(4.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(66.0f));
        u1Var.addView(q3Var3, i7.f6.e(-1, -1, 55));
        TextView textView2 = new TextView(context);
        this.f12194v0 = textView2;
        org.telegram.ui.b.m(i15, c6Var, textView2, 1, 20.0f);
        textView2.setGravity(17);
        textView2.setTypeface(AndroidUtilities.bold());
        q3Var3.addView(textView2, i7.f6.t(-1, -2, 7, 20, 0, 20, 0));
        TextView textView3 = new TextView(context);
        org.telegram.ui.b.m(i15, c6Var, textView3, 1, 14.0f);
        textView3.setGravity(17);
        textView3.setText(LocaleController.getString(R.string.Gift2WearSubtitle));
        q3Var3.addView(textView3, i7.f6.t(-1, -2, 7, 20, 6, 20, 24));
        ph.i iVar4 = new ph.i(context, c6Var, false);
        iVar4.a(LocaleController.getString(R.string.Gift2WearFeature1Title), LocaleController.getString(R.string.Gift2WearFeature1Text), R.drawable.menu_feature_unique);
        q3Var3.addView(r7[0], i7.f6.n(-1, -2));
        ph.i iVar5 = new ph.i(context, c6Var, false);
        iVar5.a(LocaleController.getString(R.string.Gift2WearFeature2Title), LocaleController.getString(R.string.Gift2WearFeature2Text), R.drawable.menu_feature_cover);
        q3Var3.addView(r7[1], i7.f6.n(-1, -2));
        ph.i iVar6 = new ph.i(context, c6Var, false);
        ph.i[] iVarArr2 = {iVar4, iVar5, iVar6};
        iVar6.a(LocaleController.getString(R.string.Gift2WearFeature3Title), LocaleController.getString(R.string.Gift2WearFeature3Text), R.drawable.menu_verification);
        q3Var3.addView(iVarArr2[2], i7.f6.n(-1, -2));
        q3 q3Var4 = new q3(this, context, 3);
        this.f12195w0 = q3Var4;
        q3Var4.setOrientation(1);
        q3Var4.setPadding(AndroidUtilities.dp(4.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(92.0f));
        u1Var.addView(q3Var4, i7.f6.e(-1, -1, 55));
        ph.i iVar7 = new ph.i(context, c6Var, false);
        iVar7.a(LocaleController.getString(R.string.GiftCraftInfoFeature1Title), LocaleController.getString(R.string.GiftCraftInfoFeature1Text), R.drawable.menu_feature_unique);
        q3Var4.addView(r9[0], i7.f6.n(-1, -2));
        ph.i iVar8 = new ph.i(context, c6Var, false);
        iVar8.a(LocaleController.getString(R.string.GiftCraftInfoFeature2Title), LocaleController.getString(R.string.GiftCraftInfoFeature2Text), R.drawable.menu_random);
        q3Var4.addView(r9[1], i7.f6.n(-1, -2));
        ph.i iVar9 = new ph.i(context, c6Var, false);
        ph.i[] iVarArr3 = {iVar7, iVar8, iVar9};
        iVar9.a(LocaleController.getString(R.string.GiftCraftInfoFeature3Title), LocaleController.getString(R.string.GiftCraftInfoFeature3Text), R.drawable.menu_feature_affect);
        q3Var4.addView(iVarArr3[2], i7.f6.n(-1, -2));
        q3Var.setAlpha(1.0f);
        q3Var2.setAlpha(0.0f);
        q3Var3.setAlpha(0.0f);
        q3Var4.setAlpha(0.0f);
        d5 d5Var = new d5(context, c6Var, new t1(this, 9), new l1(this, 13), new l1(this, 14), new l1(this, 15), new l1(this, 16), new l1(this, 17), new l1(this, 18), new l1(this, 19));
        this.f12163a0 = d5Var;
        d5Var.H.f12102c.setOnClickListener(new l1(this, 20));
        int i16 = this.backgroundPaddingLeft;
        d5Var.setPadding(i16, 0, i16, 0);
        u1Var.addView(d5Var, i7.f6.e(-1, -2, 55));
        org.telegram.ui.k kVar = this.f34659c;
        this.M = true;
        kVar.k1(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f12175g0 = frameLayout;
        frameLayout.setBackgroundColor(getThemedColor(i11));
        View view4 = new View(context);
        this.f12181j0 = view4;
        view4.setBackgroundColor(getThemedColor(i14));
        view4.setAlpha(0.0f);
        frameLayout.addView(view4, i7.f6.a(-1.0f, 1.0f / AndroidUtilities.density, 55));
        nh.d o10 = org.telegram.messenger.x3.o(24, context, c6Var, true);
        this.f12173f0 = o10;
        o10.g(LocaleController.getString(R.string.OK), false, true);
        o10.f(null, false);
        FrameLayout.LayoutParams d = i7.f6.d(-1, 48.0f, 119, 0.0f, 12.0f, 0.0f, 12.0f);
        d.leftMargin = AndroidUtilities.dp(14.0f) + this.backgroundPaddingLeft;
        d.rightMargin = AndroidUtilities.dp(14.0f) + this.backgroundPaddingLeft;
        frameLayout.addView(o10, d);
        u1Var.addView(frameLayout, i7.f6.e(-1, 72, 87));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f12179i0 = frameLayout2;
        frameLayout2.setBackgroundColor(getThemedColor(i11));
        y80 y80Var3 = new y80(context, null);
        this.f12177h0 = y80Var3;
        y80Var3.setTextSize(1, 12.0f);
        y80Var3.setTextColor(org.telegram.ui.ActionBar.g6.v0(i13, c6Var));
        y80Var3.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(i13, c6Var));
        y80Var3.setGravity(17);
        frameLayout2.addView(y80Var3, i7.f6.d(-1, -2.0f, 17, 16.0f, 8.0f, 16.0f, 14.0f));
        u1Var.addView(frameLayout2, i7.f6.e(-1, -2, 87));
        frameLayout2.setVisibility(8);
        this.d.setOnScrollListener(new cg.g2(this, 8));
        linearLayout.setOnClickListener(new l1(this, 12));
        n00 n00Var = new n00(context);
        this.W = n00Var;
        u1Var.addView(n00Var, i7.f6.c(-1.0f, -1));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f12183k0 = frameLayout3;
        frameLayout3.setPadding(AndroidUtilities.dp(6.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(6.0f) + this.backgroundPaddingLeft, 0);
        u1Var.addView(frameLayout3, i7.f6.d(-1, 200.0f, 87, 0.0f, 0.0f, 0.0f, 60.0f));
        AndroidUtilities.removeFromParent(this.f34660e);
        u1Var.addView(this.f34660e, i7.f6.d(-1, -2.0f, 0, 6.0f, 0.0f, 6.0f, 0.0f));
        r3 r3Var = new r3(context);
        this.Z = r3Var;
        u1Var.addView(r3Var, i7.f6.e(-1, -2, 55));
        ArrayList arrayList = new ArrayList();
        if (view != null) {
            arrayList.add(view);
        }
        AndroidUtilities.makeGlobalBlurBitmap(new ag.i0(r3Var, 20), 12.0f, 12, null, arrayList);
    }

    public static void A0(h5 h5Var, long j10) {
        new ih.h2(h5Var.getContext(), h5Var.currentAccount, j10, null, new y2(h5Var, 2)).show();
    }

    public static void B0(h5 h5Var, ye.c cVar, org.telegram.ui.ActionBar.c2 c2Var, TLObject tLObject, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.TL_error tL_error, long j10, CharSequence charSequence) {
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
            TL_stars.SavedStarGift savedStarGift = h5Var.f12197y0;
            if (savedStarGift != null) {
                z10 = savedStarGift.refunded;
            }
            h5Var.k2(tL_starGiftUnique, z10, null, null);
            AndroidUtilities.runOnUIThread(new w2(2, h5Var, tL_starGiftUnique));
        } else if (tL_error != null && "BALANCE_TOO_LOW".equalsIgnoreCase(tL_error.text)) {
            new y9(h5Var.getContext(), h5Var.resourcesProvider, j10, 16, null, new w2(4, h5Var, charSequence), 0L).show();
        } else if (tL_error != null) {
            h5Var.getBulletinFactory().d0(tL_error, false);
        }
    }

    public static void C0(h5 h5Var, String str) {
        Context context = h5Var.getContext();
        ye.d.u(context, MessagesController.getInstance(h5Var.currentAccount).tonBlockchainExplorerUrl + str);
    }

    public static void D0(h5 h5Var, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, long j10, MessagesController messagesController, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        h5Var.f12173f0.setLoading(false);
        cg.z1 z1Var = new cg.z1(h5Var, 3);
        cg.v0 v0Var = new cg.v0(26, h5Var.currentAccount, h5Var.getContext(), z1Var, h5Var.resourcesProvider);
        v0Var.G1(canApplyBoost);
        v0Var.F1(tL_premium_boostsStatus, true);
        v0Var.H1(j10);
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(-j10));
        if (chat != null) {
            v0Var.M0 = new eg.i(h5Var, chat);
        }
        v0Var.show();
    }

    public static String D1(TL_stars.StarGift starGift) {
        if (starGift instanceof TL_stars.TL_starGiftUnique) {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(tL_starGiftUnique.title);
            sb2.append(" #");
            return j7.l1.m(tL_starGiftUnique.num, ',', sb2);
        } else if ((starGift instanceof TL_stars.TL_starGift) && !TextUtils.isEmpty(starGift.title)) {
            return starGift.title;
        } else {
            return LocaleController.getString(R.string.Gift2Gift);
        }
    }

    public static void E0(h5 h5Var, int i10, int i11, int i12, TL_stars.TL_starGiftUnique tL_starGiftUnique, eg.w2[] w2VarArr, Long l10) {
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        if (l10.longValue() == -99) {
            if (i10 < i11) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(h5Var.getContext(), 0, h5Var.resourcesProvider);
                String string = LocaleController.getString(R.string.Gift2ExportTONUnlocksAlertTitle);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
                c2Var.N = string;
                c2Var.P = LocaleController.formatPluralString("Gift2ExportTONUnlocksAlertText", Math.max(1, i12), new Object[0]);
                j7.l1.C(R.string.OK, alertDialog$Builder, null);
                return;
            }
            LinearLayout linearLayout = new LinearLayout(h5Var.getContext());
            linearLayout.setOrientation(1);
            linearLayout.addView(new i4(h5Var.getContext(), tL_starGiftUnique), i7.f6.t(-1, -2, 48, 0, -4, 0, 0));
            TextView textView = new TextView(h5Var.getContext());
            int i13 = org.telegram.ui.ActionBar.g6.f23169j5;
            org.telegram.ui.b.w(i13, h5Var.resourcesProvider, textView, 1, 20.0f);
            textView.setText(LocaleController.getString(R.string.Gift2ExportTONFragmentTitle));
            linearLayout.addView(textView, i7.f6.t(-1, -2, 48, 24, 4, 24, 14));
            TextView textView2 = new TextView(h5Var.getContext());
            org.telegram.ui.b.m(i13, h5Var.resourcesProvider, textView2, 1, 16.0f);
            org.telegram.ui.b.p(R.string.Gift2ExportTONFragmentText, new Object[]{h5Var.C1()}, textView2);
            linearLayout.addView(textView2, i7.f6.t(-1, -2, 48, 24, 0, 24, 4));
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(h5Var.getContext(), 0, h5Var.resourcesProvider);
            alertDialog$Builder2.n(linearLayout);
            alertDialog$Builder2.k(LocaleController.getString(R.string.Gift2ExportTONFragmentOpen), new a9.s(25, h5Var, w2VarArr));
            j7.l1.u(R.string.Cancel, alertDialog$Builder2, null);
            return;
        }
        androidx.car.app.utils.b bVar = new androidx.car.app.utils.b(h5Var, l10, w2VarArr, 19);
        if (l10.longValue() < 0) {
            TLRPC.ChatFull chatFull = MessagesController.getInstance(h5Var.currentAccount).getChatFull(-l10.longValue());
            if (chatFull == null) {
                TLRPC.TL_channels_getFullChannel tL_channels_getFullChannel = new TLRPC.TL_channels_getFullChannel();
                tL_channels_getFullChannel.channel = MessagesController.getInstance(h5Var.currentAccount).getInputChannel(-l10.longValue());
                ConnectionsManager.getInstance(h5Var.currentAccount).sendRequest(tL_channels_getFullChannel, new bg.h3(6, h5Var, bVar));
                return;
            } else if (!chatFull.stargifts_available) {
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(h5Var.getContext(), 0, h5Var.resourcesProvider);
                String string2 = LocaleController.getString(R.string.Gift2ChannelDoesntSupportGiftsTitle);
                org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder3.f22714a;
                c2Var2.N = string2;
                c2Var2.P = LocaleController.getString(R.string.Gift2ChannelDoesntSupportGiftsText);
                j7.l1.C(R.string.OK, alertDialog$Builder3, null);
                return;
            }
        } else if (l10.longValue() >= 0) {
            TLRPC.User user = MessagesController.getInstance(h5Var.currentAccount).getUser(l10);
            TLRPC.UserFull userFull = MessagesController.getInstance(h5Var.currentAccount).getUserFull(l10.longValue());
            if (userFull != null && (disallowedGiftsSettings = userFull.disallowed_stargifts) != null && disallowedGiftsSettings.disallow_unique_stargifts) {
                new tc(w2VarArr[0].container, h5Var.resourcesProvider).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(l10.longValue())))).j();
                return;
            } else if (userFull == null && user != null) {
                TLRPC.TL_users_getFullUser tL_users_getFullUser = new TLRPC.TL_users_getFullUser();
                tL_users_getFullUser.f22532id = MessagesController.getInstance(h5Var.currentAccount).getInputUser(user);
                ConnectionsManager.getInstance(h5Var.currentAccount).sendRequest(tL_users_getFullUser, new ih.c1(h5Var, w2VarArr, l10, bVar, 2));
                return;
            }
        }
        bVar.run();
    }

    public static void G0(h5 h5Var, TLObject tLObject, TLRPC.TL_inputInvoiceStarGiftTransfer tL_inputInvoiceStarGiftTransfer, long j10, long j11, Utilities.Callback callback, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            int i10 = 0;
            MessagesController.getInstance(h5Var.currentAccount).putUsers(paymentForm.users, false);
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
            ConnectionsManager.getInstance(h5Var.currentAccount).sendRequest(tL_payments_sendStarsForm, new y1(h5Var, j10, j11, callback, j12));
            return;
        }
        callback.run(tL_error);
        mc Y = h5Var.getBulletinFactory().Y(tL_error);
        Y.f30662t = true;
        Y.j();
    }

    public static void H0(h5 h5Var, org.telegram.ui.ActionBar.c2 c2Var, TLObject tLObject, long j10, long j11, long j12, TLRPC.TL_error tL_error) {
        c2Var.c(400L);
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        if (U == null) {
            return;
        }
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            h5Var.dismiss();
            s7.y(h5Var.currentAccount, false).Q(j10);
            if (j10 >= 0) {
                TLRPC.UserFull userFull = MessagesController.getInstance(h5Var.currentAccount).getUserFull(j11);
                if (userFull != null) {
                    int max = Math.max(0, userFull.stargifts_count - 1);
                    userFull.stargifts_count = max;
                    if (max <= 0) {
                        userFull.flags2 &= -257;
                    }
                }
                s7.y(h5Var.currentAccount, false).P();
                s7.y(h5Var.currentAccount, false).T(true);
                if (!(U instanceof ia)) {
                    ia iaVar = new ia();
                    iaVar.whenFullyVisible(new eg.z1(iaVar, j12, 1));
                    U.presentFragment(iaVar);
                    return;
                }
                tc.a0(U).M(LocaleController.getString(R.string.Gift2ConvertedTitle), LocaleController.formatPluralStringComma("Gift2Converted", (int) j12), R.raw.stars_topup).k(true);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -j10);
            bundle.putBoolean("start_from_monetization", true);
            t91 t91Var = new t91(bundle);
            b0.g(h5Var.currentAccount).h(j10, true);
            b0.g(h5Var.currentAccount).l(j10);
            t91Var.whenFullyVisible(new eg.z1(t91Var, j12, 2));
            U.presentFragment(t91Var);
        } else if (tL_error != null) {
            h5Var.getBulletinFactory().t(LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text), null).k(false);
        } else {
            h5Var.getBulletinFactory().t(LocaleController.getString(R.string.UnknownError), null).k(false);
        }
    }

    public static void I0(h5 h5Var, TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift) {
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) tL_payments_uniqueStarGift.gift;
        h5Var.C0 = tL_starGiftUnique;
        h5Var.k2(tL_starGiftUnique, false, null, null);
        super.show();
    }

    public static void J0(final long j10, final long j11, final h5 h5Var, final Utilities.Callback callback, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(h5Var.currentAccount).processUpdates((TLRPC.Updates) tLObject, false);
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                h5.S(j10, j11, h5Var, callback, tLObject, tL_error);
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
            return ph.j.G0(i10);
        } else {
            return "";
        }
    }

    public static void L0(h5 h5Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.PaymentForm paymentForm, TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails, long j10, CharSequence charSequence, org.telegram.ui.ActionBar.c2 c2Var) {
        ye.c g10 = c2Var.g(-1, true, true);
        g10.d();
        TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
        tL_payments_sendStarsForm.form_id = paymentForm.form_id;
        tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftDropOriginalDetails;
        ConnectionsManager.getInstance(h5Var.currentAccount).sendRequest(tL_payments_sendStarsForm, new x2(h5Var, g10, c2Var, tL_starGiftUnique, j10, charSequence));
    }

    public static void M0(h5 h5Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, kf.a aVar, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(h5Var.currentAccount).processUpdates((TLRPC.Updates) tLObject, false);
            AndroidUtilities.runOnUIThread(new i2(h5Var, tL_starGiftUnique, aVar, runnable, 1));
        } else if (tL_error != null) {
            AndroidUtilities.runOnUIThread(new j2(h5Var, tL_error, runnable, 1));
        }
    }

    public static void N0(h5 h5Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, org.telegram.ui.ActionBar.c2 c2Var) {
        h5Var.getClass();
        ye.c g10 = c2Var.g(-1, true, true);
        g10.d();
        TL_stars.updateStarGiftPrice updatestargiftprice = new TL_stars.updateStarGiftPrice();
        updatestargiftprice.stargift = h5Var.E1();
        updatestargiftprice.resell_amount = TL_stars.StarsAmount.ofStars(0L);
        ConnectionsManager.getInstance(h5Var.currentAccount).sendRequest(updatestargiftprice, new eg.z(h5Var, g10, tL_starGiftUnique, 6));
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

    public static void O0(h5 h5Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, kf.a aVar, Runnable runnable) {
        TL_stars.StarsAmount o10 = aVar.o();
        TL_stars.updateStarGiftPrice updatestargiftprice = new TL_stars.updateStarGiftPrice();
        updatestargiftprice.stargift = h5Var.E1();
        updatestargiftprice.resell_amount = o10;
        ConnectionsManager.getInstance(h5Var.currentAccount).sendRequest(updatestargiftprice, new r1(h5Var, tL_starGiftUnique, aVar, runnable, 0));
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

    public static void P(h5 h5Var, long j10) {
        new ih.h2(h5Var.getContext(), h5Var.currentAccount, j10, null, new y2(h5Var, 2)).show();
    }

    public static void P0(h5 h5Var, long j10) {
        new ih.h2(h5Var.getContext(), h5Var.currentAccount, j10, null, new y2(h5Var, 2)).show();
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
                if (!(emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) || ((TLRPC.TL_emojiStatusCollectible) emojiStatus).collectible_id != tL_starGiftUnique.f22619id) {
                    return false;
                }
                return true;
            }
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-peerDialogId));
            if (chat != null) {
                TLRPC.EmojiStatus emojiStatus2 = chat.emoji_status;
                if ((emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible) && ((TLRPC.TL_emojiStatusCollectible) emojiStatus2).collectible_id == tL_starGiftUnique.f22619id) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void Q(h5 h5Var, String str) {
        Context context = h5Var.getContext();
        ye.d.u(context, MessagesController.getInstance(h5Var.currentAccount).tonBlockchainExplorerUrl + str);
    }

    public static void Q0(h5 h5Var, String str) {
        Context context = h5Var.getContext();
        ye.d.u(context, MessagesController.getInstance(h5Var.currentAccount).tonBlockchainExplorerUrl + str);
    }

    public static void R(h5 h5Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z10, ih.v0 v0Var, j4 j4Var, ye.c cVar) {
        cVar.d();
        s7.x(h5Var.currentAccount, j4Var.f12313a).h(j4Var.f12314b, tL_starGiftUnique, j10, tL_textWithEntities, z10, new t2(h5Var, cVar, tL_starGiftUnique, j10, v0Var, 0));
    }

    public static void R0(h5 h5Var, TLObject tLObject, androidx.car.app.utils.b bVar, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.TL_messages_chatFull) {
            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject;
            MessagesController.getInstance(h5Var.currentAccount).putUsers(tL_messages_chatFull.users, false);
            MessagesController.getInstance(h5Var.currentAccount).putChats(tL_messages_chatFull.chats, false);
            MessagesController.getInstance(h5Var.currentAccount).putChatFull(tL_messages_chatFull.full_chat);
            if (!tL_messages_chatFull.full_chat.stargifts_available) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(h5Var.getContext(), 0, h5Var.resourcesProvider);
                alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.Gift2ChannelDoesntSupportGiftsTitle);
                alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.Gift2ChannelDoesntSupportGiftsText);
                j7.l1.C(R.string.OK, alertDialog$Builder, null);
                return;
            }
            bVar.run();
            return;
        }
        mc Y = h5Var.getBulletinFactory().Y(tL_error);
        Y.f30662t = true;
        Y.j();
    }

    public static void S(long j10, long j11, h5 h5Var, Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error) {
        long j12;
        h5 h5Var2;
        callback.run(tL_error);
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        if (U != null) {
            if (tLObject instanceof TLRPC.Updates) {
                if (j10 >= 0 && j11 >= 0) {
                    tn R9 = tn.R9(j10);
                    j12 = j10;
                    h5Var2 = h5Var;
                    R9.whenFullyVisible(new r2(h5Var2, R9, j12, 0));
                    U.presentFragment(R9);
                } else {
                    j12 = j10;
                    h5Var2 = h5Var;
                    mc M = tc.a0(U).M(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, h5Var2.C1(), DialogObject.getShortName(j12))), R.raw.forward);
                    M.f30662t = true;
                    M.j();
                }
            } else {
                j12 = j10;
                h5Var2 = h5Var;
                tc.a0(U).d0(tL_error, false);
            }
        } else {
            j12 = j10;
            h5Var2 = h5Var;
        }
        s7.y(h5Var2.currentAccount, false).Q(j12);
        s7.y(h5Var2.currentAccount, false).Q(j11);
    }

    public static void S0(h5 h5Var, MessageObject messageObject, ArrayList arrayList, TL_stars.StarGift starGift) {
        h5Var.f12164a1 = true;
        h5Var.i2(messageObject, null);
        h5Var.q2(0, true, null);
        n00 n00Var = h5Var.W;
        if (n00Var != null) {
            n00Var.c(true);
        }
        s7.y(h5Var.currentAccount, false).P();
        k7 G = s7.y(h5Var.currentAccount, false).G(UserConfig.getInstance(h5Var.currentAccount).getClientUserId(), false);
        if (G != null) {
            G.j(arrayList, starGift);
        }
    }

    public static void T(h5 h5Var, org.telegram.ui.ActionBar.c2 c2Var, MessageObject messageObject) {
        c2Var.dismiss();
        h5Var.F0 = true;
        h5Var.i2(messageObject, null);
        super.show();
    }

    public static void T0(jh.h5 r9, android.view.View r10) {
        throw new UnsupportedOperationException("Method not decompiled: jh.h5.T0(jh.h5, android.view.View):void");
    }

    public static void U(h5 h5Var, int i10, TLObject tLObject) {
        MessageObject messageObject;
        if (tLObject instanceof TLRPC.messages_Messages) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            for (int i11 = 0; i11 < messages_messages.messages.size(); i11++) {
                TLRPC.Message message = messages_messages.messages.get(i11);
                if (message != null && message.f22413id == i10) {
                    TLRPC.MessageAction messageAction = message.action;
                    if ((messageAction instanceof TLRPC.TL_messageActionStarGift) || (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                        messageObject = new MessageObject(h5Var.currentAccount, message, false, false);
                        messageObject.setType();
                        break;
                    }
                }
            }
        }
        messageObject = null;
        if (messageObject != null) {
            AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b(h5Var, tLObject, messageObject, 20));
        }
    }

    public static void U0(h5 h5Var, Long l10) {
        String str;
        String formatString;
        TLRPC.Chat chat;
        if (l10.longValue() < 0 && (chat = MessagesController.getInstance(h5Var.currentAccount).getChat(Long.valueOf(-l10.longValue()))) != null) {
            str = chat.title;
        } else {
            str = "";
        }
        tc bulletinFactory = h5Var.getBulletinFactory();
        int i10 = R.raw.contact_check;
        if (TextUtils.isEmpty(str)) {
            formatString = LocaleController.getString(R.string.GiftRepostedToProfile);
        } else {
            formatString = LocaleController.formatString(R.string.GiftRepostedToChannelProfile, str);
        }
        mc Q = bulletinFactory.Q(i10, 36, AndroidUtilities.replaceTags(formatString));
        Q.f30662t = true;
        Q.j();
    }

    public static void V(h5 h5Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, final String str) {
        final long j10 = tL_starGiftUnique.gift_id;
        final String str2 = tL_starGiftUnique.title;
        final String C1 = h5Var.C1();
        final TLRPC.Document document = tL_starGiftUnique.getDocument();
        String str3 = tL_starGiftUnique.slug;
        final org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(ApplicationLoader.applicationContext, 3, null);
        c2Var.q(500L);
        TL_stars.getUniqueStarGiftValueInfo getuniquestargiftvalueinfo = new TL_stars.getUniqueStarGiftValueInfo();
        getuniquestargiftvalueinfo.slug = str3;
        ConnectionsManager.getInstance(h5Var.currentAccount).sendRequest(getuniquestargiftvalueinfo, new RequestDelegate() {
            @Override
            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                final h5 h5Var2 = h5.this;
                final org.telegram.ui.ActionBar.c2 c2Var2 = c2Var;
                final TLRPC.Document document2 = document;
                final String str4 = str;
                final String str5 = str2;
                final String str6 = C1;
                final long j11 = j10;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        h5.Z0(h5.this, c2Var2, tLObject, document2, str4, str5, str6, j11, tL_error);
                    }
                });
            }
        });
    }

    public static void V0(h5 h5Var, org.telegram.ui.ActionBar.c2 c2Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TL_stars.TL_payments_uniqueStarGift) {
            TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift = (TL_stars.TL_payments_uniqueStarGift) tLObject;
            MessagesController.getInstance(h5Var.currentAccount).putUsers(tL_payments_uniqueStarGift.users, false);
            MessagesController.getInstance(h5Var.currentAccount).putChats(tL_payments_uniqueStarGift.chats, false);
            if (tL_payments_uniqueStarGift.gift instanceof TL_stars.TL_starGiftUnique) {
                AndroidUtilities.runOnUIThread(new w2(5, h5Var, tL_payments_uniqueStarGift));
                return;
            }
        }
        AndroidUtilities.runOnUIThread(new w2(6, c2Var, tL_error));
    }

    public static void W(h5 h5Var) {
        boolean z10;
        TLRPC.Document document;
        boolean z11;
        i7 F;
        TLRPC.Message message;
        nh.d dVar = h5Var.f12173f0;
        if (!dVar.J) {
            TL_stars.InputSavedStarGift E1 = h5Var.E1();
            MessageObject messageObject = h5Var.A0;
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
                TL_stars.SavedStarGift savedStarGift = h5Var.f12197y0;
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
            savestargift.stargift = E1;
            if (h5Var.f12197y0 != null && (F = s7.y(h5Var.currentAccount, false).F(h5Var.T, false)) != null) {
                F.m(h5Var.f12197y0, savestargift.unsave);
                z11 = true;
            } else {
                z11 = false;
            }
            ConnectionsManager.getInstance(h5Var.currentAccount).sendRequest(savestargift, new hh.j(h5Var, z11, document2, z12, savestargift));
        }
    }

    public static void W0(h5 h5Var, TLRPC.TL_error tL_error, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity) {
        int i10;
        int i11;
        int dp;
        int i12;
        int i13;
        int dp2;
        int i14;
        int i15;
        if (h5Var.getContext() != null) {
            if (tL_error != null) {
                if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
                    if ("SRP_ID_INVALID".equals(tL_error.text)) {
                        ConnectionsManager.getInstance(h5Var.currentAccount).sendRequest(new TL_account.getPassword(), new s2(h5Var, twoStepVerificationActivity, 1), 8);
                        return;
                    }
                    twoStepVerificationActivity.o0();
                    twoStepVerificationActivity.finishFragment();
                    tc.b0(tL_error);
                    return;
                }
                twoStepVerificationActivity.o0();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(h5Var.getContext());
                alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.Gift2TransferToTONAlertTitle);
                LinearLayout linearLayout = new LinearLayout(h5Var.getContext());
                linearLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(24.0f), 0);
                linearLayout.setOrientation(1);
                alertDialog$Builder.n(linearLayout);
                TextView textView = new TextView(h5Var.getContext());
                int i16 = org.telegram.ui.ActionBar.g6.f23169j5;
                textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i16, false));
                textView.setTextSize(1, 16.0f);
                if (LocaleController.isRTL) {
                    i10 = 5;
                } else {
                    i10 = 3;
                }
                textView.setGravity(i10 | 48);
                textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2TransferToTONAlertText)));
                linearLayout.addView(textView, i7.f6.n(-1, -2));
                LinearLayout linearLayout2 = new LinearLayout(h5Var.getContext());
                linearLayout2.setOrientation(0);
                linearLayout.addView(linearLayout2, i7.f6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                ImageView imageView = new ImageView(h5Var.getContext());
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
                int w02 = org.telegram.ui.ActionBar.g6.w0(null, i16, false);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
                TextView textView2 = new TextView(h5Var.getContext());
                textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i16, false));
                textView2.setTextSize(1, 16.0f);
                if (LocaleController.isRTL) {
                    i12 = 5;
                } else {
                    i12 = 3;
                }
                textView2.setGravity(i12 | 48);
                org.telegram.messenger.x3.r(R.string.Gift2TransferToTONAlertText1, textView2);
                if (LocaleController.isRTL) {
                    linearLayout2.addView(textView2, i7.f6.n(-1, -2));
                    linearLayout2.addView(imageView, i7.f6.q(-2, -2, 5));
                } else {
                    linearLayout2.addView(imageView, i7.f6.n(-2, -2));
                    linearLayout2.addView(textView2, i7.f6.n(-1, -2));
                }
                LinearLayout linearLayout3 = new LinearLayout(h5Var.getContext());
                linearLayout3.setOrientation(0);
                linearLayout.addView(linearLayout3, i7.f6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                ImageView imageView2 = new ImageView(h5Var.getContext());
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
                imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, i16, false), mode));
                TextView textView3 = new TextView(h5Var.getContext());
                textView3.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i16, false));
                textView3.setTextSize(1, 16.0f);
                if (LocaleController.isRTL) {
                    i14 = 5;
                } else {
                    i14 = 3;
                }
                textView3.setGravity(i14 | 48);
                org.telegram.messenger.x3.r(R.string.Gift2TransferToTONAlertText2, textView3);
                if (LocaleController.isRTL) {
                    linearLayout3.addView(textView3, i7.f6.n(-1, -2));
                    i15 = 5;
                    linearLayout3.addView(imageView2, i7.f6.q(-2, -2, 5));
                } else {
                    i15 = 5;
                    linearLayout3.addView(imageView2, i7.f6.n(-2, -2));
                    linearLayout3.addView(textView3, i7.f6.n(-1, -2));
                }
                if ("PASSWORD_MISSING".equals(tL_error.text)) {
                    alertDialog$Builder.k(LocaleController.getString(R.string.Gift2TransferToTONSetPassword), new j3.d0(h5Var));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                } else {
                    TextView textView4 = new TextView(h5Var.getContext());
                    textView4.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i16, false));
                    textView4.setTextSize(1, 16.0f);
                    if (!LocaleController.isRTL) {
                        i15 = 3;
                    }
                    textView4.setGravity(i15 | 48);
                    textView4.setText(LocaleController.getString(R.string.Gift2TransferToTONAlertText3));
                    linearLayout.addView(textView4, i7.f6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                    alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
                }
                twoStepVerificationActivity.showDialog(alertDialog$Builder.f22714a);
                return;
            }
            twoStepVerificationActivity.o0();
            twoStepVerificationActivity.finishFragment();
            if (tLObject instanceof TL_stars.starGiftWithdrawalUrl) {
                ye.d.u(h5Var.getContext(), ((TL_stars.starGiftWithdrawalUrl) tLObject).url);
            }
        }
    }

    public static boolean X(h5 h5Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, fy fyVar, ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return false;
        }
        long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        long giftThemeUser = ChatThemeController.getInstance(h5Var.currentAccount).getGiftThemeUser(tL_starGiftUnique.slug);
        if (giftThemeUser != 0 && giftThemeUser != j10) {
            org.telegram.ui.Components.c5.n0(h5Var.getContext(), h5Var.resourcesProvider, h5Var.currentAccount, tL_starGiftUnique, giftThemeUser, new c2(h5Var, j10, tL_starGiftUnique, fyVar, 1));
            return true;
        }
        ChatThemeController.getInstance(h5Var.currentAccount).setDialogTheme(j10, new qf.b(null, tL_starGiftUnique.slug));
        fyVar.presentFragment(tn.R9(j10), true);
        return true;
    }

    public static void Y(h5 h5Var) {
        int i10;
        long j10;
        long j11;
        long j12;
        String string;
        final long clientUserId = UserConfig.getInstance(h5Var.currentAccount).getClientUserId();
        final TL_stars.InputSavedStarGift E1 = h5Var.E1();
        if (E1 != null) {
            MessageObject messageObject = h5Var.A0;
            if (messageObject != null) {
                i10 = messageObject.messageOwner.date;
                boolean isOutOwner = messageObject.isOutOwner();
                MessageObject messageObject2 = h5Var.A0;
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
                            j10 = h5Var.A0.getDialogId();
                        }
                        j11 = tL_messageActionStarGift.convert_stars;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                TL_stars.SavedStarGift savedStarGift = h5Var.f12197y0;
                if (savedStarGift != null) {
                    i10 = savedStarGift.date;
                    if ((savedStarGift.flags & 2) != 0 && !savedStarGift.name_hidden) {
                        j10 = DialogObject.getPeerDialogId(savedStarGift.from_id);
                    } else {
                        j10 = 2666000;
                    }
                    j11 = h5Var.f12197y0.convert_stars;
                    j12 = h5Var.T;
                } else {
                    return;
                }
            }
            int max = Math.max(1, (MessagesController.getInstance(h5Var.currentAccount).stargiftsConvertPeriodMax - (ConnectionsManager.getInstance(h5Var.currentAccount).getCurrentTime() - i10)) / 86400);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(h5Var.getContext(), 0, h5Var.resourcesProvider);
            String string2 = LocaleController.getString(R.string.Gift2ConvertTitle);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
            c2Var.N = string2;
            if (!UserObject.isService(j10) && j10 != 2666000) {
                string = DialogObject.getShortName(j10);
            } else {
                string = LocaleController.getString(R.string.StarsTransactionHidden);
            }
            c2Var.P = AndroidUtilities.replaceTags(LocaleController.formatPluralString("Gift2ConvertText2", max, string, LocaleController.formatPluralStringComma("Gift2ConvertStars", (int) j11)));
            final long j13 = j11;
            final long j14 = j12;
            alertDialog$Builder.k(LocaleController.getString(R.string.Gift2ConvertButton), new org.telegram.ui.ActionBar.b2() {
                @Override
                public final void g(org.telegram.ui.ActionBar.c2 c2Var2, int i11) {
                    h5.k0(h5.this, E1, j14, clientUserId, j13);
                }
            });
            j7.l1.u(R.string.Cancel, alertDialog$Builder, null);
        }
    }

    public static void Y0(h5 h5Var, String str, long j10) {
        org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
        if (R == 0) {
            return;
        }
        ?? obj = new Object();
        obj.f23673a = true;
        ih.r5 r5Var = new ih.r5(h5Var.T, str, j10, h5Var.resourcesProvider);
        r5Var.f9357e = new y2(h5Var, 0);
        R.showAsSheet(r5Var, obj);
    }

    public static void Z(h5 h5Var, boolean[] zArr, TL_stars.StarGiftAttribute starGiftAttribute, vc[] vcVarArr) {
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        TL_stars.StarGift B1 = h5Var.B1();
        GiftAuctionController.getInstance(h5Var.currentAccount).requestAuctionUpgrades(B1.gift_id, new g2(h5Var, B1, starGiftAttribute, vcVarArr, zArr, 0));
    }

    public static void Z0(h5 h5Var, org.telegram.ui.ActionBar.c2 c2Var, TLObject tLObject, TLRPC.Document document, String str, String str2, String str3, long j10, TLRPC.TL_error tL_error) {
        hz0 hz0Var;
        hz0 hz0Var2;
        float f9;
        float f10;
        char c3;
        ?? r9;
        int round;
        c2Var.dismiss();
        if (tLObject instanceof TL_stars.UniqueStarGiftValueInfo) {
            TL_stars.UniqueStarGiftValueInfo uniqueStarGiftValueInfo = (TL_stars.UniqueStarGiftValueInfo) tLObject;
            org.telegram.ui.ActionBar.f3 q6 = org.telegram.messenger.x3.q(h5Var.getContext(), h5Var.resourcesProvider, false, false);
            LinearLayout linearLayout = new LinearLayout(h5Var.getContext());
            linearLayout.setOrientation(1);
            linearLayout.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
            linearLayout.setClipChildren(false);
            linearLayout.setClipToPadding(false);
            org.telegram.ui.Components.t9 t9Var = new org.telegram.ui.Components.t9(h5Var.getContext());
            ia.Z0(t9Var.getImageReceiver(), document, 160);
            linearLayout.addView(t9Var, i7.f6.t(160, 160, 1, 0, 0, 0, 0));
            TextView textView = new TextView(h5Var.getContext());
            textView.setTextSize(1, 20.0f);
            textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Sh, h5Var.resourcesProvider));
            textView.setTypeface(AndroidUtilities.bold());
            textView.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
            textView.setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(21.0f), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, h5Var.resourcesProvider)));
            textView.setGravity(17);
            linearLayout.addView(textView, i7.f6.t(-2, 42, 1, 0, 12, 0, 15));
            textView.setText(str);
            TextView textView2 = new TextView(h5Var.getContext());
            textView2.setTextSize(1, 14.0f);
            textView2.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23169j5, h5Var.resourcesProvider));
            textView2.setGravity(17);
            linearLayout.addView(textView2, i7.f6.t(-2, -2, 1, 16, 0, 16, 19));
            if (uniqueStarGiftValueInfo.value_is_average) {
                org.telegram.ui.b.p(R.string.GiftValueAverage, new Object[]{str2}, textView2);
            } else if (uniqueStarGiftValueInfo.last_sale_on_fragment) {
                org.telegram.ui.b.p(R.string.GiftValueLastFragment, new Object[]{str3}, textView2);
            } else {
                org.telegram.ui.b.p(R.string.GiftValueLastTelegram, new Object[]{str3}, textView2);
            }
            FrameLayout frameLayout = new FrameLayout(h5Var.getContext());
            frameLayout.setClipChildren(false);
            frameLayout.setClipToPadding(false);
            ih.b0 b0Var = new ih.b0(h5Var, new nh.t3[1], frameLayout, 3);
            hz0 hz0Var3 = new hz0(h5Var.getContext(), h5Var.resourcesProvider);
            frameLayout.addView(hz0Var3, i7.f6.e(-1, -1, 119));
            hz0Var3.c(LocaleController.getString(R.string.GiftValueInitialSale), LocaleController.formatYearMonthDay(uniqueStarGiftValueInfo.initial_sale_date, true), null, null);
            String string = LocaleController.getString(R.string.GiftValueInitialPrice);
            StringBuilder sb2 = new StringBuilder("⭐️");
            sb2.append(uniqueStarGiftValueInfo.initial_sale_stars);
            sb2.append(" (~");
            hz0Var3.c(string, ia.X0(false, a4.w.q(sb2, BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.initial_sale_price, uniqueStarGiftValueInfo.currency), ")"), 0.8f, null), null, null);
            if (TLObject.hasFlag(uniqueStarGiftValueInfo.flags, 1)) {
                hz0Var3.c(LocaleController.getString(R.string.GiftValueLastSale), LocaleController.formatYearMonthDay(uniqueStarGiftValueInfo.last_sale_date, true), null, null);
                if (((int) (Math.round((uniqueStarGiftValueInfo.last_sale_price / uniqueStarGiftValueInfo.initial_sale_price) * 1000.0d) / 10)) - 100 > 0) {
                    hz0Var3.e(LocaleController.getString(R.string.GiftValueLastPrice), BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.last_sale_price, uniqueStarGiftValueInfo.currency), "+" + LocaleController.formatNumber(round, ' ') + "%", null, null);
                    hz0Var = hz0Var3;
                } else {
                    hz0Var = hz0Var3;
                    hz0Var.c(LocaleController.getString(R.string.GiftValueLastPrice), BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.last_sale_price, uniqueStarGiftValueInfo.currency), null, null);
                }
            } else {
                hz0Var = hz0Var3;
            }
            if (TLObject.hasFlag(uniqueStarGiftValueInfo.flags, 4)) {
                p2 p2Var = new p2(b0Var, r10, uniqueStarGiftValueInfo, str2, 0);
                hz0Var2 = hz0Var;
                TableRow e10 = hz0Var2.e(LocaleController.getString(R.string.GiftValueMinPrice), BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.floor_price, uniqueStarGiftValueInfo.currency), "?", p2Var, null);
                vc[] vcVarArr = {(vc) ((ez0) e10.getChildAt(1)).getChildAt(0)};
                e10.setOnClickListener(new ag.o(p2Var, 18));
            } else {
                hz0Var2 = hz0Var;
            }
            if (TLObject.hasFlag(uniqueStarGiftValueInfo.flags, 8)) {
                p2 p2Var2 = new p2(b0Var, r10, uniqueStarGiftValueInfo, str2, 1);
                TableRow e11 = hz0Var2.e(LocaleController.getString(R.string.GiftValueAveragePrice), BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.average_price, uniqueStarGiftValueInfo.currency), "?", p2Var2, null);
                vc[] vcVarArr2 = {(vc) ((ez0) e11.getChildAt(1)).getChildAt(0)};
                e11.setOnClickListener(new ag.o(p2Var2, 19));
            }
            linearLayout.addView(frameLayout, i7.f6.t(-1, -2, 7, 0, 0, 0, 12));
            if (uniqueStarGiftValueInfo.listed_count > 0) {
                nh.d dVar = new nh.d(h5Var.getContext(), h5Var.resourcesProvider, false);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                spannableStringBuilder.append((CharSequence) LocaleController.formatNumber(uniqueStarGiftValueInfo.listed_count, ' '));
                spannableStringBuilder.append((CharSequence) " ");
                spannableStringBuilder.append((CharSequence) "e");
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.y5(document, 1.5f, dVar.getTextPaint().getFontMetricsInt()), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                spannableStringBuilder.append((CharSequence) " ");
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.GiftValueOnSaleTelegram));
                dVar.g(AndroidUtilities.replaceArrows(spannableStringBuilder, false, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f)), false, true);
                f9 = 1.0f;
                f10 = 2.0f;
                c3 = ' ';
                r9 = 1;
                dVar.setOnClickListener(new q2(h5Var, str2, j10, 0));
                linearLayout.addView(dVar, i7.f6.t(-1, 42, 7, 0, 0, 0, 2));
            } else {
                f9 = 1.0f;
                f10 = 2.0f;
                c3 = ' ';
                r9 = 1;
            }
            if (uniqueStarGiftValueInfo.fragment_listed_count > 0) {
                nh.d dVar2 = new nh.d(h5Var.getContext(), h5Var.resourcesProvider, false);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                spannableStringBuilder2.append((CharSequence) LocaleController.formatNumber(uniqueStarGiftValueInfo.fragment_listed_count, c3));
                spannableStringBuilder2.append((CharSequence) "e");
                spannableStringBuilder2.setSpan(new org.telegram.ui.Components.y5(document, 1.5f, dVar2.getTextPaint().getFontMetricsInt()), spannableStringBuilder2.length() - r9, spannableStringBuilder2.length(), 33);
                spannableStringBuilder2.append((CharSequence) " ");
                spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.GiftValueOnSaleFragment));
                dVar2.g(AndroidUtilities.replaceArrows(spannableStringBuilder2, false, AndroidUtilities.dp(f10), AndroidUtilities.dp(f9)), false, r9);
                dVar2.setOnClickListener(new ag.n(21, h5Var, uniqueStarGiftValueInfo));
                linearLayout.addView(dVar2, i7.f6.t(-1, 42, 7, 0, 0, 0, 0));
            }
            q6.customView = linearLayout;
            q6.show();
        } else if (tL_error != null) {
            h5Var.getBulletinFactory().d0(tL_error, false);
        }
    }

    public static void a0(h5 h5Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        h5Var.f12176g1 = false;
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            MessagesController.getInstance(h5Var.currentAccount).putUsers(paymentForm.users, false);
            h5Var.f12178h1 = paymentForm;
            h5Var.b2();
            return;
        }
        mc Y = h5Var.getBulletinFactory().Y(tL_error);
        Y.f30662t = true;
        Y.j();
    }

    public static void a1(h5 h5Var, final ih.v0 v0Var, kf.b bVar, final TL_stars.TL_starGiftUnique tL_starGiftUnique, final long j10, final TLRPC.TL_textWithEntities tL_textWithEntities, final boolean z10, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        h5Var.f12173f0.setLoading(false);
        if (v0Var != null && v0Var.H) {
            v0Var.H = false;
            v0Var.D.h(false);
        }
        if (tL_payments_paymentFormStarGift == null) {
            return;
        }
        new l4(h5Var.getContext(), h5Var.resourcesProvider, tL_starGiftUnique, new j4(bVar, tL_payments_paymentFormStarGift), h5Var.currentAccount, j10, h5Var.C1(), false, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                h5.R(h5.this, tL_starGiftUnique, j10, tL_textWithEntities, z10, v0Var, (j4) obj, (ye.c) obj2);
            }
        }).b();
    }

    public static void b0(h5 h5Var) {
        Bundle bundle = new Bundle();
        long j10 = h5Var.T;
        if (j10 >= 0) {
            bundle.putLong("user_id", j10);
        } else {
            bundle.putLong("chat_id", -j10);
        }
        if (j10 == UserConfig.getInstance(h5Var.currentAccount).getClientUserId()) {
            bundle.putBoolean("my_profile", true);
        }
        bundle.putBoolean("open_gifts", true);
        bundle.putBoolean("open_gifts_upgradable", true);
        d2(new ProfileActivity(bundle, null));
    }

    public static void b1(h5 h5Var) {
        nh.d dVar = h5Var.f12173f0;
        if (UserConfig.getInstance(h5Var.currentAccount).isPremium() && (P1(h5Var.currentAccount, h5Var.K1()) || h5Var.R0)) {
            h5Var.r2(false);
            return;
        }
        TL_stars.TL_starGiftUnique K1 = h5Var.K1();
        if (K1 == null) {
            return;
        }
        TLRPC.Peer peer = K1.owner_id;
        if (peer == null) {
            peer = K1.host_id;
        }
        long peerDialogId = DialogObject.getPeerDialogId(peer);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(K1.title);
        sb2.append(" #");
        h5Var.f12194v0.setText(LocaleController.formatString(R.string.Gift2WearTitle, j7.l1.m(K1.num, ',', sb2)));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.Gift2WearStart));
        if (!UserConfig.getInstance(h5Var.currentAccount).isPremium()) {
            spannableStringBuilder.append((CharSequence) " l");
            if (h5Var.Q0 == null) {
                h5Var.Q0 = new iq(R.drawable.msg_mini_lock3, 0);
            }
            spannableStringBuilder.setSpan(h5Var.Q0, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        dVar.g(spannableStringBuilder, true, true);
        dVar.f(null, true);
        dVar.setOnClickListener(new l1(h5Var, 26));
        h5Var.f12163a0.setWearPreview(MessagesController.getInstance(h5Var.currentAccount).getUserOrChat(peerDialogId));
        h5Var.q2(2, true, null);
    }

    public static void c0(h5 h5Var, Utilities.Callback2 callback2, ArrayList arrayList, Runnable runnable, TLRPC.Updates updates, TLRPC.TL_error tL_error) {
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
                        messageObject = new MessageObject(h5Var.currentAccount, message, false, false);
                        break;
                    }
                } else {
                    messageObject = null;
                    break;
                }
            }
            MessagesController.getInstance(h5Var.currentAccount).processUpdates(updates, false);
            if (messageObject != null) {
                TL_stars.StarGift starGift = ((TLRPC.TL_messageActionStarGiftUnique) messageObject.messageOwner.action).gift;
                callback2.run(starGift, new androidx.car.app.utils.c(h5Var, messageObject, arrayList, starGift, 9));
                return;
            }
            callback2.run(null, null);
            s7.y(h5Var.currentAccount, false).P();
            k7 G = s7.y(h5Var.currentAccount, false).G(UserConfig.getInstance(h5Var.currentAccount).getClientUserId(), false);
            if (G != null) {
                G.j(arrayList, null);
            }
        } else if (tL_error != null) {
            if ("STARGIFT_CRAFT_UNAVAILABLE".equalsIgnoreCase(tL_error.text)) {
                alertDialog$Builder = new AlertDialog$Builder(h5Var.getContext(), 0, new lh.b());
                String string = LocaleController.getString(R.string.GiftCraftUnavailableTitle);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
                c2Var.N = string;
                c2Var.P = AndroidUtilities.replaceTags(LocaleController.getString(R.string.GiftCraftUnavailableText));
                i10 = R.string.OK;
            } else {
                String str = tL_error.text;
                if (str != null && str.startsWith("STARGIFT_CRAFT_TOO_EARLY_")) {
                    long parseLong = Long.parseLong(tL_error.text.substring(25)) + ConnectionsManager.getInstance(h5Var.currentAccount).getCurrentTime();
                    alertDialog$Builder = new AlertDialog$Builder(h5Var.getContext(), 0, new lh.b());
                    String string2 = LocaleController.getString(R.string.GiftCraftUnavailableTitle);
                    org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder.f22714a;
                    c2Var2.N = string2;
                    c2Var2.P = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCraftUnavailableTextTime, LocaleController.formatDateTime(parseLong, true)));
                    i10 = R.string.OK;
                } else {
                    h5Var.getBulletinFactory().d0(tL_error, false);
                    runnable.run();
                }
            }
            j7.l1.C(i10, alertDialog$Builder, null);
            runnable.run();
        }
    }

    public static void c1(h5 h5Var, TLObject tLObject, CharSequence charSequence, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails, TLRPC.TL_error tL_error) {
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
            LinearLayout linearLayout = new LinearLayout(h5Var.getContext());
            linearLayout.setOrientation(1);
            linearLayout.setPadding(AndroidUtilities.dp(23.0f), 0, AndroidUtilities.dp(23.0f), 0);
            TextView b10 = i7.j6.b(h5Var.getContext(), 16.0f, org.telegram.ui.ActionBar.g6.f23169j5, false, null);
            b10.setText(LocaleController.getString(R.string.Gift2RemoveDescriptionText));
            linearLayout.addView(b10, i7.f6.k(0.0f, 0.0f, 0.0f, 16.0f, -1, -2));
            hz0 hz0Var = new hz0(h5Var.getContext(), h5Var.resourcesProvider);
            fz0 a2 = hz0Var.a(charSequence);
            a2.setFilled(true);
            gh.s sVar = (gh.s) a2.getChildAt(0);
            sVar.setTextSize(1, 12.0f);
            sVar.setGravity(17);
            linearLayout.addView(hz0Var, i7.f6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(h5Var.getContext(), 0, h5Var.resourcesProvider);
            alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.Gift2RemoveDescriptionTitle);
            alertDialog$Builder.n(linearLayout);
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.k(ia.Q0(LocaleController.formatString(R.string.Gift2RemoveDescriptionButton, Integer.valueOf((int) j10))), new o2(h5Var, tL_starGiftUnique, paymentForm, tL_inputInvoiceStarGiftDropOriginalDetails, j10, charSequence));
            alertDialog$Builder.o();
        } else if (tL_error != null) {
            h5Var.getBulletinFactory().d0(tL_error, false);
        }
    }

    public static void d0(h5 h5Var, long j10, TL_stars.TL_starGiftUnique tL_starGiftUnique, fy fyVar) {
        ChatThemeController.getInstance(h5Var.currentAccount).setDialogTheme(j10, new qf.b(null, tL_starGiftUnique.slug));
        fyVar.presentFragment(tn.R9(j10), true);
    }

    public static void d1(h5 h5Var, long j10) {
        y9 y9Var = new y9(h5Var.getContext(), h5Var.resourcesProvider, j10, 10, null, new w2(1, h5Var, new boolean[]{false}), 0L);
        y9Var.setOnDismissListener(new z2(h5Var, 0));
        y9Var.show();
    }

    public static void d2(org.telegram.ui.ActionBar.o2 o2Var) {
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        if (U == 0) {
            return;
        }
        ?? obj = new Object();
        obj.f23673a = true;
        U.showAsSheet(o2Var, obj);
    }

    public static void e0(h5 h5Var, long j10, long j11, Utilities.Callback callback) {
        y9 y9Var = new y9(h5Var.getContext(), h5Var.resourcesProvider, j10, 11, null, new c2(h5Var, new boolean[]{false}, j11, callback, 2), 0L);
        y9Var.setOnDismissListener(new z2(h5Var, 1));
        y9Var.show();
    }

    public static void e1(h5 h5Var, TLRPC.TL_messageActionStarGift tL_messageActionStarGift, org.telegram.ui.ActionBar.c2 c2Var, TLObject tLObject) {
        MessageObject messageObject;
        if (tLObject instanceof TLRPC.messages_Messages) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            MessagesController.getInstance(h5Var.currentAccount).putUsers(messages_messages.users, false);
            MessagesController.getInstance(h5Var.currentAccount).putChats(messages_messages.chats, false);
            for (int i10 = 0; i10 < messages_messages.messages.size(); i10++) {
                TLRPC.Message message = messages_messages.messages.get(i10);
                if (message != null && !(message instanceof TLRPC.TL_messageEmpty) && message.f22413id == tL_messageActionStarGift.upgrade_msg_id) {
                    messageObject = new MessageObject(h5Var.currentAccount, message, false, false);
                    messageObject.setType();
                    break;
                }
            }
        }
        messageObject = null;
        if (messageObject != null) {
            AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b(h5Var, c2Var, messageObject, 24));
        } else {
            AndroidUtilities.runOnUIThread(new h3(c2Var, 0));
        }
    }

    public static void f0(h5 h5Var, TLObject tLObject, long j10, long j11, Utilities.Callback callback, TLRPC.TL_error tL_error, long j12) {
        if (tLObject instanceof TLRPC.TL_payments_paymentResult) {
            TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) tLObject;
            MessagesController.getInstance(h5Var.currentAccount).putUsers(tL_payments_paymentResult.updates.users, false);
            MessagesController.getInstance(h5Var.currentAccount).putChats(tL_payments_paymentResult.updates.chats, false);
            s7.y(h5Var.currentAccount, false).T(false);
            s7.y(h5Var.currentAccount, false).Q(j10);
            s7.y(h5Var.currentAccount, false).Q(j11);
            s7.y(h5Var.currentAccount, false).P();
            callback.run(null);
            org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
            if (U != null) {
                if (j10 >= 0 && j11 >= 0) {
                    tn R9 = tn.R9(j10);
                    R9.whenFullyVisible(new r2(h5Var, R9, j10, 1));
                    U.presentFragment(R9);
                } else {
                    mc M = tc.a0(U).M(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, h5Var.C1(), DialogObject.getShortName(j10))), R.raw.forward);
                    M.f30662t = true;
                    M.j();
                }
            }
            Utilities.stageQueue.postRunnable(new v2(h5Var, tL_payments_paymentResult, 1));
        } else if (tL_error != null && "BALANCE_TOO_LOW".equals(tL_error.text)) {
            if (!MessagesController.getInstance(h5Var.currentAccount).starsPurchaseAvailable()) {
                h5Var.f12173f0.setLoading(false);
                s7.e0(h5Var.getContext(), h5Var.resourcesProvider);
                return;
            }
            s7 y8 = s7.y(h5Var.currentAccount, false);
            g5.x xVar = new g5.x(h5Var, j12, j10, callback, 1);
            y8.f12790e = false;
            y8.q(false, true, xVar);
            y8.f12790e = true;
        } else {
            callback.run(tL_error);
            h5Var.getBulletinFactory().d0(tL_error, false);
        }
    }

    public static void f1(h5 h5Var, TL_stars.InputSavedStarGift inputSavedStarGift, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            MessagesController.getInstance(h5Var.currentAccount).putUsers(updates.users, false);
            MessagesController.getInstance(h5Var.currentAccount).putChats(updates.chats, false);
        }
        AndroidUtilities.runOnUIThread(new androidx.car.app.utils.c(h5Var, tL_error, tLObject, inputSavedStarGift, 10));
    }

    public static void g0(h5 h5Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, Utilities.Callback callback, Boolean bool) {
        TL_stars.StarGift starGift;
        if (h5Var.P0 == null) {
            ih.p5 p5Var = new ih.p5(h5Var.currentAccount, tL_starGiftUnique.gift_id);
            h5Var.P0 = p5Var;
            p5Var.a();
        }
        HashSet hashSet = new HashSet();
        int i10 = 0;
        while (true) {
            e4[] e4VarArr = h5Var.f12163a0.H.f12112n;
            if (i10 < e4VarArr.length) {
                TL_stars.StarGift starGift2 = e4VarArr[i10].h;
                if (starGift2 != null) {
                    starGift = starGift2;
                } else {
                    starGift = null;
                }
                if (starGift != null) {
                    if (starGift2 == null) {
                        starGift2 = null;
                    }
                    hashSet.add(Long.valueOf(starGift2.f22619id));
                }
                i10++;
            } else {
                ih.q5 q5Var = new ih.q5(h5Var.getContext(), tL_starGiftUnique.title, h5Var.P0);
                q5Var.f9341c0.addAll(hashSet);
                q5Var.f9343e0.N(true);
                q5Var.f9342d0 = bool.booleanValue();
                q5Var.f9339a0.set(AndroidUtilities.replaceTags(LocaleController.formatPluralString("GiftCraftSelect", 4 - hashSet.size(), new Object[0])));
                q5Var.f9340b0 = new n1(0, callback);
                q5Var.show();
                return;
            }
        }
    }

    public static void g1(h5 h5Var) {
        TL_stars.SavedStarGift savedStarGift = h5Var.f12197y0;
        if (savedStarGift.unsaved) {
            savedStarGift.unsaved = false;
            i7 F = s7.y(h5Var.currentAccount, false).F(h5Var.T, false);
            if (F != null) {
                TL_stars.SavedStarGift savedStarGift2 = h5Var.f12197y0;
                F.m(savedStarGift2, savedStarGift2.unsaved);
            }
            TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
            savestargift.stargift = h5Var.E1();
            savestargift.unsave = h5Var.f12197y0.unsaved;
            ConnectionsManager.getInstance(h5Var.currentAccount).sendRequest(savestargift, null, 64);
        }
        TL_stars.SavedStarGift savedStarGift3 = h5Var.f12197y0;
        boolean z10 = savedStarGift3.pinned_to_top;
        if (((k7) h5Var.f12198z0).m(savedStarGift3, !z10, false)) {
            new ih.w3(h5Var.getContext(), h5Var.T, h5Var.f12197y0, h5Var.resourcesProvider, new Utilities.Callback0Return() {
                @Override
                public final Object run() {
                    return h5.this.getBulletinFactory();
                }
            }).show();
        } else if (!z10) {
            h5Var.getBulletinFactory().M(LocaleController.getString(R.string.Gift2PinnedTitle), LocaleController.getString(R.string.Gift2PinnedSubtitle), R.raw.ic_pin).j();
        } else {
            j7.l1.v(R.string.Gift2Unpinned, h5Var.getBulletinFactory(), R.raw.ic_unpin, 36);
        }
    }

    public static SpannableStringBuilder g2(String str) {
        if (str == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        SpannableString spannableString = new SpannableString("👌");
        spannableString.setSpan(new iq(R.drawable.filled_understood, 0), 0, spannableString.length(), 33);
        SpannableString spannableString2 = new SpannableString("👍");
        spannableString2.setSpan(new iq(R.drawable.filled_reactions, 0), 0, spannableString2.length(), 33);
        AndroidUtilities.replaceMultipleCharSequence("👌", spannableStringBuilder, spannableString);
        AndroidUtilities.replaceMultipleCharSequence("👍", spannableStringBuilder, spannableString2);
        return spannableStringBuilder;
    }

    public static void h0(h5 h5Var, TLObject tLObject, String str, TL_stars.InputSavedStarGift inputSavedStarGift, TLRPC.TL_error tL_error, long j10) {
        TL_stars.SavedStarGift savedStarGift;
        if (tLObject instanceof TLRPC.TL_payments_paymentResult) {
            TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) tLObject;
            MessagesController.getInstance(h5Var.currentAccount).putUsers(tL_payments_paymentResult.updates.users, false);
            MessagesController.getInstance(h5Var.currentAccount).putChats(tL_payments_paymentResult.updates.chats, false);
            s7.y(h5Var.currentAccount, false).T(false);
            s7.y(h5Var.currentAccount, false).P();
            if (!TextUtils.isEmpty(str) && (savedStarGift = h5Var.f12197y0) != null) {
                savedStarGift.flags &= -65537;
                savedStarGift.prepaid_upgrade_hash = null;
            }
            h5Var.m0 = true;
            h5Var.f12178h1 = null;
            h5Var.r1(inputSavedStarGift, tL_payments_paymentResult.updates, new u2(h5Var, str, 0));
            Utilities.stageQueue.postRunnable(new v2(h5Var, tL_payments_paymentResult, 0));
        } else if (tL_error != null && "BALANCE_TOO_LOW".equals(tL_error.text)) {
            if (!MessagesController.getInstance(h5Var.currentAccount).starsPurchaseAvailable()) {
                h5Var.f12173f0.setLoading(false);
                s7.e0(h5Var.getContext(), h5Var.resourcesProvider);
                return;
            }
            s7 y8 = s7.y(h5Var.currentAccount, false);
            u1 u1Var = new u1(h5Var, j10, 3);
            y8.f12790e = false;
            y8.q(false, true, u1Var);
            y8.f12790e = true;
        } else {
            h5Var.getBulletinFactory().d0(tL_error, false);
        }
    }

    public static void h1(h5 h5Var, String str) {
        Context context = h5Var.getContext();
        ye.d.u(context, MessagesController.getInstance(h5Var.currentAccount).tonBlockchainExplorerUrl + str);
    }

    public static void i0(h5 h5Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, kf.a aVar, Runnable runnable) {
        h5Var.getClass();
        TL_stars.StarsAmount o10 = aVar.o();
        TL_stars.updateStarGiftPrice updatestargiftprice = new TL_stars.updateStarGiftPrice();
        updatestargiftprice.stargift = h5Var.E1();
        updatestargiftprice.resell_amount = o10;
        ConnectionsManager.getInstance(h5Var.currentAccount).sendRequest(updatestargiftprice, new r1(h5Var, tL_starGiftUnique, aVar, runnable, 1));
    }

    public static void i1(h5 h5Var, String str) {
        long j10 = h5Var.T;
        h5Var.f12173f0.setLoading(false);
        if (!TextUtils.isEmpty(str)) {
            h5Var.dismiss();
            org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
            if (R == null) {
                return;
            }
            if (R instanceof tn) {
                tn tnVar = (tn) R;
                if (tnVar.a() == j10) {
                    tc.a0(tnVar).M(LocaleController.getString(R.string.StarsGiftUpgradeCompleted), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StarsGiftUpgradeCompletedText, DialogObject.getShortName(j10))), R.raw.gift).k(true);
                    return;
                }
            }
            NotificationCenter notificationCenter = NotificationCenter.getInstance(h5Var.currentAccount);
            int i10 = NotificationCenter.closeProfileActivity;
            Long valueOf = Long.valueOf(j10);
            Boolean bool = Boolean.FALSE;
            notificationCenter.lambda$postNotificationNameOnUIThread$1(i10, valueOf, bool);
            NotificationCenter.getInstance(h5Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChatActivity, Long.valueOf(j10), bool);
            tn R9 = tn.R9(j10);
            R9.whenFullyVisible(new w2(3, h5Var, R9));
            R.presentFragment(R9);
            return;
        }
        h5Var.q2(0, true, null);
    }

    public static void j0(h5 h5Var, TLObject tLObject, MessageObject messageObject) {
        TLRPC.Message message;
        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
        MessagesController.getInstance(h5Var.currentAccount).putUsers(messages_messages.users, false);
        MessagesController.getInstance(h5Var.currentAccount).putChats(messages_messages.chats, false);
        h5Var.F0 = true;
        h5Var.E0 = false;
        Boolean bool = h5Var.f12166b1;
        if (bool != null && (message = messageObject.messageOwner) != null) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                ((TLRPC.TL_messageActionStarGift) messageAction).saved = true ^ bool.booleanValue();
            } else if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                ((TLRPC.TL_messageActionStarGiftUnique) messageAction).saved = true ^ bool.booleanValue();
            }
        }
        h5Var.i2(messageObject, null);
    }

    public static void j1(h5 h5Var, boolean z10) {
        int i10;
        Object obj;
        ih.m3 m3Var;
        ih.m3 m3Var2;
        ih.m3 m3Var3;
        int G1 = h5Var.G1();
        if (G1 >= 0) {
            if (z10) {
                i10 = 1;
            } else {
                i10 = -1;
            }
            int i11 = i10 + G1;
            int i12 = h5Var.N0;
            if (i12 >= 0 && (!z10 ? i12 < G1 : i12 > G1)) {
                i11 = i12;
            }
            l7 l7Var = h5Var.f12198z0;
            if (l7Var != null && i11 >= 0 && i11 < l7Var.e()) {
                obj = h5Var.f12198z0.get(i11);
            } else {
                obj = null;
            }
            if (obj != null) {
                if (z10) {
                    m3Var = h5Var.Y;
                } else {
                    m3Var = h5Var.X;
                }
                if (m3Var != null) {
                    if (obj instanceof TL_stars.SavedStarGift) {
                        if (z10) {
                            m3Var3 = h5Var.Y;
                        } else {
                            m3Var3 = h5Var.X;
                        }
                        if (x1(m3Var3.f12197y0, (TL_stars.SavedStarGift) obj)) {
                            return;
                        }
                    }
                    if (obj instanceof TL_stars.TL_starGiftUnique) {
                        if (z10) {
                            m3Var2 = h5Var.Y;
                        } else {
                            m3Var2 = h5Var.X;
                        }
                        if (y1(m3Var2.C0, (TL_stars.TL_starGiftUnique) obj)) {
                            return;
                        }
                    }
                }
                ih.m3 m3Var4 = new ih.m3(h5Var, h5Var.getContext(), h5Var.currentAccount, h5Var.T, h5Var.resourcesProvider, h5Var.U.getRootView());
                if (obj instanceof TL_stars.SavedStarGift) {
                    m3Var4.j2((TL_stars.SavedStarGift) obj, h5Var.f12198z0);
                } else if (obj instanceof TL_stars.TL_starGiftUnique) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj;
                    m3Var4.h2(tL_starGiftUnique.slug, tL_starGiftUnique, h5Var.f12198z0);
                }
                AndroidUtilities.removeFromParent(m3Var4.containerView);
                if (z10) {
                    h5Var.Y = m3Var4;
                } else {
                    h5Var.X = m3Var4;
                }
            }
        }
    }

    public static void k0(h5 h5Var, TL_stars.InputSavedStarGift inputSavedStarGift, long j10, long j11, long j12) {
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(ApplicationLoader.applicationContext, 3, null);
        c2Var.q(500L);
        TL_stars.convertStarGift convertstargift = new TL_stars.convertStarGift();
        convertstargift.stargift = inputSavedStarGift;
        ConnectionsManager.getInstance(h5Var.currentAccount).sendRequest(convertstargift, new y1(h5Var, c2Var, j10, j11, j12));
    }

    public static void k1(h5 h5Var, final View view) {
        nh.za zaVar;
        LaunchActivity launchActivity = LaunchActivity.C1;
        if (launchActivity != null) {
            if (view instanceof org.telegram.ui.Cells.c7) {
                zaVar = nh.bb.b((org.telegram.ui.Cells.c7) view);
            } else {
                zaVar = null;
            }
            ArrayList arrayList = new ArrayList();
            MessageObject messageObject = h5Var.A0;
            if (messageObject != null) {
                arrayList.add(messageObject);
            } else if (h5Var.B1() instanceof TL_stars.TL_starGiftUnique) {
                long clientUserId = UserConfig.getInstance(h5Var.currentAccount).getClientUserId();
                TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                tL_messageService.peer_id = MessagesController.getInstance(h5Var.currentAccount).getPeer(clientUserId);
                tL_messageService.from_id = MessagesController.getInstance(h5Var.currentAccount).getPeer(clientUserId);
                tL_messageService.date = ConnectionsManager.getInstance(h5Var.currentAccount).getCurrentTime();
                TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = new TLRPC.TL_messageActionStarGiftUnique();
                tL_messageActionStarGiftUnique.gift = (TL_stars.TL_starGiftUnique) h5Var.B1();
                tL_messageActionStarGiftUnique.upgrade = true;
                tL_messageService.action = tL_messageActionStarGiftUnique;
                MessageObject messageObject2 = new MessageObject(h5Var.currentAccount, tL_messageService, false, false);
                messageObject2.setType();
                arrayList.add(messageObject2);
            } else {
                return;
            }
            final gb E = gb.E(launchActivity, h5Var.currentAccount);
            E.N = new Utilities.Callback4() {
                @Override
                public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
                    Long l10 = (Long) obj;
                    Runnable runnable = (Runnable) obj2;
                    Long l11 = (Long) obj4;
                    boolean booleanValue = ((Boolean) obj3).booleanValue();
                    gb gbVar = E;
                    nh.za zaVar2 = null;
                    if (booleanValue) {
                        h5 h5Var2 = h5.this;
                        AndroidUtilities.runOnUIThread(new ef.c(27, h5Var2, l11));
                        gbVar.Y(null);
                        k3 k3Var = h5Var2.S0;
                        if (k3Var != null) {
                            k3Var.dismiss();
                            h5Var2.S0 = null;
                        }
                    } else {
                        View view2 = view;
                        if ((view2 instanceof org.telegram.ui.Cells.c7) && view2.isAttachedToWindow()) {
                            zaVar2 = nh.bb.b((org.telegram.ui.Cells.c7) view2);
                        }
                        gbVar.Y(zaVar2);
                    }
                    AndroidUtilities.runOnUIThread(runnable);
                }
            };
            E.U(zaVar, nh.o7.y(arrayList));
        }
    }

    public static void l0(h5 h5Var, long j10) {
        new ih.h2(h5Var.getContext(), h5Var.currentAccount, j10, null, new y2(h5Var, 2)).show();
    }

    public static ViewGroup l1(h5 h5Var) {
        return h5Var.containerView;
    }

    public static void m0(h5 h5Var, org.telegram.ui.ActionBar.c2 c2Var, TL_stars.SavedStarGift savedStarGift) {
        if (savedStarGift != null) {
            c2Var.dismiss();
            h5Var.H0 = true;
            h5Var.j2(savedStarGift, null);
            super.show();
            return;
        }
        c2Var.dismiss();
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        if (U != null) {
            mc Q = tc.a0(U).Q(R.raw.error, 36, LocaleController.getString(R.string.MessageNotFound));
            Q.f30662t = true;
            Q.j();
        }
    }

    public static void n0(h5 h5Var) {
        TL_stars.TL_starGiftUnique K1 = h5Var.K1();
        new n0(h5Var.getContext(), h5Var.currentAccount, DialogObject.getPeerDialogId(K1.owner_id), K1, h5Var.resourcesProvider, new t1(h5Var, 2)).show();
    }

    public static int n1(h5 h5Var) {
        return h5Var.backgroundPaddingLeft;
    }

    public static void o0(h5 h5Var, String str) {
        h5Var.dismiss();
        Context context = h5Var.getContext();
        ye.d.s(context, "https://" + MessagesController.getInstance(h5Var.currentAccount).linkPrefix + "/" + str);
    }

    public static int o1(h5 h5Var) {
        return h5Var.backgroundPaddingLeft;
    }

    public static void p0(h5 h5Var) {
        if (h5Var.f12178h1 == null) {
            return;
        }
        long j10 = 0;
        for (int i10 = 0; i10 < h5Var.f12178h1.invoice.prices.size(); i10++) {
            j10 += h5Var.f12178h1.invoice.prices.get(i10).amount;
        }
        f5 f5Var = new f5(h5Var.getContext(), j10, h5Var.f12172e1, h5Var.resourcesProvider);
        h5Var.f12185l0 = f5Var;
        f5Var.show();
    }

    public static void q0(h5 h5Var, ye.c cVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(h5Var.currentAccount).processUpdates((TLRPC.Updates) tLObject, false);
            AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b(h5Var, cVar, tL_starGiftUnique, 21));
            return;
        }
        h5Var.getClass();
        if (tL_error != null && tL_error.text.startsWith("STARGIFT_RESELL_TOO_EARLY_")) {
            AndroidUtilities.runOnUIThread(new g5.v(h5Var, cVar, Long.parseLong(tL_error.text.substring(26)), 3));
        } else if (tL_error != null) {
            AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b(h5Var, cVar, tL_error, 22));
        }
    }

    public static void q1(hz0 hz0Var, TL_stars.StarGiftAttribute starGiftAttribute) {
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
        hz0Var.e(str, starGiftAttribute.name, J1(starGiftAttribute.rarity, numArr), null, numArr[0]);
    }

    public static void r0(h5 h5Var, TL_stars.StarGift starGift, TL_stars.StarGiftAttribute starGiftAttribute, vc[] vcVarArr, boolean[] zArr, ArrayList arrayList) {
        if (arrayList != null) {
            new j1(h5Var.getContext(), h5Var.resourcesProvider, h5Var.currentAccount, starGift.title, arrayList, false).show();
        } else {
            h5Var.o2(vcVarArr[0], LocaleController.formatString(R.string.Gift2RarityHint, ph.j.G0(starGiftAttribute.getRarityPermille())), false);
        }
        zArr[0] = false;
    }

    public static void s0(h5 h5Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, kf.a aVar, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(h5Var.currentAccount).processUpdates((TLRPC.Updates) tLObject, false);
            AndroidUtilities.runOnUIThread(new i2(h5Var, tL_starGiftUnique, aVar, runnable, 0));
            return;
        }
        h5Var.getClass();
        if (tL_error != null && tL_error.text.startsWith("STARGIFT_RESELL_TOO_EARLY_")) {
            AndroidUtilities.runOnUIThread(new g5.v(h5Var, Long.parseLong(tL_error.text.substring(26)), runnable, 2));
        } else if (tL_error != null) {
            AndroidUtilities.runOnUIThread(new j2(h5Var, tL_error, runnable, 0));
        }
    }

    public static void t0(h5 h5Var, String str) {
        Context context = h5Var.getContext();
        ye.d.u(context, MessagesController.getInstance(h5Var.currentAccount).tonBlockchainExplorerUrl + str);
    }

    public static void u0(h5 h5Var, ArrayList arrayList, Utilities.Callback2 callback2, Runnable runnable) {
        ih.p5 p5Var = h5Var.P0;
        if (p5Var != null) {
            p5Var.b();
            h5Var.P0 = null;
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
        ConnectionsManager.getInstance(h5Var.currentAccount).sendRequestTyped(craftstargift, new Object(), new z1(h5Var, callback2, arrayList, runnable, 0));
    }

    public static void v0(jh.h5 r17) {
        throw new UnsupportedOperationException("Method not decompiled: jh.h5.v0(jh.h5):void");
    }

    public static void w0(h5 h5Var, String str) {
        Context context = h5Var.getContext();
        ye.d.u(context, MessagesController.getInstance(h5Var.currentAccount).tonBlockchainExplorerUrl + str);
    }

    public static void x0(h5 h5Var, TLObject tLObject, eg.w2[] w2VarArr, Long l10, androidx.car.app.utils.b bVar, TLRPC.TL_error tL_error) {
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        if (tLObject instanceof TLRPC.TL_users_userFull) {
            TLRPC.TL_users_userFull tL_users_userFull = (TLRPC.TL_users_userFull) tLObject;
            MessagesController.getInstance(h5Var.currentAccount).putUsers(tL_users_userFull.users, false);
            MessagesController.getInstance(h5Var.currentAccount).putChats(tL_users_userFull.chats, false);
            TLRPC.UserFull userFull = tL_users_userFull.full_user;
            if (userFull != null && (disallowedGiftsSettings = userFull.disallowed_stargifts) != null && disallowedGiftsSettings.disallow_unique_stargifts) {
                new tc(w2VarArr[0].container, h5Var.resourcesProvider).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(l10.longValue())))).j();
                return;
            } else {
                bVar.run();
                return;
            }
        }
        mc Y = h5Var.getBulletinFactory().Y(tL_error);
        Y.f30662t = true;
        Y.j();
    }

    public static boolean x1(TL_stars.SavedStarGift savedStarGift, TL_stars.SavedStarGift savedStarGift2) {
        if (savedStarGift != savedStarGift2) {
            if (savedStarGift != null) {
                TL_stars.StarGift starGift = savedStarGift.gift;
                TL_stars.StarGift starGift2 = savedStarGift2.gift;
                if (starGift != starGift2) {
                    if ((starGift instanceof TL_stars.TL_starGiftUnique) && (starGift2 instanceof TL_stars.TL_starGiftUnique)) {
                        if (starGift.f22619id == starGift2.f22619id) {
                            return true;
                        }
                        return false;
                    } else if ((starGift instanceof TL_stars.TL_starGift) && (starGift2 instanceof TL_stars.TL_starGift) && starGift.f22619id == starGift2.f22619id && savedStarGift.date == savedStarGift2.date) {
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

    public static void y0(h5 h5Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        t1 t1Var = h5Var.f12182j1;
        h5Var.f12176g1 = false;
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            MessagesController.getInstance(h5Var.currentAccount).putUsers(paymentForm.users, false);
            h5Var.f12178h1 = paymentForm;
            AndroidUtilities.cancelRunOnUIThread(t1Var);
            AndroidUtilities.runOnUIThread(t1Var);
            return;
        }
        mc Y = h5Var.getBulletinFactory().Y(tL_error);
        Y.f30662t = true;
        Y.j();
    }

    public static boolean y1(TL_stars.TL_starGiftUnique tL_starGiftUnique, TL_stars.TL_starGiftUnique tL_starGiftUnique2) {
        if (tL_starGiftUnique != tL_starGiftUnique2) {
            if (tL_starGiftUnique != null) {
                if (tL_starGiftUnique.f22619id == tL_starGiftUnique2.f22619id || TextUtils.equals(tL_starGiftUnique.slug, tL_starGiftUnique2.slug)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public static void z0(h5 h5Var, TLObject tLObject, boolean z10, TLRPC.Document document, boolean z11, TLRPC.TL_error tL_error, TL_stars.saveStarGift savestargift) {
        i7 F;
        int i10;
        int i11;
        int i12;
        int i13;
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        if (U != null) {
            h2 h2Var = null;
            if (tLObject instanceof TLRPC.TL_boolTrue) {
                h5Var.dismiss();
                long A1 = h5Var.A1();
                if (!z10) {
                    s7.y(h5Var.currentAccount, false).Q(A1);
                }
                if (A1 >= 0) {
                    tc a02 = tc.a0(U);
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
                        h2Var = new h2(A1, U);
                    }
                    a02.s(document, string, AndroidUtilities.replaceSingleTag(string2, h2Var)).k(true);
                    return;
                }
                tc a03 = tc.a0(U);
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
                if (z10 && h5Var.f12197y0 != null && (F = s7.y(h5Var.currentAccount, false).F(h5Var.T, false)) != null) {
                    F.m(h5Var.f12197y0, !savestargift.unsave);
                }
                h5Var.getBulletinFactory().t(LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text), null).k(false);
            }
        }
    }

    public final long A1() {
        TLRPC.Peer peer;
        MessageObject messageObject = this.A0;
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
                        return this.A0.getDialogId();
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
        TL_stars.SavedStarGift savedStarGift = this.f12197y0;
        if (savedStarGift != null) {
            TL_stars.StarGift starGift2 = savedStarGift.gift;
            if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                return DialogObject.getPeerDialogId(((TL_stars.TL_starGiftUnique) starGift2).owner_id);
            }
            return this.T;
        }
        TL_stars.TL_starGiftUnique tL_starGiftUnique = this.C0;
        if (tL_starGiftUnique != null) {
            return DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id);
        }
        return 0L;
    }

    public final TL_stars.StarGift B1() {
        MessageObject messageObject = this.A0;
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
            TL_stars.SavedStarGift savedStarGift = this.f12197y0;
            if (savedStarGift != null) {
                return savedStarGift.gift;
            }
            TL_stars.TL_starGiftUnique tL_starGiftUnique = this.C0;
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
            StringBuilder sb2 = new StringBuilder();
            sb2.append(tL_starGiftUnique.title);
            sb2.append(" #");
            return j7.l1.m(tL_starGiftUnique.num, ',', sb2);
        }
        return "";
    }

    public final TL_stars.InputSavedStarGift E1() {
        TLRPC.Message message;
        TLRPC.Message message2;
        TLRPC.Message message3;
        long j10 = this.T;
        if (j10 < 0) {
            TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat = new TL_stars.TL_inputSavedStarGiftChat();
            tL_inputSavedStarGiftChat.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j10);
            MessageObject messageObject = this.A0;
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
            TL_stars.SavedStarGift savedStarGift = this.f12197y0;
            if (savedStarGift != null) {
                if ((savedStarGift.flags & 2048) == 0) {
                    return null;
                }
                tL_inputSavedStarGiftChat.saved_id = savedStarGift.saved_id;
                return tL_inputSavedStarGiftChat;
            } else if (this.C0 != null && !TextUtils.isEmpty(this.B0)) {
                TL_stars.TL_inputSavedStarGiftSlug tL_inputSavedStarGiftSlug = new TL_stars.TL_inputSavedStarGiftSlug();
                tL_inputSavedStarGiftSlug.slug = this.B0;
                return tL_inputSavedStarGiftSlug;
            } else {
                return tL_inputSavedStarGiftChat;
            }
        }
        MessageObject messageObject2 = this.A0;
        if (messageObject2 != null && messageObject2.getDialogId() < 0 && (message2 = this.A0.messageOwner) != null) {
            TLRPC.MessageAction messageAction2 = message2.action;
            if ((messageAction2 instanceof TLRPC.TL_messageActionStarGift) && (messageAction2.flags & 4096) != 0) {
                TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat2 = new TL_stars.TL_inputSavedStarGiftChat();
                tL_inputSavedStarGiftChat2.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.A0.getDialogId());
                tL_inputSavedStarGiftChat2.saved_id = ((TLRPC.TL_messageActionStarGift) messageAction2).saved_id;
                return tL_inputSavedStarGiftChat2;
            }
        }
        MessageObject messageObject3 = this.A0;
        if (messageObject3 != null && messageObject3.getDialogId() < 0 && (message = this.A0.messageOwner) != null) {
            TLRPC.MessageAction messageAction3 = message.action;
            if ((messageAction3 instanceof TLRPC.TL_messageActionStarGiftUnique) && (messageAction3.flags & 128) != 0) {
                TL_stars.TL_inputSavedStarGiftChat tL_inputSavedStarGiftChat3 = new TL_stars.TL_inputSavedStarGiftChat();
                tL_inputSavedStarGiftChat3.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.A0.getDialogId());
                tL_inputSavedStarGiftChat3.saved_id = ((TLRPC.TL_messageActionStarGiftUnique) messageAction3).saved_id;
                return tL_inputSavedStarGiftChat3;
            }
        }
        TL_stars.TL_inputSavedStarGiftUser tL_inputSavedStarGiftUser = new TL_stars.TL_inputSavedStarGiftUser();
        MessageObject messageObject4 = this.A0;
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
        TL_stars.SavedStarGift savedStarGift2 = this.f12197y0;
        if (savedStarGift2 != null) {
            tL_inputSavedStarGiftUser.msg_id = savedStarGift2.msg_id;
            return tL_inputSavedStarGiftUser;
        } else if (this.C0 != null && !TextUtils.isEmpty(this.B0)) {
            TL_stars.TL_inputSavedStarGiftSlug tL_inputSavedStarGiftSlug2 = new TL_stars.TL_inputSavedStarGiftSlug();
            tL_inputSavedStarGiftSlug2.slug = this.B0;
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
        l7 l7Var = this.f12198z0;
        if (l7Var != null) {
            TL_stars.SavedStarGift savedStarGift = this.f12197y0;
            if (savedStarGift != null) {
                indexOf = l7Var.indexOf(savedStarGift);
            } else {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = this.C0;
                if (tL_starGiftUnique != null) {
                    indexOf = l7Var.indexOf(tL_starGiftUnique);
                } else {
                    return -1;
                }
            }
            if (indexOf >= 0) {
                return indexOf;
            }
            TL_stars.StarGift B1 = B1();
            for (int i10 = 0; i10 < this.f12198z0.e(); i10++) {
                Object obj = this.f12198z0.get(i10);
                if (obj instanceof TL_stars.SavedStarGift) {
                    TL_stars.SavedStarGift savedStarGift2 = this.f12197y0;
                    if (savedStarGift2 != null) {
                        if (x1(savedStarGift2, (TL_stars.SavedStarGift) obj)) {
                            return i10;
                        }
                    }
                    if (B1 != null) {
                        TL_stars.StarGift starGift = ((TL_stars.SavedStarGift) obj).gift;
                        if (B1 != starGift) {
                            if ((B1 instanceof TL_stars.TL_starGiftUnique) && (starGift instanceof TL_stars.TL_starGiftUnique) && B1.f22619id == starGift.f22619id) {
                            }
                        }
                        return i10;
                    }
                    continue;
                } else {
                    if ((obj instanceof TL_stars.TL_starGiftUnique) && y1(this.C0, (TL_stars.TL_starGiftUnique) obj)) {
                        return i10;
                    }
                }
            }
            return -1;
        }
        return -1;
    }

    public final TL_stars.SavedStarGift H1(boolean z10) {
        int i10;
        Object obj;
        int G1 = G1();
        if (G1 < 0) {
            return null;
        }
        if (z10) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        int i11 = i10 + G1;
        int i12 = this.N0;
        if (i12 >= 0 && (!z10 ? i12 < G1 : i12 > G1)) {
            i11 = i12;
        }
        l7 l7Var = this.f12198z0;
        if (l7Var != null && i11 >= 0 && i11 < l7Var.e()) {
            obj = this.f12198z0.get(i11);
        } else {
            obj = null;
        }
        if (!(obj instanceof TL_stars.SavedStarGift)) {
            return null;
        }
        return (TL_stars.SavedStarGift) obj;
    }

    public final TL_stars.TL_starGiftUnique I1(boolean z10) {
        int i10;
        Object obj;
        int G1 = G1();
        if (G1 < 0) {
            return null;
        }
        if (z10) {
            i10 = 1;
        } else {
            i10 = -1;
        }
        int i11 = i10 + G1;
        int i12 = this.N0;
        if (i12 >= 0 && (!z10 ? i12 < G1 : i12 > G1)) {
            i11 = i12;
        }
        l7 l7Var = this.f12198z0;
        if (l7Var != null && i11 >= 0 && i11 < l7Var.e()) {
            obj = this.f12198z0.get(i11);
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

    public final boolean L1(boolean z10) {
        if (H1(z10) == null && I1(z10) == null) {
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
        throw new UnsupportedOperationException("Method not decompiled: jh.h5.Q1():void");
    }

    public final void R1(android.view.View r6) {
        throw new UnsupportedOperationException("Method not decompiled: jh.h5.R1(android.view.View):void");
    }

    public final void S1() {
        k3 k3Var = this.S0;
        if (k3Var != null && k3Var.isShown()) {
            this.S0.dismiss();
        }
        String F1 = F1();
        k3 k3Var2 = new k3(this, getContext(), F1, F1, this.resourcesProvider);
        this.S0 = k3Var2;
        k3Var2.f27845o0 = new ha.c(this, 21);
        k3Var2.show();
    }

    public final void T1() {
        throw new UnsupportedOperationException("Method not decompiled: jh.h5.T1():void");
    }

    public final void U1() {
        TL_stars.TL_starGiftUnique K1 = K1();
        if (K1 == null) {
            return;
        }
        ia.f1(getContext(), this.currentAccount, K1, new e3(this, K1, 2), this.resourcesProvider);
    }

    public final void V1(long j10, String str) {
        this.f12168c1 = true;
        s7.y(this.currentAccount, false).K(j10, new ih.b1(4, this, str));
    }

    public final void W1(boolean z10) {
        int i10;
        MessageObject messageObject = this.A0;
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
            TL_stars.SavedStarGift savedStarGift = this.f12197y0;
            if (savedStarGift != null) {
                i10 = savedStarGift.can_craft_at;
            }
            i10 = 0;
        }
        if (i10 > ConnectionsManager.getInstance(this.currentAccount).getCurrentTime()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
            String string = LocaleController.getString(R.string.GiftCraftLaterTitle);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
            c2Var.N = string;
            c2Var.P = LocaleController.formatString(R.string.GiftCraftLaterText, LocaleController.formatDateTime(i10, true));
            j7.l1.C(R.string.OK, alertDialog$Builder, null);
            return;
        }
        TL_stars.TL_starGiftUnique K1 = K1();
        if (K1 == null) {
            return;
        }
        if (!TextUtils.isEmpty(K1.gift_address)) {
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
            String string2 = LocaleController.getString(R.string.GiftCraftCantChooseFirstTitle);
            org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.f22714a;
            c2Var2.N = string2;
            c2Var2.P = LocaleController.getString(R.string.GiftCraftCantChooseFirst);
            j7.l1.C(R.string.OK, alertDialog$Builder2, null);
            return;
        }
        d5 d5Var = this.f12163a0;
        if (z10) {
            d5Var.H.a(this.currentAccount, K1.gift_id, K1.getDocument(), K1.title);
            if (t1()) {
                g4 g4Var = d5Var.H;
                TL_stars.TL_starGiftUnique K12 = K1();
                if (K12 == null) {
                    g4Var.getClass();
                } else {
                    while (true) {
                        e4[] e4VarArr = g4Var.f12112n;
                        if (i11 >= e4VarArr.length) {
                            break;
                        }
                        e4 e4Var = e4VarArr[i11];
                        TL_stars.StarGift starGift = e4Var.h;
                        if (starGift == null) {
                            starGift = null;
                        }
                        if (starGift == null) {
                            e4Var.a(K12, true);
                            break;
                        }
                        i11++;
                    }
                    g4Var.d(true);
                }
            }
        }
        g4 g4Var2 = d5Var.H;
        g4 g4Var3 = d5Var.H;
        g4Var2.setOnCraft(new o1(this, 1));
        if (this.P0 == null) {
            ih.p5 p5Var = new ih.p5(this.currentAccount, K1.gift_id);
            this.P0 = p5Var;
            p5Var.a();
        }
        g4Var3.setOnAddGift(new e3(this, K1, 1));
        g4Var3.setOnClose(new t1(this, 18));
        q2(4, true, null);
    }

    public final void X1(long j10) {
        nh.t3 t3Var = this.f12184k1;
        if (t3Var != null) {
            t3Var.e(true);
            this.f12184k1 = null;
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

    public final void Y1() {
        throw new UnsupportedOperationException("Method not decompiled: jh.h5.Y1():void");
    }

    public final void Z1(long j10, Utilities.Callback callback) {
        TLRPC.Message message;
        long j11;
        String str;
        TLRPC.User user;
        String formatString;
        CharSequence string;
        TL_stars.SavedStarGift savedStarGift = this.f12197y0;
        if (savedStarGift != null && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
            j11 = savedStarGift.transfer_stars;
        } else {
            MessageObject messageObject = this.A0;
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
            linearLayout.addView(new i4(getContext(), K1, user), i7.f6.t(-1, -2, 48, 0, -4, 0, 0));
            TextView textView = new TextView(getContext());
            org.telegram.ui.b.m(org.telegram.ui.ActionBar.g6.f23169j5, this.resourcesProvider, textView, 1, 16.0f);
            int i10 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
            if (i10 > 0) {
                formatString = LocaleController.formatPluralStringComma("Gift2TransferPriceText", (int) j11, C1(), DialogObject.getShortName(j10));
            } else {
                formatString = LocaleController.formatString(R.string.Gift2TransferText, C1(), str);
            }
            textView.setText(AndroidUtilities.replaceTags(formatString));
            linearLayout.addView(textView, i7.f6.t(-1, -2, 48, 24, 4, 24, 4));
            hz0 hz0Var = new hz0(getContext(), this.resourcesProvider);
            q1(hz0Var, s7.l(K1.attributes, TL_stars.starGiftAttributeModel.class));
            q1(hz0Var, s7.l(K1.attributes, TL_stars.starGiftAttributeBackdrop.class));
            q1(hz0Var, s7.l(K1.attributes, TL_stars.starGiftAttributePattern.class));
            if (!TextUtils.isEmpty(K1.slug) && (K1.flags & 256) != 0) {
                hz0Var.c(LocaleController.getString(R.string.GiftValue2), u3.c.e("~", BillingController.getInstance().formatCurrency(K1.value_amount, K1.value_currency, BillingController.getInstance().getCurrencyExp(K1.value_currency), true)), null, null);
            }
            linearLayout.addView(hz0Var, i7.f6.t(-1, -2, 48, 23, 16, 23, 4));
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
            alertDialog$Builder.n(linearLayout);
            if (i10 > 0) {
                string = ia.Q0(LocaleController.formatString(R.string.Gift2TransferDoPrice, Integer.valueOf((int) j11)));
            } else {
                string = LocaleController.getString(R.string.Gift2TransferDo);
            }
            alertDialog$Builder.k(string, new eg.n(callback, 19));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
            c2Var.T0 = true;
            c2Var.show();
        }
    }

    public final void a2() {
        TL_stars.InputSavedStarGift E1;
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
        nh.t3 t3Var = this.f12184k1;
        if (t3Var != null) {
            t3Var.e(true);
            this.f12184k1 = null;
        }
        if (this.V0 == null && (E1 = E1()) != null) {
            MessageObject messageObject = this.A0;
            long j13 = this.T;
            if (messageObject != null) {
                TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
                if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                    TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                    j11 = tL_messageActionStarGift.gift.f22619id;
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
                        if (DialogObject.getPeerDialogId(tL_messageActionStarGift.from_id) != this.A0.getFromChatId()) {
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
                TL_stars.SavedStarGift savedStarGift = this.f12197y0;
                if (savedStarGift != null) {
                    TL_stars.StarGift starGift = savedStarGift.gift;
                    j11 = starGift.f22619id;
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
                    TL_stars.SavedStarGift savedStarGift2 = this.f12197y0;
                    str = savedStarGift2.prepaid_upgrade_hash;
                    z13 = savedStarGift2.upgrade_separate;
                } else {
                    return;
                }
            }
            TextView textView = this.f12191s0;
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
            hp hpVar = this.f12190r0;
            hpVar.a(z14, false);
            ArrayList arrayList = this.f12170d1;
            if (arrayList != null && (j12 > j10 || this.f12178h1 != null)) {
                b2();
                return;
            }
            if (arrayList == null) {
                s7.y(this.currentAccount, false).K(j11, new y2(this, 1));
            }
            if (j12 <= j10 && this.f12178h1 == null) {
                this.f12176g1 = true;
                TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                if (!TextUtils.isEmpty(str)) {
                    TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade tL_inputInvoiceStarGiftPrepaidUpgrade = new TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade();
                    tL_inputInvoiceStarGiftPrepaidUpgrade.hash = str;
                    tL_inputInvoiceStarGiftPrepaidUpgrade.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j13);
                    tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftPrepaidUpgrade;
                } else {
                    TLRPC.TL_inputInvoiceStarGiftUpgrade tL_inputInvoiceStarGiftUpgrade = new TLRPC.TL_inputInvoiceStarGiftUpgrade();
                    tL_inputInvoiceStarGiftUpgrade.keep_original_details = hpVar.f29211a.f26324q;
                    tL_inputInvoiceStarGiftUpgrade.stargift = E1;
                    tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftUpgrade;
                }
                JSONObject p10 = ph.p2.p(this.resourcesProvider, false);
                if (p10 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                    tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                    tL_dataJSON.data = p10.toString();
                    tL_payments_getPaymentForm.flags |= 1;
                }
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getPaymentForm, new g3(this, 0));
            }
        }
    }

    public final void b2() {
        throw new UnsupportedOperationException("Method not decompiled: jh.h5.b2():void");
    }

    public final void c2(final TL_stars.TL_starGiftUnique tL_starGiftUnique, final long j10, final kf.b bVar, final TLRPC.TL_textWithEntities tL_textWithEntities, final boolean z10, final ih.v0 v0Var) {
        this.f12173f0.setLoading(true);
        if (v0Var != null && !v0Var.H) {
            v0Var.H = true;
            v0Var.D.h(true);
        }
        s7.x(this.currentAccount, bVar).H(tL_starGiftUnique, j10, tL_textWithEntities, z10, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                h5.a1(h5.this, v0Var, bVar, tL_starGiftUnique, j10, tL_textWithEntities, z10, (TLRPC.TL_payments_paymentFormStarGift) obj);
            }
        });
    }

    @Override
    public final boolean canDismissWithSwipe() {
        if (this.U0.c(4)) {
            boolean z10 = this.f12163a0.H.f12104d0;
        }
        return false;
    }

    @Override
    public final boolean canDismissWithTouchOutside() {
        if (this.U0.c(4) && this.f12163a0.H.f12104d0) {
            return false;
        }
        return super.canDismissWithTouchOutside();
    }

    @Override
    public final boolean canSwipeToBack(MotionEvent motionEvent) {
        if (this.U0.c(4) && this.f12163a0.H.f12104d0) {
            return false;
        }
        return super.canSwipeToBack(motionEvent);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starUserGiftsLoaded) {
            if (this.f12198z0 == ((k7) objArr[1])) {
                g4 g4Var = this.f12163a0.H;
                if (g4Var == null || !g4Var.f12104d0) {
                    t2();
                }
            }
        }
    }

    @Override
    public final void dismiss() {
        if (this.U0.c(4) && this.f12163a0.H.f12104d0) {
            return;
        }
        ih.p5 p5Var = this.P0;
        if (p5Var != null) {
            p5Var.b();
            this.P0 = null;
        }
        s4 s4Var = this.I0;
        if (s4Var != null) {
            s4Var.a();
        }
        super.dismiss();
    }

    public final SpannableStringBuilder e2(TLRPC.Peer peer) {
        if (peer != null) {
            String publicUsername = DialogObject.getPublicUsername(MessagesController.getInstance(this.currentAccount).getUserOrChat(DialogObject.getPeerDialogId(peer)));
            if (TextUtils.isEmpty(publicUsername)) {
                return null;
            }
            return AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.Gift2ReleasedBy2, u3.c.e("@", publicUsername)), new u2(this, publicUsername, 8));
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
    public tc getBulletinFactory() {
        return new tc(this.f12183k0, this.resourcesProvider);
    }

    public final void h2(String str, TL_stars.TL_starGiftUnique tL_starGiftUnique, l7 l7Var) {
        boolean z10;
        boolean z11;
        s4 s4Var;
        TL_stars.TL_starGiftUnique tL_starGiftUnique2;
        this.B0 = str;
        this.C0 = tL_starGiftUnique;
        this.f12198z0 = l7Var;
        if (tL_starGiftUnique.resell_amount != null && !N1(this.currentAccount, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id))) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.D0 = z10;
        if (!this.J0 && (s4Var = this.I0) != null && s4Var.f12770o && (tL_starGiftUnique2 = s4Var.f12767l) != null && tL_starGiftUnique2.f22619id != tL_starGiftUnique.f22619id) {
            s4Var.a();
            this.I0 = null;
            d5 d5Var = this.f12163a0;
            d5Var.f11907b.setAlpha(1.0f);
            d5Var.f11909c.setAlpha(0.0f);
        }
        this.Z.b(this.currentAccount, this.f12197y0);
        k2(tL_starGiftUnique, false, null, null);
        String str2 = tL_starGiftUnique.owner_address;
        String str3 = tL_starGiftUnique.gift_address;
        if (tL_starGiftUnique.host_id != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        y80 y80Var = this.f12167c0;
        if (z11 && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            y80Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2InBlockchain), new u2(this, str3, 3)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            y80Var.setVisibility(0);
            y80Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23294q5, this.resourcesProvider));
        } else {
            y80Var.setVisibility(8);
        }
        y80 y80Var2 = this.f12171e0;
        if (!z11 && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            y80Var2.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2InBlockchain), new u2(this, str3, 4)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            y80Var2.setVisibility(0);
        } else {
            y80Var2.setVisibility(8);
        }
        if (this.D0) {
            l2(tL_starGiftUnique);
            this.f12173f0.setOnClickListener(new l1(this, 7));
        }
        if (this.X0) {
            q2(0, false, null);
            this.f34659c.n0(1);
            this.X0 = false;
        }
        t2();
    }

    public final void i2(org.telegram.messenger.MessageObject r56, jh.l7 r57) {
        throw new UnsupportedOperationException("Method not decompiled: jh.h5.i2(org.telegram.messenger.MessageObject, jh.l7):void");
    }

    public final void j2(TL_stars.SavedStarGift savedStarGift, l7 l7Var) {
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
        s4 s4Var;
        if (savedStarGift == null) {
            return;
        }
        int i20 = this.currentAccount;
        long j11 = this.T;
        this.f12196x0 = N1(i20, j11);
        this.f12197y0 = savedStarGift;
        this.f12198z0 = l7Var;
        this.A0 = null;
        boolean z13 = this.J0;
        d5 d5Var = this.f12163a0;
        if (!z13 && (s4Var = this.I0) != null && s4Var.f12770o && s4Var.f12767l != null) {
            s4Var.a();
            this.I0 = null;
            d5Var.f11907b.setVisibility(0);
            d5Var.f11909c.setVisibility(4);
        }
        this.Z.b(this.currentAccount, savedStarGift);
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
            k2(tL_starGiftUnique, z14, tLObject, savedStarGift.message);
        } else {
            if (this.f12196x0 && clientUserId == peerDialogId && i21 >= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z15 = z11;
            boolean P1 = P1(this.currentAccount, K1());
            F1();
            d5Var.f(starGift4, false, false, P1);
            hz0 hz0Var = this.f12169d0;
            hz0Var.removeAllViews();
            SpannableString spannableString = "";
            if (z15) {
                if (savedStarGift.gift_num != 0 && (starGift3 = savedStarGift.gift) != null && starGift3.title != null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(savedStarGift.gift.title);
                    sb2.append(" #");
                    j10 = clientUserId;
                    string4 = j7.l1.m(savedStarGift.gift_num, ',', sb2);
                } else {
                    j10 = clientUserId;
                    string4 = LocaleController.getString(R.string.Gift2TitleSaved);
                }
                this.O0 = string4;
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
                d5Var.i(0, string4, replaceTags, f2(savedStarGift.gift));
            } else {
                j10 = clientUserId;
                if (z10 && !this.f12196x0) {
                    String string5 = LocaleController.getString(R.string.Gift2TitleProfile);
                    this.O0 = string5;
                    d5Var.i(0, string5, null, e2(savedStarGift.gift.released_by));
                } else {
                    boolean z16 = this.f12196x0;
                    if ((!z16 || savedStarGift.can_upgrade) && savedStarGift.upgrade_stars > 0) {
                        if (z16) {
                            i10 = R.string.Gift2TitleReceived;
                        } else {
                            i10 = R.string.Gift2TitleProfile;
                        }
                        String string6 = LocaleController.getString(i10);
                        this.O0 = string6;
                        if (z14 || !this.f12196x0) {
                            string = null;
                        } else {
                            string = LocaleController.getString(R.string.Gift2InfoInFreeUpgrade);
                        }
                        d5Var.i(0, string6, string, f2(savedStarGift.gift));
                    } else {
                        if (savedStarGift.gift_num != 0 && (starGift = savedStarGift.gift) != null && starGift.title != null) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(savedStarGift.gift.title);
                            sb3.append(" #");
                            string2 = j7.l1.m(savedStarGift.gift_num, ',', sb3);
                        } else {
                            if (z16) {
                                i11 = R.string.Gift2TitleReceived;
                            } else {
                                i11 = R.string.Gift2TitleProfile;
                            }
                            string2 = LocaleController.getString(i11);
                        }
                        this.O0 = string2;
                        if (z14 || !this.f12196x0) {
                            i12 = 0;
                            charSequence = null;
                        } else {
                            if (!isBot && s1()) {
                                if (this.f12196x0) {
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
                            } else if (this.f12196x0) {
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
                            if (!isBot && s1()) {
                                charSequence2 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2More).replace(' ', (char) 160), new t1(this, 1)), true);
                            } else {
                                charSequence2 = spannableString;
                            }
                            i12 = 0;
                            charSequence = TextUtils.concat(replaceTags2, " ", charSequence2);
                        }
                        d5Var.i(i12, string2, charSequence, f2(savedStarGift.gift));
                    }
                }
            }
            if (j10 != peerDialogId || z10) {
                TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerDialogId));
                String string7 = LocaleController.getString(R.string.Gift2From);
                int i22 = this.currentAccount;
                u1 u1Var = new u1(this, peerDialogId, 1);
                if (peerDialogId != j10 && peerDialogId != 2666000 && !isBot && !UserObject.isDeleted(user) && !z10) {
                    str2 = LocaleController.getString(R.string.Gift2ButtonSendGift);
                } else {
                    str2 = null;
                }
                this.f12169d0.j(string7, i22, peerDialogId, u1Var, str2, new u1(this, peerDialogId, 2));
            }
            hz0Var.c(LocaleController.getString(R.string.StarsTransactionDate), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(savedStarGift.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(savedStarGift.date * 1000))), null, null);
            String string8 = LocaleController.getString(R.string.Gift2Value);
            String m10 = j7.l1.m(savedStarGift.gift.stars + savedStarGift.upgrade_stars, ',', new StringBuilder("⭐️ "));
            if (s1() && !z14) {
                r12 = 0;
                spannableString = wc.b(LocaleController.formatPluralStringComma("Gift2ButtonSell", (int) savedStarGift.convert_stars), new t1(this, 4), this.resourcesProvider, null);
            } else {
                r12 = 0;
            }
            hz0Var.c(string8, ia.X0(false, TextUtils.concat(m10, " ", spannableString), 0.8f, r12), r12, r12);
            TL_stars.StarGift starGift5 = savedStarGift.gift;
            if (starGift5.limited && !z14) {
                ia.F0(hz0Var, this.currentAccount, starGift5, this.resourcesProvider);
            }
            TLRPC.TL_textWithEntities tL_textWithEntities2 = savedStarGift.message;
            if (tL_textWithEntities2 != null && !TextUtils.isEmpty(tL_textWithEntities2.text) && !z14) {
                TLRPC.TL_textWithEntities tL_textWithEntities3 = savedStarGift.message;
                hz0Var.b(tL_textWithEntities3.text, tL_textWithEntities3.entities);
            }
            boolean z17 = this.f12196x0;
            nh.d dVar = this.f12173f0;
            if (z17 && savedStarGift.can_upgrade) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("^  ");
                if (this.W0 == null) {
                    i16 = 0;
                    this.W0 = new iq(0, new e5(dVar, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, this.resourcesProvider)));
                } else {
                    i16 = 0;
                }
                spannableStringBuilder.setSpan(this.W0, i16, 1, 33);
                if (savedStarGift.upgrade_stars > 0) {
                    string3 = LocaleController.getString(R.string.Gift2UpgradeButtonFree);
                } else {
                    string3 = LocaleController.getString(R.string.Gift2UpgradeButtonGift);
                }
                spannableStringBuilder.append((CharSequence) string3);
                dVar.setFilled(true);
                dVar.g(spannableStringBuilder, !this.X0, true);
                dVar.f(null, !this.X0);
                dVar.setOnClickListener(new l1(this, 3));
            } else if (this.m0 && z17 && this.V != null && this.f12198z0 != null && G1() >= 0 && this.f12198z0.b(G1()) >= 0) {
                dVar.setFilled(false);
                int b10 = this.f12198z0.b(G1());
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.Gift2UpgradeNext));
                Object obj = this.f12198z0.get(b10);
                if ((obj instanceof TL_stars.SavedStarGift) && (starGift2 = ((TL_stars.SavedStarGift) obj).gift) != null && (document = starGift2.getDocument()) != null) {
                    spannableStringBuilder2.append((CharSequence) " e");
                    r122 = 1;
                    spannableStringBuilder2.setSpan(new org.telegram.ui.Components.y5(document, dVar.getTextPaint().getFontMetricsInt()), spannableStringBuilder2.length() - 1, spannableStringBuilder2.length(), 33);
                } else {
                    r122 = 1;
                }
                dVar.g(spannableStringBuilder2, (this.X0 ? 1 : 0) ^ r122, r122);
                dVar.f(null, (this.X0 ? 1 : 0) ^ r122);
                dVar.setOnClickListener(new x1(this, b10, r122));
            } else if ((savedStarGift.gift instanceof TL_stars.TL_starGift) && !TextUtils.isEmpty(savedStarGift.prepaid_upgrade_hash)) {
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("^  ");
                if (this.W0 == null) {
                    i15 = 0;
                    this.W0 = new iq(0, new e5(dVar, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, this.resourcesProvider)));
                } else {
                    i15 = 0;
                }
                spannableStringBuilder3.setSpan(this.W0, i15, 1, 33);
                spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2GiftAnUpgrade));
                dVar.setFilled(true);
                dVar.g(spannableStringBuilder3, !this.X0, true);
                dVar.f(null, !this.X0);
                dVar.setOnClickListener(new l1(this, 5));
            } else {
                dVar.setFilled(true);
                dVar.g(LocaleController.getString(R.string.OK), !this.X0, true);
                dVar.f(null, !this.X0);
                dVar.setOnClickListener(new l1(this, 6));
            }
            str3 = null;
            str4 = null;
            z12 = false;
        }
        boolean z18 = savedStarGift.refunded;
        y80 y80Var = this.f12167c0;
        if (z18) {
            y80Var.setVisibility(0);
            y80Var.setText(LocaleController.getString(R.string.Gift2Refunded));
            y80Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23295q7, this.resourcesProvider));
        } else if (z12 && !TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
            y80Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2InBlockchain), new u2(this, str4, 1)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            y80Var.setVisibility(0);
            y80Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23294q5, this.resourcesProvider));
        } else if (TextUtils.isEmpty(str3) && TextUtils.isEmpty(str4) && this.f12196x0 && (savedStarGift.gift instanceof TL_stars.TL_starGift) && savedStarGift.name_hidden) {
            y80Var.setVisibility(0);
            if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
                i17 = R.string.Gift2InSenderMessageHidden2;
            } else {
                i17 = R.string.Gift2InSenderHidden2;
            }
            y80Var.setText(LocaleController.getString(i17));
            y80Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23294q5, this.resourcesProvider));
        } else {
            y80Var.setVisibility(8);
        }
        y80 y80Var2 = this.f12171e0;
        if (!z12 && !TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
            y80Var2.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2InBlockchain), new u2(this, str4, 2)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            r13 = 0;
            y80Var2.setVisibility(0);
        } else if (this.f12196x0 && N1(this.currentAccount, j11)) {
            if (i21 >= 0) {
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                if (savedStarGift.unsaved) {
                    spannableStringBuilder4.append((CharSequence) ". ");
                    spannableStringBuilder4.setSpan(new iq(R.drawable.mini_gift_hidden, 0), 0, 1, 33);
                }
                if (!savedStarGift.unsaved) {
                    i19 = R.string.Gift2ProfileVisible4;
                } else {
                    i19 = R.string.Gift2ProfileInvisible4;
                }
                spannableStringBuilder4.append((CharSequence) AndroidUtilities.replaceSingleTag(LocaleController.getString(i19), new t1(this, 3)));
                y80Var2.setText(AndroidUtilities.replaceArrows(spannableStringBuilder4, true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            } else {
                if (!savedStarGift.unsaved) {
                    i18 = R.string.Gift2ChannelProfileVisible3;
                } else {
                    i18 = R.string.Gift2ChannelProfileInvisible3;
                }
                y80Var2.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(i18), new t1(this, 3)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            }
            r13 = 0;
            y80Var2.setVisibility(0);
        } else {
            r13 = 0;
            y80Var2.setVisibility(8);
        }
        if (this.X0) {
            q2(r13, r13, null);
            this.f34659c.n0(1);
            this.X0 = r13;
        }
        this.f34660e.setTitle(this.O0);
        t2();
    }

    public final void k2(org.telegram.tgnet.tl.TL_stars.TL_starGiftUnique r42, boolean r43, org.telegram.tgnet.TLObject r44, org.telegram.tgnet.TLRPC.TL_textWithEntities r45) {
        throw new UnsupportedOperationException("Method not decompiled: jh.h5.k2(org.telegram.tgnet.tl.TL_stars$TL_starGiftUnique, boolean, org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_textWithEntities):void");
    }

    public final void l2(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        kf.a resellAmount = tL_starGiftUnique.getResellAmount(kf.b.f13635a);
        boolean z10 = tL_starGiftUnique.resale_ton_only;
        nh.d dVar = this.f12173f0;
        if (z10) {
            dVar.g(ia.S0(LocaleController.formatString(R.string.ResellGiftBuyTON, tL_starGiftUnique.getResellAmount(kf.b.f13636b).d()), true), !this.X0, true);
            dVar.f(ia.Q0(LocaleController.formatPluralStringComma("ResellGiftBuyEq", (int) resellAmount.a())), !this.X0);
            return;
        }
        dVar.g(ia.Q0(LocaleController.formatPluralStringComma("ResellGiftBuy", (int) resellAmount.a())), !this.X0, true);
        dVar.f(null, !this.X0);
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
        StringBuilder sb2 = new StringBuilder();
        sb2.append(K1.title);
        sb2.append(" #");
        this.f12194v0.setText(LocaleController.formatString(R.string.Gift2WearTitle, j7.l1.m(K1.num, ',', sb2)));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.Gift2WearStart));
        if (peerDialogId == UserConfig.getInstance(this.currentAccount).getClientUserId() && !UserConfig.getInstance(this.currentAccount).isPremium()) {
            spannableStringBuilder.append((CharSequence) " l");
            if (this.Q0 == null) {
                this.Q0 = new iq(R.drawable.msg_mini_lock3, 0);
            }
            spannableStringBuilder.setSpan(this.Q0, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        nh.d dVar = this.f12173f0;
        dVar.g(spannableStringBuilder, true, true);
        dVar.f(null, true);
        dVar.setOnClickListener(new l1(this, 21));
        this.f12163a0.setWearPreview(MessagesController.getInstance(this.currentAccount).getUserOrChat(peerDialogId));
        q2(2, false, null);
        this.f12192t0 = true;
    }

    public final void n2(CharSequence charSequence) {
        TL_stars.TL_starGiftUnique K1 = K1();
        TL_stars.InputSavedStarGift E1 = E1();
        if (E1 != null && K1 != null) {
            TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails = new TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails();
            tL_inputInvoiceStarGiftDropOriginalDetails.stargift = E1;
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftDropOriginalDetails;
            JSONObject p10 = ph.p2.p(this.resourcesProvider, false);
            if (p10 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = p10.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getPaymentForm, new ih.c1(this, charSequence, K1, tL_inputInvoiceStarGiftDropOriginalDetails, 1));
        }
    }

    public final void o2(View view, CharSequence charSequence, boolean z10) {
        Layout layout;
        float primaryHorizontal;
        int i10;
        nh.t3 t3Var = this.f12184k1;
        if ((t3Var == null || !t3Var.R || this.l1 != view) && view != null) {
            if (z10) {
                if (view instanceof org.telegram.ui.ActionBar.h5) {
                    org.telegram.ui.ActionBar.h5 h5Var = (org.telegram.ui.ActionBar.h5) view;
                    primaryHorizontal = (h5Var.getRightDrawableWidth() / 2.0f) + h5Var.getRightDrawableX();
                } else {
                    return;
                }
            } else {
                if (view instanceof TextView) {
                    layout = ((TextView) view).getLayout();
                } else if (view instanceof org.telegram.ui.ActionBar.h5) {
                    layout = ((org.telegram.ui.ActionBar.h5) view).getLayout();
                } else {
                    return;
                }
                if (layout != null) {
                    CharSequence text = layout.getText();
                    if (text instanceof Spanned) {
                        Spanned spanned = (Spanned) text;
                        wc[] wcVarArr = (wc[]) spanned.getSpans(0, spanned.length(), wc.class);
                        if (wcVarArr != null && wcVarArr.length > 0) {
                            wc wcVar = wcVarArr[wcVarArr.length - 1];
                            primaryHorizontal = layout.getPrimaryHorizontal(spanned.getSpanStart(wcVar)) + view.getPaddingLeft() + (wcVar.a() / 2.0f);
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
            bg.u1 u1Var = this.U;
            u1Var.getLocationOnScreen(iArr);
            int[] iArr2 = {iArr2[0] - iArr[0], iArr2[1] - iArr[1]};
            nh.t3 t3Var2 = this.f12184k1;
            if (t3Var2 != null) {
                t3Var2.e(true);
                this.f12184k1 = null;
            }
            nh.t3 t3Var3 = new nh.t3(getContext(), 3);
            t3Var3.q(!z10);
            t3Var3.t(charSequence);
            t3Var3.n(0.0f, (iArr2[0] + primaryHorizontal) - (AndroidUtilities.dp(16.0f) + this.backgroundPaddingLeft));
            float dp = (iArr2[1] - AndroidUtilities.dp(100.0f)) - (view.getHeight() / 2.0f);
            if (z10) {
                i10 = 18;
            } else {
                i10 = 0;
            }
            t3Var3.setTranslationY(dp + AndroidUtilities.dp(i10 + 4.33f));
            t3Var3.d = 3000L;
            t3Var3.setPadding(AndroidUtilities.dp(16.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(16.0f) + this.backgroundPaddingLeft, 0);
            t3Var3.f18597h0 = new ih.x(t3Var3, 1);
            t3Var3.v();
            u1Var.addView(t3Var3, i7.f6.c(100.0f, -1));
            this.f12184k1 = t3Var3;
            this.l1 = view;
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starUserGiftsLoaded);
    }

    @Override
    public final void onBackPressed() {
        d5 d5Var;
        g4 g4Var;
        if (this.U0.c(4) && (d5Var = this.f12163a0) != null && (g4Var = d5Var.H) != null) {
            if (g4Var.f12104d0) {
                return;
            }
            if (g4Var.f12106e0) {
                super.onBackPressed();
                return;
            }
        }
        if (!this.f12192t0 && this.U0.f163b > 0 && !this.f12173f0.J && !this.f12168c1) {
            MessageObject messageObject = this.A0;
            if (messageObject != null) {
                i2(messageObject, null);
            } else {
                TL_stars.SavedStarGift savedStarGift = this.f12197y0;
                if (savedStarGift != null) {
                    j2(savedStarGift, this.f12198z0);
                } else {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = this.C0;
                    if (tL_starGiftUnique != null) {
                        h2(this.B0, tL_starGiftUnique, this.f12198z0);
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
        nh.t3 t3Var = this.f12184k1;
        if (t3Var != null) {
            t3Var.e(true);
            this.f12184k1 = null;
        }
    }

    public final void p1(TL_stars.StarGiftAttribute starGiftAttribute) {
        String string;
        char c3;
        s4 s4Var;
        TL_stars.StarGiftAttribute starGiftAttribute2;
        h5 h5Var;
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
        if (!this.J0 && ((s4Var = this.I0) == null || !s4Var.f12770o)) {
            boolean[] zArr = new boolean[1];
            vc[] vcVarArr = new vc[1];
            Integer[] numArr = new Integer[1];
            String J1 = J1(starGiftAttribute.rarity, numArr);
            if (starGiftAttribute.rarity instanceof TL_stars.TL_starGiftAttributeRarity) {
                starGiftAttribute2 = starGiftAttribute;
                cVar = new androidx.car.app.utils.c(this, zArr, starGiftAttribute2, vcVarArr, 7);
                h5Var = this;
            } else {
                starGiftAttribute2 = starGiftAttribute;
                h5Var = this;
                cVar = null;
            }
            vcVarArr[0] = (vc) ((ez0) h5Var.f12169d0.e(string, starGiftAttribute2.name, J1, cVar, numArr[0]).getChildAt(1)).getChildAt(0);
            return;
        }
        x4 x4Var = new x4(getContext(), this.resourcesProvider, new o1(this, 0));
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        hz0 hz0Var = this.f12169d0;
        tableRow.addView(new gz0(hz0Var, string), layoutParams);
        tableRow.addView(new ez0(hz0Var, x4Var, true), new TableRow.LayoutParams(0, -1, 1.0f));
        hz0Var.addView(tableRow);
        s4 s4Var2 = this.I0;
        if (s4Var2 != null) {
            if (c3 == 0) {
                s4Var2.d = x4Var;
            }
            if (c3 == 1) {
                s4Var2.f12760c = x4Var;
            }
            if (c3 == 2) {
                s4Var2.f12759b = x4Var;
            }
        }
    }

    public final void p2(int i10, Context context, boolean z10) {
        int i11;
        int i12;
        LinearLayout g10 = org.telegram.messenger.x3.g(context, 1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackground(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(64.0f), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, this.resourcesProvider)));
        g10.addView(frameLayout, i7.f6.t(64, 64, 49, 0, 6, 0, 0));
        ?? imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.f(R.raw.timer_3, 42, 42, null);
        frameLayout.addView((View) imageView, i7.f6.q(64, 64, 17));
        imageView.d();
        TextView b10 = i7.j6.b(context, 20.0f, org.telegram.ui.ActionBar.g6.G6, true, null);
        b10.setGravity(17);
        if (z10) {
            i11 = R.string.Gift2ResellTimeoutTitle;
        } else {
            i11 = R.string.Gift2TransferTimeoutTitle;
        }
        b10.setText(LocaleController.getString(i11));
        g10.addView(b10, i7.f6.t(-1, -2, 48, 24, 14, 24, 0));
        TextView b11 = i7.j6.b(context, 14.0f, org.telegram.ui.ActionBar.g6.F6, false, null);
        b11.setGravity(17);
        if (z10) {
            i12 = R.string.Gift2ResellTimeout;
        } else {
            i12 = R.string.Gift2TransferTimeout;
        }
        b11.setText(LocaleController.formatString(i12, LocaleController.formatTTLString(Math.max(10, i10))));
        g10.addView(b11, i7.f6.t(-1, -2, 48, 24, 6, 24, 6));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, this.resourcesProvider);
        alertDialog$Builder.n(g10);
        j7.l1.C(R.string.OK, alertDialog$Builder, null);
    }

    public final void q2(int r12, boolean r13, hh.f r14) {
        throw new UnsupportedOperationException("Method not decompiled: jh.h5.q2(int, boolean, hh.f):void");
    }

    public final void r1(TL_stars.InputSavedStarGift inputSavedStarGift, TLRPC.Updates updates, Runnable runnable) {
        TLRPC.Message message;
        TL_stars.StarGift starGift;
        if (updates == null) {
            s7.y(this.currentAccount, false).Q(A1());
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
            TL_stars.SavedStarGift savedStarGift = this.f12197y0;
            if (savedStarGift != null && (!(inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftUser) ? !(!(inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftChat) ? !(inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftSlug) || (starGift = savedStarGift.gift) == null || !TextUtils.equals(starGift.slug, ((TL_stars.TL_inputSavedStarGiftSlug) inputSavedStarGift).slug) : savedStarGift.saved_id != ((TL_stars.TL_inputSavedStarGiftChat) inputSavedStarGift).saved_id) : savedStarGift.msg_id == ((TL_stars.TL_inputSavedStarGiftUser) inputSavedStarGift).msg_id)) {
                TLRPC.MessageAction messageAction = message.action;
                if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                    this.J0 = true;
                    TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                    TL_stars.SavedStarGift savedStarGift2 = this.f12197y0;
                    savedStarGift2.gift = tL_messageActionStarGiftUnique.gift;
                    savedStarGift2.msg_id = message.f22413id;
                    savedStarGift2.flags = (savedStarGift2.flags | 8) & (-2049);
                    savedStarGift2.saved_id = 0L;
                    savedStarGift2.unsaved = !tL_messageActionStarGiftUnique.saved;
                    savedStarGift2.refunded = tL_messageActionStarGiftUnique.refunded;
                    savedStarGift2.can_upgrade = false;
                    savedStarGift2.can_resell_at = tL_messageActionStarGiftUnique.can_resell_at;
                    savedStarGift2.can_transfer_at = tL_messageActionStarGiftUnique.can_transfer_at;
                    savedStarGift2.can_export_at = tL_messageActionStarGiftUnique.can_export_at;
                    j2(savedStarGift2, this.f12198z0);
                    this.f12170d1 = null;
                    this.J0 = false;
                    l7 l7Var = this.f12198z0;
                    if (l7Var != null) {
                        l7Var.d();
                    } else {
                        s7.y(this.currentAccount, false).Q(this.T);
                    }
                    AndroidUtilities.runOnUIThread(runnable);
                    return;
                }
            }
            if (this.f12198z0 == null) {
                s7.y(this.currentAccount, false).Q(A1());
            }
            this.J0 = true;
            this.f12197y0 = null;
            this.f12196x0 = false;
            MessageObject messageObject = new MessageObject(this.currentAccount, message, false, false);
            messageObject.setType();
            i2(messageObject, this.f12198z0);
            this.f12170d1 = null;
            this.J0 = false;
            AndroidUtilities.runOnUIThread(runnable);
            return;
        }
        s7.y(this.currentAccount, false).Q(A1());
        dismiss();
    }

    public final void r2(boolean z10) {
        int i10;
        int i11;
        TL_stars.TL_starGiftUnique K1 = K1();
        if (K1 == null) {
            return;
        }
        MessagesController.getGlobalMainSettings().edit().putInt("statusgiftpage", 3).apply();
        boolean P1 = P1(this.currentAccount, K1());
        boolean z11 = !P1;
        boolean P12 = P1(this.currentAccount, K1());
        nh.d dVar = this.f12173f0;
        if (P12) {
            MessagesController.getInstance(this.currentAccount).updateEmojiStatus(A1(), new TLRPC.TL_emojiStatusEmpty(), null);
        } else {
            final long A1 = A1();
            if (A1 >= 0) {
                if (!UserConfig.getInstance(this.currentAccount).isPremium()) {
                    mc P = getBulletinFactory().P(R.raw.star_premium_2, AndroidUtilities.premiumText(LocaleController.getString(R.string.Gift2ActionWearNeededPremium), new t1(this, 24)));
                    P.f30662t = true;
                    P.j();
                    return;
                }
            } else if (!z10) {
                final MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
                dVar.setLoading(true);
                MessagesController.getInstance(this.currentAccount).getBoostsController().getBoostsStats(A1, new f5.d() {
                    @Override
                    public final void accept(Object obj) {
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                        h5 h5Var = h5.this;
                        if (tL_premium_boostsStatus != null) {
                            int i12 = tL_premium_boostsStatus.level;
                            MessagesController messagesController2 = messagesController;
                            if (i12 < messagesController2.channelEmojiStatusLevelMin) {
                                ChannelBoostsController boostsController = messagesController2.getBoostsController();
                                long j10 = A1;
                                boostsController.userCanBoostChannel(j10, tL_premium_boostsStatus, new w1(h5Var, tL_premium_boostsStatus, j10, messagesController2, 0));
                                return;
                            }
                        }
                        h5Var.f12173f0.setLoading(false);
                        h5Var.r2(true);
                    }
                });
                return;
            }
            TLRPC.TL_inputEmojiStatusCollectible tL_inputEmojiStatusCollectible = new TLRPC.TL_inputEmojiStatusCollectible();
            tL_inputEmojiStatusCollectible.collectible_id = K1.f22619id;
            MessagesController.getInstance(this.currentAccount).updateEmojiStatus(A1(), tL_inputEmojiStatusCollectible, K1);
        }
        bg.d1 d1Var = this.f12163a0.E[1];
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
        d1Var.b(i10, LocaleController.getString(i11), true);
        if (this.f12192t0) {
            dismiss();
            return;
        }
        hh.f fVar = new hh.f(2, this, z11);
        if (this.U0.c(0)) {
            fVar.run();
        } else {
            q2(0, true, fVar);
        }
        dVar.g(LocaleController.getString(R.string.OK), !this.X0, true);
        dVar.f(null, !this.X0);
        dVar.setOnClickListener(new l1(this, 0));
    }

    public final boolean s1() {
        int i10;
        boolean z10;
        boolean z11;
        TLRPC.Peer peer;
        if (E1() == null) {
            return false;
        }
        MessageObject messageObject = this.A0;
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
                if (this.A0.getDialogId() == UserConfig.getInstance(this.currentAccount).getClientUserId()) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                int currentTime = MessagesController.getInstance(this.currentAccount).stargiftsConvertPeriodMax - (ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() - this.A0.messageOwner.date);
                if (((z10 || (isOutOwner && !z11)) && ((peer = tL_messageActionStarGift.peer) == null || !O1(this.currentAccount, DialogObject.getPeerDialogId(peer)))) || tL_messageActionStarGift.converted || tL_messageActionStarGift.convert_stars <= 0 || currentTime <= 0) {
                    return false;
                }
                return true;
            }
        } else {
            TL_stars.SavedStarGift savedStarGift = this.f12197y0;
            if (savedStarGift != null) {
                int currentTime2 = MessagesController.getInstance(this.currentAccount).stargiftsConvertPeriodMax - (ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() - savedStarGift.date);
                int i11 = this.currentAccount;
                long j10 = this.T;
                if (O1(i11, j10)) {
                    int i12 = this.f12197y0.flags;
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
        FrameLayout frameLayout = this.f12179i0;
        int visibility = frameLayout.getVisibility();
        FrameLayout frameLayout2 = this.f12183k0;
        FrameLayout frameLayout3 = this.f12175g0;
        if (visibility == 0) {
            frameLayout3.setTranslationY(this.U0.a(1) * (-frameLayout.getMeasuredHeight()));
            frameLayout.setTranslationY((1.0f - this.U0.a(1)) * frameLayout.getMeasuredHeight());
            frameLayout2.setTranslationY(this.U0.a(1) * (-frameLayout.getMeasuredHeight()));
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
        if (this.B0 != null && this.C0 == null) {
            org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(getContext(), 3, null);
            c2Var.q(500L);
            TL_stars.getUniqueStarGift getuniquestargift = new TL_stars.getUniqueStarGift();
            getuniquestargift.slug = this.B0;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(getuniquestargift, new bg.h3(8, this, c2Var));
        } else if (this.f12197y0 == null && (messageObject = this.A0) != null && (message = messageObject.messageOwner) != null) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                if (tL_messageActionStarGift.upgraded) {
                    if (tL_messageActionStarGift.upgrade_msg_id != 0) {
                        org.telegram.ui.ActionBar.c2 c2Var2 = new org.telegram.ui.ActionBar.c2(getContext(), 3, null);
                        c2Var2.q(500L);
                        TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
                        tL_messages_getMessages.f22486id.add(Integer.valueOf(tL_messageActionStarGift.upgrade_msg_id));
                        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getMessages, new eg.z(this, tL_messageActionStarGift, c2Var2, 7));
                        return;
                    } else if (E1() != null) {
                        org.telegram.ui.ActionBar.c2 c2Var3 = new org.telegram.ui.ActionBar.c2(getContext(), 3, null);
                        c2Var3.q(500L);
                        s7.y(this.currentAccount, false).M(E1(), new ih.b1(5, this, c2Var3));
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
        MessageObject messageObject = this.A0;
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
            TL_stars.SavedStarGift savedStarGift = this.f12197y0;
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
        p3 p3Var = this.V;
        p3Var.setPosition(L1 ? 1 : 0);
        p3Var.C(false);
        if (this.f12198z0 != null && !L1(true) && this.f12198z0.e() < this.f12198z0.c()) {
            this.f12198z0.a();
        }
    }

    public final void u1() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
        alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.Gift2CantDoTitle);
        alertDialog$Builder.f22714a.P = LocaleController.getString(R.string.Gift2CantDoText);
        TL_stars.TL_starGiftUnique K1 = K1();
        if (K1 != null && !TextUtils.isEmpty(K1.slug)) {
            alertDialog$Builder.k(LocaleController.getString(R.string.OpenFragment), new c3(this, K1, 1));
        }
        j7.l1.u(R.string.Cancel, alertDialog$Builder, null);
    }

    @Override
    public final il0 v(jl0 jl0Var) {
        cg.g gVar = new cg.g(this, 1);
        this.M0 = gVar;
        return gVar;
    }

    public final void v1(final long j10, final Utilities.Callback callback) {
        TLRPC.Message message;
        long peerDialogId;
        long j11;
        TL_stars.InputSavedStarGift E1 = E1();
        if (E1 != null) {
            TL_stars.SavedStarGift savedStarGift = this.f12197y0;
            if (savedStarGift != null && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
                j11 = savedStarGift.transfer_stars;
                peerDialogId = this.T;
            } else {
                MessageObject messageObject = this.A0;
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
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(transferstargift, new b2(this, callback, j10, peerDialogId, 0));
                return;
            }
            final long j12 = peerDialogId;
            s7 y8 = s7.y(this.currentAccount, false);
            if (!y8.f12790e) {
                y8.r(new c2(this, y8, j10, callback, 0));
                return;
            }
            final TLRPC.TL_inputInvoiceStarGiftTransfer tL_inputInvoiceStarGiftTransfer = new TLRPC.TL_inputInvoiceStarGiftTransfer();
            tL_inputInvoiceStarGiftTransfer.stargift = E1;
            tL_inputInvoiceStarGiftTransfer.to_id = MessagesController.getInstance(this.currentAccount).getInputPeer(j10);
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftTransfer;
            JSONObject p10 = ph.p2.p(this.resourcesProvider, false);
            if (p10 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = p10.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getPaymentForm, new RequestDelegate() {
                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    final h5 h5Var = h5.this;
                    final TLRPC.TL_inputInvoiceStarGiftTransfer tL_inputInvoiceStarGiftTransfer2 = tL_inputInvoiceStarGiftTransfer;
                    final long j13 = j10;
                    final long j14 = j12;
                    final Utilities.Callback callback2 = callback;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            h5.G0(h5.this, tLObject, tL_inputInvoiceStarGiftTransfer2, j13, j14, callback2, tL_error);
                        }
                    });
                }
            });
        }
    }

    public final void w1() {
        TL_stars.InputSavedStarGift E1;
        long j10;
        nh.d dVar = this.f12173f0;
        if (!dVar.J && (E1 = E1()) != null) {
            MessageObject messageObject = this.A0;
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
                TL_stars.SavedStarGift savedStarGift = this.f12197y0;
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
            if (i10 > 0 || this.f12178h1 != null) {
                dVar.setLoading(true);
                hp hpVar = this.f12190r0;
                if (i10 > 0) {
                    TL_stars.upgradeStarGift upgradestargift = new TL_stars.upgradeStarGift();
                    upgradestargift.keep_original_details = hpVar.f29211a.f26324q;
                    upgradestargift.stargift = E1;
                    ConnectionsManager.getInstance(this.currentAccount).sendRequest(upgradestargift, new bg.h3(7, this, E1));
                    return;
                }
                int i11 = 0;
                s7 y8 = s7.y(this.currentAccount, false);
                if (!y8.f12790e) {
                    y8.r(new ef.c(28, this, y8));
                    return;
                }
                TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
                tL_payments_sendStarsForm.form_id = this.f12178h1.form_id;
                if (!TextUtils.isEmpty(str)) {
                    TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade tL_inputInvoiceStarGiftPrepaidUpgrade = new TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade();
                    tL_inputInvoiceStarGiftPrepaidUpgrade.hash = str;
                    tL_inputInvoiceStarGiftPrepaidUpgrade.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.T);
                    tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftPrepaidUpgrade;
                } else {
                    TLRPC.TL_inputInvoiceStarGiftUpgrade tL_inputInvoiceStarGiftUpgrade = new TLRPC.TL_inputInvoiceStarGiftUpgrade();
                    tL_inputInvoiceStarGiftUpgrade.keep_original_details = hpVar.f29211a.f26324q;
                    tL_inputInvoiceStarGiftUpgrade.stargift = E1;
                    tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftUpgrade;
                }
                ArrayList<TLRPC.TL_labeledPrice> arrayList = this.f12178h1.invoice.prices;
                int size = arrayList.size();
                while (i11 < size) {
                    TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i11);
                    i11++;
                    j11 += tL_labeledPrice.amount;
                }
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_sendStarsForm, new v(this, str, E1, j11, 1));
            }
        }
    }

    @Override
    public final int x() {
        return AndroidUtilities.dp(12.0f);
    }

    @Override
    public final CharSequence y() {
        return this.O0;
    }

    public final int z1() {
        if (this.U0.d(1)) {
            return this.f12186n0.getMeasuredHeight();
        }
        if (this.U0.d(2)) {
            return this.f12193u0.getMeasuredHeight();
        }
        if (this.U0.d(3)) {
            return this.f12195w0.getMeasuredHeight();
        }
        if (this.U0.d(4)) {
            return 0;
        }
        return this.f12165b0.getMeasuredHeight();
    }
}
