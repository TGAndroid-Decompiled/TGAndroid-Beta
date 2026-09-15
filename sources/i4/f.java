package i4;
public final class f implements Comparable {
    public final int f10974a;
    public final b f10975b;

    public f(int i10, b bVar) {
        this.f10974a = i10;
        this.f10975b = bVar;
    }

    @Override
    public final int compareTo(Object obj) {
        return Integer.compare(this.f10974a, ((f) obj).f10974a);
    }
}
