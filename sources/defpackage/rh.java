package defpackage;

import android.app.Activity;
import android.widget.FrameLayout;
public final class rh extends FrameLayout {
    public final byte a;
    public final ag2[] b;

    public rh(Activity activity, ag2[] ag2VarArr, byte b) {
        super(activity);
        this.a = b;
        this.b = ag2VarArr;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        byte b = this.a;
        ag2[] ag2VarArr = this.b;
        switch (b) {
            case 0:
                super.onMeasure(i, i2);
                if (ag2VarArr[0] != null) {
                    setMeasuredDimension(getMeasuredWidth(), gl.L(7.0f) + ag2VarArr[0].getMeasuredHeight() + getMeasuredHeight());
                    return;
                }
                return;
            default:
                super.onMeasure(i, i2);
                if (ag2VarArr[0] != null) {
                    setMeasuredDimension(getMeasuredWidth(), gl.L(7.0f) + ag2VarArr[0].getMeasuredHeight() + getMeasuredHeight());
                    return;
                }
                return;
        }
    }
}
