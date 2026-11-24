package defpackage;

import android.graphics.Canvas;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class xf8 extends nf8 {
    public final TLRPC.Document b;
    public final Object c;

    public xf8(Object obj, TLRPC.Document document) {
        boolean z;
        String str;
        this.b = document;
        this.c = obj;
        k47.H2(document);
        ImageReceiver imageReceiver = this.a;
        if (!k47.t4(document) && !k47.M4(document)) {
            z = false;
        } else {
            z = true;
        }
        k47.K2(document, true);
        meb f = eq3.f(document, cmb.bd, 1.0f, null);
        gn5 b = gn5.b(document);
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
