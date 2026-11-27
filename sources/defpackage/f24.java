package defpackage;

import android.content.Context;
import android.view.View;
public final class f24 extends x2b {
    public final byte P;

    public f24(Context context, boolean z, vnb vnbVar, byte b) {
        super(vnbVar, context, z);
        this.P = b;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        switch (this.P) {
            case 0:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(hl.L(82.0f), 1073741824));
                return;
            case 1:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(hl.L(82.0f), 1073741824));
                return;
            case 2:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(hl.L(82.0f), 1073741824));
                return;
            default:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(hl.L(82.0f), 1073741824));
                return;
        }
    }
}
