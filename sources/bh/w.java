package bh;

import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gl0;
import org.telegram.ui.d3;
public final class w extends gl0 {
    public float f4192m1;
    public long f4193n1;

    @Override
    public final void draw(Canvas canvas) {
        long min = Math.min(16L, System.currentTimeMillis() - this.f4193n1);
        this.f4193n1 = System.currentTimeMillis();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        canvas.saveLayerAlpha(rectF, (int) (this.f4192m1 * 255.0f), 31);
        super.draw(canvas);
        canvas.restore();
        if (!isEnabled()) {
            float f7 = this.f4192m1;
            if (f7 != 0.0f) {
                this.f4192m1 = d3.v((float) min, 150.0f, f7, 0.0f);
                invalidate();
                if (this.f4192m1 == 0.0f) {
                    setVisibility(8);
                    return;
                }
                return;
            }
        }
        if (isEnabled()) {
            float f10 = this.f4192m1;
            if (f10 != 1.0f) {
                this.f4192m1 = d3.d((float) min, 150.0f, f10, 1.0f);
                invalidate();
            }
        }
    }

    @Override
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 == 8 && this.f4192m1 != 0.0f) {
            this.f4192m1 = 0.0f;
        }
    }
}
