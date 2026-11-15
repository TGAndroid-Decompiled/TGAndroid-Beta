package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class d00 implements RequestDelegate {
    public final long f23014a;
    public final int f23015b;
    public final h00 f23016c;

    public d00(h00 h00Var, long j3, int i7) {
        this.f23016c = h00Var;
        this.f23014a = j3;
        this.f23015b = i7;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory = (TLRPC.TL_messages_affectedHistory) tLObject;
            h00 h00Var = this.f23016c;
            np messagesController = h00Var.getMessagesController();
            int i7 = tL_messages_affectedHistory.pts;
            int i10 = tL_messages_affectedHistory.pts_count;
            long j3 = this.f23014a;
            messagesController.L3(i7, i10, j3);
            int i11 = tL_messages_affectedHistory.offset;
            if (i11 > 0) {
                h00Var.c(this.f23015b, i11, j3);
            }
        }
    }
}
