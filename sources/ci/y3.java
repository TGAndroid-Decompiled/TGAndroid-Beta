package ci;
public final class y3 implements Runnable {
    public final int f5819a;
    public final b4 f5820b;

    public y3(b4 b4Var, int i10) {
        this.f5819a = i10;
        this.f5820b = b4Var;
    }

    @Override
    public final void run() {
        switch (this.f5819a) {
            case 0:
                this.f5820b.dismiss();
                return;
            default:
                b4.m(this.f5820b);
                return;
        }
    }
}
