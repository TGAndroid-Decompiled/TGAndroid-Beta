package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class n3a implements RequestDelegate {
    public final String a;
    public final p3a b;

    public n3a(p3a p3aVar, String str) {
        this.b = p3aVar;
        this.a = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        gl.d3(new tj9(this, this.a, (byte) 25));
    }
}
