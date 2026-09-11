package ji;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import org.telegram.ui.Cells.q9;
import org.telegram.ui.v70;
public final class z3 extends HorizontalScrollView {
    public final int f14375a;
    public final Object f14376b;

    public z3(FrameLayout frameLayout, Context context, int i10) {
        super(context);
        this.f14375a = i10;
        this.f14376b = frameLayout;
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f14375a) {
            case 0:
                int mode = View.MeasureSpec.getMode(i10);
                if (mode == 1073741824) {
                    super.onMeasure(i10, i11);
                    return;
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 0), i11);
                int measuredWidth = getMeasuredWidth();
                int i12 = ((a4) this.f14376b).K;
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
        switch (this.f14375a) {
            case 1:
                super.onScrollChanged(i10, i11, i12, i13);
                b3 b3Var = ((s5) this.f14376b).E;
                if (b3Var != null && (textSelectionHelper = b3Var.f13790a.getTextSelectionHelper()) != null && textSelectionHelper.y()) {
                    textSelectionHelper.x();
                }
                invalidate();
                return;
            case 2:
                super.onScrollChanged(i10, i11, i12, i13);
                v70 v70Var = (v70) this.f14376b;
                if (v70Var.d != null) {
                    v70Var.d = null;
                    v70Var.f41437f = null;
                    return;
                }
                return;
            default:
                super.onScrollChanged(i10, i11, i12, i13);
                return;
        }
    }

    public z3(Context context, v70 v70Var) {
        super(context);
        this.f14375a = 2;
        this.f14376b = v70Var;
    }
}
