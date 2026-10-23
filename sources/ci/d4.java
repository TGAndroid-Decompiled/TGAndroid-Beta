package ci;
public final class d4 implements Runnable {
    public final int f5254a;
    public final ei.r9 f5255b;

    public d4(ei.r9 r9Var, int i10) {
        this.f5254a = i10;
        this.f5255b = r9Var;
    }

    @Override
    public final void run() {
        switch (this.f5254a) {
            case 0:
                this.f5255b.dismiss();
                return;
            case 1:
                this.f5255b.dismiss();
                return;
            default:
                this.f5255b.onBackPressed();
                return;
        }
    }
}
