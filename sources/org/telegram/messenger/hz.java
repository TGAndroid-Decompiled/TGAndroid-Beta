package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class hz implements RequestDelegate {
    public final TLRPC.TL_messages_startHistoryImport f16140a;
    public final iz f16141b;

    public hz(iz izVar, TLRPC.TL_messages_startHistoryImport tL_messages_startHistoryImport) {
        this.f16141b = izVar;
        this.f16140a = tL_messages_startHistoryImport;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        i0.g3(new lg(this, tL_error, this.f16140a, 28));
    }
}
