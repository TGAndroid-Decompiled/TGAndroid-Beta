package ai;
public final class s5 implements Runnable {
    public final int f1501a;
    public final ci.ia f1502b;

    public s5(ci.ia iaVar, int i10) {
        this.f1501a = i10;
        this.f1502b = iaVar;
    }

    @Override
    public final void run() {
        switch (this.f1501a) {
            case 0:
                this.f1502b.dismiss();
                return;
            case 1:
                this.f1502b.dismiss();
                return;
            default:
                this.f1502b.onBackPressed();
                return;
        }
    }
}
