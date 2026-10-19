package ai;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class i3 implements Runnable {
    public final int f1481a = 1;
    public final l7 f1482b;
    public final TLObject f1483c;
    public final long d;
    public final long e;
    public final TLRPC.TL_error f1484f;
    public final long h;
    public final Object f1485n;

    public i3(l7 l7Var, TLObject tLObject, long j10, long j11, Utilities.Callback callback, TLRPC.TL_error tL_error, long j12) {
        this.f1482b = l7Var;
        this.f1483c = tLObject;
        this.d = j10;
        this.e = j11;
        this.f1485n = callback;
        this.f1484f = tL_error;
        this.h = j12;
    }

    @Override
    public final void run() {
        switch (this.f1481a) {
            case 0:
                long j10 = this.h;
                TLRPC.TL_error tL_error = this.f1484f;
                l7.l1(this.f1482b, (org.telegram.ui.ActionBar.b2) this.f1485n, this.f1483c, this.d, this.e, j10, tL_error);
                return;
            default:
                TLRPC.TL_error tL_error2 = this.f1484f;
                long j11 = this.h;
                l7.l0(this.f1482b, this.f1483c, this.d, this.e, (Utilities.Callback) this.f1485n, tL_error2, j11);
                return;
        }
    }

    public i3(l7 l7Var, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, long j10, long j11, long j12, TLRPC.TL_error tL_error) {
        this.f1482b = l7Var;
        this.f1485n = b2Var;
        this.f1483c = tLObject;
        this.d = j10;
        this.e = j11;
        this.h = j12;
        this.f1484f = tL_error;
    }
}
