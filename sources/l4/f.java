package l4;
public final class f implements Comparable {
    public final int f18152a;
    public final b f18153b;

    public f(int i7, b bVar) {
        this.f18152a = i7;
        this.f18153b = bVar;
    }

    @Override
    public final int compareTo(Object obj) {
        return Integer.compare(this.f18152a, ((f) obj).f18152a);
    }
}
