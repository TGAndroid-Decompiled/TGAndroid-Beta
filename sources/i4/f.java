package i4;
public final class f implements Comparable {
    public final int f10964a;
    public final b f10965b;

    public f(int i10, b bVar) {
        this.f10964a = i10;
        this.f10965b = bVar;
    }

    @Override
    public final int compareTo(Object obj) {
        return Integer.compare(this.f10964a, ((f) obj).f10964a);
    }
}
