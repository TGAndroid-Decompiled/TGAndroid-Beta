package defpackage;
public final class nr3 implements cy2 {
    public final cy2 a;
    public final Throwable b;

    public nr3(cy2 cy2Var, Throwable th) {
        this.a = cy2Var;
        this.b = th;
    }

    @Override
    public final Object fold(Object obj, fs4 fs4Var) {
        return this.a.fold(obj, fs4Var);
    }

    @Override
    public final ay2 get(by2 by2Var) {
        return this.a.get(by2Var);
    }

    @Override
    public final cy2 minusKey(by2 by2Var) {
        return this.a.minusKey(by2Var);
    }

    @Override
    public final cy2 plus(cy2 cy2Var) {
        return this.a.plus(cy2Var);
    }
}
