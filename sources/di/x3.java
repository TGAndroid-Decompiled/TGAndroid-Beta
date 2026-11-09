package di;
public final class x3 implements Runnable {
    public final int f9924a;
    public final fi.s8 f9925b;

    public x3(fi.s8 s8Var, int i7) {
        this.f9924a = i7;
        this.f9925b = s8Var;
    }

    @Override
    public final void run() {
        switch (this.f9924a) {
            case 0:
                this.f9925b.dismiss();
                return;
            case 1:
                this.f9925b.dismiss();
                return;
            default:
                this.f9925b.onBackPressed();
                return;
        }
    }
}
