package jh;

import android.graphics.Canvas;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.ic;
import org.telegram.messenger.jj;
import org.telegram.messenger.v5;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.t6;
public final class j extends ih.f {
    public final TLRPC.Document f10419b;
    public final Object f10420c;

    public j(Object obj, TLRPC.Document document) {
        boolean z10;
        this.f10419b = document;
        this.f10420c = obj;
        jj.H2(document);
        ImageReceiver imageReceiver = this.f8536a;
        if (!jj.u4(document) && !jj.N4(document)) {
            z10 = false;
        } else {
            z10 = true;
        }
        jj.K2(document, true);
        imageReceiver.p0(ic.b(document), "38_38", v5.f(document, t6.Zc, 1.0f, null), document.size, z10 ? "webp" : null, obj, 0);
    }

    @Override
    public final void c(Canvas canvas, int i10, int i11) {
        ImageReceiver imageReceiver = this.f8536a;
        imageReceiver.y0(0.0f, 0.0f, i10, i11);
        imageReceiver.h(canvas, null);
    }
}
