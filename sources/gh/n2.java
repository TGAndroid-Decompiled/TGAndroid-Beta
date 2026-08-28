package gh;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class n2 implements Runnable {
    public final int f8594a = 1;
    public final k5 f8595b;
    public final TLObject f8596c;
    public final long d;
    public final long f8597e;
    public final TLRPC.TL_error f8598f;
    public final long h;
    public final Object f8599n;

    public n2(k5 k5Var, TLObject tLObject, long j10, long j11, Utilities.Callback callback, TLRPC.TL_error tL_error, long j12) {
        this.f8595b = k5Var;
        this.f8596c = tLObject;
        this.d = j10;
        this.f8597e = j11;
        this.f8599n = callback;
        this.f8598f = tL_error;
        this.h = j12;
    }

    @Override
    public final void run() {
        switch (this.f8594a) {
            case 0:
                long j10 = this.h;
                TLRPC.TL_error tL_error = this.f8598f;
                k5.G0(this.f8595b, (org.telegram.ui.ActionBar.c2) this.f8599n, this.f8596c, this.d, this.f8597e, j10, tL_error);
                return;
            default:
                TLRPC.TL_error tL_error2 = this.f8598f;
                long j11 = this.h;
                k5.e0(this.f8595b, this.f8596c, this.d, this.f8597e, (Utilities.Callback) this.f8599n, tL_error2, j11);
                return;
        }
    }

    public n2(k5 k5Var, org.telegram.ui.ActionBar.c2 c2Var, TLObject tLObject, long j10, long j11, long j12, TLRPC.TL_error tL_error) {
        this.f8595b = k5Var;
        this.f8599n = c2Var;
        this.f8596c = tLObject;
        this.d = j10;
        this.f8597e = j11;
        this.h = j12;
        this.f8598f = tL_error;
    }
}
