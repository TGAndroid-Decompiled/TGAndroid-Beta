package hi;
public final class e3 implements Runnable {
    public final int f14504a;
    public final h3 f14505b;

    public e3(h3 h3Var, int i7) {
        this.f14504a = i7;
        this.f14505b = h3Var;
    }

    @Override
    public final void run() {
        switch (this.f14504a) {
            case 0:
                this.f14505b.dismiss();
                return;
            default:
                h3.J0(this.f14505b);
                return;
        }
    }
}
