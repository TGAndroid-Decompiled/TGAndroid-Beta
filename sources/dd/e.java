package dd;
public final class e extends k {
    public final StringBuilder f8292c;

    public e() {
        super(4, 0);
        this.f8292c = new StringBuilder();
    }

    @Override
    public final k b() {
        k.c(this.f8292c);
        return this;
    }

    @Override
    public final String toString() {
        return "<!--" + this.f8292c.toString() + "-->";
    }
}
