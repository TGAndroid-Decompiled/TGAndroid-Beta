package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class vy implements RequestDelegate {
    public final String f26240a;
    public final xy f26241b;

    public vy(xy xyVar, String str) {
        this.f26241b = xyVar;
        this.f26240a = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        g0.h3(new zq(20, this, this.f26240a));
    }
}
