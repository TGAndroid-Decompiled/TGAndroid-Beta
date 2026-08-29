package ih;
public final class w implements Runnable {
    public final int f9463a;
    public final g0 f9464b;

    public w(g0 g0Var, int i10) {
        this.f9463a = i10;
        this.f9464b = g0Var;
    }

    @Override
    public final void run() {
        switch (this.f9463a) {
            case 0:
                this.f9464b.onBackPressed();
                return;
            default:
                this.f9464b.T();
                return;
        }
    }
}
