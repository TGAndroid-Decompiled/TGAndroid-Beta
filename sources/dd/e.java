package dd;
public final class e extends k {
    public final StringBuilder f8291c;

    public e() {
        super(4, 0);
        this.f8291c = new StringBuilder();
    }

    @Override
    public final k b() {
        k.c(this.f8291c);
        return this;
    }

    @Override
    public final String toString() {
        return "<!--" + this.f8291c.toString() + "-->";
    }
}
