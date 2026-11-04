package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.qd0;
public final class k9 implements n10 {
    public final int f23805a;
    public final long f23806b;
    public final Object f23807c;
    public final Object d;

    public k9(Object obj, Object obj2, long j10, int i3) {
        this.f23805a = i3;
        this.f23807c = obj;
        this.d = obj2;
        this.f23806b = j10;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f23805a) {
            case 0:
                TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState = (TL_payments.TL_StarGiftAuctionState) obj;
                ((ai.f0) this.d).a(((q9) this.f23807c).b(this.f23806b), (TLRPC.TL_error) obj2);
                return;
            case 1:
                hp hpVar = (hp) this.f23807c;
                ji.g0 g0Var = (ji.g0) this.d;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (bool != null) {
                    hpVar.V2(0, this.f23806b, true);
                }
                g0Var.a(bool, tL_error);
                return;
            case 2:
                hp hpVar2 = (hp) this.f23807c;
                ji.g0 g0Var2 = (ji.g0) this.d;
                TLRPC.Bool bool2 = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (bool2 != null) {
                    hpVar2.V2(0, this.f23806b, true);
                }
                g0Var2.a(bool2, tL_error2);
                return;
            default:
                qd0 qd0Var = (qd0) this.d;
                TLRPC.auth_Authorization auth_authorization = (TLRPC.auth_Authorization) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                ((org.telegram.ui.ActionBar.s1) this.f23807c).dismiss();
                long j10 = this.f23806b;
                if (tL_error3 != null) {
                    qd0Var.a(Long.valueOf(j10), null, tL_error3.text);
                    return;
                } else {
                    qd0Var.a(Long.valueOf(j10), auth_authorization, null);
                    return;
                }
        }
    }

    public k9(hp hpVar, long j10, n10 n10Var, int i3) {
        this.f23805a = i3;
        this.f23807c = hpVar;
        this.f23806b = j10;
        this.d = n10Var;
    }
}
