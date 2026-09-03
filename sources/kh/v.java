package kh;
public final class v implements Runnable {
    public final int f10979a;
    public final f0 f10980b;

    public v(f0 f0Var, int i10) {
        this.f10979a = i10;
        this.f10980b = f0Var;
    }

    @Override
    public final void run() {
        switch (this.f10979a) {
            case 0:
                this.f10980b.onBackPressed();
                return;
            default:
                this.f10980b.T();
                return;
        }
    }
}
