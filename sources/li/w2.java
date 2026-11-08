package li;
public final class w2 implements Runnable {
    public final int f18953a;
    public final t3 f18954b;
    public final v4.l0 f18955c;

    public w2(t3 t3Var, v4.l0 l0Var, int i7) {
        this.f18953a = i7;
        this.f18954b = t3Var;
        this.f18955c = l0Var;
    }

    @Override
    public final void run() {
        switch (this.f18953a) {
            case 0:
                this.f18954b.setItemAnimator(this.f18955c);
                return;
            case 1:
                this.f18954b.setItemAnimator(this.f18955c);
                return;
            default:
                this.f18954b.setItemAnimator(this.f18955c);
                return;
        }
    }
}
