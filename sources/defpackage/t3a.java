package defpackage;

import android.content.Context;
import android.view.View;
public final class t3a extends View {
    public final byte a;
    public final v3a b;

    public t3a(v3a v3aVar, Context context, byte b) {
        super(context);
        this.a = b;
        this.b = v3aVar;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        byte b = this.a;
        v3a v3aVar = this.b;
        switch (b) {
            case 0:
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(hl.L(v3aVar.d.e), 1073741824));
                return;
            default:
                z3a z3aVar = v3aVar.d;
                int i3 = z3aVar.y.J;
                if (i3 >= z3aVar.r.getPaddingTop() && !z3aVar.S) {
                    i3 = 0;
                }
                super.onMeasure(i, View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
                return;
        }
    }
}
