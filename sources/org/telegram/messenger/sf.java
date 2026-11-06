package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sf implements RequestDelegate {
    public final int f25453a;
    public final boolean f25454b;
    public final long f25455c;
    public final c1 d;

    public sf(c1 c1Var, boolean z9, long j3, int i7) {
        this.f25453a = i7;
        this.d = c1Var;
        this.f25454b = z9;
        this.f25455c = j3;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        switch (this.f25453a) {
            case 0:
                g0.h3(new rg((ui) this.d, tLObject, this.f25454b, this.f25455c, 1));
                return;
            default:
                g0.h3(new rg((qp) this.d, tLObject, this.f25454b, this.f25455c, 3));
                return;
        }
    }
}
