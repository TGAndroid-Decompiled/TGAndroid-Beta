package defpackage;
public final class dk6 implements d47 {
    public d47[] a;

    @Override
    public final v29 a(Class cls) {
        d47[] d47VarArr;
        for (d47 d47Var : this.a) {
            if (d47Var.b(cls)) {
                return d47Var.a(cls);
            }
        }
        qyc.c("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override
    public final boolean b(Class cls) {
        for (d47 d47Var : this.a) {
            if (d47Var.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
