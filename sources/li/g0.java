package li;
public final class g0 implements Runnable {
    public final int f14792a;
    public final u0 f14793b;
    public final Exception f14794c;

    public g0(u0 u0Var, Exception exc, int i10) {
        this.f14792a = i10;
        this.f14793b = u0Var;
        this.f14794c = exc;
    }

    @Override
    public final void run() {
        switch (this.f14792a) {
            case 0:
                this.f14793b.h(this.f14794c);
                return;
            case 1:
                this.f14793b.h(this.f14794c);
                return;
            case 2:
                this.f14793b.h(this.f14794c);
                return;
            default:
                this.f14793b.h(this.f14794c);
                return;
        }
    }
}
