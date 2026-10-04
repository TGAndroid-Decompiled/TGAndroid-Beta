package fh;

import android.graphics.Canvas;
import android.graphics.Paint;
import ch.f;
public final class c implements a, oi.a {
    public final Paint f9856a = new Paint(1);
    public int f9857b;

    public final void a(int i10) {
        if (this.f9857b != i10) {
            this.f9857b = i10;
            this.f9856a.setColor(i10);
        }
    }

    @Override
    public final ch.d f() {
        return new f(this);
    }

    @Override
    public final void y(Canvas canvas, float f7, float f10, float f11, float f12) {
        canvas.drawRect(f7, f10, f11, f12, this.f9856a);
    }

    @Override
    public final void b() {
    }
}
