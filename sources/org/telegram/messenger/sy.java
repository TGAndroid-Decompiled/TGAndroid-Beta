package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class sy implements RequestDelegate {
    public final TLRPC.TL_messages_initHistoryImport f26592a;
    public final vy f26593b;

    public sy(vy vyVar, TLRPC.TL_messages_initHistoryImport tL_messages_initHistoryImport) {
        this.f26593b = vyVar;
        this.f26592a = tL_messages_initHistoryImport;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        g0.h3(new bm(this, tLObject, this.f26592a, tL_error, 25));
    }
}
