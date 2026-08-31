package ng;

import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.rk0;
public final class u extends rk0 {
    public float f16221i1;
    public long f16222j1;

    @Override
    public final void draw(Canvas canvas) {
        long min = Math.min(16L, System.currentTimeMillis() - this.f16222j1);
        this.f16222j1 = System.currentTimeMillis();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        canvas.saveLayerAlpha(rectF, (int) (this.f16221i1 * 255.0f), 31);
        super.draw(canvas);
        canvas.restore();
        if (!isEnabled()) {
            float f10 = this.f16221i1;
            if (f10 != 0.0f) {
                this.f16221i1 = Math.max(0.0f, f10 - (((float) min) / 150.0f));
                invalidate();
                if (this.f16221i1 == 0.0f) {
                    setVisibility(8);
                    return;
                }
                return;
            }
        }
        if (isEnabled()) {
            float f11 = this.f16221i1;
            if (f11 != 1.0f) {
                this.f16221i1 = Math.min(1.0f, (((float) min) / 150.0f) + f11);
                invalidate();
            }
        }
    }

    @Override
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 == 8 && this.f16221i1 != 0.0f) {
            this.f16221i1 = 0.0f;
        }
    }
}
