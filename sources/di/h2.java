package di;

import org.telegram.messenger.w10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class h2 implements RequestDelegate {
    public final int f8908a = 1;
    public final f6 f8909b;
    public final long f8910c;
    public final long d;
    public final long f8911e;
    public final Object f8912f;

    public h2(f6 f6Var, long j3, long j10, w10 w10Var, long j11) {
        this.f8909b = f6Var;
        this.f8910c = j3;
        this.d = j10;
        this.f8912f = w10Var;
        this.f8911e = j11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f8908a) {
            case 0:
                org.telegram.messenger.g0.g3(new v2(this.f8909b, (org.telegram.ui.ActionBar.t1) this.f8912f, tLObject, this.f8910c, this.d, this.f8911e, tL_error));
                return;
            default:
                org.telegram.messenger.g0.g3(new v2(this.f8909b, tLObject, this.f8910c, this.d, (w10) this.f8912f, tL_error, this.f8911e));
                return;
        }
    }

    public h2(f6 f6Var, org.telegram.ui.ActionBar.t1 t1Var, long j3, long j10, long j11) {
        this.f8909b = f6Var;
        this.f8912f = t1Var;
        this.f8910c = j3;
        this.d = j10;
        this.f8911e = j11;
    }
}
