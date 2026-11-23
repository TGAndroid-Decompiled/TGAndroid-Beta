package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class oy implements RequestDelegate {
    public final TLRPC.TL_messages_initHistoryImport f26169a;
    public final ry f26170b;

    public oy(ry ryVar, TLRPC.TL_messages_initHistoryImport tL_messages_initHistoryImport) {
        this.f26170b = ryVar;
        this.f26169a = tL_messages_initHistoryImport;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        g0.g3(new ul(this, tLObject, this.f26169a, tL_error, 25));
    }
}
