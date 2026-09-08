package ah;

import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.fk0;
public final class f0 extends fk0 {
    public float l1;
    public long f542m1;

    @Override
    public final void draw(Canvas canvas) {
        long min = Math.min(16L, System.currentTimeMillis() - this.f542m1);
        this.f542m1 = System.currentTimeMillis();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        canvas.saveLayerAlpha(rectF, (int) (this.l1 * 255.0f), 31);
        super.draw(canvas);
        canvas.restore();
        if (!isEnabled()) {
            float f7 = this.l1;
            if (f7 != 0.0f) {
                this.l1 = Math.max(0.0f, f7 - (((float) min) / 150.0f));
                invalidate();
                if (this.l1 == 0.0f) {
                    setVisibility(8);
                    return;
                }
                return;
            }
        }
        if (isEnabled()) {
            float f10 = this.l1;
            if (f10 != 1.0f) {
                this.l1 = Math.min(1.0f, (((float) min) / 150.0f) + f10);
                invalidate();
            }
        }
    }

    @Override
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 == 8 && this.l1 != 0.0f) {
            this.l1 = 0.0f;
        }
    }
}
