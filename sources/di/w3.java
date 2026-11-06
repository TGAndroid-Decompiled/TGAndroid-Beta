package di;
public final class w3 implements Runnable {
    public final int f9899a;
    public final fi.s8 f9900b;

    public w3(fi.s8 s8Var, int i7) {
        this.f9899a = i7;
        this.f9900b = s8Var;
    }

    @Override
    public final void run() {
        switch (this.f9899a) {
            case 0:
                this.f9900b.dismiss();
                return;
            case 1:
                this.f9900b.dismiss();
                return;
            default:
                this.f9900b.onBackPressed();
                return;
        }
    }
}
