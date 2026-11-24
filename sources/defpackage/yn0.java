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
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.LaunchActivity;
public final class yn0 implements View.OnClickListener {
    public final byte a;
    public final long b;
    public final Object c;
    public final Object d;
    public final Object e;

    public yn0(ao0 ao0Var, TL_stories.PrepaidGiveaway prepaidGiveaway, long j, d dVar) {
        this.a = (byte) 0;
        this.c = ao0Var;
        this.d = prepaidGiveaway;
        this.b = j;
        this.e = dVar;
    }

    @Override
    public final void onClick(View view) {
        boolean z;
        int i;
        int i2;
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
                d dVar = (d) obj;
                ArrayList arrayList = ao0Var.Z1;
                ArrayList arrayList2 = ao0Var.X1;
                TLRPC.Chat chat = ao0Var.W1;
                ArrayList arrayList3 = ao0Var.Y1;
                ArrayList arrayList4 = ao0Var.a2;
                n8 n8Var = ao0Var.l2;
                if (!n8Var.a.R) {
                    if (ao0Var.d1()) {
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
                        dt4 dt4Var = new dt4(ao0Var, prepaidGiveaway, tL_prepaidStarsGiveaway, this.b, j, (byte) 2);
                        d Q = LaunchActivity.Q();
                        if (Q != null) {
                            AlertDialog$Builder alertDialog$Builder = new AlertDialog$Builder(0, Q.getResourceProvider(), Q.getContext());
                            String M0 = k96.M0(2131753188, null);
                            hd hdVar = alertDialog$Builder.a;
                            hdVar.S = M0;
                            hdVar.U = gl.S2(k96.M0(2131753189, null));
                            alertDialog$Builder.j(k96.M0(2131744678, null), new sg0(dt4Var, (byte) 5));
                            alertDialog$Builder.g(k96.M0(2131752577, null), new qm0((byte) 0));
                            alertDialog$Builder.o();
                            return;
                        }
                        return;
                    }
                    int i3 = ao0Var.c2;
                    int i4 = pn0.w;
                    if (i3 == 3) {
                        Activity W = gl.W(ao0Var.getContext());
                        if (W == null) {
                            W = LaunchActivity.H1;
                        }
                        if (W != null && !W.isFinishing()) {
                            TL_stars.TL_starsGiveawayOption b1 = ao0Var.b1(ao0Var.k2);
                            int Z0 = ao0Var.Z0();
                            if (b1 != null) {
                                n8Var.a.setLoading(true);
                                int i5 = ao0Var.e2;
                                int i6 = dv7.w;
                                if (i5 == 1) {
                                    z2 = true;
                                } else {
                                    z2 = false;
                                }
                                gta v = gta.v(ao0Var.a, false);
                                int n = on0.n(ao0Var.h2);
                                boolean z3 = ao0Var.s2;
                                boolean z4 = ao0Var.r2;
                                String str2 = ao0Var.q2;
                                ae2 ae2Var = new ae2(ao0Var, b1, (byte) 2);
                                int i7 = v.a;
                                if (!na7.q1(i7).a5()) {
                                    d Q2 = LaunchActivity.Q();
                                    if (Q2 != null && Q2.getContext() != null) {
                                        gta.c0(Q2.getContext(), Q2.getResourceProvider());
                                        return;
                                    } else {
                                        gta.c0(W, null);
                                        return;
                                    }
                                }
                                TLRPC.TL_inputStorePaymentStarsGiveaway tL_inputStorePaymentStarsGiveaway = new TLRPC.TL_inputStorePaymentStarsGiveaway();
                                tL_inputStorePaymentStarsGiveaway.only_new_subscribers = z2;
                                tL_inputStorePaymentStarsGiveaway.winners_are_visible = z3;
                                tL_inputStorePaymentStarsGiveaway.stars = b1.stars;
                                na7.q1(i7);
                                tL_inputStorePaymentStarsGiveaway.boost_peer = na7.j1(chat);
                                if (arrayList2 != null && !arrayList2.isEmpty()) {
                                    tL_inputStorePaymentStarsGiveaway.flags |= 2;
                                    int size = arrayList2.size();
                                    int i8 = 0;
                                    while (i8 < size) {
                                        Object obj4 = arrayList2.get(i8);
                                        i8++;
                                        Activity activity = W;
                                        ArrayList<TLRPC.InputPeer> arrayList5 = tL_inputStorePaymentStarsGiveaway.additional_peers;
                                        na7.q1(i7);
                                        arrayList5.add(na7.i1((TLObject) obj4));
                                        W = activity;
                                    }
                                }
                                Activity activity2 = W;
                                int size2 = arrayList.size();
                                int i9 = 0;
                                while (i9 < size2) {
                                    Object obj5 = arrayList.get(i9);
                                    i9++;
                                    tL_inputStorePaymentStarsGiveaway.countries_iso2.add(((TLRPC.TL_help_country) ((TLObject) obj5)).iso2);
                                }
                                if (!tL_inputStorePaymentStarsGiveaway.countries_iso2.isEmpty()) {
                                    tL_inputStorePaymentStarsGiveaway.flags |= 4;
                                }
                                if (z4) {
                                    tL_inputStorePaymentStarsGiveaway.flags |= 16;
                                    tL_inputStorePaymentStarsGiveaway.prize_description = str2;
                                }
                                z3a.B(i7);
                                tL_inputStorePaymentStarsGiveaway.random_id = z3a.D();
                                tL_inputStorePaymentStarsGiveaway.until_date = n;
                                tL_inputStorePaymentStarsGiveaway.currency = b1.currency;
                                tL_inputStorePaymentStarsGiveaway.amount = b1.amount;
                                tL_inputStorePaymentStarsGiveaway.users = Z0;
                                if (!w01.b() && ci0.h().j() && (str = b1.store_product) != null) {
                                    ?? obj6 = new Object();
                                    obj6.b = "inapp";
                                    obj6.a = str;
                                    ci0.h().o(Arrays.asList(obj6.a()), new lt(v, ae2Var, tL_inputStorePaymentStarsGiveaway, activity2, (byte) 23));
                                    return;
                                }
                                TLRPC.TL_inputInvoiceStars tL_inputInvoiceStars = new TLRPC.TL_inputInvoiceStars();
                                tL_inputInvoiceStars.purpose = tL_inputStorePaymentStarsGiveaway;
                                TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
                                JSONObject u = ow0.u(gta.F(), false);
                                if (u != null) {
                                    TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                                    tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                                    tL_dataJSON.data = u.toString();
                                    tL_payments_getPaymentForm.flags |= 1;
                                }
                                tL_payments_getPaymentForm.invoice = tL_inputInvoiceStars;
                                ConnectionsManager.getInstance(i7).sendRequest(tL_payments_getPaymentForm, new ck8(v, ae2Var, tL_inputInvoiceStars, (byte) 18));
                                return;
                            }
                            return;
                        }
                        return;
                    }
                    byte b2 = 2;
                    if (ao0Var.d2 == 1) {
                        ArrayList c = on0.c(arrayList3.size(), arrayList4);
                        for (int i10 = 0; i10 < c.size(); i10++) {
                            TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) c.get(i10);
                            if (tL_premiumGiftCodeOption.months == ao0Var.g2 && arrayList3.size() > 0) {
                                if (on0.j()) {
                                    Context context = ao0Var.getContext();
                                    wjb wjbVar = ao0Var.J0;
                                    if (tL_premiumGiftCodeOption.store_product == null) {
                                        ArrayList arrayList6 = new ArrayList();
                                        int size3 = arrayList4.size();
                                        int i11 = 0;
                                        while (i11 < size3) {
                                            Object obj7 = arrayList4.get(i11);
                                            i11++;
                                            TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption2 = (TLRPC.TL_premiumGiftCodeOption) obj7;
                                            if (tL_premiumGiftCodeOption2.months == tL_premiumGiftCodeOption.months && tL_premiumGiftCodeOption2.store_product != null) {
                                                arrayList6.add(Integer.valueOf(tL_premiumGiftCodeOption2.users));
                                            }
                                        }
                                        String join = TextUtils.join(", ", arrayList6);
                                        int i12 = tL_premiumGiftCodeOption.users;
                                        AlertDialog$Builder alertDialog$Builder2 = new AlertDialog$Builder(0, wjbVar, context);
                                        String M02 = k96.M0(2131753299, "BoostingReduceQuantity");
                                        hd hdVar2 = alertDialog$Builder2.a;
                                        hdVar2.S = M02;
                                        hdVar2.U = gl.S2(k96.G(i12, "BoostingReduceUsersTextPlural", join));
                                        alertDialog$Builder2.j(k96.M0(2131747638, "OK"), new ho9((byte) 13));
                                        alertDialog$Builder2.o();
                                        return;
                                    }
                                }
                                n8Var.b(true);
                                on0.m(arrayList3, tL_premiumGiftCodeOption, ao0Var.W1, null, dVar, new tn0(ao0Var, (byte) 0), new tn0(ao0Var, (byte) 1));
                                return;
                            }
                        }
                        return;
                    }
                    ArrayList c2 = on0.c(ao0Var.Z0(), arrayList4);
                    int i13 = 0;
                    while (i13 < c2.size()) {
                        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption3 = (TLRPC.TL_premiumGiftCodeOption) c2.get(i13);
                        if (tL_premiumGiftCodeOption3.months == ao0Var.g2) {
                            if (on0.j()) {
                                List list = ao0Var.T1;
                                Context context2 = ao0Var.getContext();
                                wjb wjbVar2 = ao0Var.J0;
                                tn0 tn0Var = new tn0(ao0Var, b2);
                                if (tL_premiumGiftCodeOption3.store_product == null) {
                                    ArrayList arrayList7 = new ArrayList();
                                    int size4 = arrayList4.size();
                                    int i14 = 0;
                                    while (i14 < size4) {
                                        Object obj8 = arrayList4.get(i14);
                                        i14++;
                                        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption4 = (TLRPC.TL_premiumGiftCodeOption) obj8;
                                        if (tL_premiumGiftCodeOption4.months == tL_premiumGiftCodeOption3.months && tL_premiumGiftCodeOption4.store_product != null && list.contains(Integer.valueOf(tL_premiumGiftCodeOption4.users))) {
                                            arrayList7.add(tL_premiumGiftCodeOption4);
                                        }
                                    }
                                    TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption5 = (TLRPC.TL_premiumGiftCodeOption) arrayList7.get(0);
                                    int size5 = arrayList7.size();
                                    int i15 = 0;
                                    while (i15 < size5) {
                                        Object obj9 = arrayList7.get(i15);
                                        i15++;
                                        TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption6 = (TLRPC.TL_premiumGiftCodeOption) obj9;
                                        int i16 = tL_premiumGiftCodeOption3.users;
                                        int i17 = tL_premiumGiftCodeOption6.users;
                                        if (i16 > i17 && i17 > tL_premiumGiftCodeOption5.users) {
                                            tL_premiumGiftCodeOption5 = tL_premiumGiftCodeOption6;
                                        }
                                    }
                                    String G = k96.G(tL_premiumGiftCodeOption5.months, "GiftMonths", new Object[0]);
                                    int i18 = tL_premiumGiftCodeOption3.users;
                                    int i19 = tL_premiumGiftCodeOption5.users;
                                    AlertDialog$Builder alertDialog$Builder3 = new AlertDialog$Builder(0, wjbVar2, context2);
                                    String M03 = k96.M0(2131753299, "BoostingReduceQuantity");
                                    hd hdVar3 = alertDialog$Builder3.a;
                                    hdVar3.S = M03;
                                    hdVar3.U = gl.S2(k96.G(i18, "BoostingReduceQuantityTextPlural", G, Integer.valueOf(i19)));
                                    alertDialog$Builder3.j(k96.M0(2131746148, "Reduce"), new o(tn0Var, tL_premiumGiftCodeOption5, (byte) 20));
                                    alertDialog$Builder3.g(k96.M0(2131752577, "Cancel"), new ho9((byte) 13));
                                    alertDialog$Builder3.o();
                                    return;
                                }
                            }
                            int i20 = ao0Var.e2;
                            int i21 = dv7.w;
                            if (i20 == 1) {
                                z = true;
                            } else {
                                z = false;
                            }
                            int n2 = on0.n(ao0Var.h2);
                            n8Var.b(true);
                            boolean z5 = ao0Var.s2;
                            boolean z6 = ao0Var.r2;
                            String str3 = ao0Var.q2;
                            tn0 tn0Var2 = new tn0(ao0Var, (byte) 3);
                            tn0 tn0Var3 = new tn0(ao0Var, (byte) 4);
                            boolean j2 = on0.j();
                            int i22 = y6c.t0;
                            if (!j2) {
                                na7 q1 = na7.q1(i22);
                                ConnectionsManager connectionsManager = ConnectionsManager.getInstance(y6c.t0);
                                TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm2 = new TLRPC.TL_payments_getPaymentForm();
                                TLRPC.TL_inputInvoicePremiumGiftCode tL_inputInvoicePremiumGiftCode = new TLRPC.TL_inputInvoicePremiumGiftCode();
                                TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway = new TLRPC.TL_inputStorePaymentPremiumGiveaway();
                                tL_inputStorePaymentPremiumGiveaway.only_new_subscribers = z;
                                tL_inputStorePaymentPremiumGiveaway.winners_are_visible = z5;
                                tL_inputStorePaymentPremiumGiveaway.prize_description = str3;
                                tL_inputStorePaymentPremiumGiveaway.until_date = n2;
                                int i23 = tL_inputStorePaymentPremiumGiveaway.flags;
                                tL_inputStorePaymentPremiumGiveaway.flags = i23 | 6;
                                if (z6) {
                                    tL_inputStorePaymentPremiumGiveaway.flags = i23 | 22;
                                }
                                tL_inputStorePaymentPremiumGiveaway.random_id = System.currentTimeMillis();
                                tL_inputStorePaymentPremiumGiveaway.additional_peers = new ArrayList<>();
                                int size6 = arrayList2.size();
                                int i24 = 0;
                                while (i24 < size6) {
                                    Object obj10 = arrayList2.get(i24);
                                    int i25 = i24 + 1;
                                    TLObject tLObject = (TLObject) obj10;
                                    if (tLObject instanceof TLRPC.Chat) {
                                        i2 = i25;
                                        tL_inputStorePaymentPremiumGiveaway.additional_peers.add(q1.h1(-((TLRPC.Chat) tLObject).id));
                                    } else {
                                        i2 = i25;
                                    }
                                    i24 = i2;
                                }
                                tL_inputStorePaymentPremiumGiveaway.boost_peer = q1.h1(-chat.id);
                                tL_inputStorePaymentPremiumGiveaway.boost_peer = q1.h1(-chat.id);
                                tL_inputStorePaymentPremiumGiveaway.currency = tL_premiumGiftCodeOption3.currency;
                                tL_inputStorePaymentPremiumGiveaway.amount = tL_premiumGiftCodeOption3.amount;
                                int size7 = arrayList.size();
                                int i26 = 0;
                                while (i26 < size7) {
                                    Object obj11 = arrayList.get(i26);
                                    i26++;
                                    tL_inputStorePaymentPremiumGiveaway.countries_iso2.add(((TLRPC.TL_help_country) ((TLObject) obj11)).iso2);
                                }
                                tL_inputInvoicePremiumGiftCode.purpose = tL_inputStorePaymentPremiumGiveaway;
                                tL_inputInvoicePremiumGiftCode.option = tL_premiumGiftCodeOption3;
                                JSONObject u2 = ow0.u(dVar.getResourceProvider(), false);
                                if (u2 != null) {
                                    TLRPC.TL_dataJSON tL_dataJSON2 = new TLRPC.TL_dataJSON();
                                    tL_payments_getPaymentForm2.theme_params = tL_dataJSON2;
                                    tL_dataJSON2.data = u2.toString();
                                    tL_payments_getPaymentForm2.flags |= 1;
                                }
                                tL_payments_getPaymentForm2.invoice = tL_inputInvoicePremiumGiftCode;
                                connectionsManager.sendRequest(tL_payments_getPaymentForm2, new fn0(tn0Var3, q1, tL_inputInvoicePremiumGiftCode, dVar, tn0Var2, (byte) 0));
                                return;
                            }
                            na7 q12 = na7.q1(i22);
                            ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(y6c.t0);
                            TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway2 = new TLRPC.TL_inputStorePaymentPremiumGiveaway();
                            tL_inputStorePaymentPremiumGiveaway2.only_new_subscribers = z;
                            tL_inputStorePaymentPremiumGiveaway2.winners_are_visible = z5;
                            tL_inputStorePaymentPremiumGiveaway2.prize_description = str3;
                            tL_inputStorePaymentPremiumGiveaway2.until_date = n2;
                            int i27 = tL_inputStorePaymentPremiumGiveaway2.flags;
                            tL_inputStorePaymentPremiumGiveaway2.flags = i27 | 6;
                            if (z6) {
                                tL_inputStorePaymentPremiumGiveaway2.flags = i27 | 22;
                            }
                            tL_inputStorePaymentPremiumGiveaway2.random_id = System.currentTimeMillis();
                            tL_inputStorePaymentPremiumGiveaway2.additional_peers = new ArrayList<>();
                            int size8 = arrayList2.size();
                            int i28 = 0;
                            while (i28 < size8) {
                                Object obj12 = arrayList2.get(i28);
                                int i29 = i28 + 1;
                                TLObject tLObject2 = (TLObject) obj12;
                                if (tLObject2 instanceof TLRPC.Chat) {
                                    i = i29;
                                    tL_inputStorePaymentPremiumGiveaway2.additional_peers.add(q12.h1(-((TLRPC.Chat) tLObject2).id));
                                } else {
                                    i = i29;
                                }
                                i28 = i;
                            }
                            tL_inputStorePaymentPremiumGiveaway2.boost_peer = q12.h1(-chat.id);
                            int size9 = arrayList.size();
                            int i30 = 0;
                            while (i30 < size9) {
                                Object obj13 = arrayList.get(i30);
                                i30++;
                                tL_inputStorePaymentPremiumGiveaway2.countries_iso2.add(((TLRPC.TL_help_country) ((TLObject) obj13)).iso2);
                            }
                            ?? obj14 = new Object();
                            obj14.b = "inapp";
                            obj14.a = tL_premiumGiftCodeOption3.store_product;
                            ci0.h().o(Arrays.asList(obj14.a()), new zd(tL_inputStorePaymentPremiumGiveaway2, tL_premiumGiftCodeOption3, connectionsManager2, tn0Var3, tn0Var2, dVar, (byte) 3));
                            return;
                        }
                        i13++;
                        b2 = b2;
                    }
                    return;
                }
                return;
            case 1:
                f13 f13Var = (f13) obj3;
                u41 u41Var = (u41) obj;
                AlertDialog$Builder alertDialog$Builder4 = new AlertDialog$Builder(0, f13Var.J0, (Context) obj2);
                String M04 = k96.M0(2131748606, null);
                hd hdVar4 = alertDialog$Builder4.a;
                hdVar4.S = M04;
                hdVar4.U = k96.M0(2131748607, null);
                alertDialog$Builder4.j(k96.M0(2131745831, null), new hs0(f13Var, u41Var, this.b, (byte) 2));
                alertDialog$Builder4.g(k96.M0(2131752577, null), null);
                alertDialog$Builder4.c(-1);
                alertDialog$Builder4.o();
                return;
            default:
                cj3 cj3Var = (cj3) obj3;
                cj3Var.finishPreviewFragment();
                gl.d3(new m77(cj3Var, (t97) obj2, (TLRPC.Dialog) obj, this.b, (byte) 7), 100L);
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
