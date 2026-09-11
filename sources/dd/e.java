package dd;
public final class e extends k {
    public final StringBuilder f6763c;

    public e() {
        super(4, 0);
        this.f6763c = new StringBuilder();
    }

    @Override
    public final k f() {
        k.g(this.f6763c);
        return this;
    }

    @Override
    public final String toString() {
        return "<!--" + this.f6763c.toString() + "-->";
    }
}
