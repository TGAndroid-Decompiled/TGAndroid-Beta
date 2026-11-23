package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class qy implements RequestDelegate {
    public final TLRPC.TL_messages_startHistoryImport f26494a;
    public final ry f26495b;

    public qy(ry ryVar, TLRPC.TL_messages_startHistoryImport tL_messages_startHistoryImport) {
        this.f26495b = ryVar;
        this.f26494a = tL_messages_startHistoryImport;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        g0.g3(new lg(this, tL_error, this.f26494a, 27));
    }
}
