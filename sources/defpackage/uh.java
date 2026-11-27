package defpackage;

import android.app.Activity;
import android.widget.FrameLayout;
public final class uh extends FrameLayout {
    public final sg2[] a;

    public uh(Activity activity, sg2[] sg2VarArr) {
        super(activity);
        this.a = sg2VarArr;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        sg2[] sg2VarArr = this.a;
        if (sg2VarArr[0] != null) {
            setMeasuredDimension(getMeasuredWidth(), sg2VarArr[0].getMeasuredHeight() + getMeasuredHeight());
        }
    }
}
