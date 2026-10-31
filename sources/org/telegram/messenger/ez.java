package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class ez implements RequestDelegate {
    public final TLRPC.TL_messages_initHistoryImport f15487a;
    public final hz f15488b;

    public ez(hz hzVar, TLRPC.TL_messages_initHistoryImport tL_messages_initHistoryImport) {
        this.f15488b = hzVar;
        this.f15487a = tL_messages_initHistoryImport;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        i0.g3(new ul(this, tLObject, this.f15487a, tL_error, 25));
    }
}
