package defpackage;

import org.telegram.tgnet.RequestDelegate;
import org.telegram.tgnet.TLObject;
import org.telegram.tgnet.TLRPC;
public final class r3a implements RequestDelegate {
    public final Runnable a;
    public final s3a b;

    public r3a(s3a s3aVar, Runnable runnable) {
        this.b = s3aVar;
        this.a = runnable;
    }

    @Override
    public final void run(TLObject tLObject, TLRPC.TL_error tL_error) {
        gl.c3(new q3a(this, tLObject, this.a, (byte) 0));
    }
}
