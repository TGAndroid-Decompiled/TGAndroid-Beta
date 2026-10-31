package i4;
public final class f implements Comparable {
    public final int f8187a;
    public final b f8188b;

    public f(int i10, b bVar) {
        this.f8187a = i10;
        this.f8188b = bVar;
    }

    @Override
    public final int compareTo(Object obj) {
        return Integer.compare(this.f8187a, ((f) obj).f8187a);
    }
}
