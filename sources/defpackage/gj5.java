package defpackage;
public final class gj5 {
    public int a;
    public int b;
    public byte c;
    public boolean d;

    public final String toString() {
        return String.format("%s[version=%s, totalTagSize=%d]", gj5.class.getSimpleName(), Integer.valueOf(this.a), Integer.valueOf(this.b));
    }
}
