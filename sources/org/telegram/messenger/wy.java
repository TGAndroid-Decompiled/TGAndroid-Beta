package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class wy implements RequestDelegate {
    public final TLRPC.TL_messages_startHistoryImport f26406a;
    public final xy f26407b;

    public wy(xy xyVar, TLRPC.TL_messages_startHistoryImport tL_messages_startHistoryImport) {
        this.f26407b = xyVar;
        this.f26406a = tL_messages_startHistoryImport;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        g0.h3(new lg(this, tL_error, this.f26406a, 27));
    }
}
