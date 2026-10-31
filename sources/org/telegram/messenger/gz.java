package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class gz implements RequestDelegate {
    public final TLRPC.TL_messages_startHistoryImport f15791a;
    public final hz f15792b;

    public gz(hz hzVar, TLRPC.TL_messages_startHistoryImport tL_messages_startHistoryImport) {
        this.f15792b = hzVar;
        this.f15791a = tL_messages_startHistoryImport;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        i0.g3(new kg(this, tL_error, this.f15791a, 28));
    }
}
