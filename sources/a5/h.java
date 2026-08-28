package a5;
public final class h implements Comparable {
    public final int f79a;
    public final c f80b;

    public h(int i9, c cVar) {
        this.f79a = i9;
        this.f80b = cVar;
    }

    @Override
    public final int compareTo(Object obj) {
        return Integer.compare(this.f79a, ((h) obj).f79a);
    }
}
