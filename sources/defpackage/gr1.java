package defpackage;
public final class gr1 extends cu6 {
    public final mu1 x;

    public gr1(mu1 mu1Var, jq1 jq1Var, mq1 mq1Var) {
        super(jq1Var, mq1Var);
        this.x = mu1Var;
    }

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
