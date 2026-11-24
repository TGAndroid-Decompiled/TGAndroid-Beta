package defpackage;
public final class xk1 extends el1 {
    public final el1 a;
    public final el1 b;

    public xk1(el1 el1Var, el1 el1Var2) {
        this.a = el1Var;
        el1Var2.getClass();
        this.b = el1Var2;
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
