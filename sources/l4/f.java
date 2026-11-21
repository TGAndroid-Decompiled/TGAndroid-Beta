package l4;
public final class f implements Comparable {
    public final int f19680a;
    public final b f19681b;

    public f(int i7, b bVar) {
        this.f19680a = i7;
        this.f19681b = bVar;
    }

    @Override
    public final int compareTo(Object obj) {
        return Integer.compare(this.f19680a, ((f) obj).f19680a);
    }
}
