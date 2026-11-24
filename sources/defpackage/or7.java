package defpackage;

import android.view.ViewGroup;
public final class or7 extends n39 {
    public kz6 c;
    public Integer d;
    public sb e;
    public boolean f;
    public int h;

    @Override
    public final boolean D(s49 s49Var) {
        if (s49Var.b() == 0) {
            return false;
        }
        return this.c.D(s49Var);
    }

    @Override
    public final int b() {
        kz6 kz6Var = this.c;
        int K = kz6Var.K();
        kz6Var.N0 = K;
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
    public final void t(s49 s49Var, int i) {
        if (i > 0) {
            this.c.t(s49Var, i - 1);
        }
    }

    @Override
    public final s49 x(ViewGroup viewGroup, int i) {
        if (i == -983904) {
            sb sbVar = new sb((byte) 21, viewGroup.getContext(), this);
            this.e = sbVar;
            return new s49(sbVar);
        }
        return this.c.x(viewGroup, i);
    }
}
