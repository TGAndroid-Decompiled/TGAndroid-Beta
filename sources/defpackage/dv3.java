package defpackage;

import android.content.Context;
import android.view.View;
public final class dv3 extends oec {
    public final boolean a;
    public final Context b;
    public final ew3 c;

    public dv3(ew3 ew3Var, boolean z, Context context) {
        this.c = ew3Var;
        this.a = z;
        this.b = context;
    }

    @Override
    public final void b(View view, int i, int i2) {
        ov3 ov3Var = (ov3) view;
        if (this.a) {
            i = 1;
        }
        ov3Var.a(i);
    }

    @Override
    public final View d(int i) {
        Context context = this.b;
        ew3 ew3Var = this.c;
        if (i == 1) {
            return new nv3(ew3Var, context);
        }
        return new tv3(ew3Var, context);
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
