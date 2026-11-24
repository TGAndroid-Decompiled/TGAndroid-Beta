package defpackage;
public final class uj1 extends sj1 {
    public final char a;
    public final char b;

    public uj1(char c, char c2) {
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
        return "CharMatcher.anyOf(\"" + wj1.d(this.a) + wj1.d(this.b) + "\")";
    }
}
