package lh;
public final class v implements Runnable {
    public final int f13024a;
    public final f0 f13025b;

    public v(f0 f0Var, int i10) {
        this.f13024a = i10;
        this.f13025b = f0Var;
    }

    @Override
    public final void run() {
        switch (this.f13024a) {
            case 0:
                this.f13025b.onBackPressed();
                return;
            default:
                this.f13025b.T();
                return;
        }
    }
}
