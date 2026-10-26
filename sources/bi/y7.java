package bi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
public final class y7 implements q0.a {
    public final int f5765a;
    public final Object f5766b;
    public final Object f5767c;

    public y7(int i10, Object obj, Object obj2) {
        this.f5765a = i10;
        this.f5766b = obj;
        this.f5767c = obj2;
    }

    @Override
    public final void accept(Object obj) {
        boolean z10;
        String responseCodeString;
        boolean z11;
        String responseCodeString2;
        switch (this.f5765a) {
            case 0:
                lc lcVar = (lc) this.f5767c;
                d5.i iVar = (d5.i) obj;
                int i10 = ((d5.i) this.f5766b).f7985a;
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
                AndroidUtilities.runOnUIThread(new u7(lcVar, z10, responseCodeString, 1));
                return;
            case 1:
                org.telegram.ui.Wallet.r1 r1Var = (org.telegram.ui.Wallet.r1) this.f5767c;
                d5.i iVar2 = (d5.i) obj;
                int i11 = ((d5.i) this.f5766b).f7985a;
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
                AndroidUtilities.runOnUIThread(new u7(r1Var, z11, responseCodeString2, 2));
                return;
            case 2:
                fi.e6.X((fi.ta) this.f5766b, (rg.s0) this.f5767c, (Integer) obj);
                return;
            case 3:
                org.telegram.ui.f5 f5Var = (org.telegram.ui.f5) this.f5766b;
                org.telegram.ui.a5 a5Var = (org.telegram.ui.a5) this.f5767c;
                org.telegram.ui.g5[] g5VarArr = a5Var.f37651i;
                org.telegram.ui.c5 c5Var = a5Var.f37652j;
                if (!f5Var.E) {
                    if (obj instanceof TLRPC.UserFull) {
                        f5Var.a(org.telegram.ui.a5.c((TLRPC.User) c5Var.f38266c, (TLRPC.UserFull) obj, g5VarArr));
                        return;
                    } else if (obj instanceof TLRPC.ChatFull) {
                        f5Var.a(org.telegram.ui.a5.a((TLRPC.Chat) c5Var.f38266c, (TLRPC.ChatFull) obj, g5VarArr));
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 4:
                Utilities.Callback callback = (Utilities.Callback) this.f5767c;
                d5.i iVar3 = (d5.i) obj;
                if (((d5.i) this.f5766b).f7985a == 0) {
                    AndroidUtilities.runOnUIThread(new fi.ea(2, callback));
                    return;
                }
                return;
            default:
                vg.v vVar = (vg.v) this.f5767c;
                d5.i iVar4 = (d5.i) obj;
                if (((d5.i) this.f5766b).f7985a == 0) {
                    AndroidUtilities.runOnUIThread(new ti.g(vVar, 9));
                    return;
                }
                return;
        }
    }
}
