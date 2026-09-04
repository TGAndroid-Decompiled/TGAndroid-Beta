package ji;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.HorizontalScrollView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.pr;
import org.telegram.ui.l20;
public final class w1 extends HorizontalScrollView {
    public final l20 f14281a;
    public final org.telegram.ui.Components.e6 f14282b;
    public final org.telegram.ui.Components.e6 f14283c;
    public final c2 d;

    public w1(c2 c2Var, Context context) {
        super(context);
        this.d = c2Var;
        this.f14281a = new l20();
        pr prVar = pr.h;
        this.f14282b = new org.telegram.ui.Components.e6(this, 300L, prVar);
        this.f14283c = new org.telegram.ui.Components.e6(this, 300L, prVar);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        float e7 = this.f14282b.e(canScrollHorizontally(-1));
        float e10 = this.f14283c.e(canScrollHorizontally(1));
        int i10 = (e7 > 0.0f ? 1 : (e7 == 0.0f ? 0 : -1));
        if (i10 <= 0 && e10 <= 0.0f) {
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(getScrollX(), 0.0f, getWidth() + getScrollX(), getHeight(), 255, 31);
        }
        super.dispatchDraw(canvas2);
        if (i10 <= 0 && e10 <= 0.0f) {
            return;
        }
        canvas2.save();
        l20 l20Var = this.f14281a;
        if (i10 > 0) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(getScrollX(), 0.0f, AndroidUtilities.dp(48.0f) + getScrollX(), getHeight());
            l20Var.b(canvas2, rectF, 0, e7);
        }
        if (e10 > 0.0f) {
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set((getWidth() + getScrollX()) - AndroidUtilities.dp(48.0f), 0.0f, getWidth() + getScrollX(), getHeight());
            l20Var.b(canvas2, rectF2, 2, e10);
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
        int i12 = this.d.f13821k0;
        if (mode == Integer.MIN_VALUE) {
            i12 = Math.min(i12, View.MeasureSpec.getSize(i10));
        }
        setMeasuredDimension(Math.min(measuredWidth, i12), getMeasuredHeight());
    }
}
