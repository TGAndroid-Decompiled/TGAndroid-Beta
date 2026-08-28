package bg;

import fh.w5;
import gh.u5;
import kh.g6;
import kh.ya;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.b5;
import org.telegram.ui.c5;
import org.telegram.ui.w4;
import org.telegram.ui.y4;
public final class r0 implements q0.a {
    public final int f1940a;
    public final Object f1941b;
    public final Object f1942c;

    public r0(int i9, Object obj, Object obj2) {
        this.f1940a = i9;
        this.f1941b = obj;
        this.f1942c = obj2;
    }

    @Override
    public final void accept(Object obj) {
        boolean z10;
        String responseCodeString;
        boolean z11;
        String responseCodeString2;
        switch (this.f1940a) {
            case 0:
                Utilities.Callback callback = (Utilities.Callback) this.f1942c;
                n2.g gVar = (n2.g) obj;
                if (((n2.g) this.f1941b).f18319a == 0) {
                    AndroidUtilities.runOnUIThread(new s0(1, callback));
                    return;
                }
                return;
            case 1:
                z0 z0Var = (z0) this.f1942c;
                n2.g gVar2 = (n2.g) obj;
                if (((n2.g) this.f1941b).f18319a == 0) {
                    AndroidUtilities.runOnUIThread(new af.e(z0Var, 11));
                    return;
                }
                return;
            case 2:
                w5 w5Var = (w5) this.f1942c;
                n2.g gVar3 = (n2.g) obj;
                int i9 = ((n2.g) this.f1941b).f18319a;
                if (i9 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    responseCodeString = null;
                } else {
                    responseCodeString = BillingController.getResponseCodeString(i9);
                }
                AndroidUtilities.runOnUIThread(new u5(w5Var, z10, responseCodeString, 1));
                return;
            case 3:
                y0 y0Var = (y0) this.f1942c;
                n2.g gVar4 = (n2.g) obj;
                int i10 = ((n2.g) this.f1941b).f18319a;
                if (i10 == 0) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (z11) {
                    responseCodeString2 = null;
                } else {
                    responseCodeString2 = BillingController.getResponseCodeString(i10);
                }
                AndroidUtilities.runOnUIThread(new u5(y0Var, z11, responseCodeString2, 2));
                return;
            case 4:
                g6.Z((ya) this.f1941b, (xf.s0) this.f1942c, (Integer) obj);
                return;
            default:
                b5 b5Var = (b5) this.f1941b;
                w4 w4Var = (w4) this.f1942c;
                c5[] c5VarArr = w4Var.f43661i;
                y4 y4Var = w4Var.f43662j;
                if (!b5Var.A) {
                    if (obj instanceof TLRPC.UserFull) {
                        b5Var.a(w4.c((TLRPC.User) y4Var.f44713c, (TLRPC.UserFull) obj, c5VarArr));
                        return;
                    } else if (obj instanceof TLRPC.ChatFull) {
                        b5Var.a(w4.a((TLRPC.Chat) y4Var.f44713c, (TLRPC.ChatFull) obj, c5VarArr));
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }
}
