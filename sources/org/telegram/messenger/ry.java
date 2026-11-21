package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ry implements RequestDelegate {
    public final Runnable f26740a;
    public final sy f26741b;

    public ry(sy syVar, Runnable runnable) {
        this.f26741b = syVar;
        this.f26740a = runnable;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        g0.g3(new kg(this, tLObject, this.f26740a, 28));
    }
}
