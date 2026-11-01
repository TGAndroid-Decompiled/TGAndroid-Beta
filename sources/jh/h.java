package jh;

import android.graphics.Canvas;
import org.telegram.messenger.ImageReceiver;
import org.telegram.messenger.c30;
import org.telegram.messenger.i0;
import org.telegram.messenger.jc;
import org.telegram.tgnet.TLRPC;
public final class h extends ih.f {
    public final TLRPC.MessageMedia f10417b;

    public h(TLRPC.MessageMedia messageMedia) {
        this.f10417b = messageMedia;
        this.f8537a.J0(i0.L(7.0f));
        ImageReceiver imageReceiver = this.f8537a;
        TLRPC.GeoPoint geoPoint = messageMedia.geo;
        if (geoPoint == null) {
            imageReceiver.f();
            return;
        }
        int min = Math.min(2, (int) Math.ceil(i0.f16171p));
        int i10 = c30.f15061i;
        imageReceiver.s0(jc.p(c30.a(geoPoint.lat, geoPoint._long, geoPoint.access_hash, 38, 38, 13, min)), null, null, null, null, null, 0);
    }

    @Override
    public final void c(Canvas canvas, int i10, int i11) {
        ImageReceiver imageReceiver = this.f8537a;
        imageReceiver.y0(0.0f, 0.0f, i10, i11);
        imageReceiver.h(canvas, null);
    }
}
