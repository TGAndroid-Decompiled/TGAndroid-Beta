package i4;
public final class f implements Comparable {
    public final int f12691a;
    public final b f12692b;

    public f(int i10, b bVar) {
        this.f12691a = i10;
        this.f12692b = bVar;
    }

    @Override
    public final int compareTo(Object obj) {
        return Integer.compare(this.f12691a, ((f) obj).f12691a);
    }
}
