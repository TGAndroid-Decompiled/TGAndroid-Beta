package e5;
public final class h implements Comparable {
    public final int f5142a;
    public final c f5143b;

    public h(int i10, c cVar) {
        this.f5142a = i10;
        this.f5143b = cVar;
    }

    @Override
    public final int compareTo(Object obj) {
        return Integer.compare(this.f5142a, ((h) obj).f5142a);
    }
}
