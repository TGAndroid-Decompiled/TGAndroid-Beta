package gh;

import android.content.Context;
import android.text.TextUtils;
import android.text.style.ClickableSpan;
import android.view.View;
import android.view.ViewPropertyAnimator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import hh.d8;
import hh.da;
import hh.m7;
import hh.m9;
import hh.oa;
import hh.u7;
import j$.util.Collection;
import j$.util.stream.Collectors;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
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
import org.telegram.messenger.rl;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Components.b51;
import org.telegram.ui.Components.bz;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.mc;
import org.telegram.ui.Components.n41;
import org.telegram.ui.Components.n9;
import org.telegram.ui.Components.o80;
import org.telegram.ui.Components.p80;
import org.telegram.ui.Components.pk0;
import org.telegram.ui.Components.qa;
import org.telegram.ui.Components.ut;
import org.telegram.ui.Components.y8;
import org.telegram.ui.Components.yk0;
import org.telegram.ui.Components.yy0;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.tf;

public final class k2 extends qa implements NotificationCenter.NotificationCenterDelegate {

    public static final int f7380r0 = 0;
    public final int T;
    public b51 U;
    public List V;
    public final Utilities.Callback W;
    public TLRPC.DisallowedGiftsSettings X;
    public final long Y;
    public final boolean Z;

    public final String f7381a0;

    public final da f7382b0;

    public final o1 f7383c0;

    public final FrameLayout f7384d0;

    public final LinearLayout f7385e0;

    public final bz f7386f0;

    public final t1 f7387g0;

    public final p1 f7388h0;

    public final q1 f7389i0;

    public final ArrayList f7390j0;

    public final m7 f7391k0;

    public int f7392l0;
    public int m0;

    public int f7393n0;

    public int f7394o0;

    public boolean f7395p0;

    public boolean f7396q0;

