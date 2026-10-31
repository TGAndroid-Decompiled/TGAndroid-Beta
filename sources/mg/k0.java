package mg;

import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import org.telegram.messenger.d20;
import org.telegram.messenger.jj;
import org.telegram.messenger.o5;
import org.telegram.messenger.q20;
import org.telegram.messenger.v2;
import org.telegram.messenger.vp;
import org.telegram.messenger.w3;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
import org.telegram.ui.ActionBar.k2;
import xh.m2;
public abstract class k0 {
    public static HashMap f13177a;

    public static void a(long j10, List list, q20 q20Var, q20 q20Var2) {
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(d20.f15147s0);
        vp r12 = vp.r1(d20.f15147s0);
        TL_stories.TL_premium_applyBoost tL_premium_applyBoost = new TL_stories.TL_premium_applyBoost();
        tL_premium_applyBoost.peer = r12.i1(-j10);
        tL_premium_applyBoost.flags |= 1;
        tL_premium_applyBoost.slots.addAll(list);
        connectionsManager.sendRequest(tL_premium_applyBoost, new ag.p0(q20Var2, r12, q20Var, 3), 66);
    }

    public static ArrayList b(int i10, List list) {
        ArrayList arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) it.next();
            String str = tL_premiumGiftCodeOption.store_product;
            if (tL_premiumGiftCodeOption.users == i10) {
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

    public static List c(ArrayList arrayList) {
        if (h()) {
            ArrayList arrayList2 = new ArrayList();
            int size = arrayList.size();
            int i10 = 0;
            while (i10 < size) {
                Object obj = arrayList.get(i10);
                i10++;
                TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) obj;
                if (tL_premiumGiftCodeOption.store_product != null) {
                    arrayList2.add(tL_premiumGiftCodeOption);
                }
            }
            return arrayList2;
        }
        return arrayList;
    }

    public static void d(jj jjVar, q20 q20Var, q20 q20Var2) {
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(d20.f15147s0);
        vp r12 = vp.r1(d20.f15147s0);
        TLRPC.TL_payments_getGiveawayInfo tL_payments_getGiveawayInfo = new TLRPC.TL_payments_getGiveawayInfo();
        tL_payments_getGiveawayInfo.msg_id = jjVar.f1();
        tL_payments_getGiveawayInfo.peer = r12.i1(jj.C1(jjVar.f16337k.peer_id));
        connectionsManager.sendRequest(tL_payments_getGiveawayInfo, new b0(q20Var2, q20Var, 1));
    }

    public static ArrayList e(long j10) {
        ArrayList arrayList = new ArrayList();
        vp r12 = vp.r1(d20.f15147s0);
        ArrayList arrayList2 = r12.f18950y;
        for (int i10 = 0; i10 < arrayList2.size(); i10++) {
            TLRPC.Dialog dialog = (TLRPC.Dialog) arrayList2.get(i10);
            if (o5.z(dialog.f19797id) && w3.R(r12.L0(Long.valueOf(-dialog.f19797id)))) {
                long j11 = dialog.f19797id;
                if ((-j11) != j10) {
                    arrayList.add(r12.i1(j11));
                }
            }
        }
        return arrayList;
    }

    public static long f() {
        return vp.r1(d20.f15147s0).f18849n0;
    }

    public static int g() {
        return (int) vp.r1(d20.f15147s0).f18875q0;
    }

    public static boolean h() {
        if (v2.b()) {
            return false;
        }
        return org.telegram.messenger.u1.i().k();
    }

    public static boolean i() {
        if (vp.r1(d20.f15147s0).f18884r0 > 0) {
            return true;
        }
        return false;
    }

    public static int j(int i10, TLRPC.Chat chat, q20 q20Var) {
        Pair pair;
        if (chat == null) {
            HashMap hashMap = f13177a;
            List list = null;
            if (hashMap != null && (pair = (Pair) hashMap.get(Integer.valueOf(i10))) != null && System.currentTimeMillis() - ((Long) pair.first).longValue() < 1800000) {
                list = (List) pair.second;
            }
            if (list != null) {
                q20Var.a(list);
                return -1;
            }
        }
        vp r12 = vp.r1(i10);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
        TLRPC.TL_payments_getPremiumGiftCodeOptions tL_payments_getPremiumGiftCodeOptions = new TLRPC.TL_payments_getPremiumGiftCodeOptions();
        if (chat != null) {
            tL_payments_getPremiumGiftCodeOptions.flags = 1;
            tL_payments_getPremiumGiftCodeOptions.boost_peer = r12.i1(-chat.f19793id);
        }
        return connectionsManager.sendRequest(tL_payments_getPremiumGiftCodeOptions, new w(chat, i10, q20Var, 0));
    }

