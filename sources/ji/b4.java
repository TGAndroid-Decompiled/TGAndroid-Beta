package ji;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import org.telegram.ui.Cells.o9;
import org.telegram.ui.z70;
public final class b4 extends HorizontalScrollView {
    public final int f13156a;
    public final Object f13157b;

    public b4(FrameLayout frameLayout, Context context, int i10) {
        super(context);
        this.f13156a = i10;
        this.f13157b = frameLayout;
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f13156a) {
            case 0:
                int mode = View.MeasureSpec.getMode(i10);
                if (mode == 1073741824) {
                    super.onMeasure(i10, i11);
                    return;
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 0), i11);
                int measuredWidth = getMeasuredWidth();
                int i12 = ((c4) this.f13157b).K;
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
        switch (this.f13156a) {
            case 1:
                super.onScrollChanged(i10, i11, i12, i13);
                d3 d3Var = ((u5) this.f13157b).E;
                if (d3Var != null && (textSelectionHelper = d3Var.f13235a.getTextSelectionHelper()) != null && textSelectionHelper.x()) {
                    textSelectionHelper.w();
                }
                invalidate();
                return;
            case 2:
                super.onScrollChanged(i10, i11, i12, i13);
                z70 z70Var = (z70) this.f13157b;
                if (z70Var.d != null) {
                    z70Var.d = null;
                    z70Var.f42177f = null;
                    return;
                }
                return;
            default:
                super.onScrollChanged(i10, i11, i12, i13);
                return;
        }
    }

    public b4(Context context, z70 z70Var) {
        super(context);
        this.f13156a = 2;
        this.f13157b = z70Var;
    }
}
