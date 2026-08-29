package eg;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import i7.f6;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import jh.p9;
import jh.s7;
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
import org.telegram.ui.ActionBar.a3;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.ActionBar.f3;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.w5;
import org.telegram.ui.Components.a5;
import org.telegram.ui.Components.il0;
import org.telegram.ui.Components.jl0;
import org.telegram.ui.Components.jr;
import org.telegram.ui.Components.oc0;
import org.telegram.ui.Components.qc0;
import org.telegram.ui.Components.xa;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.th;
public final class c1 extends xa implements NotificationCenter.NotificationCenterDelegate {
    public final ArrayList T;
    public final List U;
    public final List V;
    public final List W;
    public final TLRPC.Chat X;
    public final ArrayList Y;
    public final ArrayList Z;
    public final ArrayList f5935a0;
    public final ArrayList f5936b0;
    public fg.b f5937c0;
    public int f5938d0;
    public int f5939e0;
    public int f5940f0;
    public boolean f5941g0;
    public int f5942h0;
    public long f5943i0;
    public int f5944j0;
    public int f5945k0;
    public long f5946l0;
    public final gg.a m0;
    public ze.b f5947n0;
    public int f5948o0;
    public t f5949p0;
    public final TL_stories.PrepaidGiveaway f5950q0;
    public String f5951r0;
    public boolean f5952s0;
    public boolean f5953t0;
    public final r0 f5954u0;

