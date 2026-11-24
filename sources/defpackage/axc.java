package defpackage;
public final class axc implements Comparable {
    public final int a;
    public final wwc b;

    public axc(int i, wwc wwcVar) {
        this.a = i;
        this.b = wwcVar;
    }

    @Override
    public final int compareTo(Object obj) {
        return Integer.compare(this.a, ((axc) obj).a);
    }
}
