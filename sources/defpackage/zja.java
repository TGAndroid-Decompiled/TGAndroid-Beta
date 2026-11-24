package defpackage;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.View;
public final class zja extends u26 {
    public final dmc r;

    public zja(dmc dmcVar, Context context) {
        super(context);
        this.r = dmcVar;
    }

    @Override
    public final void g(View view, n49 n49Var) {
        va vaVar = this.r.a;
        if (vaVar != null) {
            d49 layoutManager = vaVar.getLayoutManager();
            layoutManager.getClass();
            int[] iArr = {0, d49.y(view) - layoutManager.E()};
            int i = iArr[0];
            int i2 = iArr[1];
            int m = m(Math.max(Math.abs(i), Math.abs(i2)));
            if (m > 0) {
                n49Var.b(i, i2, m, this.j);
            }
        }
    }

    @Override
    public final float l(DisplayMetrics displayMetrics) {
        return 100.0f / displayMetrics.densityDpi;
    }
}
