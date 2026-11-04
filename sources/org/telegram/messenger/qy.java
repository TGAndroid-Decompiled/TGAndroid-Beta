package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class qy implements RequestDelegate {
    public final Runnable f25011a;
    public final ry f25012b;

    public qy(ry ryVar, Runnable runnable) {
        this.f25012b = ryVar;
        this.f25011a = runnable;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        g0.h3(new dg(this, tLObject, this.f25011a, 28));
    }
}
