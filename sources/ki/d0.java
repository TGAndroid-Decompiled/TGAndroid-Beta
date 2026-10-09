package ki;
public final class d0 implements Runnable {
    public final int f14913a;
    public final t0 f14914b;
    public final Exception f14915c;

    public d0(t0 t0Var, Exception exc, int i10) {
        this.f14913a = i10;
        this.f14914b = t0Var;
        this.f14915c = exc;
    }

    @Override
    public final void run() {
        switch (this.f14913a) {
            case 0:
                this.f14914b.h(this.f14915c);
                return;
            case 1:
                this.f14914b.h(this.f14915c);
                return;
            case 2:
                this.f14914b.h(this.f14915c);
                return;
            default:
                this.f14914b.h(this.f14915c);
                return;
        }
    }
}
