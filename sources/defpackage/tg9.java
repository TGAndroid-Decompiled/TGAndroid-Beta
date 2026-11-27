package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.HorizontalScrollView;
public final class tg9 extends HorizontalScrollView {
    public final pm3 a;
    public final mm b;
    public final mm c;
    public final yg9 d;

    public tg9(yg9 yg9Var, Context context) {
        super(context);
        this.d = yg9Var;
        this.a = new pm3((byte) 7);
        k43 k43Var = k43.h;
        this.b = new mm(300L, this, k43Var);
        this.c = new mm(300L, this, k43Var);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        float d = this.b.d(canScrollHorizontally(-1));
        float d2 = this.c.d(canScrollHorizontally(1));
        int i = (d > 0.0f ? 1 : (d == 0.0f ? 0 : -1));
        if (i <= 0 && d2 <= 0.0f) {
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(getScrollX(), 0.0f, getWidth() + getScrollX(), getHeight(), 255, 31);
        }
        super.dispatchDraw(canvas2);
        if (i <= 0 && d2 <= 0.0f) {
            return;
        }
        canvas2.save();
        pm3 pm3Var = this.a;
        if (i > 0) {
            RectF rectF = hl.P;
            rectF.set(getScrollX(), 0.0f, hl.L(48.0f) + getScrollX(), getHeight());
            pm3Var.r(canvas2, rectF, 0, d);
        }
        if (d2 > 0.0f) {
            RectF rectF2 = hl.P;
            rectF2.set((getWidth() + getScrollX()) - hl.L(48.0f), 0.0f, getWidth() + getScrollX(), getHeight());
            pm3Var.r(canvas2, rectF2, 2, d2);
        }
        canvas2.restore();
    }

    @Override
    public final void onMeasure(int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        if (mode == 1073741824) {
            super.onMeasure(i, i2);
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 0), i2);
        int measuredWidth = getMeasuredWidth();
        int i3 = this.d.l0;
        if (mode == Integer.MIN_VALUE) {
            i3 = Math.min(i3, View.MeasureSpec.getSize(i));
        }
        setMeasuredDimension(Math.min(measuredWidth, i3), getMeasuredHeight());
    }
}
