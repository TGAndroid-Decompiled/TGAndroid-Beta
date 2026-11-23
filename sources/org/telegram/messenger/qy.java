package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class qy implements RequestDelegate {
    public final TLRPC.TL_messages_startHistoryImport f26530a;
    public final ry f26531b;

    public qy(ry ryVar, TLRPC.TL_messages_startHistoryImport tL_messages_startHistoryImport) {
        this.f26531b = ryVar;
        this.f26530a = tL_messages_startHistoryImport;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        g0.g3(new lg(this, tL_error, this.f26530a, 27));
    }
}
