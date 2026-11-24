package defpackage;
public final class cl1 extends al1 {
    public final char a;
    public final char b;

    public cl1(char c, char c2) {
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
        return "CharMatcher.anyOf(\"" + el1.d(this.a) + el1.d(this.b) + "\")";
    }
}
