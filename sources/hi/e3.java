package hi;
public final class e3 implements Runnable {
    public final int f14589a;
    public final h3 f14590b;

    public e3(h3 h3Var, int i7) {
        this.f14589a = i7;
        this.f14590b = h3Var;
    }

    @Override
    public final void run() {
        switch (this.f14589a) {
            case 0:
                this.f14590b.dismiss();
                return;
            default:
                h3.J0(this.f14590b);
                return;
        }
    }
}
