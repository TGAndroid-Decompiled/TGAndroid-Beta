package l4;
public final class f implements Comparable {
    public final int f18155a;
    public final b f18156b;

    public f(int i7, b bVar) {
        this.f18155a = i7;
        this.f18156b = bVar;
    }

    @Override
    public final int compareTo(Object obj) {
        return Integer.compare(this.f18155a, ((f) obj).f18155a);
    }
}
