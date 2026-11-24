package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class kub implements RequestDelegate {
    public final long a;
    public final int b;
    public final pub c;

    public kub(pub pubVar, long j, int i) {
        this.c = pubVar;
        this.a = j;
        this.b = i;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory = (TLRPC.TL_messages_affectedHistory) tLObject;
            pub pubVar = this.c;
            na7 messagesController = pubVar.getMessagesController();
            int i = tL_messages_affectedHistory.pts;
            int i2 = tL_messages_affectedHistory.pts_count;
            long j = this.a;
            messagesController.O3(i, i2, j);
            int i3 = tL_messages_affectedHistory.offset;
            if (i3 > 0) {
                pubVar.c(this.b, i3, j);
            }
        }
    }
}
