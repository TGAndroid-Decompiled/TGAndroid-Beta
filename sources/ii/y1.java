package ii;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.HorizontalScrollView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.rr;
import org.telegram.ui.i20;
public final class y1 extends HorizontalScrollView {
    public final i20 f11765a;
    public final org.telegram.ui.Components.e6 f11766b;
    public final org.telegram.ui.Components.e6 f11767c;
    public final e2 d;

    public y1(e2 e2Var, Context context) {
        super(context);
        this.d = e2Var;
        this.f11765a = new i20();
        rr rrVar = rr.h;
        this.f11766b = new org.telegram.ui.Components.e6(this, 300L, rrVar);
        this.f11767c = new org.telegram.ui.Components.e6(this, 300L, rrVar);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        float e = this.f11766b.e(canScrollHorizontally(-1));
        float e7 = this.f11767c.e(canScrollHorizontally(1));
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
        i20 i20Var = this.f11765a;
        if (i10 > 0) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(getScrollX(), 0.0f, AndroidUtilities.dp(48.0f) + getScrollX(), getHeight());
            i20Var.b(canvas2, rectF, 0, e);
        }
        if (e7 > 0.0f) {
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set((getWidth() + getScrollX()) - AndroidUtilities.dp(48.0f), 0.0f, getWidth() + getScrollX(), getHeight());
            i20Var.b(canvas2, rectF2, 2, e7);
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
        int i12 = this.d.f11321k0;
        if (mode == Integer.MIN_VALUE) {
            i12 = Math.min(i12, View.MeasureSpec.getSize(i10));
        }
        setMeasuredDimension(Math.min(measuredWidth, i12), getMeasuredHeight());
    }
}
