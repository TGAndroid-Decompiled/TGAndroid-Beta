package bg;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import g7.e6;
import gh.u9;
import gh.v7;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import org.json.JSONObject;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.LocaleController;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.NotificationCenter;
import org.telegram.messenger.R;
import org.telegram.messenger.SendMessagesHelper;
import org.telegram.messenger.UserConfig;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.ActionBar.v5;
import org.telegram.ui.Components.bc0;
import org.telegram.ui.Components.gr;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.vk0;
import org.telegram.ui.Components.w4;
import org.telegram.ui.Components.wk0;
import org.telegram.ui.Components.zb0;
import org.telegram.ui.LaunchActivity;
public final class h1 extends sa implements NotificationCenter.NotificationCenterDelegate {
    public final ArrayList T;
    public final List U;
    public final List V;
    public final List W;
    public final TLRPC.Chat X;
    public final ArrayList Y;
    public final ArrayList Z;
    public final ArrayList f1808a0;
    public final ArrayList f1809b0;
    public cg.b f1810c0;
    public int f1811d0;
    public int f1812e0;
    public int f1813f0;
    public boolean f1814g0;
    public int f1815h0;
    public long f1816i0;
    public int f1817j0;
    public int f1818k0;
    public long f1819l0;
    public final dg.a m0;
    public we.b f1820n0;
    public int f1821o0;
    public v f1822p0;
    public final TL_stories.PrepaidGiveaway f1823q0;
    public String f1824r0;
    public boolean f1825s0;
    public boolean f1826t0;
    public final v0 f1827u0;

