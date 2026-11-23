package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ny implements RequestDelegate {
    public final TLRPC.TL_messages_initHistoryImport f26102a;
    public final qy f26103b;

    public ny(qy qyVar, TLRPC.TL_messages_initHistoryImport tL_messages_initHistoryImport) {
        this.f26103b = qyVar;
        this.f26102a = tL_messages_initHistoryImport;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        g0.g3(new tl(this, tLObject, this.f26102a, tL_error, 25));
    }
}
