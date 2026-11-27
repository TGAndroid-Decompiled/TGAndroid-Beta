package defpackage;
public final class pzc implements Comparable {
    public final int a;
    public final lzc b;

    public pzc(int i, lzc lzcVar) {
        this.a = i;
        this.b = lzcVar;
    }

    @Override
    public final int compareTo(Object obj) {
        return Integer.compare(this.a, ((pzc) obj).a);
    }
}
