package cg;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import h7.z5;
import hh.t9;
import hh.u7;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import nh.b3;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.e3;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.w5;
import org.telegram.ui.ActionBar.z2;
import org.telegram.ui.Cells.pa;
import org.telegram.ui.Components.er;
import org.telegram.ui.Components.fc0;
import org.telegram.ui.Components.qa;
import org.telegram.ui.Components.w4;
import org.telegram.ui.Components.yk0;
import org.telegram.ui.Components.zk0;
import org.telegram.ui.LaunchActivity;

public final class d1 extends qa implements NotificationCenter.NotificationCenterDelegate {
    public final ArrayList T;
    public final List U;
    public final List V;
    public final List W;
    public final TLRPC.Chat X;
    public final ArrayList Y;
    public final ArrayList Z;

    public final ArrayList f2634a0;

    public final ArrayList f2635b0;

    public dg.b f2636c0;

    public int f2637d0;

    public int f2638e0;

    public int f2639f0;

    public boolean f2640g0;

    public int f2641h0;

    public long f2642i0;

    public int f2643j0;

    public int f2644k0;

    public long f2645l0;
    public final eg.a m0;

    public xe.b f2646n0;

    public int f2647o0;

    public s f2648p0;

    public final TL_stories.PrepaidGiveaway f2649q0;

    public String f2650r0;

    public boolean f2651s0;

    public boolean f2652t0;

    public final r0 f2653u0;

