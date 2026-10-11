package i4;
public final class f implements Comparable {
    public final int f11993a;
    public final b f11994b;

    public f(int i10, b bVar) {
        this.f11993a = i10;
        this.f11994b = bVar;
    }

    @Override
    public final int compareTo(Object obj) {
        return Integer.compare(this.f11993a, ((f) obj).f11993a);
    }
}
