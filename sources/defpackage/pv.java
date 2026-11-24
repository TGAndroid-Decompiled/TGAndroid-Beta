package defpackage;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.o;
public final class pv extends View {
    public final RectF a;

    public pv(Activity activity) {
        super(activity);
        this.a = new RectF();
        setImportantForAccessibility(2);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int measuredWidth = getMeasuredWidth() / 3;
        RectF rectF = this.a;
        rectF.set(measuredWidth, gm.L(8.0f), measuredWidth << 1, gm.L(10.0f));
        canvas.drawRoundRect(rectF, gm.L(1.0f), gm.L(1.0f), o.t1);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), gm.L(18.0f));
    }
}
