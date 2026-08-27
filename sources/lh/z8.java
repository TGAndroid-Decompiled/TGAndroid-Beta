package lh;

public final class z8 implements Runnable {

    public final int f17246a;

    public final k9 f17247b;

    public z8(k9 k9Var, int i10) {
        this.f17246a = i10;
        this.f17247b = k9Var;
    }

    @Override
    public final void run() {
        switch (this.f17246a) {
            case 0:
                q9 q9Var = this.f17247b.S;
                org.telegram.ui.Components.ec.h(q9Var.container);
                super/*org.telegram.ui.ActionBar.e3*/.dismiss();
                break;
            case 1:
                k9 k9Var = this.f17247b;
                k9Var.v.setLoading(false);
                q9 q9Var2 = k9Var.S;
                q9Var2.f1();
                q9Var2.f16593b.D(0);
                break;
            case 2:
                this.f17247b.Q = false;
                break;
            case 3:
                q9 q9Var3 = this.f17247b.S;
                q9Var3.I = 6;
                q9Var3.f16593b.D(1);
                break;
            case 4:
                k9 k9Var2 = this.f17247b;
                k9Var2.f16254n.m(2);
                k9Var2.f16253f.forceLayout();
                k9Var2.j();
                break;
            default:
                k9 k9Var3 = this.f17247b;
                q9 q9Var4 = k9Var3.S;
                if (k9Var3.f16249a != 0) {
                    q9Var4.onBackPressed();
                } else {
                    q9Var4.dismiss();
                }
                break;
        }
    }
}
