package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class h7a implements RequestDelegate {
    public final TLRPC.TL_messages_startHistoryImport a;
    public final i7a b;

    public h7a(i7a i7aVar, TLRPC.TL_messages_startHistoryImport tL_messages_startHistoryImport) {
        this.b = i7aVar;
        this.a = tL_messages_startHistoryImport;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        hl.c3(new jr9(this, tL_error, this.a, (byte) 8));
    }
}
