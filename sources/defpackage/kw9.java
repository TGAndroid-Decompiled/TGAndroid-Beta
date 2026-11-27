package defpackage;
public final class kw9 extends qie {
    public final ow9 a;

    public kw9(ow9 ow9Var) {
        this.a = ow9Var;
    }

    @Override
    public final boolean a(int i, int i2) {
        ow9 ow9Var = this.a;
        return ((lw9) ow9Var.n.get(i)).equals(ow9Var.r.get(i2));
    }

    @Override
    public final boolean b(int i, int i2) {
        ow9 ow9Var = this.a;
        if (((lw9) ow9Var.n.get(i)).a.h == ((lw9) ow9Var.r.get(i2)).a.h) {
            return true;
        }
        return false;
    }

    @Override
    public final int c() {
        return this.a.r.size();
    }

    @Override
    public final int d() {
        return this.a.n.size();
    }
}
