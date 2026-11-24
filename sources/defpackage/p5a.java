package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class p5a implements RequestDelegate {
    public final String a;
    public final r5a b;

    public p5a(r5a r5aVar, String str) {
        this.b = r5aVar;
        this.a = str;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        gm.c3(new il9(this, this.a, (byte) 27));
    }
}
