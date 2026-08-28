package kh;
public final class c9 implements Runnable {
    public final int f15047a;
    public final n9 f15048b;

    public c9(n9 n9Var, int i9) {
        this.f15047a = i9;
        this.f15048b = n9Var;
    }

    @Override
    public final void run() {
        switch (this.f15047a) {
            case 0:
                t9 t9Var = this.f15048b.S;
                org.telegram.ui.Components.gc.h(t9Var.container);
                t9.D(t9Var);
                return;
            case 1:
                n9 n9Var = this.f15048b;
                n9Var.v.setLoading(false);
                t9 t9Var2 = n9Var.S;
                t9Var2.f1();
                t9Var2.f16097b.D(0);
                return;
            case 2:
                this.f15048b.Q = false;
                return;
            case 3:
                t9 t9Var3 = this.f15048b.S;
                t9Var3.I = 6;
                t9Var3.f16097b.D(1);
                return;
            case 4:
                n9 n9Var2 = this.f15048b;
                n9Var2.f15772n.m(2);
                n9Var2.f15771f.forceLayout();
                n9Var2.j();
                return;
            default:
                n9 n9Var3 = this.f15048b;
                t9 t9Var4 = n9Var3.S;
                if (n9Var3.f15767a == 0) {
                    t9Var4.dismiss();
                    return;
                } else {
                    t9Var4.onBackPressed();
                    return;
                }
        }
    }
}
