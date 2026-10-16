package gh;

import android.graphics.Canvas;
import android.graphics.Paint;
import dh.f;
public final class c implements a {
    public final Paint f10152a = new Paint(1);

    public final void a(int i10) {
        this.f10152a.setColor(i10);
    }

    @Override
    public final dh.d f() {
        return new f(this);
    }

    @Override
    public final void v(Canvas canvas, float f7, float f10, float f11, float f12) {
        canvas.drawRect(f7, f10, f11, f12, this.f10152a);
    }

    @Override
    public final void b() {
    }
}
