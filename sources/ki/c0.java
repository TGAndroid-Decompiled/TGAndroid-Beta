package ki;
public final class c0 implements Runnable {
    public final int f13667a;
    public final s0 f13668b;
    public final Exception f13669c;

    public c0(s0 s0Var, Exception exc, int i10) {
        this.f13667a = i10;
        this.f13668b = s0Var;
        this.f13669c = exc;
    }

    @Override
    public final void run() {
        switch (this.f13667a) {
            case 0:
                this.f13668b.g(this.f13669c);
                return;
            case 1:
                this.f13668b.g(this.f13669c);
                return;
            case 2:
                this.f13668b.g(this.f13669c);
                return;
            default:
                this.f13668b.g(this.f13669c);
                return;
        }
    }
}
