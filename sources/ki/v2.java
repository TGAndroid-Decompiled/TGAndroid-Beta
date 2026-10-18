package ki;
public final class v2 implements Runnable {
    public final int f15571a;
    public final h1 f15572b;
    public final int f15573c;

    public v2(h1 h1Var, int i10, int i11) {
        this.f15571a = i11;
        this.f15572b = h1Var;
        this.f15573c = i10;
    }

    @Override
    public final void run() {
        switch (this.f15571a) {
            case 0:
                h1 h1Var = this.f15572b;
                h1Var.r();
                h1Var.setSelection(Math.max(0, Math.min(this.f15573c, h1Var.length())));
                return;
            case 1:
                h1 h1Var2 = this.f15572b;
                h1Var2.r();
                h1Var2.setSelection(Math.max(0, Math.min(this.f15573c, h1Var2.length())));
                return;
            case 2:
                h1 h1Var3 = this.f15572b;
                h1Var3.r();
                h1Var3.setSelection(Math.max(0, Math.min(this.f15573c, h1Var3.length())));
                return;
            case 3:
                h1 h1Var4 = this.f15572b;
                h1Var4.r();
                h1Var4.setSelection(Math.min(this.f15573c, h1Var4.length()));
                return;
            default:
                h1 h1Var5 = this.f15572b;
                h1Var5.r();
                h1Var5.setSelection(Math.max(0, Math.min(this.f15573c, h1Var5.length())));
                return;
        }
    }
}
