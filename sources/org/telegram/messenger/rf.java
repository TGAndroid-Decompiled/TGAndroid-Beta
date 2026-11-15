package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rf implements RequestDelegate {
    public final int f26281a;
    public final boolean f26282b;
    public final long f26283c;
    public final c1 d;

    public rf(c1 c1Var, boolean z10, long j3, int i7) {
        this.f26281a = i7;
        this.d = c1Var;
        this.f26282b = z10;
        this.f26283c = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f26281a) {
            case 0:
                g0.h3(new qg((si) this.d, tLObject, this.f26282b, this.f26283c, 1));
                return;
            default:
                g0.h3(new qg((np) this.d, tLObject, this.f26282b, this.f26283c, 3));
                return;
        }
    }
}
