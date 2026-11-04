package ei;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
public final class l1 extends ViewGroup {
    @Override
    public final void draw(Canvas canvas) {
        if (n1.f10647a0.X) {
            return;
        }
        super.draw(canvas);
    }

    @Override
    public final void onLayout(boolean z10, int i3, int i10, int i11, int i12) {
        n1 n1Var = n1.f10647a0;
        if (n1Var.f10651e.getParent() == this) {
            n1Var.f10651e.layout(0, 0, n1Var.K, n1Var.L);
        }
    }

    @Override
    public final void onMeasure(int i3, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i3), View.MeasureSpec.getSize(i10));
        n1 n1Var = n1.f10647a0;
        if (n1Var.f10651e.getParent() == this) {
            n1Var.f10651e.measure(View.MeasureSpec.makeMeasureSpec(n1Var.K, 1073741824), View.MeasureSpec.makeMeasureSpec(n1Var.L, 1073741824));
        }
    }
}
