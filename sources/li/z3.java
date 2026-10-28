package li;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import org.telegram.ui.Cells.s9;
import org.telegram.ui.j70;
public final class z3 extends HorizontalScrollView {
    public final int f17663a;
    public final Object f17664b;

    public z3(FrameLayout frameLayout, Context context, int i10) {
        super(context);
        this.f17663a = i10;
        this.f17664b = frameLayout;
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f17663a) {
            case 0:
                int mode = View.MeasureSpec.getMode(i10);
                if (mode == 1073741824) {
                    super.onMeasure(i10, i11);
                    return;
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 0), i11);
                int measuredWidth = getMeasuredWidth();
                int i12 = ((a4) this.f17664b).K;
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
        switch (this.f17663a) {
            case 1:
                super.onScrollChanged(i10, i11, i12, i13);
                b3 b3Var = ((p5) this.f17664b).E;
                if (b3Var != null && (textSelectionHelper = b3Var.f17153a.getTextSelectionHelper()) != null && textSelectionHelper.x()) {
                    textSelectionHelper.w();
                }
                invalidate();
                return;
            case 2:
                super.onScrollChanged(i10, i11, i12, i13);
                j70 j70Var = (j70) this.f17664b;
                if (j70Var.d != null) {
                    j70Var.d = null;
                    j70Var.f40451f = null;
                    return;
                }
                return;
            default:
                super.onScrollChanged(i10, i11, i12, i13);
                return;
        }
    }

    public z3(Context context, j70 j70Var) {
        super(context);
        this.f17663a = 2;
        this.f17664b = j70Var;
    }
}
