package ki;
public final class c0 implements Runnable {
    public final int f14859a;
    public final s0 f14860b;
    public final Exception f14861c;

    public c0(s0 s0Var, Exception exc, int i10) {
        this.f14859a = i10;
        this.f14860b = s0Var;
        this.f14861c = exc;
    }

    @Override
    public final void run() {
        switch (this.f14859a) {
            case 0:
                this.f14860b.h(this.f14861c);
                return;
            case 1:
                this.f14860b.h(this.f14861c);
                return;
            case 2:
                this.f14860b.h(this.f14861c);
                return;
            default:
                this.f14860b.h(this.f14861c);
                return;
        }
    }
}
