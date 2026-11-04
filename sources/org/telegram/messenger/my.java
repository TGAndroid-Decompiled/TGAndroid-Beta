package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class my implements RequestDelegate {
    public final TLRPC.TL_messages_initHistoryImport f24288a;
    public final py f24289b;

    public my(py pyVar, TLRPC.TL_messages_initHistoryImport tL_messages_initHistoryImport) {
        this.f24289b = pyVar;
        this.f24288a = tL_messages_initHistoryImport;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        g0.h3(new ul(this, tLObject, this.f24288a, tL_error, 25));
    }
}
