package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class oy implements RequestDelegate {
    public final String f26221a;
    public final qy f26222b;

    public oy(qy qyVar, String str) {
        this.f26222b = qyVar;
        this.f26221a = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        g0.g3(new rq(22, this, this.f26221a));
    }
}
