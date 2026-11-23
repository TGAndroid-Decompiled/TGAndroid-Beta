package fi;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.v60;
public final class x5 implements RequestDelegate {
    public final long f12737a;
    public final v60 f12738b;
    public final p6 f12739c;

    public x5(p6 p6Var, long j3, v60 v60Var) {
        this.f12739c = p6Var;
        this.f12737a = j3;
        this.f12738b = v60Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        org.telegram.messenger.g0.g3(new di.j2(this, tLObject, this.f12737a, this.f12738b, 8));
    }
}
