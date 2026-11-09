package dd;
public final class e extends k {
    public final StringBuilder f8637c;

    public e() {
        super(4, 0);
        this.f8637c = new StringBuilder();
    }

    @Override
    public final k b() {
        k.c(this.f8637c);
        return this;
    }

    @Override
    public final String toString() {
        return "<!--" + this.f8637c.toString() + "-->";
    }
}
