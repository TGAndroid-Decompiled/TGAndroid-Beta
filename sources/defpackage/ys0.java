package defpackage;

import android.content.Context;
import android.view.View;
public final class ys0 extends nic {
    public final zs0[] a = new zs0[3];
    public final Context b;
    public final h79 c;
    public final at0 d;

    public ys0(at0 at0Var, Context context, h79 h79Var) {
        this.d = at0Var;
        this.b = context;
        this.c = h79Var;
    }

    @Override
    public final void b(View view, int i, int i2) {
        this.c.M(view);
    }

    @Override
    public final View d(int i) {
        zs0[] zs0VarArr = this.a;
        if (zs0VarArr[i] == null) {
            zs0VarArr[i] = new zs0(this.d, this.b, i);
        }
        return zs0VarArr[i];
    }

    @Override
    public final int e() {
        return this.a.length;
    }

    @Override
    public final CharSequence g(int i) {
        int i2;
        if (i == 1) {
            i2 = 2131744576;
        } else if (i == 2) {
            i2 = 2131744575;
        } else {
            i2 = 2131744577;
        }
        return ob6.M0(i2, null);
    }

    @Override
    public final int h(int i) {
        return i;
    }
}
