package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class t00 implements RequestDelegate {
    public final long f17980a;
    public final int f17981b;
    public final x00 f17982c;

    public t00(x00 x00Var, long j10, int i10) {
        this.f17982c = x00Var;
        this.f17980a = j10;
        this.f17981b = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory = (TLRPC.TL_messages_affectedHistory) tLObject;
            x00 x00Var = this.f17982c;
            vp messagesController = x00Var.getMessagesController();
            int i10 = tL_messages_affectedHistory.pts;
            int i11 = tL_messages_affectedHistory.pts_count;
            long j10 = this.f17980a;
            messagesController.I3(i10, i11, j10);
            int i12 = tL_messages_affectedHistory.offset;
            if (i12 > 0) {
                x00Var.c(this.f17981b, i12, j10);
            }
        }
    }
}
