package ei;
public final class r3 implements Runnable {
    public final int f9701a;
    public final u3 f9702b;

    public r3(u3 u3Var, int i10) {
        this.f9701a = i10;
        this.f9702b = u3Var;
    }

    @Override
    public final void run() {
        switch (this.f9701a) {
            case 0:
                this.f9702b.dismiss();
                return;
            default:
                u3.n(this.f9702b);
                return;
        }
    }
}
