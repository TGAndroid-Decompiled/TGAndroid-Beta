package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class g00 implements RequestDelegate {
    public final long f22576a;
    public final int f22577b;
    public final k00 f22578c;

    public g00(k00 k00Var, long j3, int i7) {
        this.f22578c = k00Var;
        this.f22576a = j3;
        this.f22577b = i7;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory = (TLRPC.TL_messages_affectedHistory) tLObject;
            k00 k00Var = this.f22578c;
            qp messagesController = k00Var.getMessagesController();
            int i7 = tL_messages_affectedHistory.pts;
            int i10 = tL_messages_affectedHistory.pts_count;
            long j3 = this.f22576a;
            messagesController.L3(i7, i10, j3);
            int i11 = tL_messages_affectedHistory.offset;
            if (i11 > 0) {
                k00Var.c(this.f22577b, i11, j3);
            }
        }
    }
}
