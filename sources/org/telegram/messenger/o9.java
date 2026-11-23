package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.td0;
public final class o9 implements p10 {
    public final int f26142a;
    public final long f26143b;
    public final Object f26144c;
    public final Object d;

    public o9(Object obj, Object obj2, long j3, int i7) {
        this.f26142a = i7;
        this.f26144c = obj;
        this.d = obj2;
        this.f26143b = j3;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f26142a) {
            case 0:
                TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState = (TL_payments.TL_StarGiftAuctionState) obj;
                ((bi.z) this.d).a(((u9) this.f26144c).b(this.f26143b), (TLRPC.TL_error) obj2);
                return;
            case 1:
                mp mpVar = (mp) this.f26144c;
                li.h0 h0Var = (li.h0) this.d;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (bool != null) {
                    mpVar.b3(0, this.f26143b, true);
                }
                h0Var.a(bool, tL_error);
                return;
            case 2:
                mp mpVar2 = (mp) this.f26144c;
                li.h0 h0Var2 = (li.h0) this.d;
                TLRPC.Bool bool2 = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (bool2 != null) {
                    mpVar2.b3(0, this.f26143b, true);
                }
                h0Var2.a(bool2, tL_error2);
                return;
            default:
                td0 td0Var = (td0) this.d;
                TLRPC.auth_Authorization auth_authorization = (TLRPC.auth_Authorization) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                ((org.telegram.ui.ActionBar.t1) this.f26144c).dismiss();
                long j3 = this.f26143b;
                if (tL_error3 != null) {
                    td0Var.a(Long.valueOf(j3), null, tL_error3.text);
                    return;
                } else {
                    td0Var.a(Long.valueOf(j3), auth_authorization, null);
                    return;
                }
        }
    }

    public o9(mp mpVar, long j3, p10 p10Var, int i7) {
        this.f26142a = i7;
        this.f26144c = mpVar;
        this.f26143b = j3;
        this.d = p10Var;
    }
}
