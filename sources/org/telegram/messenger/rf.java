package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rf implements RequestDelegate {
    public final int f26577a;
    public final boolean f26578b;
    public final long f26579c;
    public final c1 d;

    public rf(c1 c1Var, boolean z10, long j3, int i7) {
        this.f26577a = i7;
        this.d = c1Var;
        this.f26578b = z10;
        this.f26579c = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f26577a) {
            case 0:
                g0.g3(new pg((ri) this.d, tLObject, this.f26578b, this.f26579c, 1));
                return;
            default:
                g0.g3(new pg((mp) this.d, tLObject, this.f26578b, this.f26579c, 3));
                return;
        }
    }
}
