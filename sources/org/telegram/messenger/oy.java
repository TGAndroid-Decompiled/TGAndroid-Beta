package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class oy implements RequestDelegate {
    public final String f26126a;
    public final qy f26127b;

    public oy(qy qyVar, String str) {
        this.f26127b = qyVar;
        this.f26126a = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        g0.g3(new rq(22, this, this.f26126a));
    }
}
