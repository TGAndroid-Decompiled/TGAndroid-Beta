package defpackage;
public final class tu9 extends age {
    public final xu9 a;

    public tu9(xu9 xu9Var) {
        this.a = xu9Var;
    }

    @Override
    public final boolean a(int i, int i2) {
        xu9 xu9Var = this.a;
        return ((uu9) xu9Var.n.get(i)).equals(xu9Var.r.get(i2));
    }

    @Override
    public final boolean b(int i, int i2) {
        xu9 xu9Var = this.a;
        if (((uu9) xu9Var.n.get(i)).a.h == ((uu9) xu9Var.r.get(i2)).a.h) {
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
