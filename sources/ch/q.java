package ch;

import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Components.ii0;
public final class q extends ii0 {
    public float f6386m1;
    public long n1;

    @Override
    public final void draw(Canvas canvas) {
        long min = Math.min(16L, System.currentTimeMillis() - this.n1);
        this.n1 = System.currentTimeMillis();
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        canvas.saveLayerAlpha(rectF, (int) (this.f6386m1 * 255.0f), 31);
        super.draw(canvas);
        canvas.restore();
        if (!isEnabled()) {
            float f10 = this.f6386m1;
            if (f10 != 0.0f) {
                this.f6386m1 = f1.v((float) min, 150.0f, f10, 0.0f);
                invalidate();
                if (this.f6386m1 == 0.0f) {
                    setVisibility(8);
                    return;
                }
                return;
            }
        }
        if (isEnabled()) {
            float f11 = this.f6386m1;
            if (f11 != 1.0f) {
                this.f6386m1 = f1.e((float) min, 150.0f, f11, 1.0f);
                invalidate();
            }
        }
    }

    @Override
    public final void setVisibility(int i7) {
        super.setVisibility(i7);
        if (i7 == 8 && this.f6386m1 != 0.0f) {
            this.f6386m1 = 0.0f;
        }
    }
}
