package dd;
public final class e extends k {
    public final StringBuilder f7680c;

    public e() {
        super(4, 0);
        this.f7680c = new StringBuilder();
    }

    @Override
    public final k b() {
        k.c(this.f7680c);
        return this;
    }

    @Override
    public final String toString() {
        return "<!--" + this.f7680c.toString() + "-->";
    }
}
