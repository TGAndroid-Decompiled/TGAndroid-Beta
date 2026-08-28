package ih;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
public final class j1 extends ViewGroup {
    @Override
    public final void draw(Canvas canvas) {
        if (k1.V.S) {
            return;
        }
        super.draw(canvas);
    }

    @Override
    public final void onLayout(boolean z10, int i9, int i10, int i11, int i12) {
        k1 k1Var = k1.V;
        if (k1Var.f11659e.getParent() == this) {
            k1Var.f11659e.layout(0, 0, k1Var.F, k1Var.G);
        }
    }

    @Override
    public final void onMeasure(int i9, int i10) {
        setMeasuredDimension(View.MeasureSpec.getSize(i9), View.MeasureSpec.getSize(i10));
        k1 k1Var = k1.V;
        if (k1Var.f11659e.getParent() == this) {
            k1Var.f11659e.measure(View.MeasureSpec.makeMeasureSpec(k1Var.F, 1073741824), View.MeasureSpec.makeMeasureSpec(k1Var.G, 1073741824));
        }
    }
}
