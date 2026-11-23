package org.telegram.messenger;

import org.telegram.tgnet.TLRPC;
import org.telegram.tgnet.tl.TL_payments;
import org.telegram.ui.ud0;
public final class p9 implements r10 {
    public final int f26291a;
    public final long f26292b;
    public final Object f26293c;
    public final Object d;

    public p9(Object obj, Object obj2, long j3, int i7) {
        this.f26291a = i7;
        this.f26293c = obj;
        this.d = obj2;
        this.f26292b = j3;
    }

    @Override
    public final void a(Object obj, Object obj2) {
        switch (this.f26291a) {
            case 0:
                TL_payments.TL_StarGiftAuctionState tL_StarGiftAuctionState = (TL_payments.TL_StarGiftAuctionState) obj;
                ((bi.z) this.d).a(((v9) this.f26293c).b(this.f26292b), (TLRPC.TL_error) obj2);
                return;
            case 1:
                np npVar = (np) this.f26293c;
                li.i0 i0Var = (li.i0) this.d;
                TLRPC.Bool bool = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error = (TLRPC.TL_error) obj2;
                if (bool != null) {
                    npVar.b3(0, this.f26292b, true);
                }
                i0Var.a(bool, tL_error);
                return;
            case 2:
                np npVar2 = (np) this.f26293c;
                li.i0 i0Var2 = (li.i0) this.d;
                TLRPC.Bool bool2 = (TLRPC.Bool) obj;
                TLRPC.TL_error tL_error2 = (TLRPC.TL_error) obj2;
                if (bool2 != null) {
                    npVar2.b3(0, this.f26292b, true);
                }
                i0Var2.a(bool2, tL_error2);
                return;
            default:
                ud0 ud0Var = (ud0) this.d;
                TLRPC.auth_Authorization auth_authorization = (TLRPC.auth_Authorization) obj;
                TLRPC.TL_error tL_error3 = (TLRPC.TL_error) obj2;
                ((org.telegram.ui.ActionBar.t1) this.f26293c).dismiss();
                long j3 = this.f26292b;
                if (tL_error3 != null) {
                    ud0Var.a(Long.valueOf(j3), null, tL_error3.text);
                    return;
                } else {
                    ud0Var.a(Long.valueOf(j3), auth_authorization, null);
                    return;
                }
        }
    }

    public p9(np npVar, long j3, r10 r10Var, int i7) {
        this.f26291a = i7;
        this.f26293c = npVar;
        this.f26292b = j3;
        this.d = r10Var;
    }
}
