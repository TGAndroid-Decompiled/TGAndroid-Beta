package defpackage;

import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.d;
public abstract class oo0 {
    public static HashMap a;

    public static void a(long j, List list, qac qacVar, qac qacVar2) {
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(z8c.t0);
        oc7 r1 = oc7.r1(z8c.t0);
        TL_stories.TL_premium_applyBoost tL_premium_applyBoost = new TL_stories.TL_premium_applyBoost();
        tL_premium_applyBoost.peer = r1.i1(-j);
        tL_premium_applyBoost.flags |= 1;
        tL_premium_applyBoost.slots.addAll(list);
        connectionsManager.sendRequest(tL_premium_applyBoost, new eo0(qacVar2, r1, qacVar, (byte) 0), 66);
    }

    public static int b() {
        return (int) oc7.r1(z8c.t0).l4.w0.f();
    }

    public static ArrayList c(int i, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) it.next();
            String str = tL_premiumGiftCodeOption.store_product;
            if (tL_premiumGiftCodeOption.users == i) {
                arrayList.add(tL_premiumGiftCodeOption);
            }
        }
        if (arrayList.isEmpty()) {
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption2 = (TLRPC.TL_premiumGiftCodeOption) it2.next();
                if (tL_premiumGiftCodeOption2.users == 1) {
                    arrayList.add(tL_premiumGiftCodeOption2);
                }
            }
        }
        return arrayList;
    }

    public static List d(ArrayList arrayList) {
        if (j()) {
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            int i = 0;
            while (i < size) {
                Object obj = arrayList.get(i);
                i++;
                TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) obj;
                if (tL_premiumGiftCodeOption.store_product != null) {
                    arrayList2.add(tL_premiumGiftCodeOption);
                }
            }
            return arrayList2;
        }
        return arrayList;
    }

    public static void e(k47 k47Var, qac qacVar, qac qacVar2) {
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(z8c.t0);
        oc7 r1 = oc7.r1(z8c.t0);
        TLRPC.TL_payments_getGiveawayInfo tL_payments_getGiveawayInfo = new TLRPC.TL_payments_getGiveawayInfo();
        tL_payments_getGiveawayInfo.msg_id = k47Var.e1();
        tL_payments_getGiveawayInfo.peer = r1.i1(k47.B1(k47Var.k.peer_id));
        connectionsManager.sendRequest(tL_payments_getGiveawayInfo, new ho0(qacVar2, qacVar, (byte) 1));
    }

    public static ArrayList f(long j) {
        ArrayList arrayList = new ArrayList();
        oc7 r1 = oc7.r1(z8c.t0);
        ArrayList arrayList2 = r1.y;
        for (int i = 0; i < arrayList2.size(); i++) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList2.get(i);
            if (pg3.y(dialog.id) && sd2.R(r1.L0(Long.valueOf(-dialog.id)))) {
                long j2 = dialog.id;
                if ((-j2) != j) {
                    arrayList.add(r1.i1(j2));
                }
            }
        }
        return arrayList;
    }

    public static long g() {
        return oc7.r1(z8c.t0).l4.z0.f();
    }

    public static int h() {
        return (int) oc7.r1(z8c.t0).l4.x0.f();
    }

    public static long i() {
        return oc7.r1(z8c.t0).l4.A0.f();
    }

    public static boolean j() {
        if (e21.b()) {
            return false;
        }
        return cj0.h().j();
    }

    public static boolean k() {
        if (oc7.r1(z8c.t0).l4.w0.f() > 0) {
            return true;
        }
        return false;
    }

    public static int l(int i, TLRPC.Chat chat, qac qacVar) {
        Pair pair;
        if (chat == null) {
            HashMap hashMap = a;
            List list = null;
            if (hashMap != null && (pair = (Pair) hashMap.get(Integer.valueOf(i))) != null && System.currentTimeMillis() - ((Long) pair.first).longValue() < 1800000) {
                list = (List) pair.second;
            }
            if (list != null) {
                qacVar.a(list);
                return -1;
            }
        }
        oc7 r1 = oc7.r1(i);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i);
        TLRPC.TL_payments_getPremiumGiftCodeOptions tL_payments_getPremiumGiftCodeOptions = new TLRPC.TL_payments_getPremiumGiftCodeOptions();
        if (chat != null) {
            tL_payments_getPremiumGiftCodeOptions.flags = 1;
            tL_payments_getPremiumGiftCodeOptions.boost_peer = r1.i1(-chat.id);
        }
        return connectionsManager.sendRequest(tL_payments_getPremiumGiftCodeOptions, new cb7(chat, i, qacVar, (byte) 1));
    }

    public static void m(ArrayList arrayList, TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption, TLRPC.Chat chat, TLRPC.TL_textWithEntities tL_textWithEntities, d dVar, qac qacVar, qac qacVar2) {
        int i = z8c.t0;
        HashMap hashMap = a;
        if (hashMap != null) {
            hashMap.remove(Integer.valueOf(i));
        }
        boolean j = j();
        int i2 = z8c.t0;
        if (!j) {
            oc7 r1 = oc7.r1(i2);
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(z8c.t0);
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            TLRPC.TL_inputInvoicePremiumGiftCode tL_inputInvoicePremiumGiftCode = new TLRPC.TL_inputInvoicePremiumGiftCode();
            TLRPC.TL_inputStorePaymentPremiumGiftCode tL_inputStorePaymentPremiumGiftCode = new TLRPC.TL_inputStorePaymentPremiumGiftCode();
            tL_inputStorePaymentPremiumGiftCode.users = new ArrayList<>();
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                Object obj = arrayList.get(i3);
                i3++;
                TLObject tLObject = (TLObject) obj;
                if (tLObject instanceof TLRPC.User) {
                    tL_inputStorePaymentPremiumGiftCode.users.add(r1.p1((TLRPC.User) tLObject));
                }
            }
            if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
                tL_inputStorePaymentPremiumGiftCode.flags |= 2;
                tL_inputStorePaymentPremiumGiftCode.message = tL_textWithEntities;
            }
            if (chat != null) {
                tL_inputStorePaymentPremiumGiftCode.flags |= 1;
                tL_inputStorePaymentPremiumGiftCode.boost_peer = r1.i1(-chat.id);
            }
            tL_inputStorePaymentPremiumGiftCode.currency = tL_premiumGiftCodeOption.currency;
            tL_inputStorePaymentPremiumGiftCode.amount = tL_premiumGiftCodeOption.amount;
            tL_inputInvoicePremiumGiftCode.purpose = tL_inputStorePaymentPremiumGiftCode;
            tL_inputInvoicePremiumGiftCode.option = tL_premiumGiftCodeOption;
            JSONObject u = wx0.u(dVar.getResourceProvider(), false);
            if (u != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = u.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoicePremiumGiftCode;
            connectionsManager.sendRequest(tL_payments_getPaymentForm, new fo0(qacVar2, r1, tL_inputInvoicePremiumGiftCode, dVar, qacVar, (byte) 1));
            return;
        }
        oc7 r12 = oc7.r1(i2);
        ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(z8c.t0);
        TLRPC.TL_inputStorePaymentPremiumGiftCode tL_inputStorePaymentPremiumGiftCode2 = new TLRPC.TL_inputStorePaymentPremiumGiftCode();
        tL_inputStorePaymentPremiumGiftCode2.users = new ArrayList<>();
        int size2 = arrayList.size();
        int i4 = 0;
        while (i4 < size2) {
            Object obj2 = arrayList.get(i4);
            i4++;
            TLObject tLObject2 = (TLObject) obj2;
            if (tLObject2 instanceof TLRPC.User) {
                tL_inputStorePaymentPremiumGiftCode2.users.add(r12.p1((TLRPC.User) tLObject2));
            }
        }
        if (chat != null) {
            tL_inputStorePaymentPremiumGiftCode2.flags = 1;
            tL_inputStorePaymentPremiumGiftCode2.boost_peer = r12.i1(-chat.id);
        }
        if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
            tL_inputStorePaymentPremiumGiftCode2.flags |= 2;
            tL_inputStorePaymentPremiumGiftCode2.message = tL_textWithEntities;
        }
        ?? obj3 = new Object();
        obj3.b = "inapp";
        obj3.a = tL_premiumGiftCodeOption.store_product;
        cj0.h().o(Arrays.asList(obj3.a()), new ze(tL_inputStorePaymentPremiumGiftCode2, tL_premiumGiftCodeOption, connectionsManager2, qacVar2, qacVar, dVar, (byte) 2));
    }

    public static int n(long j) {
        if (j < System.currentTimeMillis() + 120000) {
            j = System.currentTimeMillis() + 120000;
        }
        return (int) (j / 1000);
    }

    public static void o(int i, ArrayList arrayList) {
        HashMap hashMap = a;
        if (hashMap == null) {
            hashMap = new HashMap();
            a = hashMap;
        }
        hashMap.put(Integer.valueOf(i), new Pair(Long.valueOf(System.currentTimeMillis()), arrayList));
    }
}
