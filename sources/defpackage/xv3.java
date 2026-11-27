package defpackage;

import android.content.Context;
import android.view.View;
public final class xv3 extends nic {
    public final boolean a;
    public final Context b;
    public final zw3 c;

    public xv3(zw3 zw3Var, boolean z, Context context) {
        this.c = zw3Var;
        this.a = z;
        this.b = context;
    }

    @Override
    public final void b(View view, int i, int i2) {
        iw3 iw3Var = (iw3) view;
        if (this.a) {
            i = 1;
        }
        iw3Var.a(i);
    }

    @Override
    public final View d(int i) {
        Context context = this.b;
        zw3 zw3Var = this.c;
        if (i == 1) {
            return new hw3(zw3Var, context);
        }
        return new ow3(zw3Var, context);
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
