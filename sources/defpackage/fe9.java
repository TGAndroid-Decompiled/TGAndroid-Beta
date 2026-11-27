package defpackage;
public abstract class fe9 extends qf0 implements ss4 {
    public final byte a;

    public fe9(int i, zw2 zw2Var) {
        super(zw2Var);
        if (zw2Var != null && zw2Var.getContext() != u24.a) {
            lq5.j("Coroutines with restricted suspension must have EmptyCoroutineContext");
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
    public final mx2 getContext() {
        return u24.a;
    }

    @Override
    public final String toString() {
        if (getCompletion() == null) {
            s89.a.getClass();
            return t89.a(this);
        }
        return super.toString();
    }
}
