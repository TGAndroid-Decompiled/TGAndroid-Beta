package li;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.RectF;
import android.view.View;
import android.widget.HorizontalScrollView;
import org.telegram.messenger.AndroidUtilities;
import org.telegram.ui.Components.ds;
import org.telegram.ui.y10;
public final class v1 extends HorizontalScrollView {
    public final y10 f17537a;
    public final org.telegram.ui.Components.h6 f17538b;
    public final org.telegram.ui.Components.h6 f17539c;
    public final b2 d;

    public v1(b2 b2Var, Context context) {
        super(context);
        this.d = b2Var;
        this.f17537a = new y10();
        ds dsVar = ds.h;
        this.f17538b = new org.telegram.ui.Components.h6(this, 300L, dsVar);
        this.f17539c = new org.telegram.ui.Components.h6(this, 300L, dsVar);
    }

    @Override
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        float e = this.f17538b.e(canScrollHorizontally(-1));
        float e10 = this.f17539c.e(canScrollHorizontally(1));
        int i10 = (e > 0.0f ? 1 : (e == 0.0f ? 0 : -1));
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
        y10 y10Var = this.f17537a;
        if (i10 > 0) {
            RectF rectF = AndroidUtilities.rectTmp;
            rectF.set(getScrollX(), 0.0f, AndroidUtilities.dp(48.0f) + getScrollX(), getHeight());
            y10Var.b(canvas2, rectF, 0, e);
        }
        if (e10 > 0.0f) {
            RectF rectF2 = AndroidUtilities.rectTmp;
            rectF2.set((getWidth() + getScrollX()) - AndroidUtilities.dp(48.0f), 0.0f, getWidth() + getScrollX(), getHeight());
            y10Var.b(canvas2, rectF2, 2, e10);
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
        int i12 = this.d.f17132k0;
        if (mode == Integer.MIN_VALUE) {
            i12 = Math.min(i12, View.MeasureSpec.getSize(i10));
        }
        setMeasuredDimension(Math.min(measuredWidth, i12), getMeasuredHeight());
    }
}
