package ai;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
public final class k2 extends ViewGroup {
    @Override
    public final void draw(Canvas canvas) {
        if (n2.Z.W) {
            return;
        }
        super.draw(canvas);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        n2 n2Var = n2.Z;
        if (n2Var.f1449e.getParent() == this) {
            n2Var.f1449e.layout(0, 0, n2Var.J, n2Var.K);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        n2 n2Var = n2.Z;
        if (n2Var.f1449e.getParent() == this) {
            n2Var.f1449e.measure(View.MeasureSpec.makeMeasureSpec(n2Var.J, 1073741824), View.MeasureSpec.makeMeasureSpec(n2Var.K, 1073741824));
        }
    }
}
