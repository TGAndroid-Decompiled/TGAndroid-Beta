package lc;
public final class e extends k {
    public final StringBuilder f16807c;

    public e() {
        super(4, 0);
        this.f16807c = new StringBuilder();
    }

    @Override
    public final k c() {
        k.d(this.f16807c);
        return this;
    }

    @Override
    public final String toString() {
        return "<!--" + this.f16807c.toString() + "-->";
    }
}
