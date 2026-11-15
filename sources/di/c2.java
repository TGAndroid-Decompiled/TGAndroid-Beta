package di;

import org.telegram.messenger.z10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class c2 implements RequestDelegate {
    public final int f8291a = 1;
    public final c6 f8292b;
    public final long f8293c;
    public final long d;
    public final long f8294e;
    public final Object f8295f;

    public c2(c6 c6Var, long j3, long j10, z10 z10Var, long j11) {
        this.f8292b = c6Var;
        this.f8293c = j3;
        this.d = j10;
        this.f8295f = z10Var;
        this.f8294e = j11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f8291a) {
            case 0:
                org.telegram.messenger.g0.h3(new k2(this.f8292b, (org.telegram.ui.ActionBar.t1) this.f8295f, tLObject, this.f8293c, this.d, this.f8294e, tL_error));
                return;
            default:
                org.telegram.messenger.g0.h3(new k2(this.f8292b, tLObject, this.f8293c, this.d, (z10) this.f8295f, tL_error, this.f8294e));
                return;
        }
    }

    public c2(c6 c6Var, org.telegram.ui.ActionBar.t1 t1Var, long j3, long j10, long j11) {
        this.f8292b = c6Var;
        this.f8295f = t1Var;
        this.f8293c = j3;
        this.d = j10;
        this.f8294e = j11;
    }
}
