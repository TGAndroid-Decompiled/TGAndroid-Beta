package gd;
public final class e extends f2.f {
    public final StringBuilder f12447c;

    public e() {
        super(4, 1);
        this.f12447c = new StringBuilder();
    }

    @Override
    public final f2.f b() {
        f2.f.c(this.f12447c);
        return this;
    }

    @Override
    public final String toString() {
        return "<!--" + this.f12447c.toString() + "-->";
    }
}
