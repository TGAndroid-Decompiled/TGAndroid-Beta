package fi;

import org.telegram.messenger.x10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class x5 implements RequestDelegate {
    public final long f12735a;
    public final x10 f12736b;
    public final p6 f12737c;

    public x5(p6 p6Var, long j3, x10 x10Var) {
        this.f12737c = p6Var;
        this.f12735a = j3;
        this.f12736b = x10Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        org.telegram.messenger.g0.g3(new di.i2(this, tLObject, this.f12735a, this.f12736b, 9));
    }
}
