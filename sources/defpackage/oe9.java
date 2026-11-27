package defpackage;
public final class oe9 extends iv5 {
    public final va1 e;

    public oe9(va1 va1Var) {
        this.e = va1Var;
    }

    @Override
    public final boolean k() {
        return false;
    }

    @Override
    public final void l(Throwable th) {
        this.e.resumeWith(g9c.a);
    }
}
