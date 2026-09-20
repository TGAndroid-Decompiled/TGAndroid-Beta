package ci;
public final class y3 implements Runnable {
    public final int f5823a;
    public final b4 f5824b;

    public y3(b4 b4Var, int i10) {
        this.f5823a = i10;
        this.f5824b = b4Var;
    }

    @Override
    public final void run() {
        switch (this.f5823a) {
            case 0:
                this.f5824b.dismiss();
                return;
            default:
                b4.m(this.f5824b);
                return;
        }
    }
}
