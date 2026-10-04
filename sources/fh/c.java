package fh;

import android.graphics.Canvas;
import android.graphics.Paint;
import ch.f;
public final class c implements a, oi.a {
    public final Paint f9857a = new Paint(1);
    public int f9858b;

    public final void a(int i10) {
        if (this.f9858b != i10) {
            this.f9858b = i10;
            this.f9857a.setColor(i10);
        }
    }

    @Override
    public final ch.d b() {
        return new f(this);
    }

    @Override
    public final void v(Canvas canvas, float f7, float f10, float f11, float f12) {
        canvas.drawRect(f7, f10, f11, f12, this.f9857a);
    }
}
