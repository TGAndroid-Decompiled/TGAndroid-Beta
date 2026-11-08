package li;

import android.content.Context;
import android.view.View;
import android.widget.HorizontalScrollView;
public final class u1 extends HorizontalScrollView {
    public final int f18916a;

    public u1(Context context, int i7) {
        super(context);
        this.f18916a = i7;
    }

    @Override
    public final void onMeasure(int i7, int i10) {
        switch (this.f18916a) {
            case 0:
                int mode = View.MeasureSpec.getMode(i7);
                int size = View.MeasureSpec.getSize(i7);
                if (mode == 1073741824) {
                    super.onMeasure(i7, i10);
                    return;
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(size, 0), i10);
                int measuredWidth = getMeasuredWidth();
                if (mode == Integer.MIN_VALUE) {
                    measuredWidth = Math.min(measuredWidth, size);
                }
                setMeasuredDimension(measuredWidth, getMeasuredHeight());
                return;
            default:
                int mode2 = View.MeasureSpec.getMode(i7);
                int size2 = View.MeasureSpec.getSize(i7);
                if (mode2 == 1073741824) {
                    super.onMeasure(i7, i10);
                    return;
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(size2, 0), i10);
                int measuredWidth2 = getMeasuredWidth();
                if (mode2 == Integer.MIN_VALUE) {
                    measuredWidth2 = Math.min(measuredWidth2, size2);
                }
                setMeasuredDimension(measuredWidth2, getMeasuredHeight());
                return;
        }
    }
}
