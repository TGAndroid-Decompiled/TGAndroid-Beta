package mh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class k2 implements Runnable {
    public final int f14324a = 1;
    public final g5 f14325b;
    public final TLObject f14326c;
    public final long d;
    public final long f14327e;
    public final TLRPC.TL_error f14328f;
    public final long h;
    public final Object f14329n;

    public k2(g5 g5Var, TLObject tLObject, long j10, long j11, Utilities.Callback callback, TLRPC.TL_error tL_error, long j12) {
        this.f14325b = g5Var;
        this.f14326c = tLObject;
        this.d = j10;
        this.f14327e = j11;
        this.f14329n = callback;
        this.f14328f = tL_error;
        this.h = j12;
    }

    @Override
    public final void run() {
        switch (this.f14324a) {
            case 0:
                long j10 = this.h;
                TLRPC.TL_error tL_error = this.f14328f;
                g5.H0(this.f14325b, (org.telegram.ui.ActionBar.d2) this.f14329n, this.f14326c, this.d, this.f14327e, j10, tL_error);
                return;
            default:
                TLRPC.TL_error tL_error2 = this.f14328f;
                long j11 = this.h;
                g5.f0(this.f14325b, this.f14326c, this.d, this.f14327e, (Utilities.Callback) this.f14329n, tL_error2, j11);
                return;
        }
    }

    public k2(g5 g5Var, org.telegram.ui.ActionBar.d2 d2Var, TLObject tLObject, long j10, long j11, long j12, TLRPC.TL_error tL_error) {
        this.f14325b = g5Var;
        this.f14329n = d2Var;
        this.f14326c = tLObject;
        this.d = j10;
        this.f14327e = j11;
        this.h = j12;
        this.f14328f = tL_error;
    }
}
