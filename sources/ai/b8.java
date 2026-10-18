package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class b8 implements q0.a {
    public final int f1034a;
    public final Object f1035b;
    public final Object f1036c;

    public b8(int i10, Object obj, Object obj2) {
        this.f1034a = i10;
        this.f1035b = obj;
        this.f1036c = obj2;
    }

    @Override
    public final void accept(Object obj) {
        boolean z10;
        String responseCodeString;
        boolean z11;
        String responseCodeString2;
        switch (this.f1034a) {
            case 0:
                tc tcVar = (tc) this.f1036c;
                c5.i iVar = (c5.i) obj;
                int i10 = ((c5.i) this.f1035b).f4757a;
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
                AndroidUtilities.runOnUIThread(new x7(tcVar, z10, responseCodeString, 1));
                return;
            case 1:
                org.telegram.ui.Wallet.s1 s1Var = (org.telegram.ui.Wallet.s1) this.f1036c;
                c5.i iVar2 = (c5.i) obj;
                int i11 = ((c5.i) this.f1035b).f4757a;
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
                ei.f6.Z((ei.xa) this.f1035b, (qg.u0) this.f1036c, (Integer) obj);
                return;
            case 3:
                org.telegram.ui.h5 h5Var = (org.telegram.ui.h5) this.f1035b;
                org.telegram.ui.c5 c5Var = (org.telegram.ui.c5) this.f1036c;
                org.telegram.ui.i5[] i5VarArr = c5Var.f35786i;
                org.telegram.ui.e5 e5Var = c5Var.f35787j;
                if (!h5Var.E) {
                    if (obj instanceof TLRPC.UserFull) {
                        h5Var.a(org.telegram.ui.c5.c((TLRPC.User) e5Var.f36362c, (TLRPC.UserFull) obj, i5VarArr));
                        return;
                    } else if (obj instanceof TLRPC.ChatFull) {
                        h5Var.a(org.telegram.ui.c5.a((TLRPC.Chat) e5Var.f36362c, (TLRPC.ChatFull) obj, i5VarArr));
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 4:
                Utilities.Callback callback = (Utilities.Callback) this.f1036c;
                c5.i iVar3 = (c5.i) obj;
                if (((c5.i) this.f1035b).f4757a == 0) {
                    AndroidUtilities.runOnUIThread(new ei.ia(2, callback));
                    return;
                }
                return;
            default:
                ug.u uVar = (ug.u) this.f1036c;
                c5.i iVar4 = (c5.i) obj;
                if (((c5.i) this.f1035b).f4757a == 0) {
                    AndroidUtilities.runOnUIThread(new tg.p(uVar, 6));
                    return;
                }
                return;
        }
    }
}
