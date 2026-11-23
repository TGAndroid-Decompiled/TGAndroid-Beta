package org.telegram.messenger;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class a00 implements RequestDelegate {
    public final long f22798a;
    public final int f22799b;
    public final f00 f22800c;

    public a00(f00 f00Var, long j3, int i7) {
        this.f22800c = f00Var;
        this.f22798a = j3;
        this.f22799b = i7;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory = (TLRPC.TL_messages_affectedHistory) tLObject;
            f00 f00Var = this.f22800c;
            np messagesController = f00Var.getMessagesController();
            int i7 = tL_messages_affectedHistory.pts;
            int i10 = tL_messages_affectedHistory.pts_count;
            long j3 = this.f22798a;
            messagesController.S3(i7, i10, j3);
            int i11 = tL_messages_affectedHistory.offset;
            if (i11 > 0) {
                f00Var.c(this.f22799b, i11, j3);
            }
        }
    }
}
