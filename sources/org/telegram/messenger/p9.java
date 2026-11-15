package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.td0;
public final class p9 implements s10 {
    public final int f25915a;
    public final long f25916b;
    public final Object f25917c;
    public final Object d;

    public p9(Object obj, Object obj2, long j3, int i7) {
        this.f25915a = i7;
        this.f25917c = obj;
        this.d = obj2;
        this.f25916b = j3;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f25915a) {
            case 0:
                TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState = (TL_payments.TL_StarGiftAuctionState) obj;
                ((bi.z) this.d).a(((v9) this.f25917c).b(this.f25916b), (TLRPC.TL_error) obj2);
                return;
            case 1:
                np npVar = (np) this.f25917c;
                li.i0 i0Var = (li.i0) this.d;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (bool != null) {
                    npVar.V2(0, this.f25916b, true);
                }
                i0Var.a(bool, tL_error);
                return;
            case 2:
                np npVar2 = (np) this.f25917c;
                li.i0 i0Var2 = (li.i0) this.d;
                TLRPC.Bool bool2 = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (bool2 != null) {
                    npVar2.V2(0, this.f25916b, true);
                }
                i0Var2.a(bool2, tL_error2);
                return;
            default:
                td0 td0Var = (td0) this.d;
                TLRPC.auth_Authorization auth_authorization = (TLRPC.auth_Authorization) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                ((org.telegram.ui.ActionBar.t1) this.f25917c).dismiss();
                long j3 = this.f25916b;
                if (tL_error3 != null) {
                    td0Var.a(Long.valueOf(j3), null, tL_error3.text);
                    return;
                } else {
                    td0Var.a(Long.valueOf(j3), auth_authorization, null);
                    return;
                }
        }
    }

    public p9(np npVar, long j3, s10 s10Var, int i7) {
        this.f25915a = i7;
        this.f25917c = npVar;
        this.f25916b = j3;
        this.d = s10Var;
    }
}
