package mh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class k2 implements Runnable {
    public final int f14326a = 1;
    public final g5 f14327b;
    public final TLObject f14328c;
    public final long d;
    public final long f14329e;
    public final TLRPC.TL_error f14330f;
    public final long h;
    public final Object f14331n;

    public k2(g5 g5Var, TLObject tLObject, long j10, long j11, Utilities.Callback callback, TLRPC.TL_error tL_error, long j12) {
        this.f14327b = g5Var;
        this.f14328c = tLObject;
        this.d = j10;
        this.f14329e = j11;
        this.f14331n = callback;
        this.f14330f = tL_error;
        this.h = j12;
    }

    @Override
    public final void run() {
        switch (this.f14326a) {
            case 0:
                long j10 = this.h;
                TLRPC.TL_error tL_error = this.f14330f;
                g5.H0(this.f14327b, (org.telegram.ui.ActionBar.d2) this.f14331n, this.f14328c, this.d, this.f14329e, j10, tL_error);
                return;
            default:
                TLRPC.TL_error tL_error2 = this.f14330f;
                long j11 = this.h;
                g5.f0(this.f14327b, this.f14328c, this.d, this.f14329e, (Utilities.Callback) this.f14331n, tL_error2, j11);
                return;
        }
    }

    public k2(g5 g5Var, org.telegram.ui.ActionBar.d2 d2Var, TLObject tLObject, long j10, long j11, long j12, TLRPC.TL_error tL_error) {
        this.f14327b = g5Var;
        this.f14331n = d2Var;
        this.f14328c = tLObject;
        this.d = j10;
        this.f14329e = j11;
        this.h = j12;
        this.f14330f = tL_error;
    }
}
