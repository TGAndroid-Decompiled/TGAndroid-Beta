package ci;
public final class d4 implements Runnable {
    public final int f5252a;
    public final ei.r9 f5253b;

    public d4(ei.r9 r9Var, int i10) {
        this.f5252a = i10;
        this.f5253b = r9Var;
    }

    @Override
    public final void run() {
        switch (this.f5252a) {
            case 0:
                this.f5253b.dismiss();
                return;
            case 1:
                this.f5253b.dismiss();
                return;
            default:
                this.f5253b.onBackPressed();
                return;
        }
    }
}
