package ii;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import org.telegram.ui.Cells.q9;
import org.telegram.ui.w70;
public final class a4 extends HorizontalScrollView {
    public final int f11234a;
    public final Object f11235b;

    public a4(FrameLayout frameLayout, Context context, int i10) {
        super(context);
        this.f11234a = i10;
        this.f11235b = frameLayout;
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f11234a) {
            case 0:
                int mode = View.MeasureSpec.getMode(i10);
                if (mode == 1073741824) {
                    super.onMeasure(i10, i11);
                    return;
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 0), i11);
                int measuredWidth = getMeasuredWidth();
                int i12 = ((b4) this.f11235b).K;
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
        switch (this.f11234a) {
            case 1:
                super.onScrollChanged(i10, i11, i12, i13);
                c3 c3Var = ((o5) this.f11235b).E;
                if (c3Var != null && (textSelectionHelper = c3Var.f11286a.getTextSelectionHelper()) != null && textSelectionHelper.y()) {
                    textSelectionHelper.x();
                }
                invalidate();
                return;
            case 2:
                super.onScrollChanged(i10, i11, i12, i13);
                w70 w70Var = (w70) this.f11235b;
                if (w70Var.d != null) {
                    w70Var.d = null;
                    w70Var.f38583f = null;
                    return;
                }
                return;
            default:
                super.onScrollChanged(i10, i11, i12, i13);
                return;
        }
    }

    public a4(Context context, w70 w70Var) {
        super(context);
        this.f11234a = 2;
        this.f11235b = w70Var;
    }
}
