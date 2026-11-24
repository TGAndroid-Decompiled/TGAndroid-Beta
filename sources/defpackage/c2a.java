package defpackage;

import android.content.Context;
import android.view.View;
public final class c2a extends View {
    public final byte a;
    public final e2a b;

    public c2a(e2a e2aVar, Context context, byte b) {
        super(context);
        this.a = b;
        this.b = e2aVar;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        byte b = this.a;
        e2a e2aVar = this.b;
        switch (b) {
            case 0:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(gm.L(e2aVar.d.e), 1073741824));
                return;
            default:
                i2a i2aVar = e2aVar.d;
                int i3 = i2aVar.y.J;
                if (i3 >= i2aVar.r.getPaddingTop() && !i2aVar.S) {
                    i3 = 0;
                }
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
                return;
        }
    }
}
