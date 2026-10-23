package ei;
public final class r3 implements Runnable {
    public final int f9717a;
    public final u3 f9718b;

    public r3(u3 u3Var, int i10) {
        this.f9717a = i10;
        this.f9718b = u3Var;
    }

    @Override
    public final void run() {
        switch (this.f9717a) {
            case 0:
                this.f9718b.dismiss();
                return;
            default:
                u3.m(this.f9718b);
                return;
        }
    }
}
