package l4;
public final class f implements Comparable {
    public final int f19683a;
    public final b f19684b;

    public f(int i7, b bVar) {
        this.f19683a = i7;
        this.f19684b = bVar;
    }

    @Override
    public final int compareTo(Object obj) {
        return Integer.compare(this.f19683a, ((f) obj).f19683a);
    }
}
