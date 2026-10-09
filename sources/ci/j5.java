package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.f90;
import org.telegram.ui.ha0;
public final class j5 implements q0.a {
    public final int f5242a;
    public final Object f5243b;
    public final Object f5244c;

    public j5(int i10, Object obj, Object obj2) {
        this.f5242a = i10;
        this.f5243b = obj;
        this.f5244c = obj2;
    }

    @Override
    public final void accept(Object obj) {
        boolean z10;
        String responseCodeString;
        boolean z11;
        String responseCodeString2;
        switch (this.f5242a) {
            case 0:
                q6.Z((nb) this.f5243b, (pg.u0) this.f5244c, (Integer) obj);
                return;
            case 1:
                org.telegram.ui.c5 c5Var = (org.telegram.ui.c5) this.f5243b;
                org.telegram.ui.x4 x4Var = (org.telegram.ui.x4) this.f5244c;
                org.telegram.ui.d5[] d5VarArr = x4Var.f43818i;
                org.telegram.ui.z4 z4Var = x4Var.f43819j;
                if (!c5Var.E) {
                    if (obj instanceof TLRPC.UserFull) {
                        c5Var.a(org.telegram.ui.x4.c((TLRPC.User) z4Var.f44476c, (TLRPC.UserFull) obj, d5VarArr));
                        return;
                    } else if (obj instanceof TLRPC.ChatFull) {
                        c5Var.a(org.telegram.ui.x4.a((TLRPC.Chat) z4Var.f44476c, (TLRPC.ChatFull) obj, d5VarArr));
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 2:
                Utilities.Callback callback = (Utilities.Callback) this.f5244c;
                c5.h hVar = (c5.h) obj;
                if (((c5.h) this.f5243b).f4254a == 0) {
                    AndroidUtilities.runOnUIThread(new xa(2, callback));
                    return;
                }
                return;
            case 3:
                tg.v vVar = (tg.v) this.f5244c;
                c5.h hVar2 = (c5.h) obj;
                if (((c5.h) this.f5243b).f4254a == 0) {
                    AndroidUtilities.runOnUIThread(new rg.x1(vVar, 10));
                    return;
                }
                return;
            case 4:
                f90 f90Var = (f90) this.f5244c;
                c5.h hVar3 = (c5.h) obj;
                int i10 = ((c5.h) this.f5243b).f4254a;
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
                AndroidUtilities.runOnUIThread(new ha0(f90Var, z10, responseCodeString, 16));
                return;
            default:
                qh.r rVar = (qh.r) this.f5244c;
                c5.h hVar4 = (c5.h) obj;
                int i11 = ((c5.h) this.f5243b).f4254a;
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
                AndroidUtilities.runOnUIThread(new ha0(rVar, z11, responseCodeString2, 17));
                return;
        }
    }
}
