package di;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.x60;
public final class h6 implements RequestDelegate {
    public final long f9074a;
    public final x60 f9075b;
    public final z6 f9076c;

    public h6(z6 z6Var, long j3, x60 x60Var) {
        this.f9076c = z6Var;
        this.f9074a = j3;
        this.f9075b = x60Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        org.telegram.messenger.g0.h3(new bi.w2(this, tLObject, this.f9074a, this.f9075b, 9));
    }
}
