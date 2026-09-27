package ki;
public final class c0 implements Runnable {
    public final int f13669a;
    public final s0 f13670b;
    public final Exception f13671c;

    public c0(s0 s0Var, Exception exc, int i10) {
        this.f13669a = i10;
        this.f13670b = s0Var;
        this.f13671c = exc;
    }

    @Override
    public final void run() {
        switch (this.f13669a) {
            case 0:
                this.f13670b.g(this.f13671c);
                return;
            case 1:
                this.f13670b.g(this.f13671c);
                return;
            case 2:
                this.f13670b.g(this.f13671c);
                return;
            default:
                this.f13670b.g(this.f13671c);
                return;
        }
    }
}
