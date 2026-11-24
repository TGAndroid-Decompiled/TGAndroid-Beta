package defpackage;
public final class ze1 extends m8 {
    public final nf1 o;

    public ze1(nf1 nf1Var, ye1 ye1Var) {
        super(ye1Var, -2, -2);
        this.o = nf1Var;
    }

    @Override
    public final void dismiss() {
        d(true);
        nf1 nf1Var = this.o;
        if (nf1Var.G0 != this) {
            return;
        }
        m21.e();
        nf1Var.G0 = null;
    }
}
