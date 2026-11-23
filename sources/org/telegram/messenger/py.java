package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class py implements RequestDelegate {
    public final String f26334a;
    public final ry f26335b;

    public py(ry ryVar, String str) {
        this.f26335b = ryVar;
        this.f26334a = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        g0.g3(new sq(22, this, this.f26334a));
    }
}
