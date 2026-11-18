package oi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.HorizontalScrollView;
import org.telegram.ui.Components.lr;
public final class t1 extends HorizontalScrollView {
    public final h6.m f22364a;
    public final org.telegram.ui.Components.c6 f22365b;
    public final org.telegram.ui.Components.c6 f22366c;
    public final z1 d;

    public t1(z1 z1Var, Context context) {
        super(context);
        this.d = z1Var;
        this.f22364a = new h6.m(29);
        lr lrVar = lr.h;
        this.f22365b = new org.telegram.ui.Components.c6(this, 300L, lrVar);
        this.f22366c = new org.telegram.ui.Components.c6(this, 300L, lrVar);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        float d = this.f22365b.d(canScrollHorizontally(-1));
        float d2 = this.f22366c.d(canScrollHorizontally(1));
        int i7 = (d > 0.0f ? 1 : (d == 0.0f ? 0 : -1));
        if (i7 <= 0 && d2 <= 0.0f) {
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(getScrollX(), 0.0f, getWidth() + getScrollX(), getHeight(), 255, 31);
        }
        super.dispatchDraw(canvas2);
        if (i7 <= 0 && d2 <= 0.0f) {
            return;
        }
        canvas2.save();
        h6.m mVar = this.f22364a;
        if (i7 > 0) {
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(getScrollX(), 0.0f, org.telegram.messenger.g0.L(48.0f) + getScrollX(), getHeight());
            mVar.n(canvas2, rectF, 0, d);
        }
        if (d2 > 0.0f) {
            RectF rectF2 = org.telegram.messenger.g0.P;
            rectF2.set((getWidth() + getScrollX()) - org.telegram.messenger.g0.L(48.0f), 0.0f, getWidth() + getScrollX(), getHeight());
            mVar.n(canvas2, rectF2, 2, d2);
        }
        canvas2.restore();
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        int mode = View.MeasureSpec.getMode(i7);
        if (mode == 1073741824) {
            super.onMeasure(i7, i10);
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 0), i10);
        int measuredWidth = getMeasuredWidth();
        int i11 = this.d.f22528l0;
        if (mode == Integer.MIN_VALUE) {
            i11 = Math.min(i11, View.MeasureSpec.getSize(i7));
        }
        setMeasuredDimension(Math.min(measuredWidth, i11), getMeasuredHeight());
    }
}
