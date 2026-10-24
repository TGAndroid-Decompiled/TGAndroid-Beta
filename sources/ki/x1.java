package ki;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.HorizontalScrollView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.zr;
import org.telegram.ui.w10;
public final class x1 extends HorizontalScrollView {
    public final w10 f15702a;
    public final org.telegram.ui.Components.d6 f15703b;
    public final org.telegram.ui.Components.d6 f15704c;
    public final d2 d;

    public x1(d2 d2Var, Context context) {
        super(context);
        this.d = d2Var;
        this.f15702a = new w10();
        zr zrVar = zr.h;
        this.f15703b = new org.telegram.ui.Components.d6(this, 300L, zrVar);
        this.f15704c = new org.telegram.ui.Components.d6(this, 300L, zrVar);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        float e = this.f15703b.e(canScrollHorizontally(-1));
        float e7 = this.f15704c.e(canScrollHorizontally(1));
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
        w10 w10Var = this.f15702a;
        if (i10 > 0) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(getScrollX(), 0.0f, AndroidUtilities.dp(48.0f) + getScrollX(), getHeight());
            w10Var.b(canvas2, rectF, 0, e);
        }
        if (e7 > 0.0f) {
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set((getWidth() + getScrollX()) - AndroidUtilities.dp(48.0f), 0.0f, getWidth() + getScrollX(), getHeight());
            w10Var.b(canvas2, rectF2, 2, e7);
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
        int i12 = this.d.f15268k0;
        if (mode == Integer.MIN_VALUE) {
            i12 = Math.min(i12, View.MeasureSpec.getSize(i10));
        }
        setMeasuredDimension(Math.min(measuredWidth, i12), getMeasuredHeight());
    }
}
