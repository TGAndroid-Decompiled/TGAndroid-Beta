package fi;
public final class q3 implements Runnable {
    public final int f12224a;
    public final hi.q8 f12225b;

    public q3(hi.q8 q8Var, int i7) {
        this.f12224a = i7;
        this.f12225b = q8Var;
    }

    @Override
    public final void run() {
        switch (this.f12224a) {
            case 0:
                this.f12225b.dismiss();
                return;
            case 1:
                this.f12225b.dismiss();
                return;
            default:
                this.f12225b.onBackPressed();
                return;
        }
    }
}
