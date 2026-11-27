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
import org.telegram.ui.ActionBar.e;
public abstract class on0 {
    public static HashMap a;

    public static void a(long j, List list, pcc pccVar, pcc pccVar2) {
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(yac.t0);
        uc7 s1 = uc7.s1(yac.t0);
        TL_stories.TL_premium_applyBoost tL_premium_applyBoost = new TL_stories.TL_premium_applyBoost();
        tL_premium_applyBoost.peer = s1.j1(-j);
        tL_premium_applyBoost.flags |= 1;
        tL_premium_applyBoost.slots.addAll(list);
        connectionsManager.sendRequest(tL_premium_applyBoost, new fn0(pccVar2, s1, pccVar, (byte) 0), 66);
    }

    public static int b() {
        return (int) uc7.s1(yac.t0).l4.E0.f();
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

    public static void e(r47 r47Var, pcc pccVar, pcc pccVar2) {
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(yac.t0);
        uc7 s1 = uc7.s1(yac.t0);
        TLRPC.TL_payments_getGiveawayInfo tL_payments_getGiveawayInfo = new TLRPC.TL_payments_getGiveawayInfo();
        tL_payments_getGiveawayInfo.msg_id = r47Var.e1();
        tL_payments_getGiveawayInfo.peer = s1.j1(r47.B1(r47Var.k.peer_id));
        connectionsManager.sendRequest(tL_payments_getGiveawayInfo, new hn0(pccVar2, pccVar, (byte) 1));
    }

    public static ArrayList f(long j) {
        ArrayList arrayList = new ArrayList();
        uc7 s1 = uc7.s1(yac.t0);
        ArrayList arrayList2 = s1.y;
        for (int i = 0; i < arrayList2.size(); i++) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList2.get(i);
            if (wf3.y(dialog.id) && xc2.R(s1.M0(Long.valueOf(-dialog.id)))) {
                long j2 = dialog.id;
                if ((-j2) != j) {
                    arrayList.add(s1.j1(j2));
                }
            }
        }
        return arrayList;
    }

    public static long g() {
        return uc7.s1(yac.t0).l4.H0.f();
    }

    public static int h() {
        return (int) uc7.s1(yac.t0).l4.F0.f();
    }

    public static long i() {
        return uc7.s1(yac.t0).l4.I0.f();
    }

    public static boolean j() {
        if (f11.b()) {
            return false;
        }
        return di0.h().j();
    }

    public static boolean k() {
        if (uc7.s1(yac.t0).l4.E0.f() > 0) {
            return true;
        }
        return false;
    }

    public static int l(int i, TLRPC.Chat chat, pcc pccVar) {
        Pair pair;
        if (chat == null) {
            HashMap hashMap = a;
            List list = null;
            if (hashMap != null && (pair = (Pair) hashMap.get(Integer.valueOf(i))) != null && System.currentTimeMillis() - ((Long) pair.first).longValue() < 1800000) {
                list = (List) pair.second;
            }
            if (list != null) {
                pccVar.a(list);
                return -1;
            }
        }
        uc7 s1 = uc7.s1(i);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i);
        TLRPC.TL_payments_getPremiumGiftCodeOptions tL_payments_getPremiumGiftCodeOptions = new TLRPC.TL_payments_getPremiumGiftCodeOptions();
        if (chat != null) {
            tL_payments_getPremiumGiftCodeOptions.flags = 1;
            tL_payments_getPremiumGiftCodeOptions.boost_peer = s1.j1(-chat.id);
        }
        return connectionsManager.sendRequest(tL_payments_getPremiumGiftCodeOptions, new hb7(chat, i, pccVar, (byte) 1));
    }

    public static void m(ArrayList arrayList, TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption, TLRPC.Chat chat, TLRPC.TL_textWithEntities tL_textWithEntities, e eVar, pcc pccVar, pcc pccVar2) {
        int i = yac.t0;
        HashMap hashMap = a;
        if (hashMap != null) {
            hashMap.remove(Integer.valueOf(i));
        }
        boolean j = j();
        int i2 = yac.t0;
        if (!j) {
            uc7 s1 = uc7.s1(i2);
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(yac.t0);
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
                    tL_inputStorePaymentPremiumGiftCode.users.add(s1.q1((TLRPC.User) tLObject));
                }
            }
            if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
                tL_inputStorePaymentPremiumGiftCode.flags |= 2;
                tL_inputStorePaymentPremiumGiftCode.message = tL_textWithEntities;
            }
            if (chat != null) {
                tL_inputStorePaymentPremiumGiftCode.flags |= 1;
                tL_inputStorePaymentPremiumGiftCode.boost_peer = s1.j1(-chat.id);
            }
            tL_inputStorePaymentPremiumGiftCode.currency = tL_premiumGiftCodeOption.currency;
            tL_inputStorePaymentPremiumGiftCode.amount = tL_premiumGiftCodeOption.amount;
            tL_inputInvoicePremiumGiftCode.purpose = tL_inputStorePaymentPremiumGiftCode;
            tL_inputInvoicePremiumGiftCode.option = tL_premiumGiftCodeOption;
            JSONObject u = xw0.u(eVar.getResourceProvider(), false);
            if (u != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = u.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoicePremiumGiftCode;
            connectionsManager.sendRequest(tL_payments_getPaymentForm, new in0(pccVar2, s1, tL_inputInvoicePremiumGiftCode, eVar, pccVar, (byte) 1));
            return;
        }
        uc7 s12 = uc7.s1(i2);
        ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(yac.t0);
        TLRPC.TL_inputStorePaymentPremiumGiftCode tL_inputStorePaymentPremiumGiftCode2 = new TLRPC.TL_inputStorePaymentPremiumGiftCode();
        tL_inputStorePaymentPremiumGiftCode2.users = new ArrayList<>();
        int size2 = arrayList.size();
        int i4 = 0;
        while (i4 < size2) {
            Object obj2 = arrayList.get(i4);
            i4++;
            TLObject tLObject2 = (TLObject) obj2;
            if (tLObject2 instanceof TLRPC.User) {
                tL_inputStorePaymentPremiumGiftCode2.users.add(s12.q1((TLRPC.User) tLObject2));
            }
        }
        if (chat != null) {
            tL_inputStorePaymentPremiumGiftCode2.flags = 1;
            tL_inputStorePaymentPremiumGiftCode2.boost_peer = s12.j1(-chat.id);
        }
        if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
            tL_inputStorePaymentPremiumGiftCode2.flags |= 2;
            tL_inputStorePaymentPremiumGiftCode2.message = tL_textWithEntities;
        }
        ?? obj3 = new Object();
        obj3.b = "inapp";
        obj3.a = tL_premiumGiftCodeOption.store_product;
        di0.h().o(Arrays.asList(obj3.a()), new kh(tL_inputStorePaymentPremiumGiftCode2, tL_premiumGiftCodeOption, connectionsManager2, pccVar2, pccVar, eVar, (byte) 2));
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
