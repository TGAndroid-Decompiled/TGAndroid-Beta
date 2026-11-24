package defpackage;

import android.content.Context;
import android.view.View;
public final class a0a extends View {
    public final byte a;
    public final c0a b;

    public a0a(c0a c0aVar, Context context, byte b) {
        super(context);
        this.a = b;
        this.b = c0aVar;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        byte b = this.a;
        c0a c0aVar = this.b;
        switch (b) {
            case 0:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gl.L(c0aVar.d.e), 1073741824));
                return;
            default:
                g0a g0aVar = c0aVar.d;
                int i3 = g0aVar.y.J;
                if (i3 >= g0aVar.r.getPaddingTop() && !g0aVar.S) {
                    i3 = 0;
                }
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
                return;
        }
    }
}
