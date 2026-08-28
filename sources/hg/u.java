package hg;

import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.uj0;
public final class u extends uj0 {
    public float f10758h1;
    public long f10759i1;

    @Override
    public final void draw(Canvas canvas) {
        long min = Math.min(16L, System.currentTimeMillis() - this.f10759i1);
        this.f10759i1 = System.currentTimeMillis();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        canvas.saveLayerAlpha(rectF, (int) (this.f10758h1 * 255.0f), 31);
        super.draw(canvas);
        canvas.restore();
        if (!isEnabled()) {
            float f10 = this.f10758h1;
            if (f10 != 0.0f) {
                this.f10758h1 = Math.max(0.0f, f10 - (((float) min) / 150.0f));
                invalidate();
                if (this.f10758h1 == 0.0f) {
                    setVisibility(8);
                    return;
                }
                return;
            }
        }
        if (isEnabled()) {
            float f11 = this.f10758h1;
            if (f11 != 1.0f) {
                this.f10758h1 = Math.min(1.0f, (((float) min) / 150.0f) + f11);
                invalidate();
            }
        }
    }

    @Override
    public final void setVisibility(int i9) {
        super.setVisibility(i9);
        if (i9 == 8 && this.f10758h1 != 0.0f) {
            this.f10758h1 = 0.0f;
        }
    }
}
