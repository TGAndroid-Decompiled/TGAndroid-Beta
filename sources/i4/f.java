package i4;
public final class f implements Comparable {
    public final int f12689a;
    public final b f12690b;

    public f(int i10, b bVar) {
        this.f12689a = i10;
        this.f12690b = bVar;
    }

    @Override
    public final int compareTo(Object obj) {
        return Integer.compare(this.f12689a, ((f) obj).f12689a);
    }
}
