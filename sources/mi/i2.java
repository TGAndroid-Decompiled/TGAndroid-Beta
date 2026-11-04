package mi;
public final class i2 implements Runnable {
    public final int f19684a;
    public final t3 f19685b;
    public final int f19686c;

    public i2(t3 t3Var, int i3, int i10) {
        this.f19684a = i10;
        this.f19685b = t3Var;
        this.f19686c = i3;
    }

    @Override
    public final void run() {
        switch (this.f19684a) {
            case 0:
                this.f19685b.g4(this.f19686c);
                return;
            case 1:
                this.f19685b.i4(this.f19686c);
                return;
            case 2:
                this.f19685b.scrollBy(0, this.f19686c);
                return;
            default:
                this.f19685b.h4(this.f19686c);
                return;
        }
    }
}
