package defpackage;

import android.view.ViewGroup;
public final class pt7 extends q59 {
    public k17 c;
    public Integer d;
    public sb e;
    public boolean f;
    public int h;

    @Override
    public final boolean D(u69 u69Var) {
        if (u69Var.b() == 0) {
            return false;
        }
        return this.c.D(u69Var);
    }

    @Override
    public final int b() {
        k17 k17Var = this.c;
        int K = k17Var.K();
        k17Var.N0 = K;
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
    public final void t(u69 u69Var, int i) {
        if (i > 0) {
            this.c.t(u69Var, i - 1);
        }
    }

    @Override
    public final u69 x(ViewGroup viewGroup, int i) {
        if (i == -983904) {
            sb sbVar = new sb((byte) 22, viewGroup.getContext(), this);
            this.e = sbVar;
            return new u69(sbVar);
        }
        return this.c.x(viewGroup, i);
    }
}
