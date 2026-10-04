package ai;
public final class r5 implements Runnable {
    public final int f1590a;
    public final ci.ea f1591b;

    public r5(ci.ea eaVar, int i10) {
        this.f1590a = i10;
        this.f1591b = eaVar;
    }

    @Override
    public final void run() {
        switch (this.f1590a) {
            case 0:
                this.f1591b.dismiss();
                return;
            case 1:
                this.f1591b.dismiss();
                return;
            default:
                this.f1591b.onBackPressed();
                return;
        }
    }
}
