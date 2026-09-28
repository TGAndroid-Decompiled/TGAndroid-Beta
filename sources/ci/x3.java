package ci;
public final class x3 implements Runnable {
    public final int f5823a;
    public final a4 f5824b;

    public x3(a4 a4Var, int i10) {
        this.f5823a = i10;
        this.f5824b = a4Var;
    }

    @Override
    public final void run() {
        switch (this.f5823a) {
            case 0:
                this.f5824b.dismiss();
                return;
            default:
                a4.m(this.f5824b);
                return;
        }
    }
}
