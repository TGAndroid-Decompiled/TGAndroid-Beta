package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class b8 implements q0.a {
    public final int f1029a;
    public final Object f1030b;
    public final Object f1031c;

    public b8(int i10, Object obj, Object obj2) {
        this.f1029a = i10;
        this.f1030b = obj;
        this.f1031c = obj2;
    }

    @Override
    public final void accept(Object obj) {
        boolean z10;
        String responseCodeString;
        boolean z11;
        String responseCodeString2;
        switch (this.f1029a) {
            case 0:
                sc scVar = (sc) this.f1031c;
                c5.i iVar = (c5.i) obj;
                int i10 = ((c5.i) this.f1030b).f4756a;
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
                AndroidUtilities.runOnUIThread(new x7(scVar, z10, responseCodeString, 1));
                return;
            case 1:
                org.telegram.ui.Wallet.s1 s1Var = (org.telegram.ui.Wallet.s1) this.f1031c;
                c5.i iVar2 = (c5.i) obj;
                int i11 = ((c5.i) this.f1030b).f4756a;
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
                AndroidUtilities.runOnUIThread(new x7(s1Var, z11, responseCodeString2, 2));
                return;
            case 2:
                ei.f6.Z((ei.xa) this.f1030b, (qg.u0) this.f1031c, (Integer) obj);
                return;
            case 3:
                org.telegram.ui.h5 h5Var = (org.telegram.ui.h5) this.f1030b;
                org.telegram.ui.c5 c5Var = (org.telegram.ui.c5) this.f1031c;
                org.telegram.ui.i5[] i5VarArr = c5Var.f35819i;
                org.telegram.ui.e5 e5Var = c5Var.f35820j;
                if (!h5Var.E) {
                    if (obj instanceof TLRPC.UserFull) {
                        h5Var.a(org.telegram.ui.c5.c((TLRPC.User) e5Var.f36395c, (TLRPC.UserFull) obj, i5VarArr));
                        return;
                    } else if (obj instanceof TLRPC.ChatFull) {
                        h5Var.a(org.telegram.ui.c5.a((TLRPC.Chat) e5Var.f36395c, (TLRPC.ChatFull) obj, i5VarArr));
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 4:
                Utilities.Callback callback = (Utilities.Callback) this.f1031c;
                c5.i iVar3 = (c5.i) obj;
                if (((c5.i) this.f1030b).f4756a == 0) {
                    AndroidUtilities.runOnUIThread(new ei.ia(2, callback));
                    return;
                }
                return;
            default:
                ug.t tVar = (ug.t) this.f1031c;
                c5.i iVar4 = (c5.i) obj;
                if (((c5.i) this.f1030b).f4756a == 0) {
                    AndroidUtilities.runOnUIThread(new tg.p(tVar, 6));
                    return;
                }
                return;
        }
    }
}
