package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ry implements RequestDelegate {
    public final Runnable f26712a;
    public final sy f26713b;

    public ry(sy syVar, Runnable runnable) {
        this.f26713b = syVar;
        this.f26712a = runnable;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        g0.g3(new kg(this, tLObject, this.f26712a, 28));
    }
}
