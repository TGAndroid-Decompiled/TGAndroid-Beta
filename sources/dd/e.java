package dd;
public final class e extends k {
    public final StringBuilder f8029c;

    public e() {
        super(4, 0);
        this.f8029c = new StringBuilder();
    }

    @Override
    public final k b() {
        k.c(this.f8029c);
        return this;
    }

    @Override
    public final String toString() {
        return "<!--" + this.f8029c.toString() + "-->";
    }
}
