package defpackage;

import android.graphics.Canvas;
import android.graphics.RectF;
public final class ed2 extends t09 {
    public float n1;
    public long o1;

    @Override
    public final void draw(Canvas canvas) {
        long min = Math.min(16L, System.currentTimeMillis() - this.o1);
        this.o1 = System.currentTimeMillis();
        RectF rectF = gl.P;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        canvas.saveLayerAlpha(rectF, (int) (this.n1 * 255.0f), 31);
        super.draw(canvas);
        canvas.restore();
        if (!isEnabled()) {
            float f = this.n1;
            if (f != 0.0f) {
                this.n1 = oo1.x((float) min, 150.0f, f, 0.0f);
                invalidate();
                if (this.n1 == 0.0f) {
                    setVisibility(8);
                    return;
                }
                return;
            }
        }
        if (isEnabled()) {
            float f2 = this.n1;
            if (f2 != 1.0f) {
                this.n1 = ls6.z((float) min, 150.0f, f2, 1.0f);
                invalidate();
            }
        }
    }

    @Override
    public final void setVisibility(int i) {
        super.setVisibility(i);
        if (i == 8 && this.n1 != 0.0f) {
            this.n1 = 0.0f;
        }
    }
}
