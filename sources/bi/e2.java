package bi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.HorizontalScrollView;
import org.telegram.ui.Components.gr;
public final class e2 extends HorizontalScrollView {
    public final li.k f2979a;
    public final org.telegram.ui.Components.t5 f2980b;
    public final org.telegram.ui.Components.t5 f2981c;
    public final k2 d;

    public e2(k2 k2Var, Context context) {
        super(context);
        this.d = k2Var;
        this.f2979a = new li.k(23);
        gr grVar = gr.h;
        this.f2980b = new org.telegram.ui.Components.t5(this, 300L, grVar);
        this.f2981c = new org.telegram.ui.Components.t5(this, 300L, grVar);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        float d = this.f2980b.d(canScrollHorizontally(-1));
        float d10 = this.f2981c.d(canScrollHorizontally(1));
        int i10 = (d > 0.0f ? 1 : (d == 0.0f ? 0 : -1));
        if (i10 <= 0 && d10 <= 0.0f) {
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(getScrollX(), 0.0f, getWidth() + getScrollX(), getHeight(), 255, 31);
        }
        super.dispatchDraw(canvas2);
        if (i10 <= 0 && d10 <= 0.0f) {
            return;
        }
        canvas2.save();
        li.k kVar = this.f2979a;
        if (i10 > 0) {
            RectF rectF = org.telegram.messenger.i0.P;
            rectF.set(getScrollX(), 0.0f, org.telegram.messenger.i0.L(48.0f) + getScrollX(), getHeight());
            kVar.o(canvas2, rectF, 0, d);
        }
        if (d10 > 0.0f) {
            RectF rectF2 = org.telegram.messenger.i0.P;
            rectF2.set((getWidth() + getScrollX()) - org.telegram.messenger.i0.L(48.0f), 0.0f, getWidth() + getScrollX(), getHeight());
            kVar.o(canvas2, rectF2, 2, d10);
        }
        canvas2.restore();
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        if (mode == 1073741824) {
            super.onMeasure(i10, i11);
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 0), i11);
        int measuredWidth = getMeasuredWidth();
        int i12 = this.d.f3148k0;
        if (mode == Integer.MIN_VALUE) {
            i12 = Math.min(i12, View.MeasureSpec.getSize(i10));
        }
        setMeasuredDimension(Math.min(measuredWidth, i12), getMeasuredHeight());
    }
}
