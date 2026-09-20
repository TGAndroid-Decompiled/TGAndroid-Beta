package dd;
public final class e extends k {
    public final StringBuilder f7685c;

    public e() {
        super(4, 0);
        this.f7685c = new StringBuilder();
    }

    @Override
    public final k b() {
        k.c(this.f7685c);
        return this;
    }

    @Override
    public final String toString() {
        return "<!--" + this.f7685c.toString() + "-->";
    }
}