    public static void k(ArrayList arrayList, TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption, TLRPC.Chat chat, TLRPC.TL_textWithEntities tL_textWithEntities, k2 k2Var, q20 q20Var, q20 q20Var2) {
        int i10 = d20.f15147s0;
        HashMap hashMap = f13177a;
        if (hashMap != null) {
            hashMap.remove(Integer.valueOf(i10));
        }
        if (!h()) {
            vp r12 = vp.r1(d20.f15147s0);
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(d20.f15147s0);
            TLRPC.TL_payments_getPaymentForm tL_payments_getPaymentForm = new TLRPC.TL_payments_getPaymentForm();
            TLRPC.TL_inputInvoicePremiumGiftCode tL_inputInvoicePremiumGiftCode = new TLRPC.TL_inputInvoicePremiumGiftCode();
            TLRPC.TL_inputStorePaymentPremiumGiftCode tL_inputStorePaymentPremiumGiftCode = new TLRPC.TL_inputStorePaymentPremiumGiftCode();
            tL_inputStorePaymentPremiumGiftCode.users = new ArrayList<>();
            int size = arrayList.size();
            int i11 = 0;
            while (i11 < size) {
                Object obj = arrayList.get(i11);
                i11++;
                TLObject tLObject = (TLObject) obj;
                if (tLObject instanceof TLRPC.User) {
                    tL_inputStorePaymentPremiumGiftCode.users.add(r12.p1((TLRPC.User) tLObject));
                }
            }
            if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
                tL_inputStorePaymentPremiumGiftCode.flags |= 2;
                tL_inputStorePaymentPremiumGiftCode.message = tL_textWithEntities;
            }
            if (chat != null) {
                tL_inputStorePaymentPremiumGiftCode.flags |= 1;
                tL_inputStorePaymentPremiumGiftCode.boost_peer = r12.i1(-chat.f19793id);
            }
            tL_inputStorePaymentPremiumGiftCode.currency = tL_premiumGiftCodeOption.currency;
            tL_inputStorePaymentPremiumGiftCode.amount = tL_premiumGiftCodeOption.amount;
            tL_inputInvoicePremiumGiftCode.purpose = tL_inputStorePaymentPremiumGiftCode;
            tL_inputInvoicePremiumGiftCode.option = tL_premiumGiftCodeOption;
            JSONObject u10 = m2.u(k2Var.getResourceProvider(), false);
            if (u10 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = u10.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoicePremiumGiftCode;
            connectionsManager.sendRequest(tL_payments_getPaymentForm, new z(q20Var2, r12, tL_inputInvoicePremiumGiftCode, k2Var, q20Var, 1));
            return;
        }
        vp r13 = vp.r1(d20.f15147s0);
        ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(d20.f15147s0);
        TLRPC.TL_inputStorePaymentPremiumGiftCode tL_inputStorePaymentPremiumGiftCode2 = new TLRPC.TL_inputStorePaymentPremiumGiftCode();
        tL_inputStorePaymentPremiumGiftCode2.users = new ArrayList<>();
        int size2 = arrayList.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList.get(i12);
            i12++;
            TLObject tLObject2 = (TLObject) obj2;
            if (tLObject2 instanceof TLRPC.User) {
                tL_inputStorePaymentPremiumGiftCode2.users.add(r13.p1((TLRPC.User) tLObject2));
            }
        }
        if (chat != null) {
            tL_inputStorePaymentPremiumGiftCode2.flags = 1;
            tL_inputStorePaymentPremiumGiftCode2.boost_peer = r13.i1(-chat.f19793id);
        }
        if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
            tL_inputStorePaymentPremiumGiftCode2.flags |= 2;
            tL_inputStorePaymentPremiumGiftCode2.message = tL_textWithEntities;
        }
        c5.a aVar = new c5.a();
        aVar.f3732c = "inapp";
        aVar.f3731b = tL_premiumGiftCodeOption.store_product;
        org.telegram.messenger.u1.i().o(Arrays.asList(aVar.a()), new y(tL_inputStorePaymentPremiumGiftCode2, tL_premiumGiftCodeOption, connectionsManager2, q20Var2, q20Var, k2Var, 0));
    }

    public static int l(long j10) {
        if (j10 < System.currentTimeMillis() + 120000) {
            j10 = System.currentTimeMillis() + 120000;
        }
        return (int) (j10 / 1000);
    }

    public static void m(int i10, ArrayList arrayList) {
        if (f13177a == null) {
            f13177a = new HashMap();
        }
        f13177a.put(Integer.valueOf(i10), new Pair(Long.valueOf(System.currentTimeMillis()), arrayList));
    }
}
