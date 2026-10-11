package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.f90;
import org.telegram.ui.ga0;
public final class j5 implements q0.a {
    public final int f5241a;
    public final Object f5242b;
    public final Object f5243c;

    public j5(int i10, Object obj, Object obj2) {
        this.f5241a = i10;
        this.f5242b = obj;
        this.f5243c = obj2;
    }

    @Override
    public final void accept(Object obj) {
        boolean z10;
        String responseCodeString;
        boolean z11;
        String responseCodeString2;
        switch (this.f5241a) {
            case 0:
                q6.Z((nb) this.f5242b, (pg.u0) this.f5243c, (Integer) obj);
                return;
            case 1:
                org.telegram.ui.b5 b5Var = (org.telegram.ui.b5) this.f5242b;
                org.telegram.ui.w4 w4Var = (org.telegram.ui.w4) this.f5243c;
                org.telegram.ui.c5[] c5VarArr = w4Var.f43238i;
                org.telegram.ui.y4 y4Var = w4Var.f43239j;
                if (!b5Var.E) {
                    if (obj instanceof TLRPC.UserFull) {
                        b5Var.a(org.telegram.ui.w4.c((TLRPC.User) y4Var.f44285c, (TLRPC.UserFull) obj, c5VarArr));
                        return;
                    } else if (obj instanceof TLRPC.ChatFull) {
                        b5Var.a(org.telegram.ui.w4.a((TLRPC.Chat) y4Var.f44285c, (TLRPC.ChatFull) obj, c5VarArr));
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 2:
                Utilities.Callback callback = (Utilities.Callback) this.f5243c;
                c5.h hVar = (c5.h) obj;
                if (((c5.h) this.f5242b).f4253a == 0) {
                    AndroidUtilities.runOnUIThread(new xa(2, callback));
                    return;
                }
                return;
            case 3:
                tg.u uVar = (tg.u) this.f5243c;
                c5.h hVar2 = (c5.h) obj;
                if (((c5.h) this.f5242b).f4253a == 0) {
                    AndroidUtilities.runOnUIThread(new rg.x1(uVar, 10));
                    return;
                }
                return;
            case 4:
                f90 f90Var = (f90) this.f5243c;
                c5.h hVar3 = (c5.h) obj;
                int i10 = ((c5.h) this.f5242b).f4253a;
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
                AndroidUtilities.runOnUIThread(new ga0(f90Var, z10, responseCodeString, 17));
                return;
            default:
                qh.r rVar = (qh.r) this.f5243c;
                c5.h hVar4 = (c5.h) obj;
                int i11 = ((c5.h) this.f5242b).f4253a;
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
                AndroidUtilities.runOnUIThread(new ga0(rVar, z11, responseCodeString2, 18));
                return;
        }
    }
}
