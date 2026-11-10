package l4;
public final class f implements Comparable {
    public final int f18158a;
    public final b f18159b;

    public f(int i7, b bVar) {
        this.f18158a = i7;
        this.f18159b = bVar;
    }

    @Override
    public final int compareTo(Object obj) {
        return Integer.compare(this.f18158a, ((f) obj).f18158a);
    }
}
