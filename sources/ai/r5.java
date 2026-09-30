package ai;
public final class r5 implements Runnable {
    public final int f1462a;
    public final ci.fa f1463b;

    public r5(ci.fa faVar, int i10) {
        this.f1462a = i10;
        this.f1463b = faVar;
    }

    @Override
    public final void run() {
        switch (this.f1462a) {
            case 0:
                this.f1463b.dismiss();
                return;
            case 1:
                this.f1463b.dismiss();
                return;
            default:
                this.f1463b.onBackPressed();
                return;
        }
    }
}
