package gd;
public final class e extends f2.f {
    public final StringBuilder f12446c;

    public e() {
        super(4, 1);
        this.f12446c = new StringBuilder();
    }

    @Override
    public final f2.f b() {
        f2.f.c(this.f12446c);
        return this;
    }

    @Override
    public final String toString() {
        return "<!--" + this.f12446c.toString() + "-->";
    }
}
