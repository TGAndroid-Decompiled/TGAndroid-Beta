package ki;
public final class f0 implements Runnable {
    public final int f14923a;
    public final v0 f14924b;
    public final Exception f14925c;

    public f0(v0 v0Var, Exception exc, int i10) {
        this.f14923a = i10;
        this.f14924b = v0Var;
        this.f14925c = exc;
    }

    @Override
    public final void run() {
        switch (this.f14923a) {
            case 0:
                this.f14924b.h(this.f14925c);
                return;
            case 1:
                this.f14924b.h(this.f14925c);
                return;
            case 2:
                this.f14924b.h(this.f14925c);
                return;
            default:
                this.f14924b.h(this.f14925c);
                return;
        }
    }
}
