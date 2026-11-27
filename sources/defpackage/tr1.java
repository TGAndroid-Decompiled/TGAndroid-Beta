package defpackage;
public final class tr1 extends hw6 {
    public final zu1 x;

    public tr1(zu1 zu1Var, wq1 wq1Var, zq1 zq1Var) {
        super(wq1Var, zq1Var);
        this.x = zu1Var;
    }

    @Override
    public final void l(int i) {
        if (this.x.nb) {
            if (i == 0) {
                i = 1;
            } else if (i == 1) {
                i = 0;
            }
        }
        this.b = i;
    }
}
