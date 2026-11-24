package defpackage;

import android.graphics.Canvas;
import org.telegram.ui.PhotoViewer;
public final class e78 implements gx4, jl0 {
    public final wl0 a;
    public final PhotoViewer b;

    public e78(PhotoViewer photoViewer) {
        this.b = photoViewer;
        this.a = new wl0(photoViewer.c0, photoViewer.f0, 0, false);
    }

    @Override
    public final il0 b() {
        il0 il0Var = new il0(this, this, this);
        this.b.a0.add(il0Var);
        return il0Var;
    }

    @Override
    public final void e(float f, float f2, float f3, float f4, Canvas canvas) {
        canvas.save();
        canvas.clipRect(f, f2, f3, f4);
        this.b.Q(canvas, this.a, -14277082, 855638016, false, true, true);
        canvas.drawColor(637534208);
        canvas.restore();
    }

    @Override
    public final void c(il0 il0Var) {
    }
}
