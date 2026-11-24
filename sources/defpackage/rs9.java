package defpackage;
public final class rs9 extends zde {
    public final vs9 a;

    public rs9(vs9 vs9Var) {
        this.a = vs9Var;
    }

    @Override
    public final boolean a(int i, int i2) {
        vs9 vs9Var = this.a;
        return ((ss9) vs9Var.n.get(i)).equals(vs9Var.r.get(i2));
    }

    @Override
    public final boolean b(int i, int i2) {
        vs9 vs9Var = this.a;
        if (((ss9) vs9Var.n.get(i)).a.h == ((ss9) vs9Var.r.get(i2)).a.h) {
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
