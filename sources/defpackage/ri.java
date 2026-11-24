package defpackage;

import android.app.Activity;
import android.widget.FrameLayout;
public final class ri extends FrameLayout {
    public final byte a;
    public final oh2[] b;

    public ri(Activity activity, oh2[] oh2VarArr, byte b) {
        super(activity);
        this.a = b;
        this.b = oh2VarArr;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        byte b = this.a;
        oh2[] oh2VarArr = this.b;
        switch (b) {
            case 0:
                super.onMeasure(i, i2);
                if (oh2VarArr[0] != null) {
                    setMeasuredDimension(getMeasuredWidth(), gm.L(7.0f) + oh2VarArr[0].getMeasuredHeight() + getMeasuredHeight());
                    return;
                }
                return;
            default:
                super.onMeasure(i, i2);
                if (oh2VarArr[0] != null) {
                    setMeasuredDimension(getMeasuredWidth(), gm.L(7.0f) + oh2VarArr[0].getMeasuredHeight() + getMeasuredHeight());
                    return;
                }
                return;
        }
    }
}
