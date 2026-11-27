package defpackage;
public final class rtb extends iu5 {
    public final StringBuilder e;

    public rtb() {
        super(4, (byte) 2);
        this.e = new StringBuilder();
    }

    @Override
    public final iu5 s() {
        iu5.t(this.e);
        return this;
    }

    @Override
    public final String toString() {
        return "<!--" + this.e.toString() + "-->";
    }
}
