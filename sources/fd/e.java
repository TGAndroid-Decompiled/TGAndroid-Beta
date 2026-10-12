package fd;
public final class e extends f2.e {
    public final StringBuilder f9112c;

    public e() {
        super(4, 1);
        this.f9112c = new StringBuilder();
    }

    @Override
    public final f2.e b() {
        f2.e.c(this.f9112c);
        return this;
    }

    @Override
    public final String toString() {
        return "<!--" + this.f9112c.toString() + "-->";
    }
}
