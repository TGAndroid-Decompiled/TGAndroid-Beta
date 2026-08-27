package cg;

import gh.p5;
import hh.t5;
import lh.f6;
import lh.va;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.messenger.BillingController;
import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.c5;
import org.telegram.ui.d5;
import org.telegram.ui.x4;
import org.telegram.ui.z4;

public final class n0 implements q0.a {

    public final int f2778a;

    public final Object f2779b;

    public final Object f2780c;

    public n0(int i10, Object obj, Object obj2) {
        this.f2778a = i10;
        this.f2779b = obj;
        this.f2780c = obj2;
    }

    @Override
    public final void accept(Object obj) {
        switch (this.f2778a) {
            case 0:
                n2.g gVar = (n2.g) this.f2779b;
                Utilities.Callback callback = (Utilities.Callback) this.f2780c;
                if (gVar.f18147a == 0) {
                    AndroidUtilities.runOnUIThread(new o0(1, callback));
                }
                break;
            case 1:
                n2.g gVar2 = (n2.g) this.f2779b;
                v0 v0Var = (v0) this.f2780c;
                if (gVar2.f18147a == 0) {
                    AndroidUtilities.runOnUIThread(new af.e(v0Var, 23));
                }
                break;
            case 2:
                n2.g gVar3 = (n2.g) this.f2779b;
                p5 p5Var = (p5) this.f2780c;
                int i10 = gVar3.f18147a;
                boolean z10 = i10 == 0;
                AndroidUtilities.runOnUIThread(new t5(p5Var, z10, z10 ? null : BillingController.getResponseCodeString(i10), 1));
                break;
            case 3:
                n2.g gVar4 = (n2.g) this.f2779b;
                u0 u0Var = (u0) this.f2780c;
                int i11 = gVar4.f18147a;
                boolean z11 = i11 == 0;
                AndroidUtilities.runOnUIThread(new t5(u0Var, z11, z11 ? null : BillingController.getResponseCodeString(i11), 2));
                break;
            case 4:
                f6.Z((va) this.f2779b, (yf.r0) this.f2780c, (Integer) obj);
                break;
            default:
                c5 c5Var = (c5) this.f2779b;
                x4 x4Var = (x4) this.f2780c;
                d5[] d5VarArr = x4Var.f44279i;
                z4 z4Var = x4Var.f44280j;
                if (!c5Var.A) {
                    if (obj instanceof TLRPC.UserFull) {
                        c5Var.a(x4.c((TLRPC.User) z4Var.f45019c, (TLRPC.UserFull) obj, d5VarArr));
                    } else if (obj instanceof TLRPC.ChatFull) {
                        c5Var.a(x4.a((TLRPC.Chat) z4Var.f45019c, (TLRPC.ChatFull) obj, d5VarArr));
                    }
                }
                break;
        }
    }
}