    public c1(org.telegram.ui.ActionBar.o2 o2Var, long j10, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        super(o2Var, false);
        List asList;
        List asList2;
        this.T = new ArrayList();
        if (q0.h()) {
            asList = Arrays.asList(1, 3, 5, 7, 10, 25, 50);
        } else {
            asList = Arrays.asList(1, 3, 5, 7, 10, 25, 50, 100);
        }
        this.U = asList;
        if (q0.h()) {
            asList2 = Arrays.asList(1, 3, 5, 7, 10, 25, 50);
        } else {
            asList2 = Arrays.asList(1, 3, 5, 7, 10, 25, 50, 100);
        }
        this.V = asList2;
        this.W = Arrays.asList(750, 10000, 50000);
        this.Y = new ArrayList();
        this.Z = new ArrayList();
        this.f5935a0 = new ArrayList();
        this.f5936b0 = new ArrayList();
        int i10 = gg.e.f7296s;
        this.f5938d0 = 2;
        this.f5939e0 = 0;
        int i11 = gg.w.f7346s;
        this.f5940f0 = 0;
        this.f5942h0 = 12;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(new Date().getTime() + 259200000);
        calendar.set(14, 0);
        calendar.set(13, 0);
        int i12 = calendar.get(12);
        while (i12 % 5 != 0) {
            i12++;
        }
        calendar.set(12, i12);
        this.f5943i0 = calendar.getTimeInMillis();
        this.f5944j0 = 2;
        this.f5945k0 = 2;
        this.f5951r0 = "";
        this.f5953t0 = true;
        this.f5954u0 = new r0(this, 0);
        this.f5950q0 = prepaidGiveaway;
        this.v = 0.15f;
        setApplyTopPadding(false);
        setApplyBottomPadding(false);
        this.useBackgroundTopPadding = false;
        this.backgroundPaddingLeft = 0;
        M();
        ((ViewGroup.MarginLayoutParams) this.f34660e.getLayoutParams()).leftMargin = 0;
        ((ViewGroup.MarginLayoutParams) this.f34660e.getLayoutParams()).rightMargin = 0;
        if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
            int i13 = gg.e.f7296s;
            this.f5938d0 = 3;
        }
        f2.l lVar = new f2.l();
        lVar.n(350L);
        lVar.o(jr.h);
        lVar.C = false;
        lVar.f6463m = false;
        this.d.setItemAnimator(lVar);
        jl0 jl0Var = this.d;
        int i14 = this.backgroundPaddingLeft;
        jl0Var.setPadding(i14, 0, i14, AndroidUtilities.dp(68.0f));
        this.d.setOnScrollListener(new Object());
        this.d.setOnItemClickListener(new w0(0, this, o2Var));
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j10));
        this.X = chat;
        fg.b bVar = this.f5937c0;
        ArrayList arrayList = this.T;
        jl0 jl0Var2 = this.d;
        s0 s0Var = new s0(this);
        s0 s0Var2 = new s0(this);
        s0 s0Var3 = new s0(this);
        bVar.f6727e = arrayList;
        bVar.v = chat;
        bVar.f6728f = jl0Var2;
        bVar.h = s0Var;
        bVar.f6729n = s0Var2;
        bVar.f6731s = s0Var3;
        a0(false, false);
        gg.a aVar = new gg.a(getContext(), this.resourcesProvider);
        this.m0 = aVar;
        aVar.setOnClickListener(new a1(this, prepaidGiveaway, j10, o2Var));
        Z(false);
        this.containerView.addView(aVar, f6.d(-1, 68.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        q0.j(this.currentAccount, chat, new u0(this, 5));
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starGiveawayOptionsLoaded);
    }

    public static void P(c1 c1Var, TL_stories.PrepaidGiveaway prepaidGiveaway, long j10, org.telegram.ui.ActionBar.o2 o2Var) {
        boolean z10;
        String str;
        int i10;
        boolean z11;
        String str2;
        TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway;
        long j11;
        ArrayList arrayList = c1Var.f5935a0;
        ArrayList arrayList2 = c1Var.Y;
        TLRPC.Chat chat = c1Var.X;
        ArrayList arrayList3 = c1Var.Z;
        ArrayList arrayList4 = c1Var.f5936b0;
        gg.a aVar = c1Var.m0;
        if (!aVar.f7276a.J) {
            if (c1Var.Y()) {
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
                t0 t0Var = new t0(c1Var, prepaidGiveaway, tL_prepaidStarsGiveaway, j10, j11, 0);
                org.telegram.ui.ActionBar.o2 R = LaunchActivity.R();
                if (R != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(R.getContext(), 0, R.getResourceProvider());
                    String string = LocaleController.getString(R.string.BoostingStartGiveawayConfirmTitle);
                    org.telegram.ui.ActionBar.c2 c2Var = alertDialog$Builder.f22714a;
                    c2Var.N = string;
                    c2Var.P = AndroidUtilities.replaceTags(LocaleController.getString(R.string.BoostingStartGiveawayConfirmText));
                    alertDialog$Builder.k(LocaleController.getString(R.string.Start), new a1.c(t0Var, 29));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new c(3));
                    alertDialog$Builder.o();
                    return;
                }
                return;
            }
            int i11 = c1Var.f5938d0;
            int i12 = gg.e.f7296s;
            String str3 = "inapp";
            if (i11 == 3) {
                Activity findActivity = AndroidUtilities.findActivity(c1Var.getContext());
                if (findActivity == null) {
                    findActivity = LaunchActivity.C1;
                }
                if (findActivity != null && !findActivity.isFinishing()) {
                    TL_stars.TL_starsGiveawayOption W = c1Var.W(c1Var.f5946l0);
                    int U = c1Var.U();
                    if (W != null) {
                        aVar.f7276a.setLoading(true);
                        int i13 = c1Var.f5940f0;
                        int i14 = gg.w.f7346s;
                        if (i13 == 1) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        s7 y8 = s7.y(c1Var.currentAccount, false);
                        int l10 = q0.l(c1Var.f5943i0);
                        boolean z12 = c1Var.f5953t0;
                        boolean z13 = c1Var.f5952s0;
                        String str4 = c1Var.f5951r0;
                        bh.v vVar = new bh.v(1, c1Var, W);
                        int i15 = y8.f12787a;
                        if (!MessagesController.getInstance(i15).starsPurchaseAvailable()) {
                            org.telegram.ui.ActionBar.o2 R2 = LaunchActivity.R();
                            if (R2 != null && R2.getContext() != null) {
                                s7.e0(R2.getContext(), R2.getResourceProvider());
                                return;
                            } else {
                                s7.e0(findActivity, null);
                                return;
                            }
                        }
                        TLRPC.TL_inputStorePaymentStarsGiveaway tL_inputStorePaymentStarsGiveaway = new TLRPC.TL_inputStorePaymentStarsGiveaway();
                        tL_inputStorePaymentStarsGiveaway.only_new_subscribers = z11;
                        tL_inputStorePaymentStarsGiveaway.winners_are_visible = z12;
                        Activity activity = findActivity;
                        tL_inputStorePaymentStarsGiveaway.stars = W.stars;
                        MessagesController.getInstance(i15);
                        tL_inputStorePaymentStarsGiveaway.boost_peer = MessagesController.getInputPeer(chat);
                        if (arrayList2 != null && !arrayList2.isEmpty()) {
                            tL_inputStorePaymentStarsGiveaway.flags |= 2;
                            int size = arrayList2.size();
                            int i16 = 0;
                            while (i16 < size) {
                                Object obj = arrayList2.get(i16);
                                i16++;
                                ArrayList<TLRPC.InputPeer> arrayList5 = tL_inputStorePaymentStarsGiveaway.additional_peers;
                                MessagesController.getInstance(i15);
                                arrayList5.add(MessagesController.getInputPeer((TLObject) obj));
                            }
                        }
                        int size2 = arrayList.size();
                        int i17 = 0;
                        while (i17 < size2) {
                            Object obj2 = arrayList.get(i17);
                            i17++;
                            tL_inputStorePaymentStarsGiveaway.countries_iso2.add(((TLRPC.TL_help_country) ((TLObject) obj2)).iso2);
                        }
                        if (!tL_inputStorePaymentStarsGiveaway.countries_iso2.isEmpty()) {
                            tL_inputStorePaymentStarsGiveaway.flags |= 4;
                        }
                        if (z13) {
                            tL_inputStorePaymentStarsGiveaway.flags |= 16;
                            tL_inputStorePaymentStarsGiveaway.prize_description = str4;
                        }
                        tL_inputStorePaymentStarsGiveaway.random_id = SendMessagesHelper.getInstance(i15).getNextRandomId();
                        tL_inputStorePaymentStarsGiveaway.until_date = l10;
                        tL_inputStorePaymentStarsGiveaway.currency = W.currency;
                        tL_inputStorePaymentStarsGiveaway.amount = W.amount;
                        tL_inputStorePaymentStarsGiveaway.users = U;
                        if (!BuildVars.useInvoiceBilling() && BillingController.getInstance().isReady() && (str2 = W.store_product) != null) {
                            d9.c cVar = new d9.c();
                            cVar.f5537c = "inapp";
                            cVar.f5536b = str2;
                            BillingController.getInstance().queryProductDetails(Arrays.asList(cVar.a()), new a1.d(y8, vVar, tL_inputStorePaymentStarsGiveaway, activity, 3));
                            return;
                        }
                        TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars = new TLRPC.TL_inputInvoiceStars();
                        tL_inputInvoiceStars.purpose = tL_inputStorePaymentStarsGiveaway;
                        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                        JSONObject p10 = ph.p2.p(s7.I(), false);
                        if (p10 != null) {
                            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                            tL_dataJSON.data = p10.toString();
                            tL_payments_getPaymentForm.flags |= 1;
                        }
                        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStars;
                        ConnectionsManager.getInstance(i15).sendRequest(tL_payments_getPaymentForm, new z(y8, vVar, tL_inputInvoiceStars, 10));
                    }
                }
            } else if (c1Var.f5939e0 == 1) {
                ArrayList b10 = q0.b(arrayList3.size(), arrayList4);
                for (int i18 = 0; i18 < b10.size(); i18++) {
                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) b10.get(i18);
                    if (tL_premiumGiftCodeOption.months == c1Var.f5942h0 && arrayList3.size() > 0) {
                        if (q0.h()) {
                            Context context = c1Var.getContext();
                            c6 c6Var = c1Var.resourcesProvider;
                            if (tL_premiumGiftCodeOption.store_product == null) {
                                ArrayList arrayList6 = new ArrayList();
                                int size3 = arrayList4.size();
                                int i19 = 0;
                                while (i19 < size3) {
                                    Object obj3 = arrayList4.get(i19);
                                    i19++;
                                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption2 = (TLRPC.TL_premiumGiftCodeOption) obj3;
                                    if (tL_premiumGiftCodeOption2.months == tL_premiumGiftCodeOption.months && tL_premiumGiftCodeOption2.store_product != null) {
                                        arrayList6.add(Integer.valueOf(tL_premiumGiftCodeOption2.users));
                                    }
                                }
                                String join = TextUtils.join(", ", arrayList6);
                                int i20 = tL_premiumGiftCodeOption.users;
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context, 0, c6Var);
                                String string2 = LocaleController.getString("BoostingReduceQuantity", R.string.BoostingReduceQuantity);
                                org.telegram.ui.ActionBar.c2 c2Var2 = alertDialog$Builder2.f22714a;
                                c2Var2.N = string2;
                                c2Var2.P = AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingReduceUsersTextPlural", i20, join));
                                alertDialog$Builder2.k(LocaleController.getString("OK", R.string.OK), new c(0));
                                alertDialog$Builder2.o();
                                return;
                            }
                        }
                        aVar.b(true);
                        q0.k(arrayList3, tL_premiumGiftCodeOption, c1Var.X, null, o2Var, new u0(c1Var, 0), new u0(c1Var, 1));
                        return;
                    }
                }
            } else {
                ArrayList b11 = q0.b(c1Var.U(), arrayList4);
                int i21 = 0;
                while (i21 < b11.size()) {
                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption3 = (TLRPC.TL_premiumGiftCodeOption) b11.get(i21);
                    if (tL_premiumGiftCodeOption3.months == c1Var.f5942h0) {
                        if (q0.h()) {
                            List list = c1Var.U;
                            Context context2 = c1Var.getContext();
                            c6 c6Var2 = c1Var.resourcesProvider;
                            u0 u0Var = new u0(c1Var, 2);
                            if (tL_premiumGiftCodeOption3.store_product == null) {
                                ArrayList arrayList7 = new ArrayList();
                                int size4 = arrayList4.size();
                                int i22 = 0;
                                while (i22 < size4) {
                                    Object obj4 = arrayList4.get(i22);
                                    i22++;
                                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption4 = (TLRPC.TL_premiumGiftCodeOption) obj4;
                                    if (tL_premiumGiftCodeOption4.months == tL_premiumGiftCodeOption3.months && tL_premiumGiftCodeOption4.store_product != null && list.contains(Integer.valueOf(tL_premiumGiftCodeOption4.users))) {
                                        arrayList7.add(tL_premiumGiftCodeOption4);
                                    }
                                }
                                TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption5 = (TLRPC.TL_premiumGiftCodeOption) arrayList7.get(0);
                                int size5 = arrayList7.size();
                                int i23 = 0;
                                while (i23 < size5) {
                                    Object obj5 = arrayList7.get(i23);
                                    i23++;
                                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption6 = (TLRPC.TL_premiumGiftCodeOption) obj5;
                                    int i24 = tL_premiumGiftCodeOption3.users;
                                    int i25 = tL_premiumGiftCodeOption6.users;
                                    if (i24 > i25 && i25 > tL_premiumGiftCodeOption5.users) {
                                        tL_premiumGiftCodeOption5 = tL_premiumGiftCodeOption6;
                                    }
                                }
                                String formatPluralString = LocaleController.formatPluralString("GiftMonths", tL_premiumGiftCodeOption5.months, new Object[0]);
                                int i26 = tL_premiumGiftCodeOption3.users;
                                int i27 = tL_premiumGiftCodeOption5.users;
                                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(context2, 0, c6Var2);
                                String string3 = LocaleController.getString("BoostingReduceQuantity", R.string.BoostingReduceQuantity);
                                org.telegram.ui.ActionBar.c2 c2Var3 = alertDialog$Builder3.f22714a;
                                c2Var3.N = string3;
                                c2Var3.P = AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingReduceQuantityTextPlural", i26, formatPluralString, Integer.valueOf(i27)));
                                alertDialog$Builder3.k(LocaleController.getString("Reduce", R.string.Reduce), new a9.s(12, u0Var, tL_premiumGiftCodeOption5));
                                alertDialog$Builder3.h(LocaleController.getString("Cancel", R.string.Cancel), new c(0));
                                alertDialog$Builder3.o();
                                return;
                            }
                        }
                        int i28 = c1Var.f5940f0;
                        int i29 = gg.w.f7346s;
                        if (i28 == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        int l11 = q0.l(c1Var.f5943i0);
                        aVar.b(true);
                        boolean z14 = c1Var.f5953t0;
                        boolean z15 = c1Var.f5952s0;
                        String str5 = c1Var.f5951r0;
                        u0 u0Var2 = new u0(c1Var, 3);
                        String str6 = str3;
                        u0 u0Var3 = new u0(c1Var, 4);
                        if (!q0.h()) {
                            MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
                            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm2 = new TLRPC.TL_payments_getPaymentForm();
                            TLRPC.TL_inputInvoicePremiumGiftCode tL_inputInvoicePremiumGiftCode = new TLRPC.TL_inputInvoicePremiumGiftCode();
                            TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway = new TLRPC.TL_inputStorePaymentPremiumGiveaway();
                            tL_inputStorePaymentPremiumGiveaway.only_new_subscribers = z10;
                            tL_inputStorePaymentPremiumGiveaway.winners_are_visible = z14;
                            tL_inputStorePaymentPremiumGiveaway.prize_description = str5;
                            tL_inputStorePaymentPremiumGiveaway.until_date = l11;
                            int i30 = tL_inputStorePaymentPremiumGiveaway.flags;
                            tL_inputStorePaymentPremiumGiveaway.flags = i30 | 6;
                            if (z15) {
                                tL_inputStorePaymentPremiumGiveaway.flags = i30 | 22;
                            }
                            tL_inputStorePaymentPremiumGiveaway.random_id = System.currentTimeMillis();
                            tL_inputStorePaymentPremiumGiveaway.additional_peers = new ArrayList<>();
                            int size6 = arrayList2.size();
                            int i31 = 0;
                            while (i31 < size6) {
                                Object obj6 = arrayList2.get(i31);
                                int i32 = i31 + 1;
                                TLObject tLObject = (TLObject) obj6;
                                if (tLObject instanceof TLRPC.Chat) {
                                    i10 = i32;
                                    tL_inputStorePaymentPremiumGiveaway.additional_peers.add(messagesController.getInputPeer(-((TLRPC.Chat) tLObject).f22392id));
                                } else {
                                    i10 = i32;
                                }
                                i31 = i10;
                            }
                            tL_inputStorePaymentPremiumGiveaway.boost_peer = messagesController.getInputPeer(-chat.f22392id);
                            tL_inputStorePaymentPremiumGiveaway.boost_peer = messagesController.getInputPeer(-chat.f22392id);
                            tL_inputStorePaymentPremiumGiveaway.currency = tL_premiumGiftCodeOption3.currency;
                            tL_inputStorePaymentPremiumGiveaway.amount = tL_premiumGiftCodeOption3.amount;
                            int size7 = arrayList.size();
                            int i33 = 0;
                            while (i33 < size7) {
                                Object obj7 = arrayList.get(i33);
                                i33++;
                                tL_inputStorePaymentPremiumGiveaway.countries_iso2.add(((TLRPC.TL_help_country) ((TLObject) obj7)).iso2);
                            }
                            tL_inputInvoicePremiumGiftCode.purpose = tL_inputStorePaymentPremiumGiveaway;
                            tL_inputInvoicePremiumGiftCode.option = tL_premiumGiftCodeOption3;
                            JSONObject p11 = ph.p2.p(o2Var.getResourceProvider(), false);
                            if (p11 != null) {
                                TLRPC.TL_dataJSON tL_dataJSON2 = new TLRPC.TL_dataJSON();
                                tL_payments_getPaymentForm2.theme_params = tL_dataJSON2;
                                tL_dataJSON2.data = p11.toString();
                                tL_payments_getPaymentForm2.flags |= 1;
                            }
                            tL_payments_getPaymentForm2.invoice = tL_inputInvoicePremiumGiftCode;
                            connectionsManager.sendRequest(tL_payments_getPaymentForm2, new f0(u0Var3, messagesController, tL_inputInvoicePremiumGiftCode, o2Var, u0Var2, 0));
                            return;
                        }
                        MessagesController messagesController2 = MessagesController.getInstance(UserConfig.selectedAccount);
                        ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                        TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway2 = new TLRPC.TL_inputStorePaymentPremiumGiveaway();
                        tL_inputStorePaymentPremiumGiveaway2.only_new_subscribers = z10;
                        tL_inputStorePaymentPremiumGiveaway2.winners_are_visible = z14;
                        tL_inputStorePaymentPremiumGiveaway2.prize_description = str5;
                        tL_inputStorePaymentPremiumGiveaway2.until_date = l11;
                        int i34 = tL_inputStorePaymentPremiumGiveaway2.flags;
                        tL_inputStorePaymentPremiumGiveaway2.flags = i34 | 6;
                        if (z15) {
                            tL_inputStorePaymentPremiumGiveaway2.flags = i34 | 22;
                        }
                        tL_inputStorePaymentPremiumGiveaway2.random_id = System.currentTimeMillis();
                        tL_inputStorePaymentPremiumGiveaway2.additional_peers = new ArrayList<>();
                        int size8 = arrayList2.size();
                        int i35 = 0;
                        while (i35 < size8) {
                            Object obj8 = arrayList2.get(i35);
                            i35++;
                            TLObject tLObject2 = (TLObject) obj8;
                            if (tLObject2 instanceof TLRPC.Chat) {
                                str = str6;
                                tL_inputStorePaymentPremiumGiveaway2.additional_peers.add(messagesController2.getInputPeer(-((TLRPC.Chat) tLObject2).f22392id));
                            } else {
                                str = str6;
                            }
                            str6 = str;
                        }
                        String str7 = str6;
                        tL_inputStorePaymentPremiumGiveaway2.boost_peer = messagesController2.getInputPeer(-chat.f22392id);
                        int size9 = arrayList.size();
                        int i36 = 0;
                        while (i36 < size9) {
                            Object obj9 = arrayList.get(i36);
                            i36++;
                            tL_inputStorePaymentPremiumGiveaway2.countries_iso2.add(((TLRPC.TL_help_country) ((TLObject) obj9)).iso2);
                        }
                        d9.c cVar2 = new d9.c();
                        cVar2.f5537c = str7;
                        cVar2.f5536b = tL_premiumGiftCodeOption3.store_product;
                        BillingController.getInstance().queryProductDetails(Arrays.asList(cVar2.a()), new e0(tL_inputStorePaymentPremiumGiveaway2, tL_premiumGiftCodeOption3, connectionsManager2, u0Var3, u0Var2, o2Var, 1));
                        return;
                    }
                    i21++;
                    str3 = str3;
                }
            }
        }
    }

    public static void Q(c1 c1Var, org.telegram.ui.ActionBar.o2 o2Var, View view) {
        q qVar;
        boolean z10;
        ze.b bVar;
        boolean z11;
        ArrayList arrayList = c1Var.Z;
        r0 r0Var = c1Var.f5954u0;
        if (view instanceof gg.a0) {
            gg.a0 a0Var = (gg.a0) view;
            int type = a0Var.getType();
            boolean z12 = a0Var.f25083e.h;
            boolean z13 = !z12;
            a0Var.setChecked(z13);
            int i10 = gg.a0.H;
            if (type == 0) {
                c1Var.f5953t0 = z13;
                c1Var.a0(false, false);
            } else if (type == 1) {
                a0Var.setDivider(z13);
                c1Var.f5952s0 = z13;
                c1Var.a0(false, false);
                fg.b bVar2 = c1Var.f5937c0;
                int i11 = 0;
                while (true) {
                    if (i11 >= bVar2.f6727e.size()) {
                        break;
                    }
                    fg.a aVar = (fg.a) bVar2.f6727e.get(i11);
                    if (aVar.f50845a == 15) {
                        int i12 = aVar.f6725l;
                        int i13 = gg.a0.H;
                        if (i12 == 1) {
                            if (!z12) {
                                bVar2.o(i11 + 1);
                            } else {
                                bVar2.u(i11 + 1);
                            }
                        }
                    }
                    i11++;
                }
                c1Var.f5937c0.G();
                if (!c1Var.f5952s0) {
                    AndroidUtilities.runOnUIThread(r0Var, 250L);
                } else {
                    AndroidUtilities.cancelRunOnUIThread(r0Var);
                }
            }
        }
        if (view instanceof gg.d) {
            if (view instanceof gg.e) {
                int selectedType = ((gg.e) view).getSelectedType();
                int i14 = gg.e.f7296s;
                if (selectedType != 2 && selectedType != 3) {
                    if (selectedType == 1) {
                        ze.b bVar3 = c1Var.f5947n0;
                        if (bVar3 != null) {
                            ((g2) bVar3.f50824a).V(1, arrayList);
                            ((y) bVar3.f50825b).f6191b.D(1);
                        }
                    } else {
                        c1Var.f5939e0 = selectedType;
                        c1Var.a0(true, true);
                        c1Var.Z(true);
                        c1Var.M();
                    }
                } else if (selectedType == 2 && c1Var.f5938d0 == selectedType) {
                    ze.b bVar4 = c1Var.f5947n0;
                    if (bVar4 != null) {
                        ((g2) bVar4.f50824a).V(1, arrayList);
                        ((y) bVar4.f50825b).f6191b.D(1);
                        return;
                    }
                    return;
                } else {
                    c1Var.f5938d0 = selectedType;
                    c1Var.a0(true, true);
                    c1Var.Z(true);
                    c1Var.M();
                }
            } else {
                gg.d dVar = (gg.d) view;
                jl0 jl0Var = c1Var.d;
                if (dVar.b()) {
                    for (int i15 = 0; i15 < jl0Var.getChildCount(); i15++) {
                        View childAt = jl0Var.getChildAt(i15);
                        if (childAt.getClass().isInstance(dVar)) {
                            gg.d dVar2 = (gg.d) childAt;
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
        if (view instanceof gg.w) {
            int selectedType2 = ((gg.w) view).getSelectedType();
            if (c1Var.f5940f0 == selectedType2 && (bVar = c1Var.f5947n0) != null) {
                ((g2) bVar.f50824a).V(3, c1Var.f5935a0);
                ((y) bVar.f50825b).f6191b.D(1);
            }
            c1Var.f5940f0 = selectedType2;
            c1Var.a0(false, false);
        } else if (view instanceof gg.j) {
            c1Var.f5942h0 = ((TLRPC.TL_premiumGiftCodeOption) ((gg.j) view).getGifCode()).months;
            c1Var.a0(false, false);
            c1Var.f5937c0.G();
        } else if (view instanceof gg.i) {
            Context context = o2Var.getContext();
            long j10 = c1Var.f5943i0;
            s0 s0Var = new s0(c1Var);
            c6 c6Var = c1Var.resourcesProvider;
            a5 a5Var = new a5(c6Var);
            a3 a3Var = new a3(context, c6Var);
            a3Var.a();
            qc0 qc0Var = new qc0(context, c6Var);
            int i16 = a5Var.f26665a;
            qc0Var.setTextColor(i16);
            qc0Var.setTextOffset(AndroidUtilities.dp(10.0f));
            qc0Var.setItemCount(5);
            ?? qc0Var2 = new qc0(context, c6Var);
            qc0Var2.setWrapSelectorWheel(true);
            qc0Var2.setAllItemsCount(24);
            qc0Var2.setItemCount(5);
            qc0Var2.setTextColor(i16);
            qc0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
            qc0Var2.setTag("HOUR");
            ?? qc0Var3 = new qc0(context, c6Var);
            qc0Var3.setWrapSelectorWheel(true);
            qc0Var3.setAllItemsCount(60);
            qc0Var3.setItemCount(5);
            qc0Var3.setTextColor(i16);
            qc0Var3.setTextOffset(-AndroidUtilities.dp(34.0f));
            q qVar2 = new q(context, a5Var, qc0Var, (o) qc0Var2, (p) qc0Var3);
            qVar2.setOrientation(1);
            FrameLayout frameLayout = new FrameLayout(context);
            qVar2.addView(frameLayout, f6.t(-1, -2, 51, 22, 0, 0, 4));
            TextView textView = new TextView(context);
            textView.setText(LocaleController.getString("BoostingSelectDateTime", R.string.BoostingSelectDateTime));
            textView.setTextColor(i16);
            th.n(20.0f, 1, textView);
            frameLayout.addView(textView, f6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
            textView.setOnTouchListener(new mh.d(2));
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            linearLayout.setWeightSum(1.0f);
            qVar2.addView(linearLayout, f6.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
            long currentTimeMillis = System.currentTimeMillis();
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(currentTimeMillis);
            int i17 = calendar.get(1);
            r rVar = new r(context, 0);
            long j11 = MessagesController.getInstance(UserConfig.selectedAccount).giveawayPeriodMax * 1000;
            Calendar calendar2 = Calendar.getInstance();
            calendar2.setTimeInMillis(j11);
            int i18 = calendar2.get(6);
            calendar2.setTimeInMillis(System.currentTimeMillis());
            calendar2.add(14, (int) j11);
            int i19 = calendar2.get(11);
            int i20 = calendar.get(12);
            linearLayout.addView(qc0Var, f6.l(0.5f, 0, 270));
            qc0Var.setMinValue(0);
            qc0Var.setMaxValue(i18 - 1);
            qc0Var.setWrapSelectorWheel(false);
            qc0Var.setTag("DAY");
            qc0Var.setFormatter(new d(currentTimeMillis, calendar, i17, 0));
            oc0 eVar = new e(qVar2, (o) qc0Var2, (p) qc0Var3, i19, i20, qc0Var);
            qc0Var.setOnValueChangedListener(eVar);
            qc0Var2.setMinValue(0);
            qc0Var2.setMaxValue(23);
            linearLayout.addView((View) qc0Var2, f6.l(0.2f, 0, 270));
            qc0Var2.setFormatter(new c(1));
            qc0Var2.setOnValueChangedListener(eVar);
            qc0Var3.setMinValue(0);
            qc0Var3.setMaxValue(11);
            qc0Var3.setValue(0);
            qc0Var3.setFormatter(new c(2));
            linearLayout.addView((View) qc0Var3, f6.l(0.3f, 0, 270));
            qc0Var3.setOnValueChangedListener(eVar);
            if (j10 > 0) {
                qVar = qVar2;
                calendar.setTimeInMillis(System.currentTimeMillis());
                calendar.set(12, 0);
                calendar.set(13, 0);
                calendar.set(14, 0);
                calendar.set(11, 0);
                calendar.setTimeInMillis(j10);
                qc0Var3.setValue(calendar.get(12) / 5);
                qc0Var2.setValue(calendar.get(11));
                qc0Var.setValue((int) ((j10 - calendar.getTimeInMillis()) / 86400000));
                qc0Var.getValue();
                eVar.q(qc0Var, qc0Var.getValue());
                qc0Var2.getValue();
                eVar.q(qc0Var2, qc0Var2.getValue());
            } else {
                qVar = qVar2;
            }
            rVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
            rVar.setGravity(17);
            rVar.setTextColor(a5Var.f26670g);
            rVar.setTextSize(1, 14.0f);
            rVar.setTypeface(AndroidUtilities.bold());
            rVar.setBackground(w5.e(new float[]{8.0f}, a5Var.h));
            rVar.setText(LocaleController.getString("BoostingConfirm", R.string.BoostingConfirm));
            qVar.addView(rVar, f6.t(-1, 48, 83, 16, 15, 16, 16));
            rVar.setOnClickListener(new f(calendar, qc0Var, (Object) qc0Var2, (Object) qc0Var3, s0Var, a3Var, 0));
            a3Var.b(qVar);
            f3 f3Var = a3Var.f22729a;
            f3Var.show();
            int i21 = a5Var.f26666b;
            f3Var.setBackgroundColor(i21);
            f3Var.fixNavigationBar(i21);
            if (i0.a.f(i21) > 0.699999988079071d) {
                z10 = true;
            } else {
                z10 = false;
            }
            AndroidUtilities.setLightStatusBar(f3Var, z10);
        } else if (view instanceof gg.b) {
            ze.b bVar5 = c1Var.f5947n0;
            if (bVar5 != null) {
                ((g2) bVar5.f50824a).V(2, c1Var.Y);
                ((y) bVar5.f50825b).f6191b.D(1);
            }
        } else if (view instanceof gg.y) {
            TL_stars.TL_starsGiveawayOption option = ((gg.y) view).getOption();
            if (option != null) {
                c1Var.f5946l0 = option.stars;
                c1Var.a0(true, true);
                c1Var.Z(true);
                c1Var.M();
            }
        } else if (view instanceof p9) {
            c1Var.f5941g0 = true;
            c1Var.a0(true, true);
        }
    }

    public static void R(c1 c1Var) {
        cg.f2 f2Var = new cg.f2(c1Var.f34662n, c1Var.currentAccount, null, c1Var.resourcesProvider);
        f2Var.setOnDismissListener(new v0(c1Var, 1));
        f2Var.setOnShowListener(new x0(c1Var, 1));
        f2Var.show();
    }

    public static void S(c1 c1Var) {
        cg.f2 f2Var = new cg.f2(c1Var.f34662n, c1Var.currentAccount, null, c1Var.resourcesProvider);
        f2Var.setOnDismissListener(new v0(c1Var, 0));
        f2Var.setOnShowListener(new x0(c1Var, 0));
        f2Var.show();
    }

    @Override
    public final void C(Canvas canvas, int i10) {
        this.f5948o0 = i10;
    }

    public final ArrayList T(long j10) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        TL_stars.TL_starsGiveawayOption W = W(j10);
        if (W != null) {
            for (int i10 = 0; i10 < W.winners.size(); i10++) {
                TL_stars.TL_starsGiveawayWinnersOption tL_starsGiveawayWinnersOption = W.winners.get(i10);
                if (!arrayList.contains(Integer.valueOf(tL_starsGiveawayWinnersOption.users))) {
                    arrayList.add(Integer.valueOf(tL_starsGiveawayWinnersOption.users));
                    arrayList2.add(Long.valueOf(tL_starsGiveawayWinnersOption.per_user_stars));
                }
            }
        }
        return arrayList2;
    }

    public final int U() {
        int i10 = this.f5938d0;
        int i11 = gg.e.f7296s;
        if (i10 == 2) {
            return ((Integer) this.U.get(this.f5944j0)).intValue();
        }
        List X = X();
        int i12 = this.f5945k0;
        if (i12 < 0 || i12 >= X.size()) {
            this.f5945k0 = 0;
        }
        if (this.f5945k0 >= X.size()) {
            return 0;
        }
        return ((Integer) X.get(this.f5945k0)).intValue();
    }

    public final int V() {
        int U;
        int g10;
        int i10 = this.f5938d0;
        int i11 = gg.e.f7296s;
        if (i10 == 2) {
            U = ((Integer) this.U.get(this.f5944j0)).intValue();
            g10 = q0.g();
        } else {
            TL_stars.TL_starsGiveawayOption W = W(this.f5946l0);
            if (W != null) {
                return W.yearly_boosts;
            }
            U = U();
            g10 = q0.g();
        }
        return g10 * U;
    }

    public final TL_stars.TL_starsGiveawayOption W(long j10) {
        ArrayList v = s7.y(this.currentAccount, false).v();
        if (v != null) {
            for (int i10 = 0; i10 < v.size(); i10++) {
                TL_stars.TL_starsGiveawayOption tL_starsGiveawayOption = (TL_stars.TL_starsGiveawayOption) v.get(i10);
                if (tL_starsGiveawayOption != null && tL_starsGiveawayOption.stars == j10) {
                    return tL_starsGiveawayOption;
                }
            }
            return null;
        }
        return null;
    }

    public final List X() {
        int i10 = this.f5938d0;
        int i11 = gg.e.f7296s;
        if (i10 == 2) {
            return this.U;
        }
        ArrayList arrayList = new ArrayList();
        TL_stars.TL_starsGiveawayOption W = W(this.f5946l0);
        if (W != null) {
            for (int i12 = 0; i12 < W.winners.size(); i12++) {
                TL_stars.TL_starsGiveawayWinnersOption tL_starsGiveawayWinnersOption = W.winners.get(i12);
                if (!arrayList.contains(Integer.valueOf(tL_starsGiveawayWinnersOption.users))) {
                    arrayList.add(Integer.valueOf(tL_starsGiveawayWinnersOption.users));
                }
            }
        }
        return arrayList;
    }

    public final boolean Y() {
        if (this.f5950q0 != null) {
            return true;
        }
        return false;
    }

    public final void Z(boolean z10) {
        boolean z11;
        boolean Y = Y();
        gg.a aVar = this.m0;
        if (Y) {
            TL_stories.PrepaidGiveaway prepaidGiveaway = this.f5950q0;
            if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                aVar.a(prepaidGiveaway.quantity, z10);
                return;
            }
            aVar.a(q0.g() * prepaidGiveaway.quantity, z10);
            return;
        }
        int i10 = this.f5939e0;
        int i11 = gg.e.f7296s;
        if (i10 == 0) {
            aVar.a(V(), z10);
            return;
        }
        ArrayList arrayList = this.Z;
        int g10 = q0.g() * arrayList.size();
        if (arrayList.size() > 0) {
            z11 = true;
        } else {
            z11 = false;
        }
        aVar.f7279e = true;
        nh.d dVar = aVar.f7276a;
        dVar.k();
        dVar.setShowZero(true);
        dVar.setEnabled(z11);
        dVar.c(g10, z10);
        dVar.g(LocaleController.getString(R.string.GiftPremium), z10, true);
        aVar.f7277b.setBackgroundColor(g6.v0(g6.f23133h5, aVar.f7278c));
    }

    public final void a0(boolean r26, boolean r27) {
        throw new UnsupportedOperationException("Method not decompiled: eg.c1.a0(boolean, boolean):void");
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        jl0 jl0Var;
        if (i10 == NotificationCenter.starGiveawayOptionsLoaded && (jl0Var = this.d) != null && jl0Var.C) {
            a0(true, true);
        }
    }

    @Override
    public final void dismiss() {
        t tVar = this.f5949p0;
        if (tVar != null) {
            tVar.run();
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starGiveawayOptionsLoaded);
    }

    @Override
    public final il0 v(jl0 jl0Var) {
        fg.b bVar = new fg.b(this.resourcesProvider);
        this.f5937c0 = bVar;
        return bVar;
    }

    @Override
    public final CharSequence y() {
        int i10 = this.f5939e0;
        int i11 = gg.e.f7296s;
        if (i10 == 1) {
            return LocaleController.getString(R.string.GiftPremium);
        }
        return LocaleController.formatString("BoostingStartGiveaway", R.string.BoostingStartGiveaway, new Object[0]);
    }
}
