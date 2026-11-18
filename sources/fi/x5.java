package fi;

import org.telegram.messenger.x10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class x5 implements RequestDelegate {
    public final long f12732a;
    public final x10 f12733b;
    public final p6 f12734c;

    public x5(p6 p6Var, long j3, x10 x10Var) {
        this.f12734c = p6Var;
        this.f12732a = j3;
        this.f12733b = x10Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        org.telegram.messenger.g0.g3(new di.i2(this, tLObject, this.f12732a, this.f12733b, 9));
    }
}
