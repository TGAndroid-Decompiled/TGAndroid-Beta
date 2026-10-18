package ci;

import android.graphics.Canvas;
import android.view.View;
import android.view.ViewGroup;
public final class m1 extends ViewGroup {
    @Override
    public final void draw(Canvas canvas) {
        if (o1.Z.W) {
            return;
        }
        super.draw(canvas);
    }

    @Override
    public final void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        o1 o1Var = o1.Z;
        if (o1Var.e.getParent() == this) {
            o1Var.e.layout(0, 0, o1Var.J, o1Var.K);
        }
    }

    @Override
    public final void onMeasure(int i10, int i11) {
        setMeasuredDimension(View.MeasureSpec.getSize(i10), View.MeasureSpec.getSize(i11));
        o1 o1Var = o1.Z;
        if (o1Var.e.getParent() == this) {
            o1Var.e.measure(View.MeasureSpec.makeMeasureSpec(o1Var.J, 1073741824), View.MeasureSpec.makeMeasureSpec(o1Var.K, 1073741824));
        }
    }
}
