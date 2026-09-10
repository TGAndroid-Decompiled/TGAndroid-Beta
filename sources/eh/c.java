package eh;

import android.graphics.Canvas;
import android.graphics.Paint;
import bh.f;
public final class c implements a {
    public final Paint f7517a = new Paint(1);

    public final void a(int i10) {
        this.f7517a.setColor(i10);
    }

    @Override
    public final bh.d k() {
        return new f(this);
    }

    @Override
    public final void u(Canvas canvas, float f7, float f10, float f11, float f12) {
        canvas.drawRect(f7, f10, f11, f12, this.f7517a);
    }

    @Override
    public final void b() {
    }
}
