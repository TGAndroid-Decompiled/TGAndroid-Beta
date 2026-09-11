package i4;
public final class f implements Comparable {
    public final int f11839a;
    public final b f11840b;

    public f(int i10, b bVar) {
        this.f11839a = i10;
        this.f11840b = bVar;
    }

    @Override
    public final int compareTo(Object obj) {
        return Integer.compare(this.f11839a, ((f) obj).f11839a);
    }
}
