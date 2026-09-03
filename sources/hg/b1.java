package hg;

import android.app.Activity;
import android.content.Context;
import android.graphics.Canvas;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import k7.c6;
import mh.q9;
import mh.t7;
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
import org.telegram.ui.ActionBar.a6;
import org.telegram.ui.ActionBar.c3;
import org.telegram.ui.ActionBar.g6;
import org.telegram.ui.ActionBar.h3;
import org.telegram.ui.ActionBar.k6;
import org.telegram.ui.Components.pr;
import org.telegram.ui.Components.rl0;
import org.telegram.ui.Components.sa;
import org.telegram.ui.Components.sl0;
import org.telegram.ui.Components.wc0;
import org.telegram.ui.Components.x4;
import org.telegram.ui.Components.yc0;
import org.telegram.ui.LaunchActivity;
import org.telegram.ui.yh;
public final class b1 extends sa implements NotificationCenter.NotificationCenterDelegate {
    public final ArrayList U;
    public final List V;
    public final List W;
    public final List X;
    public final TLRPC.Chat Y;
    public final ArrayList Z;
    public final ArrayList f7402a0;
    public final ArrayList f7403b0;
    public final ArrayList f7404c0;
    public ig.b f7405d0;
    public int f7406e0;
    public int f7407f0;
    public int f7408g0;
    public boolean f7409h0;
    public int f7410i0;
    public long f7411j0;
    public int f7412k0;
    public int f7413l0;
    public long m0;
    public final jg.a f7414n0;
    public f7.b f7415o0;
    public int f7416p0;
    public s f7417q0;
    public final TL_stories.PrepaidGiveaway f7418r0;
    public String f7419s0;
    public boolean f7420t0;
    public boolean f7421u0;
    public final q0 f7422v0;

