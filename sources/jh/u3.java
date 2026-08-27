package jh;

public final class u3 implements Runnable {

    public final int f14025a;

    public final lh.q9 f14026b;

    public u3(lh.q9 q9Var, int i10) {
        this.f14025a = i10;
        this.f14026b = q9Var;
    }

    @Override
    public final void run() {
        switch (this.f14025a) {
            case 0:
                this.f14026b.dismiss();
                break;
            case 1:
                this.f14026b.dismiss();
                break;
            default:
                this.f14026b.onBackPressed();
                break;
        }
    }
}
