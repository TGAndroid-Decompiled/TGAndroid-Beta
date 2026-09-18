package dd;
public final class e extends k {
    public final StringBuilder f7684c;

    public e() {
        super(4, 0);
        this.f7684c = new StringBuilder();
    }

    @Override
    public final k b() {
        k.c(this.f7684c);
        return this;
    }

    @Override
    public final String toString() {
        return "<!--" + this.f7684c.toString() + "-->";
    }
}
