package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.r80;
import org.telegram.ui.ha0;
public final class k5 implements q0.a {
    public final int f5304a;
    public final Object f5305b;
    public final Object f5306c;

    public k5(int i10, Object obj, Object obj2) {
        this.f5304a = i10;
        this.f5305b = obj;
        this.f5306c = obj2;
    }

    @Override
    public final void accept(Object obj) {
        boolean z10;
        String responseCodeString;
        boolean z11;
        String responseCodeString2;
        switch (this.f5304a) {
            case 0:
                q6.Z((mb) this.f5305b, (pg.u0) this.f5306c, (Integer) obj);
                return;
            case 1:
                org.telegram.ui.d5 d5Var = (org.telegram.ui.d5) this.f5305b;
                org.telegram.ui.y4 y4Var = (org.telegram.ui.y4) this.f5306c;
                org.telegram.ui.e5[] e5VarArr = y4Var.f43113i;
                org.telegram.ui.a5 a5Var = y4Var.f43114j;
                if (!d5Var.E) {
                    if (obj instanceof TLRPC.UserFull) {
                        d5Var.a(org.telegram.ui.y4.c((TLRPC.User) a5Var.f34682c, (TLRPC.UserFull) obj, e5VarArr));
                        return;
                    } else if (obj instanceof TLRPC.ChatFull) {
                        d5Var.a(org.telegram.ui.y4.a((TLRPC.Chat) a5Var.f34682c, (TLRPC.ChatFull) obj, e5VarArr));
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 2:
                Utilities.Callback callback = (Utilities.Callback) this.f5306c;
                c5.h hVar = (c5.h) obj;
                if (((c5.h) this.f5305b).f4204a == 0) {
                    AndroidUtilities.runOnUIThread(new wa(2, callback));
                    return;
                }
                return;
            case 3:
                tg.v vVar = (tg.v) this.f5306c;
                c5.h hVar2 = (c5.h) obj;
                if (((c5.h) this.f5305b).f4204a == 0) {
                    AndroidUtilities.runOnUIThread(new rg.s1(vVar, 7));
                    return;
                }
                return;
            case 4:
                r80 r80Var = (r80) this.f5306c;
                c5.h hVar3 = (c5.h) obj;
                int i10 = ((c5.h) this.f5305b).f4204a;
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
                AndroidUtilities.runOnUIThread(new ha0(r80Var, z10, responseCodeString, 14));
                return;
            default:
                ai.m0 m0Var = (ai.m0) this.f5306c;
                c5.h hVar4 = (c5.h) obj;
                int i11 = ((c5.h) this.f5305b).f4204a;
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
                AndroidUtilities.runOnUIThread(new ha0(m0Var, z11, responseCodeString2, 15));
                return;
        }
    }
}
