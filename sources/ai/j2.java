package ai;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
public final class j2 extends ViewGroup {
    @Override
    public final void draw(Canvas canvas) {
        if (m2.Z.W) {
            return;
        }
        super.draw(canvas);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        m2 m2Var = m2.Z;
        if (m2Var.e.getParent() == this) {
            m2Var.e.layout(0, 0, m2Var.J, m2Var.K);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        m2 m2Var = m2.Z;
        if (m2Var.e.getParent() == this) {
            m2Var.e.measure(View.MeasureSpec.makeMeasureSpec(m2Var.J, 1073741824), View.MeasureSpec.makeMeasureSpec(m2Var.K, 1073741824));
        }
    }
}
