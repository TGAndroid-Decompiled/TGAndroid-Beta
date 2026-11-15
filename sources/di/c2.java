package di;

import org.telegram.messenger.z10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class c2 implements RequestDelegate {
    public final int f8292a = 1;
    public final c6 f8293b;
    public final long f8294c;
    public final long d;
    public final long f8295e;
    public final Object f8296f;

    public c2(c6 c6Var, long j3, long j10, z10 z10Var, long j11) {
        this.f8293b = c6Var;
        this.f8294c = j3;
        this.d = j10;
        this.f8296f = z10Var;
        this.f8295e = j11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f8292a) {
            case 0:
                org.telegram.messenger.g0.h3(new k2(this.f8293b, (org.telegram.ui.ActionBar.t1) this.f8296f, tLObject, this.f8294c, this.d, this.f8295e, tL_error));
                return;
            default:
                org.telegram.messenger.g0.h3(new k2(this.f8293b, tLObject, this.f8294c, this.d, (z10) this.f8296f, tL_error, this.f8295e));
                return;
        }
    }

    public c2(c6 c6Var, org.telegram.ui.ActionBar.t1 t1Var, long j3, long j10, long j11) {
        this.f8293b = c6Var;
        this.f8296f = t1Var;
        this.f8294c = j3;
        this.d = j10;
        this.f8295e = j11;
    }
}
