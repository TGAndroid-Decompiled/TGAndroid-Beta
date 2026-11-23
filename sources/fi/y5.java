package fi;

import org.telegram.messenger.w10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class y5 implements RequestDelegate {
    public final long f12784a;
    public final w10 f12785b;
    public final p6 f12786c;

    public y5(p6 p6Var, long j3, w10 w10Var) {
        this.f12786c = p6Var;
        this.f12784a = j3;
        this.f12785b = w10Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        org.telegram.messenger.g0.g3(new di.j2(this, tLObject, this.f12784a, this.f12785b, 9));
    }
}
