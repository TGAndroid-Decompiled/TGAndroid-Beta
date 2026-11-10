package di;

import org.telegram.messenger.c20;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class i6 implements RequestDelegate {
    public final long f9118a;
    public final c20 f9119b;
    public final z6 f9120c;

    public i6(z6 z6Var, long j3, c20 c20Var) {
        this.f9120c = z6Var;
        this.f9118a = j3;
        this.f9119b = c20Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        org.telegram.messenger.g0.h3(new bi.w2(this, tLObject, this.f9118a, this.f9119b, 10));
    }
}
