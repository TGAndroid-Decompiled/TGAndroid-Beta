package ci;
public final class x3 implements Runnable {
    public final int f5835a;
    public final a4 f5836b;

    public x3(a4 a4Var, int i10) {
        this.f5835a = i10;
        this.f5836b = a4Var;
    }

    @Override
    public final void run() {
        switch (this.f5835a) {
            case 0:
                this.f5836b.dismiss();
                return;
            default:
                a4.m(this.f5836b);
                return;
        }
    }
}
