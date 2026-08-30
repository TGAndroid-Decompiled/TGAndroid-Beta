package lh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class l2 implements Runnable {
    public final int f12743a = 1;
    public final g5 f12744b;
    public final TLObject f12745c;
    public final long d;
    public final long e;
    public final TLRPC.TL_error f12746f;
    public final long h;
    public final Object f12747n;

    public l2(g5 g5Var, TLObject tLObject, long j10, long j11, Utilities.Callback callback, TLRPC.TL_error tL_error, long j12) {
        this.f12744b = g5Var;
        this.f12745c = tLObject;
        this.d = j10;
        this.e = j11;
        this.f12747n = callback;
        this.f12746f = tL_error;
        this.h = j12;
    }

    @Override
    public final void run() {
        switch (this.f12743a) {
            case 0:
                long j10 = this.h;
                TLRPC.TL_error tL_error = this.f12746f;
                g5.H0(this.f12744b, (org.telegram.ui.ActionBar.d2) this.f12747n, this.f12745c, this.d, this.e, j10, tL_error);
                return;
            default:
                TLRPC.TL_error tL_error2 = this.f12746f;
                long j11 = this.h;
                g5.f0(this.f12744b, this.f12745c, this.d, this.e, (Utilities.Callback) this.f12747n, tL_error2, j11);
                return;
        }
    }

    public l2(g5 g5Var, org.telegram.ui.ActionBar.d2 d2Var, TLObject tLObject, long j10, long j11, long j12, TLRPC.TL_error tL_error) {
        this.f12744b = g5Var;
        this.f12747n = d2Var;
        this.f12745c = tLObject;
        this.d = j10;
        this.e = j11;
        this.h = j12;
        this.f12746f = tL_error;
    }
}
