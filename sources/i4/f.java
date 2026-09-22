package i4;
public final class f implements Comparable {
    public final int f10976a;
    public final b f10977b;

    public f(int i10, b bVar) {
        this.f10976a = i10;
        this.f10977b = bVar;
    }

    @Override
    public final int compareTo(Object obj) {
        return Integer.compare(this.f10976a, ((f) obj).f10976a);
    }
}
