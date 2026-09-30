package ai;
public final class r5 implements Runnable {
    public final int f1467a;
    public final ci.fa f1468b;

    public r5(ci.fa faVar, int i10) {
        this.f1467a = i10;
        this.f1468b = faVar;
    }

    @Override
    public final void run() {
        switch (this.f1467a) {
            case 0:
                this.f1468b.dismiss();
                return;
            case 1:
                this.f1468b.dismiss();
                return;
            default:
                this.f1468b.onBackPressed();
                return;
        }
    }
}
