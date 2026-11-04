package mi;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import org.telegram.ui.Cells.h9;
public final class x3 extends HorizontalScrollView {
    public final int f20023a;
    public final FrameLayout f20024b;

    public x3(FrameLayout frameLayout, Context context, int i3) {
        super(context);
        this.f20023a = i3;
        this.f20024b = frameLayout;
    }

    @Override
    public void onMeasure(int i3, int i10) {
        switch (this.f20023a) {
            case 0:
                int mode = View.MeasureSpec.getMode(i3);
                if (mode == 1073741824) {
                    super.onMeasure(i3, i10);
                    return;
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i3), 0), i10);
                int measuredWidth = getMeasuredWidth();
                int i11 = ((y3) this.f20024b).L;
                if (mode == Integer.MIN_VALUE) {
                    i11 = Math.min(i11, View.MeasureSpec.getSize(i3));
                }
                setMeasuredDimension(Math.min(measuredWidth, i11), getMeasuredHeight());
                return;
            default:
                super.onMeasure(i3, i10);
                return;
        }
    }

    @Override
    public void onScrollChanged(int i3, int i10, int i11, int i12) {
        h9 textSelectionHelper;
        switch (this.f20023a) {
            case 1:
                super.onScrollChanged(i3, i10, i11, i12);
                b3 b3Var = ((n5) this.f20024b).F;
                if (b3Var != null && (textSelectionHelper = b3Var.f19478a.getTextSelectionHelper()) != null && textSelectionHelper.x()) {
                    textSelectionHelper.w();
                }
                invalidate();
                return;
            default:
                super.onScrollChanged(i3, i10, i11, i12);
                return;
        }
    }
}
