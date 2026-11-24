package defpackage;

import android.content.Context;
import android.view.View;
public final class ow3 extends ogc {
    public final boolean a;
    public final Context b;
    public final px3 c;

    public ow3(px3 px3Var, boolean z, Context context) {
        this.c = px3Var;
        this.a = z;
        this.b = context;
    }

    @Override
    public final void b(View view, int i, int i2) {
        zw3 zw3Var = (zw3) view;
        if (this.a) {
            i = 1;
        }
        zw3Var.a(i);
    }

    @Override
    public final View d(int i) {
        Context context = this.b;
        px3 px3Var = this.c;
        if (i == 1) {
            return new yw3(px3Var, context);
        }
        return new ex3(px3Var, context);
    }

    @Override
    public final int e() {
        if (this.a) {
            return 1;
        }
        return 3;
    }

    @Override
    public final int h(int i) {
        if (i != 0 && i != 1) {
            return 1;
        }
        return 0;
    }
}
