package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.j90;
import org.telegram.ui.dm0;
public final class j5 implements q0.a {
    public final int f5240a;
    public final Object f5241b;
    public final Object f5242c;

    public j5(int i10, Object obj, Object obj2) {
        this.f5240a = i10;
        this.f5241b = obj;
        this.f5242c = obj2;
    }

    @Override
    public final void accept(Object obj) {
        boolean z10;
        String responseCodeString;
        boolean z11;
        String responseCodeString2;
        switch (this.f5240a) {
            case 0:
                q6.Z((nb) this.f5241b, (pg.t0) this.f5242c, (Integer) obj);
                return;
            case 1:
                org.telegram.ui.f5 f5Var = (org.telegram.ui.f5) this.f5241b;
                org.telegram.ui.a5 a5Var = (org.telegram.ui.a5) this.f5242c;
                org.telegram.ui.g5[] g5VarArr = a5Var.f35703i;
                org.telegram.ui.c5 c5Var = a5Var.f35704j;
                if (!f5Var.E) {
                    if (obj instanceof TLRPC.UserFull) {
                        f5Var.a(org.telegram.ui.a5.c((TLRPC.User) c5Var.f36324c, (TLRPC.UserFull) obj, g5VarArr));
                        return;
                    } else if (obj instanceof TLRPC.ChatFull) {
                        f5Var.a(org.telegram.ui.a5.a((TLRPC.Chat) c5Var.f36324c, (TLRPC.ChatFull) obj, g5VarArr));
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 2:
                Utilities.Callback callback = (Utilities.Callback) this.f5242c;
                c5.h hVar = (c5.h) obj;
                if (((c5.h) this.f5241b).f4252a == 0) {
                    AndroidUtilities.runOnUIThread(new xa(2, callback));
                    return;
                }
                return;
            case 3:
                tg.u uVar = (tg.u) this.f5242c;
                c5.h hVar2 = (c5.h) obj;
                if (((c5.h) this.f5241b).f4252a == 0) {
                    AndroidUtilities.runOnUIThread(new rg.x1(uVar, 10));
                    return;
                }
                return;
            case 4:
                j90 j90Var = (j90) this.f5242c;
                c5.h hVar3 = (c5.h) obj;
                int i10 = ((c5.h) this.f5241b).f4252a;
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
                AndroidUtilities.runOnUIThread(new dm0(j90Var, z10, responseCodeString, 16));
                return;
            default:
                qh.r rVar = (qh.r) this.f5242c;
                c5.h hVar4 = (c5.h) obj;
                int i11 = ((c5.h) this.f5241b).f4252a;
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
                AndroidUtilities.runOnUIThread(new dm0(rVar, z11, responseCodeString2, 17));
                return;
        }
    }
}
