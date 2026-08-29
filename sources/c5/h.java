package c5;
public final class h implements Comparable {
    public final int f2980a;
    public final c f2981b;

    public h(int i10, c cVar) {
        this.f2980a = i10;
        this.f2981b = cVar;
    }

    @Override
    public final int compareTo(Object obj) {
        return Integer.compare(this.f2980a, ((h) obj).f2980a);
    }
}
