package defpackage;
public abstract class eeb extends qx2 implements ps4 {
    private final int arity;

    public eeb(int i, px2 px2Var) {
        super(px2Var);
        this.arity = i;
    }

    @Override
    public int getArity() {
        return this.arity;
    }

    @Override
    public String toString() {
        if (getCompletion() == null) {
            h79.a.getClass();
            return i79.a(this);
        }
        return super.toString();
    }
}
