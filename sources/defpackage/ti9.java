package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
public final class ti9 extends HorizontalScrollView {
    public final byte a;
    public final FrameLayout b;

    public ti9(FrameLayout frameLayout, Context context, byte b) {
        super(context);
        this.a = b;
        this.b = frameLayout;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        switch (this.a) {
            case 0:
                int mode = View.MeasureSpec.getMode(i);
                if (mode == 1073741824) {
                    super.onMeasure(i, i2);
                    return;
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 0), i2);
                int measuredWidth = getMeasuredWidth();
                int i3 = ((ui9) this.b).L;
                if (mode == Integer.MIN_VALUE) {
                    i3 = Math.min(i3, View.MeasureSpec.getSize(i));
                }
                setMeasuredDimension(Math.min(measuredWidth, i3), getMeasuredHeight());
                return;
            default:
                super.onMeasure(i, i2);
                return;
        }
    }

    @Override
    public final void onScrollChanged(int i, int i2, int i3, int i4) {
        amb textSelectionHelper;
        switch (this.a) {
            case 1:
                super.onScrollChanged(i, i2, i3, i4);
                xh9 xh9Var = ((xl9) this.b).F;
                if (xh9Var != null && (textSelectionHelper = xh9Var.a.getTextSelectionHelper()) != null && textSelectionHelper.w()) {
                    textSelectionHelper.v();
                }
                invalidate();
                return;
            default:
                super.onScrollChanged(i, i2, i3, i4);
                return;
        }
    }
}
