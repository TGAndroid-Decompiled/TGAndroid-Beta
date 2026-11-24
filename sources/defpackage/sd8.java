package defpackage;

import android.graphics.Canvas;
import org.telegram.messenger.ImageReceiver;
import org.telegram.tgnet.TLRPC;
public final class sd8 extends ld8 {
    public final TLRPC.MessageMedia b;

    public sd8(TLRPC.MessageMedia messageMedia) {
        this.b = messageMedia;
        this.a.q0(gl.L(7.0f));
        ImageReceiver imageReceiver = this.a;
        TLRPC.GeoPoint geoPoint = messageMedia.geo;
        if (geoPoint == null) {
            imageReceiver.f();
            return;
        }
        int min = Math.min(2, (int) Math.ceil(gl.p));
        int i = usc.i;
        imageReceiver.a0(gl5.p(usc.a(geoPoint.lat, geoPoint._long, geoPoint.access_hash, 38, 38, 13, min)), null, null, null, null, null, 0);
    }

    @Override
    public final void c(Canvas canvas, int i, int i2) {
        ImageReceiver imageReceiver = this.a;
        imageReceiver.i0(0.0f, 0.0f, i, i2);
        imageReceiver.h(canvas, null);
    }
}
