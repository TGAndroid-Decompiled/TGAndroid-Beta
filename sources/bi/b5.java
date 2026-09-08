package bi;
public final class b5 implements Runnable {
    public final int f2823a;
    public final di.ia f2824b;

    public b5(di.ia iaVar, int i10) {
        this.f2823a = i10;
        this.f2824b = iaVar;
    }

    @Override
    public final void run() {
        switch (this.f2823a) {
            case 0:
                this.f2824b.dismiss();
                return;
            case 1:
                this.f2824b.dismiss();
                return;
            default:
                this.f2824b.onBackPressed();
                return;
        }
    }
}
