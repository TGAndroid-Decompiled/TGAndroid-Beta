package ih;

import android.content.Context;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import i7.h6;
import j$.util.Collection;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import jh.b8;
import jh.i9;
import jh.ia;
import jh.k7;
import jh.s7;
import jh.x9;
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
import org.telegram.ui.Components.bu;
import org.telegram.ui.Components.e9;
import org.telegram.ui.Components.hz0;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.iz;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.k51;
import org.telegram.ui.Components.t9;
import org.telegram.ui.Components.tc;
import org.telegram.ui.Components.w41;
import org.telegram.ui.Components.x80;
import org.telegram.ui.Components.xa;
import org.telegram.ui.Components.y80;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.th;
public final class h2 extends xa implements NotificationCenter.NotificationCenterDelegate {
    public static final int f9203r0 = 0;
    public final int T;
    public k51 U;
    public List V;
    public final Utilities.Callback W;
    public TLRPC.DisallowedGiftsSettings X;
    public final long Y;
    public final boolean Z;
    public final String f9204a0;
    public final x9 f9205b0;
    public final l1 f9206c0;
    public final FrameLayout f9207d0;
    public final LinearLayout f9208e0;
    public final iz f9209f0;
    public final q1 f9210g0;
    public final m1 f9211h0;
    public final n1 f9212i0;
    public final ArrayList f9213j0;
    public final k7 f9214k0;
    public int f9215l0;
    public int m0;
    public int f9216n0;
    public int f9217o0;
    public boolean f9218p0;
    public boolean f9219q0;

