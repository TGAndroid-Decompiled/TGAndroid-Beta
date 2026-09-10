package i4;
public final class f implements Comparable {
    public final int f10458a;
    public final b f10459b;

    public f(int i10, b bVar) {
        this.f10458a = i10;
        this.f10459b = bVar;
    }

    @Override
    public final int compareTo(Object obj) {
        return Integer.compare(this.f10458a, ((f) obj).f10458a);
    }
}
