package defpackage;

import android.app.Activity;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import org.telegram.ui.o;
public final class qu extends View {
    public final RectF a;

    public qu(Activity activity) {
        super(activity);
        this.a = new RectF();
        setImportantForAccessibility(2);
    }

    @Override
    public final void onDraw(Canvas canvas) {
        int measuredWidth = getMeasuredWidth() / 3;
        RectF rectF = this.a;
        rectF.set(measuredWidth, hl.L(8.0f), measuredWidth << 1, hl.L(10.0f));
        canvas.drawRoundRect(rectF, hl.L(1.0f), hl.L(1.0f), o.t1);
    }

    @Override
    public final void onMeasure(int i, int i2) {
        setMeasuredDimension(View.MeasureSpec.getSize(i), hl.L(18.0f));
    }
}
