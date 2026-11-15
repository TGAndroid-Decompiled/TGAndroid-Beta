package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wy implements RequestDelegate {
    public final Runnable f27435a;
    public final xy f27436b;

    public wy(xy xyVar, Runnable runnable) {
        this.f27436b = xyVar;
        this.f27435a = runnable;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        g0.h3(new kg(this, tLObject, this.f27435a, 28));
    }
}
