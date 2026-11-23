package fi;

import org.telegram.messenger.y10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class x5 implements RequestDelegate {
    public final long f12727a;
    public final y10 f12728b;
    public final p6 f12729c;

    public x5(p6 p6Var, long j3, y10 y10Var) {
        this.f12729c = p6Var;
        this.f12727a = j3;
        this.f12728b = y10Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        org.telegram.messenger.g0.g3(new di.i2(this, tLObject, this.f12727a, this.f12728b, 9));
    }
}
