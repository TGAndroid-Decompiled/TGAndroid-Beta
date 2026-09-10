package hi;
public final class y2 implements Runnable {
    public final int f9977a;
    public final k1 f9978b;
    public final int f9979c;

    public y2(k1 k1Var, int i10, int i11) {
        this.f9977a = i11;
        this.f9978b = k1Var;
        this.f9979c = i10;
    }

    @Override
    public final void run() {
        switch (this.f9977a) {
            case 0:
                k1 k1Var = this.f9978b;
                k1Var.r();
                k1Var.setSelection(Math.max(0, Math.min(this.f9979c, k1Var.length())));
                return;
            case 1:
                k1 k1Var2 = this.f9978b;
                k1Var2.r();
                k1Var2.setSelection(Math.max(0, Math.min(this.f9979c, k1Var2.length())));
                return;
            case 2:
                k1 k1Var3 = this.f9978b;
                k1Var3.r();
                k1Var3.setSelection(Math.max(0, Math.min(this.f9979c, k1Var3.length())));
                return;
            case 3:
                k1 k1Var4 = this.f9978b;
                k1Var4.r();
                k1Var4.setSelection(Math.min(this.f9979c, k1Var4.length()));
                return;
            default:
                k1 k1Var5 = this.f9978b;
                k1Var5.r();
                k1Var5.setSelection(Math.max(0, Math.min(this.f9979c, k1Var5.length())));
                return;
        }
    }
}
