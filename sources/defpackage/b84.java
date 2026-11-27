package defpackage;

import android.content.Context;
import android.view.View;
public final class b84 extends wma {
    public final byte g0;

    public b84(Context context, wk5 wk5Var, byte b) {
        super(context, wk5Var);
        this.g0 = b;
    }

    @Override
    public final boolean O() {
        switch (this.g0) {
            case 0:
            case 1:
                return false;
            default:
                return super.O();
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        switch (this.g0) {
            case 2:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824));
                return;
            case 3:
                super.onMeasure(View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i), 1073741824), View.MeasureSpec.makeMeasureSpec(View.MeasureSpec.getSize(i2), 1073741824));
                return;
            default:
                super.onMeasure(i, i2);
                return;
        }
    }
}
