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
import org.telegram.ui.fn0;
import org.telegram.ui.gl0;
import org.telegram.ui.nm0;
import org.telegram.ui.zn;
public final class d0 implements BillingController.ProductDetailsResponseListenerLegacy, org.telegram.ui.ActionBar.c2 {
    public final int f6589a;
    public final Object f6590b;
    public final Object f6591c;
    public final Object d;
    public final Object e;
    public final Object f6592f;
    public final Object h;

    public d0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f6589a = i10;
        this.e = obj;
        this.f6590b = obj2;
        this.f6591c = obj3;
        this.f6592f = obj4;
        this.h = obj5;
        this.d = obj6;
    }

    @Override
    public void l(org.telegram.ui.ActionBar.d2 d2Var, int i10) {
        switch (this.f6589a) {
            case 2:
                TLRPC.User user = (TLRPC.User) this.e;
                AccountInstance accountInstance = (AccountInstance) this.f6590b;
                zn znVar = (zn) this.f6591c;
                TLRPC.Chat chat = (TLRPC.Chat) this.f6592f;
                MessageObject messageObject = (MessageObject) this.h;
                org.telegram.ui.Cells.y1[] y1VarArr = (org.telegram.ui.Cells.y1[]) this.d;
                if (user != null) {
                    accountInstance.getMessagesStorage().deleteUserChatHistory(znVar.a(), user.f19306id);
                } else {
                    accountInstance.getMessagesStorage().deleteUserChatHistory(znVar.a(), -chat.f19159id);
                }
                TLRPC.TL_contacts_blockFromReplies tL_contacts_blockFromReplies = new TLRPC.TL_contacts_blockFromReplies();
                tL_contacts_blockFromReplies.msg_id = messageObject.getId();
                tL_contacts_blockFromReplies.delete_message = true;
                tL_contacts_blockFromReplies.delete_history = true;
                if (y1VarArr[0].b()) {
                    tL_contacts_blockFromReplies.report_spam = true;
                    if (znVar.getParentActivity() != null) {
                        znVar.Q7();
                        UndoView undoView = znVar.f40775v3;
                        if (undoView != null) {
                            undoView.j(74, 0L, null);
                        }
                    }
                }
                accountInstance.getConnectionsManager().sendRequest(tL_contacts_blockFromReplies, new org.telegram.ui.Components.y1(accountInstance, 0));
                return;
            default:
                nm0 nm0Var = (nm0) this.e;
                fn0 fn0Var = nm0Var.f36539a;
                fn0Var.V[0].setText((String) this.f6590b);
                fn0Var.V[1].setText((String) this.f6591c);
                fn0Var.V[2].setText((String) this.f6592f);
                fn0Var.N1(true, true);
                nm0Var.c((gl0) this.h, (qa) this.d);
                return;
        }
    }

    @Override
    public void onProductDetailsResponse(p2.h hVar, List list) {
        switch (this.f6589a) {
            case 0:
                TLRPC.TL_inputStorePaymentPremiumGiftCode tL_inputStorePaymentPremiumGiftCode = (TLRPC.TL_inputStorePaymentPremiumGiftCode) this.e;
                Utilities.Callback callback = (Utilities.Callback) this.h;
                org.telegram.ui.ActionBar.p2 p2Var = (org.telegram.ui.ActionBar.p2) this.d;
                p2.j a2 = ((p2.n) list.get(0)).a();
                tL_inputStorePaymentPremiumGiftCode.currency = a2.f41020c;
                tL_inputStorePaymentPremiumGiftCode.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(((TLRPC.TL_premiumGiftCodeOption) this.f6590b).currency)) * (a2.f41019b / Math.pow(10.0d, 6.0d)));
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentPremiumGiftCode;
                ((ConnectionsManager) this.f6591c).sendRequest(tL_payments_canPurchaseStore, new i0((Utilities.Callback) this.f6592f, list, hVar, callback, p2Var, tL_inputStorePaymentPremiumGiftCode, 1));
                return;
            default:
                TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway = (TLRPC.TL_inputStorePaymentPremiumGiveaway) this.e;
                t0 t0Var = (t0) this.h;
                org.telegram.ui.ActionBar.p2 p2Var2 = (org.telegram.ui.ActionBar.p2) this.d;
                p2.j a10 = ((p2.n) list.get(0)).a();
                tL_inputStorePaymentPremiumGiveaway.currency = a10.f41020c;
                tL_inputStorePaymentPremiumGiveaway.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(((TLRPC.TL_premiumGiftCodeOption) this.f6590b).currency)) * (a10.f41019b / Math.pow(10.0d, 6.0d)));
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore2 = new TLRPC.TL_payments_canPurchaseStore();
                tL_payments_canPurchaseStore2.purpose = tL_inputStorePaymentPremiumGiveaway;
                ((ConnectionsManager) this.f6591c).sendRequest(tL_payments_canPurchaseStore2, new i0((t0) this.f6592f, list, hVar, t0Var, p2Var2, tL_inputStorePaymentPremiumGiveaway, 0));
                return;
        }
    }

    public d0(TLRPC.User user, AccountInstance accountInstance, zn znVar, TLRPC.Chat chat, MessageObject messageObject, org.telegram.ui.Cells.y1[] y1VarArr, f6 f6Var) {
        this.f6589a = 2;
        this.e = user;
        this.f6590b = accountInstance;
        this.f6591c = znVar;
        this.f6592f = chat;
        this.h = messageObject;
        this.d = y1VarArr;
    }
}
