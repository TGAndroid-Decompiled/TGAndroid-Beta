package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class j7a implements RequestDelegate {
    public final Runnable a;
    public final k7a b;

    public j7a(k7a k7aVar, Runnable runnable) {
        this.b = k7aVar;
        this.a = runnable;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        hl.c3(new jr9(this, tLObject, this.a, (byte) 9));
    }
}
