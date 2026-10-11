package ci;
public final class w3 implements Runnable {
    public final int f6199a;
    public final z3 f6200b;

    public w3(z3 z3Var, int i10) {
        this.f6199a = i10;
        this.f6200b = z3Var;
    }

    @Override
    public final void run() {
        switch (this.f6199a) {
            case 0:
                this.f6200b.dismiss();
                return;
            default:
                z3.o(this.f6200b);
                return;
        }
    }
}
