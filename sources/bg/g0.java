package bg;

import java.util.List;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.b6;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.fm0;
import org.telegram.ui.qn;
import org.telegram.ui.wm0;
import org.telegram.ui.zk0;
public final class g0 implements BillingController.ProductDetailsResponseListenerLegacy, org.telegram.ui.ActionBar.b2 {
    public final int f1768a;
    public final Object f1769b;
    public final Object f1770c;
    public final Object d;
    public final Object f1771e;
    public final Object f1772f;
    public final Object h;

    public g0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i9) {
        this.f1768a = i9;
        this.f1771e = obj;
        this.f1769b = obj2;
        this.f1770c = obj3;
        this.f1772f = obj4;
        this.h = obj5;
        this.d = obj6;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.c2 c2Var, int i9) {
        switch (this.f1768a) {
            case 2:
                TLRPC.User user = (TLRPC.User) this.f1771e;
                AccountInstance accountInstance = (AccountInstance) this.f1769b;
                qn qnVar = (qn) this.f1770c;
                TLRPC.Chat chat = (TLRPC.Chat) this.f1772f;
                MessageObject messageObject = (MessageObject) this.h;
                org.telegram.ui.Cells.z1[] z1VarArr = (org.telegram.ui.Cells.z1[]) this.d;
                if (user != null) {
                    accountInstance.getMessagesStorage().deleteUserChatHistory(qnVar.a(), user.f22527id);
                } else {
                    accountInstance.getMessagesStorage().deleteUserChatHistory(qnVar.a(), -chat.f22380id);
                }
                TLRPC.TL_contacts_blockFromReplies tL_contacts_blockFromReplies = new TLRPC.TL_contacts_blockFromReplies();
                tL_contacts_blockFromReplies.msg_id = messageObject.getId();
                tL_contacts_blockFromReplies.delete_message = true;
                tL_contacts_blockFromReplies.delete_history = true;
                if (z1VarArr[0].b()) {
                    tL_contacts_blockFromReplies.report_spam = true;
                    if (qnVar.getParentActivity() != null) {
                        qnVar.Q7();
                        UndoView undoView = qnVar.f42093u3;
                        if (undoView != null) {
                            undoView.j(74, 0L, null);
                        }
                    }
                }
                accountInstance.getConnectionsManager().sendRequest(tL_contacts_blockFromReplies, new org.telegram.ui.Components.w1(accountInstance, 0));
                return;
            default:
                fm0 fm0Var = (fm0) this.f1771e;
                wm0 wm0Var = fm0Var.f38315a;
                wm0Var.U[0].setText((String) this.f1769b);
                wm0Var.U[1].setText((String) this.f1770c);
                wm0Var.U[2].setText((String) this.f1772f);
                wm0Var.N1(true, true);
                fm0Var.c((zk0) this.h, (org.telegram.ui.Cells.e3) this.d);
                return;
        }
    }

    @Override
    public void onProductDetailsResponse(n2.g gVar, List list) {
        switch (this.f1768a) {
            case 0:
                TLRPC.TL_inputStorePaymentPremiumGiftCode tL_inputStorePaymentPremiumGiftCode = (TLRPC.TL_inputStorePaymentPremiumGiftCode) this.f1771e;
                Utilities.Callback callback = (Utilities.Callback) this.h;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.d;
                n2.i a2 = ((n2.l) list.get(0)).a();
                tL_inputStorePaymentPremiumGiftCode.currency = a2.f18324c;
                tL_inputStorePaymentPremiumGiftCode.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(((TLRPC.TL_premiumGiftCodeOption) this.f1769b).currency)) * (a2.f18323b / Math.pow(10.0d, 6.0d)));
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentPremiumGiftCode;
                ((ConnectionsManager) this.f1770c).sendRequest(tL_payments_canPurchaseStore, new n0((Utilities.Callback) this.f1772f, list, gVar, callback, o2Var, tL_inputStorePaymentPremiumGiftCode, 1));
                return;
            default:
                TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway = (TLRPC.TL_inputStorePaymentPremiumGiveaway) this.f1771e;
                z0 z0Var = (z0) this.h;
                org.telegram.ui.ActionBar.o2 o2Var2 = (org.telegram.ui.ActionBar.o2) this.d;
                n2.i a3 = ((n2.l) list.get(0)).a();
                tL_inputStorePaymentPremiumGiveaway.currency = a3.f18324c;
                tL_inputStorePaymentPremiumGiveaway.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(((TLRPC.TL_premiumGiftCodeOption) this.f1769b).currency)) * (a3.f18323b / Math.pow(10.0d, 6.0d)));
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore2 = new TLRPC.TL_payments_canPurchaseStore();
                tL_payments_canPurchaseStore2.purpose = tL_inputStorePaymentPremiumGiveaway;
                ((ConnectionsManager) this.f1770c).sendRequest(tL_payments_canPurchaseStore2, new n0((z0) this.f1772f, list, gVar, z0Var, o2Var2, tL_inputStorePaymentPremiumGiveaway, 0));
                return;
        }
    }

    public g0(TLRPC.User user, AccountInstance accountInstance, qn qnVar, TLRPC.Chat chat, MessageObject messageObject, org.telegram.ui.Cells.z1[] z1VarArr, b6 b6Var) {
        this.f1768a = 2;
        this.f1771e = user;
        this.f1769b = accountInstance;
        this.f1770c = qnVar;
        this.f1772f = chat;
        this.h = messageObject;
        this.d = z1VarArr;
    }
}
