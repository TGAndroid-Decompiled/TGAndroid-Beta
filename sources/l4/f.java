package l4;
public final class f implements Comparable {
    public final int f19649a;
    public final b f19650b;

    public f(int i7, b bVar) {
        this.f19649a = i7;
        this.f19650b = bVar;
    }

    @Override
    public final int compareTo(Object obj) {
        return Integer.compare(this.f19649a, ((f) obj).f19649a);
    }
}
