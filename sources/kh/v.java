package kh;
public final class v implements Runnable {
    public final int f10872a;
    public final f0 f10873b;

    public v(f0 f0Var, int i10) {
        this.f10872a = i10;
        this.f10873b = f0Var;
    }

    @Override
    public final void run() {
        switch (this.f10872a) {
            case 0:
                this.f10873b.onBackPressed();
                return;
            default:
                this.f10873b.T();
                return;
        }
    }
}
