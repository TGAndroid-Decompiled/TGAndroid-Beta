package fd;
public final class e extends f2.f {
    public final StringBuilder f10556c;

    public e() {
        super(4, 1);
        this.f10556c = new StringBuilder();
    }

    @Override
    public final f2.f b() {
        f2.f.c(this.f10556c);
        return this;
    }

    @Override
    public final String toString() {
        return "<!--" + this.f10556c.toString() + "-->";
    }
}
