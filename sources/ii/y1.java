package ii;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.HorizontalScrollView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.sr;
import org.telegram.ui.j20;
public final class y1 extends HorizontalScrollView {
    public final j20 f11768a;
    public final org.telegram.ui.Components.e6 f11769b;
    public final org.telegram.ui.Components.e6 f11770c;
    public final e2 d;

    public y1(e2 e2Var, Context context) {
        super(context);
        this.d = e2Var;
        this.f11768a = new j20();
        sr srVar = sr.h;
        this.f11769b = new org.telegram.ui.Components.e6(this, 300L, srVar);
        this.f11770c = new org.telegram.ui.Components.e6(this, 300L, srVar);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        float e = this.f11769b.e(canScrollHorizontally(-1));
        float e7 = this.f11770c.e(canScrollHorizontally(1));
        int i10 = (e > 0.0f ? 1 : (e == 0.0f ? 0 : -1));
        if (i10 <= 0 && e7 <= 0.0f) {
            canvas2 = canvas;
        } else {
            canvas2 = canvas;
            canvas2.saveLayerAlpha(getScrollX(), 0.0f, getWidth() + getScrollX(), getHeight(), 255, 31);
        }
        super.dispatchDraw(canvas2);
        if (i10 <= 0 && e7 <= 0.0f) {
            return;
        }
        canvas2.save();
        j20 j20Var = this.f11768a;
        if (i10 > 0) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(getScrollX(), 0.0f, AndroidUtilities.dp(48.0f) + getScrollX(), getHeight());
            j20Var.b(canvas2, rectF, 0, e);
        }
        if (e7 > 0.0f) {
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set((getWidth() + getScrollX()) - AndroidUtilities.dp(48.0f), 0.0f, getWidth() + getScrollX(), getHeight());
            j20Var.b(canvas2, rectF2, 2, e7);
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
        int i12 = this.d.f11324k0;
        if (mode == Integer.MIN_VALUE) {
            i12 = Math.min(i12, View.MeasureSpec.getSize(i10));
        }
        setMeasuredDimension(Math.min(measuredWidth, i12), getMeasuredHeight());
    }
}
