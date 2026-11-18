package fi;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.w60;
public final class w5 implements RequestDelegate {
    public final long f12697a;
    public final w60 f12698b;
    public final p6 f12699c;

    public w5(p6 p6Var, long j3, w60 w60Var) {
        this.f12699c = p6Var;
        this.f12697a = j3;
        this.f12698b = w60Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        org.telegram.messenger.g0.g3(new di.i2(this, tLObject, this.f12697a, this.f12698b, 8));
    }
}
