package ai;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class h3 implements Runnable {
    public final int f1417a = 1;
    public final k7 f1418b;
    public final TLObject f1419c;
    public final long d;
    public final long e;
    public final TLRPC.TL_error f1420f;
    public final long h;
    public final Object f1421n;

    public h3(k7 k7Var, TLObject tLObject, long j10, long j11, Utilities.Callback callback, TLRPC.TL_error tL_error, long j12) {
        this.f1418b = k7Var;
        this.f1419c = tLObject;
        this.d = j10;
        this.e = j11;
        this.f1421n = callback;
        this.f1420f = tL_error;
        this.h = j12;
    }

    @Override
    public final void run() {
        switch (this.f1417a) {
            case 0:
                long j10 = this.h;
                TLRPC.TL_error tL_error = this.f1420f;
                k7.i1(this.f1418b, (org.telegram.ui.ActionBar.b2) this.f1421n, this.f1419c, this.d, this.e, j10, tL_error);
                return;
            default:
                TLRPC.TL_error tL_error2 = this.f1420f;
                long j11 = this.h;
                k7.R(this.f1418b, this.f1419c, this.d, this.e, (Utilities.Callback) this.f1421n, tL_error2, j11);
                return;
        }
    }

    public h3(k7 k7Var, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, long j10, long j11, long j12, TLRPC.TL_error tL_error) {
        this.f1418b = k7Var;
        this.f1421n = b2Var;
        this.f1419c = tLObject;
        this.d = j10;
        this.e = j11;
        this.h = j12;
        this.f1420f = tL_error;
    }
}
