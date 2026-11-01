package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class jz implements RequestDelegate {
    public final Runnable f16533a;
    public final kz f16534b;

    public jz(kz kzVar, Runnable runnable) {
        this.f16534b = kzVar;
        this.f16533a = runnable;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        i0.g3(new lg(this, tLObject, this.f16533a, 29));
    }
}
