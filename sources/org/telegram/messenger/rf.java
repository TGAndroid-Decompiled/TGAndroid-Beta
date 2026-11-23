package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class rf implements RequestDelegate {
    public final int f26676a;
    public final boolean f26677b;
    public final long f26678c;
    public final c1 d;

    public rf(c1 c1Var, boolean z10, long j3, int i7) {
        this.f26676a = i7;
        this.d = c1Var;
        this.f26677b = z10;
        this.f26678c = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f26676a) {
            case 0:
                g0.g3(new pg((ri) this.d, tLObject, this.f26677b, this.f26678c, 1));
                return;
            default:
                g0.g3(new pg((mp) this.d, tLObject, this.f26677b, this.f26678c, 3));
                return;
        }
    }
}