    public k2(final Context context, final int i10, final long j10, List list, final Utilities.Callback callback) {
        int i11;
        super(context, null, false, false, false, 1, null);
        this.f7390j0 = new ArrayList();
        this.f7392l0 = -1;
        this.m0 = -1;
        this.f7393n0 = -1;
        new ArrayList();
        this.T = i10;
        this.Y = j10;
        int i12 = 1;
        boolean z10 = UserConfig.getInstance(i10).getClientUserId() == j10;
        this.Z = z10;
        this.V = list;
        this.W = callback;
        int i13 = org.telegram.ui.ActionBar.g6.f23017b6;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = null;
        setBackgroundColor(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
        fixNavigationBar(org.telegram.ui.ActionBar.g6.w0(null, i13, false));
        this.f7391k0 = u7.y(i10, false).G(UserConfig.getInstance(i10).getClientUserId(), true);
        u7.y(i10, false).V();
        n9 n9Var = new n9(context);
        n9Var.setImportantForAccessibility(2);
        y8 y8Var = new y8((org.telegram.ui.ActionBar.c6) null);
        if (j10 > 0) {
            TLRPC.User user = MessagesController.getInstance(i10).getUser(Long.valueOf(j10));
            this.f7381a0 = UserObject.getForcedFirstName(user);
            y8Var.r(user);
            n9Var.e(user, y8Var);
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
            this.f7381a0 = chat == null ? "" : chat.title;
            y8Var.q(chat);
            n9Var.e(chat, y8Var);
        }
        this.v = 0.1f;
        da daVar = new da(context, i10, this.resourcesProvider);
        this.f7382b0 = daVar;
        h7.b6.a(daVar);
        daVar.setOnClickListener(new ag.w0(this, 9));
        FrameLayout frameLayout = new FrameLayout(context);
        this.f7384d0 = frameLayout;
        o1 o1Var = new o1(context);
        this.f7383c0 = o1Var;
        o1Var.setClipChildren(false);
        o1Var.setClipToPadding(false);
        o1Var.addView(new m9(context, 70, 0), h7.z5.c(-1.0f, -1));
        n9Var.setRoundRadius(AndroidUtilities.dp(42.0f));
        o1Var.addView(n9Var, h7.z5.d(84, 84.0f, 17, 0.0f, 15.0f, 0.0f, 17.0f));
        h7.b6.a(n9Var);
        n9Var.setOnClickListener(new o(this, j10, i12));
        o1Var.addView(daVar, h7.z5.d(-2, -2.0f, 53, 0.0f, -3.0f, -10.0f, 0.0f));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(1);
        frameLayout.addView(linearLayout, h7.z5.e(-1, -2, 55));
        TextView textViewH = org.telegram.messenger.y1.h(context, 1, 20.0f);
        textViewH.setTypeface(AndroidUtilities.bold());
        int i14 = org.telegram.ui.ActionBar.g6.f23161j5;
        textViewH.setTextColor(org.telegram.ui.ActionBar.g6.v0(i14, this.resourcesProvider));
        textViewH.setGravity(17);
        linearLayout.addView(textViewH, h7.z5.t(-1, -2, 1, 4, 0, 4, 0));
        textViewH.setMaxWidth(lh.w3.a(textViewH.getText(), textViewH.getPaint()));
        p80 p80Var = new p80(context, this.resourcesProvider);
        int i15 = org.telegram.ui.ActionBar.g6.gc;
        p80Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(i15, this.resourcesProvider));
        p80Var.setTextSize(1, 14.0f);
        p80Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i14, this.resourcesProvider));
        p80Var.setGravity(17);
        p80Var.setLineSpacing(AndroidUtilities.dp(2.33f), 1.0f);
        linearLayout.addView(p80Var, h7.z5.t(-1, -2, 1, 4, 4, 4, 12));
        textViewH.setText(LocaleController.getString(R.string.Gift2Premium));
        p80Var.setText(TextUtils.concat(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2PremiumInfo, this.f7381a0)), " ", AndroidUtilities.replaceArrows(AndroidUtilities.makeClickable(LocaleController.getString(R.string.Gift2PremiumInfoLink), new ag.l3(4)), true)));
        p80Var.setMaxWidth(lh.w3.a(p80Var.getText(), p80Var.getPaint()));
        LinearLayout linearLayout2 = new LinearLayout(context);
        this.f7385e0 = linearLayout2;
        linearLayout2.setOrientation(1);
        TextView textView = new TextView(context);
        textView.setTextSize(1, 20.0f);
        textView.setTypeface(AndroidUtilities.bold());
        textView.setTextColor(org.telegram.ui.ActionBar.g6.v0(i14, this.resourcesProvider));
        textView.setGravity(17);
        linearLayout2.addView(textView, h7.z5.t(-1, -2, 1, 4, 0, 4, 0));
        p1 p1Var = new p1(context, this.resourcesProvider);
        this.f7388h0 = p1Var;
        p1Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(i15, this.resourcesProvider));
        p1Var.setTextSize(1, 14.0f);
        p1Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i14, this.resourcesProvider));
        p1Var.setGravity(17);
        q1 q1Var = new q1(context, this.resourcesProvider);
        this.f7389i0 = q1Var;
        q1Var.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(i15, this.resourcesProvider));
        q1Var.setTextSize(1, 14.0f);
        q1Var.setTextColor(org.telegram.ui.ActionBar.g6.v0(i14, this.resourcesProvider));
        q1Var.setGravity(17);
        q1Var.setAlpha(0.0f);
        q1Var.setScaleX(0.85f);
        q1Var.setScaleY(0.85f);
        FrameLayout frameLayout2 = new FrameLayout(context);
        frameLayout2.addView(p1Var, h7.z5.d(-1, -2.0f, 49, 26.0f, 0.0f, 26.0f, 0.0f));
        frameLayout2.addView(q1Var, h7.z5.d(-1, -2.0f, 49, 26.0f, 0.0f, 26.0f, 0.0f));
        textView.setText(LocaleController.getString(j10 < 0 ? R.string.Gift2StarsChannel : z10 ? R.string.Gift2StarsSelf : R.string.Gift2Stars));
        if (!z10) {
            if (j10 < 0) {
                linearLayout2.addView(frameLayout2, h7.z5.t(-2, -2, 1, 0, 9, 0, 4));
                NotificationCenter.listenEmojiLoading(p1Var);
                p1Var.setText(Emoji.replaceEmoji(AndroidUtilities.replaceTags(LocaleController.formatString(R.string.Gift2StarsChannelInfo, this.f7381a0)), p1Var.getPaint().getFontMetricsInt(), false));
            } else {
                linearLayout2.addView(frameLayout2, h7.z5.t(-1, -2, 1, 0, 9, 0, 6));
                m7 m7VarG = u7.y(i10, false).G(j10, true);
                k1 k1Var = new k1(this, m7VarG, j10, callback, context, 0);
                k1Var.run();
                p1Var.addOnAttachStateChangeListener(new r1(k1Var));
                i11 = 3;
                if (m7VarG.f9753l.size() < 3) {
                    m7VarG.a();
                }
                NotificationCenter.getInstance(i10).listen(p1Var, NotificationCenter.starUserGiftsLoaded, new d1(i12, m7VarG, k1Var));
            }
            bz bzVar = new bz(i11, false);
            this.f7386f0 = bzVar;
            bzVar.O = new s1(this);
            this.d.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
            this.d.setClipToPadding(false);
            this.d.setClipChildren(false);
            this.d.setLayoutManager(bzVar);
            this.d.setSelectorType(9);
            this.d.setSelectorDrawableColor(0);
            t1 t1Var = new t1();
            this.f7387g0 = t1Var;
            t1Var.C = false;
            t1Var.f5819m = false;
            t1Var.n(350L);
            t1Var.o(er.h);
            t1Var.D = 40L;
            this.d.setItemAnimator(t1Var);
            this.d.setOnItemClickListener(new pk0() {
                @Override
                public final void a(int i16, View view) {
                    k2.Q(this.f7407a, context, i10, callback, j10, i16);
                }
            });
            W();
            this.U.N(false);
            N();
            if (BirthdayController.getInstance(i10).isToday(j10)) {
                V(true);
            }
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.billingProductDetailsUpdated);
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starGiftsLoaded);
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.userInfoDidLoad);
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starGiftSoldOut);
            NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starUserGiftsLoaded);
            this.f31853e.setTitle(z());
            NotificationCenter.listenEmojiLoading(this.f31853e.getTitleTextView());
        }
        linearLayout2.addView(frameLayout2, h7.z5.t(-2, -2, 1, 0, 9, 0, 4));
        p80 p80Var2 = new p80(context, this.resourcesProvider);
        p80Var2.setLinkTextColor(org.telegram.ui.ActionBar.g6.v0(i15, this.resourcesProvider));
        p80Var2.setTextSize(1, 14.0f);
        p80Var2.setTextColor(org.telegram.ui.ActionBar.g6.v0(i14, this.resourcesProvider));
        p80Var2.setGravity(17);
        linearLayout2.addView(p80Var2, h7.z5.t(-2, -2, 1, 26, 4, 26, 6));
        p1Var.setText(LocaleController.getString(R.string.Gift2StarsSelfInfo1));
        p80Var2.setText(LocaleController.getString(R.string.Gift2StarsSelfInfo2));
        i11 = 3;
        bz bzVar2 = new bz(i11, false);
        this.f7386f0 = bzVar2;
        bzVar2.O = new s1(this);
        this.d.setPadding(AndroidUtilities.dp(16.0f), 0, AndroidUtilities.dp(16.0f), 0);
        this.d.setClipToPadding(false);
        this.d.setClipChildren(false);
        this.d.setLayoutManager(bzVar2);
        this.d.setSelectorType(9);
        this.d.setSelectorDrawableColor(0);
        t1 t1Var2 = new t1();
        this.f7387g0 = t1Var2;
        t1Var2.C = false;
        t1Var2.f5819m = false;
        t1Var2.n(350L);
        t1Var2.o(er.h);
        t1Var2.D = 40L;
        this.d.setItemAnimator(t1Var2);
        this.d.setOnItemClickListener(new pk0() {
            @Override
            public final void a(int i16, View view) {
                k2.Q(this.f7407a, context, i10, callback, j10, i16);
            }
        });
        W();
        this.U.N(false);
        N();
        if (BirthdayController.getInstance(i10).isToday(j10)) {
            V(true);
        }
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.billingProductDetailsUpdated);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starGiftsLoaded);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.userInfoDidLoad);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starGiftSoldOut);
        NotificationCenter.getInstance(i10).addObserver(this, NotificationCenter.starUserGiftsLoaded);
        this.f31853e.setTitle(z());
        NotificationCenter.listenEmojiLoading(this.f31853e.getTitleTextView());
    }

    public static void P(final k2 k2Var, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, e1 e1Var, final Utilities.Callback callback, TLRPC.TL_error tL_error) {
        b2Var.dismiss();
        if (tLObject instanceof TL_stars.checkCanSendGiftResultOk) {
            e1Var.run();
            return;
        }
        if (!(tLObject instanceof TL_stars.checkCanSendGiftResultFail)) {
            if (tL_error != null) {
                new mc(k2Var.container, k2Var.resourcesProvider).d0(tL_error, false);
                return;
            }
            return;
        }
        AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(k2Var.getContext(), 0, k2Var.resourcesProvider);
        alertDialog$Builder.f22702a.N = LocaleController.getString(R.string.GiftLocked);
        alertDialog$Builder.f22702a.P = MessageObject.formatTextWithEntities(((TL_stars.checkCanSendGiftResultFail) tLObject).reason, false);
        alertDialog$Builder.k(LocaleController.getString(R.string.OK), null);
        final org.telegram.ui.ActionBar.b2 b2VarO = alertDialog$Builder.o();
        final ut utVar = b2VarO.f22759n;
        if (utVar != null) {
            utVar.setOnLinkPressListener(new o80() {
                @Override
                public final void a(ClickableSpan clickableSpan) {
                    k2 k2Var2 = this.f7348a;
                    k2Var2.getClass();
                    b2VarO.dismiss();
                    Utilities.Callback callback2 = callback;
                    if (callback2 != null) {
                        callback2.run(Boolean.FALSE);
                    }
                    k2Var2.dismiss();
                    clickableSpan.onClick(utVar);
                }
            });
        }
    }

    public static void Q(k2 k2Var, Context context, int i10, Utilities.Callback callback, long j10, int i11) {
        TL_stars.SavedStarGift savedStarGift;
        n41 n41VarG = k2Var.U.G(i11 - 1);
        if (n41VarG != null && n41VarG.G(a2.class)) {
            Object obj = n41VarG.G;
            int i12 = 0;
            if (obj instanceof ag.p) {
                new u1(k2Var, context, i10, (ag.p) obj, k2Var.Y, new a1(k2Var, callback, 0)).show();
                return;
            }
            if (obj instanceof TL_stars.StarGift) {
                TL_stars.StarGift starGift = (TL_stars.StarGift) obj;
                m7 m7Var = k2Var.f7391k0;
                if (m7Var != null && k2Var.f7394o0 == k2Var.m0) {
                    ArrayList arrayList = m7Var.f9753l;
                    int size = arrayList.size();
                    while (true) {
                        if (i12 >= size) {
                            savedStarGift = null;
                            break;
                        }
                        Object obj2 = arrayList.get(i12);
                        i12++;
                        TL_stars.SavedStarGift savedStarGift2 = (TL_stars.SavedStarGift) obj2;
                        if (savedStarGift2.gift.f22607id == starGift.f22607id) {
                            savedStarGift = savedStarGift2;
                            break;
                        }
                    }
                    if (savedStarGift == null) {
                        return;
                    }
                    v1 v1Var = new v1(k2Var, k2Var.getContext(), i10, UserConfig.getInstance(i10).getClientUserId(), k2Var.resourcesProvider);
                    v1Var.j2(savedStarGift, null);
                    v1Var.Z1(j10, new b1(k2Var, v1Var, j10, callback, 0));
                    return;
                }
                if (n41VarG.f30849q && starGift.availability_resale > 0) {
                    org.telegram.ui.ActionBar.n2 n2VarU = LaunchActivity.U();
                    if (n2VarU == null) {
                        return;
                    }
                    org.telegram.ui.ActionBar.l2 l2Var = new org.telegram.ui.ActionBar.l2();
                    l2Var.f23619a = true;
                    l2Var.f23622e = true;
                    w1 w1Var = new w1(j10, starGift.title, starGift.f22607id, k2Var.resourcesProvider, k2Var.container.getViewTreeObserver(), new c1());
                    w1Var.f7683e = new d1(i12, k2Var, callback);
                    n2VarU.showAsSheet(w1Var, l2Var);
                    return;
                }
                if (starGift.auction) {
                    GiftAuctionController.getInstance(i10).getOrRequestAuction(starGift.f22607id, new w(context, k2Var.resourcesProvider, i10, j10, new a1(k2Var, callback, 1)));
                    return;
                }
                if (!starGift.sold_out) {
                    if (starGift.limited_per_user && starGift.per_user_remains <= 0) {
                        new mc(k2Var.container, k2Var.resourcesProvider).R(starGift.getDocument(), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2PerUserLimit", starGift.per_user_total))).j();
                        return;
                    }
                    e1 e1Var = new e1(k2Var, context, i10, starGift, callback, 0);
                    if (starGift.locked_until_date > ConnectionsManager.getInstance(i10).getCurrentTime()) {
                        org.telegram.ui.ActionBar.b2 b2Var = new org.telegram.ui.ActionBar.b2(k2Var.getContext(), 3, null);
                        b2Var.q(500L);
                        TL_stars.checkCanSendGift checkcansendgift = new TL_stars.checkCanSendGift();
                        checkcansendgift.gift_id = starGift.f22607id;
                        ConnectionsManager.getInstance(i10).sendRequest(checkcansendgift, new f1(k2Var, b2Var, e1Var, callback, 0));
                        return;
                    }
                    if (!starGift.require_premium || UserConfig.getInstance(i10).isPremium()) {
                        e1Var.run();
                        return;
                    }
                    org.telegram.ui.ActionBar.n2 n2VarU2 = LaunchActivity.U();
                    if (n2VarU2 == null) {
                        return;
                    }
                    ag.y2 y2Var = new ag.y2(n2VarU2, i10, null, null, starGift, k2Var.resourcesProvider);
                    n9 n9Var = new n9(k2Var.getContext());
                    org.telegram.ui.Components.i5 i5Var = new org.telegram.ui.Components.i5(AndroidUtilities.dp(160.0f), 4, n9Var, false);
                    n9Var.setImageDrawable(i5Var);
                    n9Var.addOnAttachStateChangeListener(new n1(i5Var));
                    i5Var.i(starGift.getDocument(), false);
                    y2Var.f730x0 = n9Var;
                    y2Var.show();
                    i5Var.f();
                    return;
                }
                org.telegram.ui.ActionBar.c6 c6Var = k2Var.resourcesProvider;
                if (context == null) {
                    return;
                }
                org.telegram.ui.ActionBar.e3 e3VarO = org.telegram.messenger.y1.o(context, c6Var, false, false);
                LinearLayout linearLayoutG = org.telegram.messenger.y1.g(context, 1);
                linearLayoutG.setPadding(AndroidUtilities.dp(16.0f), AndroidUtilities.dp(20.0f), AndroidUtilities.dp(16.0f), AndroidUtilities.dp(8.0f));
                linearLayoutG.setClipChildren(false);
                linearLayoutG.setClipToPadding(false);
                n9 n9Var2 = new n9(context);
                oa.a1(n9Var2.getImageReceiver(), starGift, 160);
                linearLayoutG.addView(n9Var2, h7.z5.t(160, 160, 17, 0, -8, 0, 10));
                TextView textView = new TextView(context);
                rl.w(org.telegram.ui.ActionBar.g6.f23161j5, c6Var, textView, 1, 20.0f);
                textView.setGravity(17);
                textView.setText(LocaleController.getString(R.string.Gift2SoldOutSheetTitle));
                TextView textViewI = pa.i(linearLayoutG, textView, h7.z5.t(-1, -2, 17, 20, 0, 20, 4), context);
                textViewI.setTextSize(1, 14.0f);
                textViewI.setTypeface(AndroidUtilities.bold());
                textViewI.setGravity(17);
                textViewI.setTextColor(org.telegram.ui.ActionBar.g6.v0(org.telegram.ui.ActionBar.g6.f23284q7, c6Var));
                textViewI.setText(LocaleController.getString(R.string.Gift2SoldOutSheetSubtitle));
                linearLayoutG.addView(textViewI, h7.z5.t(-1, -2, 17, 20, 0, 20, 4));
                yy0 yy0Var = new yy0(context, c6Var);
                if (starGift.first_sale_date != 0) {
                    yy0Var.f(starGift.first_sale_date, LocaleController.getString(R.string.Gift2SoldOutSheetFirstSale));
                }
                if (starGift.last_sale_date != 0) {
                    yy0Var.f(starGift.last_sale_date, LocaleController.getString(R.string.Gift2SoldOutSheetLastSale));
                }
                yy0Var.c(LocaleController.getString(R.string.Gift2SoldOutSheetValue), oa.X0(false, i0.a.m(starGift.stars, ',', new StringBuilder("⭐️ ")), 0.8f, null), null, null);
                if (starGift.limited) {
                    oa.F0(yy0Var, i10, starGift, c6Var);
                }
                linearLayoutG.addView(yy0Var, h7.z5.k(0.0f, 17.0f, 0.0f, 12.0f, -1, -2));
                lh.d dVar = new lh.d(context, c6Var, true);
                dVar.g(LocaleController.getString(R.string.OK), false, true);
                linearLayoutG.addView(dVar, h7.z5.n(-1, 48));
                e3VarO.customView = linearLayoutG;
                org.telegram.ui.ActionBar.e3[] e3VarArr = {e3VarO};
                e3VarArr[0].useBackgroundTopPadding = false;
                dVar.setOnClickListener(new d8(e3VarArr, 2));
                e3VarArr[0].fixNavigationBar();
                org.telegram.ui.ActionBar.n2 n2VarU3 = LaunchActivity.U();
                if (!AndroidUtilities.isTablet() && !AndroidUtilities.hasDialogOnTop(n2VarU3)) {
                    e3VarArr[0].makeAttached(n2VarU3);
                }
                e3VarArr[0].show();
            }
        }
    }

    public final void U(ArrayList arrayList, b51 b51Var) {
        long j10;
        boolean z10;
        boolean z11;
        TL_stars.StarGift starGift;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings2;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings3;
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings4;
        int i10 = 2;
        o1 o1Var = this.f7383c0;
        long j11 = this.Y;
        long j12 = 0;
        int i11 = 0;
        boolean z12 = this.Z;
        if (z12 || j11 < 0 || ((disallowedGiftsSettings4 = this.X) != null && disallowedGiftsSettings4.disallow_premium_gifts)) {
            j10 = 0;
            z10 = false;
        } else {
            arrayList.add(n41.k(o1Var));
            arrayList.add(n41.k(this.f7384d0));
            ArrayList arrayList2 = this.f7390j0;
            if (arrayList2 == null || arrayList2.isEmpty()) {
                j10 = 0;
                n41 n41VarO = n41.o(1, 34);
                n41VarO.f30853u = 1;
                arrayList.add(n41VarO);
                n41 n41VarO2 = n41.o(2, 34);
                n41VarO2.f30853u = 1;
                arrayList.add(n41VarO2);
                n41 n41VarO3 = n41.o(3, 34);
                n41VarO3.f30853u = 1;
                arrayList.add(n41VarO3);
            } else {
                int size = arrayList2.size();
                int i12 = 0;
                while (i12 < size) {
                    Object obj = arrayList2.get(i12);
                    i12++;
                    int i13 = a2.f7134a;
                    long j13 = j12;
                    n41 n41VarJ = n41.J(a2.class);
                    n41VarJ.f30853u = 1;
                    n41VarJ.G = (ag.p) obj;
                    arrayList.add(n41VarJ);
                    j12 = j13;
                }
                j10 = j12;
            }
            z10 = true;
        }
        int i14 = this.T;
        u7 u7VarY = u7.y(i14, false);
        ArrayList arrayList3 = this.f7395p0 ? u7VarY.J : u7VarY.I;
        if (this.X != null) {
            arrayList3 = (ArrayList) Collection.EL.stream(arrayList3).filter(new nh.l1(this, i10)).collect(Collectors.toCollection(new tf()));
        }
        if (j11 < j10) {
            arrayList3 = (ArrayList) Collection.EL.stream(arrayList3).filter(new g1(i11)).collect(Collectors.toCollection(new tf()));
        }
        long clientUserId = UserConfig.getInstance(i14).getClientUserId();
        m7 m7Var = this.f7391k0;
        if (j11 != clientUserId && m7Var != null) {
            ArrayList arrayList4 = m7Var.f9753l;
            int size2 = arrayList4.size();
            int i15 = 0;
            while (true) {
                if (i15 >= size2) {
                    z11 = false;
                    break;
                }
                Object obj2 = arrayList4.get(i15);
                i15++;
                if (((TL_stars.SavedStarGift) obj2).gift instanceof TL_stars.TL_starGiftUnique) {
                    z11 = true;
                    break;
                }
            }
        } else {
            z11 = false;
            break;
        }
        if (MessagesController.getInstance(i14).stargiftsBlocked || (arrayList3.isEmpty() && ((disallowedGiftsSettings3 = this.X) == null || disallowedGiftsSettings3.disallow_unique_stargifts || m7Var == null || m7Var.f9753l.isEmpty()))) {
            TLRPC.DisallowedGiftsSettings disallowedGiftsSettings5 = this.X;
            if (disallowedGiftsSettings5 == null || disallowedGiftsSettings5.disallow_unique_stargifts || !arrayList3.isEmpty()) {
                return;
            }
            arrayList.add(n41.C(AndroidUtilities.dp(300.0f)));
            return;
        }
        if (z10) {
            arrayList.add(n41.C(AndroidUtilities.dp(16.0f)));
        } else {
            arrayList.add(n41.k(o1Var));
        }
        arrayList.add(n41.k(this.f7385e0));
        TreeSet treeSet = new TreeSet();
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings6 = this.X;
        if (disallowedGiftsSettings6 == null || !disallowedGiftsSettings6.disallow_unique_stargifts) {
            for (int i16 = 0; i16 < arrayList3.size(); i16++) {
                treeSet.add(Long.valueOf(((TL_stars.StarGift) arrayList3.get(i16)).stars));
            }
        }
        ArrayList arrayList5 = new ArrayList();
        this.m0 = -1;
        this.f7392l0 = -1;
        if (!arrayList3.isEmpty()) {
            this.f7392l0 = arrayList5.size();
            arrayList5.add(LocaleController.getString(R.string.Gift2TabAll));
        }
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings7 = this.X;
        if ((disallowedGiftsSettings7 == null || !disallowedGiftsSettings7.disallow_unique_stargifts) && z11) {
            this.m0 = arrayList5.size();
            arrayList5.add(LocaleController.getString(R.string.Gift2TabMine));
        }
        this.f7393n0 = arrayList5.size();
        arrayList5.add(LocaleController.getString(R.string.Gift2TabCollectibles));
        int i17 = this.f7394o0;
        h1 h1Var = new h1(this, i11);
        int i18 = i2.f7318a;
        n41 n41VarJ2 = n41.J(i2.class);
        n41VarJ2.d = 1;
        n41VarJ2.G = arrayList5;
        n41VarJ2.f30857z = i17;
        n41VarJ2.H = h1Var;
        arrayList.add(n41VarJ2);
        boolean z13 = this.f7394o0 == this.f7393n0 && !z12 && j11 >= j10;
        if (z13 != this.f7396q0) {
            this.f7396q0 = z13;
            ViewPropertyAnimator duration = this.f7388h0.animate().alpha(!z13 ? 1.0f : 0.0f).scaleX(!z13 ? 1.0f : 0.85f).scaleY(!z13 ? 1.0f : 0.85f).setDuration(380L);
            er erVar = er.h;
            duration.setInterpolator(erVar).start();
            this.f7389i0.animate().alpha(z13 ? 1.0f : 0.0f).scaleX(z13 ? 1.0f : 0.85f).scaleY(z13 ? 1.0f : 0.85f).setDuration(380L).setInterpolator(erVar).start();
        }
        if (m7Var != null && this.f7394o0 == this.m0) {
            arrayList3 = new ArrayList();
            ArrayList arrayList6 = m7Var.f9753l;
            int size3 = arrayList6.size();
            int i19 = 0;
            while (i19 < size3) {
                Object obj3 = arrayList6.get(i19);
                i19++;
                TL_stars.StarGift starGift2 = ((TL_stars.SavedStarGift) obj3).gift;
                if (starGift2 instanceof TL_stars.TL_starGiftUnique) {
                    arrayList3.add(starGift2);
                }
            }
        }
        int i20 = 0;
        for (int i21 = 0; i21 < arrayList3.size(); i21++) {
            TL_stars.StarGift starGift3 = (TL_stars.StarGift) arrayList3.get(i21);
            int i22 = this.f7394o0;
            if (i22 == this.f7392l0 || i22 == this.m0 || (i22 == this.f7393n0 && (starGift3.availability_resale > j10 || starGift3.require_premium || starGift3.locked_until_date != 0))) {
                if (starGift3.sold_out || starGift3.availability_resale <= j10 || i22 == this.f7393n0) {
                    starGift = starGift3;
                } else {
                    n41 n41VarA = a2.a(i22, starGift3, i22 == this.m0, starGift3.limited && (disallowedGiftsSettings2 = this.X) != null && disallowedGiftsSettings2.disallow_limited_stargifts, false, false, false);
                    starGift = starGift3;
                    arrayList.add(n41VarA);
                    i20++;
                }
                int i23 = this.f7394o0;
                arrayList.add(a2.a(i23, starGift, i23 == this.m0, starGift.limited && (disallowedGiftsSettings = this.X) != null && disallowedGiftsSettings.disallow_limited_stargifts, true, false, false));
                i20++;
            }
        }
        int i24 = this.f7394o0;
        int i25 = this.m0;
        if (i24 == i25 && m7Var != null && !m7Var.f9751j) {
            m7Var.a();
            n41 n41VarO4 = n41.o(4, 34);
            n41VarO4.f30853u = 1;
            arrayList.add(n41VarO4);
            n41 n41VarO5 = n41.o(5, 34);
            n41VarO5.f30853u = 1;
            arrayList.add(n41VarO5);
            n41 n41VarO6 = n41.o(6, 34);
            n41VarO6.f30853u = 1;
            arrayList.add(n41VarO6);
        } else if (i24 != i25 && u7VarY.C) {
            n41 n41VarO7 = n41.o(4, 34);
            n41VarO7.f30853u = 1;
            arrayList.add(n41VarO7);
            n41 n41VarO8 = n41.o(5, 34);
            n41VarO8.f30853u = 1;
            arrayList.add(n41VarO8);
            n41 n41VarO9 = n41.o(6, 34);
            n41VarO9.f30853u = 1;
            arrayList.add(n41VarO9);
        }
        arrayList.add(n41.C(AndroidUtilities.dp(i20 >= 9 ? 40.0f : 300.0f)));
    }

    public final void V(boolean z10) {
        this.f7395p0 = z10;
        this.U.N(false);
    }

    public final void W() {
        List list;
        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption;
        ArrayList arrayList = this.f7390j0;
        arrayList.clear();
        if (arrayList.isEmpty() && (list = this.V) != null && !list.isEmpty()) {
            ArrayList arrayList2 = new ArrayList();
            long jF = 0;
            for (int size = this.V.size() - 1; size >= 0; size--) {
                TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption2 = (TLRPC.TL_premiumGiftCodeOption) this.V.get(size);
                if (!"XTR".equalsIgnoreCase(tL_premiumGiftCodeOption2.currency)) {
                    Iterator it = this.V.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            tL_premiumGiftCodeOption = null;
                            break;
                        }
                        tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) it.next();
                        if (tL_premiumGiftCodeOption != tL_premiumGiftCodeOption2 && "XTR".equalsIgnoreCase(tL_premiumGiftCodeOption.currency) && tL_premiumGiftCodeOption.months == tL_premiumGiftCodeOption2.months) {
                            break;
                        }
                    }
                    ag.p pVar = new ag.p(tL_premiumGiftCodeOption2, tL_premiumGiftCodeOption);
                    arrayList.add(pVar);
                    if (BuildVars.useInvoiceBilling()) {
                        if (pVar.f() > jF) {
                            jF = pVar.f();
                        }
                    } else if (pVar.h() != null && BillingController.getInstance().isReady()) {
                        c9.b bVar = new c9.b();
                        bVar.f2567c = "inapp";
                        bVar.f2566b = pVar.h();
                        arrayList2.add(bVar.a());
                    }
                }
            }
            if (BuildVars.useInvoiceBilling()) {
                int size2 = arrayList.size();
                int i10 = 0;
                while (i10 < size2) {
                    Object obj = arrayList.get(i10);
                    i10++;
                    ((ag.p) obj).f590g = jF;
                }
            } else if (!arrayList2.isEmpty()) {
                System.currentTimeMillis();
                BillingController.getInstance().queryProductDetails(arrayList2, new a1.c(this, 28));
            }
        }
        if (arrayList.isEmpty()) {
            cg.q0.j(this.T, null, new h1(this, 1));
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        b51 b51Var;
        if (i10 == NotificationCenter.billingProductDetailsUpdated) {
            W();
            return;
        }
        if (i10 == NotificationCenter.starGiftsLoaded) {
            b51 b51Var2 = this.U;
            if (b51Var2 != null) {
                b51Var2.N(true);
                return;
            }
            return;
        }
        if (i10 != NotificationCenter.userInfoDidLoad) {
            if (i10 != NotificationCenter.starGiftSoldOut) {
                if (i10 == NotificationCenter.starUserGiftsLoaded && objArr[1] == this.f7391k0 && (b51Var = this.U) != null) {
                    b51Var.N(true);
                    return;
                }
                return;
            }
            if (isShown()) {
                TL_stars.StarGift starGift = (TL_stars.StarGift) objArr[0];
                new mc(this.container, this.resourcesProvider).s(starGift.sticker, LocaleController.getString(R.string.Gift2SoldOutTitle), AndroidUtilities.replaceTags(LocaleController.formatPluralStringComma("Gift2SoldOutCount", starGift.availability_total))).j();
                b51 b51Var3 = this.U;
                if (b51Var3 != null) {
                    b51Var3.N(true);
                    return;
                }
                return;
            }
            return;
        }
        if (isShown()) {
            long jLongValue = ((Long) objArr[0]).longValue();
            long j10 = this.Y;
            if (jLongValue == j10 && j10 > 0) {
                int i12 = this.T;
                TLRPC.UserFull userFull = MessagesController.getInstance(i12).getUserFull(j10);
                TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = (j10 == UserConfig.getInstance(i12).getClientUserId() || userFull == null) ? null : userFull.disallowed_stargifts;
                this.X = disallowedGiftsSettings;
                if (disallowedGiftsSettings != null && disallowedGiftsSettings.disallow_premium_gifts && disallowedGiftsSettings.disallow_unique_stargifts && disallowedGiftsSettings.disallow_limited_stargifts && disallowedGiftsSettings.disallow_unlimited_stargifts) {
                    dismiss();
                    org.telegram.ui.ActionBar.n2 n2VarU = LaunchActivity.U();
                    if (n2VarU != null) {
                        mc.a0(n2VarU).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(j10)))).j();
                        return;
                    }
                    return;
                }
                b51 b51Var4 = this.U;
                if (b51Var4 != null) {
                    b51Var4.N(true);
                }
            }
            ArrayList arrayList = this.f7390j0;
            if (arrayList == null || arrayList.isEmpty()) {
                W();
                b51 b51Var5 = this.U;
                if (b51Var5 != null) {
                    b51Var5.N(true);
                }
            }
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
            org.telegram.ui.b.b(i10);
            return;
        }
        TLRPC.DisallowedGiftsSettings disallowedGiftsSettings = this.X;
        if (disallowedGiftsSettings == null || !disallowedGiftsSettings.disallow_premium_gifts || !disallowedGiftsSettings.disallow_unique_stargifts || !disallowedGiftsSettings.disallow_limited_stargifts || !disallowedGiftsSettings.disallow_unlimited_stargifts) {
            super.show();
            return;
        }
        org.telegram.ui.ActionBar.n2 n2VarU = LaunchActivity.U();
        if (n2VarU != null) {
            mc.a0(n2VarU).Q(R.raw.error, 36, AndroidUtilities.replaceTags(LocaleController.formatString(R.string.UserDisallowedGifts, DialogObject.getShortName(this.Y)))).j();
        }
    }

    @Override
    public final yk0 w(zk0 zk0Var) {
        b51 b51Var = new b51(this.d, getContext(), this.T, 0, true, new ch.c(this, 8), this.resourcesProvider);
        this.U = b51Var;
        b51Var.f26942r = false;
        return b51Var;
    }

    @Override
    public final CharSequence z() {
        return this.Z ? LocaleController.getString(R.string.Gift2TitleSelf1) : Emoji.replaceEmoji(LocaleController.formatString(R.string.Gift2User, this.f7381a0), null, false);
    }

    public k2(LaunchActivity launchActivity, int i10, long j10) {
        this(launchActivity, i10, j10, null, null);
    }
}
