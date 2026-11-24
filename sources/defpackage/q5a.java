package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class q5a implements RequestDelegate {
    public final TLRPC.TL_messages_startHistoryImport a;
    public final r5a b;

    public q5a(r5a r5aVar, TLRPC.TL_messages_startHistoryImport tL_messages_startHistoryImport) {
        this.b = r5aVar;
        this.a = tL_messages_startHistoryImport;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        gm.c3(new hw9(this, tL_error, this.a, (byte) 2));
    }
}
