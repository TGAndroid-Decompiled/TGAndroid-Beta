package defpackage;

import android.content.Context;
import android.view.View;
public final class xt0 extends ogc {
    public final zt0[] a = new zt0[3];
    public final Context b;
    public final v59 c;
    public final au0 d;

    public xt0(au0 au0Var, Context context, v59 v59Var) {
        this.d = au0Var;
        this.b = context;
        this.c = v59Var;
    }

    @Override
    public final void b(View view, int i, int i2) {
        this.c.L(view);
    }

    @Override
    public final View d(int i) {
        zt0[] zt0VarArr = this.a;
        if (zt0VarArr[i] == null) {
            zt0VarArr[i] = new zt0(this.d, this.b, i);
        }
        return zt0VarArr[i];
    }

    @Override
    public final int e() {
        return this.a.length;
    }

    @Override
    public final CharSequence g(int i) {
        int i2;
        if (i == 1) {
            i2 = 2131744608;
        } else if (i == 2) {
            i2 = 2131744607;
        } else {
            i2 = 2131744609;
        }
        return jb6.M0(i2, null);
    }

    @Override
    public final int h(int i) {
        return i;
    }
}
