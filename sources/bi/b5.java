package bi;
public final class b5 implements Runnable {
    public final int f2796a;
    public final di.ia f2797b;

    public b5(di.ia iaVar, int i10) {
        this.f2796a = i10;
        this.f2797b = iaVar;
    }

    @Override
    public final void run() {
        switch (this.f2796a) {
            case 0:
                this.f2797b.dismiss();
                return;
            case 1:
                this.f2797b.dismiss();
                return;
            default:
                this.f2797b.onBackPressed();
                return;
        }
    }
}
