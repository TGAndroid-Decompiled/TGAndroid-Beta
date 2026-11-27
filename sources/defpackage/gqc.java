package defpackage;

import android.content.Context;
import android.view.View;
public final class gqc extends View {
    public final byte a;
    public final uqc b;

    public gqc(uqc uqcVar, Context context, byte b) {
        super(context);
        this.a = b;
        this.b = uqcVar;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        byte b = this.a;
        uqc uqcVar = this.b;
        switch (b) {
            case 0:
                int size = View.MeasureSpec.getSize(i);
                uqcVar.a0.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, size - hl.L(24.0f)), 1073741824), 0);
                setMeasuredDimension(size, hl.L(36.0f) + uqcVar.a0.getMeasuredHeight());
                return;
            default:
                uqcVar.e.measure(i, 0);
                setMeasuredDimension(View.MeasureSpec.getSize(i), uqcVar.e.getMeasuredHeight());
                return;
        }
    }
}
