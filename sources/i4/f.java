package i4;
public final class f implements Comparable {
    public final int f10978a;
    public final b f10979b;

    public f(int i10, b bVar) {
        this.f10978a = i10;
        this.f10979b = bVar;
    }

    @Override
    public final int compareTo(Object obj) {
        return Integer.compare(this.f10978a, ((f) obj).f10978a);
    }
}
