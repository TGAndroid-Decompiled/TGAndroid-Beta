package jh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class l2 implements Runnable {
    public final int f12404a = 1;
    public final h5 f12405b;
    public final TLObject f12406c;
    public final long d;
    public final long f12407e;
    public final TLRPC.TL_error f12408f;
    public final long h;
    public final Object f12409n;

    public l2(h5 h5Var, TLObject tLObject, long j10, long j11, Utilities.Callback callback, TLRPC.TL_error tL_error, long j12) {
        this.f12405b = h5Var;
        this.f12406c = tLObject;
        this.d = j10;
        this.f12407e = j11;
        this.f12409n = callback;
        this.f12408f = tL_error;
        this.h = j12;
    }

    @Override
    public final void run() {
        switch (this.f12404a) {
            case 0:
                long j10 = this.h;
                TLRPC.TL_error tL_error = this.f12408f;
                h5.H0(this.f12405b, (org.telegram.ui.ActionBar.c2) this.f12409n, this.f12406c, this.d, this.f12407e, j10, tL_error);
                return;
            default:
                TLRPC.TL_error tL_error2 = this.f12408f;
                long j11 = this.h;
                h5.f0(this.f12405b, this.f12406c, this.d, this.f12407e, (Utilities.Callback) this.f12409n, tL_error2, j11);
                return;
        }
    }

    public l2(h5 h5Var, org.telegram.ui.ActionBar.c2 c2Var, TLObject tLObject, long j10, long j11, long j12, TLRPC.TL_error tL_error) {
        this.f12405b = h5Var;
        this.f12409n = c2Var;
        this.f12406c = tLObject;
        this.d = j10;
        this.f12407e = j11;
        this.h = j12;
        this.f12408f = tL_error;
    }
}
