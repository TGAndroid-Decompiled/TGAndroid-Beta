package oh;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
public final class i1 extends ViewGroup {
    @Override
    public final void draw(Canvas canvas) {
        if (j1.W.T) {
            return;
        }
        super.draw(canvas);
    }

    @Override
    public final void onLayout(boolean z4, int i10, int i11, int i12, int i13) {
        j1 j1Var = j1.W;
        if (j1Var.f17316e.getParent() == this) {
            j1Var.f17316e.layout(0, 0, j1Var.G, j1Var.H);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        j1 j1Var = j1.W;
        if (j1Var.f17316e.getParent() == this) {
            j1Var.f17316e.measure(View.MeasureSpec.makeMeasureSpec(j1Var.G, 1073741824), View.MeasureSpec.makeMeasureSpec(j1Var.H, 1073741824));
        }
    }
}
