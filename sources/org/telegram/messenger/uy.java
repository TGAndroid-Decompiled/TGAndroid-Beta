package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class uy implements RequestDelegate {
    public final TLRPC.TL_messages_initHistoryImport f25923a;
    public final xy f25924b;

    public uy(xy xyVar, TLRPC.TL_messages_initHistoryImport tL_messages_initHistoryImport) {
        this.f25924b = xyVar;
        this.f25923a = tL_messages_initHistoryImport;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        g0.h3(new em(this, tLObject, this.f25923a, tL_error, 25));
    }
}
