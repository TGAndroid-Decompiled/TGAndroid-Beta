package hi;
public final class e3 implements Runnable {
    public final int f14234a;
    public final h3 f14235b;

    public e3(h3 h3Var, int i7) {
        this.f14234a = i7;
        this.f14235b = h3Var;
    }

    @Override
    public final void run() {
        switch (this.f14234a) {
            case 0:
                this.f14235b.dismiss();
                return;
            default:
                h3.I0(this.f14235b);
                return;
        }
    }
}
