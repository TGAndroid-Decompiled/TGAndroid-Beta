package ai;
public final class s5 implements Runnable {
    public final int f1499a;
    public final ci.ia f1500b;

    public s5(ci.ia iaVar, int i10) {
        this.f1499a = i10;
        this.f1500b = iaVar;
    }

    @Override
    public final void run() {
        switch (this.f1499a) {
            case 0:
                this.f1500b.dismiss();
                return;
            case 1:
                this.f1500b.dismiss();
                return;
            default:
                this.f1500b.onBackPressed();
                return;
        }
    }
}
