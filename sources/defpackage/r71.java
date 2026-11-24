package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import java.util.HashSet;
public final class r71 extends View implements vlb {
    public Paint a;
    public Paint b;
    public float c;
    public ln d;

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        RectF rectF = gm.P;
        rectF.set(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight());
        canvas.drawRoundRect(rectF, gm.L(3.0f), gm.L(3.0f), this.b);
        rectF.set(0.0f, 0.0f, this.d.e(false, this.c) * getMeasuredWidth(), getMeasuredHeight());
        canvas.drawRoundRect(rectF, gm.L(3.0f), gm.L(3.0f), this.a);
    }

    @Override
    public final void updateColors() {
        try {
            Paint paint = this.a;
            int i = cmb.M6;
            paint.setColor(cmb.w0(null, i, false));
            this.b.setColor(cmb.p1(0.2f, cmb.w0(null, i, false)));
            invalidate();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
