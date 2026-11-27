package defpackage;

import android.app.Activity;
import java.util.List;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.e;
import org.telegram.ui.Components.UndoView;
public final class kh implements fd, fy8, ci0 {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object h;

    public kh(di0 di0Var, Activity activity, k5 k5Var, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, List list, ekd ekdVar) {
        this.a = (byte) 1;
        this.c = di0Var;
        this.d = activity;
        this.b = k5Var;
        this.e = inputStorePaymentPurpose;
        this.f = list;
        this.h = ekdVar;
    }

    @Override
    public final void a(defpackage.gi0 r14, java.util.List r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kh.a(gi0, java.util.List):void");
    }

    @Override
    public final void c(gi0 gi0Var, List list) {
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
                to8 a = ((wo8) list.get(0)).a();
                tL_inputStorePaymentPremiumGiftCode.currency = a.c;
                tL_inputStorePaymentPremiumGiftCode.amount = (long) (Math.pow(10.0d, di0.h().g(((TLRPC.TL_premiumGiftCodeOption) obj5).currency)) * (a.b / 1000000.0d));
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentPremiumGiftCode;
                ((ConnectionsManager) obj4).sendRequest(tL_payments_canPurchaseStore, new mn0((pcc) obj3, list, gi0Var, (pcc) obj2, (e) obj, tL_inputStorePaymentPremiumGiftCode, (byte) 1));
                return;
            default:
                TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway = (TLRPC.TL_inputStorePaymentPremiumGiveaway) obj6;
                to8 a2 = ((wo8) list.get(0)).a();
                tL_inputStorePaymentPremiumGiveaway.currency = a2.c;
                tL_inputStorePaymentPremiumGiveaway.amount = (long) (Math.pow(10.0d, di0.h().g(((TLRPC.TL_premiumGiftCodeOption) obj5).currency)) * (a2.b / 1000000.0d));
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore2 = new TLRPC.TL_payments_canPurchaseStore();
                tL_payments_canPurchaseStore2.purpose = tL_inputStorePaymentPremiumGiveaway;
                ((ConnectionsManager) obj4).sendRequest(tL_payments_canPurchaseStore2, new mn0((tn0) obj3, list, gi0Var, (tn0) obj2, (e) obj, tL_inputStorePaymentPremiumGiveaway, (byte) 0));
                return;
        }
    }

    @Override
    public final void w(id idVar, int i) {
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
                k5 k5Var = (k5) obj5;
                zu1 zu1Var = (zu1) obj4;
                TLRPC.Chat chat = (TLRPC.Chat) obj3;
                r47 r47Var = (r47) obj2;
                sg2[] sg2VarArr = (sg2[]) obj;
                if (user != null) {
                    kf7 a0 = kf7.a0(k5Var.a);
                    a0.a.c(new yd7(a0, zu1Var.a(), user.id, (byte) 3));
                } else {
                    kf7 a02 = kf7.a0(k5Var.a);
                    a02.a.c(new yd7(a02, zu1Var.a(), -chat.id, (byte) 3));
                }
                TLRPC.TL_contacts_blockFromReplies tL_contacts_blockFromReplies = new TLRPC.TL_contacts_blockFromReplies();
                tL_contacts_blockFromReplies.msg_id = r47Var.e1();
                tL_contacts_blockFromReplies.delete_message = true;
                tL_contacts_blockFromReplies.delete_history = true;
                if (sg2VarArr[0].b()) {
                    tL_contacts_blockFromReplies.report_spam = true;
                    if (zu1Var.getParentActivity() != null) {
                        zu1Var.i6();
                        UndoView undoView = zu1Var.N3;
                        if (undoView != null) {
                            undoView.j(74, 0L, null);
                        }
                    }
                }
                ConnectionsManager.getInstance(k5Var.a).sendRequest(tL_contacts_blockFromReplies, new ye(k5Var, (byte) 0));
                return;
            default:
                m08 m08Var = (m08) obj6;
                b18 b18Var = m08Var.a;
                b18Var.Z[0].setText((String) obj5);
                b18Var.Z[1].setText((String) obj4);
                b18Var.Z[2].setText((String) obj3);
                b18Var.Q1(true, true);
                m08Var.c((ge7) obj2, (um4) obj);
                return;
        }
    }

    public kh(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.h = obj6;
    }

    public kh(TLRPC.User user, k5 k5Var, zu1 zu1Var, TLRPC.Chat chat, r47 r47Var, sg2[] sg2VarArr, vnb vnbVar) {
        this.a = (byte) 0;
        this.c = user;
        this.b = k5Var;
        this.d = zu1Var;
        this.e = chat;
        this.f = r47Var;
        this.h = sg2VarArr;
    }
}
