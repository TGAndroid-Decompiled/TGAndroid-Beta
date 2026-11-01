package hi;

import android.graphics.Canvas;
import android.graphics.Paint;
public final class c implements a {
    public final Paint f7711a = new Paint(1);
    public int f7712b;

    public final void a(int i10) {
        if (this.f7712b != i10) {
            this.f7712b = i10;
            this.f7711a.setColor(i10);
        }
    }

    @Override
    public final void e(Canvas canvas, float f7, float f10, float f11, float f12) {
        canvas.drawRect(f7, f10, f11, f12, this.f7711a);
    }
}
