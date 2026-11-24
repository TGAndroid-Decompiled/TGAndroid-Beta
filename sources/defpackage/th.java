package defpackage;

import android.app.Activity;
import android.widget.FrameLayout;
public final class th extends FrameLayout {
    public final ag2[] a;

    public th(Activity activity, ag2[] ag2VarArr) {
        super(activity);
        this.a = ag2VarArr;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        ag2[] ag2VarArr = this.a;
        if (ag2VarArr[0] != null) {
            setMeasuredDimension(getMeasuredWidth(), ag2VarArr[0].getMeasuredHeight() + getMeasuredHeight());
        }
    }
}
