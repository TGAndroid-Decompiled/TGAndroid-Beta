package defpackage;

import android.content.Context;
import android.view.View;
public final class k14 extends xya {
    public final byte P;

    public k14(Context context, boolean z, wjb wjbVar, byte b) {
        super(wjbVar, context, z);
        this.P = b;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        switch (this.P) {
            case 0:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gl.L(82.0f), 1073741824));
                return;
            case 1:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gl.L(82.0f), 1073741824));
                return;
            case 2:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gl.L(82.0f), 1073741824));
                return;
            default:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gl.L(82.0f), 1073741824));
                return;
        }
    }
}
