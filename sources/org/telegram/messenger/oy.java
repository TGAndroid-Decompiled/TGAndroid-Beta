package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class oy implements RequestDelegate {
    public final String f26152a;
    public final qy f26153b;

    public oy(qy qyVar, String str) {
        this.f26153b = qyVar;
        this.f26152a = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        g0.g3(new rq(22, this, this.f26152a));
    }
}
