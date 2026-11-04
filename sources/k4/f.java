package k4;
public final class f implements Comparable {
    public final int f16854a;
    public final b f16855b;

    public f(int i3, b bVar) {
        this.f16854a = i3;
        this.f16855b = bVar;
    }

    @Override
    public final int compareTo(Object obj) {
        return Integer.compare(this.f16854a, ((f) obj).f16854a);
    }
}
