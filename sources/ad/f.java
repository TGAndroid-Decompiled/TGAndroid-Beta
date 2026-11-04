package ad;
public final class f extends l {
    public final StringBuilder f354c;

    public f() {
        super(4, 0);
        this.f354c = new StringBuilder();
    }

    @Override
    public final l b() {
        l.c(this.f354c);
        return this;
    }

    @Override
    public final String toString() {
        return "<!--" + this.f354c.toString() + "-->";
    }
}
