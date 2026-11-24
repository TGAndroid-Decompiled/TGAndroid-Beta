package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class m3a implements RequestDelegate {
    public final TLRPC.TL_messages_initHistoryImport a;
    public final p3a b;

    public m3a(p3a p3aVar, TLRPC.TL_messages_initHistoryImport tL_messages_initHistoryImport) {
        this.b = p3aVar;
        this.a = tL_messages_initHistoryImport;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        gl.d3(new bm8(this, tLObject, this.a, tL_error, (byte) 16));
    }
}
