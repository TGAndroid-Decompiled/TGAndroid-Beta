package defpackage;

import android.content.Context;
import android.widget.FrameLayout;
public final class dj extends FrameLayout {
    public final ag2[] a;

    public dj(Context context, ag2[] ag2VarArr) {
        super(context);
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
