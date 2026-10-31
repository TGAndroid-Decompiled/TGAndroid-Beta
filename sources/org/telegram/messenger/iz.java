package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class iz implements RequestDelegate {
    public final Runnable f16197a;
    public final jz f16198b;

    public iz(jz jzVar, Runnable runnable) {
        this.f16198b = jzVar;
        this.f16197a = runnable;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        i0.g3(new kg(this, tLObject, this.f16197a, 29));
    }
}
