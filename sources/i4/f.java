package i4;
public final class f implements Comparable {
    public final int f13860a;
    public final b f13861b;

    public f(int i10, b bVar) {
        this.f13860a = i10;
        this.f13861b = bVar;
    }

    @Override
    public final int compareTo(Object obj) {
        return Integer.compare(this.f13860a, ((f) obj).f13860a);
    }
}
