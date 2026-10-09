package ai;
public final class s5 implements Runnable {
    public final int f1701a;
    public final ci.fa f1702b;

    public s5(ci.fa faVar, int i10) {
        this.f1701a = i10;
        this.f1702b = faVar;
    }

    @Override
    public final void run() {
        switch (this.f1701a) {
            case 0:
                this.f1702b.dismiss();
                return;
            case 1:
                this.f1702b.dismiss();
                return;
            default:
                this.f1702b.onBackPressed();
                return;
        }
    }
}
