package i4;
public final class f implements Comparable {
    public final int f12721a;
    public final b f12722b;

    public f(int i10, b bVar) {
        this.f12721a = i10;
        this.f12722b = bVar;
    }

    @Override
    public final int compareTo(Object obj) {
        return Integer.compare(this.f12721a, ((f) obj).f12721a);
    }
}
