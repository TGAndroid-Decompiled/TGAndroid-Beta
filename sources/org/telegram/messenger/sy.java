package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sy implements RequestDelegate {
    public final Runnable f26890a;
    public final ty f26891b;

    public sy(ty tyVar, Runnable runnable) {
        this.f26891b = tyVar;
        this.f26890a = runnable;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        g0.g3(new lg(this, tLObject, this.f26890a, 28));
    }
}
