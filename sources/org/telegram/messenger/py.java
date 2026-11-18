package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class py implements RequestDelegate {
    public final TLRPC.TL_messages_startHistoryImport f26323a;
    public final qy f26324b;

    public py(qy qyVar, TLRPC.TL_messages_startHistoryImport tL_messages_startHistoryImport) {
        this.f26324b = qyVar;
        this.f26323a = tL_messages_startHistoryImport;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        g0.g3(new kg(this, tL_error, this.f26323a, 27));
    }
}
