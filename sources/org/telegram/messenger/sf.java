package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sf implements RequestDelegate {
    public final int f26753a;
    public final boolean f26754b;
    public final long f26755c;
    public final c1 d;

    public sf(c1 c1Var, boolean z10, long j3, int i7) {
        this.f26753a = i7;
        this.d = c1Var;
        this.f26754b = z10;
        this.f26755c = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f26753a) {
            case 0:
                g0.g3(new qg((si) this.d, tLObject, this.f26754b, this.f26755c, 1));
                return;
            default:
                g0.g3(new qg((np) this.d, tLObject, this.f26754b, this.f26755c, 3));
                return;
        }
    }
}
