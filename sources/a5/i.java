package a5;

public final class i implements Comparable {

    public final int f81a;

    public final d f82b;

    public i(int i10, d dVar) {
        this.f81a = i10;
        this.f82b = dVar;
    }

    @Override
    public final int compareTo(Object obj) {
        return Integer.compare(this.f81a, ((i) obj).f81a);
    }
}
