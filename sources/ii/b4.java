package ii;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import org.telegram.ui.Cells.o9;
import org.telegram.ui.w70;
public final class b4 extends HorizontalScrollView {
    public final int f12286a;
    public final Object f12287b;

    public b4(FrameLayout frameLayout, Context context, int i10) {
        super(context);
        this.f12286a = i10;
        this.f12287b = frameLayout;
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f12286a) {
            case 0:
                int mode = View.MeasureSpec.getMode(i10);
                if (mode == 1073741824) {
                    super.onMeasure(i10, i11);
                    return;
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 0), i11);
                int measuredWidth = getMeasuredWidth();
                int i12 = ((c4) this.f12287b).K;
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
        o9 textSelectionHelper;
        switch (this.f12286a) {
            case 1:
                super.onScrollChanged(i10, i11, i12, i13);
                d3 d3Var = ((p5) this.f12287b).E;
                if (d3Var != null && (textSelectionHelper = d3Var.f12343a.getTextSelectionHelper()) != null && textSelectionHelper.x()) {
                    textSelectionHelper.w();
                }
                invalidate();
                return;
            case 2:
                super.onScrollChanged(i10, i11, i12, i13);
                w70 w70Var = (w70) this.f12287b;
                if (w70Var.d != null) {
                    w70Var.d = null;
                    w70Var.f43072f = null;
                    return;
                }
                return;
            default:
                super.onScrollChanged(i10, i11, i12, i13);
                return;
        }
    }

    public b4(Context context, w70 w70Var) {
        super(context);
        this.f12286a = 2;
        this.f12287b = w70Var;
    }
}
