package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class py implements RequestDelegate {
    public final TLRPC.TL_messages_startHistoryImport f26415a;
    public final qy f26416b;

    public py(qy qyVar, TLRPC.TL_messages_startHistoryImport tL_messages_startHistoryImport) {
        this.f26416b = qyVar;
        this.f26415a = tL_messages_startHistoryImport;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        g0.g3(new kg(this, tL_error, this.f26415a, 27));
    }
}
