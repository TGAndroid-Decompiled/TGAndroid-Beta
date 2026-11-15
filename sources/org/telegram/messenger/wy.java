package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wy implements RequestDelegate {
    public final Runnable f27434a;
    public final xy f27435b;

    public wy(xy xyVar, Runnable runnable) {
        this.f27435b = xyVar;
        this.f27434a = runnable;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        g0.h3(new kg(this, tLObject, this.f27434a, 28));
    }
}
