package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ze0;
public final class s9 implements k20 {
    public final int f18073a;
    public final long f18074b;
    public final Object f18075c;
    public final Object d;

    public s9(Object obj, Object obj2, long j10, int i10) {
        this.f18073a = i10;
        this.f18075c = obj;
        this.d = obj2;
        this.f18074b = j10;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f18073a) {
            case 0:
                TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState = (TL_payments.TL_StarGiftAuctionState) obj;
                ((org.telegram.ui.Components.s2) this.d).a(((y9) this.f18075c).b(this.f18074b), (TLRPC.TL_error) obj2);
                return;
            case 1:
                wp wpVar = (wp) this.f18075c;
                yh.b0 b0Var = (yh.b0) this.d;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (bool != null) {
                    wpVar.T2(0, this.f18074b, true);
                }
                b0Var.a(bool, tL_error);
                return;
            case 2:
                wp wpVar2 = (wp) this.f18075c;
                yh.b0 b0Var2 = (yh.b0) this.d;
                TLRPC.Bool bool2 = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (bool2 != null) {
                    wpVar2.T2(0, this.f18074b, true);
                }
                b0Var2.a(bool2, tL_error2);
                return;
            default:
                ze0 ze0Var = (ze0) this.d;
                TLRPC.auth_Authorization auth_authorization = (TLRPC.auth_Authorization) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                ((org.telegram.ui.ActionBar.x1) this.f18075c).dismiss();
                long j10 = this.f18074b;
                if (tL_error3 != null) {
                    ze0Var.a(Long.valueOf(j10), null, tL_error3.text);
                    return;
                } else {
                    ze0Var.a(Long.valueOf(j10), auth_authorization, null);
                    return;
                }
        }
    }

    public s9(wp wpVar, long j10, k20 k20Var, int i10) {
        this.f18073a = i10;
        this.f18075c = wpVar;
        this.f18074b = j10;
        this.d = k20Var;
    }
}
