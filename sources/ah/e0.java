package ah;

import android.graphics.Canvas;
import android.graphics.RectF;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.gl0;
public final class e0 extends gl0 {
    public float f720m1;
    public long f721n1;

    @Override
    public final void draw(Canvas canvas) {
        long min = Math.min(16L, System.currentTimeMillis() - this.f721n1);
        this.f721n1 = System.currentTimeMillis();
        RectF rectF = AndroidUtilities.rectTmp;
        rectF.set(0.0f, 0.0f, getWidth(), getHeight());
        canvas.saveLayerAlpha(rectF, (int) (this.f720m1 * 255.0f), 31);
        super.draw(canvas);
        canvas.restore();
        if (!isEnabled()) {
            float f7 = this.f720m1;
            if (f7 != 0.0f) {
                this.f720m1 = org.telegram.ui.Cells.b1.t((float) min, 150.0f, f7, 0.0f);
                invalidate();
                if (this.f720m1 == 0.0f) {
                    setVisibility(8);
                    return;
                }
                return;
            }
        }
        if (isEnabled()) {
            float f10 = this.f720m1;
            if (f10 != 1.0f) {
                this.f720m1 = org.telegram.ui.Cells.b1.c((float) min, 150.0f, f10, 1.0f);
                invalidate();
            }
        }
    }

    @Override
    public final void setVisibility(int i10) {
        super.setVisibility(i10);
        if (i10 == 8 && this.f720m1 != 0.0f) {
            this.f720m1 = 0.0f;
        }
    }
}
