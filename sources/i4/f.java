package i4;
public final class f implements Comparable {
    public final int f13861a;
    public final b f13862b;

    public f(int i10, b bVar) {
        this.f13861a = i10;
        this.f13862b = bVar;
    }

    @Override
    public final int compareTo(Object obj) {
        return Integer.compare(this.f13861a, ((f) obj).f13861a);
    }
}
