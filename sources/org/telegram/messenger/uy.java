package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class uy implements RequestDelegate {
    public final TLRPC.TL_messages_startHistoryImport f26898a;
    public final vy f26899b;

    public uy(vy vyVar, TLRPC.TL_messages_startHistoryImport tL_messages_startHistoryImport) {
        this.f26899b = vyVar;
        this.f26898a = tL_messages_startHistoryImport;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        g0.h3(new kg(this, tL_error, this.f26898a, 27));
    }
}
