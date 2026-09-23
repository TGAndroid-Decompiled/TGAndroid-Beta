package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.e80;
import org.telegram.ui.vl0;
public final class k5 implements q0.a {
    public final int f4896a;
    public final Object f4897b;
    public final Object f4898c;

    public k5(int i10, Object obj, Object obj2) {
        this.f4896a = i10;
        this.f4897b = obj;
        this.f4898c = obj2;
    }

    @Override
    public final void accept(Object obj) {
        boolean z10;
        String responseCodeString;
        boolean z11;
        String responseCodeString2;
        switch (this.f4896a) {
            case 0:
                q6.Z((nb) this.f4897b, (pg.t0) this.f4898c, (Integer) obj);
                return;
            case 1:
                org.telegram.ui.d5 d5Var = (org.telegram.ui.d5) this.f4897b;
                org.telegram.ui.y4 y4Var = (org.telegram.ui.y4) this.f4898c;
                org.telegram.ui.e5[] e5VarArr = y4Var.f39722i;
                org.telegram.ui.a5 a5Var = y4Var.f39723j;
                if (!d5Var.E) {
                    if (obj instanceof TLRPC.UserFull) {
                        d5Var.a(org.telegram.ui.y4.c((TLRPC.User) a5Var.f31662c, (TLRPC.UserFull) obj, e5VarArr));
                        return;
                    } else if (obj instanceof TLRPC.ChatFull) {
                        d5Var.a(org.telegram.ui.y4.a((TLRPC.Chat) a5Var.f31662c, (TLRPC.ChatFull) obj, e5VarArr));
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 2:
                Utilities.Callback callback = (Utilities.Callback) this.f4898c;
                c5.h hVar = (c5.h) obj;
                if (((c5.h) this.f4897b).f3886a == 0) {
                    AndroidUtilities.runOnUIThread(new xa(2, callback));
                    return;
                }
                return;
            case 3:
                tg.w wVar = (tg.w) this.f4898c;
                c5.h hVar2 = (c5.h) obj;
                if (((c5.h) this.f4897b).f3886a == 0) {
                    AndroidUtilities.runOnUIThread(new rg.w1(wVar, 6));
                    return;
                }
                return;
            case 4:
                e80 e80Var = (e80) this.f4898c;
                c5.h hVar3 = (c5.h) obj;
                int i10 = ((c5.h) this.f4897b).f3886a;
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
                AndroidUtilities.runOnUIThread(new vl0(e80Var, z10, responseCodeString, 13));
                return;
            default:
                ai.m0 m0Var = (ai.m0) this.f4898c;
                c5.h hVar4 = (c5.h) obj;
                int i11 = ((c5.h) this.f4897b).f3886a;
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
                AndroidUtilities.runOnUIThread(new vl0(m0Var, z11, responseCodeString2, 14));
                return;
        }
    }
}
