package hi;
public final class e3 implements Runnable {
    public final int f14592a;
    public final h3 f14593b;

    public e3(h3 h3Var, int i7) {
        this.f14592a = i7;
        this.f14593b = h3Var;
    }

    @Override
    public final void run() {
        switch (this.f14592a) {
            case 0:
                this.f14593b.dismiss();
                return;
            default:
                h3.J0(this.f14593b);
                return;
        }
    }
}
