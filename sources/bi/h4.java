package bi;

import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.HorizontalScrollView;
import org.telegram.ui.Cells.k9;
public final class h4 extends HorizontalScrollView {
    public final int f3057a;
    public final FrameLayout f3058b;

    public h4(FrameLayout frameLayout, Context context, int i10) {
        super(context);
        this.f3057a = i10;
        this.f3058b = frameLayout;
    }

    @Override
    public void onMeasure(int i10, int i11) {
        switch (this.f3057a) {
            case 0:
                int mode = View.MeasureSpec.getMode(i10);
                if (mode == 1073741824) {
                    super.onMeasure(i10, i11);
                    return;
                }
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i10), 0), i11);
                int measuredWidth = getMeasuredWidth();
                int i12 = ((i4) this.f3058b).K;
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
        k9 textSelectionHelper;
        switch (this.f3057a) {
            case 1:
                super.onScrollChanged(i10, i11, i12, i13);
                k3 k3Var = ((z5) this.f3058b).E;
                if (k3Var != null && (textSelectionHelper = k3Var.f3169a.getTextSelectionHelper()) != null && textSelectionHelper.x()) {
                    textSelectionHelper.w();
                }
                invalidate();
                return;
            default:
                super.onScrollChanged(i10, i11, i12, i13);
                return;
        }
    }
}
