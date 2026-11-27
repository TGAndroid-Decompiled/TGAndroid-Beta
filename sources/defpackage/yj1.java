package defpackage;
public final class yj1 extends fk1 {
    public final fk1 a;
    public final fk1 b;

    public yj1(fk1 fk1Var, fk1 fk1Var2) {
        this.a = fk1Var;
        fk1Var2.getClass();
        this.b = fk1Var2;
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
