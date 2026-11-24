package defpackage;
public final class ko5 extends u2 {
    public final mo5 d;

    public ko5(mo5 mo5Var, int i) {
        super(mo5Var.size(), i);
        this.d = mo5Var;
    }

    @Override
    public final Object a(int i) {
        return this.d.get(i);
    }
}
