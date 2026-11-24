package defpackage;
public final class y91 extends da1 {
    public final z91 h0;

    public y91(z91 z91Var, int i) {
        super(i);
        this.h0 = z91Var;
    }

    @Override
    public final void finishFragment() {
        setFinishing(true);
        this.h0.dismiss();
    }

    @Override
    public final void removeSelfFromStack() {
        this.h0.dismiss();
    }
}
