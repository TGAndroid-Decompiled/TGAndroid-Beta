package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
public final class ej extends FrameLayout {
    public final sg2[] a;

    public ej(Context context, sg2[] sg2VarArr) {
        super(context);
        this.a = sg2VarArr;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        sg2[] sg2VarArr = this.a;
        if (sg2VarArr[0] != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            setMeasuredDimension(measuredWidth, hl.L(7.0f) + sg2VarArr[0].getMeasuredHeight() + measuredHeight);
        }
    }
}
