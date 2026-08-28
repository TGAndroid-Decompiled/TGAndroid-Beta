package gh;

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
import kh.pb;
import kh.rb;
import kh.wb;
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
import org.telegram.messenger.ll;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_account;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.tgnet.tl.TL_update;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Components.c00;
import org.telegram.ui.Components.dp;
import org.telegram.ui.Components.eq;
import org.telegram.ui.Components.gc;
import org.telegram.ui.Components.l80;
import org.telegram.ui.Components.oc;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.rc;
import org.telegram.ui.Components.ty0;
import org.telegram.ui.Components.uy0;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.Components.vy0;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.wy0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.ProfileActivity;
import org.telegram.ui.TwoStepVerificationActivity;
import org.telegram.ui.dy;
import org.telegram.ui.qn;
import org.telegram.ui.s91;
public class k5 extends org.telegram.ui.Components.sa implements NotificationCenter.NotificationCenterDelegate {
    public static final int f8396m1 = 0;
    public MessageObject A0;
    public String B0;
    public TL_stars.TL_starGiftUnique C0;
    public boolean D0;
    public boolean E0;
    public boolean F0;
    public boolean G0;
    public boolean H0;
    public v4 I0;
    public boolean J0;
    public u3 K0;
    public final int[] L0;
    public t3 M0;
    public int N0;
    public String O0;
    public fh.e6 P0;
    public eq Q0;
    public boolean R0;
    public l3 S0;
    public final long T;
    public Float T0;
    public final bh.g U;
    public l4 U0;
    public final q3 V;
    public ValueAnimator V0;
    public final c00 W;
    public eq W0;
    public fh.x3 X;
    public boolean X0;
    public fh.x3 Y;
    public View Y0;
    public final s3 Z;
    public fh.l3 Z0;
    public final g5 f8397a0;
    public boolean f8398a1;
    public final r3 f8399b0;
    public Boolean f8400b1;
    public final l80 f8401c0;
    public boolean f8402c1;
    public final wy0 f8403d0;
    public ArrayList f8404d1;
    public final l80 f8405e0;
    public ArrayList f8406e1;
    public final kh.d f8407f0;
    public ArrayList f8408f1;
    public final FrameLayout f8409g0;
    public boolean f8410g1;
    public final l80 f8411h0;
    public TLRPC.PaymentForm f8412h1;
    public final FrameLayout f8413i0;
    public final eq[] f8414i1;
    public final View f8415j0;
    public final v1 f8416j1;
    public final FrameLayout f8417k0;
    public kh.x3 f8418k1;
    public i5 f8419l0;
    public View l1;
    public boolean m0;
    public final r3 f8420n0;
    public final mh.k[] f8421o0;
    public final View f8422p0;
    public final LinearLayout f8423q0;
    public final dp f8424r0;
    public final TextView f8425s0;
    public boolean f8426t0;
    public final r3 f8427u0;
    public final TextView f8428v0;
    public final r3 f8429w0;
    public boolean f8430x0;
    public TL_stars.SavedStarGift f8431y0;
    public o7 f8432z0;

