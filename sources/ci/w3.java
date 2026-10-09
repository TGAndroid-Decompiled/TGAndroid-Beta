package ci;
public final class w3 implements Runnable {
    public final int f6200a;
    public final z3 f6201b;

    public w3(z3 z3Var, int i10) {
        this.f6200a = i10;
        this.f6201b = z3Var;
    }

    @Override
    public final void run() {
        switch (this.f6200a) {
            case 0:
                this.f6201b.dismiss();
                return;
            default:
                z3.o(this.f6201b);
                return;
        }
    }
}
