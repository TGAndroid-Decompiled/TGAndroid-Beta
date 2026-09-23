package dd;
public final class e extends k {
    public final StringBuilder f7668c;

    public e() {
        super(4, 0);
        this.f7668c = new StringBuilder();
    }

    @Override
    public final k b() {
        k.c(this.f7668c);
        return this;
    }

    @Override
    public final String toString() {
        return "<!--" + this.f7668c.toString() + "-->";
    }
}
