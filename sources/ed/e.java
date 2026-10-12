package ed;
public final class e extends k {
    public final StringBuilder f8867c;

    public e() {
        super(4, 0);
        this.f8867c = new StringBuilder();
    }

    @Override
    public final k b() {
        k.c(this.f8867c);
        return this;
    }

    @Override
    public final String toString() {
        return "<!--" + this.f8867c.toString() + "-->";
    }
}
