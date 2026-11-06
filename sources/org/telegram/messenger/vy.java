package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class vy implements RequestDelegate {
    public final String f26233a;
    public final xy f26234b;

    public vy(xy xyVar, String str) {
        this.f26234b = xyVar;
        this.f26233a = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        g0.h3(new yq(20, this, this.f26233a));
    }
}
