package lh;

import android.content.Context;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import j$.util.Collection;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import mh.c8;
import mh.j9;
import mh.ja;
import mh.l7;
import mh.t7;
import mh.y9;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BirthdayController;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.Emoji;
import org.telegram.messenger.GiftAuctionController;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.UserObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.f90;
import org.telegram.ui.Components.g90;
import org.telegram.ui.Components.gu;
import org.telegram.ui.Components.h51;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.p9;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.pz;
import org.telegram.ui.Components.qc;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.sz0;
import org.telegram.ui.Components.w51;
import org.telegram.ui.Components.z8;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.yh;
public final class g2 extends sa implements NotificationCenter.NotificationCenterDelegate {
    public static final int f12760s0 = 0;
    public final int U;
    public w51 V;
    public List W;
    public final Utilities.Callback X;
    public TLRPC.DisallowedGiftsSettings Y;
    public final long Z;
    public final boolean f12761a0;
    public final String f12762b0;
    public final y9 f12763c0;
    public final k1 f12764d0;
    public final FrameLayout f12765e0;
    public final LinearLayout f12766f0;
    public final pz f12767g0;
    public final p1 f12768h0;
    public final l1 f12769i0;
    public final m1 f12770j0;
    public final ArrayList f12771k0;
    public final l7 f12772l0;
    public int m0;
    public int f12773n0;
    public int f12774o0;
    public int f12775p0;
    public boolean f12776q0;
    public boolean f12777r0;

