package dh;

import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.ui.Cells.f1;
import org.telegram.ui.Components.li0;
public final class q extends li0 {
    public float f9137n1;
    public long f9138o1;

    @Override
    public final void draw(Canvas canvas) {
        long min = Math.min(16L, System.currentTimeMillis() - this.f9138o1);
        this.f9138o1 = System.currentTimeMillis();
        RectF rectF = org.telegram.messenger.g0.P;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        canvas.saveLayerAlpha(rectF, (int) (this.f9137n1 * 255.0f), 31);
        super.draw(canvas);
        canvas.restore();
        if (!isEnabled()) {
            float f10 = this.f9137n1;
            if (f10 != 0.0f) {
                this.f9137n1 = f1.y((float) min, 150.0f, f10, 0.0f);
                invalidate();
                if (this.f9137n1 == 0.0f) {
                    setVisibility(8);
                    return;
                }
                return;
            }
        }
        if (isEnabled()) {
            float f11 = this.f9137n1;
            if (f11 != 1.0f) {
                this.f9137n1 = f1.h((float) min, 150.0f, f11, 1.0f);
                invalidate();
            }
        }
    }

    @Override
    public final void setVisibility(int i3) {
        super.setVisibility(i3);
        if (i3 == 8 && this.f9137n1 != 0.0f) {
            this.f9137n1 = 0.0f;
        }
    }
}
