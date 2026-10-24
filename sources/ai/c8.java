package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class c8 implements q0.a {
    public final int f1087a;
    public final Object f1088b;
    public final Object f1089c;

    public c8(int i10, Object obj, Object obj2) {
        this.f1087a = i10;
        this.f1088b = obj;
        this.f1089c = obj2;
    }

    @Override
    public final void accept(Object obj) {
        boolean z10;
        String responseCodeString;
        boolean z11;
        String responseCodeString2;
        switch (this.f1087a) {
            case 0:
                uc ucVar = (uc) this.f1089c;
                c5.i iVar = (c5.i) obj;
                int i10 = ((c5.i) this.f1088b).f4757a;
                if (i10 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    responseCodeString = null;
                } else {
                    responseCodeString = BillingController.getResponseCodeString(i10);
                }
                AndroidUtilities.runOnUIThread(new y7(ucVar, z10, responseCodeString, 1));
                return;
            case 1:
                org.telegram.ui.Wallet.r1 r1Var = (org.telegram.ui.Wallet.r1) this.f1089c;
                c5.i iVar2 = (c5.i) obj;
                int i11 = ((c5.i) this.f1088b).f4757a;
                if (i11 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    responseCodeString2 = null;
                } else {
                    responseCodeString2 = BillingController.getResponseCodeString(i11);
                }
                AndroidUtilities.runOnUIThread(new y7(r1Var, z11, responseCodeString2, 2));
                return;
            case 2:
                ei.f6.Y((ei.xa) this.f1088b, (qg.u0) this.f1089c, (Integer) obj);
                return;
            case 3:
                org.telegram.ui.g5 g5Var = (org.telegram.ui.g5) this.f1088b;
                org.telegram.ui.b5 b5Var = (org.telegram.ui.b5) this.f1089c;
                org.telegram.ui.h5[] h5VarArr = b5Var.f35925i;
                org.telegram.ui.d5 d5Var = b5Var.f35926j;
                if (!g5Var.E) {
                    if (obj instanceof TLRPC.UserFull) {
                        g5Var.a(org.telegram.ui.b5.c((TLRPC.User) d5Var.f36469c, (TLRPC.UserFull) obj, h5VarArr));
                        return;
                    } else if (obj instanceof TLRPC.ChatFull) {
                        g5Var.a(org.telegram.ui.b5.a((TLRPC.Chat) d5Var.f36469c, (TLRPC.ChatFull) obj, h5VarArr));
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 4:
                Utilities.Callback callback = (Utilities.Callback) this.f1089c;
                c5.i iVar3 = (c5.i) obj;
                if (((c5.i) this.f1088b).f4757a == 0) {
                    AndroidUtilities.runOnUIThread(new ei.ia(2, callback));
                    return;
                }
                return;
            default:
                ug.t tVar = (ug.t) this.f1089c;
                c5.i iVar4 = (c5.i) obj;
                if (((c5.i) this.f1088b).f4757a == 0) {
                    AndroidUtilities.runOnUIThread(new tg.p(tVar, 6));
                    return;
                }
                return;
        }
    }
}
