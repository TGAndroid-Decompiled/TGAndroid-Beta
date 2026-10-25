package bi;

import org.telegram.messenger.Utilities;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class e3 implements Runnable {
    public final int f4543a = 1;
    public final h7 f4544b;
    public final TLObject f4545c;
    public final long d;
    public final long e;
    public final TLRPC.TL_error f4546f;
    public final long h;
    public final Object f4547n;

    public e3(h7 h7Var, TLObject tLObject, long j10, long j11, Utilities.Callback callback, TLRPC.TL_error tL_error, long j12) {
        this.f4544b = h7Var;
        this.f4545c = tLObject;
        this.d = j10;
        this.e = j11;
        this.f4547n = callback;
        this.f4546f = tL_error;
        this.h = j12;
    }

    @Override
    public final void run() {
        switch (this.f4543a) {
            case 0:
                long j10 = this.h;
                TLRPC.TL_error tL_error = this.f4546f;
                h7.k1(this.f4544b, (org.telegram.ui.ActionBar.e2) this.f4547n, this.f4545c, this.d, this.e, j10, tL_error);
                return;
            default:
                TLRPC.TL_error tL_error2 = this.f4546f;
                long j11 = this.h;
                h7.k0(this.f4544b, this.f4545c, this.d, this.e, (Utilities.Callback) this.f4547n, tL_error2, j11);
                return;
        }
    }

    public e3(h7 h7Var, org.telegram.ui.ActionBar.e2 e2Var, TLObject tLObject, long j10, long j11, long j12, TLRPC.TL_error tL_error) {
        this.f4544b = h7Var;
        this.f4547n = e2Var;
        this.f4545c = tLObject;
        this.d = j10;
        this.e = j11;
        this.h = j12;
        this.f4546f = tL_error;
    }
}
