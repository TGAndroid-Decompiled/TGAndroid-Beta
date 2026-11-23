package oi;
public final class x2 implements Runnable {
    public final int f22526a;
    public final t3 f22527b;
    public final v4.n0 f22528c;

    public x2(t3 t3Var, v4.n0 n0Var, int i7) {
        this.f22526a = i7;
        this.f22527b = t3Var;
        this.f22528c = n0Var;
    }

    @Override
    public final void run() {
        switch (this.f22526a) {
            case 0:
                this.f22527b.setItemAnimator(this.f22528c);
                return;
            case 1:
                this.f22527b.setItemAnimator(this.f22528c);
                return;
            default:
                this.f22527b.setItemAnimator(this.f22528c);
                return;
        }
    }
}
