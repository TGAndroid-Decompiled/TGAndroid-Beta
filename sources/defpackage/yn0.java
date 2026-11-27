package defpackage;

import android.app.Activity;
import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stars;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.AlertDialog$Builder;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.LaunchActivity;
public final class yn0 implements View.OnClickListener {
    public final byte a;
    public final long b;
    public final Object c;
    public final Object d;
    public final Object e;

    public yn0(ao0 ao0Var, TL_stories.PrepaidGiveaway prepaidGiveaway, long j, e eVar) {
        this.a = (byte) 0;
        this.c = ao0Var;
        this.d = prepaidGiveaway;
        this.b = j;
        this.e = eVar;
    }

    @Override
    public final void onClick(View view) {
        boolean z;
        tn0 tn0Var;
        boolean z2;
        String str;
        TL_stories.TL_prepaidStarsGiveaway tL_prepaidStarsGiveaway;
        long j;
        byte b = this.a;
        Object obj = this.e;
        Object obj2 = this.d;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                ao0 ao0Var = (ao0) obj3;
                TL_stories.PrepaidGiveaway prepaidGiveaway = (TL_stories.PrepaidGiveaway) obj2;
                e eVar = (e) obj;
                ArrayList arrayList = ao0Var.Z1;
                ArrayList arrayList2 = ao0Var.X1;
                TLRPC.Chat chat = ao0Var.W1;
                ArrayList arrayList3 = ao0Var.Y1;
                ArrayList arrayList4 = ao0Var.a2;
                o8 o8Var = ao0Var.l2;
                if (!o8Var.a.R) {
                    if (ao0Var.e1()) {
                        if (prepaidGiveaway instanceof TL_stories.TL_prepaidStarsGiveaway) {
                            tL_prepaidStarsGiveaway = (TL_stories.TL_prepaidStarsGiveaway) prepaidGiveaway;
                        } else {
                            tL_prepaidStarsGiveaway = null;
                        }
                        if (tL_prepaidStarsGiveaway != null) {
                            j = tL_prepaidStarsGiveaway.stars;
                        } else {
                            j = 0;
                        }
                        hv4 hv4Var = new hv4(ao0Var, prepaidGiveaway, tL_prepaidStarsGiveaway, this.b, j, (byte) 2);
                        e Q = LaunchActivity.Q();
                        if (Q != null) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, Q.getResourceProvider(), Q.getContext());
                            String M0 = ob6.M0(2131753184, null);
                            id idVar = alertDialog$Builder.a;
                            idVar.S = M0;
                            idVar.U = hl.S2(ob6.M0(2131753185, null));
                            alertDialog$Builder.j(ob6.M0(2131744572, null), new tg0(hv4Var, (byte) 5));
                            alertDialog$Builder.g(ob6.M0(2131752570, null), new rm0((byte) 1));
                            alertDialog$Builder.o();
                            return;
                        }
                        return;
                    }
                    int i = ao0Var.c2;
                    int i2 = pn0.w;
                    if (i == 3) {
                        Activity W = hl.W(ao0Var.getContext());
                        if (W == null) {
                            W = LaunchActivity.H1;
                        }
                        if (W != null && !W.isFinishing()) {
                            TL_stars.TL_starsGiveawayOption c1 = ao0Var.c1(ao0Var.k2);
                            int a1 = ao0Var.a1();
                            if (c1 != null) {
                                o8Var.a.setLoading(true);
                                int i3 = ao0Var.e2;
                                int i4 = ky7.w;
                                if (i3 == 1) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                jxa v = jxa.v(ao0Var.a, false);
                                int n = on0.n(ao0Var.h2);
                                boolean z3 = ao0Var.s2;
                                boolean z4 = ao0Var.r2;
                                String str2 = ao0Var.q2;
                                qe2 qe2Var = new qe2(ao0Var, c1, (byte) 2);
                                int i5 = v.a;
                                if (!uc7.s1(i5).i5()) {
                                    e Q2 = LaunchActivity.Q();
                                    if (Q2 != null && Q2.getContext() != null) {
                                        jxa.d0(Q2.getContext(), Q2.getResourceProvider());
                                        return;
                                    } else {
                                        jxa.d0(W, null);
                                        return;
                                    }
                                }
                                TLRPC.TL_inputStorePaymentStarsGiveaway tL_inputStorePaymentStarsGiveaway = new TLRPC.TL_inputStorePaymentStarsGiveaway();
                                tL_inputStorePaymentStarsGiveaway.only_new_subscribers = z2;
                                tL_inputStorePaymentStarsGiveaway.winners_are_visible = z3;
                                Activity activity = W;
                                tL_inputStorePaymentStarsGiveaway.stars = c1.stars;
                                uc7.s1(i5);
                                tL_inputStorePaymentStarsGiveaway.boost_peer = uc7.l1(chat);
                                if (arrayList2 != null && !arrayList2.isEmpty()) {
                                    tL_inputStorePaymentStarsGiveaway.flags |= 2;
                                    int size = arrayList2.size();
                                    int i6 = 0;
                                    while (i6 < size) {
                                        Object obj4 = arrayList2.get(i6);
                                        i6++;
                                        ArrayList<TLRPC.InputPeer> arrayList5 = tL_inputStorePaymentStarsGiveaway.additional_peers;
                                        uc7.s1(i5);
                                        arrayList5.add(uc7.k1((TLObject) obj4));
                                    }
                                }
                                int size2 = arrayList.size();
                                int i7 = 0;
                                while (i7 < size2) {
                                    Object obj5 = arrayList.get(i7);
                                    i7++;
                                    tL_inputStorePaymentStarsGiveaway.countries_iso2.add(((TLRPC.TL_help_country) ((TLObject) obj5)).iso2);
                                }
                                if (!tL_inputStorePaymentStarsGiveaway.countries_iso2.isEmpty()) {
                                    tL_inputStorePaymentStarsGiveaway.flags |= 4;
                                }
                                if (z4) {
                                    tL_inputStorePaymentStarsGiveaway.flags |= 16;
                                    tL_inputStorePaymentStarsGiveaway.prize_description = str2;
                                }
                                r7a.B(i5);
                                tL_inputStorePaymentStarsGiveaway.random_id = r7a.D();
                                tL_inputStorePaymentStarsGiveaway.until_date = n;
                                tL_inputStorePaymentStarsGiveaway.currency = c1.currency;
                                tL_inputStorePaymentStarsGiveaway.amount = c1.amount;
                                tL_inputStorePaymentStarsGiveaway.users = a1;
                                if (!f11.b() && di0.h().j() && (str = c1.store_product) != null) {
                                    ?? obj6 = new Object();
                                    obj6.b = "inapp";
                                    obj6.a = str;
                                    di0.h().o(Arrays.asList(obj6.a()), new pt(v, qe2Var, tL_inputStorePaymentStarsGiveaway, activity, (byte) 24));
                                    return;
                                }
                                TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars = new TLRPC.TL_inputInvoiceStars();
                                tL_inputInvoiceStars.purpose = tL_inputStorePaymentStarsGiveaway;
                                TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                                JSONObject u = xw0.u(jxa.F(), false);
                                if (u != null) {
                                    TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                                    tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                                    tL_dataJSON.data = u.toString();
                                    tL_payments_getPaymentForm.flags |= 1;
                                }
                                tL_payments_getPaymentForm.invoice = tL_inputInvoiceStars;
                                ConnectionsManager.getInstance(i5).sendRequest(tL_payments_getPaymentForm, new qn8(v, qe2Var, tL_inputInvoiceStars, (byte) 19));
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    byte b2 = 16;
                    if (ao0Var.d2 == 1) {
                        ArrayList c = on0.c(arrayList3.size(), arrayList4);
                        int i8 = 0;
                        while (i8 < c.size()) {
                            TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) c.get(i8);
                            if (tL_premiumGiftCodeOption.months == ao0Var.g2 && arrayList3.size() > 0) {
                                if (on0.j()) {
                                    Context context = ao0Var.getContext();
                                    vnb vnbVar = ao0Var.J0;
                                    if (tL_premiumGiftCodeOption.store_product == null) {
                                        ArrayList arrayList6 = new ArrayList();
                                        int size3 = arrayList4.size();
                                        int i9 = 0;
                                        while (i9 < size3) {
                                            Object obj7 = arrayList4.get(i9);
                                            i9++;
                                            TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption2 = (TLRPC.TL_premiumGiftCodeOption) obj7;
                                            if (tL_premiumGiftCodeOption2.months == tL_premiumGiftCodeOption.months && tL_premiumGiftCodeOption2.store_product != null) {
                                                arrayList6.add(Integer.valueOf(tL_premiumGiftCodeOption2.users));
                                            }
                                        }
                                        String join = TextUtils.join(", ", arrayList6);
                                        int i10 = tL_premiumGiftCodeOption.users;
                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, vnbVar, context);
                                        String M02 = ob6.M0(2131753295, "BoostingReduceQuantity");
                                        id idVar2 = alertDialog$Builder2.a;
                                        idVar2.S = M02;
                                        idVar2.U = hl.S2(ob6.G(i10, "BoostingReduceUsersTextPlural", join));
                                        alertDialog$Builder2.j(ob6.M0(2131747558, "OK"), new vr9(b2));
                                        alertDialog$Builder2.o();
                                        return;
                                    }
                                }
                                o8Var.b(true);
                                on0.m(arrayList3, tL_premiumGiftCodeOption, ao0Var.W1, null, eVar, new tn0(ao0Var, (byte) 0), new tn0(ao0Var, (byte) 1));
                                return;
                            }
                            i8++;
                            b2 = 16;
                        }
                        return;
                    }
                    ArrayList c2 = on0.c(ao0Var.a1(), arrayList4);
                    for (int i11 = 0; i11 < c2.size(); i11++) {
                        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption3 = (TLRPC.TL_premiumGiftCodeOption) c2.get(i11);
                        if (tL_premiumGiftCodeOption3.months == ao0Var.g2) {
                            if (on0.j()) {
                                List list = ao0Var.T1;
                                Context context2 = ao0Var.getContext();
                                vnb vnbVar2 = ao0Var.J0;
                                tn0 tn0Var2 = new tn0(ao0Var, (byte) 2);
                                if (tL_premiumGiftCodeOption3.store_product == null) {
                                    ArrayList arrayList7 = new ArrayList();
                                    int size4 = arrayList4.size();
                                    int i12 = 0;
                                    while (i12 < size4) {
                                        Object obj8 = arrayList4.get(i12);
                                        i12++;
                                        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption4 = (TLRPC.TL_premiumGiftCodeOption) obj8;
                                        if (tL_premiumGiftCodeOption4.months == tL_premiumGiftCodeOption3.months && tL_premiumGiftCodeOption4.store_product != null && list.contains(Integer.valueOf(tL_premiumGiftCodeOption4.users))) {
                                            arrayList7.add(tL_premiumGiftCodeOption4);
                                        }
                                    }
                                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption5 = (TLRPC.TL_premiumGiftCodeOption) arrayList7.get(0);
                                    int size5 = arrayList7.size();
                                    int i13 = 0;
                                    while (i13 < size5) {
                                        Object obj9 = arrayList7.get(i13);
                                        i13++;
                                        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption6 = (TLRPC.TL_premiumGiftCodeOption) obj9;
                                        int i14 = tL_premiumGiftCodeOption3.users;
                                        int i15 = tL_premiumGiftCodeOption6.users;
                                        if (i14 > i15 && i15 > tL_premiumGiftCodeOption5.users) {
                                            tL_premiumGiftCodeOption5 = tL_premiumGiftCodeOption6;
                                        }
                                    }
                                    String G = ob6.G(tL_premiumGiftCodeOption5.months, "GiftMonths", new Object[0]);
                                    int i16 = tL_premiumGiftCodeOption3.users;
                                    int i17 = tL_premiumGiftCodeOption5.users;
                                    AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, vnbVar2, context2);
                                    String M03 = ob6.M0(2131753295, "BoostingReduceQuantity");
                                    id idVar3 = alertDialog$Builder3.a;
                                    idVar3.S = M03;
                                    idVar3.U = hl.S2(ob6.G(i16, "BoostingReduceQuantityTextPlural", G, Integer.valueOf(i17)));
                                    alertDialog$Builder3.j(ob6.M0(2131746068, "Reduce"), new o(tn0Var2, tL_premiumGiftCodeOption5, (byte) 20));
                                    alertDialog$Builder3.g(ob6.M0(2131752570, "Cancel"), new vr9((byte) 16));
                                    alertDialog$Builder3.o();
                                    return;
                                }
                            }
                            int i18 = ao0Var.e2;
                            int i19 = ky7.w;
                            if (i18 == 1) {
                                z = true;
                            } else {
                                z = false;
                            }
                            int n2 = on0.n(ao0Var.h2);
                            o8Var.b(true);
                            boolean z5 = ao0Var.s2;
                            boolean z6 = ao0Var.r2;
                            String str3 = ao0Var.q2;
                            tn0 tn0Var3 = new tn0(ao0Var, (byte) 3);
                            tn0 tn0Var4 = new tn0(ao0Var, (byte) 4);
                            boolean j2 = on0.j();
                            int i20 = yac.t0;
                            if (!j2) {
                                uc7 s1 = uc7.s1(i20);
                                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(yac.t0);
                                TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm2 = new TLRPC.TL_payments_getPaymentForm();
                                TLRPC.TL_inputInvoicePremiumGiftCode tL_inputInvoicePremiumGiftCode = new TLRPC.TL_inputInvoicePremiumGiftCode();
                                TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway = new TLRPC.TL_inputStorePaymentPremiumGiveaway();
                                tL_inputStorePaymentPremiumGiveaway.only_new_subscribers = z;
                                tL_inputStorePaymentPremiumGiveaway.winners_are_visible = z5;
                                tL_inputStorePaymentPremiumGiveaway.prize_description = str3;
                                tL_inputStorePaymentPremiumGiveaway.until_date = n2;
                                int i21 = tL_inputStorePaymentPremiumGiveaway.flags;
                                tL_inputStorePaymentPremiumGiveaway.flags = i21 | 6;
                                if (z6) {
                                    tL_inputStorePaymentPremiumGiveaway.flags = i21 | 22;
                                }
                                tL_inputStorePaymentPremiumGiveaway.random_id = System.currentTimeMillis();
                                tL_inputStorePaymentPremiumGiveaway.additional_peers = new ArrayList<>();
                                int size6 = arrayList2.size();
                                int i22 = 0;
                                while (i22 < size6) {
                                    Object obj10 = arrayList2.get(i22);
                                    i22++;
                                    TLObject tLObject = (TLObject) obj10;
                                    if (tLObject instanceof TLRPC.Chat) {
                                        tn0Var = tn0Var4;
                                        tL_inputStorePaymentPremiumGiveaway.additional_peers.add(s1.j1(-((TLRPC.Chat) tLObject).id));
                                    } else {
                                        tn0Var = tn0Var4;
                                    }
                                    tn0Var4 = tn0Var;
                                }
                                tn0 tn0Var5 = tn0Var4;
                                tL_inputStorePaymentPremiumGiveaway.boost_peer = s1.j1(-chat.id);
                                tL_inputStorePaymentPremiumGiveaway.boost_peer = s1.j1(-chat.id);
                                tL_inputStorePaymentPremiumGiveaway.currency = tL_premiumGiftCodeOption3.currency;
                                tL_inputStorePaymentPremiumGiveaway.amount = tL_premiumGiftCodeOption3.amount;
                                int size7 = arrayList.size();
                                int i23 = 0;
                                while (i23 < size7) {
                                    Object obj11 = arrayList.get(i23);
                                    i23++;
                                    tL_inputStorePaymentPremiumGiveaway.countries_iso2.add(((TLRPC.TL_help_country) ((TLObject) obj11)).iso2);
                                }
                                tL_inputInvoicePremiumGiftCode.purpose = tL_inputStorePaymentPremiumGiveaway;
                                tL_inputInvoicePremiumGiftCode.option = tL_premiumGiftCodeOption3;
                                JSONObject u2 = xw0.u(eVar.getResourceProvider(), false);
                                if (u2 != null) {
                                    TLRPC.TL_dataJSON tL_dataJSON2 = new TLRPC.TL_dataJSON();
                                    tL_payments_getPaymentForm2.theme_params = tL_dataJSON2;
                                    tL_dataJSON2.data = u2.toString();
                                    tL_payments_getPaymentForm2.flags |= 1;
                                }
                                tL_payments_getPaymentForm2.invoice = tL_inputInvoicePremiumGiftCode;
                                connectionsManager.sendRequest(tL_payments_getPaymentForm2, new in0(tn0Var5, s1, tL_inputInvoicePremiumGiftCode, eVar, tn0Var3, (byte) 0));
                                return;
                            }
                            uc7 s12 = uc7.s1(i20);
                            ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(yac.t0);
                            TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway2 = new TLRPC.TL_inputStorePaymentPremiumGiveaway();
                            tL_inputStorePaymentPremiumGiveaway2.only_new_subscribers = z;
                            tL_inputStorePaymentPremiumGiveaway2.winners_are_visible = z5;
                            tL_inputStorePaymentPremiumGiveaway2.prize_description = str3;
                            tL_inputStorePaymentPremiumGiveaway2.until_date = n2;
                            int i24 = tL_inputStorePaymentPremiumGiveaway2.flags;
                            tL_inputStorePaymentPremiumGiveaway2.flags = i24 | 6;
                            if (z6) {
                                tL_inputStorePaymentPremiumGiveaway2.flags = i24 | 22;
                            }
                            tL_inputStorePaymentPremiumGiveaway2.random_id = System.currentTimeMillis();
                            tL_inputStorePaymentPremiumGiveaway2.additional_peers = new ArrayList<>();
                            int size8 = arrayList2.size();
                            int i25 = 0;
                            while (i25 < size8) {
                                Object obj12 = arrayList2.get(i25);
                                i25++;
                                TLObject tLObject2 = (TLObject) obj12;
                                if (tLObject2 instanceof TLRPC.Chat) {
                                    tL_inputStorePaymentPremiumGiveaway2.additional_peers.add(s12.j1(-((TLRPC.Chat) tLObject2).id));
                                }
                            }
                            tL_inputStorePaymentPremiumGiveaway2.boost_peer = s12.j1(-chat.id);
                            int size9 = arrayList.size();
                            int i26 = 0;
                            while (i26 < size9) {
                                Object obj13 = arrayList.get(i26);
                                i26++;
                                tL_inputStorePaymentPremiumGiveaway2.countries_iso2.add(((TLRPC.TL_help_country) ((TLObject) obj13)).iso2);
                            }
                            ?? obj14 = new Object();
                            obj14.b = "inapp";
                            obj14.a = tL_premiumGiftCodeOption3.store_product;
                            di0.h().o(Arrays.asList(obj14.a()), new kh(tL_inputStorePaymentPremiumGiveaway2, tL_premiumGiftCodeOption3, connectionsManager2, tn0Var4, tn0Var3, eVar, (byte) 3));
                            return;
                        }
                    }
                    return;
                }
                return;
            case 1:
                y13 y13Var = (y13) obj3;
                c51 c51Var = (c51) obj;
                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(0, y13Var.J0, (Context) obj2);
                String M04 = ob6.M0(2131748552, null);
                id idVar4 = alertDialog$Builder4.a;
                idVar4.S = M04;
                idVar4.U = ob6.M0(2131748553, null);
                alertDialog$Builder4.j(ob6.M0(2131745751, null), new ps0(y13Var, c51Var, this.b, (byte) 2));
                alertDialog$Builder4.g(ob6.M0(2131752570, null), null);
                alertDialog$Builder4.c(-1);
                alertDialog$Builder4.o();
                return;
            default:
                uj3 uj3Var = (uj3) obj3;
                uj3Var.finishPreviewFragment();
                hl.d3(new ba7(uj3Var, (ac7) obj2, (TLRPC.Dialog) obj, this.b, (byte) 7), 100L);
                return;
        }
    }

    public yn0(Object obj, Object obj2, Object obj3, long j, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.b = j;
    }
}
