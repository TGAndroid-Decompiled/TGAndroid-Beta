package fd;
public final class e extends f2.e {
    public final StringBuilder f9115c;

    public e() {
        super(4, 1);
        this.f9115c = new StringBuilder();
    }

    @Override
    public final f2.e b() {
        f2.e.c(this.f9115c);
        return this;
    }

    @Override
    public final String toString() {
        return "<!--" + this.f9115c.toString() + "-->";
    }
}
