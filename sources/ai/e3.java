package ai;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class e3 implements Runnable {
    public final int f1203a = 1;
    public final k7 f1204b;
    public final TLObject f1205c;
    public final long d;
    public final long e;
    public final TLRPC.TL_error f1206f;
    public final long h;
    public final Object f1207n;

    public e3(k7 k7Var, TLObject tLObject, long j10, long j11, Utilities.Callback callback, TLRPC.TL_error tL_error, long j12) {
        this.f1204b = k7Var;
        this.f1205c = tLObject;
        this.d = j10;
        this.e = j11;
        this.f1207n = callback;
        this.f1206f = tL_error;
        this.h = j12;
    }

    @Override
    public final void run() {
        switch (this.f1203a) {
            case 0:
                long j10 = this.h;
                TLRPC.TL_error tL_error = this.f1206f;
                k7.j1(this.f1204b, (org.telegram.ui.ActionBar.b2) this.f1207n, this.f1205c, this.d, this.e, j10, tL_error);
                return;
            default:
                TLRPC.TL_error tL_error2 = this.f1206f;
                long j11 = this.h;
                k7.X(this.f1204b, this.f1205c, this.d, this.e, (Utilities.Callback) this.f1207n, tL_error2, j11);
                return;
        }
    }

    public e3(k7 k7Var, org.telegram.ui.ActionBar.b2 b2Var, TLObject tLObject, long j10, long j11, long j12, TLRPC.TL_error tL_error) {
        this.f1204b = k7Var;
        this.f1207n = b2Var;
        this.f1205c = tLObject;
        this.d = j10;
        this.e = j11;
        this.h = j12;
        this.f1206f = tL_error;
    }
}
