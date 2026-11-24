package defpackage;

import android.app.Activity;
import java.util.List;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.UndoView;
public final class zd implements ed, wu8, bi0 {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object h;

    public zd(ci0 ci0Var, Activity activity, j5 j5Var, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, List list, nfd nfdVar) {
        this.a = (byte) 1;
        this.c = ci0Var;
        this.d = activity;
        this.b = j5Var;
        this.e = inputStorePaymentPurpose;
        this.f = list;
        this.h = nfdVar;
    }

    @Override
    public final void a(defpackage.fi0 r14, java.util.List r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.zd.a(fi0, java.util.List):void");
    }

    @Override
    public final void b(fi0 fi0Var, List list) {
        byte b = this.a;
        Object obj = this.h;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.b;
        Object obj6 = this.c;
        switch (b) {
            case 2:
                TLRPC.TL_inputStorePaymentPremiumGiftCode tL_inputStorePaymentPremiumGiftCode = (TLRPC.TL_inputStorePaymentPremiumGiftCode) obj6;
                gl8 a = ((kl8) list.get(0)).a();
                tL_inputStorePaymentPremiumGiftCode.currency = a.c;
                tL_inputStorePaymentPremiumGiftCode.amount = (long) (Math.pow(10.0d, ci0.h().g(((TLRPC.TL_premiumGiftCodeOption) obj5).currency)) * (a.b / 1000000.0d));
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentPremiumGiftCode;
                ((ConnectionsManager) obj4).sendRequest(tL_payments_canPurchaseStore, new kn0((p8c) obj3, list, fi0Var, (p8c) obj2, (d) obj, tL_inputStorePaymentPremiumGiftCode, (byte) 1));
                return;
            default:
                TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway = (TLRPC.TL_inputStorePaymentPremiumGiveaway) obj6;
                gl8 a2 = ((kl8) list.get(0)).a();
                tL_inputStorePaymentPremiumGiveaway.currency = a2.c;
                tL_inputStorePaymentPremiumGiveaway.amount = (long) (Math.pow(10.0d, ci0.h().g(((TLRPC.TL_premiumGiftCodeOption) obj5).currency)) * (a2.b / 1000000.0d));
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore2 = new TLRPC.TL_payments_canPurchaseStore();
                tL_payments_canPurchaseStore2.purpose = tL_inputStorePaymentPremiumGiveaway;
                ((ConnectionsManager) obj4).sendRequest(tL_payments_canPurchaseStore2, new kn0((tn0) obj3, list, fi0Var, (tn0) obj2, (d) obj, tL_inputStorePaymentPremiumGiveaway, (byte) 0));
                return;
        }
    }

    @Override
    public final void u(hd hdVar, int i) {
        byte b = this.a;
        Object obj = this.h;
        Object obj2 = this.f;
        Object obj3 = this.e;
        Object obj4 = this.d;
        Object obj5 = this.b;
        Object obj6 = this.c;
        switch (b) {
            case 0:
                TLRPC.User user = (TLRPC.User) obj6;
                j5 j5Var = (j5) obj5;
                mu1 mu1Var = (mu1) obj4;
                TLRPC.Chat chat = (TLRPC.Chat) obj3;
                k27 k27Var = (k27) obj2;
                ag2[] ag2VarArr = (ag2[]) obj;
                if (user != null) {
                    ad7 Y = ad7.Y(j5Var.a);
                    Y.a.c(new sa7(Y, mu1Var.a(), user.id, (byte) 3));
                } else {
                    ad7 Y2 = ad7.Y(j5Var.a);
                    Y2.a.c(new sa7(Y2, mu1Var.a(), -chat.id, (byte) 3));
                }
                TLRPC.TL_contacts_blockFromReplies tL_contacts_blockFromReplies = new TLRPC.TL_contacts_blockFromReplies();
                tL_contacts_blockFromReplies.msg_id = k27Var.e1();
                tL_contacts_blockFromReplies.delete_message = true;
                tL_contacts_blockFromReplies.delete_history = true;
                if (ag2VarArr[0].b()) {
                    tL_contacts_blockFromReplies.report_spam = true;
                    if (mu1Var.getParentActivity() != null) {
                        mu1Var.Z5();
                        UndoView undoView = mu1Var.N3;
                        if (undoView != null) {
                            undoView.j(74, 0L, null);
                        }
                    }
                }
                ConnectionsManager.getInstance(j5Var.a).sendRequest(tL_contacts_blockFromReplies, new uf(j5Var, (byte) 0));
                return;
            default:
                gx7 gx7Var = (gx7) obj6;
                vx7 vx7Var = gx7Var.a;
                vx7Var.Z[0].setText((String) obj5);
                vx7Var.Z[1].setText((String) obj4);
                vx7Var.Z[2].setText((String) obj3);
                vx7Var.P1(true, true);
                gx7Var.c((oq7) obj2, (wk4) obj);
                return;
        }
    }

    public zd(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.h = obj6;
    }

    public zd(TLRPC.User user, j5 j5Var, mu1 mu1Var, TLRPC.Chat chat, k27 k27Var, ag2[] ag2VarArr, wjb wjbVar) {
        this.a = (byte) 0;
        this.c = user;
        this.b = j5Var;
        this.d = mu1Var;
        this.e = chat;
        this.f = k27Var;
        this.h = ag2VarArr;
    }
}
