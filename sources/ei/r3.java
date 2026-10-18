package ei;
public final class r3 implements Runnable {
    public final int f9702a;
    public final u3 f9703b;

    public r3(u3 u3Var, int i10) {
        this.f9702a = i10;
        this.f9703b = u3Var;
    }

    @Override
    public final void run() {
        switch (this.f9702a) {
            case 0:
                this.f9703b.dismiss();
                return;
            default:
                u3.n(this.f9703b);
                return;
        }
    }
}
