package l4;
public final class f implements Comparable {
    public final int f19288a;
    public final b f19289b;

    public f(int i7, b bVar) {
        this.f19288a = i7;
        this.f19289b = bVar;
    }

    @Override
    public final int compareTo(Object obj) {
        return Integer.compare(this.f19288a, ((f) obj).f19288a);
    }
}
