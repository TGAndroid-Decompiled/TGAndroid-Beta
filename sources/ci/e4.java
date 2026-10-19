package ci;
public final class e4 implements Runnable {
    public final int f5355a;
    public final ei.r9 f5356b;

    public e4(ei.r9 r9Var, int i10) {
        this.f5355a = i10;
        this.f5356b = r9Var;
    }

    @Override
    public final void run() {
        switch (this.f5355a) {
            case 0:
                this.f5356b.dismiss();
                return;
            case 1:
                this.f5356b.dismiss();
                return;
            default:
                this.f5356b.onBackPressed();
                return;
        }
    }
}
