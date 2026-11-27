package defpackage;
public final class no5 extends v2 {
    public final po5 d;

    public no5(po5 po5Var, int i) {
        super(po5Var.size(), i);
        this.d = po5Var;
    }

    @Override
    public final Object a(int i) {
        return this.d.get(i);
    }
}
