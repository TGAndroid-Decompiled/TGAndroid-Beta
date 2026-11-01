package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class u00 implements RequestDelegate {
    public final long f18334a;
    public final int f18335b;
    public final y00 f18336c;

    public u00(y00 y00Var, long j10, int i10) {
        this.f18336c = y00Var;
        this.f18334a = j10;
        this.f18335b = i10;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory = (TLRPC.TL_messages_affectedHistory) tLObject;
            y00 y00Var = this.f18336c;
            wp messagesController = y00Var.getMessagesController();
            int i10 = tL_messages_affectedHistory.pts;
            int i11 = tL_messages_affectedHistory.pts_count;
            long j10 = this.f18334a;
            messagesController.I3(i10, i11, j10);
            int i12 = tL_messages_affectedHistory.offset;
            if (i12 > 0) {
                y00Var.c(this.f18335b, i12, j10);
            }
        }
    }
}
