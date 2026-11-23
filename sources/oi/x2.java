package oi;
public final class x2 implements Runnable {
    public final int f22593a;
    public final t3 f22594b;
    public final v4.n0 f22595c;

    public x2(t3 t3Var, v4.n0 n0Var, int i7) {
        this.f22593a = i7;
        this.f22594b = t3Var;
        this.f22595c = n0Var;
    }

    @Override
    public final void run() {
        switch (this.f22593a) {
            case 0:
                this.f22594b.setItemAnimator(this.f22595c);
                return;
            case 1:
                this.f22594b.setItemAnimator(this.f22595c);
                return;
            default:
                this.f22594b.setItemAnimator(this.f22595c);
                return;
        }
    }
}
