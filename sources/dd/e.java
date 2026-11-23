package dd;
public final class e extends k {
    public final StringBuilder f8340c;

    public e() {
        super(4, 0);
        this.f8340c = new StringBuilder();
    }

    @Override
    public final k b() {
        k.c(this.f8340c);
        return this;
    }

    @Override
    public final String toString() {
        return "<!--" + this.f8340c.toString() + "-->";
    }
}
