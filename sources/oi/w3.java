package oi;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import org.telegram.ui.Cells.j9;
public final class w3 extends HorizontalScrollView {
    public final int f22437a;
    public final FrameLayout f22438b;

    public w3(FrameLayout frameLayout, Context context, int i7) {
        super(context);
        this.f22437a = i7;
        this.f22438b = frameLayout;
    }

    @Override
    public void onMeasure(int i7, int i10) {
        switch (this.f22437a) {
            case 0:
                int mode = View.MeasureSpec.getMode(i7);
                if (mode == 1073741824) {
                    super.onMeasure(i7, i10);
                    return;
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i7), 0), i10);
                int measuredWidth = getMeasuredWidth();
                int i11 = ((x3) this.f22438b).L;
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
        switch (this.f22437a) {
            case 1:
                super.onScrollChanged(i7, i10, i11, i12);
                a3 a3Var = ((l5) this.f22438b).F;
                if (a3Var != null && (textSelectionHelper = a3Var.f21932a.getTextSelectionHelper()) != null && textSelectionHelper.x()) {
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