    public h2(final Context context, final int i10, final long j10, List list, final Utilities.Callback callback) {
        super(context, null, false, false, false, 1, null);
        int i11;
        this.f9213j0 = new ArrayList();
        this.f9215l0 = -1;
        this.m0 = -1;
        this.f9216n0 = -1;
        new ArrayList();
        this.T = i10;
        this.Y = j10;
        boolean z10 = UserConfig.getInstance(i10).getClientUserId() == j10;
        this.Z = z10;
        this.V = list;
        this.W = callback;
        int i12 = g6.f23027b6;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = null;
        setBackgroundColor(g6.w0(null, i12, false));
        fixNavigationBar(g6.w0(null, i12, false));
        this.f9214k0 = s7.y(i10, false).G(UserConfig.getInstance(i10).getClientUserId(), true);
        s7.y(i10, false).V();
        t9 t9Var = new t9(context);
        t9Var.setImportantForAccessibility(2);
        e9 e9Var = new e9((org.telegram.ui.ActionBar.c6) null);
        int i13 = (j10 > 0L ? 1 : (j10 == 0L ? 0 : -1));
        if (i13 > 0) {
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
            this.f9204a0 = UserObject.getForcedFirstName(user);
            e9Var.r(user);
            t9Var.e(user, e9Var);
            TLRPC.UserFull userFull = MessagesController.getInstance(i10).getUserFull(j10);
            if (j10 != UserConfig.getInstance(i10).getClientUserId() && userFull != null) {
                disallowedGiftsSettings = userFull.disallowed_stargifts;
            }
            this.X = disallowedGiftsSettings;
            if (userFull == null) {
                MessagesController.getInstance(i10).loadFullUser(user, 0, true);
            }
        } else {
            TLRPC.Chat chat = MessagesController.getInstance(i10).getChat(Long.valueOf(-j10));
            this.f9204a0 = chat == null ? "" : chat.title;
            e9Var.q(chat);
            t9Var.e(chat, e9Var);
        }
        this.v = 0.1f;
        x9 x9Var = new x9(context, i10, this.resourcesProvider);
        this.f9205b0 = x9Var;
        h6.a(x9Var);
        x9Var.setOnClickListener(new ag.o(this, 13));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f9207d0 = frameLayout;
        ?? frameLayout2 = new FrameLayout(context);
        this.f9206c0 = frameLayout2;
        frameLayout2.setClipChildren(false);
        frameLayout2.setClipToPadding(false);
        frameLayout2.addView(new i9(context, 70, 0), i7.f6.c(-1.0f, -1));
        t9Var.setRoundRadius(AndroidUtilities.dp(42.0f));
        frameLayout2.addView(t9Var, i7.f6.d(84, 84.0f, 17, 0.0f, 15.0f, 0.0f, 17.0f));
        h6.a(t9Var);
        t9Var.setOnClickListener(new bh.s(this, j10, 2));
        frameLayout2.addView(x9Var, i7.f6.d(-2, -2.0f, 53, 0.0f, -3.0f, -10.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        frameLayout.addView(linearLayout, i7.f6.e(-1, -2, 55));
        TextView h = org.telegram.messenger.x3.h(context, 1, 20.0f);
        h.setTypeface(AndroidUtilities.bold());
        int i14 = g6.f23169j5;
        h.setTextColor(g6.v0(i14, this.resourcesProvider));
        h.setGravity(17);
        linearLayout.addView(h, i7.f6.t(-1, -2, 1, 4, 0, 4, 0));
        h.setMaxWidth(nh.t3.a(h.getText(), h.getPaint()));
        y80 y80Var = new y80(context, this.resourcesProvider);
        int i15 = g6.gc;
        y80Var.setLinkTextColor(g6.v0(i15, this.resourcesProvider));
        y80Var.setTextSize(1, 14.0f);
        y80Var.setTextColor(g6.v0(i14, this.resourcesProvider));
        y80Var.setGravity(17);
        y80Var.setLineSpacing(AndroidUtilities.dp(2.33f), 1.0f);
        linearLayout.addView(y80Var, i7.f6.t(-1, -2, 1, 4, 4, 4, 12));
        h.setText(LocaleController.getString(R.string.Gift2Premium));
        y80Var.setText(TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2PremiumInfo, this.f9204a0)), " ", AndroidUtilities.replaceArrows(AndroidUtilities.makeClickable(LocaleController.getString(R.string.Gift2PremiumInfoLink), new ag.o0(7)), true)));
        y80Var.setMaxWidth(nh.t3.a(y80Var.getText(), y80Var.getPaint()));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f9208e0 = linearLayout2;
        linearLayout2.setOrientation(1);
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextColor(g6.v0(i14, this.resourcesProvider));
        textView.setGravity(17);
        linearLayout2.addView(textView, i7.f6.t(-1, -2, 1, 4, 0, 4, 0));
        ?? y80Var2 = new y80(context, this.resourcesProvider);
        this.f9211h0 = y80Var2;
        y80Var2.setLinkTextColor(g6.v0(i15, this.resourcesProvider));
        y80Var2.setTextSize(1, 14.0f);
        y80Var2.setTextColor(g6.v0(i14, this.resourcesProvider));
        y80Var2.setGravity(17);
        ?? y80Var3 = new y80(context, this.resourcesProvider);
        this.f9212i0 = y80Var3;
        y80Var3.setLinkTextColor(g6.v0(i15, this.resourcesProvider));
        y80Var3.setTextSize(1, 14.0f);
        y80Var3.setTextColor(g6.v0(i14, this.resourcesProvider));
        y80Var3.setGravity(17);
        y80Var3.setAlpha(0.0f);
        y80Var3.setScaleX(0.85f);
        y80Var3.setScaleY(0.85f);
        FrameLayout frameLayout3 = new FrameLayout(context);
        frameLayout3.addView((View) y80Var2, i7.f6.d(-1, -2.0f, 49, 26.0f, 0.0f, 26.0f, 0.0f));
        frameLayout3.addView((View) y80Var3, i7.f6.d(-1, -2.0f, 49, 26.0f, 0.0f, 26.0f, 0.0f));
        if (i13 < 0) {
            i11 = R.string.Gift2StarsChannel;
        } else {
            i11 = z10 ? R.string.Gift2StarsSelf : R.string.Gift2Stars;
        }
        textView.setText(LocaleController.getString(i11));
        if (z10) {
            linearLayout2.addView(frameLayout3, i7.f6.t(-2, -2, 1, 0, 9, 0, 4));
            y80 y80Var4 = new y80(context, this.resourcesProvider);
            y80Var4.setLinkTextColor(g6.v0(i15, this.resourcesProvider));
            y80Var4.setTextSize(1, 14.0f);
            y80Var4.setTextColor(g6.v0(i14, this.resourcesProvider));
            y80Var4.setGravity(17);
            linearLayout2.addView(y80Var4, i7.f6.t(-2, -2, 1, 26, 4, 26, 6));
            y80Var2.setText(LocaleController.getString(R.string.Gift2StarsSelfInfo1));
            y80Var4.setText(LocaleController.getString(R.string.Gift2StarsSelfInfo2));
        } else if (i13 < 0) {
            linearLayout2.addView(frameLayout3, i7.f6.t(-2, -2, 1, 0, 9, 0, 4));
            NotificationCenter.listenEmojiLoading(y80Var2);
            y80Var2.setText(Emoji.replaceEmoji(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2StarsChannelInfo, this.f9204a0)), y80Var2.getPaint().getFontMetricsInt(), false));
        } else {
            linearLayout2.addView(frameLayout3, i7.f6.t(-1, -2, 1, 0, 9, 0, 6));
            k7 G = s7.y(i10, false).G(j10, true);
            h1 h1Var = new h1(this, G, j10, callback, context, 0);
            h1Var.run();
            y80Var2.addOnAttachStateChangeListener(new o1(h1Var));
            if (G.f12387l.size() < 3) {
                G.a();
            }
            NotificationCenter.getInstance(i10).listen(y80Var2, NotificationCenter.starUserGiftsLoaded, new b1(1, G, h1Var));
        }
        iz izVar = new iz(3, false);
        this.f9209f0 = izVar;
        izVar.O = new p1(this);
        this.d.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        this.d.setClipToPadding(false);
        this.d.setClipChildren(false);
        this.d.setLayoutManager(izVar);
        this.d.setSelectorType(9);
        this.d.setSelectorDrawableColor(0);
        ?? lVar = new f2.l();
        this.f9210g0 = lVar;
        lVar.C = false;
        lVar.f6463m = false;
        lVar.n(350L);
        lVar.o(jr.h);
        lVar.D = 40L;
        this.d.setItemAnimator(lVar);
        this.d.setOnItemClickListener(new zk0() {
            @Override
            public final void c(int i16, View view) {
                h2.Q(h2.this, context, i10, callback, j10, i16);
            }
        });
        W();
        this.U.N(false);
        M();
        if (BirthdayController.getInstance(i10).isToday(j10)) {
            V(true);
        }
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.billingProductDetailsUpdated);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starGiftsLoaded);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.userInfoDidLoad);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starGiftSoldOut);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        this.f34660e.setTitle(y());
        NotificationCenter.listenEmojiLoading(this.f34660e.getTitleTextView());
    }

    public static void P(final h2 h2Var, org.telegram.ui.ActionBar.c2 c2Var, TLObject tLObject, bg.j3 j3Var, final Utilities.Callback callback, TLRPC.TL_error tL_error) {
        c2Var.dismiss();
        if (tLObject instanceof TL_stars.checkCanSendGiftResultOk) {
            j3Var.run();
        } else if (tLObject instanceof TL_stars.checkCanSendGiftResultFail) {
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(h2Var.getContext(), 0, h2Var.resourcesProvider);
            alertDialog$Builder.f22714a.N = LocaleController.getString(R.string.GiftLocked);
            alertDialog$Builder.f22714a.P = MessageObject.formatTextWithEntities(((TL_stars.checkCanSendGiftResultFail) tLObject).reason, false);
            alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
            final org.telegram.ui.ActionBar.c2 o10 = alertDialog$Builder.o();
            final bu buVar = o10.f22795n;
            if (buVar != null) {
                buVar.setOnLinkPressListener(new x80() {
                    @Override
                    public final void a(ClickableSpan clickableSpan) {
                        h2 h2Var2 = h2.this;
                        h2Var2.getClass();
                        o10.dismiss();
                        Utilities.Callback callback2 = callback;
                        if (callback2 != null) {
                            callback2.run(Boolean.FALSE);
                        }
                        h2Var2.dismiss();
                        clickableSpan.onClick(buVar);
                    }
                });
            }
        } else if (tL_error != null) {
            new tc(h2Var.container, h2Var.resourcesProvider).d0(tL_error, false);
        }
    }

    public static void Q(h2 h2Var, Context context, int i10, Utilities.Callback callback, long j10, int i11) {
        TL_stars.SavedStarGift savedStarGift;
        w41 G = h2Var.U.G(i11 - 1);
        if (G != null && G.G(x1.class)) {
            Object obj = G.G;
            int i12 = 0;
            if (obj instanceof cg.n) {
                new r1(h2Var, context, i10, (cg.n) obj, h2Var.Y, new y0(h2Var, callback, 0)).show();
            } else if (obj instanceof TL_stars.StarGift) {
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                k7 k7Var = h2Var.f9214k0;
                if (k7Var != null && h2Var.f9217o0 == h2Var.m0) {
                    ArrayList arrayList = k7Var.f12387l;
                    int size = arrayList.size();
                    while (true) {
                        if (i12 < size) {
                            Object obj2 = arrayList.get(i12);
                            i12++;
                            TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj2;
                            if (savedStarGift2.gift.f22619id == starGift.f22619id) {
                                savedStarGift = savedStarGift2;
                                break;
                            }
                        } else {
                            savedStarGift = null;
                            break;
                        }
                    }
                    if (savedStarGift != null) {
                        s1 s1Var = new s1(h2Var, h2Var.getContext(), i10, UserConfig.getInstance(i10).getClientUserId(), h2Var.resourcesProvider);
                        s1Var.j2(savedStarGift, null);
                        s1Var.Z1(j10, new z0(h2Var, s1Var, j10, callback, 0));
                    }
                } else if (G.f34305q && starGift.availability_resale > 0) {
                    org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                    if (U != 0) {
                        ?? obj3 = new Object();
                        obj3.f23673a = true;
                        obj3.f23676e = true;
                        t1 t1Var = new t1(j10, starGift.title, starGift.f22619id, h2Var.resourcesProvider, h2Var.container.getViewTreeObserver(), new Object());
                        t1Var.f9357e = new b1(0, h2Var, callback);
                        U.showAsSheet(t1Var, obj3);
                    }
                } else if (starGift.auction) {
                    GiftAuctionController.getInstance(i10).getOrRequestAuction(starGift.f22619id, new u(context, h2Var.resourcesProvider, i10, j10, new y0(h2Var, callback, 1)));
                } else if (starGift.sold_out) {
                    org.telegram.ui.ActionBar.c6 c6Var = h2Var.resourcesProvider;
                    if (context != null) {
                        org.telegram.ui.ActionBar.f3 q6 = org.telegram.messenger.x3.q(context, c6Var, false, false);
                        LinearLayout g10 = org.telegram.messenger.x3.g(context, 1);
                        g10.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
                        g10.setClipChildren(false);
                        g10.setClipToPadding(false);
                        t9 t9Var = new t9(context);
                        ia.a1(t9Var.getImageReceiver(), starGift, 160);
                        g10.addView(t9Var, i7.f6.t(160, 160, 17, 0, -8, 0, 10));
                        TextView textView = new TextView(context);
                        org.telegram.ui.b.w(g6.f23169j5, c6Var, textView, 1, 20.0f);
                        textView.setGravity(17);
                        textView.setText(LocaleController.getString(R.string.Gift2SoldOutSheetTitle));
                        TextView i13 = th.i(g10, textView, i7.f6.t(-1, -2, 17, 20, 0, 20, 4), context);
                        i13.setTextSize(1, 14.0f);
                        i13.setTypeface(AndroidUtilities.bold());
                        i13.setGravity(17);
                        i13.setTextColor(g6.v0(g6.f23295q7, c6Var));
                        i13.setText(LocaleController.getString(R.string.Gift2SoldOutSheetSubtitle));
                        g10.addView(i13, i7.f6.t(-1, -2, 17, 20, 0, 20, 4));
                        hz0 hz0Var = new hz0(context, c6Var);
                        if (starGift.first_sale_date != 0) {
                            hz0Var.f(starGift.first_sale_date, LocaleController.getString(R.string.Gift2SoldOutSheetFirstSale));
                        }
                        if (starGift.last_sale_date != 0) {
                            hz0Var.f(starGift.last_sale_date, LocaleController.getString(R.string.Gift2SoldOutSheetLastSale));
                        }
                        hz0Var.c(LocaleController.getString(R.string.Gift2SoldOutSheetValue), ia.X0(false, j7.l1.m(starGift.stars, ',', new StringBuilder("⭐️ ")), 0.8f, null), null, null);
                        if (starGift.limited) {
                            ia.F0(hz0Var, i10, starGift, c6Var);
                        }
                        g10.addView(hz0Var, i7.f6.k(0.0f, 17.0f, 0.0f, 12.0f, -1, -2));
                        nh.d dVar = new nh.d(context, c6Var, true);
                        dVar.g(LocaleController.getString(R.string.OK), false, true);
                        g10.addView(dVar, i7.f6.n(-1, 48));
                        q6.customView = g10;
                        org.telegram.ui.ActionBar.f3[] f3VarArr = {q6};
                        f3VarArr[0].useBackgroundTopPadding = false;
                        dVar.setOnClickListener(new b8(f3VarArr, 2));
                        f3VarArr[0].fixNavigationBar();
                        org.telegram.ui.ActionBar.o2 U2 = LaunchActivity.U();
                        if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(U2)) {
                            f3VarArr[0].makeAttached(U2);
                        }
                        f3VarArr[0].show();
                    }
                } else if (starGift.limited_per_user && starGift.per_user_remains <= 0) {
                    new tc(h2Var.container, h2Var.resourcesProvider).R(starGift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2PerUserLimit", starGift.per_user_total))).j();
                } else {
                    bg.j3 j3Var = new bg.j3(h2Var, context, i10, starGift, callback, 1);
                    if (starGift.locked_until_date > ConnectionsManager.getInstance(i10).getCurrentTime()) {
                        org.telegram.ui.ActionBar.c2 c2Var = new org.telegram.ui.ActionBar.c2(h2Var.getContext(), 3, null);
                        c2Var.q(500L);
                        TL_stars.checkCanSendGift checkcansendgift = new TL_stars.checkCanSendGift();
                        checkcansendgift.gift_id = starGift.f22619id;
                        ConnectionsManager.getInstance(i10).sendRequest(checkcansendgift, new c1(h2Var, c2Var, j3Var, callback, 0));
                    } else if (starGift.require_premium && !UserConfig.getInstance(i10).isPremium()) {
                        org.telegram.ui.ActionBar.o2 U3 = LaunchActivity.U();
                        if (U3 != null) {
                            cg.f2 f2Var = new cg.f2(U3, i10, null, null, starGift, h2Var.resourcesProvider);
                            t9 t9Var2 = new t9(h2Var.getContext());
                            org.telegram.ui.Components.n5 n5Var = new org.telegram.ui.Components.n5(AndroidUtilities.dp(160.0f), 4, t9Var2, false);
                            t9Var2.setImageDrawable(n5Var);
                            t9Var2.addOnAttachStateChangeListener(new k1(n5Var));
                            n5Var.i(starGift.getDocument(), false);
                            f2Var.f3144x0 = t9Var2;
                            f2Var.show();
                            n5Var.f();
                        }
                    } else {
                        j3Var.run();
                    }
                }
            }
        }
    }

    public final void U(ArrayList arrayList, k51 k51Var) {
        long j10;
        boolean z10;
        ArrayList arrayList2;
        boolean z11;
        boolean z12;
        TL_stars.StarGift starGift;
        boolean z13;
        boolean z14;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        boolean z15;
        boolean z16;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2;
        float f9;
        float f10;
        float f11;
        float f12;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings3;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings4;
        l1 l1Var = this.f9206c0;
        long j11 = this.Y;
        long j12 = 0;
        boolean z17 = this.Z;
        if (z17 || j11 < 0 || ((disallowedGiftsSettings4 = this.X) != null && disallowedGiftsSettings4.disallow_premium_gifts)) {
            j10 = 0;
            z10 = false;
        } else {
            arrayList.add(w41.k(l1Var));
            arrayList.add(w41.k(this.f9207d0));
            ArrayList arrayList3 = this.f9213j0;
            if (arrayList3 != null && !arrayList3.isEmpty()) {
                int size = arrayList3.size();
                int i10 = 0;
                while (i10 < size) {
                    Object obj = arrayList3.get(i10);
                    i10++;
                    int i11 = x1.f9498a;
                    long j13 = j12;
                    w41 J = w41.J(x1.class);
                    J.f34309u = 1;
                    J.G = (cg.n) obj;
                    arrayList.add(J);
                    j12 = j13;
                }
                j10 = j12;
            } else {
                j10 = 0;
                w41 o10 = w41.o(1, 34);
                o10.f34309u = 1;
                arrayList.add(o10);
                w41 o11 = w41.o(2, 34);
                o11.f34309u = 1;
                arrayList.add(o11);
                w41 o12 = w41.o(3, 34);
                o12.f34309u = 1;
                arrayList.add(o12);
            }
            z10 = true;
        }
        int i12 = this.T;
        s7 y8 = s7.y(i12, false);
        if (this.f9218p0) {
            arrayList2 = y8.J;
        } else {
            arrayList2 = y8.I;
        }
        if (this.X != null) {
            arrayList2 = (ArrayList) Collection.EL.stream(arrayList2).filter(new ph.f1(this, 2)).collect(Collectors.toCollection(new Object()));
        }
        int i13 = (j11 > j10 ? 1 : (j11 == j10 ? 0 : -1));
        if (i13 < 0) {
            arrayList2 = (ArrayList) Collection.EL.stream(arrayList2).filter(new d1(0)).collect(Collectors.toCollection(new Object()));
        }
        long clientUserId = UserConfig.getInstance(i12).getClientUserId();
        k7 k7Var = this.f9214k0;
        if (j11 != clientUserId && k7Var != null) {
            ArrayList arrayList4 = k7Var.f12387l;
            int size2 = arrayList4.size();
            int i14 = 0;
            while (i14 < size2) {
                Object obj2 = arrayList4.get(i14);
                i14++;
                if (((TL_stars.SavedStarGift) obj2).gift instanceof TL_stars.TL_starGiftUnique) {
                    z11 = true;
                    break;
                }
            }
        }
        z11 = false;
        boolean z18 = MessagesController.getInstance(i12).stargiftsBlocked;
        float f13 = 300.0f;
        if (!z18 && (!arrayList2.isEmpty() || ((disallowedGiftsSettings3 = this.X) != null && !disallowedGiftsSettings3.disallow_unique_stargifts && k7Var != null && !k7Var.f12387l.isEmpty()))) {
            if (!z10) {
                arrayList.add(w41.k(l1Var));
            } else {
                arrayList.add(w41.C(AndroidUtilities.dp(16.0f)));
            }
            arrayList.add(w41.k(this.f9208e0));
            TreeSet treeSet = new TreeSet();
            TLRPC.DisallowedGiftsSettings disallowedGiftsSettings5 = this.X;
            if (disallowedGiftsSettings5 == null || !disallowedGiftsSettings5.disallow_unique_stargifts) {
                for (int i15 = 0; i15 < arrayList2.size(); i15++) {
                    treeSet.add(Long.valueOf(((TL_stars.StarGift) arrayList2.get(i15)).stars));
                }
            }
            ArrayList arrayList5 = new ArrayList();
            this.m0 = -1;
            this.f9215l0 = -1;
            if (!arrayList2.isEmpty()) {
                this.f9215l0 = arrayList5.size();
                arrayList5.add(LocaleController.getString(R.string.Gift2TabAll));
            }
            TLRPC.DisallowedGiftsSettings disallowedGiftsSettings6 = this.X;
            if ((disallowedGiftsSettings6 == null || !disallowedGiftsSettings6.disallow_unique_stargifts) && z11) {
                this.m0 = arrayList5.size();
                arrayList5.add(LocaleController.getString(R.string.Gift2TabMine));
            }
            this.f9216n0 = arrayList5.size();
            arrayList5.add(LocaleController.getString(R.string.Gift2TabCollectibles));
            int i16 = this.f9217o0;
            e1 e1Var = new e1(this, 0);
            int i17 = f2.f9153a;
            w41 J2 = w41.J(f2.class);
            J2.d = 1;
            J2.G = arrayList5;
            J2.f34313z = i16;
            J2.H = e1Var;
            arrayList.add(J2);
            if (this.f9217o0 == this.f9216n0 && !z17 && i13 >= 0) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (z12 != this.f9219q0) {
                this.f9219q0 = z12;
                ViewPropertyAnimator animate = this.f9211h0.animate();
                float f14 = 0.0f;
                float f15 = 1.0f;
                if (!z12) {
                    f9 = 1.0f;
                } else {
                    f9 = 0.0f;
                }
                ViewPropertyAnimator alpha = animate.alpha(f9);
                if (!z12) {
                    f10 = 1.0f;
                } else {
                    f10 = 0.85f;
                }
                ViewPropertyAnimator scaleX = alpha.scaleX(f10);
                if (!z12) {
                    f11 = 1.0f;
                } else {
                    f11 = 0.85f;
                }
                ViewPropertyAnimator duration = scaleX.scaleY(f11).setDuration(380L);
                jr jrVar = jr.h;
                duration.setInterpolator(jrVar).start();
                ViewPropertyAnimator animate2 = this.f9212i0.animate();
                if (z12) {
                    f14 = 1.0f;
                }
                ViewPropertyAnimator alpha2 = animate2.alpha(f14);
                if (z12) {
                    f12 = 1.0f;
                } else {
                    f12 = 0.85f;
                }
                ViewPropertyAnimator scaleX2 = alpha2.scaleX(f12);
                if (!z12) {
                    f15 = 0.85f;
                }
                scaleX2.scaleY(f15).setDuration(380L).setInterpolator(jrVar).start();
            }
            if (k7Var != null && this.f9217o0 == this.m0) {
                arrayList2 = new ArrayList();
                ArrayList arrayList6 = k7Var.f12387l;
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
                int i21 = this.f9217o0;
                if (i21 == this.f9215l0 || i21 == this.m0 || (i21 == this.f9216n0 && (starGift3.availability_resale > j10 || starGift3.require_premium || starGift3.locked_until_date != 0))) {
                    if (!starGift3.sold_out && starGift3.availability_resale > j10 && i21 != this.f9216n0) {
                        if (i21 == this.m0) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        if (starGift3.limited && (disallowedGiftsSettings2 = this.X) != null && disallowedGiftsSettings2.disallow_limited_stargifts) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        w41 a2 = x1.a(i21, starGift3, z15, z16, false, false, false);
                        starGift = starGift3;
                        arrayList.add(a2);
                        i19++;
                    } else {
                        starGift = starGift3;
                    }
                    int i22 = this.f9217o0;
                    if (i22 == this.m0) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (starGift.limited && (disallowedGiftsSettings = this.X) != null && disallowedGiftsSettings.disallow_limited_stargifts) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    arrayList.add(x1.a(i22, starGift, z13, z14, true, false, false));
                    i19++;
                }
            }
            int i23 = this.f9217o0;
            int i24 = this.m0;
            if (i23 == i24 && k7Var != null && !k7Var.f12385j) {
                k7Var.a();
                w41 o13 = w41.o(4, 34);
                o13.f34309u = 1;
                arrayList.add(o13);
                w41 o14 = w41.o(5, 34);
                o14.f34309u = 1;
                arrayList.add(o14);
                w41 o15 = w41.o(6, 34);
                o15.f34309u = 1;
                arrayList.add(o15);
            } else if (i23 != i24 && y8.C) {
                w41 o16 = w41.o(4, 34);
                o16.f34309u = 1;
                arrayList.add(o16);
                w41 o17 = w41.o(5, 34);
                o17.f34309u = 1;
                arrayList.add(o17);
                w41 o18 = w41.o(6, 34);
                o18.f34309u = 1;
                arrayList.add(o18);
            }
            if (i19 >= 9) {
                f13 = 40.0f;
            }
            arrayList.add(w41.C(AndroidUtilities.dp(f13)));
            return;
        }
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings7 = this.X;
        if (disallowedGiftsSettings7 != null && !disallowedGiftsSettings7.disallow_unique_stargifts && arrayList2.isEmpty()) {
            arrayList.add(w41.C(AndroidUtilities.dp(300.0f)));
        }
    }

    public final void V(boolean z10) {
        this.f9218p0 = z10;
        this.U.N(false);
    }

    public final void W() {
        List list;
        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption;
        ArrayList arrayList = this.f9213j0;
        arrayList.clear();
        if (arrayList.isEmpty() && (list = this.V) != null && !list.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            long j10 = 0;
            for (int size = this.V.size() - 1; size >= 0; size--) {
                TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption2 = (TLRPC.TL_premiumGiftCodeOption) this.V.get(size);
                if (!"XTR".equalsIgnoreCase(tL_premiumGiftCodeOption2.currency)) {
                    Iterator it = this.V.iterator();
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
                    cg.n nVar = new cg.n(tL_premiumGiftCodeOption2, tL_premiumGiftCodeOption);
                    arrayList.add(nVar);
                    if (BuildVars.useInvoiceBilling()) {
                        if (nVar.f() > j10) {
                            j10 = nVar.f();
                        }
                    } else if (nVar.h() != null && BillingController.getInstance().isReady()) {
                        d9.c cVar = new d9.c();
                        cVar.f5537c = "inapp";
                        cVar.f5536b = nVar.h();
                        arrayList2.add(cVar.a());
                    }
                }
            }
            if (BuildVars.useInvoiceBilling()) {
                int size2 = arrayList.size();
                int i10 = 0;
                while (i10 < size2) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((cg.n) obj).f3223g = j10;
                }
            } else if (!arrayList2.isEmpty()) {
                System.currentTimeMillis();
                BillingController.getInstance().queryProductDetails(arrayList2, new eg.n(this, 9));
            }
        }
        if (arrayList.isEmpty()) {
            eg.q0.j(this.T, null, new e1(this, 1));
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        k51 k51Var;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        if (i10 == NotificationCenter.billingProductDetailsUpdated) {
            W();
        } else if (i10 == NotificationCenter.starGiftsLoaded) {
            k51 k51Var2 = this.U;
            if (k51Var2 != null) {
                k51Var2.N(true);
            }
        } else if (i10 == NotificationCenter.userInfoDidLoad) {
            if (isShown()) {
                long longValue = ((Long) objArr[0]).longValue();
                long j10 = this.Y;
                if (longValue == j10 && j10 > 0) {
                    int i12 = this.T;
                    TLRPC.UserFull userFull = MessagesController.getInstance(i12).getUserFull(j10);
                    if (j10 != UserConfig.getInstance(i12).getClientUserId() && userFull != null) {
                        disallowedGiftsSettings = userFull.disallowed_stargifts;
                    } else {
                        disallowedGiftsSettings = null;
                    }
                    this.X = disallowedGiftsSettings;
                    if (disallowedGiftsSettings != null && disallowedGiftsSettings.disallow_premium_gifts && disallowedGiftsSettings.disallow_unique_stargifts && disallowedGiftsSettings.disallow_limited_stargifts && disallowedGiftsSettings.disallow_unlimited_stargifts) {
                        dismiss();
                        org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
                        if (U != null) {
                            tc.a0(U).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(j10)))).j();
                            return;
                        }
                        return;
                    }
                    k51 k51Var3 = this.U;
                    if (k51Var3 != null) {
                        k51Var3.N(true);
                    }
                }
                ArrayList arrayList = this.f9213j0;
                if (arrayList == null || arrayList.isEmpty()) {
                    W();
                    k51 k51Var4 = this.U;
                    if (k51Var4 != null) {
                        k51Var4.N(true);
                    }
                }
            }
        } else if (i10 == NotificationCenter.starGiftSoldOut) {
            if (isShown()) {
                TL_stars.StarGift starGift = (TL_stars.StarGift) objArr[0];
                new tc(this.container, this.resourcesProvider).s(starGift.sticker, LocaleController.getString(R.string.Gift2SoldOutTitle), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2SoldOutCount", starGift.availability_total))).j();
                k51 k51Var5 = this.U;
                if (k51Var5 != null) {
                    k51Var5.N(true);
                }
            }
        } else if (i10 == NotificationCenter.starUserGiftsLoaded && objArr[1] == this.f9214k0 && (k51Var = this.U) != null) {
            k51Var.N(true);
        }
    }

    @Override
    public final void dismiss() {
        super.dismiss();
        int i10 = this.T;
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.billingProductDetailsUpdated);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starGiftsLoaded);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.userInfoDidLoad);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starGiftSoldOut);
        NotificationCenter.getInstance(i10).removeObserver(this, NotificationCenter.starUserGiftsLoaded);
    }

    @Override
    public final void show() {
        int i10 = this.T;
        if (MessagesController.getInstance(i10).isFrozen()) {
            org.telegram.ui.c.b(i10);
            return;
        }
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = this.X;
        if (disallowedGiftsSettings != null && disallowedGiftsSettings.disallow_premium_gifts && disallowedGiftsSettings.disallow_unique_stargifts && disallowedGiftsSettings.disallow_limited_stargifts && disallowedGiftsSettings.disallow_unlimited_stargifts) {
            org.telegram.ui.ActionBar.o2 U = LaunchActivity.U();
            if (U != null) {
                tc.a0(U).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(this.Y)))).j();
                return;
            }
            return;
        }
        super.show();
    }

    @Override
    public final il0 v(jl0 jl0Var) {
        k51 k51Var = new k51(this.d, getContext(), this.T, 0, true, new bg.t1(this, 9), this.resourcesProvider);
        this.U = k51Var;
        k51Var.f29939r = false;
        return k51Var;
    }

    @Override
    public final CharSequence y() {
        if (this.Z) {
            return LocaleController.getString(R.string.Gift2TitleSelf1);
        }
        return Emoji.replaceEmoji(LocaleController.formatString(R.string.Gift2User, this.f9204a0), null, false);
    }

    public h2(LaunchActivity launchActivity, int i10, long j10) {
        this(launchActivity, i10, j10, null, null);
    }
}
