package defpackage;

import android.content.Context;
import android.view.View;
import android.widget.HorizontalScrollView;
public final class bd9 extends HorizontalScrollView {
    public final byte a;

    public bd9(Context context, byte b) {
        super(context);
        this.a = b;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        switch (this.a) {
            case 0:
                int mode = View.MeasureSpec.getMode(i);
                int size = View.MeasureSpec.getSize(i);
                if (mode == 1073741824) {
                    super.onMeasure(i, i2);
                    return;
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 0), i2);
                int measuredWidth = getMeasuredWidth();
                if (mode == Integer.MIN_VALUE) {
                    measuredWidth = Math.min(measuredWidth, size);
                }
                setMeasuredDimension(measuredWidth, getMeasuredHeight());
                return;
            default:
                int mode2 = View.MeasureSpec.getMode(i);
                int size2 = View.MeasureSpec.getSize(i);
                if (mode2 == 1073741824) {
                    super.onMeasure(i, i2);
                    return;
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(size2, 0), i2);
                int measuredWidth2 = getMeasuredWidth();
                if (mode2 == Integer.MIN_VALUE) {
                    measuredWidth2 = Math.min(measuredWidth2, size2);
                }
                setMeasuredDimension(measuredWidth2, getMeasuredHeight());
                return;
        }
    }
}
