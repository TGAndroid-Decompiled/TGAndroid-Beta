package defpackage;

import android.view.ViewGroup;
public final class uu7 extends c79 {
    public r17 c;
    public Integer d;
    public tb e;
    public boolean f;
    public int h;

    @Override
    public final boolean D(f89 f89Var) {
        if (f89Var.b() == 0) {
            return false;
        }
        return this.c.D(f89Var);
    }

    @Override
    public final int b() {
        r17 r17Var = this.c;
        int K = r17Var.K();
        r17Var.N0 = K;
        return K + 1;
    }

    @Override
    public final int d(int i) {
        if (i == 0) {
            return -983904;
        }
        return this.c.d(i - 1);
    }

    @Override
    public final void t(f89 f89Var, int i) {
        if (i > 0) {
            this.c.t(f89Var, i - 1);
        }
    }

    @Override
    public final f89 x(ViewGroup viewGroup, int i) {
        if (i == -983904) {
            tb tbVar = new tb((byte) 22, viewGroup.getContext(), this);
            this.e = tbVar;
            return new f89(tbVar);
        }
        return this.c.x(viewGroup, i);
    }
}
