package dd;
public final class e extends k {
    public final StringBuilder f8303c;

    public e() {
        super(4, 0);
        this.f8303c = new StringBuilder();
    }

    @Override
    public final k b() {
        k.c(this.f8303c);
        return this;
    }

    @Override
    public final String toString() {
        return "<!--" + this.f8303c.toString() + "-->";
    }
}
