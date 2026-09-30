package ii;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import org.telegram.ui.Cells.q9;
import org.telegram.ui.p70;
public final class b4 extends HorizontalScrollView {
    public final int f11256a;
    public final Object f11257b;

    public b4(FrameLayout frameLayout, Context context, int i10) {
        super(context);
        this.f11256a = i10;
        this.f11257b = frameLayout;
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f11256a) {
            case 0:
                int mode = View.MeasureSpec.getMode(i10);
                if (mode == 1073741824) {
                    super.onMeasure(i10, i11);
                    return;
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 0), i11);
                int measuredWidth = getMeasuredWidth();
                int i12 = ((c4) this.f11257b).K;
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
        q9 textSelectionHelper;
        switch (this.f11256a) {
            case 1:
                super.onScrollChanged(i10, i11, i12, i13);
                d3 d3Var = ((p5) this.f11257b).E;
                if (d3Var != null && (textSelectionHelper = d3Var.f11307a.getTextSelectionHelper()) != null && textSelectionHelper.y()) {
                    textSelectionHelper.x();
                }
                invalidate();
                return;
            case 2:
                super.onScrollChanged(i10, i11, i12, i13);
                p70 p70Var = (p70) this.f11257b;
                if (p70Var.d != null) {
                    p70Var.d = null;
                    p70Var.f36527f = null;
                    return;
                }
                return;
            default:
                super.onScrollChanged(i10, i11, i12, i13);
                return;
        }
    }

    public b4(Context context, p70 p70Var) {
        super(context);
        this.f11256a = 2;
        this.f11257b = p70Var;
    }
}
