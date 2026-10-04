package i4;
public final class f implements Comparable {
    public final int f11944a;
    public final b f11945b;

    public f(int i10, b bVar) {
        this.f11944a = i10;
        this.f11945b = bVar;
    }

    @Override
    public final int compareTo(Object obj) {
        return Integer.compare(this.f11944a, ((f) obj).f11944a);
    }
}
