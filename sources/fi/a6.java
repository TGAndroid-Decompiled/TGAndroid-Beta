package fi;

import org.telegram.messenger.z10;
import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a6 implements RequestDelegate {
    public final long f11415a;
    public final z10 f11416b;
    public final s6 f11417c;

    public a6(s6 s6Var, long j3, z10 z10Var) {
        this.f11417c = s6Var;
        this.f11415a = j3;
        this.f11416b = z10Var;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        org.telegram.messenger.g0.h3(new di.f2(this, tLObject, this.f11415a, this.f11416b, 10));
    }
}
