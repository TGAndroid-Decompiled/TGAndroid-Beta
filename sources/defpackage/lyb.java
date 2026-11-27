package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class lyb implements RequestDelegate {
    public final long a;
    public final int b;
    public final qyb c;

    public lyb(qyb qybVar, long j, int i) {
        this.c = qybVar;
        this.a = j;
        this.b = i;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory = (TLRPC.TL_messages_affectedHistory) tLObject;
            qyb qybVar = this.c;
            uc7 messagesController = qybVar.getMessagesController();
            int i = tL_messages_affectedHistory.pts;
            int i2 = tL_messages_affectedHistory.pts_count;
            long j = this.a;
            messagesController.V3(i, i2, j);
            int i3 = tL_messages_affectedHistory.offset;
            if (i3 > 0) {
                qybVar.c(this.b, i3, j);
            }
        }
    }
}
