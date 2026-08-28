package ng;

import android.graphics.Canvas;
import android.graphics.Paint;
import kg.f;
public final class c implements a {
    public final Paint f18600a = new Paint(1);

    @Override
    public final void T0(Canvas canvas, float f10, float f11, float f12, float f13) {
        canvas.drawRect(f10, f11, f12, f13, this.f18600a);
    }

    public final void a(int i9) {
        this.f18600a.setColor(i9);
    }

    @Override
    public final kg.d y() {
        return new f(this);
    }

    @Override
    public final void t() {
    }
}
