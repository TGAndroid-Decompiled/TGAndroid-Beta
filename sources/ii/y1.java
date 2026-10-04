package ii;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.HorizontalScrollView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.tr;
import org.telegram.ui.k20;
public final class y1 extends HorizontalScrollView {
    public final k20 f12801a;
    public final org.telegram.ui.Components.e6 f12802b;
    public final org.telegram.ui.Components.e6 f12803c;
    public final e2 d;

    public y1(e2 e2Var, Context context) {
        super(context);
        this.d = e2Var;
        this.f12801a = new k20();
        tr trVar = tr.h;
        this.f12802b = new org.telegram.ui.Components.e6(this, 300L, trVar);
        this.f12803c = new org.telegram.ui.Components.e6(this, 300L, trVar);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        float e7 = this.f12802b.e(canScrollHorizontally(-1));
        float e10 = this.f12803c.e(canScrollHorizontally(1));
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
        k20 k20Var = this.f12801a;
        if (i10 > 0) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(getScrollX(), 0.0f, AndroidUtilities.dp(48.0f) + getScrollX(), getHeight());
            k20Var.b(canvas2, rectF, 0, e7);
        }
        if (e10 > 0.0f) {
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set((getWidth() + getScrollX()) - AndroidUtilities.dp(48.0f), 0.0f, getWidth() + getScrollX(), getHeight());
            k20Var.b(canvas2, rectF2, 2, e10);
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
        int i12 = this.d.f12328k0;
        if (mode == Integer.MIN_VALUE) {
            i12 = Math.min(i12, View.MeasureSpec.getSize(i10));
        }
        setMeasuredDimension(Math.min(measuredWidth, i12), getMeasuredHeight());
    }
}
