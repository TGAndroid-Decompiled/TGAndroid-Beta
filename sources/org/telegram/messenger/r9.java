package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.af0;
public final class r9 implements j20 {
    public final int f17709a;
    public final long f17710b;
    public final Object f17711c;
    public final Object d;

    public r9(Object obj, Object obj2, long j10, int i10) {
        this.f17709a = i10;
        this.f17711c = obj;
        this.d = obj2;
        this.f17710b = j10;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f17709a) {
            case 0:
                TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState = (TL_payments.TL_StarGiftAuctionState) obj;
                ((org.telegram.ui.Components.s2) this.d).a(((x9) this.f17711c).b(this.f17710b), (TLRPC.TL_error) obj2);
                return;
            case 1:
                vp vpVar = (vp) this.f17711c;
                yh.c0 c0Var = (yh.c0) this.d;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (bool != null) {
                    vpVar.T2(0, this.f17710b, true);
                }
                c0Var.a(bool, tL_error);
                return;
            case 2:
                vp vpVar2 = (vp) this.f17711c;
                yh.c0 c0Var2 = (yh.c0) this.d;
                TLRPC.Bool bool2 = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (bool2 != null) {
                    vpVar2.T2(0, this.f17710b, true);
                }
                c0Var2.a(bool2, tL_error2);
                return;
            default:
                af0 af0Var = (af0) this.d;
                TLRPC.auth_Authorization auth_authorization = (TLRPC.auth_Authorization) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                ((org.telegram.ui.ActionBar.x1) this.f17711c).dismiss();
                long j10 = this.f17710b;
                if (tL_error3 != null) {
                    af0Var.a(Long.valueOf(j10), null, tL_error3.text);
                    return;
                } else {
                    af0Var.a(Long.valueOf(j10), auth_authorization, null);
                    return;
                }
        }
    }

    public r9(vp vpVar, long j10, j20 j20Var, int i10) {
        this.f17709a = i10;
        this.f17711c = vpVar;
        this.f17710b = j10;
        this.d = j20Var;
    }
}
