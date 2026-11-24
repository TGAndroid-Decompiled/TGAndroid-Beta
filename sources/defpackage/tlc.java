package defpackage;

import android.content.Context;
import android.view.View;
public final class tlc extends View {
    public final byte a;
    public final hmc b;

    public tlc(hmc hmcVar, Context context, byte b) {
        super(context);
        this.a = b;
        this.b = hmcVar;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        byte b = this.a;
        hmc hmcVar = this.b;
        switch (b) {
            case 0:
                int size = View.MeasureSpec.getSize(i);
                hmcVar.a0.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, size - gl.L(24.0f)), 1073741824), 0);
                setMeasuredDimension(size, gl.L(36.0f) + hmcVar.a0.getMeasuredHeight());
                return;
            default:
                hmcVar.e.measure(i, 0);
                setMeasuredDimension(View.MeasureSpec.getSize(i), hmcVar.e.getMeasuredHeight());
                return;
        }
    }
}
