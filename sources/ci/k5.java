package ci;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.q80;
import org.telegram.ui.ga0;
public final class k5 implements q0.a {
    public final int f4914a;
    public final Object f4915b;
    public final Object f4916c;

    public k5(int i10, Object obj, Object obj2) {
        this.f4914a = i10;
        this.f4915b = obj;
        this.f4916c = obj2;
    }

    @Override
    public final void accept(Object obj) {
        boolean z10;
        String responseCodeString;
        boolean z11;
        String responseCodeString2;
        switch (this.f4914a) {
            case 0:
                q6.Z((mb) this.f4915b, (pg.u0) this.f4916c, (Integer) obj);
                return;
            case 1:
                org.telegram.ui.e5 e5Var = (org.telegram.ui.e5) this.f4915b;
                org.telegram.ui.z4 z4Var = (org.telegram.ui.z4) this.f4916c;
                org.telegram.ui.f5[] f5VarArr = z4Var.f40398i;
                org.telegram.ui.b5 b5Var = z4Var.f40399j;
                if (!e5Var.E) {
                    if (obj instanceof TLRPC.UserFull) {
                        e5Var.a(org.telegram.ui.z4.c((TLRPC.User) b5Var.f32239c, (TLRPC.UserFull) obj, f5VarArr));
                        return;
                    } else if (obj instanceof TLRPC.ChatFull) {
                        e5Var.a(org.telegram.ui.z4.a((TLRPC.Chat) b5Var.f32239c, (TLRPC.ChatFull) obj, f5VarArr));
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 2:
                Utilities.Callback callback = (Utilities.Callback) this.f4916c;
                c5.h hVar = (c5.h) obj;
                if (((c5.h) this.f4915b).f3888a == 0) {
                    AndroidUtilities.runOnUIThread(new wa(2, callback));
                    return;
                }
                return;
            case 3:
                tg.v vVar = (tg.v) this.f4916c;
                c5.h hVar2 = (c5.h) obj;
                if (((c5.h) this.f4915b).f3888a == 0) {
                    AndroidUtilities.runOnUIThread(new rg.q1(vVar, 7));
                    return;
                }
                return;
            case 4:
                q80 q80Var = (q80) this.f4916c;
                c5.h hVar3 = (c5.h) obj;
                int i10 = ((c5.h) this.f4915b).f3888a;
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
                AndroidUtilities.runOnUIThread(new ga0(q80Var, z10, responseCodeString, 14));
                return;
            default:
                ai.m0 m0Var = (ai.m0) this.f4916c;
                c5.h hVar4 = (c5.h) obj;
                int i11 = ((c5.h) this.f4915b).f3888a;
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
                AndroidUtilities.runOnUIThread(new ga0(m0Var, z11, responseCodeString2, 15));
                return;
        }
    }
}