    public g2(final Context context, final int i10, final long j10, List list, final Utilities.Callback callback) {
        super(context, null, false, false, false, 1, null);
        int i11;
        this.f12771k0 = new ArrayList();
        this.m0 = -1;
        this.f12773n0 = -1;
        this.f12774o0 = -1;
        new ArrayList();
        this.U = i10;
        this.Z = j10;
        boolean z4 = UserConfig.getInstance(i10).getClientUserId() == j10;
        this.f12761a0 = z4;
        this.W = list;
        this.X = callback;
        int i12 = k6.f21625b6;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = null;
        setBackgroundColor(k6.w0(null, i12, false));
        fixNavigationBar(k6.w0(null, i12, false));
        this.f12772l0 = t7.y(i10, false).G(UserConfig.getInstance(i10).getClientUserId(), true);
        t7.y(i10, false).V();
        p9 p9Var = new p9(context);
        p9Var.setImportantForAccessibility(2);
        z8 z8Var = new z8((g6) null);
        int i13 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i13 > 0) {
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
            this.f12762b0 = UserObject.getForcedFirstName(user);
            z8Var.r(user);
            p9Var.e(user, z8Var);
            TLRPC.UserFull userFull = MessagesController.getInstance(i10).getUserFull(j10);
            if (j10 != UserConfig.getInstance(i10).getClientUserId() && userFull != null) {
                disallowedGiftsSettings = userFull.disallowed_stargifts;
            }
            this.Y = disallowedGiftsSettings;
            if (userFull == null) {
                MessagesController.getInstance(i10).loadFullUser(user, 0, true);
            }
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
            this.f12762b0 = chat == null ? "" : chat.title;
            z8Var.q(chat);
            p9Var.e(chat, z8Var);
        }
        this.v = 0.1f;
        y9 y9Var = new y9(context, i10, this.resourcesProvider);
        this.f12763c0 = y9Var;
        k7.e6.a(y9Var);
        y9Var.setOnClickListener(new androidx.mediarouter.app.c(this, 13));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f12765e0 = frameLayout;
        ?? frameLayout2 = new FrameLayout(context);
        this.f12764d0 = frameLayout2;
        frameLayout2.setClipChildren(false);
        frameLayout2.setClipToPadding(false);
        frameLayout2.addView(new j9(context, 70, 0), k7.c6.c(-1.0f, -1));
        p9Var.setRoundRadius(AndroidUtilities.dp(42.0f));
        frameLayout2.addView(p9Var, k7.c6.d(84, 84.0f, 17, 0.0f, 15.0f, 0.0f, 17.0f));
        k7.e6.a(p9Var);
        p9Var.setOnClickListener(new eh.t(this, j10, 2));
        frameLayout2.addView(y9Var, k7.c6.d(-2, -2.0f, 53, 0.0f, -3.0f, -10.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        frameLayout.addView(linearLayout, k7.c6.e(-1, -2, 55));
        TextView g10 = org.telegram.messenger.y3.g(context, 1, 20.0f);
        g10.setTypeface(AndroidUtilities.bold());
        int i14 = k6.f21768j5;
        g10.setTextColor(k6.v0(i14, this.resourcesProvider));
        g10.setGravity(17);
        linearLayout.addView(g10, k7.c6.t(-1, -2, 1, 4, 0, 4, 0));
        g10.setMaxWidth(qh.e3.a(g10.getText(), g10.getPaint()));
        g90 g90Var = new g90(context, this.resourcesProvider);
        int i15 = k6.f21722gc;
        g90Var.setLinkTextColor(k6.v0(i15, this.resourcesProvider));
        g90Var.setTextSize(1, 14.0f);
        g90Var.setTextColor(k6.v0(i14, this.resourcesProvider));
        g90Var.setGravity(17);
        g90Var.setLineSpacing(AndroidUtilities.dp(2.33f), 1.0f);
        linearLayout.addView(g90Var, k7.c6.t(-1, -2, 1, 4, 4, 4, 12));
        g10.setText(LocaleController.getString(R.string.Gift2Premium));
        g90Var.setText(TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2PremiumInfo, this.f12762b0)), " ", AndroidUtilities.replaceArrows(AndroidUtilities.makeClickable(LocaleController.getString(R.string.Gift2PremiumInfoLink), new ag.f(10)), true)));
        g90Var.setMaxWidth(qh.e3.a(g90Var.getText(), g90Var.getPaint()));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f12766f0 = linearLayout2;
        linearLayout2.setOrientation(1);
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextColor(k6.v0(i14, this.resourcesProvider));
        textView.setGravity(17);
        linearLayout2.addView(textView, k7.c6.t(-1, -2, 1, 4, 0, 4, 0));
        ?? g90Var2 = new g90(context, this.resourcesProvider);
        this.f12769i0 = g90Var2;
        g90Var2.setLinkTextColor(k6.v0(i15, this.resourcesProvider));
        g90Var2.setTextSize(1, 14.0f);
        g90Var2.setTextColor(k6.v0(i14, this.resourcesProvider));
        g90Var2.setGravity(17);
        ?? g90Var3 = new g90(context, this.resourcesProvider);
        this.f12770j0 = g90Var3;
        g90Var3.setLinkTextColor(k6.v0(i15, this.resourcesProvider));
        g90Var3.setTextSize(1, 14.0f);
        g90Var3.setTextColor(k6.v0(i14, this.resourcesProvider));
        g90Var3.setGravity(17);
        g90Var3.setAlpha(0.0f);
        g90Var3.setScaleX(0.85f);
        g90Var3.setScaleY(0.85f);
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout3.addView((View) g90Var2, k7.c6.d(-1, -2.0f, 49, 26.0f, 0.0f, 26.0f, 0.0f));
        frameLayout3.addView((View) g90Var3, k7.c6.d(-1, -2.0f, 49, 26.0f, 0.0f, 26.0f, 0.0f));
        if (i13 < 0) {
            i11 = R.string.Gift2StarsChannel;
        } else {
            i11 = z4 ? R.string.Gift2StarsSelf : R.string.Gift2Stars;
        }
        textView.setText(LocaleController.getString(i11));
        if (z4) {
            linearLayout2.addView(frameLayout3, k7.c6.t(-2, -2, 1, 0, 9, 0, 4));
            g90 g90Var4 = new g90(context, this.resourcesProvider);
            g90Var4.setLinkTextColor(k6.v0(i15, this.resourcesProvider));
            g90Var4.setTextSize(1, 14.0f);
            g90Var4.setTextColor(k6.v0(i14, this.resourcesProvider));
            g90Var4.setGravity(17);
            linearLayout2.addView(g90Var4, k7.c6.t(-2, -2, 1, 26, 4, 26, 6));
            g90Var2.setText(LocaleController.getString(R.string.Gift2StarsSelfInfo1));
            g90Var4.setText(LocaleController.getString(R.string.Gift2StarsSelfInfo2));
        } else if (i13 < 0) {
            linearLayout2.addView(frameLayout3, k7.c6.t(-2, -2, 1, 0, 9, 0, 4));
            NotificationCenter.listenEmojiLoading(g90Var2);
            g90Var2.setText(Emoji.replaceEmoji(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2StarsChannelInfo, this.f12762b0)), g90Var2.getPaint().getFontMetricsInt(), false));
        } else {
            linearLayout2.addView(frameLayout3, k7.c6.t(-1, -2, 1, 0, 9, 0, 6));
            l7 G = t7.y(i10, false).G(j10, true);
            g1 g1Var = new g1(this, G, j10, callback, context, 0);
            g1Var.run();
            g90Var2.addOnAttachStateChangeListener(new n1(g1Var));
            if (G.f14407l.size() < 3) {
                G.a();
            }
            NotificationCenter.getInstance(i10).listen(g90Var2, NotificationCenter.starUserGiftsLoaded, new a1(1, G, g1Var));
        }
        pz pzVar = new pz(3, false);
        this.f12767g0 = pzVar;
        pzVar.O = new o1(this);
        this.d.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        this.d.setClipToPadding(false);
        this.d.setClipChildren(false);
        this.d.setLayoutManager(pzVar);
        this.d.setSelectorType(9);
        this.d.setSelectorDrawableColor(0);
        ?? lVar = new f2.l();
        this.f12768h0 = lVar;
        lVar.C = false;
        lVar.f5910m = false;
        lVar.n(350L);
        lVar.o(pr.h);
        lVar.D = 40L;
        this.d.setItemAnimator(lVar);
        this.d.setOnItemClickListener(new il0() {
            @Override
            public final void f(int i16, View view) {
                g2.Q(g2.this, context, i10, callback, j10, i16);
            }
        });
        W();
        this.V.N(false);
        N();
        if (BirthdayController.getInstance(i10).isToday(j10)) {
            V(true);
        }
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.billingProductDetailsUpdated);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starGiftsLoaded);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.userInfoDidLoad);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starGiftSoldOut);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        this.f31015e.setTitle(y());
        NotificationCenter.listenEmojiLoading(this.f31015e.getTitleTextView());
    }

    public static void P(final g2 g2Var, org.telegram.ui.ActionBar.d2 d2Var, TLObject tLObject, eg.d3 d3Var, final Utilities.Callback callback, TLRPC.TL_error tL_error) {
        d2Var.dismiss();
        if (tLObject instanceof TL_stars.checkCanSendGiftResultOk) {
            d3Var.run();
        } else if (tLObject instanceof TL_stars.checkCanSendGiftResultFail) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(g2Var.getContext(), 0, g2Var.resourcesProvider);
            alertDialog$Builder.f21168a.O = LocaleController.getString(R.string.GiftLocked);
            alertDialog$Builder.f21168a.Q = MessageObject.formatTextWithEntities(((TL_stars.checkCanSendGiftResultFail) tLObject).reason, false);
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            final org.telegram.ui.ActionBar.d2 o10 = alertDialog$Builder.o();
            final gu guVar = o10.f21254n;
            if (guVar != null) {
                guVar.setOnLinkPressListener(new f90() {
                    @Override
                    public final void a(ClickableSpan clickableSpan) {
                        g2 g2Var2 = g2.this;
                        g2Var2.getClass();
                        o10.dismiss();
                        Utilities.Callback callback2 = callback;
                        if (callback2 != null) {
                            callback2.run(Boolean.FALSE);
                        }
                        g2Var2.dismiss();
                        clickableSpan.onClick(guVar);
                    }
                });
            }
        } else if (tL_error != null) {
            new qc(g2Var.container, g2Var.resourcesProvider).d0(tL_error, false);
        }
    }

    public static void Q(g2 g2Var, Context context, int i10, Utilities.Callback callback, long j10, int i11) {
        TL_stars.SavedStarGift savedStarGift;
        h51 G = g2Var.V.G(i11 - 1);
        if (G != null && G.G(w1.class)) {
            Object obj = G.G;
            int i12 = 0;
            if (obj instanceof fg.n) {
                new q1(g2Var, context, i10, (fg.n) obj, g2Var.Z, new x0(g2Var, callback, 0)).show();
            } else if (obj instanceof TL_stars.StarGift) {
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                l7 l7Var = g2Var.f12772l0;
                if (l7Var != null && g2Var.f12775p0 == g2Var.f12773n0) {
                    ArrayList arrayList = l7Var.f14407l;
                    int size = arrayList.size();
                    while (true) {
                        if (i12 < size) {
                            Object obj2 = arrayList.get(i12);
                            i12++;
                            TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj2;
                            if (savedStarGift2.gift.f21072id == starGift.f21072id) {
                                savedStarGift = savedStarGift2;
                                break;
                            }
                        } else {
                            savedStarGift = null;
                            break;
                        }
                    }
                    if (savedStarGift != null) {
                        r1 r1Var = new r1(g2Var, g2Var.getContext(), i10, UserConfig.getInstance(i10).getClientUserId(), g2Var.resourcesProvider);
                        r1Var.j2(savedStarGift, null);
                        r1Var.Z1(j10, new y0(g2Var, r1Var, j10, callback, 0));
                    }
                } else if (G.f27380q && starGift.availability_resale > 0) {
                    org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                    if (U != 0) {
                        ?? obj3 = new Object();
                        obj3.f22158a = true;
                        obj3.f22161e = true;
                        s1 s1Var = new s1(j10, starGift.title, starGift.f21072id, g2Var.resourcesProvider, g2Var.container.getViewTreeObserver(), new Object());
                        s1Var.f12930e = new a1(0, g2Var, callback);
                        U.showAsSheet(s1Var, obj3);
                    }
                } else if (starGift.auction) {
                    GiftAuctionController.getInstance(i10).getOrRequestAuction(starGift.f21072id, new t(context, g2Var.resourcesProvider, i10, j10, new x0(g2Var, callback, 1)));
                } else if (starGift.sold_out) {
                    g6 g6Var = g2Var.resourcesProvider;
                    if (context != null) {
                        org.telegram.ui.ActionBar.h3 o10 = org.telegram.messenger.y3.o(context, g6Var, false, false);
                        LinearLayout f10 = org.telegram.messenger.y3.f(context, 1);
                        f10.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
                        f10.setClipChildren(false);
                        f10.setClipToPadding(false);
                        p9 p9Var = new p9(context);
                        ja.a1(p9Var.getImageReceiver(), starGift, 160);
                        f10.addView(p9Var, k7.c6.t(160, 160, 17, 0, -8, 0, 10));
                        TextView textView = new TextView(context);
                        org.telegram.ui.b.w(k6.f21768j5, g6Var, textView, 1, 20.0f);
                        textView.setGravity(17);
                        textView.setText(LocaleController.getString(R.string.Gift2SoldOutSheetTitle));
                        TextView i13 = yh.i(f10, textView, k7.c6.t(-1, -2, 17, 20, 0, 20, 4), context);
                        i13.setTextSize(1, 14.0f);
                        i13.setTypeface(AndroidUtilities.bold());
                        i13.setGravity(17);
                        i13.setTextColor(k6.v0(k6.f21897q7, g6Var));
                        i13.setText(LocaleController.getString(R.string.Gift2SoldOutSheetSubtitle));
                        f10.addView(i13, k7.c6.t(-1, -2, 17, 20, 0, 20, 4));
                        sz0 sz0Var = new sz0(context, g6Var);
                        if (starGift.first_sale_date != 0) {
                            sz0Var.f(starGift.first_sale_date, LocaleController.getString(R.string.Gift2SoldOutSheetFirstSale));
                        }
                        if (starGift.last_sale_date != 0) {
                            sz0Var.f(starGift.last_sale_date, LocaleController.getString(R.string.Gift2SoldOutSheetLastSale));
                        }
                        sz0Var.c(LocaleController.getString(R.string.Gift2SoldOutSheetValue), ja.X0(false, l.d.l(starGift.stars, ',', new StringBuilder("⭐️ ")), 0.8f, null), null, null);
                        if (starGift.limited) {
                            ja.F0(sz0Var, i10, starGift, g6Var);
                        }
                        f10.addView(sz0Var, k7.c6.k(0.0f, 17.0f, 0.0f, 12.0f, -1, -2));
                        qh.d dVar = new qh.d(context, g6Var, true);
                        dVar.g(LocaleController.getString(R.string.OK), false, true);
                        f10.addView(dVar, k7.c6.n(-1, 48));
                        o10.customView = f10;
                        org.telegram.ui.ActionBar.h3[] h3VarArr = {o10};
                        h3VarArr[0].useBackgroundTopPadding = false;
                        dVar.setOnClickListener(new c8(h3VarArr, 2));
                        h3VarArr[0].fixNavigationBar();
                        org.telegram.ui.ActionBar.p2 U2 = LaunchActivity.U();
                        if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(U2)) {
                            h3VarArr[0].makeAttached(U2);
                        }
                        h3VarArr[0].show();
                    }
                } else if (starGift.limited_per_user && starGift.per_user_remains <= 0) {
                    new qc(g2Var.container, g2Var.resourcesProvider).R(starGift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2PerUserLimit", starGift.per_user_total))).j();
                } else {
                    eg.d3 d3Var = new eg.d3(g2Var, context, i10, starGift, callback, 1);
                    if (starGift.locked_until_date > ConnectionsManager.getInstance(i10).getCurrentTime()) {
                        org.telegram.ui.ActionBar.d2 d2Var = new org.telegram.ui.ActionBar.d2(g2Var.getContext(), 3, null);
                        d2Var.q(500L);
                        TL_stars.checkCanSendGift checkcansendgift = new TL_stars.checkCanSendGift();
                        checkcansendgift.gift_id = starGift.f21072id;
                        ConnectionsManager.getInstance(i10).sendRequest(checkcansendgift, new b1(g2Var, d2Var, d3Var, callback, 0));
                    } else if (starGift.require_premium && !UserConfig.getInstance(i10).isPremium()) {
                        org.telegram.ui.ActionBar.p2 U3 = LaunchActivity.U();
                        if (U3 != null) {
                            fg.d2 d2Var2 = new fg.d2(U3, i10, null, null, starGift, g2Var.resourcesProvider);
                            p9 p9Var2 = new p9(g2Var.getContext());
                            org.telegram.ui.Components.j5 j5Var = new org.telegram.ui.Components.j5(AndroidUtilities.dp(160.0f), 4, p9Var2, false);
                            p9Var2.setImageDrawable(j5Var);
                            p9Var2.addOnAttachStateChangeListener(new j1(j5Var));
                            j5Var.i(starGift.getDocument(), false);
                            d2Var2.f6297y0 = p9Var2;
                            d2Var2.show();
                            j5Var.f();
                        }
                    } else {
                        d3Var.run();
                    }
                }
            }
        }
    }

    public final void U(ArrayList arrayList, w51 w51Var) {
        long j10;
        boolean z4;
        ArrayList arrayList2;
        boolean z10;
        boolean z11;
        TL_stars.StarGift starGift;
        boolean z12;
        boolean z13;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        boolean z14;
        boolean z15;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2;
        float f10;
        float f11;
        float f12;
        float f13;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings3;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings4;
        k1 k1Var = this.f12764d0;
        long j11 = this.Z;
        long j12 = 0;
        boolean z16 = this.f12761a0;
        if (z16 || j11 < 0 || ((disallowedGiftsSettings4 = this.Y) != null && disallowedGiftsSettings4.disallow_premium_gifts)) {
            j10 = 0;
            z4 = false;
        } else {
            arrayList.add(h51.k(k1Var));
            arrayList.add(h51.k(this.f12765e0));
            ArrayList arrayList3 = this.f12771k0;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int size = arrayList3.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList3.get(i10);
                    i10++;
                    int i11 = w1.f13059a;
                    long j13 = j12;
                    h51 J = h51.J(w1.class);
                    J.f27384u = 1;
                    J.G = (fg.n) obj;
                    arrayList.add(J);
                    j12 = j13;
                }
                j10 = j12;
            } else {
                j10 = 0;
                h51 o10 = h51.o(1, 34);
                o10.f27384u = 1;
                arrayList.add(o10);
                h51 o11 = h51.o(2, 34);
                o11.f27384u = 1;
                arrayList.add(o11);
                h51 o12 = h51.o(3, 34);
                o12.f27384u = 1;
                arrayList.add(o12);
            }
            z4 = true;
        }
        int i12 = this.U;
        t7 y10 = t7.y(i12, false);
        if (this.f12776q0) {
            arrayList2 = y10.J;
        } else {
            arrayList2 = y10.I;
        }
        if (this.Y != null) {
            arrayList2 = (ArrayList) Collection.EL.stream(arrayList2).filter(new sh.f1(this, 2)).collect(Collectors.toCollection(new Object()));
        }
        int i13 = (j11 > j10 ? 1 : (j11 == j10 ? 0 : -1));
        if (i13 < 0) {
            arrayList2 = (ArrayList) Collection.EL.stream(arrayList2).filter(new c1(0)).collect(Collectors.toCollection(new Object()));
        }
        long clientUserId = UserConfig.getInstance(i12).getClientUserId();
        l7 l7Var = this.f12772l0;
        if (j11 != clientUserId && l7Var != null) {
            ArrayList arrayList4 = l7Var.f14407l;
            int size2 = arrayList4.size();
            int i14 = 0;
            while (i14 < size2) {
                Object obj2 = arrayList4.get(i14);
                i14++;
                if (((TL_stars.SavedStarGift) obj2).gift instanceof TL_stars.TL_starGiftUnique) {
                    z10 = true;
                    break;
                }
            }
        }
        z10 = false;
        boolean z17 = MessagesController.getInstance(i12).stargiftsBlocked;
        float f14 = 300.0f;
        if (!z17 && (!arrayList2.isEmpty() || ((disallowedGiftsSettings3 = this.Y) != null && !disallowedGiftsSettings3.disallow_unique_stargifts && l7Var != null && !l7Var.f14407l.isEmpty()))) {
            if (!z4) {
                arrayList.add(h51.k(k1Var));
            } else {
                arrayList.add(h51.C(AndroidUtilities.dp(16.0f)));
            }
            arrayList.add(h51.k(this.f12766f0));
            TreeSet treeSet = new TreeSet();
            TLRPC.DisallowedGiftsSettings disallowedGiftsSettings5 = this.Y;
            if (disallowedGiftsSettings5 == null || !disallowedGiftsSettings5.disallow_unique_stargifts) {
                for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                    treeSet.add(Long.valueOf(((TL_stars.StarGift) arrayList2.get(i15)).stars));
                }
            }
            ArrayList arrayList5 = new ArrayList();
            this.f12773n0 = -1;
            this.m0 = -1;
            if (!arrayList2.isEmpty()) {
                this.m0 = arrayList5.size();
                arrayList5.add(LocaleController.getString(R.string.Gift2TabAll));
            }
            TLRPC.DisallowedGiftsSettings disallowedGiftsSettings6 = this.Y;
            if ((disallowedGiftsSettings6 == null || !disallowedGiftsSettings6.disallow_unique_stargifts) && z10) {
                this.f12773n0 = arrayList5.size();
                arrayList5.add(LocaleController.getString(R.string.Gift2TabMine));
            }
            this.f12774o0 = arrayList5.size();
            arrayList5.add(LocaleController.getString(R.string.Gift2TabCollectibles));
            int i16 = this.f12775p0;
            d1 d1Var = new d1(this, 0);
            int i17 = e2.f12693a;
            h51 J2 = h51.J(e2.class);
            J2.d = 1;
            J2.G = arrayList5;
            J2.f27388z = i16;
            J2.H = d1Var;
            arrayList.add(J2);
            if (this.f12775p0 == this.f12774o0 && !z16 && i13 >= 0) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (z11 != this.f12777r0) {
                this.f12777r0 = z11;
                ViewPropertyAnimator animate = this.f12769i0.animate();
                float f15 = 0.0f;
                float f16 = 1.0f;
                if (!z11) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f10);
                if (!z11) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.85f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f11);
                if (!z11) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.85f;
                }
                ViewPropertyAnimator duration = scaleX.scaleY(f12).setDuration(380L);
                pr prVar = pr.h;
                duration.setInterpolator(prVar).start();
                ViewPropertyAnimator animate2 = this.f12770j0.animate();
                if (z11) {
                    f15 = 1.0f;
                }
                ViewPropertyAnimator alpha2 = animate2.alpha(f15);
                if (z11) {
                    f13 = 1.0f;
                } else {
                    f13 = 0.85f;
                }
                ViewPropertyAnimator scaleX2 = alpha2.scaleX(f13);
                if (!z11) {
                    f16 = 0.85f;
                }
                scaleX2.scaleY(f16).setDuration(380L).setInterpolator(prVar).start();
            }
            if (l7Var != null && this.f12775p0 == this.f12773n0) {
                arrayList2 = new ArrayList();
                ArrayList arrayList6 = l7Var.f14407l;
                int size3 = arrayList6.size();
                int i18 = 0;
                while (i18 < size3) {
                    Object obj3 = arrayList6.get(i18);
                    i18++;
                    TL_stars.StarGift starGift2 = ((TL_stars.SavedStarGift) obj3).gift;
                    if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                        arrayList2.add(starGift2);
                    }
                }
            }
            int i19 = 0;
            for (int i20 = 0; i20 < arrayList2.size(); i20++) {
                TL_stars.StarGift starGift3 = (TL_stars.StarGift) arrayList2.get(i20);
                int i21 = this.f12775p0;
                if (i21 == this.m0 || i21 == this.f12773n0 || (i21 == this.f12774o0 && (starGift3.availability_resale > j10 || starGift3.require_premium || starGift3.locked_until_date != 0))) {
                    if (!starGift3.sold_out && starGift3.availability_resale > j10 && i21 != this.f12774o0) {
                        if (i21 == this.f12773n0) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (starGift3.limited && (disallowedGiftsSettings2 = this.Y) != null && disallowedGiftsSettings2.disallow_limited_stargifts) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        h51 a2 = w1.a(i21, starGift3, z14, z15, false, false, false);
                        starGift = starGift3;
                        arrayList.add(a2);
                        i19++;
                    } else {
                        starGift = starGift3;
                    }
                    int i22 = this.f12775p0;
                    if (i22 == this.f12773n0) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (starGift.limited && (disallowedGiftsSettings = this.Y) != null && disallowedGiftsSettings.disallow_limited_stargifts) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    arrayList.add(w1.a(i22, starGift, z12, z13, true, false, false));
                    i19++;
                }
            }
            int i23 = this.f12775p0;
            int i24 = this.f12773n0;
            if (i23 == i24 && l7Var != null && !l7Var.f14405j) {
                l7Var.a();
                h51 o13 = h51.o(4, 34);
                o13.f27384u = 1;
                arrayList.add(o13);
                h51 o14 = h51.o(5, 34);
                o14.f27384u = 1;
                arrayList.add(o14);
                h51 o15 = h51.o(6, 34);
                o15.f27384u = 1;
                arrayList.add(o15);
            } else if (i23 != i24 && y10.C) {
                h51 o16 = h51.o(4, 34);
                o16.f27384u = 1;
                arrayList.add(o16);
                h51 o17 = h51.o(5, 34);
                o17.f27384u = 1;
                arrayList.add(o17);
                h51 o18 = h51.o(6, 34);
                o18.f27384u = 1;
                arrayList.add(o18);
            }
            if (i19 >= 9) {
                f14 = 40.0f;
            }
            arrayList.add(h51.C(AndroidUtilities.dp(f14)));
            return;
        }
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings7 = this.Y;
        if (disallowedGiftsSettings7 != null && !disallowedGiftsSettings7.disallow_unique_stargifts && arrayList2.isEmpty()) {
            arrayList.add(h51.C(AndroidUtilities.dp(300.0f)));
        }
    }

    public final void V(boolean z4) {
        this.f12776q0 = z4;
        this.V.N(false);
    }

    public final void W() {
        List list;
        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption;
        ArrayList arrayList = this.f12771k0;
        arrayList.clear();
        if (arrayList.isEmpty() && (list = this.W) != null && !list.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            long j10 = 0;
            for (int size = this.W.size() - 1; size >= 0; size--) {
                TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption2 = (TLRPC.TL_premiumGiftCodeOption) this.W.get(size);
                if (!"XTR".equalsIgnoreCase(tL_premiumGiftCodeOption2.currency)) {
                    Iterator it = this.W.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) it.next();
                            if (tL_premiumGiftCodeOption != tL_premiumGiftCodeOption2 && "XTR".equalsIgnoreCase(tL_premiumGiftCodeOption.currency) && tL_premiumGiftCodeOption.months == tL_premiumGiftCodeOption2.months) {
                                break;
                            }
                        } else {
                            tL_premiumGiftCodeOption = null;
                            break;
                        }
                    }
                    fg.n nVar = new fg.n(tL_premiumGiftCodeOption2, tL_premiumGiftCodeOption);
                    arrayList.add(nVar);
                    if (BuildVars.useInvoiceBilling()) {
                        if (nVar.f() > j10) {
                            j10 = nVar.f();
                        }
                    } else if (nVar.h() != null && BillingController.getInstance().isReady()) {
                        b6.h hVar = new b6.h();
                        hVar.f1729c = "inapp";
                        hVar.f1728b = nVar.h();
                        arrayList2.add(hVar.a());
                    }
                }
            }
            if (BuildVars.useInvoiceBilling()) {
                int size2 = arrayList.size();
                int i10 = 0;
                while (i10 < size2) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((fg.n) obj).f6409g = j10;
                }
            } else if (!arrayList2.isEmpty()) {
                System.currentTimeMillis();
                BillingController.getInstance().queryProductDetails(arrayList2, new hg.f(this, 25));
            }
        }
        if (arrayList.isEmpty()) {
            hg.p0.j(this.U, null, new d1(this, 1));
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        w51 w51Var;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        if (i10 == NotificationCenter.billingProductDetailsUpdated) {
            W();
        } else if (i10 == NotificationCenter.starGiftsLoaded) {
            w51 w51Var2 = this.V;
            if (w51Var2 != null) {
                w51Var2.N(true);
            }
        } else if (i10 == NotificationCenter.userInfoDidLoad) {
            if (isShown()) {
                long longValue = ((Long) objArr[0]).longValue();
                long j10 = this.Z;
                if (longValue == j10 && j10 > 0) {
                    int i12 = this.U;
                    TLRPC.UserFull userFull = MessagesController.getInstance(i12).getUserFull(j10);
                    if (j10 != UserConfig.getInstance(i12).getClientUserId() && userFull != null) {
                        disallowedGiftsSettings = userFull.disallowed_stargifts;
                    } else {
                        disallowedGiftsSettings = null;
                    }
                    this.Y = disallowedGiftsSettings;
                    if (disallowedGiftsSettings != null && disallowedGiftsSettings.disallow_premium_gifts && disallowedGiftsSettings.disallow_unique_stargifts && disallowedGiftsSettings.disallow_limited_stargifts && disallowedGiftsSettings.disallow_unlimited_stargifts) {
                        dismiss();
                        org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
                        if (U != null) {
                            qc.a0(U).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(j10)))).j();
                            return;
                        }
                        return;
                    }
                    w51 w51Var3 = this.V;
                    if (w51Var3 != null) {
                        w51Var3.N(true);
                    }
                }
                ArrayList arrayList = this.f12771k0;
                if (arrayList == null || arrayList.isEmpty()) {
                    W();
                    w51 w51Var4 = this.V;
                    if (w51Var4 != null) {
                        w51Var4.N(true);
                    }
                }
            }
        } else if (i10 == NotificationCenter.starGiftSoldOut) {
            if (isShown()) {
                TL_stars.StarGift starGift = (TL_stars.StarGift) objArr[0];
                new qc(this.container, this.resourcesProvider).s(starGift.sticker, LocaleController.getString(R.string.Gift2SoldOutTitle), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2SoldOutCount", starGift.availability_total))).j();
                w51 w51Var5 = this.V;
                if (w51Var5 != null) {
                    w51Var5.N(true);
                }
            }
        } else if (i10 == NotificationCenter.starUserGiftsLoaded && objArr[1] == this.f12772l0 && (w51Var = this.V) != null) {
            w51Var.N(true);
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        int i10 = this.U;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.billingProductDetailsUpdated);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starGiftsLoaded);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.userInfoDidLoad);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starGiftSoldOut);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
    }

    @Override
    public final void show() {
        int i10 = this.U;
        if (MessagesController.getInstance(i10).isFrozen()) {
            org.telegram.ui.c.b(i10);
            return;
        }
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = this.Y;
        if (disallowedGiftsSettings != null && disallowedGiftsSettings.disallow_premium_gifts && disallowedGiftsSettings.disallow_unique_stargifts && disallowedGiftsSettings.disallow_limited_stargifts && disallowedGiftsSettings.disallow_unlimited_stargifts) {
            org.telegram.ui.ActionBar.p2 U = LaunchActivity.U();
            if (U != null) {
                qc.a0(U).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(this.Z)))).j();
                return;
            }
            return;
        }
        super.show();
    }

    @Override
    public final rl0 v(sl0 sl0Var) {
        w51 w51Var = new w51(this.d, getContext(), this.U, 0, true, new eg.p1(this, 9), this.resourcesProvider);
        this.V = w51Var;
        w51Var.f32651r = false;
        return w51Var;
    }

    @Override
    public final CharSequence y() {
        if (this.f12761a0) {
            return LocaleController.getString(R.string.Gift2TitleSelf1);
        }
        return Emoji.replaceEmoji(LocaleController.formatString(R.string.Gift2User, this.f12762b0), null, false);
    }

    public g2(LaunchActivity launchActivity, int i10, long j10) {
        this(launchActivity, i10, j10, null, null);
    }
}
