package ci;
public final class x3 implements Runnable {
    public final int f5832a;
    public final a4 f5833b;

    public x3(a4 a4Var, int i10) {
        this.f5832a = i10;
        this.f5833b = a4Var;
    }

    @Override
    public final void run() {
        switch (this.f5832a) {
            case 0:
                this.f5833b.dismiss();
                return;
            default:
                a4.m(this.f5833b);
                return;
        }
    }
}
