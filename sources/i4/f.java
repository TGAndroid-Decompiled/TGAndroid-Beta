package i4;
public final class f implements Comparable {
    public final int f11943a;
    public final b f11944b;

    public f(int i10, b bVar) {
        this.f11943a = i10;
        this.f11944b = bVar;
    }

    @Override
    public final int compareTo(Object obj) {
        return Integer.compare(this.f11943a, ((f) obj).f11943a);
    }
}
