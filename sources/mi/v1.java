package mi;

import android.content.Context;
import android.view.View;
import android.widget.HorizontalScrollView;
public final class v1 extends HorizontalScrollView {
    public final int f19977a;

    public v1(Context context, int i3) {
        super(context);
        this.f19977a = i3;
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        switch (this.f19977a) {
            case 0:
                int mode = View.MeasureSpec.getMode(i3);
                int size = View.MeasureSpec.getSize(i3);
                if (mode == 1073741824) {
                    super.onMeasure(i3, i10);
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
                int mode2 = View.MeasureSpec.getMode(i3);
                int size2 = View.MeasureSpec.getSize(i3);
                if (mode2 == 1073741824) {
                    super.onMeasure(i3, i10);
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
