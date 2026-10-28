package bi;

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
import org.telegram.ui.Components.aa0;
import org.telegram.ui.Components.aq;
import org.telegram.ui.Components.b10;
import org.telegram.ui.Components.fa0;
import org.telegram.ui.Components.kb1;
import org.telegram.ui.Components.mm0;
import org.telegram.ui.Components.nm0;
import org.telegram.ui.Components.u01;
import org.telegram.ui.Components.v01;
import org.telegram.ui.Components.w01;
import org.telegram.ui.Components.x01;
import org.telegram.ui.Components.z00;
import org.telegram.ui.Components.zq;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.ey;
import org.telegram.ui.fx;
import org.telegram.ui.w90;
import org.telegram.ui.wn;
import org.telegram.ui.y91;
import org.telegram.ui.yc1;
public class h7 extends org.telegram.ui.Components.bb implements NotificationCenter.NotificationCenterDelegate {
    public static final int A1 = 0;
    public boolean A0;
    public final f5 B0;
    public final TextView C0;
    public final f5 D0;
    public boolean E0;
    public TL_stars.SavedStarGift F0;
    public u9 G0;
    public MessageObject H0;
    public String I0;
    public TL_stars.TL_starGiftUnique J0;
    public boolean K0;
    public boolean L0;
    public boolean M0;
    public boolean N0;
    public boolean O0;
    public o6 P0;
    public boolean Q0;
    public i5 R0;
    public final int[] S0;
    public h5 T0;
    public int U0;
    public String V0;
    public zh.f4 W0;
    public final long X;
    public zq X0;
    public final j5 Y;
    public boolean Y0;
    public final d5 Z;
    public w4 Z0;
    public final z00 f4727a0;
    public Float f4728a1;
    public final View f4729b0;
    public c6 f4730b1;
    public zh.l2 f4731c0;
    public ValueAnimator f4732c1;
    public zh.l2 f4733d0;
    public zq f4734d1;
    public final g5 f4735e0;
    public boolean f4736e1;
    public final b7 f4737f0;
    public TL_wallet.nftItem f4738f1;
    public final f5 f4739g0;
    public org.telegram.ui.Wallet.s4 f4740g1;
    public final aa0 f4741h0;
    public org.telegram.ui.Wallet.t4 f4742h1;
    public final x01 f4743i0;
    public TL_wallet.walletTransaction f4744i1;
    public final aa0 f4745j0;
    public View f4746j1;
    public final fi.d f4747k0;
    public zh.b2 f4748k1;
    public final FrameLayout f4749l0;
    public boolean l1;
    public final aa0 m0;
    public Boolean f4750m1;
    public final FrameLayout f4751n0;
    public boolean f4752n1;
    public final View f4753o0;
    public ArrayList f4754o1;
    public final FrameLayout f4755p0;
    public ArrayList f4756p1;
    public d7 f4757q0;
    public ArrayList f4758q1;
    public boolean f4759r0;
    public boolean f4760r1;
    public final f5 f4761s0;
    public TLRPC.PaymentForm f4762s1;
    public final hi.j[] f4763t0;
    public final zq[] f4764t1;
    public final View f4765u0;
    public final a2 f4766u1;
    public final LinearLayout f4767v0;
    public int f4768v1;
    public final aq f4769w0;
    public Boolean f4770w1;
    public final TextView f4771x0;
    public boolean f4772x1;
    public final LinearLayout f4773y0;
    public fi.v3 f4774y1;
    public final aq f4775z0;
    public View f4776z1;

    public h7(Context context, int i10, long j10, org.telegram.ui.ActionBar.u6 u6Var, View view) {
        super(context, null, false, false, u6Var);
        this.f4759r0 = false;
        this.S0 = new int[2];
        this.U0 = -1;
        this.V0 = "";
        this.f4730b1 = new c6(0, 0);
        this.f4736e1 = true;
        this.f4764t1 = new zq[1];
        this.f4766u1 = new a2(this, 11);
        this.f4772x1 = true;
        this.currentAccount = i10;
        this.X = j10;
        this.v = Math.max(0.05f, AndroidUtilities.dp(82.0f) / (AndroidUtilities.displaySize.y + AndroidUtilities.statusBarHeight));
        this.occupyNavigationBar = true;
        this.containerView = new bh.r(this, context, 1);
        j5 j5Var = new j5(this, context);
        this.Y = j5Var;
        d5 d5Var = new d5(this, context);
        this.Z = d5Var;
        d5Var.setAdapter(new e5(this, context, 0));
        X2();
        View view2 = new View(context);
        this.f4729b0 = view2;
        int i11 = org.telegram.ui.ActionBar.y6.f23428h5;
        org.telegram.ui.ActionBar.f7.i(i11, view2, u6Var);
        FrameLayout.LayoutParams i12 = kb1.i(-1, 50, 80);
        int i13 = this.backgroundPaddingLeft;
        i12.rightMargin = i13;
        i12.leftMargin = i13;
        this.containerView.addView(view2, i12);
        this.containerView.addView(d5Var, kb1.i(-1, -1, 119));
        fixNavigationBarKey(i11);
        AndroidUtilities.removeFromParent(this.d);
        j5Var.addView(this.d, kb1.i(-1, -1, 119));
        f5 f5Var = new f5(this, context, 0);
        this.f4739g0 = f5Var;
        f5Var.setOrientation(1);
        f5Var.setPadding(AndroidUtilities.dp(14.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(14.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(68.0f));
        j5Var.addView(f5Var, kb1.i(-1, -1, 55));
        aa0 aa0Var = new aa0(context, u6Var);
        this.f4741h0 = aa0Var;
        int i14 = org.telegram.ui.ActionBar.y6.q5;
        org.telegram.ui.ActionBar.f7.V(aa0Var, i14, u6Var);
        aa0Var.setTextSize(1, 12.0f);
        aa0Var.setGravity(17);
        aa0Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        org.telegram.ui.ActionBar.f7.H(aa0Var, org.telegram.ui.ActionBar.y6.gc, u6Var);
        aa0Var.setDisablePaddingsOffsetY(true);
        f5Var.addView(aa0Var, kb1.x(-2, -2, 1, 4, -2, 4, 16));
        aa0Var.setVisibility(8);
        x01 x01Var = new x01(context, u6Var);
        this.f4743i0 = x01Var;
        f5Var.addView(x01Var, kb1.o(0.0f, 0.0f, 0.0f, 12.0f, -1, -2));
        aa0 aa0Var2 = new aa0(context, u6Var);
        this.f4745j0 = aa0Var2;
        org.telegram.ui.ActionBar.f7.V(aa0Var2, i14, u6Var);
        aa0Var2.setTextSize(1, 12.0f);
        aa0Var2.setGravity(17);
        aa0Var2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        int i15 = org.telegram.ui.ActionBar.y6.Oh;
        org.telegram.ui.ActionBar.f7.H(aa0Var2, i15, u6Var);
        aa0Var2.setDisablePaddingsOffsetY(true);
        aa0Var2.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), 0);
        f5Var.addView(aa0Var2, kb1.x(-2, -2, 1, 4, 2, 4, 8));
        aa0Var2.setVisibility(8);
        LinearLayout linearLayout = new LinearLayout(context);
        this.f4773y0 = linearLayout;
        linearLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        linearLayout.setOrientation(0);
        int i16 = org.telegram.ui.ActionBar.y6.f23449i6;
        org.telegram.ui.Cells.y Z = org.telegram.ui.ActionBar.y6.Z(org.telegram.ui.ActionBar.y6.w0(i16, u6Var), 21, 21);
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i16);
        linearLayout.setBackground(Z);
        org.telegram.ui.ActionBar.f7.k(linearLayout, Z, null, N, u6Var);
        aq aqVar = new aq(context, 24, u6Var);
        this.f4775z0 = aqVar;
        int i17 = org.telegram.ui.ActionBar.y6.f23430h7;
        int i18 = org.telegram.ui.ActionBar.y6.f23467j7;
        int i19 = org.telegram.ui.ActionBar.y6.f23486k7;
        aqVar.b(i17, i18, i19);
        aqVar.setDrawUnchecked(true);
        aqVar.a(false, false);
        aqVar.setDrawBackgroundAsArc(10);
        linearLayout.addView(aqVar, kb1.x(26, 26, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        int i20 = org.telegram.ui.ActionBar.y6.f23465j5;
        org.telegram.ui.ActionBar.f7.V(textView, i20, u6Var);
        textView.setTextSize(1, 14.0f);
        textView.setText(LocaleController.getString(R.string.Gift2AlsoShowInMyGifts));
        linearLayout.addView(textView, kb1.x(-2, -2, 16, 9, 0, 0, 0));
        f5Var.addView(linearLayout, kb1.x(-2, -2, 1, 0, -4, 0, 4));
        kb1.c(linearLayout, 0.025f, 1.5f);
        linearLayout.setOnClickListener(new z1(this, 19));
        linearLayout.setVisibility(8);
        f5 f5Var2 = new f5(this, context, 1);
        this.f4761s0 = f5Var2;
        f5Var2.setOrientation(1);
        f5Var2.setPadding(AndroidUtilities.dp(4.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(4.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(66.0f));
        j5Var.addView(f5Var2, kb1.i(-1, -1, 55));
        this.f4763t0 = r8;
        hi.j jVar = new hi.j(context, u6Var, false);
        jVar.a(LocaleController.getString(R.string.Gift2UpgradeFeature1Title), LocaleController.getString(R.string.GiftsFeature1Text), R.drawable.menu_feature_unique);
        f5Var2.addView(r8[0], kb1.r(-1, -2));
        hi.j jVar2 = new hi.j(context, u6Var, false);
        jVar2.a(LocaleController.getString(R.string.Gift2UpgradeFeature3Title), LocaleController.getString(R.string.GiftsFeature2Text), R.drawable.menu_feature_tradable);
        f5Var2.addView(r8[1], kb1.r(-1, -2));
        hi.j jVar3 = new hi.j(context, u6Var, false);
        hi.j[] jVarArr = {jVar, jVar2, jVar3};
        jVar3.a(LocaleController.getString(R.string.GiftsFeature3Title), LocaleController.getString(R.string.GiftsFeature3Text), R.drawable.menu_wear);
        f5Var2.addView(jVarArr[2], kb1.r(-1, -2));
        View view3 = new View(context);
        this.f4765u0 = view3;
        int i21 = org.telegram.ui.ActionBar.y6.f23358d7;
        org.telegram.ui.ActionBar.f7.i(i21, view3, u6Var);
        f5Var2.addView(view3, kb1.w(-2, 7, 17, -4, 17, 1.0f / AndroidUtilities.density, 6));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f4767v0 = linearLayout2;
        linearLayout2.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        linearLayout2.setOrientation(0);
        org.telegram.ui.Cells.y Z2 = org.telegram.ui.ActionBar.y6.Z(org.telegram.ui.ActionBar.y6.w0(i16, u6Var), 6, 6);
        org.telegram.ui.ActionBar.b7 N2 = org.telegram.ui.ActionBar.f7.N(i16);
        linearLayout2.setBackground(Z2);
        org.telegram.ui.ActionBar.f7.k(linearLayout2, Z2, null, N2, u6Var);
        aq aqVar2 = new aq(context, 24, u6Var);
        this.f4769w0 = aqVar2;
        aqVar2.b(i17, i18, i19);
        aqVar2.setDrawUnchecked(true);
        aqVar2.a(false, false);
        aqVar2.setDrawBackgroundAsArc(10);
        linearLayout2.addView(aqVar2, kb1.x(26, 26, 16, 0, 0, 0, 0));
        TextView textView2 = new TextView(context);
        this.f4771x0 = textView2;
        org.telegram.ui.ActionBar.f7.V(textView2, i20, u6Var);
        textView2.setTextSize(1, 14.0f);
        textView2.setText(LocaleController.getString(R.string.Gift2AddSenderName));
        linearLayout2.addView(textView2, kb1.x(-2, -2, 16, 9, 0, 0, 0));
        f5Var2.addView(linearLayout2, kb1.x(-2, -2, 1, 0, 0, 0, 4));
        kb1.c(linearLayout2, 0.025f, 1.5f);
        f5 f5Var3 = new f5(this, context, 2);
        this.B0 = f5Var3;
        f5Var3.setOrientation(1);
        f5Var3.setPadding(AndroidUtilities.dp(4.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(4.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(66.0f));
        j5Var.addView(f5Var3, kb1.i(-1, -1, 55));
        TextView textView3 = new TextView(context);
        this.C0 = textView3;
        org.telegram.ui.ActionBar.f7.V(textView3, i20, u6Var);
        textView3.setTextSize(1, 20.0f);
        textView3.setGravity(17);
        textView3.setTypeface(AndroidUtilities.bold());
        f5Var3.addView(textView3, kb1.x(-1, -2, 7, 20, 0, 20, 0));
        TextView textView4 = new TextView(context);
        org.telegram.ui.ActionBar.f7.V(textView4, i20, u6Var);
        textView4.setTextSize(1, 14.0f);
        textView4.setGravity(17);
        textView4.setText(LocaleController.getString(R.string.Gift2WearSubtitle));
        f5Var3.addView(textView4, kb1.x(-1, -2, 7, 20, 6, 20, 24));
        hi.j jVar4 = new hi.j(context, u6Var, false);
        jVar4.a(LocaleController.getString(R.string.Gift2WearFeature1Title), LocaleController.getString(R.string.Gift2WearFeature1Text), R.drawable.menu_feature_unique);
        f5Var3.addView(r11[0], kb1.r(-1, -2));
        hi.j jVar5 = new hi.j(context, u6Var, false);
        jVar5.a(LocaleController.getString(R.string.Gift2WearFeature2Title), LocaleController.getString(R.string.Gift2WearFeature2Text), R.drawable.menu_feature_cover);
        f5Var3.addView(r11[1], kb1.r(-1, -2));
        hi.j jVar6 = new hi.j(context, u6Var, false);
        hi.j[] jVarArr2 = {jVar4, jVar5, jVar6};
        jVar6.a(LocaleController.getString(R.string.Gift2WearFeature3Title), LocaleController.getString(R.string.Gift2WearFeature3Text), R.drawable.menu_verification);
        f5Var3.addView(jVarArr2[2], kb1.r(-1, -2));
        f5 f5Var4 = new f5(this, context, 3);
        this.D0 = f5Var4;
        f5Var4.setOrientation(1);
        f5Var4.setPadding(AndroidUtilities.dp(4.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(92.0f));
        j5Var.addView(f5Var4, kb1.i(-1, -1, 55));
        hi.j jVar7 = new hi.j(context, u6Var, false);
        jVar7.a(LocaleController.getString(R.string.GiftCraftInfoFeature1Title), LocaleController.getString(R.string.GiftCraftInfoFeature1Text), R.drawable.menu_feature_unique);
        f5Var4.addView(r8[0], kb1.r(-1, -2));
        hi.j jVar8 = new hi.j(context, u6Var, false);
        jVar8.a(LocaleController.getString(R.string.GiftCraftInfoFeature2Title), LocaleController.getString(R.string.GiftCraftInfoFeature2Text), R.drawable.menu_random);
        f5Var4.addView(r8[1], kb1.r(-1, -2));
        hi.j jVar9 = new hi.j(context, u6Var, false);
        hi.j[] jVarArr3 = {jVar7, jVar8, jVar9};
        jVar9.a(LocaleController.getString(R.string.GiftCraftInfoFeature3Title), LocaleController.getString(R.string.GiftCraftInfoFeature3Text), R.drawable.menu_feature_affect);
        f5Var4.addView(jVarArr3[2], kb1.r(-1, -2));
        f5Var.setAlpha(1.0f);
        f5Var2.setAlpha(0.0f);
        f5Var3.setAlpha(0.0f);
        f5Var4.setAlpha(0.0f);
        b7 b7Var = new b7(context, u6Var, new a2(this, 12), new z1(this, 20), new z1(this, 21), new z1(this, 22), new z1(this, 23), new z1(this, 24), new z1(this, 25), new z1(this, 26));
        this.f4737f0 = b7Var;
        b7Var.M.f5832c.setOnClickListener(new z1(this, 17));
        int i22 = this.backgroundPaddingLeft;
        b7Var.setPadding(i22, 0, i22, 0);
        j5Var.addView(b7Var, kb1.i(-1, -2, 55));
        ig.a0 a0Var = this.f26791c;
        this.P = true;
        a0Var.l1(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f4749l0 = frameLayout;
        org.telegram.ui.ActionBar.f7.i(i11, frameLayout, u6Var);
        View view4 = new View(context);
        this.f4753o0 = view4;
        org.telegram.ui.ActionBar.f7.i(i21, view4, u6Var);
        view4.setAlpha(0.0f);
        frameLayout.addView(view4, kb1.e(-1.0f, 1.0f / AndroidUtilities.density, 55));
        fi.d f7 = wh.f(24, context, u6Var, true);
        this.f4747k0 = f7;
        f7.i(LocaleController.getString(R.string.OK), false, true);
        f7.g(null, false);
        FrameLayout.LayoutParams h = kb1.h(-1, 48.0f, 119, 0.0f, 12.0f, 0.0f, 12.0f);
        h.leftMargin = AndroidUtilities.dp(14.0f) + this.backgroundPaddingLeft;
        h.rightMargin = AndroidUtilities.dp(14.0f) + this.backgroundPaddingLeft;
        frameLayout.addView(f7, h);
        j5Var.addView(frameLayout, kb1.i(-1, 72, 87));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f4751n0 = frameLayout2;
        org.telegram.ui.ActionBar.f7.i(i11, frameLayout2, u6Var);
        aa0 aa0Var3 = new aa0(context, null);
        this.m0 = aa0Var3;
        aa0Var3.setTextSize(1, 12.0f);
        org.telegram.ui.ActionBar.f7.V(aa0Var3, i15, u6Var);
        org.telegram.ui.ActionBar.f7.H(aa0Var3, i15, u6Var);
        aa0Var3.setGravity(17);
        frameLayout2.addView(aa0Var3, kb1.h(-1, -2.0f, 17, 16.0f, 8.0f, 16.0f, 14.0f));
        j5Var.addView(frameLayout2, kb1.i(-1, -2, 87));
        frameLayout2.setVisibility(8);
        this.d.setOnScrollListener(new ai.b(this, 5));
        linearLayout2.setOnClickListener(new z1(this, 18));
        z00 z00Var = new z00(context);
        this.f4727a0 = z00Var;
        j5Var.addView(z00Var, kb1.g(-1.0f, -1));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f4755p0 = frameLayout3;
        frameLayout3.setPadding(AndroidUtilities.dp(6.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(6.0f) + this.backgroundPaddingLeft, 0);
        j5Var.addView(frameLayout3, kb1.h(-1, 200.0f, 87, 0.0f, 0.0f, 0.0f, 60.0f));
        AndroidUtilities.removeFromParent(this.e);
        j5Var.addView(this.e, kb1.h(-1, -2.0f, 0, 6.0f, 0.0f, 6.0f, 0.0f));
        g5 g5Var = new g5(context);
        this.f4735e0 = g5Var;
        j5Var.addView(g5Var, kb1.i(-1, -2, 55));
        ArrayList arrayList = new ArrayList();
        if (view != null) {
            arrayList.add(view);
        }
        AndroidUtilities.makeGlobalBlurBitmap(new ai.i(g5Var, 6), 12.0f, 12, null, arrayList);
    }

    public static void A0(h7 h7Var, org.telegram.ui.ActionBar.e2 e2Var, TL_stars.SavedStarGift savedStarGift) {
        if (savedStarGift != null) {
            e2Var.dismiss();
            h7Var.O0 = true;
            h7Var.L2(savedStarGift, null);
            super.show();
            return;
        }
        e2Var.dismiss();
        org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
        if (U != null) {
            org.telegram.ui.Components.qc R = org.telegram.ui.Components.wc.b0(U).R(R.raw.error, 36, LocaleController.getString(R.string.MessageNotFound));
            R.f31872u = true;
            R.j();
        }
    }

    public static void B0(bi.h7 r17) {
        throw new UnsupportedOperationException("Method not decompiled: bi.h7.B0(bi.h7):void");
    }

    public static void C0(h7 h7Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        h7Var.f4760r1 = false;
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            MessagesController.getInstance(h7Var.currentAccount).putUsers(paymentForm.users, false);
            h7Var.f4762s1 = paymentForm;
            h7Var.A2();
            return;
        }
        org.telegram.ui.Components.qc Z = h7Var.getBulletinFactory().Z(tL_error);
        Z.f31872u = true;
        Z.j();
    }

    public static void D0(h7 h7Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, bg.a aVar, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(h7Var.currentAccount).lambda$processUpdates$379((TLRPC.Updates) tLObject, false);
            AndroidUtilities.runOnUIThread(new f3(h7Var, tL_starGiftUnique, aVar, runnable, 1));
            return;
        }
        h7Var.getClass();
        if (tL_error != null && tL_error.text.startsWith("STARGIFT_RESELL_TOO_EARLY_")) {
            AndroidUtilities.runOnUIThread(new a3.i0(h7Var, Long.parseLong(tL_error.text.substring(26)), runnable, 2));
        } else if (tL_error != null) {
            AndroidUtilities.runOnUIThread(new g3(h7Var, tL_error, runnable, 1));
        }
    }

    public static void D2(org.telegram.ui.ActionBar.r2 r2Var) {
        org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
        if (U == 0) {
            return;
        }
        ?? obj = new Object();
        obj.f22929a = true;
        U.showAsSheet(r2Var, obj);
    }

    public static void E0(h7 h7Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z10, zh.i0 i0Var, d6 d6Var, qf.c cVar) {
        cVar.d();
        ca.x(h7Var.currentAccount, d6Var.f4492a).h(d6Var.f4493b, tL_starGiftUnique, j10, tL_textWithEntities, z10, new w3(h7Var, cVar, tL_starGiftUnique, j10, i0Var, 0));
    }

    public static void F0(long j10, long j11, h7 h7Var, Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(h7Var.currentAccount).lambda$processUpdates$379((TLRPC.Updates) tLObject, false);
        }
        AndroidUtilities.runOnUIThread(new j3(j10, j11, h7Var, callback, tLObject, tL_error));
    }

    public static void G0(h7 h7Var, final zh.i0 i0Var, bg.b bVar, final TL_stars.TL_starGiftUnique tL_starGiftUnique, final long j10, final TLRPC.TL_textWithEntities tL_textWithEntities, final boolean z10, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        h7Var.f4747k0.setLoading(false);
        if (i0Var != null && i0Var.L) {
            i0Var.L = false;
            i0Var.H.h(false);
        }
        if (tL_payments_paymentFormStarGift == null) {
            return;
        }
        new g6(h7Var.getContext(), h7Var.resourcesProvider, tL_starGiftUnique, new d6(bVar, tL_payments_paymentFormStarGift), h7Var.currentAccount, j10, h7Var.W1(), false, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                h7.E0(h7.this, tL_starGiftUnique, j10, tL_textWithEntities, z10, i0Var, (d6) obj, (qf.c) obj2);
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
            spannableStringBuilder.setSpan(new a5(0), indexOf, i10 + indexOf, 0);
        }
        return spannableStringBuilder;
    }

    public static void H0(h7 h7Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, bg.a aVar, Runnable runnable) {
        h7Var.getClass();
        TL_stars.StarsAmount o10 = aVar.o();
        TL_stars.updateStarGiftPrice updatestargiftprice = new TL_stars.updateStarGiftPrice();
        updatestargiftprice.stargift = h7Var.Y1();
        updatestargiftprice.resell_amount = o10;
        ConnectionsManager.getInstance(h7Var.currentAccount).sendRequest(updatestargiftprice, new q2(h7Var, tL_starGiftUnique, aVar, runnable, 0));
    }

    public static void H1(x01 x01Var, TL_stars.StarGiftAttribute starGiftAttribute) {
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
        x01Var.e(str, starGiftAttribute.name, d2(starGiftAttribute.rarity, numArr), null, numArr[0]);
    }

    public static SpannableStringBuilder H2(String str) {
        if (str == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        SpannableString spannableString = new SpannableString("👌");
        spannableString.setSpan(new zq(R.drawable.filled_understood, 0), 0, spannableString.length(), 33);
        SpannableString spannableString2 = new SpannableString("👍");
        spannableString2.setSpan(new zq(R.drawable.filled_reactions, 0), 0, spannableString2.length(), 33);
        AndroidUtilities.replaceMultipleCharSequence("👌", spannableStringBuilder, spannableString);
        AndroidUtilities.replaceMultipleCharSequence("👍", spannableStringBuilder, spannableString2);
        return spannableStringBuilder;
    }

    public static void I0(h7 h7Var, long j10) {
        new zh.p1(h7Var.getContext(), h7Var.currentAccount, j10, null, new y3(h7Var, 1)).show();
    }

    public static void J0(h7 h7Var, vg.n1 n1Var, org.telegram.ui.ActionBar.e2 e2Var, int i10) {
        qf.c h = e2Var.h(i10, true, true);
        h.d();
        int i11 = h7Var.currentAccount;
        e4 e4Var = new e4(h7Var, h, n1Var, 1);
        org.telegram.ui.Wallet.l0 x9 = org.telegram.ui.Wallet.l0.x(i11);
        x9.m0(new fx(i11, e4Var, x9));
    }

    public static void K0(h7 h7Var, TLObject tLObject, MessageObject messageObject) {
        TLRPC.Message message;
        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
        MessagesController.getInstance(h7Var.currentAccount).putUsers(messages_messages.users, false);
        MessagesController.getInstance(h7Var.currentAccount).putChats(messages_messages.chats, false);
        h7Var.M0 = true;
        h7Var.L0 = false;
        Boolean bool = h7Var.f4750m1;
        if (bool != null && (message = messageObject.messageOwner) != null) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                ((TLRPC.TL_messageActionStarGift) messageAction).saved = true ^ bool.booleanValue();
            } else if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                ((TLRPC.TL_messageActionStarGiftUnique) messageAction).saved = true ^ bool.booleanValue();
            }
        }
        h7Var.K2(messageObject, null);
    }

    public static void L0(h7 h7Var, qf.c cVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(h7Var.currentAccount).lambda$processUpdates$379((TLRPC.Updates) tLObject, false);
            AndroidUtilities.runOnUIThread(new a3.l0(h7Var, cVar, tL_starGiftUnique, 8));
            return;
        }
        h7Var.getClass();
        if (tL_error != null && tL_error.text.startsWith("STARGIFT_RESELL_TOO_EARLY_")) {
            AndroidUtilities.runOnUIThread(new a3.i0(h7Var, cVar, Long.parseLong(tL_error.text.substring(26)), 1));
        } else if (tL_error != null) {
            AndroidUtilities.runOnUIThread(new a3.l0(h7Var, cVar, tL_error, 9));
        }
    }

    public static void M0(h7 h7Var, String str) {
        Context context = h7Var.getContext();
        qf.d.t(context, MessagesController.getInstance(h7Var.currentAccount).tonBlockchainExplorerUrl + str);
    }

    public static void N0(h7 h7Var, TLObject tLObject, String str, TL_stars.InputSavedStarGift inputSavedStarGift, TLRPC.TL_error tL_error, long j10) {
        TL_stars.SavedStarGift savedStarGift;
        if (tLObject instanceof TLRPC.TL_payments_paymentResult) {
            TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) tLObject;
            MessagesController.getInstance(h7Var.currentAccount).putUsers(tL_payments_paymentResult.updates.users, false);
            MessagesController.getInstance(h7Var.currentAccount).putChats(tL_payments_paymentResult.updates.chats, false);
            ca.y(h7Var.currentAccount, false).T(false);
            ca.y(h7Var.currentAccount, false).P();
            if (!TextUtils.isEmpty(str) && (savedStarGift = h7Var.F0) != null) {
                savedStarGift.flags &= -65537;
                savedStarGift.prepaid_upgrade_hash = null;
            }
            h7Var.f4759r0 = true;
            h7Var.f4762s1 = null;
            h7Var.J1(inputSavedStarGift, tL_payments_paymentResult.updates, new b4(h7Var, str, 0));
            Utilities.stageQueue.postRunnable(new c4(h7Var, tL_payments_paymentResult, 0));
        } else if (tL_error != null && "BALANCE_TOO_LOW".equals(tL_error.text)) {
            if (!MessagesController.getInstance(h7Var.currentAccount).starsPurchaseAvailable()) {
                h7Var.f4747k0.setLoading(false);
                ca.e0(h7Var.getContext(), h7Var.resourcesProvider);
                return;
            }
            ca y3 = ca.y(h7Var.currentAccount, false);
            b2 b2Var = new b2(h7Var, j10, 6);
            y3.e = false;
            y3.q(false, true, b2Var);
            y3.e = true;
        } else {
            h7Var.getBulletinFactory().g0(tL_error, false);
        }
    }

    public static void O0(h7 h7Var, String str) {
        Context context = h7Var.getContext();
        qf.d.t(context, MessagesController.getInstance(h7Var.currentAccount).tonBlockchainExplorerUrl + str);
    }

    public static void P(h7 h7Var, String str) {
        Context context = h7Var.getContext();
        qf.d.t(context, MessagesController.getInstance(h7Var.currentAccount).tonBlockchainExplorerUrl + str);
    }

    public static void P0(h7 h7Var, Long l4) {
        String str;
        String formatString;
        TLRPC.Chat chat;
        if (l4.longValue() < 0 && (chat = MessagesController.getInstance(h7Var.currentAccount).getChat(Long.valueOf(-l4.longValue()))) != null) {
            str = chat.title;
        } else {
            str = "";
        }
        org.telegram.ui.Components.wc bulletinFactory = h7Var.getBulletinFactory();
        int i10 = R.raw.contact_check;
        if (TextUtils.isEmpty(str)) {
            formatString = LocaleController.getString(R.string.GiftRepostedToProfile);
        } else {
            formatString = LocaleController.formatString(R.string.GiftRepostedToChannelProfile, str);
        }
        org.telegram.ui.Components.qc R = bulletinFactory.R(i10, 36, AndroidUtilities.replaceTags(formatString));
        R.f31872u = true;
        R.j();
    }

    public static void Q(h7 h7Var, TLRPC.TL_messageActionStarGift tL_messageActionStarGift, org.telegram.ui.ActionBar.e2 e2Var, TLObject tLObject) {
        MessageObject messageObject;
        if (tLObject instanceof TLRPC.messages_Messages) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            MessagesController.getInstance(h7Var.currentAccount).putUsers(messages_messages.users, false);
            MessagesController.getInstance(h7Var.currentAccount).putChats(messages_messages.chats, false);
            for (int i10 = 0; i10 < messages_messages.messages.size(); i10++) {
                TLRPC.Message message = messages_messages.messages.get(i10);
                if (message != null && !(message instanceof TLRPC.TL_messageEmpty) && message.f22049id == tL_messageActionStarGift.upgrade_msg_id) {
                    messageObject = new MessageObject(h7Var.currentAccount, message, false, false);
                    messageObject.setType();
                    break;
                }
            }
        }
        messageObject = null;
        if (messageObject != null) {
            AndroidUtilities.runOnUIThread(new a3.l0(h7Var, e2Var, messageObject, 13));
        } else {
            AndroidUtilities.runOnUIThread(new q4(e2Var, 0));
        }
    }

