package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
public final class oz4 implements mz4 {
    public final Paint a = new Paint(1);
    public int b;

    public final void a(int i) {
        if (this.b != i) {
            this.b = i;
            this.a.setColor(i);
        }
    }

    @Override
    public final void e(float f, float f2, float f3, float f4, Canvas canvas) {
        canvas.drawRect(f, f2, f3, f4, this.a);
    }
}
