package hi;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import org.telegram.ui.Cells.s9;
import org.telegram.ui.t70;
public final class d4 extends HorizontalScrollView {
    public final int f9519a;
    public final Object f9520b;

    public d4(FrameLayout frameLayout, Context context, int i10) {
        super(context);
        this.f9519a = i10;
        this.f9520b = frameLayout;
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f9519a) {
            case 0:
                int mode = View.MeasureSpec.getMode(i10);
                if (mode == 1073741824) {
                    super.onMeasure(i10, i11);
                    return;
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 0), i11);
                int measuredWidth = getMeasuredWidth();
                int i12 = ((e4) this.f9520b).K;
                if (mode == Integer.MIN_VALUE) {
                    i12 = Math.min(i12, View.MeasureSpec.getSize(i10));
                }
                setMeasuredDimension(Math.min(measuredWidth, i12), getMeasuredHeight());
                return;
            default:
                super.onMeasure(i10, i11);
                return;
        }
    }

    @Override
    public void onScrollChanged(int i10, int i11, int i12, int i13) {
        s9 textSelectionHelper;
        switch (this.f9519a) {
            case 1:
                super.onScrollChanged(i10, i11, i12, i13);
                f3 f3Var = ((r5) this.f9520b).E;
                if (f3Var != null && (textSelectionHelper = f3Var.f9568a.getTextSelectionHelper()) != null && textSelectionHelper.y()) {
                    textSelectionHelper.x();
                }
                invalidate();
                return;
            case 2:
                super.onScrollChanged(i10, i11, i12, i13);
                t70 t70Var = (t70) this.f9520b;
                if (t70Var.d != null) {
                    t70Var.d = null;
                    t70Var.f36857f = null;
                    return;
                }
                return;
            default:
                super.onScrollChanged(i10, i11, i12, i13);
                return;
        }
    }

    public d4(Context context, t70 t70Var) {
        super(context);
        this.f9519a = 2;
        this.f9520b = t70Var;
    }
}
