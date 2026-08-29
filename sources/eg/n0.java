package eg;

import ih.i5;
import jh.r5;
import nh.ja;
import nh.t5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.c5;
import org.telegram.ui.d5;
import org.telegram.ui.x4;
import org.telegram.ui.z4;
public final class n0 implements q0.a {
    public final int f6097a;
    public final Object f6098b;
    public final Object f6099c;

    public n0(int i10, Object obj, Object obj2) {
        this.f6097a = i10;
        this.f6098b = obj;
        this.f6099c = obj2;
    }

    @Override
    public final void accept(Object obj) {
        boolean z10;
        String responseCodeString;
        boolean z11;
        String responseCodeString2;
        switch (this.f6097a) {
            case 0:
                Utilities.Callback callback = (Utilities.Callback) this.f6099c;
                p2.g gVar = (p2.g) obj;
                if (((p2.g) this.f6098b).f45457a == 0) {
                    AndroidUtilities.runOnUIThread(new o0(1, callback));
                    return;
                }
                return;
            case 1:
                u0 u0Var = (u0) this.f6099c;
                p2.g gVar2 = (p2.g) obj;
                if (((p2.g) this.f6098b).f45457a == 0) {
                    AndroidUtilities.runOnUIThread(new cg.m2(u0Var, 10));
                    return;
                }
                return;
            case 2:
                i5 i5Var = (i5) this.f6099c;
                p2.g gVar3 = (p2.g) obj;
                int i10 = ((p2.g) this.f6098b).f45457a;
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
                AndroidUtilities.runOnUIThread(new r5(i5Var, z10, responseCodeString, 1));
                return;
            case 3:
                bh.v vVar = (bh.v) this.f6099c;
                p2.g gVar4 = (p2.g) obj;
                int i11 = ((p2.g) this.f6098b).f45457a;
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
                AndroidUtilities.runOnUIThread(new r5(vVar, z11, responseCodeString2, 2));
                return;
            case 4:
                t5.Z((ja) this.f6098b, (ag.h1) this.f6099c, (Integer) obj);
                return;
            default:
                c5 c5Var = (c5) this.f6098b;
                x4 x4Var = (x4) this.f6099c;
                d5[] d5VarArr = x4Var.f44459i;
                z4 z4Var = x4Var.f44460j;
                if (!c5Var.A) {
                    if (obj instanceof TLRPC.UserFull) {
                        c5Var.a(x4.c((TLRPC.User) z4Var.f45065c, (TLRPC.UserFull) obj, d5VarArr));
                        return;
                    } else if (obj instanceof TLRPC.ChatFull) {
                        c5Var.a(x4.a((TLRPC.Chat) z4Var.f45065c, (TLRPC.ChatFull) obj, d5VarArr));
                        return;
                    } else {
                        return;
                    }
                }
                return;
        }
    }
}
