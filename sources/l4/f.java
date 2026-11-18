package l4;
public final class f implements Comparable {
    public final int f19655a;
    public final b f19656b;

    public f(int i7, b bVar) {
        this.f19655a = i7;
        this.f19656b = bVar;
    }

    @Override
    public final int compareTo(Object obj) {
        return Integer.compare(this.f19655a, ((f) obj).f19655a);
    }
}
