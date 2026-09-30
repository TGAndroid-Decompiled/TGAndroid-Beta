package ki;
public final class c0 implements Runnable {
    public final int f13682a;
    public final s0 f13683b;
    public final Exception f13684c;

    public c0(s0 s0Var, Exception exc, int i10) {
        this.f13682a = i10;
        this.f13683b = s0Var;
        this.f13684c = exc;
    }

    @Override
    public final void run() {
        switch (this.f13682a) {
            case 0:
                this.f13683b.h(this.f13684c);
                return;
            case 1:
                this.f13683b.h(this.f13684c);
                return;
            case 2:
                this.f13683b.h(this.f13684c);
                return;
            default:
                this.f13683b.h(this.f13684c);
                return;
        }
    }
}
