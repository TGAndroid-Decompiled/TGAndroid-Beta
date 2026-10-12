package i4;
public final class f implements Comparable {
    public final int f11992a;
    public final b f11993b;

    public f(int i10, b bVar) {
        this.f11992a = i10;
        this.f11993b = bVar;
    }

    @Override
    public final int compareTo(Object obj) {
        return Integer.compare(this.f11992a, ((f) obj).f11992a);
    }
}
