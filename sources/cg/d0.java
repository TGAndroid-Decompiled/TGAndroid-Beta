package cg;

import java.util.List;
import org.telegram.messenger.AccountInstance;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.MessageObject;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.c6;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.gm0;
import org.telegram.ui.i6;
import org.telegram.ui.rn;
import org.telegram.ui.xm0;
import org.telegram.ui.zk0;

public final class d0 implements BillingController.ProductDetailsResponseListenerLegacy, org.telegram.ui.ActionBar.a2 {

    public final int f2629a;

    public final Object f2630b;

    public final Object f2631c;
    public final Object d;

    public final Object f2632e;

    public final Object f2633f;
    public final Object h;

    public d0(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f2629a = i10;
        this.f2632e = obj;
        this.f2630b = obj2;
        this.f2631c = obj3;
        this.f2633f = obj4;
        this.h = obj5;
        this.d = obj6;
    }

    @Override
    public void f(org.telegram.ui.ActionBar.b2 b2Var, int i10) {
        switch (this.f2629a) {
            case 2:
                TLRPC.User user = (TLRPC.User) this.f2632e;
                AccountInstance accountInstance = (AccountInstance) this.f2630b;
                rn rnVar = (rn) this.f2631c;
                TLRPC.Chat chat = (TLRPC.Chat) this.f2633f;
                MessageObject messageObject = (MessageObject) this.h;
                org.telegram.ui.Cells.y1[] y1VarArr = (org.telegram.ui.Cells.y1[]) this.d;
                if (user != null) {
                    accountInstance.getMessagesStorage().deleteUserChatHistory(rnVar.a(), user.f22527id);
                } else {
                    accountInstance.getMessagesStorage().deleteUserChatHistory(rnVar.a(), -chat.f22380id);
                }
                TLRPC.TL_contacts_blockFromReplies tL_contacts_blockFromReplies = new TLRPC.TL_contacts_blockFromReplies();
                tL_contacts_blockFromReplies.msg_id = messageObject.getId();
                tL_contacts_blockFromReplies.delete_message = true;
                tL_contacts_blockFromReplies.delete_history = true;
                if (y1VarArr[0].b()) {
                    tL_contacts_blockFromReplies.report_spam = true;
                    if (rnVar.getParentActivity() != null) {
                        rnVar.Q7();
                        UndoView undoView = rnVar.f42229u3;
                        if (undoView != null) {
                            undoView.j(74, 0L, null);
                        }
                    }
                }
                accountInstance.getConnectionsManager().sendRequest(tL_contacts_blockFromReplies, new org.telegram.ui.Components.w1(accountInstance, 0));
                break;
            default:
                gm0 gm0Var = (gm0) this.f2632e;
                String str = (String) this.f2630b;
                String str2 = (String) this.f2631c;
                String str3 = (String) this.f2633f;
                zk0 zk0Var = (zk0) this.h;
                i6 i6Var = (i6) this.d;
                xm0 xm0Var = gm0Var.f38446a;
                xm0Var.U[0].setText(str);
                xm0Var.U[1].setText(str2);
                xm0Var.U[2].setText(str3);
                xm0Var.N1(true, true);
                gm0Var.c(zk0Var, i6Var);
                break;
        }
    }

    @Override
    public void onProductDetailsResponse(n2.g gVar, List list) {
        switch (this.f2629a) {
            case 0:
                TLRPC.TL_inputStorePaymentPremiumGiftCode tL_inputStorePaymentPremiumGiftCode = (TLRPC.TL_inputStorePaymentPremiumGiftCode) this.f2632e;
                TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption = (TLRPC.TL_premiumGiftCodeOption) this.f2630b;
                ConnectionsManager connectionsManager = (ConnectionsManager) this.f2631c;
                Utilities.Callback callback = (Utilities.Callback) this.f2633f;
                Utilities.Callback callback2 = (Utilities.Callback) this.h;
                org.telegram.ui.ActionBar.n2 n2Var = (org.telegram.ui.ActionBar.n2) this.d;
                n2.i iVarA = ((n2.l) list.get(0)).a();
                tL_inputStorePaymentPremiumGiftCode.currency = iVarA.f18152c;
                tL_inputStorePaymentPremiumGiftCode.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_premiumGiftCodeOption.currency)) * (iVarA.f18151b / Math.pow(10.0d, 6.0d)));
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentPremiumGiftCode;
                connectionsManager.sendRequest(tL_payments_canPurchaseStore, new j0(callback, list, gVar, callback2, n2Var, tL_inputStorePaymentPremiumGiftCode, 1));
                break;
            default:
                TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway = (TLRPC.TL_inputStorePaymentPremiumGiveaway) this.f2632e;
                TLRPC.TL_premiumGiftCodeOption tL_premiumGiftCodeOption2 = (TLRPC.TL_premiumGiftCodeOption) this.f2630b;
                ConnectionsManager connectionsManager2 = (ConnectionsManager) this.f2631c;
                v0 v0Var = (v0) this.f2633f;
                v0 v0Var2 = (v0) this.h;
                org.telegram.ui.ActionBar.n2 n2Var2 = (org.telegram.ui.ActionBar.n2) this.d;
                n2.i iVarA2 = ((n2.l) list.get(0)).a();
                tL_inputStorePaymentPremiumGiveaway.currency = iVarA2.f18152c;
                tL_inputStorePaymentPremiumGiveaway.amount = (long) (Math.pow(10.0d, BillingController.getInstance().getCurrencyExp(tL_premiumGiftCodeOption2.currency)) * (iVarA2.f18151b / Math.pow(10.0d, 6.0d)));
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore2 = new TLRPC.TL_payments_canPurchaseStore();
                tL_payments_canPurchaseStore2.purpose = tL_inputStorePaymentPremiumGiveaway;
                connectionsManager2.sendRequest(tL_payments_canPurchaseStore2, new j0(v0Var, list, gVar, v0Var2, n2Var2, tL_inputStorePaymentPremiumGiveaway, 0));
                break;
        }
    }

    public d0(TLRPC.User user, AccountInstance accountInstance, rn rnVar, TLRPC.Chat chat, MessageObject messageObject, org.telegram.ui.Cells.y1[] y1VarArr, c6 c6Var) {
        this.f2629a = 2;
        this.f2632e = user;
        this.f2630b = accountInstance;
        this.f2631c = rnVar;
        this.f2633f = chat;
        this.h = messageObject;
        this.d = y1VarArr;
    }
}
