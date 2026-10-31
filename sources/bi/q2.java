package bi;
public final class q2 implements Runnable {
    public final int f3293a;
    public final d4 f3294b;
    public final int f3295c;

    public q2(d4 d4Var, int i10, int i11) {
        this.f3293a = i11;
        this.f3294b = d4Var;
        this.f3295c = i10;
    }

    @Override
    public final void run() {
        switch (this.f3293a) {
            case 0:
                this.f3294b.g4(this.f3295c);
                return;
            case 1:
                this.f3294b.i4(this.f3295c);
                return;
            case 2:
                this.f3294b.scrollBy(0, this.f3295c);
                return;
            default:
                this.f3294b.h4(this.f3295c);
                return;
        }
    }
}
