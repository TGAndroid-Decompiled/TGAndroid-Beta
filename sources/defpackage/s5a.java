package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class s5a implements RequestDelegate {
    public final Runnable a;
    public final t5a b;

    public s5a(t5a t5aVar, Runnable runnable) {
        this.b = t5aVar;
        this.a = runnable;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        gm.c3(new hw9(this, tLObject, this.a, (byte) 3));
    }
}
