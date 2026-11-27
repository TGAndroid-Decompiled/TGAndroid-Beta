package defpackage;

import android.graphics.Canvas;
import org.telegram.ui.PhotoViewer;
public final class wa8 implements mz4, kl0 {
    public final xl0 a;
    public final PhotoViewer b;

    public wa8(PhotoViewer photoViewer) {
        this.b = photoViewer;
        this.a = new xl0(photoViewer.c0, photoViewer.f0, 0, false);
    }

    @Override
    public final jl0 b() {
        jl0 jl0Var = new jl0(this, this, this);
        this.b.a0.add(jl0Var);
        return jl0Var;
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
    public final void c(jl0 jl0Var) {
    }
}
