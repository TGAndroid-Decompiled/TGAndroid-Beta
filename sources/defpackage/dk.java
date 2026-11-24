package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
public final class dk extends FrameLayout {
    public final oh2[] a;

    public dk(Context context, oh2[] oh2VarArr) {
        super(context);
        this.a = oh2VarArr;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        oh2[] oh2VarArr = this.a;
        if (oh2VarArr[0] != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            setMeasuredDimension(measuredWidth, gm.L(7.0f) + oh2VarArr[0].getMeasuredHeight() + measuredHeight);
        }
    }
}
