package ci;
public final class w3 implements Runnable {
    public final int f6198a;
    public final z3 f6199b;

    public w3(z3 z3Var, int i10) {
        this.f6198a = i10;
        this.f6199b = z3Var;
    }

    @Override
    public final void run() {
        switch (this.f6198a) {
            case 0:
                this.f6199b.dismiss();
                return;
            default:
                z3.o(this.f6199b);
                return;
        }
    }
}
