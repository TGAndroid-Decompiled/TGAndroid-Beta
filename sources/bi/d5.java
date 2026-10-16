package bi;
public final class d5 implements Runnable {
    public final int f2951a;
    public final di.ea f2952b;

    public d5(di.ea eaVar, int i10) {
        this.f2951a = i10;
        this.f2952b = eaVar;
    }

    @Override
    public final void run() {
        switch (this.f2951a) {
            case 0:
                this.f2952b.dismiss();
                return;
            case 1:
                this.f2952b.dismiss();
                return;
            default:
                this.f2952b.onBackPressed();
                return;
        }
    }
}
