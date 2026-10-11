package ki;
public final class d0 implements Runnable {
    public final int f14912a;
    public final t0 f14913b;
    public final Exception f14914c;

    public d0(t0 t0Var, Exception exc, int i10) {
        this.f14912a = i10;
        this.f14913b = t0Var;
        this.f14914c = exc;
    }

    @Override
    public final void run() {
        switch (this.f14912a) {
            case 0:
                this.f14913b.h(this.f14914c);
                return;
            case 1:
                this.f14913b.h(this.f14914c);
                return;
            case 2:
                this.f14913b.h(this.f14914c);
                return;
            default:
                this.f14913b.h(this.f14914c);
                return;
        }
    }
}
