package dd;
public final class e extends k {
    public final StringBuilder f6456c;

    public e() {
        super(4, 0);
        this.f6456c = new StringBuilder();
    }

    @Override
    public final k b() {
        k.c(this.f6456c);
        return this;
    }

    @Override
    public final String toString() {
        return "<!--" + this.f6456c.toString() + "-->";
    }
}
