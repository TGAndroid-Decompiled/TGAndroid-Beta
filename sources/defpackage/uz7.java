package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import java.util.HashSet;
public final class uz7 extends View implements vlb {
    public Paint a;
    public Paint b;
    public float c;

    @Override
    public final void onDraw(Canvas canvas) {
        float measuredWidth = (int) (getMeasuredWidth() * this.c);
        canvas.drawRect(0.0f, 0.0f, measuredWidth, getMeasuredHeight(), this.b);
        canvas.drawRect(measuredWidth, 0.0f, getMeasuredWidth(), getMeasuredHeight(), this.a);
    }

    @Override
    public final void updateColors() {
        try {
            this.a.setColor(cmb.w0(null, cmb.Wi, false));
            this.b.setColor(cmb.w0(null, cmb.Xi, false));
            invalidate();
        } catch (Exception e) {
            fc4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
