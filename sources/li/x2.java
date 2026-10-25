package li;
public final class x2 implements Runnable {
    public final int f17618a;
    public final v3 f17619b;
    public final s4.m0 f17620c;

    public x2(v3 v3Var, s4.m0 m0Var, int i10) {
        this.f17618a = i10;
        this.f17619b = v3Var;
        this.f17620c = m0Var;
    }

    @Override
    public final void run() {
        switch (this.f17618a) {
            case 0:
                this.f17619b.setItemAnimator(this.f17620c);
                return;
            default:
                this.f17619b.setItemAnimator(this.f17620c);
                return;
        }
    }
}
