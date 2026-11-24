package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.HorizontalScrollView;
public final class cd9 extends HorizontalScrollView {
    public final xl3 a;
    public final lm b;
    public final lm c;
    public final hd9 d;

    public cd9(hd9 hd9Var, Context context) {
        super(context);
        this.d = hd9Var;
        this.a = new xl3((byte) 7);
        s33 s33Var = s33.h;
        this.b = new lm(300L, this, s33Var);
        this.c = new lm(300L, this, s33Var);
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
        xl3 xl3Var = this.a;
        if (i > 0) {
            RectF rectF = gl.P;
            rectF.set(getScrollX(), 0.0f, gl.L(48.0f) + getScrollX(), getHeight());
            xl3Var.s(canvas2, rectF, 0, d);
        }
        if (d2 > 0.0f) {
            RectF rectF2 = gl.P;
            rectF2.set((getWidth() + getScrollX()) - gl.L(48.0f), 0.0f, getWidth() + getScrollX(), getHeight());
            xl3Var.s(canvas2, rectF2, 2, d2);
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
