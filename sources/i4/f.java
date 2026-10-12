package i4;
public final class f implements Comparable {
    public final int f11300a;
    public final b f11301b;

    public f(int i10, b bVar) {
        this.f11300a = i10;
        this.f11301b = bVar;
    }

    @Override
    public final int compareTo(Object obj) {
        return Integer.compare(this.f11300a, ((f) obj).f11300a);
    }
}
