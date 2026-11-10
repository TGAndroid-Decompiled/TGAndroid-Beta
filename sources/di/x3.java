package di;
public final class x3 implements Runnable {
    public final int f9929a;
    public final fi.s8 f9930b;

    public x3(fi.s8 s8Var, int i7) {
        this.f9929a = i7;
        this.f9930b = s8Var;
    }

    @Override
    public final void run() {
        switch (this.f9929a) {
            case 0:
                this.f9930b.dismiss();
                return;
            case 1:
                this.f9930b.dismiss();
                return;
            default:
                this.f9930b.onBackPressed();
                return;
        }
    }
}
