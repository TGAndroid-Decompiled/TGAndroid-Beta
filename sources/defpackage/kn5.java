package defpackage;
public final class kn5 extends mm5 {
    public final vm5 c;

    public kn5(vm5 vm5Var) {
        this.c = vm5Var;
    }

    @Override
    public final Object get(int i) {
        vm5 vm5Var = this.c;
        switch (vm5Var.d) {
            case 0:
                wn7 wn7Var = ((c69) vm5Var.e).e;
                gre.j(i, wn7Var.c);
                return new vn7(wn7Var, i);
            default:
                wn7 wn7Var2 = ((c69) vm5Var.e).e;
                gre.j(i, wn7Var2.c);
                return wn7Var2.a[i];
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
