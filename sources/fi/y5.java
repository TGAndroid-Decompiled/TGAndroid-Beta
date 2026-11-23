package fi;

import org.telegram.messenger.y10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class y5 implements RequestDelegate {
    public final long f12822a;
    public final y10 f12823b;
    public final p6 f12824c;

    public y5(p6 p6Var, long j3, y10 y10Var) {
        this.f12824c = p6Var;
        this.f12822a = j3;
        this.f12823b = y10Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        org.telegram.messenger.g0.g3(new di.j2(this, tLObject, this.f12822a, this.f12823b, 9));
    }
}
