package fi;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.t60;
public final class z5 implements RequestDelegate {
    public final long f12591a;
    public final t60 f12592b;
    public final s6 f12593c;

    public z5(s6 s6Var, long j3, t60 t60Var) {
        this.f12593c = s6Var;
        this.f12591a = j3;
        this.f12592b = t60Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        org.telegram.messenger.g0.h3(new di.f2(this, tLObject, this.f12591a, this.f12592b, 9));
    }
}
