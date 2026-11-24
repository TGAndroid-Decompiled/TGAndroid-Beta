package defpackage;

import android.app.Activity;
import android.widget.FrameLayout;
public final class ti extends FrameLayout {
    public final oh2[] a;

    public ti(Activity activity, oh2[] oh2VarArr) {
        super(activity);
        this.a = oh2VarArr;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        oh2[] oh2VarArr = this.a;
        if (oh2VarArr[0] != null) {
            setMeasuredDimension(getMeasuredWidth(), oh2VarArr[0].getMeasuredHeight() + getMeasuredHeight());
        }
    }
}
