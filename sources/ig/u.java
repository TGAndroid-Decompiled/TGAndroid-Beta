package ig;

import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.wj0;

public final class u extends wj0 {

    public float f11455h1;

    public long f11456i1;

    @Override
    public final void draw(Canvas canvas) {
        long jMin = Math.min(16L, System.currentTimeMillis() - this.f11456i1);
        this.f11456i1 = System.currentTimeMillis();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        canvas.saveLayerAlpha(rectF, (int) (this.f11455h1 * 255.0f), 31);
        super.draw(canvas);
        canvas.restore();
        if (!isEnabled()) {
            float f10 = this.f11455h1;
            if (f10 != 0.0f) {
                this.f11455h1 = Math.max(0.0f, f10 - (jMin / 150.0f));
                invalidate();
                if (this.f11455h1 == 0.0f) {
                    setVisibility(8);
                    return;
                }
                return;
            }
        }
        if (isEnabled()) {
            float f11 = this.f11455h1;
            if (f11 != 1.0f) {
                this.f11455h1 = Math.min(1.0f, (jMin / 150.0f) + f11);
                invalidate();
            }
        }
    }

    @Override
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 != 8 || this.f11455h1 == 0.0f) {
            return;
        }
        this.f11455h1 = 0.0f;
    }
}
