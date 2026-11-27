package defpackage;
public final class dk1 extends bk1 {
    public final char a;
    public final char b;

    public dk1(char c, char c2) {
        this.a = c;
        this.b = c2;
    }

    @Override
    public final boolean b(char c) {
        if (c != this.a && c != this.b) {
            return false;
        }
        return true;
    }

    public final String toString() {
        return "CharMatcher.anyOf(\"" + fk1.d(this.a) + fk1.d(this.b) + "\")";
    }
}
