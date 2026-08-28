package fh;
public final class a0 implements Runnable {
    public final int f6329a;
    public final k0 f6330b;

    public a0(k0 k0Var, int i9) {
        this.f6329a = i9;
        this.f6330b = k0Var;
    }

    @Override
    public final void run() {
        switch (this.f6329a) {
            case 0:
                this.f6330b.onBackPressed();
                return;
            default:
                this.f6330b.S();
                return;
        }
    }
}
