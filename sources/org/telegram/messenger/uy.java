package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class uy implements RequestDelegate {
    public final TLRPC.TL_messages_startHistoryImport f26897a;
    public final vy f26898b;

    public uy(vy vyVar, TLRPC.TL_messages_startHistoryImport tL_messages_startHistoryImport) {
        this.f26898b = vyVar;
        this.f26897a = tL_messages_startHistoryImport;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        g0.h3(new kg(this, tL_error, this.f26897a, 27));
    }
}
