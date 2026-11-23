package fi;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.w60;
public final class w5 implements RequestDelegate {
    public final long f12692a;
    public final w60 f12693b;
    public final p6 f12694c;

    public w5(p6 p6Var, long j3, w60 w60Var) {
        this.f12694c = p6Var;
        this.f12692a = j3;
        this.f12693b = w60Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        org.telegram.messenger.g0.g3(new di.i2(this, tLObject, this.f12692a, this.f12693b, 8));
    }
}
