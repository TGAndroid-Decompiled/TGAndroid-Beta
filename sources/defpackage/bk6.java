package defpackage;
public final class bk6 implements w37 {
    public w37[] a;

    @Override
    public final j19 a(Class cls) {
        w37[] w37VarArr;
        for (w37 w37Var : this.a) {
            if (w37Var.b(cls)) {
                return w37Var.a(cls);
            }
        }
        rjb.j("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override
    public final boolean b(Class cls) {
        for (w37 w37Var : this.a) {
            if (w37Var.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
