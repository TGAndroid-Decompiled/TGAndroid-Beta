package ai;
public final class s5 implements Runnable {
    public final int f1504a;
    public final ci.ia f1505b;

    public s5(ci.ia iaVar, int i10) {
        this.f1504a = i10;
        this.f1505b = iaVar;
    }

    @Override
    public final void run() {
        switch (this.f1504a) {
            case 0:
                this.f1505b.dismiss();
                return;
            case 1:
                this.f1505b.dismiss();
                return;
            default:
                this.f1505b.onBackPressed();
                return;
        }
    }
}
