package defpackage;

import android.app.Activity;
import java.util.List;
import org.telegram.tgnet.ConnectionsManager;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.d;
import org.telegram.ui.Components.UndoView;
public final class ze implements ee, xw8, bj0 {
    public final byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object h;

    public ze(cj0 cj0Var, Activity activity, j5 j5Var, TLRPC.InputStorePaymentPurpose inputStorePaymentPurpose, List list, ohd ohdVar) {
        this.a = (byte) 1;
        this.c = cj0Var;
        this.d = activity;
        this.b = j5Var;
        this.e = inputStorePaymentPurpose;
        this.f = list;
        this.h = ohdVar;
    }

    @Override
    public final void a(defpackage.fj0 r14, java.util.List r15) {
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ze.a(fj0, java.util.List):void");
    }

    @Override
    public final void b(fj0 fj0Var, List list) {
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
                in8 a = ((ln8) list.get(0)).a();
                tL_inputStorePaymentPremiumGiftCode.currency = a.c;
                tL_inputStorePaymentPremiumGiftCode.amount = (long) (Math.pow(10.0d, cj0.h().g(((TLRPC.TL_premiumGiftCodeOption) obj5).currency)) * (a.b / 1000000.0d));
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore = new TLRPC.TL_payments_canPurchaseStore();
                tL_payments_canPurchaseStore.purpose = tL_inputStorePaymentPremiumGiftCode;
                ((ConnectionsManager) obj4).sendRequest(tL_payments_canPurchaseStore, new ko0((qac) obj3, list, fj0Var, (qac) obj2, (d) obj, tL_inputStorePaymentPremiumGiftCode, (byte) 1));
                return;
            default:
                TLRPC.TL_inputStorePaymentPremiumGiveaway tL_inputStorePaymentPremiumGiveaway = (TLRPC.TL_inputStorePaymentPremiumGiveaway) obj6;
                in8 a2 = ((ln8) list.get(0)).a();
                tL_inputStorePaymentPremiumGiveaway.currency = a2.c;
                tL_inputStorePaymentPremiumGiveaway.amount = (long) (Math.pow(10.0d, cj0.h().g(((TLRPC.TL_premiumGiftCodeOption) obj5).currency)) * (a2.b / 1000000.0d));
                TLRPC.TL_payments_canPurchaseStore tL_payments_canPurchaseStore2 = new TLRPC.TL_payments_canPurchaseStore();
                tL_payments_canPurchaseStore2.purpose = tL_inputStorePaymentPremiumGiveaway;
                ((ConnectionsManager) obj4).sendRequest(tL_payments_canPurchaseStore2, new ko0((to0) obj3, list, fj0Var, (to0) obj2, (d) obj, tL_inputStorePaymentPremiumGiveaway, (byte) 0));
                return;
        }
    }

    @Override
    public final void r(he heVar, int i) {
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
                yv1 yv1Var = (yv1) obj4;
                TLRPC.Chat chat = (TLRPC.Chat) obj3;
                k47 k47Var = (k47) obj2;
                oh2[] oh2VarArr = (oh2[]) obj;
                if (user != null) {
                    cf7 Y = cf7.Y(j5Var.a);
                    Y.a.c(new tc7(Y, yv1Var.a(), user.id, (byte) 3));
                } else {
                    cf7 Y2 = cf7.Y(j5Var.a);
                    Y2.a.c(new tc7(Y2, yv1Var.a(), -chat.id, (byte) 3));
                }
                TLRPC.TL_contacts_blockFromReplies tL_contacts_blockFromReplies = new TLRPC.TL_contacts_blockFromReplies();
                tL_contacts_blockFromReplies.msg_id = k47Var.e1();
                tL_contacts_blockFromReplies.delete_message = true;
                tL_contacts_blockFromReplies.delete_history = true;
                if (oh2VarArr[0].b()) {
                    tL_contacts_blockFromReplies.report_spam = true;
                    if (yv1Var.getParentActivity() != null) {
                        yv1Var.i6();
                        UndoView undoView = yv1Var.N3;
                        if (undoView != null) {
                            undoView.j(74, 0L, null);
                        }
                    }
                }
                ConnectionsManager.getInstance(j5Var.a).sendRequest(tL_contacts_blockFromReplies, new tg(j5Var, (byte) 0));
                return;
            default:
                iz7 iz7Var = (iz7) obj6;
                xz7 xz7Var = iz7Var.a;
                xz7Var.Z[0].setText((String) obj5);
                xz7Var.Z[1].setText((String) obj4);
                xz7Var.Z[2].setText((String) obj3);
                xz7Var.Q1(true, true);
                iz7Var.c((kl7) obj2, (wm4) obj);
                return;
        }
    }

    public ze(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
        this.d = obj3;
        this.e = obj4;
        this.f = obj5;
        this.h = obj6;
    }

    public ze(TLRPC.User user, j5 j5Var, yv1 yv1Var, TLRPC.Chat chat, k47 k47Var, oh2[] oh2VarArr, ylb ylbVar) {
        this.a = (byte) 0;
        this.c = user;
        this.b = j5Var;
        this.d = yv1Var;
        this.e = chat;
        this.f = k47Var;
        this.h = oh2VarArr;
    }
}
