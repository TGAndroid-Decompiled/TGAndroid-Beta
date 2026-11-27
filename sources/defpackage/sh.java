package defpackage;

import android.app.Activity;
import android.widget.FrameLayout;
public final class sh extends FrameLayout {
    public final byte a;
    public final sg2[] b;

    public sh(Activity activity, sg2[] sg2VarArr, byte b) {
        super(activity);
        this.a = b;
        this.b = sg2VarArr;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        byte b = this.a;
        sg2[] sg2VarArr = this.b;
        switch (b) {
            case 0:
                super.onMeasure(i, i2);
                if (sg2VarArr[0] != null) {
                    setMeasuredDimension(getMeasuredWidth(), hl.L(7.0f) + sg2VarArr[0].getMeasuredHeight() + getMeasuredHeight());
                    return;
                }
                return;
            default:
                super.onMeasure(i, i2);
                if (sg2VarArr[0] != null) {
                    setMeasuredDimension(getMeasuredWidth(), hl.L(7.0f) + sg2VarArr[0].getMeasuredHeight() + getMeasuredHeight());
                    return;
                }
                return;
        }
    }
}
