package hg;

import android.text.TextUtils;
import android.util.Pair;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import org.json.JSONObject;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.BuildVars;
import org.telegram.messenger.ChatObject;
import org.telegram.messenger.DialogObject;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.MessagesController;
import org.telegram.messenger.UserConfig;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_stories;
public abstract class p0 {
    public static HashMap f7587a;

    public static void a(long j10, List list, Utilities.Callback callback, Utilities.Callback callback2) {
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
        MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
        TL_stories.TL_premium_applyBoost tL_premium_applyBoost = new TL_stories.TL_premium_applyBoost();
        tL_premium_applyBoost.peer = messagesController.getInputPeer(-j10);
        tL_premium_applyBoost.flags |= 1;
        tL_premium_applyBoost.slots.addAll(list);
        connectionsManager.sendRequest(tL_premium_applyBoost, new y(callback2, messagesController, callback, 0), 66);
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

    public static void d(MessageObject messageObject, Utilities.Callback callback, Utilities.Callback callback2) {
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
        MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
        TLRPC.TL_payments_getGiveawayInfo tL_payments_getGiveawayInfo = new TLRPC.TL_payments_getGiveawayInfo();
        tL_payments_getGiveawayInfo.msg_id = messageObject.getId();
        tL_payments_getGiveawayInfo.peer = messagesController.getInputPeer(MessageObject.getPeerId(messageObject.messageOwner.peer_id));
        connectionsManager.sendRequest(tL_payments_getGiveawayInfo, new f0(callback2, callback, 1));
    }

    public static ArrayList e(long j10) {
        ArrayList arrayList = new ArrayList();
        MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
        ArrayList<TLRPC.Dialog> allDialogs = messagesController.getAllDialogs();
        for (int i10 = 0; i10 < allDialogs.size(); i10++) {
            TLRPC.Dialog dialog = allDialogs.get(i10);
            if (DialogObject.isChatDialog(dialog.f20849id) && ChatObject.isBoostSupported(messagesController.getChat(Long.valueOf(-dialog.f20849id)))) {
                long j11 = dialog.f20849id;
                if ((-j11) != j10) {
                    arrayList.add(messagesController.getInputPeer(j11));
                }
            }
        }
        return arrayList;
    }

    public static long f() {
        return MessagesController.getInstance(UserConfig.selectedAccount).giveawayAddPeersMax;
    }

    public static int g() {
        return (int) MessagesController.getInstance(UserConfig.selectedAccount).giveawayBoostsPerPremium;
    }

    public static boolean h() {
        if (BuildVars.useInvoiceBilling()) {
            return false;
        }
        return BillingController.getInstance().isReady();
    }

    public static boolean i() {
        if (MessagesController.getInstance(UserConfig.selectedAccount).boostsPerSentGift > 0) {
            return true;
        }
        return false;
    }

    public static int j(int i10, TLRPC.Chat chat, Utilities.Callback callback) {
        Pair pair;
        if (chat == null) {
            HashMap hashMap = f7587a;
            List list = null;
            if (hashMap != null && (pair = (Pair) hashMap.get(Integer.valueOf(i10))) != null && System.currentTimeMillis() - ((Long) pair.first).longValue() < 1800000) {
                list = (List) pair.second;
            }
            if (list != null) {
                callback.run(list);
                return -1;
            }
        }
        MessagesController messagesController = MessagesController.getInstance(i10);
        ConnectionsManager connectionsManager = ConnectionsManager.getInstance(i10);
        TLRPC.TL_payments_getPremiumGiftCodeOptions tL_payments_getPremiumGiftCodeOptions = new TLRPC.TL_payments_getPremiumGiftCodeOptions();
        if (chat != null) {
            tL_payments_getPremiumGiftCodeOptions.flags = 1;
            tL_payments_getPremiumGiftCodeOptions.boost_peer = messagesController.getInputPeer(-chat.f20845id);
        }
        return connectionsManager.sendRequest(tL_payments_getPremiumGiftCodeOptions, new l0(chat, i10, callback, 0));
    }

    public static void k(ArrayList arrayList, TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption, TLRPC.Chat chat, TLRPC.TL_textWithEntities tL_textWithEntities, org.telegram.ui.ActionBar.p2 p2Var, Utilities.Callback callback, Utilities.Callback callback2) {
        int i10 = UserConfig.selectedAccount;
        HashMap hashMap = f7587a;
        if (hashMap != null) {
            hashMap.remove(Integer.valueOf(i10));
        }
        if (!h()) {
            MessagesController messagesController = MessagesController.getInstance(UserConfig.selectedAccount);
            ConnectionsManager connectionsManager = ConnectionsManager.getInstance(UserConfig.selectedAccount);
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
                    tL_inputStorePaymentPremiumGiftCode.users.add(messagesController.getInputUser((TLRPC.User) tLObject));
                }
            }
            if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
                tL_inputStorePaymentPremiumGiftCode.flags |= 2;
                tL_inputStorePaymentPremiumGiftCode.message = tL_textWithEntities;
            }
            if (chat != null) {
                tL_inputStorePaymentPremiumGiftCode.flags |= 1;
                tL_inputStorePaymentPremiumGiftCode.boost_peer = messagesController.getInputPeer(-chat.f20845id);
            }
            tL_inputStorePaymentPremiumGiftCode.currency = tL_premiumGiftCodeOption.currency;
            tL_inputStorePaymentPremiumGiftCode.amount = tL_premiumGiftCodeOption.amount;
            tL_inputInvoicePremiumGiftCode.purpose = tL_inputStorePaymentPremiumGiftCode;
            tL_inputInvoicePremiumGiftCode.option = tL_premiumGiftCodeOption;
            JSONObject p10 = sh.p2.p(p2Var.getResourceProvider(), false);
            if (p10 != null) {
                TLRPC.TL_dataJSON tL_dataJSON = new TLRPC.TL_dataJSON();
                tL_payments_getPaymentForm.theme_params = tL_dataJSON;
                tL_dataJSON.data = p10.toString();
                tL_payments_getPaymentForm.flags |= 1;
            }
            tL_payments_getPaymentForm.invoice = tL_inputInvoicePremiumGiftCode;
            connectionsManager.sendRequest(tL_payments_getPaymentForm, new e0(callback2, messagesController, tL_inputInvoicePremiumGiftCode, p2Var, callback, 1));
            return;
        }
        MessagesController messagesController2 = MessagesController.getInstance(UserConfig.selectedAccount);
        ConnectionsManager connectionsManager2 = ConnectionsManager.getInstance(UserConfig.selectedAccount);
        TLRPC.TL_inputStorePaymentPremiumGiftCode tL_inputStorePaymentPremiumGiftCode2 = new TLRPC.TL_inputStorePaymentPremiumGiftCode();
        tL_inputStorePaymentPremiumGiftCode2.users = new ArrayList<>();
        int size2 = arrayList.size();
        int i12 = 0;
        while (i12 < size2) {
            Object obj2 = arrayList.get(i12);
            i12++;
            TLObject tLObject2 = (TLObject) obj2;
            if (tLObject2 instanceof TLRPC.User) {
                tL_inputStorePaymentPremiumGiftCode2.users.add(messagesController2.getInputUser((TLRPC.User) tLObject2));
            }
        }
        if (chat != null) {
            tL_inputStorePaymentPremiumGiftCode2.flags = 1;
            tL_inputStorePaymentPremiumGiftCode2.boost_peer = messagesController2.getInputPeer(-chat.f20845id);
        }
        if (tL_textWithEntities != null && !TextUtils.isEmpty(tL_textWithEntities.text)) {
            tL_inputStorePaymentPremiumGiftCode2.flags |= 2;
            tL_inputStorePaymentPremiumGiftCode2.message = tL_textWithEntities;
        }
        b6.h hVar = new b6.h();
        hVar.f1729c = "inapp";
        hVar.f1728b = tL_premiumGiftCodeOption.store_product;
        BillingController.getInstance().queryProductDetails(Arrays.asList(hVar.a()), new d0(tL_inputStorePaymentPremiumGiftCode2, tL_premiumGiftCodeOption, connectionsManager2, callback2, callback, p2Var, 0));
    }

    public static int l(long j10) {
        if (j10 < System.currentTimeMillis() + 120000) {
            j10 = System.currentTimeMillis() + 120000;
        }
        return (int) (j10 / 1000);
    }

    public static void m(int i10, ArrayList arrayList) {
        if (f7587a == null) {
            f7587a = new HashMap();
        }
        f7587a.put(Integer.valueOf(i10), new Pair(Long.valueOf(System.currentTimeMillis()), arrayList));
    }
}
