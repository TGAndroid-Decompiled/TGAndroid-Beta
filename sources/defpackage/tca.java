package defpackage;
public final class tca extends r35 {
    public final nfa Q;

    public tca(nfa nfaVar) {
        super(3);
        this.Q = nfaVar;
    }

    @Override
    public final int n0(int i, wg2 wg2Var, p49 p49Var) {
        if (this.Q.r1) {
            i = 0;
        }
        return super.n0(i, wg2Var, p49Var);
    }

    @Override
    public final boolean x0() {
        return false;
    }
}
