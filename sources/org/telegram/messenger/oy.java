package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class oy implements RequestDelegate {
    public final TLRPC.TL_messages_startHistoryImport f24627a;
    public final py f24628b;

    public oy(py pyVar, TLRPC.TL_messages_startHistoryImport tL_messages_startHistoryImport) {
        this.f24628b = pyVar;
        this.f24627a = tL_messages_startHistoryImport;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        g0.h3(new dg(this, tL_error, this.f24627a, 27));
    }
}
