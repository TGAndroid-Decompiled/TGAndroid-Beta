package defpackage;

import android.app.Activity;
import android.widget.FrameLayout;
public final class pi extends FrameLayout {
    public final oh2[] a;

    public pi(Activity activity, oh2[] oh2VarArr) {
        super(activity);
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
