package defpackage;
public abstract class ra9 extends of0 implements oq4 {
    public final byte a;

    public ra9(int i, fw2 fw2Var) {
        super(fw2Var);
        if (fw2Var != null && fw2Var.getContext() != z14.a) {
            w26.j("Coroutines with restricted suspension must have EmptyCoroutineContext");
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
    public final sw2 getContext() {
        return z14.a;
    }

    @Override
    public final String toString() {
        if (getCompletion() == null) {
            f59.a.getClass();
            return g59.a(this);
        }
        return super.toString();
    }
}
