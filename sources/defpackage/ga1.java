package defpackage;
public final class ga1 extends la1 {
    public final ha1 h0;

    public ga1(ha1 ha1Var, int i) {
        super(i);
        this.h0 = ha1Var;
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
