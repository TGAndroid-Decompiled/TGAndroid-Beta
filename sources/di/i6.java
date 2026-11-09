package di;

import org.telegram.messenger.c20;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class i6 implements RequestDelegate {
    public final long f9113a;
    public final c20 f9114b;
    public final z6 f9115c;

    public i6(z6 z6Var, long j3, c20 c20Var) {
        this.f9115c = z6Var;
        this.f9113a = j3;
        this.f9114b = c20Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        org.telegram.messenger.g0.h3(new bi.w2(this, tLObject, this.f9113a, this.f9114b, 10));
    }
}
