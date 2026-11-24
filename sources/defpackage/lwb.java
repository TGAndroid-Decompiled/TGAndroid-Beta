package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class lwb implements RequestDelegate {
    public final long a;
    public final int b;
    public final qwb c;

    public lwb(qwb qwbVar, long j, int i) {
        this.c = qwbVar;
        this.a = j;
        this.b = i;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        if (tL_error == null) {
            TLRPC.TL_messages_affectedHistory tL_messages_affectedHistory = (TLRPC.TL_messages_affectedHistory) tLObject;
            qwb qwbVar = this.c;
            oc7 messagesController = qwbVar.getMessagesController();
            int i = tL_messages_affectedHistory.pts;
            int i2 = tL_messages_affectedHistory.pts_count;
            long j = this.a;
            messagesController.Q3(i, i2, j);
            int i3 = tL_messages_affectedHistory.offset;
            if (i3 > 0) {
                qwbVar.c(this.b, i3, j);
            }
        }
    }
}
