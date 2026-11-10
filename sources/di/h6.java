package di;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.y60;
public final class h6 implements RequestDelegate {
    public final long f9079a;
    public final y60 f9080b;
    public final z6 f9081c;

    public h6(z6 z6Var, long j3, y60 y60Var) {
        this.f9081c = z6Var;
        this.f9079a = j3;
        this.f9080b = y60Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        org.telegram.messenger.g0.h3(new bi.w2(this, tLObject, this.f9079a, this.f9080b, 9));
    }
}
