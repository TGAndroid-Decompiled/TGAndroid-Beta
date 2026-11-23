package dd;
public final class e extends k {
    public final StringBuilder f8302c;

    public e() {
        super(4, 0);
        this.f8302c = new StringBuilder();
    }

    @Override
    public final k b() {
        k.c(this.f8302c);
        return this;
    }

    @Override
    public final String toString() {
        return "<!--" + this.f8302c.toString() + "-->";
    }
}
