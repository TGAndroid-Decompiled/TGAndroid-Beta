package defpackage;
public final class kp5 extends mo5 {
    public final vo5 c;

    public kp5(vo5 vo5Var) {
        this.c = vo5Var;
    }

    @Override
    public final Object get(int i) {
        vo5 vo5Var = this.c;
        switch (vo5Var.d) {
            case 0:
                zp7 zp7Var = ((e89) vo5Var.e).e;
                jte.j(i, zp7Var.c);
                return new yp7(zp7Var, i);
            default:
                zp7 zp7Var2 = ((e89) vo5Var.e).e;
                jte.j(i, zp7Var2.c);
                return zp7Var2.a[i];
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
