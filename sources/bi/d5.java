package bi;
public final class d5 implements Runnable {
    public final int f2947a;
    public final di.ea f2948b;

    public d5(di.ea eaVar, int i10) {
        this.f2947a = i10;
        this.f2948b = eaVar;
    }

    @Override
    public final void run() {
        switch (this.f2947a) {
            case 0:
                this.f2948b.dismiss();
                return;
            case 1:
                this.f2948b.dismiss();
                return;
            default:
                this.f2948b.onBackPressed();
                return;
        }
    }
}
