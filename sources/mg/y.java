package mg;

import java.util.List;
import org.telegram.messenger.aq;
import org.telegram.messenger.hs;
import org.telegram.messenger.jj;
import org.telegram.messenger.q20;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.k2;
import org.telegram.ui.ActionBar.p6;
import org.telegram.ui.Components.UndoView;
import org.telegram.ui.ll0;
import org.telegram.ui.mg0;
import org.telegram.ui.tk0;
import org.telegram.ui.un;
public final class y implements org.telegram.messenger.t1, org.telegram.ui.ActionBar.u1 {
    public final int f13289a;
    public final Object f13290b;
    public final Object f13291c;
    public final Object d;
    public final Object e;
    public final Object f13292f;
    public final Object h;

    public y(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, int i10) {
        this.f13289a = i10;
        this.e = obj;
        this.f13290b = obj2;
        this.f13291c = obj3;
        this.f13292f = obj4;
        this.h = obj5;
        this.d = obj6;
    }

    @Override
    public void a(c5.g gVar, List list) {
        switch (this.f13289a) {
            case 0:
                TLRPC.TL_inputStorePaymentPremiumGiftCode tL_inputStorePaymentPremiumGiftCode = (TLRPC.TL_inputStorePaymentPremiumGiftCode) this.e;
                q20 q20Var = (q20) this.h;
                k2 k2Var = (k2) this.d;
                c5.i a2 = ((c5.m) list.get(0)).a();
                tL_inputStorePaymentPremiumGiftCode.currency = a2.f3790c;
                tL_inputStorePaymentPremiumGiftCode.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(((TLRPC.TL_premiumGiftCodeOption) this.f13290b).currency)) * (a2.f3789b / Math.pow(10.0d, 6.0d)));
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentPremiumGiftCode;
                ((ConnectionsManager) this.f13291c).sendRequest(tL_payments_canPurchaseStore, new e0((q20) this.f13292f, list, gVar, q20Var, k2Var, tL_inputStorePaymentPremiumGiftCode, 1));
                return;
            default:
                TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway = (TLRPC.TL_inputStorePaymentPremiumGiveaway) this.e;
                o0 o0Var = (o0) this.h;
                k2 k2Var2 = (k2) this.d;
                c5.i a10 = ((c5.m) list.get(0)).a();
                tL_inputStorePaymentPremiumGiveaway.currency = a10.f3790c;
                tL_inputStorePaymentPremiumGiveaway.amount = (long) (Math.pow(10.0d, org.telegram.messenger.u1.i().h(((TLRPC.TL_premiumGiftCodeOption) this.f13290b).currency)) * (a10.f3789b / Math.pow(10.0d, 6.0d)));
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore2 = new TLRPC.TL_payments_canPurchaseStore();
                tL_payments_canPurchaseStore2.purpose = tL_inputStorePaymentPremiumGiveaway;
                ((ConnectionsManager) this.f13291c).sendRequest(tL_payments_canPurchaseStore2, new e0((o0) this.f13292f, list, gVar, o0Var, k2Var2, tL_inputStorePaymentPremiumGiveaway, 0));
                return;
        }
    }

    @Override
    public void h(org.telegram.ui.ActionBar.x1 x1Var, int i10) {
        switch (this.f13289a) {
            case 2:
                TLRPC.User user = (TLRPC.User) this.e;
                org.telegram.messenger.c cVar = (org.telegram.messenger.c) this.f13290b;
                un unVar = (un) this.f13291c;
                TLRPC.Chat chat = (TLRPC.Chat) this.f13292f;
                jj jjVar = (jj) this.h;
                org.telegram.ui.Cells.c2[] c2VarArr = (org.telegram.ui.Cells.c2[]) this.d;
                if (user != null) {
                    hs a02 = hs.a0(cVar.f14863a);
                    a02.f15938a.c(new aq(3, unVar.a(), user.f19942id, a02));
                } else {
                    hs a03 = hs.a0(cVar.f14863a);
                    a03.f15938a.c(new aq(3, unVar.a(), -chat.f19793id, a03));
                }
                TLRPC.TL_contacts_blockFromReplies tL_contacts_blockFromReplies = new TLRPC.TL_contacts_blockFromReplies();
                tL_contacts_blockFromReplies.msg_id = jjVar.f1();
                tL_contacts_blockFromReplies.delete_message = true;
                tL_contacts_blockFromReplies.delete_history = true;
                if (c2VarArr[0].b()) {
                    tL_contacts_blockFromReplies.report_spam = true;
                    if (unVar.getParentActivity() != null) {
                        unVar.Y7();
                        UndoView undoView = unVar.M3;
                        if (undoView != null) {
                            undoView.j(74, 0L, null);
                        }
                    }
                }
                ConnectionsManager.getInstance(cVar.f14863a).sendRequest(tL_contacts_blockFromReplies, new org.telegram.ui.Components.x1(cVar, 0));
                return;
            default:
                tk0 tk0Var = (tk0) this.e;
                ll0 ll0Var = tk0Var.f41855a;
                ll0Var.Y[0].setText((String) this.f13290b);
                ll0Var.Y[1].setText((String) this.f13291c);
                ll0Var.Y[2].setText((String) this.f13292f);
                ll0Var.Q1(true, true);
                tk0Var.c((mg0) this.h, (m4.c) this.d);
                return;
        }
    }

    public y(TLRPC.User user, org.telegram.messenger.c cVar, un unVar, TLRPC.Chat chat, jj jjVar, org.telegram.ui.Cells.c2[] c2VarArr, p6 p6Var) {
        this.f13289a = 2;
        this.e = user;
        this.f13290b = cVar;
        this.f13291c = unVar;
        this.f13292f = chat;
        this.h = jjVar;
        this.d = c2VarArr;
    }
}
