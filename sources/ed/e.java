package ed;
public final class e extends k {
    public final StringBuilder f8869c;

    public e() {
        super(4, 0);
        this.f8869c = new StringBuilder();
    }

    @Override
    public final k b() {
        k.c(this.f8869c);
        return this;
    }

    @Override
    public final String toString() {
        return "<!--" + this.f8869c.toString() + "-->";
    }
}
