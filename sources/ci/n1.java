package ci;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
public final class n1 extends ViewGroup {
    @Override
    public final void draw(Canvas canvas) {
        if (p1.Z.W) {
            return;
        }
        super.draw(canvas);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        p1 p1Var = p1.Z;
        if (p1Var.e.getParent() == this) {
            p1Var.e.layout(0, 0, p1Var.J, p1Var.K);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        p1 p1Var = p1.Z;
        if (p1Var.e.getParent() == this) {
            p1Var.e.measure(View.MeasureSpec.makeMeasureSpec(p1Var.J, 1073741824), View.MeasureSpec.makeMeasureSpec(p1Var.K, 1073741824));
        }
    }
}
