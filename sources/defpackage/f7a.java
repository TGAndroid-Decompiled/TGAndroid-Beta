package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class f7a implements RequestDelegate {
    public final TLRPC.TL_messages_initHistoryImport a;
    public final i7a b;

    public f7a(i7a i7aVar, TLRPC.TL_messages_initHistoryImport tL_messages_initHistoryImport) {
        this.b = i7aVar;
        this.a = tL_messages_initHistoryImport;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        hl.c3(new vp8(this, tLObject, this.a, tL_error, (byte) 17));
    }
}
