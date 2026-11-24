package defpackage;

import android.graphics.Canvas;
import org.telegram.ui.PhotoViewer;
public final class g98 implements iz4, jm0 {
    public final wm0 a;
    public final PhotoViewer b;

    public g98(PhotoViewer photoViewer) {
        this.b = photoViewer;
        this.a = new wm0(photoViewer.c0, photoViewer.f0, 0, false);
    }

    @Override
    public final im0 b() {
        im0 im0Var = new im0(this, this, this);
        this.b.a0.add(im0Var);
        return im0Var;
    }

    @Override
    public final void e(float f, float f2, float f3, float f4, Canvas canvas) {
        canvas.save();
        canvas.clipRect(f, f2, f3, f4);
        this.b.P(canvas, this.a, -14277082, 855638016, false, true, true);
        canvas.drawColor(637534208);
        canvas.restore();
    }

    @Override
    public final void c(im0 im0Var) {
    }
}
