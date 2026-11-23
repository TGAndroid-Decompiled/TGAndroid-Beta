package oi;
public final class w2 implements Runnable {
    public final int f22463a;
    public final s3 f22464b;
    public final v4.m0 f22465c;

    public w2(s3 s3Var, v4.m0 m0Var, int i7) {
        this.f22463a = i7;
        this.f22464b = s3Var;
        this.f22465c = m0Var;
    }

    @Override
    public final void run() {
        switch (this.f22463a) {
            case 0:
                this.f22464b.setItemAnimator(this.f22465c);
                return;
            case 1:
                this.f22464b.setItemAnimator(this.f22465c);
                return;
            default:
                this.f22464b.setItemAnimator(this.f22465c);
                return;
        }
    }
}
