package di;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.d80;
import org.telegram.ui.dm0;
public final class l5 implements q0.a {
    public final int f7530a;
    public final Object f7531b;
    public final Object f7532c;

    public l5(int i10, Object obj, Object obj2) {
        this.f7530a = i10;
        this.f7531b = obj;
        this.f7532c = obj2;
    }

    @Override
    public final void accept(Object obj) {
        boolean z10;
        String responseCodeString;
        boolean z11;
        String responseCodeString2;
        switch (this.f7530a) {
            case 0:
                q6.Z((rb) this.f7531b, (qg.s0) this.f7532c, (Integer) obj);
                return;
            case 1:
                org.telegram.ui.c5 c5Var = (org.telegram.ui.c5) this.f7531b;
                org.telegram.ui.x4 x4Var = (org.telegram.ui.x4) this.f7532c;
                org.telegram.ui.d5[] d5VarArr = x4Var.f42589i;
                org.telegram.ui.z4 z4Var = x4Var.f42590j;
                if (!c5Var.E) {
                    if (obj instanceof TLRPC.UserFull) {
                        c5Var.a(org.telegram.ui.x4.c((TLRPC.User) z4Var.f43285c, (TLRPC.UserFull) obj, d5VarArr));
                        return;
                    } else if (obj instanceof TLRPC.ChatFull) {
                        c5Var.a(org.telegram.ui.x4.a((TLRPC.Chat) z4Var.f43285c, (TLRPC.ChatFull) obj, d5VarArr));
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 2:
                Utilities.Callback callback = (Utilities.Callback) this.f7532c;
                c5.h hVar = (c5.h) obj;
                if (((c5.h) this.f7531b).f4397a == 0) {
                    AndroidUtilities.runOnUIThread(new ab(2, callback));
                    return;
                }
                return;
            case 3:
                ug.w wVar = (ug.w) this.f7532c;
                c5.h hVar2 = (c5.h) obj;
                if (((c5.h) this.f7531b).f4397a == 0) {
                    AndroidUtilities.runOnUIThread(new sg.p0(wVar, 9));
                    return;
                }
                return;
            case 4:
                d80 d80Var = (d80) this.f7532c;
                c5.h hVar3 = (c5.h) obj;
                int i10 = ((c5.h) this.f7531b).f4397a;
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
                AndroidUtilities.runOnUIThread(new dm0(d80Var, z10, responseCodeString, 13));
                return;
            default:
                bi.f0 f0Var = (bi.f0) this.f7532c;
                c5.h hVar4 = (c5.h) obj;
                int i11 = ((c5.h) this.f7531b).f4397a;
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
                AndroidUtilities.runOnUIThread(new dm0(f0Var, z11, responseCodeString2, 14));
                return;
        }
    }
}
