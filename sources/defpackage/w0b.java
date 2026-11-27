package defpackage;

import android.content.Context;
public final class w0b extends d79 {
    public int f3;
    public final w1b g3;

    public w0b(w1b w1bVar, Context context) {
        super(context, null);
        this.g3 = w1bVar;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        b1b b1bVar;
        super.onMeasure(i, i2);
        if (this.f3 != getMeasuredHeight() && (b1bVar = this.g3.X) != null) {
            b1bVar.f();
        }
        this.f3 = getMeasuredHeight();
    }
}
