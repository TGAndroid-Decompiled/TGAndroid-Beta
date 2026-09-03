package gg;

import kh.h5;
import lh.r5;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.b5;
import org.telegram.ui.d5;
import org.telegram.ui.g5;
import ph.c5;
import ph.h9;
public final class m0 implements q0.a {
    public final int f6702a;
    public final Object f6703b;
    public final Object f6704c;

    public m0(int i10, Object obj, Object obj2) {
        this.f6702a = i10;
        this.f6703b = obj;
        this.f6704c = obj2;
    }

    @Override
    public final void accept(Object obj) {
        boolean z4;
        String responseCodeString;
        boolean z10;
        String responseCodeString2;
        switch (this.f6702a) {
            case 0:
                Utilities.Callback callback = (Utilities.Callback) this.f6704c;
                p2.h hVar = (p2.h) obj;
                if (((p2.h) this.f6703b).f41015a == 0) {
                    AndroidUtilities.runOnUIThread(new n0(1, callback));
                    return;
                }
                return;
            case 1:
                t0 t0Var = (t0) this.f6704c;
                p2.h hVar2 = (p2.h) obj;
                if (((p2.h) this.f6703b).f41015a == 0) {
                    AndroidUtilities.runOnUIThread(new e3.h(t0Var, 12));
                    return;
                }
                return;
            case 2:
                h5 h5Var = (h5) this.f6704c;
                p2.h hVar3 = (p2.h) obj;
                int i10 = ((p2.h) this.f6703b).f41015a;
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
                AndroidUtilities.runOnUIThread(new r5(h5Var, z4, responseCodeString, 1));
                return;
            case 3:
                dh.v vVar = (dh.v) this.f6704c;
                p2.h hVar4 = (p2.h) obj;
                int i11 = ((p2.h) this.f6703b).f41015a;
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
                g5 g5Var = (g5) this.f6703b;
                b5 b5Var = (b5) this.f6704c;
                org.telegram.ui.h5[] h5VarArr = b5Var.f32737i;
                d5 d5Var = b5Var.f32738j;
                if (!g5Var.B) {
                    if (obj instanceof TLRPC.UserFull) {
                        g5Var.a(b5.c((TLRPC.User) d5Var.f33325c, (TLRPC.UserFull) obj, h5VarArr));
                        return;
                    } else if (obj instanceof TLRPC.ChatFull) {
                        g5Var.a(b5.a((TLRPC.Chat) d5Var.f33325c, (TLRPC.ChatFull) obj, h5VarArr));
                        return;
                    } else {
                        return;
                    }
                }
                return;
            default:
                c5.Z((h9) this.f6703b, (cg.f1) this.f6704c, (Integer) obj);
                return;
        }
    }
}
