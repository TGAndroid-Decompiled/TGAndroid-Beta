package ci;
public final class x3 implements Runnable {
    public final int f6282a;
    public final a4 f6283b;

    public x3(a4 a4Var, int i10) {
        this.f6282a = i10;
        this.f6283b = a4Var;
    }

    @Override
    public final void run() {
        switch (this.f6282a) {
            case 0:
                this.f6283b.dismiss();
                return;
            default:
                a4.m(this.f6283b);
                return;
        }
    }
}
