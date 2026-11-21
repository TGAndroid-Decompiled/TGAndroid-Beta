package fi;

import org.telegram.messenger.x10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class y5 implements RequestDelegate {
    public final long f12819a;
    public final x10 f12820b;
    public final p6 f12821c;

    public y5(p6 p6Var, long j3, x10 x10Var) {
        this.f12821c = p6Var;
        this.f12819a = j3;
        this.f12820b = x10Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        org.telegram.messenger.g0.g3(new di.j2(this, tLObject, this.f12819a, this.f12820b, 9));
    }
}