    public d1(org.telegram.ui.ActionBar.n2 n2Var, long j10, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        super(n2Var, false);
        this.T = new ArrayList();
        this.U = q0.h() ? Arrays.asList(1, 3, 5, 7, 10, 25, 50) : Arrays.asList(1, 3, 5, 7, 10, 25, 50, 100);
        this.V = q0.h() ? Arrays.asList(1, 3, 5, 7, 10, 25, 50) : Arrays.asList(1, 3, 5, 7, 10, 25, 50, 100);
        this.W = Arrays.asList(750, 10000, 50000);
        this.Y = new ArrayList();
        this.Z = new ArrayList();
        this.f2634a0 = new ArrayList();
        this.f2635b0 = new ArrayList();
        int i10 = eg.e.f5401s;
        this.f2637d0 = 2;
        this.f2638e0 = 0;
        int i11 = eg.x.f5455s;
        this.f2639f0 = 0;
        this.f2641h0 = 12;
        long time = new Date().getTime() + 259200000;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(time);
        calendar.set(14, 0);
        calendar.set(13, 0);
        int i12 = calendar.get(12);
        while (i12 % 5 != 0) {
            i12++;
        }
        calendar.set(12, i12);
        this.f2642i0 = calendar.getTimeInMillis();
        this.f2643j0 = 2;
        this.f2644k0 = 2;
        this.f2650r0 = "";
        this.f2652t0 = true;
        this.f2653u0 = new r0(this, 0);
        this.f2649q0 = prepaidGiveaway;
        this.v = 0.15f;
        setApplyTopPadding(false);
        setApplyBottomPadding(false);
        this.useBackgroundTopPadding = false;
        this.backgroundPaddingLeft = 0;
        N();
        ((ViewGroup.MarginLayoutParams) this.f31853e.getLayoutParams()).leftMargin = 0;
        ((ViewGroup.MarginLayoutParams) this.f31853e.getLayoutParams()).rightMargin = 0;
        if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
            int i13 = eg.e.f5401s;
            this.f2637d0 = 3;
        }
        f2.l lVar = new f2.l();
        lVar.n(350L);
        lVar.o(er.h);
        lVar.C = false;
        lVar.f5819m = false;
        this.d.setItemAnimator(lVar);
        zk0 zk0Var = this.d;
        int i14 = this.backgroundPaddingLeft;
        zk0Var.setPadding(i14, 0, i14, AndroidUtilities.dp(68.0f));
        this.d.setOnScrollListener(new c1());
        this.d.setOnItemClickListener(new x0(0, this, n2Var));
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j10));
        this.X = chat;
        dg.b bVar = this.f2636c0;
        ArrayList arrayList = this.T;
        zk0 zk0Var2 = this.d;
        s0 s0Var = new s0(this);
        s0 s0Var2 = new s0(this);
        s0 s0Var3 = new s0(this);
        bVar.f4932e = arrayList;
        bVar.v = chat;
        bVar.f4933f = zk0Var2;
        bVar.h = s0Var;
        bVar.f4934n = s0Var2;
        bVar.f4936s = s0Var3;
        a0(false, false);
        eg.a aVar = new eg.a(getContext(), this.resourcesProvider);
        this.m0 = aVar;
        aVar.setOnClickListener(new b1(this, prepaidGiveaway, j10, n2Var));
        Z(false);
        this.containerView.addView(aVar, z5.d(-1, 68.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        q0.j(this.currentAccount, chat, new v0(this, 5));
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starGiveawayOptionsLoaded);
    }

    public static void P(d1 d1Var, TL_stories.PrepaidGiveaway prepaidGiveaway, long j10, org.telegram.ui.ActionBar.n2 n2Var) {
        String str;
        ArrayList arrayList = d1Var.f2634a0;
        ArrayList arrayList2 = d1Var.Y;
        TLRPC.Chat chat = d1Var.X;
        ArrayList arrayList3 = d1Var.Z;
        ArrayList arrayList4 = d1Var.f2635b0;
        eg.a aVar = d1Var.m0;
        if (aVar.f5382a.J) {
            return;
        }
        int i10 = 10;
        int i11 = 0;
        if (d1Var.Y()) {
            TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway = prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway ? (TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway : null;
            t0 t0Var = new t0(d1Var, prepaidGiveaway, tL_prepaidStarsGiveaway, j10, tL_prepaidStarsGiveaway != null ? tL_prepaidStarsGiveaway.stars : 0L, 0);
            org.telegram.ui.ActionBar.n2 n2VarR = LaunchActivity.R();
            if (n2VarR == null) {
                return;
            }
            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(n2VarR.getContext(), 0, n2VarR.getResourceProvider());
            String string = LocaleController.getString(R.string.BoostingStartGiveawayConfirmTitle);
            org.telegram.ui.ActionBar.b2 b2Var = alertDialog$Builder.f22702a;
            b2Var.N = string;
            b2Var.P = AndroidUtilities.replaceTags(LocaleController.getString(R.string.BoostingStartGiveawayConfirmText));
            alertDialog$Builder.k(LocaleController.getString(R.string.Start), new a1.c(t0Var, i10));
            alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new a9.m(17));
            alertDialog$Builder.o();
            return;
        }
        int i12 = d1Var.f2637d0;
        int i13 = eg.e.f5401s;
        int i14 = 3;
        if (i12 == 3) {
            Activity activityFindActivity = AndroidUtilities.findActivity(d1Var.getContext());
            if (activityFindActivity == null) {
                activityFindActivity = LaunchActivity.C1;
            }
            if (activityFindActivity == null || activityFindActivity.isFinishing()) {
                return;
            }
            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOptionW = d1Var.W(d1Var.f2645l0);
            int iU = d1Var.U();
            if (tL_starsGiveawayOptionW == null) {
                return;
            }
            aVar.f5382a.setLoading(true);
            int i15 = d1Var.f2639f0;
            int i16 = eg.x.f5455s;
            boolean z10 = i15 == 1;
            u7 u7VarY = u7.y(d1Var.currentAccount, false);
            int iL = q0.l(d1Var.f2642i0);
            boolean z11 = d1Var.f2652t0;
            boolean z12 = d1Var.f2651s0;
            String str2 = d1Var.f2650r0;
            u0 u0Var = new u0(i11, d1Var, tL_starsGiveawayOptionW);
            int i17 = u7VarY.f10151a;
            if (!MessagesController.getInstance(i17).starsPurchaseAvailable()) {
                org.telegram.ui.ActionBar.n2 n2VarR2 = LaunchActivity.R();
                if (n2VarR2 == null || n2VarR2.getContext() == null) {
                    u7.e0(activityFindActivity, null);
                    return;
                } else {
                    u7.e0(n2VarR2.getContext(), n2VarR2.getResourceProvider());
                    return;
                }
            }
            TLRPC.TL_inputStorePaymentStarsGiveaway tL_inputStorePaymentStarsGiveaway = new TLRPC.TL_inputStorePaymentStarsGiveaway();
            tL_inputStorePaymentStarsGiveaway.only_new_subscribers = z10;
            tL_inputStorePaymentStarsGiveaway.winners_are_visible = z11;
            Activity activity = activityFindActivity;
            tL_inputStorePaymentStarsGiveaway.stars = tL_starsGiveawayOptionW.stars;
            MessagesController.getInstance(i17);
            tL_inputStorePaymentStarsGiveaway.boost_peer = MessagesController.getInputPeer(chat);
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                tL_inputStorePaymentStarsGiveaway.flags |= 2;
                int size = arrayList2.size();
                int i18 = 0;
                while (i18 < size) {
                    Object obj = arrayList2.get(i18);
                    i18++;
                    ArrayList<TLRPC.InputPeer> arrayList5 = tL_inputStorePaymentStarsGiveaway.additional_peers;
                    MessagesController.getInstance(i17);
                    arrayList5.add(MessagesController.getInputPeer((TLObject) obj));
                }
            }
            int size2 = arrayList.size();
            int i19 = 0;
            while (i19 < size2) {
                Object obj2 = arrayList.get(i19);
                i19++;
                tL_inputStorePaymentStarsGiveaway.countries_iso2.add(((TLRPC.TL_help_country) ((TLObject) obj2)).iso2);
            }
            if (!tL_inputStorePaymentStarsGiveaway.countries_iso2.isEmpty()) {
                tL_inputStorePaymentStarsGiveaway.flags |= 4;
            }
            if (z12) {
                tL_inputStorePaymentStarsGiveaway.flags |= 16;
                tL_inputStorePaymentStarsGiveaway.prize_description = str2;
            }
            tL_inputStorePaymentStarsGiveaway.random_id = SendMessagesHelper.getInstance(i17).getNextRandomId();
            tL_inputStorePaymentStarsGiveaway.until_date = iL;
            tL_inputStorePaymentStarsGiveaway.currency = tL_starsGiveawayOptionW.currency;
            tL_inputStorePaymentStarsGiveaway.amount = tL_starsGiveawayOptionW.amount;
            tL_inputStorePaymentStarsGiveaway.users = iU;
            if (!BuildVars.useInvoiceBilling() && BillingController.getInstance().isReady() && (str = tL_starsGiveawayOptionW.store_product) != null) {
                c9.b bVar = new c9.b();
                bVar.f2567c = "inapp";
                bVar.f2566b = str;
                BillingController.getInstance().queryProductDetails(Arrays.asList(bVar.a()), new a1.d(u7VarY, u0Var, tL_inputStorePaymentStarsGiveaway, activity, 3));
                return;
            }
            TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars = new TLRPC.TL_inputInvoiceStars();
            tL_inputInvoiceStars.purpose = tL_inputStorePaymentStarsGiveaway;
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            JSONObject jSONObjectP = b3.p(u7.I(), false);
            if (jSONObjectP != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = jSONObjectP.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoiceStars;
            ConnectionsManager.getInstance(i17).sendRequest(tL_payments_getPaymentForm, new y(u7VarY, u0Var, tL_inputInvoiceStars, 10));
            return;
        }
        int i20 = 14;
        if (d1Var.f2638e0 == 1) {
            ArrayList arrayListB = q0.b(arrayList3.size(), arrayList4);
            for (int i21 = 0; i21 < arrayListB.size(); i21++) {
                TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) arrayListB.get(i21);
                if (tL_premiumGiftCodeOption.months == d1Var.f2641h0 && arrayList3.size() > 0) {
                    if (q0.h()) {
                        Context context = d1Var.getContext();
                        c6 c6Var = d1Var.resourcesProvider;
                        if (tL_premiumGiftCodeOption.store_product == null) {
                            ArrayList arrayList6 = new ArrayList();
                            int size3 = arrayList4.size();
                            int i22 = 0;
                            while (i22 < size3) {
                                Object obj3 = arrayList4.get(i22);
                                i22++;
                                TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption2 = (TLRPC.TL_premiumGiftCodeOption) obj3;
                                if (tL_premiumGiftCodeOption2.months == tL_premiumGiftCodeOption.months && tL_premiumGiftCodeOption2.store_product != null) {
                                    arrayList6.add(Integer.valueOf(tL_premiumGiftCodeOption2.users));
                                }
                            }
                            String strJoin = TextUtils.join(", ", arrayList6);
                            int i23 = tL_premiumGiftCodeOption.users;
                            AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context, 0, c6Var);
                            String string2 = LocaleController.getString("BoostingReduceQuantity", R.string.BoostingReduceQuantity);
                            org.telegram.ui.ActionBar.b2 b2Var2 = alertDialog$Builder2.f22702a;
                            b2Var2.N = string2;
                            b2Var2.P = AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingReduceUsersTextPlural", i23, strJoin));
                            alertDialog$Builder2.k(LocaleController.getString("OK", R.string.OK), new a9.m(i20));
                            alertDialog$Builder2.o();
                            return;
                        }
                    }
                    aVar.b(true);
                    q0.k(arrayList3, tL_premiumGiftCodeOption, d1Var.X, null, n2Var, new v0(d1Var, 0), new v0(d1Var, 1));
                    return;
                }
            }
            return;
        }
        ArrayList arrayListB2 = q0.b(d1Var.U(), arrayList4);
        for (int i24 = 0; i24 < arrayListB2.size(); i24++) {
            TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption3 = (TLRPC.TL_premiumGiftCodeOption) arrayListB2.get(i24);
            if (tL_premiumGiftCodeOption3.months == d1Var.f2641h0) {
                if (q0.h()) {
                    List list = d1Var.U;
                    Context context2 = d1Var.getContext();
                    c6 c6Var2 = d1Var.resourcesProvider;
                    v0 v0Var = new v0(d1Var, 2);
                    if (tL_premiumGiftCodeOption3.store_product == null) {
                        ArrayList arrayList7 = new ArrayList();
                        int size4 = arrayList4.size();
                        int i25 = 0;
                        while (i25 < size4) {
                            Object obj4 = arrayList4.get(i25);
                            i25++;
                            TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption4 = (TLRPC.TL_premiumGiftCodeOption) obj4;
                            if (tL_premiumGiftCodeOption4.months == tL_premiumGiftCodeOption3.months && tL_premiumGiftCodeOption4.store_product != null && list.contains(Integer.valueOf(tL_premiumGiftCodeOption4.users))) {
                                arrayList7.add(tL_premiumGiftCodeOption4);
                            }
                        }
                        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption5 = (TLRPC.TL_premiumGiftCodeOption) arrayList7.get(0);
                        int size5 = arrayList7.size();
                        int i26 = 0;
                        while (i26 < size5) {
                            Object obj5 = arrayList7.get(i26);
                            i26++;
                            TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption6 = (TLRPC.TL_premiumGiftCodeOption) obj5;
                            int i27 = tL_premiumGiftCodeOption3.users;
                            int i28 = tL_premiumGiftCodeOption6.users;
                            if (i27 > i28 && i28 > tL_premiumGiftCodeOption5.users) {
                                tL_premiumGiftCodeOption5 = tL_premiumGiftCodeOption6;
                            }
                        }
                        String pluralString = LocaleController.formatPluralString("GiftMonths", tL_premiumGiftCodeOption5.months, new Object[0]);
                        int i29 = tL_premiumGiftCodeOption3.users;
                        int i30 = tL_premiumGiftCodeOption5.users;
                        AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(context2, 0, c6Var2);
                        String string3 = LocaleController.getString("BoostingReduceQuantity", R.string.BoostingReduceQuantity);
                        org.telegram.ui.ActionBar.b2 b2Var3 = alertDialog$Builder3.f22702a;
                        b2Var3.N = string3;
                        b2Var3.P = AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingReduceQuantityTextPlural", i29, pluralString, Integer.valueOf(i30)));
                        alertDialog$Builder3.k(LocaleController.getString("Reduce", R.string.Reduce), new ag.h0(7, v0Var, tL_premiumGiftCodeOption5));
                        alertDialog$Builder3.h(LocaleController.getString("Cancel", R.string.Cancel), new a9.m(i20));
                        alertDialog$Builder3.o();
                        return;
                    }
                }
                int i31 = d1Var.f2639f0;
                int i32 = eg.x.f5455s;
                boolean z13 = i31 == 1;
                int iL2 = q0.l(d1Var.f2642i0);
                aVar.b(true);
                boolean z14 = d1Var.f2652t0;
                boolean z15 = d1Var.f2651s0;
                String str3 = d1Var.f2650r0;
                v0 v0Var2 = new v0(d1Var, i14);
                v0 v0Var3 = new v0(d1Var, 4);
                if (q0.h()) {
                    MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
                    ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                    TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway = new TLRPC.TL_inputStorePaymentPremiumGiveaway();
                    tL_inputStorePaymentPremiumGiveaway.only_new_subscribers = z13;
                    tL_inputStorePaymentPremiumGiveaway.winners_are_visible = z14;
                    tL_inputStorePaymentPremiumGiveaway.prize_description = str3;
                    tL_inputStorePaymentPremiumGiveaway.until_date = iL2;
                    int i33 = tL_inputStorePaymentPremiumGiveaway.flags;
                    tL_inputStorePaymentPremiumGiveaway.flags = i33 | 6;
                    if (z15) {
                        tL_inputStorePaymentPremiumGiveaway.flags = i33 | 22;
                    }
                    tL_inputStorePaymentPremiumGiveaway.random_id = System.currentTimeMillis();
                    tL_inputStorePaymentPremiumGiveaway.additional_peers = new ArrayList<>();
                    int size6 = arrayList2.size();
                    int i34 = 0;
                    while (i34 < size6) {
                        Object obj6 = arrayList2.get(i34);
                        i34++;
                        TLObject tLObject = (TLObject) obj6;
                        if (tLObject instanceof TLRPC.Chat) {
                            tL_inputStorePaymentPremiumGiveaway.additional_peers.add(messagesController.getInputPeer(-((TLRPC.Chat) tLObject).f22380id));
                        }
                    }
                    tL_inputStorePaymentPremiumGiveaway.boost_peer = messagesController.getInputPeer(-chat.f22380id);
                    int size7 = arrayList.size();
                    int i35 = 0;
                    while (i35 < size7) {
                        Object obj7 = arrayList.get(i35);
                        i35++;
                        tL_inputStorePaymentPremiumGiveaway.countries_iso2.add(((TLRPC.TL_help_country) ((TLObject) obj7)).iso2);
                    }
                    c9.b bVar2 = new c9.b();
                    bVar2.f2567c = "inapp";
                    bVar2.f2566b = tL_premiumGiftCodeOption3.store_product;
                    BillingController.getInstance().queryProductDetails(Arrays.asList(bVar2.a()), new d0(tL_inputStorePaymentPremiumGiveaway, tL_premiumGiftCodeOption3, connectionsManager, v0Var3, v0Var2, n2Var, 1));
                    return;
                }
                MessagesController messagesController2 = MessagesController.getInstance(UserConfig.selectedAccount);
                ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm2 = new TLRPC.TL_payments_getPaymentForm();
                TLRPC.TL_inputInvoicePremiumGiftCode tL_inputInvoicePremiumGiftCode = new TLRPC.TL_inputInvoicePremiumGiftCode();
                TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway2 = new TLRPC.TL_inputStorePaymentPremiumGiveaway();
                tL_inputStorePaymentPremiumGiveaway2.only_new_subscribers = z13;
                tL_inputStorePaymentPremiumGiveaway2.winners_are_visible = z14;
                tL_inputStorePaymentPremiumGiveaway2.prize_description = str3;
                tL_inputStorePaymentPremiumGiveaway2.until_date = iL2;
                int i36 = tL_inputStorePaymentPremiumGiveaway2.flags;
                tL_inputStorePaymentPremiumGiveaway2.flags = i36 | 6;
                if (z15) {
                    tL_inputStorePaymentPremiumGiveaway2.flags = i36 | 22;
                }
                tL_inputStorePaymentPremiumGiveaway2.random_id = System.currentTimeMillis();
                tL_inputStorePaymentPremiumGiveaway2.additional_peers = new ArrayList<>();
                int size8 = arrayList2.size();
                int i37 = 0;
                while (i37 < size8) {
                    Object obj8 = arrayList2.get(i37);
                    int i38 = i37 + 1;
                    TLObject tLObject2 = (TLObject) obj8;
                    if (tLObject2 instanceof TLRPC.Chat) {
                        tL_inputStorePaymentPremiumGiveaway2.additional_peers.add(messagesController2.getInputPeer(-((TLRPC.Chat) tLObject2).f22380id));
                    }
                    i37 = i38;
                }
                tL_inputStorePaymentPremiumGiveaway2.boost_peer = messagesController2.getInputPeer(-chat.f22380id);
                tL_inputStorePaymentPremiumGiveaway2.boost_peer = messagesController2.getInputPeer(-chat.f22380id);
                tL_inputStorePaymentPremiumGiveaway2.currency = tL_premiumGiftCodeOption3.currency;
                tL_inputStorePaymentPremiumGiveaway2.amount = tL_premiumGiftCodeOption3.amount;
                int size9 = arrayList.size();
                int i39 = 0;
                while (i39 < size9) {
                    Object obj9 = arrayList.get(i39);
                    i39++;
                    tL_inputStorePaymentPremiumGiveaway2.countries_iso2.add(((TLRPC.TL_help_country) ((TLObject) obj9)).iso2);
                }
                tL_inputInvoicePremiumGiftCode.purpose = tL_inputStorePaymentPremiumGiveaway2;
                tL_inputInvoicePremiumGiftCode.option = tL_premiumGiftCodeOption3;
                JSONObject jSONObjectP2 = b3.p(n2Var.getResourceProvider(), false);
                if (jSONObjectP2 != null) {
                    TLRPC.TL_dataJSON tL_dataJSON2 = new TLRPC.TL_dataJSON();
                    tL_payments_getPaymentForm2.theme_params = tL_dataJSON2;
                    tL_dataJSON2.data = jSONObjectP2.toString();
                    tL_payments_getPaymentForm2.flags |= 1;
                }
                tL_payments_getPaymentForm2.invoice = tL_inputInvoicePremiumGiftCode;
                connectionsManager2.sendRequest(tL_payments_getPaymentForm2, new e0(v0Var3, messagesController2, tL_inputInvoicePremiumGiftCode, n2Var, v0Var2, 0));
                return;
            }
        }
    }

    public static void Q(d1 d1Var, org.telegram.ui.ActionBar.n2 n2Var, View view) {
        xe.b bVar;
        ArrayList arrayList = d1Var.Z;
        r0 r0Var = d1Var.f2653u0;
        if (view instanceof eg.b0) {
            eg.b0 b0Var = (eg.b0) view;
            int type = b0Var.getType();
            boolean z10 = b0Var.f25003e.h;
            boolean z11 = !z10;
            b0Var.setChecked(z11);
            int i10 = eg.b0.H;
            if (type == 0) {
                d1Var.f2652t0 = z11;
                d1Var.a0(false, false);
            } else if (type == 1) {
                b0Var.setDivider(z11);
                d1Var.f2651s0 = z11;
                d1Var.a0(false, false);
                dg.b bVar2 = d1Var.f2636c0;
                for (int i11 = 0; i11 < bVar2.f4932e.size(); i11++) {
                    dg.a aVar = (dg.a) bVar2.f4932e.get(i11);
                    if (aVar.f49413a == 15) {
                        int i12 = aVar.f4930l;
                        int i13 = eg.b0.H;
                        if (i12 == 1) {
                            if (z10) {
                                bVar2.u(i11 + 1);
                                break;
                            } else {
                                bVar2.o(i11 + 1);
                                break;
                            }
                        }
                    }
                }
                d1Var.f2636c0.G();
                if (d1Var.f2651s0) {
                    AndroidUtilities.cancelRunOnUIThread(r0Var);
                } else {
                    AndroidUtilities.runOnUIThread(r0Var, 250L);
                }
            }
        }
        if (view instanceof eg.d) {
            if (view instanceof eg.e) {
                int selectedType = ((eg.e) view).getSelectedType();
                int i14 = eg.e.f5401s;
                if (selectedType == 2 || selectedType == 3) {
                    if (selectedType == 2 && d1Var.f2637d0 == selectedType) {
                        xe.b bVar3 = d1Var.f2646n0;
                        if (bVar3 != null) {
                            ((i2) bVar3.f49392b).V(1, arrayList);
                            ((x) bVar3.f49393c).f2851b.D(1);
                            return;
                        }
                        return;
                    }
                    d1Var.f2637d0 = selectedType;
                    d1Var.a0(true, true);
                    d1Var.Z(true);
                    d1Var.N();
                } else if (selectedType == 1) {
                    xe.b bVar4 = d1Var.f2646n0;
                    if (bVar4 != null) {
                        ((i2) bVar4.f49392b).V(1, arrayList);
                        ((x) bVar4.f49393c).f2851b.D(1);
                    }
                } else {
                    d1Var.f2638e0 = selectedType;
                    d1Var.a0(true, true);
                    d1Var.Z(true);
                    d1Var.N();
                }
            } else {
                eg.d dVar = (eg.d) view;
                zk0 zk0Var = d1Var.d;
                if (dVar.b()) {
                    for (int i15 = 0; i15 < zk0Var.getChildCount(); i15++) {
                        View childAt = zk0Var.getChildAt(i15);
                        if (childAt.getClass().isInstance(dVar)) {
                            ((eg.d) childAt).c(childAt == dVar, true);
                        }
                    }
                }
            }
        }
        if (view instanceof eg.x) {
            int selectedType2 = ((eg.x) view).getSelectedType();
            if (d1Var.f2639f0 == selectedType2 && (bVar = d1Var.f2646n0) != null) {
                ((i2) bVar.f49392b).V(3, d1Var.f2634a0);
                ((x) bVar.f49393c).f2851b.D(1);
            }
            d1Var.f2639f0 = selectedType2;
            d1Var.a0(false, false);
            return;
        }
        if (view instanceof eg.j) {
            d1Var.f2641h0 = ((TLRPC.TL_premiumGiftCodeOption) ((eg.j) view).getGifCode()).months;
            d1Var.a0(false, false);
            d1Var.f2636c0.G();
            return;
        }
        if (!(view instanceof eg.i)) {
            if (view instanceof eg.b) {
                xe.b bVar5 = d1Var.f2646n0;
                if (bVar5 != null) {
                    ((i2) bVar5.f49392b).V(2, d1Var.Y);
                    ((x) bVar5.f49393c).f2851b.D(1);
                    return;
                }
                return;
            }
            if (!(view instanceof eg.z)) {
                if (view instanceof t9) {
                    d1Var.f2640g0 = true;
                    d1Var.a0(true, true);
                    return;
                }
                return;
            }
            TL_stars.TL_starsGiveawayOption option = ((eg.z) view).getOption();
            if (option != null) {
                d1Var.f2645l0 = option.stars;
                d1Var.a0(true, true);
                d1Var.Z(true);
                d1Var.N();
                return;
            }
            return;
        }
        Context context = n2Var.getContext();
        long j10 = d1Var.f2642i0;
        s0 s0Var = new s0(d1Var);
        c6 c6Var = d1Var.resourcesProvider;
        w4 w4Var = new w4(c6Var);
        z2 z2Var = new z2(context, c6Var);
        z2Var.a();
        fc0 fc0Var = new fc0(context, c6Var);
        int i16 = w4Var.f34103a;
        fc0Var.setTextColor(i16);
        fc0Var.setTextOffset(AndroidUtilities.dp(10.0f));
        fc0Var.setItemCount(5);
        n nVar = new n(context, c6Var);
        nVar.setWrapSelectorWheel(true);
        nVar.setAllItemsCount(24);
        nVar.setItemCount(5);
        nVar.setTextColor(i16);
        nVar.setTextOffset(-AndroidUtilities.dp(10.0f));
        nVar.setTag("HOUR");
        o oVar = new o(context, c6Var);
        oVar.setWrapSelectorWheel(true);
        oVar.setAllItemsCount(60);
        oVar.setItemCount(5);
        oVar.setTextColor(i16);
        oVar.setTextOffset(-AndroidUtilities.dp(34.0f));
        p pVar = new p(context, w4Var, fc0Var, nVar, oVar);
        pVar.setOrientation(1);
        FrameLayout frameLayout = new FrameLayout(context);
        pVar.addView(frameLayout, z5.t(-1, -2, 51, 22, 0, 0, 4));
        TextView textView = new TextView(context);
        textView.setText(LocaleController.getString("BoostingSelectDateTime", R.string.BoostingSelectDateTime));
        textView.setTextColor(i16);
        pa.m(20.0f, 1, textView);
        frameLayout.addView(textView, z5.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
        textView.setOnTouchListener(new kh.e(2));
        LinearLayout linearLayout = new LinearLayout(context);
        linearLayout.setOrientation(0);
        linearLayout.setWeightSum(1.0f);
        pVar.addView(linearLayout, z5.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
        long jCurrentTimeMillis = System.currentTimeMillis();
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(jCurrentTimeMillis);
        int i17 = calendar.get(1);
        q qVar = new q(context, 0);
        long j11 = MessagesController.getInstance(UserConfig.selectedAccount).giveawayPeriodMax * 1000;
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(j11);
        int i18 = calendar2.get(6);
        calendar2.setTimeInMillis(System.currentTimeMillis());
        calendar2.add(14, (int) j11);
        int i19 = calendar2.get(11);
        int i20 = calendar.get(12);
        linearLayout.addView(fc0Var, z5.l(0.5f, 0, 270));
        fc0Var.setMinValue(0);
        fc0Var.setMaxValue(i18 - 1);
        fc0Var.setWrapSelectorWheel(false);
        fc0Var.setTag("DAY");
        fc0Var.setFormatter(new d(jCurrentTimeMillis, calendar, i17, 0));
        e eVar = new e(pVar, nVar, oVar, i19, i20, fc0Var);
        fc0Var.setOnValueChangedListener(eVar);
        nVar.setMinValue(0);
        nVar.setMaxValue(23);
        linearLayout.addView(nVar, z5.l(0.2f, 0, 270));
        nVar.setFormatter(new a9.m(15));
        nVar.setOnValueChangedListener(eVar);
        oVar.setMinValue(0);
        oVar.setMaxValue(11);
        oVar.setValue(0);
        oVar.setFormatter(new a9.m(16));
        linearLayout.addView(oVar, z5.l(0.3f, 0, 270));
        oVar.setOnValueChangedListener(eVar);
        if (j10 > 0) {
            calendar.setTimeInMillis(System.currentTimeMillis());
            calendar.set(12, 0);
            calendar.set(13, 0);
            calendar.set(14, 0);
            calendar.set(11, 0);
            int timeInMillis = (int) ((j10 - calendar.getTimeInMillis()) / 86400000);
            calendar.setTimeInMillis(j10);
            oVar.setValue(calendar.get(12) / 5);
            nVar.setValue(calendar.get(11));
            fc0Var.setValue(timeInMillis);
            fc0Var.getValue();
            eVar.m(fc0Var, fc0Var.getValue());
            nVar.getValue();
            eVar.m(nVar, nVar.getValue());
        }
        qVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
        qVar.setGravity(17);
        qVar.setTextColor(w4Var.f34108g);
        qVar.setTextSize(1, 14.0f);
        qVar.setTypeface(AndroidUtilities.bold());
        qVar.setBackground(w5.e(new float[]{8.0f}, w4Var.h));
        qVar.setText(LocaleController.getString("BoostingConfirm", R.string.BoostingConfirm));
        pVar.addView(qVar, z5.t(-1, 48, 83, 16, 15, 16, 16));
        qVar.setOnClickListener(new f(calendar, fc0Var, nVar, oVar, s0Var, z2Var, 0));
        z2Var.b(pVar);
        e3 e3Var = z2Var.f23994a;
        e3Var.show();
        int i21 = w4Var.f34104b;
        e3Var.setBackgroundColor(i21);
        e3Var.fixNavigationBar(i21);
        AndroidUtilities.setLightStatusBar(e3Var, i0.b.f(i21) > 0.699999988079071d);
    }

    public static void R(d1 d1Var) {
        ag.y2 y2Var = new ag.y2(d1Var.f31855n, d1Var.currentAccount, null, d1Var.resourcesProvider);
        int i10 = 1;
        y2Var.setOnDismissListener(new w0(d1Var, i10));
        y2Var.setOnShowListener(new y0(d1Var, i10));
        y2Var.show();
    }

    public static void S(d1 d1Var) {
        ag.y2 y2Var = new ag.y2(d1Var.f31855n, d1Var.currentAccount, null, d1Var.resourcesProvider);
        int i10 = 0;
        y2Var.setOnDismissListener(new w0(d1Var, i10));
        y2Var.setOnShowListener(new y0(d1Var, i10));
        y2Var.show();
    }

    @Override
    public final void D(Canvas canvas, int i10) {
        this.f2647o0 = i10;
    }

    public final ArrayList T(long j10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOptionW = W(j10);
        if (tL_starsGiveawayOptionW != null) {
            for (int i10 = 0; i10 < tL_starsGiveawayOptionW.winners.size(); i10++) {
                TL_stars.TL_starsGiveawayWinnersOption tL_starsGiveawayWinnersOption = tL_starsGiveawayOptionW.winners.get(i10);
                if (!arrayList.contains(Integer.valueOf(tL_starsGiveawayWinnersOption.users))) {
                    arrayList.add(Integer.valueOf(tL_starsGiveawayWinnersOption.users));
                    arrayList2.add(Long.valueOf(tL_starsGiveawayWinnersOption.per_user_stars));
                }
            }
        }
        return arrayList2;
    }

    public final int U() {
        int i10 = this.f2637d0;
        int i11 = eg.e.f5401s;
        if (i10 == 2) {
            return ((Integer) this.U.get(this.f2643j0)).intValue();
        }
        List listX = X();
        int i12 = this.f2644k0;
        if (i12 < 0 || i12 >= listX.size()) {
            this.f2644k0 = 0;
        }
        if (this.f2644k0 >= listX.size()) {
            return 0;
        }
        return ((Integer) listX.get(this.f2644k0)).intValue();
    }

    public final int V() {
        int iU;
        int iG;
        int i10 = this.f2637d0;
        int i11 = eg.e.f5401s;
        if (i10 == 2) {
            iU = ((Integer) this.U.get(this.f2643j0)).intValue();
            iG = q0.g();
        } else {
            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOptionW = W(this.f2645l0);
            if (tL_starsGiveawayOptionW != null) {
                return tL_starsGiveawayOptionW.yearly_boosts;
            }
            iU = U();
            iG = q0.g();
        }
        return iG * iU;
    }

    public final TL_stars.TL_starsGiveawayOption W(long j10) {
        ArrayList arrayListV = u7.y(this.currentAccount, false).v();
        if (arrayListV == null) {
            return null;
        }
        for (int i10 = 0; i10 < arrayListV.size(); i10++) {
            TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayListV.get(i10);
            if (tL_starsGiveawayOption != null && tL_starsGiveawayOption.stars == j10) {
                return tL_starsGiveawayOption;
            }
        }
        return null;
    }

    public final List X() {
        int i10 = this.f2637d0;
        int i11 = eg.e.f5401s;
        if (i10 == 2) {
            return this.U;
        }
        ArrayList arrayList = new ArrayList();
        TL_stars.TL_starsGiveawayOption tL_starsGiveawayOptionW = W(this.f2645l0);
        if (tL_starsGiveawayOptionW != null) {
            for (int i12 = 0; i12 < tL_starsGiveawayOptionW.winners.size(); i12++) {
                TL_stars.TL_starsGiveawayWinnersOption tL_starsGiveawayWinnersOption = tL_starsGiveawayOptionW.winners.get(i12);
                if (!arrayList.contains(Integer.valueOf(tL_starsGiveawayWinnersOption.users))) {
                    arrayList.add(Integer.valueOf(tL_starsGiveawayWinnersOption.users));
                }
            }
        }
        return arrayList;
    }

    public final boolean Y() {
        return this.f2649q0 != null;
    }

    public final void Z(boolean z10) {
        boolean zY = Y();
        eg.a aVar = this.m0;
        if (zY) {
            TL_stories.PrepaidGiveaway prepaidGiveaway = this.f2649q0;
            if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                aVar.a(prepaidGiveaway.quantity, z10);
                return;
            } else {
                aVar.a(q0.g() * prepaidGiveaway.quantity, z10);
                return;
            }
        }
        int i10 = this.f2638e0;
        int i11 = eg.e.f5401s;
        if (i10 == 0) {
            aVar.a(V(), z10);
            return;
        }
        ArrayList arrayList = this.Z;
        int iG = q0.g() * arrayList.size();
        boolean z11 = arrayList.size() > 0;
        aVar.f5385e = true;
        lh.d dVar = aVar.f5382a;
        dVar.k();
        dVar.setShowZero(true);
        dVar.setEnabled(z11);
        dVar.c(iG, z10);
        dVar.g(LocaleController.getString(R.string.GiftPremium), z10, true);
        aVar.f5383b.setBackgroundColor(g6.v0(g6.f23124h5, aVar.f5384c));
    }

    public final void a0(boolean z10, boolean z11) {
        boolean z12;
        int i10;
        ?? r15;
        int i11;
        boolean z13;
        int i12;
        ?? r16;
        String strI;
        int iU;
        String pluralString;
        dg.b bVar;
        ?? r17;
        long jLongValue;
        ArrayList arrayList = this.T;
        ArrayList arrayList2 = new ArrayList(arrayList);
        arrayList.clear();
        int i13 = this.f2637d0;
        int i14 = eg.e.f5401s;
        boolean z14 = i13 == 3;
        dg.a aVar = new dg.a(0, false);
        aVar.f4926g = z14;
        arrayList.add(aVar);
        boolean zY = Y();
        ArrayList arrayList3 = this.Z;
        TL_stories.PrepaidGiveaway prepaidGiveaway = this.f2649q0;
        if (zY) {
            dg.a aVar2 = new dg.a(14, false);
            aVar2.f4925f = prepaidGiveaway;
            arrayList.add(aVar2);
        } else {
            int size = arrayList3.size();
            dg.a aVar3 = new dg.a(2, this.f2637d0 == 2);
            aVar3.f4930l = 2;
            aVar3.f4927i = size;
            aVar3.f4925f = null;
            arrayList.add(aVar3);
            int size2 = arrayList3.size();
            dg.a aVar4 = new dg.a(2, this.f2637d0 == 3);
            aVar4.f4930l = 3;
            aVar4.f4927i = size2;
            aVar4.f4925f = null;
            arrayList.add(aVar4);
        }
        arrayList.add(new dg.a(4, false));
        TLRPC.Chat chat = this.X;
        boolean zIsChannelAndNotMegaGroup = ChatObject.isChannelAndNotMegaGroup(chat);
        int i15 = this.f2637d0;
        ArrayList arrayList4 = this.f2634a0;
        ArrayList arrayList5 = this.Y;
        if (i15 != 3) {
            z12 = zIsChannelAndNotMegaGroup;
            if (this.f2638e0 == 0) {
                if (!Y()) {
                    String string = LocaleController.getString(R.string.BoostingQuantityPrizes);
                    int iV = V();
                    dg.a aVar5 = new dg.a(13, false);
                    aVar5.f4923c = string;
                    aVar5.f4927i = iV;
                    arrayList.add(aVar5);
                    int i16 = this.f2643j0;
                    dg.a aVar6 = new dg.a(5, false);
                    aVar6.f4929k = this.U;
                    aVar6.f4927i = i16;
                    arrayList.add(aVar6);
                    arrayList.add(dg.a.c(LocaleController.getString(R.string.BoostingChooseHowMany), false));
                }
                arrayList.add(dg.a.f(LocaleController.getString(R.string.BoostingChannelsGroupsIncludedGiveaway)));
                if (!Y()) {
                    arrayList.add(dg.a.b(chat, V(), false));
                } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                    arrayList.add(dg.a.b(chat, prepaidGiveaway.quantity, false));
                } else {
                    arrayList.add(dg.a.b(chat, q0.g() * prepaidGiveaway.quantity, false));
                }
                int size3 = arrayList5.size();
                int i17 = 0;
                while (i17 < size3) {
                    Object obj = arrayList5.get(i17);
                    i17++;
                    TLObject tLObject = (TLObject) obj;
                    if (tLObject instanceof TLRPC.Chat) {
                        arrayList.add(dg.a.b((TLRPC.Chat) tLObject, V(), true));
                    }
                    if (tLObject instanceof TLRPC.InputPeer) {
                        int iV2 = V();
                        dg.a aVar7 = new dg.a(9, false);
                        aVar7.d = (TLRPC.InputPeer) tLObject;
                        aVar7.f4924e = null;
                        aVar7.f4926g = true;
                        aVar7.f4927i = iV2;
                        arrayList.add(aVar7);
                    }
                }
                if (arrayList5.size() < q0.f()) {
                    r15 = 0;
                    arrayList.add(new dg.a(8, false));
                } else {
                    r15 = 0;
                }
                arrayList.add(dg.a.c(LocaleController.getString(R.string.BoostingChooseChannelsGroupsNeedToJoin), r15));
                arrayList.add(dg.a.f(LocaleController.getString(R.string.BoostingEligibleUsers)));
                int i18 = eg.x.f5455s;
                arrayList.add(dg.a.e(r15, this.f2639f0, true, arrayList4));
                arrayList.add(dg.a.e(1, this.f2639f0, r15, arrayList4));
                arrayList.add(dg.a.c(LocaleController.getString(z12 ? R.string.BoostingChooseLimitGiveaway : R.string.BoostingChooseLimitGiveawayGroups), r15));
            }
            if (!Y()) {
                arrayList.add(dg.a.f(LocaleController.getString(R.string.BoostingDurationOfPremium)));
                int i19 = this.f2638e0;
                int i20 = eg.e.f5401s;
                ArrayList arrayListB = q0.b(i19 == 0 ? U() : arrayList3.size(), this.f2635b0);
                int i21 = 0;
                while (i21 < arrayListB.size()) {
                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) arrayListB.get(i21);
                    int i22 = tL_premiumGiftCodeOption.months;
                    int i23 = this.f2638e0;
                    int i24 = eg.e.f5401s;
                    int iU2 = i23 == 0 ? U() : arrayList3.size();
                    long j10 = tL_premiumGiftCodeOption.amount;
                    int i25 = this.f2641h0;
                    String str = tL_premiumGiftCodeOption.currency;
                    boolean z15 = i21 != arrayListB.size() + (-1);
                    ArrayList arrayList6 = arrayListB;
                    dg.a aVar8 = new dg.a(12, i22 == i25);
                    aVar8.f4927i = i22;
                    aVar8.f4928j = iU2;
                    aVar8.h = j10;
                    aVar8.f4926g = z15;
                    aVar8.f4923c = str;
                    aVar8.f4931m = tL_premiumGiftCodeOption;
                    arrayList.add(aVar8);
                    i21++;
                    arrayListB = arrayList6;
                }
            }
            if (!Y()) {
                i10 = 3;
                arrayList.add(dg.a.c(AndroidUtilities.replaceSingleTag(LocaleController.getString(R.string.BoostingStoriesFeaturesAndTerms), g6.gc, 0, new r0(this, i10), this.resourcesProvider), true));
            }
            i11 = this.f2637d0;
            int i26 = eg.e.f5401s;
            if (i11 != i10 || this.f2638e0 == 0) {
                String string2 = LocaleController.getString(R.string.BoostingGiveawayAdditionalPrizes);
                boolean z16 = this.f2651s0;
                int i27 = eg.b0.H;
                dg.a aVar9 = new dg.a(15, z16);
                aVar9.f4923c = string2;
                aVar9.f4926g = z16;
                aVar9.f4930l = 1;
                arrayList.add(aVar9);
                if (this.f2651s0) {
                    if (Y()) {
                        iU = prepaidGiveaway.quantity;
                    } else {
                        iU = U();
                    }
                    z13 = false;
                    dg.a aVar10 = new dg.a(16, false);
                    aVar10.f4927i = iU;
                    arrayList.add(aVar10);
                    pluralString = LocaleController.formatPluralString("BoldMonths", this.f2641h0, new Object[0]);
                    if (this.f2637d0 == 3) {
                        if (this.f2650r0.isEmpty()) {
                            arrayList.add(dg.a.c(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingStarsGiveawayAdditionPrizeCountHint", (int) this.f2645l0, new Object[0])), false));
                        } else {
                            arrayList.add(dg.a.c(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingStarsGiveawayAdditionPrizeCountNameHint", (int) this.f2645l0, Integer.valueOf(iU), this.f2650r0)), false));
                        }
                    } else if (this.f2650r0.isEmpty()) {
                        arrayList.add(dg.a.c(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayAdditionPrizeCountHint", iU, pluralString)), false));
                    } else {
                        arrayList.add(dg.a.c(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayAdditionPrizeCountNameHint", iU, this.f2650r0, pluralString)), false));
                    }
                } else {
                    z13 = false;
                    if (this.f2637d0 == 3) {
                        i12 = R.string.BoostingStarsGiveawayAdditionPrizeHint;
                    } else {
                        i12 = R.string.BoostingGiveawayAdditionPrizeHint;
                    }
                    arrayList.add(dg.a.c(LocaleController.getString(i12), false));
                }
                arrayList.add(dg.a.f(LocaleController.getString(R.string.BoostingDateWhenGiveawayEnds)));
                long j11 = this.f2642i0;
                dg.a aVar11 = new dg.a(10, z13);
                aVar11.h = j11;
                arrayList.add(aVar11);
                if (this.f2637d0 != 3) {
                    r16 = 0;
                    r16 = 0;
                    if (Y()) {
                        arrayList.add(dg.a.c(LocaleController.formatPluralString(z12 ? "BoostingChooseRandom" : "BoostingChooseRandomGroup", prepaidGiveaway.quantity, new Object[0]), false));
                    } else {
                        arrayList.add(dg.a.c(LocaleController.formatPluralString(z12 ? "BoostingChooseRandom" : "BoostingChooseRandomGroup", U(), new Object[0]), false));
                    }
                } else if (Y()) {
                    r16 = 0;
                    arrayList.add(dg.a.c(LocaleController.formatPluralString(z12 ? "BoostingStarsChooseRandom" : "BoostingStarsChooseRandomGroup", prepaidGiveaway.quantity, LocaleController.formatPluralString("BoostingStarsChooseRandomStars", (int) this.f2645l0, new Object[0])), false));
                } else {
                    r16 = 0;
                    arrayList.add(dg.a.c(LocaleController.formatPluralString(z12 ? "BoostingStarsChooseRandom" : "BoostingStarsChooseRandomGroup", U(), LocaleController.formatPluralString("BoostingStarsChooseRandomStars", (int) this.f2645l0, new Object[0])), false));
                }
                String string3 = LocaleController.getString(R.string.BoostingGiveawayShowWinners);
                dg.a aVar12 = new dg.a(15, this.f2652t0);
                aVar12.f4923c = string3;
                aVar12.f4926g = r16;
                aVar12.f4930l = r16;
                arrayList.add(aVar12);
                if (Y()) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(LocaleController.getString(R.string.BoostingGiveawayShowWinnersHint));
                    if (this.f2637d0 != 3) {
                        strI = org.telegram.messenger.y1.i(R.string.BoostingStoriesFeaturesAndTerms, new StringBuilder("\n\n"));
                    } else {
                        strI = "";
                    }
                    sb2.append(strI);
                    arrayList.add(dg.a.c(AndroidUtilities.replaceSingleTag(sb2.toString(), g6.gc, 0, new r0(this, 4), this.resourcesProvider), true));
                } else {
                    arrayList.add(dg.a.c(LocaleController.getString(R.string.BoostingGiveawayShowWinnersHint), r16));
                }
            }
            bVar = this.f2636c0;
            if (bVar == null && z11) {
                if (z10) {
                    bVar.E(arrayList2, arrayList);
                } else {
                    bVar.l();
                }
            }
            return;
        }
        if (Y()) {
            z12 = zIsChannelAndNotMegaGroup;
            if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                this.f2645l0 = ((TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway).stars;
            }
        } else {
            String string4 = LocaleController.getString(R.string.BoostingStarsOptions);
            int iV3 = V();
            dg.a aVar13 = new dg.a(13, false);
            aVar13.f4923c = string4;
            aVar13.f4927i = iV3;
            arrayList.add(aVar13);
            ArrayList arrayListV = u7.y(this.currentAccount, false).v();
            ArrayList arrayList7 = new ArrayList();
            if (arrayListV != null) {
                int i28 = 0;
                while (i28 < arrayListV.size()) {
                    TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) arrayListV.get(i28);
                    boolean z17 = zIsChannelAndNotMegaGroup;
                    if (tL_starsGiveawayOption != null && !arrayList7.contains(Long.valueOf(tL_starsGiveawayOption.stars))) {
                        arrayList7.add(Long.valueOf(tL_starsGiveawayOption.stars));
                    }
                    i28++;
                    zIsChannelAndNotMegaGroup = z17;
                }
            }
            z12 = zIsChannelAndNotMegaGroup;
            int i29 = 0;
            for (int i30 = 0; i30 < arrayList7.size(); i30++) {
                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOptionW = W(((Long) arrayList7.get(i30)).longValue());
                if (!tL_starsGiveawayOptionW.missingStorePrice) {
                    if (this.f2645l0 == 0 && tL_starsGiveawayOptionW.isDefault) {
                        this.f2645l0 = tL_starsGiveawayOptionW.stars;
                    }
                    if (!tL_starsGiveawayOptionW.extended || this.f2640g0) {
                        i29++;
                        int i31 = this.f2640g0 ? i30 : i30 + 2;
                        long j12 = tL_starsGiveawayOptionW.stars;
                        ArrayList arrayListT = T(j12);
                        if (arrayListT.isEmpty()) {
                            float f10 = j12;
                            ArrayList arrayListT2 = T(this.f2645l0);
                            int i32 = this.f2644k0;
                            if (i32 < 0 || i32 >= arrayListT2.size()) {
                                this.f2644k0 = 0;
                            }
                            jLongValue = Math.round(f10 / (this.f2644k0 >= arrayListT2.size() ? 1L : ((Long) arrayListT2.get(this.f2644k0)).longValue()));
                        } else {
                            jLongValue = ((Long) arrayListT.get(Utilities.clamp(this.f2644k0, arrayListT.size() - 1, 0))).longValue();
                        }
                        arrayList.add(dg.a.d(tL_starsGiveawayOptionW, i31, jLongValue, this.f2645l0 == tL_starsGiveawayOptionW.stars, true));
                    }
                }
            }
            if (!this.f2640g0 && i29 < arrayList7.size()) {
                arrayList.add(new dg.a(18, false));
            }
            if (i29 <= 0) {
                arrayList.add(dg.a.d(null, 0, 1L, false, true));
                arrayList.add(dg.a.d(null, 1, 1L, false, true));
                arrayList.add(dg.a.d(null, 2, 1L, false, false));
            }
            aVar13.f4927i = V();
            arrayList.add(dg.a.c(LocaleController.getString(R.string.BoostingStarsOptionsInfo), false));
            List listX = X();
            int i33 = this.f2644k0;
            if (i33 < 0 || i33 >= listX.size()) {
                this.f2644k0 = 0;
            }
            if (listX.size() > 1) {
                arrayList.add(dg.a.f(LocaleController.getString(R.string.BoostingStarsQuantityPrizes)));
                List listX2 = X();
                int i34 = this.f2644k0;
                dg.a aVar14 = new dg.a(5, false);
                aVar14.f4929k = listX2;
                aVar14.f4927i = i34;
                arrayList.add(aVar14);
                arrayList.add(dg.a.c(LocaleController.getString(R.string.BoostingStarsQuantityPrizesInfo), false));
            }
        }
        arrayList.add(dg.a.f(LocaleController.getString(R.string.BoostingChannelsGroupsIncludedGiveaway)));
        if (!Y()) {
            arrayList.add(dg.a.b(chat, V(), false));
        } else if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
            arrayList.add(dg.a.b(chat, prepaidGiveaway.quantity, false));
        } else {
            arrayList.add(dg.a.b(chat, q0.g() * prepaidGiveaway.quantity, false));
        }
        int size4 = arrayList5.size();
        int i35 = 0;
        while (i35 < size4) {
            Object obj2 = arrayList5.get(i35);
            i35++;
            TLObject tLObject2 = (TLObject) obj2;
            if (tLObject2 instanceof TLRPC.Chat) {
                arrayList.add(dg.a.b((TLRPC.Chat) tLObject2, V(), true));
            }
            if (tLObject2 instanceof TLRPC.InputPeer) {
                int iV4 = V();
                dg.a aVar15 = new dg.a(9, false);
                aVar15.d = (TLRPC.InputPeer) tLObject2;
                aVar15.f4924e = null;
                aVar15.f4926g = true;
                aVar15.f4927i = iV4;
                arrayList.add(aVar15);
            }
        }
        if (arrayList5.size() < q0.f()) {
            r17 = 0;
            arrayList.add(new dg.a(8, false));
        } else {
            r17 = 0;
        }
        arrayList.add(dg.a.c(LocaleController.getString(R.string.BoostingChooseChannelsGroupsNeedToJoin), r17));
        arrayList.add(dg.a.f(LocaleController.getString(R.string.BoostingEligibleUsers)));
        int i36 = eg.x.f5455s;
        arrayList.add(dg.a.e(r17, this.f2639f0, true, arrayList4));
        arrayList.add(dg.a.e(1, this.f2639f0, r17, arrayList4));
        arrayList.add(dg.a.c(LocaleController.getString(z12 ? R.string.BoostingChooseLimitGiveaway : R.string.BoostingChooseLimitGiveawayGroups), r17));
        i10 = 3;
        i11 = this.f2637d0;
        int i210 = eg.e.f5401s;
        if (i11 != i10) {
            String string5 = LocaleController.getString(R.string.BoostingGiveawayAdditionalPrizes);
            boolean z18 = this.f2651s0;
            int i211 = eg.b0.H;
            dg.a aVar16 = new dg.a(15, z18);
            aVar16.f4923c = string5;
            aVar16.f4926g = z18;
            aVar16.f4930l = 1;
            arrayList.add(aVar16);
            if (this.f2651s0) {
                if (Y()) {
                    iU = prepaidGiveaway.quantity;
                } else {
                    iU = U();
                }
                z13 = false;
                dg.a aVar17 = new dg.a(16, false);
                aVar17.f4927i = iU;
                arrayList.add(aVar17);
                pluralString = LocaleController.formatPluralString("BoldMonths", this.f2641h0, new Object[0]);
                if (this.f2637d0 == 3) {
                    if (this.f2650r0.isEmpty()) {
                        arrayList.add(dg.a.c(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingStarsGiveawayAdditionPrizeCountHint", (int) this.f2645l0, new Object[0])), false));
                    } else {
                        arrayList.add(dg.a.c(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingStarsGiveawayAdditionPrizeCountNameHint", (int) this.f2645l0, Integer.valueOf(iU), this.f2650r0)), false));
                    }
                } else if (this.f2650r0.isEmpty()) {
                    arrayList.add(dg.a.c(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayAdditionPrizeCountHint", iU, pluralString)), false));
                } else {
                    arrayList.add(dg.a.c(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayAdditionPrizeCountNameHint", iU, this.f2650r0, pluralString)), false));
                }
            } else {
                z13 = false;
                if (this.f2637d0 == 3) {
                    i12 = R.string.BoostingStarsGiveawayAdditionPrizeHint;
                } else {
                    i12 = R.string.BoostingGiveawayAdditionPrizeHint;
                }
                arrayList.add(dg.a.c(LocaleController.getString(i12), false));
            }
            arrayList.add(dg.a.f(LocaleController.getString(R.string.BoostingDateWhenGiveawayEnds)));
            long j13 = this.f2642i0;
            dg.a aVar18 = new dg.a(10, z13);
            aVar18.h = j13;
            arrayList.add(aVar18);
            if (this.f2637d0 != 3) {
                r16 = 0;
                r16 = 0;
                if (Y()) {
                    arrayList.add(dg.a.c(LocaleController.formatPluralString(z12 ? "BoostingChooseRandom" : "BoostingChooseRandomGroup", U(), new Object[0]), false));
                } else {
                    arrayList.add(dg.a.c(LocaleController.formatPluralString(z12 ? "BoostingChooseRandom" : "BoostingChooseRandomGroup", prepaidGiveaway.quantity, new Object[0]), false));
                }
            } else if (Y()) {
                r16 = 0;
                arrayList.add(dg.a.c(LocaleController.formatPluralString(z12 ? "BoostingStarsChooseRandom" : "BoostingStarsChooseRandomGroup", U(), LocaleController.formatPluralString("BoostingStarsChooseRandomStars", (int) this.f2645l0, new Object[0])), false));
            } else {
                r16 = 0;
                arrayList.add(dg.a.c(LocaleController.formatPluralString(z12 ? "BoostingStarsChooseRandom" : "BoostingStarsChooseRandomGroup", prepaidGiveaway.quantity, LocaleController.formatPluralString("BoostingStarsChooseRandomStars", (int) this.f2645l0, new Object[0])), false));
            }
            String string6 = LocaleController.getString(R.string.BoostingGiveawayShowWinners);
            dg.a aVar19 = new dg.a(15, this.f2652t0);
            aVar19.f4923c = string6;
            aVar19.f4926g = r16;
            aVar19.f4930l = r16;
            arrayList.add(aVar19);
            if (Y()) {
                arrayList.add(dg.a.c(LocaleController.getString(R.string.BoostingGiveawayShowWinnersHint), r16));
            } else {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(LocaleController.getString(R.string.BoostingGiveawayShowWinnersHint));
                if (this.f2637d0 != 3) {
                    strI = org.telegram.messenger.y1.i(R.string.BoostingStoriesFeaturesAndTerms, new StringBuilder("\n\n"));
                } else {
                    strI = "";
                }
                sb3.append(strI);
                arrayList.add(dg.a.c(AndroidUtilities.replaceSingleTag(sb3.toString(), g6.gc, 0, new r0(this, 4), this.resourcesProvider), true));
            }
        } else {
            String string7 = LocaleController.getString(R.string.BoostingGiveawayAdditionalPrizes);
            boolean z19 = this.f2651s0;
            int i212 = eg.b0.H;
            dg.a aVar110 = new dg.a(15, z19);
            aVar110.f4923c = string7;
            aVar110.f4926g = z19;
            aVar110.f4930l = 1;
            arrayList.add(aVar110);
            if (this.f2651s0) {
                if (Y()) {
                    iU = prepaidGiveaway.quantity;
                } else {
                    iU = U();
                }
                z13 = false;
                dg.a aVar111 = new dg.a(16, false);
                aVar111.f4927i = iU;
                arrayList.add(aVar111);
                pluralString = LocaleController.formatPluralString("BoldMonths", this.f2641h0, new Object[0]);
                if (this.f2637d0 == 3) {
                    if (this.f2650r0.isEmpty()) {
                        arrayList.add(dg.a.c(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingStarsGiveawayAdditionPrizeCountHint", (int) this.f2645l0, new Object[0])), false));
                    } else {
                        arrayList.add(dg.a.c(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingStarsGiveawayAdditionPrizeCountNameHint", (int) this.f2645l0, Integer.valueOf(iU), this.f2650r0)), false));
                    }
                } else if (this.f2650r0.isEmpty()) {
                    arrayList.add(dg.a.c(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayAdditionPrizeCountHint", iU, pluralString)), false));
                } else {
                    arrayList.add(dg.a.c(AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingGiveawayAdditionPrizeCountNameHint", iU, this.f2650r0, pluralString)), false));
                }
            } else {
                z13 = false;
                if (this.f2637d0 == 3) {
                    i12 = R.string.BoostingStarsGiveawayAdditionPrizeHint;
                } else {
                    i12 = R.string.BoostingGiveawayAdditionPrizeHint;
                }
                arrayList.add(dg.a.c(LocaleController.getString(i12), false));
            }
            arrayList.add(dg.a.f(LocaleController.getString(R.string.BoostingDateWhenGiveawayEnds)));
            long j14 = this.f2642i0;
            dg.a aVar112 = new dg.a(10, z13);
            aVar112.h = j14;
            arrayList.add(aVar112);
            if (this.f2637d0 != 3) {
                r16 = 0;
                r16 = 0;
                if (Y()) {
                    arrayList.add(dg.a.c(LocaleController.formatPluralString(z12 ? "BoostingChooseRandom" : "BoostingChooseRandomGroup", U(), new Object[0]), false));
                } else {
                    arrayList.add(dg.a.c(LocaleController.formatPluralString(z12 ? "BoostingChooseRandom" : "BoostingChooseRandomGroup", prepaidGiveaway.quantity, new Object[0]), false));
                }
            } else if (Y()) {
                r16 = 0;
                arrayList.add(dg.a.c(LocaleController.formatPluralString(z12 ? "BoostingStarsChooseRandom" : "BoostingStarsChooseRandomGroup", U(), LocaleController.formatPluralString("BoostingStarsChooseRandomStars", (int) this.f2645l0, new Object[0])), false));
            } else {
                r16 = 0;
                arrayList.add(dg.a.c(LocaleController.formatPluralString(z12 ? "BoostingStarsChooseRandom" : "BoostingStarsChooseRandomGroup", prepaidGiveaway.quantity, LocaleController.formatPluralString("BoostingStarsChooseRandomStars", (int) this.f2645l0, new Object[0])), false));
            }
            String string8 = LocaleController.getString(R.string.BoostingGiveawayShowWinners);
            dg.a aVar113 = new dg.a(15, this.f2652t0);
            aVar113.f4923c = string8;
            aVar113.f4926g = r16;
            aVar113.f4930l = r16;
            arrayList.add(aVar113);
            if (Y()) {
                arrayList.add(dg.a.c(LocaleController.getString(R.string.BoostingGiveawayShowWinnersHint), r16));
            } else {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(LocaleController.getString(R.string.BoostingGiveawayShowWinnersHint));
                if (this.f2637d0 != 3) {
                    strI = org.telegram.messenger.y1.i(R.string.BoostingStoriesFeaturesAndTerms, new StringBuilder("\n\n"));
                } else {
                    strI = "";
                }
                sb4.append(strI);
                arrayList.add(dg.a.c(AndroidUtilities.replaceSingleTag(sb4.toString(), g6.gc, 0, new r0(this, 4), this.resourcesProvider), true));
            }
        }
        bVar = this.f2636c0;
        if (bVar == null) {
            return;
        }
        if (z10) {
            bVar.E(arrayList2, arrayList);
        } else {
            bVar.l();
        }
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        zk0 zk0Var;
        if (i10 == NotificationCenter.starGiveawayOptionsLoaded && (zk0Var = this.d) != null && zk0Var.C) {
            a0(true, true);
        }
    }

    @Override
    public final void dismiss() {
        s sVar = this.f2648p0;
        if (sVar != null) {
            sVar.run();
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starGiveawayOptionsLoaded);
    }

    @Override
    public final yk0 w(zk0 zk0Var) {
        dg.b bVar = new dg.b(this.resourcesProvider);
        this.f2636c0 = bVar;
        return bVar;
    }

    @Override
    public final CharSequence z() {
        int i10 = this.f2638e0;
        int i11 = eg.e.f5401s;
        return i10 == 1 ? LocaleController.getString(R.string.GiftPremium) : LocaleController.formatString("BoostingStartGiveaway", R.string.BoostingStartGiveaway, new Object[0]);
    }
}
