package lh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class l2 implements Runnable {
    public final int f12727a = 1;
    public final g5 f12728b;
    public final TLObject f12729c;
    public final long d;
    public final long e;
    public final TLRPC.TL_error f12730f;
    public final long h;
    public final Object f12731n;

    public l2(g5 g5Var, TLObject tLObject, long j10, long j11, Utilities.Callback callback, TLRPC.TL_error tL_error, long j12) {
        this.f12728b = g5Var;
        this.f12729c = tLObject;
        this.d = j10;
        this.e = j11;
        this.f12731n = callback;
        this.f12730f = tL_error;
        this.h = j12;
    }

    @Override
    public final void run() {
        switch (this.f12727a) {
            case 0:
                long j10 = this.h;
                TLRPC.TL_error tL_error = this.f12730f;
                g5.H0(this.f12728b, (org.telegram.ui.ActionBar.d2) this.f12731n, this.f12729c, this.d, this.e, j10, tL_error);
                return;
            default:
                TLRPC.TL_error tL_error2 = this.f12730f;
                long j11 = this.h;
                g5.f0(this.f12728b, this.f12729c, this.d, this.e, (Utilities.Callback) this.f12731n, tL_error2, j11);
                return;
        }
    }

    public l2(g5 g5Var, org.telegram.ui.ActionBar.d2 d2Var, TLObject tLObject, long j10, long j11, long j12, TLRPC.TL_error tL_error) {
        this.f12728b = g5Var;
        this.f12731n = d2Var;
        this.f12729c = tLObject;
        this.d = j10;
        this.e = j11;
        this.h = j12;
        this.f12730f = tL_error;
    }
}
