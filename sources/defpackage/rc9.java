package defpackage;
public abstract class rc9 extends og0 implements ps4 {
    public final byte a;

    public rc9(int i, px2 px2Var) {
        super(px2Var);
        if (px2Var != null && px2Var.getContext() != k34.a) {
            u36.j("Coroutines with restricted suspension must have EmptyCoroutineContext");
            throw null;
        } else {
            this.a = i;
        }
    }

    @Override
    public final int getArity() {
        return this.a;
    }

    @Override
    public final cy2 getContext() {
        return k34.a;
    }

    @Override
    public final String toString() {
        if (getCompletion() == null) {
            h79.a.getClass();
            return i79.a(this);
        }
        return super.toString();
    }
}
