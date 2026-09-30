package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.r80;
import org.telegram.ui.da0;
public final class k5 implements q0.a {
    public final int f4903a;
    public final Object f4904b;
    public final Object f4905c;

    public k5(int i10, Object obj, Object obj2) {
        this.f4903a = i10;
        this.f4904b = obj;
        this.f4905c = obj2;
    }

    @Override
    public final void accept(Object obj) {
        boolean z10;
        String responseCodeString;
        boolean z11;
        String responseCodeString2;
        switch (this.f4903a) {
            case 0:
                q6.Z((nb) this.f4904b, (pg.u0) this.f4905c, (Integer) obj);
                return;
            case 1:
                org.telegram.ui.c5 c5Var = (org.telegram.ui.c5) this.f4904b;
                org.telegram.ui.x4 x4Var = (org.telegram.ui.x4) this.f4905c;
                org.telegram.ui.d5[] d5VarArr = x4Var.f39920i;
                org.telegram.ui.z4 z4Var = x4Var.f39921j;
                if (!c5Var.E) {
                    if (obj instanceof TLRPC.UserFull) {
                        c5Var.a(org.telegram.ui.x4.c((TLRPC.User) z4Var.f40442c, (TLRPC.UserFull) obj, d5VarArr));
                        return;
                    } else if (obj instanceof TLRPC.ChatFull) {
                        c5Var.a(org.telegram.ui.x4.a((TLRPC.Chat) z4Var.f40442c, (TLRPC.ChatFull) obj, d5VarArr));
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 2:
                Utilities.Callback callback = (Utilities.Callback) this.f4905c;
                c5.h hVar = (c5.h) obj;
                if (((c5.h) this.f4904b).f3893a == 0) {
                    AndroidUtilities.runOnUIThread(new xa(2, callback));
                    return;
                }
                return;
            case 3:
                tg.v vVar = (tg.v) this.f4905c;
                c5.h hVar2 = (c5.h) obj;
                if (((c5.h) this.f4904b).f3893a == 0) {
                    AndroidUtilities.runOnUIThread(new rg.q1(vVar, 7));
                    return;
                }
                return;
            case 4:
                r80 r80Var = (r80) this.f4905c;
                c5.h hVar3 = (c5.h) obj;
                int i10 = ((c5.h) this.f4904b).f3893a;
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
                AndroidUtilities.runOnUIThread(new da0(r80Var, z10, responseCodeString, 14));
                return;
            default:
                ai.m0 m0Var = (ai.m0) this.f4905c;
                c5.h hVar4 = (c5.h) obj;
                int i11 = ((c5.h) this.f4904b).f3893a;
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
                AndroidUtilities.runOnUIThread(new da0(m0Var, z11, responseCodeString2, 15));
                return;
        }
    }
}
