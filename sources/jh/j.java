package jh;

import android.graphics.Canvas;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.jc;
import org.telegram.messenger.kj;
import org.telegram.messenger.v5;
import org.telegram.tgnet.TLRPC;
import org.telegram.ui.ActionBar.t6;
public final class j extends ih.f {
    public final TLRPC.Document f10420b;
    public final Object f10421c;

    public j(Object obj, TLRPC.Document document) {
        boolean z10;
        this.f10420b = document;
        this.f10421c = obj;
        kj.H2(document);
        ImageReceiver imageReceiver = this.f8537a;
        if (!kj.u4(document) && !kj.N4(document)) {
            z10 = false;
        } else {
            z10 = true;
        }
        kj.K2(document, true);
        imageReceiver.p0(jc.b(document), "38_38", v5.f(document, t6.Zc, 1.0f, null), document.size, z10 ? "webp" : null, obj, 0);
    }

    @Override
    public final void c(Canvas canvas, int i10, int i11) {
        ImageReceiver imageReceiver = this.f8537a;
        imageReceiver.y0(0.0f, 0.0f, i10, i11);
        imageReceiver.h(canvas, null);
    }
}
