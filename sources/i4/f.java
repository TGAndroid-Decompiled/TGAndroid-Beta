package i4;
public final class f implements Comparable {
    public final int f11865a;
    public final b f11866b;

    public f(int i10, b bVar) {
        this.f11865a = i10;
        this.f11866b = bVar;
    }

    @Override
    public final int compareTo(Object obj) {
        return Integer.compare(this.f11865a, ((f) obj).f11865a);
    }
}
