package lh;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
public final class h1 extends ViewGroup {
    @Override
    public final void draw(Canvas canvas) {
        if (i1.V.S) {
            return;
        }
        super.draw(canvas);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        i1 i1Var = i1.V;
        if (i1Var.f15701e.getParent() == this) {
            i1Var.f15701e.layout(0, 0, i1Var.F, i1Var.G);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        i1 i1Var = i1.V;
        if (i1Var.f15701e.getParent() == this) {
            i1Var.f15701e.measure(View.MeasureSpec.makeMeasureSpec(i1Var.F, 1073741824), View.MeasureSpec.makeMeasureSpec(i1Var.G, 1073741824));
        }
    }
}
