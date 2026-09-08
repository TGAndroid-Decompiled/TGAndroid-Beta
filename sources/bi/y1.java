package bi;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
public final class y1 extends ViewGroup {
    @Override
    public final void draw(Canvas canvas) {
        if (a2.Z.W) {
            return;
        }
        super.draw(canvas);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        a2 a2Var = a2.Z;
        if (a2Var.f2767e.getParent() == this) {
            a2Var.f2767e.layout(0, 0, a2Var.J, a2Var.K);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        a2 a2Var = a2.Z;
        if (a2Var.f2767e.getParent() == this) {
            a2Var.f2767e.measure(View.MeasureSpec.makeMeasureSpec(a2Var.J, 1073741824), View.MeasureSpec.makeMeasureSpec(a2Var.K, 1073741824));
        }
    }
}
