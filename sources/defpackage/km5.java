package defpackage;
public final class km5 extends u2 {
    public final mm5 d;

    public km5(mm5 mm5Var, int i) {
        super(mm5Var.size(), i);
        this.d = mm5Var;
    }

    @Override
    public final Object a(int i) {
        return this.d.get(i);
    }
}
