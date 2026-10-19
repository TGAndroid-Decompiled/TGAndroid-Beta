package ci;
public final class e4 implements Runnable {
    public final int f5353a;
    public final ei.r9 f5354b;

    public e4(ei.r9 r9Var, int i10) {
        this.f5353a = i10;
        this.f5354b = r9Var;
    }

    @Override
    public final void run() {
        switch (this.f5353a) {
            case 0:
                this.f5354b.dismiss();
                return;
            case 1:
                this.f5354b.dismiss();
                return;
            default:
                this.f5354b.onBackPressed();
                return;
        }
    }
}
