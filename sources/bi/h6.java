package bi;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.n80;
import org.telegram.ui.cm0;
public final class h6 implements q0.a {
    public final int f2789a;
    public final Object f2790b;
    public final Object f2791c;

    public h6(int i10, Object obj, Object obj2) {
        this.f2789a = i10;
        this.f2790b = obj;
        this.f2791c = obj2;
    }

    @Override
    public final void accept(Object obj) {
        boolean z10;
        String responseCodeString;
        boolean z11;
        String responseCodeString2;
        switch (this.f2789a) {
            case 0:
                r7.Z((ad) this.f2790b, (og.x0) this.f2791c, (Integer) obj);
                return;
            case 1:
                org.telegram.ui.c5 c5Var = (org.telegram.ui.c5) this.f2790b;
                org.telegram.ui.x4 x4Var = (org.telegram.ui.x4) this.f2791c;
                org.telegram.ui.d5[] d5VarArr = x4Var.f38578i;
                org.telegram.ui.z4 z4Var = x4Var.f38579j;
                if (!c5Var.E) {
                    if (obj instanceof TLRPC.UserFull) {
                        c5Var.a(org.telegram.ui.x4.c((TLRPC.User) z4Var.f39207c, (TLRPC.UserFull) obj, d5VarArr));
                        return;
                    } else if (obj instanceof TLRPC.ChatFull) {
                        c5Var.a(org.telegram.ui.x4.a((TLRPC.Chat) z4Var.f39207c, (TLRPC.ChatFull) obj, d5VarArr));
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 2:
                Utilities.Callback callback = (Utilities.Callback) this.f2791c;
                c5.h hVar = (c5.h) obj;
                if (((c5.h) this.f2790b).f4308a == 0) {
                    AndroidUtilities.runOnUIThread(new jc(2, callback));
                    return;
                }
                return;
            case 3:
                sg.v vVar = (sg.v) this.f2791c;
                c5.h hVar2 = (c5.h) obj;
                if (((c5.h) this.f2790b).f4308a == 0) {
                    AndroidUtilities.runOnUIThread(new qg.q0(vVar, 13));
                    return;
                }
                return;
            case 4:
                n80 n80Var = (n80) this.f2791c;
                c5.h hVar3 = (c5.h) obj;
                int i10 = ((c5.h) this.f2790b).f4308a;
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
                AndroidUtilities.runOnUIThread(new cm0(n80Var, z10, responseCodeString, 13));
                return;
            default:
                k6 k6Var = (k6) this.f2791c;
                c5.h hVar4 = (c5.h) obj;
                int i11 = ((c5.h) this.f2790b).f4308a;
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
                AndroidUtilities.runOnUIThread(new cm0(k6Var, z11, responseCodeString2, 14));
                return;
        }
    }
}
