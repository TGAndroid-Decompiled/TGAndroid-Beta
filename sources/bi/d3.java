package bi;
public final class d3 implements Runnable {
    public final int f2919a;
    public final n1 f2920b;
    public final int f2921c;

    public d3(n1 n1Var, int i10, int i11) {
        this.f2919a = i11;
        this.f2920b = n1Var;
        this.f2921c = i10;
    }

    @Override
    public final void run() {
        switch (this.f2919a) {
            case 0:
                n1 n1Var = this.f2920b;
                n1Var.N();
                n1Var.setSelection(Math.max(0, Math.min(this.f2921c, n1Var.length())));
                return;
            case 1:
                n1 n1Var2 = this.f2920b;
                n1Var2.N();
                n1Var2.setSelection(Math.max(0, Math.min(this.f2921c, n1Var2.length())));
                return;
            case 2:
                n1 n1Var3 = this.f2920b;
                n1Var3.N();
                n1Var3.setSelection(Math.max(0, Math.min(this.f2921c, n1Var3.length())));
                return;
            case 3:
                n1 n1Var4 = this.f2920b;
                n1Var4.N();
                n1Var4.setSelection(Math.min(this.f2921c, n1Var4.length()));
                return;
            default:
                n1 n1Var5 = this.f2920b;
                n1Var5.N();
                n1Var5.setSelection(Math.max(0, Math.min(this.f2921c, n1Var5.length())));
                return;
        }
    }
}
