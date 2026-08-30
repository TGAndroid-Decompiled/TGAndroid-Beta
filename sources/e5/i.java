package e5;
public final class i implements Comparable {
    public final int f5136a;
    public final d f5137b;

    public i(int i10, d dVar) {
        this.f5136a = i10;
        this.f5137b = dVar;
    }

    @Override
    public final int compareTo(Object obj) {
        return Integer.compare(this.f5136a, ((i) obj).f5136a);
    }
}