    public k5(Context context, int i9, long j10, org.telegram.ui.ActionBar.b6 b6Var, View view) {
        super(context, null, false, false, false, 1, b6Var);
        this.m0 = false;
        this.L0 = new int[2];
        this.N0 = -1;
        this.O0 = "";
        this.U0 = new l4(0, 0);
        this.X0 = true;
        this.f8414i1 = new eq[1];
        this.f8416j1 = new v1(this, 7);
        this.currentAccount = i9;
        this.T = j10;
        this.v = Math.max(0.05f, AndroidUtilities.dp(82.0f) / (AndroidUtilities.displaySize.y + AndroidUtilities.statusBarHeight));
        this.occupyNavigationBar = true;
        this.containerView = new fh.d2(this, context, 1);
        bh.g gVar = new bh.g(this, context);
        this.U = gVar;
        q3 q3Var = new q3(this, context);
        this.V = q3Var;
        q3Var.setAdapter(new bg.x(this, context, 1));
        t2();
        View view2 = new View(context);
        int i10 = org.telegram.ui.ActionBar.f6.f23072h5;
        view2.setBackgroundColor(getThemedColor(i10));
        this.containerView.addView(view2, g7.e6.e(-1, 50, 80));
        this.containerView.addView(q3Var, g7.e6.e(-1, -1, 119));
        fixNavigationBar(getThemedColor(i10));
        AndroidUtilities.removeFromParent(this.d);
        gVar.addView(this.d, g7.e6.e(-1, -1, 119));
        r3 r3Var = new r3(this, context, 0);
        this.f8399b0 = r3Var;
        r3Var.setOrientation(1);
        r3Var.setPadding(AndroidUtilities.dp(14.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(16.0f), AndroidUtilities.dp(14.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(68.0f));
        gVar.addView(r3Var, g7.e6.e(-1, -1, 55));
        l80 l80Var = new l80(context, b6Var);
        this.f8401c0 = l80Var;
        int i11 = org.telegram.ui.ActionBar.f6.f23228q5;
        l80Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(i11, b6Var));
        l80Var.setTextSize(1, 12.0f);
        l80Var.setGravity(17);
        l80Var.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        l80Var.setLinkTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23061gc, b6Var));
        l80Var.setDisablePaddingsOffsetY(true);
        r3Var.addView(l80Var, g7.e6.t(-2, -2, 1, 4, -2, 4, 16));
        l80Var.setVisibility(8);
        wy0 wy0Var = new wy0(context, b6Var);
        this.f8403d0 = wy0Var;
        r3Var.addView(wy0Var, g7.e6.k(0.0f, 0.0f, 0.0f, 12.0f, -1, -2));
        l80 l80Var2 = new l80(context, b6Var);
        this.f8405e0 = l80Var2;
        l80Var2.setTextColor(org.telegram.ui.ActionBar.f6.v0(i11, b6Var));
        l80Var2.setTextSize(1, 12.0f);
        l80Var2.setGravity(17);
        l80Var2.setLineSpacing(AndroidUtilities.dp(2.0f), 1.0f);
        int i12 = org.telegram.ui.ActionBar.f6.Oh;
        l80Var2.setLinkTextColor(org.telegram.ui.ActionBar.f6.v0(i12, b6Var));
        l80Var2.setDisablePaddingsOffsetY(true);
        l80Var2.setPadding(AndroidUtilities.dp(5.0f), 0, AndroidUtilities.dp(5.0f), 0);
        r3Var.addView(l80Var2, g7.e6.t(-2, -2, 1, 4, 2, 4, 8));
        l80Var2.setVisibility(8);
        r3 r3Var2 = new r3(this, context, 1);
        this.f8420n0 = r3Var2;
        r3Var2.setOrientation(1);
        r3Var2.setPadding(AndroidUtilities.dp(4.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(24.0f), AndroidUtilities.dp(4.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(66.0f));
        gVar.addView(r3Var2, g7.e6.e(-1, -1, 55));
        this.f8421o0 = r5;
        mh.k kVar = new mh.k(context, b6Var, false);
        kVar.a(LocaleController.getString(R.string.Gift2UpgradeFeature1Title), LocaleController.getString(R.string.GiftsFeature1Text), R.drawable.menu_feature_unique);
        r3Var2.addView(r5[0], g7.e6.n(-1, -2));
        mh.k kVar2 = new mh.k(context, b6Var, false);
        kVar2.a(LocaleController.getString(R.string.Gift2UpgradeFeature3Title), LocaleController.getString(R.string.GiftsFeature2Text), R.drawable.menu_feature_tradable);
        r3Var2.addView(r5[1], g7.e6.n(-1, -2));
        mh.k kVar3 = new mh.k(context, b6Var, false);
        mh.k[] kVarArr = {kVar, kVar2, kVar3};
        kVar3.a(LocaleController.getString(R.string.GiftsFeature3Title), LocaleController.getString(R.string.GiftsFeature3Text), R.drawable.menu_wear);
        r3Var2.addView(kVarArr[2], g7.e6.n(-1, -2));
        View view3 = new View(context);
        this.f8422p0 = view3;
        int i13 = org.telegram.ui.ActionBar.f6.f23002d7;
        view3.setBackgroundColor(org.telegram.ui.ActionBar.f6.v0(i13, b6Var));
        r3Var2.addView(view3, g7.e6.s(-2, 7, 17, -4, 17, 1.0f / AndroidUtilities.density, 6));
        LinearLayout linearLayout = new LinearLayout(context);
        this.f8423q0 = linearLayout;
        linearLayout.setPadding(AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f), AndroidUtilities.dp(12.0f), AndroidUtilities.dp(8.0f));
        linearLayout.setOrientation(0);
        linearLayout.setBackground(org.telegram.ui.ActionBar.f6.Y(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23092i6, b6Var), 6, 6));
        dp dpVar = new dp(context, 24, b6Var);
        this.f8424r0 = dpVar;
        dpVar.b(org.telegram.ui.ActionBar.f6.f23074h7, org.telegram.ui.ActionBar.f6.f23110j7, org.telegram.ui.ActionBar.f6.f23128k7);
        dpVar.setDrawUnchecked(true);
        dpVar.a(false, false);
        dpVar.setDrawBackgroundAsArc(10);
        linearLayout.addView(dpVar, g7.e6.t(26, 26, 16, 0, 0, 0, 0));
        TextView textView = new TextView(context);
        this.f8425s0 = textView;
        int i14 = org.telegram.ui.ActionBar.f6.f23108j5;
        textView.setTextColor(getThemedColor(i14));
        textView.setTextSize(1, 14.0f);
        textView.setText(LocaleController.getString(R.string.Gift2AddSenderName));
        linearLayout.addView(textView, g7.e6.t(-2, -2, 16, 9, 0, 0, 0));
        r3Var2.addView(linearLayout, g7.e6.t(-2, -2, 1, 0, 0, 0, 4));
        g7.g6.b(linearLayout, 0.025f, 1.5f);
        r3 r3Var3 = new r3(this, context, 2);
        this.f8427u0 = r3Var3;
        r3Var3.setOrientation(1);
        r3Var3.setPadding(AndroidUtilities.dp(4.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(20.0f), AndroidUtilities.dp(4.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(66.0f));
        gVar.addView(r3Var3, g7.e6.e(-1, -1, 55));
        TextView textView2 = new TextView(context);
        this.f8428v0 = textView2;
        ll.n(i14, b6Var, textView2, 1, 20.0f);
        textView2.setGravity(17);
        textView2.setTypeface(AndroidUtilities.bold());
        r3Var3.addView(textView2, g7.e6.t(-1, -2, 7, 20, 0, 20, 0));
        TextView textView3 = new TextView(context);
        ll.n(i14, b6Var, textView3, 1, 14.0f);
        textView3.setGravity(17);
        textView3.setText(LocaleController.getString(R.string.Gift2WearSubtitle));
        r3Var3.addView(textView3, g7.e6.t(-1, -2, 7, 20, 6, 20, 24));
        mh.k kVar4 = new mh.k(context, b6Var, false);
        kVar4.a(LocaleController.getString(R.string.Gift2WearFeature1Title), LocaleController.getString(R.string.Gift2WearFeature1Text), R.drawable.menu_feature_unique);
        r3Var3.addView(r7[0], g7.e6.n(-1, -2));
        mh.k kVar5 = new mh.k(context, b6Var, false);
        kVar5.a(LocaleController.getString(R.string.Gift2WearFeature2Title), LocaleController.getString(R.string.Gift2WearFeature2Text), R.drawable.menu_feature_cover);
        r3Var3.addView(r7[1], g7.e6.n(-1, -2));
        mh.k kVar6 = new mh.k(context, b6Var, false);
        mh.k[] kVarArr2 = {kVar4, kVar5, kVar6};
        kVar6.a(LocaleController.getString(R.string.Gift2WearFeature3Title), LocaleController.getString(R.string.Gift2WearFeature3Text), R.drawable.menu_verification);
        r3Var3.addView(kVarArr2[2], g7.e6.n(-1, -2));
        r3 r3Var4 = new r3(this, context, 3);
        this.f8429w0 = r3Var4;
        r3Var4.setOrientation(1);
        r3Var4.setPadding(AndroidUtilities.dp(4.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(10.0f), AndroidUtilities.dp(4.0f) + this.backgroundPaddingLeft, AndroidUtilities.dp(92.0f));
        gVar.addView(r3Var4, g7.e6.e(-1, -1, 55));
        mh.k kVar7 = new mh.k(context, b6Var, false);
        kVar7.a(LocaleController.getString(R.string.GiftCraftInfoFeature1Title), LocaleController.getString(R.string.GiftCraftInfoFeature1Text), R.drawable.menu_feature_unique);
        r3Var4.addView(r9[0], g7.e6.n(-1, -2));
        mh.k kVar8 = new mh.k(context, b6Var, false);
        kVar8.a(LocaleController.getString(R.string.GiftCraftInfoFeature2Title), LocaleController.getString(R.string.GiftCraftInfoFeature2Text), R.drawable.menu_random);
        r3Var4.addView(r9[1], g7.e6.n(-1, -2));
        mh.k kVar9 = new mh.k(context, b6Var, false);
        mh.k[] kVarArr3 = {kVar7, kVar8, kVar9};
        kVar9.a(LocaleController.getString(R.string.GiftCraftInfoFeature3Title), LocaleController.getString(R.string.GiftCraftInfoFeature3Text), R.drawable.menu_feature_affect);
        r3Var4.addView(kVarArr3[2], g7.e6.n(-1, -2));
        r3Var.setAlpha(1.0f);
        r3Var2.setAlpha(0.0f);
        r3Var3.setAlpha(0.0f);
        r3Var4.setAlpha(0.0f);
        g5 g5Var = new g5(context, b6Var, new v1(this, 9), new n1(this, 13), new n1(this, 14), new n1(this, 15), new n1(this, 16), new n1(this, 17), new n1(this, 18), new n1(this, 19));
        this.f8397a0 = g5Var;
        g5Var.H.f8283c.setOnClickListener(new n1(this, 20));
        int i15 = this.backgroundPaddingLeft;
        g5Var.setPadding(i15, 0, i15, 0);
        gVar.addView(g5Var, g7.e6.e(-1, -2, 55));
        of.y yVar = this.f32407c;
        this.M = true;
        yVar.k1(true);
        FrameLayout frameLayout = new FrameLayout(context);
        this.f8409g0 = frameLayout;
        frameLayout.setBackgroundColor(getThemedColor(i10));
        View view4 = new View(context);
        this.f8415j0 = view4;
        view4.setBackgroundColor(getThemedColor(i13));
        view4.setAlpha(0.0f);
        frameLayout.addView(view4, g7.e6.a(-1.0f, 1.0f / AndroidUtilities.density, 55));
        kh.d i16 = ll.i(24, context, b6Var, true);
        this.f8407f0 = i16;
        i16.g(LocaleController.getString(R.string.OK), false, true);
        i16.f(null, false);
        FrameLayout.LayoutParams d = g7.e6.d(-1, 48.0f, 119, 0.0f, 12.0f, 0.0f, 12.0f);
        d.leftMargin = AndroidUtilities.dp(14.0f) + this.backgroundPaddingLeft;
        d.rightMargin = AndroidUtilities.dp(14.0f) + this.backgroundPaddingLeft;
        frameLayout.addView(i16, d);
        gVar.addView(frameLayout, g7.e6.e(-1, 72, 87));
        FrameLayout frameLayout2 = new FrameLayout(context);
        this.f8413i0 = frameLayout2;
        frameLayout2.setBackgroundColor(getThemedColor(i10));
        l80 l80Var3 = new l80(context, null);
        this.f8411h0 = l80Var3;
        l80Var3.setTextSize(1, 12.0f);
        l80Var3.setTextColor(org.telegram.ui.ActionBar.f6.v0(i12, b6Var));
        l80Var3.setLinkTextColor(org.telegram.ui.ActionBar.f6.v0(i12, b6Var));
        l80Var3.setGravity(17);
        frameLayout2.addView(l80Var3, g7.e6.d(-1, -2.0f, 17, 16.0f, 8.0f, 16.0f, 14.0f));
        gVar.addView(frameLayout2, g7.e6.e(-1, -2, 87));
        frameLayout2.setVisibility(8);
        this.d.setOnScrollListener(new bg.o2(this, 7));
        linearLayout.setOnClickListener(new n1(this, 12));
        c00 c00Var = new c00(context);
        this.W = c00Var;
        gVar.addView(c00Var, g7.e6.c(-1.0f, -1));
        FrameLayout frameLayout3 = new FrameLayout(context);
        this.f8417k0 = frameLayout3;
        frameLayout3.setPadding(AndroidUtilities.dp(6.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(6.0f) + this.backgroundPaddingLeft, 0);
        gVar.addView(frameLayout3, g7.e6.d(-1, 200.0f, 87, 0.0f, 0.0f, 0.0f, 60.0f));
        AndroidUtilities.removeFromParent(this.f32408e);
        gVar.addView(this.f32408e, g7.e6.d(-1, -2.0f, 0, 6.0f, 0.0f, 6.0f, 0.0f));
        s3 s3Var = new s3(context);
        this.Z = s3Var;
        gVar.addView(s3Var, g7.e6.e(-1, -2, 55));
        ArrayList arrayList = new ArrayList();
        if (view != null) {
            arrayList.add(view);
        }
        AndroidUtilities.makeGlobalBlurBitmap(new bg.i(s3Var, 13), 12.0f, 12, null, arrayList);
    }

    public static void A0(k5 k5Var, ve.d dVar, org.telegram.ui.ActionBar.c2 c2Var, TLObject tLObject, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.TL_error tL_error, long j10, CharSequence charSequence) {
        boolean z10 = false;
        dVar.c(false);
        c2Var.dismiss();
        if (tLObject instanceof TLRPC.TL_payments_paymentResult) {
            int i9 = 0;
            while (i9 < tL_starGiftUnique.attributes.size()) {
                if (tL_starGiftUnique.attributes.get(i9) instanceof TL_stars.starGiftAttributeOriginalDetails) {
                    tL_starGiftUnique.attributes.remove(i9);
                    i9--;
                }
                i9++;
            }
            TL_stars.SavedStarGift savedStarGift = k5Var.f8431y0;
            if (savedStarGift != null) {
                z10 = savedStarGift.refunded;
            }
            k5Var.k2(tL_starGiftUnique, z10, null, null);
            AndroidUtilities.runOnUIThread(new e5.u(16, k5Var, tL_starGiftUnique));
        } else if (tL_error != null && "BALANCE_TOO_LOW".equalsIgnoreCase(tL_error.text)) {
            new ea(k5Var.getContext(), k5Var.resourcesProvider, j10, 16, null, new e5.u(18, k5Var, charSequence), 0L).show();
        } else if (tL_error != null) {
            k5Var.getBulletinFactory().d0(tL_error, false);
        }
    }

    public static void B0(k5 k5Var, String str) {
        Context context = k5Var.getContext();
        ve.e.u(context, MessagesController.getInstance(k5Var.currentAccount).tonBlockchainExplorerUrl + str);
    }

    public static void C0(k5 k5Var, TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus, long j10, MessagesController messagesController, ChannelBoostsController.CanApplyBoost canApplyBoost) {
        k5Var.f8407f0.setLoading(false);
        bg.i1 i1Var = new bg.i1(k5Var, 2);
        zf.j0 j0Var = new zf.j0(26, k5Var.currentAccount, k5Var.getContext(), i1Var, k5Var.resourcesProvider);
        j0Var.G1(canApplyBoost);
        j0Var.F1(tL_premium_boostsStatus, true);
        j0Var.H1(j10);
        TLRPC.Chat chat = messagesController.getChat(Long.valueOf(-j10));
        if (chat != null) {
            j0Var.M0 = new bg.l(k5Var, chat);
        }
        j0Var.show();
    }

    public static void D0(k5 k5Var, int i9, int i10, int i11, TL_stars.TL_starGiftUnique tL_starGiftUnique, bg.g3[] g3VarArr, Long l10) {
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        if (l10.longValue() == -99) {
            if (i9 < i10) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(k5Var.getContext(), 0, k5Var.resourcesProvider);
                String string = LocaleController.getString(R.string.Gift2ExportTONUnlocksAlertTitle);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
                c2Var.N = string;
                c2Var.P = LocaleController.formatPluralString("Gift2ExportTONUnlocksAlertText", Math.max(1, i11), new Object[0]);
                org.telegram.messenger.l0.o(R.string.OK, alertDialog$Builder, null);
                return;
            }
            LinearLayout linearLayout = new LinearLayout(k5Var.getContext());
            linearLayout.setOrientation(1);
            linearLayout.addView(new k4(k5Var.getContext(), tL_starGiftUnique), g7.e6.t(-1, -2, 48, 0, -4, 0, 0));
            TextView textView = new TextView(k5Var.getContext());
            int i12 = org.telegram.ui.ActionBar.f6.f23108j5;
            org.telegram.ui.Cells.j2.o(i12, k5Var.resourcesProvider, textView, 1, 20.0f);
            textView.setText(LocaleController.getString(R.string.Gift2ExportTONFragmentTitle));
            linearLayout.addView(textView, g7.e6.t(-1, -2, 48, 24, 4, 24, 14));
            TextView textView2 = new TextView(k5Var.getContext());
            ll.n(i12, k5Var.resourcesProvider, textView2, 1, 16.0f);
            ll.q(R.string.Gift2ExportTONFragmentText, new Object[]{k5Var.C1()}, textView2);
            linearLayout.addView(textView2, g7.e6.t(-1, -2, 48, 24, 0, 24, 4));
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(k5Var.getContext(), 0, k5Var.resourcesProvider);
            alertDialog$Builder2.n(linearLayout);
            alertDialog$Builder2.k(LocaleController.getString(R.string.Gift2ExportTONFragmentOpen), new b5.d(22, k5Var, g3VarArr));
            j3.r0.v(R.string.Cancel, alertDialog$Builder2, null);
            return;
        }
        androidx.car.app.utils.b bVar = new androidx.car.app.utils.b(k5Var, l10, g3VarArr, 18);
        if (l10.longValue() < 0) {
            TLRPC.ChatFull chatFull = MessagesController.getInstance(k5Var.currentAccount).getChatFull(-l10.longValue());
            if (chatFull == null) {
                TLRPC.TL_channels_getFullChannel tL_channels_getFullChannel = new TLRPC.TL_channels_getFullChannel();
                tL_channels_getFullChannel.channel = MessagesController.getInstance(k5Var.currentAccount).getInputChannel(-l10.longValue());
                ConnectionsManager.getInstance(k5Var.currentAccount).sendRequest(tL_channels_getFullChannel, new bg.j0(5, k5Var, bVar));
                return;
            } else if (!chatFull.stargifts_available) {
                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(k5Var.getContext(), 0, k5Var.resourcesProvider);
                String string2 = LocaleController.getString(R.string.Gift2ChannelDoesntSupportGiftsTitle);
                org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder3.f22702a;
                c2Var2.N = string2;
                c2Var2.P = LocaleController.getString(R.string.Gift2ChannelDoesntSupportGiftsText);
                org.telegram.messenger.l0.o(R.string.OK, alertDialog$Builder3, null);
                return;
            }
        } else if (l10.longValue() >= 0) {
            TLRPC.User user = MessagesController.getInstance(k5Var.currentAccount).getUser(l10);
            TLRPC.UserFull userFull = MessagesController.getInstance(k5Var.currentAccount).getUserFull(l10.longValue());
            if (userFull != null && (disallowedGiftsSettings = userFull.disallowed_stargifts) != null && disallowedGiftsSettings.disallow_unique_stargifts) {
                new oc(g3VarArr[0].container, k5Var.resourcesProvider).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(l10.longValue())))).j();
                return;
            } else if (userFull == null && user != null) {
                TLRPC.TL_users_getFullUser tL_users_getFullUser = new TLRPC.TL_users_getFullUser();
                tL_users_getFullUser.f22520id = MessagesController.getInstance(k5Var.currentAccount).getInputUser(user);
                ConnectionsManager.getInstance(k5Var.currentAccount).sendRequest(tL_users_getFullUser, new fh.h1(k5Var, g3VarArr, l10, bVar, 2));
                return;
            }
        }
        bVar.run();
    }

    public static String D1(TL_stars.StarGift starGift) {
        if (starGift instanceof TL_stars.TL_starGiftUnique) {
            TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) starGift;
            StringBuilder sb2 = new StringBuilder();
            sb2.append(tL_starGiftUnique.title);
            sb2.append(" #");
            return j3.r0.n(tL_starGiftUnique.num, ',', sb2);
        } else if ((starGift instanceof TL_stars.TL_starGift) && !TextUtils.isEmpty(starGift.title)) {
            return starGift.title;
        } else {
            return LocaleController.getString(R.string.Gift2Gift);
        }
    }

    public static void F0(k5 k5Var, TLObject tLObject, TLRPC.TL_inputInvoiceStarGiftTransfer tL_inputInvoiceStarGiftTransfer, long j10, long j11, Utilities.Callback callback, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            int i9 = 0;
            MessagesController.getInstance(k5Var.currentAccount).putUsers(paymentForm.users, false);
            TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
            tL_payments_sendStarsForm.form_id = paymentForm.form_id;
            tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftTransfer;
            ArrayList<TLRPC.TL_labeledPrice> arrayList = paymentForm.invoice.prices;
            int size = arrayList.size();
            long j12 = 0;
            while (i9 < size) {
                TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i9);
                i9++;
                j12 += tL_labeledPrice.amount;
            }
            ConnectionsManager.getInstance(k5Var.currentAccount).sendRequest(tL_payments_sendStarsForm, new a2(k5Var, j10, j11, callback, j12));
            return;
        }
        callback.run(tL_error);
        gc Y = k5Var.getBulletinFactory().Y(tL_error);
        Y.f28747t = true;
        Y.j();
    }

    public static void G0(k5 k5Var, org.telegram.ui.ActionBar.c2 c2Var, TLObject tLObject, long j10, long j11, long j12, TLRPC.TL_error tL_error) {
        c2Var.c(400L);
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        if (U == null) {
            return;
        }
        if (tLObject instanceof TLRPC.TL_boolTrue) {
            k5Var.dismiss();
            v7.y(k5Var.currentAccount, false).Q(j10);
            if (j10 >= 0) {
                TLRPC.UserFull userFull = MessagesController.getInstance(k5Var.currentAccount).getUserFull(j11);
                if (userFull != null) {
                    int max = Math.max(0, userFull.stargifts_count - 1);
                    userFull.stargifts_count = max;
                    if (max <= 0) {
                        userFull.flags2 &= -257;
                    }
                }
                v7.y(k5Var.currentAccount, false).P();
                v7.y(k5Var.currentAccount, false).T(true);
                if (!(U instanceof oa)) {
                    oa oaVar = new oa();
                    oaVar.whenFullyVisible(new bg.i2(oaVar, j12, 1));
                    U.presentFragment(oaVar);
                    return;
                }
                oc.a0(U).M(LocaleController.getString(R.string.Gift2ConvertedTitle), LocaleController.formatPluralStringComma("Gift2Converted", (int) j12), R.raw.stars_topup).k(true);
                return;
            }
            Bundle bundle = new Bundle();
            bundle.putLong("chat_id", -j10);
            bundle.putBoolean("start_from_monetization", true);
            s91 s91Var = new s91(bundle);
            c0.g(k5Var.currentAccount).h(j10, true);
            c0.g(k5Var.currentAccount).l(j10);
            s91Var.whenFullyVisible(new bg.i2(s91Var, j12, 2));
            U.presentFragment(s91Var);
        } else if (tL_error != null) {
            k5Var.getBulletinFactory().t(LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text), null).k(false);
        } else {
            k5Var.getBulletinFactory().t(LocaleController.getString(R.string.UnknownError), null).k(false);
        }
    }

    public static void H0(k5 k5Var, TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift) {
        TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) tL_payments_uniqueStarGift.gift;
        k5Var.C0 = tL_starGiftUnique;
        k5Var.k2(tL_starGiftUnique, false, null, null);
        super.show();
    }

    public static void I0(final long j10, final long j11, final k5 k5Var, final Utilities.Callback callback, final TLObject tLObject, final TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(k5Var.currentAccount).processUpdates((TLRPC.Updates) tLObject, false);
        }
        AndroidUtilities.runOnUIThread(new Runnable() {
            @Override
            public final void run() {
                k5.R(j10, j11, k5Var, callback, tLObject, tL_error);
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
            int i9 = ((TL_stars.TL_starGiftAttributeRarity) starGiftAttributeRarity).permille;
            if (i9 <= 0) {
                return "<0.1%";
            }
            return mh.l.F0(i9);
        } else {
            return "";
        }
    }

    public static void L0(k5 k5Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.PaymentForm paymentForm, TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails, long j10, CharSequence charSequence, org.telegram.ui.ActionBar.c2 c2Var) {
        ve.d g10 = c2Var.g(-1, true, true);
        g10.d();
        TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
        tL_payments_sendStarsForm.form_id = paymentForm.form_id;
        tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftDropOriginalDetails;
        ConnectionsManager.getInstance(k5Var.currentAccount).sendRequest(tL_payments_sendStarsForm, new y2(k5Var, g10, c2Var, tL_starGiftUnique, j10, charSequence));
    }

    public static void M0(k5 k5Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, gf.a aVar, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(k5Var.currentAccount).processUpdates((TLRPC.Updates) tLObject, false);
            AndroidUtilities.runOnUIThread(new k2(k5Var, tL_starGiftUnique, aVar, runnable, 1));
        } else if (tL_error != null) {
            AndroidUtilities.runOnUIThread(new l2(k5Var, tL_error, runnable, 1));
        }
    }

    public static void N0(k5 k5Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, org.telegram.ui.ActionBar.c2 c2Var) {
        k5Var.getClass();
        ve.d g10 = c2Var.g(-1, true, true);
        g10.d();
        TL_stars.updateStarGiftPrice updatestargiftprice = new TL_stars.updateStarGiftPrice();
        updatestargiftprice.stargift = k5Var.E1();
        updatestargiftprice.resell_amount = TL_stars.StarsAmount.ofStars(0L);
        ConnectionsManager.getInstance(k5Var.currentAccount).sendRequest(updatestargiftprice, new bg.b0(k5Var, g10, tL_starGiftUnique, 6));
    }

    public static boolean N1(int i9, long j10) {
        if (j10 >= 0) {
            if (UserConfig.getInstance(i9).getClientUserId() == j10) {
                return true;
            }
            return false;
        }
        return ChatObject.canUserDoAction(MessagesController.getInstance(i9).getChat(Long.valueOf(-j10)), 5);
    }

    public static void O(k5 k5Var, long j10) {
        new fh.p2(k5Var.getContext(), k5Var.currentAccount, j10, null, new z2(k5Var, 2)).show();
    }

    public static void O0(k5 k5Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, gf.a aVar, Runnable runnable) {
        TL_stars.StarsAmount o6 = aVar.o();
        TL_stars.updateStarGiftPrice updatestargiftprice = new TL_stars.updateStarGiftPrice();
        updatestargiftprice.stargift = k5Var.E1();
        updatestargiftprice.resell_amount = o6;
        ConnectionsManager.getInstance(k5Var.currentAccount).sendRequest(updatestargiftprice, new t1(k5Var, tL_starGiftUnique, aVar, runnable, 0));
    }

    public static boolean O1(int i9, long j10) {
        if (j10 >= 0) {
            if (UserConfig.getInstance(i9).getClientUserId() != j10) {
                return false;
            }
            return true;
        }
        TLRPC.Chat chat = MessagesController.getInstance(i9).getChat(Long.valueOf(-j10));
        if (chat == null || !chat.creator) {
            return false;
        }
        return true;
    }

    public static void P(k5 k5Var, String str) {
        Context context = k5Var.getContext();
        ve.e.u(context, MessagesController.getInstance(k5Var.currentAccount).tonBlockchainExplorerUrl + str);
    }

    public static void P0(k5 k5Var, long j10) {
        new fh.p2(k5Var.getContext(), k5Var.currentAccount, j10, null, new z2(k5Var, 2)).show();
    }

    public static boolean P1(int i9, TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        if (tL_starGiftUnique == null) {
            return false;
        }
        TLRPC.Peer peer = tL_starGiftUnique.owner_id;
        if (peer == null) {
            peer = tL_starGiftUnique.host_id;
        }
        long peerDialogId = DialogObject.getPeerDialogId(peer);
        int i10 = (peerDialogId > 0L ? 1 : (peerDialogId == 0L ? 0 : -1));
        if (i10 == 0) {
            return false;
        }
        if (i10 > 0) {
            TLRPC.User user = MessagesController.getInstance(i9).getUser(Long.valueOf(peerDialogId));
            if (user != null) {
                TLRPC.EmojiStatus emojiStatus = user.emoji_status;
                if (!(emojiStatus instanceof TLRPC.TL_emojiStatusCollectible) || ((TLRPC.TL_emojiStatusCollectible) emojiStatus).collectible_id != tL_starGiftUnique.f22607id) {
                    return false;
                }
                return true;
            }
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(i9).getChat(Long.valueOf(-peerDialogId));
            if (chat != null) {
                TLRPC.EmojiStatus emojiStatus2 = chat.emoji_status;
                if ((emojiStatus2 instanceof TLRPC.TL_emojiStatusCollectible) && ((TLRPC.TL_emojiStatusCollectible) emojiStatus2).collectible_id == tL_starGiftUnique.f22607id) {
                    return true;
                }
            }
        }
        return false;
    }

    public static void Q(k5 k5Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, long j10, TLRPC.TL_textWithEntities tL_textWithEntities, boolean z10, fh.z0 z0Var, m4 m4Var, ve.d dVar) {
        dVar.d();
        v7.x(k5Var.currentAccount, m4Var.f8543a).h(m4Var.f8544b, tL_starGiftUnique, j10, tL_textWithEntities, z10, new v2(k5Var, dVar, tL_starGiftUnique, j10, z0Var, 0));
    }

    public static void Q0(k5 k5Var, String str) {
        Context context = k5Var.getContext();
        ve.e.u(context, MessagesController.getInstance(k5Var.currentAccount).tonBlockchainExplorerUrl + str);
    }

    public static void R(long j10, long j11, k5 k5Var, Utilities.Callback callback, TLObject tLObject, TLRPC.TL_error tL_error) {
        long j12;
        k5 k5Var2;
        callback.run(tL_error);
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        if (U != null) {
            if (tLObject instanceof TLRPC.Updates) {
                if (j10 >= 0 && j11 >= 0) {
                    qn R9 = qn.R9(j10);
                    j12 = j10;
                    k5Var2 = k5Var;
                    R9.whenFullyVisible(new t2(k5Var2, R9, j12, 0));
                    U.presentFragment(R9);
                } else {
                    j12 = j10;
                    k5Var2 = k5Var;
                    gc M = oc.a0(U).M(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, k5Var2.C1(), DialogObject.getShortName(j12))), R.raw.forward);
                    M.f28747t = true;
                    M.j();
                }
            } else {
                j12 = j10;
                k5Var2 = k5Var;
                oc.a0(U).d0(tL_error, false);
            }
        } else {
            j12 = j10;
            k5Var2 = k5Var;
        }
        v7.y(k5Var2.currentAccount, false).Q(j12);
        v7.y(k5Var2.currentAccount, false).Q(j11);
    }

    public static void R0(k5 k5Var, TLObject tLObject, androidx.car.app.utils.b bVar, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.TL_messages_chatFull) {
            TLRPC.TL_messages_chatFull tL_messages_chatFull = (TLRPC.TL_messages_chatFull) tLObject;
            MessagesController.getInstance(k5Var.currentAccount).putUsers(tL_messages_chatFull.users, false);
            MessagesController.getInstance(k5Var.currentAccount).putChats(tL_messages_chatFull.chats, false);
            MessagesController.getInstance(k5Var.currentAccount).putChatFull(tL_messages_chatFull.full_chat);
            if (!tL_messages_chatFull.full_chat.stargifts_available) {
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(k5Var.getContext(), 0, k5Var.resourcesProvider);
                alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.Gift2ChannelDoesntSupportGiftsTitle);
                alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.Gift2ChannelDoesntSupportGiftsText);
                org.telegram.messenger.l0.o(R.string.OK, alertDialog$Builder, null);
                return;
            }
            bVar.run();
            return;
        }
        gc Y = k5Var.getBulletinFactory().Y(tL_error);
        Y.f28747t = true;
        Y.j();
    }

    public static void S(k5 k5Var, org.telegram.ui.ActionBar.c2 c2Var, MessageObject messageObject) {
        c2Var.dismiss();
        k5Var.F0 = true;
        k5Var.i2(messageObject, null);
        super.show();
    }

    public static void S0(k5 k5Var, MessageObject messageObject, ArrayList arrayList, TL_stars.StarGift starGift) {
        k5Var.f8398a1 = true;
        k5Var.i2(messageObject, null);
        k5Var.q2(0, true, null);
        c00 c00Var = k5Var.W;
        if (c00Var != null) {
            c00Var.c(true);
        }
        v7.y(k5Var.currentAccount, false).P();
        n7 G = v7.y(k5Var.currentAccount, false).G(UserConfig.getInstance(k5Var.currentAccount).getClientUserId(), false);
        if (G != null) {
            G.j(arrayList, starGift);
        }
    }

    public static void T(k5 k5Var, int i9, TLObject tLObject) {
        MessageObject messageObject;
        if (tLObject instanceof TLRPC.messages_Messages) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            for (int i10 = 0; i10 < messages_messages.messages.size(); i10++) {
                TLRPC.Message message = messages_messages.messages.get(i10);
                if (message != null && message.f22401id == i9) {
                    TLRPC.MessageAction messageAction = message.action;
                    if ((messageAction instanceof TLRPC.TL_messageActionStarGift) || (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                        messageObject = new MessageObject(k5Var.currentAccount, message, false, false);
                        messageObject.setType();
                        break;
                    }
                }
            }
        }
        messageObject = null;
        if (messageObject != null) {
            AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b(k5Var, tLObject, messageObject, 19));
        }
    }

    public static void T0(gh.k5 r9, android.view.View r10) {
        throw new UnsupportedOperationException("Method not decompiled: gh.k5.T0(gh.k5, android.view.View):void");
    }

    public static void U(k5 k5Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, final String str) {
        final long j10 = tL_starGiftUnique.gift_id;
        final String str2 = tL_starGiftUnique.title;
        final String C1 = k5Var.C1();
        final TLRPC.Document document = tL_starGiftUnique.getDocument();
        String str3 = tL_starGiftUnique.slug;
        final org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(ApplicationLoader.applicationContext, 3, null);
        c2Var.q(500L);
        TL_stars.getUniqueStarGiftValueInfo getuniquestargiftvalueinfo = new TL_stars.getUniqueStarGiftValueInfo();
        getuniquestargiftvalueinfo.slug = str3;
        ConnectionsManager.getInstance(k5Var.currentAccount).sendRequest(getuniquestargiftvalueinfo, new RequestDelegate() {
            @Override
            public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                final k5 k5Var2 = k5.this;
                final org.telegram.ui.ActionBar.c2 c2Var2 = c2Var;
                final TLRPC.Document document2 = document;
                final String str4 = str;
                final String str5 = str2;
                final String str6 = C1;
                final long j11 = j10;
                AndroidUtilities.runOnUIThread(new Runnable() {
                    @Override
                    public final void run() {
                        k5.Z0(k5.this, c2Var2, tLObject, document2, str4, str5, str6, j11, tL_error);
                    }
                });
            }
        });
    }

    public static void U0(k5 k5Var, Long l10) {
        String str;
        String formatString;
        TLRPC.Chat chat;
        if (l10.longValue() < 0 && (chat = MessagesController.getInstance(k5Var.currentAccount).getChat(Long.valueOf(-l10.longValue()))) != null) {
            str = chat.title;
        } else {
            str = "";
        }
        oc bulletinFactory = k5Var.getBulletinFactory();
        int i9 = R.raw.contact_check;
        if (TextUtils.isEmpty(str)) {
            formatString = LocaleController.getString(R.string.GiftRepostedToProfile);
        } else {
            formatString = LocaleController.formatString(R.string.GiftRepostedToChannelProfile, str);
        }
        gc Q = bulletinFactory.Q(i9, 36, AndroidUtilities.replaceTags(formatString));
        Q.f28747t = true;
        Q.j();
    }

    public static void V(k5 k5Var) {
        boolean z10;
        TLRPC.Document document;
        boolean z11;
        l7 F;
        TLRPC.Message message;
        kh.d dVar = k5Var.f8407f0;
        if (!dVar.J) {
            TL_stars.InputSavedStarGift E1 = k5Var.E1();
            MessageObject messageObject = k5Var.A0;
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
                TL_stars.SavedStarGift savedStarGift = k5Var.f8431y0;
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
            if (k5Var.f8431y0 != null && (F = v7.y(k5Var.currentAccount, false).F(k5Var.T, false)) != null) {
                F.m(k5Var.f8431y0, savestargift.unsave);
                z11 = true;
            } else {
                z11 = false;
            }
            ConnectionsManager.getInstance(k5Var.currentAccount).sendRequest(savestargift, new eh.k(k5Var, z11, document2, z12, savestargift));
        }
    }

    public static void V0(k5 k5Var, org.telegram.ui.ActionBar.c2 c2Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TL_stars.TL_payments_uniqueStarGift) {
            TL_stars.TL_payments_uniqueStarGift tL_payments_uniqueStarGift = (TL_stars.TL_payments_uniqueStarGift) tLObject;
            MessagesController.getInstance(k5Var.currentAccount).putUsers(tL_payments_uniqueStarGift.users, false);
            MessagesController.getInstance(k5Var.currentAccount).putChats(tL_payments_uniqueStarGift.chats, false);
            if (tL_payments_uniqueStarGift.gift instanceof TL_stars.TL_starGiftUnique) {
                AndroidUtilities.runOnUIThread(new e5.u(19, k5Var, tL_payments_uniqueStarGift));
                return;
            }
        }
        AndroidUtilities.runOnUIThread(new e5.u(20, c2Var, tL_error));
    }

    public static boolean W(k5 k5Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, dy dyVar, ArrayList arrayList) {
        if (arrayList.isEmpty()) {
            return false;
        }
        long j10 = ((MessagesStorage.TopicKey) arrayList.get(0)).dialogId;
        long giftThemeUser = ChatThemeController.getInstance(k5Var.currentAccount).getGiftThemeUser(tL_starGiftUnique.slug);
        if (giftThemeUser != 0 && giftThemeUser != j10) {
            org.telegram.ui.Components.y4.n0(k5Var.getContext(), k5Var.resourcesProvider, k5Var.currentAccount, tL_starGiftUnique, giftThemeUser, new e2(k5Var, j10, tL_starGiftUnique, dyVar, 1));
            return true;
        }
        ChatThemeController.getInstance(k5Var.currentAccount).setDialogTheme(j10, new nf.b(null, tL_starGiftUnique.slug));
        dyVar.presentFragment(qn.R9(j10), true);
        return true;
    }

    public static void W0(k5 k5Var, TLRPC.TL_error tL_error, TLObject tLObject, TwoStepVerificationActivity twoStepVerificationActivity) {
        int i9;
        int i10;
        int dp;
        int i11;
        int i12;
        int dp2;
        int i13;
        int i14;
        if (k5Var.getContext() != null) {
            if (tL_error != null) {
                if (!"PASSWORD_MISSING".equals(tL_error.text) && !tL_error.text.startsWith("PASSWORD_TOO_FRESH_") && !tL_error.text.startsWith("SESSION_TOO_FRESH_")) {
                    if ("SRP_ID_INVALID".equals(tL_error.text)) {
                        ConnectionsManager.getInstance(k5Var.currentAccount).sendRequest(new TL_account.getPassword(), new u2(k5Var, twoStepVerificationActivity, 1), 8);
                        return;
                    }
                    twoStepVerificationActivity.n0();
                    twoStepVerificationActivity.finishFragment();
                    oc.b0(tL_error);
                    return;
                }
                twoStepVerificationActivity.n0();
                AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(k5Var.getContext());
                alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.Gift2TransferToTONAlertTitle);
                LinearLayout linearLayout = new LinearLayout(k5Var.getContext());
                linearLayout.setPadding(AndroidUtilities.dp(24.0f), AndroidUtilities.dp(2.0f), AndroidUtilities.dp(24.0f), 0);
                linearLayout.setOrientation(1);
                alertDialog$Builder.n(linearLayout);
                TextView textView = new TextView(k5Var.getContext());
                int i15 = org.telegram.ui.ActionBar.f6.f23108j5;
                textView.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i15, false));
                textView.setTextSize(1, 16.0f);
                if (LocaleController.isRTL) {
                    i9 = 5;
                } else {
                    i9 = 3;
                }
                textView.setGravity(i9 | 48);
                textView.setText(AndroidUtilities.replaceTags(LocaleController.getString(R.string.Gift2TransferToTONAlertText)));
                linearLayout.addView(textView, g7.e6.n(-1, -2));
                LinearLayout linearLayout2 = new LinearLayout(k5Var.getContext());
                linearLayout2.setOrientation(0);
                linearLayout.addView(linearLayout2, g7.e6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                ImageView imageView = new ImageView(k5Var.getContext());
                imageView.setImageResource(R.drawable.list_circle);
                if (LocaleController.isRTL) {
                    i10 = AndroidUtilities.dp(11.0f);
                } else {
                    i10 = 0;
                }
                int dp3 = AndroidUtilities.dp(9.0f);
                if (LocaleController.isRTL) {
                    dp = 0;
                } else {
                    dp = AndroidUtilities.dp(11.0f);
                }
                imageView.setPadding(i10, dp3, dp, 0);
                int w02 = org.telegram.ui.ActionBar.f6.w0(null, i15, false);
                PorterDuff.Mode mode = PorterDuff.Mode.MULTIPLY;
                imageView.setColorFilter(new PorterDuffColorFilter(w02, mode));
                TextView textView2 = new TextView(k5Var.getContext());
                textView2.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i15, false));
                textView2.setTextSize(1, 16.0f);
                if (LocaleController.isRTL) {
                    i11 = 5;
                } else {
                    i11 = 3;
                }
                textView2.setGravity(i11 | 48);
                org.telegram.messenger.l0.m(R.string.Gift2TransferToTONAlertText1, textView2);
                if (LocaleController.isRTL) {
                    linearLayout2.addView(textView2, g7.e6.n(-1, -2));
                    linearLayout2.addView(imageView, g7.e6.q(-2, -2, 5));
                } else {
                    linearLayout2.addView(imageView, g7.e6.n(-2, -2));
                    linearLayout2.addView(textView2, g7.e6.n(-1, -2));
                }
                LinearLayout linearLayout3 = new LinearLayout(k5Var.getContext());
                linearLayout3.setOrientation(0);
                linearLayout.addView(linearLayout3, g7.e6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                ImageView imageView2 = new ImageView(k5Var.getContext());
                imageView2.setImageResource(R.drawable.list_circle);
                if (LocaleController.isRTL) {
                    i12 = AndroidUtilities.dp(11.0f);
                } else {
                    i12 = 0;
                }
                int dp4 = AndroidUtilities.dp(9.0f);
                if (LocaleController.isRTL) {
                    dp2 = 0;
                } else {
                    dp2 = AndroidUtilities.dp(11.0f);
                }
                imageView2.setPadding(i12, dp4, dp2, 0);
                imageView2.setColorFilter(new PorterDuffColorFilter(org.telegram.ui.ActionBar.f6.w0(null, i15, false), mode));
                TextView textView3 = new TextView(k5Var.getContext());
                textView3.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i15, false));
                textView3.setTextSize(1, 16.0f);
                if (LocaleController.isRTL) {
                    i13 = 5;
                } else {
                    i13 = 3;
                }
                textView3.setGravity(i13 | 48);
                org.telegram.messenger.l0.m(R.string.Gift2TransferToTONAlertText2, textView3);
                if (LocaleController.isRTL) {
                    linearLayout3.addView(textView3, g7.e6.n(-1, -2));
                    i14 = 5;
                    linearLayout3.addView(imageView2, g7.e6.q(-2, -2, 5));
                } else {
                    i14 = 5;
                    linearLayout3.addView(imageView2, g7.e6.n(-2, -2));
                    linearLayout3.addView(textView3, g7.e6.n(-1, -2));
                }
                if ("PASSWORD_MISSING".equals(tL_error.text)) {
                    alertDialog$Builder.k(LocaleController.getString(R.string.Gift2TransferToTONSetPassword), new fh.y5(k5Var));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
                } else {
                    TextView textView4 = new TextView(k5Var.getContext());
                    textView4.setTextColor(org.telegram.ui.ActionBar.f6.w0(null, i15, false));
                    textView4.setTextSize(1, 16.0f);
                    if (!LocaleController.isRTL) {
                        i14 = 3;
                    }
                    textView4.setGravity(i14 | 48);
                    textView4.setText(LocaleController.getString(R.string.Gift2TransferToTONAlertText3));
                    linearLayout.addView(textView4, g7.e6.k(0.0f, 11.0f, 0.0f, 0.0f, -1, -2));
                    alertDialog$Builder.h(LocaleController.getString(R.string.OK), null);
                }
                twoStepVerificationActivity.showDialog(alertDialog$Builder.f22702a);
                return;
            }
            twoStepVerificationActivity.n0();
            twoStepVerificationActivity.finishFragment();
            if (tLObject instanceof TL_stars.starGiftWithdrawalUrl) {
                ve.e.u(k5Var.getContext(), ((TL_stars.starGiftWithdrawalUrl) tLObject).url);
            }
        }
    }

    public static void X(k5 k5Var) {
        int i9;
        long j10;
        long j11;
        long j12;
        String string;
        final long clientUserId = UserConfig.getInstance(k5Var.currentAccount).getClientUserId();
        final TL_stars.InputSavedStarGift E1 = k5Var.E1();
        if (E1 != null) {
            MessageObject messageObject = k5Var.A0;
            if (messageObject != null) {
                i9 = messageObject.messageOwner.date;
                boolean isOutOwner = messageObject.isOutOwner();
                MessageObject messageObject2 = k5Var.A0;
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
                            j10 = k5Var.A0.getDialogId();
                        }
                        j11 = tL_messageActionStarGift.convert_stars;
                    } else {
                        return;
                    }
                } else {
                    return;
                }
            } else {
                TL_stars.SavedStarGift savedStarGift = k5Var.f8431y0;
                if (savedStarGift != null) {
                    i9 = savedStarGift.date;
                    if ((savedStarGift.flags & 2) != 0 && !savedStarGift.name_hidden) {
                        j10 = DialogObject.getPeerDialogId(savedStarGift.from_id);
                    } else {
                        j10 = 2666000;
                    }
                    j11 = k5Var.f8431y0.convert_stars;
                    j12 = k5Var.T;
                } else {
                    return;
                }
            }
            int max = Math.max(1, (MessagesController.getInstance(k5Var.currentAccount).stargiftsConvertPeriodMax - (ConnectionsManager.getInstance(k5Var.currentAccount).getCurrentTime() - i9)) / 86400);
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(k5Var.getContext(), 0, k5Var.resourcesProvider);
            String string2 = LocaleController.getString(R.string.Gift2ConvertTitle);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
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
                public final void f(org.telegram.ui.ActionBar.c2 c2Var2, int i10) {
                    k5.j0(k5.this, E1, j14, clientUserId, j13);
                }
            });
            j3.r0.v(R.string.Cancel, alertDialog$Builder, null);
        }
    }

    public static void Y(k5 k5Var, boolean[] zArr, TL_stars.StarGiftAttribute starGiftAttribute, qc[] qcVarArr) {
        if (zArr[0]) {
            return;
        }
        zArr[0] = true;
        TL_stars.StarGift B1 = k5Var.B1();
        GiftAuctionController.getInstance(k5Var.currentAccount).requestAuctionUpgrades(B1.gift_id, new i2(k5Var, B1, starGiftAttribute, qcVarArr, zArr, 0));
    }

    public static void Y0(k5 k5Var, String str, long j10) {
        org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
        if (R == 0) {
            return;
        }
        ?? obj = new Object();
        obj.f23653a = true;
        fh.g6 g6Var = new fh.g6(k5Var.T, str, j10, k5Var.resourcesProvider);
        g6Var.f6485e = new z2(k5Var, 0);
        R.showAsSheet(g6Var, obj);
    }

    public static void Z(k5 k5Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        k5Var.f8410g1 = false;
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            MessagesController.getInstance(k5Var.currentAccount).putUsers(paymentForm.users, false);
            k5Var.f8412h1 = paymentForm;
            k5Var.b2();
            return;
        }
        gc Y = k5Var.getBulletinFactory().Y(tL_error);
        Y.f28747t = true;
        Y.j();
    }

    public static void Z0(k5 k5Var, org.telegram.ui.ActionBar.c2 c2Var, TLObject tLObject, TLRPC.Document document, String str, String str2, String str3, long j10, TLRPC.TL_error tL_error) {
        wy0 wy0Var;
        wy0 wy0Var2;
        CharSequence charSequence;
        float f10;
        float f11;
        char c10;
        k5 k5Var2;
        int round;
        c2Var.dismiss();
        if (tLObject instanceof TL_stars.UniqueStarGiftValueInfo) {
            TL_stars.UniqueStarGiftValueInfo uniqueStarGiftValueInfo = (TL_stars.UniqueStarGiftValueInfo) tLObject;
            org.telegram.ui.ActionBar.f3 j11 = ll.j(k5Var.getContext(), k5Var.resourcesProvider, false, false);
            LinearLayout linearLayout = new LinearLayout(k5Var.getContext());
            linearLayout.setOrientation(1);
            linearLayout.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
            linearLayout.setClipChildren(false);
            linearLayout.setClipToPadding(false);
            org.telegram.ui.Components.o9 o9Var = new org.telegram.ui.Components.o9(k5Var.getContext());
            oa.Z0(o9Var.getImageReceiver(), document, 160);
            linearLayout.addView(o9Var, g7.e6.t(160, 160, 1, 0, 0, 0, 0));
            TextView textView = new TextView(k5Var.getContext());
            textView.setTextSize(1, 20.0f);
            textView.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Sh, k5Var.resourcesProvider));
            textView.setTypeface(AndroidUtilities.bold());
            textView.setPadding(AndroidUtilities.dp(20.0f), 0, AndroidUtilities.dp(20.0f), 0);
            textView.setBackground(org.telegram.ui.ActionBar.f6.b0(AndroidUtilities.dp(21.0f), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Oh, k5Var.resourcesProvider)));
            textView.setGravity(17);
            linearLayout.addView(textView, g7.e6.t(-2, 42, 1, 0, 12, 0, 15));
            textView.setText(str);
            TextView textView2 = new TextView(k5Var.getContext());
            textView2.setTextSize(1, 14.0f);
            textView2.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23108j5, k5Var.resourcesProvider));
            textView2.setGravity(17);
            linearLayout.addView(textView2, g7.e6.t(-2, -2, 1, 16, 0, 16, 19));
            if (uniqueStarGiftValueInfo.value_is_average) {
                ll.q(R.string.GiftValueAverage, new Object[]{str2}, textView2);
            } else if (uniqueStarGiftValueInfo.last_sale_on_fragment) {
                ll.q(R.string.GiftValueLastFragment, new Object[]{str3}, textView2);
            } else {
                ll.q(R.string.GiftValueLastTelegram, new Object[]{str3}, textView2);
            }
            FrameLayout frameLayout = new FrameLayout(k5Var.getContext());
            frameLayout.setClipChildren(false);
            frameLayout.setClipToPadding(false);
            fh.f0 f0Var = new fh.f0(k5Var, new kh.x3[1], frameLayout, 3);
            wy0 wy0Var3 = new wy0(k5Var.getContext(), k5Var.resourcesProvider);
            frameLayout.addView(wy0Var3, g7.e6.e(-1, -1, 119));
            wy0Var3.c(LocaleController.getString(R.string.GiftValueInitialSale), LocaleController.formatYearMonthDay(uniqueStarGiftValueInfo.initial_sale_date, true), null, null);
            String string = LocaleController.getString(R.string.GiftValueInitialPrice);
            StringBuilder sb2 = new StringBuilder("⭐️");
            sb2.append(uniqueStarGiftValueInfo.initial_sale_stars);
            sb2.append(" (~");
            wy0Var3.c(string, oa.X0(false, aa.d.r(sb2, BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.initial_sale_price, uniqueStarGiftValueInfo.currency), ")"), 0.8f, null), null, null);
            if (TLObject.hasFlag(uniqueStarGiftValueInfo.flags, 1)) {
                wy0Var3.c(LocaleController.getString(R.string.GiftValueLastSale), LocaleController.formatYearMonthDay(uniqueStarGiftValueInfo.last_sale_date, true), null, null);
                if (((int) (Math.round((uniqueStarGiftValueInfo.last_sale_price / uniqueStarGiftValueInfo.initial_sale_price) * 1000.0d) / 10)) - 100 > 0) {
                    wy0Var3.e(LocaleController.getString(R.string.GiftValueLastPrice), BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.last_sale_price, uniqueStarGiftValueInfo.currency), "+" + LocaleController.formatNumber(round, ' ') + "%", null, null);
                    wy0Var = wy0Var3;
                } else {
                    wy0Var = wy0Var3;
                    wy0Var.c(LocaleController.getString(R.string.GiftValueLastPrice), BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.last_sale_price, uniqueStarGiftValueInfo.currency), null, null);
                }
            } else {
                wy0Var = wy0Var3;
            }
            if (TLObject.hasFlag(uniqueStarGiftValueInfo.flags, 4)) {
                r2 r2Var = new r2(f0Var, r10, uniqueStarGiftValueInfo, str2, 0);
                wy0Var2 = wy0Var;
                TableRow e10 = wy0Var2.e(LocaleController.getString(R.string.GiftValueMinPrice), BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.floor_price, uniqueStarGiftValueInfo.currency), "?", r2Var, null);
                qc[] qcVarArr = {(qc) ((ty0) e10.getChildAt(1)).getChildAt(0)};
                e10.setOnClickListener(new androidx.mediarouter.app.c(r2Var, 12));
            } else {
                wy0Var2 = wy0Var;
            }
            if (TLObject.hasFlag(uniqueStarGiftValueInfo.flags, 8)) {
                r2 r2Var2 = new r2(f0Var, r10, uniqueStarGiftValueInfo, str2, 1);
                TableRow e11 = wy0Var2.e(LocaleController.getString(R.string.GiftValueAveragePrice), BillingController.getInstance().formatCurrency(uniqueStarGiftValueInfo.average_price, uniqueStarGiftValueInfo.currency), "?", r2Var2, null);
                qc[] qcVarArr2 = {(qc) ((ty0) e11.getChildAt(1)).getChildAt(0)};
                e11.setOnClickListener(new androidx.mediarouter.app.c(r2Var2, 13));
            }
            linearLayout.addView(frameLayout, g7.e6.t(-1, -2, 7, 0, 0, 0, 12));
            if (uniqueStarGiftValueInfo.listed_count <= 0) {
                charSequence = " ";
                f10 = 1.0f;
                f11 = 2.0f;
                c10 = ' ';
                k5Var2 = k5Var;
            } else {
                kh.d dVar = new kh.d(k5Var.getContext(), k5Var.resourcesProvider, false);
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
                f10 = 1.0f;
                f11 = 2.0f;
                spannableStringBuilder.append((CharSequence) LocaleController.formatNumber(uniqueStarGiftValueInfo.listed_count, ' '));
                spannableStringBuilder.append((CharSequence) " ");
                spannableStringBuilder.append((CharSequence) "e");
                spannableStringBuilder.setSpan(new org.telegram.ui.Components.t5(document, 1.5f, dVar.getTextPaint().getFontMetricsInt()), spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
                spannableStringBuilder.append((CharSequence) " ");
                spannableStringBuilder.append((CharSequence) LocaleController.getString(R.string.GiftValueOnSaleTelegram));
                dVar.g(AndroidUtilities.replaceArrows(spannableStringBuilder, false, AndroidUtilities.dp(2.0f), AndroidUtilities.dp(1.0f)), false, true);
                charSequence = " ";
                k5Var2 = k5Var;
                c10 = ' ';
                dVar.setOnClickListener(new s2(k5Var2, str2, j10, 0));
                linearLayout.addView(dVar, g7.e6.t(-1, 42, 7, 0, 0, 0, 2));
            }
            if (uniqueStarGiftValueInfo.fragment_listed_count > 0) {
                kh.d dVar2 = new kh.d(k5Var2.getContext(), k5Var2.resourcesProvider, false);
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                spannableStringBuilder2.append((CharSequence) LocaleController.formatNumber(uniqueStarGiftValueInfo.fragment_listed_count, c10));
                spannableStringBuilder2.append((CharSequence) "e");
                spannableStringBuilder2.setSpan(new org.telegram.ui.Components.t5(document, 1.5f, dVar2.getTextPaint().getFontMetricsInt()), spannableStringBuilder2.length() - 1, spannableStringBuilder2.length(), 33);
                spannableStringBuilder2.append(charSequence);
                spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.GiftValueOnSaleFragment));
                dVar2.g(AndroidUtilities.replaceArrows(spannableStringBuilder2, false, AndroidUtilities.dp(f11), AndroidUtilities.dp(f10)), false, true);
                dVar2.setOnClickListener(new bg.u1(17, k5Var2, uniqueStarGiftValueInfo));
                linearLayout.addView(dVar2, g7.e6.t(-1, 42, 7, 0, 0, 0, 0));
            }
            j11.customView = linearLayout;
            j11.show();
        } else if (tL_error != null) {
            k5Var.getBulletinFactory().d0(tL_error, false);
        }
    }

    public static void a0(k5 k5Var) {
        Bundle bundle = new Bundle();
        long j10 = k5Var.T;
        if (j10 >= 0) {
            bundle.putLong("user_id", j10);
        } else {
            bundle.putLong("chat_id", -j10);
        }
        if (j10 == UserConfig.getInstance(k5Var.currentAccount).getClientUserId()) {
            bundle.putBoolean("my_profile", true);
        }
        bundle.putBoolean("open_gifts", true);
        bundle.putBoolean("open_gifts_upgradable", true);
        d2(new ProfileActivity(bundle, null));
    }

    public static void a1(k5 k5Var, final fh.z0 z0Var, gf.b bVar, final TL_stars.TL_starGiftUnique tL_starGiftUnique, final long j10, final TLRPC.TL_textWithEntities tL_textWithEntities, final boolean z10, TLRPC.TL_payments_paymentFormStarGift tL_payments_paymentFormStarGift) {
        k5Var.f8407f0.setLoading(false);
        if (z0Var != null && z0Var.H) {
            z0Var.H = false;
            z0Var.D.h(false);
        }
        if (tL_payments_paymentFormStarGift == null) {
            return;
        }
        new o4(k5Var.getContext(), k5Var.resourcesProvider, tL_starGiftUnique, new m4(bVar, tL_payments_paymentFormStarGift), k5Var.currentAccount, j10, k5Var.C1(), false, new Utilities.Callback2() {
            @Override
            public final void run(Object obj, Object obj2) {
                k5.Q(k5.this, tL_starGiftUnique, j10, tL_textWithEntities, z10, z0Var, (m4) obj, (ve.d) obj2);
            }
        }).b();
    }

    public static void b0(k5 k5Var, Utilities.Callback2 callback2, ArrayList arrayList, Runnable runnable, TLRPC.Updates updates, TLRPC.TL_error tL_error) {
        AlertDialog$Builder alertDialog$Builder;
        int i9;
        MessageObject messageObject;
        if (updates != null) {
            ArrayList findUpdates = MessagesController.findUpdates(updates, TL_update.TL_updateNewMessage.class);
            int size = findUpdates.size();
            int i10 = 0;
            while (true) {
                if (i10 < size) {
                    Object obj = findUpdates.get(i10);
                    i10++;
                    TLRPC.Message message = ((TL_update.TL_updateNewMessage) obj).message;
                    if (message != null && (message.action instanceof TLRPC.TL_messageActionStarGiftUnique)) {
                        messageObject = new MessageObject(k5Var.currentAccount, message, false, false);
                        break;
                    }
                } else {
                    messageObject = null;
                    break;
                }
            }
            MessagesController.getInstance(k5Var.currentAccount).processUpdates(updates, false);
            if (messageObject != null) {
                TL_stars.StarGift starGift = ((TLRPC.TL_messageActionStarGiftUnique) messageObject.messageOwner.action).gift;
                callback2.run(starGift, new androidx.car.app.utils.c(k5Var, messageObject, arrayList, starGift, 7));
                return;
            }
            callback2.run(null, null);
            v7.y(k5Var.currentAccount, false).P();
            n7 G = v7.y(k5Var.currentAccount, false).G(UserConfig.getInstance(k5Var.currentAccount).getClientUserId(), false);
            if (G != null) {
                G.j(arrayList, null);
            }
        } else if (tL_error != null) {
            if ("STARGIFT_CRAFT_UNAVAILABLE".equalsIgnoreCase(tL_error.text)) {
                alertDialog$Builder = new AlertDialog$Builder(k5Var.getContext(), 0, new ih.b());
                String string = LocaleController.getString(R.string.GiftCraftUnavailableTitle);
                org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
                c2Var.N = string;
                c2Var.P = AndroidUtilities.replaceTags(LocaleController.getString(R.string.GiftCraftUnavailableText));
                i9 = R.string.OK;
            } else {
                String str = tL_error.text;
                if (str != null && str.startsWith("STARGIFT_CRAFT_TOO_EARLY_")) {
                    long parseLong = Long.parseLong(tL_error.text.substring(25)) + ConnectionsManager.getInstance(k5Var.currentAccount).getCurrentTime();
                    alertDialog$Builder = new AlertDialog$Builder(k5Var.getContext(), 0, new ih.b());
                    String string2 = LocaleController.getString(R.string.GiftCraftUnavailableTitle);
                    org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder.f22702a;
                    c2Var2.N = string2;
                    c2Var2.P = AndroidUtilities.replaceTags(LocaleController.formatString(R.string.GiftCraftUnavailableTextTime, LocaleController.formatDateTime(parseLong, true)));
                    i9 = R.string.OK;
                } else {
                    k5Var.getBulletinFactory().d0(tL_error, false);
                    runnable.run();
                }
            }
            org.telegram.messenger.l0.o(i9, alertDialog$Builder, null);
            runnable.run();
        }
    }

    public static void b1(k5 k5Var) {
        kh.d dVar = k5Var.f8407f0;
        if (UserConfig.getInstance(k5Var.currentAccount).isPremium() && (P1(k5Var.currentAccount, k5Var.K1()) || k5Var.R0)) {
            k5Var.r2(false);
            return;
        }
        TL_stars.TL_starGiftUnique K1 = k5Var.K1();
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
        k5Var.f8428v0.setText(LocaleController.formatString(R.string.Gift2WearTitle, j3.r0.n(K1.num, ',', sb2)));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.Gift2WearStart));
        if (!UserConfig.getInstance(k5Var.currentAccount).isPremium()) {
            spannableStringBuilder.append((CharSequence) " l");
            if (k5Var.Q0 == null) {
                k5Var.Q0 = new eq(R.drawable.msg_mini_lock3, 0);
            }
            spannableStringBuilder.setSpan(k5Var.Q0, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        dVar.g(spannableStringBuilder, true, true);
        dVar.f(null, true);
        dVar.setOnClickListener(new n1(k5Var, 26));
        k5Var.f8397a0.setWearPreview(MessagesController.getInstance(k5Var.currentAccount).getUserOrChat(peerDialogId));
        k5Var.q2(2, true, null);
    }

    public static void c0(k5 k5Var, long j10, TL_stars.TL_starGiftUnique tL_starGiftUnique, dy dyVar) {
        ChatThemeController.getInstance(k5Var.currentAccount).setDialogTheme(j10, new nf.b(null, tL_starGiftUnique.slug));
        dyVar.presentFragment(qn.R9(j10), true);
    }

    public static void c1(k5 k5Var, TLObject tLObject, CharSequence charSequence, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            ArrayList<TLRPC.TL_labeledPrice> arrayList = paymentForm.invoice.prices;
            int size = arrayList.size();
            long j10 = 0;
            int i9 = 0;
            while (i9 < size) {
                TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i9);
                i9++;
                j10 += tL_labeledPrice.amount;
            }
            LinearLayout linearLayout = new LinearLayout(k5Var.getContext());
            linearLayout.setOrientation(1);
            linearLayout.setPadding(AndroidUtilities.dp(23.0f), 0, AndroidUtilities.dp(23.0f), 0);
            TextView b10 = g7.i6.b(k5Var.getContext(), 16.0f, org.telegram.ui.ActionBar.f6.f23108j5, false, null);
            b10.setText(LocaleController.getString(R.string.Gift2RemoveDescriptionText));
            linearLayout.addView(b10, g7.e6.k(0.0f, 0.0f, 0.0f, 16.0f, -1, -2));
            wy0 wy0Var = new wy0(k5Var.getContext(), k5Var.resourcesProvider);
            uy0 a2 = wy0Var.a(charSequence);
            a2.setFilled(true);
            dh.u uVar = (dh.u) a2.getChildAt(0);
            uVar.setTextSize(1, 12.0f);
            uVar.setGravity(17);
            linearLayout.addView(wy0Var, g7.e6.k(0.0f, 0.0f, 0.0f, 0.0f, -1, -2));
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(k5Var.getContext(), 0, k5Var.resourcesProvider);
            alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.Gift2RemoveDescriptionTitle);
            alertDialog$Builder.n(linearLayout);
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            alertDialog$Builder.k(oa.Q0(LocaleController.formatString(R.string.Gift2RemoveDescriptionButton, Integer.valueOf((int) j10))), new q2(k5Var, tL_starGiftUnique, paymentForm, tL_inputInvoiceStarGiftDropOriginalDetails, j10, charSequence));
            alertDialog$Builder.o();
        } else if (tL_error != null) {
            k5Var.getBulletinFactory().d0(tL_error, false);
        }
    }

    public static void d0(k5 k5Var, long j10, long j11, Utilities.Callback callback) {
        ea eaVar = new ea(k5Var.getContext(), k5Var.resourcesProvider, j10, 11, null, new e2(k5Var, new boolean[]{false}, j11, callback, 2), 0L);
        eaVar.setOnDismissListener(new a3(k5Var, 1));
        eaVar.show();
    }

    public static void d1(k5 k5Var, long j10) {
        ea eaVar = new ea(k5Var.getContext(), k5Var.resourcesProvider, j10, 10, null, new e5.u(15, k5Var, new boolean[]{false}), 0L);
        eaVar.setOnDismissListener(new a3(k5Var, 0));
        eaVar.show();
    }

    public static void d2(org.telegram.ui.ActionBar.o2 o2Var) {
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        if (U == 0) {
            return;
        }
        ?? obj = new Object();
        obj.f23653a = true;
        U.showAsSheet(o2Var, obj);
    }

    public static void e0(k5 k5Var, TLObject tLObject, long j10, long j11, Utilities.Callback callback, TLRPC.TL_error tL_error, long j12) {
        if (tLObject instanceof TLRPC.TL_payments_paymentResult) {
            TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) tLObject;
            MessagesController.getInstance(k5Var.currentAccount).putUsers(tL_payments_paymentResult.updates.users, false);
            MessagesController.getInstance(k5Var.currentAccount).putChats(tL_payments_paymentResult.updates.chats, false);
            v7.y(k5Var.currentAccount, false).T(false);
            v7.y(k5Var.currentAccount, false).Q(j10);
            v7.y(k5Var.currentAccount, false).Q(j11);
            v7.y(k5Var.currentAccount, false).P();
            callback.run(null);
            org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
            if (U != null) {
                if (j10 >= 0 && j11 >= 0) {
                    qn R9 = qn.R9(j10);
                    R9.whenFullyVisible(new t2(k5Var, R9, j10, 1));
                    U.presentFragment(R9);
                } else {
                    gc M = oc.a0(U).M(LocaleController.getString(R.string.Gift2TransferredTitle), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2TransferredText, k5Var.C1(), DialogObject.getShortName(j10))), R.raw.forward);
                    M.f28747t = true;
                    M.j();
                }
            }
            Utilities.stageQueue.postRunnable(new x2(k5Var, tL_payments_paymentResult, 1));
        } else if (tL_error != null && "BALANCE_TOO_LOW".equals(tL_error.text)) {
            if (!MessagesController.getInstance(k5Var.currentAccount).starsPurchaseAvailable()) {
                k5Var.f8407f0.setLoading(false);
                v7.e0(k5Var.getContext(), k5Var.resourcesProvider);
                return;
            }
            v7 y10 = v7.y(k5Var.currentAccount, false);
            e5.y yVar = new e5.y(k5Var, j12, j10, callback, 1);
            y10.f9048e = false;
            y10.q(false, true, yVar);
            y10.f9048e = true;
        } else {
            callback.run(tL_error);
            k5Var.getBulletinFactory().d0(tL_error, false);
        }
    }

    public static void e1(k5 k5Var, TLRPC.TL_messageActionStarGift tL_messageActionStarGift, org.telegram.ui.ActionBar.c2 c2Var, TLObject tLObject) {
        MessageObject messageObject;
        if (tLObject instanceof TLRPC.messages_Messages) {
            TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
            MessagesController.getInstance(k5Var.currentAccount).putUsers(messages_messages.users, false);
            MessagesController.getInstance(k5Var.currentAccount).putChats(messages_messages.chats, false);
            for (int i9 = 0; i9 < messages_messages.messages.size(); i9++) {
                TLRPC.Message message = messages_messages.messages.get(i9);
                if (message != null && !(message instanceof TLRPC.TL_messageEmpty) && message.f22401id == tL_messageActionStarGift.upgrade_msg_id) {
                    messageObject = new MessageObject(k5Var.currentAccount, message, false, false);
                    messageObject.setType();
                    break;
                }
            }
        }
        messageObject = null;
        if (messageObject != null) {
            AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b(k5Var, c2Var, messageObject, 23));
        } else {
            AndroidUtilities.runOnUIThread(new h3(c2Var, 0));
        }
    }

    public static void f0(k5 k5Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, Utilities.Callback callback, Boolean bool) {
        TL_stars.StarGift starGift;
        if (k5Var.P0 == null) {
            fh.e6 e6Var = new fh.e6(k5Var.currentAccount, tL_starGiftUnique.gift_id);
            k5Var.P0 = e6Var;
            e6Var.a();
        }
        HashSet hashSet = new HashSet();
        int i9 = 0;
        while (true) {
            g4[] g4VarArr = k5Var.f8397a0.H.f8293n;
            if (i9 < g4VarArr.length) {
                TL_stars.StarGift starGift2 = g4VarArr[i9].h;
                if (starGift2 != null) {
                    starGift = starGift2;
                } else {
                    starGift = null;
                }
                if (starGift != null) {
                    if (starGift2 == null) {
                        starGift2 = null;
                    }
                    hashSet.add(Long.valueOf(starGift2.f22607id));
                }
                i9++;
            } else {
                fh.f6 f6Var = new fh.f6(k5Var.getContext(), tL_starGiftUnique.title, k5Var.P0);
                f6Var.f6462c0.addAll(hashSet);
                f6Var.f6464e0.N(true);
                f6Var.f6463d0 = bool.booleanValue();
                f6Var.f6460a0.set(AndroidUtilities.replaceTags(LocaleController.formatPluralString("GiftCraftSelect", 4 - hashSet.size(), new Object[0])));
                f6Var.f6461b0 = new p1(0, callback);
                f6Var.show();
                return;
            }
        }
    }

    public static void f1(k5 k5Var, TL_stars.InputSavedStarGift inputSavedStarGift, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            TLRPC.Updates updates = (TLRPC.Updates) tLObject;
            MessagesController.getInstance(k5Var.currentAccount).putUsers(updates.users, false);
            MessagesController.getInstance(k5Var.currentAccount).putChats(updates.chats, false);
        }
        AndroidUtilities.runOnUIThread(new androidx.car.app.utils.c(k5Var, tL_error, tLObject, inputSavedStarGift, 8));
    }

    public static void g0(k5 k5Var, TLObject tLObject, String str, TL_stars.InputSavedStarGift inputSavedStarGift, TLRPC.TL_error tL_error, long j10) {
        TL_stars.SavedStarGift savedStarGift;
        if (tLObject instanceof TLRPC.TL_payments_paymentResult) {
            TLRPC.TL_payments_paymentResult tL_payments_paymentResult = (TLRPC.TL_payments_paymentResult) tLObject;
            MessagesController.getInstance(k5Var.currentAccount).putUsers(tL_payments_paymentResult.updates.users, false);
            MessagesController.getInstance(k5Var.currentAccount).putChats(tL_payments_paymentResult.updates.chats, false);
            v7.y(k5Var.currentAccount, false).T(false);
            v7.y(k5Var.currentAccount, false).P();
            if (!TextUtils.isEmpty(str) && (savedStarGift = k5Var.f8431y0) != null) {
                savedStarGift.flags &= -65537;
                savedStarGift.prepaid_upgrade_hash = null;
            }
            k5Var.m0 = true;
            k5Var.f8412h1 = null;
            k5Var.r1(inputSavedStarGift, tL_payments_paymentResult.updates, new w2(k5Var, str, 0));
            Utilities.stageQueue.postRunnable(new x2(k5Var, tL_payments_paymentResult, 0));
        } else if (tL_error != null && "BALANCE_TOO_LOW".equals(tL_error.text)) {
            if (!MessagesController.getInstance(k5Var.currentAccount).starsPurchaseAvailable()) {
                k5Var.f8407f0.setLoading(false);
                v7.e0(k5Var.getContext(), k5Var.resourcesProvider);
                return;
            }
            v7 y10 = v7.y(k5Var.currentAccount, false);
            w1 w1Var = new w1(k5Var, j10, 3);
            y10.f9048e = false;
            y10.q(false, true, w1Var);
            y10.f9048e = true;
        } else {
            k5Var.getBulletinFactory().d0(tL_error, false);
        }
    }

    public static void g1(k5 k5Var) {
        TL_stars.SavedStarGift savedStarGift = k5Var.f8431y0;
        if (savedStarGift.unsaved) {
            savedStarGift.unsaved = false;
            l7 F = v7.y(k5Var.currentAccount, false).F(k5Var.T, false);
            if (F != null) {
                TL_stars.SavedStarGift savedStarGift2 = k5Var.f8431y0;
                F.m(savedStarGift2, savedStarGift2.unsaved);
            }
            TL_stars.saveStarGift savestargift = new TL_stars.saveStarGift();
            savestargift.stargift = k5Var.E1();
            savestargift.unsave = k5Var.f8431y0.unsaved;
            ConnectionsManager.getInstance(k5Var.currentAccount).sendRequest(savestargift, null, 64);
        }
        TL_stars.SavedStarGift savedStarGift3 = k5Var.f8431y0;
        boolean z10 = savedStarGift3.pinned_to_top;
        if (((n7) k5Var.f8432z0).m(savedStarGift3, !z10, false)) {
            new fh.i4(k5Var.getContext(), k5Var.T, k5Var.f8431y0, k5Var.resourcesProvider, new Utilities.Callback0Return() {
                @Override
                public final Object run() {
                    return k5.this.getBulletinFactory();
                }
            }).show();
        } else if (!z10) {
            k5Var.getBulletinFactory().M(LocaleController.getString(R.string.Gift2PinnedTitle), LocaleController.getString(R.string.Gift2PinnedSubtitle), R.raw.ic_pin).j();
        } else {
            org.telegram.messenger.l0.p(R.string.Gift2Unpinned, k5Var.getBulletinFactory(), R.raw.ic_unpin, 36);
        }
    }

    public static SpannableStringBuilder g2(String str) {
        if (str == null) {
            return null;
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(str);
        SpannableString spannableString = new SpannableString("👌");
        spannableString.setSpan(new eq(R.drawable.filled_understood, 0), 0, spannableString.length(), 33);
        SpannableString spannableString2 = new SpannableString("👍");
        spannableString2.setSpan(new eq(R.drawable.filled_reactions, 0), 0, spannableString2.length(), 33);
        AndroidUtilities.replaceMultipleCharSequence("👌", spannableStringBuilder, spannableString);
        AndroidUtilities.replaceMultipleCharSequence("👍", spannableStringBuilder, spannableString2);
        return spannableStringBuilder;
    }

    public static void h0(k5 k5Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, gf.a aVar, Runnable runnable) {
        k5Var.getClass();
        TL_stars.StarsAmount o6 = aVar.o();
        TL_stars.updateStarGiftPrice updatestargiftprice = new TL_stars.updateStarGiftPrice();
        updatestargiftprice.stargift = k5Var.E1();
        updatestargiftprice.resell_amount = o6;
        ConnectionsManager.getInstance(k5Var.currentAccount).sendRequest(updatestargiftprice, new t1(k5Var, tL_starGiftUnique, aVar, runnable, 1));
    }

    public static void h1(k5 k5Var, String str) {
        Context context = k5Var.getContext();
        ve.e.u(context, MessagesController.getInstance(k5Var.currentAccount).tonBlockchainExplorerUrl + str);
    }

    public static void i0(k5 k5Var, TLObject tLObject, MessageObject messageObject) {
        TLRPC.Message message;
        TLRPC.messages_Messages messages_messages = (TLRPC.messages_Messages) tLObject;
        MessagesController.getInstance(k5Var.currentAccount).putUsers(messages_messages.users, false);
        MessagesController.getInstance(k5Var.currentAccount).putChats(messages_messages.chats, false);
        k5Var.F0 = true;
        k5Var.E0 = false;
        Boolean bool = k5Var.f8400b1;
        if (bool != null && (message = messageObject.messageOwner) != null) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                ((TLRPC.TL_messageActionStarGift) messageAction).saved = true ^ bool.booleanValue();
            } else if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                ((TLRPC.TL_messageActionStarGiftUnique) messageAction).saved = true ^ bool.booleanValue();
            }
        }
        k5Var.i2(messageObject, null);
    }

    public static void i1(k5 k5Var, String str) {
        long j10 = k5Var.T;
        k5Var.f8407f0.setLoading(false);
        if (!TextUtils.isEmpty(str)) {
            k5Var.dismiss();
            org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
            if (R == null) {
                return;
            }
            if (R instanceof qn) {
                qn qnVar = (qn) R;
                if (qnVar.a() == j10) {
                    oc.a0(qnVar).M(LocaleController.getString(R.string.StarsGiftUpgradeCompleted), AndroidUtilities.replaceTags(LocaleController.formatString(R.string.StarsGiftUpgradeCompletedText, DialogObject.getShortName(j10))), R.raw.gift).k(true);
                    return;
                }
            }
            NotificationCenter notificationCenter = NotificationCenter.getInstance(k5Var.currentAccount);
            int i9 = NotificationCenter.closeProfileActivity;
            Long valueOf = Long.valueOf(j10);
            Boolean bool = Boolean.FALSE;
            notificationCenter.lambda$postNotificationNameOnUIThread$1(i9, valueOf, bool);
            NotificationCenter.getInstance(k5Var.currentAccount).lambda$postNotificationNameOnUIThread$1(NotificationCenter.closeChatActivity, Long.valueOf(j10), bool);
            qn R9 = qn.R9(j10);
            R9.whenFullyVisible(new e5.u(17, k5Var, R9));
            R.presentFragment(R9);
            return;
        }
        k5Var.q2(0, true, null);
    }

    public static void j0(k5 k5Var, TL_stars.InputSavedStarGift inputSavedStarGift, long j10, long j11, long j12) {
        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(ApplicationLoader.applicationContext, 3, null);
        c2Var.q(500L);
        TL_stars.convertStarGift convertstargift = new TL_stars.convertStarGift();
        convertstargift.stargift = inputSavedStarGift;
        ConnectionsManager.getInstance(k5Var.currentAccount).sendRequest(convertstargift, new a2(k5Var, c2Var, j10, j11, j12));
    }

    public static void j1(k5 k5Var, boolean z10) {
        int i9;
        Object obj;
        fh.x3 x3Var;
        fh.x3 x3Var2;
        fh.x3 x3Var3;
        int G1 = k5Var.G1();
        if (G1 >= 0) {
            if (z10) {
                i9 = 1;
            } else {
                i9 = -1;
            }
            int i10 = i9 + G1;
            int i11 = k5Var.N0;
            if (i11 >= 0 && (!z10 ? i11 < G1 : i11 > G1)) {
                i10 = i11;
            }
            o7 o7Var = k5Var.f8432z0;
            if (o7Var != null && i10 >= 0 && i10 < o7Var.e()) {
                obj = k5Var.f8432z0.get(i10);
            } else {
                obj = null;
            }
            if (obj != null) {
                if (z10) {
                    x3Var = k5Var.Y;
                } else {
                    x3Var = k5Var.X;
                }
                if (x3Var != null) {
                    if (obj instanceof TL_stars.SavedStarGift) {
                        if (z10) {
                            x3Var3 = k5Var.Y;
                        } else {
                            x3Var3 = k5Var.X;
                        }
                        if (x1(x3Var3.f8431y0, (TL_stars.SavedStarGift) obj)) {
                            return;
                        }
                    }
                    if (obj instanceof TL_stars.TL_starGiftUnique) {
                        if (z10) {
                            x3Var2 = k5Var.Y;
                        } else {
                            x3Var2 = k5Var.X;
                        }
                        if (y1(x3Var2.C0, (TL_stars.TL_starGiftUnique) obj)) {
                            return;
                        }
                    }
                }
                fh.x3 x3Var4 = new fh.x3(k5Var, k5Var.getContext(), k5Var.currentAccount, k5Var.T, k5Var.resourcesProvider, k5Var.U.getRootView());
                if (obj instanceof TL_stars.SavedStarGift) {
                    x3Var4.j2((TL_stars.SavedStarGift) obj, k5Var.f8432z0);
                } else if (obj instanceof TL_stars.TL_starGiftUnique) {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = (TL_stars.TL_starGiftUnique) obj;
                    x3Var4.h2(tL_starGiftUnique.slug, tL_starGiftUnique, k5Var.f8432z0);
                }
                AndroidUtilities.removeFromParent(x3Var4.containerView);
                if (z10) {
                    k5Var.Y = x3Var4;
                } else {
                    k5Var.X = x3Var4;
                }
            }
        }
    }

    public static void k0(k5 k5Var, long j10) {
        new fh.p2(k5Var.getContext(), k5Var.currentAccount, j10, null, new z2(k5Var, 2)).show();
    }

    public static void k1(k5 k5Var, final View view) {
        pb pbVar;
        LaunchActivity launchActivity = LaunchActivity.C1;
        if (launchActivity != null) {
            if (view instanceof org.telegram.ui.Cells.e7) {
                pbVar = rb.b((org.telegram.ui.Cells.e7) view);
            } else {
                pbVar = null;
            }
            ArrayList arrayList = new ArrayList();
            MessageObject messageObject = k5Var.A0;
            if (messageObject != null) {
                arrayList.add(messageObject);
            } else if (k5Var.B1() instanceof TL_stars.TL_starGiftUnique) {
                long clientUserId = UserConfig.getInstance(k5Var.currentAccount).getClientUserId();
                TLRPC.TL_messageService tL_messageService = new TLRPC.TL_messageService();
                tL_messageService.peer_id = MessagesController.getInstance(k5Var.currentAccount).getPeer(clientUserId);
                tL_messageService.from_id = MessagesController.getInstance(k5Var.currentAccount).getPeer(clientUserId);
                tL_messageService.date = ConnectionsManager.getInstance(k5Var.currentAccount).getCurrentTime();
                TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = new TLRPC.TL_messageActionStarGiftUnique();
                tL_messageActionStarGiftUnique.gift = (TL_stars.TL_starGiftUnique) k5Var.B1();
                tL_messageActionStarGiftUnique.upgrade = true;
                tL_messageService.action = tL_messageActionStarGiftUnique;
                MessageObject messageObject2 = new MessageObject(k5Var.currentAccount, tL_messageService, false, false);
                messageObject2.setType();
                arrayList.add(messageObject2);
            } else {
                return;
            }
            final wb E = wb.E(launchActivity, k5Var.currentAccount);
            E.N = new Utilities.Callback4() {
                @Override
                public final void run(Object obj, Object obj2, Object obj3, Object obj4) {
                    Long l10 = (Long) obj;
                    Runnable runnable = (Runnable) obj2;
                    Long l11 = (Long) obj4;
                    boolean booleanValue = ((Boolean) obj3).booleanValue();
                    wb wbVar = E;
                    pb pbVar2 = null;
                    if (booleanValue) {
                        k5 k5Var2 = k5.this;
                        AndroidUtilities.runOnUIThread(new e5.u(11, k5Var2, l11));
                        wbVar.Y(null);
                        l3 l3Var = k5Var2.S0;
                        if (l3Var != null) {
                            l3Var.dismiss();
                            k5Var2.S0 = null;
                        }
                    } else {
                        View view2 = view;
                        if ((view2 instanceof org.telegram.ui.Cells.e7) && view2.isAttachedToWindow()) {
                            pbVar2 = rb.b((org.telegram.ui.Cells.e7) view2);
                        }
                        wbVar.Y(pbVar2);
                    }
                    AndroidUtilities.runOnUIThread(runnable);
                }
            };
            E.U(pbVar, kh.a8.y(arrayList));
        }
    }

    public static void l0(k5 k5Var, org.telegram.ui.ActionBar.c2 c2Var, TL_stars.SavedStarGift savedStarGift) {
        if (savedStarGift != null) {
            c2Var.dismiss();
            k5Var.H0 = true;
            k5Var.j2(savedStarGift, null);
            super.show();
            return;
        }
        c2Var.dismiss();
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        if (U != null) {
            gc Q = oc.a0(U).Q(R.raw.error, 36, LocaleController.getString(R.string.MessageNotFound));
            Q.f28747t = true;
            Q.j();
        }
    }

    public static ViewGroup l1(k5 k5Var) {
        return k5Var.containerView;
    }

    public static void m0(k5 k5Var) {
        TL_stars.TL_starGiftUnique K1 = k5Var.K1();
        new o0(k5Var.getContext(), k5Var.currentAccount, DialogObject.getPeerDialogId(K1.owner_id), K1, k5Var.resourcesProvider, new v1(k5Var, 2)).show();
    }

    public static void n0(k5 k5Var, String str) {
        k5Var.dismiss();
        Context context = k5Var.getContext();
        ve.e.s(context, "https://" + MessagesController.getInstance(k5Var.currentAccount).linkPrefix + "/" + str);
    }

    public static int n1(k5 k5Var) {
        return k5Var.backgroundPaddingLeft;
    }

    public static void o0(k5 k5Var) {
        if (k5Var.f8412h1 == null) {
            return;
        }
        long j10 = 0;
        for (int i9 = 0; i9 < k5Var.f8412h1.invoice.prices.size(); i9++) {
            j10 += k5Var.f8412h1.invoice.prices.get(i9).amount;
        }
        i5 i5Var = new i5(k5Var.getContext(), j10, k5Var.f8406e1, k5Var.resourcesProvider);
        k5Var.f8419l0 = i5Var;
        i5Var.show();
    }

    public static int o1(k5 k5Var) {
        return k5Var.backgroundPaddingLeft;
    }

    public static void p0(k5 k5Var, ve.d dVar, TL_stars.TL_starGiftUnique tL_starGiftUnique, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(k5Var.currentAccount).processUpdates((TLRPC.Updates) tLObject, false);
            AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b(k5Var, dVar, tL_starGiftUnique, 20));
            return;
        }
        k5Var.getClass();
        if (tL_error != null && tL_error.text.startsWith("STARGIFT_RESELL_TOO_EARLY_")) {
            AndroidUtilities.runOnUIThread(new e5.w(k5Var, dVar, Long.parseLong(tL_error.text.substring(26)), 3));
        } else if (tL_error != null) {
            AndroidUtilities.runOnUIThread(new androidx.car.app.utils.b(k5Var, dVar, tL_error, 21));
        }
    }

    public static void q0(k5 k5Var, TL_stars.StarGift starGift, TL_stars.StarGiftAttribute starGiftAttribute, qc[] qcVarArr, boolean[] zArr, ArrayList arrayList) {
        if (arrayList != null) {
            new l1(k5Var.getContext(), k5Var.resourcesProvider, k5Var.currentAccount, starGift.title, arrayList, false).show();
        } else {
            k5Var.o2(qcVarArr[0], LocaleController.formatString(R.string.Gift2RarityHint, mh.l.F0(starGiftAttribute.getRarityPermille())), false);
        }
        zArr[0] = false;
    }

    public static void q1(wy0 wy0Var, TL_stars.StarGiftAttribute starGiftAttribute) {
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
        wy0Var.e(str, starGiftAttribute.name, J1(starGiftAttribute.rarity, numArr), null, numArr[0]);
    }

    public static void r0(k5 k5Var, TL_stars.TL_starGiftUnique tL_starGiftUnique, gf.a aVar, Runnable runnable, TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tLObject instanceof TLRPC.Updates) {
            MessagesController.getInstance(k5Var.currentAccount).processUpdates((TLRPC.Updates) tLObject, false);
            AndroidUtilities.runOnUIThread(new k2(k5Var, tL_starGiftUnique, aVar, runnable, 0));
            return;
        }
        k5Var.getClass();
        if (tL_error != null && tL_error.text.startsWith("STARGIFT_RESELL_TOO_EARLY_")) {
            AndroidUtilities.runOnUIThread(new e5.w(k5Var, Long.parseLong(tL_error.text.substring(26)), runnable, 2));
        } else if (tL_error != null) {
            AndroidUtilities.runOnUIThread(new l2(k5Var, tL_error, runnable, 0));
        }
    }

    public static void s0(k5 k5Var, String str) {
        Context context = k5Var.getContext();
        ve.e.u(context, MessagesController.getInstance(k5Var.currentAccount).tonBlockchainExplorerUrl + str);
    }

    public static void t0(k5 k5Var, ArrayList arrayList, Utilities.Callback2 callback2, Runnable runnable) {
        fh.e6 e6Var = k5Var.P0;
        if (e6Var != null) {
            e6Var.b();
            k5Var.P0 = null;
        }
        TL_stars.craftStarGift craftstargift = new TL_stars.craftStarGift();
        int size = arrayList.size();
        int i9 = 0;
        while (i9 < size) {
            Object obj = arrayList.get(i9);
            i9++;
            TL_stars.TL_inputSavedStarGiftSlug tL_inputSavedStarGiftSlug = new TL_stars.TL_inputSavedStarGiftSlug();
            tL_inputSavedStarGiftSlug.slug = ((TL_stars.StarGift) obj).slug;
            craftstargift.stargift.add(tL_inputSavedStarGiftSlug);
        }
        ConnectionsManager.getInstance(k5Var.currentAccount).sendRequestTyped(craftstargift, new Object(), new b2(k5Var, callback2, arrayList, runnable, 0));
    }

    public static void u0(gh.k5 r17) {
        throw new UnsupportedOperationException("Method not decompiled: gh.k5.u0(gh.k5):void");
    }

    public static void v0(k5 k5Var, String str) {
        Context context = k5Var.getContext();
        ve.e.u(context, MessagesController.getInstance(k5Var.currentAccount).tonBlockchainExplorerUrl + str);
    }

    public static void w0(k5 k5Var, TLObject tLObject, bg.g3[] g3VarArr, Long l10, androidx.car.app.utils.b bVar, TLRPC.TL_error tL_error) {
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        if (tLObject instanceof TLRPC.TL_users_userFull) {
            TLRPC.TL_users_userFull tL_users_userFull = (TLRPC.TL_users_userFull) tLObject;
            MessagesController.getInstance(k5Var.currentAccount).putUsers(tL_users_userFull.users, false);
            MessagesController.getInstance(k5Var.currentAccount).putChats(tL_users_userFull.chats, false);
            TLRPC.UserFull userFull = tL_users_userFull.full_user;
            if (userFull != null && (disallowedGiftsSettings = userFull.disallowed_stargifts) != null && disallowedGiftsSettings.disallow_unique_stargifts) {
                new oc(g3VarArr[0].container, k5Var.resourcesProvider).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(l10.longValue())))).j();
                return;
            } else {
                bVar.run();
                return;
            }
        }
        gc Y = k5Var.getBulletinFactory().Y(tL_error);
        Y.f28747t = true;
        Y.j();
    }

    public static void x0(k5 k5Var, TLObject tLObject, TLRPC.TL_error tL_error) {
        v1 v1Var = k5Var.f8416j1;
        k5Var.f8410g1 = false;
        if (tLObject instanceof TLRPC.PaymentForm) {
            TLRPC.PaymentForm paymentForm = (TLRPC.PaymentForm) tLObject;
            MessagesController.getInstance(k5Var.currentAccount).putUsers(paymentForm.users, false);
            k5Var.f8412h1 = paymentForm;
            AndroidUtilities.cancelRunOnUIThread(v1Var);
            AndroidUtilities.runOnUIThread(v1Var);
            return;
        }
        gc Y = k5Var.getBulletinFactory().Y(tL_error);
        Y.f28747t = true;
        Y.j();
    }

    public static boolean x1(TL_stars.SavedStarGift savedStarGift, TL_stars.SavedStarGift savedStarGift2) {
        if (savedStarGift != savedStarGift2) {
            if (savedStarGift != null) {
                TL_stars.StarGift starGift = savedStarGift.gift;
                TL_stars.StarGift starGift2 = savedStarGift2.gift;
                if (starGift != starGift2) {
                    if ((starGift instanceof TL_stars.TL_starGiftUnique) && (starGift2 instanceof TL_stars.TL_starGiftUnique)) {
                        if (starGift.f22607id == starGift2.f22607id) {
                            return true;
                        }
                        return false;
                    } else if ((starGift instanceof TL_stars.TL_starGift) && (starGift2 instanceof TL_stars.TL_starGift) && starGift.f22607id == starGift2.f22607id && savedStarGift.date == savedStarGift2.date) {
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

    public static void y0(k5 k5Var, TLObject tLObject, boolean z10, TLRPC.Document document, boolean z11, TLRPC.TL_error tL_error, TL_stars.saveStarGift savestargift) {
        l7 F;
        int i9;
        int i10;
        int i11;
        int i12;
        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
        if (U != null) {
            j2 j2Var = null;
            if (tLObject instanceof TLRPC.TL_boolTrue) {
                k5Var.dismiss();
                long A1 = k5Var.A1();
                if (!z10) {
                    v7.y(k5Var.currentAccount, false).Q(A1);
                }
                if (A1 >= 0) {
                    oc a02 = oc.a0(U);
                    if (z11) {
                        i11 = R.string.Gift2MadePrivateTitle;
                    } else {
                        i11 = R.string.Gift2MadePublicTitle;
                    }
                    String string = LocaleController.getString(i11);
                    if (z11) {
                        i12 = R.string.Gift2MadePrivate;
                    } else {
                        i12 = R.string.Gift2MadePublic;
                    }
                    String string2 = LocaleController.getString(i12);
                    if (!(U instanceof ProfileActivity)) {
                        j2Var = new j2(A1, U);
                    }
                    a02.s(document, string, AndroidUtilities.replaceSingleTag(string2, j2Var)).k(true);
                    return;
                }
                oc a03 = oc.a0(U);
                if (z11) {
                    i9 = R.string.Gift2ChannelMadePrivateTitle;
                } else {
                    i9 = R.string.Gift2ChannelMadePublicTitle;
                }
                String string3 = LocaleController.getString(i9);
                if (z11) {
                    i10 = R.string.Gift2ChannelMadePrivate;
                } else {
                    i10 = R.string.Gift2ChannelMadePublic;
                }
                a03.s(document, string3, LocaleController.getString(i10)).j();
            } else if (tL_error != null) {
                if (z10 && k5Var.f8431y0 != null && (F = v7.y(k5Var.currentAccount, false).F(k5Var.T, false)) != null) {
                    F.m(k5Var.f8431y0, !savestargift.unsave);
                }
                k5Var.getBulletinFactory().t(LocaleController.formatString(R.string.UnknownErrorCode, tL_error.text), null).k(false);
            }
        }
    }

    public static boolean y1(TL_stars.TL_starGiftUnique tL_starGiftUnique, TL_stars.TL_starGiftUnique tL_starGiftUnique2) {
        if (tL_starGiftUnique != tL_starGiftUnique2) {
            if (tL_starGiftUnique != null) {
                if (tL_starGiftUnique.f22607id == tL_starGiftUnique2.f22607id || TextUtils.equals(tL_starGiftUnique.slug, tL_starGiftUnique2.slug)) {
                    return true;
                }
                return false;
            }
            return false;
        }
        return true;
    }

    public static void z0(k5 k5Var, long j10) {
        new fh.p2(k5Var.getContext(), k5Var.currentAccount, j10, null, new z2(k5Var, 2)).show();
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
        TL_stars.SavedStarGift savedStarGift = this.f8431y0;
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
            TL_stars.SavedStarGift savedStarGift = this.f8431y0;
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
            return j3.r0.n(tL_starGiftUnique.num, ',', sb2);
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
            TL_stars.SavedStarGift savedStarGift = this.f8431y0;
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
        TL_stars.SavedStarGift savedStarGift2 = this.f8431y0;
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
        o7 o7Var = this.f8432z0;
        if (o7Var != null) {
            TL_stars.SavedStarGift savedStarGift = this.f8431y0;
            if (savedStarGift != null) {
                indexOf = o7Var.indexOf(savedStarGift);
            } else {
                TL_stars.TL_starGiftUnique tL_starGiftUnique = this.C0;
                if (tL_starGiftUnique != null) {
                    indexOf = o7Var.indexOf(tL_starGiftUnique);
                } else {
                    return -1;
                }
            }
            if (indexOf >= 0) {
                return indexOf;
            }
            TL_stars.StarGift B1 = B1();
            for (int i9 = 0; i9 < this.f8432z0.e(); i9++) {
                Object obj = this.f8432z0.get(i9);
                if (obj instanceof TL_stars.SavedStarGift) {
                    TL_stars.SavedStarGift savedStarGift2 = this.f8431y0;
                    if (savedStarGift2 != null) {
                        if (x1(savedStarGift2, (TL_stars.SavedStarGift) obj)) {
                            return i9;
                        }
                    }
                    if (B1 != null) {
                        TL_stars.StarGift starGift = ((TL_stars.SavedStarGift) obj).gift;
                        if (B1 != starGift) {
                            if ((B1 instanceof TL_stars.TL_starGiftUnique) && (starGift instanceof TL_stars.TL_starGiftUnique) && B1.f22607id == starGift.f22607id) {
                            }
                        }
                        return i9;
                    }
                    continue;
                } else {
                    if ((obj instanceof TL_stars.TL_starGiftUnique) && y1(this.C0, (TL_stars.TL_starGiftUnique) obj)) {
                        return i9;
                    }
                }
            }
            return -1;
        }
        return -1;
    }

    public final TL_stars.SavedStarGift H1(boolean z10) {
        int i9;
        Object obj;
        int G1 = G1();
        if (G1 < 0) {
            return null;
        }
        if (z10) {
            i9 = 1;
        } else {
            i9 = -1;
        }
        int i10 = i9 + G1;
        int i11 = this.N0;
        if (i11 >= 0 && (!z10 ? i11 < G1 : i11 > G1)) {
            i10 = i11;
        }
        o7 o7Var = this.f8432z0;
        if (o7Var != null && i10 >= 0 && i10 < o7Var.e()) {
            obj = this.f8432z0.get(i10);
        } else {
            obj = null;
        }
        if (!(obj instanceof TL_stars.SavedStarGift)) {
            return null;
        }
        return (TL_stars.SavedStarGift) obj;
    }

    public final TL_stars.TL_starGiftUnique I1(boolean z10) {
        int i9;
        Object obj;
        int G1 = G1();
        if (G1 < 0) {
            return null;
        }
        if (z10) {
            i9 = 1;
        } else {
            i9 = -1;
        }
        int i10 = i9 + G1;
        int i11 = this.N0;
        if (i11 >= 0 && (!z10 ? i11 < G1 : i11 > G1)) {
            i10 = i11;
        }
        o7 o7Var = this.f8432z0;
        if (o7Var != null && i10 >= 0 && i10 < o7Var.e()) {
            obj = this.f8432z0.get(i10);
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
        ConnectionsManager.getInstance(this.currentAccount).sendRequest(getstargiftwithdrawalurl, new u2(this, twoStepVerificationActivity, 0));
    }

    public final void Q1() {
        throw new UnsupportedOperationException("Method not decompiled: gh.k5.Q1():void");
    }

    public final void R1(android.view.View r6) {
        throw new UnsupportedOperationException("Method not decompiled: gh.k5.R1(android.view.View):void");
    }

    public final void S1() {
        l3 l3Var = this.S0;
        if (l3Var != null && l3Var.isShown()) {
            this.S0.dismiss();
        }
        String F1 = F1();
        l3 l3Var2 = new l3(this, getContext(), F1, F1, this.resourcesProvider);
        this.S0 = l3Var2;
        l3Var2.f32259o0 = new fa.c(this, 19);
        l3Var2.show();
    }

    public final void T1() {
        throw new UnsupportedOperationException("Method not decompiled: gh.k5.T1():void");
    }

    public final void U1() {
        TL_stars.TL_starGiftUnique K1 = K1();
        if (K1 == null) {
            return;
        }
        oa.f1(getContext(), this.currentAccount, K1, new e3(this, K1, 2), this.resourcesProvider);
    }

    public final void V1(long j10, String str) {
        this.f8402c1 = true;
        v7.y(this.currentAccount, false).K(j10, new fh.f1(4, this, str));
    }

    public final void W1(boolean z10) {
        int i9;
        MessageObject messageObject = this.A0;
        int i10 = 0;
        if (messageObject != null) {
            TLRPC.Message message = messageObject.messageOwner;
            if (message != null) {
                TLRPC.MessageAction messageAction = message.action;
                if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                    i9 = ((TLRPC.TL_messageActionStarGiftUnique) messageAction).can_craft_at;
                }
            }
            i9 = 0;
        } else {
            TL_stars.SavedStarGift savedStarGift = this.f8431y0;
            if (savedStarGift != null) {
                i9 = savedStarGift.can_craft_at;
            }
            i9 = 0;
        }
        if (i9 > ConnectionsManager.getInstance(this.currentAccount).getCurrentTime()) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
            String string = LocaleController.getString(R.string.GiftCraftLaterTitle);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
            c2Var.N = string;
            c2Var.P = LocaleController.formatString(R.string.GiftCraftLaterText, LocaleController.formatDateTime(i9, true));
            org.telegram.messenger.l0.o(R.string.OK, alertDialog$Builder, null);
            return;
        }
        TL_stars.TL_starGiftUnique K1 = K1();
        if (K1 == null) {
            return;
        }
        if (!TextUtils.isEmpty(K1.gift_address)) {
            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
            String string2 = LocaleController.getString(R.string.GiftCraftCantChooseFirstTitle);
            org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.f22702a;
            c2Var2.N = string2;
            c2Var2.P = LocaleController.getString(R.string.GiftCraftCantChooseFirst);
            org.telegram.messenger.l0.o(R.string.OK, alertDialog$Builder2, null);
            return;
        }
        g5 g5Var = this.f8397a0;
        if (z10) {
            g5Var.H.a(this.currentAccount, K1.gift_id, K1.getDocument(), K1.title);
            if (t1()) {
                i4 i4Var = g5Var.H;
                TL_stars.TL_starGiftUnique K12 = K1();
                if (K12 == null) {
                    i4Var.getClass();
                } else {
                    while (true) {
                        g4[] g4VarArr = i4Var.f8293n;
                        if (i10 >= g4VarArr.length) {
                            break;
                        }
                        g4 g4Var = g4VarArr[i10];
                        TL_stars.StarGift starGift = g4Var.h;
                        if (starGift == null) {
                            starGift = null;
                        }
                        if (starGift == null) {
                            g4Var.a(K12, true);
                            break;
                        }
                        i10++;
                    }
                    i4Var.d(true);
                }
            }
        }
        i4 i4Var2 = g5Var.H;
        i4 i4Var3 = g5Var.H;
        i4Var2.setOnCraft(new q1(this, 1));
        if (this.P0 == null) {
            fh.e6 e6Var = new fh.e6(this.currentAccount, K1.gift_id);
            this.P0 = e6Var;
            e6Var.a();
        }
        i4Var3.setOnAddGift(new e3(this, K1, 1));
        i4Var3.setOnClose(new v1(this, 18));
        q2(4, true, null);
    }

    public final void X1(long j10) {
        kh.x3 x3Var = this.f8418k1;
        if (x3Var != null) {
            x3Var.e(true);
            this.f8418k1 = null;
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
        throw new UnsupportedOperationException("Method not decompiled: gh.k5.Y1():void");
    }

    public final void Z1(long j10, Utilities.Callback callback) {
        TLRPC.Message message;
        long j11;
        String str;
        TLRPC.User user;
        String formatString;
        CharSequence string;
        TL_stars.SavedStarGift savedStarGift = this.f8431y0;
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
            linearLayout.addView(new k4(getContext(), K1, user), g7.e6.t(-1, -2, 48, 0, -4, 0, 0));
            TextView textView = new TextView(getContext());
            ll.n(org.telegram.ui.ActionBar.f6.f23108j5, this.resourcesProvider, textView, 1, 16.0f);
            int i9 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
            if (i9 > 0) {
                formatString = LocaleController.formatPluralStringComma("Gift2TransferPriceText", (int) j11, C1(), DialogObject.getShortName(j10));
            } else {
                formatString = LocaleController.formatString(R.string.Gift2TransferText, C1(), str);
            }
            textView.setText(AndroidUtilities.replaceTags(formatString));
            linearLayout.addView(textView, g7.e6.t(-1, -2, 48, 24, 4, 24, 4));
            wy0 wy0Var = new wy0(getContext(), this.resourcesProvider);
            q1(wy0Var, v7.l(K1.attributes, TL_stars.starGiftAttributeModel.class));
            q1(wy0Var, v7.l(K1.attributes, TL_stars.starGiftAttributeBackdrop.class));
            q1(wy0Var, v7.l(K1.attributes, TL_stars.starGiftAttributePattern.class));
            if (!TextUtils.isEmpty(K1.slug) && (K1.flags & 256) != 0) {
                wy0Var.c(LocaleController.getString(R.string.GiftValue2), ta.b.d("~", BillingController.getInstance().formatCurrency(K1.value_amount, K1.value_currency, BillingController.getInstance().getCurrencyExp(K1.value_currency), true)), null, null);
            }
            linearLayout.addView(wy0Var, g7.e6.t(-1, -2, 48, 23, 16, 23, 4));
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
            alertDialog$Builder.n(linearLayout);
            if (i9 > 0) {
                string = oa.Q0(LocaleController.formatString(R.string.Gift2TransferDoPrice, Integer.valueOf((int) j11)));
            } else {
                string = LocaleController.getString(R.string.Gift2TransferDo);
            }
            alertDialog$Builder.k(string, new i3(callback, 0));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), null);
            org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
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
        int i9;
        kh.x3 x3Var = this.f8418k1;
        if (x3Var != null) {
            x3Var.e(true);
            this.f8418k1 = null;
        }
        if (this.V0 == null && (E1 = E1()) != null) {
            MessageObject messageObject = this.A0;
            long j13 = this.T;
            if (messageObject != null) {
                TLRPC.MessageAction messageAction = messageObject.messageOwner.action;
                if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                    TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                    j11 = tL_messageActionStarGift.gift.f22607id;
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
                TL_stars.SavedStarGift savedStarGift = this.f8431y0;
                if (savedStarGift != null) {
                    TL_stars.StarGift starGift = savedStarGift.gift;
                    j11 = starGift.f22607id;
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
                    TL_stars.SavedStarGift savedStarGift2 = this.f8431y0;
                    str = savedStarGift2.prepaid_upgrade_hash;
                    z13 = savedStarGift2.upgrade_separate;
                } else {
                    return;
                }
            }
            TextView textView = this.f8425s0;
            if (z10) {
                if (z12) {
                    i9 = R.string.Gift2AddMyNameNameChannel;
                } else {
                    i9 = R.string.Gift2AddMyNameName;
                }
                textView.setText(LocaleController.getString(i9));
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
            dp dpVar = this.f8424r0;
            dpVar.a(z14, false);
            ArrayList arrayList = this.f8404d1;
            if (arrayList != null && (j12 > j10 || this.f8412h1 != null)) {
                b2();
                return;
            }
            if (arrayList == null) {
                v7.y(this.currentAccount, false).K(j11, new z2(this, 1));
            }
            if (j12 <= j10 && this.f8412h1 == null) {
                this.f8410g1 = true;
                TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                if (!TextUtils.isEmpty(str)) {
                    TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade tL_inputInvoiceStarGiftPrepaidUpgrade = new TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade();
                    tL_inputInvoiceStarGiftPrepaidUpgrade.hash = str;
                    tL_inputInvoiceStarGiftPrepaidUpgrade.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(j13);
                    tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftPrepaidUpgrade;
                } else {
                    TLRPC.TL_inputInvoiceStarGiftUpgrade tL_inputInvoiceStarGiftUpgrade = new TLRPC.TL_inputInvoiceStarGiftUpgrade();
                    tL_inputInvoiceStarGiftUpgrade.keep_original_details = dpVar.f27781a.f26313q;
                    tL_inputInvoiceStarGiftUpgrade.stargift = E1;
                    tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftUpgrade;
                }
                JSONObject p6 = mh.c3.p(this.resourcesProvider, false);
                if (p6 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                    tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                    tL_dataJSON.data = p6.toString();
                    tL_payments_getPaymentForm.flags |= 1;
                }
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getPaymentForm, new g3(this, 0));
            }
        }
    }

    public final void b2() {
        throw new UnsupportedOperationException("Method not decompiled: gh.k5.b2():void");
    }

    public final void c2(final TL_stars.TL_starGiftUnique tL_starGiftUnique, final long j10, final gf.b bVar, final TLRPC.TL_textWithEntities tL_textWithEntities, final boolean z10, final fh.z0 z0Var) {
        this.f8407f0.setLoading(true);
        if (z0Var != null && !z0Var.H) {
            z0Var.H = true;
            z0Var.D.h(true);
        }
        v7.x(this.currentAccount, bVar).H(tL_starGiftUnique, j10, tL_textWithEntities, z10, new Utilities.Callback() {
            @Override
            public final void run(Object obj) {
                k5.a1(k5.this, z0Var, bVar, tL_starGiftUnique, j10, tL_textWithEntities, z10, (TLRPC.TL_payments_paymentFormStarGift) obj);
            }
        });
    }

    @Override
    public final boolean canDismissWithSwipe() {
        if (this.U0.c(4)) {
            boolean z10 = this.f8397a0.H.f8285d0;
        }
        return false;
    }

    @Override
    public final boolean canDismissWithTouchOutside() {
        if (this.U0.c(4) && this.f8397a0.H.f8285d0) {
            return false;
        }
        return super.canDismissWithTouchOutside();
    }

    @Override
    public final boolean canSwipeToBack(MotionEvent motionEvent) {
        if (this.U0.c(4) && this.f8397a0.H.f8285d0) {
            return false;
        }
        return super.canSwipeToBack(motionEvent);
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        if (i9 == NotificationCenter.starUserGiftsLoaded) {
            if (this.f8432z0 == ((n7) objArr[1])) {
                i4 i4Var = this.f8397a0.H;
                if (i4Var == null || !i4Var.f8285d0) {
                    t2();
                }
            }
        }
    }

    @Override
    public final void dismiss() {
        if (this.U0.c(4) && this.f8397a0.H.f8285d0) {
            return;
        }
        fh.e6 e6Var = this.P0;
        if (e6Var != null) {
            e6Var.b();
            this.P0 = null;
        }
        v4 v4Var = this.I0;
        if (v4Var != null) {
            v4Var.a();
        }
        super.dismiss();
    }

    public final SpannableStringBuilder e2(TLRPC.Peer peer) {
        if (peer != null) {
            String publicUsername = DialogObject.getPublicUsername(MessagesController.getInstance(this.currentAccount).getUserOrChat(DialogObject.getPeerDialogId(peer)));
            if (TextUtils.isEmpty(publicUsername)) {
                return null;
            }
            return AndroidUtilities.replaceSingleTag(LocaleController.formatString(R.string.Gift2ReleasedBy2, ta.b.d("@", publicUsername)), new w2(this, publicUsername, 8));
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
    public oc getBulletinFactory() {
        return new oc(this.f8417k0, this.resourcesProvider);
    }

    public final void h2(String str, TL_stars.TL_starGiftUnique tL_starGiftUnique, o7 o7Var) {
        boolean z10;
        boolean z11;
        v4 v4Var;
        TL_stars.TL_starGiftUnique tL_starGiftUnique2;
        this.B0 = str;
        this.C0 = tL_starGiftUnique;
        this.f8432z0 = o7Var;
        if (tL_starGiftUnique.resell_amount != null && !N1(this.currentAccount, DialogObject.getPeerDialogId(tL_starGiftUnique.owner_id))) {
            z10 = true;
        } else {
            z10 = false;
        }
        this.D0 = z10;
        if (!this.J0 && (v4Var = this.I0) != null && v4Var.f9028o && (tL_starGiftUnique2 = v4Var.f9025l) != null && tL_starGiftUnique2.f22607id != tL_starGiftUnique.f22607id) {
            v4Var.a();
            this.I0 = null;
            g5 g5Var = this.f8397a0;
            g5Var.f8108b.setAlpha(1.0f);
            g5Var.f8110c.setAlpha(0.0f);
        }
        this.Z.b(this.currentAccount, this.f8431y0);
        k2(tL_starGiftUnique, false, null, null);
        String str2 = tL_starGiftUnique.owner_address;
        String str3 = tL_starGiftUnique.gift_address;
        if (tL_starGiftUnique.host_id != null) {
            z11 = true;
        } else {
            z11 = false;
        }
        l80 l80Var = this.f8401c0;
        if (z11 && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            l80Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2InBlockchain), new w2(this, str3, 3)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            l80Var.setVisibility(0);
            l80Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23228q5, this.resourcesProvider));
        } else {
            l80Var.setVisibility(8);
        }
        l80 l80Var2 = this.f8405e0;
        if (!z11 && !TextUtils.isEmpty(str2) && !TextUtils.isEmpty(str3)) {
            l80Var2.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2InBlockchain), new w2(this, str3, 4)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            l80Var2.setVisibility(0);
        } else {
            l80Var2.setVisibility(8);
        }
        if (this.D0) {
            l2(tL_starGiftUnique);
            this.f8407f0.setOnClickListener(new n1(this, 7));
        }
        if (this.X0) {
            q2(0, false, null);
            this.f32407c.n0(1);
            this.X0 = false;
        }
        t2();
    }

    public final void i2(org.telegram.messenger.MessageObject r56, gh.o7 r57) {
        throw new UnsupportedOperationException("Method not decompiled: gh.k5.i2(org.telegram.messenger.MessageObject, gh.o7):void");
    }

    public final void j2(TL_stars.SavedStarGift savedStarGift, o7 o7Var) {
        boolean z10;
        boolean z11;
        long j10;
        int i9;
        CharSequence string;
        int i10;
        String string2;
        int i11;
        CharSequence charSequence;
        int i12;
        String formatString;
        int i13;
        CharSequence charSequence2;
        String str;
        TL_stars.StarGift starGift;
        String str2;
        ?? r12;
        int i14;
        ?? r122;
        TL_stars.StarGift starGift2;
        TLRPC.Document document;
        String str3;
        String str4;
        boolean z12;
        int i15;
        String string3;
        String string4;
        CharSequence replaceTags;
        TL_stars.StarGift starGift3;
        int i16;
        ?? r13;
        int i17;
        int i18;
        TLObject tLObject;
        v4 v4Var;
        if (savedStarGift == null) {
            return;
        }
        int i19 = this.currentAccount;
        long j11 = this.T;
        this.f8430x0 = N1(i19, j11);
        this.f8431y0 = savedStarGift;
        this.f8432z0 = o7Var;
        this.A0 = null;
        boolean z13 = this.J0;
        g5 g5Var = this.f8397a0;
        if (!z13 && (v4Var = this.I0) != null && v4Var.f9028o && v4Var.f9025l != null) {
            v4Var.a();
            this.I0 = null;
            g5Var.f8108b.setVisibility(0);
            g5Var.f8110c.setVisibility(4);
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
        int i20 = (j11 > 0L ? 1 : (j11 == 0L ? 0 : -1));
        if (i20 < 0) {
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
            if (this.f8430x0 && clientUserId == peerDialogId && i20 >= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z15 = z11;
            boolean P1 = P1(this.currentAccount, K1());
            F1();
            g5Var.f(starGift4, false, false, P1);
            wy0 wy0Var = this.f8403d0;
            wy0Var.removeAllViews();
            SpannableString spannableString = "";
            if (z15) {
                if (savedStarGift.gift_num != 0 && (starGift3 = savedStarGift.gift) != null && starGift3.title != null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(savedStarGift.gift.title);
                    sb2.append(" #");
                    j10 = clientUserId;
                    string4 = j3.r0.n(savedStarGift.gift_num, ',', sb2);
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
                g5Var.i(0, string4, replaceTags, f2(savedStarGift.gift));
            } else {
                j10 = clientUserId;
                if (z10 && !this.f8430x0) {
                    String string5 = LocaleController.getString(R.string.Gift2TitleProfile);
                    this.O0 = string5;
                    g5Var.i(0, string5, null, e2(savedStarGift.gift.released_by));
                } else {
                    boolean z16 = this.f8430x0;
                    if ((!z16 || savedStarGift.can_upgrade) && savedStarGift.upgrade_stars > 0) {
                        if (z16) {
                            i9 = R.string.Gift2TitleReceived;
                        } else {
                            i9 = R.string.Gift2TitleProfile;
                        }
                        String string6 = LocaleController.getString(i9);
                        this.O0 = string6;
                        if (z14 || !this.f8430x0) {
                            string = null;
                        } else {
                            string = LocaleController.getString(R.string.Gift2InfoInFreeUpgrade);
                        }
                        g5Var.i(0, string6, string, f2(savedStarGift.gift));
                    } else {
                        if (savedStarGift.gift_num != 0 && (starGift = savedStarGift.gift) != null && starGift.title != null) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(savedStarGift.gift.title);
                            sb3.append(" #");
                            string2 = j3.r0.n(savedStarGift.gift_num, ',', sb3);
                        } else {
                            if (z16) {
                                i10 = R.string.Gift2TitleReceived;
                            } else {
                                i10 = R.string.Gift2TitleProfile;
                            }
                            string2 = LocaleController.getString(i10);
                        }
                        this.O0 = string2;
                        if (z14 || !this.f8430x0) {
                            i11 = 0;
                            charSequence = null;
                        } else {
                            if (!isBot && s1()) {
                                if (this.f8430x0) {
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
                            } else if (this.f8430x0) {
                                if (savedStarGift.unsaved) {
                                    if (z10) {
                                        i13 = R.string.Gift2Info2ChannelKeep;
                                    } else {
                                        i13 = R.string.Gift2Info2BotKeep;
                                    }
                                } else if (z10) {
                                    i13 = R.string.Gift2Info2ChannelRemove;
                                } else {
                                    i13 = R.string.Gift2Info2BotRemove;
                                }
                                formatString = LocaleController.getString(i13);
                            } else {
                                if (savedStarGift.can_upgrade && savedStarGift.upgrade_stars > 0) {
                                    i12 = R.string.Gift2Info2OutUpgrade;
                                } else {
                                    i12 = R.string.Gift2Info2OutExpired;
                                }
                                formatString = LocaleController.formatString(i12, shortName);
                            }
                            SpannableStringBuilder replaceTags2 = AndroidUtilities.replaceTags(formatString);
                            if (!isBot && s1()) {
                                charSequence2 = AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2More).replace(' ', (char) 160), new v1(this, 1)), true);
                            } else {
                                charSequence2 = spannableString;
                            }
                            i11 = 0;
                            charSequence = TextUtils.concat(replaceTags2, " ", charSequence2);
                        }
                        g5Var.i(i11, string2, charSequence, f2(savedStarGift.gift));
                    }
                }
            }
            if (j10 != peerDialogId || z10) {
                TLRPC.User user = MessagesController.getInstance(this.currentAccount).getUser(Long.valueOf(peerDialogId));
                String string7 = LocaleController.getString(R.string.Gift2From);
                int i21 = this.currentAccount;
                w1 w1Var = new w1(this, peerDialogId, 1);
                if (peerDialogId != j10 && peerDialogId != 2666000 && !isBot && !UserObject.isDeleted(user) && !z10) {
                    str2 = LocaleController.getString(R.string.Gift2ButtonSendGift);
                } else {
                    str2 = null;
                }
                this.f8403d0.j(string7, i21, peerDialogId, w1Var, str2, new w1(this, peerDialogId, 2));
            }
            wy0Var.c(LocaleController.getString(R.string.StarsTransactionDate), LocaleController.formatString(R.string.formatDateAtTime, LocaleController.getInstance().getFormatterGiveawayCard().format(new Date(savedStarGift.date * 1000)), LocaleController.getInstance().getFormatterDay().format(new Date(savedStarGift.date * 1000))), null, null);
            String string8 = LocaleController.getString(R.string.Gift2Value);
            String n10 = j3.r0.n(savedStarGift.gift.stars + savedStarGift.upgrade_stars, ',', new StringBuilder("⭐️ "));
            if (s1() && !z14) {
                r12 = 0;
                spannableString = rc.b(LocaleController.formatPluralStringComma("Gift2ButtonSell", (int) savedStarGift.convert_stars), new v1(this, 4), this.resourcesProvider, null);
            } else {
                r12 = 0;
            }
            wy0Var.c(string8, oa.X0(false, TextUtils.concat(n10, " ", spannableString), 0.8f, r12), r12, r12);
            TL_stars.StarGift starGift5 = savedStarGift.gift;
            if (starGift5.limited && !z14) {
                oa.E0(wy0Var, this.currentAccount, starGift5, this.resourcesProvider);
            }
            TLRPC.TL_textWithEntities tL_textWithEntities2 = savedStarGift.message;
            if (tL_textWithEntities2 != null && !TextUtils.isEmpty(tL_textWithEntities2.text) && !z14) {
                TLRPC.TL_textWithEntities tL_textWithEntities3 = savedStarGift.message;
                wy0Var.b(tL_textWithEntities3.text, tL_textWithEntities3.entities);
            }
            boolean z17 = this.f8430x0;
            kh.d dVar = this.f8407f0;
            if (z17 && savedStarGift.can_upgrade) {
                SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder("^  ");
                if (this.W0 == null) {
                    i15 = 0;
                    this.W0 = new eq(0, new h5(dVar, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Oh, this.resourcesProvider)));
                } else {
                    i15 = 0;
                }
                spannableStringBuilder.setSpan(this.W0, i15, 1, 33);
                if (savedStarGift.upgrade_stars > 0) {
                    string3 = LocaleController.getString(R.string.Gift2UpgradeButtonFree);
                } else {
                    string3 = LocaleController.getString(R.string.Gift2UpgradeButtonGift);
                }
                spannableStringBuilder.append((CharSequence) string3);
                dVar.setFilled(true);
                dVar.g(spannableStringBuilder, !this.X0, true);
                dVar.f(null, !this.X0);
                dVar.setOnClickListener(new n1(this, 3));
            } else if (this.m0 && z17 && this.V != null && this.f8432z0 != null && G1() >= 0 && this.f8432z0.b(G1()) >= 0) {
                dVar.setFilled(false);
                int b10 = this.f8432z0.b(G1());
                SpannableStringBuilder spannableStringBuilder2 = new SpannableStringBuilder();
                spannableStringBuilder2.append((CharSequence) LocaleController.getString(R.string.Gift2UpgradeNext));
                Object obj = this.f8432z0.get(b10);
                if ((obj instanceof TL_stars.SavedStarGift) && (starGift2 = ((TL_stars.SavedStarGift) obj).gift) != null && (document = starGift2.getDocument()) != null) {
                    spannableStringBuilder2.append((CharSequence) " e");
                    r122 = 1;
                    spannableStringBuilder2.setSpan(new org.telegram.ui.Components.t5(document, dVar.getTextPaint().getFontMetricsInt()), spannableStringBuilder2.length() - 1, spannableStringBuilder2.length(), 33);
                } else {
                    r122 = 1;
                }
                dVar.g(spannableStringBuilder2, (this.X0 ? 1 : 0) ^ r122, r122);
                dVar.f(null, (this.X0 ? 1 : 0) ^ r122);
                dVar.setOnClickListener(new z1(this, b10, r122));
            } else if ((savedStarGift.gift instanceof TL_stars.TL_starGift) && !TextUtils.isEmpty(savedStarGift.prepaid_upgrade_hash)) {
                SpannableStringBuilder spannableStringBuilder3 = new SpannableStringBuilder("^  ");
                if (this.W0 == null) {
                    i14 = 0;
                    this.W0 = new eq(0, new h5(dVar, org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Oh, this.resourcesProvider)));
                } else {
                    i14 = 0;
                }
                spannableStringBuilder3.setSpan(this.W0, i14, 1, 33);
                spannableStringBuilder3.append((CharSequence) LocaleController.getString(R.string.Gift2GiftAnUpgrade));
                dVar.setFilled(true);
                dVar.g(spannableStringBuilder3, !this.X0, true);
                dVar.f(null, !this.X0);
                dVar.setOnClickListener(new n1(this, 5));
            } else {
                dVar.setFilled(true);
                dVar.g(LocaleController.getString(R.string.OK), !this.X0, true);
                dVar.f(null, !this.X0);
                dVar.setOnClickListener(new n1(this, 6));
            }
            str3 = null;
            str4 = null;
            z12 = false;
        }
        boolean z18 = savedStarGift.refunded;
        l80 l80Var = this.f8401c0;
        if (z18) {
            l80Var.setVisibility(0);
            l80Var.setText(LocaleController.getString(R.string.Gift2Refunded));
            l80Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23230q7, this.resourcesProvider));
        } else if (z12 && !TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
            l80Var.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2InBlockchain), new w2(this, str4, 1)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            l80Var.setVisibility(0);
            l80Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23228q5, this.resourcesProvider));
        } else if (TextUtils.isEmpty(str3) && TextUtils.isEmpty(str4) && this.f8430x0 && (savedStarGift.gift instanceof TL_stars.TL_starGift) && savedStarGift.name_hidden) {
            l80Var.setVisibility(0);
            if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
                i16 = R.string.Gift2InSenderMessageHidden2;
            } else {
                i16 = R.string.Gift2InSenderHidden2;
            }
            l80Var.setText(LocaleController.getString(i16));
            l80Var.setTextColor(org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.f23228q5, this.resourcesProvider));
        } else {
            l80Var.setVisibility(8);
        }
        l80 l80Var2 = this.f8405e0;
        if (!z12 && !TextUtils.isEmpty(str3) && !TextUtils.isEmpty(str4)) {
            l80Var2.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.Gift2InBlockchain), new w2(this, str4, 2)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            r13 = 0;
            l80Var2.setVisibility(0);
        } else if (this.f8430x0 && N1(this.currentAccount, j11)) {
            if (i20 >= 0) {
                SpannableStringBuilder spannableStringBuilder4 = new SpannableStringBuilder();
                if (savedStarGift.unsaved) {
                    spannableStringBuilder4.append((CharSequence) ". ");
                    spannableStringBuilder4.setSpan(new eq(R.drawable.mini_gift_hidden, 0), 0, 1, 33);
                }
                if (!savedStarGift.unsaved) {
                    i18 = R.string.Gift2ProfileVisible4;
                } else {
                    i18 = R.string.Gift2ProfileInvisible4;
                }
                spannableStringBuilder4.append((CharSequence) AndroidUtilities.replaceSingleTag(LocaleController.getString(i18), new v1(this, 3)));
                l80Var2.setText(AndroidUtilities.replaceArrows(spannableStringBuilder4, true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            } else {
                if (!savedStarGift.unsaved) {
                    i17 = R.string.Gift2ChannelProfileVisible3;
                } else {
                    i17 = R.string.Gift2ChannelProfileInvisible3;
                }
                l80Var2.setText(AndroidUtilities.replaceArrows(AndroidUtilities.replaceSingleTag(LocaleController.getString(i17), new v1(this, 3)), true, AndroidUtilities.dp(2.6666667f), AndroidUtilities.dp(0.66f)));
            }
            r13 = 0;
            l80Var2.setVisibility(0);
        } else {
            r13 = 0;
            l80Var2.setVisibility(8);
        }
        if (this.X0) {
            q2(r13, r13, null);
            this.f32407c.n0(1);
            this.X0 = r13;
        }
        this.f32408e.setTitle(this.O0);
        t2();
    }

    public final void k2(org.telegram.tgnet.tl.TL_stars.TL_starGiftUnique r37, boolean r38, org.telegram.tgnet.TLObject r39, org.telegram.tgnet.TLRPC.TL_textWithEntities r40) {
        throw new UnsupportedOperationException("Method not decompiled: gh.k5.k2(org.telegram.tgnet.tl.TL_stars$TL_starGiftUnique, boolean, org.telegram.tgnet.TLObject, org.telegram.tgnet.TLRPC$TL_textWithEntities):void");
    }

    public final void l2(TL_stars.TL_starGiftUnique tL_starGiftUnique) {
        gf.a resellAmount = tL_starGiftUnique.getResellAmount(gf.b.f7749a);
        boolean z10 = tL_starGiftUnique.resale_ton_only;
        kh.d dVar = this.f8407f0;
        if (z10) {
            dVar.g(oa.S0(LocaleController.formatString(R.string.ResellGiftBuyTON, tL_starGiftUnique.getResellAmount(gf.b.f7750b).d()), true), !this.X0, true);
            dVar.f(oa.Q0(LocaleController.formatPluralStringComma("ResellGiftBuyEq", (int) resellAmount.a())), !this.X0);
            return;
        }
        dVar.g(oa.Q0(LocaleController.formatPluralStringComma("ResellGiftBuy", (int) resellAmount.a())), !this.X0, true);
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
        this.f8428v0.setText(LocaleController.formatString(R.string.Gift2WearTitle, j3.r0.n(K1.num, ',', sb2)));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(LocaleController.getString(R.string.Gift2WearStart));
        if (peerDialogId == UserConfig.getInstance(this.currentAccount).getClientUserId() && !UserConfig.getInstance(this.currentAccount).isPremium()) {
            spannableStringBuilder.append((CharSequence) " l");
            if (this.Q0 == null) {
                this.Q0 = new eq(R.drawable.msg_mini_lock3, 0);
            }
            spannableStringBuilder.setSpan(this.Q0, spannableStringBuilder.length() - 1, spannableStringBuilder.length(), 33);
        }
        kh.d dVar = this.f8407f0;
        dVar.g(spannableStringBuilder, true, true);
        dVar.f(null, true);
        dVar.setOnClickListener(new n1(this, 21));
        this.f8397a0.setWearPreview(MessagesController.getInstance(this.currentAccount).getUserOrChat(peerDialogId));
        q2(2, false, null);
        this.f8426t0 = true;
    }

    public final void n2(CharSequence charSequence) {
        TL_stars.TL_starGiftUnique K1 = K1();
        TL_stars.InputSavedStarGift E1 = E1();
        if (E1 != null && K1 != null) {
            TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails tL_inputInvoiceStarGiftDropOriginalDetails = new TLRPC.TL_inputInvoiceStarGiftDropOriginalDetails();
            tL_inputInvoiceStarGiftDropOriginalDetails.stargift = E1;
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftDropOriginalDetails;
            JSONObject p6 = mh.c3.p(this.resourcesProvider, false);
            if (p6 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = p6.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getPaymentForm, new fh.h1(this, charSequence, K1, tL_inputInvoiceStarGiftDropOriginalDetails, 1));
        }
    }

    public final void o2(View view, CharSequence charSequence, boolean z10) {
        Layout layout;
        float primaryHorizontal;
        int i9;
        kh.x3 x3Var = this.f8418k1;
        if ((x3Var == null || !x3Var.R || this.l1 != view) && view != null) {
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
                        rc[] rcVarArr = (rc[]) spanned.getSpans(0, spanned.length(), rc.class);
                        if (rcVarArr != null && rcVarArr.length > 0) {
                            rc rcVar = rcVarArr[rcVarArr.length - 1];
                            primaryHorizontal = layout.getPrimaryHorizontal(spanned.getSpanStart(rcVar)) + view.getPaddingLeft() + (rcVar.a() / 2.0f);
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
            bh.g gVar = this.U;
            gVar.getLocationOnScreen(iArr);
            int[] iArr2 = {iArr2[0] - iArr[0], iArr2[1] - iArr[1]};
            kh.x3 x3Var2 = this.f8418k1;
            if (x3Var2 != null) {
                x3Var2.e(true);
                this.f8418k1 = null;
            }
            kh.x3 x3Var3 = new kh.x3(getContext(), 3);
            x3Var3.q(!z10);
            x3Var3.t(charSequence);
            x3Var3.n(0.0f, (iArr2[0] + primaryHorizontal) - (AndroidUtilities.dp(16.0f) + this.backgroundPaddingLeft));
            float dp = (iArr2[1] - AndroidUtilities.dp(100.0f)) - (view.getHeight() / 2.0f);
            if (z10) {
                i9 = 18;
            } else {
                i9 = 0;
            }
            x3Var3.setTranslationY(dp + AndroidUtilities.dp(i9 + 4.33f));
            x3Var3.d = 3000L;
            x3Var3.setPadding(AndroidUtilities.dp(16.0f) + this.backgroundPaddingLeft, 0, AndroidUtilities.dp(16.0f) + this.backgroundPaddingLeft, 0);
            x3Var3.f16352h0 = new fh.b0(x3Var3, 1);
            x3Var3.v();
            gVar.addView(x3Var3, g7.e6.c(100.0f, -1));
            this.f8418k1 = x3Var3;
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
        g5 g5Var;
        i4 i4Var;
        if (this.U0.c(4) && (g5Var = this.f8397a0) != null && (i4Var = g5Var.H) != null) {
            if (i4Var.f8285d0) {
                return;
            }
            if (i4Var.f8287e0) {
                super.onBackPressed();
                return;
            }
        }
        if (!this.f8426t0 && this.U0.f8490c > 0 && !this.f8407f0.J && !this.f8402c1) {
            MessageObject messageObject = this.A0;
            if (messageObject != null) {
                i2(messageObject, null);
            } else {
                TL_stars.SavedStarGift savedStarGift = this.f8431y0;
                if (savedStarGift != null) {
                    j2(savedStarGift, this.f8432z0);
                } else {
                    TL_stars.TL_starGiftUnique tL_starGiftUnique = this.C0;
                    if (tL_starGiftUnique != null) {
                        h2(this.B0, tL_starGiftUnique, this.f8432z0);
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
        kh.x3 x3Var = this.f8418k1;
        if (x3Var != null) {
            x3Var.e(true);
            this.f8418k1 = null;
        }
    }

    public final void p1(TL_stars.StarGiftAttribute starGiftAttribute) {
        String string;
        char c10;
        v4 v4Var;
        TL_stars.StarGiftAttribute starGiftAttribute2;
        k5 k5Var;
        androidx.car.app.utils.c cVar;
        if (starGiftAttribute instanceof TL_stars.starGiftAttributeModel) {
            string = LocaleController.getString(R.string.Gift2AttributeModel);
            c10 = 2;
        } else if (starGiftAttribute instanceof TL_stars.starGiftAttributePattern) {
            string = LocaleController.getString(R.string.Gift2AttributeSymbol);
            c10 = 1;
        } else if (starGiftAttribute instanceof TL_stars.starGiftAttributeBackdrop) {
            string = LocaleController.getString(R.string.Gift2AttributeBackdrop);
            c10 = 0;
        } else {
            return;
        }
        if (!this.J0 && ((v4Var = this.I0) == null || !v4Var.f9028o)) {
            boolean[] zArr = new boolean[1];
            qc[] qcVarArr = new qc[1];
            Integer[] numArr = new Integer[1];
            String J1 = J1(starGiftAttribute.rarity, numArr);
            if (starGiftAttribute.rarity instanceof TL_stars.TL_starGiftAttributeRarity) {
                starGiftAttribute2 = starGiftAttribute;
                cVar = new androidx.car.app.utils.c(this, zArr, starGiftAttribute2, qcVarArr, 5);
                k5Var = this;
            } else {
                starGiftAttribute2 = starGiftAttribute;
                k5Var = this;
                cVar = null;
            }
            qcVarArr[0] = (qc) ((ty0) k5Var.f8403d0.e(string, starGiftAttribute2.name, J1, cVar, numArr[0]).getChildAt(1)).getChildAt(0);
            return;
        }
        a5 a5Var = new a5(getContext(), this.resourcesProvider, new q1(this, 0));
        TableRow tableRow = new TableRow(getContext());
        TableRow.LayoutParams layoutParams = new TableRow.LayoutParams(-2, -1);
        wy0 wy0Var = this.f8403d0;
        tableRow.addView(new vy0(wy0Var, string), layoutParams);
        tableRow.addView(new ty0(wy0Var, a5Var, true), new TableRow.LayoutParams(0, -1, 1.0f));
        wy0Var.addView(tableRow);
        v4 v4Var2 = this.I0;
        if (v4Var2 != null) {
            if (c10 == 0) {
                v4Var2.d = a5Var;
            }
            if (c10 == 1) {
                v4Var2.f9018c = a5Var;
            }
            if (c10 == 2) {
                v4Var2.f9017b = a5Var;
            }
        }
    }

    public final void p2(int i9, Context context, boolean z10) {
        int i10;
        int i11;
        LinearLayout f10 = ll.f(context, 1);
        FrameLayout frameLayout = new FrameLayout(context);
        frameLayout.setBackground(org.telegram.ui.ActionBar.f6.K(AndroidUtilities.dp(64.0f), org.telegram.ui.ActionBar.f6.v0(org.telegram.ui.ActionBar.f6.Oh, this.resourcesProvider)));
        f10.addView(frameLayout, g7.e6.t(64, 64, 49, 0, 6, 0, 0));
        ?? imageView = new ImageView(context);
        imageView.setScaleType(ImageView.ScaleType.CENTER);
        imageView.f(R.raw.timer_3, 42, 42, null);
        frameLayout.addView((View) imageView, g7.e6.q(64, 64, 17));
        imageView.d();
        TextView b10 = g7.i6.b(context, 20.0f, org.telegram.ui.ActionBar.f6.G6, true, null);
        b10.setGravity(17);
        if (z10) {
            i10 = R.string.Gift2ResellTimeoutTitle;
        } else {
            i10 = R.string.Gift2TransferTimeoutTitle;
        }
        b10.setText(LocaleController.getString(i10));
        f10.addView(b10, g7.e6.t(-1, -2, 48, 24, 14, 24, 0));
        TextView b11 = g7.i6.b(context, 14.0f, org.telegram.ui.ActionBar.f6.F6, false, null);
        b11.setGravity(17);
        if (z10) {
            i11 = R.string.Gift2ResellTimeout;
        } else {
            i11 = R.string.Gift2TransferTimeout;
        }
        b11.setText(LocaleController.formatString(i11, LocaleController.formatTTLString(Math.max(10, i9))));
        f10.addView(b11, g7.e6.t(-1, -2, 48, 24, 6, 24, 6));
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(context, 0, this.resourcesProvider);
        alertDialog$Builder.n(f10);
        org.telegram.messenger.l0.o(R.string.OK, alertDialog$Builder, null);
    }

    public final void q2(int r12, boolean r13, eh.f r14) {
        throw new UnsupportedOperationException("Method not decompiled: gh.k5.q2(int, boolean, eh.f):void");
    }

    public final void r1(TL_stars.InputSavedStarGift inputSavedStarGift, TLRPC.Updates updates, Runnable runnable) {
        TLRPC.Message message;
        TL_stars.StarGift starGift;
        if (updates == null) {
            v7.y(this.currentAccount, false).Q(A1());
            dismiss();
            return;
        }
        TLRPC.Update update = updates.update;
        if (update instanceof TL_update.TL_updateNewMessage) {
            message = ((TL_update.TL_updateNewMessage) update).message;
        } else {
            if (updates.updates != null) {
                for (int i9 = 0; i9 < updates.updates.size(); i9++) {
                    TLRPC.Update update2 = updates.updates.get(i9);
                    if (update2 instanceof TL_update.TL_updateNewMessage) {
                        message = ((TL_update.TL_updateNewMessage) update2).message;
                        break;
                    }
                }
            }
            message = null;
        }
        if (message != null) {
            TL_stars.SavedStarGift savedStarGift = this.f8431y0;
            if (savedStarGift != null && (!(inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftUser) ? !(!(inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftChat) ? !(inputSavedStarGift instanceof TL_stars.TL_inputSavedStarGiftSlug) || (starGift = savedStarGift.gift) == null || !TextUtils.equals(starGift.slug, ((TL_stars.TL_inputSavedStarGiftSlug) inputSavedStarGift).slug) : savedStarGift.saved_id != ((TL_stars.TL_inputSavedStarGiftChat) inputSavedStarGift).saved_id) : savedStarGift.msg_id == ((TL_stars.TL_inputSavedStarGiftUser) inputSavedStarGift).msg_id)) {
                TLRPC.MessageAction messageAction = message.action;
                if (messageAction instanceof TLRPC.TL_messageActionStarGiftUnique) {
                    this.J0 = true;
                    TLRPC.TL_messageActionStarGiftUnique tL_messageActionStarGiftUnique = (TLRPC.TL_messageActionStarGiftUnique) messageAction;
                    TL_stars.SavedStarGift savedStarGift2 = this.f8431y0;
                    savedStarGift2.gift = tL_messageActionStarGiftUnique.gift;
                    savedStarGift2.msg_id = message.f22401id;
                    savedStarGift2.flags = (savedStarGift2.flags | 8) & (-2049);
                    savedStarGift2.saved_id = 0L;
                    savedStarGift2.unsaved = !tL_messageActionStarGiftUnique.saved;
                    savedStarGift2.refunded = tL_messageActionStarGiftUnique.refunded;
                    savedStarGift2.can_upgrade = false;
                    savedStarGift2.can_resell_at = tL_messageActionStarGiftUnique.can_resell_at;
                    savedStarGift2.can_transfer_at = tL_messageActionStarGiftUnique.can_transfer_at;
                    savedStarGift2.can_export_at = tL_messageActionStarGiftUnique.can_export_at;
                    j2(savedStarGift2, this.f8432z0);
                    this.f8404d1 = null;
                    this.J0 = false;
                    o7 o7Var = this.f8432z0;
                    if (o7Var != null) {
                        o7Var.d();
                    } else {
                        v7.y(this.currentAccount, false).Q(this.T);
                    }
                    AndroidUtilities.runOnUIThread(runnable);
                    return;
                }
            }
            if (this.f8432z0 == null) {
                v7.y(this.currentAccount, false).Q(A1());
            }
            this.J0 = true;
            this.f8431y0 = null;
            this.f8430x0 = false;
            MessageObject messageObject = new MessageObject(this.currentAccount, message, false, false);
            messageObject.setType();
            i2(messageObject, this.f8432z0);
            this.f8404d1 = null;
            this.J0 = false;
            AndroidUtilities.runOnUIThread(runnable);
            return;
        }
        v7.y(this.currentAccount, false).Q(A1());
        dismiss();
    }

    public final void r2(boolean z10) {
        int i9;
        int i10;
        TL_stars.TL_starGiftUnique K1 = K1();
        if (K1 == null) {
            return;
        }
        MessagesController.getGlobalMainSettings().edit().putInt("statusgiftpage", 3).apply();
        boolean P1 = P1(this.currentAccount, K1());
        boolean z11 = !P1;
        boolean P12 = P1(this.currentAccount, K1());
        kh.d dVar = this.f8407f0;
        if (P12) {
            MessagesController.getInstance(this.currentAccount).updateEmojiStatus(A1(), new TLRPC.TL_emojiStatusEmpty(), null);
        } else {
            final long A1 = A1();
            if (A1 >= 0) {
                if (!UserConfig.getInstance(this.currentAccount).isPremium()) {
                    gc P = getBulletinFactory().P(R.raw.star_premium_2, AndroidUtilities.premiumText(LocaleController.getString(R.string.Gift2ActionWearNeededPremium), new v1(this, 24)));
                    P.f28747t = true;
                    P.j();
                    return;
                }
            } else if (!z10) {
                final MessagesController messagesController = MessagesController.getInstance(this.currentAccount);
                dVar.setLoading(true);
                MessagesController.getInstance(this.currentAccount).getBoostsController().getBoostsStats(A1, new d5.d() {
                    @Override
                    public final void accept(Object obj) {
                        TL_stories.TL_premium_boostsStatus tL_premium_boostsStatus = (TL_stories.TL_premium_boostsStatus) obj;
                        k5 k5Var = k5.this;
                        if (tL_premium_boostsStatus != null) {
                            int i11 = tL_premium_boostsStatus.level;
                            MessagesController messagesController2 = messagesController;
                            if (i11 < messagesController2.channelEmojiStatusLevelMin) {
                                ChannelBoostsController boostsController = messagesController2.getBoostsController();
                                long j10 = A1;
                                boostsController.userCanBoostChannel(j10, tL_premium_boostsStatus, new y1(k5Var, tL_premium_boostsStatus, j10, messagesController2, 0));
                                return;
                            }
                        }
                        k5Var.f8407f0.setLoading(false);
                        k5Var.r2(true);
                    }
                });
                return;
            }
            TLRPC.TL_inputEmojiStatusCollectible tL_inputEmojiStatusCollectible = new TLRPC.TL_inputEmojiStatusCollectible();
            tL_inputEmojiStatusCollectible.collectible_id = K1.f22607id;
            MessagesController.getInstance(this.currentAccount).updateEmojiStatus(A1(), tL_inputEmojiStatusCollectible, K1);
        }
        fh.v vVar = this.f8397a0.E[1];
        if (!P1) {
            i9 = R.drawable.filled_crown_off;
        } else {
            i9 = R.drawable.filled_crown_on;
        }
        if (!P1) {
            i10 = R.string.Gift2ActionWearOff;
        } else {
            i10 = R.string.Gift2ActionWear;
        }
        vVar.b(i9, LocaleController.getString(i10), true);
        if (this.f8426t0) {
            dismiss();
            return;
        }
        eh.f fVar = new eh.f(2, this, z11);
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
        int i9;
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
            TL_stars.SavedStarGift savedStarGift = this.f8431y0;
            if (savedStarGift != null) {
                int currentTime2 = MessagesController.getInstance(this.currentAccount).stargiftsConvertPeriodMax - (ConnectionsManager.getInstance(this.currentAccount).getCurrentTime() - savedStarGift.date);
                int i10 = this.currentAccount;
                long j10 = this.T;
                if (O1(i10, j10)) {
                    int i11 = this.f8431y0.flags;
                    if (j10 < 0) {
                        i9 = 2048;
                    } else {
                        i9 = 8;
                    }
                    if ((i9 & i11) != 0 && (i11 & 16) != 0 && (i11 & 2) != 0 && currentTime2 > 0) {
                        return true;
                    }
                }
            }
        }
        return false;
    }

    public final void s2() {
        FrameLayout frameLayout = this.f8413i0;
        int visibility = frameLayout.getVisibility();
        FrameLayout frameLayout2 = this.f8417k0;
        FrameLayout frameLayout3 = this.f8409g0;
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
            org.telegram.ui.b.b(this.currentAccount);
            return;
        }
        if (this.B0 != null && this.C0 == null) {
            org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(getContext(), 3, null);
            c2Var.q(500L);
            TL_stars.getUniqueStarGift getuniquestargift = new TL_stars.getUniqueStarGift();
            getuniquestargift.slug = this.B0;
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(getuniquestargift, new bg.j0(7, this, c2Var));
        } else if (this.f8431y0 == null && (messageObject = this.A0) != null && (message = messageObject.messageOwner) != null) {
            TLRPC.MessageAction messageAction = message.action;
            if (messageAction instanceof TLRPC.TL_messageActionStarGift) {
                TLRPC.TL_messageActionStarGift tL_messageActionStarGift = (TLRPC.TL_messageActionStarGift) messageAction;
                if (tL_messageActionStarGift.upgraded) {
                    if (tL_messageActionStarGift.upgrade_msg_id != 0) {
                        org.telegram.ui.ActionBar.c2 c2Var2 = new org.telegram.ui.ActionBar.c2(getContext(), 3, null);
                        c2Var2.q(500L);
                        TLRPC.TL_messages_getMessages tL_messages_getMessages = new TLRPC.TL_messages_getMessages();
                        tL_messages_getMessages.f22474id.add(Integer.valueOf(tL_messageActionStarGift.upgrade_msg_id));
                        ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_messages_getMessages, new bg.b0(this, tL_messageActionStarGift, c2Var2, 7));
                        return;
                    } else if (E1() != null) {
                        org.telegram.ui.ActionBar.c2 c2Var3 = new org.telegram.ui.ActionBar.c2(getContext(), 3, null);
                        c2Var3.q(500L);
                        v7.y(this.currentAccount, false).M(E1(), new fh.f1(5, this, c2Var3));
                        return;
                    }
                }
            }
        }
        super.show();
    }

    public final boolean t1() {
        int i9;
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
            i9 = ((TLRPC.TL_messageActionStarGiftUnique) messageAction).can_craft_at;
        } else {
            TL_stars.SavedStarGift savedStarGift = this.f8431y0;
            if (savedStarGift != null && (savedStarGift.gift instanceof TL_stars.TL_starGiftUnique)) {
                i9 = savedStarGift.can_craft_at;
            }
            return false;
        }
        int currentTime = ConnectionsManager.getInstance(this.currentAccount).getCurrentTime();
        if (i9 <= 0 || currentTime < i9) {
            return false;
        }
        return true;
    }

    public final void t2() {
        boolean L1 = L1(false);
        q3 q3Var = this.V;
        q3Var.setPosition(L1 ? 1 : 0);
        q3Var.C(false);
        if (this.f8432z0 != null && !L1(true) && this.f8432z0.e() < this.f8432z0.c()) {
            this.f8432z0.a();
        }
    }

    public final void u1() {
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(getContext(), 0, this.resourcesProvider);
        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.Gift2CantDoTitle);
        alertDialog$Builder.f22702a.P = LocaleController.getString(R.string.Gift2CantDoText);
        TL_stars.TL_starGiftUnique K1 = K1();
        if (K1 != null && !TextUtils.isEmpty(K1.slug)) {
            alertDialog$Builder.k(LocaleController.getString(R.string.OpenFragment), new d3(this, K1, 1));
        }
        j3.r0.v(R.string.Cancel, alertDialog$Builder, null);
    }

    @Override
    public final vk0 v(wk0 wk0Var) {
        t3 t3Var = new t3(this, 0);
        this.M0 = t3Var;
        return t3Var;
    }

    public final void v1(final long j10, final Utilities.Callback callback) {
        TLRPC.Message message;
        long peerDialogId;
        long j11;
        TL_stars.InputSavedStarGift E1 = E1();
        if (E1 != null) {
            TL_stars.SavedStarGift savedStarGift = this.f8431y0;
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
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(transferstargift, new d2(this, callback, j10, peerDialogId, 0));
                return;
            }
            final long j12 = peerDialogId;
            v7 y10 = v7.y(this.currentAccount, false);
            if (!y10.f9048e) {
                y10.r(new e2(this, y10, j10, callback, 0));
                return;
            }
            final TLRPC.TL_inputInvoiceStarGiftTransfer tL_inputInvoiceStarGiftTransfer = new TLRPC.TL_inputInvoiceStarGiftTransfer();
            tL_inputInvoiceStarGiftTransfer.stargift = E1;
            tL_inputInvoiceStarGiftTransfer.to_id = MessagesController.getInstance(this.currentAccount).getInputPeer(j10);
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceStarGiftTransfer;
            JSONObject p6 = mh.c3.p(this.resourcesProvider, false);
            if (p6 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = p6.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_getPaymentForm, new RequestDelegate() {
                @Override
                public final void run(final TLObject tLObject, final TLRPC.TL_error tL_error) {
                    final k5 k5Var = k5.this;
                    final TLRPC.TL_inputInvoiceStarGiftTransfer tL_inputInvoiceStarGiftTransfer2 = tL_inputInvoiceStarGiftTransfer;
                    final long j13 = j10;
                    final long j14 = j12;
                    final Utilities.Callback callback2 = callback;
                    AndroidUtilities.runOnUIThread(new Runnable() {
                        @Override
                        public final void run() {
                            k5.F0(k5.this, tLObject, tL_inputInvoiceStarGiftTransfer2, j13, j14, callback2, tL_error);
                        }
                    });
                }
            });
        }
    }

    public final void w1() {
        TL_stars.InputSavedStarGift E1;
        long j10;
        kh.d dVar = this.f8407f0;
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
                TL_stars.SavedStarGift savedStarGift = this.f8431y0;
                if (savedStarGift != null) {
                    j10 = savedStarGift.upgrade_stars;
                    if (j10 <= 0) {
                        str = savedStarGift.prepaid_upgrade_hash;
                    }
                } else {
                    return;
                }
            }
            int i9 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
            if (i9 > 0 || this.f8412h1 != null) {
                dVar.setLoading(true);
                dp dpVar = this.f8424r0;
                if (i9 > 0) {
                    TL_stars.upgradeStarGift upgradestargift = new TL_stars.upgradeStarGift();
                    upgradestargift.keep_original_details = dpVar.f27781a.f26313q;
                    upgradestargift.stargift = E1;
                    ConnectionsManager.getInstance(this.currentAccount).sendRequest(upgradestargift, new bg.j0(6, this, E1));
                    return;
                }
                int i10 = 0;
                v7 y10 = v7.y(this.currentAccount, false);
                if (!y10.f9048e) {
                    y10.r(new e5.u(12, this, y10));
                    return;
                }
                TL_stars.TL_payments_sendStarsForm tL_payments_sendStarsForm = new TL_stars.TL_payments_sendStarsForm();
                tL_payments_sendStarsForm.form_id = this.f8412h1.form_id;
                if (!TextUtils.isEmpty(str)) {
                    TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade tL_inputInvoiceStarGiftPrepaidUpgrade = new TLRPC.TL_inputInvoiceStarGiftPrepaidUpgrade();
                    tL_inputInvoiceStarGiftPrepaidUpgrade.hash = str;
                    tL_inputInvoiceStarGiftPrepaidUpgrade.peer = MessagesController.getInstance(this.currentAccount).getInputPeer(this.T);
                    tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftPrepaidUpgrade;
                } else {
                    TLRPC.TL_inputInvoiceStarGiftUpgrade tL_inputInvoiceStarGiftUpgrade = new TLRPC.TL_inputInvoiceStarGiftUpgrade();
                    tL_inputInvoiceStarGiftUpgrade.keep_original_details = dpVar.f27781a.f26313q;
                    tL_inputInvoiceStarGiftUpgrade.stargift = E1;
                    tL_payments_sendStarsForm.invoice = tL_inputInvoiceStarGiftUpgrade;
                }
                ArrayList<TLRPC.TL_labeledPrice> arrayList = this.f8412h1.invoice.prices;
                int size = arrayList.size();
                while (i10 < size) {
                    TLRPC.TL_labeledPrice tL_labeledPrice = arrayList.get(i10);
                    i10++;
                    j11 += tL_labeledPrice.amount;
                }
                ConnectionsManager.getInstance(this.currentAccount).sendRequest(tL_payments_sendStarsForm, new w(this, str, E1, j11, 1));
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
            return this.f8420n0.getMeasuredHeight();
        }
        if (this.U0.d(2)) {
            return this.f8427u0.getMeasuredHeight();
        }
        if (this.U0.d(3)) {
            return this.f8429w0.getMeasuredHeight();
        }
        if (this.U0.d(4)) {
            return 0;
        }
        return this.f8399b0.getMeasuredHeight();
    }
}
