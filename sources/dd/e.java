package dd;
public final class e extends k {
    public final StringBuilder f7667c;

    public e() {
        super(4, 0);
        this.f7667c = new StringBuilder();
    }

    @Override
    public final k b() {
        k.c(this.f7667c);
        return this;
    }

    @Override
    public final String toString() {
        return "<!--" + this.f7667c.toString() + "-->";
    }
}
