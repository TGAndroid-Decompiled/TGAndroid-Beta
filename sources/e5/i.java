package e5;
public final class i implements Comparable {
    public final int f4974a;
    public final d f4975b;

    public i(int i10, d dVar) {
        this.f4974a = i10;
        this.f4975b = dVar;
    }

    @Override
    public final int compareTo(Object obj) {
        return Integer.compare(this.f4974a, ((i) obj).f4974a);
    }
}
