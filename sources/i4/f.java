package i4;
public final class f implements Comparable {
    public final int f8188a;
    public final b f8189b;

    public f(int i10, b bVar) {
        this.f8188a = i10;
        this.f8189b = bVar;
    }

    @Override
    public final int compareTo(Object obj) {
        return Integer.compare(this.f8188a, ((f) obj).f8188a);
    }
}
