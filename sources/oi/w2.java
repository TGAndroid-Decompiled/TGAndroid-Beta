package oi;
public final class w2 implements Runnable {
    public final int f22437a;
    public final s3 f22438b;
    public final v4.n0 f22439c;

    public w2(s3 s3Var, v4.n0 n0Var, int i7) {
        this.f22437a = i7;
        this.f22438b = s3Var;
        this.f22439c = n0Var;
    }

    @Override
    public final void run() {
        switch (this.f22437a) {
            case 0:
                this.f22438b.setItemAnimator(this.f22439c);
                return;
            case 1:
                this.f22438b.setItemAnimator(this.f22439c);
                return;
            default:
                this.f22438b.setItemAnimator(this.f22439c);
                return;
        }
    }
}
