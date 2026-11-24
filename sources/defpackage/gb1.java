package defpackage;
public final class gb1 extends lb1 {
    public final hb1 h0;

    public gb1(hb1 hb1Var, int i) {
        super(i);
        this.h0 = hb1Var;
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
