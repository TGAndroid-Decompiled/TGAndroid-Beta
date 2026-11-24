package defpackage;

import android.app.Activity;
import android.widget.FrameLayout;
public final class ph extends FrameLayout {
    public final ag2[] a;

    public ph(Activity activity, ag2[] ag2VarArr) {
        super(activity);
        this.a = ag2VarArr;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        ag2[] ag2VarArr = this.a;
        if (ag2VarArr[0] != null) {
            int measuredWidth = getMeasuredWidth();
            int measuredHeight = getMeasuredHeight();
            setMeasuredDimension(measuredWidth, gl.L(7.0f) + ag2VarArr[0].getMeasuredHeight() + measuredHeight);
        }
    }
}
