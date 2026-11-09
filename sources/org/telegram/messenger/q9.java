package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.vd0;
public final class q9 implements v10 {
    public final int f24683a;
    public final long f24684b;
    public final Object f24685c;
    public final Object d;

    public q9(Object obj, Object obj2, long j3, int i7) {
        this.f24683a = i7;
        this.f24685c = obj;
        this.d = obj2;
        this.f24684b = j3;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f24683a) {
            case 0:
                TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState = (TL_payments.TL_StarGiftAuctionState) obj;
                ((ai.v0) this.d).a(((w9) this.f24685c).b(this.f24684b), (TLRPC.TL_error) obj2);
                return;
            case 1:
                qp qpVar = (qp) this.f24685c;
                ii.j0 j0Var = (ii.j0) this.d;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (bool != null) {
                    qpVar.V2(0, this.f24684b, true);
                }
                j0Var.a(bool, tL_error);
                return;
            case 2:
                qp qpVar2 = (qp) this.f24685c;
                ii.j0 j0Var2 = (ii.j0) this.d;
                TLRPC.Bool bool2 = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (bool2 != null) {
                    qpVar2.V2(0, this.f24684b, true);
                }
                j0Var2.a(bool2, tL_error2);
                return;
            default:
                vd0 vd0Var = (vd0) this.d;
                TLRPC.auth_Authorization auth_authorization = (TLRPC.auth_Authorization) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                ((org.telegram.ui.ActionBar.u1) this.f24685c).dismiss();
                long j3 = this.f24684b;
                if (tL_error3 != null) {
                    vd0Var.a(Long.valueOf(j3), null, tL_error3.text);
                    return;
                } else {
                    vd0Var.a(Long.valueOf(j3), auth_authorization, null);
                    return;
                }
        }
    }

    public q9(qp qpVar, long j3, v10 v10Var, int i7) {
        this.f24683a = i7;
        this.f24685c = qpVar;
        this.f24684b = j3;
        this.d = v10Var;
    }
}
