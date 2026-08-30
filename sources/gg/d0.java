package gg;

import java.util.List;
import n7.qa;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.f6;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.dn0;
import org.telegram.ui.el0;
import org.telegram.ui.lm0;
import org.telegram.ui.xn;
public final class d0 implements BillingController.ProductDetailsResponseListenerLegacy, org.telegram.ui.ActionBar.c2 {
    public final int f6602a;
    public final Object f6603b;
    public final Object f6604c;
    public final Object d;
    public final Object e;
    public final Object f6605f;
    public final Object h;

    public d0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f6602a = i10;
        this.e = obj;
        this.f6603b = obj2;
        this.f6604c = obj3;
        this.f6605f = obj4;
        this.h = obj5;
        this.d = obj6;
    }

    @Override
    public void i(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f6602a) {
            case 2:
                TLRPC.User user = (TLRPC.User) this.e;
                AccountInstance accountInstance = (AccountInstance) this.f6603b;
                xn xnVar = (xn) this.f6604c;
                TLRPC.Chat chat = (TLRPC.Chat) this.f6605f;
                MessageObject messageObject = (MessageObject) this.h;
                org.telegram.ui.Cells.z1[] z1VarArr = (org.telegram.ui.Cells.z1[]) this.d;
                if (user != null) {
                    accountInstance.getMessagesStorage().deleteUserChatHistory(xnVar.a(), user.f19331id);
                } else {
                    accountInstance.getMessagesStorage().deleteUserChatHistory(xnVar.a(), -chat.f19184id);
                }
                TLRPC.TL_contacts_blockFromReplies tL_contacts_blockFromReplies = new TLRPC.TL_contacts_blockFromReplies();
                tL_contacts_blockFromReplies.msg_id = messageObject.getId();
                tL_contacts_blockFromReplies.delete_message = true;
                tL_contacts_blockFromReplies.delete_history = true;
                if (z1VarArr[0].b()) {
                    tL_contacts_blockFromReplies.report_spam = true;
                    if (xnVar.getParentActivity() != null) {
                        xnVar.Q7();
                        UndoView undoView = xnVar.f40209v3;
                        if (undoView != null) {
                            undoView.j(74, 0L, null);
                        }
                    }
                }
                accountInstance.getConnectionsManager().sendRequest(tL_contacts_blockFromReplies, new org.telegram.ui.Components.y1(accountInstance, 0));
                return;
            default:
                lm0 lm0Var = (lm0) this.e;
                dn0 dn0Var = lm0Var.f36108a;
                dn0Var.V[0].setText((String) this.f6603b);
                dn0Var.V[1].setText((String) this.f6604c);
                dn0Var.V[2].setText((String) this.f6605f);
                dn0Var.N1(true, true);
                lm0Var.c((el0) this.h, (qa) this.d);
                return;
        }
    }

    @Override
    public void onProductDetailsResponse(p2.h hVar, List list) {
        switch (this.f6602a) {
            case 0:
                TLRPC.TL_inputStorePaymentPremiumGiftCode tL_inputStorePaymentPremiumGiftCode = (TLRPC.TL_inputStorePaymentPremiumGiftCode) this.e;
                Utilities.Callback callback = (Utilities.Callback) this.h;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.d;
                p2.k a2 = ((p2.n) list.get(0)).a();
                tL_inputStorePaymentPremiumGiftCode.currency = a2.f40999c;
                tL_inputStorePaymentPremiumGiftCode.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(((TLRPC.TL_premiumGiftCodeOption) this.f6603b).currency)) * (a2.f40998b / Math.pow(10.0d, 6.0d)));
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentPremiumGiftCode;
                ((ConnectionsManager) this.f6604c).sendRequest(tL_payments_canPurchaseStore, new i0((Utilities.Callback) this.f6605f, list, hVar, callback, p2Var, tL_inputStorePaymentPremiumGiftCode, 1));
                return;
            default:
                TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway = (TLRPC.TL_inputStorePaymentPremiumGiveaway) this.e;
                t0 t0Var = (t0) this.h;
                org.telegram.ui.ActionBar.p2 p2Var2 = (org.telegram.ui.ActionBar.p2) this.d;
                p2.k a10 = ((p2.n) list.get(0)).a();
                tL_inputStorePaymentPremiumGiveaway.currency = a10.f40999c;
                tL_inputStorePaymentPremiumGiveaway.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(((TLRPC.TL_premiumGiftCodeOption) this.f6603b).currency)) * (a10.f40998b / Math.pow(10.0d, 6.0d)));
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore2 = new TLRPC.TL_payments_canPurchaseStore();
                tL_payments_canPurchaseStore2.purpose = tL_inputStorePaymentPremiumGiveaway;
                ((ConnectionsManager) this.f6604c).sendRequest(tL_payments_canPurchaseStore2, new i0((t0) this.f6605f, list, hVar, t0Var, p2Var2, tL_inputStorePaymentPremiumGiveaway, 0));
                return;
        }
    }

    public d0(TLRPC.User user, AccountInstance accountInstance, xn xnVar, TLRPC.Chat chat, MessageObject messageObject, org.telegram.ui.Cells.z1[] z1VarArr, f6 f6Var) {
        this.f6602a = 2;
        this.e = user;
        this.f6603b = accountInstance;
        this.f6604c = xnVar;
        this.f6605f = chat;
        this.h = messageObject;
        this.d = z1VarArr;
    }
}
