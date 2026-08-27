package mc;

public final class e extends k {

    public final StringBuilder f17991c;

    public e() {
        super(4, 0);
        this.f17991c = new StringBuilder();
    }

    @Override
    public final k c() {
        k.d(this.f17991c);
        return this;
    }

    @Override
    public final String toString() {
        return "<!--" + this.f17991c.toString() + "-->";
    }
}
