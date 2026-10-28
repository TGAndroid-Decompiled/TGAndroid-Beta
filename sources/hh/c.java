package hh;

import android.graphics.Canvas;
import android.graphics.Paint;
import eh.f;
public final class c implements a, ri.a {
    public final Paint f12835a = new Paint(1);
    public int f12836b;

    public final void a(int i10) {
        if (this.f12836b != i10) {
            this.f12836b = i10;
            this.f12835a.setColor(i10);
        }
    }

    @Override
    public final eh.d f() {
        return new f(this);
    }

    @Override
    public final void w(Canvas canvas, float f7, float f10, float f11, float f12) {
        canvas.drawRect(f7, f10, f11, f12, this.f12835a);
    }
}
