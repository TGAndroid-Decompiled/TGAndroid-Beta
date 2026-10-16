package di;

import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.Components.c90;
import org.telegram.ui.gm0;
public final class j5 implements q0.a {
    public final int f7118a;
    public final Object f7119b;
    public final Object f7120c;

    public j5(int i10, Object obj, Object obj2) {
        this.f7118a = i10;
        this.f7119b = obj;
        this.f7120c = obj2;
    }

    @Override
    public final void accept(Object obj) {
        boolean z10;
        String responseCodeString;
        boolean z11;
        String responseCodeString2;
        switch (this.f7118a) {
            case 0:
                o6.Z((mb) this.f7119b, (qg.s0) this.f7120c, (Integer) obj);
                return;
            case 1:
                org.telegram.ui.g5 g5Var = (org.telegram.ui.g5) this.f7119b;
                org.telegram.ui.b5 b5Var = (org.telegram.ui.b5) this.f7120c;
                org.telegram.ui.h5[] h5VarArr = b5Var.f34204i;
                org.telegram.ui.d5 d5Var = b5Var.f34205j;
                if (!g5Var.E) {
                    if (obj instanceof TLRPC.UserFull) {
                        g5Var.a(org.telegram.ui.b5.c((TLRPC.User) d5Var.f34877c, (TLRPC.UserFull) obj, h5VarArr));
                        return;
                    } else if (obj instanceof TLRPC.ChatFull) {
                        g5Var.a(org.telegram.ui.b5.a((TLRPC.Chat) d5Var.f34877c, (TLRPC.ChatFull) obj, h5VarArr));
                        return;
                    } else {
                        return;
                    }
                }
                return;
            case 2:
                Utilities.Callback callback = (Utilities.Callback) this.f7120c;
                c5.i iVar = (c5.i) obj;
                if (((c5.i) this.f7119b).f4384a == 0) {
                    AndroidUtilities.runOnUIThread(new wa(2, callback));
                    return;
                }
                return;
            case 3:
                ug.v vVar = (ug.v) this.f7120c;
                c5.i iVar2 = (c5.i) obj;
                if (((c5.i) this.f7119b).f4384a == 0) {
                    AndroidUtilities.runOnUIThread(new ri.h0(vVar, 16));
                    return;
                }
                return;
            case 4:
                c90 c90Var = (c90) this.f7120c;
                c5.i iVar3 = (c5.i) obj;
                int i10 = ((c5.i) this.f7119b).f4384a;
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
                AndroidUtilities.runOnUIThread(new gm0(c90Var, z10, responseCodeString, 17));
                return;
            default:
                rh.r rVar = (rh.r) this.f7120c;
                c5.i iVar4 = (c5.i) obj;
                int i11 = ((c5.i) this.f7119b).f4384a;
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
                AndroidUtilities.runOnUIThread(new gm0(rVar, z11, responseCodeString2, 18));
                return;
        }
    }
}
