package gg;

import kh.i5;
import lh.r5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.b5;
import org.telegram.ui.e5;
import org.telegram.ui.f5;
import org.telegram.ui.z4;
import ph.c5;
import ph.h9;
public final class m0 implements q0.a {
    public final int f6715a;
    public final Object f6716b;
    public final Object f6717c;

    public m0(int i10, Object obj, Object obj2) {
        this.f6715a = i10;
        this.f6716b = obj;
        this.f6717c = obj2;
    }

    @Override
    public final void accept(Object obj) {
        boolean z4;
        String responseCodeString;
        boolean z10;
        String responseCodeString2;
        switch (this.f6715a) {
            case 0:
                Utilities.Callback callback = (Utilities.Callback) this.f6717c;
                p2.h hVar = (p2.h) obj;
                if (((p2.h) this.f6716b).f40993a == 0) {
                    AndroidUtilities.runOnUIThread(new n0(1, callback));
                    return;
                }
                return;
            case 1:
                t0 t0Var = (t0) this.f6717c;
                p2.h hVar2 = (p2.h) obj;
                if (((p2.h) this.f6716b).f40993a == 0) {
                    AndroidUtilities.runOnUIThread(new ef.e(t0Var, 12));
                    return;
                }
                return;
            case 2:
                i5 i5Var = (i5) this.f6717c;
                p2.h hVar3 = (p2.h) obj;
                int i10 = ((p2.h) this.f6716b).f40993a;
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
                dh.v vVar = (dh.v) this.f6717c;
                p2.h hVar4 = (p2.h) obj;
                int i11 = ((p2.h) this.f6716b).f40993a;
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
                AndroidUtilities.runOnUIThread(new r5(vVar, z10, responseCodeString2, 2));
                return;
            case 4:
                e5 e5Var = (e5) this.f6716b;
                z4 z4Var = (z4) this.f6717c;
                f5[] f5VarArr = z4Var.f40668i;
                b5 b5Var = z4Var.f40669j;
                if (!e5Var.B) {
                    if (obj instanceof TLRPC.UserFull) {
                        e5Var.a(z4.c((TLRPC.User) b5Var.f32792c, (TLRPC.UserFull) obj, f5VarArr));
                        return;
                    } else if (obj instanceof TLRPC.ChatFull) {
                        e5Var.a(z4.a((TLRPC.Chat) b5Var.f32792c, (TLRPC.ChatFull) obj, f5VarArr));
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                c5.Z((h9) this.f6716b, (cg.f1) this.f6717c, (Integer) obj);
                return;
        }
    }
}
