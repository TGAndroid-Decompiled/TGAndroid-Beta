package ai;
public final class s5 implements Runnable {
    public final int f1699a;
    public final ci.fa f1700b;

    public s5(ci.fa faVar, int i10) {
        this.f1699a = i10;
        this.f1700b = faVar;
    }

    @Override
    public final void run() {
        switch (this.f1699a) {
            case 0:
                this.f1700b.dismiss();
                return;
            case 1:
                this.f1700b.dismiss();
                return;
            default:
                this.f1700b.onBackPressed();
                return;
        }
    }
}
