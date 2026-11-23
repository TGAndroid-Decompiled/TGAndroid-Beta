package di;

import org.telegram.messenger.y10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class h2 implements RequestDelegate {
    public final int f8947a = 1;
    public final f6 f8948b;
    public final long f8949c;
    public final long d;
    public final long f8950e;
    public final Object f8951f;

    public h2(f6 f6Var, long j3, long j10, y10 y10Var, long j11) {
        this.f8948b = f6Var;
        this.f8949c = j3;
        this.d = j10;
        this.f8951f = y10Var;
        this.f8950e = j11;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f8947a) {
            case 0:
                org.telegram.messenger.g0.g3(new v2(this.f8948b, (org.telegram.ui.ActionBar.t1) this.f8951f, tLObject, this.f8949c, this.d, this.f8950e, tL_error));
                return;
            default:
                org.telegram.messenger.g0.g3(new v2(this.f8948b, tLObject, this.f8949c, this.d, (y10) this.f8951f, tL_error, this.f8950e));
                return;
        }
    }

    public h2(f6 f6Var, org.telegram.ui.ActionBar.t1 t1Var, long j3, long j10, long j11) {
        this.f8948b = f6Var;
        this.f8951f = t1Var;
        this.f8949c = j3;
        this.d = j10;
        this.f8950e = j11;
    }
}
