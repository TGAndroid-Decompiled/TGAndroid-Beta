package defpackage;

import android.content.Context;
public final class wya extends r59 {
    public int f3;
    public final xza g3;

    public wya(xza xzaVar, Context context) {
        super(context, null);
        this.g3 = xzaVar;
    }

    @Override
    public final void onMeasure(int i, int i2) {
        bza bzaVar;
        super.onMeasure(i, i2);
        if (this.f3 != getMeasuredHeight() && (bzaVar = this.g3.X) != null) {
            bzaVar.f();
        }
        this.f3 = getMeasuredHeight();
    }
}
