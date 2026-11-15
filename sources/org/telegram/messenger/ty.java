package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ty implements RequestDelegate {
    public final String f26758a;
    public final vy f26759b;

    public ty(vy vyVar, String str) {
        this.f26759b = vyVar;
        this.f26758a = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        g0.h3(new wq(20, this, this.f26758a));
    }
}
