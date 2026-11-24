package defpackage;
public abstract class c2 implements ay2 {
    public final by2 a;

    public c2(by2 by2Var) {
        this.a = by2Var;
    }

    @Override
    public final Object fold(Object obj, fs4 fs4Var) {
        return fs4Var.invoke(obj, this);
    }

    @Override
    public ay2 get(by2 by2Var) {
        return nwd.a(this, by2Var);
    }

    @Override
    public final by2 getKey() {
        return this.a;
    }

    @Override
    public cy2 minusKey(by2 by2Var) {
        return nwd.b(this, by2Var);
    }

    @Override
    public final cy2 plus(cy2 cy2Var) {
        return nwd.c(this, cy2Var);
    }
}
