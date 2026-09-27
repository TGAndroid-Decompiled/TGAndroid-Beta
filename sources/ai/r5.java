package ai;
public final class r5 implements Runnable {
    public final int f1464a;
    public final ci.ea f1465b;

    public r5(ci.ea eaVar, int i10) {
        this.f1464a = i10;
        this.f1465b = eaVar;
    }

    @Override
    public final void run() {
        switch (this.f1464a) {
            case 0:
                this.f1465b.dismiss();
                return;
            case 1:
                this.f1465b.dismiss();
                return;
            default:
                this.f1465b.onBackPressed();
                return;
        }
    }
}
