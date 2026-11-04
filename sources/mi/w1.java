package mi;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.HorizontalScrollView;
import org.telegram.ui.Components.xq;
public final class w1 extends HorizontalScrollView {
    public final k4.j f19993a;
    public final org.telegram.ui.Components.u5 f19994b;
    public final org.telegram.ui.Components.u5 f19995c;
    public final c2 d;

    public w1(c2 c2Var, Context context) {
        super(context);
        this.d = c2Var;
        this.f19993a = new k4.j(24);
        xq xqVar = xq.h;
        this.f19994b = new org.telegram.ui.Components.u5(this, 300L, xqVar);
        this.f19995c = new org.telegram.ui.Components.u5(this, 300L, xqVar);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        float d = this.f19994b.d(canScrollHorizontally(-1));
        float d10 = this.f19995c.d(canScrollHorizontally(1));
        int i3 = (d > 0.0f ? 1 : (d == 0.0f ? 0 : -1));
        if (i3 <= 0 && d10 <= 0.0f) {
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(getScrollX(), 0.0f, getWidth() + getScrollX(), getHeight(), 255, 31);
        }
        super.dispatchDraw(canvas2);
        if (i3 <= 0 && d10 <= 0.0f) {
            return;
        }
        canvas2.save();
        k4.j jVar = this.f19993a;
        if (i3 > 0) {
            RectF rectF = org.telegram.messenger.g0.P;
            rectF.set(getScrollX(), 0.0f, org.telegram.messenger.g0.L(48.0f) + getScrollX(), getHeight());
            jVar.w(canvas2, rectF, 0, d);
        }
        if (d10 > 0.0f) {
            RectF rectF2 = org.telegram.messenger.g0.P;
            rectF2.set((getWidth() + getScrollX()) - org.telegram.messenger.g0.L(48.0f), 0.0f, getWidth() + getScrollX(), getHeight());
            jVar.w(canvas2, rectF2, 2, d10);
        }
        canvas2.restore();
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        int mode = View.MeasureSpec.getMode(i3);
        if (mode == 1073741824) {
            super.onMeasure(i3, i10);
            return;
        }
        super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 0), i10);
        int measuredWidth = getMeasuredWidth();
        int i11 = this.d.f19523l0;
        if (mode == Integer.MIN_VALUE) {
            i11 = Math.min(i11, View.MeasureSpec.getSize(i3));
        }
        setMeasuredDimension(Math.min(measuredWidth, i11), getMeasuredHeight());
    }
}
