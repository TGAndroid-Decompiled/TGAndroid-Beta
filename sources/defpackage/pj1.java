package defpackage;
public final class pj1 extends wj1 {
    public final wj1 a;
    public final wj1 b;

    public pj1(wj1 wj1Var, wj1 wj1Var2) {
        this.a = wj1Var;
        wj1Var2.getClass();
        this.b = wj1Var2;
    }

    @Override
    public final boolean b(char c) {
        if (this.a.b(c) && this.b.b(c)) {
            return true;
        }
        return false;
    }

    public final String toString() {
        return "CharMatcher.and(" + this.a + ", " + this.b + ")";
    }
}
