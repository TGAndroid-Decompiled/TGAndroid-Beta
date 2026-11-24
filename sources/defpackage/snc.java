package defpackage;

import android.content.Context;
import android.view.View;
public final class snc extends View {
    public final byte a;
    public final goc b;

    public snc(goc gocVar, Context context, byte b) {
        super(context);
        this.a = b;
        this.b = gocVar;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        byte b = this.a;
        goc gocVar = this.b;
        switch (b) {
            case 0:
                int size = View.MeasureSpec.getSize(i);
                gocVar.a0.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, size - gm.L(24.0f)), 1073741824), 0);
                setMeasuredDimension(size, gm.L(36.0f) + gocVar.a0.getMeasuredHeight());
                return;
            default:
                gocVar.e.measure(i, 0);
                setMeasuredDimension(View.MeasureSpec.getSize(i), gocVar.e.getMeasuredHeight());
                return;
        }
    }
}
