package fh;

import android.graphics.Canvas;
import android.graphics.Paint;
import ch.f;
public final class c implements a {
    public final Paint f9055a = new Paint(1);

    public final void a(int i10) {
        this.f9055a.setColor(i10);
    }

    @Override
    public final ch.d d() {
        return new f(this);
    }

    @Override
    public final void y(Canvas canvas, float f7, float f10, float f11, float f12) {
        canvas.drawRect(f7, f10, f11, f12, this.f9055a);
    }

    @Override
    public final void b() {
    }
}
