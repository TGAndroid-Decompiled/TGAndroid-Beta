package defpackage;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.o;
public final class pu extends View {
    public final RectF a;

    public pu(Activity activity) {
        super(activity);
        this.a = new RectF();
        setImportantForAccessibility(2);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int measuredWidth = getMeasuredWidth() / 3;
        RectF rectF = this.a;
        rectF.set(measuredWidth, gl.L(8.0f), measuredWidth << 1, gl.L(10.0f));
        canvas.drawRoundRect(rectF, gl.L(1.0f), gl.L(1.0f), o.t1);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), gl.L(18.0f));
    }
}
