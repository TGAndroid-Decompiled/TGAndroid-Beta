package lh;
public final class t3 implements Runnable {
    public final int f16259a;
    public final nh.e9 f16260b;

    public t3(nh.e9 e9Var, int i10) {
        this.f16259a = i10;
        this.f16260b = e9Var;
    }

    @Override
    public final void run() {
        switch (this.f16259a) {
            case 0:
                this.f16260b.dismiss();
                return;
            case 1:
                this.f16260b.dismiss();
                return;
            default:
                this.f16260b.onBackPressed();
                return;
        }
    }
}
