package ci;
public final class x3 implements Runnable {
    public final int f6281a;
    public final a4 f6282b;

    public x3(a4 a4Var, int i10) {
        this.f6281a = i10;
        this.f6282b = a4Var;
    }

    @Override
    public final void run() {
        switch (this.f6281a) {
            case 0:
                this.f6282b.dismiss();
                return;
            default:
                a4.m(this.f6282b);
                return;
        }
    }
}
