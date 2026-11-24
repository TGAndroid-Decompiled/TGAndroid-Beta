package defpackage;

import android.content.Context;
import android.view.View;
public final class qs0 extends oec {
    public final rs0[] a = new rs0[3];
    public final Context b;
    public final s39 c;
    public final ss0 d;

    public qs0(ss0 ss0Var, Context context, s39 s39Var) {
        this.d = ss0Var;
        this.b = context;
        this.c = s39Var;
    }

    @Override
    public final void b(View view, int i, int i2) {
        this.c.L(view);
    }

    @Override
    public final View d(int i) {
        rs0[] rs0VarArr = this.a;
        if (rs0VarArr[i] == null) {
            rs0VarArr[i] = new rs0(this.d, this.b, i);
        }
        return rs0VarArr[i];
    }

    @Override
    public final int e() {
        return this.a.length;
    }

    @Override
    public final CharSequence g(int i) {
        int i2;
        if (i == 1) {
            i2 = 2131744682;
        } else if (i == 2) {
            i2 = 2131744681;
        } else {
            i2 = 2131744683;
        }
        return k96.M0(i2, null);
    }

    @Override
    public final int h(int i) {
        return i;
    }
}
