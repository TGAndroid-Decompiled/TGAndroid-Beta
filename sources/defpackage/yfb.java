package defpackage;
public abstract class yfb extends ax2 implements ss4 {
    private final int arity;

    public yfb(int i, zw2 zw2Var) {
        super(zw2Var);
        this.arity = i;
    }

    @Override
    public int getArity() {
        return this.arity;
    }

    @Override
    public String toString() {
        if (getCompletion() == null) {
            s89.a.getClass();
            return t89.a(this);
        }
        return super.toString();
    }
}
