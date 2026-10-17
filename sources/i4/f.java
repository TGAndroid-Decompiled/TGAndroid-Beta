package i4;
public final class f implements Comparable {
    public final int f12693a;
    public final b f12694b;

    public f(int i10, b bVar) {
        this.f12693a = i10;
        this.f12694b = bVar;
    }

    @Override
    public final int compareTo(Object obj) {
        return Integer.compare(this.f12693a, ((f) obj).f12693a);
    }
}
