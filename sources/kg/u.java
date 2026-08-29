package kg;

import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.fk0;
public final class u extends fk0 {
    public float f13868h1;
    public long f13869i1;

    @Override
    public final void draw(Canvas canvas) {
        long min = Math.min(16L, System.currentTimeMillis() - this.f13869i1);
        this.f13869i1 = System.currentTimeMillis();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        canvas.saveLayerAlpha(rectF, (int) (this.f13868h1 * 255.0f), 31);
        super.draw(canvas);
        canvas.restore();
        if (!isEnabled()) {
            float f9 = this.f13868h1;
            if (f9 != 0.0f) {
                this.f13868h1 = Math.max(0.0f, f9 - (((float) min) / 150.0f));
                invalidate();
                if (this.f13868h1 == 0.0f) {
                    setVisibility(8);
                    return;
                }
                return;
            }
        }
        if (isEnabled()) {
            float f10 = this.f13868h1;
            if (f10 != 1.0f) {
                this.f13868h1 = Math.min(1.0f, (((float) min) / 150.0f) + f10);
                invalidate();
            }
        }
    }

    @Override
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 == 8 && this.f13868h1 != 0.0f) {
            this.f13868h1 = 0.0f;
        }
    }
}
