package di;
public final class w3 implements Runnable {
    public final int f8046a;
    public final z3 f8047b;

    public w3(z3 z3Var, int i10) {
        this.f8046a = i10;
        this.f8047b = z3Var;
    }

    @Override
    public final void run() {
        switch (this.f8046a) {
            case 0:
                this.f8047b.dismiss();
                return;
            default:
                z3.n(this.f8047b);
                return;
        }
    }
}
