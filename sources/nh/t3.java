package nh;
public final class t3 implements Runnable {
    public final int f15903a;
    public final ph.f8 f15904b;

    public t3(ph.f8 f8Var, int i10) {
        this.f15903a = i10;
        this.f15904b = f8Var;
    }

    @Override
    public final void run() {
        switch (this.f15903a) {
            case 0:
                this.f15904b.dismiss();
                return;
            case 1:
                this.f15904b.dismiss();
                return;
            default:
                this.f15904b.onBackPressed();
                return;
        }
    }
}
