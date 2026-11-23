package hi;
public final class v8 implements Runnable {
    public final int f15605a;
    public final f9 f15606b;

    public v8(f9 f9Var, int i7) {
        this.f15605a = i7;
        this.f15606b = f9Var;
    }

    @Override
    public final void run() {
        switch (this.f15605a) {
            case 0:
                k9 k9Var = this.f15606b.f14495a0;
                org.telegram.ui.Components.fc.h(k9Var.f30229c);
                super/*org.telegram.ui.ActionBar.w2*/.dismiss();
                return;
            case 1:
                f9 f9Var = this.f15606b;
                f9Var.f14503w.setLoading(false);
                k9 k9Var2 = f9Var.f14495a0;
                k9Var2.N0();
                k9Var2.f14787m1.C(0);
                return;
            case 2:
                this.f15606b.V = false;
                return;
            case 3:
                k9 k9Var3 = this.f15606b.f14495a0;
                k9Var3.H1 = 6;
                k9Var3.f14787m1.C(1);
                return;
            case 4:
                f9 f9Var2 = this.f15606b;
                f9Var2.f14500n.g(2);
                f9Var2.f14499f.forceLayout();
                f9Var2.k();
                return;
            default:
                f9 f9Var3 = this.f15606b;
                k9 k9Var4 = f9Var3.f14495a0;
                if (f9Var3.f14494a == 0) {
                    k9Var4.dismiss();
                    return;
                } else {
                    k9Var4.onBackPressed();
                    return;
                }
        }
    }
}
