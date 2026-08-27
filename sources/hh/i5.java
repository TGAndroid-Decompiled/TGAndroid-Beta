package hh;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.os.Bundle;
import android.text.Layout;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.RelativeSizeSpan;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TableRow;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import lh.nb;
import lh.sb;
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
import org.telegram.messenger.rl;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.b70;
import org.telegram.ui.Components.bp;
import org.telegram.ui.Components.cq;
import org.telegram.ui.Components.ec;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.f00;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.oi0;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.pc;
import org.telegram.ui.Components.ri0;
import org.telegram.ui.Components.u80;
import org.telegram.ui.Components.vt;
import org.telegram.ui.Components.vy0;
import org.telegram.ui.Components.wy0;
import org.telegram.ui.Components.xy0;
import org.telegram.ui.Components.yk0;
import org.telegram.ui.Components.yy0;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.gy;
import org.telegram.ui.q91;
import org.telegram.ui.rn;

public class i5 extends org.telegram.ui.Components.qa implements NotificationCenter.NotificationCenterDelegate {

    public static final int f9450m1 = 0;
    public MessageObject A0;
    public String B0;
    public TL_stars.TL_starGiftUnique C0;
    public boolean D0;
    public boolean E0;
    public boolean F0;
    public boolean G0;
    public boolean H0;
    public t4 I0;
    public boolean J0;
    public s3 K0;
    public final int[] L0;
    public ag.i M0;
    public int N0;
    public String O0;
    public gh.w5 P0;
    public cq Q0;
    public boolean R0;
    public k3 S0;
    public final long T;
    public Float T0;
    public final ag.w U;
    public j4 U0;
    public final p3 V;
    public ValueAnimator V0;
    public final f00 W;
    public cq W0;
    public gh.s3 X;
    public boolean X0;
    public gh.s3 Y;
    public View Y0;
    public final r3 Z;
    public gh.g3 Z0;

    public final e5 f9451a0;

    public boolean f9452a1;

    public final q3 f9453b0;

    public Boolean f9454b1;

    public final p80 f9455c0;

    public boolean f9456c1;

    public final yy0 f9457d0;

    public ArrayList f9458d1;

    public final p80 f9459e0;

    public ArrayList f9460e1;

    public final lh.d f9461f0;

    public ArrayList f9462f1;

    public final FrameLayout f9463g0;

    public boolean f9464g1;

    public final p80 f9465h0;

    public TLRPC.PaymentForm f9466h1;

    public final FrameLayout f9467i0;

    public final cq[] f9468i1;

    public final View f9469j0;

    public final v1 f9470j1;

    public final FrameLayout f9471k0;

    public lh.w3 f9472k1;

    public g5 f9473l0;
    public View l1;
    public boolean m0;

    public final q3 f9474n0;

    public final nh.j[] f9475o0;

    public final View f9476p0;

    public final LinearLayout f9477q0;

    public final bp f9478r0;

    public final TextView f9479s0;

    public boolean f9480t0;

    public final q3 f9481u0;

    public final TextView f9482v0;

    public final q3 f9483w0;

    public boolean f9484x0;

    public TL_stars.SavedStarGift f9485y0;

    public n7 f9486z0;

    public i5(Context context, int i10, long j10, org.telegram.ui.ActionBar.c6 c6Var, View view) {
        super(context, null, false, false, false, 1, c6Var);
        this.m0 = false;
        this.L0 = new int[2];
        this.N0 = -1;
        this.O0 = "";
        this.U0 = new j4(0, 0);
        this.X0 = true;
        this.f9468i1 = new cq[1];
        this.f9470j1 = new v1(this, 7);
        this.currentAccount = i10;
        this.T = j10;
        this.v = Math.max(0.05f, AndroidUtilities.dp(82.0f) / (AndroidUtilities.displaySize.y + AndroidUtilities.statusBarHeight));
        this.occupyNavigationBar = true;
        this.containerView = new ag.p1(this, context, 4);
        ag.w wVar = new ag.w(this, context);
        this.U = wVar;
        p3 p3Var = new p3(this, context);
        this.V = p3Var;
        p3Var.setAdapter(new cg.u(this, context, 1));
        t2();
        View view2 = new View(context);
        int i11 = org.telegram.ui.ActionBar.g6.f23124h5;
        view2.setBackgroundColor(getThemedColor(i11));
        this.containerView.addView(view2, h7.z5.e(-1, 50, 80));
        this.containerView.addView(p3Var, h7.z5.e(-1, -1, 119));
        fixNavigationBar(getThemedColor(i11));
        AndroidUtilities.removeFromParent(this.d);
        wVar.addView(this.d, h7.z5.e(-1, -1, 119));
        q3 q3Var = new q3(this, context, 0);
        this.f9453b0 = q3Var;
        q3Var.setOrientation(1);
        q3Var.setPadding(AndroidUtilities.dp(14.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(14.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(68.0f));
        wVar.addView(q3Var, h7.z5.e(-1, -1, 55));
        p80 p80Var = new p80(context, c6Var);
        this.f9455c0 = p80Var;
        int i12 = org.telegram.ui.ActionBar.g6.f23283q5;
        p80Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i12, c6Var));
        p80Var.setTextSize(1, 12.0f);
        p80Var.setGravity(17);
        p80Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        p80Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.gc, c6Var));
        p80Var.setDisablePaddingsOffsetY(true);
        q3Var.addView(p80Var, h7.z5.t(-2, -2, 1, 4, -2, 4, 16));
        p80Var.setVisibility(8);
        yy0 yy0Var = new yy0(context, c6Var);
        this.f9457d0 = yy0Var;
        q3Var.addView(yy0Var, h7.z5.k(0.0f, 0.0f, 0.0f, 12.0f, -1, -2));
        p80 p80Var2 = new p80(context, c6Var);
        this.f9459e0 = p80Var2;
        p80Var2.setTextColor(org.telegram.ui.ActionBar.g6.v0(i12, c6Var));
        p80Var2.setTextSize(1, 12.0f);
        p80Var2.setGravity(17);
        p80Var2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        int i13 = org.telegram.ui.ActionBar.g6.Oh;
        p80Var2.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(i13, c6Var));
        p80Var2.setDisablePaddingsOffsetY(true);
        p80Var2.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), 0);
        q3Var.addView(p80Var2, h7.z5.t(-2, -2, 1, 4, 2, 4, 8));
        p80Var2.setVisibility(8);
        q3 q3Var2 = new q3(this, context, 1);
        this.f9474n0 = q3Var2;
        q3Var2.setOrientation(1);
        q3Var2.setPadding(AndroidUtilities.dp(4.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(4.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(66.0f));
        wVar.addView(q3Var2, h7.z5.e(-1, -1, 55));
        nh.j[] jVarArr = {jVar, jVar, jVar};
        this.f9475o0 = jVarArr;
        nh.j jVar = new nh.j(context, c6Var, false);
        jVar.a(LocaleController.getString(R.string.Gift2UpgradeFeature1Title), LocaleController.getString(R.string.GiftsFeature1Text), R.drawable.menu_feature_unique);
        q3Var2.addView(jVarArr[0], h7.z5.n(-1, -2));
        nh.j jVar2 = new nh.j(context, c6Var, false);
        jVar2.a(LocaleController.getString(R.string.Gift2UpgradeFeature3Title), LocaleController.getString(R.string.GiftsFeature2Text), R.drawable.menu_feature_tradable);
        q3Var2.addView(jVarArr[1], h7.z5.n(-1, -2));
        nh.j jVar3 = new nh.j(context, c6Var, false);
        jVar3.a(LocaleController.getString(R.string.GiftsFeature3Title), LocaleController.getString(R.string.GiftsFeature3Text), R.drawable.menu_wear);
        q3Var2.addView(jVarArr[2], h7.z5.n(-1, -2));
        View view3 = new View(context);
        this.f9476p0 = view3;
        int i14 = org.telegram.ui.ActionBar.g6.f23054d7;
        view3.setBackgroundColor(org.telegram.ui.ActionBar.g6.v0(i14, c6Var));
        q3Var2.addView(view3, h7.z5.s(-2, 7, 17, -4, 17, 1.0f / AndroidUtilities.density, 6));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f9477q0 = linearLayout;
        linearLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        linearLayout.setOrientation(0);
        linearLayout.setBackground(org.telegram.ui.ActionBar.g6.Y(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23144i6, c6Var), 6, 6));
        bp bpVar = new bp(context, 24, c6Var);
        this.f9478r0 = bpVar;
        bpVar.b(org.telegram.ui.ActionBar.g6.f23126h7, org.telegram.ui.ActionBar.g6.f23163j7, org.telegram.ui.ActionBar.g6.f23182k7);
        bpVar.setDrawUnchecked(true);
        bpVar.a(false, false);
        bpVar.setDrawBackgroundAsArc(10);
        linearLayout.addView(bpVar, h7.z5.t(26, 26, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.f9479s0 = textView;
        int i15 = org.telegram.ui.ActionBar.g6.f23161j5;
        textView.setTextColor(getThemedColor(i15));
        textView.setTextSize(1, 14.0f);
        textView.setText(LocaleController.getString(R.string.Gift2AddSenderName));
        linearLayout.addView(textView, h7.z5.t(-2, -2, 16, 9, 0, 0, 0));
        q3Var2.addView(linearLayout, h7.z5.t(-2, -2, 1, 0, 0, 0, 4));
        h7.b6.b(linearLayout, 0.025f, 1.5f);
        q3 q3Var3 = new q3(this, context, 2);
        this.f9481u0 = q3Var3;
        q3Var3.setOrientation(1);
        q3Var3.setPadding(AndroidUtilities.dp(4.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(4.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(66.0f));
        wVar.addView(q3Var3, h7.z5.e(-1, -1, 55));
        TextView textView2 = new TextView(context);
        this.f9482v0 = textView2;
        rl.l(i15, c6Var, textView2, 1, 20.0f);
        textView2.setGravity(17);
        textView2.setTypeface(AndroidUtilities.bold());
        q3Var3.addView(textView2, h7.z5.t(-1, -2, 7, 20, 0, 20, 0));
        TextView textView3 = new TextView(context);
        rl.l(i15, c6Var, textView3, 1, 14.0f);
        textView3.setGravity(17);
        textView3.setText(LocaleController.getString(R.string.Gift2WearSubtitle));
        q3Var3.addView(textView3, h7.z5.t(-1, -2, 7, 20, 6, 20, 24));
        nh.j jVar4 = new nh.j(context, c6Var, false);
        jVar4.a(LocaleController.getString(R.string.Gift2WearFeature1Title), LocaleController.getString(R.string.Gift2WearFeature1Text), R.drawable.menu_feature_unique);
        q3Var3.addView(jVarArr[0], h7.z5.n(-1, -2));
        nh.j jVar5 = new nh.j(context, c6Var, false);
        jVar5.a(LocaleController.getString(R.string.Gift2WearFeature2Title), LocaleController.getString(R.string.Gift2WearFeature2Text), R.drawable.menu_feature_cover);
        q3Var3.addView(jVarArr[1], h7.z5.n(-1, -2));
        nh.j jVar6 = new nh.j(context, c6Var, false);
        nh.j[] jVarArr2 = {jVar4, jVar5, jVar6};
        jVar6.a(LocaleController.getString(R.string.Gift2WearFeature3Title), LocaleController.getString(R.string.Gift2WearFeature3Text), R.drawable.menu_verification);
        q3Var3.addView(jVarArr2[2], h7.z5.n(-1, -2));
        q3 q3Var4 = new q3(this, context, 3);
        this.f9483w0 = q3Var4;
        q3Var4.setOrientation(1);
        q3Var4.setPadding(AndroidUtilities.dp(4.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(92.0f));
        wVar.addView(q3Var4, h7.z5.e(-1, -1, 55));
        nh.j jVar7 = new nh.j(context, c6Var, false);
        jVar7.a(LocaleController.getString(R.string.GiftCraftInfoFeature1Title), LocaleController.getString(R.string.GiftCraftInfoFeature1Text), R.drawable.menu_feature_unique);
        q3Var4.addView(jVarArr[0], h7.z5.n(-1, -2));
        nh.j jVar8 = new nh.j(context, c6Var, false);
        jVar8.a(LocaleController.getString(R.string.GiftCraftInfoFeature2Title), LocaleController.getString(R.string.GiftCraftInfoFeature2Text), R.drawable.menu_random);
        q3Var4.addView(jVarArr[1], h7.z5.n(-1, -2));
        nh.j jVar9 = new nh.j(context, c6Var, false);
        nh.j[] jVarArr3 = {jVar7, jVar8, jVar9};
        jVar9.a(LocaleController.getString(R.string.GiftCraftInfoFeature3Title), LocaleController.getString(R.string.GiftCraftInfoFeature3Text), R.drawable.menu_feature_affect);
        q3Var4.addView(jVarArr3[2], h7.z5.n(-1, -2));
        q3Var.setAlpha(1.0f);
        q3Var2.setAlpha(0.0f);
        q3Var3.setAlpha(0.0f);
        q3Var4.setAlpha(0.0f);
        e5 e5Var = new e5(context, c6Var, new v1(this, 9), new n1(this, 13), new n1(this, 14), new n1(this, 15), new n1(this, 16), new n1(this, 17), new n1(this, 18), new n1(this, 19));
        this.f9451a0 = e5Var;
        e5Var.H.f9305c.setOnClickListener(new n1(this, 20));
        int i16 = this.backgroundPaddingLeft;
        e5Var.setPadding(i16, 0, i16, 0);
        wVar.addView(e5Var, h7.z5.e(-1, -2, 55));
        org.telegram.ui.j jVar10 = this.f31852c;
        this.M = true;
        jVar10.k1(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f9463g0 = frameLayout;
        frameLayout.setBackgroundColor(getThemedColor(i11));
        View view4 = new View(context);
        this.f9469j0 = view4;
        view4.setBackgroundColor(getThemedColor(i14));
        view4.setAlpha(0.0f);
        frameLayout.addView(view4, h7.z5.a(-1.0f, 1.0f / AndroidUtilities.density, 55));
        lh.d dVarG = rl.g(24, context, c6Var, true);
        this.f9461f0 = dVarG;
        dVarG.g(LocaleController.getString(R.string.OK), false, true);
        dVarG.f(null, false);
        FrameLayout.LayoutParams layoutParamsD = h7.z5.d(-1, 48.0f, 119, 0.0f, 12.0f, 0.0f, 12.0f);
        layoutParamsD.leftMargin = AndroidUtilities.dp(14.0f) + this.backgroundPaddingLeft;
        layoutParamsD.rightMargin = AndroidUtilities.dp(14.0f) + this.backgroundPaddingLeft;
        frameLayout.addView(dVarG, layoutParamsD);
        wVar.addView(frameLayout, h7.z5.e(-1, 72, 87));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f9467i0 = frameLayout2;
        frameLayout2.setBackgroundColor(getThemedColor(i11));
        p80 p80Var3 = new p80(context, null);
        this.f9465h0 = p80Var3;
        p80Var3.setTextSize(1, 12.0f);
        p80Var3.setTextColor(org.telegram.ui.ActionBar.g6.v0(i13, c6Var));
        p80Var3.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(i13, c6Var));
        p80Var3.setGravity(17);
        frameLayout2.addView(p80Var3, h7.z5.d(-1, -2.0f, 17, 16.0f, 8.0f, 16.0f, 14.0f));
        wVar.addView(frameLayout2, h7.z5.e(-1, -2, 87));
        frameLayout2.setVisibility(8);
        this.d.setOnScrollListener(new ag.z2(this, 8));
        linearLayout.setOnClickListener(new n1(this, 12));
        f00 f00Var = new f00(context);
        this.W = f00Var;
        wVar.addView(f00Var, h7.z5.c(-1.0f, -1));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f9471k0 = frameLayout3;
        frameLayout3.setPadding(AndroidUtilities.dp(6.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(6.0f) + this.backgroundPaddingLeft, 0);
        wVar.addView(frameLayout3, h7.z5.d(-1, 200.0f, 87, 0.0f, 0.0f, 0.0f, 60.0f));
        AndroidUtilities.removeFromParent(this.f31853e);
        wVar.addView(this.f31853e, h7.z5.d(-1, -2.0f, 0, 6.0f, 0.0f, 6.0f, 0.0f));
        r3 r3Var = new r3(context);
        this.Z = r3Var;
        wVar.addView(r3Var, h7.z5.e(-1, -2, 55));
        ArrayList arrayList = new ArrayList();
        if (view != null) {
            arrayList.add(view);
        }
        AndroidUtilities.makeGlobalBlurBitmap(new ag.n0(r3Var, 15), 12.0f, 12, null, arrayList);
    }

    public static void A0(i5 i5Var, long j10) {
        new gh.k2(i5Var.getContext(), i5Var.currentAccount, j10, null, new z2(i5Var, 2)).show();
    }

    public static void B0(i5 i5Var, we.d dVar, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.TL_error tL_error, long j10, CharSequence charSequence) {
        dVar.c(false);
        b2Var.dismiss();
        if (!(tLObject instanceof TLRPC.TL_payments_paymentResult)) {
            if (tL_error != null && "BALANCE_TOO_LOW".equalsIgnoreCase(tL_error.text)) {
                new ea(i5Var.getContext(), i5Var.resourcesProvider, j10, 16, null, new d5.u(27, i5Var, charSequence), 0L).show();
                return;
            } else {
                if (tL_error != null) {
                    i5Var.getBulletinFactory().d0(tL_error, false);
                    return;
                }
                return;
            }
        }
        int i10 = 0;
        while (i10 < tL_starGiftUnique.attributes.size()) {
            if (tL_starGiftUnique.attributes.get(i10) instanceof TL_stars.starGiftAttributeOriginalDetails) {
                tL_starGiftUnique.attributes.remove(i10);
                i10--;
            }
            i10++;
        }
        TL_stars.SavedStarGift savedStarGift = i5Var.f9485y0;
        i5Var.k2(tL_starGiftUnique, savedStarGift != null ? savedStarGift.refunded : false, null, null);
        AndroidUtilities.runOnUIThread(new d5.u(25, i5Var, tL_starGiftUnique));
    }

    public static void D0(i5 i5Var, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, long j10, MessagesController messagesController, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        i5Var.f9461f0.setLoading(false);
        ag.r2 r2Var = new ag.r2(i5Var, 3);
        ag.i1 i1Var = new ag.i1(26, i5Var.currentAccount, i5Var.getContext(), r2Var, i5Var.resourcesProvider);
        i1Var.G1(canApplyBoost);
        i1Var.F1(tL_premium_boostsStatus, true);
        i1Var.H1(j10);
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(-j10));
        if (chat != null) {
            i1Var.M0 = new cg.i(i5Var, chat);
        }
        i1Var.show();
    }

    public static String D1(TL_stars.StarGift starGift) {
        if (!(starGift instanceof TL_stars.TL_starGiftUnique)) {
            return (!(starGift instanceof TL_stars.TL_starGift) || TextUtils.isEmpty(starGift.title)) ? LocaleController.getString(R.string.Gift2Gift) : starGift.title;
        }
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        return i0.a.m(tL_starGiftUnique.num, ',', sb2);
    }

    public static void E0(i5 i5Var, int i10, int i11, int i12, TL_stars.TL_starGiftUnique tL_starGiftUnique, cg.y2[] y2VarArr, Long l10) {
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        if (l10.longValue() == -99) {
            if (i10 < i11) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(i5Var.getContext(), 0, i5Var.resourcesProvider);
                String string = LocaleController.getString(R.string.Gift2ExportTONUnlocksAlertTitle);
                org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
                b2Var.N = string;
                b2Var.P = LocaleController.formatPluralString("Gift2ExportTONUnlocksAlertText", Math.max(1, i12), new Object[0]);
                i0.a.C(R.string.OK, alertDialog$Builder, null);
                return;
            }
            LinearLayout linearLayout = new LinearLayout(i5Var.getContext());
            linearLayout.setOrientation(1);
            linearLayout.addView(new i4(i5Var.getContext(), tL_starGiftUnique), h7.z5.t(-1, -2, 48, 0, -4, 0, 0));
            TextView textView = new TextView(i5Var.getContext());
            int i13 = org.telegram.ui.ActionBar.g6.f23161j5;
            rl.w(i13, i5Var.resourcesProvider, textView, 1, 20.0f);
            textView.setText(LocaleController.getString(R.string.Gift2ExportTONFragmentTitle));
            linearLayout.addView(textView, h7.z5.t(-1, -2, 48, 24, 4, 24, 14));
            TextView textView2 = new TextView(i5Var.getContext());
            rl.l(i13, i5Var.resourcesProvider, textView2, 1, 16.0f);
            rl.n(R.string.Gift2ExportTONFragmentText, new Object[]{i5Var.C1()}, textView2);
            linearLayout.addView(textView2, h7.z5.t(-1, -2, 48, 24, 0, 24, 4));
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(i5Var.getContext(), 0, i5Var.resourcesProvider);
            alertDialog$Builder2.n(linearLayout);
            alertDialog$Builder2.k(LocaleController.getString(R.string.Gift2ExportTONFragmentOpen), new ag.h0(23, i5Var, y2VarArr));
            i0.a.w(R.string.Cancel, alertDialog$Builder2, null);
            return;
        }
        androidx.car.app.utils.a aVar = new androidx.car.app.utils.a(i5Var, l10, y2VarArr, 19);
        if (l10.longValue() < 0) {
            TLRPC.ChatFull chatFull = MessagesController.getInstance(i5Var.currentAccount).getChatFull(-l10.longValue());
            if (chatFull == null) {
                TLRPC.TL_channels_getFullChannel tL_channels_getFullChannel = new TLRPC.TL_channels_getFullChannel();
                tL_channels_getFullChannel.channel = MessagesController.getInstance(i5Var.currentAccount).getInputChannel(-l10.longValue());
                ConnectionsManager.getInstance(i5Var.currentAccount).sendRequest(tL_channels_getFullChannel, new cg.g0(5, i5Var, aVar));
                return;
            } else if (!chatFull.stargifts_available) {
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(i5Var.getContext(), 0, i5Var.resourcesProvider);
                String string2 = LocaleController.getString(R.string.Gift2ChannelDoesntSupportGiftsTitle);
                org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder3.f22702a;
                b2Var2.N = string2;
                b2Var2.P = LocaleController.getString(R.string.Gift2ChannelDoesntSupportGiftsText);
                i0.a.C(R.string.OK, alertDialog$Builder3, null);
                return;
            }
        } else if (l10.longValue() >= 0) {
            TLRPC.User user = MessagesController.getInstance(i5Var.currentAccount).getUser(l10);
            TLRPC.UserFull userFull = MessagesController.getInstance(i5Var.currentAccount).getUserFull(l10.longValue());
            if (userFull != null && (disallowedGiftsSettings = userFull.disallowed_stargifts) != null && disallowedGiftsSettings.disallow_unique_stargifts) {
                new mc(y2VarArr[0].container, i5Var.resourcesProvider).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(l10.longValue())))).j();
                return;
            } else if (userFull == null && user != null) {
                TLRPC.TL_users_getFullUser tL_users_getFullUser = new TLRPC.TL_users_getFullUser();
                tL_users_getFullUser.f22520id = MessagesController.getInstance(i5Var.currentAccount).getInputUser(user);
                ConnectionsManager.getInstance(i5Var.currentAccount).sendRequest(tL_users_getFullUser, new gh.f1(i5Var, y2VarArr, l10, aVar, 2));
                return;
            }
        }
        aVar.run();
    }

    public static void G0(i5 i5Var, TLObject tLObject, TLRPC.TL_inputInvoiceStarGiftTransfer tL_inputInvoiceStarGiftTransfer, long j10, long j11, Utilities.Callback callback, TLRPC.TL_error tL_error) {
        if (!(tLObject instanceof TLRPC.PaymentForm)) {
            callback.run(tL_error);
            ec ecVarY = i5Var.getBulletinFactory().Y(tL_error);
            ecVarY.f28030t = true;
            ecVarY.j();
            return;
        }
        TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
        int i10 = 0;
        MessagesController.getInstance(i5Var.currentAccount).putUsers(paymentForm.users, false);
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
        ConnectionsManager.getInstance(i5Var.currentAccount).sendRequest(tL_payments_sendStarsForm, new a2(i5Var, j10, j11, callback, j12));
    }

    public static void H0(i5 i5Var, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, long j10, long j11, long j12, TLRPC.TL_error tL_error) {
        b2Var.c(400L);
        org.telegram.ui.ActionBar.n2 n2VarU = LaunchActivity.U();
        if (n2VarU == null) {
            return;
        }
        int i10 = 1;
        if (!(tLObject instanceof TLRPC.TL_boolTrue)) {
            if (tL_error != null) {
                i5Var.getBulletinFactory().t(LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text), null).k(false);
                return;
            } else {
                i5Var.getBulletinFactory().t(LocaleController.getString(R.string.UnknownError), null).k(false);
                return;
            }
        }
        i5Var.dismiss();
        u7.y(i5Var.currentAccount, false).Q(j10);
        if (j10 < 0) {
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -j10);
            bundle.putBoolean("start_from_monetization", true);
            q91 q91Var = new q91(bundle);
            c0.g(i5Var.currentAccount).h(j10, true);
            c0.g(i5Var.currentAccount).l(j10);
            q91Var.whenFullyVisible(new cg.b2(q91Var, j12, 2));
            n2VarU.presentFragment(q91Var);
            return;
        }
        TLRPC.UserFull userFull = MessagesController.getInstance(i5Var.currentAccount).getUserFull(j11);
        if (userFull != null) {
            int iMax = Math.max(0, userFull.stargifts_count - 1);
            userFull.stargifts_count = iMax;
            if (iMax <= 0) {
                userFull.flags2 &= -257;
            }
        }
        u7.y(i5Var.currentAccount, false).P();
        u7.y(i5Var.currentAccount, false).T(true);
        if (n2VarU instanceof oa) {
            mc.a0(n2VarU).M(LocaleController.getString(R.string.Gift2ConvertedTitle), LocaleController.formatPluralStringComma("Gift2Converted", (int) j12), R.raw.stars_topup).k(true);
            return;
        }
        oa oaVar = new oa();
        oaVar.whenFullyVisible(new cg.b2(oaVar, j12, i10));
        n2VarU.presentFragment(oaVar);
    }

    public static void I0(i5 i5Var, TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift) {
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) tL_payments_uniqueStarGift.gift;
        i5Var.C0 = tL_starGiftUnique;
        i5Var.k2(tL_starGiftUnique, false, null, null);
        super.show();
    }

    public static void J0(final long j10, final long j11, final i5 i5Var, final Utilities.Callback callback, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(i5Var.currentAccount).processUpdates((TLRPC.Updates) tLObject, false);
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                i5.S(j10, j11, i5Var, callback, tLObject, tL_error);
            }
        });
    }

    public static String J1(TL_stars.StarGiftAttributeRarity starGiftAttributeRarity, Integer[] numArr) {
        if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityUncommon) {
            numArr[0] = -12539616;
            return LocaleController.getString(R.string.GiftRarityUncommon);
        }
        if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityRare) {
            numArr[0] = -15619394;
            return LocaleController.getString(R.string.GiftRarityRare);
        }
        if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityEpic) {
            numArr[0] = -6988581;
            return LocaleController.getString(R.string.GiftRarityEpic);
        }
        if (starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarityLegendary) {
            numArr[0] = -4229632;
            return LocaleController.getString(R.string.GiftRarityLegendary);
        }
        if (!(starGiftAttributeRarity instanceof TL_stars.TL_starGiftAttributeRarity)) {
            return "";
        }
        int i10 = ((TL_stars.TL_starGiftAttributeRarity) starGiftAttributeRarity).permille;
        return i10 <= 0 ? "<0.1%" : nh.k.G0(i10);
    }

    public static void L0(i5 i5Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.PaymentForm paymentForm, TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails, long j10, CharSequence charSequence, org.telegram.ui.ActionBar.b2 b2Var) {
        we.d dVarG = b2Var.g(-1, true, true);
        dVarG.d();
        TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
        tL_payments_sendStarsForm.form_id = paymentForm.form_id;
        tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftDropOriginalDetails;
        ConnectionsManager.getInstance(i5Var.currentAccount).sendRequest(tL_payments_sendStarsForm, new y2(i5Var, dVarG, b2Var, tL_starGiftUnique, j10, charSequence));
    }

    public static void M0(i5 i5Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, hf.a aVar, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(i5Var.currentAccount).processUpdates((TLRPC.Updates) tLObject, false);
            AndroidUtilities.runOnUIThread(new k2(i5Var, tL_starGiftUnique, aVar, runnable, 1));
        } else if (tL_error != null) {
            AndroidUtilities.runOnUIThread(new l2(i5Var, tL_error, runnable, 1));
        }
    }

    public static void N0(i5 i5Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, org.telegram.ui.ActionBar.b2 b2Var) {
        i5Var.getClass();
        we.d dVarG = b2Var.g(-1, true, true);
        dVarG.d();
        TL_stars.updateStarGiftPrice updatestargiftprice = new TL_stars.updateStarGiftPrice();
        updatestargiftprice.stargift = i5Var.E1();
        updatestargiftprice.resell_amount = TL_stars.StarsAmount.ofStars(0L);
        ConnectionsManager.getInstance(i5Var.currentAccount).sendRequest(updatestargiftprice, new cg.y(i5Var, dVarG, tL_starGiftUnique, 6));
    }

    public static boolean N1(int i10, long j10) {
        if (j10 >= 0) {
            return UserConfig.getInstance(i10).getClientUserId() == j10;
        }
        return ChatObject.canUserDoAction(MessagesController.getInstance(i10).getChat(Long.valueOf(-j10)), 5);
    }

    public static void O0(i5 i5Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, hf.a aVar, Runnable runnable) {
        TL_stars.StarsAmount starsAmountO = aVar.o();
        TL_stars.updateStarGiftPrice updatestargiftprice = new TL_stars.updateStarGiftPrice();
        updatestargiftprice.stargift = i5Var.E1();
        updatestargiftprice.resell_amount = starsAmountO;
        ConnectionsManager.getInstance(i5Var.currentAccount).sendRequest(updatestargiftprice, new t1(i5Var, tL_starGiftUnique, aVar, runnable, 0));
    }

    public static boolean O1(int i10, long j10) {
        if (j10 >= 0) {
            return UserConfig.getInstance(i10).getClientUserId() == j10;
        }
        TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
        return chat != null && chat.creator;
    }

    public static void P(i5 i5Var, long j10) {
        new gh.k2(i5Var.getContext(), i5Var.currentAccount, j10, null, new z2(i5Var, 2)).show();
    }

    public static void P0(i5 i5Var, long j10) {
        new gh.k2(i5Var.getContext(), i5Var.currentAccount, j10, null, new z2(i5Var, 2)).show();
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
        if (peerDialogId == 0) {
            return false;
        }
        if (peerDialogId > 0) {
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(peerDialogId));
            if (user != null) {
                TLRPC.EmojiStatus emojiStatus = user.emoji_status;
                return (emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) && ((TLRPC.TL_emojiStatusCollectible) emojiStatus).collectible_id == tL_starGiftUnique.f22607id;
            }
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-peerDialogId));
            if (chat != null) {
                TLRPC.EmojiStatus emojiStatus2 = chat.emoji_status;
                if ((emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible) && ((TLRPC.TL_emojiStatusCollectible) emojiStatus2).collectible_id == tL_starGiftUnique.f22607id) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void R(i5 i5Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z10, gh.x0 x0Var, k4 k4Var, we.d dVar) {
        dVar.d();
        u7.x(i5Var.currentAccount, k4Var.f9578a).h(k4Var.f9579b, tL_starGiftUnique, j10, tL_textWithEntities, z10, new v2(i5Var, dVar, tL_starGiftUnique, j10, x0Var, 0));
    }

    public static void R0(i5 i5Var, TLObject tLObject, androidx.car.app.utils.a aVar, TLRPC.TL_error tL_error) {
        if (!(tLObject instanceof TLRPC.TL_messages_chatFull)) {
            ec ecVarY = i5Var.getBulletinFactory().Y(tL_error);
            ecVarY.f28030t = true;
            ecVarY.j();
            return;
        }
        TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject;
        MessagesController.getInstance(i5Var.currentAccount).putUsers(tL_messages_chatFull.users, false);
        MessagesController.getInstance(i5Var.currentAccount).putChats(tL_messages_chatFull.chats, false);
        MessagesController.getInstance(i5Var.currentAccount).putChatFull(tL_messages_chatFull.full_chat);
        if (tL_messages_chatFull.full_chat.stargifts_available) {
            aVar.run();
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(i5Var.getContext(), 0, i5Var.resourcesProvider);
        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.Gift2ChannelDoesntSupportGiftsTitle);
        alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.Gift2ChannelDoesntSupportGiftsText);
        i0.a.C(R.string.OK, alertDialog$Builder, null);
    }

    public static void S(long j10, long j11, i5 i5Var, Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error) {
        long j12;
        i5 i5Var2;
        callback.run(tL_error);
        org.telegram.ui.ActionBar.n2 n2VarU = LaunchActivity.U();
        if (n2VarU == null) {
            j12 = j10;
            i5Var2 = i5Var;
        } else if (!(tLObject instanceof TLRPC.Updates)) {
            j12 = j10;
            i5Var2 = i5Var;
            mc.a0(n2VarU).d0(tL_error, false);
        } else if (j10 < 0 || j11 < 0) {
            j12 = j10;
            i5Var2 = i5Var;
            ec ecVarM = mc.a0(n2VarU).M(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, i5Var2.C1(), DialogObject.getShortName(j12))), R.raw.forward);
            ecVarM.f28030t = true;
            ecVarM.j();
        } else {
            rn rnVarR9 = rn.R9(j10);
            j12 = j10;
            i5Var2 = i5Var;
            rnVarR9.whenFullyVisible(new t2(i5Var2, rnVarR9, j12, 0));
            n2VarU.presentFragment(rnVarR9);
        }
        u7.y(i5Var2.currentAccount, false).Q(j12);
        u7.y(i5Var2.currentAccount, false).Q(j11);
    }

    public static void S0(i5 i5Var, MessageObject messageObject, ArrayList arrayList, TL_stars.StarGift starGift) {
        i5Var.f9452a1 = true;
        i5Var.i2(messageObject, null);
        i5Var.q2(0, true, null);
        f00 f00Var = i5Var.W;
        if (f00Var != null) {
            f00Var.c(true);
        }
        u7.y(i5Var.currentAccount, false).P();
        m7 m7VarG = u7.y(i5Var.currentAccount, false).G(UserConfig.getInstance(i5Var.currentAccount).getClientUserId(), false);
        if (m7VarG != null) {
            m7VarG.j(arrayList, starGift);
        }
    }

    public static void T(i5 i5Var, org.telegram.ui.ActionBar.b2 b2Var, MessageObject messageObject) {
        b2Var.dismiss();
        i5Var.F0 = true;
        i5Var.i2(messageObject, null);
        super.show();
    }

    public static void T0(i5 i5Var, View view) {
        boolean z10;
        TL_stars.SavedStarGift savedStarGift;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        TL_stars.StarGift starGift;
        boolean zO1;
        TLRPC.Message message;
        String strF1 = i5Var.F1();
        TL_stars.TL_starGiftUnique tL_starGiftUniqueK1 = i5Var.K1();
        b70 b70VarF = b70.F(i5Var.U, i5Var.resourcesProvider, view);
        boolean z11 = (i5Var.K1() == null || !O1(i5Var.currentAccount, DialogObject.getPeerDialogId(i5Var.K1().owner_id)) || !(i5Var.f9486z0 instanceof m7) || i5Var.f9485y0 == null || i5Var.E1() == null) ? false : true;
        TL_stars.SavedStarGift savedStarGift2 = i5Var.f9485y0;
        b70VarF.l((savedStarGift2 == null || !savedStarGift2.pinned_to_top) ? R.drawable.msg_pin : R.drawable.msg_unpin, LocaleController.getString((savedStarGift2 == null || !savedStarGift2.pinned_to_top) ? R.string.Gift2Pin : R.string.Gift2Unpin), new v1(i5Var, 10), z11);
        b70VarF.l(R.drawable.outline_craft, LocaleController.getString(R.string.GiftCraft), new v1(i5Var, 11), i5Var.t1());
        b70VarF.l(R.drawable.menu_edit_price, LocaleController.getString(R.string.Gift2ChangePrice), new v1(i5Var, 12), (i5Var.K1() == null || !O1(i5Var.currentAccount, DialogObject.getPeerDialogId(i5Var.K1().owner_id)) || i5Var.K1().resell_amount == null) ? false : true);
        b70VarF.l(R.drawable.msg_link, LocaleController.getString(R.string.CopyLink), new w2(i5Var, strF1, 7), strF1 != null);
        b70VarF.l(R.drawable.msg_share, LocaleController.getString(R.string.ShareFile), new v1(i5Var, 13), strF1 != null);
        b70VarF.l(R.drawable.input_suggest_paid_24, LocaleController.getString(R.string.GiftOfferToBuyMenu), new v1(i5Var, 14), tL_starGiftUniqueK1 != null && tL_starGiftUniqueK1.offer_min_stars > 0);
        TL_stars.TL_starGiftUnique tL_starGiftUniqueK2 = i5Var.K1();
        if (tL_starGiftUniqueK2 == null || !tL_starGiftUniqueK2.theme_available) {
            z10 = false;
        } else {
            long peerDialogId = DialogObject.getPeerDialogId(tL_starGiftUniqueK2.owner_id);
            long peerDialogId2 = DialogObject.getPeerDialogId(tL_starGiftUniqueK2.host_id);
            if ((peerDialogId <= 0 || !O1(i5Var.currentAccount, peerDialogId)) && (peerDialogId2 <= 0 || !O1(i5Var.currentAccount, peerDialogId2))) {
                z10 = false;
            } else {
                z10 = true;
            }
        }
        b70VarF.l(R.drawable.msg_colors, LocaleController.getString(R.string.GiftThemesSetIn), new v1(i5Var, 15), z10);
        if (i5Var.E1() != null) {
            MessageObject messageObject = i5Var.A0;
            if (messageObject == null || (message = messageObject.messageOwner) == null) {
                savedStarGift = i5Var.f9485y0;
                if (savedStarGift != null) {
                    starGift = savedStarGift.gift;
                    if (starGift instanceof TL_stars.TL_starGiftUnique) {
                        tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                    } else {
                        tL_starGiftUnique = i5Var.C0;
                        if (tL_starGiftUnique != null) {
                            zO1 = false;
                        }
                    }
                } else {
                    tL_starGiftUnique = i5Var.C0;
                    if (tL_starGiftUnique != null) {
                        zO1 = false;
                    }
                }
                zO1 = O1(i5Var.currentAccount, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id));
            } else {
                TLRPC.MessageAction messageAction = message.action;
                if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                    TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                    if ((tL_messageActionStarGiftUnique.flags & 16) != 0) {
                        TL_stars.StarGift starGift2 = tL_messageActionStarGiftUnique.gift;
                        if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                            tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift2;
                            zO1 = O1(i5Var.currentAccount, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id));
                        }
                    }
                    zO1 = false;
                } else {
                    savedStarGift = i5Var.f9485y0;
                    if (savedStarGift != null) {
                        starGift = savedStarGift.gift;
                        if (starGift instanceof TL_stars.TL_starGiftUnique) {
                            tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
                        } else {
                            tL_starGiftUnique = i5Var.C0;
                            if (tL_starGiftUnique != null) {
                                zO1 = false;
                            }
                        }
                    } else {
                        tL_starGiftUnique = i5Var.C0;
                        if (tL_starGiftUnique != null) {
                            zO1 = false;
                        }
                    }
                    zO1 = O1(i5Var.currentAccount, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id));
                }
            }
        } else {
            zO1 = false;
        }
        b70VarF.l(R.drawable.menu_feature_transfer, LocaleController.getString(R.string.Gift2TransferOption), new v1(i5Var, 16), zO1);
        b70VarF.l(R.drawable.msg_view_file, LocaleController.getString(R.string.Gift2ViewInProfile), new v1(i5Var, 17), i5Var.f9485y0 == null && i5Var.A1() != 0);
        b70VarF.f26993t = false;
        b70VarF.Y = true;
        b70VarF.f26992s = 0;
        b70VarF.a0(0.0f, -AndroidUtilities.dp(2.0f));
        b70VarF.Z();
    }

    public static void U(i5 i5Var, int i10, TLObject tLObject) {
        MessageObject messageObject;
        if (tLObject instanceof TLRPC.messages_Messages) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            int i11 = 0;
            while (true) {
                if (i11 < messages_messages.messages.size()) {
                    TLRPC.Message message = messages_messages.messages.get(i11);
                    if (message != null && message.f22401id == i10) {
                        TLRPC.MessageAction messageAction = message.action;
                        if ((messageAction instanceof TLRPC.TL_messageActionStarGift) || (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                            messageObject = new MessageObject(i5Var.currentAccount, message, false, false);
                            messageObject.setType();
                        }
                    }
                    i11++;
                } else {
                    messageObject = null;
                }
            }
        } else {
            messageObject = null;
        }
        if (messageObject != null) {
            AndroidUtilities.runOnUIThread(new androidx.car.app.utils.a(i5Var, tLObject, messageObject, 20));
        }
    }

    public static void U0(i5 i5Var, Long l10) {
        TLRPC.Chat chat;
        String str = (l10.longValue() >= 0 || (chat = MessagesController.getInstance(i5Var.currentAccount).getChat(Long.valueOf(-l10.longValue()))) == null) ? "" : chat.title;
        ec ecVarQ = i5Var.getBulletinFactory().Q(R.raw.contact_check, 36, AndroidUtilities.replaceTags(TextUtils.isEmpty(str) ? LocaleController.getString(R.string.GiftRepostedToProfile) : LocaleController.formatString(R.string.GiftRepostedToChannelProfile, str)));
        ecVarQ.f28030t = true;
        ecVarQ.j();
    }

    public static void V(final i5 i5Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, final String str) {
        final long j10 = tL_starGiftUnique.gift_id;
        final String str2 = tL_starGiftUnique.title;
        final String strC1 = i5Var.C1();
        final TLRPC.Document document = tL_starGiftUnique.getDocument();
        String str3 = tL_starGiftUnique.slug;
        final org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(ApplicationLoader.applicationContext, 3, null);
        b2Var.q(500L);
        TL_stars.getUniqueStarGiftValueInfo getuniquestargiftvalueinfo = new TL_stars.getUniqueStarGiftValueInfo();
        getuniquestargiftvalueinfo.slug = str3;
        ConnectionsManager.getInstance(i5Var.currentAccount).sendRequest(getuniquestargiftvalueinfo, new RequestDelegate() {
            @Override
            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                final i5 i5Var2 = this.f9059a;
                final org.telegram.ui.ActionBar.b2 b2Var2 = b2Var;
                final TLRPC.Document document2 = document;
                final String str4 = str;
                final String str5 = str2;
                final String str6 = strC1;
                final long j11 = j10;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        i5.Z0(i5Var2, b2Var2, tLObject, document2, str4, str5, str6, j11, tL_error);
                    }
                });
            }
        });
    }

    public static void V0(i5 i5Var, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TL_stars.TL_payments_uniqueStarGift) {
            TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift = (TL_stars.TL_payments_uniqueStarGift) tLObject;
            MessagesController.getInstance(i5Var.currentAccount).putUsers(tL_payments_uniqueStarGift.users, false);
            MessagesController.getInstance(i5Var.currentAccount).putChats(tL_payments_uniqueStarGift.chats, false);
            if (tL_payments_uniqueStarGift.gift instanceof TL_stars.TL_starGiftUnique) {
                AndroidUtilities.runOnUIThread(new d5.u(28, i5Var, tL_payments_uniqueStarGift));
                return;
            }
        }
        AndroidUtilities.runOnUIThread(new d5.u(29, b2Var, tL_error));
    }

    public static void W(i5 i5Var) {
        boolean z10;
        TLRPC.Document document;
        boolean z11;
        k7 k7VarF;
        TLRPC.Message message;
        lh.d dVar = i5Var.f9461f0;
        if (dVar.J) {
            return;
        }
        TL_stars.InputSavedStarGift inputSavedStarGiftE1 = i5Var.E1();
        MessageObject messageObject = i5Var.A0;
        if (messageObject == null || (message = messageObject.messageOwner) == null) {
            TL_stars.SavedStarGift savedStarGift = i5Var.f9485y0;
            if (savedStarGift == null) {
                return;
            }
            z10 = !savedStarGift.unsaved;
            document = savedStarGift.gift.getDocument();
        } else {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                z10 = tL_messageActionStarGift.saved;
                document = tL_messageActionStarGift.gift.getDocument();
            } else {
                if (!(messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                    return;
                }
                TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                z10 = tL_messageActionStarGiftUnique.saved;
                document = tL_messageActionStarGiftUnique.gift.getDocument();
            }
        }
        TLRPC.Document document2 = document;
        boolean z12 = z10;
        dVar.setLoading(true);
        TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
        savestargift.unsave = z12;
        savestargift.stargift = inputSavedStarGiftE1;
        if (i5Var.f9485y0 == null || (k7VarF = u7.y(i5Var.currentAccount, false).F(i5Var.T, false)) == null) {
            z11 = false;
        } else {
            k7VarF.m(i5Var.f9485y0, savestargift.unsave);
            z11 = true;
        }
        ConnectionsManager.getInstance(i5Var.currentAccount).sendRequest(savestargift, new fh.j(i5Var, z11, document2, z12, savestargift));
    }

    public static void W0(i5 i5Var, TLRPC.TL_error tL_error, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity) {
        int i10;
        if (i5Var.getContext() == null) {
            return;
        }
        if (tL_error == null) {
            twoStepVerificationActivity.o0();
            twoStepVerificationActivity.finishFragment();
            if (tLObject instanceof TL_stars.starGiftWithdrawalUrl) {
                we.e.u(i5Var.getContext(), ((TL_stars.starGiftWithdrawalUrl) tLObject).url);
                return;
            }
            return;
        }
        if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
            if ("SRP_ID_INVALID".equals(tL_error.text)) {
                ConnectionsManager.getInstance(i5Var.currentAccount).sendRequest(new TL_account.getPassword(), new u2(i5Var, twoStepVerificationActivity, 1), 8);
                return;
            }
            twoStepVerificationActivity.o0();
            twoStepVerificationActivity.finishFragment();
            mc.b0(tL_error);
            return;
        }
        twoStepVerificationActivity.o0();
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(i5Var.getContext());
        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.Gift2TransferToTONAlertTitle);
        LinearLayout linearLayout = new LinearLayout(i5Var.getContext());
        linearLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(24.0f), 0);
        linearLayout.setOrientation(1);
        alertDialog$Builder.n(linearLayout);
        TextView textView = new TextView(i5Var.getContext());
        int i11 = org.telegram.ui.ActionBar.g6.f23161j5;
        textView.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        textView.setTextSize(1, 16.0f);
        textView.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2TransferToTONAlertText)));
        linearLayout.addView(textView, h7.z5.n(-1, -2));
        LinearLayout linearLayout2 = new LinearLayout(i5Var.getContext());
        linearLayout2.setOrientation(0);
        linearLayout.addView(linearLayout2, h7.z5.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        ImageView imageView = new ImageView(i5Var.getContext());
        imageView.setImageResource(R.drawable.list_circle);
        imageView.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(11.0f) : 0, AndroidUtilities.dp(9.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(11.0f), 0);
        int iW0 = org.telegram.ui.ActionBar.g6.w0(null, i11, false);
        PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
        imageView.setColorFilter(new PorterDuffColorFilter(iW0, mode));
        TextView textView2 = new TextView(i5Var.getContext());
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        textView2.setTextSize(1, 16.0f);
        textView2.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        org.telegram.messenger.y1.p(R.string.Gift2TransferToTONAlertText1, textView2);
        if (LocaleController.isRTL) {
            linearLayout2.addView(textView2, h7.z5.n(-1, -2));
            linearLayout2.addView(imageView, h7.z5.q(-2, -2, 5));
        } else {
            linearLayout2.addView(imageView, h7.z5.n(-2, -2));
            linearLayout2.addView(textView2, h7.z5.n(-1, -2));
        }
        LinearLayout linearLayout3 = new LinearLayout(i5Var.getContext());
        linearLayout3.setOrientation(0);
        linearLayout.addView(linearLayout3, h7.z5.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
        ImageView imageView2 = new ImageView(i5Var.getContext());
        imageView2.setImageResource(R.drawable.list_circle);
        imageView2.setPadding(LocaleController.isRTL ? AndroidUtilities.dp(11.0f) : 0, AndroidUtilities.dp(9.0f), LocaleController.isRTL ? 0 : AndroidUtilities.dp(11.0f), 0);
        imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.w0(null, i11, false), mode));
        TextView textView3 = new TextView(i5Var.getContext());
        textView3.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
        textView3.setTextSize(1, 16.0f);
        textView3.setGravity((LocaleController.isRTL ? 5 : 3) | 48);
        org.telegram.messenger.y1.p(R.string.Gift2TransferToTONAlertText2, textView3);
        if (LocaleController.isRTL) {
            linearLayout3.addView(textView3, h7.z5.n(-1, -2));
            i10 = 5;
            linearLayout3.addView(imageView2, h7.z5.q(-2, -2, 5));
        } else {
            i10 = 5;
            linearLayout3.addView(imageView2, h7.z5.n(-2, -2));
            linearLayout3.addView(textView3, h7.z5.n(-1, -2));
        }
        if ("PASSWORD_MISSING".equals(tL_error.text)) {
            alertDialog$Builder.k(LocaleController.getString(R.string.Gift2TransferToTONSetPassword), new h3.q2(i5Var));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        } else {
            TextView textView4 = new TextView(i5Var.getContext());
            textView4.setTextColor(org.telegram.ui.ActionBar.g6.w0(null, i11, false));
            textView4.setTextSize(1, 16.0f);
            if (!LocaleController.isRTL) {
                i10 = 3;
            }
            textView4.setGravity(i10 | 48);
            textView4.setText(LocaleController.getString(R.string.Gift2TransferToTONAlertText3));
            linearLayout.addView(textView4, h7.z5.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
            alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
        }
        twoStepVerificationActivity.showDialog(alertDialog$Builder.f22702a);
    }

    public static boolean X(i5 i5Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, gy gyVar, ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return false;
        }
        long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        long giftThemeUser = ChatThemeController.getInstance(i5Var.currentAccount).getGiftThemeUser(tL_starGiftUnique.slug);
        if (giftThemeUser != 0 && giftThemeUser != j10) {
            org.telegram.ui.Components.y4.n0(i5Var.getContext(), i5Var.resourcesProvider, i5Var.currentAccount, tL_starGiftUnique, giftThemeUser, new e2(i5Var, j10, tL_starGiftUnique, gyVar, 1));
            return true;
        }
        ChatThemeController.getInstance(i5Var.currentAccount).setDialogTheme(j10, new of.b(null, tL_starGiftUnique.slug));
        gyVar.presentFragment(rn.R9(j10), true);
        return true;
    }

    public static void Y(final i5 i5Var) {
        int i10;
        long peerDialogId;
        long j10;
        long dialogId;
        final long clientUserId = UserConfig.getInstance(i5Var.currentAccount).getClientUserId();
        final TL_stars.InputSavedStarGift inputSavedStarGiftE1 = i5Var.E1();
        if (inputSavedStarGiftE1 == null) {
            return;
        }
        MessageObject messageObject = i5Var.A0;
        if (messageObject != null) {
            i10 = messageObject.messageOwner.date;
            boolean zIsOutOwner = messageObject.isOutOwner();
            MessageObject messageObject2 = i5Var.A0;
            TLRPC.Message message = messageObject2.messageOwner;
            if (message == null) {
                return;
            }
            TLRPC.MessageAction messageAction = message.action;
            if (!(messageAction instanceof TLRPC.TL_messageActionStarGift)) {
                return;
            }
            TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
            TLRPC.Peer peer = tL_messageActionStarGift.peer;
            if (peer != null) {
                dialogId = DialogObject.getPeerDialogId(peer);
            } else {
                dialogId = zIsOutOwner ? messageObject2.getDialogId() : clientUserId;
            }
            TLRPC.Peer peer2 = tL_messageActionStarGift.from_id;
            if (peer2 != null) {
                peerDialogId = DialogObject.getPeerDialogId(peer2);
            } else {
                peerDialogId = zIsOutOwner ? clientUserId : i5Var.A0.getDialogId();
            }
            j10 = tL_messageActionStarGift.convert_stars;
        } else {
            TL_stars.SavedStarGift savedStarGift = i5Var.f9485y0;
            if (savedStarGift == null) {
                return;
            }
            i10 = savedStarGift.date;
            peerDialogId = ((savedStarGift.flags & 2) == 0 || savedStarGift.name_hidden) ? 2666000L : DialogObject.getPeerDialogId(savedStarGift.from_id);
            j10 = i5Var.f9485y0.convert_stars;
            dialogId = i5Var.T;
        }
        int iMax = Math.max(1, (MessagesController.getInstance(i5Var.currentAccount).stargiftsConvertPeriodMax - (ConnectionsManager.getInstance(i5Var.currentAccount).getCurrentTime() - i10)) / 86400);
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(i5Var.getContext(), 0, i5Var.resourcesProvider);
        String string = LocaleController.getString(R.string.Gift2ConvertTitle);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
        b2Var.N = string;
        b2Var.P = AndroidUtilities.replaceTags(LocaleController.formatPluralString("Gift2ConvertText2", iMax, (UserObject.isService(peerDialogId) || peerDialogId == 2666000) ? LocaleController.getString(R.string.StarsTransactionHidden) : DialogObject.getShortName(peerDialogId), LocaleController.formatPluralStringComma("Gift2ConvertStars", (int) j10)));
        final long j11 = j10;
        final long j12 = dialogId;
        alertDialog$Builder.k(LocaleController.getString(R.string.Gift2ConvertButton), new org.telegram.ui.ActionBar.a2() {
            @Override
            public final void f(org.telegram.ui.ActionBar.b2 b2Var2, int i11) {
                i5.k0(this.f9246a, inputSavedStarGiftE1, j12, clientUserId, j11);
            }
        });
        i0.a.w(R.string.Cancel, alertDialog$Builder, null);
    }

    public static void Y0(i5 i5Var, String str, long j10) {
        org.telegram.ui.ActionBar.n2 n2VarR = LaunchActivity.R();
        if (n2VarR == null) {
            return;
        }
        org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
        l2Var.f23619a = true;
        gh.y5 y5Var = new gh.y5(i5Var.T, str, j10, i5Var.resourcesProvider);
        y5Var.f7683e = new z2(i5Var, 0);
        n2VarR.showAsSheet(y5Var, l2Var);
    }

    public static void Z(i5 i5Var, boolean[] zArr, TL_stars.StarGiftAttribute starGiftAttribute, oc[] ocVarArr) {
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        TL_stars.StarGift starGiftB1 = i5Var.B1();
        GiftAuctionController.getInstance(i5Var.currentAccount).requestAuctionUpgrades(starGiftB1.gift_id, new i2(i5Var, starGiftB1, starGiftAttribute, ocVarArr, zArr, 0));
    }

    public static void Z0(i5 i5Var, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, TLRPC.Document document, String str, String str2, String str3, long j10, TLRPC.TL_error tL_error) {
        yy0 yy0Var;
        yy0 yy0Var2;
        float f10;
        float f11;
        char c10;
        ?? r10;
        b2Var.dismiss();
        if (!(tLObject instanceof TL_stars.UniqueStarGiftValueInfo)) {
            if (tL_error != null) {
                i5Var.getBulletinFactory().d0(tL_error, false);
                return;
            }
            return;
        }
        TL_stars.UniqueStarGiftValueInfo uniqueStarGiftValueInfo = (TL_stars.UniqueStarGiftValueInfo) tLObject;
        org.telegram.ui.ActionBar.e3 e3VarO = org.telegram.messenger.y1.o(i5Var.getContext(), i5Var.resourcesProvider, false, false);
        LinearLayout linearLayout = new LinearLayout(i5Var.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
        linearLayout.setClipChildren(false);
        linearLayout.setClipToPadding(false);
        org.telegram.ui.Components.n9 n9Var = new org.telegram.ui.Components.n9(i5Var.getContext());
        oa.Z0(n9Var.getImageReceiver(), document, 160);
        linearLayout.addView(n9Var, h7.z5.t(160, 160, 1, 0, 0, 0, 0));
        TextView textView = new TextView(i5Var.getContext());
        textView.setTextSize(1, 20.0f);
        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Sh, i5Var.resourcesProvider));
        textView.setTypeface(AndroidUtilities.bold());
        textView.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
        textView.setBackground(org.telegram.ui.ActionBar.g6.b0(AndroidUtilities.dp(21.0f), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, i5Var.resourcesProvider)));
        textView.setGravity(17);
        linearLayout.addView(textView, h7.z5.t(-2, 42, 1, 0, 12, 0, 15));
        textView.setText(str);
        TextView textView2 = new TextView(i5Var.getContext());
        textView2.setTextSize(1, 14.0f);
        textView2.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23161j5, i5Var.resourcesProvider));
        textView2.setGravity(17);
        linearLayout.addView(textView2, h7.z5.t(-2, -2, 1, 16, 0, 16, 19));
        if (uniqueStarGiftValueInfo.value_is_average) {
            rl.n(R.string.GiftValueAverage, new Object[]{str2}, textView2);
        } else if (uniqueStarGiftValueInfo.last_sale_on_fragment) {
            rl.n(R.string.GiftValueLastFragment, new Object[]{str3}, textView2);
        } else {
            rl.n(R.string.GiftValueLastTelegram, new Object[]{str3}, textView2);
        }
        FrameLayout frameLayout = new FrameLayout(i5Var.getContext());
        frameLayout.setClipChildren(false);
        frameLayout.setClipToPadding(false);
        gh.d0 d0Var = new gh.d0(i5Var, new lh.w3[1], frameLayout, 3);
        yy0 yy0Var3 = new yy0(i5Var.getContext(), i5Var.resourcesProvider);
        frameLayout.addView(yy0Var3, h7.z5.e(-1, -1, 119));
        yy0Var3.c(LocaleController.getString(R.string.GiftValueInitialSale), LocaleController.formatYearMonthDay(uniqueStarGiftValueInfo.initial_sale_date, true), null, null);
        String string = LocaleController.getString(R.string.GiftValueInitialPrice);
        StringBuilder sb2 = new StringBuilder("⭐️");
        sb2.append(uniqueStarGiftValueInfo.initial_sale_stars);
        sb2.append(" (~");
        yy0Var3.c(string, oa.X0(false, a9.p.p(sb2, BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.initial_sale_price, uniqueStarGiftValueInfo.currency), ")"), 0.8f, null), null, null);
        if (TLObject.hasFlag(uniqueStarGiftValueInfo.flags, 1)) {
            yy0Var3.c(LocaleController.getString(R.string.GiftValueLastSale), LocaleController.formatYearMonthDay(uniqueStarGiftValueInfo.last_sale_date, true), null, null);
            int iRound = ((int) (Math.round((uniqueStarGiftValueInfo.last_sale_price / uniqueStarGiftValueInfo.initial_sale_price) * 1000.0d) / 10)) - 100;
            if (iRound > 0) {
                yy0Var3.e(LocaleController.getString(R.string.GiftValueLastPrice), BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.last_sale_price, uniqueStarGiftValueInfo.currency), "+" + LocaleController.formatNumber(iRound, ' ') + "%", null, null);
                yy0Var = yy0Var3;
            } else {
                yy0Var = yy0Var3;
                yy0Var.c(LocaleController.getString(R.string.GiftValueLastPrice), BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.last_sale_price, uniqueStarGiftValueInfo.currency), null, null);
            }
        } else {
            yy0Var = yy0Var3;
        }
        if (TLObject.hasFlag(uniqueStarGiftValueInfo.flags, 4)) {
            r2 r2Var = new r2(d0Var, new oc[]{(oc) ((vy0) tableRowE.getChildAt(1)).getChildAt(0)}, uniqueStarGiftValueInfo, str2, 0);
            yy0Var2 = yy0Var;
            TableRow tableRowE = yy0Var2.e(LocaleController.getString(R.string.GiftValueMinPrice), BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.floor_price, uniqueStarGiftValueInfo.currency), "?", r2Var, null);
            tableRowE.setOnClickListener(new ag.w0(r2Var, 14));
        } else {
            yy0Var2 = yy0Var;
        }
        if (TLObject.hasFlag(uniqueStarGiftValueInfo.flags, 8)) {
            r2 r2Var2 = new r2(d0Var, new oc[]{(oc) ((vy0) tableRowE.getChildAt(1)).getChildAt(0)}, uniqueStarGiftValueInfo, str2, 1);
            TableRow tableRowE2 = yy0Var2.e(LocaleController.getString(R.string.GiftValueAveragePrice), BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.average_price, uniqueStarGiftValueInfo.currency), "?", r2Var2, null);
            tableRowE2.setOnClickListener(new ag.w0(r2Var2, 15));
        }
        linearLayout.addView(frameLayout, h7.z5.t(-1, -2, 7, 0, 0, 0, 12));
        if (uniqueStarGiftValueInfo.listed_count > 0) {
            lh.d dVar = new lh.d(i5Var.getContext(), i5Var.resourcesProvider, false);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) LocaleController.formatNumber(uniqueStarGiftValueInfo.listed_count, ' '));
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.append((CharSequence) "e");
            spannableStringBuilder.setSpan(new org.telegram.ui.Components.t5(document, 1.5f, dVar.getTextPaint().getFontMetricsInt()), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
            spannableStringBuilder.append((CharSequence) " ");
            spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.GiftValueOnSaleTelegram));
            dVar.g(AndroidUtilities.replaceArrows(spannableStringBuilder, false, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f)), false, true);
            f10 = 1.0f;
            f11 = 2.0f;
            c10 = ' ';
            r10 = 1;
            dVar.setOnClickListener(new s2(i5Var, str2, j10, 0));
            linearLayout.addView(dVar, h7.z5.t(-1, 42, 7, 0, 0, 0, 2));
        } else {
            f10 = 1.0f;
            f11 = 2.0f;
            c10 = ' ';
            r10 = 1;
        }
        if (uniqueStarGiftValueInfo.fragment_listed_count > 0) {
            lh.d dVar2 = new lh.d(i5Var.getContext(), i5Var.resourcesProvider, false);
            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
            spannableStringBuilder2.append((CharSequence) LocaleController.formatNumber(uniqueStarGiftValueInfo.fragment_listed_count, c10));
            spannableStringBuilder2.append((CharSequence) "e");
            spannableStringBuilder2.setSpan(new org.telegram.ui.Components.t5(document, 1.5f, dVar2.getTextPaint().getFontMetricsInt()), spannableStringBuilder2.length() - r10, spannableStringBuilder2.length(), 33);
            spannableStringBuilder2.append((CharSequence) " ");
            spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.GiftValueOnSaleFragment));
            dVar2.g(AndroidUtilities.replaceArrows(spannableStringBuilder2, false, AndroidUtilities.dp(f11), AndroidUtilities.dp(f10)), false, r10);
            dVar2.setOnClickListener(new ag.q0(18, i5Var, uniqueStarGiftValueInfo));
            linearLayout.addView(dVar2, h7.z5.t(-1, 42, 7, 0, 0, 0, 0));
        }
        e3VarO.customView = linearLayout;
        e3VarO.show();
    }

    public static void a0(i5 i5Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        i5Var.f9464g1 = false;
        if (!(tLObject instanceof TLRPC.PaymentForm)) {
            ec ecVarY = i5Var.getBulletinFactory().Y(tL_error);
            ecVarY.f28030t = true;
            ecVarY.j();
        } else {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            MessagesController.getInstance(i5Var.currentAccount).putUsers(paymentForm.users, false);
            i5Var.f9466h1 = paymentForm;
            i5Var.b2();
        }
    }

    public static void a1(final i5 i5Var, final gh.x0 x0Var, hf.b bVar, final TL_stars.TL_starGiftUnique tL_starGiftUnique, final long j10, final TLRPC.TL_textWithEntities tL_textWithEntities, final boolean z10, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        i5Var.f9461f0.setLoading(false);
        if (x0Var != null && x0Var.H) {
            x0Var.H = false;
            x0Var.D.h(false);
        }
        if (tL_payments_paymentFormStarGift == null) {
            return;
        }
        new m4(i5Var.getContext(), i5Var.resourcesProvider, tL_starGiftUnique, new k4(bVar, tL_payments_paymentFormStarGift), i5Var.currentAccount, j10, i5Var.C1(), false, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                i5.R(this.f9817a, tL_starGiftUnique, j10, tL_textWithEntities, z10, x0Var, (k4) obj, (we.d) obj2);
            }
        }).b();
    }

    public static void b0(i5 i5Var) {
        Bundle bundle = new Bundle();
        long j10 = i5Var.T;
        if (j10 >= 0) {
            bundle.putLong("user_id", j10);
        } else {
            bundle.putLong("chat_id", -j10);
        }
        if (j10 == UserConfig.getInstance(i5Var.currentAccount).getClientUserId()) {
            bundle.putBoolean("my_profile", true);
        }
        bundle.putBoolean("open_gifts", true);
        bundle.putBoolean("open_gifts_upgradable", true);
        d2(new ProfileActivity(bundle, null));
    }

    public static void b1(i5 i5Var) {
        lh.d dVar = i5Var.f9461f0;
        if (UserConfig.getInstance(i5Var.currentAccount).isPremium() && (P1(i5Var.currentAccount, i5Var.K1()) || i5Var.R0)) {
            i5Var.r2(false);
            return;
        }
        TL_stars.TL_starGiftUnique tL_starGiftUniqueK1 = i5Var.K1();
        if (tL_starGiftUniqueK1 == null) {
            return;
        }
        TLRPC.Peer peer = tL_starGiftUniqueK1.owner_id;
        if (peer == null) {
            peer = tL_starGiftUniqueK1.host_id;
        }
        long peerDialogId = DialogObject.getPeerDialogId(peer);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUniqueK1.title);
        sb2.append(" #");
        i5Var.f9482v0.setText(LocaleController.formatString(R.string.Gift2WearTitle, i0.a.m(tL_starGiftUniqueK1.num, ',', sb2)));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.Gift2WearStart));
        if (!UserConfig.getInstance(i5Var.currentAccount).isPremium()) {
            spannableStringBuilder.append((CharSequence) " l");
            if (i5Var.Q0 == null) {
                i5Var.Q0 = new cq(R.drawable.msg_mini_lock3, 0);
            }
            spannableStringBuilder.setSpan(i5Var.Q0, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        dVar.g(spannableStringBuilder, true, true);
        dVar.f(null, true);
        dVar.setOnClickListener(new n1(i5Var, 26));
        i5Var.f9451a0.setWearPreview(MessagesController.getInstance(i5Var.currentAccount).getUserOrChat(peerDialogId));
        i5Var.q2(2, true, null);
    }

    public static void c0(i5 i5Var, Utilities.Callback2 callback2, ArrayList arrayList, Runnable runnable, TLRPC.Updates updates, TLRPC.TL_error tL_error) {
        AlertDialog$Builder alertDialog$Builder;
        int i10;
        MessageObject messageObject;
        if (updates != null) {
            ArrayList arrayListFindUpdates = MessagesController.findUpdates(updates, TL_update.TL_updateNewMessage.class);
            int size = arrayListFindUpdates.size();
            int i11 = 0;
            while (true) {
                if (i11 >= size) {
                    messageObject = null;
                    break;
                }
                Object obj = arrayListFindUpdates.get(i11);
                i11++;
                TLRPC.Message message = ((TL_update.TL_updateNewMessage) obj).message;
                if (message != null && (message.action instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                    messageObject = new MessageObject(i5Var.currentAccount, message, false, false);
                    break;
                }
            }
            MessagesController.getInstance(i5Var.currentAccount).processUpdates(updates, false);
            if (messageObject != null) {
                TL_stars.StarGift starGift = ((TLRPC.TL_messageActionStarGiftUnique) messageObject.messageOwner.action).gift;
                callback2.run(starGift, new androidx.car.app.utils.b(i5Var, messageObject, arrayList, starGift, 7));
                return;
            }
            callback2.run(null, null);
            u7.y(i5Var.currentAccount, false).P();
            m7 m7VarG = u7.y(i5Var.currentAccount, false).G(UserConfig.getInstance(i5Var.currentAccount).getClientUserId(), false);
            if (m7VarG != null) {
                m7VarG.j(arrayList, null);
                return;
            }
            return;
        }
        if (tL_error != null) {
            if (!"STARGIFT_CRAFT_UNAVAILABLE".equalsIgnoreCase(tL_error.text)) {
                String str = tL_error.text;
                if (str == null || !str.startsWith("STARGIFT_CRAFT_TOO_EARLY_")) {
                    i5Var.getBulletinFactory().d0(tL_error, false);
                } else {
                    long j10 = Long.parseLong(tL_error.text.substring(25)) + ((long) ConnectionsManager.getInstance(i5Var.currentAccount).getCurrentTime());
                    alertDialog$Builder = new AlertDialog$Builder(i5Var.getContext(), 0, new jh.b());
                    String string = LocaleController.getString(R.string.GiftCraftUnavailableTitle);
                    org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
                    b2Var.N = string;
                    b2Var.P = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCraftUnavailableTextTime, LocaleController.formatDateTime(j10, true)));
                    i10 = R.string.OK;
                }
                runnable.run();
            }
            alertDialog$Builder = new AlertDialog$Builder(i5Var.getContext(), 0, new jh.b());
            String string2 = LocaleController.getString(R.string.GiftCraftUnavailableTitle);
            org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder.f22702a;
            b2Var2.N = string2;
            b2Var2.P = AndroidUtilities.replaceTags(LocaleController.getString(R.string.GiftCraftUnavailableText));
            i10 = R.string.OK;
            i0.a.C(i10, alertDialog$Builder, null);
            runnable.run();
        }
    }

    public static void c1(i5 i5Var, TLObject tLObject, CharSequence charSequence, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails, TLRPC.TL_error tL_error) {
        if (!(tLObject instanceof TLRPC.PaymentForm)) {
            if (tL_error != null) {
                i5Var.getBulletinFactory().d0(tL_error, false);
                return;
            }
            return;
        }
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
        LinearLayout linearLayout = new LinearLayout(i5Var.getContext());
        linearLayout.setOrientation(1);
        linearLayout.setPadding(AndroidUtilities.dp(23.0f), 0, AndroidUtilities.dp(23.0f), 0);
        TextView textViewB = h7.d6.b(i5Var.getContext(), 16.0f, org.telegram.ui.ActionBar.g6.f23161j5, false, null);
        textViewB.setText(LocaleController.getString(R.string.Gift2RemoveDescriptionText));
        linearLayout.addView(textViewB, h7.z5.k(0.0f, 0.0f, 0.0f, 16.0f, -1, -2));
        yy0 yy0Var = new yy0(i5Var.getContext(), i5Var.resourcesProvider);
        wy0 wy0VarA = yy0Var.a(charSequence);
        wy0VarA.setFilled(true);
        eh.s sVar = (eh.s) wy0VarA.getChildAt(0);
        sVar.setTextSize(1, 12.0f);
        sVar.setGravity(17);
        linearLayout.addView(yy0Var, h7.z5.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(i5Var.getContext(), 0, i5Var.resourcesProvider);
        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.Gift2RemoveDescriptionTitle);
        alertDialog$Builder.n(linearLayout);
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        alertDialog$Builder.k(oa.Q0(LocaleController.formatString(R.string.Gift2RemoveDescriptionButton, Integer.valueOf((int) j10))), new q2(i5Var, tL_starGiftUnique, paymentForm, tL_inputInvoiceStarGiftDropOriginalDetails, j10, charSequence));
        alertDialog$Builder.o();
    }

    public static void d0(i5 i5Var, long j10, TL_stars.TL_starGiftUnique tL_starGiftUnique, gy gyVar) {
        ChatThemeController.getInstance(i5Var.currentAccount).setDialogTheme(j10, new of.b(null, tL_starGiftUnique.slug));
        gyVar.presentFragment(rn.R9(j10), true);
    }

    public static void d1(i5 i5Var, long j10) {
        ea eaVar = new ea(i5Var.getContext(), i5Var.resourcesProvider, j10, 10, null, new d5.u(24, i5Var, new boolean[]{false}), 0L);
        eaVar.setOnDismissListener(new a3(i5Var, 0));
        eaVar.show();
    }

    public static void d2(org.telegram.ui.ActionBar.n2 n2Var) {
        org.telegram.ui.ActionBar.n2 n2VarU = LaunchActivity.U();
        if (n2VarU == null) {
            return;
        }
        org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
        l2Var.f23619a = true;
        n2VarU.showAsSheet(n2Var, l2Var);
    }

    public static void e0(i5 i5Var, long j10, long j11, Utilities.Callback callback) {
        ea eaVar = new ea(i5Var.getContext(), i5Var.resourcesProvider, j10, 11, null, new e2(i5Var, new boolean[]{false}, j11, callback, 2), 0L);
        eaVar.setOnDismissListener(new a3(i5Var, 1));
        eaVar.show();
    }

    public static void e1(i5 i5Var, TLRPC.TL_messageActionStarGift tL_messageActionStarGift, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject) {
        MessageObject messageObject;
        if (!(tLObject instanceof TLRPC.messages_Messages)) {
            messageObject = null;
            break;
        }
        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
        MessagesController.getInstance(i5Var.currentAccount).putUsers(messages_messages.users, false);
        MessagesController.getInstance(i5Var.currentAccount).putChats(messages_messages.chats, false);
        int i10 = 0;
        while (true) {
            if (i10 >= messages_messages.messages.size()) {
                messageObject = null;
                break;
            }
            TLRPC.Message message = messages_messages.messages.get(i10);
            if (message != null && !(message instanceof TLRPC.TL_messageEmpty) && message.f22401id == tL_messageActionStarGift.upgrade_msg_id) {
                messageObject = new MessageObject(i5Var.currentAccount, message, false, false);
                messageObject.setType();
                break;
            }
            i10++;
        }
        if (messageObject != null) {
            AndroidUtilities.runOnUIThread(new androidx.car.app.utils.a(i5Var, b2Var, messageObject, 24));
        } else {
            AndroidUtilities.runOnUIThread(new h3(b2Var, 0));
        }
    }

    public static void f0(i5 i5Var, TLObject tLObject, long j10, long j11, Utilities.Callback callback, TLRPC.TL_error tL_error, long j12) {
        int i10 = 1;
        if (!(tLObject instanceof TLRPC.TL_payments_paymentResult)) {
            if (tL_error == null || !"BALANCE_TOO_LOW".equals(tL_error.text)) {
                callback.run(tL_error);
                i5Var.getBulletinFactory().d0(tL_error, false);
                return;
            } else {
                if (!MessagesController.getInstance(i5Var.currentAccount).starsPurchaseAvailable()) {
                    i5Var.f9461f0.setLoading(false);
                    u7.e0(i5Var.getContext(), i5Var.resourcesProvider);
                    return;
                }
                u7 u7VarY = u7.y(i5Var.currentAccount, false);
                e5.w wVar = new e5.w(i5Var, j12, j10, callback, 1);
                u7VarY.f10154e = false;
                u7VarY.q(false, true, wVar);
                u7VarY.f10154e = true;
                return;
            }
        }
        TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) tLObject;
        MessagesController.getInstance(i5Var.currentAccount).putUsers(tL_payments_paymentResult.updates.users, false);
        MessagesController.getInstance(i5Var.currentAccount).putChats(tL_payments_paymentResult.updates.chats, false);
        u7.y(i5Var.currentAccount, false).T(false);
        u7.y(i5Var.currentAccount, false).Q(j10);
        u7.y(i5Var.currentAccount, false).Q(j11);
        u7.y(i5Var.currentAccount, false).P();
        callback.run(null);
        org.telegram.ui.ActionBar.n2 n2VarU = LaunchActivity.U();
        if (n2VarU != null) {
            if (j10 < 0 || j11 < 0) {
                ec ecVarM = mc.a0(n2VarU).M(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, i5Var.C1(), DialogObject.getShortName(j10))), R.raw.forward);
                ecVarM.f28030t = true;
                ecVarM.j();
            } else {
                rn rnVarR9 = rn.R9(j10);
                rnVarR9.whenFullyVisible(new t2(i5Var, rnVarR9, j10, 1));
                n2VarU.presentFragment(rnVarR9);
            }
        }
        Utilities.stageQueue.postRunnable(new x2(i5Var, tL_payments_paymentResult, i10));
    }

    public static void f1(i5 i5Var, TL_stars.InputSavedStarGift inputSavedStarGift, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            MessagesController.getInstance(i5Var.currentAccount).putUsers(updates.users, false);
            MessagesController.getInstance(i5Var.currentAccount).putChats(updates.chats, false);
        }
        AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b(i5Var, tL_error, tLObject, inputSavedStarGift, 8));
    }

    public static void g0(i5 i5Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, Utilities.Callback callback, Boolean bool) {
        if (i5Var.P0 == null) {
            gh.w5 w5Var = new gh.w5(i5Var.currentAccount, tL_starGiftUnique.gift_id);
            i5Var.P0 = w5Var;
            w5Var.a();
        }
        HashSet hashSet = new HashSet();
        int i10 = 0;
        while (true) {
            e4[] e4VarArr = i5Var.f9451a0.H.f9315n;
            if (i10 >= e4VarArr.length) {
                gh.x5 x5Var = new gh.x5(i5Var.getContext(), tL_starGiftUnique.title, i5Var.P0);
                x5Var.f7628c0.addAll(hashSet);
                x5Var.f7630e0.N(true);
                x5Var.f7629d0 = bool.booleanValue();
                x5Var.f7626a0.set(AndroidUtilities.replaceTags(LocaleController.formatPluralString("GiftCraftSelect", 4 - hashSet.size(), new Object[0])));
                x5Var.f7627b0 = new p1(0, callback);
                x5Var.show();
                return;
            }
            TL_stars.StarGift starGift = e4VarArr[i10].h;
            if ((starGift != null ? starGift : null) != null) {
                if (starGift == null) {
                    starGift = null;
                }
                hashSet.add(Long.valueOf(starGift.f22607id));
            }
            i10++;
        }
    }

    public static void g1(final i5 i5Var) {
        TL_stars.SavedStarGift savedStarGift = i5Var.f9485y0;
        if (savedStarGift.unsaved) {
            savedStarGift.unsaved = false;
            k7 k7VarF = u7.y(i5Var.currentAccount, false).F(i5Var.T, false);
            if (k7VarF != null) {
                TL_stars.SavedStarGift savedStarGift2 = i5Var.f9485y0;
                k7VarF.m(savedStarGift2, savedStarGift2.unsaved);
            }
            TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
            savestargift.stargift = i5Var.E1();
            savestargift.unsave = i5Var.f9485y0.unsaved;
            ConnectionsManager.getInstance(i5Var.currentAccount).sendRequest(savestargift, null, 64);
        }
        TL_stars.SavedStarGift savedStarGift3 = i5Var.f9485y0;
        boolean z10 = savedStarGift3.pinned_to_top;
        if (((m7) i5Var.f9486z0).m(savedStarGift3, !z10, false)) {
            new gh.c4(i5Var.getContext(), i5Var.T, i5Var.f9485y0, i5Var.resourcesProvider, new Utilities.Callback0Return() {
                @Override
                public final Object run() {
                    return this.f10014a.getBulletinFactory();
                }
            }).show();
            return;
        }
        if (z10) {
            org.telegram.messenger.y1.q(R.string.Gift2Unpinned, i5Var.getBulletinFactory(), R.raw.ic_unpin, 36);
        } else {
            i5Var.getBulletinFactory().M(LocaleController.getString(R.string.Gift2PinnedTitle), LocaleController.getString(R.string.Gift2PinnedSubtitle), R.raw.ic_pin).j();
        }
    }

    public static SpannableStringBuilder g2(String str) {
        if (str == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        SpannableString spannableString = new SpannableString("👌");
        spannableString.setSpan(new cq(R.drawable.filled_understood, 0), 0, spannableString.length(), 33);
        SpannableString spannableString2 = new SpannableString("👍");
        spannableString2.setSpan(new cq(R.drawable.filled_reactions, 0), 0, spannableString2.length(), 33);
        AndroidUtilities.replaceMultipleCharSequence("👌", spannableStringBuilder, spannableString);
        AndroidUtilities.replaceMultipleCharSequence("👍", spannableStringBuilder, spannableString2);
        return spannableStringBuilder;
    }

    public static void h0(i5 i5Var, TLObject tLObject, String str, TL_stars.InputSavedStarGift inputSavedStarGift, TLRPC.TL_error tL_error, long j10) {
        TL_stars.SavedStarGift savedStarGift;
        if (tLObject instanceof TLRPC.TL_payments_paymentResult) {
            TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) tLObject;
            MessagesController.getInstance(i5Var.currentAccount).putUsers(tL_payments_paymentResult.updates.users, false);
            MessagesController.getInstance(i5Var.currentAccount).putChats(tL_payments_paymentResult.updates.chats, false);
            u7.y(i5Var.currentAccount, false).T(false);
            u7.y(i5Var.currentAccount, false).P();
            if (!TextUtils.isEmpty(str) && (savedStarGift = i5Var.f9485y0) != null) {
                savedStarGift.flags &= -65537;
                savedStarGift.prepaid_upgrade_hash = null;
            }
            i5Var.m0 = true;
            i5Var.f9466h1 = null;
            i5Var.r1(inputSavedStarGift, tL_payments_paymentResult.updates, new w2(i5Var, str, 0));
            Utilities.stageQueue.postRunnable(new x2(i5Var, tL_payments_paymentResult, 0));
            return;
        }
        if (tL_error == null || !"BALANCE_TOO_LOW".equals(tL_error.text)) {
            i5Var.getBulletinFactory().d0(tL_error, false);
            return;
        }
        if (!MessagesController.getInstance(i5Var.currentAccount).starsPurchaseAvailable()) {
            i5Var.f9461f0.setLoading(false);
            u7.e0(i5Var.getContext(), i5Var.resourcesProvider);
            return;
        }
        u7 u7VarY = u7.y(i5Var.currentAccount, false);
        w1 w1Var = new w1(i5Var, j10, 3);
        u7VarY.f10154e = false;
        u7VarY.q(false, true, w1Var);
        u7VarY.f10154e = true;
    }

    public static void i0(i5 i5Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, hf.a aVar, Runnable runnable) {
        i5Var.getClass();
        TL_stars.StarsAmount starsAmountO = aVar.o();
        TL_stars.updateStarGiftPrice updatestargiftprice = new TL_stars.updateStarGiftPrice();
        updatestargiftprice.stargift = i5Var.E1();
        updatestargiftprice.resell_amount = starsAmountO;
        ConnectionsManager.getInstance(i5Var.currentAccount).sendRequest(updatestargiftprice, new t1(i5Var, tL_starGiftUnique, aVar, runnable, 1));
    }

    public static void i1(i5 i5Var, String str) {
        long j10 = i5Var.T;
        i5Var.f9461f0.setLoading(false);
        if (TextUtils.isEmpty(str)) {
            i5Var.q2(0, true, null);
            return;
        }
        i5Var.dismiss();
        org.telegram.ui.ActionBar.n2 n2VarR = LaunchActivity.R();
        if (n2VarR == null) {
            return;
        }
        if (n2VarR instanceof rn) {
            rn rnVar = (rn) n2VarR;
            if (rnVar.a() == j10) {
                mc.a0(rnVar).M(LocaleController.getString(R.string.StarsGiftUpgradeCompleted), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StarsGiftUpgradeCompletedText, DialogObject.getShortName(j10))), R.raw.gift).k(true);
                return;
            }
        }
        NotificationCenter notificationCenter = NotificationCenter.getInstance(i5Var.currentAccount);
        int i10 = NotificationCenter.closeProfileActivity;
        Long lValueOf = Long.valueOf(j10);
        Boolean bool = Boolean.FALSE;
        notificationCenter.lambda$postNotificationNameOnUIThread$1(i10, lValueOf, bool);
        NotificationCenter.getInstance(i5Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChatActivity, Long.valueOf(j10), bool);
        rn rnVarR9 = rn.R9(j10);
        rnVarR9.whenFullyVisible(new d5.u(26, i5Var, rnVarR9));
        n2VarR.presentFragment(rnVarR9);
    }

    public static void j0(i5 i5Var, TLObject tLObject, MessageObject messageObject) {
        TLRPC.Message message;
        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
        MessagesController.getInstance(i5Var.currentAccount).putUsers(messages_messages.users, false);
        MessagesController.getInstance(i5Var.currentAccount).putChats(messages_messages.chats, false);
        i5Var.F0 = true;
        i5Var.E0 = false;
        Boolean bool = i5Var.f9454b1;
        if (bool != null && (message = messageObject.messageOwner) != null) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                ((TLRPC.TL_messageActionStarGift) messageAction).saved = true ^ bool.booleanValue();
            } else if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                ((TLRPC.TL_messageActionStarGiftUnique) messageAction).saved = true ^ bool.booleanValue();
            }
        }
        i5Var.i2(messageObject, null);
    }

    public static void j1(i5 i5Var, boolean z10) {
        int iG1 = i5Var.G1();
        if (iG1 < 0) {
            return;
        }
        int i10 = (z10 ? 1 : -1) + iG1;
        int i11 = i5Var.N0;
        if (i11 >= 0 && (!z10 ? i11 < iG1 : i11 > iG1)) {
            i10 = i11;
        }
        n7 n7Var = i5Var.f9486z0;
        Object obj = (n7Var == null || i10 < 0 || i10 >= n7Var.e()) ? null : i5Var.f9486z0.get(i10);
        if (obj == null) {
            return;
        }
        if ((z10 ? i5Var.Y : i5Var.X) != null) {
            if (obj instanceof TL_stars.SavedStarGift) {
                if (x1((z10 ? i5Var.Y : i5Var.X).f9485y0, (TL_stars.SavedStarGift) obj)) {
                    return;
                }
            }
            if (obj instanceof TL_stars.TL_starGiftUnique) {
                if (y1((z10 ? i5Var.Y : i5Var.X).C0, (TL_stars.TL_starGiftUnique) obj)) {
                    return;
                }
            }
        }
        gh.s3 s3Var = new gh.s3(i5Var, i5Var.getContext(), i5Var.currentAccount, i5Var.T, i5Var.resourcesProvider, i5Var.U.getRootView());
        if (obj instanceof TL_stars.SavedStarGift) {
            s3Var.j2((TL_stars.SavedStarGift) obj, i5Var.f9486z0);
        } else if (obj instanceof TL_stars.TL_starGiftUnique) {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj;
            s3Var.h2(tL_starGiftUnique.slug, tL_starGiftUnique, i5Var.f9486z0);
        }
        AndroidUtilities.removeFromParent(s3Var.containerView);
        if (z10) {
            i5Var.Y = s3Var;
        } else {
            i5Var.X = s3Var;
        }
    }

    public static void k0(i5 i5Var, TL_stars.InputSavedStarGift inputSavedStarGift, long j10, long j11, long j12) {
        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(ApplicationLoader.applicationContext, 3, null);
        b2Var.q(500L);
        TL_stars.convertStarGift convertstargift = new TL_stars.convertStarGift();
        convertstargift.stargift = inputSavedStarGift;
        ConnectionsManager.getInstance(i5Var.currentAccount).sendRequest(convertstargift, new a2(i5Var, b2Var, j10, j11, j12));
    }

    public static void k1(final i5 i5Var, final View view) {
        LaunchActivity launchActivity = LaunchActivity.C1;
        if (launchActivity == null) {
            return;
        }
        lh.lb lbVarB = view instanceof org.telegram.ui.Cells.b7 ? nb.b((org.telegram.ui.Cells.b7) view) : null;
        ArrayList arrayList = new ArrayList();
        MessageObject messageObject = i5Var.A0;
        if (messageObject != null) {
            arrayList.add(messageObject);
        } else {
            if (!(i5Var.B1() instanceof TL_stars.TL_starGiftUnique)) {
                return;
            }
            long clientUserId = UserConfig.getInstance(i5Var.currentAccount).getClientUserId();
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) i5Var.B1();
            TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
            tL_messageService.peer_id = MessagesController.getInstance(i5Var.currentAccount).getPeer(clientUserId);
            tL_messageService.from_id = MessagesController.getInstance(i5Var.currentAccount).getPeer(clientUserId);
            tL_messageService.date = ConnectionsManager.getInstance(i5Var.currentAccount).getCurrentTime();
            TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = new TLRPC.TL_messageActionStarGiftUnique();
            tL_messageActionStarGiftUnique.gift = tL_starGiftUnique;
            tL_messageActionStarGiftUnique.upgrade = true;
            tL_messageService.action = tL_messageActionStarGiftUnique;
            MessageObject messageObject2 = new MessageObject(i5Var.currentAccount, tL_messageService, false, false);
            messageObject2.setType();
            arrayList.add(messageObject2);
        }
        final sb sbVarE = sb.E(launchActivity, i5Var.currentAccount);
        sbVarE.N = new Utilities.Callback4() {
            @Override
            public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
                Runnable runnable = (Runnable) obj2;
                Long l10 = (Long) obj4;
                boolean zBooleanValue = ((Boolean) obj3).booleanValue();
                sb sbVar = sbVarE;
                lh.lb lbVarB2 = null;
                if (zBooleanValue) {
                    i5 i5Var2 = this.f9814a;
                    AndroidUtilities.runOnUIThread(new d5.u(20, i5Var2, l10));
                    sbVar.Y(null);
                    k3 k3Var = i5Var2.S0;
                    if (k3Var != null) {
                        k3Var.dismiss();
                        i5Var2.S0 = null;
                    }
                } else {
                    View view2 = view;
                    if ((view2 instanceof org.telegram.ui.Cells.b7) && view2.isAttachedToWindow()) {
                        lbVarB2 = nb.b((org.telegram.ui.Cells.b7) view2);
                    }
                    sbVar.Y(lbVarB2);
                }
                AndroidUtilities.runOnUIThread(runnable);
            }
        };
        sbVarE.U(lbVarB, lh.z7.y(arrayList));
    }

    public static void l0(i5 i5Var, long j10) {
        new gh.k2(i5Var.getContext(), i5Var.currentAccount, j10, null, new z2(i5Var, 2)).show();
    }

    public static void m0(i5 i5Var, org.telegram.ui.ActionBar.b2 b2Var, TL_stars.SavedStarGift savedStarGift) {
        if (savedStarGift != null) {
            b2Var.dismiss();
            i5Var.H0 = true;
            i5Var.j2(savedStarGift, null);
            super.show();
            return;
        }
        b2Var.dismiss();
        org.telegram.ui.ActionBar.n2 n2VarU = LaunchActivity.U();
        if (n2VarU != null) {
            ec ecVarQ = mc.a0(n2VarU).Q(R.raw.error, 36, LocaleController.getString(R.string.MessageNotFound));
            ecVarQ.f28030t = true;
            ecVarQ.j();
        }
    }

    public static void n0(i5 i5Var) {
        TL_stars.TL_starGiftUnique tL_starGiftUniqueK1 = i5Var.K1();
        new o0(i5Var.getContext(), i5Var.currentAccount, DialogObject.getPeerDialogId(tL_starGiftUniqueK1.owner_id), tL_starGiftUniqueK1, i5Var.resourcesProvider, new v1(i5Var, 2)).show();
    }

    public static void o0(i5 i5Var, String str) {
        i5Var.dismiss();
        we.e.s(i5Var.getContext(), "https://" + MessagesController.getInstance(i5Var.currentAccount).linkPrefix + "/" + str);
    }

    public static void p0(i5 i5Var) {
        if (i5Var.f9466h1 == null) {
            return;
        }
        long j10 = 0;
        for (int i10 = 0; i10 < i5Var.f9466h1.invoice.prices.size(); i10++) {
            j10 += i5Var.f9466h1.invoice.prices.get(i10).amount;
        }
        g5 g5Var = new g5(i5Var.getContext(), j10, i5Var.f9460e1, i5Var.resourcesProvider);
        i5Var.f9473l0 = g5Var;
        g5Var.show();
    }

    public static void q0(i5 i5Var, we.d dVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(i5Var.currentAccount).processUpdates((TLRPC.Updates) tLObject, false);
            AndroidUtilities.runOnUIThread(new androidx.car.app.utils.a(i5Var, dVar, tL_starGiftUnique, 21));
            return;
        }
        i5Var.getClass();
        if (tL_error != null && tL_error.text.startsWith("STARGIFT_RESELL_TOO_EARLY_")) {
            AndroidUtilities.runOnUIThread(new e5.u(i5Var, dVar, Long.parseLong(tL_error.text.substring(26)), 3));
        } else if (tL_error != null) {
            AndroidUtilities.runOnUIThread(new androidx.car.app.utils.a(i5Var, dVar, tL_error, 22));
        }
    }

    public static void q1(yy0 yy0Var, TL_stars.StarGiftAttribute starGiftAttribute) {
        String string;
        if (starGiftAttribute instanceof TL_stars.starGiftAttributeModel) {
            string = LocaleController.getString(R.string.Gift2AttributeModel);
        } else if (starGiftAttribute instanceof TL_stars.starGiftAttributePattern) {
            string = LocaleController.getString(R.string.Gift2AttributeSymbol);
        } else if (!(starGiftAttribute instanceof TL_stars.starGiftAttributeBackdrop)) {
            return;
        } else {
            string = LocaleController.getString(R.string.Gift2AttributeBackdrop);
        }
        String str = string;
        Integer[] numArr = new Integer[1];
        yy0Var.e(str, starGiftAttribute.name, J1(starGiftAttribute.rarity, numArr), null, numArr[0]);
    }

    public static void r0(i5 i5Var, TL_stars.StarGift starGift, TL_stars.StarGiftAttribute starGiftAttribute, oc[] ocVarArr, boolean[] zArr, ArrayList arrayList) {
        if (arrayList != null) {
            new l1(i5Var.getContext(), i5Var.resourcesProvider, i5Var.currentAccount, starGift.title, arrayList, false).show();
        } else {
            i5Var.o2(ocVarArr[0], LocaleController.formatString(R.string.Gift2RarityHint, nh.k.G0(starGiftAttribute.getRarityPermille())), false);
        }
        zArr[0] = false;
    }

    public static void s0(i5 i5Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, hf.a aVar, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(i5Var.currentAccount).processUpdates((TLRPC.Updates) tLObject, false);
            AndroidUtilities.runOnUIThread(new k2(i5Var, tL_starGiftUnique, aVar, runnable, 0));
            return;
        }
        i5Var.getClass();
        if (tL_error != null && tL_error.text.startsWith("STARGIFT_RESELL_TOO_EARLY_")) {
            AndroidUtilities.runOnUIThread(new e5.u(i5Var, Long.parseLong(tL_error.text.substring(26)), runnable, 2));
        } else if (tL_error != null) {
            AndroidUtilities.runOnUIThread(new l2(i5Var, tL_error, runnable, 0));
        }
    }

    public static void u0(i5 i5Var, ArrayList arrayList, Utilities.Callback2 callback2, Runnable runnable) {
        gh.w5 w5Var = i5Var.P0;
        if (w5Var != null) {
            w5Var.b();
            i5Var.P0 = null;
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
        ConnectionsManager.getInstance(i5Var.currentAccount).sendRequestTyped(craftstargift, new org.telegram.messenger.a(), new b2(i5Var, callback2, arrayList, runnable, 0));
    }

    public static void v0(i5 i5Var) {
        String str;
        boolean z10;
        int i10;
        TL_stars.StarGiftUpgradePrice starGiftUpgradePrice;
        cq[] cqVarArr = i5Var.f9468i1;
        lh.d dVar = i5Var.f9461f0;
        int i11 = 1;
        if (i5Var.U0.f9526c == 1 && !i5Var.isDismissed()) {
            TL_stars.InputSavedStarGift inputSavedStarGiftE1 = i5Var.E1();
            MessageObject messageObject = i5Var.A0;
            long j10 = 0;
            if (messageObject != null) {
                TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
                if (!(messageAction instanceof TLRPC.TL_messageActionStarGift)) {
                    return;
                }
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                long j11 = tL_messageActionStarGift.upgrade_stars;
                str = tL_messageActionStarGift.prepaid_upgrade_hash;
                if (j11 > 0 || TextUtils.isEmpty(str)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
            } else {
                TL_stars.SavedStarGift savedStarGift = i5Var.f9485y0;
                if (savedStarGift == null) {
                    return;
                }
                long j12 = savedStarGift.upgrade_stars;
                str = savedStarGift.prepaid_upgrade_hash;
                if (j12 > 0 || TextUtils.isEmpty(str)) {
                    z10 = false;
                } else {
                    z10 = true;
                }
            }
            int currentTime = ConnectionsManager.getInstance(i5Var.currentAccount).getCurrentTime();
            if (i5Var.f9462f1 == null) {
                i10 = -1;
                starGiftUpgradePrice = null;
                break;
            }
            i10 = 0;
            while (true) {
                if (i10 >= i5Var.f9462f1.size()) {
                    i10 = -1;
                    starGiftUpgradePrice = null;
                    break;
                } else {
                    starGiftUpgradePrice = (TL_stars.StarGiftUpgradePrice) i5Var.f9462f1.get(i10);
                    if (starGiftUpgradePrice.date >= currentTime) {
                        break;
                    } else {
                        i10++;
                    }
                }
            }
            if (i5Var.f9466h1 != null) {
                int i12 = 0;
                while (i12 < i5Var.f9466h1.invoice.prices.size()) {
                    j10 += i5Var.f9466h1.invoice.prices.get(i12).amount;
                    i12++;
                    starGiftUpgradePrice = starGiftUpgradePrice;
                }
            }
            TL_stars.StarGiftUpgradePrice starGiftUpgradePrice2 = starGiftUpgradePrice;
            if (i10 > 0 && !i5Var.f9464g1) {
                i5Var.f9464g1 = true;
                if (i5Var.f9462f1 != null) {
                    for (int i13 = 0; i13 < i10; i13++) {
                        i5Var.f9462f1.remove(0);
                    }
                }
                TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                if (TextUtils.isEmpty(str)) {
                    TLRPC.TL_inputInvoiceStarGiftUpgrade tL_inputInvoiceStarGiftUpgrade = new TLRPC.TL_inputInvoiceStarGiftUpgrade();
                    tL_inputInvoiceStarGiftUpgrade.keep_original_details = i5Var.f9478r0.f27188a.f26309q;
                    tL_inputInvoiceStarGiftUpgrade.stargift = inputSavedStarGiftE1;
                    tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftUpgrade;
                } else {
                    TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade tL_inputInvoiceStarGiftPrepaidUpgrade = new TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade();
                    tL_inputInvoiceStarGiftPrepaidUpgrade.hash = str;
                    tL_inputInvoiceStarGiftPrepaidUpgrade.peer = MessagesController.getInstance(i5Var.currentAccount).getInputPeer(i5Var.T);
                    tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftPrepaidUpgrade;
                }
                JSONObject jSONObjectP = nh.b3.p(i5Var.resourcesProvider, false);
                if (jSONObjectP != null) {
                    TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                    tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                    tL_dataJSON.data = jSONObjectP.toString();
                    tL_payments_getPaymentForm.flags |= 1;
                }
                ConnectionsManager.getInstance(i5Var.currentAccount).sendRequest(tL_payments_getPaymentForm, new g3(i5Var, i11));
            }
            if (z10) {
                dVar.g(oa.R0(LocaleController.formatString(R.string.Gift2PrepayUpgradeButton, Long.valueOf(j10)), 1.13f, cqVarArr), true, true);
            } else {
                dVar.g(oa.R0(LocaleController.formatString(R.string.Gift2UpgradeButton, Long.valueOf(j10)), 1.13f, cqVarArr), true, true);
            }
            g5 g5Var = i5Var.f9473l0;
            if (g5Var != null) {
                g5Var.P(j10);
            }
            if (starGiftUpgradePrice2 == null) {
                dVar.f(null, true);
                return;
            }
            int i14 = starGiftUpgradePrice2.date - currentTime;
            String duration = i14 < 86400 ? AndroidUtilities.formatDuration(i14, false, true) : LocaleController.formatPluralString("Days", Math.round(i14 / 86400.0f), new Object[0]);
            dVar.f15827e.o(false, true, false);
            dVar.f(LocaleController.formatString(R.string.Gift2UpgradeButtonDecreasesIn, duration), true);
            AndroidUtilities.runOnUIThread(i5Var.f9470j1, 1000L);
        }
    }

    public static void x0(i5 i5Var, TLObject tLObject, cg.y2[] y2VarArr, Long l10, androidx.car.app.utils.a aVar, TLRPC.TL_error tL_error) {
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        if (!(tLObject instanceof TLRPC.TL_users_userFull)) {
            ec ecVarY = i5Var.getBulletinFactory().Y(tL_error);
            ecVarY.f28030t = true;
            ecVarY.j();
            return;
        }
        TLRPC.TL_users_userFull tL_users_userFull = (TLRPC.TL_users_userFull) tLObject;
        MessagesController.getInstance(i5Var.currentAccount).putUsers(tL_users_userFull.users, false);
        MessagesController.getInstance(i5Var.currentAccount).putChats(tL_users_userFull.chats, false);
        TLRPC.UserFull userFull = tL_users_userFull.full_user;
        if (userFull == null || (disallowedGiftsSettings = userFull.disallowed_stargifts) == null || !disallowedGiftsSettings.disallow_unique_stargifts) {
            aVar.run();
        } else {
            new mc(y2VarArr[0].container, i5Var.resourcesProvider).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(l10.longValue())))).j();
        }
    }

    public static boolean x1(TL_stars.SavedStarGift savedStarGift, TL_stars.SavedStarGift savedStarGift2) {
        if (savedStarGift == savedStarGift2) {
            return true;
        }
        if (savedStarGift == null) {
            return false;
        }
        TL_stars.StarGift starGift = savedStarGift.gift;
        TL_stars.StarGift starGift2 = savedStarGift2.gift;
        if (starGift == starGift2) {
            return true;
        }
        if ((starGift instanceof TL_stars.TL_starGiftUnique) && (starGift2 instanceof TL_stars.TL_starGiftUnique)) {
            return starGift.f22607id == starGift2.f22607id;
        }
        return (starGift instanceof TL_stars.TL_starGift) && (starGift2 instanceof TL_stars.TL_starGift) && starGift.f22607id == starGift2.f22607id && savedStarGift.date == savedStarGift2.date;
    }

    public static void y0(i5 i5Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        v1 v1Var = i5Var.f9470j1;
        i5Var.f9464g1 = false;
        if (!(tLObject instanceof TLRPC.PaymentForm)) {
            ec ecVarY = i5Var.getBulletinFactory().Y(tL_error);
            ecVarY.f28030t = true;
            ecVarY.j();
        } else {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            MessagesController.getInstance(i5Var.currentAccount).putUsers(paymentForm.users, false);
            i5Var.f9466h1 = paymentForm;
            AndroidUtilities.cancelRunOnUIThread(v1Var);
            AndroidUtilities.runOnUIThread(v1Var);
        }
    }

    public static boolean y1(TL_stars.TL_starGiftUnique tL_starGiftUnique, TL_stars.TL_starGiftUnique tL_starGiftUnique2) {
        if (tL_starGiftUnique == tL_starGiftUnique2) {
            return true;
        }
        if (tL_starGiftUnique != null) {
            return tL_starGiftUnique.f22607id == tL_starGiftUnique2.f22607id || TextUtils.equals(tL_starGiftUnique.slug, tL_starGiftUnique2.slug);
        }
        return false;
    }

    public static void z0(i5 i5Var, TLObject tLObject, boolean z10, TLRPC.Document document, boolean z11, TLRPC.TL_error tL_error, TL_stars.saveStarGift savestargift) {
        k7 k7VarF;
        org.telegram.ui.ActionBar.n2 n2VarU = LaunchActivity.U();
        if (n2VarU == null) {
            return;
        }
        if (!(tLObject instanceof TLRPC.TL_boolTrue)) {
            if (tL_error != null) {
                if (z10 && i5Var.f9485y0 != null && (k7VarF = u7.y(i5Var.currentAccount, false).F(i5Var.T, false)) != null) {
                    k7VarF.m(i5Var.f9485y0, !savestargift.unsave);
                }
                i5Var.getBulletinFactory().t(LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text), null).k(false);
                return;
            }
            return;
        }
        i5Var.dismiss();
        long jA1 = i5Var.A1();
        if (!z10) {
            u7.y(i5Var.currentAccount, false).Q(jA1);
        }
        if (jA1 >= 0) {
            mc.a0(n2VarU).s(document, LocaleController.getString(z11 ? R.string.Gift2MadePrivateTitle : R.string.Gift2MadePublicTitle), AndroidUtilities.replaceSingleTag(LocaleController.getString(z11 ? R.string.Gift2MadePrivate : R.string.Gift2MadePublic), n2VarU instanceof ProfileActivity ? null : new j2(jA1, n2VarU))).k(true);
        } else {
            mc.a0(n2VarU).s(document, LocaleController.getString(z11 ? R.string.Gift2ChannelMadePrivateTitle : R.string.Gift2ChannelMadePublicTitle), LocaleController.getString(z11 ? R.string.Gift2ChannelMadePrivate : R.string.Gift2ChannelMadePublic)).j();
        }
    }

    public final long A1() {
        TLRPC.Peer peer;
        MessageObject messageObject = this.A0;
        if (messageObject == null) {
            TL_stars.SavedStarGift savedStarGift = this.f9485y0;
            if (savedStarGift != null) {
                TL_stars.StarGift starGift = savedStarGift.gift;
                return starGift instanceof TL_stars.TL_starGiftUnique ? DialogObject.getPeerDialogId(((TL_stars.TL_starGiftUnique) starGift).owner_id) : this.T;
            }
            TL_stars.TL_starGiftUnique tL_starGiftUnique = this.C0;
            if (tL_starGiftUnique != null) {
                return DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id);
            }
            return 0L;
        }
        TLRPC.Message message = messageObject.messageOwner;
        if (message == null) {
            return 0L;
        }
        TLRPC.MessageAction messageAction = message.action;
        if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
            TLRPC.Peer peer2 = ((TLRPC.TL_messageActionStarGift) messageAction).peer;
            if (peer2 != null) {
                return DialogObject.getPeerDialogId(peer2);
            }
            return messageObject.isOutOwner() ? this.A0.getDialogId() : UserConfig.getInstance(this.currentAccount).getClientUserId();
        }
        if (!(messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
            return 0L;
        }
        TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
        TL_stars.StarGift starGift2 = tL_messageActionStarGiftUnique.gift;
        if ((starGift2 instanceof TL_stars.TL_starGiftUnique) && (peer = starGift2.owner_id) != null) {
            return DialogObject.getPeerDialogId(peer);
        }
        TLRPC.Peer peer3 = tL_messageActionStarGiftUnique.peer;
        if (peer3 != null) {
            return DialogObject.getPeerDialogId(peer3);
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
            TL_stars.SavedStarGift savedStarGift = this.f9485y0;
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
        TL_stars.StarGift starGiftB1 = B1();
        if (!(starGiftB1 instanceof TL_stars.TL_starGiftUnique)) {
            return "";
        }
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGiftB1;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        return i0.a.m(tL_starGiftUnique.num, ',', sb2);
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
            if (messageObject == null || (message3 = messageObject.messageOwner) == null) {
                TL_stars.SavedStarGift savedStarGift = this.f9485y0;
                if (savedStarGift != null) {
                    if ((savedStarGift.flags & 2048) == 0) {
                        return null;
                    }
                    tL_inputSavedStarGiftChat.saved_id = savedStarGift.saved_id;
                    return tL_inputSavedStarGiftChat;
                }
                if (this.C0 == null || TextUtils.isEmpty(this.B0)) {
                    return tL_inputSavedStarGiftChat;
                }
                TL_stars.TL_inputSavedStarGiftSlug tL_inputSavedStarGiftSlug = new TL_stars.TL_inputSavedStarGiftSlug();
                tL_inputSavedStarGiftSlug.slug = this.B0;
                return tL_inputSavedStarGiftSlug;
            }
            TLRPC.MessageAction messageAction = message3.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                if ((tL_messageActionStarGift.flags & 4096) == 0) {
                    return null;
                }
                tL_inputSavedStarGiftChat.saved_id = tL_messageActionStarGift.saved_id;
                return tL_inputSavedStarGiftChat;
            }
            if (!(messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                return null;
            }
            TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
            if ((tL_messageActionStarGiftUnique.flags & 128) == 0) {
                return null;
            }
            tL_inputSavedStarGiftChat.saved_id = tL_messageActionStarGiftUnique.saved_id;
            return tL_inputSavedStarGiftChat;
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
        TL_stars.SavedStarGift savedStarGift2 = this.f9485y0;
        if (savedStarGift2 != null) {
            tL_inputSavedStarGiftUser.msg_id = savedStarGift2.msg_id;
            return tL_inputSavedStarGiftUser;
        }
        if (this.C0 == null || TextUtils.isEmpty(this.B0)) {
            return tL_inputSavedStarGiftUser;
        }
        TL_stars.TL_inputSavedStarGiftSlug tL_inputSavedStarGiftSlug2 = new TL_stars.TL_inputSavedStarGiftSlug();
        tL_inputSavedStarGiftSlug2.slug = this.B0;
        return tL_inputSavedStarGiftSlug2;
    }

    public final String F1() {
        TL_stars.StarGift starGiftB1 = B1();
        if (!(starGiftB1 instanceof TL_stars.TL_starGiftUnique) || starGiftB1.slug == null) {
            return null;
        }
        return MessagesController.getInstance(this.currentAccount).linkPrefix + "/nft/" + starGiftB1.slug;
    }

    public final int G1() {
        int iIndexOf;
        TL_stars.StarGift starGift;
        n7 n7Var = this.f9486z0;
        if (n7Var == null) {
            return -1;
        }
        TL_stars.SavedStarGift savedStarGift = this.f9485y0;
        if (savedStarGift != null) {
            iIndexOf = n7Var.indexOf(savedStarGift);
        } else {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = this.C0;
            if (tL_starGiftUnique == null) {
                return -1;
            }
            iIndexOf = n7Var.indexOf(tL_starGiftUnique);
        }
        if (iIndexOf >= 0) {
            return iIndexOf;
        }
        TL_stars.StarGift starGiftB1 = B1();
        for (int i10 = 0; i10 < this.f9486z0.e(); i10++) {
            Object obj = this.f9486z0.get(i10);
            if (obj instanceof TL_stars.SavedStarGift) {
                TL_stars.SavedStarGift savedStarGift2 = this.f9485y0;
                if ((savedStarGift2 != null && x1(savedStarGift2, (TL_stars.SavedStarGift) obj)) || (starGiftB1 != null && (starGiftB1 == (starGift = ((TL_stars.SavedStarGift) obj).gift) || ((starGiftB1 instanceof TL_stars.TL_starGiftUnique) && (starGift instanceof TL_stars.TL_starGiftUnique) && starGiftB1.f22607id == starGift.f22607id)))) {
                    return i10;
                }
            } else {
                if ((obj instanceof TL_stars.TL_starGiftUnique) && y1(this.C0, (TL_stars.TL_starGiftUnique) obj)) {
                    return i10;
                }
            }
        }
        return -1;
    }

    public final TL_stars.SavedStarGift H1(boolean z10) {
        int iG1 = G1();
        if (iG1 < 0) {
            return null;
        }
        int i10 = (z10 ? 1 : -1) + iG1;
        int i11 = this.N0;
        if (i11 >= 0 && (!z10 ? i11 < iG1 : i11 > iG1)) {
            i10 = i11;
        }
        n7 n7Var = this.f9486z0;
        Object obj = (n7Var == null || i10 < 0 || i10 >= n7Var.e()) ? null : this.f9486z0.get(i10);
        if (obj instanceof TL_stars.SavedStarGift) {
            return (TL_stars.SavedStarGift) obj;
        }
        return null;
    }

    public final TL_stars.TL_starGiftUnique I1(boolean z10) {
        int iG1 = G1();
        if (iG1 < 0) {
            return null;
        }
        int i10 = (z10 ? 1 : -1) + iG1;
        int i11 = this.N0;
        if (i11 >= 0 && (!z10 ? i11 < iG1 : i11 > iG1)) {
            i10 = i11;
        }
        n7 n7Var = this.f9486z0;
        Object obj = (n7Var == null || i10 < 0 || i10 >= n7Var.e()) ? null : this.f9486z0.get(i10);
        if (obj instanceof TL_stars.TL_starGiftUnique) {
            return (TL_stars.TL_starGiftUnique) obj;
        }
        return null;
    }

    public final TL_stars.TL_starGiftUnique K1() {
        TL_stars.StarGift starGiftB1 = B1();
        if (starGiftB1 instanceof TL_stars.TL_starGiftUnique) {
            return (TL_stars.TL_starGiftUnique) starGiftB1;
        }
        return null;
    }

    @Override
    public final boolean L() {
        return false;
    }

    public final boolean L1(boolean z10) {
        return (H1(z10) == null && I1(z10) == null) ? false : true;
    }

    public final void M1(TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity) {
        TL_stars.getStarGiftWithdrawalUrl getstargiftwithdrawalurl = new TL_stars.getStarGiftWithdrawalUrl();
        TL_stars.InputSavedStarGift inputSavedStarGiftE1 = E1();
        getstargiftwithdrawalurl.stargift = inputSavedStarGiftE1;
        if (inputSavedStarGiftE1 == null) {
            return;
        }
        getstargiftwithdrawalurl.password = inputCheckPasswordSRP;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(getstargiftwithdrawalurl, new u2(this, twoStepVerificationActivity, 0));
    }

    public final void Q1() {
        long clientUserId;
        TL_stars.TL_starGiftUnique tL_starGiftUniqueK1 = K1();
        if (this.f9461f0.J || tL_starGiftUniqueK1 == null) {
            return;
        }
        if (this.C0 == null || !this.D0) {
            clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
        } else {
            clientUserId = this.T;
            if (clientUserId == 0) {
                clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
            }
        }
        hf.b bVar = tL_starGiftUniqueK1.resale_ton_only ? hf.b.f8922b : hf.b.f8921a;
        if (this.C0 == null || !this.D0) {
            c2(tL_starGiftUniqueK1, clientUserId, bVar, null, true, null);
            return;
        }
        gh.x0 x0Var = new gh.x0(getContext(), this.resourcesProvider, tL_starGiftUniqueK1, clientUserId);
        x0Var.G = new c3(this, x0Var, tL_starGiftUniqueK1, clientUserId, bVar, 0);
        x0Var.show();
    }

    public final void R1(View view) {
        TL_stars.SavedStarGift savedStarGift;
        int i10;
        TL_stars.SavedStarGift savedStarGift2;
        TLRPC.Message message;
        TLRPC.Message message2;
        if (view.getAlpha() < 0.99f) {
            u1();
            return;
        }
        TL_stars.TL_starGiftUnique tL_starGiftUniqueK1 = K1();
        if (tL_starGiftUniqueK1 == null) {
            return;
        }
        int i11 = 0;
        if (tL_starGiftUniqueK1.resell_amount != null) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
            String string = LocaleController.formatString(R.string.Gift2UnlistTitle, C1());
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
            b2Var.N = string;
            b2Var.P = LocaleController.getString(R.string.Gift2UnlistText);
            alertDialog$Builder.k(LocaleController.getString(R.string.Gift2ActionUnlist), new d3(this, tL_starGiftUniqueK1, i11));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new h3.q2(3));
            alertDialog$Builder.o();
            return;
        }
        MessageObject messageObject = this.A0;
        if (messageObject == null || (message2 = messageObject.messageOwner) == null) {
            savedStarGift = this.f9485y0;
            if (savedStarGift != null) {
                i10 = savedStarGift.can_resell_at;
            } else {
                i10 = 0;
            }
        } else {
            TLRPC.MessageAction messageAction = message2.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                i10 = ((TLRPC.TL_messageActionStarGiftUnique) messageAction).can_resell_at;
            } else {
                savedStarGift = this.f9485y0;
                if (savedStarGift != null) {
                    i10 = savedStarGift.can_resell_at;
                } else {
                    i10 = 0;
                }
            }
        }
        if (i10 <= ConnectionsManager.getInstance(this.currentAccount).getCurrentTime()) {
            oa.f1(getContext(), this.currentAccount, null, new e3(this, tL_starGiftUniqueK1, i11), this.resourcesProvider);
            return;
        }
        Context context = getContext();
        MessageObject messageObject2 = this.A0;
        if (messageObject2 == null || (message = messageObject2.messageOwner) == null) {
            savedStarGift2 = this.f9485y0;
            if (savedStarGift2 != null) {
                i11 = savedStarGift2.can_resell_at;
            }
        } else {
            TLRPC.MessageAction messageAction2 = message.action;
            if (messageAction2 instanceof TLRPC.TL_messageActionStarGiftUnique) {
                i11 = ((TLRPC.TL_messageActionStarGiftUnique) messageAction2).can_resell_at;
            } else {
                savedStarGift2 = this.f9485y0;
                if (savedStarGift2 != null) {
                    i11 = savedStarGift2.can_resell_at;
                }
            }
        }
        p2(i11 - ConnectionsManager.getInstance(this.currentAccount).getCurrentTime(), context, true);
    }

    public final void S1() {
        k3 k3Var = this.S0;
        if (k3Var != null && k3Var.isShown()) {
            this.S0.dismiss();
        }
        String strF1 = F1();
        k3 k3Var2 = new k3(this, getContext(), strF1, strF1, this.resourcesProvider);
        this.S0 = k3Var2;
        k3Var2.f32537o0 = new k5.i(this, 17);
        k3Var2.show();
    }

    public final void T1() {
        int i10;
        TL_stars.TL_starGiftUnique tL_starGiftUniqueK1;
        this.f9453b0.setAlpha(this.U0.a(0));
        this.f9474n0.setAlpha(this.U0.a(1));
        this.f9481u0.setAlpha(this.U0.a(2));
        this.f9483w0.setAlpha(this.U0.a(3));
        float fA = 1.0f - this.U0.a(4);
        FrameLayout frameLayout = this.f9463g0;
        frameLayout.setAlpha(fA);
        j4 j4Var = this.U0;
        e5 e5Var = this.f9451a0;
        e5Var.d(j4Var);
        ImageView imageView = e5Var.L;
        if (!this.U0.c(0) || (tL_starGiftUniqueK1 = K1()) == null || tL_starGiftUniqueK1.crafted || !O1(this.currentAccount, DialogObject.getPeerDialogId(tL_starGiftUniqueK1.owner_id))) {
            i10 = 8;
        } else {
            MessageObject messageObject = this.A0;
            if (messageObject != null) {
                TLRPC.Message message = messageObject.messageOwner;
                if (message != null) {
                    TLRPC.MessageAction messageAction = message.action;
                    if ((messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) && ((TLRPC.TL_messageActionStarGiftUnique) messageAction).can_craft_at > 0) {
                        i10 = 0;
                    }
                }
                i10 = 8;
            } else {
                TL_stars.SavedStarGift savedStarGift = this.f9485y0;
                if (savedStarGift == null || !(savedStarGift.gift instanceof TL_stars.TL_starGiftUnique) || savedStarGift.can_craft_at <= 0) {
                    i10 = 8;
                } else {
                    i10 = 0;
                }
            }
        }
        imageView.setVisibility(i10);
        ag.w wVar = this.U;
        float fD = wVar.d();
        r3 r3Var = this.Z;
        r3Var.setAlpha(this.U0.a(0) * Utilities.clamp01(AndroidUtilities.ilerp(fD - r3Var.getHeight(), 0.0f, AndroidUtilities.dp(32.0f))));
        wVar.e();
        wVar.invalidate();
        frameLayout.setVisibility(this.U0.c(4) ? 8 : 0);
        s2();
    }

    public final void U1() {
        TL_stars.TL_starGiftUnique tL_starGiftUniqueK1 = K1();
        if (tL_starGiftUniqueK1 == null) {
            return;
        }
        oa.f1(getContext(), this.currentAccount, tL_starGiftUniqueK1, new e3(this, tL_starGiftUniqueK1, 2), this.resourcesProvider);
    }

    public final void V1(long j10, String str) {
        this.f9456c1 = true;
        u7.y(this.currentAccount, false).K(j10, new gh.d1(4, this, str));
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
                } else {
                    i10 = 0;
                }
            } else {
                i10 = 0;
            }
        } else {
            TL_stars.SavedStarGift savedStarGift = this.f9485y0;
            if (savedStarGift != null) {
                i10 = savedStarGift.can_craft_at;
            } else {
                i10 = 0;
            }
        }
        int i12 = 1;
        if (i10 > ConnectionsManager.getInstance(this.currentAccount).getCurrentTime()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
            String string = LocaleController.getString(R.string.GiftCraftLaterTitle);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
            b2Var.N = string;
            b2Var.P = LocaleController.formatString(R.string.GiftCraftLaterText, LocaleController.formatDateTime(i10, true));
            i0.a.C(R.string.OK, alertDialog$Builder, null);
            return;
        }
        TL_stars.TL_starGiftUnique tL_starGiftUniqueK1 = K1();
        if (tL_starGiftUniqueK1 == null) {
            return;
        }
        if (!TextUtils.isEmpty(tL_starGiftUniqueK1.gift_address)) {
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
            String string2 = LocaleController.getString(R.string.GiftCraftCantChooseFirstTitle);
            org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.f22702a;
            b2Var2.N = string2;
            b2Var2.P = LocaleController.getString(R.string.GiftCraftCantChooseFirst);
            i0.a.C(R.string.OK, alertDialog$Builder2, null);
            return;
        }
        e5 e5Var = this.f9451a0;
        if (z10) {
            e5Var.H.a(this.currentAccount, tL_starGiftUniqueK1.gift_id, tL_starGiftUniqueK1.getDocument(), tL_starGiftUniqueK1.title);
            if (t1()) {
                g4 g4Var = e5Var.H;
                TL_stars.TL_starGiftUnique tL_starGiftUniqueK2 = K1();
                if (tL_starGiftUniqueK2 == null) {
                    g4Var.getClass();
                } else {
                    while (true) {
                        e4[] e4VarArr = g4Var.f9315n;
                        if (i11 >= e4VarArr.length) {
                            break;
                        }
                        e4 e4Var = e4VarArr[i11];
                        TL_stars.StarGift starGift = e4Var.h;
                        if (starGift == null) {
                            starGift = null;
                        }
                        if (starGift == null) {
                            e4Var.a(tL_starGiftUniqueK2, true);
                            break;
                        }
                        i11++;
                    }
                    g4Var.d(true);
                }
            }
        }
        g4 g4Var2 = e5Var.H;
        g4 g4Var3 = e5Var.H;
        g4Var2.setOnCraft(new q1(this, i12));
        if (this.P0 == null) {
            gh.w5 w5Var = new gh.w5(this.currentAccount, tL_starGiftUniqueK1.gift_id);
            this.P0 = w5Var;
            w5Var.a();
        }
        g4Var3.setOnAddGift(new e3(this, tL_starGiftUniqueK1, i12));
        g4Var3.setOnClose(new v1(this, 18));
        q2(4, true, null);
    }

    public final void X1(long j10) {
        lh.w3 w3Var = this.f9472k1;
        if (w3Var != null) {
            w3Var.e(true);
            this.f9472k1 = null;
        }
        dismiss();
        org.telegram.ui.ActionBar.n2 n2VarU = LaunchActivity.U();
        if (n2VarU == null || UserObject.isService(j10)) {
            return;
        }
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
        n2VarU.presentFragment(new ProfileActivity(bundle, null));
    }

    public final void Y1() {
        TL_stars.SavedStarGift savedStarGift;
        int i10;
        MessageObject messageObject;
        TLRPC.Message message;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        int i11;
        TL_stars.SavedStarGift savedStarGift2;
        int i12;
        TLRPC.Message message2;
        TLRPC.Message message3;
        lh.w3 w3Var = this.f9472k1;
        if (w3Var != null) {
            w3Var.e(true);
            this.f9472k1 = null;
        }
        MessageObject messageObject2 = this.A0;
        if (messageObject2 == null || (message3 = messageObject2.messageOwner) == null) {
            savedStarGift = this.f9485y0;
            if (savedStarGift != null) {
                i10 = savedStarGift.can_transfer_at;
            } else {
                i10 = 0;
            }
        } else {
            TLRPC.MessageAction messageAction = message3.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                i10 = ((TLRPC.TL_messageActionStarGiftUnique) messageAction).can_transfer_at;
            } else {
                savedStarGift = this.f9485y0;
                if (savedStarGift != null) {
                    i10 = savedStarGift.can_transfer_at;
                } else {
                    i10 = 0;
                }
            }
        }
        if (i10 > ConnectionsManager.getInstance(this.currentAccount).getCurrentTime()) {
            Context context = getContext();
            MessageObject messageObject3 = this.A0;
            if (messageObject3 == null || (message2 = messageObject3.messageOwner) == null) {
                savedStarGift2 = this.f9485y0;
                if (savedStarGift2 != null) {
                    i12 = savedStarGift2.can_transfer_at;
                } else {
                    i12 = 0;
                }
            } else {
                TLRPC.MessageAction messageAction2 = message2.action;
                if (messageAction2 instanceof TLRPC.TL_messageActionStarGiftUnique) {
                    i12 = ((TLRPC.TL_messageActionStarGiftUnique) messageAction2).can_transfer_at;
                } else {
                    savedStarGift2 = this.f9485y0;
                    if (savedStarGift2 != null) {
                        i12 = savedStarGift2.can_transfer_at;
                    } else {
                        i12 = 0;
                    }
                }
            }
            p2(i12 - ConnectionsManager.getInstance(this.currentAccount).getCurrentTime(), context, false);
            return;
        }
        TL_stars.SavedStarGift savedStarGift3 = this.f9485y0;
        if (savedStarGift3 == null) {
            messageObject = this.A0;
            if (messageObject != null) {
                return;
            } else {
                return;
            }
        }
        TL_stars.StarGift starGift = savedStarGift3.gift;
        if (starGift instanceof TL_stars.TL_starGiftUnique) {
            tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
            i11 = savedStarGift3.can_export_at;
        } else {
            messageObject = this.A0;
            if (messageObject != null || (message = messageObject.messageOwner) == null) {
                return;
            }
            TLRPC.MessageAction messageAction3 = message.action;
            if (!(messageAction3 instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                return;
            }
            TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction3;
            TL_stars.StarGift starGift2 = tL_messageActionStarGiftUnique.gift;
            if (!(starGift2 instanceof TL_stars.TL_starGiftUnique)) {
                return;
            }
            tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift2;
            i11 = tL_messageActionStarGiftUnique.can_export_at;
        }
        TL_stars.TL_starGiftUnique tL_starGiftUnique2 = tL_starGiftUnique;
        int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
        Context context2 = getContext();
        int i13 = this.currentAccount;
        cg.y2[] y2VarArr = {new cg.y2(context2, i13, BirthdayController.getInstance(i13).getState(), 3, this.resourcesProvider)};
        cg.y2 y2Var = y2VarArr[0];
        y2Var.f2888v0 = LocaleController.getString(R.string.Gift2TransferShort);
        org.telegram.ui.Components.na naVar = y2Var.f31853e;
        if (naVar != null) {
            naVar.setTitle(y2Var.z());
        }
        cg.s2 s2Var = y2Var.X;
        if (s2Var != null) {
            s2Var.setText(y2Var.z());
        }
        int iMax = currentTime > i11 ? 0 : Math.max(1, Math.round(Math.max(0, i11 - currentTime) / 86400.0f));
        cg.y2 y2Var2 = y2VarArr[0];
        y2Var2.A0 = true;
        y2Var2.B0 = iMax;
        y2Var2.h0(false, true);
        cg.y2 y2Var3 = y2VarArr[0];
        y2Var3.f2890x0 = new i3(this, currentTime, i11, iMax, tL_starGiftUnique2, y2VarArr);
        y2Var3.show();
    }

    public final void Z1(long j10, Utilities.Callback callback) {
        TLRPC.Message message;
        long j11;
        String forcedFirstName;
        TLObject tLObject;
        TL_stars.SavedStarGift savedStarGift = this.f9485y0;
        if (savedStarGift == null || !(savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
            MessageObject messageObject = this.A0;
            if (messageObject == null || (message = messageObject.messageOwner) == null) {
                return;
            }
            TLRPC.MessageAction messageAction = message.action;
            if (!(messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                return;
            }
            TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
            if (!(tL_messageActionStarGiftUnique.gift instanceof TL_stars.TL_starGiftUnique)) {
                return;
            } else {
                j11 = tL_messageActionStarGiftUnique.transfer_stars;
            }
        } else {
            j11 = savedStarGift.transfer_stars;
        }
        TL_stars.TL_starGiftUnique tL_starGiftUniqueK1 = K1();
        if (tL_starGiftUniqueK1 == null) {
            return;
        }
        if (j10 >= 0) {
            TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(j10));
            forcedFirstName = UserObject.getForcedFirstName(user);
            tLObject = user;
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j10));
            if (chat == null) {
                forcedFirstName = "";
                tLObject = chat;
            } else {
                forcedFirstName = chat.title;
                tLObject = chat;
            }
        }
        LinearLayout linearLayout = new LinearLayout(getContext());
        linearLayout.setOrientation(1);
        linearLayout.addView(new i4(getContext(), tL_starGiftUniqueK1, tLObject), h7.z5.t(-1, -2, 48, 0, -4, 0, 0));
        TextView textView = new TextView(getContext());
        rl.l(org.telegram.ui.ActionBar.g6.f23161j5, this.resourcesProvider, textView, 1, 16.0f);
        textView.setText(AndroidUtilities.replaceTags(j11 > 0 ? LocaleController.formatPluralStringComma("Gift2TransferPriceText", (int) j11, C1(), DialogObject.getShortName(j10)) : LocaleController.formatString(R.string.Gift2TransferText, C1(), forcedFirstName)));
        linearLayout.addView(textView, h7.z5.t(-1, -2, 48, 24, 4, 24, 4));
        yy0 yy0Var = new yy0(getContext(), this.resourcesProvider);
        q1(yy0Var, u7.l(tL_starGiftUniqueK1.attributes, TL_stars.starGiftAttributeModel.class));
        q1(yy0Var, u7.l(tL_starGiftUniqueK1.attributes, TL_stars.starGiftAttributeBackdrop.class));
        q1(yy0Var, u7.l(tL_starGiftUniqueK1.attributes, TL_stars.starGiftAttributePattern.class));
        if (!TextUtils.isEmpty(tL_starGiftUniqueK1.slug) && (tL_starGiftUniqueK1.flags & 256) != 0) {
            yy0Var.c(LocaleController.getString(R.string.GiftValue2), s3.c.e("~", BillingController.getInstance().formatCurrency(tL_starGiftUniqueK1.value_amount, tL_starGiftUniqueK1.value_currency, BillingController.getInstance().getCurrencyExp(tL_starGiftUniqueK1.value_currency), true)), null, null);
        }
        linearLayout.addView(yy0Var, h7.z5.t(-1, -2, 48, 23, 16, 23, 4));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
        alertDialog$Builder.n(linearLayout);
        alertDialog$Builder.k(j11 > 0 ? oa.Q0(LocaleController.formatString(R.string.Gift2TransferDoPrice, Integer.valueOf((int) j11))) : LocaleController.getString(R.string.Gift2TransferDo), new h3.x(callback, 6));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
        b2Var.T0 = true;
        b2Var.show();
    }

    public final void a2() {
        TL_stars.InputSavedStarGift inputSavedStarGiftE1;
        long j10;
        long j11;
        long j12;
        boolean z10;
        boolean z11;
        boolean z12;
        String str;
        boolean z13;
        lh.w3 w3Var = this.f9472k1;
        if (w3Var != null) {
            w3Var.e(true);
            this.f9472k1 = null;
        }
        if (this.V0 == null && (inputSavedStarGiftE1 = E1()) != null) {
            MessageObject messageObject = this.A0;
            long j13 = this.T;
            if (messageObject != null) {
                TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
                if (!(messageAction instanceof TLRPC.TL_messageActionStarGift)) {
                    return;
                }
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                j11 = tL_messageActionStarGift.gift.f22607id;
                j12 = tL_messageActionStarGift.upgrade_stars;
                z10 = tL_messageActionStarGift.name_hidden;
                TLRPC.TL_textWithEntities tL_textWithEntities = tL_messageActionStarGift.message;
                z11 = (tL_textWithEntities == null || TextUtils.isEmpty(tL_textWithEntities.text)) ? false : true;
                z12 = tL_messageActionStarGift.peer instanceof TLRPC.TL_peerChannel;
                j10 = 0;
                str = tL_messageActionStarGift.prepaid_upgrade_hash;
                if (tL_messageActionStarGift.prepaid_upgrade) {
                    z13 = DialogObject.getPeerDialogId(tL_messageActionStarGift.from_id) != this.A0.getFromChatId();
                } else {
                    z13 = tL_messageActionStarGift.upgrade_separate;
                }
            } else {
                j10 = 0;
                TL_stars.SavedStarGift savedStarGift = this.f9485y0;
                if (savedStarGift == null) {
                    return;
                }
                TL_stars.StarGift starGift = savedStarGift.gift;
                j11 = starGift.f22607id;
                j12 = savedStarGift.upgrade_stars;
                z10 = (starGift instanceof TL_stars.TL_starGift) && savedStarGift.name_hidden;
                TLRPC.TL_textWithEntities tL_textWithEntities2 = savedStarGift.message;
                z11 = (tL_textWithEntities2 == null || TextUtils.isEmpty(tL_textWithEntities2.text)) ? false : true;
                z12 = j13 < 0;
                TL_stars.SavedStarGift savedStarGift2 = this.f9485y0;
                str = savedStarGift2.prepaid_upgrade_hash;
                z13 = savedStarGift2.upgrade_separate;
            }
            TextView textView = this.f9479s0;
            if (z10) {
                textView.setText(LocaleController.getString(z12 ? R.string.Gift2AddMyNameNameChannel : R.string.Gift2AddMyNameName));
            } else if (z11) {
                textView.setText(LocaleController.getString(R.string.Gift2AddSenderNameComment));
            } else {
                textView.setText(LocaleController.getString(R.string.Gift2AddSenderName));
            }
            boolean z14 = (z10 || j12 <= j10 || z13) ? false : true;
            bp bpVar = this.f9478r0;
            bpVar.a(z14, false);
            ArrayList arrayList = this.f9458d1;
            if (arrayList != null && (j12 > j10 || this.f9466h1 != null)) {
                b2();
                return;
            }
            if (arrayList == null) {
                u7.y(this.currentAccount, false).K(j11, new z2(this, 1));
            }
            if (j12 > j10 || this.f9466h1 != null) {
                return;
            }
            this.f9464g1 = true;
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            if (TextUtils.isEmpty(str)) {
                TLRPC.TL_inputInvoiceStarGiftUpgrade tL_inputInvoiceStarGiftUpgrade = new TLRPC.TL_inputInvoiceStarGiftUpgrade();
                tL_inputInvoiceStarGiftUpgrade.keep_original_details = bpVar.f27188a.f26309q;
                tL_inputInvoiceStarGiftUpgrade.stargift = inputSavedStarGiftE1;
                tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftUpgrade;
            } else {
                TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade tL_inputInvoiceStarGiftPrepaidUpgrade = new TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade();
                tL_inputInvoiceStarGiftPrepaidUpgrade.hash = str;
                tL_inputInvoiceStarGiftPrepaidUpgrade.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j13);
                tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftPrepaidUpgrade;
            }
            JSONObject jSONObjectP = nh.b3.p(this.resourcesProvider, false);
            if (jSONObjectP != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = jSONObjectP.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getPaymentForm, new g3(this, 0));
        }
    }

    public final void b2() {
        long j10;
        boolean z10;
        boolean z11;
        int i10;
        char c10;
        int i11;
        String string;
        String string2;
        MessageObject messageObject = this.A0;
        if (messageObject != null) {
            TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
            if (!(messageAction instanceof TLRPC.TL_messageActionStarGift)) {
                return;
            }
            TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
            j10 = tL_messageActionStarGift.upgrade_stars;
            if (j10 > 0 || TextUtils.isEmpty(tL_messageActionStarGift.prepaid_upgrade_hash)) {
                z10 = false;
            } else {
                z10 = true;
            }
        } else {
            TL_stars.SavedStarGift savedStarGift = this.f9485y0;
            if (savedStarGift == null) {
                return;
            }
            j10 = savedStarGift.upgrade_stars;
            if (j10 > 0 || TextUtils.isEmpty(savedStarGift.prepaid_upgrade_hash)) {
                z10 = false;
            } else {
                z10 = true;
            }
        }
        if (this.f9458d1 != null) {
            if (j10 > 0 || this.f9466h1 != null) {
                long j11 = 0;
                if (this.f9466h1 != null) {
                    for (int i12 = 0; i12 < this.f9466h1.invoice.prices.size(); i12++) {
                        j11 += this.f9466h1.invoice.prices.get(i12).amount;
                    }
                }
                t4 t4Var = this.I0;
                e5 e5Var = this.f9451a0;
                if (t4Var == null) {
                    this.I0 = new t4(e5Var);
                }
                t4 t4Var2 = this.I0;
                ArrayList arrayList = this.f9458d1;
                e5 e5Var2 = t4Var2.f10056a;
                ArrayList arrayList2 = t4Var2.f10061g;
                ArrayList arrayList3 = t4Var2.f10060f;
                ArrayList arrayList4 = t4Var2.f10059e;
                int size = arrayList4.size();
                int i13 = 0;
                while (i13 < size) {
                    Object obj = arrayList4.get(i13);
                    i13++;
                    ((r4) obj).a();
                }
                arrayList4.clear();
                arrayList3.clear();
                arrayList2.clear();
                ArrayList arrayListM = u7.m(arrayList, TL_stars.starGiftAttributeModel.class);
                int size2 = arrayListM.size();
                int i14 = 0;
                while (i14 < size2) {
                    Object obj2 = arrayListM.get(i14);
                    i14++;
                    r4 r4Var = new r4(e5Var2.f9176c, (TL_stars.starGiftAttributeModel) obj2);
                    if (e5Var2.isAttachedToWindow() && r4Var.f9990c) {
                        r4Var.d.onAttachedToWindow();
                    }
                    arrayList4.add(r4Var);
                }
                ArrayList arrayListM2 = u7.m(arrayList, TL_stars.starGiftAttributeBackdrop.class);
                int size3 = arrayListM2.size();
                int i15 = 0;
                while (i15 < size3) {
                    Object obj3 = arrayListM2.get(i15);
                    i15++;
                    arrayList3.add(new q4((TL_stars.starGiftAttributeBackdrop) obj3));
                }
                ArrayList arrayListM3 = u7.m(arrayList, TL_stars.starGiftAttributePattern.class);
                int size4 = arrayListM3.size();
                int i16 = 0;
                while (i16 < size4) {
                    Object obj4 = arrayListM3.get(i16);
                    i16++;
                    arrayList2.add(new s4((TL_stars.starGiftAttributePattern) obj4));
                }
                e5Var.setPreviewingAttributes(this.f9458d1);
                TL_stars.StarGiftUpgradePrice starGiftUpgradePrice = null;
                long j12 = this.T;
                if (z10) {
                    z11 = true;
                    e5Var.i(1, LocaleController.getString(R.string.Gift2PrepayUpgradeTitle), LocaleController.formatString(R.string.Gift2PrepayUpgradeText, DialogObject.getShortName(this.currentAccount, j12)), null);
                } else {
                    z11 = true;
                    e5Var.i(1, LocaleController.getString(R.string.Gift2UpgradeTitle), LocaleController.getString(R.string.Gift2UpgradeText), null);
                }
                lh.d dVar = this.f9461f0;
                dVar.setFilled(z11);
                dVar.f(null, z11);
                if (j11 > 0) {
                    int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
                    if (this.f9462f1 != null) {
                        for (int i17 = 0; i17 < this.f9462f1.size(); i17++) {
                            TL_stars.StarGiftUpgradePrice starGiftUpgradePrice2 = (TL_stars.StarGiftUpgradePrice) this.f9462f1.get(i17);
                            if (starGiftUpgradePrice2.date >= currentTime) {
                                starGiftUpgradePrice = starGiftUpgradePrice2;
                                break;
                            }
                        }
                    }
                    ArrayList arrayList5 = this.f9460e1;
                    FrameLayout frameLayout = this.f9467i0;
                    if (arrayList5 == null || starGiftUpgradePrice == null || arrayList5.isEmpty()) {
                        frameLayout.setVisibility(8);
                    } else {
                        frameLayout.setVisibility(0);
                        this.f9465h0.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag("**" + LocaleController.getString(R.string.Gift2UpgradeCostsInfo) + "**", new v1(this, 0)), false, AndroidUtilities.dp(0.6666667f), AndroidUtilities.dp(0.66f)));
                    }
                    s2();
                    cq[] cqVarArr = this.f9468i1;
                    if (z10) {
                        i10 = 1;
                        dVar.g(oa.R0(LocaleController.formatString(R.string.Gift2PrepayUpgradeButton, Long.valueOf(j11)), 1.13f, cqVarArr), true, true);
                    } else {
                        i10 = 1;
                        dVar.g(oa.R0(LocaleController.formatString(R.string.Gift2UpgradeButton, Long.valueOf(j11)), 1.13f, cqVarArr), true, true);
                    }
                } else {
                    i10 = 1;
                    dVar.g(LocaleController.getString(R.string.Confirm), true, true);
                }
                dVar.setOnClickListener(new n1(this, i10));
                View view = this.f9476p0;
                LinearLayout linearLayout = this.f9477q0;
                if (z10) {
                    linearLayout.setVisibility(8);
                    view.setVisibility(8);
                    c10 = 0;
                } else {
                    c10 = 0;
                    linearLayout.setVisibility(0);
                    view.setVisibility(0);
                }
                nh.j[] jVarArr = this.f9475o0;
                if (z10) {
                    nh.j jVar = jVarArr[c10];
                    int i18 = R.drawable.menu_feature_unique;
                    String string3 = LocaleController.getString(R.string.Gift2UpgradeFeature1Title);
                    if (z10) {
                        int i19 = R.string.Gift2PrepayUpgradeFeature1Text;
                        i11 = 1;
                        Object[] objArr = new Object[1];
                        objArr[c10] = DialogObject.getShortName(this.currentAccount, j12);
                        string = LocaleController.formatString(i19, objArr);
                    } else {
                        i11 = 1;
                        string = LocaleController.getString(R.string.Gift2UpgradeFeature1Text);
                    }
                    jVar.a(string3, string, i18);
                    nh.j jVar2 = jVarArr[i11];
                    int i20 = R.drawable.menu_feature_transfer;
                    String string4 = LocaleController.getString(R.string.Gift2UpgradeFeature2Title);
                    if (z10) {
                        int i21 = R.string.Gift2PrepayUpgradeFeature2Text;
                        Object[] objArr2 = new Object[i11];
                        objArr2[0] = DialogObject.getShortName(this.currentAccount, j12);
                        string2 = LocaleController.formatString(i21, objArr2);
                    } else {
                        string2 = LocaleController.getString(R.string.Gift2UpgradeFeature2Text);
                    }
                    jVar2.a(string4, string2, i20);
                    jVarArr[2].a(LocaleController.getString(R.string.Gift2UpgradeFeature3Title), z10 ? LocaleController.formatString(R.string.Gift2PrepayUpgradeFeature3Text, DialogObject.getShortName(this.currentAccount, j12)) : LocaleController.getString(R.string.Gift2UpgradeFeature3Text), R.drawable.menu_feature_tradable);
                } else {
                    jVarArr[0].a(LocaleController.getString(R.string.Gift2UpgradeFeature1Title), LocaleController.getString(R.string.GiftsFeature1Text), R.drawable.menu_feature_unique);
                    jVarArr[1].a(LocaleController.getString(R.string.Gift2UpgradeFeature3Title), LocaleController.getString(R.string.GiftsFeature2Text), R.drawable.menu_feature_tradable);
                    jVarArr[2].a(LocaleController.getString(R.string.GiftsFeature3Title), LocaleController.getString(R.string.GiftsFeature3Text), R.drawable.menu_wear);
                }
                AndroidUtilities.runOnUIThread(new w1(this, j11, 0));
            }
        }
    }

    public final void c2(final TL_stars.TL_starGiftUnique tL_starGiftUnique, final long j10, final hf.b bVar, final TLRPC.TL_textWithEntities tL_textWithEntities, final boolean z10, final gh.x0 x0Var) {
        this.f9461f0.setLoading(true);
        if (x0Var != null && !x0Var.H) {
            x0Var.H = true;
            x0Var.D.h(true);
        }
        u7.x(this.currentAccount, bVar).H(tL_starGiftUnique, j10, tL_textWithEntities, z10, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                i5.a1(this.f9971a, x0Var, bVar, tL_starGiftUnique, j10, tL_textWithEntities, z10, (TLRPC.TL_payments_paymentFormStarGift) obj);
            }
        });
    }

    @Override
    public final boolean canDismissWithSwipe() {
        if (this.U0.c(4)) {
            boolean z10 = this.f9451a0.H.f9307d0;
        }
        return false;
    }

    @Override
    public final boolean canDismissWithTouchOutside() {
        if (this.U0.c(4) && this.f9451a0.H.f9307d0) {
            return false;
        }
        return super.canDismissWithTouchOutside();
    }

    @Override
    public final boolean canSwipeToBack(MotionEvent motionEvent) {
        if (this.U0.c(4) && this.f9451a0.H.f9307d0) {
            return false;
        }
        return super.canSwipeToBack(motionEvent);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starUserGiftsLoaded) {
            if (this.f9486z0 == ((m7) objArr[1])) {
                g4 g4Var = this.f9451a0.H;
                if (g4Var == null || !g4Var.f9307d0) {
                    t2();
                }
            }
        }
    }

    @Override
    public final void dismiss() {
        if (this.U0.c(4) && this.f9451a0.H.f9307d0) {
            return;
        }
        gh.w5 w5Var = this.P0;
        if (w5Var != null) {
            w5Var.b();
            this.P0 = null;
        }
        t4 t4Var = this.I0;
        if (t4Var != null) {
            t4Var.a();
        }
        super.dismiss();
    }

    public final SpannableStringBuilder e2(TLRPC.Peer peer) {
        if (peer == null) {
            return null;
        }
        String publicUsername = DialogObject.getPublicUsername(MessagesController.getInstance(this.currentAccount).getUserOrChat(DialogObject.getPeerDialogId(peer)));
        if (TextUtils.isEmpty(publicUsername)) {
            return null;
        }
        return AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.Gift2ReleasedBy2, s3.c.e("@", publicUsername)), new w2(this, publicUsername, 8));
    }

    public final SpannableStringBuilder f2(TL_stars.StarGift starGift) {
        if (starGift == null || (starGift instanceof TL_stars.TL_starGiftUnique)) {
            return null;
        }
        return e2(starGift.released_by);
    }

    @Override
    public mc getBulletinFactory() {
        return new mc(this.f9471k0, this.resourcesProvider);
    }

    public final void h2(String str, TL_stars.TL_starGiftUnique tL_starGiftUnique, n7 n7Var) {
        t4 t4Var;
        TL_stars.TL_starGiftUnique tL_starGiftUnique2;
        this.B0 = str;
        this.C0 = tL_starGiftUnique;
        this.f9486z0 = n7Var;
        this.D0 = (tL_starGiftUnique.resell_amount == null || N1(this.currentAccount, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id))) ? false : true;
        if (!this.J0 && (t4Var = this.I0) != null && t4Var.f10068o && (tL_starGiftUnique2 = t4Var.f10065l) != null && tL_starGiftUnique2.f22607id != tL_starGiftUnique.f22607id) {
            t4Var.a();
            this.I0 = null;
            e5 e5Var = this.f9451a0;
            e5Var.f9174b.setAlpha(1.0f);
            e5Var.f9176c.setAlpha(0.0f);
        }
        this.Z.b(this.currentAccount, this.f9485y0);
        k2(tL_starGiftUnique, false, null, null);
        String str2 = tL_starGiftUnique.owner_address;
        String str3 = tL_starGiftUnique.gift_address;
        boolean z10 = tL_starGiftUnique.host_id != null;
        p80 p80Var = this.f9455c0;
        if (!z10 || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            p80Var.setVisibility(8);
        } else {
            p80Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2InBlockchain), new w2(this, str3, 3)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            p80Var.setVisibility(0);
            p80Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23283q5, this.resourcesProvider));
        }
        p80 p80Var2 = this.f9459e0;
        if (z10 || TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            p80Var2.setVisibility(8);
        } else {
            p80Var2.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2InBlockchain), new w2(this, str3, 4)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            p80Var2.setVisibility(0);
        }
        if (this.D0) {
            l2(tL_starGiftUnique);
            this.f9461f0.setOnClickListener(new n1(this, 7));
        }
        if (this.X0) {
            q2(0, false, null);
            this.f31852c.n0(1);
            this.X0 = false;
        }
        t2();
    }

    public final void i2(MessageObject messageObject, n7 n7Var) {
        boolean z10;
        boolean z11;
        TL_stars.StarGift starGift;
        TLRPC.Peer peer;
        TLRPC.Peer peer2;
        long j10;
        long j11;
        int i10;
        TLRPC.Peer peer3;
        TLRPC.TL_textWithEntities tL_textWithEntities;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean z15;
        String str;
        boolean z16;
        int i11;
        String string;
        String string2;
        TLRPC.Peer peer4;
        TLRPC.TL_textWithEntities tL_textWithEntities2;
        String string3;
        char c10;
        CharSequence charSequenceReplaceArrows;
        int i12;
        CharSequence charSequenceConcat;
        int i13;
        int i14;
        String str2;
        String str3;
        yy0 yy0Var;
        long peerDialogId;
        TL_stars.StarGift starGift2;
        String string4;
        w1 w1Var;
        w1 w1Var2;
        TLRPC.TL_textWithEntities tL_textWithEntities3;
        boolean z17;
        int i15;
        boolean z18;
        TL_stars.StarGift starGift3;
        TLRPC.Document document;
        TLRPC.TL_textWithEntities tL_textWithEntities4;
        TL_stars.StarGift starGift4;
        boolean z19;
        boolean z20;
        boolean z21;
        int i16;
        ?? r10;
        CharSequence charSequenceB;
        long peerDialogId2;
        w1 w1Var3;
        String string5;
        SpannableStringBuilder spannableStringBuilderReplaceTags;
        t4 t4Var;
        String string6;
        boolean z22;
        TLObject userOrChat;
        t4 t4Var2;
        TL_stars.TL_starGiftUnique tL_starGiftUnique;
        TL_stars.InputSavedStarGift inputSavedStarGiftE1;
        if (messageObject == null || messageObject.messageOwner == null) {
            return;
        }
        boolean z23 = false;
        this.f9484x0 = false;
        this.f9485y0 = null;
        this.A0 = messageObject;
        this.f9486z0 = n7Var;
        this.Z.set(messageObject);
        long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
        boolean z24 = messageObject.getDialogId() == clientUserId;
        TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
        boolean z25 = messageAction instanceof TLRPC.TL_messageActionStarGift;
        int i17 = 3;
        e5 e5Var = this.f9451a0;
        lh.d dVar = this.f9461f0;
        if (z25 || (((z22 = messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) && (((TLRPC.TL_messageActionStarGiftUnique) messageAction).gift instanceof TL_stars.TL_starGift))) {
            if (!this.J0 && (t4Var = this.I0) != null && t4Var.f10068o && t4Var.f10065l != null) {
                t4Var.a();
                this.I0 = null;
                e5Var.f9174b.setVisibility(0);
                e5Var.f9176c.setVisibility(4);
            }
            boolean zIsOutOwner = messageObject.isOutOwner();
            if (z24) {
                zIsOutOwner = false;
            }
            TLRPC.Message message = messageObject.messageOwner;
            int i18 = message.date;
            TLRPC.MessageAction messageAction2 = message.action;
            if (messageAction2 instanceof TLRPC.TL_messageActionStarGift) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction2;
                boolean z26 = tL_messageActionStarGift.converted;
                boolean z27 = tL_messageActionStarGift.saved;
                boolean z28 = tL_messageActionStarGift.refunded;
                boolean z29 = tL_messageActionStarGift.name_hidden;
                TL_stars.StarGift starGift5 = tL_messageActionStarGift.gift;
                boolean z30 = tL_messageActionStarGift.can_upgrade;
                long j12 = tL_messageActionStarGift.convert_stars;
                j11 = tL_messageActionStarGift.upgrade_stars;
                TLRPC.TL_textWithEntities tL_textWithEntities5 = tL_messageActionStarGift.message;
                TLRPC.Peer peer5 = tL_messageActionStarGift.from_id;
                TLRPC.Peer peer6 = tL_messageActionStarGift.peer;
                z15 = tL_messageActionStarGift.prepaid_upgrade;
                str = tL_messageActionStarGift.prepaid_upgrade_hash;
                peer3 = tL_messageActionStarGift.auction_acquired ? tL_messageActionStarGift.to_id : null;
                i10 = tL_messageActionStarGift.gift_num;
                tL_textWithEntities = tL_textWithEntities5;
                peer2 = peer6;
                z14 = z30;
                z10 = z27;
                z12 = z29;
                peer = peer5;
                starGift = starGift5;
                j10 = j12;
                z13 = z26;
                z11 = z28;
            } else {
                TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction2;
                z10 = tL_messageActionStarGiftUnique.saved;
                z11 = tL_messageActionStarGiftUnique.refunded;
                starGift = tL_messageActionStarGiftUnique.gift;
                peer = tL_messageActionStarGiftUnique.from_id;
                peer2 = tL_messageActionStarGiftUnique.peer;
                j10 = 0;
                j11 = 0;
                i10 = 0;
                peer3 = null;
                tL_textWithEntities = null;
                z12 = false;
                z13 = false;
                z14 = false;
                z15 = false;
                str = null;
            }
            long peerDialogId3 = this.T;
            String shortName = DialogObject.getShortName(peerDialogId3);
            z16 = z24;
            boolean z31 = zIsOutOwner;
            boolean zIsBot = UserObject.isBot(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerDialogId3)));
            boolean z32 = peer2 != null && DialogObject.getPeerDialogId(peer2) < 0;
            boolean zP1 = P1(this.currentAccount, K1());
            F1();
            e5Var.f(starGift, false, false, zP1);
            if (z16) {
                if (i10 == 0 || starGift.title == null) {
                    string5 = LocaleController.getString(R.string.Gift2TitleSaved);
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(starGift.title);
                    sb2.append(" #");
                    string5 = i0.a.m(i10, ',', sb2);
                }
                this.O0 = string5;
                if (z11) {
                    spannableStringBuilderReplaceTags = null;
                } else if (z14) {
                    spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2SelfInfoUpgrade));
                } else if (j10 > 0) {
                    spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma(z13 ? "Gift2SelfInfoConverted" : "Gift2SelfInfoConvert", (int) j10));
                } else {
                    spannableStringBuilderReplaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2SelfInfo));
                }
                e5Var.i(0, string5, spannableStringBuilderReplaceTags, f2(starGift));
            } else {
                peer3 = peer3;
                peer = peer;
                z12 = z12;
                if (!z32 || this.f9484x0) {
                    if ((z31 || z14) && j11 > 0) {
                        String string7 = LocaleController.getString(z31 ? R.string.Gift2TitleSent : R.string.Gift2TitleReceived);
                        this.O0 = string7;
                        if (z11) {
                            string = null;
                        } else {
                            if (z31) {
                                i11 = 0;
                                string = LocaleController.formatString(R.string.Gift2InfoFreeUpgrade, shortName);
                            } else {
                                string = LocaleController.getString(R.string.Gift2InfoInFreeUpgrade);
                            }
                            e5Var.i(i11, string7, string, f2(starGift));
                        }
                        i11 = 0;
                        e5Var.i(i11, string7, string, f2(starGift));
                    } else {
                        if (i10 == 0 || starGift.title == null) {
                            string2 = LocaleController.getString(z31 ? R.string.Gift2TitleSent : R.string.Gift2TitleReceived);
                        } else {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(starGift.title);
                            sb3.append(" #");
                            string2 = i0.a.m(i10, ',', sb3);
                        }
                        this.O0 = string2;
                        if (z11) {
                            peer4 = peer;
                            tL_textWithEntities2 = tL_textWithEntities;
                            charSequenceConcat = null;
                            i12 = 0;
                        } else {
                            if (zIsBot || E1() == null) {
                                peer4 = peer;
                                tL_textWithEntities2 = tL_textWithEntities;
                                if (z31) {
                                    if (z14 || j11 <= 0) {
                                        i14 = R.string.Gift2Info2OutExpired;
                                    } else {
                                        i14 = R.string.Gift2Info2OutUpgrade;
                                    }
                                    string3 = LocaleController.formatString(i14, shortName);
                                } else {
                                    if (z10) {
                                        if (z32) {
                                            i13 = R.string.Gift2Info2ChannelRemove;
                                        } else {
                                            i13 = R.string.Gift2Info2BotRemove;
                                        }
                                    } else if (z32) {
                                        i13 = R.string.Gift2Info2ChannelKeep;
                                    } else {
                                        i13 = R.string.Gift2Info2BotKeep;
                                    }
                                    string3 = LocaleController.getString(i13);
                                }
                            } else {
                                MessageObject messageObject2 = this.A0;
                                if (messageObject2 != null) {
                                    TLRPC.MessageAction messageAction3 = messageObject2.messageOwner.action;
                                    if (messageAction3 instanceof TLRPC.TL_messageActionStarGift) {
                                        TLRPC.TL_messageActionStarGift tL_messageActionStarGift2 = (TLRPC.TL_messageActionStarGift) messageAction3;
                                        boolean z33 = tL_messageActionStarGift2.peer != null;
                                        messageObject2.isOutOwner();
                                        this.A0.getDialogId();
                                        UserConfig.getInstance(this.currentAccount).getClientUserId();
                                        int currentTime = MessagesController.getInstance(this.currentAccount).stargiftsConvertPeriodMax - (ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() - this.A0.messageOwner.date);
                                        if (z33) {
                                            TLRPC.Peer peer7 = tL_messageActionStarGift2.peer;
                                            if (peer7 != null) {
                                                peer4 = peer;
                                                tL_textWithEntities2 = tL_textWithEntities;
                                                if (O1(this.currentAccount, DialogObject.getPeerDialogId(peer7))) {
                                                }
                                            } else {
                                                peer4 = peer;
                                                tL_textWithEntities2 = tL_textWithEntities;
                                            }
                                        } else {
                                            peer4 = peer;
                                            tL_textWithEntities2 = tL_textWithEntities;
                                        }
                                        if (!tL_messageActionStarGift2.converted && tL_messageActionStarGift2.convert_stars > 0 && currentTime > 0) {
                                            if (z31) {
                                                if (z13) {
                                                    if (z32) {
                                                        str2 = "Gift2InfoChannelConverted";
                                                    } else {
                                                        str2 = "Gift2InfoConverted";
                                                    }
                                                } else if (z32) {
                                                    str2 = "Gift2Info3Channel";
                                                } else {
                                                    str2 = "Gift2Info3";
                                                }
                                                string3 = LocaleController.formatPluralStringComma(str2, (int) j10);
                                            } else if (!z14 && j11 > 0) {
                                                string3 = LocaleController.formatString(R.string.Gift2Info2OutUpgrade, shortName);
                                            } else if (z10 || z13) {
                                                if (z13) {
                                                    str3 = "Gift2InfoOutConverted";
                                                } else {
                                                    str3 = "Gift2InfoOut";
                                                }
                                                string3 = LocaleController.formatPluralStringComma(str3, (int) j10, shortName);
                                            } else {
                                                string3 = LocaleController.formatString(R.string.Gift2InfoOutPinned, shortName);
                                            }
                                        }
                                    } else {
                                        peer4 = peer;
                                        tL_textWithEntities2 = tL_textWithEntities;
                                    }
                                    if (z31) {
                                        if (z14) {
                                            i14 = R.string.Gift2Info2OutExpired;
                                        } else {
                                            i14 = R.string.Gift2Info2OutExpired;
                                        }
                                        string3 = LocaleController.formatString(i14, shortName);
                                    } else {
                                        if (z10) {
                                            if (z32) {
                                                i13 = R.string.Gift2Info2ChannelKeep;
                                            } else {
                                                i13 = R.string.Gift2Info2BotKeep;
                                            }
                                        } else if (z32) {
                                            i13 = R.string.Gift2Info2ChannelRemove;
                                        } else {
                                            i13 = R.string.Gift2Info2BotRemove;
                                        }
                                        string3 = LocaleController.getString(i13);
                                    }
                                } else {
                                    peer4 = peer;
                                    tL_textWithEntities2 = tL_textWithEntities;
                                    TL_stars.SavedStarGift savedStarGift = this.f9485y0;
                                    if (savedStarGift != null) {
                                        int currentTime2 = MessagesController.getInstance(this.currentAccount).stargiftsConvertPeriodMax - (ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() - savedStarGift.date);
                                        if (O1(this.currentAccount, peerDialogId3)) {
                                            int i19 = this.f9485y0.flags;
                                            if (((peerDialogId3 < 0 ? 2048 : 8) & i19) != 0 && (i19 & 16) != 0 && (i19 & 2) != 0 && currentTime2 > 0) {
                                                if (z31) {
                                                    if (z13) {
                                                        if (z32) {
                                                            str2 = "Gift2InfoChannelConverted";
                                                        } else {
                                                            str2 = "Gift2InfoConverted";
                                                        }
                                                    } else if (z32) {
                                                        str2 = "Gift2Info3Channel";
                                                    } else {
                                                        str2 = "Gift2Info3";
                                                    }
                                                    string3 = LocaleController.formatPluralStringComma(str2, (int) j10);
                                                } else if (!z14) {
                                                    if (z10) {
                                                        if (z13) {
                                                            str3 = "Gift2InfoOutConverted";
                                                        } else {
                                                            str3 = "Gift2InfoOut";
                                                        }
                                                        string3 = LocaleController.formatPluralStringComma(str3, (int) j10, shortName);
                                                    } else {
                                                        if (z13) {
                                                            str3 = "Gift2InfoOutConverted";
                                                        } else {
                                                            str3 = "Gift2InfoOut";
                                                        }
                                                        string3 = LocaleController.formatPluralStringComma(str3, (int) j10, shortName);
                                                    }
                                                } else if (z10) {
                                                    if (z13) {
                                                        str3 = "Gift2InfoOutConverted";
                                                    } else {
                                                        str3 = "Gift2InfoOut";
                                                    }
                                                    string3 = LocaleController.formatPluralStringComma(str3, (int) j10, shortName);
                                                } else {
                                                    if (z13) {
                                                        str3 = "Gift2InfoOutConverted";
                                                    } else {
                                                        str3 = "Gift2InfoOut";
                                                    }
                                                    string3 = LocaleController.formatPluralStringComma(str3, (int) j10, shortName);
                                                }
                                            }
                                        }
                                    }
                                    if (z31) {
                                        if (z14) {
                                            i14 = R.string.Gift2Info2OutExpired;
                                        } else {
                                            i14 = R.string.Gift2Info2OutExpired;
                                        }
                                        string3 = LocaleController.formatString(i14, shortName);
                                    } else {
                                        if (z10) {
                                            if (z32) {
                                                i13 = R.string.Gift2Info2ChannelKeep;
                                            } else {
                                                i13 = R.string.Gift2Info2BotKeep;
                                            }
                                        } else if (z32) {
                                            i13 = R.string.Gift2Info2ChannelRemove;
                                        } else {
                                            i13 = R.string.Gift2Info2BotRemove;
                                        }
                                        string3 = LocaleController.getString(i13);
                                    }
                                }
                            }
                            SpannableStringBuilder spannableStringBuilderReplaceTags2 = AndroidUtilities.replaceTags(string3);
                            if (zIsBot || !s1()) {
                                c10 = 1;
                                charSequenceReplaceArrows = "";
                            } else {
                                c10 = 1;
                                charSequenceReplaceArrows = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2More).replace(' ', (char) 160), new v1(this, 6)), true);
                            }
                            CharSequence[] charSequenceArr = new CharSequence[3];
                            i12 = 0;
                            charSequenceArr[0] = spannableStringBuilderReplaceTags2;
                            charSequenceArr[c10] = " ";
                            charSequenceArr[2] = charSequenceReplaceArrows;
                            charSequenceConcat = TextUtils.concat(charSequenceArr);
                        }
                        e5Var.i(i12, string2, charSequenceConcat, f2(starGift));
                    }
                    yy0Var = this.f9457d0;
                    yy0Var.removeAllViews();
                    if (peer4 != null) {
                        peerDialogId = DialogObject.getPeerDialogId(peer4);
                    } else if (z31) {
                        peerDialogId = clientUserId;
                    } else {
                        peerDialogId = peerDialogId3;
                    }
                    if (peer2 != null) {
                        peerDialogId3 = DialogObject.getPeerDialogId(peer2);
                    } else if (!z31) {
                        peerDialogId3 = clientUserId;
                    }
                    TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerDialogId));
                    if (peer3 != null) {
                        peerDialogId2 = DialogObject.getPeerDialogId(peer3);
                        String string8 = LocaleController.getString(R.string.Gift2To);
                        int i20 = this.currentAccount;
                        w1 w1Var4 = new w1(this, peerDialogId2, 4);
                        if (z32) {
                            w1Var3 = null;
                        } else {
                            w1Var3 = new w1(this, peerDialogId2, 5);
                        }
                        starGift2 = starGift;
                        this.f9457d0.j(string8, i20, peerDialogId2, w1Var4, null, w1Var3);
                    } else {
                        starGift2 = starGift;
                        if (peerDialogId == clientUserId || z15 || z32) {
                            String string9 = LocaleController.getString(R.string.Gift2From);
                            int i21 = this.currentAccount;
                            w1 w1Var5 = new w1(this, peerDialogId, 6);
                            if (peerDialogId != clientUserId || peerDialogId == 2666000 || UserObject.isDeleted(user) || zIsBot || z32) {
                                string4 = null;
                            } else {
                                string4 = LocaleController.getString(R.string.Gift2ButtonSendGift);
                            }
                            if (z32) {
                                w1Var = null;
                            } else {
                                w1Var = new w1(this, peerDialogId, 7);
                            }
                            this.f9457d0.j(string9, i21, peerDialogId, w1Var5, string4, w1Var);
                        }
                        if (peerDialogId3 == clientUserId || z32) {
                            String string10 = LocaleController.getString(R.string.Gift2To);
                            int i22 = this.currentAccount;
                            w1 w1Var6 = new w1(this, peerDialogId3, 8);
                            if (z32) {
                                w1Var2 = null;
                            } else {
                                w1Var2 = new w1(this, peerDialogId3, 9);
                            }
                            this.f9457d0.j(string10, i22, peerDialogId3, w1Var6, null, w1Var2);
                        }
                    }
                    yy0Var.f(i18, LocaleController.getString(R.string.StarsTransactionDate));
                    if (starGift2.stars > 0) {
                        String string11 = LocaleController.getString(R.string.Gift2Value);
                        String strM = i0.a.m(starGift2.stars + j11, ',', new StringBuilder("⭐️ "));
                        if (s1() || z11) {
                            r10 = 0;
                            charSequenceB = "";
                        } else {
                            r10 = 0;
                            charSequenceB = pc.b(LocaleController.formatPluralStringComma("Gift2ButtonSell", (int) j10), new v1(this, 4), this.resourcesProvider, null);
                        }
                        yy0Var.c(string11, oa.X0(false, TextUtils.concat(strM, " ", charSequenceB), 0.8f, r10), r10, r10);
                    }
                    if (starGift2.limited && !z11) {
                        oa.F0(yy0Var, this.currentAccount, starGift2, this.resourcesProvider);
                    }
                    tL_textWithEntities3 = tL_textWithEntities2;
                    if (tL_textWithEntities2 != null && !TextUtils.isEmpty(tL_textWithEntities3.text) && !z11) {
                        yy0Var.b(tL_textWithEntities3.text, tL_textWithEntities3.entities);
                    }
                    if (z31 && z14 && !z11) {
                        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("^  ");
                        if (this.W0 == null) {
                            i16 = 0;
                            this.W0 = new cq(0, new f5(dVar, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, this.resourcesProvider)));
                        } else {
                            i16 = 0;
                        }
                        spannableStringBuilder.setSpan(this.W0, i16, 1, 33);
                        spannableStringBuilder.append((CharSequence) (j11 > 0 ? LocaleController.getString(R.string.Gift2UpgradeButtonFree) : LocaleController.getString(R.string.Gift2UpgradeButtonGift)));
                        dVar.setFilled(true);
                        dVar.g(spannableStringBuilder, !this.X0, true);
                        dVar.f(null, !this.X0);
                        dVar.setOnClickListener(new n1(this, 11));
                    } else {
                        if (!this.m0 && this.V != null && this.f9486z0 != null && G1() >= 0 && this.f9486z0.b(G1()) >= 0) {
                            dVar.setFilled(false);
                            int iB = this.f9486z0.b(G1());
                            SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                            spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.Gift2UpgradeNext));
                            Object obj = this.f9486z0.get(iB);
                            if (!(obj instanceof TL_stars.SavedStarGift) || (starGift3 = ((TL_stars.SavedStarGift) obj).gift) == null || (document = starGift3.getDocument()) == null) {
                                z18 = true;
                            } else {
                                spannableStringBuilder2.append((CharSequence) " e");
                                z18 = true;
                                spannableStringBuilder2.setSpan(new org.telegram.ui.Components.t5(document, dVar.getTextPaint().getFontMetricsInt()), spannableStringBuilder2.length() - 1, spannableStringBuilder2.length(), 33);
                            }
                            dVar.g(spannableStringBuilder2, this.X0 ^ z18, z18);
                            dVar.f(null, this.X0 ^ z18);
                            dVar.setOnClickListener(new z1(this, iB, 2));
                        } else if ((starGift2 instanceof TL_stars.TL_starGift) || TextUtils.isEmpty(str)) {
                            z17 = true;
                            dVar.setFilled(true);
                            dVar.g(LocaleController.getString(R.string.OK), !this.X0, true);
                            dVar.f(null, !this.X0);
                            dVar.setOnClickListener(new n1(this, 9));
                        } else {
                            SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("^  ");
                            if (this.W0 == null) {
                                i15 = 0;
                                this.W0 = new cq(0, new f5(dVar, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, this.resourcesProvider)));
                            } else {
                                i15 = 0;
                            }
                            z17 = true;
                            spannableStringBuilder3.setSpan(this.W0, i15, 1, 33);
                            spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2GiftAnUpgrade));
                            dVar.setFilled(true);
                            dVar.g(spannableStringBuilder3, !this.X0, true);
                            dVar.f(null, !this.X0);
                            dVar.setOnClickListener(new n1(this, 8));
                        }
                        tL_textWithEntities4 = tL_textWithEntities3;
                        starGift4 = starGift2;
                        z19 = z10;
                        z20 = z11;
                        z23 = z13;
                        z21 = z31;
                    }
                    z17 = true;
                    tL_textWithEntities4 = tL_textWithEntities3;
                    starGift4 = starGift2;
                    z19 = z10;
                    z20 = z11;
                    z23 = z13;
                    z21 = z31;
                } else {
                    e5Var.i(0, LocaleController.getString(R.string.Gift2TitleProfile), null, f2(starGift));
                }
            }
            peer4 = peer;
            tL_textWithEntities2 = tL_textWithEntities;
            yy0Var = this.f9457d0;
            yy0Var.removeAllViews();
            if (peer4 != null) {
                peerDialogId = DialogObject.getPeerDialogId(peer4);
            } else if (z31) {
                peerDialogId = clientUserId;
            } else {
                peerDialogId = peerDialogId3;
            }
            if (peer2 != null) {
                peerDialogId3 = DialogObject.getPeerDialogId(peer2);
            } else if (!z31) {
                peerDialogId3 = clientUserId;
            }
            TLRPC.User user2 = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerDialogId));
            if (peer3 != null) {
                peerDialogId2 = DialogObject.getPeerDialogId(peer3);
                String string12 = LocaleController.getString(R.string.Gift2To);
                int i23 = this.currentAccount;
                w1 w1Var7 = new w1(this, peerDialogId2, 4);
                if (z32) {
                    w1Var3 = null;
                } else {
                    w1Var3 = new w1(this, peerDialogId2, 5);
                }
                starGift2 = starGift;
                this.f9457d0.j(string12, i23, peerDialogId2, w1Var7, null, w1Var3);
            } else {
                starGift2 = starGift;
                if (peerDialogId == clientUserId) {
                    String string13 = LocaleController.getString(R.string.Gift2From);
                    int i24 = this.currentAccount;
                    w1 w1Var8 = new w1(this, peerDialogId, 6);
                    if (peerDialogId != clientUserId) {
                        string4 = null;
                    } else {
                        string4 = null;
                    }
                    if (z32) {
                        w1Var = null;
                    } else {
                        w1Var = new w1(this, peerDialogId, 7);
                    }
                    this.f9457d0.j(string13, i24, peerDialogId, w1Var8, string4, w1Var);
                } else {
                    String string14 = LocaleController.getString(R.string.Gift2From);
                    int i25 = this.currentAccount;
                    w1 w1Var9 = new w1(this, peerDialogId, 6);
                    if (peerDialogId != clientUserId) {
                        string4 = null;
                    } else {
                        string4 = null;
                    }
                    if (z32) {
                        w1Var = null;
                    } else {
                        w1Var = new w1(this, peerDialogId, 7);
                    }
                    this.f9457d0.j(string14, i25, peerDialogId, w1Var9, string4, w1Var);
                }
                if (peerDialogId3 == clientUserId) {
                    String string15 = LocaleController.getString(R.string.Gift2To);
                    int i26 = this.currentAccount;
                    w1 w1Var10 = new w1(this, peerDialogId3, 8);
                    if (z32) {
                        w1Var2 = null;
                    } else {
                        w1Var2 = new w1(this, peerDialogId3, 9);
                    }
                    this.f9457d0.j(string15, i26, peerDialogId3, w1Var10, null, w1Var2);
                } else {
                    String string16 = LocaleController.getString(R.string.Gift2To);
                    int i27 = this.currentAccount;
                    w1 w1Var11 = new w1(this, peerDialogId3, 8);
                    if (z32) {
                        w1Var2 = null;
                    } else {
                        w1Var2 = new w1(this, peerDialogId3, 9);
                    }
                    this.f9457d0.j(string16, i27, peerDialogId3, w1Var11, null, w1Var2);
                }
            }
            yy0Var.f(i18, LocaleController.getString(R.string.StarsTransactionDate));
            if (starGift2.stars > 0) {
                String string17 = LocaleController.getString(R.string.Gift2Value);
                String strM2 = i0.a.m(starGift2.stars + j11, ',', new StringBuilder("⭐️ "));
                if (s1()) {
                    r10 = 0;
                    charSequenceB = "";
                } else {
                    r10 = 0;
                    charSequenceB = "";
                }
                yy0Var.c(string17, oa.X0(false, TextUtils.concat(strM2, " ", charSequenceB), 0.8f, r10), r10, r10);
            }
            if (starGift2.limited) {
                oa.F0(yy0Var, this.currentAccount, starGift2, this.resourcesProvider);
            }
            tL_textWithEntities3 = tL_textWithEntities2;
            if (tL_textWithEntities2 != null) {
                yy0Var.b(tL_textWithEntities3.text, tL_textWithEntities3.entities);
            }
            if (z31) {
                if (!this.m0) {
                }
                if (starGift2 instanceof TL_stars.TL_starGift) {
                    z17 = true;
                    dVar.setFilled(true);
                    dVar.g(LocaleController.getString(R.string.OK), !this.X0, true);
                    dVar.f(null, !this.X0);
                    dVar.setOnClickListener(new n1(this, 9));
                } else {
                    z17 = true;
                    dVar.setFilled(true);
                    dVar.g(LocaleController.getString(R.string.OK), !this.X0, true);
                    dVar.f(null, !this.X0);
                    dVar.setOnClickListener(new n1(this, 9));
                }
            } else {
                if (!this.m0) {
                }
                if (starGift2 instanceof TL_stars.TL_starGift) {
                    z17 = true;
                    dVar.setFilled(true);
                    dVar.g(LocaleController.getString(R.string.OK), !this.X0, true);
                    dVar.f(null, !this.X0);
                    dVar.setOnClickListener(new n1(this, 9));
                } else {
                    z17 = true;
                    dVar.setFilled(true);
                    dVar.g(LocaleController.getString(R.string.OK), !this.X0, true);
                    dVar.f(null, !this.X0);
                    dVar.setOnClickListener(new n1(this, 9));
                }
            }
            tL_textWithEntities4 = tL_textWithEntities3;
            starGift4 = starGift2;
            z19 = z10;
            z20 = z11;
            z23 = z13;
            z21 = z31;
        } else {
            if (!z22) {
                return;
            }
            TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique2 = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
            if (!(tL_messageActionStarGiftUnique2.gift instanceof TL_stars.TL_starGiftUnique)) {
                return;
            }
            if (tL_messageActionStarGiftUnique2.name_hidden) {
                userOrChat = null;
            } else {
                MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
                TLRPC.Peer peer8 = tL_messageActionStarGiftUnique2.from_id;
                userOrChat = messagesController.getUserOrChat(peer8 != null ? DialogObject.getPeerDialogId(peer8) : messageObject.getFromChatId());
            }
            TL_stars.TL_starGiftUnique tL_starGiftUnique2 = (TL_stars.TL_starGiftUnique) tL_messageActionStarGiftUnique2.gift;
            z20 = tL_messageActionStarGiftUnique2.refunded;
            k2(tL_starGiftUnique2, z20, userOrChat, tL_messageActionStarGiftUnique2.message);
            boolean z34 = tL_messageActionStarGiftUnique2.saved;
            starGift4 = tL_messageActionStarGiftUnique2.gift;
            z21 = (tL_messageActionStarGiftUnique2.upgrade ^ true) == messageObject.isOutOwner();
            if (messageObject.getDialogId() == clientUserId) {
                z21 = false;
            }
            if (!this.G0 && !this.H0 && this.A0 != null && (inputSavedStarGiftE1 = E1()) != null) {
                this.G0 = true;
                u7.y(this.currentAccount, false).M(inputSavedStarGiftE1, new z2(this, i17));
            }
            if (this.J0 || (t4Var2 = this.I0) == null || !t4Var2.f10068o || (tL_starGiftUnique = t4Var2.f10065l) == null) {
                z19 = z34;
            } else {
                if (starGift4 != null) {
                    z19 = z34;
                    if (tL_starGiftUnique.f22607id != starGift4.f22607id) {
                    }
                } else {
                    z19 = z34;
                }
                t4Var2.a();
                this.I0 = null;
                e5Var.f9174b.setAlpha(1.0f);
                e5Var.f9176c.setAlpha(0.0f);
            }
            tL_textWithEntities4 = null;
            peer3 = null;
            z16 = z24;
            z17 = true;
            z12 = false;
        }
        if (this.f9452a1) {
            dVar.setFilled(z17);
            dVar.g(LocaleController.getString(R.string.GiftCraftButtonNext), false, z17);
            dVar.setOnClickListener(new n1(this, 10));
        }
        String str4 = starGift4 == null ? null : starGift4.owner_address;
        String str5 = starGift4 == null ? null : starGift4.gift_address;
        boolean z35 = (starGift4 == null || starGift4.host_id == null) ? false : true;
        p80 p80Var = this.f9455c0;
        if (z20) {
            p80Var.setVisibility(0);
            p80Var.setText(LocaleController.getString(R.string.Gift2Refunded));
            p80Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23284q7, this.resourcesProvider));
        } else if (z35 && !TextUtils.isEmpty(str4) && !TextUtils.isEmpty(str5)) {
            p80Var.setVisibility(0);
            p80Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2InBlockchain), new w2(this, str5, 5)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            p80Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23283q5, this.resourcesProvider));
        } else if (TextUtils.isEmpty(str4) && TextUtils.isEmpty(str5) && z12 && !z16) {
            p80Var.setVisibility(0);
            if (z21) {
                string6 = LocaleController.formatString((tL_textWithEntities4 == null || TextUtils.isEmpty(tL_textWithEntities4.text)) ? R.string.Gift2OutSenderHidden2 : R.string.Gift2OutSenderMessageHidden2, DialogObject.getShortName(messageObject.getDialogId()));
            } else {
                string6 = LocaleController.getString((tL_textWithEntities4 == null || TextUtils.isEmpty(tL_textWithEntities4.text)) ? R.string.Gift2InSenderHidden2 : R.string.Gift2InSenderMessageHidden2);
            }
            p80Var.setText(string6);
            p80Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23283q5, this.resourcesProvider));
        } else {
            p80Var.setVisibility(8);
        }
        p80 p80Var2 = this.f9459e0;
        if (!z35 && !TextUtils.isEmpty(str4) && !TextUtils.isEmpty(str5)) {
            p80Var2.setVisibility(0);
            p80Var2.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2InBlockchain), new w2(this, str5, 6)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
        } else if (z23 || z20 || starGift4 == null || !N1(this.currentAccount, A1()) || peer3 != null) {
            p80Var2.setVisibility(8);
        } else {
            p80Var2.setVisibility(0);
            if (A1() >= 0) {
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                if (!z19) {
                    spannableStringBuilder4.append((CharSequence) ". ");
                    spannableStringBuilder4.setSpan(new cq(R.drawable.mini_gift_hidden, 0), 0, 1, 33);
                }
                spannableStringBuilder4.append((CharSequence) AndroidUtilities.replaceSingleTag(LocaleController.getString(z19 ? R.string.Gift2ProfileVisible4 : R.string.Gift2ProfileInvisible4), new v1(this, 3)));
                p80Var2.setText(AndroidUtilities.replaceArrows(spannableStringBuilder4, true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            } else {
                p80Var2.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(z19 ? R.string.Gift2ChannelProfileVisible3 : R.string.Gift2ChannelProfileInvisible3), new v1(this, 3)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            }
        }
        if (this.X0) {
            q2(0, false, null);
            this.f31852c.n0(1);
            this.X0 = false;
        }
        this.f31853e.setTitle(this.O0);
        t2();
    }

    public final void j2(TL_stars.SavedStarGift savedStarGift, n7 n7Var) {
        String string;
        int i10;
        CharSequence charSequenceConcat;
        String string2;
        int i11;
        String str;
        TL_stars.StarGift starGift;
        ?? r12;
        int i12;
        ?? r13;
        TL_stars.StarGift starGift2;
        TLRPC.Document document;
        String str2;
        String str3;
        boolean z10;
        int i13;
        String string3;
        CharSequence charSequenceReplaceTags;
        TL_stars.StarGift starGift3;
        ?? r14;
        t4 t4Var;
        if (savedStarGift == null) {
            return;
        }
        int i14 = this.currentAccount;
        long j10 = this.T;
        this.f9484x0 = N1(i14, j10);
        this.f9485y0 = savedStarGift;
        this.f9486z0 = n7Var;
        this.A0 = null;
        boolean z11 = this.J0;
        e5 e5Var = this.f9451a0;
        if (!z11 && (t4Var = this.I0) != null && t4Var.f10068o && t4Var.f10065l != null) {
            t4Var.a();
            this.I0 = null;
            e5Var.f9174b.setVisibility(0);
            e5Var.f9176c.setVisibility(4);
        }
        this.Z.b(this.currentAccount, savedStarGift);
        String shortName = DialogObject.getShortName(j10);
        long peerDialogId = DialogObject.getPeerDialogId(savedStarGift.from_id);
        boolean zIsBot = UserObject.isBot(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerDialogId)));
        int currentTime = MessagesController.getInstance(this.currentAccount).stargiftsConvertPeriodMax - (ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() - savedStarGift.date);
        long clientUserId = UserConfig.getInstance(this.currentAccount).getClientUserId();
        if ((savedStarGift.flags & 2) == 0) {
            peerDialogId = 2666000;
        }
        boolean z12 = j10 < 0;
        TLRPC.TL_textWithEntities tL_textWithEntities = savedStarGift.message;
        boolean z13 = savedStarGift.refunded;
        TL_stars.StarGift starGift4 = savedStarGift.gift;
        if (starGift4 instanceof TL_stars.TL_starGiftUnique) {
            str2 = starGift4.owner_address;
            str3 = starGift4.gift_address;
            z10 = starGift4.host_id != null;
            k2((TL_stars.TL_starGiftUnique) starGift4, z13, !savedStarGift.name_hidden ? MessagesController.getInstance(this.currentAccount).getUserOrChat(DialogObject.getPeerDialogId(savedStarGift.from_id)) : null, savedStarGift.message);
        } else {
            boolean z14 = this.f9484x0 && clientUserId == peerDialogId && j10 >= 0;
            boolean zP1 = P1(this.currentAccount, K1());
            F1();
            e5Var.f(starGift4, false, false, zP1);
            yy0 yy0Var = this.f9457d0;
            yy0Var.removeAllViews();
            CharSequence charSequenceB = "";
            if (z14) {
                if (savedStarGift.gift_num == 0 || (starGift3 = savedStarGift.gift) == null || starGift3.title == null) {
                    string3 = LocaleController.getString(R.string.Gift2TitleSaved);
                } else {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(savedStarGift.gift.title);
                    sb2.append(" #");
                    string3 = i0.a.m(savedStarGift.gift_num, ',', sb2);
                }
                this.O0 = string3;
                if (z13) {
                    charSequenceReplaceTags = null;
                } else if (savedStarGift.can_upgrade) {
                    charSequenceReplaceTags = AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2SelfInfoUpgrade));
                } else {
                    long j11 = savedStarGift.convert_stars;
                    charSequenceReplaceTags = j11 > 0 ? AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2SelfInfoConvert", (int) j11)) : AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2SelfInfo));
                }
                e5Var.i(0, string3, charSequenceReplaceTags, f2(savedStarGift.gift));
            } else {
                clientUserId = clientUserId;
                if (!z12 || this.f9484x0) {
                    boolean z15 = this.f9484x0;
                    if ((!z15 || savedStarGift.can_upgrade) && savedStarGift.upgrade_stars > 0) {
                        String string4 = LocaleController.getString(z15 ? R.string.Gift2TitleReceived : R.string.Gift2TitleProfile);
                        this.O0 = string4;
                        e5Var.i(0, string4, (!z13 && this.f9484x0) ? LocaleController.getString(R.string.Gift2InfoInFreeUpgrade) : null, f2(savedStarGift.gift));
                    } else {
                        if (savedStarGift.gift_num == 0 || (starGift = savedStarGift.gift) == null || starGift.title == null) {
                            string = LocaleController.getString(z15 ? R.string.Gift2TitleReceived : R.string.Gift2TitleProfile);
                        } else {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(savedStarGift.gift.title);
                            sb3.append(" #");
                            string = i0.a.m(savedStarGift.gift_num, ',', sb3);
                        }
                        this.O0 = string;
                        if (z13 || !this.f9484x0) {
                            i10 = 0;
                            charSequenceConcat = null;
                        } else {
                            if (zIsBot || !s1()) {
                                if (this.f9484x0) {
                                    if (savedStarGift.unsaved) {
                                        i11 = z12 ? R.string.Gift2Info2ChannelKeep : R.string.Gift2Info2BotKeep;
                                    } else {
                                        i11 = z12 ? R.string.Gift2Info2ChannelRemove : R.string.Gift2Info2BotRemove;
                                    }
                                    string2 = LocaleController.getString(i11);
                                } else {
                                    string2 = LocaleController.formatString((!savedStarGift.can_upgrade || savedStarGift.upgrade_stars <= 0) ? R.string.Gift2Info2OutExpired : R.string.Gift2Info2OutUpgrade, shortName);
                                }
                            } else if (this.f9484x0) {
                                if (currentTime <= 0) {
                                    str = z12 ? "Gift2Info2ChannelExpired" : "Gift2Info2Expired";
                                } else {
                                    str = z12 ? "Gift2Info3Channel" : "Gift2Info3";
                                }
                                string2 = LocaleController.formatPluralStringComma(str, (int) savedStarGift.convert_stars);
                            } else {
                                string2 = LocaleController.formatPluralStringComma("Gift2Info2Out", (int) savedStarGift.convert_stars, shortName);
                            }
                            i10 = 0;
                            charSequenceConcat = TextUtils.concat(AndroidUtilities.replaceTags(string2), " ", (zIsBot || !s1()) ? charSequenceB : AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2More).replace(' ', (char) 160), new v1(this, 1)), true));
                        }
                        e5Var.i(i10, string, charSequenceConcat, f2(savedStarGift.gift));
                    }
                } else {
                    String string5 = LocaleController.getString(R.string.Gift2TitleProfile);
                    this.O0 = string5;
                    e5Var.i(0, string5, null, e2(savedStarGift.gift.released_by));
                }
            }
            if (clientUserId != peerDialogId || z12) {
                this.f9457d0.j(LocaleController.getString(R.string.Gift2From), this.currentAccount, peerDialogId, new w1(this, peerDialogId, 1), (peerDialogId == clientUserId || peerDialogId == 2666000 || zIsBot || UserObject.isDeleted(MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerDialogId))) || z12) ? null : LocaleController.getString(R.string.Gift2ButtonSendGift), new w1(this, peerDialogId, 2));
            }
            yy0Var.c(LocaleController.getString(R.string.StarsTransactionDate), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(((long) savedStarGift.date) * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(((long) savedStarGift.date) * 1000))), null, null);
            String string6 = LocaleController.getString(R.string.Gift2Value);
            String strM = i0.a.m(savedStarGift.gift.stars + savedStarGift.upgrade_stars, ',', new StringBuilder("⭐️ "));
            if (!s1() || z13) {
                r12 = 0;
            } else {
                r12 = 0;
                charSequenceB = pc.b(LocaleController.formatPluralStringComma("Gift2ButtonSell", (int) savedStarGift.convert_stars), new v1(this, 4), this.resourcesProvider, null);
            }
            yy0Var.c(string6, oa.X0(false, TextUtils.concat(strM, " ", charSequenceB), 0.8f, r12), r12, r12);
            TL_stars.StarGift starGift5 = savedStarGift.gift;
            if (starGift5.limited && !z13) {
                oa.F0(yy0Var, this.currentAccount, starGift5, this.resourcesProvider);
            }
            TLRPC.TL_textWithEntities tL_textWithEntities2 = savedStarGift.message;
            if (tL_textWithEntities2 != null && !TextUtils.isEmpty(tL_textWithEntities2.text) && !z13) {
                TLRPC.TL_textWithEntities tL_textWithEntities3 = savedStarGift.message;
                yy0Var.b(tL_textWithEntities3.text, tL_textWithEntities3.entities);
            }
            boolean z16 = this.f9484x0;
            lh.d dVar = this.f9461f0;
            if (z16 && savedStarGift.can_upgrade) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("^  ");
                if (this.W0 == null) {
                    i13 = 0;
                    this.W0 = new cq(0, new f5(dVar, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, this.resourcesProvider)));
                } else {
                    i13 = 0;
                }
                spannableStringBuilder.setSpan(this.W0, i13, 1, 33);
                spannableStringBuilder.append((CharSequence) (savedStarGift.upgrade_stars > 0 ? LocaleController.getString(R.string.Gift2UpgradeButtonFree) : LocaleController.getString(R.string.Gift2UpgradeButtonGift)));
                dVar.setFilled(true);
                dVar.g(spannableStringBuilder, !this.X0, true);
                dVar.f(null, !this.X0);
                dVar.setOnClickListener(new n1(this, 3));
            } else if (this.m0 && z16 && this.V != null && this.f9486z0 != null && G1() >= 0 && this.f9486z0.b(G1()) >= 0) {
                dVar.setFilled(false);
                int iB = this.f9486z0.b(G1());
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.Gift2UpgradeNext));
                Object obj = this.f9486z0.get(iB);
                if (!(obj instanceof TL_stars.SavedStarGift) || (starGift2 = ((TL_stars.SavedStarGift) obj).gift) == null || (document = starGift2.getDocument()) == null) {
                    r13 = 1;
                } else {
                    spannableStringBuilder2.append((CharSequence) " e");
                    r13 = 1;
                    spannableStringBuilder2.setSpan(new org.telegram.ui.Components.t5(document, dVar.getTextPaint().getFontMetricsInt()), spannableStringBuilder2.length() - 1, spannableStringBuilder2.length(), 33);
                }
                dVar.g(spannableStringBuilder2, (this.X0 ? 1 : 0) ^ r13, r13);
                dVar.f(null, (this.X0 ? 1 : 0) ^ r13);
                dVar.setOnClickListener(new z1(this, iB, r13));
            } else if (!(savedStarGift.gift instanceof TL_stars.TL_starGift) || TextUtils.isEmpty(savedStarGift.prepaid_upgrade_hash)) {
                dVar.setFilled(true);
                dVar.g(LocaleController.getString(R.string.OK), !this.X0, true);
                dVar.f(null, !this.X0);
                dVar.setOnClickListener(new n1(this, 6));
            } else {
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("^  ");
                if (this.W0 == null) {
                    i12 = 0;
                    this.W0 = new cq(0, new f5(dVar, org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, this.resourcesProvider)));
                } else {
                    i12 = 0;
                }
                spannableStringBuilder3.setSpan(this.W0, i12, 1, 33);
                spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2GiftAnUpgrade));
                dVar.setFilled(true);
                dVar.g(spannableStringBuilder3, !this.X0, true);
                dVar.f(null, !this.X0);
                dVar.setOnClickListener(new n1(this, 5));
            }
            str2 = null;
            str3 = null;
            z10 = false;
        }
        boolean z17 = savedStarGift.refunded;
        p80 p80Var = this.f9455c0;
        if (z17) {
            p80Var.setVisibility(0);
            p80Var.setText(LocaleController.getString(R.string.Gift2Refunded));
            p80Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23284q7, this.resourcesProvider));
        } else if (z10 && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            p80Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2InBlockchain), new w2(this, str3, 1)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            p80Var.setVisibility(0);
            p80Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23283q5, this.resourcesProvider));
        } else if (TextUtils.isEmpty(str2) && TextUtils.isEmpty(str3) && this.f9484x0 && (savedStarGift.gift instanceof TL_stars.TL_starGift) && savedStarGift.name_hidden) {
            p80Var.setVisibility(0);
            p80Var.setText(LocaleController.getString((tL_textWithEntities == null || TextUtils.isEmpty(tL_textWithEntities.text)) ? R.string.Gift2InSenderHidden2 : R.string.Gift2InSenderMessageHidden2));
            p80Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23283q5, this.resourcesProvider));
        } else {
            p80Var.setVisibility(8);
        }
        p80 p80Var2 = this.f9459e0;
        if (!z10 && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            p80Var2.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2InBlockchain), new w2(this, str3, 2)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            r14 = 0;
            p80Var2.setVisibility(0);
        } else if (this.f9484x0 && N1(this.currentAccount, j10)) {
            if (j10 >= 0) {
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                if (savedStarGift.unsaved) {
                    spannableStringBuilder4.append((CharSequence) ". ");
                    spannableStringBuilder4.setSpan(new cq(R.drawable.mini_gift_hidden, 0), 0, 1, 33);
                }
                spannableStringBuilder4.append((CharSequence) AndroidUtilities.replaceSingleTag(LocaleController.getString(!savedStarGift.unsaved ? R.string.Gift2ProfileVisible4 : R.string.Gift2ProfileInvisible4), new v1(this, 3)));
                p80Var2.setText(AndroidUtilities.replaceArrows(spannableStringBuilder4, true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            } else {
                p80Var2.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(!savedStarGift.unsaved ? R.string.Gift2ChannelProfileVisible3 : R.string.Gift2ChannelProfileInvisible3), new v1(this, 3)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            }
            r14 = 0;
            p80Var2.setVisibility(0);
        } else {
            r14 = 0;
            p80Var2.setVisibility(8);
        }
        if (this.X0) {
            q2(r14, r14, null);
            this.f31852c.n0(1);
            this.X0 = r14;
        }
        this.f31853e.setTitle(this.O0);
        t2();
    }

    public final void k2(TL_stars.TL_starGiftUnique tL_starGiftUnique, boolean z10, TLObject tLObject, TLRPC.TL_textWithEntities tL_textWithEntities) {
        e5 e5Var;
        long j10;
        long j11;
        CharSequence charSequence;
        CharSequence charSequenceReplaceTags;
        Spannable spannableReplaceAnimatedEmoji;
        e5 e5Var2;
        yy0 yy0Var;
        int i10;
        Class cls;
        int i11;
        boolean z11;
        ?? r14;
        yy0 yy0Var2;
        ?? r12;
        TL_stars.starGiftAttributeOriginalDetails stargiftattributeoriginaldetails;
        t4 t4Var;
        lh.d dVar;
        boolean z12;
        TL_stars.StarGift starGift;
        TLRPC.Document document;
        t4 t4Var2;
        boolean z13;
        v1 v1Var;
        v1 v1Var2;
        ArrayList arrayList;
        e5 e5Var3;
        TL_stars.TL_starGiftUnique tL_starGiftUnique2;
        w4 w4Var;
        p4 p4Var;
        r4 r4Var;
        int i12;
        p4 p4Var2;
        int i13;
        p4 p4Var3;
        int i14;
        p4 p4Var4;
        int i15;
        boolean z14;
        Object obj;
        SpannableString spannableString;
        Object objReplaceAnimatedEmoji;
        Object objReplaceAll;
        CharSequence spannable;
        TL_stars.SavedStarGift savedStarGift;
        MessageObject messageObject;
        TLRPC.Message message;
        TLRPC.MessageAction messageAction;
        MessageObject messageObject2;
        TextPaint textPaint;
        TextPaint textPaint2;
        t4 t4Var3;
        TL_stars.TL_starGiftUnique tL_starGiftUnique3;
        long peerDialogId = DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id);
        long peerDialogId2 = DialogObject.getPeerDialogId(tL_starGiftUnique.host_id);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUnique.title);
        sb2.append(" #");
        this.O0 = i0.a.m(tL_starGiftUnique.num, ',', sb2);
        boolean z15 = this.J0;
        e5 e5Var4 = this.f9451a0;
        if (!z15 && (t4Var3 = this.I0) != null && t4Var3.f10068o && (tL_starGiftUnique3 = t4Var3.f10065l) != null) {
            j10 = peerDialogId;
            if (tL_starGiftUnique3.f22607id != tL_starGiftUnique.f22607id) {
                t4Var3.a();
                this.I0 = null;
                e5Var = e5Var4;
                e5Var.f9174b.setAlpha(1.0f);
                e5Var.f9176c.setAlpha(0.0f);
            } else {
                e5Var = e5Var4;
            }
            j11 = j10;
            boolean zO1 = O1(this.currentAccount, j11);
            boolean zO2 = O1(this.currentAccount, peerDialogId2);
            boolean zP1 = P1(this.currentAccount, K1());
            F1();
            e5Var.f(tL_starGiftUnique, zO1, zO2, zP1);
            TL_stars.starGiftAttributeModel stargiftattributemodel = (TL_stars.starGiftAttributeModel) u7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class);
            SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
            spannableStringBuilder.append((CharSequence) tL_starGiftUnique.title);
            spannableStringBuilder.append((CharSequence) " ");
            int length = spannableStringBuilder.length();
            spannableStringBuilder.append((CharSequence) ("#" + LocaleController.formatNumber(tL_starGiftUnique.num, ',')));
            spannableStringBuilder.setSpan(new RelativeSizeSpan(0.85f), length, spannableStringBuilder.length(), 33);
            spannableStringBuilder.setSpan(new vt(190, 0), length, spannableStringBuilder.length(), 33);
            if (tLObject != null) {
                if (tL_starGiftUnique.released_by == null || stargiftattributemodel == null) {
                    charSequence = null;
                } else {
                    charSequenceReplaceTags = stargiftattributemodel.name;
                }
                if (tL_textWithEntities != null) {
                    textPaint = e5Var.C;
                    textPaint2 = e5Var.C;
                    if (textPaint != null) {
                        SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder(tL_textWithEntities.text);
                        MessageObject.addEntitiesToText(spannableStringBuilder2, tL_textWithEntities.entities, false, false, false, false);
                        spannableReplaceAnimatedEmoji = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder2, textPaint2.getFontMetricsInt(), false), tL_textWithEntities.entities, textPaint2.getFontMetricsInt());
                    } else {
                        spannableReplaceAnimatedEmoji = null;
                    }
                } else {
                    spannableReplaceAnimatedEmoji = null;
                }
                e5Var2 = e5Var;
                e5Var2.h(0, spannableStringBuilder, charSequence, e2(tL_starGiftUnique.released_by), null, tLObject, spannableReplaceAnimatedEmoji);
                this.Y0 = null;
                yy0Var = this.f9457d0;
                yy0Var.removeAllViews();
                i10 = 19;
                if (z10) {
                    cls = TL_stars.starGiftAttributeModel.class;
                    i11 = 33;
                    z11 = false;
                    r14 = 1;
                    r12 = z11;
                    yy0Var2 = yy0Var;
                } else if (tL_starGiftUnique.host_id != null) {
                    if (!TextUtils.isEmpty(tL_starGiftUnique.owner_address)) {
                        yy0Var.m(LocaleController.getString(R.string.Gift2HostAddress), tL_starGiftUnique.owner_address, new v1(this, i10));
                    }
                    if (peerDialogId2 != 0) {
                        this.Y0 = ((vy0) this.f9457d0.l(LocaleController.getString(R.string.Gift2Host), this.currentAccount, peerDialogId2, new w1(this, peerDialogId2, 10)).getChildAt(1)).getChildAt(0);
                    }
                    cls = TL_stars.starGiftAttributeModel.class;
                    i11 = 33;
                    z11 = false;
                    r14 = 1;
                    r12 = z11;
                    yy0Var2 = yy0Var;
                } else {
                    cls = TL_stars.starGiftAttributeModel.class;
                    i11 = 33;
                    r12 = 0;
                    z11 = false;
                    if (!TextUtils.isEmpty(tL_starGiftUnique.owner_address)) {
                        yy0Var.m(LocaleController.getString(R.string.Gift2Owner), tL_starGiftUnique.owner_address, new v1(this, 22));
                    } else if (j11 != 0 && tL_starGiftUnique.owner_name != null) {
                        yy0Var.c(LocaleController.getString(R.string.Gift2Owner), tL_starGiftUnique.owner_name, null, null);
                    } else if (j11 != 0) {
                        r14 = 1;
                        yy0Var2 = yy0Var;
                        this.Y0 = ((vy0) this.f9457d0.l(LocaleController.getString(R.string.Gift2Owner), this.currentAccount, j11, new w1(this, j11, 11)).getChildAt(1)).getChildAt(0);
                    }
                    r14 = 1;
                    r12 = z11;
                    yy0Var2 = yy0Var;
                }
                p1(u7.l(tL_starGiftUnique.attributes, cls));
                p1(u7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
                p1(u7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
                if (!z10) {
                    if (this.A0 != null) {
                        yy0Var2.c(LocaleController.getString(R.string.Gift2Quantity), LocaleController.formatPluralStringComma("Gift2QuantityIssued1", tL_starGiftUnique.availability_issued) + LocaleController.formatPluralStringComma("Gift2QuantityIssued2", tL_starGiftUnique.availability_total), null, null);
                    } else if (this.F0) {
                        yy0Var2.c(LocaleController.getString(R.string.Gift2Quantity), LocaleController.formatPluralStringComma("Gift2QuantityIssued1", tL_starGiftUnique.availability_issued) + LocaleController.formatPluralStringComma("Gift2QuantityIssued2", tL_starGiftUnique.availability_total), null, null);
                    } else {
                        TextView textView = (TextView) ((vy0) yy0Var2.c(LocaleController.getString(R.string.Gift2Quantity), "", null, null).getChildAt(r14)).getChildAt(r12);
                        SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("x ");
                        u80 u80Var = new u80(textView, AndroidUtilities.dp(90.0f), r12, this.resourcesProvider);
                        int i16 = org.telegram.ui.ActionBar.g6.G6;
                        u80Var.a(org.telegram.ui.ActionBar.g6.l1(0.21f, org.telegram.ui.ActionBar.g6.v0(i16, this.resourcesProvider)), org.telegram.ui.ActionBar.g6.l1(0.08f, org.telegram.ui.ActionBar.g6.v0(i16, this.resourcesProvider)));
                        spannableStringBuilder3.setSpan(u80Var, r12, r14, i11);
                        textView.setText(spannableStringBuilder3, TextView.BufferType.SPANNABLE);
                        if (!this.E0 && !this.F0 && (messageObject2 = this.A0) != null) {
                            this.E0 = r14;
                            int id2 = messageObject2.getId();
                            TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
                            tL_messages_getMessages.f22474id.add(Integer.valueOf(id2));
                            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getMessages, new u1(this, id2, r12));
                        }
                    }
                    if (!TextUtils.isEmpty(tL_starGiftUnique.slug) && (tL_starGiftUnique.flags & 256) != 0) {
                        this.f9457d0.e(LocaleController.getString(R.string.GiftValue2), s3.c.e("~", BillingController.getInstance().formatCurrency(tL_starGiftUnique.value_amount, tL_starGiftUnique.value_currency, BillingController.getInstance().getCurrencyExp(tL_starGiftUnique.value_currency), true)), LocaleController.getString(R.string.GiftValue2LearnMore), new androidx.car.app.utils.a(this, tL_starGiftUnique, BillingController.getInstance().formatCurrency(tL_starGiftUnique.value_amount, tL_starGiftUnique.value_currency), 25), null);
                    }
                }
                stargiftattributeoriginaldetails = (TL_stars.starGiftAttributeOriginalDetails) u7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeOriginalDetails.class);
                if (stargiftattributeoriginaldetails == null) {
                    if ((stargiftattributeoriginaldetails.flags & r14) != 0) {
                        long peerDialogId3 = DialogObject.getPeerDialogId(stargiftattributeoriginaldetails.sender_id);
                        SpannableString spannableString2 = new SpannableString(DialogObject.getName(peerDialogId3));
                        spannableString2.setSpan(new n3(this, peerDialogId3), r12, spannableString2.length(), i11);
                        obj = spannableString2;
                    } else {
                        obj = null;
                    }
                    long peerDialogId4 = DialogObject.getPeerDialogId(stargiftattributeoriginaldetails.recipient_id);
                    spannableString = new SpannableString(DialogObject.getName(peerDialogId4));
                    spannableString.setSpan(new o3(this, peerDialogId4), r12, spannableString.length(), i11);
                    if (stargiftattributeoriginaldetails.message != null) {
                        TextPaint textPaint3 = new TextPaint((int) r14);
                        textPaint3.setTextSize(AndroidUtilities.dp(14.0f));
                        SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder(stargiftattributeoriginaldetails.message.text);
                        MessageObject.addEntitiesToText(spannableStringBuilder4, stargiftattributeoriginaldetails.message.entities, false, false, false, false);
                        objReplaceAnimatedEmoji = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder4, textPaint3.getFontMetricsInt(), r12), stargiftattributeoriginaldetails.message.entities, textPaint3.getFontMetricsInt());
                    } else {
                        objReplaceAnimatedEmoji = null;
                    }
                    objReplaceAll = LocaleController.getInstance().getFormatterYear().format(((long) stargiftattributeoriginaldetails.date) * 1000).replaceAll("\\.", "/");
                    if (stargiftattributeoriginaldetails.sender_id == stargiftattributeoriginaldetails.recipient_id) {
                        if (objReplaceAnimatedEmoji == null) {
                            int i17 = R.string.Gift2AttributeOriginalDetailsSelf;
                            Object[] objArr = new Object[2];
                            objArr[r12] = obj;
                            objArr[1] = objReplaceAll;
                            spannable = LocaleController.formatSpannable(i17, objArr);
                        } else {
                            int i18 = R.string.Gift2AttributeOriginalDetailsSelfComment;
                            Object[] objArr2 = new Object[3];
                            objArr2[r12] = obj;
                            objArr2[1] = objReplaceAll;
                            objArr2[2] = objReplaceAnimatedEmoji;
                            spannable = LocaleController.formatSpannable(i18, objArr2);
                        }
                    } else if (obj != null) {
                        if (objReplaceAnimatedEmoji == null) {
                            int i19 = R.string.Gift2AttributeOriginalDetails;
                            Object[] objArr3 = new Object[3];
                            objArr3[r12] = obj;
                            objArr3[1] = spannableString;
                            objArr3[2] = objReplaceAll;
                            spannable = LocaleController.formatSpannable(i19, objArr3);
                        } else {
                            int i20 = R.string.Gift2AttributeOriginalDetailsComment;
                            Object[] objArr4 = new Object[4];
                            objArr4[r12] = obj;
                            objArr4[1] = spannableString;
                            objArr4[2] = objReplaceAll;
                            objArr4[3] = objReplaceAnimatedEmoji;
                            spannable = LocaleController.formatSpannable(i20, objArr4);
                        }
                    } else if (objReplaceAnimatedEmoji == null) {
                        int i21 = R.string.Gift2AttributeOriginalDetailsNoSender;
                        Object[] objArr5 = new Object[2];
                        objArr5[r12] = spannableString;
                        objArr5[1] = objReplaceAll;
                        spannable = LocaleController.formatSpannable(i21, objArr5);
                    } else {
                        int i22 = R.string.Gift2AttributeOriginalDetailsNoSenderComment;
                        Object[] objArr6 = new Object[3];
                        objArr6[r12] = spannableString;
                        objArr6[1] = objReplaceAll;
                        objArr6[2] = objReplaceAnimatedEmoji;
                        spannable = LocaleController.formatSpannable(i22, objArr6);
                    }
                    if (N1(this.currentAccount, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id))) {
                        savedStarGift = this.f9485y0;
                        if (savedStarGift != null || savedStarGift.drop_original_details_stars < 0) {
                            messageObject = this.A0;
                            if (messageObject != null && (message = messageObject.messageOwner) != null) {
                                messageAction = message.action;
                                if ((messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) || ((TLRPC.TL_messageActionStarGiftUnique) messageAction).drop_original_details_stars < 0) {
                                }
                            }
                            wy0 wy0VarA = yy0Var2.a(spannable);
                            wy0VarA.setFilled(true);
                            eh.s sVar = (eh.s) wy0VarA.getChildAt(r12);
                            sVar.setTextSize(1, 12.0f);
                            sVar.setGravity(17);
                        }
                        LinearLayout linearLayout = new LinearLayout(getContext());
                        linearLayout.setPadding(AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f), AndroidUtilities.dp(12.66f), AndroidUtilities.dp(9.33f));
                        linearLayout.setOrientation(r12);
                        eh.s sVar2 = new eh.s(getContext());
                        sVar2.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.G6, this.resourcesProvider));
                        sVar2.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.gc, this.resourcesProvider));
                        sVar2.setTextSize(1, 12.0f);
                        sVar2.setGravity(3);
                        sVar2.setText(spannable);
                        linearLayout.addView(sVar2, h7.z5.o(-1, -2, 1.0f, 19));
                        ImageView imageView = new ImageView(getContext());
                        imageView.setScaleType(ImageView.ScaleType.CENTER);
                        int i23 = org.telegram.ui.ActionBar.g6.Oh;
                        imageView.setBackground(org.telegram.ui.ActionBar.g6.Y(org.telegram.ui.ActionBar.g6.l1(0.1f, org.telegram.ui.ActionBar.g6.v0(i23, this.resourcesProvider)), 6, 6));
                        imageView.setImageResource(R.drawable.menu_delete_old);
                        imageView.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.g6.v0(i23, this.resourcesProvider), PorterDuff.Mode.SRC_IN));
                        h7.b6.a(imageView);
                        imageView.setOnClickListener(new ag.q0(19, this, spannable));
                        linearLayout.addView(imageView, h7.z5.p(32, 32, 0.0f, 21, 8, 0, 0, 0));
                        TableRow tableRow = new TableRow(getContext());
                        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
                        layoutParams.span = 2;
                        tableRow.addView(new wy0(yy0Var2, linearLayout, true), layoutParams);
                        yy0Var2.addView(tableRow);
                    } else {
                        wy0 wy0VarA2 = yy0Var2.a(spannable);
                        wy0VarA2.setFilled(true);
                        eh.s sVar3 = (eh.s) wy0VarA2.getChildAt(r12);
                        sVar3.setTextSize(1, 12.0f);
                        sVar3.setGravity(17);
                    }
                }
                t4Var = this.I0;
                dVar = this.f9461f0;
                if (t4Var != null || !t4Var.f10068o) {
                    if (N1(this.currentAccount, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id)) && tL_starGiftUnique.resell_amount != null) {
                        dVar.setFilled(true);
                        l2(tL_starGiftUnique);
                        dVar.setOnClickListener(new n1(this, 24));
                    } else if (this.m0 || this.V == null || this.f9486z0 == null || G1() < 0 || this.f9486z0.b(G1()) < 0) {
                        dVar.setFilled(true);
                        dVar.g(LocaleController.getString(R.string.OK), !this.X0, true);
                        dVar.f(null, !this.X0);
                        dVar.setOnClickListener(new n1(this, 25));
                    } else {
                        dVar.setFilled(r12);
                        int iB = this.f9486z0.b(G1());
                        SpannableStringBuilder spannableStringBuilder5 = new SpannableStringBuilder();
                        spannableStringBuilder5.append((CharSequence) LocaleController.getString(R.string.Gift2UpgradeNext));
                        Object obj2 = this.f9486z0.get(iB);
                        if (!(obj2 instanceof TL_stars.SavedStarGift) || (starGift = ((TL_stars.SavedStarGift) obj2).gift) == null || (document = starGift.getDocument()) == null) {
                            z12 = true;
                        } else {
                            spannableStringBuilder5.append((CharSequence) " e");
                            z12 = true;
                            spannableStringBuilder5.setSpan(new org.telegram.ui.Components.t5(document, dVar.getTextPaint().getFontMetricsInt()), spannableStringBuilder5.length() - 1, spannableStringBuilder5.length(), 33);
                        }
                        dVar.g(spannableStringBuilder5, this.X0 ^ z12, z12);
                        dVar.f(null, this.X0 ^ z12);
                        dVar.setOnClickListener(new z1(this, iB, 3));
                    }
                }
                this.f31853e.setTitle(this.O0);
                t4Var2 = this.I0;
                if (t4Var2 != null) {
                    z13 = this.J0;
                    v1Var = new v1(this, 23);
                    v1Var2 = new v1(this, 20);
                    arrayList = t4Var2.f10060f;
                    e5Var3 = t4Var2.f10056a;
                    tL_starGiftUnique2 = t4Var2.f10065l;
                    if (tL_starGiftUnique2 == null && tL_starGiftUnique2.f22607id == tL_starGiftUnique.f22607id) {
                        z14 = t4Var2.f10068o;
                    } else if (z13) {
                        org.telegram.ui.Components.n9 upgradeImageView = e5Var3.getUpgradeImageView();
                        w4Var = e5Var3.f9176c;
                        TL_stars.starGiftAttributeModel upgradeImageViewAttribute = e5Var3.getUpgradeImageViewAttribute();
                        TL_stars.starGiftAttributePattern upgradePatternAttribute = e5Var3.getUpgradePatternAttribute();
                        TL_stars.starGiftAttributeBackdrop upgradeBackdropAttribute = e5Var3.getUpgradeBackdropAttribute();
                        TL_stars.starGiftAttributeModel stargiftattributemodel2 = (TL_stars.starGiftAttributeModel) u7.l(tL_starGiftUnique.attributes, cls);
                        TL_stars.starGiftAttributePattern stargiftattributepattern = (TL_stars.starGiftAttributePattern) u7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
                        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop = (TL_stars.starGiftAttributeBackdrop) u7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
                        t4Var2.f10068o = true;
                        t4Var2.f10065l = tL_starGiftUnique;
                        t4Var2.f10071r = v1Var;
                        t4Var2.f10072s = v1Var2;
                        t4Var2.f10073t = (float) Math.random();
                        t4Var2.f10066m = System.currentTimeMillis();
                        t4Var2.f10067n = 0.0f;
                        t4Var2.f10069p = false;
                        t4Var2.f10070q = false;
                        t4Var2.f10068o = true;
                        p4Var = t4Var2.h;
                        if (p4Var != null) {
                            p4Var.a();
                        }
                        r4Var = new r4(w4Var, stargiftattributemodel2);
                        if (w4Var.isAttachedToWindow() && r4Var.f9990c) {
                            r4Var.d.onAttachedToWindow();
                        }
                        n4 n4Var = new n4(t4Var2, 0);
                        ArrayList arrayList2 = t4Var2.f10059e;
                        r4 r4Var2 = new r4(upgradeImageView, upgradeImageViewAttribute);
                        if (t4Var2.f10073t > 0.5f) {
                            i12 = 3;
                        } else {
                            i12 = 2;
                        }
                        t4Var2.h = new p4(n4Var, arrayList2, r4Var2, r4Var, 0.9f, i12);
                        p4Var2 = t4Var2.f10062i;
                        if (p4Var2 != null) {
                            p4Var2.a();
                        }
                        n4 n4Var2 = new n4(t4Var2, 0);
                        ArrayList arrayList3 = t4Var2.f10061g;
                        s4 s4Var = new s4(upgradePatternAttribute);
                        s4 s4Var2 = new s4(stargiftattributepattern);
                        if (t4Var2.f10073t > 0.5f) {
                            i13 = 2;
                        } else {
                            i13 = 1;
                        }
                        t4Var2.f10062i = new p4(n4Var2, arrayList3, s4Var, s4Var2, 1.0f, i13);
                        p4Var3 = t4Var2.f10063j;
                        if (p4Var3 != null) {
                            p4Var3.a();
                        }
                        n4 n4Var3 = new n4(t4Var2, 0);
                        q4 q4Var = new q4(upgradeBackdropAttribute);
                        q4 q4Var2 = new q4(stargiftattributebackdrop);
                        if (t4Var2.f10073t > 0.5f) {
                            i14 = 2;
                        } else {
                            i14 = 1;
                        }
                        t4Var2.f10063j = new p4(n4Var3, arrayList, q4Var, q4Var2, 0.5f, i14);
                        p4Var4 = t4Var2.f10064k;
                        if (p4Var4 != null) {
                            p4Var4.a();
                        }
                        n4 n4Var4 = new n4(t4Var2, 0);
                        q4 q4Var3 = new q4(upgradeBackdropAttribute);
                        q4 q4Var4 = new q4(stargiftattributebackdrop);
                        if (t4Var2.f10073t > 0.5f) {
                            i15 = 2;
                        } else {
                            i15 = 1;
                        }
                        t4Var2.f10064k = new p4(n4Var4, arrayList, q4Var3, q4Var4, 1.25f, i15);
                        t4Var2.b();
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (z14) {
                        e5Var2.f9174b.setAlpha(0.0f);
                        e5Var2.f9176c.setAlpha(1.0f);
                        dVar.g(LocaleController.getString(R.string.GiftSkipAnimation), true, true);
                        dVar.setFilled(true);
                        dVar.setOnClickListener(new n1(this, 23));
                        int length2 = ((i5) this.M0.d).L0.length - 1;
                        zk0 zk0Var = this.d;
                        zk0Var.u0(length2);
                        zk0Var.post(new v1(this, 21));
                    }
                }
            }
            charSequenceReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UniqueGiftFrom, DialogObject.getShortName(tLObject)));
            charSequence = charSequenceReplaceTags;
            if (tL_textWithEntities != null) {
                textPaint = e5Var.C;
                textPaint2 = e5Var.C;
                if (textPaint != null) {
                    SpannableStringBuilder spannableStringBuilder6 = new SpannableStringBuilder(tL_textWithEntities.text);
                    MessageObject.addEntitiesToText(spannableStringBuilder6, tL_textWithEntities.entities, false, false, false, false);
                    spannableReplaceAnimatedEmoji = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder6, textPaint2.getFontMetricsInt(), false), tL_textWithEntities.entities, textPaint2.getFontMetricsInt());
                } else {
                    spannableReplaceAnimatedEmoji = null;
                }
            } else {
                spannableReplaceAnimatedEmoji = null;
            }
            e5Var2 = e5Var;
            e5Var2.h(0, spannableStringBuilder, charSequence, e2(tL_starGiftUnique.released_by), null, tLObject, spannableReplaceAnimatedEmoji);
            this.Y0 = null;
            yy0Var = this.f9457d0;
            yy0Var.removeAllViews();
            i10 = 19;
            if (z10) {
                cls = TL_stars.starGiftAttributeModel.class;
                i11 = 33;
                z11 = false;
                r14 = 1;
                r12 = z11;
                yy0Var2 = yy0Var;
            } else if (tL_starGiftUnique.host_id != null) {
                if (!TextUtils.isEmpty(tL_starGiftUnique.owner_address)) {
                    yy0Var.m(LocaleController.getString(R.string.Gift2HostAddress), tL_starGiftUnique.owner_address, new v1(this, i10));
                }
                if (peerDialogId2 != 0) {
                    this.Y0 = ((vy0) this.f9457d0.l(LocaleController.getString(R.string.Gift2Host), this.currentAccount, peerDialogId2, new w1(this, peerDialogId2, 10)).getChildAt(1)).getChildAt(0);
                }
                cls = TL_stars.starGiftAttributeModel.class;
                i11 = 33;
                z11 = false;
                r14 = 1;
                r12 = z11;
                yy0Var2 = yy0Var;
            } else {
                cls = TL_stars.starGiftAttributeModel.class;
                i11 = 33;
                r12 = 0;
                z11 = false;
                if (!TextUtils.isEmpty(tL_starGiftUnique.owner_address)) {
                    yy0Var.m(LocaleController.getString(R.string.Gift2Owner), tL_starGiftUnique.owner_address, new v1(this, 22));
                } else if (j11 != 0) {
                    if (j11 != 0) {
                        r14 = 1;
                        yy0Var2 = yy0Var;
                        this.Y0 = ((vy0) this.f9457d0.l(LocaleController.getString(R.string.Gift2Owner), this.currentAccount, j11, new w1(this, j11, 11)).getChildAt(1)).getChildAt(0);
                    }
                } else if (j11 != 0) {
                    r14 = 1;
                    yy0Var2 = yy0Var;
                    this.Y0 = ((vy0) this.f9457d0.l(LocaleController.getString(R.string.Gift2Owner), this.currentAccount, j11, new w1(this, j11, 11)).getChildAt(1)).getChildAt(0);
                }
                r14 = 1;
                r12 = z11;
                yy0Var2 = yy0Var;
            }
            p1(u7.l(tL_starGiftUnique.attributes, cls));
            p1(u7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
            p1(u7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
            if (!z10) {
                if (this.A0 != null) {
                    yy0Var2.c(LocaleController.getString(R.string.Gift2Quantity), LocaleController.formatPluralStringComma("Gift2QuantityIssued1", tL_starGiftUnique.availability_issued) + LocaleController.formatPluralStringComma("Gift2QuantityIssued2", tL_starGiftUnique.availability_total), null, null);
                } else if (this.F0) {
                    TextView textView2 = (TextView) ((vy0) yy0Var2.c(LocaleController.getString(R.string.Gift2Quantity), "", null, null).getChildAt(r14)).getChildAt(r12);
                    SpannableStringBuilder spannableStringBuilder7 = new SpannableStringBuilder("x ");
                    u80 u80Var2 = new u80(textView2, AndroidUtilities.dp(90.0f), r12, this.resourcesProvider);
                    int i110 = org.telegram.ui.ActionBar.g6.G6;
                    u80Var2.a(org.telegram.ui.ActionBar.g6.l1(0.21f, org.telegram.ui.ActionBar.g6.v0(i110, this.resourcesProvider)), org.telegram.ui.ActionBar.g6.l1(0.08f, org.telegram.ui.ActionBar.g6.v0(i110, this.resourcesProvider)));
                    spannableStringBuilder7.setSpan(u80Var2, r12, r14, i11);
                    textView2.setText(spannableStringBuilder7, TextView.BufferType.SPANNABLE);
                    if (!this.E0) {
                        this.E0 = r14;
                        int id3 = messageObject2.getId();
                        TLRPC.TL_messages_getMessages tL_messages_getMessages2 = new TLRPC.TL_messages_getMessages();
                        tL_messages_getMessages2.f22474id.add(Integer.valueOf(id3));
                        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getMessages2, new u1(this, id3, r12));
                    }
                } else {
                    yy0Var2.c(LocaleController.getString(R.string.Gift2Quantity), LocaleController.formatPluralStringComma("Gift2QuantityIssued1", tL_starGiftUnique.availability_issued) + LocaleController.formatPluralStringComma("Gift2QuantityIssued2", tL_starGiftUnique.availability_total), null, null);
                }
                if (!TextUtils.isEmpty(tL_starGiftUnique.slug)) {
                    this.f9457d0.e(LocaleController.getString(R.string.GiftValue2), s3.c.e("~", BillingController.getInstance().formatCurrency(tL_starGiftUnique.value_amount, tL_starGiftUnique.value_currency, BillingController.getInstance().getCurrencyExp(tL_starGiftUnique.value_currency), true)), LocaleController.getString(R.string.GiftValue2LearnMore), new androidx.car.app.utils.a(this, tL_starGiftUnique, BillingController.getInstance().formatCurrency(tL_starGiftUnique.value_amount, tL_starGiftUnique.value_currency), 25), null);
                }
            }
            stargiftattributeoriginaldetails = (TL_stars.starGiftAttributeOriginalDetails) u7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeOriginalDetails.class);
            if (stargiftattributeoriginaldetails == null) {
                if ((stargiftattributeoriginaldetails.flags & r14) != 0) {
                    long peerDialogId5 = DialogObject.getPeerDialogId(stargiftattributeoriginaldetails.sender_id);
                    SpannableString spannableString3 = new SpannableString(DialogObject.getName(peerDialogId5));
                    spannableString3.setSpan(new n3(this, peerDialogId5), r12, spannableString3.length(), i11);
                    obj = spannableString3;
                } else {
                    obj = null;
                }
                long peerDialogId6 = DialogObject.getPeerDialogId(stargiftattributeoriginaldetails.recipient_id);
                spannableString = new SpannableString(DialogObject.getName(peerDialogId6));
                spannableString.setSpan(new o3(this, peerDialogId6), r12, spannableString.length(), i11);
                if (stargiftattributeoriginaldetails.message != null) {
                    TextPaint textPaint4 = new TextPaint((int) r14);
                    textPaint4.setTextSize(AndroidUtilities.dp(14.0f));
                    SpannableStringBuilder spannableStringBuilder8 = new SpannableStringBuilder(stargiftattributeoriginaldetails.message.text);
                    MessageObject.addEntitiesToText(spannableStringBuilder8, stargiftattributeoriginaldetails.message.entities, false, false, false, false);
                    objReplaceAnimatedEmoji = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder8, textPaint4.getFontMetricsInt(), r12), stargiftattributeoriginaldetails.message.entities, textPaint4.getFontMetricsInt());
                } else {
                    objReplaceAnimatedEmoji = null;
                }
                objReplaceAll = LocaleController.getInstance().getFormatterYear().format(((long) stargiftattributeoriginaldetails.date) * 1000).replaceAll("\\.", "/");
                if (stargiftattributeoriginaldetails.sender_id == stargiftattributeoriginaldetails.recipient_id) {
                    if (objReplaceAnimatedEmoji == null) {
                        int i111 = R.string.Gift2AttributeOriginalDetailsSelf;
                        Object[] objArr7 = new Object[2];
                        objArr7[r12] = obj;
                        objArr7[1] = objReplaceAll;
                        spannable = LocaleController.formatSpannable(i111, objArr7);
                    } else {
                        int i112 = R.string.Gift2AttributeOriginalDetailsSelfComment;
                        Object[] objArr8 = new Object[3];
                        objArr8[r12] = obj;
                        objArr8[1] = objReplaceAll;
                        objArr8[2] = objReplaceAnimatedEmoji;
                        spannable = LocaleController.formatSpannable(i112, objArr8);
                    }
                } else if (obj != null) {
                    if (objReplaceAnimatedEmoji == null) {
                        int i113 = R.string.Gift2AttributeOriginalDetails;
                        Object[] objArr9 = new Object[3];
                        objArr9[r12] = obj;
                        objArr9[1] = spannableString;
                        objArr9[2] = objReplaceAll;
                        spannable = LocaleController.formatSpannable(i113, objArr9);
                    } else {
                        int i24 = R.string.Gift2AttributeOriginalDetailsComment;
                        Object[] objArr10 = new Object[4];
                        objArr10[r12] = obj;
                        objArr10[1] = spannableString;
                        objArr10[2] = objReplaceAll;
                        objArr10[3] = objReplaceAnimatedEmoji;
                        spannable = LocaleController.formatSpannable(i24, objArr10);
                    }
                } else if (objReplaceAnimatedEmoji == null) {
                    int i25 = R.string.Gift2AttributeOriginalDetailsNoSender;
                    Object[] objArr11 = new Object[2];
                    objArr11[r12] = spannableString;
                    objArr11[1] = objReplaceAll;
                    spannable = LocaleController.formatSpannable(i25, objArr11);
                } else {
                    int i26 = R.string.Gift2AttributeOriginalDetailsNoSenderComment;
                    Object[] objArr12 = new Object[3];
                    objArr12[r12] = spannableString;
                    objArr12[1] = objReplaceAll;
                    objArr12[2] = objReplaceAnimatedEmoji;
                    spannable = LocaleController.formatSpannable(i26, objArr12);
                }
                if (N1(this.currentAccount, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id))) {
                    wy0 wy0VarA3 = yy0Var2.a(spannable);
                    wy0VarA3.setFilled(true);
                    eh.s sVar4 = (eh.s) wy0VarA3.getChildAt(r12);
                    sVar4.setTextSize(1, 12.0f);
                    sVar4.setGravity(17);
                } else {
                    savedStarGift = this.f9485y0;
                    if (savedStarGift != null) {
                        messageObject = this.A0;
                        if (messageObject != null) {
                            messageAction = message.action;
                            if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                            }
                        }
                        wy0 wy0VarA4 = yy0Var2.a(spannable);
                        wy0VarA4.setFilled(true);
                        eh.s sVar5 = (eh.s) wy0VarA4.getChildAt(r12);
                        sVar5.setTextSize(1, 12.0f);
                        sVar5.setGravity(17);
                    } else {
                        messageObject = this.A0;
                        if (messageObject != null) {
                            messageAction = message.action;
                            if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                            }
                        }
                        wy0 wy0VarA5 = yy0Var2.a(spannable);
                        wy0VarA5.setFilled(true);
                        eh.s sVar6 = (eh.s) wy0VarA5.getChildAt(r12);
                        sVar6.setTextSize(1, 12.0f);
                        sVar6.setGravity(17);
                    }
                }
            }
            t4Var = this.I0;
            dVar = this.f9461f0;
            if (t4Var != null) {
                if (N1(this.currentAccount, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id))) {
                }
                if (this.m0) {
                    dVar.setFilled(true);
                    dVar.g(LocaleController.getString(R.string.OK), !this.X0, true);
                    dVar.f(null, !this.X0);
                    dVar.setOnClickListener(new n1(this, 25));
                } else {
                    dVar.setFilled(true);
                    dVar.g(LocaleController.getString(R.string.OK), !this.X0, true);
                    dVar.f(null, !this.X0);
                    dVar.setOnClickListener(new n1(this, 25));
                }
            } else {
                if (N1(this.currentAccount, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id))) {
                }
                if (this.m0) {
                    dVar.setFilled(true);
                    dVar.g(LocaleController.getString(R.string.OK), !this.X0, true);
                    dVar.f(null, !this.X0);
                    dVar.setOnClickListener(new n1(this, 25));
                } else {
                    dVar.setFilled(true);
                    dVar.g(LocaleController.getString(R.string.OK), !this.X0, true);
                    dVar.f(null, !this.X0);
                    dVar.setOnClickListener(new n1(this, 25));
                }
            }
            this.f31853e.setTitle(this.O0);
            t4Var2 = this.I0;
            if (t4Var2 != null) {
                z13 = this.J0;
                v1Var = new v1(this, 23);
                v1Var2 = new v1(this, 20);
                arrayList = t4Var2.f10060f;
                e5Var3 = t4Var2.f10056a;
                tL_starGiftUnique2 = t4Var2.f10065l;
                if (tL_starGiftUnique2 == null) {
                    if (z13) {
                        z14 = false;
                    } else {
                        org.telegram.ui.Components.n9 upgradeImageView2 = e5Var3.getUpgradeImageView();
                        w4Var = e5Var3.f9176c;
                        TL_stars.starGiftAttributeModel upgradeImageViewAttribute2 = e5Var3.getUpgradeImageViewAttribute();
                        TL_stars.starGiftAttributePattern upgradePatternAttribute2 = e5Var3.getUpgradePatternAttribute();
                        TL_stars.starGiftAttributeBackdrop upgradeBackdropAttribute2 = e5Var3.getUpgradeBackdropAttribute();
                        TL_stars.starGiftAttributeModel stargiftattributemodel3 = (TL_stars.starGiftAttributeModel) u7.l(tL_starGiftUnique.attributes, cls);
                        TL_stars.starGiftAttributePattern stargiftattributepattern2 = (TL_stars.starGiftAttributePattern) u7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
                        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop2 = (TL_stars.starGiftAttributeBackdrop) u7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
                        t4Var2.f10068o = true;
                        t4Var2.f10065l = tL_starGiftUnique;
                        t4Var2.f10071r = v1Var;
                        t4Var2.f10072s = v1Var2;
                        t4Var2.f10073t = (float) Math.random();
                        t4Var2.f10066m = System.currentTimeMillis();
                        t4Var2.f10067n = 0.0f;
                        t4Var2.f10069p = false;
                        t4Var2.f10070q = false;
                        t4Var2.f10068o = true;
                        p4Var = t4Var2.h;
                        if (p4Var != null) {
                            p4Var.a();
                        }
                        r4Var = new r4(w4Var, stargiftattributemodel3);
                        if (w4Var.isAttachedToWindow()) {
                            r4Var.d.onAttachedToWindow();
                        }
                        n4 n4Var5 = new n4(t4Var2, 0);
                        ArrayList arrayList4 = t4Var2.f10059e;
                        r4 r4Var3 = new r4(upgradeImageView2, upgradeImageViewAttribute2);
                        if (t4Var2.f10073t > 0.5f) {
                            i12 = 3;
                        } else {
                            i12 = 2;
                        }
                        t4Var2.h = new p4(n4Var5, arrayList4, r4Var3, r4Var, 0.9f, i12);
                        p4Var2 = t4Var2.f10062i;
                        if (p4Var2 != null) {
                            p4Var2.a();
                        }
                        n4 n4Var6 = new n4(t4Var2, 0);
                        ArrayList arrayList5 = t4Var2.f10061g;
                        s4 s4Var3 = new s4(upgradePatternAttribute2);
                        s4 s4Var4 = new s4(stargiftattributepattern2);
                        if (t4Var2.f10073t > 0.5f) {
                            i13 = 2;
                        } else {
                            i13 = 1;
                        }
                        t4Var2.f10062i = new p4(n4Var6, arrayList5, s4Var3, s4Var4, 1.0f, i13);
                        p4Var3 = t4Var2.f10063j;
                        if (p4Var3 != null) {
                            p4Var3.a();
                        }
                        n4 n4Var7 = new n4(t4Var2, 0);
                        q4 q4Var5 = new q4(upgradeBackdropAttribute2);
                        q4 q4Var6 = new q4(stargiftattributebackdrop2);
                        if (t4Var2.f10073t > 0.5f) {
                            i14 = 2;
                        } else {
                            i14 = 1;
                        }
                        t4Var2.f10063j = new p4(n4Var7, arrayList, q4Var5, q4Var6, 0.5f, i14);
                        p4Var4 = t4Var2.f10064k;
                        if (p4Var4 != null) {
                            p4Var4.a();
                        }
                        n4 n4Var8 = new n4(t4Var2, 0);
                        q4 q4Var7 = new q4(upgradeBackdropAttribute2);
                        q4 q4Var8 = new q4(stargiftattributebackdrop2);
                        if (t4Var2.f10073t > 0.5f) {
                            i15 = 2;
                        } else {
                            i15 = 1;
                        }
                        t4Var2.f10064k = new p4(n4Var8, arrayList, q4Var7, q4Var8, 1.25f, i15);
                        t4Var2.b();
                        z14 = true;
                    }
                } else if (z13) {
                    z14 = false;
                } else {
                    org.telegram.ui.Components.n9 upgradeImageView3 = e5Var3.getUpgradeImageView();
                    w4Var = e5Var3.f9176c;
                    TL_stars.starGiftAttributeModel upgradeImageViewAttribute3 = e5Var3.getUpgradeImageViewAttribute();
                    TL_stars.starGiftAttributePattern upgradePatternAttribute3 = e5Var3.getUpgradePatternAttribute();
                    TL_stars.starGiftAttributeBackdrop upgradeBackdropAttribute3 = e5Var3.getUpgradeBackdropAttribute();
                    TL_stars.starGiftAttributeModel stargiftattributemodel4 = (TL_stars.starGiftAttributeModel) u7.l(tL_starGiftUnique.attributes, cls);
                    TL_stars.starGiftAttributePattern stargiftattributepattern3 = (TL_stars.starGiftAttributePattern) u7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop3 = (TL_stars.starGiftAttributeBackdrop) u7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
                    t4Var2.f10068o = true;
                    t4Var2.f10065l = tL_starGiftUnique;
                    t4Var2.f10071r = v1Var;
                    t4Var2.f10072s = v1Var2;
                    t4Var2.f10073t = (float) Math.random();
                    t4Var2.f10066m = System.currentTimeMillis();
                    t4Var2.f10067n = 0.0f;
                    t4Var2.f10069p = false;
                    t4Var2.f10070q = false;
                    t4Var2.f10068o = true;
                    p4Var = t4Var2.h;
                    if (p4Var != null) {
                        p4Var.a();
                    }
                    r4Var = new r4(w4Var, stargiftattributemodel4);
                    if (w4Var.isAttachedToWindow()) {
                        r4Var.d.onAttachedToWindow();
                    }
                    n4 n4Var9 = new n4(t4Var2, 0);
                    ArrayList arrayList6 = t4Var2.f10059e;
                    r4 r4Var4 = new r4(upgradeImageView3, upgradeImageViewAttribute3);
                    if (t4Var2.f10073t > 0.5f) {
                        i12 = 3;
                    } else {
                        i12 = 2;
                    }
                    t4Var2.h = new p4(n4Var9, arrayList6, r4Var4, r4Var, 0.9f, i12);
                    p4Var2 = t4Var2.f10062i;
                    if (p4Var2 != null) {
                        p4Var2.a();
                    }
                    n4 n4Var10 = new n4(t4Var2, 0);
                    ArrayList arrayList7 = t4Var2.f10061g;
                    s4 s4Var5 = new s4(upgradePatternAttribute3);
                    s4 s4Var6 = new s4(stargiftattributepattern3);
                    if (t4Var2.f10073t > 0.5f) {
                        i13 = 2;
                    } else {
                        i13 = 1;
                    }
                    t4Var2.f10062i = new p4(n4Var10, arrayList7, s4Var5, s4Var6, 1.0f, i13);
                    p4Var3 = t4Var2.f10063j;
                    if (p4Var3 != null) {
                        p4Var3.a();
                    }
                    n4 n4Var11 = new n4(t4Var2, 0);
                    q4 q4Var9 = new q4(upgradeBackdropAttribute3);
                    q4 q4Var10 = new q4(stargiftattributebackdrop3);
                    if (t4Var2.f10073t > 0.5f) {
                        i14 = 2;
                    } else {
                        i14 = 1;
                    }
                    t4Var2.f10063j = new p4(n4Var11, arrayList, q4Var9, q4Var10, 0.5f, i14);
                    p4Var4 = t4Var2.f10064k;
                    if (p4Var4 != null) {
                        p4Var4.a();
                    }
                    n4 n4Var12 = new n4(t4Var2, 0);
                    q4 q4Var11 = new q4(upgradeBackdropAttribute3);
                    q4 q4Var12 = new q4(stargiftattributebackdrop3);
                    if (t4Var2.f10073t > 0.5f) {
                        i15 = 2;
                    } else {
                        i15 = 1;
                    }
                    t4Var2.f10064k = new p4(n4Var12, arrayList, q4Var11, q4Var12, 1.25f, i15);
                    t4Var2.b();
                    z14 = true;
                }
                if (z14) {
                    e5Var2.f9174b.setAlpha(0.0f);
                    e5Var2.f9176c.setAlpha(1.0f);
                    dVar.g(LocaleController.getString(R.string.GiftSkipAnimation), true, true);
                    dVar.setFilled(true);
                    dVar.setOnClickListener(new n1(this, 23));
                    int length3 = ((i5) this.M0.d).L0.length - 1;
                    zk0 zk0Var2 = this.d;
                    zk0Var2.u0(length3);
                    zk0Var2.post(new v1(this, 21));
                }
            }
        }
        e5Var = e5Var4;
        j10 = peerDialogId;
        if (z15 && this.I0 == null) {
            this.I0 = new t4(e5Var);
        }
        j11 = j10;
        boolean zO3 = O1(this.currentAccount, j11);
        boolean zO4 = O1(this.currentAccount, peerDialogId2);
        boolean zP2 = P1(this.currentAccount, K1());
        F1();
        e5Var.f(tL_starGiftUnique, zO3, zO4, zP2);
        TL_stars.starGiftAttributeModel stargiftattributemodel5 = (TL_stars.starGiftAttributeModel) u7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeModel.class);
        SpannableStringBuilder spannableStringBuilder9 = new SpannableStringBuilder();
        spannableStringBuilder9.append((CharSequence) tL_starGiftUnique.title);
        spannableStringBuilder9.append((CharSequence) " ");
        int length4 = spannableStringBuilder9.length();
        spannableStringBuilder9.append((CharSequence) ("#" + LocaleController.formatNumber(tL_starGiftUnique.num, ',')));
        spannableStringBuilder9.setSpan(new RelativeSizeSpan(0.85f), length4, spannableStringBuilder9.length(), 33);
        spannableStringBuilder9.setSpan(new vt(190, 0), length4, spannableStringBuilder9.length(), 33);
        if (tLObject != null) {
            if (tL_starGiftUnique.released_by == null) {
            }
            charSequence = null;
            if (tL_textWithEntities != null) {
                textPaint = e5Var.C;
                textPaint2 = e5Var.C;
                if (textPaint != null) {
                    SpannableStringBuilder spannableStringBuilder10 = new SpannableStringBuilder(tL_textWithEntities.text);
                    MessageObject.addEntitiesToText(spannableStringBuilder10, tL_textWithEntities.entities, false, false, false, false);
                    spannableReplaceAnimatedEmoji = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder10, textPaint2.getFontMetricsInt(), false), tL_textWithEntities.entities, textPaint2.getFontMetricsInt());
                } else {
                    spannableReplaceAnimatedEmoji = null;
                }
            } else {
                spannableReplaceAnimatedEmoji = null;
            }
            e5Var2 = e5Var;
            e5Var2.h(0, spannableStringBuilder9, charSequence, e2(tL_starGiftUnique.released_by), null, tLObject, spannableReplaceAnimatedEmoji);
            this.Y0 = null;
            yy0Var = this.f9457d0;
            yy0Var.removeAllViews();
            i10 = 19;
            if (z10) {
                cls = TL_stars.starGiftAttributeModel.class;
                i11 = 33;
                z11 = false;
                r14 = 1;
                r12 = z11;
                yy0Var2 = yy0Var;
            } else if (tL_starGiftUnique.host_id != null) {
                if (!TextUtils.isEmpty(tL_starGiftUnique.owner_address)) {
                    yy0Var.m(LocaleController.getString(R.string.Gift2HostAddress), tL_starGiftUnique.owner_address, new v1(this, i10));
                }
                if (peerDialogId2 != 0) {
                    this.Y0 = ((vy0) this.f9457d0.l(LocaleController.getString(R.string.Gift2Host), this.currentAccount, peerDialogId2, new w1(this, peerDialogId2, 10)).getChildAt(1)).getChildAt(0);
                }
                cls = TL_stars.starGiftAttributeModel.class;
                i11 = 33;
                z11 = false;
                r14 = 1;
                r12 = z11;
                yy0Var2 = yy0Var;
            } else {
                cls = TL_stars.starGiftAttributeModel.class;
                i11 = 33;
                r12 = 0;
                z11 = false;
                if (!TextUtils.isEmpty(tL_starGiftUnique.owner_address)) {
                    yy0Var.m(LocaleController.getString(R.string.Gift2Owner), tL_starGiftUnique.owner_address, new v1(this, 22));
                } else if (j11 != 0) {
                    if (j11 != 0) {
                        r14 = 1;
                        yy0Var2 = yy0Var;
                        this.Y0 = ((vy0) this.f9457d0.l(LocaleController.getString(R.string.Gift2Owner), this.currentAccount, j11, new w1(this, j11, 11)).getChildAt(1)).getChildAt(0);
                    }
                } else if (j11 != 0) {
                    r14 = 1;
                    yy0Var2 = yy0Var;
                    this.Y0 = ((vy0) this.f9457d0.l(LocaleController.getString(R.string.Gift2Owner), this.currentAccount, j11, new w1(this, j11, 11)).getChildAt(1)).getChildAt(0);
                }
                r14 = 1;
                r12 = z11;
                yy0Var2 = yy0Var;
            }
            p1(u7.l(tL_starGiftUnique.attributes, cls));
            p1(u7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
            p1(u7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
            if (!z10) {
                if (this.A0 != null) {
                    yy0Var2.c(LocaleController.getString(R.string.Gift2Quantity), LocaleController.formatPluralStringComma("Gift2QuantityIssued1", tL_starGiftUnique.availability_issued) + LocaleController.formatPluralStringComma("Gift2QuantityIssued2", tL_starGiftUnique.availability_total), null, null);
                } else if (this.F0) {
                    TextView textView3 = (TextView) ((vy0) yy0Var2.c(LocaleController.getString(R.string.Gift2Quantity), "", null, null).getChildAt(r14)).getChildAt(r12);
                    SpannableStringBuilder spannableStringBuilder11 = new SpannableStringBuilder("x ");
                    u80 u80Var3 = new u80(textView3, AndroidUtilities.dp(90.0f), r12, this.resourcesProvider);
                    int i114 = org.telegram.ui.ActionBar.g6.G6;
                    u80Var3.a(org.telegram.ui.ActionBar.g6.l1(0.21f, org.telegram.ui.ActionBar.g6.v0(i114, this.resourcesProvider)), org.telegram.ui.ActionBar.g6.l1(0.08f, org.telegram.ui.ActionBar.g6.v0(i114, this.resourcesProvider)));
                    spannableStringBuilder11.setSpan(u80Var3, r12, r14, i11);
                    textView3.setText(spannableStringBuilder11, TextView.BufferType.SPANNABLE);
                    if (!this.E0) {
                        this.E0 = r14;
                        int id4 = messageObject2.getId();
                        TLRPC.TL_messages_getMessages tL_messages_getMessages3 = new TLRPC.TL_messages_getMessages();
                        tL_messages_getMessages3.f22474id.add(Integer.valueOf(id4));
                        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getMessages3, new u1(this, id4, r12));
                    }
                } else {
                    yy0Var2.c(LocaleController.getString(R.string.Gift2Quantity), LocaleController.formatPluralStringComma("Gift2QuantityIssued1", tL_starGiftUnique.availability_issued) + LocaleController.formatPluralStringComma("Gift2QuantityIssued2", tL_starGiftUnique.availability_total), null, null);
                }
                if (!TextUtils.isEmpty(tL_starGiftUnique.slug)) {
                    this.f9457d0.e(LocaleController.getString(R.string.GiftValue2), s3.c.e("~", BillingController.getInstance().formatCurrency(tL_starGiftUnique.value_amount, tL_starGiftUnique.value_currency, BillingController.getInstance().getCurrencyExp(tL_starGiftUnique.value_currency), true)), LocaleController.getString(R.string.GiftValue2LearnMore), new androidx.car.app.utils.a(this, tL_starGiftUnique, BillingController.getInstance().formatCurrency(tL_starGiftUnique.value_amount, tL_starGiftUnique.value_currency), 25), null);
                }
            }
            stargiftattributeoriginaldetails = (TL_stars.starGiftAttributeOriginalDetails) u7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeOriginalDetails.class);
            if (stargiftattributeoriginaldetails == null) {
                if ((stargiftattributeoriginaldetails.flags & r14) != 0) {
                    long peerDialogId7 = DialogObject.getPeerDialogId(stargiftattributeoriginaldetails.sender_id);
                    SpannableString spannableString4 = new SpannableString(DialogObject.getName(peerDialogId7));
                    spannableString4.setSpan(new n3(this, peerDialogId7), r12, spannableString4.length(), i11);
                    obj = spannableString4;
                } else {
                    obj = null;
                }
                long peerDialogId8 = DialogObject.getPeerDialogId(stargiftattributeoriginaldetails.recipient_id);
                spannableString = new SpannableString(DialogObject.getName(peerDialogId8));
                spannableString.setSpan(new o3(this, peerDialogId8), r12, spannableString.length(), i11);
                if (stargiftattributeoriginaldetails.message != null) {
                    TextPaint textPaint5 = new TextPaint((int) r14);
                    textPaint5.setTextSize(AndroidUtilities.dp(14.0f));
                    SpannableStringBuilder spannableStringBuilder12 = new SpannableStringBuilder(stargiftattributeoriginaldetails.message.text);
                    MessageObject.addEntitiesToText(spannableStringBuilder12, stargiftattributeoriginaldetails.message.entities, false, false, false, false);
                    objReplaceAnimatedEmoji = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder12, textPaint5.getFontMetricsInt(), r12), stargiftattributeoriginaldetails.message.entities, textPaint5.getFontMetricsInt());
                } else {
                    objReplaceAnimatedEmoji = null;
                }
                objReplaceAll = LocaleController.getInstance().getFormatterYear().format(((long) stargiftattributeoriginaldetails.date) * 1000).replaceAll("\\.", "/");
                if (stargiftattributeoriginaldetails.sender_id == stargiftattributeoriginaldetails.recipient_id) {
                    if (objReplaceAnimatedEmoji == null) {
                        int i115 = R.string.Gift2AttributeOriginalDetailsSelf;
                        Object[] objArr13 = new Object[2];
                        objArr13[r12] = obj;
                        objArr13[1] = objReplaceAll;
                        spannable = LocaleController.formatSpannable(i115, objArr13);
                    } else {
                        int i116 = R.string.Gift2AttributeOriginalDetailsSelfComment;
                        Object[] objArr14 = new Object[3];
                        objArr14[r12] = obj;
                        objArr14[1] = objReplaceAll;
                        objArr14[2] = objReplaceAnimatedEmoji;
                        spannable = LocaleController.formatSpannable(i116, objArr14);
                    }
                } else if (obj != null) {
                    if (objReplaceAnimatedEmoji == null) {
                        int i117 = R.string.Gift2AttributeOriginalDetails;
                        Object[] objArr15 = new Object[3];
                        objArr15[r12] = obj;
                        objArr15[1] = spannableString;
                        objArr15[2] = objReplaceAll;
                        spannable = LocaleController.formatSpannable(i117, objArr15);
                    } else {
                        int i27 = R.string.Gift2AttributeOriginalDetailsComment;
                        Object[] objArr16 = new Object[4];
                        objArr16[r12] = obj;
                        objArr16[1] = spannableString;
                        objArr16[2] = objReplaceAll;
                        objArr16[3] = objReplaceAnimatedEmoji;
                        spannable = LocaleController.formatSpannable(i27, objArr16);
                    }
                } else if (objReplaceAnimatedEmoji == null) {
                    int i28 = R.string.Gift2AttributeOriginalDetailsNoSender;
                    Object[] objArr17 = new Object[2];
                    objArr17[r12] = spannableString;
                    objArr17[1] = objReplaceAll;
                    spannable = LocaleController.formatSpannable(i28, objArr17);
                } else {
                    int i29 = R.string.Gift2AttributeOriginalDetailsNoSenderComment;
                    Object[] objArr18 = new Object[3];
                    objArr18[r12] = spannableString;
                    objArr18[1] = objReplaceAll;
                    objArr18[2] = objReplaceAnimatedEmoji;
                    spannable = LocaleController.formatSpannable(i29, objArr18);
                }
                if (N1(this.currentAccount, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id))) {
                    wy0 wy0VarA6 = yy0Var2.a(spannable);
                    wy0VarA6.setFilled(true);
                    eh.s sVar7 = (eh.s) wy0VarA6.getChildAt(r12);
                    sVar7.setTextSize(1, 12.0f);
                    sVar7.setGravity(17);
                } else {
                    savedStarGift = this.f9485y0;
                    if (savedStarGift != null) {
                        messageObject = this.A0;
                        if (messageObject != null) {
                            messageAction = message.action;
                            if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                            }
                        }
                        wy0 wy0VarA7 = yy0Var2.a(spannable);
                        wy0VarA7.setFilled(true);
                        eh.s sVar8 = (eh.s) wy0VarA7.getChildAt(r12);
                        sVar8.setTextSize(1, 12.0f);
                        sVar8.setGravity(17);
                    } else {
                        messageObject = this.A0;
                        if (messageObject != null) {
                            messageAction = message.action;
                            if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                            }
                        }
                        wy0 wy0VarA8 = yy0Var2.a(spannable);
                        wy0VarA8.setFilled(true);
                        eh.s sVar9 = (eh.s) wy0VarA8.getChildAt(r12);
                        sVar9.setTextSize(1, 12.0f);
                        sVar9.setGravity(17);
                    }
                }
            }
            t4Var = this.I0;
            dVar = this.f9461f0;
            if (t4Var != null) {
                if (N1(this.currentAccount, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id))) {
                }
                if (this.m0) {
                    dVar.setFilled(true);
                    dVar.g(LocaleController.getString(R.string.OK), !this.X0, true);
                    dVar.f(null, !this.X0);
                    dVar.setOnClickListener(new n1(this, 25));
                } else {
                    dVar.setFilled(true);
                    dVar.g(LocaleController.getString(R.string.OK), !this.X0, true);
                    dVar.f(null, !this.X0);
                    dVar.setOnClickListener(new n1(this, 25));
                }
            } else {
                if (N1(this.currentAccount, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id))) {
                }
                if (this.m0) {
                    dVar.setFilled(true);
                    dVar.g(LocaleController.getString(R.string.OK), !this.X0, true);
                    dVar.f(null, !this.X0);
                    dVar.setOnClickListener(new n1(this, 25));
                } else {
                    dVar.setFilled(true);
                    dVar.g(LocaleController.getString(R.string.OK), !this.X0, true);
                    dVar.f(null, !this.X0);
                    dVar.setOnClickListener(new n1(this, 25));
                }
            }
            this.f31853e.setTitle(this.O0);
            t4Var2 = this.I0;
            if (t4Var2 != null) {
                z13 = this.J0;
                v1Var = new v1(this, 23);
                v1Var2 = new v1(this, 20);
                arrayList = t4Var2.f10060f;
                e5Var3 = t4Var2.f10056a;
                tL_starGiftUnique2 = t4Var2.f10065l;
                if (tL_starGiftUnique2 == null) {
                    if (z13) {
                        z14 = false;
                    } else {
                        org.telegram.ui.Components.n9 upgradeImageView4 = e5Var3.getUpgradeImageView();
                        w4Var = e5Var3.f9176c;
                        TL_stars.starGiftAttributeModel upgradeImageViewAttribute4 = e5Var3.getUpgradeImageViewAttribute();
                        TL_stars.starGiftAttributePattern upgradePatternAttribute4 = e5Var3.getUpgradePatternAttribute();
                        TL_stars.starGiftAttributeBackdrop upgradeBackdropAttribute4 = e5Var3.getUpgradeBackdropAttribute();
                        TL_stars.starGiftAttributeModel stargiftattributemodel6 = (TL_stars.starGiftAttributeModel) u7.l(tL_starGiftUnique.attributes, cls);
                        TL_stars.starGiftAttributePattern stargiftattributepattern4 = (TL_stars.starGiftAttributePattern) u7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
                        TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop4 = (TL_stars.starGiftAttributeBackdrop) u7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
                        t4Var2.f10068o = true;
                        t4Var2.f10065l = tL_starGiftUnique;
                        t4Var2.f10071r = v1Var;
                        t4Var2.f10072s = v1Var2;
                        t4Var2.f10073t = (float) Math.random();
                        t4Var2.f10066m = System.currentTimeMillis();
                        t4Var2.f10067n = 0.0f;
                        t4Var2.f10069p = false;
                        t4Var2.f10070q = false;
                        t4Var2.f10068o = true;
                        p4Var = t4Var2.h;
                        if (p4Var != null) {
                            p4Var.a();
                        }
                        r4Var = new r4(w4Var, stargiftattributemodel6);
                        if (w4Var.isAttachedToWindow()) {
                            r4Var.d.onAttachedToWindow();
                        }
                        n4 n4Var13 = new n4(t4Var2, 0);
                        ArrayList arrayList8 = t4Var2.f10059e;
                        r4 r4Var5 = new r4(upgradeImageView4, upgradeImageViewAttribute4);
                        if (t4Var2.f10073t > 0.5f) {
                            i12 = 3;
                        } else {
                            i12 = 2;
                        }
                        t4Var2.h = new p4(n4Var13, arrayList8, r4Var5, r4Var, 0.9f, i12);
                        p4Var2 = t4Var2.f10062i;
                        if (p4Var2 != null) {
                            p4Var2.a();
                        }
                        n4 n4Var14 = new n4(t4Var2, 0);
                        ArrayList arrayList9 = t4Var2.f10061g;
                        s4 s4Var7 = new s4(upgradePatternAttribute4);
                        s4 s4Var8 = new s4(stargiftattributepattern4);
                        if (t4Var2.f10073t > 0.5f) {
                            i13 = 2;
                        } else {
                            i13 = 1;
                        }
                        t4Var2.f10062i = new p4(n4Var14, arrayList9, s4Var7, s4Var8, 1.0f, i13);
                        p4Var3 = t4Var2.f10063j;
                        if (p4Var3 != null) {
                            p4Var3.a();
                        }
                        n4 n4Var15 = new n4(t4Var2, 0);
                        q4 q4Var13 = new q4(upgradeBackdropAttribute4);
                        q4 q4Var14 = new q4(stargiftattributebackdrop4);
                        if (t4Var2.f10073t > 0.5f) {
                            i14 = 2;
                        } else {
                            i14 = 1;
                        }
                        t4Var2.f10063j = new p4(n4Var15, arrayList, q4Var13, q4Var14, 0.5f, i14);
                        p4Var4 = t4Var2.f10064k;
                        if (p4Var4 != null) {
                            p4Var4.a();
                        }
                        n4 n4Var16 = new n4(t4Var2, 0);
                        q4 q4Var15 = new q4(upgradeBackdropAttribute4);
                        q4 q4Var16 = new q4(stargiftattributebackdrop4);
                        if (t4Var2.f10073t > 0.5f) {
                            i15 = 2;
                        } else {
                            i15 = 1;
                        }
                        t4Var2.f10064k = new p4(n4Var16, arrayList, q4Var15, q4Var16, 1.25f, i15);
                        t4Var2.b();
                        z14 = true;
                    }
                } else if (z13) {
                    z14 = false;
                } else {
                    org.telegram.ui.Components.n9 upgradeImageView5 = e5Var3.getUpgradeImageView();
                    w4Var = e5Var3.f9176c;
                    TL_stars.starGiftAttributeModel upgradeImageViewAttribute5 = e5Var3.getUpgradeImageViewAttribute();
                    TL_stars.starGiftAttributePattern upgradePatternAttribute5 = e5Var3.getUpgradePatternAttribute();
                    TL_stars.starGiftAttributeBackdrop upgradeBackdropAttribute5 = e5Var3.getUpgradeBackdropAttribute();
                    TL_stars.starGiftAttributeModel stargiftattributemodel7 = (TL_stars.starGiftAttributeModel) u7.l(tL_starGiftUnique.attributes, cls);
                    TL_stars.starGiftAttributePattern stargiftattributepattern5 = (TL_stars.starGiftAttributePattern) u7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop5 = (TL_stars.starGiftAttributeBackdrop) u7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
                    t4Var2.f10068o = true;
                    t4Var2.f10065l = tL_starGiftUnique;
                    t4Var2.f10071r = v1Var;
                    t4Var2.f10072s = v1Var2;
                    t4Var2.f10073t = (float) Math.random();
                    t4Var2.f10066m = System.currentTimeMillis();
                    t4Var2.f10067n = 0.0f;
                    t4Var2.f10069p = false;
                    t4Var2.f10070q = false;
                    t4Var2.f10068o = true;
                    p4Var = t4Var2.h;
                    if (p4Var != null) {
                        p4Var.a();
                    }
                    r4Var = new r4(w4Var, stargiftattributemodel7);
                    if (w4Var.isAttachedToWindow()) {
                        r4Var.d.onAttachedToWindow();
                    }
                    n4 n4Var17 = new n4(t4Var2, 0);
                    ArrayList arrayList10 = t4Var2.f10059e;
                    r4 r4Var6 = new r4(upgradeImageView5, upgradeImageViewAttribute5);
                    if (t4Var2.f10073t > 0.5f) {
                        i12 = 3;
                    } else {
                        i12 = 2;
                    }
                    t4Var2.h = new p4(n4Var17, arrayList10, r4Var6, r4Var, 0.9f, i12);
                    p4Var2 = t4Var2.f10062i;
                    if (p4Var2 != null) {
                        p4Var2.a();
                    }
                    n4 n4Var18 = new n4(t4Var2, 0);
                    ArrayList arrayList11 = t4Var2.f10061g;
                    s4 s4Var9 = new s4(upgradePatternAttribute5);
                    s4 s4Var10 = new s4(stargiftattributepattern5);
                    if (t4Var2.f10073t > 0.5f) {
                        i13 = 2;
                    } else {
                        i13 = 1;
                    }
                    t4Var2.f10062i = new p4(n4Var18, arrayList11, s4Var9, s4Var10, 1.0f, i13);
                    p4Var3 = t4Var2.f10063j;
                    if (p4Var3 != null) {
                        p4Var3.a();
                    }
                    n4 n4Var19 = new n4(t4Var2, 0);
                    q4 q4Var17 = new q4(upgradeBackdropAttribute5);
                    q4 q4Var18 = new q4(stargiftattributebackdrop5);
                    if (t4Var2.f10073t > 0.5f) {
                        i14 = 2;
                    } else {
                        i14 = 1;
                    }
                    t4Var2.f10063j = new p4(n4Var19, arrayList, q4Var17, q4Var18, 0.5f, i14);
                    p4Var4 = t4Var2.f10064k;
                    if (p4Var4 != null) {
                        p4Var4.a();
                    }
                    n4 n4Var110 = new n4(t4Var2, 0);
                    q4 q4Var19 = new q4(upgradeBackdropAttribute5);
                    q4 q4Var110 = new q4(stargiftattributebackdrop5);
                    if (t4Var2.f10073t > 0.5f) {
                        i15 = 2;
                    } else {
                        i15 = 1;
                    }
                    t4Var2.f10064k = new p4(n4Var110, arrayList, q4Var19, q4Var110, 1.25f, i15);
                    t4Var2.b();
                    z14 = true;
                }
                if (z14) {
                    e5Var2.f9174b.setAlpha(0.0f);
                    e5Var2.f9176c.setAlpha(1.0f);
                    dVar.g(LocaleController.getString(R.string.GiftSkipAnimation), true, true);
                    dVar.setFilled(true);
                    dVar.setOnClickListener(new n1(this, 23));
                    int length5 = ((i5) this.M0.d).L0.length - 1;
                    zk0 zk0Var3 = this.d;
                    zk0Var3.u0(length5);
                    zk0Var3.post(new v1(this, 21));
                }
            }
        }
        charSequenceReplaceTags = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UniqueGiftFrom, DialogObject.getShortName(tLObject)));
        charSequence = charSequenceReplaceTags;
        if (tL_textWithEntities != null) {
            textPaint = e5Var.C;
            textPaint2 = e5Var.C;
            if (textPaint != null) {
                SpannableStringBuilder spannableStringBuilder13 = new SpannableStringBuilder(tL_textWithEntities.text);
                MessageObject.addEntitiesToText(spannableStringBuilder13, tL_textWithEntities.entities, false, false, false, false);
                spannableReplaceAnimatedEmoji = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder13, textPaint2.getFontMetricsInt(), false), tL_textWithEntities.entities, textPaint2.getFontMetricsInt());
            } else {
                spannableReplaceAnimatedEmoji = null;
            }
        } else {
            spannableReplaceAnimatedEmoji = null;
        }
        e5Var2 = e5Var;
        e5Var2.h(0, spannableStringBuilder9, charSequence, e2(tL_starGiftUnique.released_by), null, tLObject, spannableReplaceAnimatedEmoji);
        this.Y0 = null;
        yy0Var = this.f9457d0;
        yy0Var.removeAllViews();
        i10 = 19;
        if (z10) {
            cls = TL_stars.starGiftAttributeModel.class;
            i11 = 33;
            z11 = false;
            r14 = 1;
            r12 = z11;
            yy0Var2 = yy0Var;
        } else if (tL_starGiftUnique.host_id != null) {
            if (!TextUtils.isEmpty(tL_starGiftUnique.owner_address)) {
                yy0Var.m(LocaleController.getString(R.string.Gift2HostAddress), tL_starGiftUnique.owner_address, new v1(this, i10));
            }
            if (peerDialogId2 != 0) {
                this.Y0 = ((vy0) this.f9457d0.l(LocaleController.getString(R.string.Gift2Host), this.currentAccount, peerDialogId2, new w1(this, peerDialogId2, 10)).getChildAt(1)).getChildAt(0);
            }
            cls = TL_stars.starGiftAttributeModel.class;
            i11 = 33;
            z11 = false;
            r14 = 1;
            r12 = z11;
            yy0Var2 = yy0Var;
        } else {
            cls = TL_stars.starGiftAttributeModel.class;
            i11 = 33;
            r12 = 0;
            z11 = false;
            if (!TextUtils.isEmpty(tL_starGiftUnique.owner_address)) {
                yy0Var.m(LocaleController.getString(R.string.Gift2Owner), tL_starGiftUnique.owner_address, new v1(this, 22));
            } else if (j11 != 0) {
                if (j11 != 0) {
                    r14 = 1;
                    yy0Var2 = yy0Var;
                    this.Y0 = ((vy0) this.f9457d0.l(LocaleController.getString(R.string.Gift2Owner), this.currentAccount, j11, new w1(this, j11, 11)).getChildAt(1)).getChildAt(0);
                }
            } else if (j11 != 0) {
                r14 = 1;
                yy0Var2 = yy0Var;
                this.Y0 = ((vy0) this.f9457d0.l(LocaleController.getString(R.string.Gift2Owner), this.currentAccount, j11, new w1(this, j11, 11)).getChildAt(1)).getChildAt(0);
            }
            r14 = 1;
            r12 = z11;
            yy0Var2 = yy0Var;
        }
        p1(u7.l(tL_starGiftUnique.attributes, cls));
        p1(u7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class));
        p1(u7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class));
        if (!z10) {
            if (this.A0 != null) {
                yy0Var2.c(LocaleController.getString(R.string.Gift2Quantity), LocaleController.formatPluralStringComma("Gift2QuantityIssued1", tL_starGiftUnique.availability_issued) + LocaleController.formatPluralStringComma("Gift2QuantityIssued2", tL_starGiftUnique.availability_total), null, null);
            } else if (this.F0) {
                TextView textView4 = (TextView) ((vy0) yy0Var2.c(LocaleController.getString(R.string.Gift2Quantity), "", null, null).getChildAt(r14)).getChildAt(r12);
                SpannableStringBuilder spannableStringBuilder14 = new SpannableStringBuilder("x ");
                u80 u80Var4 = new u80(textView4, AndroidUtilities.dp(90.0f), r12, this.resourcesProvider);
                int i118 = org.telegram.ui.ActionBar.g6.G6;
                u80Var4.a(org.telegram.ui.ActionBar.g6.l1(0.21f, org.telegram.ui.ActionBar.g6.v0(i118, this.resourcesProvider)), org.telegram.ui.ActionBar.g6.l1(0.08f, org.telegram.ui.ActionBar.g6.v0(i118, this.resourcesProvider)));
                spannableStringBuilder14.setSpan(u80Var4, r12, r14, i11);
                textView4.setText(spannableStringBuilder14, TextView.BufferType.SPANNABLE);
                if (!this.E0) {
                    this.E0 = r14;
                    int id5 = messageObject2.getId();
                    TLRPC.TL_messages_getMessages tL_messages_getMessages4 = new TLRPC.TL_messages_getMessages();
                    tL_messages_getMessages4.f22474id.add(Integer.valueOf(id5));
                    ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getMessages4, new u1(this, id5, r12));
                }
            } else {
                yy0Var2.c(LocaleController.getString(R.string.Gift2Quantity), LocaleController.formatPluralStringComma("Gift2QuantityIssued1", tL_starGiftUnique.availability_issued) + LocaleController.formatPluralStringComma("Gift2QuantityIssued2", tL_starGiftUnique.availability_total), null, null);
            }
            if (!TextUtils.isEmpty(tL_starGiftUnique.slug)) {
                this.f9457d0.e(LocaleController.getString(R.string.GiftValue2), s3.c.e("~", BillingController.getInstance().formatCurrency(tL_starGiftUnique.value_amount, tL_starGiftUnique.value_currency, BillingController.getInstance().getCurrencyExp(tL_starGiftUnique.value_currency), true)), LocaleController.getString(R.string.GiftValue2LearnMore), new androidx.car.app.utils.a(this, tL_starGiftUnique, BillingController.getInstance().formatCurrency(tL_starGiftUnique.value_amount, tL_starGiftUnique.value_currency), 25), null);
            }
        }
        stargiftattributeoriginaldetails = (TL_stars.starGiftAttributeOriginalDetails) u7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeOriginalDetails.class);
        if (stargiftattributeoriginaldetails == null) {
            if ((stargiftattributeoriginaldetails.flags & r14) != 0) {
                long peerDialogId9 = DialogObject.getPeerDialogId(stargiftattributeoriginaldetails.sender_id);
                SpannableString spannableString5 = new SpannableString(DialogObject.getName(peerDialogId9));
                spannableString5.setSpan(new n3(this, peerDialogId9), r12, spannableString5.length(), i11);
                obj = spannableString5;
            } else {
                obj = null;
            }
            long peerDialogId10 = DialogObject.getPeerDialogId(stargiftattributeoriginaldetails.recipient_id);
            spannableString = new SpannableString(DialogObject.getName(peerDialogId10));
            spannableString.setSpan(new o3(this, peerDialogId10), r12, spannableString.length(), i11);
            if (stargiftattributeoriginaldetails.message != null) {
                TextPaint textPaint6 = new TextPaint((int) r14);
                textPaint6.setTextSize(AndroidUtilities.dp(14.0f));
                SpannableStringBuilder spannableStringBuilder15 = new SpannableStringBuilder(stargiftattributeoriginaldetails.message.text);
                MessageObject.addEntitiesToText(spannableStringBuilder15, stargiftattributeoriginaldetails.message.entities, false, false, false, false);
                objReplaceAnimatedEmoji = MessageObject.replaceAnimatedEmoji(Emoji.replaceEmoji(spannableStringBuilder15, textPaint6.getFontMetricsInt(), r12), stargiftattributeoriginaldetails.message.entities, textPaint6.getFontMetricsInt());
            } else {
                objReplaceAnimatedEmoji = null;
            }
            objReplaceAll = LocaleController.getInstance().getFormatterYear().format(((long) stargiftattributeoriginaldetails.date) * 1000).replaceAll("\\.", "/");
            if (stargiftattributeoriginaldetails.sender_id == stargiftattributeoriginaldetails.recipient_id) {
                if (objReplaceAnimatedEmoji == null) {
                    int i119 = R.string.Gift2AttributeOriginalDetailsSelf;
                    Object[] objArr19 = new Object[2];
                    objArr19[r12] = obj;
                    objArr19[1] = objReplaceAll;
                    spannable = LocaleController.formatSpannable(i119, objArr19);
                } else {
                    int i1110 = R.string.Gift2AttributeOriginalDetailsSelfComment;
                    Object[] objArr110 = new Object[3];
                    objArr110[r12] = obj;
                    objArr110[1] = objReplaceAll;
                    objArr110[2] = objReplaceAnimatedEmoji;
                    spannable = LocaleController.formatSpannable(i1110, objArr110);
                }
            } else if (obj != null) {
                if (objReplaceAnimatedEmoji == null) {
                    int i1111 = R.string.Gift2AttributeOriginalDetails;
                    Object[] objArr111 = new Object[3];
                    objArr111[r12] = obj;
                    objArr111[1] = spannableString;
                    objArr111[2] = objReplaceAll;
                    spannable = LocaleController.formatSpannable(i1111, objArr111);
                } else {
                    int i210 = R.string.Gift2AttributeOriginalDetailsComment;
                    Object[] objArr112 = new Object[4];
                    objArr112[r12] = obj;
                    objArr112[1] = spannableString;
                    objArr112[2] = objReplaceAll;
                    objArr112[3] = objReplaceAnimatedEmoji;
                    spannable = LocaleController.formatSpannable(i210, objArr112);
                }
            } else if (objReplaceAnimatedEmoji == null) {
                int i211 = R.string.Gift2AttributeOriginalDetailsNoSender;
                Object[] objArr113 = new Object[2];
                objArr113[r12] = spannableString;
                objArr113[1] = objReplaceAll;
                spannable = LocaleController.formatSpannable(i211, objArr113);
            } else {
                int i212 = R.string.Gift2AttributeOriginalDetailsNoSenderComment;
                Object[] objArr114 = new Object[3];
                objArr114[r12] = spannableString;
                objArr114[1] = objReplaceAll;
                objArr114[2] = objReplaceAnimatedEmoji;
                spannable = LocaleController.formatSpannable(i212, objArr114);
            }
            if (N1(this.currentAccount, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id))) {
                wy0 wy0VarA9 = yy0Var2.a(spannable);
                wy0VarA9.setFilled(true);
                eh.s sVar10 = (eh.s) wy0VarA9.getChildAt(r12);
                sVar10.setTextSize(1, 12.0f);
                sVar10.setGravity(17);
            } else {
                savedStarGift = this.f9485y0;
                if (savedStarGift != null) {
                    messageObject = this.A0;
                    if (messageObject != null) {
                        messageAction = message.action;
                        if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                        }
                    }
                    wy0 wy0VarA10 = yy0Var2.a(spannable);
                    wy0VarA10.setFilled(true);
                    eh.s sVar11 = (eh.s) wy0VarA10.getChildAt(r12);
                    sVar11.setTextSize(1, 12.0f);
                    sVar11.setGravity(17);
                } else {
                    messageObject = this.A0;
                    if (messageObject != null) {
                        messageAction = message.action;
                        if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                        }
                    }
                    wy0 wy0VarA11 = yy0Var2.a(spannable);
                    wy0VarA11.setFilled(true);
                    eh.s sVar12 = (eh.s) wy0VarA11.getChildAt(r12);
                    sVar12.setTextSize(1, 12.0f);
                    sVar12.setGravity(17);
                }
            }
        }
        t4Var = this.I0;
        dVar = this.f9461f0;
        if (t4Var != null) {
            if (N1(this.currentAccount, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id))) {
            }
            if (this.m0) {
                dVar.setFilled(true);
                dVar.g(LocaleController.getString(R.string.OK), !this.X0, true);
                dVar.f(null, !this.X0);
                dVar.setOnClickListener(new n1(this, 25));
            } else {
                dVar.setFilled(true);
                dVar.g(LocaleController.getString(R.string.OK), !this.X0, true);
                dVar.f(null, !this.X0);
                dVar.setOnClickListener(new n1(this, 25));
            }
        } else {
            if (N1(this.currentAccount, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id))) {
            }
            if (this.m0) {
                dVar.setFilled(true);
                dVar.g(LocaleController.getString(R.string.OK), !this.X0, true);
                dVar.f(null, !this.X0);
                dVar.setOnClickListener(new n1(this, 25));
            } else {
                dVar.setFilled(true);
                dVar.g(LocaleController.getString(R.string.OK), !this.X0, true);
                dVar.f(null, !this.X0);
                dVar.setOnClickListener(new n1(this, 25));
            }
        }
        this.f31853e.setTitle(this.O0);
        t4Var2 = this.I0;
        if (t4Var2 != null) {
            z13 = this.J0;
            v1Var = new v1(this, 23);
            v1Var2 = new v1(this, 20);
            arrayList = t4Var2.f10060f;
            e5Var3 = t4Var2.f10056a;
            tL_starGiftUnique2 = t4Var2.f10065l;
            if (tL_starGiftUnique2 == null) {
                if (z13) {
                    z14 = false;
                } else {
                    org.telegram.ui.Components.n9 upgradeImageView6 = e5Var3.getUpgradeImageView();
                    w4Var = e5Var3.f9176c;
                    TL_stars.starGiftAttributeModel upgradeImageViewAttribute6 = e5Var3.getUpgradeImageViewAttribute();
                    TL_stars.starGiftAttributePattern upgradePatternAttribute6 = e5Var3.getUpgradePatternAttribute();
                    TL_stars.starGiftAttributeBackdrop upgradeBackdropAttribute6 = e5Var3.getUpgradeBackdropAttribute();
                    TL_stars.starGiftAttributeModel stargiftattributemodel8 = (TL_stars.starGiftAttributeModel) u7.l(tL_starGiftUnique.attributes, cls);
                    TL_stars.starGiftAttributePattern stargiftattributepattern6 = (TL_stars.starGiftAttributePattern) u7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
                    TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop6 = (TL_stars.starGiftAttributeBackdrop) u7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
                    t4Var2.f10068o = true;
                    t4Var2.f10065l = tL_starGiftUnique;
                    t4Var2.f10071r = v1Var;
                    t4Var2.f10072s = v1Var2;
                    t4Var2.f10073t = (float) Math.random();
                    t4Var2.f10066m = System.currentTimeMillis();
                    t4Var2.f10067n = 0.0f;
                    t4Var2.f10069p = false;
                    t4Var2.f10070q = false;
                    t4Var2.f10068o = true;
                    p4Var = t4Var2.h;
                    if (p4Var != null) {
                        p4Var.a();
                    }
                    r4Var = new r4(w4Var, stargiftattributemodel8);
                    if (w4Var.isAttachedToWindow()) {
                        r4Var.d.onAttachedToWindow();
                    }
                    n4 n4Var111 = new n4(t4Var2, 0);
                    ArrayList arrayList12 = t4Var2.f10059e;
                    r4 r4Var7 = new r4(upgradeImageView6, upgradeImageViewAttribute6);
                    if (t4Var2.f10073t > 0.5f) {
                        i12 = 3;
                    } else {
                        i12 = 2;
                    }
                    t4Var2.h = new p4(n4Var111, arrayList12, r4Var7, r4Var, 0.9f, i12);
                    p4Var2 = t4Var2.f10062i;
                    if (p4Var2 != null) {
                        p4Var2.a();
                    }
                    n4 n4Var112 = new n4(t4Var2, 0);
                    ArrayList arrayList13 = t4Var2.f10061g;
                    s4 s4Var11 = new s4(upgradePatternAttribute6);
                    s4 s4Var12 = new s4(stargiftattributepattern6);
                    if (t4Var2.f10073t > 0.5f) {
                        i13 = 2;
                    } else {
                        i13 = 1;
                    }
                    t4Var2.f10062i = new p4(n4Var112, arrayList13, s4Var11, s4Var12, 1.0f, i13);
                    p4Var3 = t4Var2.f10063j;
                    if (p4Var3 != null) {
                        p4Var3.a();
                    }
                    n4 n4Var113 = new n4(t4Var2, 0);
                    q4 q4Var111 = new q4(upgradeBackdropAttribute6);
                    q4 q4Var112 = new q4(stargiftattributebackdrop6);
                    if (t4Var2.f10073t > 0.5f) {
                        i14 = 2;
                    } else {
                        i14 = 1;
                    }
                    t4Var2.f10063j = new p4(n4Var113, arrayList, q4Var111, q4Var112, 0.5f, i14);
                    p4Var4 = t4Var2.f10064k;
                    if (p4Var4 != null) {
                        p4Var4.a();
                    }
                    n4 n4Var114 = new n4(t4Var2, 0);
                    q4 q4Var113 = new q4(upgradeBackdropAttribute6);
                    q4 q4Var114 = new q4(stargiftattributebackdrop6);
                    if (t4Var2.f10073t > 0.5f) {
                        i15 = 2;
                    } else {
                        i15 = 1;
                    }
                    t4Var2.f10064k = new p4(n4Var114, arrayList, q4Var113, q4Var114, 1.25f, i15);
                    t4Var2.b();
                    z14 = true;
                }
            } else if (z13) {
                z14 = false;
            } else {
                org.telegram.ui.Components.n9 upgradeImageView7 = e5Var3.getUpgradeImageView();
                w4Var = e5Var3.f9176c;
                TL_stars.starGiftAttributeModel upgradeImageViewAttribute7 = e5Var3.getUpgradeImageViewAttribute();
                TL_stars.starGiftAttributePattern upgradePatternAttribute7 = e5Var3.getUpgradePatternAttribute();
                TL_stars.starGiftAttributeBackdrop upgradeBackdropAttribute7 = e5Var3.getUpgradeBackdropAttribute();
                TL_stars.starGiftAttributeModel stargiftattributemodel9 = (TL_stars.starGiftAttributeModel) u7.l(tL_starGiftUnique.attributes, cls);
                TL_stars.starGiftAttributePattern stargiftattributepattern7 = (TL_stars.starGiftAttributePattern) u7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributePattern.class);
                TL_stars.starGiftAttributeBackdrop stargiftattributebackdrop7 = (TL_stars.starGiftAttributeBackdrop) u7.l(tL_starGiftUnique.attributes, TL_stars.starGiftAttributeBackdrop.class);
                t4Var2.f10068o = true;
                t4Var2.f10065l = tL_starGiftUnique;
                t4Var2.f10071r = v1Var;
                t4Var2.f10072s = v1Var2;
                t4Var2.f10073t = (float) Math.random();
                t4Var2.f10066m = System.currentTimeMillis();
                t4Var2.f10067n = 0.0f;
                t4Var2.f10069p = false;
                t4Var2.f10070q = false;
                t4Var2.f10068o = true;
                p4Var = t4Var2.h;
                if (p4Var != null) {
                    p4Var.a();
                }
                r4Var = new r4(w4Var, stargiftattributemodel9);
                if (w4Var.isAttachedToWindow()) {
                    r4Var.d.onAttachedToWindow();
                }
                n4 n4Var115 = new n4(t4Var2, 0);
                ArrayList arrayList14 = t4Var2.f10059e;
                r4 r4Var8 = new r4(upgradeImageView7, upgradeImageViewAttribute7);
                if (t4Var2.f10073t > 0.5f) {
                    i12 = 3;
                } else {
                    i12 = 2;
                }
                t4Var2.h = new p4(n4Var115, arrayList14, r4Var8, r4Var, 0.9f, i12);
                p4Var2 = t4Var2.f10062i;
                if (p4Var2 != null) {
                    p4Var2.a();
                }
                n4 n4Var116 = new n4(t4Var2, 0);
                ArrayList arrayList15 = t4Var2.f10061g;
                s4 s4Var13 = new s4(upgradePatternAttribute7);
                s4 s4Var14 = new s4(stargiftattributepattern7);
                if (t4Var2.f10073t > 0.5f) {
                    i13 = 2;
                } else {
                    i13 = 1;
                }
                t4Var2.f10062i = new p4(n4Var116, arrayList15, s4Var13, s4Var14, 1.0f, i13);
                p4Var3 = t4Var2.f10063j;
                if (p4Var3 != null) {
                    p4Var3.a();
                }
                n4 n4Var117 = new n4(t4Var2, 0);
                q4 q4Var115 = new q4(upgradeBackdropAttribute7);
                q4 q4Var116 = new q4(stargiftattributebackdrop7);
                if (t4Var2.f10073t > 0.5f) {
                    i14 = 2;
                } else {
                    i14 = 1;
                }
                t4Var2.f10063j = new p4(n4Var117, arrayList, q4Var115, q4Var116, 0.5f, i14);
                p4Var4 = t4Var2.f10064k;
                if (p4Var4 != null) {
                    p4Var4.a();
                }
                n4 n4Var118 = new n4(t4Var2, 0);
                q4 q4Var117 = new q4(upgradeBackdropAttribute7);
                q4 q4Var118 = new q4(stargiftattributebackdrop7);
                if (t4Var2.f10073t > 0.5f) {
                    i15 = 2;
                } else {
                    i15 = 1;
                }
                t4Var2.f10064k = new p4(n4Var118, arrayList, q4Var117, q4Var118, 1.25f, i15);
                t4Var2.b();
                z14 = true;
            }
            if (z14) {
                e5Var2.f9174b.setAlpha(0.0f);
                e5Var2.f9176c.setAlpha(1.0f);
                dVar.g(LocaleController.getString(R.string.GiftSkipAnimation), true, true);
                dVar.setFilled(true);
                dVar.setOnClickListener(new n1(this, 23));
                int length6 = ((i5) this.M0.d).L0.length - 1;
                zk0 zk0Var4 = this.d;
                zk0Var4.u0(length6);
                zk0Var4.post(new v1(this, 21));
            }
        }
    }

    public final void l2(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        hf.a resellAmount = tL_starGiftUnique.getResellAmount(hf.b.f8921a);
        boolean z10 = tL_starGiftUnique.resale_ton_only;
        lh.d dVar = this.f9461f0;
        if (!z10) {
            dVar.g(oa.Q0(LocaleController.formatPluralStringComma("ResellGiftBuy", (int) resellAmount.a())), !this.X0, true);
            dVar.f(null, !this.X0);
        } else {
            dVar.g(oa.S0(LocaleController.formatString(R.string.ResellGiftBuyTON, tL_starGiftUnique.getResellAmount(hf.b.f8922b).d()), true), !this.X0, true);
            dVar.f(oa.Q0(LocaleController.formatPluralStringComma("ResellGiftBuyEq", (int) resellAmount.a())), !this.X0);
        }
    }

    public final void m2() {
        TL_stars.TL_starGiftUnique tL_starGiftUniqueK1 = K1();
        if (tL_starGiftUniqueK1 == null) {
            return;
        }
        TLRPC.Peer peer = tL_starGiftUniqueK1.owner_id;
        if (peer == null) {
            peer = tL_starGiftUniqueK1.host_id;
        }
        long peerDialogId = DialogObject.getPeerDialogId(peer);
        StringBuilder sb2 = new StringBuilder();
        sb2.append(tL_starGiftUniqueK1.title);
        sb2.append(" #");
        this.f9482v0.setText(LocaleController.formatString(R.string.Gift2WearTitle, i0.a.m(tL_starGiftUniqueK1.num, ',', sb2)));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.Gift2WearStart));
        if (peerDialogId == UserConfig.getInstance(this.currentAccount).getClientUserId() && !UserConfig.getInstance(this.currentAccount).isPremium()) {
            spannableStringBuilder.append((CharSequence) " l");
            if (this.Q0 == null) {
                this.Q0 = new cq(R.drawable.msg_mini_lock3, 0);
            }
            spannableStringBuilder.setSpan(this.Q0, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        lh.d dVar = this.f9461f0;
        dVar.g(spannableStringBuilder, true, true);
        dVar.f(null, true);
        dVar.setOnClickListener(new n1(this, 21));
        this.f9451a0.setWearPreview(MessagesController.getInstance(this.currentAccount).getUserOrChat(peerDialogId));
        q2(2, false, null);
        this.f9480t0 = true;
    }

    public final void n2(CharSequence charSequence) {
        TL_stars.TL_starGiftUnique tL_starGiftUniqueK1 = K1();
        TL_stars.InputSavedStarGift inputSavedStarGiftE1 = E1();
        if (inputSavedStarGiftE1 == null || tL_starGiftUniqueK1 == null) {
            return;
        }
        TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails = new TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails();
        tL_inputInvoiceStarGiftDropOriginalDetails.stargift = inputSavedStarGiftE1;
        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftDropOriginalDetails;
        JSONObject jSONObjectP = nh.b3.p(this.resourcesProvider, false);
        if (jSONObjectP != null) {
            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
            tL_dataJSON.data = jSONObjectP.toString();
            tL_payments_getPaymentForm.flags |= 1;
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getPaymentForm, new gh.f1(this, charSequence, tL_starGiftUniqueK1, tL_inputInvoiceStarGiftDropOriginalDetails, 1));
    }

    public final void o2(View view, CharSequence charSequence, boolean z10) {
        Layout layout;
        float primaryHorizontal;
        lh.w3 w3Var = this.f9472k1;
        if ((w3Var != null && w3Var.R && this.l1 == view) || view == null) {
            return;
        }
        if (!z10) {
            if (view instanceof TextView) {
                layout = ((TextView) view).getLayout();
            } else if (!(view instanceof org.telegram.ui.ActionBar.h5)) {
                return;
            } else {
                layout = ((org.telegram.ui.ActionBar.h5) view).getLayout();
            }
            if (layout == null) {
                return;
            }
            CharSequence text = layout.getText();
            if (!(text instanceof Spanned)) {
                return;
            }
            Spanned spanned = (Spanned) text;
            pc[] pcVarArr = (pc[]) spanned.getSpans(0, spanned.length(), pc.class);
            if (pcVarArr == null || pcVarArr.length <= 0) {
                return;
            }
            pc pcVar = pcVarArr[pcVarArr.length - 1];
            primaryHorizontal = layout.getPrimaryHorizontal(spanned.getSpanStart(pcVar)) + view.getPaddingLeft() + (pcVar.a() / 2.0f);
        } else {
            if (!(view instanceof org.telegram.ui.ActionBar.h5)) {
                return;
            }
            org.telegram.ui.ActionBar.h5 h5Var = (org.telegram.ui.ActionBar.h5) view;
            primaryHorizontal = (h5Var.getRightDrawableWidth() / 2.0f) + h5Var.getRightDrawableX();
        }
        int[] iArr = new int[2];
        int[] iArr2 = new int[2];
        view.getLocationOnScreen(iArr);
        ag.w wVar = this.U;
        wVar.getLocationOnScreen(iArr2);
        iArr[0] = iArr[0] - iArr2[0];
        iArr[1] = iArr[1] - iArr2[1];
        lh.w3 w3Var2 = this.f9472k1;
        if (w3Var2 != null) {
            w3Var2.e(true);
            this.f9472k1 = null;
        }
        lh.w3 w3Var3 = new lh.w3(getContext(), 3);
        w3Var3.q(!z10);
        w3Var3.t(charSequence);
        w3Var3.n(0.0f, (iArr[0] + primaryHorizontal) - (AndroidUtilities.dp(16.0f) + this.backgroundPaddingLeft));
        w3Var3.setTranslationY(((iArr[1] - AndroidUtilities.dp(100.0f)) - (view.getHeight() / 2.0f)) + AndroidUtilities.dp((z10 ? 18 : 0) + 4.33f));
        w3Var3.d = 3000L;
        w3Var3.setPadding(AndroidUtilities.dp(16.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(16.0f) + this.backgroundPaddingLeft, 0);
        w3Var3.f16984h0 = new gh.z(w3Var3, 1);
        w3Var3.v();
        wVar.addView(w3Var3, h7.z5.c(100.0f, -1));
        this.f9472k1 = w3Var3;
        this.l1 = view;
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starUserGiftsLoaded);
    }

    @Override
    public final void onBackPressed() {
        e5 e5Var;
        g4 g4Var;
        if (this.U0.c(4) && (e5Var = this.f9451a0) != null && (g4Var = e5Var.H) != null) {
            if (g4Var.f9307d0) {
                return;
            }
            if (g4Var.f9309e0) {
                super.onBackPressed();
                return;
            }
        }
        if (this.f9480t0 || this.U0.f9526c <= 0 || this.f9461f0.J || this.f9456c1) {
            super.onBackPressed();
            return;
        }
        MessageObject messageObject = this.A0;
        if (messageObject != null) {
            i2(messageObject, null);
        } else {
            TL_stars.SavedStarGift savedStarGift = this.f9485y0;
            if (savedStarGift != null) {
                j2(savedStarGift, this.f9486z0);
            } else {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = this.C0;
                if (tL_starGiftUnique != null) {
                    h2(this.B0, tL_starGiftUnique, this.f9486z0);
                }
            }
        }
        q2(0, true, null);
    }

    @Override
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
    }

    @Override
    public final void onSwipeStarts() {
        lh.w3 w3Var = this.f9472k1;
        if (w3Var != null) {
            w3Var.e(true);
            this.f9472k1 = null;
        }
    }

    public final void p1(TL_stars.StarGiftAttribute starGiftAttribute) {
        String string;
        char c10;
        t4 t4Var;
        TL_stars.StarGiftAttribute starGiftAttribute2;
        i5 i5Var;
        androidx.car.app.utils.b bVar;
        if (starGiftAttribute instanceof TL_stars.starGiftAttributeModel) {
            string = LocaleController.getString(R.string.Gift2AttributeModel);
            c10 = 2;
        } else if (starGiftAttribute instanceof TL_stars.starGiftAttributePattern) {
            string = LocaleController.getString(R.string.Gift2AttributeSymbol);
            c10 = 1;
        } else {
            if (!(starGiftAttribute instanceof TL_stars.starGiftAttributeBackdrop)) {
                return;
            }
            string = LocaleController.getString(R.string.Gift2AttributeBackdrop);
            c10 = 0;
        }
        if (!this.J0 && ((t4Var = this.I0) == null || !t4Var.f10068o)) {
            boolean[] zArr = new boolean[1];
            oc[] ocVarArr = new oc[1];
            Integer[] numArr = new Integer[1];
            String strJ1 = J1(starGiftAttribute.rarity, numArr);
            if (starGiftAttribute.rarity instanceof TL_stars.TL_starGiftAttributeRarity) {
                starGiftAttribute2 = starGiftAttribute;
                bVar = new androidx.car.app.utils.b(this, zArr, starGiftAttribute2, ocVarArr, 5);
                i5Var = this;
            } else {
                starGiftAttribute2 = starGiftAttribute;
                i5Var = this;
                bVar = null;
            }
            ocVarArr[0] = (oc) ((vy0) i5Var.f9457d0.e(string, starGiftAttribute2.name, strJ1, bVar, numArr[0]).getChildAt(1)).getChildAt(0);
            return;
        }
        y4 y4Var = new y4(getContext(), this.resourcesProvider, new q1(this, 0));
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        yy0 yy0Var = this.f9457d0;
        tableRow.addView(new xy0(yy0Var, string), layoutParams);
        tableRow.addView(new vy0(yy0Var, y4Var, true), new TableRow.LayoutParams(0, -1, 1.0f));
        yy0Var.addView(tableRow);
        t4 t4Var2 = this.I0;
        if (t4Var2 != null) {
            if (c10 == 0) {
                t4Var2.d = y4Var;
            }
            if (c10 == 1) {
                t4Var2.f10058c = y4Var;
            }
            if (c10 == 2) {
                t4Var2.f10057b = y4Var;
            }
        }
    }

    public final void p2(int i10, Context context, boolean z10) {
        LinearLayout linearLayoutG = org.telegram.messenger.y1.g(context, 1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackground(org.telegram.ui.ActionBar.g6.K(AndroidUtilities.dp(64.0f), org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.Oh, this.resourcesProvider)));
        linearLayoutG.addView(frameLayout, h7.z5.t(64, 64, 49, 0, 6, 0, 0));
        ri0 ri0Var = new ri0(context);
        ri0Var.setScaleType(ImageView.ScaleType.CENTER);
        ri0Var.f(R.raw.timer_3, 42, 42, null);
        frameLayout.addView(ri0Var, h7.z5.q(64, 64, 17));
        ri0Var.d();
        TextView textViewB = h7.d6.b(context, 20.0f, org.telegram.ui.ActionBar.g6.G6, true, null);
        textViewB.setGravity(17);
        textViewB.setText(LocaleController.getString(z10 ? R.string.Gift2ResellTimeoutTitle : R.string.Gift2TransferTimeoutTitle));
        linearLayoutG.addView(textViewB, h7.z5.t(-1, -2, 48, 24, 14, 24, 0));
        TextView textViewB2 = h7.d6.b(context, 14.0f, org.telegram.ui.ActionBar.g6.F6, false, null);
        textViewB2.setGravity(17);
        textViewB2.setText(LocaleController.formatString(z10 ? R.string.Gift2ResellTimeout : R.string.Gift2TransferTimeout, LocaleController.formatTTLString(Math.max(10, i10))));
        linearLayoutG.addView(textViewB2, h7.z5.t(-1, -2, 48, 24, 6, 24, 6));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, this.resourcesProvider);
        alertDialog$Builder.n(linearLayoutG);
        i0.a.C(R.string.OK, alertDialog$Builder, null);
    }

    public final void q2(int i10, boolean z10, fh.f fVar) {
        int measuredHeight;
        t4 t4Var;
        ValueAnimator valueAnimator = this.V0;
        if (valueAnimator != null) {
            valueAnimator.cancel();
            this.V0 = null;
        }
        e5 e5Var = this.f9451a0;
        if (i10 != 1) {
            AndroidUtilities.cancelRunOnUIThread(e5Var.f9180e0);
        }
        if (!this.X0) {
            this.T0 = Float.valueOf(this.U.d());
        }
        j4 j4Var = this.U0;
        int i11 = 0;
        this.U0 = new j4(j4Var == null ? 0 : j4Var.f9526c, i10);
        ag.i iVar = this.M0;
        int finalHeight = e5Var.getFinalHeight();
        int iZ1 = z1();
        if (this.U0.d(1)) {
            FrameLayout frameLayout = this.f9467i0;
            if (frameLayout.getVisibility() == 0) {
                measuredHeight = frameLayout.getMeasuredHeight();
            } else {
                measuredHeight = 0;
            }
        } else {
            measuredHeight = 0;
        }
        iVar.F(finalHeight, iZ1 + measuredHeight);
        if (this.U0.f9526c == 0 && (t4Var = this.I0) != null) {
            t4Var.c();
        }
        q3 q3Var = this.f9483w0;
        q3 q3Var2 = this.f9481u0;
        q3 q3Var3 = this.f9474n0;
        q3 q3Var4 = this.f9453b0;
        if (z10) {
            q3Var4.setVisibility(this.U0.b(0) ? 0 : 8);
            q3Var3.setVisibility(this.U0.b(1) ? 0 : 8);
            q3Var2.setVisibility(this.U0.b(2) ? 0 : 8);
            q3Var.setVisibility(this.U0.b(3) ? 0 : 8);
            ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
            this.V0 = valueAnimatorOfFloat;
            valueAnimatorOfFloat.addUpdateListener(new ag.u(this, 5));
            this.V0.addListener(new l3(this, i10, fVar, i11));
            this.V0.setInterpolator(er.h);
            this.V0.setDuration(320L);
            this.V0.start();
            j4 j4Var2 = this.U0;
            org.telegram.ui.Components.n9[] n9VarArr = e5Var.d;
            int i12 = j4Var2.f9525b;
            int i13 = j4Var2.f9526c;
            if (i12 != i13) {
                oi0 lottieAnimation = n9VarArr[i12].getImageReceiver().getLottieAnimation();
                oi0 lottieAnimation2 = n9VarArr[i13].getImageReceiver().getLottieAnimation();
                if (lottieAnimation2 != null && lottieAnimation != null) {
                    lottieAnimation2.Q(lottieAnimation.r(), false);
                }
            }
        } else {
            this.U0.f9524a = 1.0f;
            T1();
            q3Var4.setVisibility(i10 == 0 ? 0 : 8);
            q3Var3.setVisibility(i10 == 1 ? 0 : 8);
            q3Var2.setVisibility(i10 == 2 ? 0 : 8);
            q3Var.setVisibility(i10 != 3 ? 8 : 0);
            s2();
            if (fVar != null) {
                fVar.run();
            }
        }
        lh.w3 w3Var = this.f9472k1;
        if (w3Var != null) {
            w3Var.e(true);
            this.f9472k1 = null;
        }
    }

    public final void r1(TL_stars.InputSavedStarGift inputSavedStarGift, TLRPC.Updates updates, Runnable runnable) {
        TLRPC.Message message;
        TL_stars.StarGift starGift;
        if (updates == null) {
            u7.y(this.currentAccount, false).Q(A1());
            dismiss();
            return;
        }
        TLRPC.Update update = updates.update;
        if (!(update instanceof TL_update.TL_updateNewMessage)) {
            if (updates.updates == null) {
                message = null;
                break;
            }
            int i10 = 0;
            while (true) {
                if (i10 >= updates.updates.size()) {
                    message = null;
                    break;
                }
                TLRPC.Update update2 = updates.updates.get(i10);
                if (update2 instanceof TL_update.TL_updateNewMessage) {
                    message = ((TL_update.TL_updateNewMessage) update2).message;
                    break;
                }
                i10++;
            }
        } else {
            message = ((TL_update.TL_updateNewMessage) update).message;
        }
        if (message == null) {
            u7.y(this.currentAccount, false).Q(A1());
            dismiss();
            return;
        }
        TL_stars.SavedStarGift savedStarGift = this.f9485y0;
        if (savedStarGift != null && (!(inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftUser) ? !(!(inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftChat) ? !(inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftSlug) || (starGift = savedStarGift.gift) == null || !TextUtils.equals(starGift.slug, ((TL_stars.TL_inputSavedStarGiftSlug) inputSavedStarGift).slug) : savedStarGift.saved_id != ((TL_stars.TL_inputSavedStarGiftChat) inputSavedStarGift).saved_id) : savedStarGift.msg_id == ((TL_stars.TL_inputSavedStarGiftUser) inputSavedStarGift).msg_id)) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                this.J0 = true;
                TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                TL_stars.SavedStarGift savedStarGift2 = this.f9485y0;
                savedStarGift2.gift = tL_messageActionStarGiftUnique.gift;
                int i11 = savedStarGift2.flags | 8;
                savedStarGift2.msg_id = message.f22401id;
                savedStarGift2.flags = i11 & (-2049);
                savedStarGift2.saved_id = 0L;
                savedStarGift2.unsaved = !tL_messageActionStarGiftUnique.saved;
                savedStarGift2.refunded = tL_messageActionStarGiftUnique.refunded;
                savedStarGift2.can_upgrade = false;
                savedStarGift2.can_resell_at = tL_messageActionStarGiftUnique.can_resell_at;
                savedStarGift2.can_transfer_at = tL_messageActionStarGiftUnique.can_transfer_at;
                savedStarGift2.can_export_at = tL_messageActionStarGiftUnique.can_export_at;
                j2(savedStarGift2, this.f9486z0);
                this.f9458d1 = null;
                this.J0 = false;
                n7 n7Var = this.f9486z0;
                if (n7Var != null) {
                    n7Var.d();
                } else {
                    u7.y(this.currentAccount, false).Q(this.T);
                }
                AndroidUtilities.runOnUIThread(runnable);
                return;
            }
        }
        if (this.f9486z0 == null) {
            u7.y(this.currentAccount, false).Q(A1());
        }
        this.J0 = true;
        this.f9485y0 = null;
        this.f9484x0 = false;
        MessageObject messageObject = new MessageObject(this.currentAccount, message, false, false);
        messageObject.setType();
        i2(messageObject, this.f9486z0);
        this.f9458d1 = null;
        this.J0 = false;
        AndroidUtilities.runOnUIThread(runnable);
    }

    public final void r2(boolean z10) {
        TL_stars.TL_starGiftUnique tL_starGiftUniqueK1 = K1();
        if (tL_starGiftUniqueK1 == null) {
            return;
        }
        MessagesController.getGlobalMainSettings().edit().putInt("statusgiftpage", 3).apply();
        boolean zP1 = P1(this.currentAccount, K1());
        boolean z11 = !zP1;
        boolean zP2 = P1(this.currentAccount, K1());
        lh.d dVar = this.f9461f0;
        if (zP2) {
            MessagesController.getInstance(this.currentAccount).updateEmojiStatus(A1(), new TLRPC.TL_emojiStatusEmpty(), null);
        } else {
            final long jA1 = A1();
            if (jA1 >= 0) {
                if (!UserConfig.getInstance(this.currentAccount).isPremium()) {
                    ec ecVarP = getBulletinFactory().P(R.raw.star_premium_2, AndroidUtilities.premiumText(LocaleController.getString(R.string.Gift2ActionWearNeededPremium), new v1(this, 24)));
                    ecVarP.f28030t = true;
                    ecVarP.j();
                    return;
                }
            } else if (!z10) {
                final MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
                dVar.setLoading(true);
                MessagesController.getInstance(this.currentAccount).getBoostsController().getBoostsStats(jA1, new d5.d() {
                    @Override
                    public final void accept(Object obj) {
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                        i5 i5Var = this.f9521a;
                        if (tL_premium_boostsStatus != null) {
                            int i10 = tL_premium_boostsStatus.level;
                            MessagesController messagesController2 = messagesController;
                            if (i10 < messagesController2.channelEmojiStatusLevelMin) {
                                ChannelBoostsController boostsController = messagesController2.getBoostsController();
                                long j10 = jA1;
                                boostsController.userCanBoostChannel(j10, tL_premium_boostsStatus, new y1(i5Var, tL_premium_boostsStatus, j10, messagesController2, 0));
                                return;
                            }
                        }
                        i5Var.f9461f0.setLoading(false);
                        i5Var.r2(true);
                    }
                });
                return;
            }
            TLRPC.TL_inputEmojiStatusCollectible tL_inputEmojiStatusCollectible = new TLRPC.TL_inputEmojiStatusCollectible();
            tL_inputEmojiStatusCollectible.collectible_id = tL_starGiftUniqueK1.f22607id;
            MessagesController.getInstance(this.currentAccount).updateEmojiStatus(A1(), tL_inputEmojiStatusCollectible, tL_starGiftUniqueK1);
        }
        this.f9451a0.E[1].b(!zP1 ? R.drawable.filled_crown_off : R.drawable.filled_crown_on, LocaleController.getString(!zP1 ? R.string.Gift2ActionWearOff : R.string.Gift2ActionWear), true);
        if (this.f9480t0) {
            dismiss();
            return;
        }
        fh.f fVar = new fh.f(2, this, z11);
        if (this.U0.c(0)) {
            fVar.run();
        } else {
            q2(0, true, fVar);
        }
        dVar.g(LocaleController.getString(R.string.OK), !this.X0, true);
        dVar.f(null, !this.X0);
        dVar.setOnClickListener(new n1(this, 0));
    }

    public final boolean s1() {
        TLRPC.Peer peer;
        if (E1() == null) {
            return false;
        }
        MessageObject messageObject = this.A0;
        if (messageObject != null) {
            TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                return ((!(tL_messageActionStarGift.peer != null) && (!messageObject.isOutOwner() || ((this.A0.getDialogId() > UserConfig.getInstance(this.currentAccount).getClientUserId() ? 1 : (this.A0.getDialogId() == UserConfig.getInstance(this.currentAccount).getClientUserId() ? 0 : -1)) == 0))) || ((peer = tL_messageActionStarGift.peer) != null && O1(this.currentAccount, DialogObject.getPeerDialogId(peer)))) && !tL_messageActionStarGift.converted && tL_messageActionStarGift.convert_stars > 0 && MessagesController.getInstance(this.currentAccount).stargiftsConvertPeriodMax - (ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() - this.A0.messageOwner.date) > 0;
            }
        } else {
            TL_stars.SavedStarGift savedStarGift = this.f9485y0;
            if (savedStarGift != null) {
                int currentTime = MessagesController.getInstance(this.currentAccount).stargiftsConvertPeriodMax - (ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() - savedStarGift.date);
                int i10 = this.currentAccount;
                long j10 = this.T;
                if (O1(i10, j10)) {
                    int i11 = this.f9485y0.flags;
                    if (((j10 < 0 ? 2048 : 8) & i11) != 0 && (i11 & 16) != 0 && (i11 & 2) != 0 && currentTime > 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void s2() {
        FrameLayout frameLayout = this.f9467i0;
        int visibility = frameLayout.getVisibility();
        FrameLayout frameLayout2 = this.f9471k0;
        FrameLayout frameLayout3 = this.f9463g0;
        if (visibility != 0) {
            frameLayout3.setTranslationY(0.0f);
            frameLayout.setTranslationY(0.0f);
            frameLayout2.setTranslationY(0.0f);
        } else {
            frameLayout3.setTranslationY(this.U0.a(1) * (-frameLayout.getMeasuredHeight()));
            frameLayout.setTranslationY((1.0f - this.U0.a(1)) * frameLayout.getMeasuredHeight());
            frameLayout2.setTranslationY(this.U0.a(1) * (-frameLayout.getMeasuredHeight()));
        }
    }

    @Override
    public final void show() {
        MessageObject messageObject;
        TLRPC.Message message;
        if (MessagesController.getInstance(this.currentAccount).isFrozen()) {
            org.telegram.ui.b.b(this.currentAccount);
            return;
        }
        if (this.B0 != null && this.C0 == null) {
            org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(getContext(), 3, null);
            b2Var.q(500L);
            TL_stars.getUniqueStarGift getuniquestargift = new TL_stars.getUniqueStarGift();
            getuniquestargift.slug = this.B0;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(getuniquestargift, new cg.g0(7, this, b2Var));
        } else if (this.f9485y0 == null && (messageObject = this.A0) != null && (message = messageObject.messageOwner) != null) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                if (tL_messageActionStarGift.upgraded) {
                    if (tL_messageActionStarGift.upgrade_msg_id != 0) {
                        org.telegram.ui.ActionBar.b2 b2Var2 = new org.telegram.ui.ActionBar.b2(getContext(), 3, null);
                        b2Var2.q(500L);
                        TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
                        tL_messages_getMessages.f22474id.add(Integer.valueOf(tL_messageActionStarGift.upgrade_msg_id));
                        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getMessages, new cg.y(this, tL_messageActionStarGift, b2Var2, 7));
                        return;
                    }
                    if (E1() != null) {
                        org.telegram.ui.ActionBar.b2 b2Var3 = new org.telegram.ui.ActionBar.b2(getContext(), 3, null);
                        b2Var3.q(500L);
                        u7.y(this.currentAccount, false).M(E1(), new gh.d1(5, this, b2Var3));
                        return;
                    }
                }
            }
        }
        super.show();
    }

    public final boolean t1() {
        int i10;
        TL_stars.TL_starGiftUnique tL_starGiftUniqueK1 = K1();
        if (tL_starGiftUniqueK1 == null || tL_starGiftUniqueK1.crafted || !O1(this.currentAccount, DialogObject.getPeerDialogId(tL_starGiftUniqueK1.owner_id))) {
            return false;
        }
        MessageObject messageObject = this.A0;
        if (messageObject == null) {
            TL_stars.SavedStarGift savedStarGift = this.f9485y0;
            if (savedStarGift != null && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
                i10 = savedStarGift.can_craft_at;
            }
        }
        TLRPC.Message message = messageObject.messageOwner;
        if (message == null) {
            return false;
        }
        TLRPC.MessageAction messageAction = message.action;
        if (!(messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
            return false;
        }
        i10 = ((TLRPC.TL_messageActionStarGiftUnique) messageAction).can_craft_at;
        return i10 > 0 && ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() >= i10;
    }

    public final void t2() {
        boolean zL1 = L1(false);
        p3 p3Var = this.V;
        p3Var.setPosition(zL1 ? 1 : 0);
        p3Var.C(false);
        if (this.f9486z0 == null || L1(true) || this.f9486z0.e() >= this.f9486z0.c()) {
            return;
        }
        this.f9486z0.a();
    }

    public final void u1() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.Gift2CantDoTitle);
        alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.Gift2CantDoText);
        TL_stars.TL_starGiftUnique tL_starGiftUniqueK1 = K1();
        if (tL_starGiftUniqueK1 != null && !TextUtils.isEmpty(tL_starGiftUniqueK1.slug)) {
            alertDialog$Builder.k(LocaleController.getString(R.string.OpenFragment), new d3(this, tL_starGiftUniqueK1, 1));
        }
        i0.a.w(R.string.Cancel, alertDialog$Builder, null);
    }

    public final void v1(final long j10, final Utilities.Callback callback) {
        TLRPC.Message message;
        long peerDialogId;
        long j11;
        TL_stars.InputSavedStarGift inputSavedStarGiftE1 = E1();
        if (inputSavedStarGiftE1 == null) {
            return;
        }
        TL_stars.SavedStarGift savedStarGift = this.f9485y0;
        if (savedStarGift == null || !(savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
            MessageObject messageObject = this.A0;
            if (messageObject == null || (message = messageObject.messageOwner) == null) {
                return;
            }
            TLRPC.MessageAction messageAction = message.action;
            if (!(messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                return;
            }
            TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
            peerDialogId = DialogObject.getPeerDialogId(tL_messageActionStarGiftUnique.gift.owner_id);
            j11 = tL_messageActionStarGiftUnique.transfer_stars;
        } else {
            j11 = savedStarGift.transfer_stars;
            peerDialogId = this.T;
        }
        if (j11 <= 0) {
            TL_stars.transferStarGift transferstargift = new TL_stars.transferStarGift();
            transferstargift.stargift = inputSavedStarGiftE1;
            transferstargift.to_id = MessagesController.getInstance(this.currentAccount).getInputPeer(j10);
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(transferstargift, new d2(this, callback, j10, peerDialogId, 0));
            return;
        }
        final long j12 = peerDialogId;
        u7 u7VarY = u7.y(this.currentAccount, false);
        if (!u7VarY.f10154e) {
            u7VarY.r(new e2(this, u7VarY, j10, callback, 0));
            return;
        }
        final TLRPC.TL_inputInvoiceStarGiftTransfer tL_inputInvoiceStarGiftTransfer = new TLRPC.TL_inputInvoiceStarGiftTransfer();
        tL_inputInvoiceStarGiftTransfer.stargift = inputSavedStarGiftE1;
        tL_inputInvoiceStarGiftTransfer.to_id = MessagesController.getInstance(this.currentAccount).getInputPeer(j10);
        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftTransfer;
        JSONObject jSONObjectP = nh.b3.p(this.resourcesProvider, false);
        if (jSONObjectP != null) {
            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
            tL_dataJSON.data = jSONObjectP.toString();
            tL_payments_getPaymentForm.flags |= 1;
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getPaymentForm, new RequestDelegate() {
            @Override
            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                final i5 i5Var = this.f9242a;
                final TLRPC.TL_inputInvoiceStarGiftTransfer tL_inputInvoiceStarGiftTransfer2 = tL_inputInvoiceStarGiftTransfer;
                final long j13 = j10;
                final long j14 = j12;
                final Utilities.Callback callback2 = callback;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        i5.G0(i5Var, tLObject, tL_inputInvoiceStarGiftTransfer2, j13, j14, callback2, tL_error);
                    }
                });
            }
        });
    }

    @Override
    public final yk0 w(zk0 zk0Var) {
        ag.i iVar = new ag.i(this, 1);
        this.M0 = iVar;
        return iVar;
    }

    public final void w1() {
        TL_stars.InputSavedStarGift inputSavedStarGiftE1;
        long j10;
        lh.d dVar = this.f9461f0;
        if (dVar.J || (inputSavedStarGiftE1 = E1()) == null) {
            return;
        }
        MessageObject messageObject = this.A0;
        String str = null;
        long j11 = 0;
        if (messageObject != null) {
            TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
            if (!(messageAction instanceof TLRPC.TL_messageActionStarGift)) {
                return;
            }
            TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
            j10 = tL_messageActionStarGift.upgrade_stars;
            if (j10 <= 0) {
                str = tL_messageActionStarGift.prepaid_upgrade_hash;
            }
        } else {
            TL_stars.SavedStarGift savedStarGift = this.f9485y0;
            if (savedStarGift == null) {
                return;
            }
            j10 = savedStarGift.upgrade_stars;
            if (j10 <= 0) {
                str = savedStarGift.prepaid_upgrade_hash;
            }
        }
        if (j10 > 0 || this.f9466h1 != null) {
            dVar.setLoading(true);
            bp bpVar = this.f9478r0;
            if (j10 > 0) {
                TL_stars.upgradeStarGift upgradestargift = new TL_stars.upgradeStarGift();
                upgradestargift.keep_original_details = bpVar.f27188a.f26309q;
                upgradestargift.stargift = inputSavedStarGiftE1;
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(upgradestargift, new cg.g0(6, this, inputSavedStarGiftE1));
                return;
            }
            int i10 = 0;
            u7 u7VarY = u7.y(this.currentAccount, false);
            if (!u7VarY.f10154e) {
                u7VarY.r(new d5.u(21, this, u7VarY));
                return;
            }
            TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
            tL_payments_sendStarsForm.form_id = this.f9466h1.form_id;
            if (TextUtils.isEmpty(str)) {
                TLRPC.TL_inputInvoiceStarGiftUpgrade tL_inputInvoiceStarGiftUpgrade = new TLRPC.TL_inputInvoiceStarGiftUpgrade();
                tL_inputInvoiceStarGiftUpgrade.keep_original_details = bpVar.f27188a.f26309q;
                tL_inputInvoiceStarGiftUpgrade.stargift = inputSavedStarGiftE1;
                tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftUpgrade;
            } else {
                TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade tL_inputInvoiceStarGiftPrepaidUpgrade = new TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade();
                tL_inputInvoiceStarGiftPrepaidUpgrade.hash = str;
                tL_inputInvoiceStarGiftPrepaidUpgrade.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.T);
                tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftPrepaidUpgrade;
            }
            ArrayList<TLRPC.TL_labeledPrice> arrayList = this.f9466h1.invoice.prices;
            int size = arrayList.size();
            while (i10 < size) {
                TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i10);
                i10++;
                j11 += tL_labeledPrice.amount;
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_sendStarsForm, new w(this, str, inputSavedStarGiftE1, j11, 1));
        }
    }

    @Override
    public final int y() {
        return AndroidUtilities.dp(12.0f);
    }

    @Override
    public final CharSequence z() {
        return this.O0;
    }

    public final int z1() {
        if (this.U0.d(1)) {
            return this.f9474n0.getMeasuredHeight();
        }
        if (this.U0.d(2)) {
            return this.f9481u0.getMeasuredHeight();
        }
        if (this.U0.d(3)) {
            return this.f9483w0.getMeasuredHeight();
        }
        if (this.U0.d(4)) {
            return 0;
        }
        return this.f9453b0.getMeasuredHeight();
    }
}
