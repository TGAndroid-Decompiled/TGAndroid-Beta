package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sf implements RequestDelegate {
    public final int f26789a;
    public final boolean f26790b;
    public final long f26791c;
    public final c1 d;

    public sf(c1 c1Var, boolean z10, long j3, int i7) {
        this.f26789a = i7;
        this.d = c1Var;
        this.f26790b = z10;
        this.f26791c = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f26789a) {
            case 0:
                g0.g3(new qg((si) this.d, tLObject, this.f26790b, this.f26791c, 1));
                return;
            default:
                g0.g3(new qg((np) this.d, tLObject, this.f26790b, this.f26791c, 3));
                return;
        }
    }
}
