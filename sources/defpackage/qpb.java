package defpackage;
public final class qpb extends fs5 {
    public final StringBuilder e;

    public qpb() {
        super(4, (byte) 2);
        this.e = new StringBuilder();
    }

    @Override
    public final fs5 s() {
        fs5.t(this.e);
        return this;
    }

    @Override
    public final String toString() {
        return "<!--" + this.e.toString() + "-->";
    }
}
