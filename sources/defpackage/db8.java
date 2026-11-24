package defpackage;

import android.graphics.Canvas;
import android.graphics.Path;
import org.telegram.ui.PhotoViewer;
public final class db8 extends w0b {
    public final Path t0;
    public boolean u0;
    public final ln v0;
    public final PhotoViewer w0;

    public db8(PhotoViewer photoViewer) {
        super(photoViewer.o5, photoViewer.F, photoViewer.w2, photoViewer.c0);
        this.w0 = photoViewer;
        this.t0 = new Path();
        this.v0 = new ln(this, 0L, 420L, d53.h);
    }

    public final void m(boolean z, boolean z2) {
        this.u0 = z;
        if (!z2) {
            this.v0.f(z, true);
        }
        invalidate();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        canvas.save();
        Path path = this.t0;
        path.rewind();
        Path.Direction direction = Path.Direction.CW;
        path.addRoundRect(this.n0, gm.L(this.r0), gm.L(this.r0), direction);
        canvas.clipPath(path);
        canvas.translate(-getX(), -getY());
        PhotoViewer photoViewer = this.w0;
        if (this == photoViewer.u5 || this == photoViewer.v5) {
            canvas.translate(-photoViewer.t5.getX(), -photoViewer.t5.getY());
        }
        photoViewer.P(canvas, this.m0, -13948117, 855638016, false, true, false);
        float d = this.v0.d(this.u0);
        if (d > 0.0f) {
            canvas.drawColor(cmb.p1(d, -1));
        }
        setTextColor(on2.f(d, -1, -16777216));
        canvas.restore();
        super.onDraw(canvas);
    }

    @Override
    public final void onDrawForeground(Canvas canvas) {
        canvas.save();
        canvas.clipPath(this.t0);
        super.onDrawForeground(canvas);
        canvas.restore();
    }
}
