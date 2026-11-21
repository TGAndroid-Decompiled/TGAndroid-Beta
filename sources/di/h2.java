package di;

import org.telegram.messenger.x10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class h2 implements RequestDelegate {
    public final int f8944a = 1;
    public final f6 f8945b;
    public final long f8946c;
    public final long d;
    public final long f8947e;
    public final Object f8948f;

    public h2(f6 f6Var, long j3, long j10, x10 x10Var, long j11) {
        this.f8945b = f6Var;
        this.f8946c = j3;
        this.d = j10;
        this.f8948f = x10Var;
        this.f8947e = j11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f8944a) {
            case 0:
                org.telegram.messenger.g0.g3(new v2(this.f8945b, (org.telegram.ui.ActionBar.t1) this.f8948f, tLObject, this.f8946c, this.d, this.f8947e, tL_error));
                return;
            default:
                org.telegram.messenger.g0.g3(new v2(this.f8945b, tLObject, this.f8946c, this.d, (x10) this.f8948f, tL_error, this.f8947e));
                return;
        }
    }

    public h2(f6 f6Var, org.telegram.ui.ActionBar.t1 t1Var, long j3, long j10, long j11) {
        this.f8945b = f6Var;
        this.f8948f = t1Var;
        this.f8946c = j3;
        this.d = j10;
        this.f8947e = j11;
    }
}
