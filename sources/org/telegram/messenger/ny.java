package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ny implements RequestDelegate {
    public final String f24462a;
    public final py f24463b;

    public ny(py pyVar, String str) {
        this.f24463b = pyVar;
        this.f24462a = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        g0.h3(new pq(20, this, this.f24462a));
    }
}
