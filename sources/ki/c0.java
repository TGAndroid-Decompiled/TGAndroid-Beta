package ki;
public final class c0 implements Runnable {
    public final int f14858a;
    public final s0 f14859b;
    public final Exception f14860c;

    public c0(s0 s0Var, Exception exc, int i10) {
        this.f14858a = i10;
        this.f14859b = s0Var;
        this.f14860c = exc;
    }

    @Override
    public final void run() {
        switch (this.f14858a) {
            case 0:
                this.f14859b.h(this.f14860c);
                return;
            case 1:
                this.f14859b.h(this.f14860c);
                return;
            case 2:
                this.f14859b.h(this.f14860c);
                return;
            default:
                this.f14859b.h(this.f14860c);
                return;
        }
    }
}
