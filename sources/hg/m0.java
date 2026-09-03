package hg;

import lh.i5;
import mh.r5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.b5;
import org.telegram.ui.e5;
import org.telegram.ui.f5;
import org.telegram.ui.z4;
import qh.a5;
import qh.e9;
public final class m0 implements q0.a {
    public final int f7566a;
    public final Object f7567b;
    public final Object f7568c;

    public m0(int i10, Object obj, Object obj2) {
        this.f7566a = i10;
        this.f7567b = obj;
        this.f7568c = obj2;
    }

    @Override
    public final void accept(Object obj) {
        boolean z4;
        String responseCodeString;
        boolean z10;
        String responseCodeString2;
        switch (this.f7566a) {
            case 0:
                Utilities.Callback callback = (Utilities.Callback) this.f7568c;
                p2.h hVar = (p2.h) obj;
                if (((p2.h) this.f7567b).f44176a == 0) {
                    AndroidUtilities.runOnUIThread(new n0(1, callback));
                    return;
                }
                return;
            case 1:
                t0 t0Var = (t0) this.f7568c;
                p2.h hVar2 = (p2.h) obj;
                if (((p2.h) this.f7567b).f44176a == 0) {
                    AndroidUtilities.runOnUIThread(new eh.m(t0Var, 14));
                    return;
                }
                return;
            case 2:
                i5 i5Var = (i5) this.f7568c;
                p2.h hVar3 = (p2.h) obj;
                int i10 = ((p2.h) this.f7567b).f44176a;
                if (i10 == 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z4) {
                    responseCodeString = null;
                } else {
                    responseCodeString = BillingController.getResponseCodeString(i10);
                }
                AndroidUtilities.runOnUIThread(new r5(i5Var, z4, responseCodeString, 1));
                return;
            case 3:
                eh.w wVar = (eh.w) this.f7568c;
                p2.h hVar4 = (p2.h) obj;
                int i11 = ((p2.h) this.f7567b).f44176a;
                if (i11 == 0) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (z10) {
                    responseCodeString2 = null;
                } else {
                    responseCodeString2 = BillingController.getResponseCodeString(i11);
                }
                AndroidUtilities.runOnUIThread(new r5(wVar, z10, responseCodeString2, 2));
                return;
            case 4:
                e5 e5Var = (e5) this.f7567b;
                z4 z4Var = (z4) this.f7568c;
                f5[] f5VarArr = z4Var.f43795i;
                b5 b5Var = z4Var.f43796j;
                if (!e5Var.B) {
                    if (obj instanceof TLRPC.UserFull) {
                        e5Var.a(z4.c((TLRPC.User) b5Var.f35353c, (TLRPC.UserFull) obj, f5VarArr));
                        return;
                    } else if (obj instanceof TLRPC.ChatFull) {
                        e5Var.a(z4.a((TLRPC.Chat) b5Var.f35353c, (TLRPC.ChatFull) obj, f5VarArr));
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                a5.Z((e9) this.f7567b, (dg.e1) this.f7568c, (Integer) obj);
                return;
        }
    }
}
