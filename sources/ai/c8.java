package ai;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class c8 implements q0.a {
    public final int f1085a;
    public final Object f1086b;
    public final Object f1087c;

    public c8(int i10, Object obj, Object obj2) {
        this.f1085a = i10;
        this.f1086b = obj;
        this.f1087c = obj2;
    }

    @Override
    public final void accept(Object obj) {
        boolean z10;
        String responseCodeString;
        boolean z11;
        String responseCodeString2;
        switch (this.f1085a) {
            case 0:
                tc tcVar = (tc) this.f1087c;
                c5.i iVar = (c5.i) obj;
                int i10 = ((c5.i) this.f1086b).f4752a;
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
                AndroidUtilities.runOnUIThread(new y7(tcVar, z10, responseCodeString, 1));
                return;
            case 1:
                org.telegram.ui.Wallet.s1 s1Var = (org.telegram.ui.Wallet.s1) this.f1087c;
                c5.i iVar2 = (c5.i) obj;
                int i11 = ((c5.i) this.f1086b).f4752a;
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
                AndroidUtilities.runOnUIThread(new y7(s1Var, z11, responseCodeString2, 2));
                return;
            case 2:
                ei.f6.Z((ei.xa) this.f1086b, (qg.v0) this.f1087c, (Integer) obj);
                return;
            case 3:
                org.telegram.ui.h5 h5Var = (org.telegram.ui.h5) this.f1086b;
                org.telegram.ui.c5 c5Var = (org.telegram.ui.c5) this.f1087c;
                org.telegram.ui.i5[] i5VarArr = c5Var.f35818i;
                org.telegram.ui.e5 e5Var = c5Var.f35819j;
                if (!h5Var.E) {
                    if (obj instanceof TLRPC.UserFull) {
                        h5Var.a(org.telegram.ui.c5.c((TLRPC.User) e5Var.f36548c, (TLRPC.UserFull) obj, i5VarArr));
                        return;
                    } else if (obj instanceof TLRPC.ChatFull) {
                        h5Var.a(org.telegram.ui.c5.a((TLRPC.Chat) e5Var.f36548c, (TLRPC.ChatFull) obj, i5VarArr));
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 4:
                Utilities.Callback callback = (Utilities.Callback) this.f1087c;
                c5.i iVar3 = (c5.i) obj;
                if (((c5.i) this.f1086b).f4752a == 0) {
                    AndroidUtilities.runOnUIThread(new ei.ia(2, callback));
                    return;
                }
                return;
            default:
                ug.u uVar = (ug.u) this.f1087c;
                c5.i iVar4 = (c5.i) obj;
                if (((c5.i) this.f1086b).f4752a == 0) {
                    AndroidUtilities.runOnUIThread(new tg.p(uVar, 6));
                    return;
                }
                return;
        }
    }
}
