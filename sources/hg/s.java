package hg;
public final class s implements Runnable {
    public final int f7595a;
    public final x f7596b;

    public s(x xVar, int i10) {
        this.f7595a = i10;
        this.f7596b = xVar;
    }

    @Override
    public final void run() {
        switch (this.f7595a) {
            case 0:
                this.f7596b.dismiss();
                return;
            default:
                this.f7596b.onBackPressed();
                return;
        }
    }
}
