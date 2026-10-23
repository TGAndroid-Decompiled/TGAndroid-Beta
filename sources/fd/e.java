package fd;
public final class e extends f2.f {
    public final StringBuilder f10572c;

    public e() {
        super(4, 1);
        this.f10572c = new StringBuilder();
    }

    @Override
    public final f2.f b() {
        f2.f.c(this.f10572c);
        return this;
    }

    @Override
    public final String toString() {
        return "<!--" + this.f10572c.toString() + "-->";
    }
}
