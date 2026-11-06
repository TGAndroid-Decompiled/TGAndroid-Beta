package di;

import org.telegram.messenger.c20;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class h6 implements RequestDelegate {
    public final long f9083a;
    public final c20 f9084b;
    public final y6 f9085c;

    public h6(y6 y6Var, long j3, c20 c20Var) {
        this.f9085c = y6Var;
        this.f9083a = j3;
        this.f9084b = c20Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        org.telegram.messenger.g0.h3(new bi.w2(this, tLObject, this.f9083a, this.f9084b, 10));
    }
}
