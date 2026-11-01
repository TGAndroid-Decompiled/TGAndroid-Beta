package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class fz implements RequestDelegate {
    public final TLRPC.TL_messages_initHistoryImport f15828a;
    public final iz f15829b;

    public fz(iz izVar, TLRPC.TL_messages_initHistoryImport tL_messages_initHistoryImport) {
        this.f15829b = izVar;
        this.f15828a = tL_messages_initHistoryImport;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        i0.g3(new vl(this, tLObject, this.f15828a, tL_error, 25));
    }
}
