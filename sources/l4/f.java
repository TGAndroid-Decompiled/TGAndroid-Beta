package l4;
public final class f implements Comparable {
    public final int f19749a;
    public final b f19750b;

    public f(int i7, b bVar) {
        this.f19749a = i7;
        this.f19750b = bVar;
    }

    @Override
    public final int compareTo(Object obj) {
        return Integer.compare(this.f19749a, ((f) obj).f19749a);
    }
}
