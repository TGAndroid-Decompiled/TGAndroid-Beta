package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.l80;
import org.telegram.ui.ka0;
public final class l5 implements q0.a {
    public final int f4937a;
    public final Object f4938b;
    public final Object f4939c;

    public l5(int i10, Object obj, Object obj2) {
        this.f4937a = i10;
        this.f4938b = obj;
        this.f4939c = obj2;
    }

    @Override
    public final void accept(Object obj) {
        boolean z10;
        String responseCodeString;
        boolean z11;
        String responseCodeString2;
        switch (this.f4937a) {
            case 0:
                r6.Z((qb) this.f4938b, (pg.u0) this.f4939c, (Integer) obj);
                return;
            case 1:
                org.telegram.ui.c5 c5Var = (org.telegram.ui.c5) this.f4938b;
                org.telegram.ui.x4 x4Var = (org.telegram.ui.x4) this.f4939c;
                org.telegram.ui.d5[] d5VarArr = x4Var.f39344i;
                org.telegram.ui.z4 z4Var = x4Var.f39345j;
                if (!c5Var.E) {
                    if (obj instanceof TLRPC.UserFull) {
                        c5Var.a(org.telegram.ui.x4.c((TLRPC.User) z4Var.f40091c, (TLRPC.UserFull) obj, d5VarArr));
                        return;
                    } else if (obj instanceof TLRPC.ChatFull) {
                        c5Var.a(org.telegram.ui.x4.a((TLRPC.Chat) z4Var.f40091c, (TLRPC.ChatFull) obj, d5VarArr));
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 2:
                Utilities.Callback callback = (Utilities.Callback) this.f4939c;
                c5.h hVar = (c5.h) obj;
                if (((c5.h) this.f4938b).f3895a == 0) {
                    AndroidUtilities.runOnUIThread(new ab(2, callback));
                    return;
                }
                return;
            case 3:
                tg.v vVar = (tg.v) this.f4939c;
                c5.h hVar2 = (c5.h) obj;
                if (((c5.h) this.f4938b).f3895a == 0) {
                    AndroidUtilities.runOnUIThread(new rg.q1(vVar, 7));
                    return;
                }
                return;
            case 4:
                l80 l80Var = (l80) this.f4939c;
                c5.h hVar3 = (c5.h) obj;
                int i10 = ((c5.h) this.f4938b).f3895a;
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
                AndroidUtilities.runOnUIThread(new ka0(l80Var, z10, responseCodeString, 14));
                return;
            default:
                ai.m0 m0Var = (ai.m0) this.f4939c;
                c5.h hVar4 = (c5.h) obj;
                int i11 = ((c5.h) this.f4938b).f3895a;
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
                AndroidUtilities.runOnUIThread(new ka0(m0Var, z11, responseCodeString2, 15));
                return;
        }
    }
}
