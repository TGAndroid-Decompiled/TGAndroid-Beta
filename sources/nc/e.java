package nc;
public final class e extends k {
    public final StringBuilder f17274c;

    public e() {
        super(4, 0);
        this.f17274c = new StringBuilder();
    }

    @Override
    public final k c() {
        k.d(this.f17274c);
        return this;
    }

    @Override
    public final String toString() {
        return "<!--" + this.f17274c.toString() + "-->";
    }
}
