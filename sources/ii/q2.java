package ii;
public final class q2 implements Runnable {
    public final int f12586a;
    public final x3 f12587b;
    public final int f12588c;
    public final int d;

    public q2(x3 x3Var, int i10, int i11, int i12) {
        this.f12586a = i12;
        this.f12587b = x3Var;
        this.f12588c = i10;
        this.d = i11;
    }

    @Override
    public final void run() {
        switch (this.f12586a) {
            case 0:
                this.f12587b.a2(this.f12588c, this.d);
                return;
            default:
                this.f12587b.i4(this.f12588c, this.d);
                return;
        }
    }
}
