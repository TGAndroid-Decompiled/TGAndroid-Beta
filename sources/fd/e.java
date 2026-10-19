package fd;
public final class e extends f2.f {
    public final StringBuilder f10555c;

    public e() {
        super(4, 1);
        this.f10555c = new StringBuilder();
    }

    @Override
    public final f2.f b() {
        f2.f.c(this.f10555c);
        return this;
    }

    @Override
    public final String toString() {
        return "<!--" + this.f10555c.toString() + "-->";
    }
}
