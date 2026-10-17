package ki;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import org.telegram.ui.Cells.n9;
import org.telegram.ui.d70;
public final class a4 extends HorizontalScrollView {
    public final int f15114a;
    public final Object f15115b;

    public a4(FrameLayout frameLayout, Context context, int i10) {
        super(context);
        this.f15114a = i10;
        this.f15115b = frameLayout;
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f15114a) {
            case 0:
                int mode = View.MeasureSpec.getMode(i10);
                if (mode == 1073741824) {
                    super.onMeasure(i10, i11);
                    return;
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 0), i11);
                int measuredWidth = getMeasuredWidth();
                int i12 = ((b4) this.f15115b).K;
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
        n9 textSelectionHelper;
        switch (this.f15114a) {
            case 1:
                super.onScrollChanged(i10, i11, i12, i13);
                c3 c3Var = ((o5) this.f15115b).E;
                if (c3Var != null && (textSelectionHelper = c3Var.f15169a.getTextSelectionHelper()) != null && textSelectionHelper.x()) {
                    textSelectionHelper.w();
                }
                invalidate();
                return;
            case 2:
                super.onScrollChanged(i10, i11, i12, i13);
                d70 d70Var = (d70) this.f15115b;
                if (d70Var.d != null) {
                    d70Var.d = null;
                    d70Var.f36087f = null;
                    return;
                }
                return;
            default:
                super.onScrollChanged(i10, i11, i12, i13);
                return;
        }
    }

    public a4(Context context, d70 d70Var) {
        super(context);
        this.f15114a = 2;
        this.f15115b = d70Var;
    }
}
