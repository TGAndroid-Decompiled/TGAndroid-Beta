package defpackage;

import android.graphics.Canvas;
import android.graphics.Picture;
public final class oxc extends pxc {
    public final Picture e;
    public boolean f;

    public oxc(int i, int i2, int i3, int i4) {
        super(i, i2, i3, i4);
        this.e = new Picture();
    }

    @Override
    public final Canvas a() {
        this.f = true;
        return this.e.beginRecording(Math.max(1, this.c - this.a), Math.max(1, this.d - this.b));
    }

    @Override
    public final void b() {
        if (this.f) {
            d();
        }
    }

    @Override
    public final void c(Canvas canvas, float f) {
        Canvas canvas2;
        int save;
        if (!this.f && f > 0.0f) {
            int i = (f > 1.0f ? 1 : (f == 1.0f ? 0 : -1));
            int i2 = this.b;
            int i3 = this.a;
            if (i < 0) {
                canvas2 = canvas;
                save = canvas2.saveLayerAlpha(i3, i2, this.c, this.d, Math.round(f * 255.0f));
            } else {
                canvas2 = canvas;
                save = canvas2.save();
            }
            canvas2.translate(i3, i2);
            canvas2.drawPicture(this.e);
            canvas2.restoreToCount(save);
        }
    }

    @Override
    public final void d() {
        this.e.endRecording();
        this.f = false;
    }
}
