package ei;

import org.telegram.messenger.u10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class i6 implements RequestDelegate {
    public final long f10412a;
    public final u10 f10413b;
    public final z6 f10414c;

    public i6(z6 z6Var, long j10, u10 u10Var) {
        this.f10414c = z6Var;
        this.f10412a = j10;
        this.f10413b = u10Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        org.telegram.messenger.g0.h3(new ci.l2(this, tLObject, this.f10412a, this.f10413b, 10));
    }
}
