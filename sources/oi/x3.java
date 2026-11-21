package oi;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import org.telegram.ui.Cells.j9;
public final class x3 extends HorizontalScrollView {
    public final int f22526a;
    public final FrameLayout f22527b;

    public x3(FrameLayout frameLayout, Context context, int i7) {
        super(context);
        this.f22526a = i7;
        this.f22527b = frameLayout;
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.f22526a) {
            case 0:
                int mode = View.MeasureSpec.getMode(i7);
                if (mode == 1073741824) {
                    super.onMeasure(i7, i10);
                    return;
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 0), i10);
                int measuredWidth = getMeasuredWidth();
                int i11 = ((y3) this.f22527b).L;
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
        j9 textSelectionHelper;
        switch (this.f22526a) {
            case 1:
                super.onScrollChanged(i7, i10, i11, i12);
                b3 b3Var = ((m5) this.f22527b).F;
                if (b3Var != null && (textSelectionHelper = b3Var.f22021a.getTextSelectionHelper()) != null && textSelectionHelper.x()) {
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
