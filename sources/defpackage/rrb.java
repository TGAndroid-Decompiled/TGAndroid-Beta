package defpackage;
public final class rrb extends eu5 {
    public final StringBuilder e;

    public rrb() {
        super(4, (byte) 2);
        this.e = new StringBuilder();
    }

    @Override
    public final eu5 s() {
        eu5.t(this.e);
        return this;
    }

    @Override
    public final String toString() {
        return "<!--" + this.e.toString() + "-->";
    }
}
