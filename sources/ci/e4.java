package ci;
public final class e4 implements Runnable {
    public final int f5356a;
    public final ei.r9 f5357b;

    public e4(ei.r9 r9Var, int i10) {
        this.f5356a = i10;
        this.f5357b = r9Var;
    }

    @Override
    public final void run() {
        switch (this.f5356a) {
            case 0:
                this.f5357b.dismiss();
                return;
            case 1:
                this.f5357b.dismiss();
                return;
            default:
                this.f5357b.onBackPressed();
                return;
        }
    }
}
