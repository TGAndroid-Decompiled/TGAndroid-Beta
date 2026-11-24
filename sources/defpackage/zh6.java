package defpackage;
public final class zh6 implements w17 {
    public w17[] a;

    @Override
    public final iz8 a(Class cls) {
        w17[] w17VarArr;
        for (w17 w17Var : this.a) {
            if (w17Var.b(cls)) {
                return w17Var.a(cls);
            }
        }
        fyb.i("No factory is available for message type: ".concat(cls.getName()));
        return null;
    }

    @Override
    public final boolean b(Class cls) {
        for (w17 w17Var : this.a) {
            if (w17Var.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
