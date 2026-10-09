package i4;
public final class f implements Comparable {
    public final int f11994a;
    public final b f11995b;

    public f(int i10, b bVar) {
        this.f11994a = i10;
        this.f11995b = bVar;
    }

    @Override
    public final int compareTo(Object obj) {
        return Integer.compare(this.f11994a, ((f) obj).f11994a);
    }
}
