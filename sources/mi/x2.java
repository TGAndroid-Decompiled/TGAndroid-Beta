package mi;
public final class x2 implements Runnable {
    public final int f20020a;
    public final t3 f20021b;
    public final u4.m0 f20022c;

    public x2(t3 t3Var, u4.m0 m0Var, int i3) {
        this.f20020a = i3;
        this.f20021b = t3Var;
        this.f20022c = m0Var;
    }

    @Override
    public final void run() {
        switch (this.f20020a) {
            case 0:
                this.f20021b.setItemAnimator(this.f20022c);
                return;
            case 1:
                this.f20021b.setItemAnimator(this.f20022c);
                return;
            default:
                this.f20021b.setItemAnimator(this.f20022c);
                return;
        }
    }
}