    public static void Q0(h7 h7Var, qf.c cVar, vg.n1 n1Var, long j10, TL_stars.TL_starGiftUnique tL_starGiftUnique, TL_wallet.nftItem nftitem, TL_stars.starGiftDepositPayload stargiftdepositpayload) {
        TLRPC.User user;
        f4 f4Var;
        String message;
        String str;
        org.telegram.ui.Wallet.s sVar = null;
        if (org.telegram.ui.Wallet.l0.x(h7Var.currentAccount).v() < stargiftdepositpayload.amount) {
            cVar.b();
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(h7Var.getContext(), 0, h7Var.resourcesProvider);
            String string = LocaleController.getString(R.string.WalletNotEnoughGram);
            org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
            e2Var.R = string;
            e2Var.T = LocaleController.formatSpannable(R.string.WalletNotEnoughGramToTransferGift, org.telegram.ui.Wallet.l0.n(stargiftdepositpayload.amount, false));
            alertDialog$Builder.h(LocaleController.getString(R.string.WalletNotNow), null);
            alertDialog$Builder.k(LocaleController.getString(R.string.WalletTopUp), new ai.f0(4, h7Var, n1Var));
            alertDialog$Builder.p();
            return;
        }
        if (j10 > 0) {
            user = MessagesController.getInstance(h7Var.currentAccount).getUser(Long.valueOf(j10));
        } else {
            user = null;
        }
        long clientUserId = UserConfig.getInstance(h7Var.currentAccount).getClientUserId();
        TLRPC.Document document = tL_starGiftUnique.getDocument();
        int i10 = h7Var.currentAccount;
        org.telegram.ui.Wallet.l0 x9 = org.telegram.ui.Wallet.l0.x(i10);
        e4 e4Var = new e4(h7Var, cVar, n1Var, 0);
        if (j10 != clientUserId) {
            f4Var = null;
        } else {
            f4Var = new f4(i10, clientUserId, document);
        }
        try {
            if (stargiftdepositpayload.nft_address.indexOf(58) >= 0) {
                str = org.telegram.ui.Wallet.l0.V(stargiftdepositpayload.nft_address, true);
            } else {
                str = stargiftdepositpayload.nft_address;
            }
            String str2 = str;
            org.telegram.ui.Wallet.d2 h = org.telegram.ui.Wallet.l0.h(stargiftdepositpayload);
            if (f4Var != null) {
                sVar = new org.telegram.ui.Wallet.s(1, x9, f4Var);
            }
            x9.d0(user, str2, 0L, null, null, nftitem, null, e4Var, sVar, h);
        } catch (Exception e) {
            org.telegram.ui.Wallet.l0.k("depositNFT: invalid payload", e);
            if (e.getMessage() == null) {
                message = "NULL_ERROR";
            } else {
                message = e.getMessage();
            }
            e4Var.run(message);
        }
    }

