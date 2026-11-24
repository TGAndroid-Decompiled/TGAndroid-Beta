package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class o3a implements RequestDelegate {
    public final TLRPC.TL_messages_startHistoryImport a;
    public final p3a b;

    public o3a(p3a p3aVar, TLRPC.TL_messages_startHistoryImport tL_messages_startHistoryImport) {
        this.b = p3aVar;
        this.a = tL_messages_startHistoryImport;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        gl.c3(new gm8(this, tL_error, this.a, (byte) 29));
    }
}
