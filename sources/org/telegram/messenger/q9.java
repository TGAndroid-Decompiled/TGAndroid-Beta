package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.td0;
public final class q9 implements v10 {
    public final int f24672a;
    public final long f24673b;
    public final Object f24674c;
    public final Object d;

    public q9(Object obj, Object obj2, long j3, int i7) {
        this.f24672a = i7;
        this.f24674c = obj;
        this.d = obj2;
        this.f24673b = j3;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f24672a) {
            case 0:
                TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState = (TL_payments.TL_StarGiftAuctionState) obj;
                ((ai.v0) this.d).a(((w9) this.f24674c).b(this.f24673b), (TLRPC.TL_error) obj2);
                return;
            case 1:
                qp qpVar = (qp) this.f24674c;
                ii.j0 j0Var = (ii.j0) this.d;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (bool != null) {
                    qpVar.V2(0, this.f24673b, true);
                }
                j0Var.a(bool, tL_error);
                return;
            case 2:
                qp qpVar2 = (qp) this.f24674c;
                ii.j0 j0Var2 = (ii.j0) this.d;
                TLRPC.Bool bool2 = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (bool2 != null) {
                    qpVar2.V2(0, this.f24673b, true);
                }
                j0Var2.a(bool2, tL_error2);
                return;
            default:
                td0 td0Var = (td0) this.d;
                TLRPC.auth_Authorization auth_authorization = (TLRPC.auth_Authorization) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                ((org.telegram.ui.ActionBar.u1) this.f24674c).dismiss();
                long j3 = this.f24673b;
                if (tL_error3 != null) {
                    td0Var.a(Long.valueOf(j3), null, tL_error3.text);
                    return;
                } else {
                    td0Var.a(Long.valueOf(j3), auth_authorization, null);
                    return;
                }
        }
    }

    public q9(qp qpVar, long j3, v10 v10Var, int i7) {
        this.f24672a = i7;
        this.f24674c = qpVar;
        this.f24673b = j3;
        this.d = v10Var;
    }
}
