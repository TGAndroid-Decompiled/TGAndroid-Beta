package defpackage;

import android.content.Context;
import android.view.View;
public final class g74 extends cja {
    public final byte m0;

    public g74(Context context, ui5 ui5Var, byte b) {
        super(context, ui5Var);
        this.m0 = b;
    }

    @Override
    public final boolean O() {
        switch (this.m0) {
            case 0:
            case 1:
                return false;
            default:
                return super.O();
        }
    }

    @Override
    public final void onMeasure(int i, int i2) {
        switch (this.m0) {
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
