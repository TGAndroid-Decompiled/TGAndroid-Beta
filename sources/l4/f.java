package l4;
public final class f implements Comparable {
    public final int f19652a;
    public final b f19653b;

    public f(int i7, b bVar) {
        this.f19652a = i7;
        this.f19653b = bVar;
    }

    @Override
    public final int compareTo(Object obj) {
        return Integer.compare(this.f19652a, ((f) obj).f19652a);
    }
}
