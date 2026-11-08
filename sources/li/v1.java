package li;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.HorizontalScrollView;
import org.telegram.ui.Components.xq;
public final class v1 extends HorizontalScrollView {
    public final h6.m f18932a;
    public final org.telegram.ui.Components.w5 f18933b;
    public final org.telegram.ui.Components.w5 f18934c;
    public final b2 d;

    public v1(b2 b2Var, Context context) {
        super(context);
        this.d = b2Var;
        this.f18932a = new h6.m(28);
        xq xqVar = xq.h;
        this.f18933b = new org.telegram.ui.Components.w5(this, 300L, xqVar);
        this.f18934c = new org.telegram.ui.Components.w5(this, 300L, xqVar);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        float d = this.f18933b.d(canScrollHorizontally(-1));
        float d2 = this.f18934c.d(canScrollHorizontally(1));
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
        h6.m mVar = this.f18932a;
        if (i7 > 0) {
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(getScrollX(), 0.0f, org.telegram.messenger.g0.L(48.0f) + getScrollX(), getHeight());
            mVar.m(canvas2, rectF, 0, d);
        }
        if (d2 > 0.0f) {
            RectF rectF2 = org.telegram.messenger.g0.P;
            rectF2.set((getWidth() + getScrollX()) - org.telegram.messenger.g0.L(48.0f), 0.0f, getWidth() + getScrollX(), getHeight());
            mVar.m(canvas2, rectF2, 2, d2);
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
        int i11 = this.d.f18456k0;
        if (mode == Integer.MIN_VALUE) {
            i11 = Math.min(i11, View.MeasureSpec.getSize(i7));
        }
        setMeasuredDimension(Math.min(measuredWidth, i11), getMeasuredHeight());
    }
}
