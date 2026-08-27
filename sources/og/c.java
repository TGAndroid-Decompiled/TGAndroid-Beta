package og;

import android.graphics.Canvas;
import android.graphics.Paint;
import lg.f;

public final class c implements a {

    public final Paint f19449a = new Paint(1);

    @Override
    public final void T0(Canvas canvas, float f10, float f11, float f12, float f13) {
        canvas.drawRect(f10, f11, f12, f13, this.f19449a);
    }

    public final void a(int i10) {
        this.f19449a.setColor(i10);
    }

    @Override
    public final lg.d w() {
        return new f(this);
    }

    @Override
    public final void r() {
    }
}
