package defpackage;

import android.graphics.Canvas;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class vd8 extends ld8 {
    public final TLRPC.Document b;
    public final Object c;

    public vd8(Object obj, TLRPC.Document document) {
        boolean z;
        String str;
        this.b = document;
        this.c = obj;
        k27.H2(document);
        ImageReceiver imageReceiver = this.a;
        if (!k27.t4(document) && !k27.M4(document)) {
            z = false;
        } else {
            z = true;
        }
        k27.K2(document, true);
        kcb f = uo3.f(document, bkb.bd, 1.0f, null);
        gl5 b = gl5.b(document);
        long j = document.size;
        if (z) {
            str = "webp";
        } else {
            str = null;
        }
        imageReceiver.c0(b, "38_38", f, j, str, obj, 0);
    }

    @Override
    public final void c(Canvas canvas, int i, int i2) {
        ImageReceiver imageReceiver = this.a;
        imageReceiver.i0(0.0f, 0.0f, i, i2);
        imageReceiver.h(canvas, null);
    }
}
