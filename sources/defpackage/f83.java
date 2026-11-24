package defpackage;

import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.RectF;
import android.view.View;
import java.util.HashSet;
public final class f83 extends View implements tjb {
    public Path a;
    public Paint b;
    public boolean c;

    @Override
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        requestLayout();
    }

    @Override
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawPath(this.a, this.b);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gl.L(13.0f), 1073741824));
        setTop(this.c);
    }

    public void setTop(boolean z) {
        Path path = this.a;
        path.rewind();
        this.c = z;
        if (z) {
            float L = gl.L(14.0f);
            RectF rectF = gl.P;
            rectF.set(0.0f, gl.L(4.0f), getMeasuredWidth(), gl.L(4.0f) + (getMeasuredHeight() << 1));
            path.addRoundRect(rectF, L, L, Path.Direction.CW);
            return;
        }
        float L2 = gl.L(8.0f);
        RectF rectF2 = gl.P;
        rectF2.set(0.0f, ((-getMeasuredHeight()) << 1) - gl.L(4.0f), getMeasuredWidth(), getMeasuredHeight() - gl.L(4.0f));
        path.addRoundRect(rectF2, L2, L2, Path.Direction.CW);
    }

    @Override
    public final void updateColors() {
        try {
            this.b.setColor(bkb.w0(null, bkb.c6, false));
            invalidate();
        } catch (Exception e) {
            fa4.g(e, true);
        }
    }

    @Override
    public final void addColorKeys(HashSet hashSet) {
    }
}