    public h1(org.telegram.ui.ActionBar.o2 o2Var, long j10, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        super(o2Var, false);
        List asList;
        List asList2;
        this.T = new ArrayList();
        if (u0.h()) {
            asList = Arrays.asList(1, 3, 5, 7, 10, 25, 50);
        } else {
            asList = Arrays.asList(1, 3, 5, 7, 10, 25, 50, 100);
        }
        this.U = asList;
        if (u0.h()) {
            asList2 = Arrays.asList(1, 3, 5, 7, 10, 25, 50);
        } else {
            asList2 = Arrays.asList(1, 3, 5, 7, 10, 25, 50, 100);
        }
        this.V = asList2;
        this.W = Arrays.asList(750, 10000, 50000);
        this.Y = new ArrayList();
        this.Z = new ArrayList();
        this.f1808a0 = new ArrayList();
        this.f1809b0 = new ArrayList();
        int i9 = dg.e.f4507s;
        this.f1811d0 = 2;
        this.f1812e0 = 0;
        int i10 = dg.y.f4564s;
        this.f1813f0 = 0;
        this.f1815h0 = 12;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(new Date().getTime() + 259200000);
        calendar.set(14, 0);
        calendar.set(13, 0);
        int i11 = calendar.get(12);
        while (i11 % 5 != 0) {
            i11++;
        }
        calendar.set(12, i11);
        this.f1816i0 = calendar.getTimeInMillis();
        this.f1817j0 = 2;
        this.f1818k0 = 2;
        this.f1824r0 = "";
        this.f1826t0 = true;
        this.f1827u0 = new v0(this, 0);
        this.f1823q0 = prepaidGiveaway;
        this.v = 0.15f;
        setApplyTopPadding(false);
        setApplyBottomPadding(false);
        this.useBackgroundTopPadding = false;
        this.backgroundPaddingLeft = 0;
        M();
        ((ViewGroup.MarginLayoutParams) this.f32408e.getLayoutParams()).leftMargin = 0;
        ((ViewGroup.MarginLayoutParams) this.f32408e.getLayoutParams()).rightMargin = 0;
        if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
            int i12 = dg.e.f4507s;
            this.f1811d0 = 3;
        }
        f2.n nVar = new f2.n();
        nVar.n(350L);
        nVar.o(gr.h);
        nVar.C = false;
        nVar.f5532m = false;
        this.d.setItemAnimator(nVar);
        wk0 wk0Var = this.d;
        int i13 = this.backgroundPaddingLeft;
        wk0Var.setPadding(i13, 0, i13, AndroidUtilities.dp(68.0f));
        this.d.setOnScrollListener(new Object());
        this.d.setOnItemClickListener(new b1(0, this, o2Var));
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j10));
        this.X = chat;
        cg.b bVar = this.f1810c0;
        ArrayList arrayList = this.T;
        wk0 wk0Var2 = this.d;
        w0 w0Var = new w0(this);
        w0 w0Var2 = new w0(this);
        w0 w0Var3 = new w0(this);
        bVar.f2388e = arrayList;
        bVar.v = chat;
        bVar.f2389f = wk0Var2;
        bVar.h = w0Var;
        bVar.f2390n = w0Var2;
        bVar.f2392s = w0Var3;
        Z(false, false);
        dg.a aVar = new dg.a(getContext(), this.resourcesProvider);
        this.m0 = aVar;
        aVar.setOnClickListener(new f1(this, prepaidGiveaway, j10, o2Var));
        Y(false);
        this.containerView.addView(aVar, e6.d(-1, 68.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        u0.j(this.currentAccount, chat, new z0(this, 5));
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starGiveawayOptionsLoaded);
    }

    public static void O(h1 h1Var, TL_stories.PrepaidGiveaway prepaidGiveaway, long j10, org.telegram.ui.ActionBar.o2 o2Var) {
        boolean z10;
        int i9;
        boolean z11;
        String str;
        TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway;
        long j11;
        ArrayList arrayList = h1Var.f1808a0;
        ArrayList arrayList2 = h1Var.Y;
        TLRPC.Chat chat = h1Var.X;
        ArrayList arrayList3 = h1Var.Z;
        ArrayList arrayList4 = h1Var.f1809b0;
        dg.a aVar = h1Var.m0;
        if (!aVar.f4483a.J) {
            if (h1Var.X()) {
                if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                    tL_prepaidStarsGiveaway = (TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway;
                } else {
                    tL_prepaidStarsGiveaway = null;
                }
                if (tL_prepaidStarsGiveaway != null) {
                    j11 = tL_prepaidStarsGiveaway.stars;
                } else {
                    j11 = 0;
                }
                x0 x0Var = new x0(h1Var, prepaidGiveaway, tL_prepaidStarsGiveaway, j10, j11, 0);
                org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                if (R != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(R.getContext(), 0, R.getResourceProvider());
                    String string = LocaleController.getString(R.string.BoostingStartGiveawayConfirmTitle);
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22702a;
                    c2Var.N = string;
                    c2Var.P = AndroidUtilities.replaceTags(LocaleController.getString(R.string.BoostingStartGiveawayConfirmText));
                    alertDialog$Builder.k(LocaleController.getString(R.string.Start), new a1.c(x0Var, 4));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new a9.b(10));
                    alertDialog$Builder.o();
                    return;
                }
                return;
            }
            int i10 = h1Var.f1811d0;
            int i11 = dg.e.f4507s;
            if (i10 == 3) {
                Activity findActivity = AndroidUtilities.findActivity(h1Var.getContext());
                if (findActivity == null) {
                    findActivity = LaunchActivity.C1;
                }
                if (findActivity != null && !findActivity.isFinishing()) {
                    TL_stars.TL_starsGiveawayOption V = h1Var.V(h1Var.f1819l0);
                    int T = h1Var.T();
                    if (V != null) {
                        aVar.f4483a.setLoading(true);
                        int i12 = h1Var.f1813f0;
                        int i13 = dg.y.f4564s;
                        if (i12 == 1) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        v7 y10 = v7.y(h1Var.currentAccount, false);
                        int l10 = u0.l(h1Var.f1816i0);
                        boolean z12 = h1Var.f1826t0;
                        boolean z13 = h1Var.f1825s0;
                        String str2 = h1Var.f1824r0;
                        y0 y0Var = new y0(0, h1Var, V);
                        int i14 = y10.f9045a;
                        if (!MessagesController.getInstance(i14).starsPurchaseAvailable()) {
                            org.telegram.ui.ActionBar.o2 R2 = LaunchActivity.R();
                            if (R2 != null && R2.getContext() != null) {
                                v7.e0(R2.getContext(), R2.getResourceProvider());
                                return;
                            } else {
                                v7.e0(findActivity, null);
                                return;
                            }
                        }
                        TLRPC.TL_inputStorePaymentStarsGiveaway tL_inputStorePaymentStarsGiveaway = new TLRPC.TL_inputStorePaymentStarsGiveaway();
                        tL_inputStorePaymentStarsGiveaway.only_new_subscribers = z11;
                        tL_inputStorePaymentStarsGiveaway.winners_are_visible = z12;
                        Activity activity = findActivity;
                        tL_inputStorePaymentStarsGiveaway.stars = V.stars;
                        MessagesController.getInstance(i14);
                        tL_inputStorePaymentStarsGiveaway.boost_peer = MessagesController.getInputPeer(chat);
                        if (arrayList2 != null && !arrayList2.isEmpty()) {
                            tL_inputStorePaymentStarsGiveaway.flags |= 2;
                            int size = arrayList2.size();
                            int i15 = 0;
                            while (i15 < size) {
                                Object obj = arrayList2.get(i15);
                                i15++;
                                ArrayList<TLRPC.InputPeer> arrayList5 = tL_inputStorePaymentStarsGiveaway.additional_peers;
                                MessagesController.getInstance(i14);
                                arrayList5.add(MessagesController.getInputPeer((TLObject) obj));
                            }
                        }
                        int size2 = arrayList.size();
                        int i16 = 0;
                        while (i16 < size2) {
                            Object obj2 = arrayList.get(i16);
                            i16++;
                            tL_inputStorePaymentStarsGiveaway.countries_iso2.add(((TLRPC.TL_help_country) ((TLObject) obj2)).iso2);
                        }
                        if (!tL_inputStorePaymentStarsGiveaway.countries_iso2.isEmpty()) {
                            tL_inputStorePaymentStarsGiveaway.flags |= 4;
                        }
                        if (z13) {
                            tL_inputStorePaymentStarsGiveaway.flags |= 16;
                            tL_inputStorePaymentStarsGiveaway.prize_description = str2;
                        }
                        tL_inputStorePaymentStarsGiveaway.random_id = SendMessagesHelper.getInstance(i14).getNextRandomId();
                        tL_inputStorePaymentStarsGiveaway.until_date = l10;
                        tL_inputStorePaymentStarsGiveaway.currency = V.currency;
                        tL_inputStorePaymentStarsGiveaway.amount = V.amount;
                        tL_inputStorePaymentStarsGiveaway.users = T;
                        if (!BuildVars.useInvoiceBilling() && BillingController.getInstance().isReady() && (str = V.store_product) != null) {
                            b9.c cVar = new b9.c();
                            cVar.f1663c = "inapp";
                            cVar.f1662b = str;
                            BillingController.getInstance().queryProductDetails(Arrays.asList(cVar.a()), new a1.d(y10, y0Var, tL_inputStorePaymentStarsGiveaway, activity, 3));
                            return;
                        }
                        TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars = new TLRPC.TL_inputInvoiceStars();
                        tL_inputInvoiceStars.purpose = tL_inputStorePaymentStarsGiveaway;
                        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                        JSONObject p6 = mh.c3.p(v7.I(), false);
                        if (p6 != null) {
                            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                            tL_dataJSON.data = p6.toString();
                            tL_payments_getPaymentForm.flags |= 1;
                        }
                        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStars;
                        ConnectionsManager.getInstance(i14).sendRequest(tL_payments_getPaymentForm, new b0(y10, y0Var, tL_inputInvoiceStars, 10));
                    }
                }
            } else if (h1Var.f1812e0 == 1) {
                ArrayList b10 = u0.b(arrayList3.size(), arrayList4);
                for (int i17 = 0; i17 < b10.size(); i17++) {
                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) b10.get(i17);
                    if (tL_premiumGiftCodeOption.months == h1Var.f1815h0 && arrayList3.size() > 0) {
                        if (u0.h()) {
                            Context context = h1Var.getContext();
                            b6 b6Var = h1Var.resourcesProvider;
                            if (tL_premiumGiftCodeOption.store_product == null) {
                                ArrayList arrayList6 = new ArrayList();
                                int size3 = arrayList4.size();
                                int i18 = 0;
                                while (i18 < size3) {
                                    Object obj3 = arrayList4.get(i18);
                                    i18++;
                                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption2 = (TLRPC.TL_premiumGiftCodeOption) obj3;
                                    if (tL_premiumGiftCodeOption2.months == tL_premiumGiftCodeOption.months && tL_premiumGiftCodeOption2.store_product != null) {
                                        arrayList6.add(Integer.valueOf(tL_premiumGiftCodeOption2.users));
                                    }
                                }
                                String join = TextUtils.join(", ", arrayList6);
                                int i19 = tL_premiumGiftCodeOption.users;
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context, 0, b6Var);
                                String string2 = LocaleController.getString("BoostingReduceQuantity", R.string.BoostingReduceQuantity);
                                org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.f22702a;
                                c2Var2.N = string2;
                                c2Var2.P = AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingReduceUsersTextPlural", i19, join));
                                alertDialog$Builder2.k(LocaleController.getString("OK", R.string.OK), new a9.b(7));
                                alertDialog$Builder2.o();
                                return;
                            }
                        }
                        aVar.b(true);
                        u0.k(arrayList3, tL_premiumGiftCodeOption, h1Var.X, null, o2Var, new z0(h1Var, 0), new z0(h1Var, 1));
                        return;
                    }
                }
            } else {
                ArrayList b11 = u0.b(h1Var.T(), arrayList4);
                for (int i20 = 0; i20 < b11.size(); i20++) {
                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption3 = (TLRPC.TL_premiumGiftCodeOption) b11.get(i20);
                    if (tL_premiumGiftCodeOption3.months == h1Var.f1815h0) {
                        if (u0.h()) {
                            List list = h1Var.U;
                            Context context2 = h1Var.getContext();
                            b6 b6Var2 = h1Var.resourcesProvider;
                            z0 z0Var = new z0(h1Var, 2);
                            if (tL_premiumGiftCodeOption3.store_product == null) {
                                ArrayList arrayList7 = new ArrayList();
                                int size4 = arrayList4.size();
                                int i21 = 0;
                                while (i21 < size4) {
                                    Object obj4 = arrayList4.get(i21);
                                    i21++;
                                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption4 = (TLRPC.TL_premiumGiftCodeOption) obj4;
                                    if (tL_premiumGiftCodeOption4.months == tL_premiumGiftCodeOption3.months && tL_premiumGiftCodeOption4.store_product != null && list.contains(Integer.valueOf(tL_premiumGiftCodeOption4.users))) {
                                        arrayList7.add(tL_premiumGiftCodeOption4);
                                    }
                                }
                                TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption5 = (TLRPC.TL_premiumGiftCodeOption) arrayList7.get(0);
                                int size5 = arrayList7.size();
                                int i22 = 0;
                                while (i22 < size5) {
                                    Object obj5 = arrayList7.get(i22);
                                    i22++;
                                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption6 = (TLRPC.TL_premiumGiftCodeOption) obj5;
                                    int i23 = tL_premiumGiftCodeOption3.users;
                                    int i24 = tL_premiumGiftCodeOption6.users;
                                    if (i23 > i24 && i24 > tL_premiumGiftCodeOption5.users) {
                                        tL_premiumGiftCodeOption5 = tL_premiumGiftCodeOption6;
                                    }
                                }
                                String formatPluralString = LocaleController.formatPluralString("GiftMonths", tL_premiumGiftCodeOption5.months, new Object[0]);
                                int i25 = tL_premiumGiftCodeOption3.users;
                                int i26 = tL_premiumGiftCodeOption5.users;
                                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(context2, 0, b6Var2);
                                String string3 = LocaleController.getString("BoostingReduceQuantity", R.string.BoostingReduceQuantity);
                                org.telegram.ui.ActionBar.c2 c2Var3 = alertDialog$Builder3.f22702a;
                                c2Var3.N = string3;
                                c2Var3.P = AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingReduceQuantityTextPlural", i25, formatPluralString, Integer.valueOf(i26)));
                                alertDialog$Builder3.k(LocaleController.getString("Reduce", R.string.Reduce), new b5.d(3, z0Var, tL_premiumGiftCodeOption5));
                                alertDialog$Builder3.h(LocaleController.getString("Cancel", R.string.Cancel), new a9.b(7));
                                alertDialog$Builder3.o();
                                return;
                            }
                        }
                        int i27 = h1Var.f1813f0;
                        int i28 = dg.y.f4564s;
                        if (i27 == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        int l11 = u0.l(h1Var.f1816i0);
                        aVar.b(true);
                        boolean z14 = h1Var.f1826t0;
                        boolean z15 = h1Var.f1825s0;
                        String str3 = h1Var.f1824r0;
                        z0 z0Var2 = new z0(h1Var, 3);
                        z0 z0Var3 = new z0(h1Var, 4);
                        if (!u0.h()) {
                            MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
                            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm2 = new TLRPC.TL_payments_getPaymentForm();
                            TLRPC.TL_inputInvoicePremiumGiftCode tL_inputInvoicePremiumGiftCode = new TLRPC.TL_inputInvoicePremiumGiftCode();
                            TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway = new TLRPC.TL_inputStorePaymentPremiumGiveaway();
                            tL_inputStorePaymentPremiumGiveaway.only_new_subscribers = z10;
                            tL_inputStorePaymentPremiumGiveaway.winners_are_visible = z14;
                            tL_inputStorePaymentPremiumGiveaway.prize_description = str3;
                            tL_inputStorePaymentPremiumGiveaway.until_date = l11;
                            int i29 = tL_inputStorePaymentPremiumGiveaway.flags;
                            tL_inputStorePaymentPremiumGiveaway.flags = i29 | 6;
                            if (z15) {
                                tL_inputStorePaymentPremiumGiveaway.flags = i29 | 22;
                            }
                            tL_inputStorePaymentPremiumGiveaway.random_id = System.currentTimeMillis();
                            tL_inputStorePaymentPremiumGiveaway.additional_peers = new ArrayList<>();
                            int size6 = arrayList2.size();
                            int i30 = 0;
                            while (i30 < size6) {
                                Object obj6 = arrayList2.get(i30);
                                int i31 = i30 + 1;
                                TLObject tLObject = (TLObject) obj6;
                                if (tLObject instanceof TLRPC.Chat) {
                                    i9 = i31;
                                    tL_inputStorePaymentPremiumGiveaway.additional_peers.add(messagesController.getInputPeer(-((TLRPC.Chat) tLObject).f22380id));
                                } else {
                                    i9 = i31;
                                }
                                i30 = i9;
                            }
                            tL_inputStorePaymentPremiumGiveaway.boost_peer = messagesController.getInputPeer(-chat.f22380id);
                            tL_inputStorePaymentPremiumGiveaway.boost_peer = messagesController.getInputPeer(-chat.f22380id);
                            tL_inputStorePaymentPremiumGiveaway.currency = tL_premiumGiftCodeOption3.currency;
                            tL_inputStorePaymentPremiumGiveaway.amount = tL_premiumGiftCodeOption3.amount;
                            int size7 = arrayList.size();
                            int i32 = 0;
                            while (i32 < size7) {
                                Object obj7 = arrayList.get(i32);
                                i32++;
                                tL_inputStorePaymentPremiumGiveaway.countries_iso2.add(((TLRPC.TL_help_country) ((TLObject) obj7)).iso2);
                            }
                            tL_inputInvoicePremiumGiftCode.purpose = tL_inputStorePaymentPremiumGiveaway;
                            tL_inputInvoicePremiumGiftCode.option = tL_premiumGiftCodeOption3;
                            JSONObject p9 = mh.c3.p(o2Var.getResourceProvider(), false);
                            if (p9 != null) {
                                TLRPC.TL_dataJSON tL_dataJSON2 = new TLRPC.TL_dataJSON();
                                tL_payments_getPaymentForm2.theme_params = tL_dataJSON2;
                                tL_dataJSON2.data = p9.toString();
                                tL_payments_getPaymentForm2.flags |= 1;
                            }
                            tL_payments_getPaymentForm2.invoice = tL_inputInvoicePremiumGiftCode;
                            connectionsManager.sendRequest(tL_payments_getPaymentForm2, new h0(z0Var3, messagesController, tL_inputInvoicePremiumGiftCode, o2Var, z0Var2, 0));
                            return;
                        }
                        MessagesController messagesController2 = MessagesController.getInstance(UserConfig.selectedAccount);
                        ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                        TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway2 = new TLRPC.TL_inputStorePaymentPremiumGiveaway();
                        tL_inputStorePaymentPremiumGiveaway2.only_new_subscribers = z10;
                        tL_inputStorePaymentPremiumGiveaway2.winners_are_visible = z14;
                        tL_inputStorePaymentPremiumGiveaway2.prize_description = str3;
                        tL_inputStorePaymentPremiumGiveaway2.until_date = l11;
                        int i33 = tL_inputStorePaymentPremiumGiveaway2.flags;
                        tL_inputStorePaymentPremiumGiveaway2.flags = i33 | 6;
                        if (z15) {
                            tL_inputStorePaymentPremiumGiveaway2.flags = i33 | 22;
                        }
                        tL_inputStorePaymentPremiumGiveaway2.random_id = System.currentTimeMillis();
                        tL_inputStorePaymentPremiumGiveaway2.additional_peers = new ArrayList<>();
                        int size8 = arrayList2.size();
                        int i34 = 0;
                        while (i34 < size8) {
                            Object obj8 = arrayList2.get(i34);
                            i34++;
                            TLObject tLObject2 = (TLObject) obj8;
                            if (tLObject2 instanceof TLRPC.Chat) {
                                tL_inputStorePaymentPremiumGiveaway2.additional_peers.add(messagesController2.getInputPeer(-((TLRPC.Chat) tLObject2).f22380id));
                            }
                        }
                        tL_inputStorePaymentPremiumGiveaway2.boost_peer = messagesController2.getInputPeer(-chat.f22380id);
                        int size9 = arrayList.size();
                        int i35 = 0;
                        while (i35 < size9) {
                            Object obj9 = arrayList.get(i35);
                            i35++;
                            tL_inputStorePaymentPremiumGiveaway2.countries_iso2.add(((TLRPC.TL_help_country) ((TLObject) obj9)).iso2);
                        }
                        b9.c cVar2 = new b9.c();
                        cVar2.f1663c = "inapp";
                        cVar2.f1662b = tL_premiumGiftCodeOption3.store_product;
                        BillingController.getInstance().queryProductDetails(Arrays.asList(cVar2.a()), new g0(tL_inputStorePaymentPremiumGiveaway2, tL_premiumGiftCodeOption3, connectionsManager2, z0Var3, z0Var2, o2Var, 1));
                        return;
                    }
                }
            }
        }
    }

    public static void P(h1 h1Var, org.telegram.ui.ActionBar.o2 o2Var, View view) {
        w4 w4Var;
        boolean z10;
        we.b bVar;
        boolean z11;
        ArrayList arrayList = h1Var.Z;
        v0 v0Var = h1Var.f1827u0;
        if (view instanceof dg.c0) {
            dg.c0 c0Var = (dg.c0) view;
            int type = c0Var.getType();
            boolean z12 = c0Var.f25711e.h;
            boolean z13 = !z12;
            c0Var.setChecked(z13);
            int i9 = dg.c0.H;
            if (type == 0) {
                h1Var.f1826t0 = z13;
                h1Var.Z(false, false);
            } else if (type == 1) {
                c0Var.setDivider(z13);
                h1Var.f1825s0 = z13;
                h1Var.Z(false, false);
                cg.b bVar2 = h1Var.f1810c0;
                int i10 = 0;
                while (true) {
                    if (i10 >= bVar2.f2388e.size()) {
                        break;
                    }
                    cg.a aVar = (cg.a) bVar2.f2388e.get(i10);
                    if (aVar.f48814a == 15) {
                        int i11 = aVar.f2386l;
                        int i12 = dg.c0.H;
                        if (i11 == 1) {
                            if (!z12) {
                                bVar2.o(i10 + 1);
                            } else {
                                bVar2.u(i10 + 1);
                            }
                        }
                    }
                    i10++;
                }
                h1Var.f1810c0.G();
                if (!h1Var.f1825s0) {
                    AndroidUtilities.runOnUIThread(v0Var, 250L);
                } else {
                    AndroidUtilities.cancelRunOnUIThread(v0Var);
                }
            }
        }
        if (view instanceof dg.d) {
            if (view instanceof dg.e) {
                int selectedType = ((dg.e) view).getSelectedType();
                int i13 = dg.e.f4507s;
                if (selectedType != 2 && selectedType != 3) {
                    if (selectedType == 1) {
                        we.b bVar3 = h1Var.f1820n0;
                        if (bVar3 != null) {
                            ((q2) bVar3.f48793b).U(1, arrayList);
                            ((a0) bVar3.f48794c).f1691b.D(1);
                        }
                    } else {
                        h1Var.f1812e0 = selectedType;
                        h1Var.Z(true, true);
                        h1Var.Y(true);
                        h1Var.M();
                    }
                } else if (selectedType == 2 && h1Var.f1811d0 == selectedType) {
                    we.b bVar4 = h1Var.f1820n0;
                    if (bVar4 != null) {
                        ((q2) bVar4.f48793b).U(1, arrayList);
                        ((a0) bVar4.f48794c).f1691b.D(1);
                        return;
                    }
                    return;
                } else {
                    h1Var.f1811d0 = selectedType;
                    h1Var.Z(true, true);
                    h1Var.Y(true);
                    h1Var.M();
                }
            } else {
                dg.d dVar = (dg.d) view;
                wk0 wk0Var = h1Var.d;
                if (dVar.b()) {
                    for (int i14 = 0; i14 < wk0Var.getChildCount(); i14++) {
                        View childAt = wk0Var.getChildAt(i14);
                        if (childAt.getClass().isInstance(dVar)) {
                            dg.d dVar2 = (dg.d) childAt;
                            if (childAt == dVar) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            dVar2.c(z11, true);
                        }
                    }
                }
            }
        }
        if (view instanceof dg.y) {
            int selectedType2 = ((dg.y) view).getSelectedType();
            if (h1Var.f1813f0 == selectedType2 && (bVar = h1Var.f1820n0) != null) {
                ((q2) bVar.f48793b).U(3, h1Var.f1808a0);
                ((a0) bVar.f48794c).f1691b.D(1);
            }
            h1Var.f1813f0 = selectedType2;
            h1Var.Z(false, false);
        } else if (view instanceof dg.j) {
            h1Var.f1815h0 = ((TLRPC.TL_premiumGiftCodeOption) ((dg.j) view).getGifCode()).months;
            h1Var.Z(false, false);
            h1Var.f1810c0.G();
        } else if (view instanceof dg.i) {
            Context context = o2Var.getContext();
            long j10 = h1Var.f1816i0;
            w0 w0Var = new w0(h1Var);
            b6 b6Var = h1Var.resourcesProvider;
            w4 w4Var2 = new w4(b6Var);
            org.telegram.ui.ActionBar.a3 a3Var = new org.telegram.ui.ActionBar.a3(context, b6Var);
            a3Var.a();
            bc0 bc0Var = new bc0(context, b6Var);
            int i15 = w4Var2.f34092a;
            bc0Var.setTextColor(i15);
            bc0Var.setTextOffset(AndroidUtilities.dp(10.0f));
            bc0Var.setItemCount(5);
            ?? bc0Var2 = new bc0(context, b6Var);
            bc0Var2.setWrapSelectorWheel(true);
            bc0Var2.setAllItemsCount(24);
            bc0Var2.setItemCount(5);
            bc0Var2.setTextColor(i15);
            bc0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
            bc0Var2.setTag("HOUR");
            ?? bc0Var3 = new bc0(context, b6Var);
            bc0Var3.setWrapSelectorWheel(true);
            bc0Var3.setAllItemsCount(60);
            bc0Var3.setItemCount(5);
            bc0Var3.setTextColor(i15);
            bc0Var3.setTextOffset(-AndroidUtilities.dp(34.0f));
            s sVar = new s(context, w4Var2, bc0Var, (q) bc0Var2, (r) bc0Var3);
            sVar.setOrientation(1);
            FrameLayout frameLayout = new FrameLayout(context);
            sVar.addView(frameLayout, e6.t(-1, -2, 51, 22, 0, 0, 4));
            TextView textView = new TextView(context);
            textView.setText(LocaleController.getString("BoostingSelectDateTime", R.string.BoostingSelectDateTime));
            textView.setTextColor(i15);
            j3.r0.u(20.0f, 1, textView);
            frameLayout.addView(textView, e6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
            textView.setOnTouchListener(new jh.d(2));
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            linearLayout.setWeightSum(1.0f);
            sVar.addView(linearLayout, e6.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
            long currentTimeMillis = System.currentTimeMillis();
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(currentTimeMillis);
            int i16 = calendar.get(1);
            t tVar = new t(context, 0);
            long j11 = MessagesController.getInstance(UserConfig.selectedAccount).giveawayPeriodMax * 1000;
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTimeInMillis(j11);
            int i17 = calendar2.get(6);
            calendar2.setTimeInMillis(System.currentTimeMillis());
            calendar2.add(14, (int) j11);
            int i18 = calendar2.get(11);
            int i19 = calendar.get(12);
            linearLayout.addView(bc0Var, e6.l(0.5f, 0, 270));
            bc0Var.setMinValue(0);
            bc0Var.setMaxValue(i17 - 1);
            bc0Var.setWrapSelectorWheel(false);
            bc0Var.setTag("DAY");
            bc0Var.setFormatter(new f(currentTimeMillis, calendar, i16, 0));
            zb0 gVar = new g(sVar, (q) bc0Var2, (r) bc0Var3, i18, i19, bc0Var);
            bc0Var.setOnValueChangedListener(gVar);
            bc0Var2.setMinValue(0);
            bc0Var2.setMaxValue(23);
            linearLayout.addView((View) bc0Var2, e6.l(0.2f, 0, 270));
            bc0Var2.setFormatter(new a9.b(8));
            bc0Var2.setOnValueChangedListener(gVar);
            bc0Var3.setMinValue(0);
            bc0Var3.setMaxValue(11);
            bc0Var3.setValue(0);
            bc0Var3.setFormatter(new a9.b(9));
            linearLayout.addView((View) bc0Var3, e6.l(0.3f, 0, 270));
            bc0Var3.setOnValueChangedListener(gVar);
            if (j10 > 0) {
                w4Var = w4Var2;
                calendar.setTimeInMillis(System.currentTimeMillis());
                calendar.set(12, 0);
                calendar.set(13, 0);
                calendar.set(14, 0);
                calendar.set(11, 0);
                calendar.setTimeInMillis(j10);
                bc0Var3.setValue(calendar.get(12) / 5);
                bc0Var2.setValue(calendar.get(11));
                bc0Var.setValue((int) ((j10 - calendar.getTimeInMillis()) / 86400000));
                bc0Var.getValue();
                gVar.m(bc0Var, bc0Var.getValue());
                bc0Var2.getValue();
                gVar.m(bc0Var2, bc0Var2.getValue());
            } else {
                w4Var = w4Var2;
            }
            tVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
            tVar.setGravity(17);
            tVar.setTextColor(w4Var.f34097g);
            tVar.setTextSize(1, 14.0f);
            tVar.setTypeface(AndroidUtilities.bold());
            tVar.setBackground(v5.e(new float[]{8.0f}, w4Var.h));
            tVar.setText(LocaleController.getString("BoostingConfirm", R.string.BoostingConfirm));
            sVar.addView(tVar, e6.t(-1, 48, 83, 16, 15, 16, 16));
            tVar.setOnClickListener(new h(calendar, bc0Var, (Object) bc0Var2, (Object) bc0Var3, w0Var, a3Var, 0));
            a3Var.b(sVar);
            org.telegram.ui.ActionBar.f3 f3Var = a3Var.f22713a;
            f3Var.show();
            int i20 = w4Var.f34093b;
            f3Var.setBackgroundColor(i20);
            f3Var.fixNavigationBar(i20);
            if (i0.a.f(i20) > 0.699999988079071d) {
                z10 = true;
            } else {
                z10 = false;
            }
            AndroidUtilities.setLightStatusBar(f3Var, z10);
        } else if (view instanceof dg.b) {
            we.b bVar5 = h1Var.f1820n0;
            if (bVar5 != null) {
                ((q2) bVar5.f48793b).U(2, h1Var.Y);
                ((a0) bVar5.f48794c).f1691b.D(1);
            }
        } else if (view instanceof dg.a0) {
            TL_stars.TL_starsGiveawayOption option = ((dg.a0) view).getOption();
            if (option != null) {
                h1Var.f1819l0 = option.stars;
                h1Var.Z(true, true);
                h1Var.Y(true);
                h1Var.M();
            }
        } else if (view instanceof u9) {
            h1Var.f1814g0 = true;
            h1Var.Z(true, true);
        }
    }

    public static void Q(h1 h1Var) {
        zf.k1 k1Var = new zf.k1(h1Var.f32410n, h1Var.currentAccount, null, h1Var.resourcesProvider);
        k1Var.setOnDismissListener(new a1(h1Var, 1));
        k1Var.setOnShowListener(new c1(h1Var, 1));
        k1Var.show();
    }

    public static void R(h1 h1Var) {
        zf.k1 k1Var = new zf.k1(h1Var.f32410n, h1Var.currentAccount, null, h1Var.resourcesProvider);
        k1Var.setOnDismissListener(new a1(h1Var, 0));
        k1Var.setOnShowListener(new c1(h1Var, 0));
        k1Var.show();
    }

    @Override
    public final void C(Canvas canvas, int i9) {
        this.f1821o0 = i9;
    }

    public final ArrayList S(long j10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        TL_stars.TL_starsGiveawayOption V = V(j10);
        if (V != null) {
            for (int i9 = 0; i9 < V.winners.size(); i9++) {
                TL_stars.TL_starsGiveawayWinnersOption tL_starsGiveawayWinnersOption = V.winners.get(i9);
                if (!arrayList.contains(Integer.valueOf(tL_starsGiveawayWinnersOption.users))) {
                    arrayList.add(Integer.valueOf(tL_starsGiveawayWinnersOption.users));
                    arrayList2.add(Long.valueOf(tL_starsGiveawayWinnersOption.per_user_stars));
                }
            }
        }
        return arrayList2;
    }

    public final int T() {
        int i9 = this.f1811d0;
        int i10 = dg.e.f4507s;
        if (i9 == 2) {
            return ((Integer) this.U.get(this.f1817j0)).intValue();
        }
        List W = W();
        int i11 = this.f1818k0;
        if (i11 < 0 || i11 >= W.size()) {
            this.f1818k0 = 0;
        }
        if (this.f1818k0 >= W.size()) {
            return 0;
        }
        return ((Integer) W.get(this.f1818k0)).intValue();
    }

    public final int U() {
        int T;
        int g10;
        int i9 = this.f1811d0;
        int i10 = dg.e.f4507s;
        if (i9 == 2) {
            T = ((Integer) this.U.get(this.f1817j0)).intValue();
            g10 = u0.g();
        } else {
            TL_stars.TL_starsGiveawayOption V = V(this.f1819l0);
            if (V != null) {
                return V.yearly_boosts;
            }
            T = T();
            g10 = u0.g();
        }
        return g10 * T;
    }

    public final TL_stars.TL_starsGiveawayOption V(long j10) {
        ArrayList v = v7.y(this.currentAccount, false).v();
        if (v != null) {
            for (int i9 = 0; i9 < v.size(); i9++) {
                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) v.get(i9);
                if (tL_starsGiveawayOption != null && tL_starsGiveawayOption.stars == j10) {
                    return tL_starsGiveawayOption;
                }
            }
            return null;
        }
        return null;
    }

    public final List W() {
        int i9 = this.f1811d0;
        int i10 = dg.e.f4507s;
        if (i9 == 2) {
            return this.U;
        }
        ArrayList arrayList = new ArrayList();
        TL_stars.TL_starsGiveawayOption V = V(this.f1819l0);
        if (V != null) {
            for (int i11 = 0; i11 < V.winners.size(); i11++) {
                TL_stars.TL_starsGiveawayWinnersOption tL_starsGiveawayWinnersOption = V.winners.get(i11);
                if (!arrayList.contains(Integer.valueOf(tL_starsGiveawayWinnersOption.users))) {
                    arrayList.add(Integer.valueOf(tL_starsGiveawayWinnersOption.users));
                }
            }
        }
        return arrayList;
    }

    public final boolean X() {
        if (this.f1823q0 != null) {
            return true;
        }
        return false;
    }

    public final void Y(boolean z10) {
        boolean z11;
        boolean X = X();
        dg.a aVar = this.m0;
        if (X) {
            TL_stories.PrepaidGiveaway prepaidGiveaway = this.f1823q0;
            if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                aVar.a(prepaidGiveaway.quantity, z10);
                return;
            }
            aVar.a(u0.g() * prepaidGiveaway.quantity, z10);
            return;
        }
        int i9 = this.f1812e0;
        int i10 = dg.e.f4507s;
        if (i9 == 0) {
            aVar.a(U(), z10);
            return;
        }
        ArrayList arrayList = this.Z;
        int g10 = u0.g() * arrayList.size();
        if (arrayList.size() > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        aVar.f4486e = true;
        kh.d dVar = aVar.f4483a;
        dVar.k();
        dVar.setShowZero(true);
        dVar.setEnabled(z11);
        dVar.c(g10, z10);
        dVar.g(LocaleController.getString(R.string.GiftPremium), z10, true);
        aVar.f4484b.setBackgroundColor(f6.v0(f6.f23072h5, aVar.f4485c));
    }

    public final void Z(boolean r26, boolean r27) {
        throw new UnsupportedOperationException("Method not decompiled: bg.h1.Z(boolean, boolean):void");
    }

    @Override
    public final void didReceivedNotification(int i9, int i10, Object... objArr) {
        wk0 wk0Var;
        if (i9 == NotificationCenter.starGiveawayOptionsLoaded && (wk0Var = this.d) != null && wk0Var.C) {
            Z(true, true);
        }
    }

    @Override
    public final void dismiss() {
        v vVar = this.f1822p0;
        if (vVar != null) {
            vVar.run();
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starGiveawayOptionsLoaded);
    }

    @Override
    public final vk0 v(wk0 wk0Var) {
        cg.b bVar = new cg.b(this.resourcesProvider);
        this.f1810c0 = bVar;
        return bVar;
    }

    @Override
    public final CharSequence y() {
        int i9 = this.f1812e0;
        int i10 = dg.e.f4507s;
        if (i9 == 1) {
            return LocaleController.getString(R.string.GiftPremium);
        }
        return LocaleController.formatString("BoostingStartGiveaway", R.string.BoostingStartGiveaway, new Object[0]);
    }
}
