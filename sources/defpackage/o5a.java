package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class o5a implements RequestDelegate {
    public final TLRPC.TL_messages_initHistoryImport a;
    public final r5a b;

    public o5a(r5a r5aVar, TLRPC.TL_messages_initHistoryImport tL_messages_initHistoryImport) {
        this.b = r5aVar;
        this.a = tL_messages_initHistoryImport;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        gm.c3(new no8(this, tLObject, this.a, tL_error, (byte) 16));
    }
}
