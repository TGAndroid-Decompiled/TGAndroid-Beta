package dd;
public final class e extends k {
    public final StringBuilder f7679c;

    public e() {
        super(4, 0);
        this.f7679c = new StringBuilder();
    }

    @Override
    public final k b() {
        k.c(this.f7679c);
        return this;
    }

    @Override
    public final String toString() {
        return "<!--" + this.f7679c.toString() + "-->";
    }
}
