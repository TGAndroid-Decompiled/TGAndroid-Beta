package defpackage;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
public final class zlb extends Drawable {
    public float[] b;
    public Path a = new Path();
    public boolean c = true;

    public zlb(float f, float f2) {
        this.b = r0;
        float L = gm.L(f);
        float L2 = gm.L(f2);
        float[] fArr = {L, L, L, L, L2, L2, L2, L2};
    }

    @Override
    public final void draw(Canvas canvas) {
        Path path = this.a;
        if (this.c) {
            this.c = false;
            path.reset();
            RectF rectF = gm.P;
            rectF.set(getBounds());
            path.addRoundRect(rectF, this.b, Path.Direction.CW);
        }
        canvas.drawPath(path, cmb.z);
    }

    @Override
    public final int getOpacity() {
        return 0;
    }

    @Override
    public final void onBoundsChange(Rect rect) {
        this.c = true;
    }

    @Override
    public final void setAlpha(int i) {
    }

    @Override
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}
