package oi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.HorizontalScrollView;
import org.telegram.ui.Components.i61;
import org.telegram.ui.Components.kr;
public final class v1 extends HorizontalScrollView {
    public final i61 f22543a;
    public final org.telegram.ui.Components.c6 f22544b;
    public final org.telegram.ui.Components.c6 f22545c;
    public final b2 d;

    public v1(b2 b2Var, Context context) {
        super(context);
        this.d = b2Var;
        this.f22543a = new i61(1);
        kr krVar = kr.h;
        this.f22544b = new org.telegram.ui.Components.c6(this, 300L, krVar);
        this.f22545c = new org.telegram.ui.Components.c6(this, 300L, krVar);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        float d = this.f22544b.d(canScrollHorizontally(-1));
        float d2 = this.f22545c.d(canScrollHorizontally(1));
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
        i61 i61Var = this.f22543a;
        if (i7 > 0) {
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(getScrollX(), 0.0f, org.telegram.messenger.g0.L(48.0f) + getScrollX(), getHeight());
            i61Var.u(canvas2, rectF, 0, d);
        }
        if (d2 > 0.0f) {
            RectF rectF2 = org.telegram.messenger.g0.P;
            rectF2.set((getWidth() + getScrollX()) - org.telegram.messenger.g0.L(48.0f), 0.0f, getWidth() + getScrollX(), getHeight());
            i61Var.u(canvas2, rectF2, 2, d2);
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
        int i11 = this.d.f22070l0;
        if (mode == Integer.MIN_VALUE) {
            i11 = Math.min(i11, View.MeasureSpec.getSize(i7));
        }
        setMeasuredDimension(Math.min(measuredWidth, i11), getMeasuredHeight());
    }
}
