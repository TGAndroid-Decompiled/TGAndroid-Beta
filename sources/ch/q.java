package ch;

import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.ui.Cells.y0;
import org.telegram.ui.Components.mi0;
public final class q extends mi0 {
    public float n1;
    public long f5190o1;

    @Override
    public final void draw(Canvas canvas) {
        long min = Math.min(16L, System.currentTimeMillis() - this.f5190o1);
        this.f5190o1 = System.currentTimeMillis();
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        canvas.saveLayerAlpha(rectF, (int) (this.n1 * 255.0f), 31);
        super.draw(canvas);
        canvas.restore();
        if (!isEnabled()) {
            float f10 = this.n1;
            if (f10 != 0.0f) {
                this.n1 = y0.z((float) min, 150.0f, f10, 0.0f);
                invalidate();
                if (this.n1 == 0.0f) {
                    setVisibility(8);
                    return;
                }
                return;
            }
        }
        if (isEnabled()) {
            float f11 = this.n1;
            if (f11 != 1.0f) {
                this.n1 = y0.e((float) min, 150.0f, f11, 1.0f);
                invalidate();
            }
        }
    }

    @Override
    public final void setVisibility(int i7) {
        super.setVisibility(i7);
        if (i7 == 8 && this.n1 != 0.0f) {
            this.n1 = 0.0f;
        }
    }
}
