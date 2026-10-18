package ai;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class g3 implements Runnable {
    public final int f1334a = 1;
    public final k7 f1335b;
    public final TLObject f1336c;
    public final long d;
    public final long e;
    public final TLRPC.TL_error f1337f;
    public final long h;
    public final Object f1338n;

    public g3(k7 k7Var, TLObject tLObject, long j10, long j11, Utilities.Callback callback, TLRPC.TL_error tL_error, long j12) {
        this.f1335b = k7Var;
        this.f1336c = tLObject;
        this.d = j10;
        this.e = j11;
        this.f1338n = callback;
        this.f1337f = tL_error;
        this.h = j12;
    }

    @Override
    public final void run() {
        switch (this.f1334a) {
            case 0:
                long j10 = this.h;
                TLRPC.TL_error tL_error = this.f1337f;
                k7.l1(this.f1335b, (org.telegram.ui.ActionBar.b2) this.f1338n, this.f1336c, this.d, this.e, j10, tL_error);
                return;
            default:
                TLRPC.TL_error tL_error2 = this.f1337f;
                long j11 = this.h;
                k7.E0(this.f1335b, this.f1336c, this.d, this.e, (Utilities.Callback) this.f1338n, tL_error2, j11);
                return;
        }
    }

    public g3(k7 k7Var, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, long j10, long j11, long j12, TLRPC.TL_error tL_error) {
        this.f1335b = k7Var;
        this.f1338n = b2Var;
        this.f1336c = tLObject;
        this.d = j10;
        this.e = j11;
        this.h = j12;
        this.f1337f = tL_error;
    }
}
