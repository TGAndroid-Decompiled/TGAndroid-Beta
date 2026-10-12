package di;
public final class w3 implements Runnable {
    public final int f8043a;
    public final z3 f8044b;

    public w3(z3 z3Var, int i10) {
        this.f8043a = i10;
        this.f8044b = z3Var;
    }

    @Override
    public final void run() {
        switch (this.f8043a) {
            case 0:
                this.f8044b.dismiss();
                return;
            default:
                z3.n(this.f8044b);
                return;
        }
    }
}
