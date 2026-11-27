package defpackage;
public abstract class d2 implements kx2 {
    public final lx2 a;

    public d2(lx2 lx2Var) {
        this.a = lx2Var;
    }

    @Override
    public final Object fold(Object obj, is4 is4Var) {
        return is4Var.invoke(obj, this);
    }

    @Override
    public kx2 get(lx2 lx2Var) {
        return azd.a(this, lx2Var);
    }

    @Override
    public final lx2 getKey() {
        return this.a;
    }

    @Override
    public mx2 minusKey(lx2 lx2Var) {
        return azd.b(this, lx2Var);
    }

    @Override
    public final mx2 plus(mx2 mx2Var) {
        return azd.c(this, mx2Var);
    }
}
