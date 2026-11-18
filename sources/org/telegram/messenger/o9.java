package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ud0;
public final class o9 implements q10 {
    public final int f26047a;
    public final long f26048b;
    public final Object f26049c;
    public final Object d;

    public o9(Object obj, Object obj2, long j3, int i7) {
        this.f26047a = i7;
        this.f26049c = obj;
        this.d = obj2;
        this.f26048b = j3;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f26047a) {
            case 0:
                TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState = (TL_payments.TL_StarGiftAuctionState) obj;
                ((bi.z) this.d).a(((u9) this.f26049c).b(this.f26048b), (TLRPC.TL_error) obj2);
                return;
            case 1:
                mp mpVar = (mp) this.f26049c;
                li.i0 i0Var = (li.i0) this.d;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (bool != null) {
                    mpVar.b3(0, this.f26048b, true);
                }
                i0Var.a(bool, tL_error);
                return;
            case 2:
                mp mpVar2 = (mp) this.f26049c;
                li.i0 i0Var2 = (li.i0) this.d;
                TLRPC.Bool bool2 = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (bool2 != null) {
                    mpVar2.b3(0, this.f26048b, true);
                }
                i0Var2.a(bool2, tL_error2);
                return;
            default:
                ud0 ud0Var = (ud0) this.d;
                TLRPC.auth_Authorization auth_authorization = (TLRPC.auth_Authorization) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                ((org.telegram.ui.ActionBar.u1) this.f26049c).dismiss();
                long j3 = this.f26048b;
                if (tL_error3 != null) {
                    ud0Var.a(Long.valueOf(j3), null, tL_error3.text);
                    return;
                } else {
                    ud0Var.a(Long.valueOf(j3), auth_authorization, null);
                    return;
                }
        }
    }

    public o9(mp mpVar, long j3, q10 q10Var, int i7) {
        this.f26047a = i7;
        this.f26049c = mpVar;
        this.f26048b = j3;
        this.d = q10Var;
    }
}
