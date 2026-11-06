package di;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.v60;
public final class g6 implements RequestDelegate {
    public final long f9048a;
    public final v60 f9049b;
    public final y6 f9050c;

    public g6(y6 y6Var, long j3, v60 v60Var) {
        this.f9050c = y6Var;
        this.f9048a = j3;
        this.f9049b = v60Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        org.telegram.messenger.g0.h3(new bi.w2(this, tLObject, this.f9048a, this.f9049b, 9));
    }
}
