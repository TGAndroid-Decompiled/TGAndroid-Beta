package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.vd0;
public final class o9 implements q10 {
    public final int f26045a;
    public final long f26046b;
    public final Object f26047c;
    public final Object d;

    public o9(Object obj, Object obj2, long j3, int i7) {
        this.f26045a = i7;
        this.f26047c = obj;
        this.d = obj2;
        this.f26046b = j3;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f26045a) {
            case 0:
                TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState = (TL_payments.TL_StarGiftAuctionState) obj;
                ((bi.z) this.d).a(((u9) this.f26047c).b(this.f26046b), (TLRPC.TL_error) obj2);
                return;
            case 1:
                mp mpVar = (mp) this.f26047c;
                li.i0 i0Var = (li.i0) this.d;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (bool != null) {
                    mpVar.b3(0, this.f26046b, true);
                }
                i0Var.a(bool, tL_error);
                return;
            case 2:
                mp mpVar2 = (mp) this.f26047c;
                li.i0 i0Var2 = (li.i0) this.d;
                TLRPC.Bool bool2 = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (bool2 != null) {
                    mpVar2.b3(0, this.f26046b, true);
                }
                i0Var2.a(bool2, tL_error2);
                return;
            default:
                vd0 vd0Var = (vd0) this.d;
                TLRPC.auth_Authorization auth_authorization = (TLRPC.auth_Authorization) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                ((org.telegram.ui.ActionBar.u1) this.f26047c).dismiss();
                long j3 = this.f26046b;
                if (tL_error3 != null) {
                    vd0Var.a(Long.valueOf(j3), null, tL_error3.text);
                    return;
                } else {
                    vd0Var.a(Long.valueOf(j3), auth_authorization, null);
                    return;
                }
        }
    }

    public o9(mp mpVar, long j3, q10 q10Var, int i7) {
        this.f26045a = i7;
        this.f26047c = mpVar;
        this.f26046b = j3;
        this.d = q10Var;
    }
}
