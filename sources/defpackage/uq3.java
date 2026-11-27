package defpackage;
public final class uq3 implements mx2 {
    public final mx2 a;
    public final Throwable b;

    public uq3(mx2 mx2Var, Throwable th) {
        this.a = mx2Var;
        this.b = th;
    }

    @Override
    public final Object fold(Object obj, is4 is4Var) {
        return this.a.fold(obj, is4Var);
    }

    @Override
    public final kx2 get(lx2 lx2Var) {
        return this.a.get(lx2Var);
    }

    @Override
    public final mx2 minusKey(lx2 lx2Var) {
        return this.a.minusKey(lx2Var);
    }

    @Override
    public final mx2 plus(mx2 mx2Var) {
        return this.a.plus(mx2Var);
    }
}
