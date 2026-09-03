package nh;
public final class t3 implements Runnable {
    public final int f15883a;
    public final ph.e8 f15884b;

    public t3(ph.e8 e8Var, int i10) {
        this.f15883a = i10;
        this.f15884b = e8Var;
    }

    @Override
    public final void run() {
        switch (this.f15883a) {
            case 0:
                this.f15884b.dismiss();
                return;
            case 1:
                this.f15884b.dismiss();
                return;
            default:
                this.f15884b.onBackPressed();
                return;
        }
    }
}