    public b1(org.telegram.ui.ActionBar.p2 p2Var, long j10, TL_stories.PrepaidGiveaway prepaidGiveaway) {
        super(p2Var, false);
        List asList;
        List asList2;
        this.U = new ArrayList();
        if (p0.h()) {
            asList = Arrays.asList(1, 3, 5, 7, 10, 25, 50);
        } else {
            asList = Arrays.asList(1, 3, 5, 7, 10, 25, 50, 100);
        }
        this.V = asList;
        if (p0.h()) {
            asList2 = Arrays.asList(1, 3, 5, 7, 10, 25, 50);
        } else {
            asList2 = Arrays.asList(1, 3, 5, 7, 10, 25, 50, 100);
        }
        this.W = asList2;
        this.X = Arrays.asList(750, 10000, 50000);
        this.Z = new ArrayList();
        this.f7402a0 = new ArrayList();
        this.f7403b0 = new ArrayList();
        this.f7404c0 = new ArrayList();
        int i10 = jg.e.f10026s;
        this.f7406e0 = 2;
        this.f7407f0 = 0;
        int i11 = jg.w.f10076s;
        this.f7408g0 = 0;
        this.f7410i0 = 12;
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeInMillis(new Date().getTime() + 259200000);
        calendar.set(14, 0);
        calendar.set(13, 0);
        int i12 = calendar.get(12);
        while (i12 % 5 != 0) {
            i12++;
        }
        calendar.set(12, i12);
        this.f7411j0 = calendar.getTimeInMillis();
        this.f7412k0 = 2;
        this.f7413l0 = 2;
        this.f7419s0 = "";
        this.f7421u0 = true;
        this.f7422v0 = new q0(this, 0);
        this.f7418r0 = prepaidGiveaway;
        this.v = 0.15f;
        setApplyTopPadding(false);
        setApplyBottomPadding(false);
        this.useBackgroundTopPadding = false;
        this.backgroundPaddingLeft = 0;
        N();
        ((ViewGroup.MarginLayoutParams) this.f31015e.getLayoutParams()).leftMargin = 0;
        ((ViewGroup.MarginLayoutParams) this.f31015e.getLayoutParams()).rightMargin = 0;
        if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
            int i13 = jg.e.f10026s;
            this.f7406e0 = 3;
        }
        f2.l lVar = new f2.l();
        lVar.n(350L);
        lVar.o(pr.h);
        lVar.C = false;
        lVar.f5910m = false;
        this.d.setItemAnimator(lVar);
        sl0 sl0Var = this.d;
        int i14 = this.backgroundPaddingLeft;
        sl0Var.setPadding(i14, 0, i14, AndroidUtilities.dp(68.0f));
        this.d.setOnScrollListener(new Object());
        this.d.setOnItemClickListener(new v0(0, this, p2Var));
        TLRPC.Chat chat = MessagesController.getInstance(this.currentAccount).getChat(Long.valueOf(-j10));
        this.Y = chat;
        ig.b bVar = this.f7405d0;
        ArrayList arrayList = this.U;
        sl0 sl0Var2 = this.d;
        r0 r0Var = new r0(this);
        r0 r0Var2 = new r0(this);
        r0 r0Var3 = new r0(this);
        bVar.f8069e = arrayList;
        bVar.v = chat;
        bVar.f8070f = sl0Var2;
        bVar.h = r0Var;
        bVar.f8071n = r0Var2;
        bVar.f8073s = r0Var3;
        a0(false, false);
        jg.a aVar = new jg.a(getContext(), this.resourcesProvider);
        this.f7414n0 = aVar;
        aVar.setOnClickListener(new z0(this, prepaidGiveaway, j10, p2Var));
        Z(false);
        this.containerView.addView(aVar, c6.d(-1, 68.0f, 80, 0.0f, 0.0f, 0.0f, 0.0f));
        p0.j(this.currentAccount, chat, new t0(this, 5));
        NotificationCenter.getInstance(this.currentAccount).addObserver(this, NotificationCenter.starGiveawayOptionsLoaded);
    }

    public static void P(b1 b1Var, TL_stories.PrepaidGiveaway prepaidGiveaway, long j10, org.telegram.ui.ActionBar.p2 p2Var) {
        boolean z4;
        int i10;
        boolean z10;
        String str;
        long j11;
        ArrayList arrayList = b1Var.f7403b0;
        ArrayList arrayList2 = b1Var.Z;
        TLRPC.Chat chat = b1Var.Y;
        ArrayList arrayList3 = b1Var.f7402a0;
        ArrayList arrayList4 = b1Var.f7404c0;
        jg.a aVar = b1Var.f7414n0;
        if (!aVar.f10006a.K) {
            TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway = null;
            if (b1Var.Y()) {
                if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                    tL_prepaidStarsGiveaway = (TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway;
                }
                TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway2 = tL_prepaidStarsGiveaway;
                if (tL_prepaidStarsGiveaway2 != null) {
                    j11 = tL_prepaidStarsGiveaway2.stars;
                } else {
                    j11 = 0;
                }
                s0 s0Var = new s0(b1Var, prepaidGiveaway, tL_prepaidStarsGiveaway2, j10, j11, 0);
                org.telegram.ui.ActionBar.p2 R = LaunchActivity.R();
                if (R != null) {
                    AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(R.getContext(), 0, R.getResourceProvider());
                    String string = LocaleController.getString(R.string.BoostingStartGiveawayConfirmTitle);
                    org.telegram.ui.ActionBar.d2 d2Var = alertDialog$Builder.f21168a;
                    d2Var.O = string;
                    d2Var.Q = AndroidUtilities.replaceTags(LocaleController.getString(R.string.BoostingStartGiveawayConfirmText));
                    alertDialog$Builder.k(LocaleController.getString(R.string.Start), new f(s0Var, 0));
                    alertDialog$Builder.h(LocaleController.getString(R.string.Cancel), new f5.u(12));
                    alertDialog$Builder.o();
                    return;
                }
                return;
            }
            int i11 = b1Var.f7406e0;
            int i12 = jg.e.f10026s;
            if (i11 == 3) {
                Activity findActivity = AndroidUtilities.findActivity(b1Var.getContext());
                if (findActivity == null) {
                    findActivity = LaunchActivity.D1;
                }
                if (findActivity != null && !findActivity.isFinishing()) {
                    TL_stars.TL_starsGiveawayOption W = b1Var.W(b1Var.m0);
                    int U = b1Var.U();
                    if (W != null) {
                        aVar.f10006a.setLoading(true);
                        int i13 = b1Var.f7408g0;
                        int i14 = jg.w.f10076s;
                        if (i13 == 1) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        t7 y10 = t7.y(b1Var.currentAccount, false);
                        int l10 = p0.l(b1Var.f7411j0);
                        boolean z11 = b1Var.f7421u0;
                        boolean z12 = b1Var.f7420t0;
                        String str2 = b1Var.f7419s0;
                        eh.w wVar = new eh.w(1, b1Var, W);
                        int i15 = y10.f14830a;
                        if (!MessagesController.getInstance(i15).starsPurchaseAvailable()) {
                            org.telegram.ui.ActionBar.p2 R2 = LaunchActivity.R();
                            if (R2 != null && R2.getContext() != null) {
                                t7.e0(R2.getContext(), R2.getResourceProvider());
                                return;
                            } else {
                                t7.e0(findActivity, null);
                                return;
                            }
                        }
                        TLRPC.TL_inputStorePaymentStarsGiveaway tL_inputStorePaymentStarsGiveaway = new TLRPC.TL_inputStorePaymentStarsGiveaway();
                        tL_inputStorePaymentStarsGiveaway.only_new_subscribers = z10;
                        tL_inputStorePaymentStarsGiveaway.winners_are_visible = z11;
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
                        if (z12) {
                            tL_inputStorePaymentStarsGiveaway.flags |= 16;
                            tL_inputStorePaymentStarsGiveaway.prize_description = str2;
                        }
                        tL_inputStorePaymentStarsGiveaway.random_id = SendMessagesHelper.getInstance(i15).getNextRandomId();
                        tL_inputStorePaymentStarsGiveaway.until_date = l10;
                        tL_inputStorePaymentStarsGiveaway.currency = W.currency;
                        tL_inputStorePaymentStarsGiveaway.amount = W.amount;
                        tL_inputStorePaymentStarsGiveaway.users = U;
                        if (!BuildVars.useInvoiceBilling() && BillingController.getInstance().isReady() && (str = W.store_product) != null) {
                            b6.h hVar = new b6.h();
                            hVar.f1729c = "inapp";
                            hVar.f1728b = str;
                            BillingController.getInstance().queryProductDetails(Arrays.asList(hVar.a()), new a1.d(y10, wVar, tL_inputStorePaymentStarsGiveaway, findActivity, 3));
                            return;
                        }
                        TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars = new TLRPC.TL_inputInvoiceStars();
                        tL_inputInvoiceStars.purpose = tL_inputStorePaymentStarsGiveaway;
                        TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                        JSONObject p10 = sh.p2.p(t7.I(), false);
                        if (p10 != null) {
                            TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                            tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                            tL_dataJSON.data = p10.toString();
                            tL_payments_getPaymentForm.flags |= 1;
                        }
                        tL_payments_getPaymentForm.invoice = tL_inputInvoiceStars;
                        ConnectionsManager.getInstance(i15).sendRequest(tL_payments_getPaymentForm, new y(y10, wVar, tL_inputInvoiceStars, 10));
                    }
                }
            } else if (b1Var.f7407f0 == 1) {
                ArrayList b10 = p0.b(arrayList3.size(), arrayList4);
                for (int i18 = 0; i18 < b10.size(); i18++) {
                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) b10.get(i18);
                    if (tL_premiumGiftCodeOption.months == b1Var.f7410i0 && arrayList3.size() > 0) {
                        if (p0.h()) {
                            Context context = b1Var.getContext();
                            g6 g6Var = b1Var.resourcesProvider;
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
                                AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(context, 0, g6Var);
                                String string2 = LocaleController.getString("BoostingReduceQuantity", R.string.BoostingReduceQuantity);
                                org.telegram.ui.ActionBar.d2 d2Var2 = alertDialog$Builder2.f21168a;
                                d2Var2.O = string2;
                                d2Var2.Q = AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingReduceUsersTextPlural", i20, join));
                                alertDialog$Builder2.k(LocaleController.getString("OK", R.string.OK), new f5.u(9));
                                alertDialog$Builder2.o();
                                return;
                            }
                        }
                        aVar.b(true);
                        p0.k(arrayList3, tL_premiumGiftCodeOption, b1Var.Y, null, p2Var, new t0(b1Var, 0), new t0(b1Var, 1));
                        return;
                    }
                }
            } else {
                ArrayList b11 = p0.b(b1Var.U(), arrayList4);
                for (int i21 = 0; i21 < b11.size(); i21++) {
                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption3 = (TLRPC.TL_premiumGiftCodeOption) b11.get(i21);
                    if (tL_premiumGiftCodeOption3.months == b1Var.f7410i0) {
                        if (p0.h()) {
                            List list = b1Var.V;
                            Context context2 = b1Var.getContext();
                            g6 g6Var2 = b1Var.resourcesProvider;
                            t0 t0Var = new t0(b1Var, 2);
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
                                AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(context2, 0, g6Var2);
                                String string3 = LocaleController.getString("BoostingReduceQuantity", R.string.BoostingReduceQuantity);
                                org.telegram.ui.ActionBar.d2 d2Var3 = alertDialog$Builder3.f21168a;
                                d2Var3.O = string3;
                                d2Var3.Q = AndroidUtilities.replaceTags(LocaleController.formatPluralString("BoostingReduceQuantityTextPlural", i26, formatPluralString, Integer.valueOf(i27)));
                                alertDialog$Builder3.k(LocaleController.getString("Reduce", R.string.Reduce), new c1.b(13, t0Var, tL_premiumGiftCodeOption5));
                                alertDialog$Builder3.h(LocaleController.getString("Cancel", R.string.Cancel), new f5.u(9));
                                alertDialog$Builder3.o();
                                return;
                            }
                        }
                        int i28 = b1Var.f7408g0;
                        int i29 = jg.w.f10076s;
                        if (i28 == 1) {
                            z4 = true;
                        } else {
                            z4 = false;
                        }
                        int l11 = p0.l(b1Var.f7411j0);
                        aVar.b(true);
                        boolean z13 = b1Var.f7421u0;
                        boolean z14 = b1Var.f7420t0;
                        String str3 = b1Var.f7419s0;
                        t0 t0Var2 = new t0(b1Var, 3);
                        t0 t0Var3 = new t0(b1Var, 4);
                        if (!p0.h()) {
                            MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
                            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm2 = new TLRPC.TL_payments_getPaymentForm();
                            TLRPC.TL_inputInvoicePremiumGiftCode tL_inputInvoicePremiumGiftCode = new TLRPC.TL_inputInvoicePremiumGiftCode();
                            TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway = new TLRPC.TL_inputStorePaymentPremiumGiveaway();
                            tL_inputStorePaymentPremiumGiveaway.only_new_subscribers = z4;
                            tL_inputStorePaymentPremiumGiveaway.winners_are_visible = z13;
                            tL_inputStorePaymentPremiumGiveaway.prize_description = str3;
                            tL_inputStorePaymentPremiumGiveaway.until_date = l11;
                            int i30 = tL_inputStorePaymentPremiumGiveaway.flags;
                            tL_inputStorePaymentPremiumGiveaway.flags = i30 | 6;
                            if (z14) {
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
                                    tL_inputStorePaymentPremiumGiveaway.additional_peers.add(messagesController.getInputPeer(-((TLRPC.Chat) tLObject).f20845id));
                                } else {
                                    i10 = i32;
                                }
                                i31 = i10;
                            }
                            tL_inputStorePaymentPremiumGiveaway.boost_peer = messagesController.getInputPeer(-chat.f20845id);
                            tL_inputStorePaymentPremiumGiveaway.boost_peer = messagesController.getInputPeer(-chat.f20845id);
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
                            JSONObject p11 = sh.p2.p(p2Var.getResourceProvider(), false);
                            if (p11 != null) {
                                TLRPC.TL_dataJSON tL_dataJSON2 = new TLRPC.TL_dataJSON();
                                tL_payments_getPaymentForm2.theme_params = tL_dataJSON2;
                                tL_dataJSON2.data = p11.toString();
                                tL_payments_getPaymentForm2.flags |= 1;
                            }
                            tL_payments_getPaymentForm2.invoice = tL_inputInvoicePremiumGiftCode;
                            connectionsManager.sendRequest(tL_payments_getPaymentForm2, new e0(t0Var3, messagesController, tL_inputInvoicePremiumGiftCode, p2Var, t0Var2, 0));
                            return;
                        }
                        MessagesController messagesController2 = MessagesController.getInstance(UserConfig.selectedAccount);
                        ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(UserConfig.selectedAccount);
                        TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway2 = new TLRPC.TL_inputStorePaymentPremiumGiveaway();
                        tL_inputStorePaymentPremiumGiveaway2.only_new_subscribers = z4;
                        tL_inputStorePaymentPremiumGiveaway2.winners_are_visible = z13;
                        tL_inputStorePaymentPremiumGiveaway2.prize_description = str3;
                        tL_inputStorePaymentPremiumGiveaway2.until_date = l11;
                        int i34 = tL_inputStorePaymentPremiumGiveaway2.flags;
                        tL_inputStorePaymentPremiumGiveaway2.flags = i34 | 6;
                        if (z14) {
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
                                tL_inputStorePaymentPremiumGiveaway2.additional_peers.add(messagesController2.getInputPeer(-((TLRPC.Chat) tLObject2).f20845id));
                            }
                        }
                        tL_inputStorePaymentPremiumGiveaway2.boost_peer = messagesController2.getInputPeer(-chat.f20845id);
                        int size9 = arrayList.size();
                        int i36 = 0;
                        while (i36 < size9) {
                            Object obj9 = arrayList.get(i36);
                            i36++;
                            tL_inputStorePaymentPremiumGiveaway2.countries_iso2.add(((TLRPC.TL_help_country) ((TLObject) obj9)).iso2);
                        }
                        b6.h hVar2 = new b6.h();
                        hVar2.f1729c = "inapp";
                        hVar2.f1728b = tL_premiumGiftCodeOption3.store_product;
                        BillingController.getInstance().queryProductDetails(Arrays.asList(hVar2.a()), new d0(tL_inputStorePaymentPremiumGiveaway2, tL_premiumGiftCodeOption3, connectionsManager2, t0Var3, t0Var2, p2Var, 1));
                        return;
                    }
                }
            }
        }
    }

    public static void Q(b1 b1Var, org.telegram.ui.ActionBar.p2 p2Var, View view) {
        boolean z4;
        f7.b bVar;
        boolean z10;
        ArrayList arrayList = b1Var.f7402a0;
        q0 q0Var = b1Var.f7422v0;
        if (view instanceof jg.a0) {
            jg.a0 a0Var = (jg.a0) view;
            int type = a0Var.getType();
            boolean z11 = a0Var.f23755e.h;
            boolean z12 = !z11;
            a0Var.setChecked(z12);
            int i10 = jg.a0.I;
            if (type == 0) {
                b1Var.f7421u0 = z12;
                b1Var.a0(false, false);
            } else if (type == 1) {
                a0Var.setDivider(z12);
                b1Var.f7420t0 = z12;
                b1Var.a0(false, false);
                ig.b bVar2 = b1Var.f7405d0;
                int i11 = 0;
                while (true) {
                    if (i11 >= bVar2.f8069e.size()) {
                        break;
                    }
                    ig.a aVar = (ig.a) bVar2.f8069e.get(i11);
                    if (aVar.f2505a == 15) {
                        int i12 = aVar.f8067l;
                        int i13 = jg.a0.I;
                        if (i12 == 1) {
                            if (!z11) {
                                bVar2.o(i11 + 1);
                            } else {
                                bVar2.u(i11 + 1);
                            }
                        }
                    }
                    i11++;
                }
                b1Var.f7405d0.G();
                if (!b1Var.f7420t0) {
                    AndroidUtilities.runOnUIThread(q0Var, 250L);
                } else {
                    AndroidUtilities.cancelRunOnUIThread(q0Var);
                }
            }
        }
        if (view instanceof jg.d) {
            if (view instanceof jg.e) {
                int selectedType = ((jg.e) view).getSelectedType();
                int i14 = jg.e.f10026s;
                if (selectedType != 2 && selectedType != 3) {
                    if (selectedType == 1) {
                        f7.b bVar3 = b1Var.f7415o0;
                        if (bVar3 != null) {
                            ((f2) bVar3.f6120b).V(1, arrayList);
                            ((x) bVar3.f6121c).f7661b.D(1);
                        }
                    } else {
                        b1Var.f7407f0 = selectedType;
                        b1Var.a0(true, true);
                        b1Var.Z(true);
                        b1Var.N();
                    }
                } else if (selectedType == 2 && b1Var.f7406e0 == selectedType) {
                    f7.b bVar4 = b1Var.f7415o0;
                    if (bVar4 != null) {
                        ((f2) bVar4.f6120b).V(1, arrayList);
                        ((x) bVar4.f6121c).f7661b.D(1);
                        return;
                    }
                    return;
                } else {
                    b1Var.f7406e0 = selectedType;
                    b1Var.a0(true, true);
                    b1Var.Z(true);
                    b1Var.N();
                }
            } else {
                jg.d dVar = (jg.d) view;
                sl0 sl0Var = b1Var.d;
                if (dVar.b()) {
                    for (int i15 = 0; i15 < sl0Var.getChildCount(); i15++) {
                        View childAt = sl0Var.getChildAt(i15);
                        if (childAt.getClass().isInstance(dVar)) {
                            jg.d dVar2 = (jg.d) childAt;
                            if (childAt == dVar) {
                                z10 = true;
                            } else {
                                z10 = false;
                            }
                            dVar2.c(z10, true);
                        }
                    }
                }
            }
        }
        if (view instanceof jg.w) {
            int selectedType2 = ((jg.w) view).getSelectedType();
            if (b1Var.f7408g0 == selectedType2 && (bVar = b1Var.f7415o0) != null) {
                ((f2) bVar.f6120b).V(3, b1Var.f7403b0);
                ((x) bVar.f6121c).f7661b.D(1);
            }
            b1Var.f7408g0 = selectedType2;
            b1Var.a0(false, false);
        } else if (view instanceof jg.j) {
            b1Var.f7410i0 = ((TLRPC.TL_premiumGiftCodeOption) ((jg.j) view).getGifCode()).months;
            b1Var.a0(false, false);
            b1Var.f7405d0.G();
        } else if (view instanceof jg.i) {
            Context context = p2Var.getContext();
            long j10 = b1Var.f7411j0;
            r0 r0Var = new r0(b1Var);
            g6 g6Var = b1Var.resourcesProvider;
            x4 x4Var = new x4(g6Var);
            c3 c3Var = new c3(context, g6Var);
            c3Var.a();
            yc0 yc0Var = new yc0(context, g6Var);
            int i16 = x4Var.f32943a;
            yc0Var.setTextColor(i16);
            yc0Var.setTextOffset(AndroidUtilities.dp(10.0f));
            yc0Var.setItemCount(5);
            ?? yc0Var2 = new yc0(context, g6Var);
            yc0Var2.setWrapSelectorWheel(true);
            yc0Var2.setAllItemsCount(24);
            yc0Var2.setItemCount(5);
            yc0Var2.setTextColor(i16);
            yc0Var2.setTextOffset(-AndroidUtilities.dp(10.0f));
            yc0Var2.setTag("HOUR");
            ?? yc0Var3 = new yc0(context, g6Var);
            yc0Var3.setWrapSelectorWheel(true);
            yc0Var3.setAllItemsCount(60);
            yc0Var3.setItemCount(5);
            yc0Var3.setTextColor(i16);
            yc0Var3.setTextOffset(-AndroidUtilities.dp(34.0f));
            p pVar = new p(context, x4Var, yc0Var, (n) yc0Var2, (o) yc0Var3);
            pVar.setOrientation(1);
            FrameLayout frameLayout = new FrameLayout(context);
            pVar.addView(frameLayout, c6.t(-1, -2, 51, 22, 0, 0, 4));
            TextView textView = new TextView(context);
            textView.setText(LocaleController.getString("BoostingSelectDateTime", R.string.BoostingSelectDateTime));
            textView.setTextColor(i16);
            yh.p(20.0f, 1, textView);
            frameLayout.addView(textView, c6.d(-2, -2.0f, 51, 0.0f, 12.0f, 0.0f, 0.0f));
            textView.setOnTouchListener(new org.telegram.ui.ActionBar.s2(1));
            LinearLayout linearLayout = new LinearLayout(context);
            linearLayout.setOrientation(0);
            linearLayout.setWeightSum(1.0f);
            pVar.addView(linearLayout, c6.p(-1, -2, 1.0f, 0, 0, 12, 0, 12));
            long currentTimeMillis = System.currentTimeMillis();
            Calendar calendar = Calendar.getInstance();
            calendar.setTimeInMillis(currentTimeMillis);
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
            linearLayout.addView(yc0Var, c6.l(0.5f, 0, 270));
            yc0Var.setMinValue(0);
            yc0Var.setMaxValue(i18 - 1);
            yc0Var.setWrapSelectorWheel(false);
            yc0Var.setTag("DAY");
            yc0Var.setFormatter(new c(currentTimeMillis, calendar, i17, 0));
            wc0 dVar3 = new d(pVar, (n) yc0Var2, (o) yc0Var3, i19, i20, yc0Var);
            yc0Var.setOnValueChangedListener(dVar3);
            yc0Var2.setMinValue(0);
            yc0Var2.setMaxValue(23);
            linearLayout.addView((View) yc0Var2, c6.l(0.2f, 0, 270));
            yc0Var2.setFormatter(new f5.u(10));
            yc0Var2.setOnValueChangedListener(dVar3);
            yc0Var3.setMinValue(0);
            yc0Var3.setMaxValue(11);
            yc0Var3.setValue(0);
            yc0Var3.setFormatter(new f5.u(11));
            linearLayout.addView((View) yc0Var3, c6.l(0.3f, 0, 270));
            yc0Var3.setOnValueChangedListener(dVar3);
            if (j10 > 0) {
                calendar.setTimeInMillis(System.currentTimeMillis());
                calendar.set(12, 0);
                calendar.set(13, 0);
                calendar.set(14, 0);
                calendar.set(11, 0);
                calendar.setTimeInMillis(j10);
                yc0Var3.setValue(calendar.get(12) / 5);
                yc0Var2.setValue(calendar.get(11));
                yc0Var.setValue((int) ((j10 - calendar.getTimeInMillis()) / 86400000));
                yc0Var.getValue();
                dVar3.q(yc0Var, yc0Var.getValue());
                yc0Var2.getValue();
                dVar3.q(yc0Var2, yc0Var2.getValue());
            }
            qVar.setPadding(AndroidUtilities.dp(34.0f), 0, AndroidUtilities.dp(34.0f), 0);
            qVar.setGravity(17);
            qVar.setTextColor(x4Var.f32948g);
            qVar.setTextSize(1, 14.0f);
            qVar.setTypeface(AndroidUtilities.bold());
            qVar.setBackground(a6.e(new float[]{8.0f}, x4Var.h));
            qVar.setText(LocaleController.getString("BoostingConfirm", R.string.BoostingConfirm));
            pVar.addView(qVar, c6.t(-1, 48, 83, 16, 15, 16, 16));
            qVar.setOnClickListener(new e(calendar, yc0Var, (Object) yc0Var2, (Object) yc0Var3, r0Var, c3Var, 0));
            c3Var.b(pVar);
            h3 h3Var = c3Var.f21209a;
            h3Var.show();
            int i21 = x4Var.f32944b;
            h3Var.setBackgroundColor(i21);
            h3Var.fixNavigationBar(i21);
            if (i0.a.f(i21) > 0.699999988079071d) {
                z4 = true;
            } else {
                z4 = false;
            }
            AndroidUtilities.setLightStatusBar(h3Var, z4);
        } else if (view instanceof jg.b) {
            f7.b bVar5 = b1Var.f7415o0;
            if (bVar5 != null) {
                ((f2) bVar5.f6120b).V(2, b1Var.Z);
                ((x) bVar5.f6121c).f7661b.D(1);
            }
        } else if (view instanceof jg.y) {
            TL_stars.TL_starsGiveawayOption option = ((jg.y) view).getOption();
            if (option != null) {
                b1Var.m0 = option.stars;
                b1Var.a0(true, true);
                b1Var.Z(true);
                b1Var.N();
            }
        } else if (view instanceof q9) {
            b1Var.f7409h0 = true;
            b1Var.a0(true, true);
        }
    }

    public static void R(b1 b1Var) {
        fg.d2 d2Var = new fg.d2(b1Var.f31017n, b1Var.currentAccount, null, b1Var.resourcesProvider);
        d2Var.setOnDismissListener(new u0(b1Var, 1));
        d2Var.setOnShowListener(new w0(b1Var, 1));
        d2Var.show();
    }

    public static void S(b1 b1Var) {
        fg.d2 d2Var = new fg.d2(b1Var.f31017n, b1Var.currentAccount, null, b1Var.resourcesProvider);
        d2Var.setOnDismissListener(new u0(b1Var, 0));
        d2Var.setOnShowListener(new w0(b1Var, 0));
        d2Var.show();
    }

    @Override
    public final void C(Canvas canvas, int i10) {
        this.f7416p0 = i10;
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
        int i10 = this.f7406e0;
        int i11 = jg.e.f10026s;
        if (i10 == 2) {
            return ((Integer) this.V.get(this.f7412k0)).intValue();
        }
        List X = X();
        int i12 = this.f7413l0;
        if (i12 < 0 || i12 >= X.size()) {
            this.f7413l0 = 0;
        }
        if (this.f7413l0 >= X.size()) {
            return 0;
        }
        return ((Integer) X.get(this.f7413l0)).intValue();
    }

    public final int V() {
        int U;
        int g10;
        int i10 = this.f7406e0;
        int i11 = jg.e.f10026s;
        if (i10 == 2) {
            U = ((Integer) this.V.get(this.f7412k0)).intValue();
            g10 = p0.g();
        } else {
            TL_stars.TL_starsGiveawayOption W = W(this.m0);
            if (W != null) {
                return W.yearly_boosts;
            }
            U = U();
            g10 = p0.g();
        }
        return g10 * U;
    }

    public final TL_stars.TL_starsGiveawayOption W(long j10) {
        ArrayList v = t7.y(this.currentAccount, false).v();
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
        int i10 = this.f7406e0;
        int i11 = jg.e.f10026s;
        if (i10 == 2) {
            return this.V;
        }
        ArrayList arrayList = new ArrayList();
        TL_stars.TL_starsGiveawayOption W = W(this.m0);
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
        if (this.f7418r0 != null) {
            return true;
        }
        return false;
    }

    public final void Z(boolean z4) {
        boolean z10;
        boolean Y = Y();
        jg.a aVar = this.f7414n0;
        if (Y) {
            TL_stories.PrepaidGiveaway prepaidGiveaway = this.f7418r0;
            if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                aVar.a(prepaidGiveaway.quantity, z4);
                return;
            }
            aVar.a(p0.g() * prepaidGiveaway.quantity, z4);
            return;
        }
        int i10 = this.f7407f0;
        int i11 = jg.e.f10026s;
        if (i10 == 0) {
            aVar.a(V(), z4);
            return;
        }
        ArrayList arrayList = this.f7402a0;
        int g10 = p0.g() * arrayList.size();
        if (arrayList.size() > 0) {
            z10 = true;
        } else {
            z10 = false;
        }
        aVar.f10009e = true;
        qh.d dVar = aVar.f10006a;
        dVar.k();
        dVar.setShowZero(true);
        dVar.setEnabled(z10);
        dVar.c(g10, z4);
        dVar.g(LocaleController.getString(R.string.GiftPremium), z4, true);
        aVar.f10007b.setBackgroundColor(k6.v0(k6.f21733h5, aVar.f10008c));
    }

    public final void a0(boolean r26, boolean r27) {
        throw new UnsupportedOperationException("Method not decompiled: hg.b1.a0(boolean, boolean):void");
    }

    @Override
    public final void didReceivedNotification(int i10, int i11, Object... objArr) {
        sl0 sl0Var;
        if (i10 == NotificationCenter.starGiveawayOptionsLoaded && (sl0Var = this.d) != null && sl0Var.D) {
            a0(true, true);
        }
    }

    @Override
    public final void dismiss() {
        s sVar = this.f7417q0;
        if (sVar != null) {
            sVar.run();
        }
        NotificationCenter.getInstance(this.currentAccount).removeObserver(this, NotificationCenter.starGiveawayOptionsLoaded);
    }

    @Override
    public final rl0 v(sl0 sl0Var) {
        ig.b bVar = new ig.b(this.resourcesProvider);
        this.f7405d0 = bVar;
        return bVar;
    }

    @Override
    public final CharSequence y() {
        int i10 = this.f7407f0;
        int i11 = jg.e.f10026s;
        if (i10 == 1) {
            return LocaleController.getString(R.string.GiftPremium);
        }
        return LocaleController.formatString("BoostingStartGiveaway", R.string.BoostingStartGiveaway, new Object[0]);
    }
}
