package li;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import org.telegram.ui.Cells.i9;
public final class x3 extends HorizontalScrollView {
    public final int f18992a;
    public final FrameLayout f18993b;

    public x3(FrameLayout frameLayout, Context context, int i7) {
        super(context);
        this.f18992a = i7;
        this.f18993b = frameLayout;
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.f18992a) {
            case 0:
                int mode = View.MeasureSpec.getMode(i7);
                if (mode == 1073741824) {
                    super.onMeasure(i7, i10);
                    return;
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 0), i10);
                int measuredWidth = getMeasuredWidth();
                int i11 = ((y3) this.f18993b).K;
                if (mode == Integer.MIN_VALUE) {
                    i11 = Math.min(i11, View.MeasureSpec.getSize(i7));
                }
                setMeasuredDimension(Math.min(measuredWidth, i11), getMeasuredHeight());
                return;
            default:
                super.onMeasure(i7, i10);
                return;
        }
    }

    @Override
    public void onScrollChanged(int i7, int i10, int i11, int i12) {
        i9 textSelectionHelper;
        switch (this.f18992a) {
            case 1:
                super.onScrollChanged(i7, i10, i11, i12);
                a3 a3Var = ((m5) this.f18993b).E;
                if (a3Var != null && (textSelectionHelper = a3Var.f18422a.getTextSelectionHelper()) != null && textSelectionHelper.x()) {
                    textSelectionHelper.w();
                }
                invalidate();
                return;
            default:
                super.onScrollChanged(i7, i10, i11, i12);
                return;
        }
    }
}
