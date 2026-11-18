package fi;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.v60;
public final class w5 implements RequestDelegate {
    public final long f12700a;
    public final v60 f12701b;
    public final p6 f12702c;

    public w5(p6 p6Var, long j3, v60 v60Var) {
        this.f12702c = p6Var;
        this.f12700a = j3;
        this.f12701b = v60Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        org.telegram.messenger.g0.g3(new di.i2(this, tLObject, this.f12700a, this.f12701b, 8));
    }
}
