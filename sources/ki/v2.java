package ki;
public final class v2 implements Runnable {
    public final int f15633a;
    public final h1 f15634b;
    public final int f15635c;

    public v2(h1 h1Var, int i10, int i11) {
        this.f15633a = i11;
        this.f15634b = h1Var;
        this.f15635c = i10;
    }

    @Override
    public final void run() {
        switch (this.f15633a) {
            case 0:
                h1 h1Var = this.f15634b;
                h1Var.r();
                h1Var.setSelection(Math.max(0, Math.min(this.f15635c, h1Var.length())));
                return;
            case 1:
                h1 h1Var2 = this.f15634b;
                h1Var2.r();
                h1Var2.setSelection(Math.max(0, Math.min(this.f15635c, h1Var2.length())));
                return;
            case 2:
                h1 h1Var3 = this.f15634b;
                h1Var3.r();
                h1Var3.setSelection(Math.max(0, Math.min(this.f15635c, h1Var3.length())));
                return;
            case 3:
                h1 h1Var4 = this.f15634b;
                h1Var4.r();
                h1Var4.setSelection(Math.min(this.f15635c, h1Var4.length()));
                return;
            default:
                h1 h1Var5 = this.f15634b;
                h1Var5.r();
                h1Var5.setSelection(Math.max(0, Math.min(this.f15635c, h1Var5.length())));
                return;
        }
    }
}
