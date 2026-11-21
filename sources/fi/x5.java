package fi;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.w60;
public final class x5 implements RequestDelegate {
    public final long f12772a;
    public final w60 f12773b;
    public final p6 f12774c;

    public x5(p6 p6Var, long j3, w60 w60Var) {
        this.f12774c = p6Var;
        this.f12772a = j3;
        this.f12773b = w60Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        org.telegram.messenger.g0.g3(new di.j2(this, tLObject, this.f12772a, this.f12773b, 8));
    }
}
