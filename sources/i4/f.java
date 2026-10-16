package i4;
public final class f implements Comparable {
    public final int f11304a;
    public final b f11305b;

    public f(int i10, b bVar) {
        this.f11304a = i10;
        this.f11305b = bVar;
    }

    @Override
    public final int compareTo(Object obj) {
        return Integer.compare(this.f11304a, ((f) obj).f11304a);
    }
}
