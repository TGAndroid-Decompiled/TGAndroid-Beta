package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rf implements RequestDelegate {
    public final int f26289a;
    public final boolean f26290b;
    public final long f26291c;
    public final c1 d;

    public rf(c1 c1Var, boolean z10, long j3, int i7) {
        this.f26289a = i7;
        this.d = c1Var;
        this.f26290b = z10;
        this.f26291c = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f26289a) {
            case 0:
                g0.h3(new qg((si) this.d, tLObject, this.f26290b, this.f26291c, 1));
                return;
            default:
                g0.h3(new qg((np) this.d, tLObject, this.f26290b, this.f26291c, 3));
                return;
        }
    }
}
