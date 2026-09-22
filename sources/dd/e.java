package dd;
public final class e extends k {
    public final StringBuilder f7682c;

    public e() {
        super(4, 0);
        this.f7682c = new StringBuilder();
    }

    @Override
    public final k b() {
        k.c(this.f7682c);
        return this;
    }

    @Override
    public final String toString() {
        return "<!--" + this.f7682c.toString() + "-->";
    }
}
