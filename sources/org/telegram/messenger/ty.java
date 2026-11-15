package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ty implements RequestDelegate {
    public final String f26760a;
    public final vy f26761b;

    public ty(vy vyVar, String str) {
        this.f26761b = vyVar;
        this.f26760a = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        g0.h3(new pq(21, this, this.f26760a));
    }
}
