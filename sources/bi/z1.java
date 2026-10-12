package bi;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
public final class z1 extends ViewGroup {
    @Override
    public final void draw(Canvas canvas) {
        if (b2.Z.W) {
            return;
        }
        super.draw(canvas);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        b2 b2Var = b2.Z;
        if (b2Var.e.getParent() == this) {
            b2Var.e.layout(0, 0, b2Var.J, b2Var.K);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        b2 b2Var = b2.Z;
        if (b2Var.e.getParent() == this) {
            b2Var.e.measure(View.MeasureSpec.makeMeasureSpec(b2Var.J, 1073741824), View.MeasureSpec.makeMeasureSpec(b2Var.K, 1073741824));
        }
    }
}
