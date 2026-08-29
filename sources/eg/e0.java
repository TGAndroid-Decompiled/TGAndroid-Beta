package eg;

import java.util.List;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.dm0;
import org.telegram.ui.tn;
import org.telegram.ui.vk0;
import org.telegram.ui.vm0;
public final class e0 implements BillingController.ProductDetailsResponseListenerLegacy, org.telegram.ui.ActionBar.b2 {
    public final int f5975a;
    public final Object f5976b;
    public final Object f5977c;
    public final Object d;
    public final Object f5978e;
    public final Object f5979f;
    public final Object h;

    public e0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f5975a = i10;
        this.f5978e = obj;
        this.f5976b = obj2;
        this.f5977c = obj3;
        this.f5979f = obj4;
        this.h = obj5;
        this.d = obj6;
    }

    @Override
    public void g(org.telegram.ui.ActionBar.c2 c2Var, int i10) {
        switch (this.f5975a) {
            case 2:
                TLRPC.User user = (TLRPC.User) this.f5978e;
                AccountInstance accountInstance = (AccountInstance) this.f5976b;
                tn tnVar = (tn) this.f5977c;
                TLRPC.Chat chat = (TLRPC.Chat) this.f5979f;
                MessageObject messageObject = (MessageObject) this.h;
                org.telegram.ui.Cells.y1[] y1VarArr = (org.telegram.ui.Cells.y1[]) this.d;
                if (user != null) {
                    accountInstance.getMessagesStorage().deleteUserChatHistory(tnVar.a(), user.f22539id);
                } else {
                    accountInstance.getMessagesStorage().deleteUserChatHistory(tnVar.a(), -chat.f22392id);
                }
                TLRPC.TL_contacts_blockFromReplies tL_contacts_blockFromReplies = new TLRPC.TL_contacts_blockFromReplies();
                tL_contacts_blockFromReplies.msg_id = messageObject.getId();
                tL_contacts_blockFromReplies.delete_message = true;
                tL_contacts_blockFromReplies.delete_history = true;
                if (y1VarArr[0].b()) {
                    tL_contacts_blockFromReplies.report_spam = true;
                    if (tnVar.getParentActivity() != null) {
                        tnVar.Q7();
                        UndoView undoView = tnVar.f42989u3;
                        if (undoView != null) {
                            undoView.j(74, 0L, null);
                        }
                    }
                }
                accountInstance.getConnectionsManager().sendRequest(tL_contacts_blockFromReplies, new org.telegram.ui.Components.a2(accountInstance, 0));
                return;
            default:
                dm0 dm0Var = (dm0) this.f5978e;
                vm0 vm0Var = dm0Var.f37561a;
                vm0Var.U[0].setText((String) this.f5976b);
                vm0Var.U[1].setText((String) this.f5977c);
                vm0Var.U[2].setText((String) this.f5979f);
                vm0Var.N1(true, true);
                dm0Var.c((vk0) this.h, (oc.i) this.d);
                return;
        }
    }

    @Override
    public void onProductDetailsResponse(p2.g gVar, List list) {
        switch (this.f5975a) {
            case 0:
                TLRPC.TL_inputStorePaymentPremiumGiftCode tL_inputStorePaymentPremiumGiftCode = (TLRPC.TL_inputStorePaymentPremiumGiftCode) this.f5978e;
                Utilities.Callback callback = (Utilities.Callback) this.h;
                org.telegram.ui.ActionBar.o2 o2Var = (org.telegram.ui.ActionBar.o2) this.d;
                p2.i a2 = ((p2.l) list.get(0)).a();
                tL_inputStorePaymentPremiumGiftCode.currency = a2.f45462c;
                tL_inputStorePaymentPremiumGiftCode.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(((TLRPC.TL_premiumGiftCodeOption) this.f5976b).currency)) * (a2.f45461b / Math.pow(10.0d, 6.0d)));
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentPremiumGiftCode;
                ((ConnectionsManager) this.f5977c).sendRequest(tL_payments_canPurchaseStore, new j0((Utilities.Callback) this.f5979f, list, gVar, callback, o2Var, tL_inputStorePaymentPremiumGiftCode, 1));
                return;
            default:
                TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway = (TLRPC.TL_inputStorePaymentPremiumGiveaway) this.f5978e;
                u0 u0Var = (u0) this.h;
                org.telegram.ui.ActionBar.o2 o2Var2 = (org.telegram.ui.ActionBar.o2) this.d;
                p2.i a10 = ((p2.l) list.get(0)).a();
                tL_inputStorePaymentPremiumGiveaway.currency = a10.f45462c;
                tL_inputStorePaymentPremiumGiveaway.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(((TLRPC.TL_premiumGiftCodeOption) this.f5976b).currency)) * (a10.f45461b / Math.pow(10.0d, 6.0d)));
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore2 = new TLRPC.TL_payments_canPurchaseStore();
                tL_payments_canPurchaseStore2.purpose = tL_inputStorePaymentPremiumGiveaway;
                ((ConnectionsManager) this.f5977c).sendRequest(tL_payments_canPurchaseStore2, new j0((u0) this.f5979f, list, gVar, u0Var, o2Var2, tL_inputStorePaymentPremiumGiveaway, 0));
                return;
        }
    }

    public e0(TLRPC.User user, AccountInstance accountInstance, tn tnVar, TLRPC.Chat chat, MessageObject messageObject, org.telegram.ui.Cells.y1[] y1VarArr, c6 c6Var) {
        this.f5975a = 2;
        this.f5978e = user;
        this.f5976b = accountInstance;
        this.f5977c = tnVar;
        this.f5979f = chat;
        this.h = messageObject;
        this.d = y1VarArr;
    }
}
