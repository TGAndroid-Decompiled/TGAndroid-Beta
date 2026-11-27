package defpackage;
public final class np5 extends po5 {
    public final yo5 c;

    public np5(yo5 yo5Var) {
        this.c = yo5Var;
    }

    @Override
    public final Object get(int i) {
        yo5 yo5Var = this.c;
        switch (yo5Var.d) {
            case 0:
                wq7 wq7Var = ((p99) yo5Var.e).e;
                yve.j(i, wq7Var.c);
                return new vq7(wq7Var, i);
            default:
                wq7 wq7Var2 = ((p99) yo5Var.e).e;
                yve.j(i, wq7Var2.c);
                return wq7Var2.a[i];
        }
    }

    @Override
    public final boolean m() {
        return this.c.m();
    }

    @Override
    public final int size() {
        return this.c.size();
    }
}