    public static void R(h7 h7Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        a2 a2Var = h7Var.f4766u1;
        h7Var.f4760r1 = false;
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            MessagesController.getInstance(h7Var.currentAccount).putUsers(paymentForm.users, false);
            h7Var.f4762s1 = paymentForm;
            AndroidUtilities.cancelRunOnUIThread(a2Var);
            AndroidUtilities.runOnUIThread(a2Var);
            return;
        }
        org.telegram.ui.Components.qc Z = h7Var.getBulletinFactory().Z(tL_error);
        Z.f31872u = true;
        Z.j();
    }

    public static boolean R0(h7 h7Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, ey eyVar, ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return false;
        }
        long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        long giftThemeUser = ChatThemeController.getInstance(h7Var.currentAccount).getGiftThemeUser(tL_starGiftUnique.slug);
        if (giftThemeUser != 0 && giftThemeUser != j10) {
            org.telegram.ui.Components.g5.m0(h7Var.getContext(), h7Var.resourcesProvider, h7Var.currentAccount, tL_starGiftUnique, giftThemeUser, new y2(h7Var, j10, tL_starGiftUnique, eyVar, 1));
            return true;
        }
        ChatThemeController.getInstance(h7Var.currentAccount).setDialogTheme(j10, new hg.b(null, tL_starGiftUnique.slug));
        eyVar.presentFragment(wn.ea(j10), true);
        return true;
    }

    public static boolean R1(TL_stars.SavedStarGift savedStarGift, TL_stars.SavedStarGift savedStarGift2) {
        if (savedStarGift != savedStarGift2) {
            if (savedStarGift != null) {
                TL_stars.StarGift starGift = savedStarGift.gift;
                TL_stars.StarGift starGift2 = savedStarGift2.gift;
                if (starGift != starGift2) {
                    if ((starGift instanceof TL_stars.TL_starGiftUnique) && (starGift2 instanceof TL_stars.TL_starGiftUnique)) {
                        if (starGift.f22257id == starGift2.f22257id) {
                            return true;
                        }
                        return false;
                    } else if ((starGift instanceof TL_stars.TL_starGift) && (starGift2 instanceof TL_stars.TL_starGift) && starGift.f22257id == starGift2.f22257id && savedStarGift.date == savedStarGift2.date) {
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

    public static void S(h7 h7Var, TL_stars.InputSavedStarGift inputSavedStarGift, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            MessagesController.getInstance(h7Var.currentAccount).putUsers(updates.users, false);
            MessagesController.getInstance(h7Var.currentAccount).putChats(updates.chats, false);
        }
        AndroidUtilities.runOnUIThread(new ai.e0(h7Var, tL_error, tLObject, inputSavedStarGift, 8));
    }

    public static void S0(h7 h7Var, MessageObject messageObject, ArrayList arrayList, TL_stars.StarGift starGift) {
        h7Var.l1 = true;
        h7Var.K2(messageObject, null);
        h7Var.U2(0, true, null);
        z00 z00Var = h7Var.f4727a0;
        if (z00Var != null) {
            z00Var.c(true);
        }
        ca.y(h7Var.currentAccount, false).P();
        t9 G = ca.y(h7Var.currentAccount, false).G(UserConfig.getInstance(h7Var.currentAccount).getClientUserId(), false);
        if (G != null) {
            G.k(arrayList, starGift);
        }
    }

    public static boolean S1(TL_stars.TL_starGiftUnique tL_starGiftUnique, TL_stars.TL_starGiftUnique tL_starGiftUnique2) {
        if (tL_starGiftUnique != tL_starGiftUnique2) {
            if (tL_starGiftUnique != null) {
                if (tL_starGiftUnique.f22257id == tL_starGiftUnique2.f22257id || TextUtils.equals(tL_starGiftUnique.slug, tL_starGiftUnique2.slug)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public static void T(h7 h7Var, long j10) {
        new zh.p1(h7Var.getContext(), h7Var.currentAccount, j10, null, new y3(h7Var, 1)).show();
    }

    public static void T0(h7 h7Var, boolean z10, qf.c cVar, Runnable runnable, DialogInterface dialogInterface, Boolean bool) {
        if (bool.booleanValue()) {
            UserConfig userConfig = UserConfig.getInstance(h7Var.currentAccount);
            userConfig.tmpPassword = null;
            userConfig.saveConfig(false);
            h7Var.v2(z10, cVar, runnable);
            return;
        }
        cVar.c(false);
        dialogInterface.dismiss();
        runnable.run();
    }

    public static void U(h7 h7Var) {
        TL_stars.SavedStarGift savedStarGift = h7Var.F0;
        if (savedStarGift.unsaved) {
            savedStarGift.unsaved = false;
            q9 F = ca.y(h7Var.currentAccount, false).F(h7Var.X, false);
            if (F != null) {
                TL_stars.SavedStarGift savedStarGift2 = h7Var.F0;
                F.m(savedStarGift2, savedStarGift2.unsaved);
            }
            TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
            savestargift.stargift = h7Var.Y1();
            savestargift.unsave = h7Var.F0.unsaved;
            ConnectionsManager.getInstance(h7Var.currentAccount).sendRequest(savestargift, null, 64);
        }
        TL_stars.SavedStarGift savedStarGift3 = h7Var.F0;
        boolean z10 = savedStarGift3.pinned_to_top;
        if (((t9) h7Var.G0).o(savedStarGift3, !z10, false)) {
            new zh.q2(h7Var.getContext(), h7Var.X, h7Var.F0, h7Var.resourcesProvider, new Utilities.Callback0Return() {
                @Override
                public final Object run() {
                    return h7.this.getBulletinFactory();
                }
            }).show();
        } else if (!z10) {
            h7Var.getBulletinFactory().M(LocaleController.getString(R.string.Gift2PinnedTitle), LocaleController.getString(R.string.Gift2PinnedSubtitle), R.raw.ic_pin).j();
        } else {
            org.telegram.messenger.t.q(R.string.Gift2Unpinned, h7Var.getBulletinFactory(), R.raw.ic_unpin, 36);
        }
    }

    public static void U0(h7 h7Var, long j10) {
        tc tcVar = new tc(h7Var.getContext(), h7Var.resourcesProvider, j10, 10, null, new f2(6, h7Var, new boolean[]{false}), 0L);
        tcVar.setOnDismissListener(new i4(h7Var, 0));
        tcVar.show();
    }

    public static void V(h7 h7Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, org.telegram.ui.ActionBar.e2 e2Var) {
        h7Var.getClass();
        qf.c h = e2Var.h(-1, true, true);
        h.d();
        TL_stars.updateStarGiftPrice updatestargiftprice = new TL_stars.updateStarGiftPrice();
        updatestargiftprice.stargift = h7Var.Y1();
        updatestargiftprice.resell_amount = TL_stars.StarsAmount.ofStars(0L);
        ConnectionsManager.getInstance(h7Var.currentAccount).sendRequest(updatestargiftprice, new h2(h7Var, h, tL_starGiftUnique, 1));
    }

    public static void V0(h7 h7Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, bg.a aVar, Runnable runnable) {
        TL_stars.StarsAmount o10 = aVar.o();
        TL_stars.updateStarGiftPrice updatestargiftprice = new TL_stars.updateStarGiftPrice();
        updatestargiftprice.stargift = h7Var.Y1();
        updatestargiftprice.resell_amount = o10;
        ConnectionsManager.getInstance(h7Var.currentAccount).sendRequest(updatestargiftprice, new q2(h7Var, tL_starGiftUnique, aVar, runnable, 1));
    }

    public static void W(h7 h7Var, org.telegram.ui.ActionBar.e2 e2Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TL_stars.TL_payments_uniqueStarGift) {
            TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift = (TL_stars.TL_payments_uniqueStarGift) tLObject;
            MessagesController.getInstance(h7Var.currentAccount).putUsers(tL_payments_uniqueStarGift.users, false);
            MessagesController.getInstance(h7Var.currentAccount).putChats(tL_payments_uniqueStarGift.chats, false);
            if (tL_payments_uniqueStarGift.gift instanceof TL_stars.TL_starGiftUnique) {
                AndroidUtilities.runOnUIThread(new a1.f(29, h7Var, tL_payments_uniqueStarGift));
                return;
            }
        }
        AndroidUtilities.runOnUIThread(new f2(0, e2Var, tL_error));
    }

    public static void W0(h7 h7Var, int i10, int i11, int i12, vg.n1[] n1VarArr, TL_stars.TL_starGiftUnique tL_starGiftUnique, Long l4) {
        final vg.n1[] n1VarArr2;
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
                n1VarArr2 = n1VarArr;
            } else {
                a3.l0 l0Var = new a3.l0(h7Var, l4, n1VarArr, 7);
                if (l4.longValue() < 0) {
                    TLRPC.ChatFull chatFull = MessagesController.getInstance(h7Var.currentAccount).getChatFull(-l4.longValue());
                    if (chatFull == null) {
                        TLRPC.TL_channels_getFullChannel tL_channels_getFullChannel = new TLRPC.TL_channels_getFullChannel();
                        tL_channels_getFullChannel.channel = MessagesController.getInstance(h7Var.currentAccount).getInputChannel(-l4.longValue());
                        ConnectionsManager.getInstance(h7Var.currentAccount).sendRequest(tL_channels_getFullChannel, new j(3, h7Var, l0Var));
                        return;
                    } else if (!chatFull.stargifts_available) {
                        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(h7Var.getContext(), 0, h7Var.resourcesProvider);
                        String string = LocaleController.getString(R.string.Gift2ChannelDoesntSupportGiftsTitle);
                        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
                        e2Var.R = string;
                        e2Var.T = LocaleController.getString(R.string.Gift2ChannelDoesntSupportGiftsText);
                        org.telegram.messenger.t.p(R.string.OK, alertDialog$Builder, null);
                        return;
                    }
                } else if (l4.longValue() >= 0) {
                    TLRPC.User user = MessagesController.getInstance(h7Var.currentAccount).getUser(l4);
                    TLRPC.UserFull userFull = MessagesController.getInstance(h7Var.currentAccount).getUserFull(l4.longValue());
                    if (userFull != null && (disallowedGiftsSettings = userFull.disallowed_stargifts) != null && disallowedGiftsSettings.disallow_unique_stargifts) {
                        new org.telegram.ui.Components.wc(n1VarArr[0].container, h7Var.resourcesProvider).R(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(l4.longValue())))).j();
                        return;
                    } else if (userFull == null && user != null) {
                        TLRPC.TL_users_getFullUser tL_users_getFullUser = new TLRPC.TL_users_getFullUser();
                        tL_users_getFullUser.f22170id = MessagesController.getInstance(h7Var.currentAccount).getInputUser(user);
                        ConnectionsManager.getInstance(h7Var.currentAccount).sendRequest(tL_users_getFullUser, new i2(h7Var, n1VarArr, l4, l0Var, 0));
                        return;
                    }
                }
                l0Var.run();
                return;
            }
        } else {
            n1VarArr2 = n1VarArr;
            i13 = i10;
        }
        if (i13 < i11) {
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(h7Var.getContext(), 0, h7Var.resourcesProvider);
            String string2 = LocaleController.getString(R.string.Gift2ExportTONUnlocksAlertTitle);
            org.telegram.ui.ActionBar.e2 e2Var2 = alertDialog$Builder2.f22369a;
            e2Var2.R = string2;
            e2Var2.T = LocaleController.formatPluralString("Gift2ExportTONUnlocksAlertText", Math.max(1, i12), new Object[0]);
            org.telegram.messenger.t.p(R.string.OK, alertDialog$Builder2, null);
        } else if (l4.longValue() == -98) {
            AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(h7Var.getContext(), 0, h7Var.resourcesProvider);
            String string3 = LocaleController.getString(R.string.Gift2MoveToMyWallet);
            org.telegram.ui.ActionBar.e2 e2Var3 = alertDialog$Builder3.f22369a;
            e2Var3.R = string3;
            e2Var3.T = LocaleController.getString(R.string.Gift2MoveToMyWalletText);
            String t10 = org.telegram.ui.Wallet.l0.x(h7Var.currentAccount).t();
            LinearLayout linearLayout = new LinearLayout(h7Var.getContext());
            linearLayout.setOrientation(1);
            if (!TextUtils.isEmpty(t10)) {
                TextView textView = new TextView(h7Var.getContext());
                textView.setTypeface(AndroidUtilities.getTypeface("fonts/rmono.ttf"));
                textView.setTextSize(1, 16.5f);
                textView.setLetterSpacing(0.01818182f);
                textView.setLineSpacing(AndroidUtilities.dp(23.0f) - textView.getPaint().getFontMetricsInt(null), 1.0f);
                textView.setIncludeFontPadding(false);
                textView.setGravity(17);
                textView.setPadding(0, AndroidUtilities.dp(14.0f), 0, AndroidUtilities.dp(14.0f));
                int i17 = org.telegram.ui.ActionBar.y6.f23465j5;
                int w02 = org.telegram.ui.ActionBar.y6.w0(i17, h7Var.resourcesProvider);
                i14 = 3;
                ShapeDrawable c02 = org.telegram.ui.ActionBar.y6.c0(AndroidUtilities.dp(20.0f), org.telegram.ui.ActionBar.y6.o1(0.045f, w02));
                org.telegram.ui.ActionBar.b7 L = org.telegram.ui.ActionBar.f7.L(0.045f, i17);
                org.telegram.ui.ActionBar.u6 u6Var = h7Var.resourcesProvider;
                textView.setBackground(c02);
                org.telegram.ui.ActionBar.f7.k(textView, c02, L, null, u6Var);
                int w03 = org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.f23615r5, h7Var.resourcesProvider);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                int length = (t10.length() + 3) / 4;
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
                    spannableStringBuilder.append((CharSequence) t10, i19, Math.min(t10.length(), i19 + 4));
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
                linearLayout.addView(textView, kb1.o(20.0f, 0.0f, 20.0f, 14.0f, -1, -2));
            } else {
                i14 = 3;
            }
            TextView textView2 = new TextView(h7Var.getContext());
            textView2.setTextSize(1, 15.0f);
            org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.f23465j5, h7Var.resourcesProvider);
            textView2.setGravity(17);
            textView2.setText(LocaleController.getString(R.string.Gift2MoveAppearIn));
            linearLayout.addView(textView2, kb1.o(24.0f, 0.0f, 24.0f, 0.0f, -1, -2));
            LinearLayout linearLayout2 = new LinearLayout(h7Var.getContext());
            linearLayout2.setOrientation(0);
            linearLayout2.setGravity(16);
            int i20 = R.drawable.msg_settings;
            int i21 = org.telegram.ui.ActionBar.y6.f23615r5;
            h7Var.I1(linearLayout2, i20, 14, i21, LocaleController.getString(R.string.Settings), true);
            h7Var.I1(linearLayout2, R.drawable.mini_gram_14, 15, org.telegram.ui.ActionBar.y6.Oh, LocaleController.getString(R.string.WalletAttachMoney), true);
            h7Var.I1(linearLayout2, R.drawable.menu_gift, 14, i21, LocaleController.getString(R.string.WalletCollectibles), false);
            linearLayout.addView(linearLayout2, kb1.x(-2, -2, 1, 0, 7, 0, 3));
            h7Var.f4772x1 = true;
            org.telegram.ui.Cells.y1 y1Var = new org.telegram.ui.Cells.y1(h7Var.getContext(), 1, h7Var.resourcesProvider);
            int i22 = org.telegram.ui.ActionBar.y6.f23449i6;
            org.telegram.ui.Cells.y g02 = org.telegram.ui.ActionBar.y6.g0(org.telegram.ui.ActionBar.y6.w0(i22, h7Var.resourcesProvider), 7, AndroidUtilities.dp(12.0f));
            org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i22);
            org.telegram.ui.ActionBar.u6 u6Var2 = h7Var.resourcesProvider;
            y1Var.setBackground(g02);
            org.telegram.ui.ActionBar.f7.k(y1Var, g02, null, N, u6Var2);
            y1Var.setMultiline(true);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) y1Var.getCheckBoxView().getLayoutParams();
            layoutParams.topMargin = 0;
            if (LocaleController.isRTL) {
                i14 = 5;
            }
            layoutParams.gravity = i14 | 16;
            y1Var.getCheckBoxView().setLayoutParams(layoutParams);
            y1Var.e(LocaleController.getString(R.string.Gift2KeepOnProfile), "", true, false, false);
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
            y1Var.setPadding(i15, dp2, dp, AndroidUtilities.dp(12.0f));
            y1Var.setOnClickListener(new q(5, h7Var, y1Var));
            linearLayout.addView(y1Var, kb1.o(8.0f, 4.0f, 8.0f, 0.0f, -1, -2));
            alertDialog$Builder3.o(linearLayout);
            e2Var3.G = 20;
            alertDialog$Builder3.k(LocaleController.getString(R.string.Gift2Move), new org.telegram.ui.ActionBar.b2(h7Var) {
                public final h7 f4643b;

                {
                    this.f4643b = h7Var;
                }

                @Override
                public final void h(org.telegram.ui.ActionBar.e2 e2Var4, int i23) {
                    switch (r3) {
                        case 0:
                            qf.c h = e2Var4.h(i23, true, true);
                            vg.n1 n1Var = n1VarArr2[0];
                            Objects.requireNonNull(n1Var);
                            this.f4643b.T2(true, e2Var4, h, new vg.a1(n1Var, 11));
                            return;
                        default:
                            qf.c h10 = e2Var4.h(i23, true, true);
                            vg.n1 n1Var2 = n1VarArr2[0];
                            Objects.requireNonNull(n1Var2);
                            this.f4643b.T2(false, e2Var4, h10, new vg.a1(n1Var2, 11));
                            return;
                    }
                }
            });
            ic.a.r(R.string.Cancel, alertDialog$Builder3, null);
        } else {
            LinearLayout linearLayout3 = new LinearLayout(h7Var.getContext());
            linearLayout3.setOrientation(1);
            linearLayout3.addView(new b6(h7Var.getContext(), tL_starGiftUnique), kb1.x(-1, -2, 48, 0, -4, 0, 0));
            TextView textView3 = new TextView(h7Var.getContext());
            int i23 = org.telegram.ui.ActionBar.y6.f23465j5;
            org.telegram.messenger.t.r(textView3, i23, h7Var.resourcesProvider, 1, 20.0f);
            textView3.setText(LocaleController.getString(R.string.Gift2ExportTONFragmentTitle));
            linearLayout3.addView(textView3, kb1.x(-1, -2, 48, 24, 4, 24, 14));
            TextView textView4 = new TextView(h7Var.getContext());
            org.telegram.ui.ActionBar.f7.V(textView4, i23, h7Var.resourcesProvider);
            textView4.setTextSize(1, 16.0f);
            wh.o(R.string.Gift2ExportTONFragmentText, new Object[]{h7Var.W1()}, textView4);
            linearLayout3.addView(textView4, kb1.x(-1, -2, 48, 24, 0, 24, 4));
            AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(h7Var.getContext(), 0, h7Var.resourcesProvider);
            alertDialog$Builder4.o(linearLayout3);
            alertDialog$Builder4.k(LocaleController.getString(R.string.Gift2ExportTONFragmentOpen), new org.telegram.ui.ActionBar.b2(h7Var) {
                public final h7 f4643b;

                {
                    this.f4643b = h7Var;
                }

                @Override
                public final void h(org.telegram.ui.ActionBar.e2 e2Var4, int i232) {
                    switch (r3) {
                        case 0:
                            qf.c h = e2Var4.h(i232, true, true);
                            vg.n1 n1Var = n1VarArr2[0];
                            Objects.requireNonNull(n1Var);
                            this.f4643b.T2(true, e2Var4, h, new vg.a1(n1Var, 11));
                            return;
                        default:
                            qf.c h10 = e2Var4.h(i232, true, true);
                            vg.n1 n1Var2 = n1VarArr2[0];
                            Objects.requireNonNull(n1Var2);
                            this.f4643b.T2(false, e2Var4, h10, new vg.a1(n1Var2, 11));
                            return;
                    }
                }
            });
            ic.a.r(R.string.Cancel, alertDialog$Builder4, null);
        }
    }

    public static void X(h7 h7Var, long j10, TL_stars.TL_starGiftUnique tL_starGiftUnique, ey eyVar) {
        ChatThemeController.getInstance(h7Var.currentAccount).setDialogTheme(j10, new hg.b(null, tL_starGiftUnique.slug));
        eyVar.presentFragment(wn.ea(j10), true);
    }

    public static void X0(h7 h7Var, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TL_account.tmpPassword) {
            TL_account.tmpPassword tmppassword = (TL_account.tmpPassword) tLObject;
            UserConfig.getInstance(h7Var.currentAccount).tmpPassword = tmppassword;
            UserConfig.getInstance(h7Var.currentAccount).saveConfig(false);
            h7Var.g2(tmppassword.tmp_password, twoStepVerificationActivity, z10, null);
            return;
        }
        h7Var.o2(tL_error, twoStepVerificationActivity, z10);
    }

    public static String X1(TL_stars.StarGift starGift) {
        if (starGift instanceof TL_stars.TL_starGiftUnique) {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(tL_starGiftUnique.title);
            sb2.append(" #");
            return org.telegram.messenger.t.i(tL_starGiftUnique.num, ',', sb2);
        } else if ((starGift instanceof TL_stars.TL_starGift) && !TextUtils.isEmpty(starGift.title)) {
            return starGift.title;
        } else {
            return LocaleController.getString(R.string.Gift2Gift);
        }
    }

    public static void Y(h7 h7Var) {
        boolean z10;
        TLRPC.Document document;
        boolean z11;
        q9 F;
        TLRPC.Message message;
        fi.d dVar = h7Var.f4747k0;
        if (!dVar.Q) {
            TL_stars.InputSavedStarGift Y1 = h7Var.Y1();
            MessageObject messageObject = h7Var.H0;
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
                TL_stars.SavedStarGift savedStarGift = h7Var.F0;
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
            if (h7Var.F0 != null && (F = ca.y(h7Var.currentAccount, false).F(h7Var.X, false)) != null) {
                F.m(h7Var.F0, savestargift.unsave);
                z11 = true;
            } else {
                z11 = false;
            }
            ConnectionsManager.getInstance(h7Var.currentAccount).sendRequest(savestargift, new s4(h7Var, z11, document2, z12, savestargift));
        }
    }

    public static void Y0(bi.h7 r11, android.view.View r12) {
        throw new UnsupportedOperationException("Method not decompiled: bi.h7.Y0(bi.h7, android.view.View):void");
    }

    public static void Z(h7 h7Var) {
        int i10;
        long j10;
        long j11;
        long j12;
        String string;
        final long clientUserId = UserConfig.getInstance(h7Var.currentAccount).getClientUserId();
        final TL_stars.InputSavedStarGift Y1 = h7Var.Y1();
        if (Y1 != null) {
            MessageObject messageObject = h7Var.H0;
            if (messageObject != null) {
                i10 = messageObject.messageOwner.date;
                boolean isOutOwner = messageObject.isOutOwner();
                MessageObject messageObject2 = h7Var.H0;
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
                            j10 = h7Var.H0.getDialogId();
                        }
                        j11 = tL_messageActionStarGift.convert_stars;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                TL_stars.SavedStarGift savedStarGift = h7Var.F0;
                if (savedStarGift != null) {
                    i10 = savedStarGift.date;
                    if ((savedStarGift.flags & 2) != 0 && !savedStarGift.name_hidden) {
                        j10 = DialogObject.getPeerDialogId(savedStarGift.from_id);
                    } else {
                        j10 = 2666000;
                    }
                    j11 = h7Var.F0.convert_stars;
                    j12 = h7Var.X;
                } else {
                    return;
                }
            }
            int max = Math.max(1, (MessagesController.getInstance(h7Var.currentAccount).stargiftsConvertPeriodMax - (ConnectionsManager.getInstance(h7Var.currentAccount).getCurrentTime() - i10)) / 86400);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(h7Var.getContext(), 0, h7Var.resourcesProvider);
            String string2 = LocaleController.getString(R.string.Gift2ConvertTitle);
            org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
            e2Var.R = string2;
            if (!UserObject.isService(j10) && j10 != 2666000) {
                string = DialogObject.getShortName(j10);
            } else {
                string = LocaleController.getString(R.string.StarsTransactionHidden);
            }
            e2Var.T = AndroidUtilities.replaceTags(LocaleController.formatPluralString("Gift2ConvertText2", max, string, LocaleController.formatPluralStringComma("Gift2ConvertStars", (int) j11)));
            final long j13 = j11;
            final long j14 = j12;
            alertDialog$Builder.k(LocaleController.getString(R.string.Gift2ConvertButton), new org.telegram.ui.ActionBar.b2() {
                @Override
                public final void h(org.telegram.ui.ActionBar.e2 e2Var2, int i11) {
                    h7.r0(h7.this, Y1, j14, clientUserId, j13);
                }
            });
            ic.a.r(R.string.Cancel, alertDialog$Builder, null);
        }
    }

    public static void Z0(h7 h7Var, TL_stars.StarGift starGift, TL_stars.StarGiftAttribute starGiftAttribute, org.telegram.ui.Components.yc[] ycVarArr, boolean[] zArr, ArrayList arrayList) {
        if (arrayList != null) {
            new x1(h7Var.getContext(), h7Var.resourcesProvider, h7Var.currentAccount, starGift.title, arrayList, false).show();
        } else {
            h7Var.R2(ycVarArr[0], LocaleController.formatString(R.string.Gift2RarityHint, hi.k.F0(starGiftAttribute.getRarityPermille())), false);
        }
        zArr[0] = false;
    }

    public static void a0(h7 h7Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.PaymentForm paymentForm, TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails, long j10, CharSequence charSequence, org.telegram.ui.ActionBar.e2 e2Var) {
        qf.c h = e2Var.h(-1, true, true);
        h.d();
        TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
        tL_payments_sendStarsForm.form_id = paymentForm.form_id;
        tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftDropOriginalDetails;
        ConnectionsManager.getInstance(h7Var.currentAccount).sendRequest(tL_payments_sendStarsForm, new g4(h7Var, h, e2Var, tL_starGiftUnique, j10, charSequence));
    }

    public static void a1(h7 h7Var, long j10, long j11, Utilities.Callback callback) {
        tc tcVar = new tc(h7Var.getContext(), h7Var.resourcesProvider, j10, 11, null, new y2(h7Var, new boolean[]{false}, j11, callback, 2), 0L);
        tcVar.setOnDismissListener(new i4(h7Var, 1));
        tcVar.show();
    }

    public static void b0(h7 h7Var, String str) {
        long j10 = h7Var.X;
        h7Var.f4747k0.setLoading(false);
        if (!TextUtils.isEmpty(str)) {
            h7Var.dismiss();
            org.telegram.ui.ActionBar.r2 R = LaunchActivity.R();
            if (R == null) {
                return;
            }
            if (R instanceof wn) {
                wn wnVar = (wn) R;
                if (wnVar.a() == j10) {
                    org.telegram.ui.Components.wc.b0(wnVar).M(LocaleController.getString(R.string.StarsGiftUpgradeCompleted), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StarsGiftUpgradeCompletedText, DialogObject.getShortName(j10))), R.raw.gift).k(true);
                    return;
                }
            }
            NotificationCenter notificationCenter = NotificationCenter.getInstance(h7Var.currentAccount);
            int i10 = NotificationCenter.closeProfileActivity;
            Long valueOf = Long.valueOf(j10);
            Boolean bool = Boolean.FALSE;
            notificationCenter.lambda$postNotificationNameOnUIThread$1(i10, valueOf, bool);
            NotificationCenter.getInstance(h7Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChatActivity, Long.valueOf(j10), bool);
            wn ea2 = wn.ea(j10);
            ea2.whenFullyVisible(new f2(5, h7Var, ea2));
            R.presentFragment(ea2);
            return;
        }
        h7Var.U2(0, true, null);
    }

    public static void b1(h7 h7Var, TLObject tLObject, vg.n1[] n1VarArr, Long l4, a3.l0 l0Var, TLRPC.TL_error tL_error) {
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        if (tLObject instanceof TLRPC.TL_users_userFull) {
            TLRPC.TL_users_userFull tL_users_userFull = (TLRPC.TL_users_userFull) tLObject;
            MessagesController.getInstance(h7Var.currentAccount).putUsers(tL_users_userFull.users, false);
            MessagesController.getInstance(h7Var.currentAccount).putChats(tL_users_userFull.chats, false);
            TLRPC.UserFull userFull = tL_users_userFull.full_user;
            if (userFull != null && (disallowedGiftsSettings = userFull.disallowed_stargifts) != null && disallowedGiftsSettings.disallow_unique_stargifts) {
                new org.telegram.ui.Components.wc(n1VarArr[0].container, h7Var.resourcesProvider).R(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(l4.longValue())))).j();
                return;
            } else {
                l0Var.run();
                return;
            }
        }
        org.telegram.ui.Components.qc Z = h7Var.getBulletinFactory().Z(tL_error);
        Z.f31872u = true;
        Z.j();
    }

    public static void c0(h7 h7Var) {
        TLRPC.Message message;
        TL_stars.InputSavedStarGift Y1 = h7Var.Y1();
        if (Y1 != null) {
            long clientUserId = UserConfig.getInstance(h7Var.currentAccount).getClientUserId();
            MessageObject messageObject = h7Var.H0;
            if (messageObject != null && (message = messageObject.messageOwner) != null) {
                TLRPC.MessageAction messageAction = message.action;
                if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                    TLRPC.Peer peer = ((TLRPC.TL_messageActionStarGift) messageAction).peer;
                    if (peer != null) {
                        clientUserId = DialogObject.getPeerDialogId(peer);
                    }
                    long j10 = clientUserId;
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(h7Var.getContext(), 0, h7Var.resourcesProvider);
                    alertDialog$Builder.f22369a.R = LocaleController.getString(R.string.Gift2DeleteOption);
                    alertDialog$Builder.f22369a.T = LocaleController.getString(R.string.Gift2DeleteText);
                    alertDialog$Builder.k(LocaleController.getString(R.string.Delete), new i(h7Var, Y1, j10, 1));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                    alertDialog$Builder.d(-1);
                    alertDialog$Builder.p();
                }
            }
            if (h7Var.F0 != null) {
                clientUserId = h7Var.X;
                long j102 = clientUserId;
                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(h7Var.getContext(), 0, h7Var.resourcesProvider);
                alertDialog$Builder2.f22369a.R = LocaleController.getString(R.string.Gift2DeleteOption);
                alertDialog$Builder2.f22369a.T = LocaleController.getString(R.string.Gift2DeleteText);
                alertDialog$Builder2.k(LocaleController.getString(R.string.Delete), new i(h7Var, Y1, j102, 1));
                alertDialog$Builder2.h(LocaleController.getString(R.string.Cancel), null);
                alertDialog$Builder2.d(-1);
                alertDialog$Builder2.p();
            }
        }
    }

    public static void c1(h7 h7Var, String str, long j10) {
        org.telegram.ui.ActionBar.r2 R = LaunchActivity.R();
        if (R == 0) {
            return;
        }
        ?? obj = new Object();
        obj.f22929a = true;
        zh.h4 h4Var = new zh.h4(h7Var.X, str, j10, h7Var.resourcesProvider);
        h4Var.e = new y3(h7Var, 0);
        R.showAsSheet(h4Var, obj);
    }

    public static void d1(h7 h7Var, vg.n1[] n1VarArr, Long l4) {
        if (l4.longValue() == -97) {
            vg.n1 n1Var = n1VarArr[0];
            TL_stars.TL_starGiftUnique e22 = h7Var.e2();
            if (h7Var.f4738f1 != null && e22 != null && !TextUtils.isEmpty(e22.slug)) {
                long clientUserId = UserConfig.getInstance(h7Var.currentAccount).getClientUserId();
                TextView textView = new TextView(h7Var.getContext());
                textView.setTextSize(1, 13.0f);
                int i10 = org.telegram.ui.ActionBar.y6.f23615r5;
                org.telegram.ui.ActionBar.f7.V(textView, i10, h7Var.resourcesProvider);
                textView.setGravity(17);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(" ");
                spannableStringBuilder.setSpan(new fa0(AndroidUtilities.dp(160.0f), textView), 0, spannableStringBuilder.length(), 33);
                textView.setText(spannableStringBuilder);
                TL_stars.starGiftDepositPayload[] stargiftdepositpayloadArr = new TL_stars.starGiftDepositPayload[1];
                Runnable[] runnableArr = new Runnable[1];
                boolean[] zArr = new boolean[1];
                TL_stars.depositStarGift depositstargift = new TL_stars.depositStarGift();
                depositstargift.peer = MessagesController.getInstance(h7Var.currentAccount).getInputPeer(clientUserId);
                depositstargift.slug = e22.slug;
                ConnectionsManager.getInstance(h7Var.currentAccount).sendRequestTyped(depositstargift, new Object(), new t3(h7Var, zArr, textView, stargiftdepositpayloadArr, runnableArr, 0));
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(h7Var.getContext(), 0, h7Var.resourcesProvider);
                alertDialog$Builder.f22369a.R = LocaleController.getString(R.string.Gift2MoveToMyGifts);
                alertDialog$Builder.f22369a.T = LocaleController.getString(R.string.Gift2MoveToMyGiftsText);
                TLRPC.User currentUser = UserConfig.getInstance(h7Var.currentAccount).getCurrentUser();
                LinearLayout linearLayout = new LinearLayout(h7Var.getContext());
                linearLayout.setOrientation(1);
                FrameLayout frameLayout = new FrameLayout(h7Var.getContext());
                int dp = AndroidUtilities.dp(20.0f);
                int i11 = org.telegram.ui.ActionBar.y6.f23465j5;
                ShapeDrawable c02 = org.telegram.ui.ActionBar.y6.c0(dp, org.telegram.ui.ActionBar.y6.o1(0.045f, org.telegram.ui.ActionBar.y6.w0(i11, h7Var.resourcesProvider)));
                org.telegram.ui.ActionBar.b7 L = org.telegram.ui.ActionBar.f7.L(0.045f, i11);
                org.telegram.ui.ActionBar.u6 u6Var = h7Var.resourcesProvider;
                frameLayout.setBackground(c02);
                org.telegram.ui.ActionBar.f7.k(frameLayout, c02, L, null, u6Var);
                org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(h7Var.getContext());
                y9Var.setRoundRadius(AndroidUtilities.dp(21.0f));
                org.telegram.ui.Components.j9 j9Var = new org.telegram.ui.Components.j9((org.telegram.ui.ActionBar.u6) null);
                j9Var.r(currentUser);
                y9Var.f(currentUser, j9Var);
                frameLayout.addView(y9Var, kb1.h(42, 42.0f, 19, 12.0f, 0.0f, 0.0f, 0.0f));
                TextView textView2 = new TextView(h7Var.getContext());
                ic.a.o(16.0f, 1, textView2);
                org.telegram.ui.ActionBar.f7.V(textView2, i11, h7Var.resourcesProvider);
                textView2.setSingleLine();
                TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
                textView2.setEllipsize(truncateAt);
                textView2.setText(Emoji.replaceEmoji(UserObject.getUserName(currentUser), textView2.getPaint().getFontMetricsInt(), false));
                frameLayout.addView(textView2, kb1.h(-1, -2.0f, 51, 66.0f, 11.0f, 12.0f, 0.0f));
                TextView textView3 = new TextView(h7Var.getContext());
                textView3.setTextSize(1, 14.0f);
                org.telegram.ui.ActionBar.f7.V(textView3, i10, h7Var.resourcesProvider);
                textView3.setSingleLine();
                textView3.setEllipsize(truncateAt);
                if (currentUser != null && !TextUtils.isEmpty(currentUser.phone)) {
                    kf.b c10 = kf.b.c();
                    textView3.setText(c10.b("+" + currentUser.phone));
                } else if (currentUser != null && UserObject.getPublicUsername(currentUser) != null) {
                    textView3.setText("@" + UserObject.getPublicUsername(currentUser));
                }
                frameLayout.addView(textView3, kb1.h(-1, -2.0f, 51, 66.0f, 33.0f, 12.0f, 0.0f));
                linearLayout.addView(frameLayout, kb1.o(20.0f, 0.0f, 20.0f, 16.0f, -1, 62));
                TextView textView4 = new TextView(h7Var.getContext());
                textView4.setTextSize(1, 15.0f);
                org.telegram.ui.ActionBar.f7.V(textView4, i11, h7Var.resourcesProvider);
                textView4.setGravity(17);
                textView4.setText(LocaleController.getString(R.string.Gift2MoveAppearIn));
                linearLayout.addView(textView4, kb1.o(24.0f, 0.0f, 24.0f, 0.0f, -1, -2));
                LinearLayout linearLayout2 = new LinearLayout(h7Var.getContext());
                linearLayout2.setOrientation(0);
                linearLayout2.setGravity(16);
                h7Var.I1(linearLayout2, R.drawable.msg_openprofile, 14, i10, LocaleController.getString(R.string.MyProfile), true);
                h7Var.I1(linearLayout2, R.drawable.menu_gift, 14, i10, LocaleController.getString(R.string.ProfileGifts), false);
                linearLayout.addView(linearLayout2, kb1.x(-2, -2, 1, 0, 7, 0, 3));
                linearLayout.addView(textView, kb1.o(24.0f, 4.0f, 24.0f, 4.0f, -1, -2));
                alertDialog$Builder.o(linearLayout);
                alertDialog$Builder.f22369a.G = 20;
                alertDialog$Builder.k(LocaleController.getString(R.string.Gift2Move), new ag.j0(h7Var, clientUserId, stargiftdepositpayloadArr, n1Var, 1));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                u3 u3Var = new u3(0, zArr, runnableArr);
                org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
                e2Var.setOnDismissListener(u3Var);
                e2Var.show();
            }
        } else if (l4.longValue() != -99 && l4.longValue() != -98) {
            h7Var.x2(l4.longValue(), 0L, false, new d3(h7Var, l4, n1VarArr, 1));
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
            return hi.k.F0(i10);
        } else {
            return "";
        }
    }

    public static void e0(h7 h7Var, int i10, TLObject tLObject) {
        MessageObject messageObject;
        if (tLObject instanceof TLRPC.messages_Messages) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            for (int i11 = 0; i11 < messages_messages.messages.size(); i11++) {
                TLRPC.Message message = messages_messages.messages.get(i11);
                if (message != null && message.f22049id == i10) {
                    TLRPC.MessageAction messageAction = message.action;
                    if ((messageAction instanceof TLRPC.TL_messageActionStarGift) || (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                        messageObject = new MessageObject(h7Var.currentAccount, message, false, false);
                        messageObject.setType();
                        break;
                    }
                }
            }
        }
        messageObject = null;
        if (messageObject != null) {
            AndroidUtilities.runOnUIThread(new a3.l0(h7Var, tLObject, messageObject, 10));
        }
    }

    public static void e1(h7 h7Var, TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift) {
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) tL_payments_uniqueStarGift.gift;
        h7Var.J0 = tL_starGiftUnique;
        h7Var.M2(tL_starGiftUnique, false, null, null);
        super.show();
    }

    public static void f0(h7 h7Var, qf.c cVar, vg.n1 n1Var, String str) {
        org.telegram.ui.Components.wc bulletinFactory;
        cVar.b();
        if (str != null) {
            if (n1Var != null) {
                bulletinFactory = new org.telegram.ui.Components.wc(n1Var.container, h7Var.resourcesProvider);
            } else {
                bulletinFactory = h7Var.getBulletinFactory();
            }
            bulletinFactory.f0(str, false);
            return;
        }
        if (n1Var != null) {
            n1Var.dismiss();
        }
        h7Var.dismiss();
        org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
        if (U instanceof org.telegram.ui.Wallet.m5) {
            ((org.telegram.ui.Wallet.m5) U).K0();
        }
    }

    public static void f1(h7 h7Var, org.telegram.ui.ActionBar.e2 e2Var, MessageObject messageObject) {
        e2Var.dismiss();
        h7Var.M0 = true;
        h7Var.K2(messageObject, null);
        super.show();
    }

    public static void g0(h7 h7Var, Utilities.Callback2 callback2, ArrayList arrayList, Runnable runnable, TLRPC.Updates updates, TLRPC.TL_error tL_error) {
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
                        messageObject = new MessageObject(h7Var.currentAccount, message, false, false);
                        break;
                    }
                } else {
                    messageObject = null;
                    break;
                }
            }
            MessagesController.getInstance(h7Var.currentAccount).lambda$processUpdates$379(updates, false);
            if (messageObject != null) {
                TL_stars.StarGift starGift = ((TLRPC.TL_messageActionStarGiftUnique) messageObject.messageOwner.action).gift;
                callback2.run(starGift, new ai.e0(h7Var, messageObject, arrayList, starGift, 6));
                return;
            }
            callback2.run(null, null);
            ca.y(h7Var.currentAccount, false).P();
            t9 G = ca.y(h7Var.currentAccount, false).G(UserConfig.getInstance(h7Var.currentAccount).getClientUserId(), false);
            if (G != null) {
                G.k(arrayList, null);
            }
        } else if (tL_error != null) {
            if ("STARGIFT_CRAFT_UNAVAILABLE".equalsIgnoreCase(tL_error.text)) {
                alertDialog$Builder = new AlertDialog$Builder(h7Var.getContext(), 0, new di.b());
                String string = LocaleController.getString(R.string.GiftCraftUnavailableTitle);
                org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
                e2Var.R = string;
                e2Var.T = AndroidUtilities.replaceTags(LocaleController.getString(R.string.GiftCraftUnavailableText));
                i10 = R.string.OK;
            } else {
                String str = tL_error.text;
                if (str != null && str.startsWith("STARGIFT_CRAFT_TOO_EARLY_")) {
                    long parseLong = Long.parseLong(tL_error.text.substring(25)) + ConnectionsManager.getInstance(h7Var.currentAccount).getCurrentTime();
                    alertDialog$Builder = new AlertDialog$Builder(h7Var.getContext(), 0, new di.b());
                    String string2 = LocaleController.getString(R.string.GiftCraftUnavailableTitle);
                    org.telegram.ui.ActionBar.e2 e2Var2 = alertDialog$Builder.f22369a;
                    e2Var2.R = string2;
                    e2Var2.T = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCraftUnavailableTextTime, LocaleController.formatDateTime(parseLong, true)));
                    i10 = R.string.OK;
                } else {
                    h7Var.getBulletinFactory().g0(tL_error, false);
                    runnable.run();
                }
            }
            org.telegram.messenger.t.p(i10, alertDialog$Builder, null);
            runnable.run();
        }
    }

    public static void g1(h7 h7Var) {
        Bundle bundle = new Bundle();
        long j10 = h7Var.X;
        if (j10 >= 0) {
            bundle.putLong("user_id", j10);
        } else {
            bundle.putLong("chat_id", -j10);
        }
        if (j10 == UserConfig.getInstance(h7Var.currentAccount).getClientUserId()) {
            bundle.putBoolean("my_profile", true);
        }
        bundle.putBoolean("open_gifts", true);
        bundle.putBoolean("open_gifts_upgradable", true);
        D2(new ProfileActivity(bundle, null));
    }

    public static void h0(h7 h7Var, qf.c cVar, vg.n1 n1Var, String str) {
        org.telegram.ui.Components.wc bulletinFactory;
        cVar.c(false);
        if (!TextUtils.isEmpty(str)) {
            if (n1Var != null) {
                bulletinFactory = new org.telegram.ui.Components.wc(n1Var.container, h7Var.resourcesProvider);
            } else {
                bulletinFactory = h7Var.getBulletinFactory();
            }
            bulletinFactory.f0(str, false);
        }
    }

    public static void h1(h7 h7Var, String str) {
        Context context = h7Var.getContext();
        qf.d.t(context, MessagesController.getInstance(h7Var.currentAccount).tonBlockchainExplorerUrl + str);
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

    public static void i0(h7 h7Var, ArrayList arrayList, Utilities.Callback2 callback2, Runnable runnable) {
        zh.f4 f4Var = h7Var.W0;
        if (f4Var != null) {
            f4Var.b();
            h7Var.W0 = null;
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
        ConnectionsManager.getInstance(h7Var.currentAccount).sendRequestTyped(craftstargift, new Object(), new s2(h7Var, callback2, arrayList, runnable, 0));
    }

    public static void i1(h7 h7Var, boolean[] zArr, TL_stars.StarGiftAttribute starGiftAttribute, org.telegram.ui.Components.yc[] ycVarArr) {
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        TL_stars.StarGift V1 = h7Var.V1();
        GiftAuctionController.getInstance(h7Var.currentAccount).requestAuctionUpgrades(V1.gift_id, new b3(h7Var, V1, starGiftAttribute, ycVarArr, zArr, 0));
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

    public static void j0(h7 h7Var, String str) {
        h7Var.dismiss();
        Context context = h7Var.getContext();
        qf.d.r(context, "https://" + MessagesController.getInstance(h7Var.currentAccount).linkPrefix + "/" + str);
    }

    public static void j1(h7 h7Var) {
        final boolean z10;
        TLRPC.InputPeer inputPeer;
        final TL_stars.TL_starGiftUnique e22 = h7Var.e2();
        if (e22 != null && !TextUtils.isEmpty(e22.slug)) {
            if (e22.host_id == null) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (h7Var.f4770w1 == null) {
                h7Var.f4770w1 = Boolean.valueOf(!z10);
            }
            h7Var.O2(e22, z10);
            final int i10 = h7Var.f4768v1 + 1;
            h7Var.f4768v1 = i10;
            TL_stars.displayStarGift displaystargift = new TL_stars.displayStarGift();
            if (z10) {
                inputPeer = MessagesController.getInstance(h7Var.currentAccount).getInputPeer(UserConfig.getInstance(h7Var.currentAccount).getClientUserId());
            } else {
                inputPeer = null;
            }
            displaystargift.peer = inputPeer;
            displaystargift.slug = e22.slug;
            ConnectionsManager.getInstance(h7Var.currentAccount).sendRequestTyped(displaystargift, new Object(), new Utilities.Callback2() {
                @Override
                public final void run(Object obj, Object obj2) {
                    String str;
                    TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                    boolean z11 = ((TLRPC.Bool) obj) instanceof TLRPC.TL_boolTrue;
                    h7 h7Var2 = h7.this;
                    if (z11) {
                        h7Var2.f4770w1 = Boolean.valueOf(z10);
                        return;
                    }
                    if (i10 != h7Var2.f4768v1) {
                        return;
                    }
                    h7Var2.O2(e22, h7Var2.f4770w1.booleanValue());
                    org.telegram.ui.Components.wc bulletinFactory = h7Var2.getBulletinFactory();
                    if (tL_error != null) {
                        str = tL_error.text;
                    } else {
                        str = "NULL_ERROR";
                    }
                    bulletinFactory.f0(str, false);
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
                if (!(emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) || ((TLRPC.TL_emojiStatusCollectible) emojiStatus).collectible_id != tL_starGiftUnique.f22257id) {
                    return false;
                }
                return true;
            }
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-peerDialogId));
            if (chat != null) {
                TLRPC.EmojiStatus emojiStatus2 = chat.emoji_status;
                if ((emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible) && ((TLRPC.TL_emojiStatusCollectible) emojiStatus2).collectible_id == tL_starGiftUnique.f22257id) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void k0(h7 h7Var, TLObject tLObject, long j10, long j11, Utilities.Callback callback, TLRPC.TL_error tL_error, long j12) {
        if (tLObject instanceof TLRPC.TL_payments_paymentResult) {
            TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) tLObject;
            MessagesController.getInstance(h7Var.currentAccount).putUsers(tL_payments_paymentResult.updates.users, false);
            MessagesController.getInstance(h7Var.currentAccount).putChats(tL_payments_paymentResult.updates.chats, false);
            ca.y(h7Var.currentAccount, false).T(false);
            ca.y(h7Var.currentAccount, false).Q(j10);
            ca.y(h7Var.currentAccount, false).Q(j11);
            ca.y(h7Var.currentAccount, false).P();
            callback.run(null);
            org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
            if (U != null) {
                if (j10 >= 0 && j11 >= 0) {
                    wn ea2 = wn.ea(j10);
                    ea2.whenFullyVisible(new s3(h7Var, ea2, j10, 1));
                    U.presentFragment(ea2);
                } else {
                    org.telegram.ui.Components.qc M = org.telegram.ui.Components.wc.b0(U).M(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, h7Var.W1(), DialogObject.getShortName(j10))), R.raw.forward);
                    M.f31872u = true;
                    M.j();
                }
            }
            Utilities.stageQueue.postRunnable(new c4(h7Var, tL_payments_paymentResult, 1));
        } else if (tL_error != null && "BALANCE_TOO_LOW".equals(tL_error.text)) {
            if (!MessagesController.getInstance(h7Var.currentAccount).starsPurchaseAvailable()) {
                h7Var.f4747k0.setLoading(false);
                ca.e0(h7Var.getContext(), h7Var.resourcesProvider);
                return;
            }
            ca y3 = ca.y(h7Var.currentAccount, false);
            a3.h0 h0Var = new a3.h0(h7Var, j12, j10, callback, 1);
            y3.e = false;
            y3.q(false, true, h0Var);
            y3.e = true;
        } else {
            callback.run(tL_error);
            h7Var.getBulletinFactory().g0(tL_error, false);
        }
    }

    public static void k1(h7 h7Var, org.telegram.ui.ActionBar.e2 e2Var, TLObject tLObject, long j10, long j11, long j12, TLRPC.TL_error tL_error) {
        e2Var.c(400L);
        org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
        if (U == null) {
            return;
        }
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            h7Var.dismiss();
            ca.y(h7Var.currentAccount, false).Q(j10);
            if (j10 >= 0) {
                TLRPC.UserFull userFull = MessagesController.getInstance(h7Var.currentAccount).getUserFull(j11);
                if (userFull != null) {
                    int max = Math.max(0, userFull.stargifts_count - 1);
                    userFull.stargifts_count = max;
                    if (max <= 0) {
                        userFull.flags2 &= -257;
                    }
                }
                ca.y(h7Var.currentAccount, false).P();
                ca.y(h7Var.currentAccount, false).T(true);
                if (!(U instanceof dd)) {
                    dd ddVar = new dd();
                    ddVar.whenFullyVisible(new r3(ddVar, j12, 0));
                    U.presentFragment(ddVar);
                    return;
                }
                org.telegram.ui.Components.wc.b0(U).M(LocaleController.getString(R.string.Gift2ConvertedTitle), LocaleController.formatPluralStringComma("Gift2Converted", (int) j12), R.raw.stars_topup).k(true);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -j10);
            bundle.putBoolean("start_from_monetization", true);
            y91 y91Var = new y91(bundle);
            m0.g(h7Var.currentAccount).h(j10, true);
            m0.g(h7Var.currentAccount).l(j10);
            y91Var.whenFullyVisible(new r3(y91Var, j12, 1));
            U.presentFragment(y91Var);
        } else if (tL_error != null) {
            h7Var.getBulletinFactory().t(LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text), null).k(false);
        } else {
            h7Var.getBulletinFactory().t(LocaleController.getString(R.string.UnknownError), null).k(false);
        }
    }

    public static void l0(h7 h7Var, String str) {
        Context context = h7Var.getContext();
        qf.d.t(context, MessagesController.getInstance(h7Var.currentAccount).tonBlockchainExplorerUrl + str);
    }

    public static void l1(h7 h7Var, TLObject tLObject, a3.l0 l0Var, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.TL_messages_chatFull) {
            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject;
            MessagesController.getInstance(h7Var.currentAccount).putUsers(tL_messages_chatFull.users, false);
            MessagesController.getInstance(h7Var.currentAccount).putChats(tL_messages_chatFull.chats, false);
            MessagesController.getInstance(h7Var.currentAccount).putChatFull(tL_messages_chatFull.full_chat);
            if (!tL_messages_chatFull.full_chat.stargifts_available) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(h7Var.getContext(), 0, h7Var.resourcesProvider);
                alertDialog$Builder.f22369a.R = LocaleController.getString(R.string.Gift2ChannelDoesntSupportGiftsTitle);
                alertDialog$Builder.f22369a.T = LocaleController.getString(R.string.Gift2ChannelDoesntSupportGiftsText);
                org.telegram.messenger.t.p(R.string.OK, alertDialog$Builder, null);
                return;
            }
            l0Var.run();
            return;
        }
        org.telegram.ui.Components.qc Z = h7Var.getBulletinFactory().Z(tL_error);
        Z.f31872u = true;
        Z.j();
    }

    public static void m1(h7 h7Var, qf.c cVar, TLObject tLObject, long j10, TLRPC.TL_error tL_error) {
        boolean z10;
        cVar.c(false);
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            if (j10 >= 0) {
                TLRPC.UserFull userFull = MessagesController.getInstance(h7Var.currentAccount).getUserFull(j10);
                if (userFull != null) {
                    int max = Math.max(0, userFull.stargifts_count - 1);
                    userFull.stargifts_count = max;
                    if (max <= 0) {
                        userFull.flags2 &= -257;
                    }
                }
            } else {
                TLRPC.ChatFull chatFull = MessagesController.getInstance(h7Var.currentAccount).getChatFull(-j10);
                if (chatFull != null) {
                    int max2 = Math.max(0, chatFull.stargifts_count - 1);
                    chatFull.stargifts_count = max2;
                    if (max2 <= 0) {
                        chatFull.flags2 &= -262145;
                    }
                }
            }
            if (h7Var.F0 != null) {
                ca y3 = ca.y(h7Var.currentAccount, false);
                TL_stars.SavedStarGift savedStarGift = h7Var.F0;
                if (savedStarGift != null) {
                    t9 G = y3.G(j10, false);
                    if (G != null) {
                        G.l(savedStarGift);
                    }
                    q9 q9Var = (q9) y3.K.get(j10);
                    if (q9Var != null) {
                        ArrayList arrayList = q9Var.e;
                        int size = arrayList.size();
                        boolean z11 = false;
                        int i10 = 0;
                        while (i10 < size) {
                            Object obj = arrayList.get(i10);
                            i10++;
                            TL_stars.TL_starGiftCollection tL_starGiftCollection = (TL_stars.TL_starGiftCollection) obj;
                            t9 e = q9Var.e(tL_starGiftCollection.collection_id);
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
                                q9Var.n(tL_starGiftCollection.collection_id);
                            }
                        }
                        t9 t9Var = q9Var.f5295g;
                        if (t9Var != null) {
                            t9Var.l(savedStarGift);
                        }
                        if (z11) {
                            q9Var.j();
                            NotificationCenter.getInstance(q9Var.f5291a).lambda$postNotificationNameOnUIThread$1(NotificationCenter.starUserGiftCollectionsLoaded, Long.valueOf(q9Var.f5292b), q9Var);
                        }
                    }
                }
            } else {
                ca.y(h7Var.currentAccount, false).Q(j10);
            }
            h7Var.dismiss();
            AndroidUtilities.runOnUIThread(new ag.c(3));
        } else if (tL_error != null) {
            h7Var.getBulletinFactory().g0(tL_error, false);
        } else {
            h7Var.getBulletinFactory().t(LocaleController.getString(R.string.UnknownError), null).k(false);
        }
    }

    public static void n0(h7 h7Var, qf.c cVar, vg.n1 n1Var, q3 q3Var, TL_stars.starGiftDepositPayload stargiftdepositpayload, TLRPC.TL_error tL_error) {
        org.telegram.ui.Components.wc bulletinFactory;
        if (stargiftdepositpayload == null) {
            cVar.b();
            if (n1Var != null) {
                bulletinFactory = new org.telegram.ui.Components.wc(n1Var.container, h7Var.resourcesProvider);
            } else {
                bulletinFactory = h7Var.getBulletinFactory();
            }
            bulletinFactory.g0(tL_error, false);
            return;
        }
        q3Var.run(stargiftdepositpayload);
    }

    public static void n1(h7 h7Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, final String str) {
        final long j10 = tL_starGiftUnique.gift_id;
        final String str2 = tL_starGiftUnique.title;
        final String W1 = h7Var.W1();
        final TLRPC.Document document = tL_starGiftUnique.getDocument();
        String str3 = tL_starGiftUnique.slug;
        final org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(ApplicationLoader.applicationContext, 3, null);
        e2Var.r(500L);
        TL_stars.getUniqueStarGiftValueInfo getuniquestargiftvalueinfo = new TL_stars.getUniqueStarGiftValueInfo();
        getuniquestargiftvalueinfo.slug = str3;
        ConnectionsManager.getInstance(h7Var.currentAccount).sendRequest(getuniquestargiftvalueinfo, new RequestDelegate() {
            @Override
            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                final h7 h7Var2 = h7.this;
                final org.telegram.ui.ActionBar.e2 e2Var2 = e2Var;
                final TLRPC.Document document2 = document;
                final String str4 = str;
                final String str5 = str2;
                final String str6 = W1;
                final long j11 = j10;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        h7.o0(h7.this, e2Var2, tLObject, document2, str4, str5, str6, j11, tL_error);
                    }
                });
            }
        });
    }

    public static void o0(h7 h7Var, org.telegram.ui.ActionBar.e2 e2Var, TLObject tLObject, TLRPC.Document document, String str, String str2, String str3, long j10, TLRPC.TL_error tL_error) {
        x01 x01Var;
        LinearLayout linearLayout;
        CharSequence charSequence;
        float f7;
        float f10;
        int round;
        e2Var.dismiss();
        if (tLObject instanceof TL_stars.UniqueStarGiftValueInfo) {
            TL_stars.UniqueStarGiftValueInfo uniqueStarGiftValueInfo = (TL_stars.UniqueStarGiftValueInfo) tLObject;
            org.telegram.ui.ActionBar.k3 i10 = wh.i(1, h7Var.getContext(), h7Var.resourcesProvider, false);
            LinearLayout linearLayout2 = new LinearLayout(h7Var.getContext());
            linearLayout2.setOrientation(1);
            linearLayout2.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
            linearLayout2.setClipChildren(false);
            linearLayout2.setClipToPadding(false);
            org.telegram.ui.Components.y9 y9Var = new org.telegram.ui.Components.y9(h7Var.getContext());
            dd.Y0(y9Var.getImageReceiver(), document, 160);
            linearLayout2.addView(y9Var, kb1.x(160, 160, 1, 0, 0, 0, 0));
            TextView textView = new TextView(h7Var.getContext());
            textView.setTextSize(1, 20.0f);
            org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.Sh, h7Var.resourcesProvider);
            textView.setTypeface(AndroidUtilities.bold());
            textView.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
            int dp = AndroidUtilities.dp(21.0f);
            int i11 = org.telegram.ui.ActionBar.y6.Oh;
            ShapeDrawable c02 = org.telegram.ui.ActionBar.y6.c0(dp, org.telegram.ui.ActionBar.y6.w0(i11, h7Var.resourcesProvider));
            org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i11);
            org.telegram.ui.ActionBar.u6 u6Var = h7Var.resourcesProvider;
            textView.setBackground(c02);
            org.telegram.ui.ActionBar.f7.k(textView, c02, N, null, u6Var);
            textView.setGravity(17);
            linearLayout2.addView(textView, kb1.x(-2, 42, 1, 0, 12, 0, 15));
            textView.setText(str);
            TextView textView2 = new TextView(h7Var.getContext());
            textView2.setTextSize(1, 14.0f);
            org.telegram.ui.ActionBar.f7.V(textView2, org.telegram.ui.ActionBar.y6.f23465j5, h7Var.resourcesProvider);
            textView2.setGravity(17);
            linearLayout2.addView(textView2, kb1.x(-2, -2, 1, 16, 0, 16, 19));
            if (uniqueStarGiftValueInfo.value_is_average) {
                wh.o(R.string.GiftValueAverage, new Object[]{str2}, textView2);
            } else if (uniqueStarGiftValueInfo.last_sale_on_fragment) {
                wh.o(R.string.GiftValueLastFragment, new Object[]{str3}, textView2);
            } else {
                wh.o(R.string.GiftValueLastTelegram, new Object[]{str3}, textView2);
            }
            FrameLayout frameLayout = new FrameLayout(h7Var.getContext());
            frameLayout.setClipChildren(false);
            frameLayout.setClipToPadding(false);
            t0 t0Var = new t0(h7Var, new fi.v3[1], frameLayout, 1);
            x01 x01Var2 = new x01(h7Var.getContext(), h7Var.resourcesProvider);
            frameLayout.addView(x01Var2, kb1.i(-1, -1, 119));
            x01Var2.c(LocaleController.getString(R.string.GiftValueInitialSale), LocaleController.formatYearMonthDay(uniqueStarGiftValueInfo.initial_sale_date, true), null, null);
            String string = LocaleController.getString(R.string.GiftValueInitialPrice);
            StringBuilder sb2 = new StringBuilder("⭐️");
            sb2.append(uniqueStarGiftValueInfo.initial_sale_stars);
            sb2.append(" (~");
            x01Var2.c(string, dd.W0(false, a1.g.s(sb2, BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.initial_sale_price, uniqueStarGiftValueInfo.currency), ")"), 0.8f, null), null, null);
            if (TLObject.hasFlag(uniqueStarGiftValueInfo.flags, 1)) {
                x01Var2.c(LocaleController.getString(R.string.GiftValueLastSale), LocaleController.formatYearMonthDay(uniqueStarGiftValueInfo.last_sale_date, true), null, null);
                if (((int) (Math.round((uniqueStarGiftValueInfo.last_sale_price / uniqueStarGiftValueInfo.initial_sale_price) * 1000.0d) / 10)) - 100 > 0) {
                    x01Var2.e(LocaleController.getString(R.string.GiftValueLastPrice), BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.last_sale_price, uniqueStarGiftValueInfo.currency), "+" + LocaleController.formatNumber(round, ' ') + "%", null, null);
                } else {
                    x01Var2.c(LocaleController.getString(R.string.GiftValueLastPrice), BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.last_sale_price, uniqueStarGiftValueInfo.currency), null, null);
                }
            }
            if (TLObject.hasFlag(uniqueStarGiftValueInfo.flags, 4)) {
                o3 o3Var = new o3(t0Var, r10, uniqueStarGiftValueInfo, str2, 0);
                x01Var = x01Var2;
                TableRow e = x01Var.e(LocaleController.getString(R.string.GiftValueMinPrice), BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.floor_price, uniqueStarGiftValueInfo.currency), "?", o3Var, null);
                org.telegram.ui.Components.yc[] ycVarArr = {(org.telegram.ui.Components.yc) ((u01) e.getChildAt(1)).getChildAt(0)};
                e.setOnClickListener(new ai.s(o3Var, 7));
            } else {
                x01Var = x01Var2;
            }
            if (TLObject.hasFlag(uniqueStarGiftValueInfo.flags, 8)) {
                o3 o3Var2 = new o3(t0Var, r10, uniqueStarGiftValueInfo, str2, 1);
                TableRow e10 = x01Var.e(LocaleController.getString(R.string.GiftValueAveragePrice), BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.average_price, uniqueStarGiftValueInfo.currency), "?", o3Var2, null);
                org.telegram.ui.Components.yc[] ycVarArr2 = {(org.telegram.ui.Components.yc) ((u01) e10.getChildAt(1)).getChildAt(0)};
                e10.setOnClickListener(new ai.s(o3Var2, 8));
            }
            linearLayout2.addView(frameLayout, kb1.x(-1, -2, 7, 0, 0, 0, 12));
            if (uniqueStarGiftValueInfo.listed_count > 0) {
                fi.d dVar = new fi.d(h7Var.getContext(), h7Var.resourcesProvider, false);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                f7 = 1.0f;
                f10 = 2.0f;
                spannableStringBuilder.append((CharSequence) LocaleController.formatNumber(uniqueStarGiftValueInfo.listed_count, ' '));
                spannableStringBuilder.append((CharSequence) " ");
                spannableStringBuilder.append((CharSequence) "e");
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.c6(document, 1.5f, dVar.getTextPaint().getFontMetricsInt()), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                spannableStringBuilder.append((CharSequence) " ");
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.GiftValueOnSaleTelegram));
                dVar.i(AndroidUtilities.replaceArrows(spannableStringBuilder, false, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f)), false, true);
                charSequence = " ";
                linearLayout = linearLayout2;
                dVar.setOnClickListener(new p3(h7Var, str2, j10, 0));
                linearLayout.addView(dVar, kb1.x(-1, 42, 7, 0, 0, 0, 2));
            } else {
                linearLayout = linearLayout2;
                charSequence = " ";
                f7 = 1.0f;
                f10 = 2.0f;
            }
            if (uniqueStarGiftValueInfo.fragment_listed_count > 0) {
                fi.d dVar2 = new fi.d(h7Var.getContext(), h7Var.resourcesProvider, false);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                spannableStringBuilder2.append((CharSequence) LocaleController.formatNumber(uniqueStarGiftValueInfo.fragment_listed_count, ' '));
                spannableStringBuilder2.append((CharSequence) "e");
                spannableStringBuilder2.setSpan(new org.telegram.ui.Components.c6(document, 1.5f, dVar2.getTextPaint().getFontMetricsInt()), spannableStringBuilder2.length() - 1, spannableStringBuilder2.length(), 33);
                spannableStringBuilder2.append(charSequence);
                spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.GiftValueOnSaleFragment));
                dVar2.i(AndroidUtilities.replaceArrows(spannableStringBuilder2, false, AndroidUtilities.dp(f10), AndroidUtilities.dp(f7)), false, true);
                dVar2.setOnClickListener(new q(6, h7Var, uniqueStarGiftValueInfo));
                linearLayout.addView(dVar2, kb1.x(-1, 42, 7, 0, 0, 0, 0));
            }
            i10.customView = linearLayout;
            i10.show();
        } else if (tL_error != null) {
            h7Var.getBulletinFactory().g0(tL_error, false);
        }
    }

    public static void o1(h7 h7Var, TLObject tLObject, TLRPC.TL_inputInvoiceStarGiftTransfer tL_inputInvoiceStarGiftTransfer, long j10, long j11, Utilities.Callback callback, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            int i10 = 0;
            MessagesController.getInstance(h7Var.currentAccount).putUsers(paymentForm.users, false);
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
            ConnectionsManager.getInstance(h7Var.currentAccount).sendRequest(tL_payments_sendStarsForm, new v2(h7Var, j10, j11, callback, j12));
            return;
        }
        callback.run(tL_error);
        org.telegram.ui.Components.qc Z = h7Var.getBulletinFactory().Z(tL_error);
        Z.f31872u = true;
        Z.j();
    }

    public static void p0(h7 h7Var, long j10) {
        new zh.p1(h7Var.getContext(), h7Var.currentAccount, j10, null, new y3(h7Var, 1)).show();
    }

    public static void p1(h7 h7Var, long j10) {
        new zh.p1(h7Var.getContext(), h7Var.currentAccount, j10, null, new y3(h7Var, 1)).show();
    }

    public static void q0(h7 h7Var) {
        TL_stars.TL_starGiftUnique e22 = h7Var.e2();
        new b1(h7Var.getContext(), h7Var.currentAccount, DialogObject.getPeerDialogId(e22.owner_id), e22, h7Var.resourcesProvider, new a2(h7Var, 4)).show();
    }

    public static void q1(h7 h7Var, TL_stars.InputSavedStarGift inputSavedStarGift, long j10, org.telegram.ui.ActionBar.e2 e2Var) {
        qf.c h = e2Var.h(-1, true, true);
        h.d();
        TL_stars.deleteStarGift deletestargift = new TL_stars.deleteStarGift();
        deletestargift.stargift = inputSavedStarGift;
        ConnectionsManager.getInstance(h7Var.currentAccount).sendRequest(deletestargift, new i3(h7Var, h, j10, 0));
    }

    public static void r0(h7 h7Var, TL_stars.InputSavedStarGift inputSavedStarGift, long j10, long j11, long j12) {
        org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(ApplicationLoader.applicationContext, 3, null);
        e2Var.r(500L);
        TL_stars.convertStarGift convertstargift = new TL_stars.convertStarGift();
        convertstargift.stargift = inputSavedStarGift;
        ConnectionsManager.getInstance(h7Var.currentAccount).sendRequest(convertstargift, new v2(h7Var, e2Var, j10, j11, j12));
    }

    public static void r1(h7 h7Var, TLObject tLObject, CharSequence charSequence, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails, TLRPC.TL_error tL_error) {
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
            LinearLayout linearLayout = new LinearLayout(h7Var.getContext());
            linearLayout.setOrientation(1);
            linearLayout.setPadding(AndroidUtilities.dp(23.0f), 0, AndroidUtilities.dp(23.0f), 0);
            TextView L = kb1.L(h7Var.getContext(), 16.0f, org.telegram.ui.ActionBar.y6.f23465j5, false, null);
            L.setText(LocaleController.getString(R.string.Gift2RemoveDescriptionText));
            linearLayout.addView(L, kb1.o(0.0f, 0.0f, 0.0f, 16.0f, -1, -2));
            x01 x01Var = new x01(h7Var.getContext(), h7Var.resourcesProvider);
            v01 a2 = x01Var.a(charSequence);
            a2.setFilled(true);
            xh.n nVar = (xh.n) a2.getChildAt(0);
            nVar.setTextSize(1, 12.0f);
            nVar.setGravity(17);
            linearLayout.addView(x01Var, kb1.o(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(h7Var.getContext(), 0, h7Var.resourcesProvider);
            alertDialog$Builder.f22369a.R = LocaleController.getString(R.string.Gift2RemoveDescriptionTitle);
            alertDialog$Builder.o(linearLayout);
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.k(dd.P0(LocaleController.formatString(R.string.Gift2RemoveDescriptionButton, Integer.valueOf((int) j10))), new x3(h7Var, tL_starGiftUnique, paymentForm, tL_inputInvoiceStarGiftDropOriginalDetails, j10, charSequence));
            alertDialog$Builder.p();
        } else if (tL_error != null) {
            h7Var.getBulletinFactory().g0(tL_error, false);
        }
    }

    public static void s0(h7 h7Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, bg.a aVar, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(h7Var.currentAccount).lambda$processUpdates$379((TLRPC.Updates) tLObject, false);
            AndroidUtilities.runOnUIThread(new f3(h7Var, tL_starGiftUnique, aVar, runnable, 0));
        } else if (tL_error != null) {
            AndroidUtilities.runOnUIThread(new g3(h7Var, tL_error, runnable, 0));
        }
    }

    public static void s1(h7 h7Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, Utilities.Callback callback, Boolean bool) {
        TL_stars.StarGift starGift;
        if (h7Var.W0 == null) {
            zh.f4 f4Var = new zh.f4(h7Var.currentAccount, tL_starGiftUnique.gift_id);
            h7Var.W0 = f4Var;
            f4Var.a();
        }
        HashSet hashSet = new HashSet();
        int i10 = 0;
        while (true) {
            x5[] x5VarArr = h7Var.f4737f0.M.f5844n;
            if (i10 < x5VarArr.length) {
                TL_stars.StarGift starGift2 = x5VarArr[i10].h;
                if (starGift2 != null) {
                    starGift = starGift2;
                } else {
                    starGift = null;
                }
                if (starGift != null) {
                    if (starGift2 == null) {
                        starGift2 = null;
                    }
                    hashSet.add(Long.valueOf(starGift2.f22257id));
                }
                i10++;
            } else {
                zh.g4 g4Var = new zh.g4(h7Var.getContext(), tL_starGiftUnique.title, h7Var.W0);
                g4Var.f53077g0.addAll(hashSet);
                g4Var.f53079i0.O(true);
                g4Var.f53078h0 = bool.booleanValue();
                g4Var.f53075e0.set(AndroidUtilities.replaceTags(LocaleController.formatPluralString("GiftCraftSelect", 4 - hashSet.size(), new Object[0])));
                g4Var.f53076f0 = new p2(0, callback);
                g4Var.show();
                return;
            }
        }
    }

    public static void t0(h7 h7Var) {
        if (h7Var.f4762s1 == null) {
            return;
        }
        long j10 = 0;
        for (int i10 = 0; i10 < h7Var.f4762s1.invoice.prices.size(); i10++) {
            j10 += h7Var.f4762s1.invoice.prices.get(i10).amount;
        }
        d7 d7Var = new d7(h7Var.getContext(), j10, h7Var.f4756p1, h7Var.resourcesProvider);
        h7Var.f4757q0 = d7Var;
        d7Var.show();
    }

    public static void u0(h7 h7Var, TLRPC.TL_error tL_error, Utilities.Callback callback, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, TLObject tLObject) {
        String str;
        if (h7Var.getContext() != null) {
            if (tL_error != null && callback != null && tL_error.text.startsWith("TMP_PASSWORD")) {
                callback.run(Boolean.TRUE);
                return;
            }
            if (callback != null) {
                callback.run(Boolean.FALSE);
            }
            if (tL_error != null) {
                h7Var.o2(tL_error, twoStepVerificationActivity, z10);
                return;
            }
            if (twoStepVerificationActivity != null) {
                twoStepVerificationActivity.p0();
                twoStepVerificationActivity.finishFragment();
            }
            if (tLObject instanceof TL_stars.starGiftWithdrawalUrl) {
                qf.d.t(h7Var.getContext(), ((TL_stars.starGiftWithdrawalUrl) tLObject).url);
            } else if (tLObject instanceof TLRPC.TL_boolTrue) {
                TL_stars.TL_starGiftUnique e22 = h7Var.e2();
                org.telegram.ui.Wallet.l0 x9 = org.telegram.ui.Wallet.l0.x(h7Var.currentAccount);
                org.telegram.ui.Wallet.g gVar = x9.f36855z;
                if (e22 != null) {
                    str = e22.gift_address;
                } else {
                    str = null;
                }
                AndroidUtilities.cancelRunOnUIThread(gVar);
                x9.f36853x = str;
                x9.f36854y = 0;
                if (x9.f36845o == null) {
                    x9.f36845o = new org.telegram.ui.Wallet.d0(x9);
                }
                org.telegram.ui.Wallet.d0 d0Var = x9.f36845o;
                if (!d0Var.f36472j) {
                    d0Var.b();
                    d0Var.f(true);
                }
                x9.B().g();
                x9.E();
                int i10 = x9.f36854y;
                long[] jArr = org.telegram.ui.Wallet.l0.P;
                if (i10 < 7) {
                    x9.f36854y = i10 + 1;
                    AndroidUtilities.runOnUIThread(gVar, jArr[i10]);
                }
                if (e22 != null && !TextUtils.isEmpty(e22.slug)) {
                    AndroidUtilities.runOnUIThread(new a3.l0(null, e22.getDocument(), LocaleController.getString(R.string.Gift2MovedToWallet), 12));
                }
                h7Var.dismiss();
            } else if (tLObject instanceof TLRPC.TL_boolFalse) {
                org.telegram.ui.Components.wc.c0("NULL_ERROR");
            }
        }
    }

    public static void u1(h7 h7Var, qf.c cVar, org.telegram.ui.ActionBar.e2 e2Var, TLObject tLObject, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.TL_error tL_error, long j10, CharSequence charSequence) {
        boolean z10 = false;
        cVar.c(false);
        e2Var.dismiss();
        if (tLObject instanceof TLRPC.TL_payments_paymentResult) {
            int i10 = 0;
            while (i10 < tL_starGiftUnique.attributes.size()) {
                if (tL_starGiftUnique.attributes.get(i10) instanceof TL_stars.starGiftAttributeOriginalDetails) {
                    tL_starGiftUnique.attributes.remove(i10);
                    i10--;
                }
                i10++;
            }
            TL_stars.SavedStarGift savedStarGift = h7Var.F0;
            if (savedStarGift != null) {
                z10 = savedStarGift.refunded;
            }
            h7Var.M2(tL_starGiftUnique, z10, null, null);
            AndroidUtilities.runOnUIThread(new f2(7, h7Var, tL_starGiftUnique));
        } else if (tL_error != null && "BALANCE_TOO_LOW".equalsIgnoreCase(tL_error.text)) {
            new tc(h7Var.getContext(), h7Var.resourcesProvider, j10, 16, null, new f2(8, h7Var, charSequence), 0L).show();
        } else if (tL_error != null) {
            h7Var.getBulletinFactory().g0(tL_error, false);
        }
    }

    public static void v0(h7 h7Var, TLObject tLObject, boolean z10, TLRPC.Document document, boolean z11, TLRPC.TL_error tL_error, TL_stars.saveStarGift savestargift) {
        q9 F;
        int i10;
        int i11;
        int i12;
        int i13;
        org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
        if (U != null) {
            bh.z0 z0Var = null;
            if (tLObject instanceof TLRPC.TL_boolTrue) {
                h7Var.dismiss();
                long U1 = h7Var.U1();
                if (!z10) {
                    ca.y(h7Var.currentAccount, false).Q(U1);
                }
                if (U1 >= 0) {
                    org.telegram.ui.Components.wc b02 = org.telegram.ui.Components.wc.b0(U);
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
                        z0Var = new bh.z0(U1, U);
                    }
                    b02.s(document, string, AndroidUtilities.replaceSingleTag(string2, z0Var)).k(true);
                    return;
                }
                org.telegram.ui.Components.wc b03 = org.telegram.ui.Components.wc.b0(U);
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
                b03.s(document, string3, LocaleController.getString(i11)).j();
            } else if (tL_error != null) {
                if (z10 && h7Var.F0 != null && (F = ca.y(h7Var.currentAccount, false).F(h7Var.X, false)) != null) {
                    F.m(h7Var.F0, !savestargift.unsave);
                }
                h7Var.getBulletinFactory().t(LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text), null).k(false);
            }
        }
    }

    public static void v1(h7 h7Var, boolean z10) {
        int i10;
        Object obj;
        zh.l2 l2Var;
        zh.l2 l2Var2;
        zh.l2 l2Var3;
        int a2 = h7Var.a2();
        if (a2 >= 0) {
            if (z10) {
                i10 = 1;
            } else {
                i10 = -1;
            }
            int i11 = i10 + a2;
            int i12 = h7Var.U0;
            if (i12 >= 0 && (!z10 ? i12 < a2 : i12 > a2)) {
                i11 = i12;
            }
            u9 u9Var = h7Var.G0;
            if (u9Var != null && i11 >= 0 && i11 < u9Var.f()) {
                obj = h7Var.G0.get(i11);
            } else {
                obj = null;
            }
            if (obj != null) {
                if (z10) {
                    l2Var = h7Var.f4733d0;
                } else {
                    l2Var = h7Var.f4731c0;
                }
                if (l2Var != null) {
                    if (obj instanceof TL_stars.SavedStarGift) {
                        if (z10) {
                            l2Var3 = h7Var.f4733d0;
                        } else {
                            l2Var3 = h7Var.f4731c0;
                        }
                        if (R1(l2Var3.F0, (TL_stars.SavedStarGift) obj)) {
                            return;
                        }
                    }
                    if (obj instanceof TL_stars.TL_starGiftUnique) {
                        if (z10) {
                            l2Var2 = h7Var.f4733d0;
                        } else {
                            l2Var2 = h7Var.f4731c0;
                        }
                        if (S1(l2Var2.J0, (TL_stars.TL_starGiftUnique) obj)) {
                            return;
                        }
                    }
                }
                zh.l2 l2Var4 = new zh.l2(h7Var, h7Var.getContext(), h7Var.currentAccount, h7Var.X, h7Var.resourcesProvider, h7Var.Y.getRootView());
                if (obj instanceof TL_stars.SavedStarGift) {
                    l2Var4.L2((TL_stars.SavedStarGift) obj, h7Var.G0);
                } else if (obj instanceof TL_stars.TL_starGiftUnique) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj;
                    l2Var4.J2(tL_starGiftUnique.slug, tL_starGiftUnique, h7Var.G0);
                }
                AndroidUtilities.removeFromParent(l2Var4.containerView);
                if (z10) {
                    h7Var.f4733d0 = l2Var4;
                } else {
                    h7Var.f4731c0 = l2Var4;
                }
            }
        }
    }

    public static void w0(h7 h7Var, boolean[] zArr, TextView textView, TL_stars.starGiftDepositPayload[] stargiftdepositpayloadArr, Runnable[] runnableArr, TL_stars.starGiftDepositPayload stargiftdepositpayload) {
        Runnable w90Var;
        if (zArr[0]) {
            return;
        }
        if (stargiftdepositpayload == null) {
            textView.setVisibility(8);
            return;
        }
        stargiftdepositpayloadArr[0] = stargiftdepositpayload;
        if (org.telegram.ui.Wallet.l0.x(h7Var.currentAccount).v() < stargiftdepositpayload.amount) {
            textView.setVisibility(8);
            return;
        }
        org.telegram.ui.Wallet.l0 x9 = org.telegram.ui.Wallet.l0.x(h7Var.currentAccount);
        ai.e eVar = new ai.e(textView, 7);
        try {
            boolean[] zArr2 = new boolean[1];
            x9.m0(new org.telegram.ui.Wallet.w6(x9, zArr2, eVar, org.telegram.ui.Wallet.l0.h(stargiftdepositpayload), 4));
            w90Var = new org.telegram.ui.Wallet.m(zArr2, 3);
        } catch (Exception e) {
            org.telegram.ui.Wallet.l0.k("emulateDepositNFT: invalid payload", e);
            AndroidUtilities.runOnUIThread(new yc1(18, eVar, e));
            w90Var = new w90(11);
        }
        runnableArr[0] = w90Var;
    }

    public static void x0(h7 h7Var, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, long j10, MessagesController messagesController, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        h7Var.f4747k0.setLoading(false);
        v4 v4Var = new v4(h7Var, 0);
        tg.j0 j0Var = new tg.j0(26, h7Var.currentAccount, h7Var.getContext(), v4Var, h7Var.resourcesProvider);
        j0Var.K1(canApplyBoost);
        j0Var.J1(tL_premium_boostsStatus, true);
        j0Var.L1(j10);
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(-j10));
        if (chat != null) {
            j0Var.Q0 = new k3(h7Var, chat);
        }
        j0Var.show();
    }

    public static void x1(h7 h7Var, final View view) {
        fi.lb lbVar;
        LaunchActivity launchActivity = LaunchActivity.I1;
        if (launchActivity != null) {
            if (view instanceof org.telegram.ui.Cells.k7) {
                lbVar = fi.nb.b((org.telegram.ui.Cells.k7) view);
            } else {
                lbVar = null;
            }
            ArrayList arrayList = new ArrayList();
            MessageObject messageObject = h7Var.H0;
            if (messageObject != null) {
                arrayList.add(messageObject);
            } else if (h7Var.V1() instanceof TL_stars.TL_starGiftUnique) {
                long clientUserId = UserConfig.getInstance(h7Var.currentAccount).getClientUserId();
                TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                tL_messageService.peer_id = MessagesController.getInstance(h7Var.currentAccount).getPeer(clientUserId);
                tL_messageService.from_id = MessagesController.getInstance(h7Var.currentAccount).getPeer(clientUserId);
                tL_messageService.date = ConnectionsManager.getInstance(h7Var.currentAccount).getCurrentTime();
                TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = new TLRPC.TL_messageActionStarGiftUnique();
                tL_messageActionStarGiftUnique.gift = (TL_stars.TL_starGiftUnique) h7Var.V1();
                tL_messageActionStarGiftUnique.upgrade = true;
                tL_messageService.action = tL_messageActionStarGiftUnique;
                MessageObject messageObject2 = new MessageObject(h7Var.currentAccount, tL_messageService, false, false);
                messageObject2.setType();
                arrayList.add(messageObject2);
            } else {
                return;
            }
            final fi.sb D = fi.sb.D(launchActivity, h7Var.currentAccount);
            D.R = new Utilities.Callback4() {
                @Override
                public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
                    Long l4 = (Long) obj;
                    Runnable runnable = (Runnable) obj2;
                    Long l10 = (Long) obj4;
                    boolean booleanValue = ((Boolean) obj3).booleanValue();
                    fi.sb sbVar = D;
                    fi.lb lbVar2 = null;
                    if (booleanValue) {
                        h7 h7Var2 = h7.this;
                        AndroidUtilities.runOnUIThread(new f2(1, h7Var2, l10));
                        sbVar.X(null);
                        w4 w4Var = h7Var2.Z0;
                        if (w4Var != null) {
                            w4Var.dismiss();
                            h7Var2.Z0 = null;
                        }
                    } else {
                        View view2 = view;
                        if ((view2 instanceof org.telegram.ui.Cells.k7) && view2.isAttachedToWindow()) {
                            lbVar2 = fi.nb.b((org.telegram.ui.Cells.k7) view2);
                        }
                        sbVar.X(lbVar2);
                    }
                    AndroidUtilities.runOnUIThread(runnable);
                }
            };
            D.T(lbVar, fi.w7.y(arrayList));
        }
    }

    public static void y0(long j10, long j11, h7 h7Var, Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error) {
        long j12;
        h7 h7Var2;
        callback.run(tL_error);
        org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
        if (U != null) {
            if (tLObject instanceof TLRPC.Updates) {
                if (j10 >= 0 && j11 >= 0) {
                    wn ea2 = wn.ea(j10);
                    j12 = j10;
                    h7Var2 = h7Var;
                    ea2.whenFullyVisible(new s3(h7Var2, ea2, j12, 0));
                    U.presentFragment(ea2);
                } else {
                    j12 = j10;
                    h7Var2 = h7Var;
                    org.telegram.ui.Components.qc M = org.telegram.ui.Components.wc.b0(U).M(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, h7Var2.W1(), DialogObject.getShortName(j12))), R.raw.forward);
                    M.f31872u = true;
                    M.j();
                }
            } else {
                j12 = j10;
                h7Var2 = h7Var;
                org.telegram.ui.Components.wc.b0(U).g0(tL_error, false);
            }
        } else {
            j12 = j10;
            h7Var2 = h7Var;
        }
        ca.y(h7Var2.currentAccount, false).Q(j12);
        ca.y(h7Var2.currentAccount, false).Q(j11);
    }

    public static void z0(h7 h7Var, String str) {
        Context context = h7Var.getContext();
        qf.d.t(context, MessagesController.getInstance(h7Var.currentAccount).tonBlockchainExplorerUrl + str);
    }

    public final void A2() {
        throw new UnsupportedOperationException("Method not decompiled: bi.h7.A2():void");
    }

    public final void B2() {
        TL_stars.TL_starGiftUnique e22 = e2();
        if (this.f4738f1 != null && e22 != null && !TextUtils.isEmpty(e22.slug)) {
            Context context = getContext();
            int i10 = this.currentAccount;
            vg.n1[] n1VarArr = {new vg.n1(context, i10, BirthdayController.getInstance(i10).getState(), 3, this.resourcesProvider)};
            vg.n1 n1Var = n1VarArr[0];
            n1Var.f50268z0 = LocaleController.getString(R.string.Gift2TransferShort);
            org.telegram.ui.Components.xa xaVar = n1Var.e;
            if (xaVar != null) {
                xaVar.setTitle(n1Var.y());
            }
            vg.g1 g1Var = n1Var.f50245b0;
            if (g1Var != null) {
                g1Var.setText(n1Var.y());
            }
            vg.n1 n1Var2 = n1VarArr[0];
            n1Var2.G0 = true;
            n1Var2.h0(false, true);
            vg.n1 n1Var3 = n1VarArr[0];
            n1Var3.B0 = new ai.n1(1, this, n1VarArr);
            n1Var3.show();
        }
    }

    public final void C2(final TL_stars.TL_starGiftUnique tL_starGiftUnique, final long j10, final bg.b bVar, final TLRPC.TL_textWithEntities tL_textWithEntities, final boolean z10, final zh.i0 i0Var) {
        this.f4747k0.setLoading(true);
        if (i0Var != null && !i0Var.L) {
            i0Var.L = true;
            i0Var.H.h(true);
        }
        ca.x(this.currentAccount, bVar).H(tL_starGiftUnique, j10, tL_textWithEntities, z10, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                h7.G0(h7.this, i0Var, bVar, tL_starGiftUnique, j10, tL_textWithEntities, z10, (TLRPC.TL_payments_paymentFormStarGift) obj);
            }
        });
    }

    public final SpannableStringBuilder E2(TLRPC.Peer peer) {
        if (peer != null) {
            String publicUsername = DialogObject.getPublicUsername(MessagesController.getInstance(this.currentAccount).getUserOrChat(DialogObject.getPeerDialogId(peer)));
            if (TextUtils.isEmpty(publicUsername)) {
                return null;
            }
            return AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.Gift2ReleasedBy2, b10.j("@", publicUsername)), new b4(this, publicUsername, 8));
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
        o6 o6Var;
        TL_stars.StarGiftAttribute starGiftAttribute2;
        h7 h7Var;
        ai.e0 e0Var;
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
        if (!this.Q0 && ((o6Var = this.P0) == null || !o6Var.f5189o)) {
            boolean[] zArr = new boolean[1];
            org.telegram.ui.Components.yc[] ycVarArr = new org.telegram.ui.Components.yc[1];
            Integer[] numArr = new Integer[1];
            String d22 = d2(starGiftAttribute.rarity, numArr);
            if (starGiftAttribute.rarity instanceof TL_stars.TL_starGiftAttributeRarity) {
                starGiftAttribute2 = starGiftAttribute;
                e0Var = new ai.e0(this, zArr, starGiftAttribute2, ycVarArr, 5);
                h7Var = this;
            } else {
                starGiftAttribute2 = starGiftAttribute;
                h7Var = this;
                e0Var = null;
            }
            ycVarArr[0] = (org.telegram.ui.Components.yc) ((u01) h7Var.f4743i0.e(string, starGiftAttribute2.name, d22, e0Var, numArr[0]).getChildAt(1)).getChildAt(0);
            return;
        }
        t6 t6Var = new t6(getContext(), this.resourcesProvider, new j2(this, 0));
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        x01 x01Var = this.f4743i0;
        tableRow.addView(new w01(x01Var, string), layoutParams);
        tableRow.addView(new u01(x01Var, t6Var, true), new TableRow.LayoutParams(0, -1, 1.0f));
        x01Var.addView(tableRow);
        o6 o6Var2 = this.P0;
        if (o6Var2 != null) {
            if (!z10) {
                o6Var2.d = t6Var;
            }
            if (z10) {
                o6Var2.f5180c = t6Var;
            }
            if (z10) {
                o6Var2.f5179b = t6Var;
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
        org.telegram.ui.ActionBar.u6 u6Var = this.resourcesProvider;
        PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
        org.telegram.ui.ActionBar.f7.t(imageView, i12, u6Var, mode);
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
        linearLayout.addView(imageView, kb1.x(i11, i11, 16, i13, 0, i14, 0));
        TextView textView = new TextView(getContext());
        textView.setTextSize(1, 13.0f);
        int i15 = org.telegram.ui.ActionBar.y6.f23615r5;
        org.telegram.ui.ActionBar.f7.V(textView, i15, this.resourcesProvider);
        textView.setText(str);
        linearLayout.addView(textView, kb1.x(-2, -2, 16, 4, 0, 0, 0));
        if (z10) {
            ImageView imageView2 = new ImageView(getContext());
            imageView2.setScaleType(scaleType);
            imageView2.setImageResource(R.drawable.msg_mini_topicarrow);
            org.telegram.ui.ActionBar.f7.t(imageView2, i15, this.resourcesProvider, mode);
            linearLayout.addView(imageView2, kb1.x(11, 11, 16, 5, 0, 2, 0));
        }
    }

    public final void I2(TLRPC.InputCheckPasswordSRP inputCheckPasswordSRP, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10) {
        TL_account.getTmpPassword gettmppassword = new TL_account.getTmpPassword();
        gettmppassword.password = inputCheckPasswordSRP;
        gettmppassword.period = 600;
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(gettmppassword, new h4(this, twoStepVerificationActivity, z10, 0));
    }

    public final void J1(TL_stars.InputSavedStarGift inputSavedStarGift, TLRPC.Updates updates, Runnable runnable) {
        TLRPC.Message message;
        TL_stars.StarGift starGift;
        if (updates == null) {
            ca.y(this.currentAccount, false).Q(U1());
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
                    savedStarGift2.msg_id = message.f22049id;
                    savedStarGift2.flags = (savedStarGift2.flags | 8) & (-2049);
                    savedStarGift2.saved_id = 0L;
                    savedStarGift2.unsaved = !tL_messageActionStarGiftUnique.saved;
                    savedStarGift2.refunded = tL_messageActionStarGiftUnique.refunded;
                    savedStarGift2.can_upgrade = false;
                    savedStarGift2.can_resell_at = tL_messageActionStarGiftUnique.can_resell_at;
                    savedStarGift2.can_transfer_at = tL_messageActionStarGiftUnique.can_transfer_at;
                    savedStarGift2.can_export_at = tL_messageActionStarGiftUnique.can_export_at;
                    L2(savedStarGift2, this.G0);
                    this.f4754o1 = null;
                    this.Q0 = false;
                    u9 u9Var = this.G0;
                    if (u9Var != null) {
                        u9Var.e();
                    } else {
                        ca.y(this.currentAccount, false).Q(this.X);
                    }
                    AndroidUtilities.runOnUIThread(runnable);
                    return;
                }
            }
            if (this.G0 == null) {
                ca.y(this.currentAccount, false).Q(U1());
            }
            this.Q0 = true;
            this.F0 = null;
            this.E0 = false;
            MessageObject messageObject = new MessageObject(this.currentAccount, message, false, false);
            messageObject.setType();
            K2(messageObject, this.G0);
            this.f4754o1 = null;
            this.Q0 = false;
            AndroidUtilities.runOnUIThread(runnable);
            return;
        }
        ca.y(this.currentAccount, false).Q(U1());
        dismiss();
    }

    public final void J2(String str, TL_stars.TL_starGiftUnique tL_starGiftUnique, u9 u9Var) {
        boolean z10;
        boolean z11;
        o6 o6Var;
        TL_stars.TL_starGiftUnique tL_starGiftUnique2;
        this.I0 = str;
        this.J0 = tL_starGiftUnique;
        this.G0 = u9Var;
        if (tL_starGiftUnique.resell_amount != null && !h2(this.currentAccount, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id))) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.K0 = z10;
        if (!this.Q0 && (o6Var = this.P0) != null && o6Var.f5189o && (tL_starGiftUnique2 = o6Var.f5186l) != null && tL_starGiftUnique2.f22257id != tL_starGiftUnique.f22257id) {
            o6Var.a();
            this.P0 = null;
            b7 b7Var = this.f4737f0;
            b7Var.f4345b.setAlpha(1.0f);
            b7Var.f4347c.setAlpha(0.0f);
        }
        this.f4735e0.b(this.currentAccount, this.F0);
        M2(tL_starGiftUnique, false, null, null);
        String str2 = tL_starGiftUnique.owner_address;
        String str3 = tL_starGiftUnique.gift_address;
        if (tL_starGiftUnique.host_id != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        TL_wallet.walletTransaction wallettransaction = this.f4744i1;
        aa0 aa0Var = this.f4741h0;
        if (wallettransaction == null && z11 && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            aa0Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2InBlockchain), new b4(this, str3, 3)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            aa0Var.setVisibility(0);
            org.telegram.ui.ActionBar.f7.V(aa0Var, org.telegram.ui.ActionBar.y6.q5, this.resourcesProvider);
        } else {
            aa0Var.setVisibility(8);
        }
        TL_wallet.walletTransaction wallettransaction2 = this.f4744i1;
        aa0 aa0Var2 = this.f4745j0;
        if (wallettransaction2 == null && !z11 && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            aa0Var2.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2InBlockchain), new b4(this, str3, 4)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            aa0Var2.setVisibility(0);
        } else {
            aa0Var2.setVisibility(8);
        }
        Y2();
        if (this.K0) {
            N2(tL_starGiftUnique);
            this.f4747k0.setOnClickListener(new z1(this, 12));
        }
        if (this.f4736e1) {
            U2(0, false, null);
            this.f26791c.n0(1);
            this.f4736e1 = false;
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

    public final void K2(org.telegram.messenger.MessageObject r55, bi.u9 r56) {
        throw new UnsupportedOperationException("Method not decompiled: bi.h7.K2(org.telegram.messenger.MessageObject, bi.u9):void");
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

    public final void L2(TL_stars.SavedStarGift savedStarGift, u9 u9Var) {
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
        o6 o6Var;
        if (savedStarGift == null) {
            return;
        }
        int i20 = this.currentAccount;
        long j11 = this.X;
        this.E0 = h2(i20, j11);
        this.F0 = savedStarGift;
        this.G0 = u9Var;
        this.H0 = null;
        boolean z13 = this.Q0;
        b7 b7Var = this.f4737f0;
        if (!z13 && (o6Var = this.P0) != null && o6Var.f5189o && o6Var.f5186l != null) {
            o6Var.a();
            this.P0 = null;
            b7Var.f4345b.setVisibility(0);
            b7Var.f4347c.setVisibility(4);
        }
        this.f4735e0.b(this.currentAccount, savedStarGift);
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
            b7Var.f(starGift4, false, false, j22);
            b7Var.setShowOptions(M1());
            x01 x01Var = this.f4743i0;
            x01Var.removeAllViews();
            CharSequence charSequence3 = "";
            if (z15) {
                if (savedStarGift.gift_num != 0 && (starGift3 = savedStarGift.gift) != null && starGift3.title != null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(savedStarGift.gift.title);
                    sb2.append(" #");
                    j10 = clientUserId;
                    string4 = org.telegram.messenger.t.i(savedStarGift.gift_num, ',', sb2);
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
                b7Var.i(0, string4, replaceTags, F2(savedStarGift.gift));
            } else {
                j10 = clientUserId;
                if (z10 && !this.E0) {
                    String string5 = LocaleController.getString(R.string.Gift2TitleProfile);
                    this.V0 = string5;
                    b7Var.i(0, string5, null, E2(savedStarGift.gift.released_by));
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
                        b7Var.i(0, string6, string, F2(savedStarGift.gift));
                    } else {
                        if (savedStarGift.gift_num != 0 && (starGift = savedStarGift.gift) != null && starGift.title != null) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(savedStarGift.gift.title);
                            sb3.append(" #");
                            string2 = org.telegram.messenger.t.i(savedStarGift.gift_num, ',', sb3);
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
                                charSequence2 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2More).replace(' ', (char) 160), new a2(this, 5)), true);
                            }
                            char c11 = c10;
                            CharSequence[] charSequenceArr = new CharSequence[3];
                            i12 = 0;
                            charSequenceArr[0] = replaceTags2;
                            charSequenceArr[c11] = " ";
                            charSequenceArr[2] = charSequence2;
                            charSequence = TextUtils.concat(charSequenceArr);
                        }
                        b7Var.i(i12, string2, charSequence, F2(savedStarGift.gift));
                    }
                }
            }
            if (j10 != peerDialogId || z10) {
                TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerDialogId));
                String string7 = LocaleController.getString(R.string.Gift2From);
                int i22 = this.currentAccount;
                b2 b2Var = new b2(this, peerDialogId, 4);
                if (peerDialogId != j10 && peerDialogId != 2666000 && !isBot && !UserObject.isDeleted(user) && !z10) {
                    str2 = LocaleController.getString(R.string.Gift2ButtonSendGift);
                } else {
                    str2 = null;
                }
                this.f4743i0.m(string7, i22, peerDialogId, b2Var, str2, new b2(this, peerDialogId, 5));
            }
            x01Var.c(LocaleController.getString(R.string.StarsTransactionDate), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(savedStarGift.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(savedStarGift.date * 1000))), null, null);
            String string8 = LocaleController.getString(R.string.Gift2Value);
            String i23 = org.telegram.messenger.t.i(savedStarGift.gift.stars + savedStarGift.upgrade_stars, ',', new StringBuilder("⭐️ "));
            if (K1() && !z14) {
                r12 = 0;
                charSequence3 = org.telegram.ui.Components.zc.b(LocaleController.formatPluralStringComma("Gift2ButtonSell", (int) savedStarGift.convert_stars), new a2(this, 7), this.resourcesProvider, null);
            } else {
                r12 = 0;
            }
            x01Var.c(string8, dd.W0(false, TextUtils.concat(i23, " ", charSequence3), 0.8f, r12), r12, r12);
            TL_stars.StarGift starGift5 = savedStarGift.gift;
            if (starGift5.limited && !z14) {
                dd.D0(x01Var, this.currentAccount, starGift5, this.resourcesProvider);
            }
            TLRPC.TL_textWithEntities tL_textWithEntities2 = savedStarGift.message;
            if (tL_textWithEntities2 != null && !TextUtils.isEmpty(tL_textWithEntities2.text) && !z14) {
                TLRPC.TL_textWithEntities tL_textWithEntities3 = savedStarGift.message;
                x01Var.b(tL_textWithEntities3.text, tL_textWithEntities3.entities);
            }
            boolean z17 = this.E0;
            fi.d dVar = this.f4747k0;
            if (z17 && savedStarGift.can_upgrade) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("^  ");
                if (this.f4734d1 == null) {
                    i16 = 0;
                    this.f4734d1 = new zq(0, new c7(dVar, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Oh, this.resourcesProvider)));
                } else {
                    i16 = 0;
                }
                spannableStringBuilder.setSpan(this.f4734d1, i16, 1, 33);
                if (savedStarGift.upgrade_stars > 0) {
                    string3 = LocaleController.getString(R.string.Gift2UpgradeButtonFree);
                } else {
                    string3 = LocaleController.getString(R.string.Gift2UpgradeButtonGift);
                }
                spannableStringBuilder.append((CharSequence) string3);
                dVar.setFilled(true);
                dVar.i(spannableStringBuilder, !this.f4736e1, true);
                dVar.g(null, !this.f4736e1);
                dVar.setOnClickListener(new z1(this, 8));
            } else if (this.f4759r0 && z17 && this.Z != null && this.G0 != null && a2() >= 0 && this.G0.c(a2()) >= 0) {
                dVar.setFilled(false);
                int c12 = this.G0.c(a2());
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.Gift2UpgradeNext));
                Object obj = this.G0.get(c12);
                if ((obj instanceof TL_stars.SavedStarGift) && (starGift2 = ((TL_stars.SavedStarGift) obj).gift) != null && (document = starGift2.getDocument()) != null) {
                    spannableStringBuilder2.append((CharSequence) " e");
                    r122 = 1;
                    spannableStringBuilder2.setSpan(new org.telegram.ui.Components.c6(document, dVar.getTextPaint().getFontMetricsInt()), spannableStringBuilder2.length() - 1, spannableStringBuilder2.length(), 33);
                } else {
                    r122 = 1;
                }
                dVar.i(spannableStringBuilder2, (this.f4736e1 ? 1 : 0) ^ r122, r122);
                dVar.g(null, (this.f4736e1 ? 1 : 0) ^ r122);
                dVar.setOnClickListener(new w2(this, c12, r122));
            } else if ((savedStarGift.gift instanceof TL_stars.TL_starGift) && !TextUtils.isEmpty(savedStarGift.prepaid_upgrade_hash)) {
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("^  ");
                if (this.f4734d1 == null) {
                    i15 = 0;
                    this.f4734d1 = new zq(0, new c7(dVar, org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Oh, this.resourcesProvider)));
                } else {
                    i15 = 0;
                }
                spannableStringBuilder3.setSpan(this.f4734d1, i15, 1, 33);
                spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2GiftAnUpgrade));
                dVar.setFilled(true);
                dVar.i(spannableStringBuilder3, !this.f4736e1, true);
                dVar.g(null, !this.f4736e1);
                dVar.setOnClickListener(new z1(this, 10));
            } else {
                dVar.setFilled(true);
                dVar.i(LocaleController.getString(R.string.OK), !this.f4736e1, true);
                dVar.g(null, !this.f4736e1);
                dVar.setOnClickListener(new z1(this, 11));
            }
            str3 = null;
            str4 = null;
            z12 = false;
        }
        boolean z18 = savedStarGift.refunded;
        aa0 aa0Var = this.f4741h0;
        if (z18) {
            aa0Var.setVisibility(0);
            aa0Var.setText(LocaleController.getString(R.string.Gift2Refunded));
            org.telegram.ui.ActionBar.f7.V(aa0Var, org.telegram.ui.ActionBar.y6.f23599q7, this.resourcesProvider);
        } else if (z12 && !TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
            aa0Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2InBlockchain), new b4(this, str4, 1)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            aa0Var.setVisibility(0);
            org.telegram.ui.ActionBar.f7.V(aa0Var, org.telegram.ui.ActionBar.y6.q5, this.resourcesProvider);
        } else if (TextUtils.isEmpty(str3) && TextUtils.isEmpty(str4) && this.E0 && (savedStarGift.gift instanceof TL_stars.TL_starGift) && savedStarGift.name_hidden) {
            aa0Var.setVisibility(0);
            if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
                i17 = R.string.Gift2InSenderMessageHidden2;
            } else {
                i17 = R.string.Gift2InSenderHidden2;
            }
            aa0Var.setText(LocaleController.getString(i17));
            org.telegram.ui.ActionBar.f7.V(aa0Var, org.telegram.ui.ActionBar.y6.q5, this.resourcesProvider);
        } else {
            aa0Var.setVisibility(8);
        }
        aa0 aa0Var2 = this.f4745j0;
        if (!z12 && !TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
            aa0Var2.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2InBlockchain), new b4(this, str4, 2)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            r13 = 0;
            aa0Var2.setVisibility(0);
        } else if (this.E0 && h2(this.currentAccount, j11)) {
            if (i21 >= 0) {
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                if (savedStarGift.unsaved) {
                    spannableStringBuilder4.append((CharSequence) ". ");
                    spannableStringBuilder4.setSpan(new zq(R.drawable.mini_gift_hidden, 0), 0, 1, 33);
                }
                if (!savedStarGift.unsaved) {
                    i19 = R.string.Gift2ProfileVisible4;
                } else {
                    i19 = R.string.Gift2ProfileInvisible4;
                }
                spannableStringBuilder4.append((CharSequence) AndroidUtilities.replaceSingleTag(LocaleController.getString(i19), new a2(this, 6)));
                aa0Var2.setText(AndroidUtilities.replaceArrows(spannableStringBuilder4, true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            } else {
                if (!savedStarGift.unsaved) {
                    i18 = R.string.Gift2ChannelProfileVisible3;
                } else {
                    i18 = R.string.Gift2ChannelProfileInvisible3;
                }
                aa0Var2.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(i18), new a2(this, 6)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            }
            r13 = 0;
            aa0Var2.setVisibility(0);
        } else {
            r13 = 0;
            aa0Var2.setVisibility(8);
        }
        if (this.f4736e1) {
            U2(r13, r13, null);
            this.f26791c.n0(1);
            this.f4736e1 = r13;
        }
        this.e.setTitle(this.V0);
        X2();
    }

    public final boolean M1() {
        throw new UnsupportedOperationException("Method not decompiled: bi.h7.M1():boolean");
    }

    public final void M2(org.telegram.tgnet.tl.TL_stars.TL_starGiftUnique r40, boolean r41, org.telegram.tgnet.TLObject r42, org.telegram.tgnet.TLRPC.TL_textWithEntities r43) {
        throw new UnsupportedOperationException("Method not decompiled: bi.h7.M2(org.telegram.tgnet.tl.TL_stars$TL_starGiftUnique, boolean, org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_textWithEntities):void");
    }

    public final void N1() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
        alertDialog$Builder.f22369a.R = LocaleController.getString(R.string.Gift2CantDoTitle);
        alertDialog$Builder.f22369a.T = LocaleController.getString(R.string.Gift2CantDoText);
        TL_stars.TL_starGiftUnique e22 = e2();
        if (e22 != null && !TextUtils.isEmpty(e22.slug)) {
            alertDialog$Builder.k(LocaleController.getString(R.string.OpenFragment), new n4(this, e22, 1));
        }
        ic.a.r(R.string.Cancel, alertDialog$Builder, null);
    }

    public final void N2(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        bg.a resellAmount = tL_starGiftUnique.getResellAmount(bg.b.f3980a);
        boolean z10 = tL_starGiftUnique.resale_ton_only;
        fi.d dVar = this.f4747k0;
        if (z10) {
            dVar.i(dd.o1(dd.R0(LocaleController.formatString(R.string.ResellGiftBuyTON, tL_starGiftUnique.getResellAmount(bg.b.f3981b).d()), true), true), !this.f4736e1, true);
            dVar.g(dd.P0(LocaleController.formatPluralStringComma("ResellGiftBuyEq", (int) resellAmount.a())), !this.f4736e1);
            return;
        }
        dVar.i(dd.P0(LocaleController.formatPluralStringComma("ResellGiftBuy", (int) resellAmount.a())), !this.f4736e1, true);
        dVar.g(null, !this.f4736e1);
    }

    public final void O1(long j10, TL_stars.starGiftDepositPayload stargiftdepositpayload, qf.c cVar, vg.n1 n1Var) {
        TL_wallet.nftItem nftitem = this.f4738f1;
        TL_stars.TL_starGiftUnique e22 = e2();
        if (nftitem != null && e22 != null && !TextUtils.isEmpty(e22.slug)) {
            cVar.d();
            q3 q3Var = new q3(this, cVar, n1Var, j10, e22, nftitem, 0);
            if (stargiftdepositpayload != null) {
                q3Var.run(stargiftdepositpayload);
                return;
            }
            TL_stars.depositStarGift depositstargift = new TL_stars.depositStarGift();
            depositstargift.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j10);
            depositstargift.slug = e22.slug;
            ConnectionsManager.getInstance(this.currentAccount).sendRequestTyped(depositstargift, new Object(), new s2(this, cVar, n1Var, q3Var, 1));
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
        this.f4737f0.setWalletDisplayed(z10);
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
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(transferstargift, new x2(this, callback, j10, peerDialogId, 0));
                return;
            }
            final long j12 = peerDialogId;
            ca y3 = ca.y(this.currentAccount, false);
            if (!y3.e) {
                y3.r(new y2(this, y3, j10, callback, 0));
                return;
            }
            final TLRPC.TL_inputInvoiceStarGiftTransfer tL_inputInvoiceStarGiftTransfer = new TLRPC.TL_inputInvoiceStarGiftTransfer();
            tL_inputInvoiceStarGiftTransfer.stargift = Y1;
            tL_inputInvoiceStarGiftTransfer.to_id = MessagesController.getInstance(this.currentAccount).getInputPeer(j10);
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftTransfer;
            JSONObject q5 = hi.m3.q(this.resourcesProvider, false);
            if (q5 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = q5.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getPaymentForm, new RequestDelegate() {
                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    final h7 h7Var = h7.this;
                    final TLRPC.TL_inputInvoiceStarGiftTransfer tL_inputInvoiceStarGiftTransfer2 = tL_inputInvoiceStarGiftTransfer;
                    final long j13 = j10;
                    final long j14 = j12;
                    final Utilities.Callback callback2 = callback;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            h7.o1(h7.this, tLObject, tL_inputInvoiceStarGiftTransfer2, j13, j14, callback2, tL_error);
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
        this.C0.setText(LocaleController.formatString(R.string.Gift2WearTitle, org.telegram.messenger.t.i(e22.num, ',', sb2)));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.Gift2WearStart));
        if (peerDialogId == UserConfig.getInstance(this.currentAccount).getClientUserId() && !UserConfig.getInstance(this.currentAccount).isPremium()) {
            spannableStringBuilder.append((CharSequence) " l");
            if (this.X0 == null) {
                this.X0 = new zq(R.drawable.msg_mini_lock3, 0);
            }
            spannableStringBuilder.setSpan(this.X0, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        fi.d dVar = this.f4747k0;
        dVar.i(spannableStringBuilder, true, true);
        dVar.g(null, true);
        dVar.setOnClickListener(new z1(this, 27));
        this.f4737f0.setWearPreview(MessagesController.getInstance(this.currentAccount).getUserOrChat(peerDialogId));
        U2(2, false, null);
        this.A0 = true;
    }

    public final void Q1() {
        TL_stars.InputSavedStarGift Y1;
        long j10;
        fi.d dVar = this.f4747k0;
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
            if (i10 > 0 || this.f4762s1 != null) {
                dVar.setLoading(true);
                aq aqVar = this.f4769w0;
                if (i10 > 0) {
                    TL_stars.upgradeStarGift upgradestargift = new TL_stars.upgradeStarGift();
                    upgradestargift.keep_original_details = aqVar.f26634a.f26091q;
                    upgradestargift.stargift = Y1;
                    ConnectionsManager.getInstance(this.currentAccount).sendRequest(upgradestargift, new j(4, this, Y1));
                    return;
                }
                int i11 = 0;
                ca y3 = ca.y(this.currentAccount, false);
                if (!y3.e) {
                    y3.r(new f2(2, this, y3));
                    return;
                }
                TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
                tL_payments_sendStarsForm.form_id = this.f4762s1.form_id;
                if (!TextUtils.isEmpty(str)) {
                    TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade tL_inputInvoiceStarGiftPrepaidUpgrade = new TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade();
                    tL_inputInvoiceStarGiftPrepaidUpgrade.hash = str;
                    tL_inputInvoiceStarGiftPrepaidUpgrade.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.X);
                    tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftPrepaidUpgrade;
                } else {
                    TLRPC.TL_inputInvoiceStarGiftUpgrade tL_inputInvoiceStarGiftUpgrade = new TLRPC.TL_inputInvoiceStarGiftUpgrade();
                    tL_inputInvoiceStarGiftUpgrade.keep_original_details = aqVar.f26634a.f26091q;
                    tL_inputInvoiceStarGiftUpgrade.stargift = Y1;
                    tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftUpgrade;
                }
                ArrayList<TLRPC.TL_labeledPrice> arrayList = this.f4762s1.invoice.prices;
                int size = arrayList.size();
                while (i11 < size) {
                    TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i11);
                    i11++;
                    j11 += tL_labeledPrice.amount;
                }
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_sendStarsForm, new e0(this, str, Y1, j11, 1));
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
            JSONObject q5 = hi.m3.q(this.resourcesProvider, false);
            if (q5 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = q5.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getPaymentForm, new i2(this, charSequence, e22, tL_inputInvoiceStarGiftDropOriginalDetails, 1));
        }
    }

    public final void R2(View view, CharSequence charSequence, boolean z10) {
        Layout layout;
        org.telegram.ui.Components.zc zcVar;
        float primaryHorizontal;
        int i10;
        fi.v3 v3Var = this.f4774y1;
        if ((v3Var == null || !v3Var.V || this.f4776z1 != view) && view != null) {
            if (z10) {
                if (view instanceof org.telegram.ui.ActionBar.b6) {
                    org.telegram.ui.ActionBar.b6 b6Var = (org.telegram.ui.ActionBar.b6) view;
                    primaryHorizontal = (b6Var.getRightDrawableWidth() / 2.0f) + b6Var.getRightDrawableX();
                } else {
                    return;
                }
            } else {
                if (view instanceof TextView) {
                    layout = ((TextView) view).getLayout();
                } else if (view instanceof org.telegram.ui.ActionBar.b6) {
                    layout = ((org.telegram.ui.ActionBar.b6) view).getLayout();
                } else {
                    return;
                }
                if (layout != null) {
                    CharSequence text = layout.getText();
                    if (text instanceof Spanned) {
                        Spanned spanned = (Spanned) text;
                        org.telegram.ui.Components.zc[] zcVarArr = (org.telegram.ui.Components.zc[]) spanned.getSpans(0, spanned.length(), org.telegram.ui.Components.zc.class);
                        if (zcVarArr != null && zcVarArr.length > 0) {
                            primaryHorizontal = layout.getPrimaryHorizontal(spanned.getSpanStart(zcVarArr[zcVarArr.length - 1])) + view.getPaddingLeft() + (zcVar.a() / 2.0f);
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
            j5 j5Var = this.Y;
            j5Var.getLocationOnScreen(iArr);
            int[] iArr2 = {iArr2[0] - iArr[0], iArr2[1] - iArr[1]};
            fi.v3 v3Var2 = this.f4774y1;
            if (v3Var2 != null) {
                v3Var2.e(true);
                this.f4774y1 = null;
            }
            fi.v3 v3Var3 = new fi.v3(getContext(), 3);
            v3Var3.p(!z10);
            v3Var3.s(charSequence);
            v3Var3.m(0.0f, (iArr2[0] + primaryHorizontal) - (AndroidUtilities.dp(16.0f) + this.backgroundPaddingLeft));
            float dp = (iArr2[1] - AndroidUtilities.dp(100.0f)) - (view.getHeight() / 2.0f);
            if (z10) {
                i10 = 18;
            } else {
                i10 = 0;
            }
            v3Var3.setTranslationY(dp + AndroidUtilities.dp(i10 + 4.33f));
            v3Var3.d = 3000L;
            v3Var3.setPadding(AndroidUtilities.dp(16.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(16.0f) + this.backgroundPaddingLeft, 0);
            v3Var3.f11797l0 = new u2(v3Var3, 0);
            v3Var3.u();
            j5Var.addView(v3Var3, kb1.g(100.0f, -1));
            this.f4774y1 = v3Var3;
            this.f4776z1 = view;
        }
    }

    public final void S2(int i10, Context context, boolean z10) {
        int i11;
        int i12;
        LinearLayout d = wh.d(context, 1);
        FrameLayout frameLayout = new FrameLayout(context);
        int dp = AndroidUtilities.dp(64.0f);
        int i13 = org.telegram.ui.ActionBar.y6.Oh;
        ShapeDrawable K = org.telegram.ui.ActionBar.y6.K(dp, org.telegram.ui.ActionBar.y6.w0(i13, this.resourcesProvider));
        org.telegram.ui.ActionBar.b7 N = org.telegram.ui.ActionBar.f7.N(i13);
        org.telegram.ui.ActionBar.u6 u6Var = this.resourcesProvider;
        frameLayout.setBackground(K);
        org.telegram.ui.ActionBar.f7.k(frameLayout, K, N, null, u6Var);
        d.addView(frameLayout, kb1.x(64, 64, 49, 0, 6, 0, 0));
        ?? imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.f(R.raw.timer_3, 42, 42, null);
        frameLayout.addView((View) imageView, kb1.u(64, 64, 17));
        imageView.d();
        TextView L = kb1.L(context, 20.0f, org.telegram.ui.ActionBar.y6.G6, true, null);
        L.setGravity(17);
        if (z10) {
            i11 = R.string.Gift2ResellTimeoutTitle;
        } else {
            i11 = R.string.Gift2TransferTimeoutTitle;
        }
        L.setText(LocaleController.getString(i11));
        d.addView(L, kb1.x(-1, -2, 48, 24, 14, 24, 0));
        TextView L2 = kb1.L(context, 14.0f, org.telegram.ui.ActionBar.y6.F6, false, null);
        L2.setGravity(17);
        if (z10) {
            i12 = R.string.Gift2ResellTimeout;
        } else {
            i12 = R.string.Gift2TransferTimeout;
        }
        L2.setText(LocaleController.formatString(i12, LocaleController.formatTTLString(Math.max(10, i10))));
        d.addView(L2, kb1.x(-1, -2, 48, 24, 6, 24, 6));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, this.resourcesProvider);
        alertDialog$Builder.o(d);
        org.telegram.messenger.t.p(R.string.OK, alertDialog$Builder, null);
    }

    public final int T1() {
        if (this.f4730b1.d(1)) {
            return this.f4761s0.getMeasuredHeight();
        }
        if (this.f4730b1.d(2)) {
            return this.B0.getMeasuredHeight();
        }
        if (this.f4730b1.d(3)) {
            return this.D0.getMeasuredHeight();
        }
        if (this.f4730b1.d(4)) {
            return 0;
        }
        return this.f4739g0.getMeasuredHeight();
    }

    public final void T2(boolean z10, org.telegram.ui.ActionBar.e2 e2Var, qf.c cVar, Runnable runnable) {
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
            g2(tmppassword2.tmp_password, null, z10, new n3(this, z10, cVar, runnable, e2Var));
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

    public final void U2(int r12, boolean r13, bh.n r14) {
        throw new UnsupportedOperationException("Method not decompiled: bi.h7.U2(int, boolean, bh.n):void");
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
        fi.d dVar = this.f4747k0;
        if (j23) {
            MessagesController.getInstance(this.currentAccount).updateEmojiStatus(U1(), new TLRPC.TL_emojiStatusEmpty(), null);
            z11 = z12;
        } else {
            z11 = z12;
            long U1 = U1();
            if (U1 >= 0) {
                if (!UserConfig.getInstance(this.currentAccount).isPremium()) {
                    org.telegram.ui.Components.qc Q = getBulletinFactory().Q(R.raw.star_premium_2, AndroidUtilities.premiumText(LocaleController.getString(R.string.Gift2ActionWearNeededPremium), new a2(this, 2)));
                    Q.f31872u = true;
                    Q.j();
                    return;
                }
            } else if (!z10) {
                MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
                dVar.setLoading(true);
                MessagesController.getInstance(this.currentAccount).getBoostsController().getBoostsStats(U1, new c2(this, messagesController, U1, 0));
                return;
            }
            TLRPC.TL_inputEmojiStatusCollectible tL_inputEmojiStatusCollectible = new TLRPC.TL_inputEmojiStatusCollectible();
            tL_inputEmojiStatusCollectible.collectible_id = e22.f22257id;
            MessagesController.getInstance(this.currentAccount).updateEmojiStatus(U1(), tL_inputEmojiStatusCollectible, e22);
        }
        bh.p pVar = this.f4737f0.I[1];
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
        pVar.c(i10, LocaleController.getString(i11), true);
        if (this.A0) {
            dismiss();
            return;
        }
        bh.n nVar = new bh.n(2, this, z11);
        if (this.f4730b1.c(0)) {
            nVar.run();
        } else {
            U2(0, true, nVar);
        }
        dVar.i(LocaleController.getString(R.string.OK), !this.f4736e1, true);
        dVar.g(null, !this.f4736e1);
        dVar.setOnClickListener(new z1(this, 5));
    }

    public final String W1() {
        TL_stars.StarGift V1 = V1();
        if (V1 instanceof TL_stars.TL_starGiftUnique) {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) V1;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(tL_starGiftUnique.title);
            sb2.append(" #");
            return org.telegram.messenger.t.i(tL_starGiftUnique.num, ',', sb2);
        }
        return "";
    }

    public final void W2() {
        FrameLayout frameLayout = this.f4751n0;
        int visibility = frameLayout.getVisibility();
        FrameLayout frameLayout2 = this.f4755p0;
        FrameLayout frameLayout3 = this.f4749l0;
        if (visibility == 0) {
            frameLayout3.setTranslationY(this.f4730b1.a(1) * (-frameLayout.getMeasuredHeight()));
            frameLayout.setTranslationY((1.0f - this.f4730b1.a(1)) * frameLayout.getMeasuredHeight());
            frameLayout2.setTranslationY(this.f4730b1.a(1) * (-frameLayout.getMeasuredHeight()));
            return;
        }
        frameLayout3.setTranslationY(0.0f);
        frameLayout.setTranslationY(0.0f);
        frameLayout2.setTranslationY(0.0f);
    }

    public final void X2() {
        boolean f22 = f2(false);
        d5 d5Var = this.Z;
        d5Var.setPosition(f22 ? 1 : 0);
        d5Var.D(false);
        if (this.G0 != null && !f2(true) && this.G0.f() < this.G0.d()) {
            this.G0.b();
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
        TL_wallet.nftItem nftitem = this.f4738f1;
        LinearLayout linearLayout = this.f4773y0;
        if (nftitem != null && e22 != null) {
            this.f4741h0.setVisibility(8);
            this.f4745j0.setVisibility(8);
            boolean z10 = false;
            linearLayout.setVisibility(0);
            if (e22.host_id != null) {
                z10 = true;
            }
            this.f4775z0.a(z10, linearLayout.isAttachedToWindow());
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
        u9 u9Var = this.G0;
        if (u9Var != null) {
            TL_stars.SavedStarGift savedStarGift = this.F0;
            if (savedStarGift != null) {
                indexOf = u9Var.indexOf(savedStarGift);
            } else {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = this.J0;
                if (tL_starGiftUnique != null) {
                    indexOf = u9Var.indexOf(tL_starGiftUnique);
                } else {
                    return -1;
                }
            }
            if (indexOf >= 0) {
                return indexOf;
            }
            TL_stars.StarGift V1 = V1();
            for (int i10 = 0; i10 < this.G0.f(); i10++) {
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
                            if ((V1 instanceof TL_stars.TL_starGiftUnique) && (starGift instanceof TL_stars.TL_starGiftUnique) && V1.f22257id == starGift.f22257id) {
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
        u9 u9Var = this.G0;
        if (u9Var != null && i11 >= 0 && i11 < u9Var.f()) {
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
        u9 u9Var = this.G0;
        if (u9Var != null && i11 >= 0 && i11 < u9Var.f()) {
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
        if (this.f4730b1.c(4)) {
            boolean z10 = this.f4737f0.M.f5839h0;
        }
        return false;
    }

    @Override
    public final boolean canDismissWithTouchOutside() {
        if (this.f4730b1.c(4) && this.f4737f0.M.f5839h0) {
            return false;
        }
        return super.canDismissWithTouchOutside();
    }

    @Override
    public final boolean canSwipeToBack(MotionEvent motionEvent) {
        if (this.f4730b1.c(4) && this.f4737f0.M.f5839h0) {
            return false;
        }
        return super.canSwipeToBack(motionEvent);
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        if (i10 == NotificationCenter.starUserGiftsLoaded) {
            if (this.G0 == ((t9) objArr[1])) {
                z5 z5Var = this.f4737f0.M;
                if (z5Var == null || !z5Var.f5839h0) {
                    X2();
                }
            }
        }
    }

    @Override
    public final void dismiss() {
        if (this.f4730b1.c(4) && this.f4737f0.M.f5839h0) {
            return;
        }
        zh.f4 f4Var = this.W0;
        if (f4Var != null) {
            f4Var.b();
            this.W0 = null;
        }
        o6 o6Var = this.P0;
        if (o6Var != null) {
            o6Var.a();
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

    public final void g2(byte[] bArr, TwoStepVerificationActivity twoStepVerificationActivity, boolean z10, n3 n3Var) {
        TL_stars.getStarGiftWithdrawalUrl getstargiftwithdrawalurl;
        TL_stars.InputSavedStarGift Y1 = Y1();
        if (Y1 == null) {
            if (n3Var != null) {
                n3Var.run(Boolean.FALSE);
                return;
            }
            return;
        }
        if (z10) {
            TL_stars.withdrawStarGift withdrawstargift = new TL_stars.withdrawStarGift();
            withdrawstargift.keep_on_profile = this.f4772x1;
            withdrawstargift.stargift = Y1;
            withdrawstargift.tmp_password = bArr;
            getstargiftwithdrawalurl = withdrawstargift;
        } else {
            TL_stars.getStarGiftWithdrawalUrl getstargiftwithdrawalurl2 = new TL_stars.getStarGiftWithdrawalUrl();
            getstargiftwithdrawalurl2.stargift = Y1;
            getstargiftwithdrawalurl2.tmp_password = bArr;
            getstargiftwithdrawalurl = getstargiftwithdrawalurl2;
        }
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(getstargiftwithdrawalurl, new d4(this, n3Var, twoStepVerificationActivity, z10, 0));
    }

    @Override
    public org.telegram.ui.Components.wc getBulletinFactory() {
        return new org.telegram.ui.Components.wc(this.f4755p0, this.resourcesProvider);
    }

    public final void k2() {
        throw new UnsupportedOperationException("Method not decompiled: bi.h7.k2():void");
    }

    public final void l2(android.view.View r6) {
        throw new UnsupportedOperationException("Method not decompiled: bi.h7.l2(android.view.View):void");
    }

    public final void m2() {
        w4 w4Var = this.Z0;
        if (w4Var != null && w4Var.isShown()) {
            this.Z0.dismiss();
        }
        String Z1 = Z1();
        w4 w4Var2 = new w4(this, getContext(), Z1, Z1, this.resourcesProvider);
        this.Z0 = w4Var2;
        w4Var2.f31054t0 = new a4.l(this, 7);
        w4Var2.show();
    }

    public final void n2() {
        throw new UnsupportedOperationException("Method not decompiled: bi.h7.n2():void");
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
                twoStepVerificationActivity.p0();
            }
            org.telegram.ui.Components.wc.c0("NULL_ERROR");
        } else if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
            if ("SRP_ID_INVALID".equals(tL_error.text)) {
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(new TL_account.getPassword(), new h4(this, twoStepVerificationActivity, z10, 1), 8);
                return;
            }
            if (twoStepVerificationActivity != null) {
                twoStepVerificationActivity.p0();
                twoStepVerificationActivity.finishFragment();
            }
            org.telegram.ui.Components.wc.e0(tL_error);
        } else {
            if (twoStepVerificationActivity != null) {
                twoStepVerificationActivity.p0();
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext());
            alertDialog$Builder.f22369a.R = LocaleController.getString(R.string.Gift2TransferToTONAlertTitle);
            LinearLayout linearLayout = new LinearLayout(getContext());
            linearLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(24.0f), 0);
            linearLayout.setOrientation(1);
            alertDialog$Builder.o(linearLayout);
            TextView textView = new TextView(getContext());
            int i17 = org.telegram.ui.ActionBar.y6.f23465j5;
            org.telegram.ui.ActionBar.f7.V(textView, i17, null);
            textView.setTextSize(1, 16.0f);
            if (LocaleController.isRTL) {
                i10 = 5;
            } else {
                i10 = 3;
            }
            textView.setGravity(i10 | 48);
            textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2TransferToTONAlertText)));
            linearLayout.addView(textView, kb1.r(-1, -2));
            LinearLayout linearLayout2 = new LinearLayout(getContext());
            linearLayout2.setOrientation(0);
            linearLayout.addView(linearLayout2, kb1.o(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
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
            org.telegram.ui.ActionBar.f7.t(imageView, i17, null, mode);
            TextView textView2 = new TextView(getContext());
            org.telegram.ui.ActionBar.f7.V(textView2, i17, null);
            textView2.setTextSize(1, 16.0f);
            if (LocaleController.isRTL) {
                i12 = 5;
            } else {
                i12 = 3;
            }
            textView2.setGravity(i12 | 48);
            org.telegram.messenger.t.n(R.string.Gift2TransferToTONAlertText1, textView2);
            if (LocaleController.isRTL) {
                linearLayout2.addView(textView2, kb1.r(-1, -2));
                linearLayout2.addView(imageView, kb1.u(-2, -2, 5));
            } else {
                linearLayout2.addView(imageView, kb1.r(-2, -2));
                linearLayout2.addView(textView2, kb1.r(-1, -2));
            }
            LinearLayout linearLayout3 = new LinearLayout(getContext());
            linearLayout3.setOrientation(0);
            linearLayout.addView(linearLayout3, kb1.o(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
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
            org.telegram.ui.ActionBar.f7.t(imageView2, i17, null, mode);
            TextView textView3 = new TextView(getContext());
            org.telegram.ui.ActionBar.f7.V(textView3, i17, null);
            textView3.setTextSize(1, 16.0f);
            if (LocaleController.isRTL) {
                i14 = 5;
            } else {
                i14 = 3;
            }
            textView3.setGravity(i14 | 48);
            org.telegram.messenger.t.n(R.string.Gift2TransferToTONAlertText2, textView3);
            if (LocaleController.isRTL) {
                linearLayout3.addView(textView3, kb1.r(-1, -2));
                i15 = 5;
                linearLayout3.addView(imageView2, kb1.u(-2, -2, 5));
            } else {
                i15 = 5;
                linearLayout3.addView(imageView2, kb1.r(-2, -2));
                linearLayout3.addView(textView3, kb1.r(-1, -2));
            }
            if ("PASSWORD_MISSING".equals(tL_error.text)) {
                alertDialog$Builder.k(LocaleController.getString(R.string.Gift2TransferToTONSetPassword), new ag.w(this));
                alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            } else {
                TextView textView4 = new TextView(getContext());
                org.telegram.ui.ActionBar.f7.V(textView4, i17, null);
                textView4.setTextSize(1, 16.0f);
                if (LocaleController.isRTL) {
                    i16 = i15;
                } else {
                    i16 = 3;
                }
                textView4.setGravity(i16 | 48);
                textView4.setText(LocaleController.getString(R.string.Gift2TransferToTONAlertText3));
                linearLayout.addView(textView4, kb1.o(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
            }
            if (twoStepVerificationActivity != null) {
                twoStepVerificationActivity.showDialog(alertDialog$Builder.f22369a);
            } else {
                alertDialog$Builder.p();
            }
        }
    }

    @Override
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        NotificationCenter.getInstance(this.currentAccount).addWeakObserver(this, NotificationCenter.starUserGiftsLoaded);
    }

    @Override
    public final void onBackPressed() {
        b7 b7Var;
        z5 z5Var;
        if (this.f4730b1.c(4) && (b7Var = this.f4737f0) != null && (z5Var = b7Var.M) != null) {
            if (z5Var.f5839h0) {
                return;
            }
            if (z5Var.f5840i0) {
                super.onBackPressed();
                return;
            }
        }
        if (!this.A0 && this.f4730b1.f4432c > 0 && !this.f4747k0.Q && !this.f4752n1) {
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
        fi.v3 v3Var = this.f4774y1;
        if (v3Var != null) {
            v3Var.e(true);
            this.f4774y1 = null;
        }
    }

    @Override
    public final void onThemeColorsChanged() {
        super.onThemeColorsChanged();
        try {
            fixNavigationBarKey(org.telegram.ui.ActionBar.y6.f23428h5);
            b7 b7Var = this.f4737f0;
            if (b7Var != null) {
                b7Var.l();
            }
            zq zqVar = this.f4734d1;
            if (zqVar != null) {
                Drawable drawable = zqVar.drawable;
                if (drawable instanceof c7) {
                    ((c7) drawable).d.setColor(org.telegram.ui.ActionBar.y6.w0(org.telegram.ui.ActionBar.y6.Oh, this.resourcesProvider));
                    fi.d dVar = this.f4747k0;
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
        dd.e1(getContext(), this.currentAccount, e22, new o4(this, e22, 2), this.resourcesProvider);
    }

    public final void q2() {
        throw new UnsupportedOperationException("Method not decompiled: bi.h7.q2():void");
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
        this.C0.setText(LocaleController.formatString(R.string.Gift2WearTitle, org.telegram.messenger.t.i(e22.num, ',', sb2)));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.Gift2WearStart));
        if (!UserConfig.getInstance(this.currentAccount).isPremium()) {
            spannableStringBuilder.append((CharSequence) " l");
            if (this.X0 == null) {
                this.X0 = new zq(R.drawable.msg_mini_lock3, 0);
            }
            spannableStringBuilder.setSpan(this.X0, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        fi.d dVar = this.f4747k0;
        dVar.i(spannableStringBuilder, true, true);
        dVar.g(null, true);
        dVar.setOnClickListener(new z1(this, 4));
        this.f4737f0.setWearPreview(MessagesController.getInstance(this.currentAccount).getUserOrChat(peerDialogId));
        U2(2, true, null);
    }

    public final void s2(long j10, String str) {
        this.f4752n1 = true;
        ca.y(this.currentAccount, false).K(j10, new ai.n1(3, this, str));
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
            org.telegram.ui.ActionBar.e2 e2Var = new org.telegram.ui.ActionBar.e2(getContext(), 3, null);
            e2Var.r(500L);
            TL_stars.getUniqueStarGift getuniquestargift = new TL_stars.getUniqueStarGift();
            getuniquestargift.slug = this.I0;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(getuniquestargift, new j(2, this, e2Var));
        } else if (this.F0 == null && (messageObject = this.H0) != null && (message = messageObject.messageOwner) != null) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                if (tL_messageActionStarGift.upgraded) {
                    if (tL_messageActionStarGift.upgrade_msg_id != 0) {
                        org.telegram.ui.ActionBar.e2 e2Var2 = new org.telegram.ui.ActionBar.e2(getContext(), 3, null);
                        e2Var2.r(500L);
                        TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
                        tL_messages_getMessages.f22124id.add(Integer.valueOf(tL_messageActionStarGift.upgrade_msg_id));
                        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getMessages, new h2(this, tL_messageActionStarGift, e2Var2, 0));
                        return;
                    } else if (Y1() != null) {
                        org.telegram.ui.ActionBar.e2 e2Var3 = new org.telegram.ui.ActionBar.e2(getContext(), 3, null);
                        e2Var3.r(500L);
                        ca.y(this.currentAccount, false).M(Y1(), new ai.n1(2, this, e2Var3));
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
            org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
            e2Var.R = string;
            e2Var.T = LocaleController.formatString(R.string.GiftCraftLaterText, LocaleController.formatDateTime(i10, true));
            org.telegram.messenger.t.p(R.string.OK, alertDialog$Builder, null);
            return;
        }
        TL_stars.TL_starGiftUnique e22 = e2();
        if (e22 == null) {
            return;
        }
        if (!TextUtils.isEmpty(e22.gift_address)) {
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
            String string2 = LocaleController.getString(R.string.GiftCraftCantChooseFirstTitle);
            org.telegram.ui.ActionBar.e2 e2Var2 = alertDialog$Builder2.f22369a;
            e2Var2.R = string2;
            e2Var2.T = LocaleController.getString(R.string.GiftCraftCantChooseFirst);
            org.telegram.messenger.t.p(R.string.OK, alertDialog$Builder2, null);
            return;
        }
        b7 b7Var = this.f4737f0;
        if (z10) {
            b7Var.M.a(this.currentAccount, e22.gift_id, e22.getDocument(), e22.title);
            if (L1()) {
                z5 z5Var = b7Var.M;
                TL_stars.TL_starGiftUnique e23 = e2();
                if (e23 == null) {
                    z5Var.getClass();
                } else {
                    while (true) {
                        x5[] x5VarArr = z5Var.f5844n;
                        if (i11 >= x5VarArr.length) {
                            break;
                        }
                        x5 x5Var = x5VarArr[i11];
                        TL_stars.StarGift starGift = x5Var.h;
                        if (starGift == null) {
                            starGift = null;
                        }
                        if (starGift == null) {
                            x5Var.a(e23, true);
                            break;
                        }
                        i11++;
                    }
                    z5Var.d(true);
                }
            }
        }
        z5 z5Var2 = b7Var.M;
        z5 z5Var3 = b7Var.M;
        z5Var2.setOnCraft(new j2(this, 1));
        if (this.W0 == null) {
            zh.f4 f4Var = new zh.f4(this.currentAccount, e22.gift_id);
            this.W0 = f4Var;
            f4Var.a();
        }
        z5Var3.setOnAddGift(new o4(this, e22, 1));
        z5Var3.setOnClose(new a2(this, 23));
        U2(4, true, null);
    }

    public final void u2(long j10) {
        fi.v3 v3Var = this.f4774y1;
        if (v3Var != null) {
            v3Var.e(true);
            this.f4774y1 = null;
        }
        dismiss();
        org.telegram.ui.ActionBar.r2 U = LaunchActivity.U();
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

    @Override
    public final mm0 v(nm0 nm0Var) {
        h5 h5Var = new h5(this, 0);
        this.T0 = h5Var;
        return h5Var;
    }

    public final void v2(boolean z10, qf.c cVar, Runnable runnable) {
        int i10;
        TwoStepVerificationActivity twoStepVerificationActivity = new TwoStepVerificationActivity();
        if (z10) {
            i10 = 3;
        } else {
            i10 = 2;
        }
        z3 z3Var = new z3(this, twoStepVerificationActivity, z10, 0);
        twoStepVerificationActivity.Z = i10;
        twoStepVerificationActivity.f36329b0 = z3Var;
        twoStepVerificationActivity.f36327a0 = W1();
        twoStepVerificationActivity.t0(new a3.l0(this, runnable, cVar, twoStepVerificationActivity, 11));
    }

    public final void w2() {
        throw new UnsupportedOperationException("Method not decompiled: bi.h7.w2():void");
    }

    @Override
    public final int x() {
        return AndroidUtilities.dp(12.0f);
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
        linearLayout.addView(new b6(getContext(), e22, user), kb1.x(-1, -2, 48, 0, -4, 0, 0));
        TextView textView = new TextView(getContext());
        org.telegram.ui.ActionBar.f7.V(textView, org.telegram.ui.ActionBar.y6.f23465j5, this.resourcesProvider);
        textView.setTextSize(1, 16.0f);
        if (j11 > 0) {
            formatString = LocaleController.formatPluralStringComma("Gift2TransferPriceText", (int) j11, W1(), DialogObject.getShortName(j10));
        } else {
            formatString = LocaleController.formatString(R.string.Gift2TransferText, W1(), str);
        }
        textView.setText(AndroidUtilities.replaceTags(formatString));
        linearLayout.addView(textView, kb1.x(-1, -2, 48, 24, 4, 24, 4));
        x01 x01Var = new x01(getContext(), this.resourcesProvider);
        H1(x01Var, ca.l(e22.attributes, TL_stars.starGiftAttributeModel.class));
        H1(x01Var, ca.l(e22.attributes, TL_stars.starGiftAttributeBackdrop.class));
        H1(x01Var, ca.l(e22.attributes, TL_stars.starGiftAttributePattern.class));
        if (!TextUtils.isEmpty(e22.slug) && (e22.flags & 256) != 0) {
            x01Var.c(LocaleController.getString(R.string.GiftValue2), b10.j("~", BillingController.getInstance().formatCurrency(e22.value_amount, e22.value_currency, BillingController.getInstance().getCurrencyExp(e22.value_currency), true)), null, null);
        }
        linearLayout.addView(x01Var, kb1.x(-1, -2, 48, 23, 16, 23, 4));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
        alertDialog$Builder.o(linearLayout);
        if (j11 > 0) {
            string = dd.P0(LocaleController.formatString(R.string.Gift2TransferDoPrice, Integer.valueOf((int) j11)));
        } else {
            string = LocaleController.getString(R.string.Gift2TransferDo);
        }
        alertDialog$Builder.k(string, new a1.c(callback, 6));
        alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
        org.telegram.ui.ActionBar.e2 e2Var = alertDialog$Builder.f22369a;
        e2Var.Z0 = z10;
        e2Var.show();
    }

    @Override
    public final CharSequence y() {
        return this.V0;
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
        fi.v3 v3Var = this.f4774y1;
        if (v3Var != null) {
            v3Var.e(true);
            this.f4774y1 = null;
        }
        if (this.f4732c1 == null && (Y1 = Y1()) != null) {
            MessageObject messageObject = this.H0;
            long j13 = this.X;
            if (messageObject != null) {
                TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
                if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                    TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                    j11 = tL_messageActionStarGift.gift.f22257id;
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
                    j11 = starGift.f22257id;
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
            TextView textView = this.f4771x0;
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
            aq aqVar = this.f4769w0;
            aqVar.a(z14, false);
            ArrayList arrayList = this.f4754o1;
            if (arrayList != null && (j12 > j10 || this.f4762s1 != null)) {
                A2();
                return;
            }
            if (arrayList == null) {
                ca.y(this.currentAccount, false).K(j11, new y3(this, 2));
            }
            if (j12 <= j10 && this.f4762s1 == null) {
                this.f4760r1 = true;
                TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                if (!TextUtils.isEmpty(str)) {
                    TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade tL_inputInvoiceStarGiftPrepaidUpgrade = new TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade();
                    tL_inputInvoiceStarGiftPrepaidUpgrade.hash = str;
                    tL_inputInvoiceStarGiftPrepaidUpgrade.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j13);
                    tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftPrepaidUpgrade;
                } else {
                    TLRPC.TL_inputInvoiceStarGiftUpgrade tL_inputInvoiceStarGiftUpgrade = new TLRPC.TL_inputInvoiceStarGiftUpgrade();
                    tL_inputInvoiceStarGiftUpgrade.keep_original_details = aqVar.f26634a.f26091q;
                    tL_inputInvoiceStarGiftUpgrade.stargift = Y1;
                    tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftUpgrade;
                }
                JSONObject q5 = hi.m3.q(this.resourcesProvider, false);
                if (q5 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                    tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                    tL_dataJSON.data = q5.toString();
                    tL_payments_getPaymentForm.flags |= 1;
                }
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getPaymentForm, new r4(this, 0));
            }
        }
    }
}
